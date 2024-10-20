package deob;

import java.awt.Component;
import java.awt.Graphics;
import java.net.URL;

@ObfuscatedName("t")
public class class86 {

    @ObfuscatedName("t.f")
    public static int field1202 = 0;

    @ObfuscatedName("t.n")
    public static int field1205 = 0;

    @ObfuscatedName("t.k")
    public static int[] field1204 = new int[256];

    @ObfuscatedName("t.h")
    public static int field1203 = 0;

    @ObfuscatedName("t.q")
    public static int field1206 = 0;

    @ObfuscatedName("t.bm")
    public static int field1200 = -1;

    @ObfuscatedName("t.bg")
    public static int[] field1225 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("t.ba")
    public static int[] field1224 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("t.as")
    public static int field1215 = 0;

    @ObfuscatedName("t.ar")
    public static String field1226 = "";

    @ObfuscatedName("t.ax")
    public static int field1218 = 10;

    @ObfuscatedName("t.al")
    public static boolean field1214 = false;

    @ObfuscatedName("t.ai")
    public static String field1219 = "";

    @ObfuscatedName("t.aj")
    public static String field1208 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("t.ao")
    public static String field1210 = "";

    @ObfuscatedName("t.am")
    public static int field1217 = 0;

    @ObfuscatedName("t.an")
    public static String field1213 = "";

    @ObfuscatedName("t.ac")
    public static int field1201 = 0;

    @ObfuscatedName("t.aa")
    public static String field1212 = "";

    @ObfuscatedName("t.ag")
    public static int field1197 = 0;

    @ObfuscatedName("t.ah")
    public static int field1211 = 0;

    @ObfuscatedName("t.ae")
    public static String field1216 = "";

    public class86() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dp.v(Lel;Lel;B)I")
    public static int method869(class87 arg0, class87 arg1) {
        int var2 = 0;
        if (arg0.method1318("title.jpg", "")) {
            var2++;
        }
        if (arg1.method1318("logo", "")) {
            var2++;
        }
        if (arg1.method1318("titlebox", "")) {
            var2++;
        }
        if (arg1.method1318("titlebutton", "")) {
            var2++;
        }
        if (arg1.method1318("runes", "")) {
            var2++;
        }
        if (arg1.method1318("title_mute", "")) {
            var2++;
        }
        arg1.method1318("sl_back", "");
        arg1.method1318("sl_flags", "");
        arg1.method1318("sl_arrows", "");
        arg1.method1318("sl_stars", "");
        arg1.method1318("sl_button", "");
        return var2;
    }

    @ObfuscatedName("g.m(Lgx;Lgx;B)V")
    public static void method917(class23 arg0, class23 arg1) {
        if (field1214) {
            if (Statics.field1821 == null) {
                Statics.field1821 = class141.method3232(Statics.field417, "sl_back", "");
            }
            if (Statics.field1875 == null) {
                Statics.field1875 = class141.method2164(Statics.field417, "sl_flags", "");
            }
            if (Statics.field1 == null) {
                Statics.field1 = class141.method2164(Statics.field417, "sl_arrows", "");
            }
            if (Statics.field1221 == null) {
                Statics.field1221 = class141.method2164(Statics.field417, "sl_stars", "");
            }
            class106.method1537(0, 23, 765, 480, 0);
            class106.method1528(0, 0, 125, 23, 12425273, 9135624);
            class106.method1528(125, 0, 640, 23, 5197647, 2697513);
            arg0.method223(class57.field780, 62, 15, 0, -1);
            if (Statics.field1221 != null) {
                Statics.field1221[1].method2640(140, 1);
                arg1.method221(class57.field861, 152, 10, 16777215, -1);
                Statics.field1221[0].method2640(140, 12);
                arg1.method221(class57.field791, 152, 21, 16777215, -1);
            }
            if (Statics.field1 != null) {
                short var2 = 280;
                if (field1224[0] == 0 && field1225[0] == 0) {
                    Statics.field1[2].method2640(var2, 4);
                } else {
                    Statics.field1[0].method2640(var2, 4);
                }
                if (field1224[0] == 0 && field1225[0] == 1) {
                    Statics.field1[3].method2640(var2 + 15, 4);
                } else {
                    Statics.field1[1].method2640(var2 + 15, 4);
                }
                arg0.method221(class57.field848, var2 + 32, 17, 16777215, -1);
                short var3 = 390;
                if (field1224[0] == 1 && field1225[0] == 0) {
                    Statics.field1[2].method2640(var3, 4);
                } else {
                    Statics.field1[0].method2640(var3, 4);
                }
                if (field1224[0] == 1 && field1225[0] == 1) {
                    Statics.field1[3].method2640(var3 + 15, 4);
                } else {
                    Statics.field1[1].method2640(var3 + 15, 4);
                }
                arg0.method221(class57.field864, var3 + 32, 17, 16777215, -1);
                short var4 = 500;
                if (field1224[0] == 2 && field1225[0] == 0) {
                    Statics.field1[2].method2640(var4, 4);
                } else {
                    Statics.field1[0].method2640(var4, 4);
                }
                if (field1224[0] == 2 && field1225[0] == 1) {
                    Statics.field1[3].method2640(var4 + 15, 4);
                } else {
                    Statics.field1[1].method2640(var4 + 15, 4);
                }
                arg0.method221(class57.field723, var4 + 32, 17, 16777215, -1);
                short var5 = 610;
                if (field1224[0] == 3 && field1225[0] == 0) {
                    Statics.field1[2].method2640(var5, 4);
                } else {
                    Statics.field1[0].method2640(var5, 4);
                }
                if (field1224[0] == 3 && field1225[0] == 1) {
                    Statics.field1[3].method2640(var5 + 15, 4);
                } else {
                    Statics.field1[1].method2640(var5 + 15, 4);
                }
                arg0.method221(class57.field691, var5 + 32, 17, 16777215, -1);
            }
            class106.method1537(708, 4, 50, 16, 0);
            arg1.method223(class57.field854, 733, 16, 16777215, -1);
            field1200 = -1;
            if (Statics.field1821 != null) {
                byte var6 = 88;
                byte var7 = 19;
                int var8 = 765 / (var6 + 1);
                int var9 = 480 / (var7 + 1);
                int var10;
                int var11;
                do {
                    var10 = var9;
                    var11 = var8;
                    if ((var8 - 1) * var9 >= field1197) {
                        var8--;
                    }
                    if ((var9 - 1) * var8 >= field1197) {
                        var9--;
                    }
                    if ((var9 - 1) * var8 >= field1197) {
                        var9--;
                    }
                } while (var9 != var10 || var8 != var11);
                int var12 = (765 - var6 * var8) / (var8 + 1);
                if (var12 > 5) {
                    var12 = 5;
                }
                int var13 = (480 - var7 * var9) / (var9 + 1);
                if (var13 > 5) {
                    var13 = 5;
                }
                int var14 = (765 - var6 * var8 - (var8 - 1) * var12) / 2;
                int var15 = (480 - var7 * var9 - (var9 - 1) * var13) / 2;
                int var16 = var15 + 23;
                int var17 = var14;
                int var18 = 0;
                boolean var19 = false;
                for (int var20 = 0; var20 < field1197; var20++) {
                    class84 var21 = Statics.field1223[var20];
                    boolean var22 = true;
                    String var23 = Integer.toString(var21.field1175);
                    if (var21.field1175 == -1) {
                        var23 = class57.field867;
                        var22 = false;
                    } else if (var21.field1175 > 1980) {
                        var23 = class57.field868;
                        var22 = false;
                    }
                    byte var24;
                    if (var21.field1178) {
                        if (var21.field1180) {
                            var24 = 3;
                        } else {
                            var24 = 2;
                        }
                    } else if (var21.field1180) {
                        var24 = 1;
                    } else {
                        var24 = 0;
                    }
                    if (class116.field1810 >= var17 && class116.field1816 >= var16 && class116.field1810 < var6 + var17 && class116.field1816 < var7 + var16 && var22) {
                        field1200 = var20;
                        Statics.field1821[var24].method2493(var17, var16, 128, 16777215);
                        var19 = true;
                    } else {
                        Statics.field1821[var24].method2530(var17, var16);
                    }
                    if (Statics.field1875 != null) {
                        Statics.field1875[var21.field1182 + (var21.field1180 ? 8 : 0)].method2640(var17 + 29, var16);
                    }
                    arg0.method223(Integer.toString(var21.field1181), var17 + 15, var7 / 2 + var16 + 5, 0, -1);
                    arg1.method223(var23, var17 + 60, var7 / 2 + var16 + 5, 268435455, -1);
                    var16 += var7 + var13;
                    var18++;
                    if (var18 >= var9) {
                        var16 = var15 + 23;
                        var17 += var6 + var12;
                        var18 = 0;
                    }
                }
                if (var19) {
                    int var25 = arg1.method216(Statics.field1223[field1200].field1177) + 6;
                    int var26 = arg1.field253 + 8;
                    class106.method1537(class116.field1810 - var25 / 2, class116.field1816 + 20 + 5, var25, var26, 16777120);
                    class106.method1539(class116.field1810 - var25 / 2, class116.field1816 + 20 + 5, var25, var26, 0);
                    arg1.method223(Statics.field1223[field1200].field1177, class116.field1810, class116.field1816 + 20 + 5 + arg1.field253 + 4, 0, -1);
                }
            }
            try {
                Graphics var27 = Statics.field1009.getGraphics();
                Statics.field1059.method2597(var27, 0, 0);
            } catch (Exception var88) {
                Statics.field1009.repaint();
            }
            return;
        }
        if (client.field1466 == 0 || client.field1466 == 5) {
            byte var29 = 20;
            arg0.method223(class57.field664, 382, 245 - var29, 16777215, -1);
            int var30 = 253 - var29;
            class106.method1539(230, var30, 304, 34, 9179409);
            class106.method1539(231, var30 + 1, 302, 32, 0);
            class106.method1537(232, var30 + 2, field1218 * 3, 30, 9179409);
            class106.method1537(field1218 * 3 + 232, var30 + 2, 300 - field1218 * 3, 30, 0);
            arg0.method223(field1210, 382, 276 - var29, 16777215, -1);
        }
        if (client.field1466 == 20) {
            Statics.field1271.method2640(382 - Statics.field1271.field2231 / 2, 271 - Statics.field1271.field2227 / 2);
            short var31 = 211;
            arg0.method223(field1212, 382, var31, 16776960, 0);
            int var90 = var31 + 15;
            arg0.method223(field1213, 382, var90, 16776960, 0);
            int var91 = var90 + 15;
            arg0.method223(field1226, 382, var91, 16776960, 0);
            int var92 = var91 + 15;
            int var93 = var92 + 10;
            arg0.method221(class57.field733, 272, var93, 16777215, 0);
            short var32 = 200;
            String var33;
            for (var33 = field1219; arg0.method216(var33) > var32; var33 = var33.substring(0, var33.length() - 1)) {
            }
            arg0.method221(class25.method220(var33), 312, var93, 16777215, 0);
            var90 = var93 + 15;
            String var35 = class57.field849;
            String var36 = field1216;
            String var37 = class97.method2635('*', var36.length());
            arg0.method221(var35 + var37, 274, var90, 16777215, 0);
            var90 += 15;
        }
        if (client.field1466 == 10) {
            Statics.field1271.method2640(202, 171);
            if (field1211 == 0) {
                short var38 = 251;
                arg0.method223(class57.field640, 382, var38, 16776960, 0);
                int var94 = var38 + 30;
                short var39 = 302;
                short var40 = 291;
                Statics.field1196.method2640(var39 - 73, var40 - 20);
                arg0.method224(class57.field851, var39 - 73, var40 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                short var41 = 462;
                Statics.field1196.method2640(var41 - 73, var40 - 20);
                arg0.method224(class57.field852, var41 - 73, var40 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field1211 == 2) {
                short var42 = 211;
                arg0.method223(field1212, 382, var42, 16776960, 0);
                int var95 = var42 + 15;
                arg0.method223(field1213, 382, var95, 16776960, 0);
                int var96 = var95 + 15;
                arg0.method223(field1226, 382, var96, 16776960, 0);
                int var97 = var96 + 15;
                int var98 = var97 + 10;
                arg0.method221(class57.field733, 272, var98, 16777215, 0);
                short var43 = 200;
                String var44;
                for (var44 = field1219; arg0.method216(var44) > var43; var44 = var44.substring(1)) {
                }
                arg0.method221(class25.method220(var44) + (field1217 == 0 & client.field1468 % 40 < 20 ? class62.method1489(16776960) + class62.field923 : ""), 312, var98, 16777215, 0);
                var95 = var98 + 15;
                String var46 = class57.field849;
                String var47 = field1216;
                String var48 = class97.method2635('*', var47.length());
                arg0.method221(var46 + var48 + (field1217 == 1 & client.field1468 % 40 < 20 ? class62.method1489(16776960) + class62.field923 : ""), 274, var95, 16777215, 0);
                var95 += 15;
                short var49 = 302;
                short var50 = 321;
                Statics.field1196.method2640(var49 - 73, var50 - 20);
                arg0.method223(class57.field756, var49, var50 + 5, 16777215, 0);
                short var51 = 462;
                Statics.field1196.method2640(var51 - 73, var50 - 20);
                arg0.method223(class57.field854, var51, var50 + 5, 16777215, 0);
            } else if (field1211 == 3) {
                arg0.method223(class57.field855, 382, 211, 16776960, 0);
                short var52 = 236;
                arg0.method223(class57.field856, 382, var52, 16777215, 0);
                int var99 = var52 + 15;
                arg0.method223(class57.field857, 382, var99, 16777215, 0);
                int var100 = var99 + 15;
                arg0.method223(class57.field858, 382, var100, 16777215, 0);
                int var101 = var100 + 15;
                arg0.method223(class57.field651, 382, var101, 16777215, 0);
                int var102 = var101 + 15;
                short var53 = 382;
                short var54 = 321;
                Statics.field1196.method2640(var53 - 73, var54 - 20);
                arg0.method223(class57.field854, var53, var54 + 5, 16777215, 0);
            }
        }
        if (field1215 > 0) {
            int var55 = field1215;
            short var56 = 256;
            field1205 += var55 * 128;
            if (field1205 > Statics.field988.length) {
                field1205 -= Statics.field988.length;
                int var57 = (int) (Math.random() * 12.0D);
                method2276(Statics.field2195[var57]);
            }
            int var58 = 0;
            int var59 = var55 * 128;
            int var60 = (var56 - var55) * 128;
            for (int var61 = 0; var61 < var60; var61++) {
                int var62 = Statics.field1322[var58 + var59] - Statics.field988[field1205 + var58 & Statics.field988.length - 1] * var55 / 6;
                if (var62 < 0) {
                    var62 = 0;
                }
                Statics.field1322[var58++] = var62;
            }
            for (int var63 = var56 - var55; var63 < var56; var63++) {
                int var64 = var63 * 128;
                for (int var65 = 0; var65 < 128; var65++) {
                    int var66 = (int) (Math.random() * 100.0D);
                    if (var66 < 50 && var65 > 10 && var65 < 118) {
                        Statics.field1322[var64 + var65] = 255;
                    } else {
                        Statics.field1322[var64 + var65] = 0;
                    }
                }
            }
            if (field1202 > 0) {
                field1202 -= var55 * 4;
            }
            if (field1203 > 0) {
                field1203 -= var55 * 4;
            }
            if (field1202 == 0 && field1203 == 0) {
                int var67 = (int) (Math.random() * (double) (2000 / var55));
                if (var67 == 0) {
                    field1202 = 1024;
                }
                if (var67 == 1) {
                    field1203 = 1024;
                }
            }
            for (int var68 = 0; var68 < var56 - var55; var68++) {
                field1204[var68] = field1204[var55 + var68];
            }
            for (int var69 = var56 - var55; var69 < var56; var69++) {
                field1204[var69] = (int) (Math.sin((double) field1201 / 14.0D) * 16.0D + Math.sin((double) field1201 / 15.0D) * 14.0D + Math.sin((double) field1201 / 16.0D) * 12.0D);
                field1201++;
            }
            field1206 += var55 * 1649941529;
            int var70 = ((client.field1468 & 0x1) + var55) / 2;
            if (var70 > 0) {
                for (int var71 = 0; var71 < field1206 * 932057092; var71++) {
                    int var72 = (int) (Math.random() * 124.0D) + 2;
                    int var73 = (int) (Math.random() * 128.0D) + 128;
                    Statics.field1322[(var73 << 7) + var72] = 192;
                }
                field1206 = 0;
                int var74 = 0;
                label387: while (true) {
                    if (var74 >= var56) {
                        int var78 = 0;
                        while (true) {
                            if (var78 >= 128) {
                                break label387;
                            }
                            int var79 = 0;
                            for (int var80 = -var70; var80 < var56; var80++) {
                                int var81 = var80 * 128;
                                if (var70 + var80 < var56) {
                                    var79 += Statics.field1420[var70 * 128 + var78 + var81];
                                }
                                if (var80 - (var70 + 1) >= 0) {
                                    var79 -= Statics.field1420[var78 + var81 - (var70 + 1) * 128];
                                }
                                if (var80 >= 0) {
                                    Statics.field1322[var78 + var81] = var79 / (var70 * 2 + 1);
                                }
                            }
                            var78++;
                        }
                    }
                    int var75 = 0;
                    int var76 = var74 * 128;
                    for (int var77 = -var70; var77 < 128; var77++) {
                        if (var70 + var77 < 128) {
                            var75 += Statics.field1322[var76 + var77 + var70];
                        }
                        if (var77 - (var70 + 1) >= 0) {
                            var75 -= Statics.field1322[var76 + var77 - (var70 + 1)];
                        }
                        if (var77 >= 0) {
                            Statics.field1420[var76 + var77] = var75 / (var70 * 2 + 1);
                        }
                    }
                    var74++;
                }
            }
            field1215 = 0;
        }
        method3231();
        Statics.field552[Statics.field1861.field969 ? 1 : 0].method2640(725, 463);
        if (client.field1466 > 5 && client.field1465 == 0) {
            if (Statics.field1916 == null) {
                Statics.field1916 = class141.method1397(Statics.field417, "sl_button", "");
            } else {
                byte var82 = 5;
                short var83 = 463;
                byte var84 = 100;
                byte var85 = 35;
                Statics.field1916.method2640(var82, var83);
                arg0.method223(class57.field796 + " " + client.field1537, var84 / 2 + var82, var85 / 2 + var83 - 2, 16777215, 0);
                if (Statics.field1220 == null) {
                    arg1.method223(class57.field870, var84 / 2 + var82, var85 / 2 + var83 + 12, 16777215, 0);
                } else {
                    arg1.method223(class57.field869, var84 / 2 + var82, var85 / 2 + var83 + 12, 16777215, 0);
                }
            }
        }
        try {
            Graphics var86 = Statics.field1009.getGraphics();
            Statics.field1059.method2597(var86, 0, 0);
        } catch (Exception var89) {
            Statics.field1009.repaint();
        }
    }

    @ObfuscatedName("c.b(Ljava/awt/Component;Lel;Lel;B)V")
    public static void method958(Component arg0, class87 arg1, class87 arg2) {
        if (Statics.field1198) {
            return;
        }
        class106.method1584();
        byte[] var3 = arg1.method1312("title.jpg", "");
        Statics.field1374 = new class140(var3, arg0);
        Statics.field1222 = Statics.field1374.method2547();
        Statics.field73 = class141.method1397(arg2, "logo", "");
        Statics.field1271 = class141.method1397(arg2, "titlebox", "");
        Statics.field1196 = class141.method1397(arg2, "titlebutton", "");
        Statics.field2195 = class141.method2164(arg2, "runes", "");
        Statics.field552 = class141.method2164(arg2, "title_mute", "");
        Statics.field1873 = new int[256];
        for (int var4 = 0; var4 < 64; var4++) {
            Statics.field1873[var4] = var4 * 262144;
        }
        for (int var5 = 0; var5 < 64; var5++) {
            Statics.field1873[var5 + 64] = var5 * 1024 + 16711680;
        }
        for (int var6 = 0; var6 < 64; var6++) {
            Statics.field1873[var6 + 128] = var6 * 4 + 16776960;
        }
        for (int var7 = 0; var7 < 64; var7++) {
            Statics.field1873[var7 + 192] = 16777215;
        }
        Statics.field2156 = new int[256];
        for (int var8 = 0; var8 < 64; var8++) {
            Statics.field2156[var8] = var8 * 1024;
        }
        for (int var9 = 0; var9 < 64; var9++) {
            Statics.field2156[var9 + 64] = var9 * 4 + 65280;
        }
        for (int var10 = 0; var10 < 64; var10++) {
            Statics.field2156[var10 + 128] = var10 * 262144 + 65535;
        }
        for (int var11 = 0; var11 < 64; var11++) {
            Statics.field2156[var11 + 192] = 16777215;
        }
        Statics.field1229 = new int[256];
        for (int var12 = 0; var12 < 64; var12++) {
            Statics.field1229[var12] = var12 * 4;
        }
        for (int var13 = 0; var13 < 64; var13++) {
            Statics.field1229[var13 + 64] = var13 * 262144 + 255;
        }
        for (int var14 = 0; var14 < 64; var14++) {
            Statics.field1229[var14 + 128] = var14 * 1024 + 16711935;
        }
        for (int var15 = 0; var15 < 64; var15++) {
            Statics.field1229[var15 + 192] = 16777215;
        }
        Statics.field985 = new int[256];
        Statics.field988 = new int[32768];
        Statics.field1195 = new int[32768];
        method2276((class149) null);
        Statics.field1322 = new int[32768];
        Statics.field1420 = new int[32768];
        field1211 = 0;
        field1219 = "";
        field1216 = "";
        field1214 = false;
        if (Statics.field1861.field969) {
            class101.method2166(2);
        } else {
            class83 var16 = Statics.field888;
            int var17 = var16.method1310("scape main");
            int var18 = var16.method1311(var17, "");
            class101.field1381 = 1;
            Statics.field1384 = var16;
            Statics.field1385 = var17;
            Statics.field1394 = var18;
            Statics.field1801 = 255;
            Statics.field2356 = false;
            Statics.field1388 = 2;
        }
        class105.method1088(false);
        Statics.field1198 = true;
        Statics.field1374.method2530(0, 0);
        Statics.field1222.method2530(382, 0);
        Statics.field73.method2640(382 - Statics.field73.field2231 / 2, 18);
    }

    @ObfuscatedName("y.z(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method1490(String arg0, String arg1, String arg2) {
        field1212 = arg0;
        field1213 = arg1;
        field1226 = arg2;
    }

    @ObfuscatedName("bb.y(IIB)V")
    public static void method2219(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field1224[var5] != arg0) {
                var2[var4] = field1224[var5];
                var3[var4] = field1225[var5];
                var4++;
            }
        }
        field1224 = var2;
        field1225 = var3;
        method2278(Statics.field1223, 0, Statics.field1223.length - 1, field1224, field1225);
    }

    @ObfuscatedName("bc.i(Lbr;I)V")
    public static void method2252(class114 arg0) {
        if (!field1214) {
            if (class116.field1815 == 1 && class116.field1817 >= 715 && class116.field1805 >= 453) {
                Statics.field1861.field969 = !Statics.field1861.field969;
                class65.method1090();
                if (Statics.field1861.field969) {
                    Statics.field1383.method587();
                    class101.field1381 = 1;
                    Statics.field1384 = null;
                } else {
                    class101.method1399(Statics.field888, "scape main", "", 255, false);
                }
            }
            if (client.field1466 != 5) {
                field1215++;
                if (client.field1466 == 10) {
                    if (client.field1465 == 0) {
                        if (class116.field1815 == 1) {
                            byte var7 = 5;
                            short var8 = 463;
                            byte var9 = 100;
                            byte var10 = 35;
                            if (class116.field1817 >= var7 && class116.field1817 <= var7 + var9 && class116.field1805 >= var8 && class116.field1805 <= var8 + var10) {
                                method3138();
                                return;
                            }
                        }
                        if (Statics.field1220 != null) {
                            method3138();
                        }
                    }
                    int var11 = class116.field1815;
                    int var12 = class116.field1817;
                    int var13 = class116.field1805;
                    if (field1211 == 0) {
                        short var14 = 302;
                        short var15 = 291;
                        if (var11 == 1 && var12 >= var14 - 75 && var12 <= var14 + 75 && var13 >= var15 - 20 && var13 <= var15 + 20) {
                            field1211 = 3;
                            field1217 = 0;
                        }
                        short var16 = 462;
                        if (var11 == 1 && var12 >= var16 - 75 && var12 <= var16 + 75 && var13 >= var15 - 20 && var13 <= var15 + 20) {
                            field1212 = class57.field842;
                            field1213 = class57.field843;
                            field1226 = class57.field687;
                            field1211 = 2;
                            field1217 = 0;
                        }
                    } else if (field1211 == 2) {
                        short var17 = 231;
                        int var25 = var17 + 30;
                        if (var11 == 1 && var13 >= var25 - 15 && var13 < var25) {
                            field1217 = 0;
                        }
                        var25 += 15;
                        if (var11 == 1 && var13 >= var25 - 15 && var13 < var25) {
                            field1217 = 1;
                        }
                        var25 += 15;
                        short var18 = 302;
                        short var19 = 321;
                        if (var11 == 1 && var12 >= var18 - 75 && var12 <= var18 + 75 && var13 >= var19 - 20 && var13 <= var19 + 20) {
                            field1219 = field1219.trim();
                            if (field1219.length() == 0) {
                                method1490(class57.field752, class57.field753, class57.field754);
                                return;
                            }
                            if (field1216.length() == 0) {
                                method1490(class57.field788, class57.field675, class57.field770);
                                return;
                            }
                            method1490(class57.field845, class57.field682, class57.field847);
                            client.method1179(20);
                            return;
                        }
                        short var20 = 462;
                        if (var11 == 1 && var12 >= var20 - 75 && var12 <= var20 + 75 && var13 >= var19 - 20 && var13 <= var19 + 20) {
                            field1211 = 0;
                            field1219 = "";
                            field1216 = "";
                        }
                        while (true) {
                            while (class132.method1398()) {
                                boolean var21 = false;
                                for (int var22 = 0; var22 < field1208.length(); var22++) {
                                    if (Statics.field2557 == field1208.charAt(var22)) {
                                        var21 = true;
                                        break;
                                    }
                                }
                                if (field1217 == 0) {
                                    if (Statics.field2655 == 85 && field1219.length() > 0) {
                                        field1219 = field1219.substring(0, field1219.length() - 1);
                                    }
                                    if (Statics.field2655 == 84 || Statics.field2655 == 80) {
                                        field1217 = 1;
                                    }
                                    if (var21 && field1219.length() < 320) {
                                        field1219 = field1219 + Statics.field2557;
                                    }
                                } else if (field1217 == 1) {
                                    if (Statics.field2655 == 85 && field1216.length() > 0) {
                                        field1216 = field1216.substring(0, field1216.length() - 1);
                                    }
                                    if (Statics.field2655 == 84 || Statics.field2655 == 80) {
                                        field1217 = 0;
                                    }
                                    if (Statics.field2655 == 84) {
                                        field1219 = field1219.trim();
                                        if (field1219.length() == 0) {
                                            method1490(class57.field752, class57.field753, class57.field754);
                                            return;
                                        }
                                        if (field1216.length() == 0) {
                                            method1490(class57.field788, class57.field675, class57.field770);
                                            return;
                                        }
                                        method1490(class57.field845, class57.field682, class57.field847);
                                        client.method1179(20);
                                        return;
                                    }
                                    if (var21 && field1216.length() < 20) {
                                        field1216 = field1216 + Statics.field2557;
                                    }
                                }
                            }
                            return;
                        }
                    } else if (field1211 == 3) {
                        short var23 = 382;
                        short var24 = 321;
                        if (var11 == 1 && var12 >= var23 - 75 && var12 <= var23 + 75 && var13 >= var24 - 20 && var13 <= var24 + 20) {
                            field1211 = 0;
                        }
                    }
                }
            }
        } else if (class116.field1815 == 1) {
            short var1 = 280;
            if (class116.field1817 >= var1 && class116.field1817 <= var1 + 14 && class116.field1805 >= 4 && class116.field1805 <= 18) {
                method2219(0, 0);
            } else if (class116.field1817 >= var1 + 15 && class116.field1817 <= var1 + 80 && class116.field1805 >= 4 && class116.field1805 <= 18) {
                method2219(0, 1);
            } else {
                short var2 = 390;
                if (class116.field1817 >= var2 && class116.field1817 <= var2 + 14 && class116.field1805 >= 4 && class116.field1805 <= 18) {
                    method2219(1, 0);
                } else if (class116.field1817 >= var2 + 15 && class116.field1817 <= var2 + 80 && class116.field1805 >= 4 && class116.field1805 <= 18) {
                    method2219(1, 1);
                } else {
                    short var3 = 500;
                    if (class116.field1817 >= var3 && class116.field1817 <= var3 + 14 && class116.field1805 >= 4 && class116.field1805 <= 18) {
                        method2219(2, 0);
                    } else if (class116.field1817 >= var3 + 15 && class116.field1817 <= var3 + 80 && class116.field1805 >= 4 && class116.field1805 <= 18) {
                        method2219(2, 1);
                    } else {
                        short var4 = 610;
                        if (class116.field1817 >= var4 && class116.field1817 <= var4 + 14 && class116.field1805 >= 4 && class116.field1805 <= 18) {
                            method2219(3, 0);
                        } else if (class116.field1817 >= var4 + 15 && class116.field1817 <= var4 + 80 && class116.field1805 >= 4 && class116.field1805 <= 18) {
                            method2219(3, 1);
                        } else if (class116.field1817 >= 708 && class116.field1805 >= 4 && class116.field1817 <= 758 && class116.field1805 <= 20) {
                            field1214 = false;
                            Statics.field1374.method2530(0, 0);
                            Statics.field1222.method2530(382, 0);
                            Statics.field73.method2640(382 - Statics.field73.field2231 / 2, 18);
                        } else if (field1200 != -1) {
                            class84 var5 = Statics.field1223[field1200];
                            if (client.field1463 != var5.field1180) {
                                client.field1463 = var5.field1180;
                                boolean var6 = var5.field1180;
                                if (Statics.field2602 != var6) {
                                    class172.method1218();
                                    Statics.field2602 = var6;
                                }
                            }
                            Statics.field2585 = var5.field1176;
                            client.field1537 = var5.field1181;
                            Statics.field406 = client.field1461 == 0 ? 43594 : var5.field1181 + 40000;
                            Statics.field635 = client.field1461 == 0 ? 443 : var5.field1181 + 50000;
                            Statics.field1242 = Statics.field406;
                            field1214 = false;
                            Statics.field1374.method2530(0, 0);
                            Statics.field1222.method2530(382, 0);
                            Statics.field73.method2640(382 - Statics.field73.field2231 / 2, 18);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("db.x(Lcn;I)V")
    public static final void method2276(class149 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < Statics.field988.length; var2++) {
            Statics.field988[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            Statics.field988[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    Statics.field1195[var8] = (Statics.field988[var8 - 1] + Statics.field988[var8 + 1] + Statics.field988[var8 - 128] + Statics.field988[var8 + 128]) / 4;
                }
            }
            int[] var9 = Statics.field988;
            Statics.field988 = Statics.field1195;
            Statics.field1195 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field2227; var11++) {
            for (int var12 = 0; var12 < arg0.field2231; var12++) {
                if (arg0.field2226[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field2228;
                    int var14 = var11 + 16 + arg0.field2229;
                    int var15 = (var14 << 7) + var13;
                    Statics.field988[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("db.a([Lu;II[I[II)V")
    public static void method2278(class84[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        if (arg1 >= arg2) {
            return;
        }
        int var5 = arg1 - 1;
        int var6 = arg2 + 1;
        int var7 = (arg1 + arg2) / 2;
        class84 var8 = arg0[var7];
        arg0[var7] = arg0[arg1];
        arg0[arg1] = var8;
        while (var5 < var6) {
            boolean var9 = true;
            do {
                var6--;
                for (int var10 = 0; var10 < 4; var10++) {
                    int var11;
                    int var12;
                    if (arg3[var10] == 2) {
                        var11 = arg0[var6].field1179;
                        var12 = var8.field1179;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field1175;
                        var12 = var8.field1175;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].field1180 ? 1 : 0;
                        var12 = var8.field1180 ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field1181;
                        var12 = var8.field1181;
                    }
                    if (var11 != var12) {
                        if ((arg4[var10] != 1 || var11 <= var12) && (arg4[var10] != 0 || var11 >= var12)) {
                            var9 = false;
                        }
                        break;
                    }
                    if (var10 == 3) {
                        var9 = false;
                    }
                }
            } while (var9);
            boolean var13 = true;
            do {
                var5++;
                for (int var14 = 0; var14 < 4; var14++) {
                    int var15;
                    int var16;
                    if (arg3[var14] == 2) {
                        var15 = arg0[var5].field1179;
                        var16 = var8.field1179;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field1175;
                        var16 = var8.field1175;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].field1180 ? 1 : 0;
                        var16 = var8.field1180 ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field1181;
                        var16 = var8.field1181;
                    }
                    if (var15 != var16) {
                        if ((arg4[var14] != 1 || var15 >= var16) && (arg4[var14] != 0 || var15 <= var16)) {
                            var13 = false;
                        }
                        break;
                    }
                    if (var14 == 3) {
                        var13 = false;
                    }
                }
            } while (var13);
            if (var5 < var6) {
                class84 var17 = arg0[var5];
                arg0[var5] = arg0[var6];
                arg0[var6] = var17;
            }
        }
        method2278(arg0, arg1, var6, arg3, arg4);
        method2278(arg0, var6 + 1, arg2, arg3, arg4);
    }

    @ObfuscatedName("ai.g(I)V")
    public static void method3138() {
        try {
            if (Statics.field1220 == null) {
                Statics.field1220 = new class69(Statics.field2717, new URL(Statics.field528));
            } else {
                byte[] var0 = Statics.field1220.method1081();
                if (var0 != null) {
                    class28 var1 = new class28(var0);
                    field1197 = var1.method349();
                    Statics.field1223 = new class84[field1197];
                    int var2 = 0;
                    while (var2 < field1197) {
                        class84 var3 = Statics.field1223[var2] = new class84();
                        int var4 = var1.method349();
                        var3.field1181 = var4 & 0x3FFF;
                        var3.field1180 = (var4 & 0x8000) != 0;
                        var3.field1178 = (var4 & 0x4000) != 0;
                        var3.field1176 = var1.method451();
                        var3.field1177 = var1.method451();
                        var3.field1182 = var1.method450();
                        var3.field1175 = var1.method315();
                        var3.field1179 = var2++;
                    }
                    method2278(Statics.field1223, 0, Statics.field1223.length - 1, field1224, field1225);
                    field1214 = true;
                    Statics.field1220 = null;
                }
            }
        } catch (Exception var6) {
            var6.printStackTrace();
            Statics.field1220 = null;
        }
    }

    @ObfuscatedName("aj.c(B)I")
    public static int method3164() {
        return 6;
    }

    @ObfuscatedName("am.d(IIIB)I")
    public static final int method3228(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) >> 8;
    }

    @ObfuscatedName("am.j(I)V")
    public static final void method3231() {
        short var0 = 256;
        if (field1202 > 0) {
            for (int var1 = 0; var1 < 256; var1++) {
                if (field1202 > 768) {
                    Statics.field985[var1] = method3228(Statics.field1873[var1], Statics.field2156[var1], 1024 - field1202);
                } else if (field1202 > 256) {
                    Statics.field985[var1] = Statics.field2156[var1];
                } else {
                    Statics.field985[var1] = method3228(Statics.field2156[var1], Statics.field1873[var1], 256 - field1202);
                }
            }
        } else if (field1203 > 0) {
            for (int var2 = 0; var2 < 256; var2++) {
                if (field1203 > 768) {
                    Statics.field985[var2] = method3228(Statics.field1873[var2], Statics.field1229[var2], 1024 - field1203);
                } else if (field1203 > 256) {
                    Statics.field985[var2] = Statics.field1229[var2];
                } else {
                    Statics.field985[var2] = method3228(Statics.field1229[var2], Statics.field1873[var2], 256 - field1203);
                }
            }
        } else {
            for (int var3 = 0; var3 < 256; var3++) {
                Statics.field985[var3] = Statics.field1873[var3];
            }
        }
        class106.method1531(0, 9, 128, var0 + 7);
        Statics.field1374.method2530(0, 0);
        class106.method1530();
        int var4 = 0;
        int var5 = 6885;
        for (int var6 = 1; var6 < var0 - 1; var6++) {
            int var7 = (var0 - var6) * field1204[var6] / var0;
            int var8 = var7 + 22;
            if (var8 < 0) {
                var8 = 0;
            }
            var4 += var8;
            for (int var9 = var8; var9 < 128; var9++) {
                int var10 = Statics.field1322[var4++];
                if (var10 == 0) {
                    var5++;
                } else {
                    int var12 = 256 - var10;
                    int var13 = Statics.field985[var10];
                    int var14 = Statics.field1059.field2386[var5];
                    Statics.field1059.field2386[var5++] = ((var13 & 0xFF00FF) * var10 + (var14 & 0xFF00FF) * var12 & 0xFF00FF00) + ((var13 & 0xFF00) * var10 + (var14 & 0xFF00) * var12 & 0xFF0000) >> 8;
                }
            }
            var5 += var8 + 765 - 128;
        }
        class106.method1531(637, 9, 765, var0 + 7);
        Statics.field1222.method2530(382, 0);
        class106.method1530();
        int var15 = 0;
        int var16 = 7546;
        for (int var17 = 1; var17 < var0 - 1; var17++) {
            int var18 = (var0 - var17) * field1204[var17] / var0;
            int var19 = 103 - var18;
            int var20 = var16 + var18;
            for (int var21 = 0; var21 < var19; var21++) {
                int var22 = Statics.field1322[var15++];
                if (var22 == 0) {
                    var20++;
                } else {
                    int var24 = 256 - var22;
                    int var25 = Statics.field985[var22];
                    int var26 = Statics.field1059.field2386[var20];
                    Statics.field1059.field2386[var20++] = ((var25 & 0xFF00) * var22 + (var26 & 0xFF00) * var24 & 0xFF0000) + ((var25 & 0xFF00FF) * var22 + (var26 & 0xFF00FF) * var24 & 0xFF00FF00) >> 8;
                }
            }
            var15 += 128 - var19;
            var16 = 765 - var19 - var18 + var20;
        }
    }
}
