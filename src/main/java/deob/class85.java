package deob;

import java.io.IOException;
import java.text.DecimalFormat;

@ObfuscatedName("cu")
public class class85 {

    @ObfuscatedName("cu.h")
    public static int field1137 = 0;

    @ObfuscatedName("cu.y")
    public static int field1140 = field1137 + 202;

    @ObfuscatedName("cu.o")
    public static int[] field1141 = new int[256];

    @ObfuscatedName("cu.q")
    public static int field1143 = 0;

    @ObfuscatedName("cu.aa")
    public static int field1136 = 0;

    @ObfuscatedName("cu.as")
    public static int field1142 = 0;

    @ObfuscatedName("cu.ac")
    public static int field1146 = 0;

    @ObfuscatedName("cu.an")
    public static int field1147 = 0;

    @ObfuscatedName("cu.ak")
    public static int field1135 = 0;

    @ObfuscatedName("cu.ah")
    public static int field1149 = 10;

    @ObfuscatedName("cu.al")
    public static String field1153 = "";

    @ObfuscatedName("cu.ae")
    public static int field1151 = -1;

    @ObfuscatedName("cu.az")
    public static int field1152 = 1;

    @ObfuscatedName("cu.ax")
    public static int field1150 = 0;

    @ObfuscatedName("cu.ap")
    public static String field1154 = "";

    @ObfuscatedName("cu.av")
    public static String field1155 = "";

    @ObfuscatedName("cu.af")
    public static String field1165 = "";

    @ObfuscatedName("cu.bf")
    public static String field1157 = "";

    @ObfuscatedName("cu.bi")
    public static String field1158 = "";

    @ObfuscatedName("cu.bx")
    public static String field1159 = "";

    @ObfuscatedName("cu.bc")
    public static boolean field1160 = false;

    @ObfuscatedName("cu.bh")
    public static boolean field1161 = false;

    @ObfuscatedName("cu.bt")
    public static boolean field1164 = true;

    @ObfuscatedName("cu.bs")
    public static int field1139 = 0;

    @ObfuscatedName("cu.ba")
    public static String field1156 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("cu.br")
    public static String field1166 = "1234567890";

    @ObfuscatedName("cu.bb")
    public static boolean field1167 = false;

    @ObfuscatedName("cu.ch")
    public static int field1168 = -1;

    @ObfuscatedName("cu.cf")
    public static int field1169 = 0;

    @ObfuscatedName("cu.cm")
    public static int field1170 = 0;

    @ObfuscatedName("cu.cy")
    public static long field1171;

    @ObfuscatedName("cu.cx")
    public static long field1172;

    static {
        new DecimalFormat("##0.00");
        new class156();
        field1171 = -1L;
        field1172 = -1L;
    }

    public class85() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bd.n(Lij;Lij;ZIS)V")
    public static void method1716(class254 arg0, class254 arg1, boolean arg2, int arg3) {
        if (!Statics.field1148) {
            field1150 = arg3;
            class323.method5596();
            byte[] var4 = arg0.method4475("title.jpg", "");
            Statics.field1163 = class49.method1931(var4);
            Statics.field2021 = Statics.field1163.method5687();
            if ((client.field631 & 0x20000000) == 0) {
                Statics.field522 = class328.method5135(arg1, "logo", "");
            } else {
                Statics.field522 = class328.method5135(arg1, "logo_deadman_mode", "");
            }
            Statics.field1145 = class328.method5135(arg1, "titlebox", "");
            Statics.field1497 = class328.method5135(arg1, "titlebutton", "");
            Statics.field1138 = class328.method5317(arg1, "runes", "");
            Statics.field1390 = class328.method5317(arg1, "title_mute", "");
            Statics.field2063 = class328.method5135(arg1, "options_radio_buttons,0", "");
            Statics.field1020 = class328.method5135(arg1, "options_radio_buttons,4", "");
            Statics.field3784 = class328.method5135(arg1, "options_radio_buttons,2", "");
            Statics.field1079 = class328.method5135(arg1, "options_radio_buttons,6", "");
            Statics.field1126 = Statics.field2063.field3873;
            Statics.field1117 = Statics.field2063.field3874;
            Statics.field1144 = new int[256];
            for (int var5 = 0; var5 < 64; var5++) {
                Statics.field1144[var5] = var5 * 262144;
            }
            for (int var6 = 0; var6 < 64; var6++) {
                Statics.field1144[var6 + 64] = var6 * 1024 + 16711680;
            }
            for (int var7 = 0; var7 < 64; var7++) {
                Statics.field1144[var7 + 128] = var7 * 4 + 16776960;
            }
            for (int var8 = 0; var8 < 64; var8++) {
                Statics.field1144[var8 + 192] = 16777215;
            }
            Statics.field74 = new int[256];
            for (int var9 = 0; var9 < 64; var9++) {
                Statics.field74[var9] = var9 * 1024;
            }
            for (int var10 = 0; var10 < 64; var10++) {
                Statics.field74[var10 + 64] = var10 * 4 + 65280;
            }
            for (int var11 = 0; var11 < 64; var11++) {
                Statics.field74[var11 + 128] = var11 * 262144 + 65535;
            }
            for (int var12 = 0; var12 < 64; var12++) {
                Statics.field74[var12 + 192] = 16777215;
            }
            Statics.field1108 = new int[256];
            for (int var13 = 0; var13 < 64; var13++) {
                Statics.field1108[var13] = var13 * 4;
            }
            for (int var14 = 0; var14 < 64; var14++) {
                Statics.field1108[var14 + 64] = var14 * 262144 + 255;
            }
            for (int var15 = 0; var15 < 64; var15++) {
                Statics.field1108[var15 + 128] = var15 * 1024 + 16711935;
            }
            for (int var16 = 0; var16 < 64; var16++) {
                Statics.field1108[var16 + 192] = 16777215;
            }
            Statics.field39 = new int[256];
            Statics.field252 = new int[32768];
            Statics.field109 = new int[32768];
            method4432((class326) null);
            Statics.field332 = new int[32768];
            Statics.field1103 = new int[32768];
            if (arg2) {
                field1158 = "";
                field1159 = "";
            }
            Statics.field273 = 0;
            Statics.field1162 = "";
            field1164 = true;
            field1167 = false;
            if (Statics.field2667.field1014) {
                class225.method629(2);
            } else {
                class225.method3796(2, Statics.field485, "scape main", "", 255, false);
            }
            if (Statics.field3267 != null) {
                try {
                    class190 var17 = new class190(4);
                    var17.method3646(3);
                    var17.method3497(0);
                    Statics.field3267.method3288(var17.field2424, 0, 4);
                } catch (IOException var21) {
                    try {
                        Statics.field3267.method3287();
                    } catch (Exception var20) {
                    }
                    class257.field3273++;
                    Statics.field3267 = null;
                }
            }
            Statics.field1148 = true;
            field1137 = (Statics.field1878 - 765) / 2;
            field1140 = field1137 + 202;
            Statics.field2630 = field1140 + 180;
            Statics.field1163.method5705(field1137, 0);
            Statics.field2021.method5705(field1137 + 382, 0);
            Statics.field522.method5666(field1137 + 382 - Statics.field522.field3873 / 2, 18);
        } else if (arg3 == 4) {
            field1150 = 4;
        }
    }

    @ObfuscatedName("fm.h(ZZB)Lll;")
    public static class326 method3269(boolean arg0, boolean arg1) {
        return arg0 ? (arg1 ? Statics.field1079 : Statics.field3784) : (arg1 ? Statics.field1020 : Statics.field2063);
    }

    @ObfuscatedName("jf.l(I)V")
    public static void method5072() {
        if (field1158 != null && field1158.length() > 0) {
            return;
        }
        if (Statics.field2667.field1017 == null) {
            client.field668 = false;
        } else {
            field1158 = Statics.field2667.field1017;
            client.field668 = true;
        }
    }

    @ObfuscatedName("bv.g(I)V")
    public static void method1029() {
        if (!Statics.field1148) {
            return;
        }
        Statics.field1145 = null;
        Statics.field1497 = null;
        Statics.field1138 = null;
        Statics.field1163 = null;
        Statics.field2021 = null;
        Statics.field522 = null;
        Statics.field1390 = null;
        Statics.field2063 = null;
        Statics.field3784 = null;
        Statics.field1913 = null;
        Statics.field1489 = null;
        Statics.field1095 = null;
        Statics.field1203 = null;
        Statics.field257 = null;
        Statics.field1144 = null;
        Statics.field74 = null;
        Statics.field1108 = null;
        Statics.field39 = null;
        Statics.field252 = null;
        Statics.field109 = null;
        Statics.field332 = null;
        Statics.field1103 = null;
        class225.method629(2);
        if (Statics.field3267 != null) {
            try {
                class190 var0 = new class190(4);
                var0.method3646(2);
                var0.method3497(0);
                Statics.field3267.method3288(var0.field2424, 0, 4);
            } catch (IOException var4) {
                try {
                    Statics.field3267.method3287();
                } catch (Exception var3) {
                }
                class257.field3273++;
                Statics.field3267 = null;
            }
        }
        Statics.field1148 = false;
    }

    @ObfuscatedName("bb.b(I)V")
    public static void method1597() {
        if (client.field668 && field1158 != null && field1158.length() > 0) {
            field1139 = 1;
        } else {
            field1139 = 0;
        }
    }

    @ObfuscatedName("hn.a(Lbf;I)V")
    public static void method4287(class53 arg0) {
        if (field1167) {
            method3322(arg0);
            return;
        }
        if ((class54.field460 == 1 || !Statics.field98 && class54.field460 == 4) && class54.field478 >= field1137 + 765 - 50 && class54.field479 >= 453) {
            Statics.field2667.field1014 = !Statics.field2667.field1014;
            class73.method1874();
            if (Statics.field2667.field1014) {
                class225.method184();
            } else {
                class225.method1921(Statics.field485, "scape main", "", 255, false);
            }
        }
        if (client.field638 == 5) {
            return;
        }
        if (field1171 == -1L) {
            field1171 = class192.method81() + 1000L;
        }
        long var1 = class192.method81();
        if (client.method3069() && field1172 == -1L) {
            field1172 = var1;
            if (field1172 > field1171) {
                field1171 = field1172;
            }
        }
        field1147++;
        if (client.field638 != 10 && client.field638 != 11) {
            return;
        }
        if (client.field884 == 0) {
            if (class54.field460 == 1 || !Statics.field98 && class54.field460 == 4) {
                int var3 = field1137 + 5;
                short var4 = 463;
                byte var5 = 100;
                byte var6 = 35;
                if (class54.field478 >= var3 && class54.field478 <= var3 + var5 && class54.field479 >= var4 && class54.field479 <= var4 + var6) {
                    method66();
                    return;
                }
            }
            if (Statics.field1417 != null) {
                method66();
            }
        }
        int var7 = class54.field460;
        int var8 = class54.field478;
        int var9 = class54.field479;
        if (var7 == 0) {
            var8 = class54.field468;
            var9 = class54.field475 * 30622073;
        }
        if (!Statics.field98 && var7 == 4) {
            var7 = 1;
        }
        if (field1150 == 0) {
            boolean var10 = false;
            while (class45.method565()) {
                if (Statics.field3625 == 84) {
                    var10 = true;
                }
            }
            int var11 = Statics.field2630 - 80;
            short var12 = 291;
            if (var7 == 1 && var8 >= var11 - 75 && var8 <= var11 + 75 && var9 >= var12 - 20 && var9 <= var12 + 20) {
                class51.method119(client.method257("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
            }
            int var13 = Statics.field2630 + 80;
            if (var7 == 1 && var8 >= var13 - 75 && var8 <= var13 + 75 && var9 >= var12 - 20 && var9 <= var12 + 20 || var10) {
                if ((client.field631 & 0x2000000) != 0) {
                    field1154 = "";
                    field1155 = class245.field3096;
                    field1165 = class245.field2903;
                    field1157 = class245.field2985;
                    field1150 = 1;
                    method1597();
                } else if ((client.field631 & 0x4) != 0) {
                    if ((client.field631 & 0x400) == 0) {
                        field1155 = class245.field3070;
                        field1165 = class245.field3088;
                        field1157 = class245.field3150;
                    } else {
                        field1155 = class245.field3093;
                        field1165 = class245.field3094;
                        field1157 = class245.field3095;
                    }
                    field1154 = class245.field3086;
                    field1150 = 1;
                    method1597();
                } else if ((client.field631 & 0x400) == 0) {
                    method176(false);
                } else {
                    field1155 = class245.field3090;
                    field1165 = class245.field3091;
                    field1157 = class245.field2871;
                    field1154 = class245.field3086;
                    field1150 = 1;
                    method1597();
                }
            }
        } else if (field1150 == 1) {
            while (class45.method565()) {
                if (Statics.field3625 == 84) {
                    method176(false);
                } else if (Statics.field3625 == 13) {
                    field1150 = 0;
                }
            }
            int var14 = Statics.field2630 - 80;
            short var15 = 321;
            if (var7 == 1 && var8 >= var14 - 75 && var8 <= var14 + 75 && var9 >= var15 - 20 && var9 <= var15 + 20) {
                method176(false);
            }
            int var16 = Statics.field2630 + 80;
            if (var7 == 1 && var8 >= var16 - 75 && var8 <= var16 + 75 && var9 >= var15 - 20 && var9 <= var15 + 20) {
                field1150 = 0;
            }
        } else if (field1150 == 2) {
            short var17 = 201;
            int var55 = var17 + 52;
            if (var7 == 1 && var9 >= var55 - 12 && var9 < var55 + 2) {
                field1139 = 0;
            }
            var55 += 15;
            if (var7 == 1 && var9 >= var55 - 12 && var9 < var55 + 2) {
                field1139 = 1;
            }
            var55 += 15;
            short var18 = 361;
            if (Statics.field33 != null) {
                int var19 = Statics.field33.field3835 / 2;
                if (var7 == 1 && var8 >= Statics.field33.field3834 - var19 && var8 <= Statics.field33.field3834 + var19 && var9 >= var18 - 15 && var9 < var18) {
                    switch(field1152) {
                        case 1:
                            method1842(class245.field3154, class245.field3129, class245.field3130);
                            field1150 = 5;
                            return;
                        case 2:
                            class51.method119("https://support.runescape.com/hc/en-gb", true, false);
                    }
                }
            }
            int var20 = Statics.field2630 - 80;
            short var21 = 321;
            if (var7 == 1 && var8 >= var20 - 75 && var8 <= var20 + 75 && var9 >= var21 - 20 && var9 <= var21 + 20) {
                field1158 = field1158.trim();
                if (field1158.length() == 0) {
                    method1842(class245.field2949, class245.field2989, class245.field2990);
                    return;
                }
                if (field1159.length() == 0) {
                    method1842(class245.field2991, class245.field2992, class245.field2993);
                    return;
                }
                method1842(class245.field3004, class245.field3102, class245.field3103);
                client.method3297(false);
                client.method3117(20);
                return;
            }
            int var22 = field1140 + 180 + 80;
            if (var7 == 1 && var8 >= var22 - 75 && var8 <= var22 + 75 && var9 >= var21 - 20 && var9 <= var21 + 20) {
                field1150 = 0;
                field1158 = "";
                field1159 = "";
                Statics.field273 = 0;
                Statics.field1162 = "";
                field1164 = true;
            }
            int var23 = Statics.field2630 + -117;
            short var24 = 277;
            field1160 = var8 >= var23 && var8 < Statics.field1126 + var23 && var9 >= var24 && var9 < Statics.field1117 + var24;
            if (var7 == 1 && field1160) {
                client.field668 = !client.field668;
                if (!client.field668 && Statics.field2667.field1017 != null) {
                    Statics.field2667.field1017 = null;
                    class73.method1874();
                }
            }
            int var25 = Statics.field2630 + 24;
            short var26 = 277;
            field1161 = var8 >= var25 && var8 < Statics.field1126 + var25 && var9 >= var26 && var9 < Statics.field1117 + var26;
            if (var7 == 1 && field1161) {
                Statics.field2667.field1015 = !Statics.field2667.field1015;
                if (!Statics.field2667.field1015) {
                    field1158 = "";
                    Statics.field2667.field1017 = null;
                    method1597();
                }
                class73.method1874();
            }
            while (true) {
                while (class45.method565()) {
                    boolean var27 = false;
                    for (int var28 = 0; var28 < field1156.length(); var28++) {
                        if (Statics.field2218 == field1156.charAt(var28)) {
                            var27 = true;
                            break;
                        }
                    }
                    if (Statics.field3625 == 13) {
                        field1150 = 0;
                        field1158 = "";
                        field1159 = "";
                        Statics.field273 = 0;
                        Statics.field1162 = "";
                        field1164 = true;
                    } else if (field1139 == 0) {
                        if (Statics.field3625 == 85 && field1158.length() > 0) {
                            field1158 = field1158.substring(0, field1158.length() - 1);
                        }
                        if (Statics.field3625 == 84 || Statics.field3625 == 80) {
                            field1139 = 1;
                        }
                        if (var27 && field1158.length() < 320) {
                            field1158 = field1158 + Statics.field2218;
                        }
                    } else if (field1139 == 1) {
                        if (Statics.field3625 == 85 && field1159.length() > 0) {
                            field1159 = field1159.substring(0, field1159.length() - 1);
                        }
                        if (Statics.field3625 == 84 || Statics.field3625 == 80) {
                            field1139 = 0;
                        }
                        if (Statics.field3625 == 84) {
                            field1158 = field1158.trim();
                            if (field1158.length() == 0) {
                                method1842(class245.field2949, class245.field2989, class245.field2990);
                                return;
                            }
                            if (field1159.length() == 0) {
                                method1842(class245.field2991, class245.field2992, class245.field2993);
                                return;
                            }
                            method1842(class245.field3004, class245.field3102, class245.field3103);
                            client.method3297(false);
                            client.method3117(20);
                            return;
                        }
                        if (var27 && field1159.length() < 20) {
                            field1159 = field1159 + Statics.field2218;
                        }
                    }
                }
                return;
            }
        } else if (field1150 == 3) {
            int var29 = field1140 + 180;
            short var30 = 276;
            if (var7 == 1 && var8 >= var29 - 75 && var8 <= var29 + 75 && var9 >= var30 - 20 && var9 <= var30 + 20) {
                method176(false);
            }
            int var31 = field1140 + 180;
            short var32 = 326;
            if (var7 == 1 && var8 >= var31 - 75 && var8 <= var31 + 75 && var9 >= var32 - 20 && var9 <= var32 + 20) {
                method1842(class245.field3154, class245.field3129, class245.field3130);
                field1150 = 5;
                return;
            }
        } else if (field1150 == 4) {
            int var33 = field1140 + 180 - 80;
            short var34 = 321;
            if (var7 == 1 && var8 >= var33 - 75 && var8 <= var33 + 75 && var9 >= var34 - 20 && var9 <= var34 + 20) {
                Statics.field1162.trim();
                if (Statics.field1162.length() != 6) {
                    method1842(class245.field3157, class245.field2908, class245.field2909);
                    return;
                }
                Statics.field273 = Integer.parseInt(Statics.field1162);
                Statics.field1162 = "";
                client.method3297(true);
                method1842(class245.field3004, class245.field3102, class245.field3103);
                client.method3117(20);
                return;
            }
            if (var7 == 1 && var8 >= field1140 + 180 - 9 && var8 <= field1140 + 180 + 130 && var9 >= 263 && var9 <= 296) {
                field1164 = !field1164;
            }
            if (var7 == 1 && var8 >= field1140 + 180 - 34 && var8 <= field1140 + 180 + 34 && var9 >= 351 && var9 <= 363) {
                class51.method119(client.method257("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false);
            }
            int var35 = field1140 + 180 + 80;
            if (var7 == 1 && var8 >= var35 - 75 && var8 <= var35 + 75 && var9 >= var34 - 20 && var9 <= var34 + 20) {
                field1150 = 0;
                field1158 = "";
                field1159 = "";
                Statics.field273 = 0;
                Statics.field1162 = "";
            }
            while (class45.method565()) {
                boolean var36 = false;
                for (int var37 = 0; var37 < field1166.length(); var37++) {
                    if (Statics.field2218 == field1166.charAt(var37)) {
                        var36 = true;
                        break;
                    }
                }
                if (Statics.field3625 == 13) {
                    field1150 = 0;
                    field1158 = "";
                    field1159 = "";
                    Statics.field273 = 0;
                    Statics.field1162 = "";
                } else {
                    if (Statics.field3625 == 85 && Statics.field1162.length() > 0) {
                        Statics.field1162 = Statics.field1162.substring(0, Statics.field1162.length() - 1);
                    }
                    if (Statics.field3625 == 84) {
                        Statics.field1162.trim();
                        if (Statics.field1162.length() != 6) {
                            method1842(class245.field3157, class245.field2908, class245.field2909);
                            return;
                        }
                        Statics.field273 = Integer.parseInt(Statics.field1162);
                        Statics.field1162 = "";
                        client.method3297(true);
                        method1842(class245.field3004, class245.field3102, class245.field3103);
                        client.method3117(20);
                        return;
                    }
                    if (var36 && Statics.field1162.length() < 6) {
                        Statics.field1162 = Statics.field1162 + Statics.field2218;
                    }
                }
            }
        } else if (field1150 == 5) {
            int var38 = field1140 + 180 - 80;
            short var39 = 321;
            if (var7 == 1 && var8 >= var38 - 75 && var8 <= var38 + 75 && var9 >= var39 - 20 && var9 <= var39 + 20) {
                method1031();
                return;
            }
            int var40 = field1140 + 180 + 80;
            if (var7 == 1 && var8 >= var40 - 75 && var8 <= var40 + 75 && var9 >= var39 - 20 && var9 <= var39 + 20) {
                method176(true);
            }
            while (class45.method565()) {
                boolean var41 = false;
                for (int var42 = 0; var42 < field1156.length(); var42++) {
                    if (Statics.field2218 == field1156.charAt(var42)) {
                        var41 = true;
                        break;
                    }
                }
                if (Statics.field3625 == 13) {
                    method176(true);
                } else {
                    if (Statics.field3625 == 85 && field1158.length() > 0) {
                        field1158 = field1158.substring(0, field1158.length() - 1);
                    }
                    if (Statics.field3625 == 84) {
                        method1031();
                        return;
                    }
                    if (var41 && field1158.length() < 320) {
                        field1158 = field1158 + Statics.field2218;
                    }
                }
            }
        } else if (field1150 == 6) {
            while (true) {
                do {
                    if (!class45.method565()) {
                        short var43 = 321;
                        if (var7 == 1 && var9 >= var43 - 20 && var9 <= var43 + 20) {
                            method176(true);
                        }
                        return;
                    }
                } while (Statics.field3625 != 84 && Statics.field3625 != 13);
                method176(true);
            }
        } else if (field1150 == 7) {
            int var44 = field1140 + 180 - 80;
            short var45 = 321;
            if (var7 == 1 && var8 >= var44 - 75 && var8 <= var44 + 75 && var9 >= var45 - 20 && var9 <= var45 + 20) {
                class51.method119(client.method257("secure", true) + "m=dob/set_dob.ws", true, false);
                method1842(class245.field2911, class245.field2873, class245.field3127);
                field1150 = 6;
                return;
            }
            int var46 = field1140 + 180 + 80;
            if (var7 == 1 && var8 >= var46 - 75 && var8 <= var46 + 75 && var9 >= var45 - 20 && var9 <= var45 + 20) {
                method176(true);
            }
        } else if (field1150 == 8) {
            int var47 = field1140 + 180 - 80;
            short var48 = 321;
            if (var7 == 1 && var8 >= var47 - 75 && var8 <= var47 + 75 && var9 >= var48 - 20 && var9 <= var48 + 20) {
                class51.method119("https://www.jagex.com/terms/privacy/#eight", true, false);
                method1842(class245.field2911, class245.field2873, class245.field3127);
                field1150 = 6;
                return;
            }
            int var49 = field1140 + 180 + 80;
            if (var7 == 1 && var8 >= var49 - 75 && var8 <= var49 + 75 && var9 >= var48 - 20 && var9 <= var48 + 20) {
                method176(true);
            }
        } else if (field1150 == 12) {
            String var50 = "";
            switch(field1151) {
                case 0:
                    var50 = "https://support.runescape.com/hc/en-gb/articles/115002238729-Account-Bans";
                    break;
                case 1:
                    var50 = "https://support.runescape.com/hc/en-gb/articles/206103939-My-account-is-locked";
                    break;
                default:
                    method176(false);
            }
            int var51 = field1140 + 180;
            short var52 = 276;
            if (var7 == 1 && var8 >= var51 - 75 && var8 <= var51 + 75 && var9 >= var52 - 20 && var9 <= var52 + 20) {
                class51.method119(var50, true, false);
                method1842(class245.field2911, class245.field2873, class245.field3127);
                field1150 = 6;
                return;
            }
            int var53 = field1140 + 180;
            short var54 = 326;
            if (var7 == 1 && var8 >= var53 - 75 && var8 <= var53 + 75 && var9 >= var54 - 20 && var9 <= var54 + 20) {
                method176(false);
            }
        }
    }

    @ObfuscatedName("x.c(ZI)V")
    public static void method176(boolean arg0) {
        field1155 = class245.field3041;
        field1165 = class245.field3084;
        field1157 = class245.field2996;
        field1150 = 2;
        if (arg0) {
            field1159 = "";
        }
        method5072();
        method1597();
    }

    @ObfuscatedName("bv.z(B)V")
    public static void method1031() {
        field1158 = field1158.trim();
        if (field1158.length() == 0) {
            method1842(class245.field3154, class245.field3129, class245.field3130);
            return;
        }
        long var0 = class80.method4717();
        int var2;
        if (var0 == 0L) {
            var2 = 5;
        } else {
            var2 = class80.method3797(var0, field1158);
        }
        switch(var2) {
            case 2:
                method1842(class245.field3131, class245.field2952, class245.field2907);
                field1150 = 6;
                break;
            case 3:
                method1842(class245.field3134, class245.field3135, class245.field3159);
                break;
            case 4:
                method1842(class245.field3137, class245.field3107, class245.field3139);
                break;
            case 5:
                method1842(class245.field3140, class245.field3141, class245.field3142);
                break;
            case 6:
                method1842(class245.field3092, class245.field3144, class245.field3145);
                break;
            case 7:
                method1842(class245.field3146, class245.field3147, class245.field2980);
        }
    }

    @ObfuscatedName("ja.j(Lkf;Lkf;Lkf;ZB)V")
    public static void method4694(class304 arg0, class304 arg1, class304 arg2, boolean arg3) {
        if (arg3) {
            field1137 = (Statics.field1878 - 765) / 2;
            field1140 = field1137 + 202;
            Statics.field2630 = field1140 + 180;
        }
        if (field1167) {
            if (Statics.field1913 == null) {
                Statics.field1913 = class328.method5029(Statics.field549, "sl_back", "");
            }
            if (Statics.field1489 == null) {
                Statics.field1489 = class328.method5317(Statics.field549, "sl_flags", "");
            }
            if (Statics.field1095 == null) {
                Statics.field1095 = class328.method5317(Statics.field549, "sl_arrows", "");
            }
            if (Statics.field1203 == null) {
                Statics.field1203 = class328.method5317(Statics.field549, "sl_stars", "");
            }
            if (Statics.field3389 == null) {
                Statics.field3389 = class328.method5135(Statics.field549, "leftarrow", "");
            }
            if (Statics.field402 == null) {
                Statics.field402 = class328.method5135(Statics.field549, "rightarrow", "");
            }
            class323.method5630(field1137, 23, 765, 480, 0);
            class323.method5601(field1137, 0, 125, 23, 12425273, 9135624);
            class323.method5601(field1137 + 125, 0, 640, 23, 5197647, 2697513);
            arg0.method5340(class245.field3109, field1137 + 62, 15, 0, -1);
            if (Statics.field1203 != null) {
                Statics.field1203[1].method5666(field1137 + 140, 1);
                arg1.method5337(class245.field2880, field1137 + 152, 10, 16777215, -1);
                Statics.field1203[0].method5666(field1137 + 140, 12);
                arg1.method5337(class245.field3155, field1137 + 152, 21, 16777215, -1);
            }
            if (Statics.field1095 != null) {
                int var4 = field1137 + 280;
                if (class72.field1000[0] == 0 && class72.field999[0] == 0) {
                    Statics.field1095[2].method5666(var4, 4);
                } else {
                    Statics.field1095[0].method5666(var4, 4);
                }
                if (class72.field1000[0] == 0 && class72.field999[0] == 1) {
                    Statics.field1095[3].method5666(var4 + 15, 4);
                } else {
                    Statics.field1095[1].method5666(var4 + 15, 4);
                }
                arg0.method5337(class245.field3156, var4 + 32, 17, 16777215, -1);
                int var5 = field1137 + 390;
                if (class72.field1000[0] == 1 && class72.field999[0] == 0) {
                    Statics.field1095[2].method5666(var5, 4);
                } else {
                    Statics.field1095[0].method5666(var5, 4);
                }
                if (class72.field1000[0] == 1 && class72.field999[0] == 1) {
                    Statics.field1095[3].method5666(var5 + 15, 4);
                } else {
                    Statics.field1095[1].method5666(var5 + 15, 4);
                }
                arg0.method5337(class245.field2895, var5 + 32, 17, 16777215, -1);
                int var6 = field1137 + 500;
                if (class72.field1000[0] == 2 && class72.field999[0] == 0) {
                    Statics.field1095[2].method5666(var6, 4);
                } else {
                    Statics.field1095[0].method5666(var6, 4);
                }
                if (class72.field1000[0] == 2 && class72.field999[0] == 1) {
                    Statics.field1095[3].method5666(var6 + 15, 4);
                } else {
                    Statics.field1095[1].method5666(var6 + 15, 4);
                }
                arg0.method5337(class245.field3158, var6 + 32, 17, 16777215, -1);
                int var7 = field1137 + 610;
                if (class72.field1000[0] == 3 && class72.field999[0] == 0) {
                    Statics.field1095[2].method5666(var7, 4);
                } else {
                    Statics.field1095[0].method5666(var7, 4);
                }
                if (class72.field1000[0] == 3 && class72.field999[0] == 1) {
                    Statics.field1095[3].method5666(var7 + 15, 4);
                } else {
                    Statics.field1095[1].method5666(var7 + 15, 4);
                }
                arg0.method5337(class245.field2966, var7 + 32, 17, 16777215, -1);
            }
            class323.method5630(field1137 + 708, 4, 50, 16, 0);
            arg1.method5340(class245.field3138, field1137 + 708 + 25, 16, 16777215, -1);
            field1168 = -1;
            if (Statics.field1913 != null) {
                byte var8 = 88;
                byte var9 = 19;
                int var10 = 765 / (var8 + 1) - 1;
                int var11 = 480 / (var9 + 1);
                int var12;
                int var13;
                do {
                    var12 = var11;
                    var13 = var10;
                    if ((var10 - 1) * var11 >= class72.field1004) {
                        var10--;
                    }
                    if ((var11 - 1) * var10 >= class72.field1004) {
                        var11--;
                    }
                    if ((var11 - 1) * var10 >= class72.field1004) {
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
                int var18 = (class72.field1004 + var11 - 1) / var11;
                field1170 = var18 - var10;
                if (Statics.field3389 != null && field1169 > 0) {
                    Statics.field3389.method5666(8, Statics.field442 / 2 - Statics.field3389.field3874 / 2);
                }
                if (Statics.field402 != null && field1169 < field1170) {
                    Statics.field402.method5666(Statics.field1878 - Statics.field402.field3873 - 8, Statics.field442 / 2 - Statics.field402.field3874 / 2);
                }
                int var19 = var17 + 23;
                int var20 = field1137 + var16;
                int var21 = 0;
                boolean var22 = false;
                int var23 = field1169;
                for (int var24 = var11 * var23; var24 < class72.field1004 && var23 - field1169 < var10; var24++) {
                    class72 var25 = Statics.field997[var24];
                    boolean var26 = true;
                    String var27 = Integer.toString(var25.field1003);
                    if (var25.field1003 == -1) {
                        var27 = class245.field3065;
                        var26 = false;
                    } else if (var25.field1003 > 1980) {
                        var27 = class245.field3161;
                        var26 = false;
                    }
                    int var28 = 0;
                    byte var29;
                    if (var25.method1601()) {
                        if (var25.method1621()) {
                            var29 = 7;
                        } else {
                            var29 = 6;
                        }
                    } else if (var25.method1603()) {
                        var28 = 16711680;
                        if (var25.method1621()) {
                            var29 = 5;
                        } else {
                            var29 = 4;
                        }
                    } else if (var25.method1602()) {
                        if (var25.method1621()) {
                            var29 = 3;
                        } else {
                            var29 = 2;
                        }
                    } else if (var25.method1621()) {
                        var29 = 1;
                    } else {
                        var29 = 0;
                    }
                    if (class54.field468 >= var20 && class54.field475 * 30622073 >= var19 && class54.field468 < var8 + var20 && class54.field475 * 30622073 < var9 + var19 && var26) {
                        field1168 = var24;
                        Statics.field1913[var29].method5702(var20, var19, 128, 16777215);
                        var22 = true;
                    } else {
                        Statics.field1913[var29].method5705(var20, var19);
                    }
                    if (Statics.field1489 != null) {
                        Statics.field1489[(var25.method1621() ? 8 : 0) + var25.field1006].method5666(var20 + 29, var19);
                    }
                    arg0.method5340(Integer.toString(var25.field1001), var20 + 15, var9 / 2 + var19 + 5, var28, -1);
                    arg1.method5340(var27, var20 + 60, var9 / 2 + var19 + 5, 268435455, -1);
                    var19 += var9 + var15;
                    var21++;
                    if (var21 >= var11) {
                        var19 = var17 + 23;
                        var20 += var8 + var14;
                        var21 = 0;
                        var23++;
                    }
                }
                if (var22) {
                    int var30 = arg1.method5345(Statics.field997[field1168].field1005) + 6;
                    int var31 = arg1.field3758 + 8;
                    class323.method5630(class54.field468 - var30 / 2, class54.field475 * 30622073 + 20 + 5, var30, var31, 16777120);
                    class323.method5604(class54.field468 - var30 / 2, class54.field475 * 30622073 + 20 + 5, var30, var31, 0);
                    arg1.method5340(Statics.field997[field1168].field1005, class54.field468, class54.field475 * 30622073 + 20 + 5 + arg1.field3758 + 4, 0, -1);
                }
            }
            Statics.field184.method738(0, 0);
            return;
        }
        if (arg3) {
            Statics.field1163.method5705(field1137, 0);
            Statics.field2021.method5705(field1137 + 382, 0);
            Statics.field522.method5666(field1137 + 382 - Statics.field522.field3873 / 2, 18);
        }
        if (client.field638 == 0 || client.field638 == 5) {
            byte var32 = 20;
            arg0.method5340(class245.field3082, field1140 + 180, 245 - var32, 16777215, -1);
            int var33 = 253 - var32;
            class323.method5604(field1140 + 180 - 152, var33, 304, 34, 9179409);
            class323.method5604(field1140 + 180 - 151, var33 + 1, 302, 32, 0);
            class323.method5630(field1140 + 180 - 150, var33 + 2, field1149 * 3, 30, 9179409);
            class323.method5630(field1149 * 3 + (field1140 + 180 - 150), var33 + 2, 300 - field1149 * 3, 30, 0);
            arg0.method5340(field1153, field1140 + 180, 276 - var32, 16777215, -1);
        }
        if (client.field638 == 20) {
            Statics.field1145.method5666(field1140 + 180 - Statics.field1145.field3873 / 2, 271 - Statics.field1145.field3874 / 2);
            short var34 = 201;
            arg0.method5340(field1155, field1140 + 180, var34, 16776960, 0);
            int var130 = var34 + 15;
            arg0.method5340(field1165, field1140 + 180, var130, 16776960, 0);
            int var131 = var130 + 15;
            arg0.method5340(field1157, field1140 + 180, var131, 16776960, 0);
            int var132 = var131 + 15;
            int var133 = var132 + 7;
            if (field1150 != 4) {
                arg0.method5337(class245.field3077, field1140 + 180 - 110, var133, 16777215, 0);
                short var35 = 200;
                String var36 = Statics.field2667.field1015 ? class311.method1595(field1158) : field1158;
                String var37;
                for (var37 = var36; arg0.method5345(var37) > var35; var37 = var37.substring(0, var37.length() - 1)) {
                }
                arg0.method5337(class305.method5400(var37), field1140 + 180 - 70, var133, 16777215, 0);
                var130 = var133 + 15;
                arg0.method5337(class245.field3022 + class311.method1595(field1159), field1140 + 180 - 108, var130, 16777215, 0);
                var130 += 15;
            }
        }
        if (client.field638 == 10 || client.field638 == 11) {
            Statics.field1145.method5666(field1140, 171);
            if (field1150 == 0) {
                short var38 = 251;
                arg0.method5340(class245.field3097, field1140 + 180, var38, 16776960, 0);
                int var134 = var38 + 30;
                int var39 = field1140 + 180 - 80;
                short var40 = 291;
                Statics.field1497.method5666(var39 - 73, var40 - 20);
                arg0.method5341(class245.field3108, var39 - 73, var40 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                int var41 = field1140 + 180 + 80;
                Statics.field1497.method5666(var41 - 73, var40 - 20);
                arg0.method5341(class245.field3053, var41 - 73, var40 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field1150 == 1) {
                arg0.method5340(field1154, field1140 + 180, 201, 16776960, 0);
                short var42 = 236;
                arg0.method5340(field1155, field1140 + 180, var42, 16777215, 0);
                int var135 = var42 + 15;
                arg0.method5340(field1165, field1140 + 180, var135, 16777215, 0);
                int var136 = var135 + 15;
                arg0.method5340(field1157, field1140 + 180, var136, 16777215, 0);
                int var137 = var136 + 15;
                int var43 = field1140 + 180 - 80;
                short var44 = 321;
                Statics.field1497.method5666(var43 - 73, var44 - 20);
                arg0.method5340(class245.field2874, var43, var44 + 5, 16777215, 0);
                int var45 = field1140 + 180 + 80;
                Statics.field1497.method5666(var45 - 73, var44 - 20);
                arg0.method5340(class245.field3138, var45, var44 + 5, 16777215, 0);
            } else if (field1150 == 2) {
                short var46 = 201;
                arg0.method5340(field1155, Statics.field2630, var46, 16776960, 0);
                int var138 = var46 + 15;
                arg0.method5340(field1165, Statics.field2630, var138, 16776960, 0);
                int var139 = var138 + 15;
                arg0.method5340(field1157, Statics.field2630, var139, 16776960, 0);
                int var140 = var139 + 15;
                int var141 = var140 + 7;
                arg0.method5337(class245.field3077, Statics.field2630 - 110, var141, 16777215, 0);
                short var47 = 200;
                String var48 = Statics.field2667.field1015 ? class311.method1595(field1158) : field1158;
                String var49;
                for (var49 = var48; arg0.method5345(var49) > var47; var49 = var49.substring(1)) {
                }
                arg0.method5337(class305.method5400(var49) + (field1139 == 0 & client.field899 % 40 < 20 ? class81.method268(16776960) + class81.field1101 : ""), Statics.field2630 - 70, var141, 16777215, 0);
                var138 = var141 + 15;
                arg0.method5337(class245.field3022 + class311.method1595(field1159) + (field1139 == 1 & client.field899 % 40 < 20 ? class81.method268(16776960) + class81.field1101 : ""), Statics.field2630 - 108, var138, 16777215, 0);
                var138 += 15;
                short var50 = 277;
                int var51 = Statics.field2630 + -117;
                class326 var52 = method3269(client.field668, field1160);
                var52.method5666(var51, var50);
                int var53 = var52.field3873 + 5 + var51;
                arg1.method5337(class245.field3112, var53, var50 + 13, 16776960, 0);
                int var54 = Statics.field2630 + 24;
                class326 var55 = method3269(Statics.field2667.field1015, field1161);
                var55.method5666(var54, var50);
                int var56 = var55.field3873 + 5 + var54;
                arg1.method5337(class245.field3113, var56, var50 + 13, 16776960, 0);
                int var142 = var50 + 15;
                int var57 = Statics.field2630 - 80;
                short var58 = 321;
                Statics.field1497.method5666(var57 - 73, var58 - 20);
                arg0.method5340(class245.field3000, var57, var58 + 5, 16777215, 0);
                int var59 = Statics.field2630 + 80;
                Statics.field1497.method5666(var59 - 73, var58 - 20);
                arg0.method5340(class245.field3138, var59, var58 + 5, 16777215, 0);
                short var60 = 357;
                switch(field1152) {
                    case 2:
                        Statics.field3218 = class245.field3110;
                        break;
                    default:
                        Statics.field3218 = class245.field3123;
                }
                Statics.field33 = new class319(Statics.field2630, var60, arg1.method5345(Statics.field3218), 11);
                arg1.method5340(Statics.field3218, Statics.field2630, var60, 16777215, 0);
            } else if (field1150 == 3) {
                short var61 = 201;
                arg0.method5340(class245.field3114, field1140 + 180, var61, 16776960, 0);
                int var143 = var61 + 20;
                arg1.method5340(class245.field2943, field1140 + 180, var143, 16776960, 0);
                int var144 = var143 + 15;
                arg1.method5340(class245.field2941, field1140 + 180, var144, 16776960, 0);
                int var145 = var144 + 15;
                int var62 = field1140 + 180;
                short var63 = 276;
                Statics.field1497.method5666(var62 - 73, var63 - 20);
                arg2.method5340(class245.field3117, var62, var63 + 5, 16777215, 0);
                int var64 = field1140 + 180;
                short var65 = 326;
                Statics.field1497.method5666(var64 - 73, var65 - 20);
                arg2.method5340(class245.field3118, var64, var65 + 5, 16777215, 0);
            } else if (field1150 == 4) {
                arg0.method5340(class245.field2957, field1140 + 180, 201, 16776960, 0);
                short var66 = 236;
                arg0.method5340(field1155, field1140 + 180, var66, 16777215, 0);
                int var146 = var66 + 15;
                arg0.method5340(field1165, field1140 + 180, var146, 16777215, 0);
                int var147 = var146 + 15;
                arg0.method5340(field1157, field1140 + 180, var147, 16777215, 0);
                int var148 = var147 + 15;
                arg0.method5337(class245.field3106 + class311.method1595(Statics.field1162) + (client.field899 % 40 < 20 ? class81.method268(16776960) + class81.field1101 : ""), field1140 + 180 - 108, var148, 16777215, 0);
                int var149 = var148 - 8;
                arg0.method5337(class245.field2877, field1140 + 180 - 9, var149, 16776960, 0);
                int var150 = var149 + 15;
                arg0.method5337(class245.field3105, field1140 + 180 - 9, var150, 16776960, 0);
                int var67 = field1140 + 180 - 9 + arg0.method5345(class245.field3105) + 15;
                int var68 = var150 - arg0.field3758;
                class326 var69;
                if (field1164) {
                    var69 = Statics.field3784;
                } else {
                    var69 = Statics.field2063;
                }
                var69.method5666(var67, var68);
                var146 = var150 + 15;
                int var70 = field1140 + 180 - 80;
                short var71 = 321;
                Statics.field1497.method5666(var70 - 73, var71 - 20);
                arg0.method5340(class245.field2874, var70, var71 + 5, 16777215, 0);
                int var72 = field1140 + 180 + 80;
                Statics.field1497.method5666(var72 - 73, var71 - 20);
                arg0.method5340(class245.field3138, var72, var71 + 5, 16777215, 0);
                arg1.method5340(class245.field3100, field1140 + 180, var71 + 36, 255, 0);
            } else if (field1150 == 5) {
                arg0.method5340(class245.field3119, field1140 + 180, 201, 16776960, 0);
                short var73 = 221;
                arg2.method5340(field1155, field1140 + 180, var73, 16776960, 0);
                int var151 = var73 + 15;
                arg2.method5340(field1165, field1140 + 180, var151, 16776960, 0);
                int var152 = var151 + 15;
                arg2.method5340(field1157, field1140 + 180, var152, 16776960, 0);
                int var153 = var152 + 15;
                int var154 = var153 + 14;
                arg0.method5337(class245.field3162, field1140 + 180 - 145, var154, 16777215, 0);
                short var74 = 174;
                String var75 = Statics.field2667.field1015 ? class311.method1595(field1158) : field1158;
                String var76;
                for (var76 = var75; arg0.method5345(var76) > var74; var76 = var76.substring(1)) {
                }
                arg0.method5337(class305.method5400(var76) + (client.field899 % 40 < 20 ? class81.method268(16776960) + class81.field1101 : ""), field1140 + 180 - 34, var154, 16777215, 0);
                var151 = var154 + 15;
                int var77 = field1140 + 180 - 80;
                short var78 = 321;
                Statics.field1497.method5666(var77 - 73, var78 - 20);
                arg0.method5340(class245.field3111, var77, var78 + 5, 16777215, 0);
                int var79 = field1140 + 180 + 80;
                Statics.field1497.method5666(var79 - 73, var78 - 20);
                arg0.method5340(class245.field3122, var79, var78 + 5, 16777215, 0);
            } else if (field1150 == 6) {
                short var80 = 201;
                arg0.method5340(field1155, field1140 + 180, var80, 16776960, 0);
                int var155 = var80 + 15;
                arg0.method5340(field1165, field1140 + 180, var155, 16776960, 0);
                int var156 = var155 + 15;
                arg0.method5340(field1157, field1140 + 180, var156, 16776960, 0);
                int var157 = var156 + 15;
                int var81 = field1140 + 180;
                short var82 = 321;
                Statics.field1497.method5666(var81 - 73, var82 - 20);
                arg0.method5340(class245.field3122, var81, var82 + 5, 16777215, 0);
            } else if (field1150 == 7) {
                short var83 = 216;
                arg0.method5340(class245.field3019, field1140 + 180, var83, 16776960, 0);
                int var158 = var83 + 15;
                arg2.method5340(class245.field2932, field1140 + 180, var158, 16776960, 0);
                int var159 = var158 + 15;
                arg2.method5340(class245.field3151, field1140 + 180, var159, 16776960, 0);
                int var160 = var159 + 15;
                int var84 = field1140 + 180 - 80;
                short var85 = 321;
                Statics.field1497.method5666(var84 - 73, var85 - 20);
                arg0.method5340(class245.field3152, var84, var85 + 5, 16777215, 0);
                int var86 = field1140 + 180 + 80;
                Statics.field1497.method5666(var86 - 73, var85 - 20);
                arg0.method5340(class245.field3122, var86, var85 + 5, 16777215, 0);
            } else if (field1150 == 8) {
                short var87 = 216;
                arg0.method5340(class245.field3006, field1140 + 180, var87, 16776960, 0);
                int var161 = var87 + 15;
                arg2.method5340(class245.field3007, field1140 + 180, var161, 16776960, 0);
                int var162 = var161 + 15;
                arg2.method5340(class245.field3050, field1140 + 180, var162, 16776960, 0);
                int var163 = var162 + 15;
                int var88 = field1140 + 180 - 80;
                short var89 = 321;
                Statics.field1497.method5666(var88 - 73, var89 - 20);
                arg0.method5340(class245.field3009, var88, var89 + 5, 16777215, 0);
                int var90 = field1140 + 180 + 80;
                Statics.field1497.method5666(var90 - 73, var89 - 20);
                arg0.method5340(class245.field3122, var90, var89 + 5, 16777215, 0);
            } else if (field1150 == 12) {
                short var91 = 201;
                String var92 = "";
                String var93 = "";
                String var94 = "";
                switch(field1151) {
                    case 0:
                        var92 = class245.field2922;
                        var93 = class245.field2923;
                        var94 = class245.field3033;
                        break;
                    case 1:
                        var92 = class245.field2961;
                        var93 = class245.field2962;
                        var94 = class245.field2963;
                        break;
                    default:
                        method176(false);
                }
                arg0.method5340(var92, field1140 + 180, var91, 16776960, 0);
                int var164 = var91 + 15;
                arg2.method5340(var93, field1140 + 180, var164, 16776960, 0);
                int var165 = var164 + 15;
                arg2.method5340(var94, field1140 + 180, var165, 16776960, 0);
                int var166 = var165 + 15;
                int var95 = field1140 + 180;
                short var96 = 276;
                Statics.field1497.method5666(var95 - 73, var96 - 20);
                arg0.method5340(class245.field2906, var95, var96 + 5, 16777215, 0);
                int var97 = field1140 + 180;
                short var98 = 326;
                Statics.field1497.method5666(var97 - 73, var98 - 20);
                arg0.method5340(class245.field3122, var97, var98 + 5, 16777215, 0);
            }
        }
        if (field1147 > 0) {
            method1032(field1147);
            field1147 = 0;
        }
        short var99 = 256;
        if (field1143 > 0) {
            for (int var100 = 0; var100 < 256; var100++) {
                if (field1143 > 768) {
                    Statics.field39[var100] = method2045(Statics.field1144[var100], Statics.field74[var100], 1024 - field1143);
                } else if (field1143 > 256) {
                    Statics.field39[var100] = Statics.field74[var100];
                } else {
                    Statics.field39[var100] = method2045(Statics.field74[var100], Statics.field1144[var100], 256 - field1143);
                }
            }
        } else if (field1136 > 0) {
            for (int var101 = 0; var101 < 256; var101++) {
                if (field1136 > 768) {
                    Statics.field39[var101] = method2045(Statics.field1144[var101], Statics.field1108[var101], 1024 - field1136);
                } else if (field1136 > 256) {
                    Statics.field39[var101] = Statics.field1108[var101];
                } else {
                    Statics.field39[var101] = method2045(Statics.field1108[var101], Statics.field1144[var101], 256 - field1136);
                }
            }
        } else {
            for (int var102 = 0; var102 < 256; var102++) {
                Statics.field39[var102] = Statics.field1144[var102];
            }
        }
        class323.method5632(field1137, 9, field1137 + 128, var99 + 7);
        Statics.field1163.method5705(field1137, 0);
        class323.method5591();
        int var103 = 0;
        int var104 = field1137 + Statics.field184.field3863 * 9;
        for (int var105 = 1; var105 < var99 - 1; var105++) {
            int var106 = (var99 - var105) * field1141[var105] / var99;
            int var107 = var106 + 22;
            if (var107 < 0) {
                var107 = 0;
            }
            var103 += var107;
            for (int var108 = var107; var108 < 128; var108++) {
                int var109 = Statics.field332[var103++];
                if (var109 == 0) {
                    var104++;
                } else {
                    int var111 = 256 - var109;
                    int var112 = Statics.field39[var109];
                    int var113 = Statics.field184.field3862[var104];
                    Statics.field184.field3862[var104++] = ((var112 & 0xFF00) * var109 + (var113 & 0xFF00) * var111 & 0xFF0000) + ((var112 & 0xFF00FF) * var109 + (var113 & 0xFF00FF) * var111 & 0xFF00FF00) >> 8;
                }
            }
            var104 += Statics.field184.field3863 + var107 - 128;
        }
        class323.method5632(field1137 + 765 - 128, 9, field1137 + 765, var99 + 7);
        Statics.field2021.method5705(field1137 + 382, 0);
        class323.method5591();
        int var114 = 0;
        int var115 = field1137 + Statics.field184.field3863 * 9 + 24 + 637;
        for (int var116 = 1; var116 < var99 - 1; var116++) {
            int var117 = (var99 - var116) * field1141[var116] / var99;
            int var118 = 103 - var117;
            int var119 = var115 + var117;
            for (int var120 = 0; var120 < var118; var120++) {
                int var121 = Statics.field332[var114++];
                if (var121 == 0) {
                    var119++;
                } else {
                    int var123 = 256 - var121;
                    int var124 = Statics.field39[var121];
                    int var125 = Statics.field184.field3862[var119];
                    Statics.field184.field3862[var119++] = ((var124 & 0xFF00) * var121 + (var125 & 0xFF00) * var123 & 0xFF0000) + ((var124 & 0xFF00FF) * var121 + (var125 & 0xFF00FF) * var123 & 0xFF00FF00) >> 8;
                }
            }
            var114 += 128 - var118;
            var115 = Statics.field184.field3863 - var118 - var117 + var119;
        }
        Statics.field1390[Statics.field2667.field1014 ? 1 : 0].method5666(field1137 + 765 - 40, 463);
        if (client.field638 <= 5 || client.field884 != 0) {
            return;
        }
        if (Statics.field257 == null) {
            Statics.field257 = class328.method5135(Statics.field549, "sl_button", "");
            return;
        }
        int var126 = field1137 + 5;
        short var127 = 463;
        byte var128 = 100;
        byte var129 = 35;
        Statics.field257.method5666(var126, var127);
        arg0.method5340(class245.field3037 + " " + client.field630, var128 / 2 + var126, var129 / 2 + var127 - 2, 16777215, 0);
        if (Statics.field1417 == null) {
            arg1.method5340(class245.field3163, var128 / 2 + var126, var129 / 2 + var127 + 12, 16777215, 0);
        } else {
            arg1.method5340(class245.field3098, var128 / 2 + var126, var129 / 2 + var127 + 12, 16777215, 0);
        }
    }

    @ObfuscatedName("bz.d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method1842(String arg0, String arg1, String arg2) {
        field1155 = arg0;
        field1165 = arg1;
        field1157 = arg2;
    }

    @ObfuscatedName("ir.i(Lll;I)V")
    public static final void method4432(class326 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < Statics.field252.length; var2++) {
            Statics.field252[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            Statics.field252[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    Statics.field109[var8] = (Statics.field252[var8 - 1] + Statics.field252[var8 + 1] + Statics.field252[var8 - 128] + Statics.field252[var8 + 128]) / 4;
                }
            }
            int[] var9 = Statics.field252;
            Statics.field252 = Statics.field109;
            Statics.field109 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field3874; var11++) {
            for (int var12 = 0; var12 < arg0.field3873; var12++) {
                if (arg0.field3872[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field3870;
                    int var14 = var11 + 16 + arg0.field3875;
                    int var15 = (var14 << 7) + var13;
                    Statics.field252[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("bv.m(II)V")
    public static final void method1032(int arg0) {
        short var1 = 256;
        field1142 += arg0 * 128;
        if (field1142 > Statics.field252.length) {
            field1142 -= Statics.field252.length;
            int var2 = (int) (Math.random() * 12.0D);
            method4432(Statics.field1138[var2]);
        }
        int var3 = 0;
        int var4 = arg0 * 128;
        int var5 = (var1 - arg0) * 128;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = Statics.field332[var3 + var4] - Statics.field252[field1142 + var3 & Statics.field252.length - 1] * arg0 / 6;
            if (var7 < 0) {
                var7 = 0;
            }
            Statics.field332[var3++] = var7;
        }
        for (int var8 = var1 - arg0; var8 < var1; var8++) {
            int var9 = var8 * 128;
            for (int var10 = 0; var10 < 128; var10++) {
                int var11 = (int) (Math.random() * 100.0D);
                if (var11 < 50 && var10 > 10 && var10 < 118) {
                    Statics.field332[var9 + var10] = 255;
                } else {
                    Statics.field332[var9 + var10] = 0;
                }
            }
        }
        if (field1143 > 0) {
            field1143 -= arg0 * 4;
        }
        if (field1136 > 0) {
            field1136 -= arg0 * 4;
        }
        if (field1143 == 0 && field1136 == 0) {
            int var12 = (int) (Math.random() * (double) (2000 / arg0));
            if (var12 == 0) {
                field1143 = 1024;
            }
            if (var12 == 1) {
                field1136 = 1024;
            }
        }
        for (int var13 = 0; var13 < var1 - arg0; var13++) {
            field1141[var13] = field1141[arg0 + var13];
        }
        for (int var14 = var1 - arg0; var14 < var1; var14++) {
            field1141[var14] = (int) (Math.sin((double) field1135 / 14.0D) * 16.0D + Math.sin((double) field1135 / 15.0D) * 14.0D + Math.sin((double) field1135 / 16.0D) * 12.0D);
            field1135++;
        }
        field1146 += arg0 * 752950625;
        int var15 = ((client.field899 & 0x1) + arg0) / 2;
        if (var15 <= 0) {
            return;
        }
        for (int var16 = 0; var16 < field1146 * -785672476; var16++) {
            int var17 = (int) (Math.random() * 124.0D) + 2;
            int var18 = (int) (Math.random() * 128.0D) + 128;
            Statics.field332[(var18 << 7) + var17] = 192;
        }
        field1146 = 0;
        for (int var19 = 0; var19 < var1; var19++) {
            int var20 = 0;
            int var21 = var19 * 128;
            for (int var22 = -var15; var22 < 128; var22++) {
                if (var15 + var22 < 128) {
                    var20 += Statics.field332[var21 + var22 + var15];
                }
                if (var22 - (var15 + 1) >= 0) {
                    var20 -= Statics.field332[var21 + var22 - (var15 + 1)];
                }
                if (var22 >= 0) {
                    Statics.field1103[var21 + var22] = var20 / (var15 * 2 + 1);
                }
            }
        }
        for (int var23 = 0; var23 < 128; var23++) {
            int var24 = 0;
            for (int var25 = -var15; var25 < var1; var25++) {
                int var26 = var25 * 128;
                if (var15 + var25 < var1) {
                    var24 += Statics.field1103[var15 * 128 + var23 + var26];
                }
                if (var25 - (var15 + 1) >= 0) {
                    var24 -= Statics.field1103[var23 + var26 - (var15 + 1) * 128];
                }
                if (var25 >= 0) {
                    Statics.field332[var23 + var26] = var24 / (var15 * 2 + 1);
                }
            }
        }
    }

    @ObfuscatedName("cl.v(IIII)I")
    public static final int method2045(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) >> 8;
    }

    @ObfuscatedName("fy.r(Lbf;B)V")
    public static void method3322(class53 arg0) {
        while (class45.method565()) {
            if (Statics.field3625 == 13) {
                method245();
                return;
            }
            if (Statics.field3625 == 96) {
                if (field1169 > 0 && Statics.field3389 != null) {
                    field1169--;
                }
            } else if (Statics.field3625 == 97 && field1169 < field1170 && Statics.field402 != null) {
                field1169++;
            }
        }
        if (class54.field460 != 1 && Statics.field98 || class54.field460 != 4) {
            return;
        }
        int var1 = field1137 + 280;
        if (class54.field478 >= var1 && class54.field478 <= var1 + 14 && class54.field479 >= 4 && class54.field479 <= 18) {
            class72.method3121(0, 0);
            return;
        }
        if (class54.field478 >= var1 + 15 && class54.field478 <= var1 + 80 && class54.field479 >= 4 && class54.field479 <= 18) {
            class72.method3121(0, 1);
            return;
        }
        int var2 = field1137 + 390;
        if (class54.field478 >= var2 && class54.field478 <= var2 + 14 && class54.field479 >= 4 && class54.field479 <= 18) {
            class72.method3121(1, 0);
            return;
        }
        if (class54.field478 >= var2 + 15 && class54.field478 <= var2 + 80 && class54.field479 >= 4 && class54.field479 <= 18) {
            class72.method3121(1, 1);
            return;
        }
        int var3 = field1137 + 500;
        if (class54.field478 >= var3 && class54.field478 <= var3 + 14 && class54.field479 >= 4 && class54.field479 <= 18) {
            class72.method3121(2, 0);
            return;
        }
        if (class54.field478 >= var3 + 15 && class54.field478 <= var3 + 80 && class54.field479 >= 4 && class54.field479 <= 18) {
            class72.method3121(2, 1);
            return;
        }
        int var4 = field1137 + 610;
        if (class54.field478 >= var4 && class54.field478 <= var4 + 14 && class54.field479 >= 4 && class54.field479 <= 18) {
            class72.method3121(3, 0);
            return;
        }
        if (class54.field478 >= var4 + 15 && class54.field478 <= var4 + 80 && class54.field479 >= 4 && class54.field479 <= 18) {
            class72.method3121(3, 1);
            return;
        }
        if (class54.field478 >= field1137 + 708 && class54.field479 >= 4 && class54.field478 <= field1137 + 708 + 50 && class54.field479 <= 20) {
            method245();
            return;
        }
        if (field1168 != -1) {
            class72 var5 = Statics.field997[field1168];
            method5530(var5);
            method245();
            return;
        }
        if (field1169 > 0 && Statics.field3389 != null && class54.field478 >= 0 && class54.field478 <= Statics.field3389.field3873 && class54.field479 >= Statics.field442 / 2 - 50 && class54.field479 <= Statics.field442 / 2 + 50) {
            field1169--;
        }
        if (field1169 < field1170 && Statics.field402 != null && class54.field478 >= Statics.field1878 - Statics.field402.field3873 - 5 && class54.field478 <= Statics.field1878 && class54.field479 >= Statics.field442 / 2 - 50 && class54.field479 <= Statics.field442 / 2 + 50) {
            field1169++;
        }
    }

    @ObfuscatedName("lx.x(Lbl;B)V")
    public static void method5530(class72 arg0) {
        if (arg0.method1621() != client.field851) {
            client.field851 = arg0.method1621();
            boolean var1 = arg0.method1621();
            if (Statics.field2624 != var1) {
                class275.field3508.method3899();
                class275.field3495.method3899();
                class275.field3496.method3899();
                Statics.field2624 = var1;
            }
        }
        Statics.field2445 = arg0.field993;
        client.field630 = arg0.field1001;
        client.field631 = arg0.field1002;
        Statics.field400 = client.field679 == 0 ? 43594 : arg0.field1001 + 40000;
        Statics.field3 = client.field679 == 0 ? 443 : arg0.field1001 + 50000;
        Statics.field2013 = Statics.field400;
    }

    @ObfuscatedName("z.y(I)V")
    public static void method66() {
        if (class72.method3401()) {
            field1167 = true;
            field1169 = 0;
            field1170 = 0;
        }
    }

    @ObfuscatedName("s.p(I)V")
    public static void method245() {
        field1167 = false;
        Statics.field1163.method5705(field1137, 0);
        Statics.field2021.method5705(field1137 + 382, 0);
        Statics.field522.method5666(field1137 + 382 - Statics.field522.field3873 / 2, 18);
    }
}
