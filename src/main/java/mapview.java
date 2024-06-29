import java.awt.Color;
import java.awt.Graphics;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.security.MessageDigest;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!mapview")
public class mapview extends class14 {

    @OriginalMember(owner = "mapview!mapview", name = "o", descriptor = "D")
    private double field236 = 4.0D;

    @OriginalMember(owner = "mapview!mapview", name = "q", descriptor = "[I")
    private int[] field238 = new int[1000];

    @OriginalMember(owner = "mapview!mapview", name = "G", descriptor = "I")
    private int field254 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "u", descriptor = "D")
    private double field242 = 4.0D;

    @OriginalMember(owner = "mapview!mapview", name = "J", descriptor = "Z")
    private boolean field257 = false;

    @OriginalMember(owner = "mapview!mapview", name = "U", descriptor = "I")
    private int field268 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "N", descriptor = "I")
    private int field261 = 5;

    @OriginalMember(owner = "mapview!mapview", name = "p", descriptor = "Z")
    private boolean field237 = true;

    @OriginalMember(owner = "mapview!mapview", name = "gb", descriptor = "I")
    private int field280 = 8912896;

    @OriginalMember(owner = "mapview!mapview", name = "Z", descriptor = "I")
    private int field273 = -1;

    @OriginalMember(owner = "mapview!mapview", name = "Q", descriptor = "I")
    private int field264 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "fb", descriptor = "[I")
    private int[] field279 = new int[1000];

    @OriginalMember(owner = "mapview!mapview", name = "T", descriptor = "[I")
    private int[] field267 = new int[1000];

    @OriginalMember(owner = "mapview!mapview", name = "ob", descriptor = "I")
    private int field288 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "S", descriptor = "[I")
    private int[] field266 = new int[1000];

    @OriginalMember(owner = "mapview!mapview", name = "sb", descriptor = "I")
    private int field292 = 470;

    @OriginalMember(owner = "mapview!mapview", name = "n", descriptor = "Z")
    private boolean field235 = false;

    @OriginalMember(owner = "mapview!mapview", name = "v", descriptor = "I")
    private int field243 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "C", descriptor = "I")
    private int field250 = 13;

    @OriginalMember(owner = "mapview!mapview", name = "tb", descriptor = "I")
    private int field293 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "xb", descriptor = "I")
    private int field297 = 140;

    @OriginalMember(owner = "mapview!mapview", name = "A", descriptor = "I")
    private int field248 = 11141120;

    @OriginalMember(owner = "mapview!mapview", name = "K", descriptor = "I")
    private int field258 = 500;

    @OriginalMember(owner = "mapview!mapview", name = "cb", descriptor = "[I")
    private int[] field276 = new int[1000];

    @OriginalMember(owner = "mapview!mapview", name = "qb", descriptor = "I")
    private int field290 = 8943445;

    @OriginalMember(owner = "mapview!mapview", name = "wb", descriptor = "I")
    private int field296 = -1;

    @OriginalMember(owner = "mapview!mapview", name = "mb", descriptor = "I")
    private int field286 = -1;

    @OriginalMember(owner = "mapview!mapview", name = "kb", descriptor = "I")
    private int field284 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "I", descriptor = "Z")
    private boolean field256 = false;

    @OriginalMember(owner = "mapview!mapview", name = "Ab", descriptor = "[I")
    private int[] field300 = new int[this.field258];

    @OriginalMember(owner = "mapview!mapview", name = "ib", descriptor = "[I")
    private int[] field282 = new int[this.field258];

    @OriginalMember(owner = "mapview!mapview", name = "Db", descriptor = "[I")
    private int[] field303 = new int[1000];

    @OriginalMember(owner = "mapview!mapview", name = "yb", descriptor = "I")
    private int field298 = 10027008;

    @OriginalMember(owner = "mapview!mapview", name = "Eb", descriptor = "I")
    private int field304 = 7824964;

    @OriginalMember(owner = "mapview!mapview", name = "vb", descriptor = "I")
    private int field295 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "ub", descriptor = "[Ll;")
    private class21[] field294 = new class21[this.field258];

    @OriginalMember(owner = "mapview!mapview", name = "r", descriptor = "[I")
    private int[] field239 = new int[this.field258];

    @OriginalMember(owner = "mapview!mapview", name = "s", descriptor = "I")
    private int field240 = 6706483;

    @OriginalMember(owner = "mapview!mapview", name = "V", descriptor = "I")
    private int field269 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "t", descriptor = "Ll;")
    private static class21 field241 = class28.method185(-20839, " )2 ");

    @OriginalMember(owner = "mapview!mapview", name = "E", descriptor = "Ll;")
    private static class21 field252 = class28.method185(-20839, "mapscene");

    @OriginalMember(owner = "mapview!mapview", name = "l", descriptor = "I")
    public static int field233 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "Y", descriptor = "[[B")
    public static byte[][] field272 = new byte[50][];

    @OriginalMember(owner = "mapview!mapview", name = "rb", descriptor = "I")
    public static int field291 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "m", descriptor = "I")
    public static int field234 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "Cb", descriptor = "Ll;")
    public static class21 field302 = class28.method185(-20839, "Farming patch");

    @OriginalMember(owner = "mapview!mapview", name = "M", descriptor = "I")
    public static int field260;

    @OriginalMember(owner = "mapview!mapview", name = "lb", descriptor = "I")
    private int imageOverviewHeight;

    @OriginalMember(owner = "mapview!mapview", name = "eb", descriptor = "I")
    private int imageOverviewWidth;

    @OriginalMember(owner = "mapview!mapview", name = "bb", descriptor = "I")
    private int overviewX;

    @OriginalMember(owner = "mapview!mapview", name = "X", descriptor = "I")
    private int overviewY;

    @OriginalMember(owner = "mapview!mapview", name = "Bb", descriptor = "Lf;")
    private Pix24 imageOverview;

    @OriginalMember(owner = "mapview!mapview", name = "L", descriptor = "Lga;")
    private class12 field259;

    @OriginalMember(owner = "mapview!mapview", name = "w", descriptor = "Lla;")
    private class22 field244;

    @OriginalMember(owner = "mapview!mapview", name = "z", descriptor = "Lla;")
    private class22 field247;

    @OriginalMember(owner = "mapview!mapview", name = "H", descriptor = "Lla;")
    private class22 field255;

    @OriginalMember(owner = "mapview!mapview", name = "R", descriptor = "Lla;")
    private class22 field265;

    @OriginalMember(owner = "mapview!mapview", name = "W", descriptor = "Lla;")
    private class22 field270;

    @OriginalMember(owner = "mapview!mapview", name = "db", descriptor = "Lla;")
    private class22 field277;

    @OriginalMember(owner = "mapview!mapview", name = "nb", descriptor = "Lla;")
    private class22 field287;

    @OriginalMember(owner = "mapview!mapview", name = "zb", descriptor = "Lla;")
    private class22 field299;

    @OriginalMember(owner = "mapview!mapview", name = "Fb", descriptor = "Z")
    public static boolean field305;

    @OriginalMember(owner = "mapview!mapview", name = "hb", descriptor = "[I")
    private int[] field281;

    @OriginalMember(owner = "mapview!mapview", name = "pb", descriptor = "[I")
    private int[] field289;

    @OriginalMember(owner = "mapview!mapview", name = "O", descriptor = "[Lf;")
    private Pix24[] field262;

    @OriginalMember(owner = "mapview!mapview", name = "y", descriptor = "[Lk;")
    private class19[] field246;

    @OriginalMember(owner = "mapview!mapview", name = "F", descriptor = "[Ll;")
    private class21[] field253;

    @OriginalMember(owner = "mapview!mapview", name = "x", descriptor = "[[B")
    private byte[][] field245;

    @OriginalMember(owner = "mapview!mapview", name = "P", descriptor = "[[B")
    private byte[][] field263;

    @OriginalMember(owner = "mapview!mapview", name = "ab", descriptor = "[[B")
    private byte[][] field274;

    @OriginalMember(owner = "mapview!mapview", name = "jb", descriptor = "[[B")
    private byte[][] field283;

    @OriginalMember(owner = "mapview!mapview", name = "B", descriptor = "[[I")
    private int[][] field249;

    @OriginalMember(owner = "mapview!mapview", name = "D", descriptor = "[[I")
    private int[][] field251;

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "([BZ[[I[[B)V", line = 8)
    private final void method142(byte[] arg0, boolean arg1, int[][] arg2, byte[][] arg3) {
        int var5 = 0;
        while (true) {
            while (var5 < arg0.length) {
                int var6 = (arg0[var5++] & 0xFF) * 64 - class18.field162;
                int var7 = (arg0[var5++] & 0xFF) * 64 - class27.field323;
                if (var6 > 0 && var7 > 0 && var6 + 64 < class4.sizeX && class2.sizeZ > var7 + 64) {
                    for (int var8 = 0; var8 < 64; var8++) {
                        int[] var9 = arg2[var6 + var8];
                        byte[] var10 = arg3[var8 + var6];
                        int var11 = class2.sizeZ - var7 - 1;
                        for (int var12 = -64; var12 < 0; var12++) {
                            int var13 = arg0[var5++] & 0xFF;
                            if (var13 == 0) {
                                var9[var11--] = 0;
                            } else {
                                var10[var11] = arg0[var5++];
                                int var14 = this.field289[var13];
                                var9[var11--] = var14;
                            }
                        }
                    }
                } else {
                    for (int var15 = -4096; var15 < 0; var15++) {
                        byte var16 = arg0[var5++];
                        if (var16 != 0) {
                            var5++;
                        }
                    }
                }
            }
            if (!arg1) {
                this.field282 = null;
            }
            return;
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(I)V", line = 81)
    public final void method44(int arg0) {
        method154((byte) 107);
        class2.method5((byte) -72);
        class21.method99(-49);
        class6.method15(1);
        class29.method190(arg0 - 109);
        class16.method61(-1841510392);
        class14.method46(true);
        class5.method13(0);
        class26.method175(0);
        PixMap.method138(11);
        if (arg0 != -1) {
            this.imageOverviewWidth = -112;
        }
        class18.method81(4080);
        class22.method122();
        class27.method178(-29056);
        class20.method89(~arg0);
        class28.method181((byte) -100);
        class1.method3(221);
        Draw2D.method169();
        class31.method196((byte) -116);
        class34.method210(-125);
        class30.method192(120);
        class4.method11((byte) 72);
        class10.method28(false);
        class3.method7(128);
        class11.method33(256);
        class17.method75(false);
        class23.method130();
        class13.method40((byte) 117);
        this.imageOverview = null;
        this.field247 = null;
        this.field299 = null;
        this.field289 = null;
        this.field245 = null;
        this.field276 = null;
        this.field282 = null;
        this.field244 = null;
        this.field300 = null;
        this.field253 = null;
        this.field281 = null;
        this.field251 = null;
        this.field239 = null;
        this.field277 = null;
        this.field283 = null;
        this.field263 = null;
        this.field255 = null;
        this.field267 = null;
        this.field238 = null;
        this.field249 = null;
        this.field303 = null;
        this.field274 = null;
        this.field266 = null;
        this.field279 = null;
        this.field265 = null;
        this.field259 = null;
        this.field246 = null;
        this.field270 = null;
        this.field262 = null;
        this.field294 = null;
        this.field287 = null;
        if (class14.field143) {
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(ILka;BI)Lga;", line = 158)
    public static final class12 method143(int arg0, class20 arg1, byte arg2, int arg3) {
        int var4 = -128 / ((arg2 - 61) / 57);
        return class30.method193(arg3, (byte) 120, arg1, arg0) ? class11.method31(true) : null;
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(IIIIIIIII)V", line = 182)
    private final void drawMap(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var10 = arg3 - arg5;
        int var11 = (arg6 - arg0 << 16) / var10;
        int var12 = arg2 - arg8;
        int var13 = (arg7 - arg1 << 16) / var12;
        for (int var14 = 0; var14 < var10; var14++) {
            int var15 = (var14 + 1) * var11 >> 16;
            int var16 = var11 * var14 >> 16;
            int var17 = var15 - var16;
            if (var17 > 0) {
                int[] var18 = this.field251[arg5 + var14];
                int var19 = arg0 + var15;
                int var20 = arg0 + var16;
                int[] var21 = this.field249[arg5 + var14];
                byte[] var22 = this.field283[arg5 + var14];
                for (int var23 = 0; var23 < var12; var23++) {
                    int var24 = var13 * var23 >> 16;
                    int var25 = (var23 + 1) * var13 >> 16;
                    int var26 = var25 - var24;
                    if (var26 > 0) {
                        int var27 = arg1 + var24;
                        int var28 = arg1 + var25;
                        int var29 = var21[var23 + arg8];
                        if (var29 == 0) {
                            Draw2D.method167(var20, var27, var19 - var20, -var27 + var28, var18[arg8 + var23]);
                        } else {
                            byte var30 = var22[arg8 + var23];
                            int var31 = var30 & 0xFC;
                            if (var31 == 0 || var17 <= 1 || var26 <= 1) {
                                Draw2D.method167(var20, var27, var17, var26, var29);
                            } else {
                                this.method148(var30 & 0x3, var18[arg8 + var23], 97, var26, var31 >> 2, Draw2D.field306, Draw2D.field310 * var27 + var20, var17, var29);
                            }
                        }
                    }
                }
            }
        }
        if (arg6 - arg0 < -arg5 + arg3 || arg4 <= 13) {
            return;
        }
        int var32 = 0;
        for (int var33 = 0; var33 < var10; var33++) {
            int var34 = var11 * var33 >> 16;
            int var35 = (var33 + 1) * var11 >> 16;
            int var36 = var35 - var34;
            if (var36 > 0) {
                byte[] var37 = this.field245[arg5 + var33];
                byte[] var38 = this.field263[arg5 + var33];
                byte[] var39 = this.field274[arg5 + var33];
                for (int var40 = 0; var40 < var12; var40++) {
                    int var41 = var13 * var40 >> 16;
                    int var42 = (var40 + 1) * var13 >> 16;
                    int var43 = var42 - var41;
                    if (var43 > 0) {
                        int var44 = var37[arg8 + var40] & 0xFF;
                        if (var44 != 0) {
                            int var45;
                            if (var43 == 1) {
                                var45 = var41;
                            } else {
                                var45 = var42 - 1;
                            }
                            int var46;
                            if (var36 == 1) {
                                var46 = var34;
                            } else {
                                var46 = var35 - 1;
                            }
                            int var47 = 13421772;
                            if (var44 >= 5 && var44 <= 8 || var44 >= 13 && var44 <= 16 || var44 >= 21 && var44 <= 24 || var44 == 27 || var44 == 28) {
                                var47 = 13369344;
                                var44 -= 4;
                            }
                            if (var44 == 1) {
                                Draw2D.method166(var34, var41, var43, var47);
                            } else if (var44 == 2) {
                                Draw2D.method164(var34, var41, var36, var47);
                            } else if (var44 == 3) {
                                Draw2D.method166(var46, var41, var43, var47);
                            } else if (var44 == 4) {
                                Draw2D.method164(var34, var45, var36, var47);
                            } else if (var44 == 9) {
                                Draw2D.method166(var34, var41, var43, 16777215);
                                Draw2D.method164(var34, var41, var36, var47);
                            } else if (var44 == 10) {
                                Draw2D.method166(var46, var41, var43, 16777215);
                                Draw2D.method164(var34, var41, var36, var47);
                            } else if (var44 == 11) {
                                Draw2D.method166(var46, var41, var43, 16777215);
                                Draw2D.method164(var34, var45, var36, var47);
                            } else if (var44 == 12) {
                                Draw2D.method166(var34, var41, var43, 16777215);
                                Draw2D.method164(var34, var45, var36, var47);
                            } else if (var44 == 17) {
                                Draw2D.method164(var34, var41, 1, var47);
                            } else if (var44 == 18) {
                                Draw2D.method164(var46, var41, 1, var47);
                            } else if (var44 == 19) {
                                Draw2D.method164(var46, var45, 1, var47);
                            } else if (var44 == 20) {
                                Draw2D.method164(var34, var45, 1, var47);
                            } else if (var44 == 25) {
                                for (int var49 = 0; var49 < var43; var49++) {
                                    Draw2D.method164(var34 + var49, -var49 + var45, 1, var47);
                                }
                            } else if (var44 == 26) {
                                for (int var48 = 0; var48 < var43; var48++) {
                                    Draw2D.method164(var34 + var48, var41 + var48, 1, var47);
                                }
                            }
                        }
                        int var50 = var38[var40 + arg8] & 0xFF;
                        if (var50 != 0) {
                            this.field246[var50 - 1].method82(var34 - var36 / 2, -(var43 / 2) + var41, var36 * 2, var43 * 2);
                        }
                        int var51 = var39[arg8 + var40] & 0xFF;
                        if (var51 != 0) {
                            this.field238[var32] = var51 - 1;
                            this.field279[var32] = var36 / 2 + var34;
                            this.field266[var32] = var43 / 2 + var41;
                            var32++;
                        }
                    }
                }
            }
        }
        for (int var52 = 0; var52 < var32; var52++) {
            if (this.field262[this.field238[var52]] != null) {
                this.field262[this.field238[var52]].method24(this.field279[var52] - 7, this.field266[var52] + -7);
            }
        }
        if (this.field268 > 0) {
            for (int var53 = 0; var53 < var32; var53++) {
                if (this.field238[var53] == this.field273) {
                    this.field262[this.field238[var53]].method24(this.field279[var53] - 7, this.field266[var53] + -7);
                    if (this.field268 % 10 < 5) {
                        Draw2D.method168(this.field279[var53], this.field266[var53], 15, 16776960, 128);
                        Draw2D.method168(this.field279[var53], this.field266[var53], 7, 16777215, 256);
                    }
                }
            }
        }
        if (this.field242 == this.field236 && class34.field394) {
            for (int var54 = 0; var54 < this.field288; var54++) {
                int var55 = this.field239[var54];
                int var56 = this.field300[var54];
                int var57 = var55 - class18.field162;
                int var58 = this.field282[var54];
                int var59 = (arg6 - arg0) * (-arg5 + var57) / (arg3 - arg5) + arg0;
                int var60 = 16777215;
                int var61 = class27.field323 + class2.sizeZ - var56;
                class22 var62 = null;
                int var63 = (arg7 - arg1) * (-arg8 + var61) / (arg2 - arg8) + arg1;
                if (var58 == 0) {
                    if (this.field236 == 3.0D) {
                        var62 = this.field255;
                    }
                    if (this.field236 == 4.0D) {
                        var62 = this.field265;
                    }
                    if (this.field236 == 6.0D) {
                        var62 = this.field277;
                    }
                    if (this.field236 == 8.0D) {
                        var62 = this.field299;
                    }
                }
                if (var58 == 1) {
                    if (this.field236 == 3.0D) {
                        var62 = this.field277;
                    }
                    if (this.field236 == 4.0D) {
                        var62 = this.field299;
                    }
                    if (this.field236 == 6.0D) {
                        var62 = this.field270;
                    }
                    if (this.field236 == 8.0D) {
                        var62 = this.field247;
                    }
                }
                if (var58 == 2) {
                    var60 = 16755200;
                    if (this.field236 == 3.0D) {
                        var62 = this.field270;
                    }
                    if (this.field236 == 4.0D) {
                        var62 = this.field247;
                    }
                    if (this.field236 == 6.0D) {
                        var62 = this.field287;
                    }
                    if (this.field236 == 8.0D) {
                        var62 = this.field244;
                    }
                }
                if (var62 != null) {
                    class21 var64 = this.field294[var54];
                    int var65 = 1;
                    for (int var66 = 0; var66 < var64.method102(-62); var66++) {
                        if (var64.method107(var66, 5878) == 47) {
                            var65++;
                        }
                    }
                    int var67 = var63 - var62.method119() * (var65 - 1) / 2;
                    int var68 = var67 + var62.method127() / 2;
                    while (true) {
                        int var69 = var64.method109(47, (byte) 102);
                        if (var69 == -1) {
                            var62.method118(var64, var59, var68, var60, true);
                            break;
                        }
                        class21 var70 = var64.method112(-57, 0, var69);
                        var62.method118(var70, var59, var68, var60, true);
                        var68 += var62.method119();
                        var64 = var64.method97(-1989, var69 + 1);
                    }
                }
            }
        }
        if (!class6.field46) {
            return;
        }
        for (int var71 = class18.field162 / 64; var71 < (class4.sizeX + class18.field162) / 64; var71++) {
            for (int var72 = class27.field323 / 64; var72 < (class27.field323 + class2.sizeZ) / 64; var72++) {
                int var73 = var71 * 64;
                int var74 = var73 - class18.field162;
                int var75 = (arg6 - arg0) * (-arg5 + var74) / (arg3 - arg5) + arg0;
                int var76 = var72 * 64;
                int var77 = class2.sizeZ + class27.field323 - var76;
                int var78 = (var77 - arg8 - 64) * (-arg1 + arg7) / (arg2 - arg8) + arg1;
                int var79 = arg0 + (var74 + 64 - arg5) * (-arg0 + arg6) / (arg3 - arg5);
                int var80 = (arg7 - arg1) * (-arg8 + var77) / (arg2 - arg8) + arg1;
                Draw2D.drawRect(var75, var78, var79 - var75, var80 - var78, 16777215);
                this.field259.method39(class28.method183(0, new class21[] { class14.method54(10, var71), class3.field19, class14.method54(10, var72) }), var79 - 5, var80 + -5, 16777215);
                if (var71 == 33 && var72 >= 71 && var72 <= 73) {
                    this.field259.method38(class28.field333, (var75 + var79) / 2, (var78 + var80) / 2, 16711680);
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "init", descriptor = "()V", line = 658)
    public final void init() {
        if (this.method47(-122)) {
            this.method55(32, 503, PixMap.field227.method116((byte) 114, this).method114(10), 635, (byte) 55);
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(IDDD)I", line = 673)
    private final int method145(int arg0, double arg1, double arg2, double arg3) {
        if (arg0 != -20) {
            return 120;
        }
        double var8 = arg1;
        double var10 = arg1;
        double var12 = arg1;
        if (arg2 != 0.0D) {
            double var14;
            if (arg1 < 0.5D) {
                var14 = (arg2 + 1.0D) * arg1;
            } else {
                var14 = arg1 + arg2 - arg1 * arg2;
            }
            double var16 = arg3 + 0.3333333333333333D;
            double var18 = arg3 - 0.3333333333333333D;
            double var20 = arg1 * 2.0D - var14;
            if (var18 < 0.0D) {
                var18++;
            }
            if (var18 * 6.0D < 1.0D) {
                var10 = (var14 - var20) * 6.0D * var18 + var20;
            } else if (var18 * 2.0D < 1.0D) {
                var10 = var14;
            } else if (var18 * 3.0D < 2.0D) {
                var10 = (var14 - var20) * (-var18 + 0.6666666666666666D) * 6.0D + var20;
            } else {
                var10 = var20;
            }
            if (arg3 * 6.0D < 1.0D) {
                var12 = (var14 - var20) * 6.0D * arg3 + var20;
            } else if (arg3 * 2.0D < 1.0D) {
                var12 = var14;
            } else if (arg3 * 3.0D < 2.0D) {
                var12 = (var14 - var20) * (-arg3 + 0.6666666666666666D) * 6.0D + var20;
            } else {
                var12 = var20;
            }
            if (var16 > 1.0D) {
                var16--;
            }
            if (var16 * 6.0D < 1.0D) {
                var8 = (var14 - var20) * 6.0D * var16 + var20;
            } else if (var16 * 2.0D < 1.0D) {
                var8 = var14;
            } else if (var16 * 3.0D < 2.0D) {
                var8 = (var14 - var20) * (0.6666666666666666D - var16) * 6.0D + var20;
            } else {
                var8 = var20;
            }
        }
        int var24 = (int) (var8 * 256.0D);
        int var25 = (int) (var10 * 256.0D);
        int var26 = (int) (var12 * 256.0D);
        return (var24 << 16) + var25 + (var26 << 8);
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(B)V", line = 767)
    public final void method42(byte arg0) {
        class1.method2(arg0);
        class27.method177(class27.field324, 1);
        PixMap.method139(-14688, class27.field324);
        this.field253 = class3.method9(arg0 + 58);
        class17.method71(PixMap.field223, null, -18, ++class13.field131 * 10);
        this.method156(0);
        class3.field21 = this.method158(class34.field385, "main_file_cache.idx0", -14185);
        if (class3.field21 == null) {
            return;
        }
        class21.field207 = new class18[1];
        class21.field207[0] = this.method158(class2.field9, "main_file_cache.dat0", -14185);
        if (class21.field207[0] == null) {
            return;
        }
        class17.method71(PixMap.field223, null, -18, ++class13.field131 * 10);
        this.field246 = class30.method191(field252, class5.field43, (byte) -104, class3.field21);
        this.field262 = class28.method184((byte) 115, class5.field43, class14.field136, class3.field21);
        this.field259 = class31.method197(class3.field21, (byte) -80, class5.field43, class16.field147);
        this.field255 = new class22(11, true, this);
        this.field265 = new class22(12, true, this);
        this.field277 = new class22(14, true, this);
        this.field299 = new class22(17, true, this);
        this.field270 = new class22(19, true, this);
        this.field247 = new class22(22, true, this);
        this.field287 = new class22(26, true, this);
        this.field244 = new class22(30, true, this);
        class17.method71(class11.field87, null, -18, 100);
        this.method151(arg0 ^ 0xFFFFA213);
        class34.field392 = true;
    }

    @OriginalMember(owner = "mapview!mapview", name = "b", descriptor = "(ILjava/lang/String;)[B", line = 815)
    private final byte[] method146(int arg0, String arg1) throws IOException {
        File var3 = new File(arg1);
        if (arg0 != 0) {
            this.method149(null, null, -83);
        }
        if (!var3.exists()) {
            return null;
        }
        int var4 = (int) var3.length();
        byte[] var5 = new byte[var4];
        DataInputStream var6 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg1)));
        var6.readFully(var5, 0, var4);
        var6.close();
        return var5;
    }

    @OriginalMember(owner = "mapview!mapview", name = "h", descriptor = "(I)V", line = 841)
    private final void method147(int arg0) {
        class31.field364 = false;
        try {
            Graphics var2 = class27.field324.getGraphics();
            class10.drawArea.method74(0, 0, var2, false);
        } catch (Exception var4) {
            class27.field324.repaint();
        }
        if (arg0 != -1) {
            this.method150(-89, -54);
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(IIIII[IIII)V", line = 869)
    private final void method148(int arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, int arg6, int arg7, int arg8) {
        int var10 = Draw2D.field310 - arg7;
        if (arg4 == 9) {
            arg0 = arg0 + 1 & 0x3;
            arg4 = 1;
        }
        if (arg4 == 10) {
            arg4 = 1;
            arg0 = arg0 + 3 & 0x3;
        }
        if (arg4 == 11) {
            arg0 = arg0 + 3 & 0x3;
            arg4 = 8;
        }
        if (arg4 == 1) {
            if (arg0 == 0) {
                for (int var17 = 0; var17 < arg3; var17++) {
                    for (int var18 = 0; var18 < arg7; var18++) {
                        if (var18 <= var17) {
                            arg5[arg6++] = arg8;
                        } else {
                            arg5[arg6++] = arg1;
                        }
                    }
                    arg6 += var10;
                }
            } else if (arg0 == 1) {
                for (int var11 = arg3 - 1; var11 >= 0; var11--) {
                    for (int var12 = 0; var12 < arg7; var12++) {
                        if (var12 <= var11) {
                            arg5[arg6++] = arg8;
                        } else {
                            arg5[arg6++] = arg1;
                        }
                    }
                    arg6 += var10;
                }
            } else if (arg0 == 2) {
                for (int var13 = 0; var13 < arg3; var13++) {
                    for (int var14 = 0; var14 < arg7; var14++) {
                        if (var14 < var13) {
                            arg5[arg6++] = arg1;
                        } else {
                            arg5[arg6++] = arg8;
                        }
                    }
                    arg6 += var10;
                }
            } else if (arg0 == 3) {
                for (int var15 = arg3 - 1; var15 >= 0; var15--) {
                    for (int var16 = 0; var16 < arg7; var16++) {
                        if (var15 <= var16) {
                            arg5[arg6++] = arg8;
                        } else {
                            arg5[arg6++] = arg1;
                        }
                    }
                    arg6 += var10;
                }
            }
        } else if (arg4 == 2) {
            if (arg0 == 0) {
                for (int var25 = arg3 - 1; var25 >= 0; var25--) {
                    for (int var26 = 0; var26 < arg7; var26++) {
                        if (var26 > var25 >> 1) {
                            arg5[arg6++] = arg1;
                        } else {
                            arg5[arg6++] = arg8;
                        }
                    }
                    arg6 += var10;
                }
            } else if (arg0 == 1) {
                for (int var19 = 0; var19 < arg3; var19++) {
                    for (int var20 = 0; var20 < arg7; var20++) {
                        if (var20 < var19 << 1) {
                            arg5[arg6++] = arg1;
                        } else {
                            arg5[arg6++] = arg8;
                        }
                    }
                    arg6 += var10;
                }
            } else if (arg0 == 2) {
                for (int var23 = 0; var23 < arg3; var23++) {
                    for (int var24 = arg7 - 1; var24 >= 0; var24--) {
                        if (var23 >> 1 >= var24) {
                            arg5[arg6++] = arg8;
                        } else {
                            arg5[arg6++] = arg1;
                        }
                    }
                    arg6 += var10;
                }
            } else if (arg0 == 3) {
                for (int var21 = arg3 - 1; var21 >= 0; var21--) {
                    for (int var22 = arg7 - 1; var22 >= 0; var22--) {
                        if (var21 << 1 <= var22) {
                            arg5[arg6++] = arg8;
                        } else {
                            arg5[arg6++] = arg1;
                        }
                    }
                    arg6 += var10;
                }
            }
        } else if (arg4 == 3) {
            if (arg0 == 0) {
                for (int var27 = arg3 - 1; var27 >= 0; var27--) {
                    for (int var28 = arg7 - 1; var28 >= 0; var28--) {
                        if (var28 > var27 >> 1) {
                            arg5[arg6++] = arg1;
                        } else {
                            arg5[arg6++] = arg8;
                        }
                    }
                    arg6 += var10;
                }
            } else if (arg0 == 1) {
                for (int var29 = arg3 - 1; var29 >= 0; var29--) {
                    for (int var30 = 0; var30 < arg7; var30++) {
                        if (var29 << 1 <= var30) {
                            arg5[arg6++] = arg8;
                        } else {
                            arg5[arg6++] = arg1;
                        }
                    }
                    arg6 += var10;
                }
            } else if (arg0 == 2) {
                for (int var33 = 0; var33 < arg3; var33++) {
                    for (int var34 = 0; var34 < arg7; var34++) {
                        if (var33 >> 1 >= var34) {
                            arg5[arg6++] = arg8;
                        } else {
                            arg5[arg6++] = arg1;
                        }
                    }
                    arg6 += var10;
                }
            } else if (arg0 == 3) {
                for (int var31 = 0; var31 < arg3; var31++) {
                    for (int var32 = arg7 - 1; var32 >= 0; var32--) {
                        if (var31 << 1 <= var32) {
                            arg5[arg6++] = arg8;
                        } else {
                            arg5[arg6++] = arg1;
                        }
                    }
                    arg6 += var10;
                }
            }
        } else if (arg4 == 4) {
            if (arg0 == 0) {
                for (int var73 = arg3 - 1; var73 >= 0; var73--) {
                    for (int var74 = 0; var74 < arg7; var74++) {
                        if (var73 >> 1 <= var74) {
                            arg5[arg6++] = arg8;
                        } else {
                            arg5[arg6++] = arg1;
                        }
                    }
                    arg6 += var10;
                }
            } else if (arg0 == 1) {
                for (int var67 = 0; var67 < arg3; var67++) {
                    for (int var68 = 0; var68 < arg7; var68++) {
                        if (var67 << 1 >= var68) {
                            arg5[arg6++] = arg8;
                        } else {
                            arg5[arg6++] = arg1;
                        }
                    }
                    arg6 += var10;
                }
            } else if (arg0 == 2) {
                for (int var69 = 0; var69 < arg3; var69++) {
                    for (int var70 = arg7 - 1; var70 >= 0; var70--) {
                        if (var70 >= var69 >> 1) {
                            arg5[arg6++] = arg8;
                        } else {
                            arg5[arg6++] = arg1;
                        }
                    }
                    arg6 += var10;
                }
            } else if (arg0 == 3) {
                for (int var71 = arg3 - 1; var71 >= 0; var71--) {
                    for (int var72 = arg7 - 1; var72 >= 0; var72--) {
                        if (var72 > var71 << 1) {
                            arg5[arg6++] = arg1;
                        } else {
                            arg5[arg6++] = arg8;
                        }
                    }
                    arg6 += var10;
                }
            }
        } else if (arg4 != 5) {
            if (arg4 == 6) {
                if (arg0 == 0) {
                    for (int var43 = 0; var43 < arg3; var43++) {
                        for (int var44 = 0; var44 < arg7; var44++) {
                            if (var44 > arg7 / 2) {
                                arg5[arg6++] = arg1;
                            } else {
                                arg5[arg6++] = arg8;
                            }
                        }
                        arg6 += var10;
                    }
                    return;
                }
                if (arg0 == 1) {
                    for (int var45 = 0; var45 < arg3; var45++) {
                        for (int var46 = 0; var46 < arg7; var46++) {
                            if (arg3 / 2 >= var45) {
                                arg5[arg6++] = arg8;
                            } else {
                                arg5[arg6++] = arg1;
                            }
                        }
                        arg6 += var10;
                    }
                    return;
                }
                if (arg0 == 2) {
                    for (int var65 = 0; var65 < arg3; var65++) {
                        for (int var66 = 0; var66 < arg7; var66++) {
                            if (var66 >= arg7 / 2) {
                                arg5[arg6++] = arg8;
                            } else {
                                arg5[arg6++] = arg1;
                            }
                        }
                        arg6 += var10;
                    }
                    return;
                }
                if (arg0 == 3) {
                    for (int var47 = 0; var47 < arg3; var47++) {
                        for (int var48 = 0; var48 < arg7; var48++) {
                            if (var47 < arg3 / 2) {
                                arg5[arg6++] = arg1;
                            } else {
                                arg5[arg6++] = arg8;
                            }
                        }
                        arg6 += var10;
                    }
                    return;
                }
            }
            if (arg2 < 80) {
                this.field246 = null;
            }
            if (arg4 == 7) {
                if (arg0 == 0) {
                    for (int var55 = 0; var55 < arg3; var55++) {
                        for (int var56 = 0; var56 < arg7; var56++) {
                            if (var56 > var55 - arg3 / 2) {
                                arg5[arg6++] = arg1;
                            } else {
                                arg5[arg6++] = arg8;
                            }
                        }
                        arg6 += var10;
                    }
                    return;
                }
                if (arg0 == 1) {
                    for (int var49 = arg3 - 1; var49 >= 0; var49--) {
                        for (int var50 = 0; var50 < arg7; var50++) {
                            if (var50 > var49 - arg3 / 2) {
                                arg5[arg6++] = arg1;
                            } else {
                                arg5[arg6++] = arg8;
                            }
                        }
                        arg6 += var10;
                    }
                    return;
                }
                if (arg0 == 2) {
                    for (int var53 = arg3 - 1; var53 >= 0; var53--) {
                        for (int var54 = arg7 - 1; var54 >= 0; var54--) {
                            if (var53 - arg3 / 2 < var54) {
                                arg5[arg6++] = arg1;
                            } else {
                                arg5[arg6++] = arg8;
                            }
                        }
                        arg6 += var10;
                    }
                    return;
                }
                if (arg0 == 3) {
                    for (int var51 = 0; var51 < arg3; var51++) {
                        for (int var52 = arg7 - 1; var52 >= 0; var52--) {
                            if (var52 <= var51 - arg3 / 2) {
                                arg5[arg6++] = arg8;
                            } else {
                                arg5[arg6++] = arg1;
                            }
                        }
                        arg6 += var10;
                    }
                    return;
                }
            }
            if (arg4 == 8) {
                if (arg0 == 0) {
                    for (int var57 = 0; var57 < arg3; var57++) {
                        for (int var58 = 0; var58 < arg7; var58++) {
                            if (var57 - arg3 / 2 <= var58) {
                                arg5[arg6++] = arg8;
                            } else {
                                arg5[arg6++] = arg1;
                            }
                        }
                        arg6 += var10;
                    }
                    return;
                }
                if (arg0 == 1) {
                    for (int var63 = arg3 - 1; var63 >= 0; var63--) {
                        for (int var64 = 0; var64 < arg7; var64++) {
                            if (var63 - arg3 / 2 <= var64) {
                                arg5[arg6++] = arg8;
                            } else {
                                arg5[arg6++] = arg1;
                            }
                        }
                        arg6 += var10;
                    }
                    return;
                }
                if (arg0 == 2) {
                    for (int var61 = arg3 - 1; var61 >= 0; var61--) {
                        for (int var62 = arg7 - 1; var62 >= 0; var62--) {
                            if (var62 < var61 - arg3 / 2) {
                                arg5[arg6++] = arg1;
                            } else {
                                arg5[arg6++] = arg8;
                            }
                        }
                        arg6 += var10;
                    }
                    return;
                }
                if (arg0 == 3) {
                    for (int var59 = 0; var59 < arg3; var59++) {
                        for (int var60 = arg7 - 1; var60 >= 0; var60--) {
                            if (var60 < var59 - arg3 / 2) {
                                arg5[arg6++] = arg1;
                            } else {
                                arg5[arg6++] = arg8;
                            }
                        }
                        arg6 += var10;
                    }
                    return;
                }
            }
        } else if (arg0 == 0) {
            for (int var41 = arg3 - 1; var41 >= 0; var41--) {
                for (int var42 = arg7 - 1; var42 >= 0; var42--) {
                    if (var41 >> 1 > var42) {
                        arg5[arg6++] = arg1;
                    } else {
                        arg5[arg6++] = arg8;
                    }
                }
                arg6 += var10;
            }
        } else if (arg0 == 1) {
            for (int var35 = arg3 - 1; var35 >= 0; var35--) {
                for (int var36 = 0; var36 < arg7; var36++) {
                    if (var35 << 1 >= var36) {
                        arg5[arg6++] = arg8;
                    } else {
                        arg5[arg6++] = arg1;
                    }
                }
                arg6 += var10;
            }
        } else if (arg0 == 2) {
            for (int var37 = 0; var37 < arg3; var37++) {
                for (int var38 = 0; var38 < arg7; var38++) {
                    if (var37 >> 1 > var38) {
                        arg5[arg6++] = arg1;
                    } else {
                        arg5[arg6++] = arg8;
                    }
                }
                arg6 += var10;
            }
        } else if (arg0 == 3) {
            for (int var39 = 0; var39 < arg3; var39++) {
                for (int var40 = arg7 - 1; var40 >= 0; var40--) {
                    if (var39 << 1 < var40) {
                        arg5[arg6++] = arg1;
                    } else {
                        arg5[arg6++] = arg8;
                    }
                }
                arg6 += var10;
            }
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "([[I[[BI)V", line = 1818)
    private final void method149(int[][] arg0, byte[][] arg1, int arg2) {
        int var4 = class4.sizeX;
        int var5 = class2.sizeZ;
        int[] var6 = new int[var5];
        for (int var7 = 0; var7 < var5; var7++) {
            var6[var7] = 0;
        }
        if (arg2 < 20) {
            this.field290 = -127;
        }
        for (int var8 = 5; var8 < var4 - 5; var8++) {
            byte[] var9 = arg1[var8 + 5];
            byte[] var10 = arg1[var8 - 5];
            for (int var11 = 0; var11 < var5; var11++) {
                var6[var11] += -this.field281[PixMap.method140(255, var10[var11])] + this.field281[PixMap.method140(var9[var11], 255)];
            }
            if (var8 > 10 && var8 < var4 - 10) {
                int var12 = 0;
                int[] var13 = arg0[var8];
                int var14 = 0;
                int var15 = 0;
                for (int var16 = 5; var16 < var5 - 5; var16++) {
                    int var17 = var6[var16 - 5];
                    int var18 = var6[var16 + 5];
                    var12 += (var18 >> 20) - (var17 >> 20);
                    var14 += (var18 & 0x3FF) - (var17 & 0x3FF);
                    var15 += (var18 >> 10 & 0x3FF) - ((var17 & 0xFFD7B) >> 10);
                    if (var14 > 0) {
                        var13[var16] = this.method145(-20, (double) var14 / 8533.0D, (double) var15 / 8533.0D, (double) var12 / 8533.0D);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "b", descriptor = "(II)V", line = 1891)
    private final void method150(int arg0, int arg1) {
        if (class21.field207.length > arg0) {
            this.method162(arg0, 27919);
            this.imageOverview = new Pix24(this.imageOverviewWidth, this.imageOverviewHeight);
            this.imageOverview.bind();
            this.drawMap(0, 0, class2.sizeZ, class4.sizeX, 125, 0, this.imageOverviewWidth, this.imageOverviewHeight, 0);
            Draw2D.drawRect(0, 0, this.imageOverviewWidth, this.imageOverviewHeight, 0);
            Draw2D.drawRect(1, 1, this.imageOverviewWidth - 2, this.imageOverviewHeight + -2, this.field290);
            class10.drawArea.bind(false);
        }
        if (arg1 != -32596) {
            this.method56((byte) -36);
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "i", descriptor = "(I)V", line = 1933)
    private final void method151(int arg0) {
        if (class21.field207.length == 1) {
            class18.field163 = 0;
        } else {
            if (class29.field346 >= 0) {
                class18.field163 = class29.field346;
            } else {
                class18.field163 = this.method152((byte) 91, class18.field163);
            }
            class29.field346 = this.method152((byte) 88, class18.field163);
        }
        this.method150(class18.field163, -32596);
        if (arg0 != -23979) {
            this.field236 = -3.1030769300381964D;
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(BI)I", line = 1966)
    private final int method152(byte arg0, int arg1) {
        arg1++;
        if (class21.field207.length <= arg1) {
            arg1 = 0;
        }
        return arg0 < 80 ? -41 : arg1;
    }

    @OriginalMember(owner = "mapview!mapview", name = "d", descriptor = "(I)V", line = 1986)
    public final void method50(int arg0) {
        class16.method62((byte) -113);
        class30.method194((byte) 124);
        try {
            this.field282 = null;
            this.field283 = null;
            this.field267 = null;
            this.field303 = null;
            this.field262 = null;
            this.field281 = null;
            this.field289 = null;
            this.field263 = null;
            this.field249 = null;
            this.field259 = null;
            this.field246 = null;
            this.field253 = null;
            this.field276 = null;
            this.field274 = null;
            if (arg0 != -5758) {
                this.method159(null, null, -64);
            }
            this.field294 = null;
            this.field239 = null;
            this.field251 = null;
            this.field266 = null;
            this.field245 = null;
            this.field300 = null;
            this.imageOverview = null;
            this.field238 = null;
            this.field279 = null;
            System.gc();
        } catch (Throwable var3) {
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(Ll;IIIIIIII)V", line = 2030)
    private final void method153(class21 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        Draw2D.drawRect(arg2, arg8, arg1, arg7, 0);
        int var10 = arg1 - 2;
        int var13 = arg8 + 1;
        int var11 = arg2 + 1;
        int var12 = arg7 - 2;
        Draw2D.method167(var11, var13, var10, var12, arg5);
        Draw2D.method164(var11, var13, var10, arg3);
        Draw2D.method166(var11, var13, var12, arg3);
        Draw2D.method164(var11, var13 + var12 - 1, var10, arg4);
        Draw2D.method166(var11 + var10 - 1, var13, var12, arg4);
        if (arg6 != 30209) {
            this.method153(null, -53, -84, -13, 105, -109, 29, 93, -82);
        }
        this.field259.method38(arg0, var10 / 2 + var11 + 1, var13 + 1 - (-(var12 / 2) + -4), 0);
        this.field259.method38(arg0, var11 + var10 / 2, var12 / 2 + var13 + 4, 16777215);
    }

    @OriginalMember(owner = "mapview!mapview", name = "e", descriptor = "(B)V", line = 2058)
    public static void method154(byte arg0) {
        field272 = null;
        field252 = null;
        field241 = null;
        int var1 = 71 / ((arg0 - 15) / 51);
        field302 = null;
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(Ljava/lang/String;Ll;I)[B", line = 2071)
    private final byte[] method155(String arg0, class21 arg1, int arg2) {
        class17.method71(class14.field135, null, -18, 0);
        try {
            String var4;
            if (arg0 == "main_file_cache.dat0") {
                var4 = "worldmap.main.js5?crc=-1172959463";
            } else if (arg0 == "main_file_cache.dat1") {
                var4 = "worldmap.dungeon.js5?crc=-2033174729";
            } else if (arg0 == "main_file_cache.dat2") {
                var4 = "worldmap.extra.js5?crc=1837527022";
            } else {
                var4 = "mapview.sprites.js5?crc=-400838696";
            }
            DataInputStream var5 = new DataInputStream((new URL(this.getCodeBase(), var4)).openStream());
            int var6 = 0;
            int var7 = 0;
            int var8;
            if (arg0 == "main_file_cache.dat0") {
                var8 = 369527;
            } else if (arg0 == "main_file_cache.dat1") {
                var8 = 140316;
            } else if (arg0 == "main_file_cache.dat2") {
                var8 = 97276;
            } else {
                var8 = 8193;
            }
            byte[] var9 = new byte[var8];
            while (var7 < var8) {
                int var10 = var8 - var7;
                if (var10 > 1000) {
                    var10 = 1000;
                }
                int var11 = var5.read(var9, var7, var10);
                if (var11 < 0) {
                    throw new EOFException();
                }
                var7 += var11;
                int var12 = var7 * 100 / var8;
                if (var6 != var12) {
                    class17.method71(class28.method183(0, new class21[] { class1.field5, arg1, field241, class14.method54(10, var12), class5.field40 }), null, -18, var12);
                }
                var6 = var12;
            }
            var5.close();
            if (arg2 != 1000) {
                return (byte[]) null;
            } else if (this.method159(var9, arg0, -12078)) {
                return var9;
            } else {
                this.method57("download", -108);
                return null;
            }
        } catch (IOException var14) {
            this.method57("download", -107);
            return null;
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "g", descriptor = "(I)V", line = 2157)
    public final void method53(int arg0) {
        if (arg0 != 2) {
            field291 = 89;
        }
        if (!class34.field392) {
            return;
        }
        if (this.field237) {
            this.field237 = false;
            class31.field364 = true;
            Draw2D.method171();
            int var2 = class21.field202 - (int) (635.0D / this.field236);
            int var3 = class21.field202 + (int) (635.0D / this.field236);
            int var4 = class5.field41 - (int) (503.0D / this.field236);
            int var5 = (int) (503.0D / this.field236) + class5.field41;
            this.drawMap(0, 0, var5, var3, 103, var2, 635, 503, var4);
            if (this.field235) {
                this.imageOverview.method22(this.overviewX, this.overviewY);
                Draw2D.method170(this.overviewX + this.imageOverviewWidth * var2 / class4.sizeX, this.imageOverviewHeight * var4 / class2.sizeZ + this.overviewY, (var3 - var2) * this.imageOverviewWidth / class4.sizeX, (var5 - var4) * this.imageOverviewHeight / class2.sizeZ, 16711680, 128);
                Draw2D.drawRect(this.imageOverviewWidth * var2 / class4.sizeX + this.overviewX, this.imageOverviewHeight * var4 / class2.sizeZ + this.overviewY, (var3 - var2) * this.imageOverviewWidth / class4.sizeX, (var5 - var4) * this.imageOverviewHeight / class2.sizeZ, 16711680);
                if (this.field268 > 0 && this.field268 % 10 < 5) {
                    for (int var6 = 0; var6 < this.field264; var6++) {
                        if (this.field303[var6] == this.field273) {
                            int var7 = this.field276[var6] * this.imageOverviewWidth / class4.sizeX + this.overviewX;
                            int var8 = this.field267[var6] * this.imageOverviewHeight / class2.sizeZ + this.overviewY;
                            Draw2D.method168(var7, var8, 2, 16776960, 256);
                        }
                    }
                }
            }
            if (this.field257) {
                this.method153(class20.field184, this.field297, this.field261, 10066329, 5592405, 7829367, 30209, 18, this.field250);
                this.method153(class5.field43, this.field297, this.field261, 10066329, 5592405, 7829367, 30209, this.field292 - 36, this.field250 + 18);
                this.method153(class21.field212, this.field297, this.field261, 10066329, 5592405, 7829367, 30209, 18, this.field250 + this.field292 - 18);
                int var9 = this.field250 + 3 + 18;
                for (int var10 = 0; var10 < 25; var10++) {
                    if (this.field262.length > this.field254 + var10 && this.field253.length > var10 + this.field254) {
                        if (this.field253[this.field254 + var10].method101(class21.field208, (byte) 87)) {
                            continue;
                        }
                        this.field262[this.field254 + var10].method24(this.field261 + 3, var9);
                        this.field259.method35(this.field253[this.field254 + var10], this.field261 + 21, var9 + 14, 0);
                        int var11 = 16777215;
                        if (var10 + this.field254 == this.field286) {
                            var11 = 12298922;
                        }
                        if (this.field268 > 0 && this.field268 % 10 < 5 && var10 + this.field254 == this.field273) {
                            var11 = 16776960;
                        }
                        this.field259.method35(this.field253[var10 + this.field254], this.field261 + 20, var9 + 13, var11);
                    }
                    var9 += 17;
                }
            }
            if (class21.field207.length == 1) {
                this.method153(class4.field28, this.imageOverviewWidth, this.overviewX, this.field290, this.field240, this.field304, 30209, 18, this.overviewY + this.imageOverviewHeight);
                this.method153(class27.field325, this.field297, this.field261, this.field290, this.field240, this.field304, 30209, 18, this.field292 + this.field250);
                if (this.field242 == 3.0D) {
                    this.method153(class5.field42, 50, 170, this.field248, this.field280, this.field298, arg0 ^ 0x7603, 30, 471);
                } else {
                    this.method153(class5.field42, 50, 170, this.field290, this.field240, this.field304, 30209, 30, 471);
                }
                if (this.field242 == 4.0D) {
                    this.method153(class34.field390, 50, 230, this.field248, this.field280, this.field298, 30209, 30, 471);
                } else {
                    this.method153(class34.field390, 50, 230, this.field290, this.field240, this.field304, 30209, 30, 471);
                }
                if (this.field242 == 6.0D) {
                    this.method153(class28.field330, 50, 290, this.field248, this.field280, this.field298, 30209, 30, 471);
                } else {
                    this.method153(class28.field330, 50, 290, this.field290, this.field240, this.field304, 30209, 30, 471);
                }
                if (this.field242 == 8.0D) {
                    this.method153(class17.field152, 50, 350, this.field248, this.field280, this.field298, arg0 + 30207, 30, 471);
                } else {
                    this.method153(class17.field152, 50, 350, this.field290, this.field240, this.field304, arg0 ^ 0x7603, 30, 471);
                }
            } else {
                this.method153(class4.field28, this.imageOverviewWidth, this.overviewX, this.field290, this.field240, this.field304, 30209, 18, this.overviewY + this.imageOverviewHeight);
                this.method153(class27.field325, this.field297, this.field261, this.field290, this.field240, this.field304, 30209, 18, this.field292 + this.field250);
                this.method163(this.field304, false);
                if (this.field242 == 3.0D) {
                    this.method153(class5.field42, 50, 170, this.field248, this.field280, this.field298, 30209, 30, 451);
                } else {
                    this.method153(class5.field42, 50, 170, this.field290, this.field240, this.field304, 30209, 30, 451);
                }
                if (this.field242 == 4.0D) {
                    this.method153(class34.field390, 50, 230, this.field248, this.field280, this.field298, 30209, 30, 451);
                } else {
                    this.method153(class34.field390, 50, 230, this.field290, this.field240, this.field304, 30209, 30, 451);
                }
                if (this.field242 == 6.0D) {
                    this.method153(class28.field330, 50, 290, this.field248, this.field280, this.field298, arg0 ^ 0x7603, 30, 451);
                } else {
                    this.method153(class28.field330, 50, 290, this.field290, this.field240, this.field304, 30209, 30, 451);
                }
                if (this.field242 == 8.0D) {
                    this.method153(class17.field152, 50, 350, this.field248, this.field280, this.field298, 30209, 30, 451);
                } else {
                    this.method153(class17.field152, 50, 350, this.field290, this.field240, this.field304, arg0 ^ 0x7603, 30, 451);
                }
            }
        }
        if (class31.field364) {
            this.method147(-1);
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "j", descriptor = "(I)V", line = 2314)
    private final void method156(int arg0) {
        String var3;
        try {
            String var2 = System.getProperty("user.home");
            if (var2 == null) {
                var3 = "~/";
            } else {
                var3 = var2 + "/";
            }
        } catch (Exception var13) {
            var3 = "~/";
        }
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "d:/windows/", "d:/winnt/", "e:/windows/", "e:/winnt/", "f:/windows/", "f:/winnt/", "c:/", var3, "/tmp/", "" };
        String var6 = ".file_store_32";
        for (int var7 = arg0; var7 < var5.length; var7++) {
            try {
                String var8 = var5[var7];
                if (var8.length() > 0) {
                    File var9 = new File(var8);
                    if (!var9.exists()) {
                        continue;
                    }
                }
                File var10 = new File(var8 + var6);
                if (var10.exists() || var10.mkdir()) {
                    File var11 = new File(var10, "rsmap");
                    if (var11.exists() || var11.mkdir()) {
                        class17.field156 = var8 + var6 + "/rsmap/";
                        return;
                    }
                }
            } catch (Exception var14) {
            }
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "([BZ[[B)V", line = 2393)
    private final void method157(byte[] arg0, boolean arg1, byte[][] arg2) {
        int var4 = 0;
        if (arg1) {
            return;
        }
        while (true) {
            while (var4 < arg0.length) {
                int var5 = (arg0[var4++] & 0xFF) * 64 - class18.field162;
                int var6 = (arg0[var4++] & 0xFF) * 64 - class27.field323;
                if (var5 > 0 && var6 > 0 && class4.sizeX > var5 + 64 && var6 + 64 < class2.sizeZ) {
                    for (int var7 = 0; var7 < 64; var7++) {
                        int var8 = class2.sizeZ - var6 - 1;
                        byte[] var9 = arg2[var5 + var7];
                        for (int var10 = -64; var10 < 0; var10++) {
                            var9[var8--] = arg0[var4++];
                        }
                    }
                } else {
                    var4 += 4096;
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(Ll;Ljava/lang/String;I)Lja;", line = 2450)
    private final class18 method158(class21 arg0, String arg1, int arg2) {
        Object var4 = null;
        if (class17.field156 != null) {
            try {
                byte[] var5 = this.method146(arg2 + 14185, class17.field156 + "/" + arg1);
                if (!this.method159(var5, arg1, -12078)) {
                    var5 = null;
                }
                if (var5 != null) {
                    return new class18(var5, false, true);
                }
            } catch (IOException var13) {
                Object var7 = null;
            }
        }
        if (arg2 != -14185) {
            this.field265 = null;
        }
        byte[] var8 = this.method155(arg1, arg0, 1000);
        if (var8 == null) {
            return null;
        }
        if (class17.field156 != null && var8 != null) {
            try {
                this.method160(class17.field156 + "/" + arg1, 21889, var8);
            } catch (IOException var12) {
            }
        }
        try {
            return new class18(var8, false, true);
        } catch (IOException var11) {
            throw class20.method91(var11, "monkey feet");
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "([BLjava/lang/String;I)Z", line = 2505)
    private final boolean method159(byte[] arg0, String arg1, int arg2) {
        if (arg0 == null) {
            return false;
        }
        try {
            MessageDigest var4 = MessageDigest.getInstance("SHA");
            var4.reset();
            var4.update(arg0);
            if (arg2 != -12078) {
                this.field279 = null;
            }
            byte[] var5 = var4.digest();
            if (arg1 == "main_file_cache.dat0") {
                if (var5[0] != -39 || var5[1] != 116 || var5[2] != 46 || var5[3] != -49 || var5[4] != -58 || var5[5] != 27 || var5[6] != -12 || var5[7] != -77 || var5[8] != 57 || var5[9] != 118 || var5[10] != -81 || var5[11] != -81 || var5[12] != -109 || var5[13] != 71 || var5[14] != 125 || var5[15] != 115 || var5[16] != -29 || var5[17] != -75 || var5[18] != 16 || var5[19] != 73) {
                    return false;
                }
            } else if (var5[0] != -92 || var5[1] != 39 || var5[2] != 64 || var5[3] != -65 || var5[4] != 55 || var5[5] != 63 || var5[6] != -117 || var5[7] != 11 || var5[8] != -119 || var5[9] != 48 || var5[10] != 21 || var5[11] != -1 || var5[12] != -64 || var5[13] != 114 || var5[14] != 118 || var5[15] != 40 || var5[16] != 75 || var5[17] != 108 || var5[18] != -94 || var5[19] != 27) {
                return false;
            }
            return true;
        } catch (Exception var7) {
            this.method57("sha", arg2 ^ 0x2F57);
            return false;
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(Ljava/lang/String;I[B)V", line = 2543)
    private final void method160(String arg0, int arg1, byte[] arg2) throws IOException {
        FileOutputStream var4 = new FileOutputStream(arg0);
        if (arg1 == 21889) {
            var4.write(arg2, 0, arg2.length);
            var4.close();
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "d", descriptor = "(B)V", line = 2620)
    public final void method56(byte arg0) {
        if (!class34.field392) {
            return;
        }
        if (arg0 != 119) {
            this.method161(null, null, 33, null, null);
        }
        if (class27.field322) {
            class28.method182(arg0 - 19036, class27.field324);
            class17.method72(-123, class27.field324);
            this.method52(-78);
            class27.method177(class27.field324, 1);
            PixMap.method139(-14688, class27.field324);
        }
        PixMap.method137(24657);
        class2.method6(0);
        if (class17.field153[96]) {
            class21.field202 = (int) ((double) class21.field202 - 16.0D / this.field236);
            this.field237 = true;
        }
        if (class17.field153[97]) {
            class21.field202 = (int) (16.0D / this.field236 + (double) class21.field202);
            this.field237 = true;
        }
        if (class17.field153[98]) {
            this.field237 = true;
            class5.field41 = (int) ((double) class5.field41 - 16.0D / this.field236);
        }
        if (class17.field153[99]) {
            this.field237 = true;
            class5.field41 = (int) (16.0D / this.field236 + (double) class5.field41);
        }
        while (true) {
            do {
                if (!class4.method10(-26469)) {
                    int var2 = class5.field39;
                    int var3 = class14.field138;
                    int var4 = class20.field181;
                    int var5 = class6.field49;
                    int var6 = class17.field158;
                    int var7 = class28.field336;
                    if (var7 == 1) {
                        this.field293 = var5;
                        this.field295 = class5.field41;
                        this.field269 = var3;
                        this.field243 = class21.field202;
                        if (class21.field207.length == 1) {
                            if (var3 > 170 && var3 < 220 && var5 > 471 && var5 < 503) {
                                this.field242 = 3.0D;
                                this.field269 = -1;
                            }
                            if (var3 > 230 && var3 < 280 && var5 > 471 && var5 < 503) {
                                this.field269 = -1;
                                this.field242 = 4.0D;
                            }
                            if (var3 > 290 && var3 < 340 && var5 > 471 && var5 < 503) {
                                this.field242 = 6.0D;
                                this.field269 = -1;
                            }
                            if (var3 > 350 && var3 < 400 && var5 > 471 && var5 < 503) {
                                this.field269 = -1;
                                this.field242 = 8.0D;
                            }
                        } else {
                            if (var3 > 170 && var3 < 220 && var5 > 451 && var5 < 483) {
                                this.field269 = -1;
                                this.field242 = 3.0D;
                            }
                            if (var3 > 230 && var3 < 280 && var5 > 451 && var5 < 483) {
                                this.field269 = -1;
                                this.field242 = 4.0D;
                            }
                            if (var3 > 290 && var3 < 340 && var5 > 451 && var5 < 483) {
                                this.field269 = -1;
                                this.field242 = 6.0D;
                            }
                            if (var3 > 350 && var3 < 400 && var5 > 451 && var5 < 483) {
                                this.field269 = -1;
                                this.field242 = 8.0D;
                            }
                            if (var3 > 170 && var3 < 400 && var5 > 483 && var5 < 503) {
                                this.method163(this.field298, false);
                                this.method147(-1);
                                this.method151(-23979);
                                this.field269 = -1;
                            }
                        }
                        this.field256 = false;
                        this.field237 = true;
                        if (this.field261 < var3 && this.field292 + this.field250 < var5 && this.field297 + this.field261 > var3 && var5 < 503) {
                            this.field269 = -1;
                            this.field257 = !this.field257;
                        }
                        if (var3 > this.overviewX && var5 > this.overviewY + this.imageOverviewHeight && var3 < this.overviewX + this.imageOverviewWidth && var5 < 503) {
                            this.field269 = -1;
                            this.field235 = !this.field235;
                        }
                        if (this.field257) {
                            if (var3 > this.field261 && this.field250 < var5 && var3 < this.field297 + this.field261 && this.field250 + 18 > var5 && this.field284 > 0) {
                                this.field284 -= 25;
                            }
                            if (this.field261 < var3 && this.field292 + this.field250 - 18 < var5 && this.field297 + this.field261 > var3 && var5 < this.field292 + this.field250 && this.field284 < 50) {
                                this.field284 += 25;
                            }
                            if (this.field261 < var3 && var5 > this.field250 && this.field297 + this.field261 > var3 && var5 < this.field292 + this.field250) {
                                this.field269 = -1;
                            }
                        }
                        if (this.field235 && var3 > this.overviewX && this.overviewY < var5 && this.overviewX + this.imageOverviewWidth > var3 && var5 < this.overviewY + this.imageOverviewHeight) {
                            class5.field41 = (var5 - this.overviewY) * class2.sizeZ / this.imageOverviewHeight;
                            this.field269 = -1;
                            class21.field202 = (var3 - this.overviewX) * class4.sizeX / this.imageOverviewWidth;
                            this.field256 = true;
                        }
                    }
                    if (this.field257) {
                        this.field286 = -1;
                        if (var6 > this.field261 && var6 < this.field297 + this.field261) {
                            int var8 = this.field250 + 26;
                            for (int var9 = 0; var9 < 25; var9++) {
                                if (this.field254 + var9 >= this.field253.length || !this.field253[var9 + this.field254].method101(class21.field208, (byte) -119)) {
                                    if (var4 >= var8 && var4 < var8 + 17) {
                                        this.field286 = var9 + this.field254;
                                        if (var7 == 1) {
                                            this.field268 = 50;
                                            this.field273 = var9 + this.field254;
                                        }
                                    }
                                    var8 += 17;
                                }
                            }
                        }
                        if (this.field296 != this.field286) {
                            this.field237 = true;
                            this.field296 = this.field286;
                        }
                    }
                    if (var2 == 1 && this.field235 && this.field256) {
                        this.field237 = true;
                        int var10 = var6;
                        int var11 = var4;
                        if (var6 < this.overviewX) {
                            var10 = this.overviewX;
                        } else if (this.overviewX + this.imageOverviewWidth < var6) {
                            var10 = this.overviewX + this.imageOverviewWidth;
                        }
                        if (var4 < this.overviewY) {
                            var11 = this.overviewY;
                        } else if (this.overviewY + this.imageOverviewHeight < var4) {
                            var11 = this.overviewY + this.imageOverviewHeight;
                        }
                        class5.field41 = (var11 - this.overviewY) * class2.sizeZ / this.imageOverviewHeight;
                        class21.field202 = (var10 - this.overviewX) * class4.sizeX / this.imageOverviewWidth;
                    } else {
                        this.field256 = false;
                    }
                    if (var2 == 1 && this.field269 != -1) {
                        this.field237 = true;
                        class5.field41 = this.field295 + (int) ((double) (this.field293 - var4) * 2.0D / this.field242);
                        class21.field202 = (int) ((double) (this.field269 - var6) * 2.0D / this.field242) + this.field243;
                    }
                    if (this.field242 > this.field236) {
                        this.field237 = true;
                        this.field236 /= 30.0D;
                        if (this.field236 > this.field242) {
                            this.field236 = this.field242;
                        }
                    }
                    if (this.field242 < this.field236) {
                        this.field237 = true;
                        this.field236 /= 30.0D;
                        if (this.field242 > this.field236) {
                            this.field236 = this.field242;
                        }
                    }
                    int var12 = class5.field41 + (int) (503.0D / this.field236);
                    int var13 = (int) (635.0D / this.field236) + class21.field202;
                    int var14 = class5.field41 - (int) (503.0D / this.field236);
                    if (var14 < 48) {
                        class5.field41 = (int) (503.0D / this.field236) + 48;
                    }
                    if (this.field284 > this.field254) {
                        this.field254++;
                        this.field237 = true;
                    }
                    if (class2.sizeZ - 48 < var12) {
                        class5.field41 = class2.sizeZ - (int) (503.0D / this.field236) - 48;
                    }
                    if (this.field254 > this.field284) {
                        this.field237 = true;
                        this.field254--;
                    }
                    if (this.field268 > 0) {
                        this.field268--;
                        this.field237 = true;
                    }
                    int var15 = class21.field202 - (int) (635.0D / this.field236);
                    if (var15 < 48) {
                        class21.field202 = (int) (635.0D / this.field236) + 48;
                    }
                    if (var13 > class4.sizeX - 48) {
                        class21.field202 = class4.sizeX - (int) (635.0D / this.field236) - 48;
                    }
                    return;
                }
                if (class3.field18 == 49) {
                    this.field237 = true;
                    this.field242 = 3.0D;
                }
                if (class3.field18 == 50) {
                    this.field237 = true;
                    this.field242 = 4.0D;
                }
                if (class3.field18 == 51) {
                    this.field237 = true;
                    this.field242 = 6.0D;
                }
                if (class3.field18 == 52) {
                    this.field237 = true;
                    this.field242 = 8.0D;
                }
                if (class3.field18 == 107 || class3.field18 == 75) {
                    this.field257 = !this.field257;
                    this.field237 = true;
                }
            } while (class3.field18 != 111 && class3.field18 != 79);
            this.field237 = true;
            this.field235 = !this.field235;
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "([B[[BI[[B[[B)V", line = 2991)
    private final void method161(byte[] arg0, byte[][] arg1, int arg2, byte[][] arg3, byte[][] arg4) {
        int var6 = arg2;
        while (true) {
            while (var6 < arg0.length) {
                int var7 = (arg0[var6++] & 0xFF) * 64 - class18.field162;
                int var8 = (arg0[var6++] & 0xFF) * 64 - class27.field323;
                if (var7 > 0 && var8 > 0 && class4.sizeX > var7 + 64 && var8 + 64 < class2.sizeZ) {
                    for (int var9 = 0; var9 < 64; var9++) {
                        byte[] var10 = arg3[var7 + var9];
                        byte[] var11 = arg1[var7 + var9];
                        int var12 = class2.sizeZ - var8 - 1;
                        byte[] var13 = arg4[var7 + var9];
                        for (int var14 = -64; var14 < 0; var14++) {
                            while (true) {
                                int var15 = arg0[var6++] & 0xFF;
                                if (var15 == 0) {
                                    var12--;
                                    break;
                                }
                                if (var15 < 29) {
                                    var10[var12] = (byte) var15;
                                } else if (var15 >= 160) {
                                    var13[var12] = (byte) (var15 - 159);
                                    if (this.field264 < 1000) {
                                        this.field276[this.field264] = var7 + var9;
                                        this.field267[this.field264] = var12;
                                        this.field303[this.field264] = var15 - 160;
                                        this.field264++;
                                    } else {
                                        class3.method8(new class21[] { class4.field32 }, -70);
                                    }
                                } else {
                                    var11[var12] = (byte) (var15 - 28);
                                }
                            }
                        }
                    }
                } else {
                    for (int var16 = 0; var16 < 64; var16++) {
                        byte var18;
                        for (int var17 = -64; var17 < 0; var17++) {
                            do {
                                var18 = arg0[var6++];
                            } while (var18 != 0);
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "c", descriptor = "(II)V", line = 3115)
    private final void method162(int arg0, int arg1) {
        class18 var3 = class21.field207[arg0];
        class16 var4 = new class16(var3.method95(9747, class3.field16, class10.field75));
        int var5 = var4.method65((byte) -39);
        int var6 = var4.method65((byte) -39);
        int var7 = var4.method65((byte) -39);
        int var8 = var4.method65((byte) -39);
        int var9 = var4.method65((byte) -39);
        int var10 = var4.method65((byte) -39);
        if (arg1 != 27919) {
            this.field263 = null;
        }
        var4.method59(arg1 - 27920);
        class4.sizeX = (var7 - var5) * 64 + 64;
        this.imageOverviewHeight = 180;
        this.overviewY = 503 - this.imageOverviewHeight - 20;
        class2.sizeZ = (var8 + 1 - var6) * 64;
        this.imageOverviewWidth = class4.sizeX * this.imageOverviewHeight / class2.sizeZ;
        class18.field162 = var5 * 64;
        class21.field202 = var9 * 64 - class18.field162;
        this.overviewX = 630 - this.imageOverviewWidth;
        class27.field323 = var6 * 64;
        class5.field41 = class27.field323 + class2.sizeZ - var10 * 64;
        class16 var11 = new class16(var3.method95(9747, class3.field16, class11.field86));
        this.field288 = var11.method65((byte) -39);
        for (int var12 = 0; var12 < this.field288; var12++) {
            this.field294[var12] = var11.method59(-1);
            this.field239[var12] = var11.method65((byte) -39);
            this.field300[var12] = var11.method65((byte) -39);
            this.field282[var12] = var11.method64(0);
        }
        class16 var13 = new class16(var3.method95(9747, class3.field16, class14.field134));
        int var14 = var13.method65((byte) -39);
        this.field281 = new int[var14 + 1];
        for (int var15 = 0; var15 < var14; var15++) {
            this.field281[var15 + 1] = var13.method67(true);
        }
        int var16 = var13.method65((byte) -39);
        this.field289 = new int[var16 + 1];
        for (int var17 = 0; var17 < var16; var17++) {
            this.field289[var17 + 1] = var13.method67(true);
        }
        byte[] var18 = var3.method95(9747, class3.field16, class10.field70);
        byte[][] var19 = new byte[class4.sizeX][class2.sizeZ];
        this.method157(var18, false, var19);
        byte[] var20 = var3.method95(9747, class3.field16, class2.field14);
        this.field283 = new byte[class4.sizeX][class2.sizeZ];
        this.field249 = new int[class4.sizeX][class2.sizeZ];
        this.method142(var20, true, this.field249, this.field283);
        byte[] var21 = var3.method95(9747, class3.field16, class5.field44);
        this.field263 = new byte[class4.sizeX][class2.sizeZ];
        this.field245 = new byte[class4.sizeX][class2.sizeZ];
        this.field264 = 0;
        this.field274 = new byte[class4.sizeX][class2.sizeZ];
        this.method161(var21, this.field263, arg1 ^ 0x6D0F, this.field245, this.field274);
        this.field251 = new int[class4.sizeX][class2.sizeZ];
        this.method149(this.field251, var19, arg1 ^ 0x6D62);
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(IZ)V", line = 3233)
    private final void method163(int arg0, boolean arg1) {
        if (arg1) {
            this.field264 = 60;
        }
        this.method153(class28.method183(0, new class21[] { class4.field36, class34.field386[class29.field346], class10.field76 }), 230, 170, this.field290, this.field240, arg0, 30209, 18, 483);
    }
}
