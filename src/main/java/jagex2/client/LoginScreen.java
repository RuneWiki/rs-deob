package jagex2.client;

import deob.ObfuscatedName;
import deob.Statics;
import jagex2.datastruct.JStringUtil;
import jagex2.datastruct.TextUtil;
import jagex2.graphics.Pix2D;
import jagex2.graphics.Pix8;
import jagex2.graphics.PixFont;
import jagex2.graphics.SoftwareFont;
import jagex2.graphics.SpriteDataProvider;
import jagex2.io.Packet;
import jagex2.js5.Js5TcpClient;
import jagex2.jstring.EnglishLocale;
import jagex2.sound.MidiPlayer;
import java.awt.Graphics;
import java.net.URL;

@ObfuscatedName("g")
public class LoginScreen {

    @ObfuscatedName("g.g")
    public static boolean field142 = false;

    @ObfuscatedName("g.w")
    public static int[] field139 = new int[256];

    @ObfuscatedName("g.f")
    public static int field129 = 0;

    @ObfuscatedName("g.k")
    public static int field143 = 0;

    @ObfuscatedName("g.p")
    public static int field145 = 0;

    @ObfuscatedName("g.ad")
    public static int field128 = 0;

    @ObfuscatedName("g.ac")
    public static int field147 = 0;

    @ObfuscatedName("g.aa")
    public static int field148 = 0;

    @ObfuscatedName("g.as")
    public static int field149 = 10;

    @ObfuscatedName("g.am")
    public static String field156 = "";

    @ObfuscatedName("g.ap")
    public static int field151 = 0;

    @ObfuscatedName("g.av")
    public static String field152 = "";

    @ObfuscatedName("g.ak")
    public static String field127 = "";

    @ObfuscatedName("g.az")
    public static String field154 = "";

    @ObfuscatedName("g.an")
    public static String field164 = "";

    @ObfuscatedName("g.ah")
    public static String field133 = "";

    @ObfuscatedName("g.ay")
    public static int field150 = 0;

    @ObfuscatedName("g.al")
    public static String field158 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("g.ao")
    public static boolean field160 = false;

    @ObfuscatedName("g.ax")
    public static int field161 = 0;

    @ObfuscatedName("g.bi")
    public static int[] field130 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("g.bs")
    public static int[] field167 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("g.bk")
    public static int field168 = -1;

    public LoginScreen() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("v.r(I)I")
    public static int method162() {
        return 6;
    }

    @ObfuscatedName("bx.d(I)V")
    public static void method831() {
        if (!Statics.field1507) {
            return;
        }
        Statics.field137 = null;
        Statics.field153 = null;
        Statics.field165 = null;
        Statics.field146 = null;
        Statics.field348 = null;
        Statics.field131 = null;
        Statics.field132 = null;
        Statics.field1530 = null;
        Statics.field2612 = null;
        Statics.field681 = null;
        Statics.field811 = null;
        Statics.field215 = null;
        Statics.field827 = null;
        Statics.field813 = null;
        Statics.field141 = null;
        Statics.field140 = null;
        Statics.field489 = null;
        Statics.field527 = null;
        Statics.field144 = null;
        Statics.field9 = null;
        MidiPlayer.field1117 = 1;
        Statics.field1118 = null;
        Statics.field349 = -1;
        Statics.field1121 = -1;
        Statics.field1120 = 0;
        Statics.field1625 = false;
        Statics.field1152 = 2;
        Js5TcpClient.method343(true);
        Statics.field1507 = false;
    }

    @ObfuscatedName("bg.m(Lfm;Lfm;I)V")
    public static void method784(SoftwareFont arg0, SoftwareFont arg1) {
        if (field160) {
            method1500(arg0, arg1);
            return;
        }
        if (client.field1929 == 0 || client.field1929 == 5) {
            byte var2 = 20;
            arg0.method2880(EnglishLocale.field1065, 382, 245 - var2, 16777215, -1);
            int var3 = 253 - var2;
            Pix2D.method2639(230, var3, 304, 34, 9179409);
            Pix2D.method2639(231, var3 + 1, 302, 32, 0);
            Pix2D.method2637(232, var3 + 2, field149 * 3, 30, 9179409);
            Pix2D.method2637(field149 * 3 + 232, var3 + 2, 300 - field149 * 3, 30, 0);
            arg0.method2880(field156, 382, 276 - var2, 16777215, -1);
        }
        if (client.field1929 == 20) {
            Statics.field137.method2747(382 - Statics.field137.field2513 / 2, 271 - Statics.field137.field2514 / 2);
            short var4 = 211;
            arg0.method2880(field152, 382, var4, 16776960, 0);
            int var89 = var4 + 15;
            arg0.method2880(field127, 382, var89, 16776960, 0);
            int var90 = var89 + 15;
            arg0.method2880(field154, 382, var90, 16776960, 0);
            int var91 = var90 + 15;
            int var92 = var91 + 10;
            arg0.method2821(EnglishLocale.field903, 272, var92, 16777215, 0);
            short var5 = 200;
            String var6;
            for (var6 = field164; arg0.method2882(var6) > var5; var6 = var6.substring(0, var6.length() - 1)) {
            }
            arg0.method2821(PixFont.method2844(var6), 312, var92, 16777215, 0);
            var89 = var92 + 15;
            String var8 = EnglishLocale.field1073;
            String var9 = field133;
            String var10 = JStringUtil.method946('*', var9.length());
            arg0.method2821(var8 + var10, 274, var89, 16777215, 0);
            var89 += 15;
        }
        if (client.field1929 == 10) {
            Statics.field137.method2747(202, 171);
            if (field151 == 0) {
                short var11 = 251;
                arg0.method2880(EnglishLocale.field1074, 382, var11, 16776960, 0);
                int var93 = var11 + 30;
                short var12 = 302;
                short var13 = 291;
                Statics.field153.method2747(var12 - 73, var13 - 20);
                arg0.method2824(EnglishLocale.field989, var12 - 73, var13 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                short var14 = 462;
                Statics.field153.method2747(var14 - 73, var13 - 20);
                arg0.method2824(EnglishLocale.field1076, var14 - 73, var13 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field151 == 2) {
                short var15 = 211;
                arg0.method2880(field152, 382, var15, 16776960, 0);
                int var94 = var15 + 15;
                arg0.method2880(field127, 382, var94, 16776960, 0);
                int var95 = var94 + 15;
                arg0.method2880(field154, 382, var95, 16776960, 0);
                int var96 = var95 + 15;
                int var97 = var96 + 10;
                arg0.method2821(EnglishLocale.field903, 272, var97, 16777215, 0);
                short var16 = 200;
                String var17;
                for (var17 = field164; arg0.method2882(var17) > var16; var17 = var17.substring(1)) {
                }
                arg0.method2821(PixFont.method2844(var17) + (field150 == 0 & client.field1922 % 40 < 20 ? Statics.method103(16776960) + TextUtil.field3 : ""), 312, var97, 16777215, 0);
                var94 = var97 + 15;
                String var19 = EnglishLocale.field1073;
                String var20 = field133;
                String var21 = JStringUtil.method946('*', var20.length());
                arg0.method2821(var19 + var21 + (field150 == 1 & client.field1922 % 40 < 20 ? Statics.method103(16776960) + TextUtil.field3 : ""), 274, var94, 16777215, 0);
                var94 += 15;
                short var22 = 302;
                short var23 = 321;
                Statics.field153.method2747(var22 - 73, var23 - 20);
                arg0.method2880(EnglishLocale.field995, var22, var23 + 5, 16777215, 0);
                short var24 = 462;
                Statics.field153.method2747(var24 - 73, var23 - 20);
                arg0.method2880(EnglishLocale.field1078, var24, var23 + 5, 16777215, 0);
            } else if (field151 == 3) {
                arg0.method2880(EnglishLocale.field1079, 382, 211, 16776960, 0);
                short var25 = 236;
                arg0.method2880(EnglishLocale.field992, 382, var25, 16777215, 0);
                int var98 = var25 + 15;
                arg0.method2880(EnglishLocale.field1081, 382, var98, 16777215, 0);
                int var99 = var98 + 15;
                arg0.method2880(EnglishLocale.field1082, 382, var99, 16777215, 0);
                int var100 = var99 + 15;
                arg0.method2880(EnglishLocale.field1084, 382, var100, 16777215, 0);
                int var101 = var100 + 15;
                short var26 = 382;
                short var27 = 321;
                Statics.field153.method2747(var26 - 73, var27 - 20);
                arg0.method2880(EnglishLocale.field1078, var26, var27 + 5, 16777215, 0);
            }
        }
        if (field147 > 0) {
            int var28 = field147;
            short var29 = 256;
            field145 += var28 * 128;
            if (field145 > Statics.field489.length) {
                field145 -= Statics.field489.length;
                int var30 = (int) (Math.random() * 12.0D);
                method920(Statics.field165[var30]);
            }
            int var31 = 0;
            int var32 = var28 * 128;
            int var33 = (var29 - var28) * 128;
            for (int var34 = 0; var34 < var33; var34++) {
                int var35 = Statics.field144[var31 + var32] - Statics.field489[field145 + var31 & Statics.field489.length - 1] * var28 / 6;
                if (var35 < 0) {
                    var35 = 0;
                }
                Statics.field144[var31++] = var35;
            }
            for (int var36 = var29 - var28; var36 < var29; var36++) {
                int var37 = var36 * 128;
                for (int var38 = 0; var38 < 128; var38++) {
                    int var39 = (int) (Math.random() * 100.0D);
                    if (var39 < 50 && var38 > 10 && var38 < 118) {
                        Statics.field144[var37 + var38] = 255;
                    } else {
                        Statics.field144[var37 + var38] = 0;
                    }
                }
            }
            if (field129 > 0) {
                field129 -= var28 * 4;
            }
            if (field143 > 0) {
                field143 -= var28 * 4;
            }
            if (field129 == 0 && field143 == 0) {
                int var40 = (int) (Math.random() * (double) (2000 / var28));
                if (var40 == 0) {
                    field129 = 1024;
                }
                if (var40 == 1) {
                    field143 = 1024;
                }
            }
            for (int var41 = 0; var41 < var29 - var28; var41++) {
                field139[var41] = field139[var28 + var41];
            }
            for (int var42 = var29 - var28; var42 < var29; var42++) {
                field139[var42] = (int) (Math.sin((double) field148 / 14.0D) * 16.0D + Math.sin((double) field148 / 15.0D) * 14.0D + Math.sin((double) field148 / 16.0D) * 12.0D);
                field148++;
            }
            field128 += var28 * 381703395;
            int var43 = ((client.field1922 & 0x1) + var28) / 2;
            if (var43 > 0) {
                for (int var44 = 0; var44 < field128 * 1196724044; var44++) {
                    int var45 = (int) (Math.random() * 124.0D) + 2;
                    int var46 = (int) (Math.random() * 128.0D) + 128;
                    Statics.field144[(var46 << 7) + var45] = 192;
                }
                field128 = 0;
                int var47 = 0;
                label286: while (true) {
                    if (var47 >= var29) {
                        int var51 = 0;
                        while (true) {
                            if (var51 >= 128) {
                                break label286;
                            }
                            int var52 = 0;
                            for (int var53 = -var43; var53 < var29; var53++) {
                                int var54 = var53 * 128;
                                if (var43 + var53 < var29) {
                                    var52 += Statics.field9[var43 * 128 + var51 + var54];
                                }
                                if (var53 - (var43 + 1) >= 0) {
                                    var52 -= Statics.field9[var51 + var54 - (var43 + 1) * 128];
                                }
                                if (var53 >= 0) {
                                    Statics.field144[var51 + var54] = var52 / (var43 * 2 + 1);
                                }
                            }
                            var51++;
                        }
                    }
                    int var48 = 0;
                    int var49 = var47 * 128;
                    for (int var50 = -var43; var50 < 128; var50++) {
                        if (var43 + var50 < 128) {
                            var48 += Statics.field144[var49 + var50 + var43];
                        }
                        if (var50 - (var43 + 1) >= 0) {
                            var48 -= Statics.field144[var49 + var50 - (var43 + 1)];
                        }
                        if (var50 >= 0) {
                            Statics.field9[var49 + var50] = var48 / (var43 * 2 + 1);
                        }
                    }
                    var47++;
                }
            }
            field147 = 0;
        }
        short var55 = 256;
        if (field129 > 0) {
            for (int var56 = 0; var56 < 256; var56++) {
                if (field129 > 768) {
                    Statics.field140[var56] = method1792(Statics.field827[var56], Statics.field813[var56], 1024 - field129);
                } else if (field129 > 256) {
                    Statics.field140[var56] = Statics.field813[var56];
                } else {
                    Statics.field140[var56] = method1792(Statics.field813[var56], Statics.field827[var56], 256 - field129);
                }
            }
        } else if (field143 > 0) {
            for (int var57 = 0; var57 < 256; var57++) {
                if (field143 > 768) {
                    Statics.field140[var57] = method1792(Statics.field827[var57], Statics.field141[var57], 1024 - field143);
                } else if (field143 > 256) {
                    Statics.field140[var57] = Statics.field141[var57];
                } else {
                    Statics.field140[var57] = method1792(Statics.field141[var57], Statics.field827[var57], 256 - field143);
                }
            }
        } else {
            for (int var58 = 0; var58 < 256; var58++) {
                Statics.field140[var58] = Statics.field827[var58];
            }
        }
        Pix2D.method2605(0, 9, 128, var55 + 7);
        Statics.field146.method2667(0, 0);
        Pix2D.method2584();
        int var59 = 0;
        int var60 = 6885;
        for (int var61 = 1; var61 < var55 - 1; var61++) {
            int var62 = (var55 - var61) * field139[var61] / var55;
            int var63 = var62 + 22;
            if (var63 < 0) {
                var63 = 0;
            }
            var59 += var63;
            for (int var64 = var63; var64 < 128; var64++) {
                int var65 = Statics.field144[var59++];
                if (var65 == 0) {
                    var60++;
                } else {
                    int var67 = 256 - var65;
                    int var68 = Statics.field140[var65];
                    int var69 = Statics.field1546.field538[var60];
                    Statics.field1546.field538[var60++] = ((var68 & 0xFF00) * var65 + (var69 & 0xFF00) * var67 & 0xFF0000) + ((var68 & 0xFF00FF) * var65 + (var69 & 0xFF00FF) * var67 & 0xFF00FF00) >> 8;
                }
            }
            var60 += var63 + 765 - 128;
        }
        Pix2D.method2605(637, 9, 765, var55 + 7);
        Statics.field348.method2667(382, 0);
        Pix2D.method2584();
        int var70 = 0;
        int var71 = 7546;
        for (int var72 = 1; var72 < var55 - 1; var72++) {
            int var73 = (var55 - var72) * field139[var72] / var55;
            int var74 = 103 - var73;
            int var75 = var71 + var73;
            for (int var76 = 0; var76 < var74; var76++) {
                int var77 = Statics.field144[var70++];
                if (var77 == 0) {
                    var75++;
                } else {
                    int var79 = 256 - var77;
                    int var80 = Statics.field140[var77];
                    int var81 = Statics.field1546.field538[var75];
                    Statics.field1546.field538[var75++] = ((var80 & 0xFF00FF) * var77 + (var81 & 0xFF00FF) * var79 & 0xFF00FF00) + ((var80 & 0xFF00) * var77 + (var81 & 0xFF00) * var79 & 0xFF0000) >> 8;
                }
            }
            var70 += 128 - var74;
            var71 = 765 - var74 - var73 + var75;
        }
        Statics.field132[field142 ? 1 : 0].method2747(725, 463);
        if (client.field1929 > 5 && client.field2047 == 0) {
            if (Statics.field215 == null) {
                Statics.field215 = Statics.method457(Statics.field1944, "sl_button", "");
            } else {
                byte var82 = 5;
                short var83 = 463;
                byte var84 = 100;
                byte var85 = 35;
                Statics.field215.method2747(var82, var83);
                arg0.method2880(EnglishLocale.field1043 + " " + client.field2075, var84 / 2 + var82, var85 / 2 + var83 - 2, 16777215, 0);
                if (Statics.field35 == null) {
                    arg1.method2880(EnglishLocale.field1072, var84 / 2 + var82, var85 / 2 + var83 + 12, 16777215, 0);
                } else {
                    arg1.method2880(EnglishLocale.field1093, var84 / 2 + var82, var85 / 2 + var83 + 12, 16777215, 0);
                }
            }
        }
        try {
            Graphics var86 = Statics.field54.getGraphics();
            Statics.field1546.method545(var86, 0, 0);
        } catch (Exception var88) {
            Statics.field54.repaint();
        }
    }

    @ObfuscatedName("em.c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method2357(String arg0, String arg1, String arg2) {
        field152 = arg0;
        field127 = arg1;
        field154 = arg2;
    }

    @ObfuscatedName("br.n(Lft;B)V")
    public static final void method920(Pix8 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < Statics.field489.length; var2++) {
            Statics.field489[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            Statics.field489[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    Statics.field527[var8] = (Statics.field489[var8 - 1] + Statics.field489[var8 + 1] + Statics.field489[var8 - 128] + Statics.field489[var8 + 128]) / 4;
                }
            }
            int[] var9 = Statics.field489;
            Statics.field489 = Statics.field527;
            Statics.field527 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field2514; var11++) {
            for (int var12 = 0; var12 < arg0.field2513; var12++) {
                if (arg0.field2511[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field2515;
                    int var14 = var11 + 16 + arg0.field2516;
                    int var15 = (var14 << 7) + var13;
                    Statics.field489[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("eh.j(IIII)I")
    public static final int method1792(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) >> 8;
    }

    @ObfuscatedName("de.z(Lfm;Lfm;I)V")
    public static void method1500(SoftwareFont arg0, SoftwareFont arg1) {
        if (Statics.field1530 == null) {
            Statics.field1530 = Statics.method830(Statics.field1944, "sl_back", "");
        }
        if (Statics.field2612 == null) {
            Statics.field2612 = SpriteDataProvider.method541(Statics.field1944, "sl_flags", "");
        }
        if (Statics.field681 == null) {
            Statics.field681 = SpriteDataProvider.method541(Statics.field1944, "sl_arrows", "");
        }
        if (Statics.field811 == null) {
            Statics.field811 = SpriteDataProvider.method541(Statics.field1944, "sl_stars", "");
        }
        Pix2D.method2637(0, 23, 765, 480, 0);
        Pix2D.method2592(0, 0, 125, 23, 12425273, 9135624);
        Pix2D.method2592(125, 0, 640, 23, 5197647, 2697513);
        arg0.method2880(EnglishLocale.field1066, 62, 15, 0, -1);
        if (Statics.field811 != null) {
            Statics.field811[1].method2747(140, 1);
            arg1.method2821(EnglishLocale.field1085, 152, 10, 16777215, -1);
            Statics.field811[0].method2747(140, 12);
            arg1.method2821(EnglishLocale.field916, 152, 21, 16777215, -1);
        }
        if (Statics.field681 != null) {
            short var2 = 280;
            if (field130[0] == 0 && field167[0] == 0) {
                Statics.field681[2].method2747(var2, 4);
            } else {
                Statics.field681[0].method2747(var2, 4);
            }
            if (field130[0] == 0 && field167[0] == 1) {
                Statics.field681[3].method2747(var2 + 15, 4);
            } else {
                Statics.field681[1].method2747(var2 + 15, 4);
            }
            arg0.method2821(EnglishLocale.field1087, var2 + 32, 17, 16777215, -1);
            short var3 = 390;
            if (field130[0] == 1 && field167[0] == 0) {
                Statics.field681[2].method2747(var3, 4);
            } else {
                Statics.field681[0].method2747(var3, 4);
            }
            if (field130[0] == 1 && field167[0] == 1) {
                Statics.field681[3].method2747(var3 + 15, 4);
            } else {
                Statics.field681[1].method2747(var3 + 15, 4);
            }
            arg0.method2821(EnglishLocale.field894, var3 + 32, 17, 16777215, -1);
            short var4 = 500;
            if (field130[0] == 2 && field167[0] == 0) {
                Statics.field681[2].method2747(var4, 4);
            } else {
                Statics.field681[0].method2747(var4, 4);
            }
            if (field130[0] == 2 && field167[0] == 1) {
                Statics.field681[3].method2747(var4 + 15, 4);
            } else {
                Statics.field681[1].method2747(var4 + 15, 4);
            }
            arg0.method2821(EnglishLocale.field1091, var4 + 32, 17, 16777215, -1);
            short var5 = 610;
            if (field130[0] == 3 && field167[0] == 0) {
                Statics.field681[2].method2747(var5, 4);
            } else {
                Statics.field681[0].method2747(var5, 4);
            }
            if (field130[0] == 3 && field167[0] == 1) {
                Statics.field681[3].method2747(var5 + 15, 4);
            } else {
                Statics.field681[1].method2747(var5 + 15, 4);
            }
            arg0.method2821(EnglishLocale.field1090, var5 + 32, 17, 16777215, -1);
        }
        Pix2D.method2637(708, 4, 50, 16, 0);
        arg1.method2880(EnglishLocale.field1078, 733, 16, 16777215, -1);
        field168 = -1;
        if (Statics.field1530 != null) {
            byte var6 = 88;
            byte var7 = 19;
            int var8 = 765 / (var6 + 1);
            int var9 = 480 / (var7 + 1);
            int var10;
            int var11;
            do {
                var10 = var9;
                var11 = var8;
                if ((var8 - 1) * var9 >= field161) {
                    var8--;
                }
                if ((var9 - 1) * var8 >= field161) {
                    var9--;
                }
                if ((var9 - 1) * var8 >= field161) {
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
            for (int var19 = 0; var19 < field161; var19++) {
                WorldEntry var20 = Statics.field214[var19];
                boolean var21 = true;
                String var22 = Integer.toString(var20.field46);
                if (var20.field46 == -1) {
                    var22 = EnglishLocale.field1012;
                    var21 = false;
                } else if (var20.field46 > 1980) {
                    var22 = EnglishLocale.field1092;
                    var21 = false;
                }
                if (JavaMouseProvider.field488 >= var17 && JavaMouseProvider.field492 >= var16 && JavaMouseProvider.field488 < var6 + var17 && JavaMouseProvider.field492 < var7 + var16 && var21) {
                    field168 = var19;
                    Statics.field1530[var20.field50 ? 1 : 0].method2699(var17, var16, 128, 16777215);
                } else {
                    Statics.field1530[var20.field50 ? 1 : 0].method2667(var17, var16);
                }
                if (Statics.field2612 != null) {
                    Statics.field2612[var20.field48 + (var20.field50 ? 8 : 0)].method2747(var17 + 29, var16);
                }
                arg0.method2880(Integer.toString(var20.field49), var17 + 15, var7 / 2 + var16 + 5, 0, -1);
                arg1.method2880(var22, var17 + 60, var7 / 2 + var16 + 5, 268435455, -1);
                var16 += var7 + var13;
                var18++;
                if (var18 >= var9) {
                    var16 = var15 + 23;
                    var17 += var6 + var12;
                    var18 = 0;
                }
            }
        }
        try {
            Graphics var23 = Statics.field54.getGraphics();
            Statics.field1546.method545(var23, 0, 0);
        } catch (Exception var25) {
            Statics.field54.repaint();
        }
    }

    @ObfuscatedName("cm.g(Ldj;I)V")
    public static void method1134(GameShell arg0) {
        if (JavaMouseProvider.field497 != 1) {
            return;
        }
        short var1 = 280;
        if (JavaMouseProvider.field498 >= var1 && JavaMouseProvider.field498 <= var1 + 14 && JavaMouseProvider.field499 >= 4 && JavaMouseProvider.field499 <= 18) {
            method2049(0, 0);
            return;
        }
        if (JavaMouseProvider.field498 >= var1 + 15 && JavaMouseProvider.field498 <= var1 + 80 && JavaMouseProvider.field499 >= 4 && JavaMouseProvider.field499 <= 18) {
            method2049(0, 1);
            return;
        }
        short var2 = 390;
        if (JavaMouseProvider.field498 >= var2 && JavaMouseProvider.field498 <= var2 + 14 && JavaMouseProvider.field499 >= 4 && JavaMouseProvider.field499 <= 18) {
            method2049(1, 0);
            return;
        }
        if (JavaMouseProvider.field498 >= var2 + 15 && JavaMouseProvider.field498 <= var2 + 80 && JavaMouseProvider.field499 >= 4 && JavaMouseProvider.field499 <= 18) {
            method2049(1, 1);
            return;
        }
        short var3 = 500;
        if (JavaMouseProvider.field498 >= var3 && JavaMouseProvider.field498 <= var3 + 14 && JavaMouseProvider.field499 >= 4 && JavaMouseProvider.field499 <= 18) {
            method2049(2, 0);
            return;
        }
        if (JavaMouseProvider.field498 >= var3 + 15 && JavaMouseProvider.field498 <= var3 + 80 && JavaMouseProvider.field499 >= 4 && JavaMouseProvider.field499 <= 18) {
            method2049(2, 1);
            return;
        }
        short var4 = 610;
        if (JavaMouseProvider.field498 >= var4 && JavaMouseProvider.field498 <= var4 + 14 && JavaMouseProvider.field499 >= 4 && JavaMouseProvider.field499 <= 18) {
            method2049(3, 0);
            return;
        }
        if (JavaMouseProvider.field498 >= var4 + 15 && JavaMouseProvider.field498 <= var4 + 80 && JavaMouseProvider.field499 >= 4 && JavaMouseProvider.field499 <= 18) {
            method2049(3, 1);
            return;
        }
        if (JavaMouseProvider.field498 >= 708 && JavaMouseProvider.field499 >= 4 && JavaMouseProvider.field498 <= 758 && JavaMouseProvider.field499 <= 20) {
            field160 = false;
            Statics.field146.method2667(0, 0);
            Statics.field348.method2667(382, 0);
            Statics.field131.method2747(382 - Statics.field131.field2513 / 2, 18);
            return;
        }
        if (field168 == -1) {
            return;
        }
        WorldEntry var5 = Statics.field214[field168];
        if (client.field1983 == var5.field50) {
            Statics.field52 = var5.field45;
            client.field2075 = var5.field49;
            Statics.field1641 = client.field1915 == 0 ? 43594 : var5.field49 + 40000;
            Statics.field13 = client.field1915 == 0 ? 443 : var5.field49 + 50000;
            Statics.field1204 = Statics.field1641;
            field160 = false;
            Statics.field146.method2667(0, 0);
            Statics.field348.method2667(382, 0);
            Statics.field131.method2747(382 - Statics.field131.field2513 / 2, 18);
            return;
        }
        String var6 = "";
        if (client.field1915 != 0) {
            var6 = ":" + (var5.field49 + 7000);
        }
        String var7 = "http://" + var5.field45 + var6 + "/j" + client.field2074;
        try {
            arg0.getAppletContext().showDocument(new URL(var7), "_self");
        } catch (Exception var9) {
        }
    }

    @ObfuscatedName("ac.q(I)V")
    public static void method377() {
        try {
            if (Statics.field35 == null) {
                Statics.field35 = new WorldList(Statics.field1542, new URL(Statics.field852));
            } else {
                byte[] var0 = Statics.field35.method99();
                if (var0 != null) {
                    Packet var1 = new Packet(var0);
                    field161 = var1.method1602();
                    Statics.field214 = new WorldEntry[field161];
                    int var2 = 0;
                    while (var2 < field161) {
                        WorldEntry var3 = Statics.field214[var2] = new WorldEntry();
                        int var4 = var1.method1602();
                        var3.field49 = var4 & 0x7FFF;
                        var3.field50 = (var4 & 0x8000) != 0;
                        var3.field45 = var1.method1693();
                        var3.field48 = var1.method1600();
                        var3.field46 = var1.method1603();
                        var3.field47 = var2++;
                    }
                    method747(Statics.field214, 0, Statics.field214.length - 1, field130, field167);
                    field160 = true;
                    Statics.field35 = null;
                }
            }
        } catch (Exception var6) {
            var6.printStackTrace();
            Statics.field35 = null;
        }
    }

    @ObfuscatedName("client.i(III)V")
    public static void method2049(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field130[var5] != arg0) {
                var2[var4] = field130[var5];
                var3[var4] = field167[var5];
                var4++;
            }
        }
        field130 = var2;
        field167 = var3;
        method747(Statics.field214, 0, Statics.field214.length - 1, field130, field167);
    }

    @ObfuscatedName("bh.s([Lc;II[I[II)V")
    public static void method747(WorldEntry[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        if (arg1 >= arg2) {
            return;
        }
        int var5 = arg1 - 1;
        int var6 = arg2 + 1;
        int var7 = (arg1 + arg2) / 2;
        WorldEntry var8 = arg0[var7];
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
                        var11 = arg0[var6].field47;
                        var12 = var8.field47;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field46;
                        var12 = var8.field46;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].field50 ? 1 : 0;
                        var12 = var8.field50 ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field49;
                        var12 = var8.field49;
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
                        var15 = arg0[var5].field47;
                        var16 = var8.field47;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field46;
                        var16 = var8.field46;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].field50 ? 1 : 0;
                        var16 = var8.field50 ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field49;
                        var16 = var8.field49;
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
                WorldEntry var17 = arg0[var5];
                arg0[var5] = arg0[var6];
                arg0[var6] = var17;
            }
        }
        method747(arg0, arg1, var6, arg3, arg4);
        method747(arg0, var6 + 1, arg2, arg3, arg4);
    }
}
