package deob;

import java.io.IOException;
import java.text.DecimalFormat;

@ObfuscatedName("cc")
public class class85 {

    @ObfuscatedName("cc.s")
    public static int field1169 = 0;

    @ObfuscatedName("cc.y")
    public static int field1157 = field1169 + 202;

    @ObfuscatedName("cc.d")
    public static int[] field1160 = new int[256];

    @ObfuscatedName("cc.z")
    public static int field1161 = 0;

    @ObfuscatedName("cc.ag")
    public static int field1162 = 0;

    @ObfuscatedName("cc.ah")
    public static int field1164 = 0;

    @ObfuscatedName("cc.aw")
    public static int field1184 = 0;

    @ObfuscatedName("cc.an")
    public static int field1166 = 0;

    @ObfuscatedName("cc.at")
    public static int field1151 = 0;

    @ObfuscatedName("cc.ae")
    public static int field1168 = 10;

    @ObfuscatedName("cc.av")
    public static String field1167 = "";

    @ObfuscatedName("cc.aq")
    public static int field1171 = -1;

    @ObfuscatedName("cc.ac")
    public static int field1173 = 1;

    @ObfuscatedName("cc.ax")
    public static int field1174 = 0;

    @ObfuscatedName("cc.ap")
    public static String field1175 = "";

    @ObfuscatedName("cc.ak")
    public static String field1189 = "";

    @ObfuscatedName("cc.am")
    public static String field1149 = "";

    @ObfuscatedName("cc.bf")
    public static String field1178 = "";

    @ObfuscatedName("cc.bo")
    public static String field1179 = "";

    @ObfuscatedName("cc.be")
    public static String field1180 = "";

    @ObfuscatedName("cc.bk")
    public static boolean field1181 = false;

    @ObfuscatedName("cc.br")
    public static boolean field1182 = false;

    @ObfuscatedName("cc.bb")
    public static boolean field1183 = true;

    @ObfuscatedName("cc.bw")
    public static int field1163 = 0;

    @ObfuscatedName("cc.bh")
    public static String field1185 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("cc.bj")
    public static String field1186 = "1234567890";

    @ObfuscatedName("cc.by")
    public static boolean field1187 = false;

    @ObfuscatedName("cc.cm")
    public static int field1188 = -1;

    @ObfuscatedName("cc.ch")
    public static int field1153 = 0;

    @ObfuscatedName("cc.cg")
    public static int field1154 = 0;

    @ObfuscatedName("cc.ca")
    public static long field1191;

    @ObfuscatedName("cc.cy")
    public static long field1192;

    static {
        new DecimalFormat("##0.00");
        new class156();
        field1191 = -1L;
        field1192 = -1L;
    }

    public class85() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fv.a(Liz;Liz;ZII)V")
    public static void method3359(class255 arg0, class255 arg1, boolean arg2, int arg3) {
        if (!Statics.field1150) {
            field1174 = arg3;
            class324.method5547();
            byte[] var4 = arg0.method4442("title.jpg", "");
            Statics.field3309 = class49.method3425(var4);
            Statics.field1152 = Statics.field3309.method5657();
            if ((client.field788 & 0x20000000) == 0) {
                Statics.field1190 = class329.method450(arg1, "logo", "");
            } else {
                Statics.field1190 = class329.method450(arg1, "logo_deadman_mode", "");
            }
            Statics.field1975 = class329.method450(arg1, "titlebox", "");
            Statics.field1176 = class329.method450(arg1, "titlebutton", "");
            Statics.field1000 = class329.method510(arg1, "runes", "");
            Statics.field1158 = class329.method510(arg1, "title_mute", "");
            Statics.field1155 = class329.method450(arg1, "options_radio_buttons,0", "");
            Statics.field58 = class329.method450(arg1, "options_radio_buttons,4", "");
            Statics.field2535 = class329.method450(arg1, "options_radio_buttons,2", "");
            Statics.field79 = class329.method450(arg1, "options_radio_buttons,6", "");
            Statics.field3196 = Statics.field1155.field3882;
            Statics.field188 = Statics.field1155.field3880;
            Statics.field418 = new int[256];
            for (int var5 = 0; var5 < 64; var5++) {
                Statics.field418[var5] = var5 * 262144;
            }
            for (int var6 = 0; var6 < 64; var6++) {
                Statics.field418[var6 + 64] = var6 * 1024 + 16711680;
            }
            for (int var7 = 0; var7 < 64; var7++) {
                Statics.field418[var7 + 128] = var7 * 4 + 16776960;
            }
            for (int var8 = 0; var8 < 64; var8++) {
                Statics.field418[var8 + 192] = 16777215;
            }
            Statics.field267 = new int[256];
            for (int var9 = 0; var9 < 64; var9++) {
                Statics.field267[var9] = var9 * 1024;
            }
            for (int var10 = 0; var10 < 64; var10++) {
                Statics.field267[var10 + 64] = var10 * 4 + 65280;
            }
            for (int var11 = 0; var11 < 64; var11++) {
                Statics.field267[var11 + 128] = var11 * 262144 + 65535;
            }
            for (int var12 = 0; var12 < 64; var12++) {
                Statics.field267[var12 + 192] = 16777215;
            }
            Statics.field252 = new int[256];
            for (int var13 = 0; var13 < 64; var13++) {
                Statics.field252[var13] = var13 * 4;
            }
            for (int var14 = 0; var14 < 64; var14++) {
                Statics.field252[var14 + 64] = var14 * 262144 + 255;
            }
            for (int var15 = 0; var15 < 64; var15++) {
                Statics.field252[var15 + 128] = var15 * 1024 + 16711935;
            }
            for (int var16 = 0; var16 < 64; var16++) {
                Statics.field252[var16 + 192] = 16777215;
            }
            Statics.field129 = new int[256];
            Statics.field499 = new int[32768];
            Statics.field3197 = new int[32768];
            Statics.method3272((class327) null);
            Statics.field1165 = new int[32768];
            Statics.field147 = new int[32768];
            if (arg2) {
                field1179 = "";
                field1180 = "";
            }
            Statics.field420 = 0;
            Statics.field1038 = "";
            field1183 = true;
            field1187 = false;
            if (Statics.field27.field1031) {
                class225.method3061(2);
            } else {
                class225.method3351(2, Statics.field2053, "scape main", "", 255, false);
            }
            if (Statics.field3275 != null) {
                try {
                    class190 var17 = new class190(4);
                    var17.method3439(3);
                    var17.method3441(0);
                    Statics.field3275.method3255(var17.field2420, 0, 4);
                } catch (IOException var21) {
                    try {
                        Statics.field3275.method3251();
                    } catch (Exception var20) {
                    }
                    class258.field3295++;
                    Statics.field3275 = null;
                }
            }
            Statics.field1150 = true;
            field1169 = (Statics.field75 - 765) / 2;
            field1157 = field1169 + 202;
            Statics.field1177 = field1157 + 180;
            Statics.field3309.method5688(field1169, 0);
            Statics.field1152.method5688(field1169 + 382, 0);
            Statics.field1190.method5635(field1169 + 382 - Statics.field1190.field3882 / 2, 18);
        } else if (arg3 == 4) {
            field1174 = 4;
        }
    }

    @ObfuscatedName("bn.s(ZZI)Llv;")
    public static class327 method1067(boolean arg0, boolean arg1) {
        return arg0 ? (arg1 ? Statics.field79 : Statics.field2535) : (arg1 ? Statics.field58 : Statics.field1155);
    }

    @ObfuscatedName("dx.g(I)V")
    public static void method2532() {
        if (field1179 != null && field1179.length() > 0) {
            return;
        }
        if (Statics.field27.field1028 == null) {
            client.field709 = false;
        } else {
            field1179 = Statics.field27.field1028;
            client.field709 = true;
        }
    }

    @ObfuscatedName("fa.p(Lkt;Lkt;Lkt;ZB)V")
    public static void method3375(class305 arg0, class305 arg1, class305 arg2, boolean arg3) {
        if (arg3) {
            field1169 = (Statics.field75 - 765) / 2;
            field1157 = field1169 + 202;
            Statics.field1177 = field1157 + 180;
        }
        if (field1187) {
            if (Statics.field358 == null) {
                Statics.field358 = class329.method3151(Statics.field3225, "sl_back", "");
            }
            if (Statics.field1991 == null) {
                Statics.field1991 = class329.method510(Statics.field3225, "sl_flags", "");
            }
            if (Statics.field1048 == null) {
                Statics.field1048 = class329.method510(Statics.field3225, "sl_arrows", "");
            }
            if (Statics.field1039 == null) {
                Statics.field1039 = class329.method510(Statics.field3225, "sl_stars", "");
            }
            if (Statics.field1879 == null) {
                Statics.field1879 = class329.method450(Statics.field3225, "leftarrow", "");
            }
            if (Statics.field926 == null) {
                Statics.field926 = class329.method450(Statics.field3225, "rightarrow", "");
            }
            class324.method5551(field1169, 23, 765, 480, 0);
            class324.method5620(field1169, 0, 125, 23, 12425273, 9135624);
            class324.method5620(field1169 + 125, 0, 640, 23, 5197647, 2697513);
            arg0.method5373(class246.field3126, field1169 + 62, 15, 0, -1);
            if (Statics.field1039 != null) {
                Statics.field1039[1].method5635(field1169 + 140, 1);
                arg1.method5319(class246.field3163, field1169 + 152, 10, 16777215, -1);
                Statics.field1039[0].method5635(field1169 + 140, 12);
                arg1.method5319(class246.field2895, field1169 + 152, 21, 16777215, -1);
            }
            if (Statics.field1048 != null) {
                int var4 = field1169 + 280;
                if (class72.field1019[0] == 0 && class72.field1017[0] == 0) {
                    Statics.field1048[2].method5635(var4, 4);
                } else {
                    Statics.field1048[0].method5635(var4, 4);
                }
                if (class72.field1019[0] == 0 && class72.field1017[0] == 1) {
                    Statics.field1048[3].method5635(var4 + 15, 4);
                } else {
                    Statics.field1048[1].method5635(var4 + 15, 4);
                }
                arg0.method5319(class246.field3017, var4 + 32, 17, 16777215, -1);
                int var5 = field1169 + 390;
                if (class72.field1019[0] == 1 && class72.field1017[0] == 0) {
                    Statics.field1048[2].method5635(var5, 4);
                } else {
                    Statics.field1048[0].method5635(var5, 4);
                }
                if (class72.field1019[0] == 1 && class72.field1017[0] == 1) {
                    Statics.field1048[3].method5635(var5 + 15, 4);
                } else {
                    Statics.field1048[1].method5635(var5 + 15, 4);
                }
                arg0.method5319(class246.field3166, var5 + 32, 17, 16777215, -1);
                int var6 = field1169 + 500;
                if (class72.field1019[0] == 2 && class72.field1017[0] == 0) {
                    Statics.field1048[2].method5635(var6, 4);
                } else {
                    Statics.field1048[0].method5635(var6, 4);
                }
                if (class72.field1019[0] == 2 && class72.field1017[0] == 1) {
                    Statics.field1048[3].method5635(var6 + 15, 4);
                } else {
                    Statics.field1048[1].method5635(var6 + 15, 4);
                }
                arg0.method5319(class246.field3167, var6 + 32, 17, 16777215, -1);
                int var7 = field1169 + 610;
                if (class72.field1019[0] == 3 && class72.field1017[0] == 0) {
                    Statics.field1048[2].method5635(var7, 4);
                } else {
                    Statics.field1048[0].method5635(var7, 4);
                }
                if (class72.field1019[0] == 3 && class72.field1017[0] == 1) {
                    Statics.field1048[3].method5635(var7 + 15, 4);
                } else {
                    Statics.field1048[1].method5635(var7 + 15, 4);
                }
                arg0.method5319(class246.field3168, var7 + 32, 17, 16777215, -1);
            }
            class324.method5551(field1169 + 708, 4, 50, 16, 0);
            arg1.method5373(class246.field3143, field1169 + 708 + 25, 16, 16777215, -1);
            field1188 = -1;
            if (Statics.field358 != null) {
                byte var8 = 88;
                byte var9 = 19;
                int var10 = 765 / (var8 + 1) - 1;
                int var11 = 480 / (var9 + 1);
                int var12;
                int var13;
                do {
                    var12 = var11;
                    var13 = var10;
                    if ((var10 - 1) * var11 >= class72.field1016) {
                        var10--;
                    }
                    if ((var11 - 1) * var10 >= class72.field1016) {
                        var11--;
                    }
                    if ((var11 - 1) * var10 >= class72.field1016) {
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
                int var18 = (class72.field1016 + var11 - 1) / var11;
                field1154 = var18 - var10;
                if (Statics.field1879 != null && field1153 > 0) {
                    Statics.field1879.method5635(8, Statics.field348 / 2 - Statics.field1879.field3880 / 2);
                }
                if (Statics.field926 != null && field1153 < field1154) {
                    Statics.field926.method5635(Statics.field75 - Statics.field926.field3882 - 8, Statics.field348 / 2 - Statics.field926.field3880 / 2);
                }
                int var19 = var17 + 23;
                int var20 = field1169 + var16;
                int var21 = 0;
                boolean var22 = false;
                int var23 = field1153;
                for (int var24 = var11 * var23; var24 < class72.field1016 && var23 - field1153 < var10; var24++) {
                    class72 var25 = Statics.field3859[var24];
                    boolean var26 = true;
                    String var27 = Integer.toString(var25.field1018);
                    if (var25.field1018 == -1) {
                        var27 = class246.field3169;
                        var26 = false;
                    } else if (var25.field1018 > 1980) {
                        var27 = class246.field3170;
                        var26 = false;
                    }
                    int var28 = 0;
                    byte var29;
                    if (var25.method1622()) {
                        if (var25.method1629()) {
                            var29 = 7;
                        } else {
                            var29 = 6;
                        }
                    } else if (var25.method1621()) {
                        var28 = 16711680;
                        if (var25.method1629()) {
                            var29 = 5;
                        } else {
                            var29 = 4;
                        }
                    } else if (var25.method1619()) {
                        if (var25.method1629()) {
                            var29 = 3;
                        } else {
                            var29 = 2;
                        }
                    } else if (var25.method1629()) {
                        var29 = 1;
                    } else {
                        var29 = 0;
                    }
                    if (class54.field488 >= var20 && class54.field489 >= var19 && class54.field488 < var8 + var20 && class54.field489 < var9 + var19 && var26) {
                        field1188 = var24;
                        Statics.field358[var29].method5690(var20, var19, 128, 16777215);
                        var22 = true;
                    } else {
                        Statics.field358[var29].method5688(var20, var19);
                    }
                    if (Statics.field1991 != null) {
                        Statics.field1991[(var25.method1629() ? 8 : 0) + var25.field1026].method5635(var20 + 29, var19);
                    }
                    arg0.method5373(Integer.toString(var25.field1021), var20 + 15, var9 / 2 + var19 + 5, var28, -1);
                    arg1.method5373(var27, var20 + 60, var9 / 2 + var19 + 5, 268435455, -1);
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
                    int var30 = arg1.method5314(Statics.field3859[field1188].field1025) + 6;
                    int var31 = arg1.field3780 + 8;
                    int var32 = class54.field489 + 25;
                    if (var31 + var32 > 480) {
                        var32 = class54.field489 - 25 - var31;
                    }
                    class324.method5551(class54.field488 - var30 / 2, var32, var30, var31, 16777120);
                    class324.method5555(class54.field488 - var30 / 2, var32, var30, var31, 0);
                    arg1.method5373(Statics.field3859[field1188].field1025, class54.field488, arg1.field3780 + var32 + 4, 0, -1);
                }
            }
            Statics.field1290.method755(0, 0);
            return;
        }
        if (arg3) {
            Statics.field3309.method5688(field1169, 0);
            Statics.field1152.method5688(field1169 + 382, 0);
            Statics.field1190.method5635(field1169 + 382 - Statics.field1190.field3882 / 2, 18);
        }
        if (client.field658 == 0 || client.field658 == 5) {
            byte var33 = 20;
            arg0.method5373(class246.field3061, field1157 + 180, 245 - var33, 16777215, -1);
            int var34 = 253 - var33;
            class324.method5555(field1157 + 180 - 152, var34, 304, 34, 9179409);
            class324.method5555(field1157 + 180 - 151, var34 + 1, 302, 32, 0);
            class324.method5551(field1157 + 180 - 150, var34 + 2, field1168 * 3, 30, 9179409);
            class324.method5551(field1168 * 3 + (field1157 + 180 - 150), var34 + 2, 300 - field1168 * 3, 30, 0);
            arg0.method5373(field1167, field1157 + 180, 276 - var33, 16777215, -1);
        }
        if (client.field658 == 20) {
            Statics.field1975.method5635(field1157 + 180 - Statics.field1975.field3882 / 2, 271 - Statics.field1975.field3880 / 2);
            short var35 = 201;
            arg0.method5373(field1189, field1157 + 180, var35, 16776960, 0);
            int var158 = var35 + 15;
            arg0.method5373(field1149, field1157 + 180, var158, 16776960, 0);
            int var159 = var158 + 15;
            arg0.method5373(field1178, field1157 + 180, var159, 16776960, 0);
            int var160 = var159 + 15;
            int var161 = var160 + 7;
            if (field1174 != 4) {
                arg0.method5319(class246.field3113, field1157 + 180 - 110, var161, 16777215, 0);
                short var36 = 200;
                String var37 = Statics.field27.field1034 ? class312.method4989(field1179) : field1179;
                String var38;
                for (var38 = var37; arg0.method5314(var38) > var36; var38 = var38.substring(0, var38.length() - 1)) {
                }
                arg0.method5319(class306.method5384(var38), field1157 + 180 - 70, var161, 16777215, 0);
                var158 = var161 + 15;
                arg0.method5319(class246.field3114 + class312.method4989(field1180), field1157 + 180 - 108, var158, 16777215, 0);
                var158 += 15;
            }
        }
        if (client.field658 == 10 || client.field658 == 11) {
            Statics.field1975.method5635(field1157, 171);
            if (field1174 == 0) {
                short var39 = 251;
                arg0.method5373(class246.field3116, field1157 + 180, var39, 16776960, 0);
                int var162 = var39 + 30;
                int var40 = field1157 + 180 - 80;
                short var41 = 291;
                Statics.field1176.method5635(var40 - 73, var41 - 20);
                arg0.method5358(class246.field2982, var40 - 73, var41 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                int var42 = field1157 + 180 + 80;
                Statics.field1176.method5635(var42 - 73, var41 - 20);
                arg0.method5358(class246.field2949, var42 - 73, var41 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field1174 == 1) {
                arg0.method5373(field1175, field1157 + 180, 201, 16776960, 0);
                short var43 = 236;
                arg0.method5373(field1189, field1157 + 180, var43, 16777215, 0);
                int var163 = var43 + 15;
                arg0.method5373(field1149, field1157 + 180, var163, 16777215, 0);
                int var164 = var163 + 15;
                arg0.method5373(field1178, field1157 + 180, var164, 16777215, 0);
                int var165 = var164 + 15;
                int var44 = field1157 + 180 - 80;
                short var45 = 321;
                Statics.field1176.method5635(var44 - 73, var45 - 20);
                arg0.method5373(class246.field2883, var44, var45 + 5, 16777215, 0);
                int var46 = field1157 + 180 + 80;
                Statics.field1176.method5635(var46 - 73, var45 - 20);
                arg0.method5373(class246.field3143, var46, var45 + 5, 16777215, 0);
            } else if (field1174 == 2) {
                short var47 = 201;
                arg0.method5373(field1189, Statics.field1177, var47, 16776960, 0);
                int var166 = var47 + 15;
                arg0.method5373(field1149, Statics.field1177, var166, 16776960, 0);
                int var167 = var166 + 15;
                arg0.method5373(field1178, Statics.field1177, var167, 16776960, 0);
                int var168 = var167 + 15;
                int var169 = var168 + 7;
                arg0.method5319(class246.field3113, Statics.field1177 - 110, var169, 16777215, 0);
                short var48 = 200;
                String var49 = Statics.field27.field1034 ? class312.method4989(field1179) : field1179;
                String var50;
                for (var50 = var49; arg0.method5314(var50) > var48; var50 = var50.substring(1)) {
                }
                arg0.method5319(class306.method5384(var50) + (field1163 == 0 & client.field660 % 40 < 20 ? class81.method1019(16776960) + class81.field1121 : ""), Statics.field1177 - 70, var169, 16777215, 0);
                var166 = var169 + 15;
                arg0.method5319(class246.field3114 + class312.method4989(field1180) + (field1163 == 1 & client.field660 % 40 < 20 ? class81.method1019(16776960) + class81.field1121 : ""), Statics.field1177 - 108, var166, 16777215, 0);
                var166 += 15;
                short var51 = 277;
                int var52 = Statics.field1177 + -117;
                class327 var53 = method1067(client.field709, field1181);
                var53.method5635(var52, var51);
                int var54 = var53.field3882 + 5 + var52;
                arg1.method5319(class246.field2915, var54, var51 + 13, 16776960, 0);
                int var55 = Statics.field1177 + 24;
                class327 var56 = method1067(Statics.field27.field1034, field1182);
                var56.method5635(var55, var51);
                int var57 = var56.field3882 + 5 + var55;
                arg1.method5319(class246.field3122, var57, var51 + 13, 16776960, 0);
                int var170 = var51 + 15;
                int var58 = Statics.field1177 - 80;
                short var59 = 321;
                Statics.field1176.method5635(var58 - 73, var59 - 20);
                arg0.method5373(class246.field3119, var58, var59 + 5, 16777215, 0);
                int var60 = Statics.field1177 + 80;
                Statics.field1176.method5635(var60 - 73, var59 - 20);
                arg0.method5373(class246.field3143, var60, var59 + 5, 16777215, 0);
                short var61 = 357;
                switch(field1173) {
                    case 2:
                        Statics.field554 = class246.field2958;
                        break;
                    default:
                        Statics.field554 = class246.field3127;
                }
                Statics.field552 = new class320(Statics.field1177, var61, arg1.method5314(Statics.field554), 11);
                arg1.method5373(Statics.field554, Statics.field1177, var61, 16777215, 0);
            } else if (field1174 == 3) {
                short var62 = 201;
                arg0.method5373(class246.field3123, field1157 + 180, var62, 16776960, 0);
                int var171 = var62 + 20;
                arg1.method5373(class246.field2926, field1157 + 180, var171, 16776960, 0);
                int var172 = var171 + 15;
                arg1.method5373(class246.field3087, field1157 + 180, var172, 16776960, 0);
                int var173 = var172 + 15;
                int var63 = field1157 + 180;
                short var64 = 276;
                Statics.field1176.method5635(var63 - 73, var64 - 20);
                arg2.method5373(class246.field3052, var63, var64 + 5, 16777215, 0);
                int var65 = field1157 + 180;
                short var66 = 326;
                Statics.field1176.method5635(var65 - 73, var66 - 20);
                arg2.method5373(class246.field3164, var65, var66 + 5, 16777215, 0);
            } else if (field1174 == 4) {
                arg0.method5373(class246.field3108, field1157 + 180, 201, 16776960, 0);
                short var67 = 236;
                arg0.method5373(field1189, field1157 + 180, var67, 16777215, 0);
                int var174 = var67 + 15;
                arg0.method5373(field1149, field1157 + 180, var174, 16777215, 0);
                int var175 = var174 + 15;
                arg0.method5373(field1178, field1157 + 180, var175, 16777215, 0);
                int var176 = var175 + 15;
                arg0.method5319(class246.field3115 + class312.method4989(Statics.field1038) + (client.field660 % 40 < 20 ? class81.method1019(16776960) + class81.field1121 : ""), field1157 + 180 - 108, var176, 16777215, 0);
                int var177 = var176 - 8;
                arg0.method5319(class246.field2886, field1157 + 180 - 9, var177, 16776960, 0);
                int var178 = var177 + 15;
                arg0.method5319(class246.field2887, field1157 + 180 - 9, var178, 16776960, 0);
                int var68 = field1157 + 180 - 9 + arg0.method5314(class246.field2887) + 15;
                int var69 = var178 - arg0.field3780;
                class327 var70;
                if (field1183) {
                    var70 = Statics.field2535;
                } else {
                    var70 = Statics.field1155;
                }
                var70.method5635(var68, var69);
                var174 = var178 + 15;
                int var71 = field1157 + 180 - 80;
                short var72 = 321;
                Statics.field1176.method5635(var71 - 73, var72 - 20);
                arg0.method5373(class246.field2883, var71, var72 + 5, 16777215, 0);
                int var73 = field1157 + 180 + 80;
                Statics.field1176.method5635(var73 - 73, var72 - 20);
                arg0.method5373(class246.field3143, var73, var72 + 5, 16777215, 0);
                arg1.method5373(class246.field3109, field1157 + 180, var72 + 36, 255, 0);
            } else if (field1174 == 5) {
                arg0.method5373(class246.field3128, field1157 + 180, 201, 16776960, 0);
                short var74 = 221;
                arg2.method5373(field1189, field1157 + 180, var74, 16776960, 0);
                int var179 = var74 + 15;
                arg2.method5373(field1149, field1157 + 180, var179, 16776960, 0);
                int var180 = var179 + 15;
                arg2.method5373(field1178, field1157 + 180, var180, 16776960, 0);
                int var181 = var180 + 15;
                int var182 = var181 + 14;
                arg0.method5319(class246.field3129, field1157 + 180 - 145, var182, 16777215, 0);
                short var75 = 174;
                String var76 = Statics.field27.field1034 ? class312.method4989(field1179) : field1179;
                String var77;
                for (var77 = var76; arg0.method5314(var77) > var75; var77 = var77.substring(1)) {
                }
                arg0.method5319(class306.method5384(var77) + (client.field660 % 40 < 20 ? class81.method1019(16776960) + class81.field1121 : ""), field1157 + 180 - 34, var182, 16777215, 0);
                var179 = var182 + 15;
                int var78 = field1157 + 180 - 80;
                short var79 = 321;
                Statics.field1176.method5635(var78 - 73, var79 - 20);
                arg0.method5373(class246.field3130, var78, var79 + 5, 16777215, 0);
                int var80 = field1157 + 180 + 80;
                Statics.field1176.method5635(var80 - 73, var79 - 20);
                arg0.method5373(class246.field3156, var80, var79 + 5, 16777215, 0);
            } else if (field1174 == 6) {
                short var81 = 201;
                arg0.method5373(field1189, field1157 + 180, var81, 16776960, 0);
                int var183 = var81 + 15;
                arg0.method5373(field1149, field1157 + 180, var183, 16776960, 0);
                int var184 = var183 + 15;
                arg0.method5373(field1178, field1157 + 180, var184, 16776960, 0);
                int var185 = var184 + 15;
                int var82 = field1157 + 180;
                short var83 = 321;
                Statics.field1176.method5635(var82 - 73, var83 - 20);
                arg0.method5373(class246.field3156, var82, var83 + 5, 16777215, 0);
            } else if (field1174 == 7) {
                short var84 = 216;
                arg0.method5373(class246.field3158, field1157 + 180, var84, 16776960, 0);
                int var186 = var84 + 15;
                arg2.method5373(class246.field2884, field1157 + 180, var186, 16776960, 0);
                int var187 = var186 + 15;
                arg2.method5373(class246.field3160, field1157 + 180, var187, 16776960, 0);
                int var188 = var187 + 15;
                int var85 = field1157 + 180 - 80;
                short var86 = 321;
                Statics.field1176.method5635(var85 - 73, var86 - 20);
                arg0.method5373(class246.field3077, var85, var86 + 5, 16777215, 0);
                int var87 = field1157 + 180 + 80;
                Statics.field1176.method5635(var87 - 73, var86 - 20);
                arg0.method5373(class246.field3156, var87, var86 + 5, 16777215, 0);
            } else if (field1174 == 8) {
                short var88 = 216;
                arg0.method5373(class246.field3015, field1157 + 180, var88, 16776960, 0);
                int var189 = var88 + 15;
                arg2.method5373(class246.field3016, field1157 + 180, var189, 16776960, 0);
                int var190 = var189 + 15;
                arg2.method5373(class246.field3057, field1157 + 180, var190, 16776960, 0);
                int var191 = var190 + 15;
                int var89 = field1157 + 180 - 80;
                short var90 = 321;
                Statics.field1176.method5635(var89 - 73, var90 - 20);
                arg0.method5373(class246.field3018, var89, var90 + 5, 16777215, 0);
                int var91 = field1157 + 180 + 80;
                Statics.field1176.method5635(var91 - 73, var90 - 20);
                arg0.method5373(class246.field3156, var91, var90 + 5, 16777215, 0);
            } else if (field1174 == 12) {
                short var92 = 201;
                String var93 = "";
                String var94 = "";
                String var95 = "";
                switch(field1171) {
                    case 0:
                        var93 = class246.field2931;
                        var94 = class246.field2932;
                        var95 = class246.field2968;
                        break;
                    case 1:
                        var93 = class246.field2925;
                        var94 = class246.field2971;
                        var95 = class246.field3080;
                        break;
                    default:
                        Statics.method3687(false);
                }
                arg0.method5373(var93, field1157 + 180, var92, 16776960, 0);
                int var192 = var92 + 15;
                arg2.method5373(var94, field1157 + 180, var192, 16776960, 0);
                int var193 = var192 + 15;
                arg2.method5373(var95, field1157 + 180, var193, 16776960, 0);
                int var194 = var193 + 15;
                int var96 = field1157 + 180;
                short var97 = 276;
                Statics.field1176.method5635(var96 - 73, var97 - 20);
                arg0.method5373(class246.field3051, var96, var97 + 5, 16777215, 0);
                int var98 = field1157 + 180;
                short var99 = 326;
                Statics.field1176.method5635(var98 - 73, var99 - 20);
                arg0.method5373(class246.field3156, var98, var99 + 5, 16777215, 0);
            }
        }
        if (field1166 > 0) {
            int var100 = field1166;
            short var101 = 256;
            field1164 += var100 * 128;
            if (field1164 > Statics.field499.length) {
                field1164 -= Statics.field499.length;
                int var102 = (int) (Math.random() * 12.0D);
                Statics.method3272(Statics.field1000[var102]);
            }
            int var103 = 0;
            int var104 = var100 * 128;
            int var105 = (var101 - var100) * 128;
            for (int var106 = 0; var106 < var105; var106++) {
                int var107 = Statics.field1165[var103 + var104] - Statics.field499[field1164 + var103 & Statics.field499.length - 1] * var100 / 6;
                if (var107 < 0) {
                    var107 = 0;
                }
                Statics.field1165[var103++] = var107;
            }
            for (int var108 = var101 - var100; var108 < var101; var108++) {
                int var109 = var108 * 128;
                for (int var110 = 0; var110 < 128; var110++) {
                    int var111 = (int) (Math.random() * 100.0D);
                    if (var111 < 50 && var110 > 10 && var110 < 118) {
                        Statics.field1165[var109 + var110] = 255;
                    } else {
                        Statics.field1165[var109 + var110] = 0;
                    }
                }
            }
            if (field1161 > 0) {
                field1161 -= var100 * 4;
            }
            if (field1162 > 0) {
                field1162 -= var100 * 4;
            }
            if (field1161 == 0 && field1162 == 0) {
                int var112 = (int) (Math.random() * (double) (2000 / var100));
                if (var112 == 0) {
                    field1161 = 1024;
                }
                if (var112 == 1) {
                    field1162 = 1024;
                }
            }
            for (int var113 = 0; var113 < var101 - var100; var113++) {
                field1160[var113] = field1160[var100 + var113];
            }
            for (int var114 = var101 - var100; var114 < var101; var114++) {
                field1160[var114] = (int) (Math.sin((double) field1151 / 14.0D) * 16.0D + Math.sin((double) field1151 / 15.0D) * 14.0D + Math.sin((double) field1151 / 16.0D) * 12.0D);
                field1151++;
            }
            field1184 += var100 * 1649114039;
            int var115 = ((client.field660 & 0x1) + var100) / 2;
            if (var115 > 0) {
                for (int var116 = 0; var116 < field1184 * 1210321596; var116++) {
                    int var117 = (int) (Math.random() * 124.0D) + 2;
                    int var118 = (int) (Math.random() * 128.0D) + 128;
                    Statics.field1165[(var118 << 7) + var117] = 192;
                }
                field1184 = 0;
                int var119 = 0;
                label574: while (true) {
                    if (var119 >= var101) {
                        int var123 = 0;
                        while (true) {
                            if (var123 >= 128) {
                                break label574;
                            }
                            int var124 = 0;
                            for (int var125 = -var115; var125 < var101; var125++) {
                                int var126 = var125 * 128;
                                if (var115 + var125 < var101) {
                                    var124 += Statics.field147[var115 * 128 + var123 + var126];
                                }
                                if (var125 - (var115 + 1) >= 0) {
                                    var124 -= Statics.field147[var123 + var126 - (var115 + 1) * 128];
                                }
                                if (var125 >= 0) {
                                    Statics.field1165[var123 + var126] = var124 / (var115 * 2 + 1);
                                }
                            }
                            var123++;
                        }
                    }
                    int var120 = 0;
                    int var121 = var119 * 128;
                    for (int var122 = -var115; var122 < 128; var122++) {
                        if (var115 + var122 < 128) {
                            var120 += Statics.field1165[var121 + var122 + var115];
                        }
                        if (var122 - (var115 + 1) >= 0) {
                            var120 -= Statics.field1165[var121 + var122 - (var115 + 1)];
                        }
                        if (var122 >= 0) {
                            Statics.field147[var121 + var122] = var120 / (var115 * 2 + 1);
                        }
                    }
                    var119++;
                }
            }
            field1166 = 0;
        }
        short var127 = 256;
        if (field1161 > 0) {
            for (int var128 = 0; var128 < 256; var128++) {
                if (field1161 > 768) {
                    Statics.field129[var128] = method185(Statics.field418[var128], Statics.field267[var128], 1024 - field1161);
                } else if (field1161 > 256) {
                    Statics.field129[var128] = Statics.field267[var128];
                } else {
                    Statics.field129[var128] = method185(Statics.field267[var128], Statics.field418[var128], 256 - field1161);
                }
            }
        } else if (field1162 > 0) {
            for (int var129 = 0; var129 < 256; var129++) {
                if (field1162 > 768) {
                    Statics.field129[var129] = method185(Statics.field418[var129], Statics.field252[var129], 1024 - field1162);
                } else if (field1162 > 256) {
                    Statics.field129[var129] = Statics.field252[var129];
                } else {
                    Statics.field129[var129] = method185(Statics.field252[var129], Statics.field418[var129], 256 - field1162);
                }
            }
        } else {
            for (int var130 = 0; var130 < 256; var130++) {
                Statics.field129[var130] = Statics.field418[var130];
            }
        }
        class324.method5543(field1169, 9, field1169 + 128, var127 + 7);
        Statics.field3309.method5688(field1169, 0);
        class324.method5542();
        int var131 = 0;
        int var132 = field1169 + Statics.field1290.field3869 * 9;
        for (int var133 = 1; var133 < var127 - 1; var133++) {
            int var134 = (var127 - var133) * field1160[var133] / var127;
            int var135 = var134 + 22;
            if (var135 < 0) {
                var135 = 0;
            }
            var131 += var135;
            for (int var136 = var135; var136 < 128; var136++) {
                int var137 = Statics.field1165[var131++];
                if (var137 == 0) {
                    var132++;
                } else {
                    int var139 = 256 - var137;
                    int var140 = Statics.field129[var137];
                    int var141 = Statics.field1290.field3871[var132];
                    Statics.field1290.field3871[var132++] = ((var140 & 0xFF00) * var137 + (var141 & 0xFF00) * var139 & 0xFF0000) + ((var140 & 0xFF00FF) * var137 + (var141 & 0xFF00FF) * var139 & 0xFF00FF00) >> 8;
                }
            }
            var132 += Statics.field1290.field3869 + var135 - 128;
        }
        class324.method5543(field1169 + 765 - 128, 9, field1169 + 765, var127 + 7);
        Statics.field1152.method5688(field1169 + 382, 0);
        class324.method5542();
        int var142 = 0;
        int var143 = field1169 + Statics.field1290.field3869 * 9 + 24 + 637;
        for (int var144 = 1; var144 < var127 - 1; var144++) {
            int var145 = (var127 - var144) * field1160[var144] / var127;
            int var146 = 103 - var145;
            int var147 = var143 + var145;
            for (int var148 = 0; var148 < var146; var148++) {
                int var149 = Statics.field1165[var142++];
                if (var149 == 0) {
                    var147++;
                } else {
                    int var151 = 256 - var149;
                    int var152 = Statics.field129[var149];
                    int var153 = Statics.field1290.field3871[var147];
                    Statics.field1290.field3871[var147++] = ((var152 & 0xFF00FF) * var149 + (var153 & 0xFF00FF) * var151 & 0xFF00FF00) + ((var152 & 0xFF00) * var149 + (var153 & 0xFF00) * var151 & 0xFF0000) >> 8;
                }
            }
            var142 += 128 - var146;
            var143 = Statics.field1290.field3869 - var146 - var145 + var147;
        }
        Statics.field1158[Statics.field27.field1031 ? 1 : 0].method5635(field1169 + 765 - 40, 463);
        if (client.field658 <= 5 || client.field655 != 0) {
            return;
        }
        if (Statics.field309 == null) {
            Statics.field309 = class329.method450(Statics.field3225, "sl_button", "");
            return;
        }
        int var154 = field1169 + 5;
        short var155 = 463;
        byte var156 = 100;
        byte var157 = 35;
        Statics.field309.method5635(var154, var155);
        arg0.method5373(class246.field2998 + " " + client.field650, var156 / 2 + var154, var157 / 2 + var155 - 2, 16777215, 0);
        if (Statics.field1024 == null) {
            arg1.method5373(class246.field3172, var156 / 2 + var154, var157 / 2 + var155 + 12, 16777215, 0);
        } else {
            arg1.method5373(class246.field3171, var156 / 2 + var154, var157 / 2 + var155 + 12, 16777215, 0);
        }
    }

    @ObfuscatedName("du.m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method2582(String arg0, String arg1, String arg2) {
        field1189 = arg0;
        field1149 = arg1;
        field1178 = arg2;
    }

    @ObfuscatedName("u.b(IIIB)I")
    public static final int method185(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) + ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) >> 8;
    }

    @ObfuscatedName("dw.n(Lbu;B)V")
    public static void method2660(class72 arg0) {
        if (arg0.method1629() != client.field653) {
            client.field653 = arg0.method1629();
            boolean var1 = arg0.method1629();
            if (Statics.field3508 != var1) {
                class276.method4765();
                Statics.field3508 = var1;
            }
        }
        Statics.field106 = arg0.field1020;
        client.field650 = arg0.field1021;
        client.field788 = arg0.field1022;
        Statics.field2055 = client.field652 == 0 ? 43594 : arg0.field1021 + 40000;
        Statics.field93 = client.field652 == 0 ? 443 : arg0.field1021 + 50000;
        Statics.field2100 = Statics.field2055;
    }

    @ObfuscatedName("by.e(I)V")
    public static void method1612() {
        if (class72.method375()) {
            field1187 = true;
            field1153 = 0;
            field1154 = 0;
        }
    }

    @ObfuscatedName("ae.r(I)V")
    public static void method541() {
        field1187 = false;
        Statics.field3309.method5688(field1169, 0);
        Statics.field1152.method5688(field1169 + 382, 0);
        Statics.field1190.method5635(field1169 + 382 - Statics.field1190.field3882 / 2, 18);
    }
}
