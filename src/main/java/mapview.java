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
public class mapview extends class28 {

    @OriginalMember(owner = "mapview!mapview", name = "m", descriptor = "I")
    private int field233 = 450;

    @OriginalMember(owner = "mapview!mapview", name = "n", descriptor = "Z")
    private boolean field234 = false;

    @OriginalMember(owner = "mapview!mapview", name = "N", descriptor = "I")
    private int field260 = -1;

    @OriginalMember(owner = "mapview!mapview", name = "ab", descriptor = "Z")
    private boolean field273 = false;

    @OriginalMember(owner = "mapview!mapview", name = "bb", descriptor = "I")
    private int field274 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "ib", descriptor = "La;")
    private class1 field281 = this.field273 ? class4.field43 : class4.field43;

    @OriginalMember(owner = "mapview!mapview", name = "hb", descriptor = "I")
    private int field280 = 170;

    @OriginalMember(owner = "mapview!mapview", name = "lb", descriptor = "I")
    private int field284 = 471;

    @OriginalMember(owner = "mapview!mapview", name = "eb", descriptor = "I")
    private int field277 = 5;

    @OriginalMember(owner = "mapview!mapview", name = "W", descriptor = "I")
    private int field269 = 10;

    @OriginalMember(owner = "mapview!mapview", name = "pb", descriptor = "La;")
    private class1 field288 = this.field273 ? class9.field91 : class9.field91;

    @OriginalMember(owner = "mapview!mapview", name = "F", descriptor = "La;")
    private class1 field252 = this.field273 ? class28.field393 : class28.field393;

    @OriginalMember(owner = "mapview!mapview", name = "jb", descriptor = "I")
    private int field282 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "fb", descriptor = "I")
    private int field278 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "rb", descriptor = "I")
    private int field290 = 50;

    @OriginalMember(owner = "mapview!mapview", name = "r", descriptor = "I")
    private int field238 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "y", descriptor = "La;")
    private class1 field245 = this.field273 ? class40.field514 : class40.field514;

    @OriginalMember(owner = "mapview!mapview", name = "mb", descriptor = "I")
    private int field285 = 5;

    @OriginalMember(owner = "mapview!mapview", name = "ub", descriptor = "D")
    private double field293 = 4.0D;

    @OriginalMember(owner = "mapview!mapview", name = "Q", descriptor = "I")
    private int field263 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "L", descriptor = "I")
    private int field258 = this.field273 ? 83 : 70;

    @OriginalMember(owner = "mapview!mapview", name = "O", descriptor = "Z")
    private boolean field261 = false;

    @OriginalMember(owner = "mapview!mapview", name = "q", descriptor = "I")
    private int field237 = 8943445;

    @OriginalMember(owner = "mapview!mapview", name = "s", descriptor = "La;")
    private class1 field239 = this.field273 ? class13.field118 : class13.field118;

    @OriginalMember(owner = "mapview!mapview", name = "Fb", descriptor = "La;")
    private class1 field304 = this.field273 ? class24.field222 : class24.field222;

    @OriginalMember(owner = "mapview!mapview", name = "gb", descriptor = "I")
    private int field279 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "A", descriptor = "I")
    private int field247 = this.field273 ? 76 : 75;

    @OriginalMember(owner = "mapview!mapview", name = "Hb", descriptor = "I")
    private int field306 = 30;

    @OriginalMember(owner = "mapview!mapview", name = "Y", descriptor = "I")
    private int field271 = 23;

    @OriginalMember(owner = "mapview!mapview", name = "u", descriptor = "I")
    private int field241 = this.field273 ? 115 : 102;

    @OriginalMember(owner = "mapview!mapview", name = "T", descriptor = "La;")
    private class1 field266 = this.field273 ? class39.field496 : class39.field496;

    @OriginalMember(owner = "mapview!mapview", name = "Ab", descriptor = "I")
    private int field299 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "qb", descriptor = "I")
    private int field289 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "db", descriptor = "I")
    private int field276 = 40;

    @OriginalMember(owner = "mapview!mapview", name = "E", descriptor = "La;")
    private class1 field251 = this.field273 ? class13.field117 : class13.field117;

    @OriginalMember(owner = "mapview!mapview", name = "R", descriptor = "I")
    private int field264 = 11141120;

    @OriginalMember(owner = "mapview!mapview", name = "sb", descriptor = "I")
    private int field291 = -1;

    @OriginalMember(owner = "mapview!mapview", name = "Pb", descriptor = "I")
    private int field314 = 7824964;

    @OriginalMember(owner = "mapview!mapview", name = "Kb", descriptor = "La;")
    private class1 field309 = this.field273 ? class8.field82 : class27.field382;

    @OriginalMember(owner = "mapview!mapview", name = "B", descriptor = "I")
    private int field248 = 6706483;

    @OriginalMember(owner = "mapview!mapview", name = "vb", descriptor = "I")
    private int field294 = 10027008;

    @OriginalMember(owner = "mapview!mapview", name = "Ob", descriptor = "I")
    private int field313 = 5;

    @OriginalMember(owner = "mapview!mapview", name = "Lb", descriptor = "Z")
    private boolean field310 = false;

    @OriginalMember(owner = "mapview!mapview", name = "Gb", descriptor = "I")
    private int field305 = 500;

    @OriginalMember(owner = "mapview!mapview", name = "cb", descriptor = "I")
    private int field275 = -1;

    @OriginalMember(owner = "mapview!mapview", name = "G", descriptor = "I")
    private int field253 = this.field273 ? 108 : 107;

    @OriginalMember(owner = "mapview!mapview", name = "nb", descriptor = "La;")
    private class1 field286 = this.field273 ? class5.field57 : class40.field507;

    @OriginalMember(owner = "mapview!mapview", name = "Ub", descriptor = "La;")
    private class1 field319 = this.field273 ? class40.field505 : class40.field505;

    @OriginalMember(owner = "mapview!mapview", name = "C", descriptor = "I")
    private int field249 = this.field290 + this.field269;

    @OriginalMember(owner = "mapview!mapview", name = "Rb", descriptor = "La;")
    private class1 field316 = this.field273 ? class29.field398 : class8.field75;

    @OriginalMember(owner = "mapview!mapview", name = "Jb", descriptor = "I")
    private int field308 = 8912896;

    @OriginalMember(owner = "mapview!mapview", name = "Vb", descriptor = "Z")
    private boolean field320 = true;

    @OriginalMember(owner = "mapview!mapview", name = "w", descriptor = "[I")
    private int[] field243 = new int[this.field305];

    @OriginalMember(owner = "mapview!mapview", name = "Qb", descriptor = "I")
    private int field315 = this.field273 ? 220 : 79;

    @OriginalMember(owner = "mapview!mapview", name = "Tb", descriptor = "I")
    private int field318 = 33;

    @OriginalMember(owner = "mapview!mapview", name = "P", descriptor = "I")
    private int field262 = -20;

    @OriginalMember(owner = "mapview!mapview", name = "Ib", descriptor = "D")
    private double field307 = 4.0D;

    @OriginalMember(owner = "mapview!mapview", name = "yb", descriptor = "[I")
    private int[] field297 = new int[this.field305];

    @OriginalMember(owner = "mapview!mapview", name = "J", descriptor = "[La;")
    private class1[] field256 = new class1[this.field305];

    @OriginalMember(owner = "mapview!mapview", name = "Wb", descriptor = "La;")
    private class1 field321 = this.field273 ? class8.field80 : class8.field80;

    @OriginalMember(owner = "mapview!mapview", name = "Sb", descriptor = "I")
    private int field317 = 140;

    @OriginalMember(owner = "mapview!mapview", name = "Db", descriptor = "[I")
    private int[] field302 = new int[this.field305];

    @OriginalMember(owner = "mapview!mapview", name = "Cb", descriptor = "I")
    private int field301 = this.field273 ? 252 : 111;

    @OriginalMember(owner = "mapview!mapview", name = "l", descriptor = "La;")
    public static class1 field232 = class3.method36("Short)2cut", -100);

    @OriginalMember(owner = "mapview!mapview", name = "H", descriptor = "La;")
    public static class1 field254 = class3.method36("Dungeon", -91);

    @OriginalMember(owner = "mapview!mapview", name = "Z", descriptor = "La;")
    public static class1 field272 = class3.method36("Loading", -83);

    @OriginalMember(owner = "mapview!mapview", name = "zb", descriptor = "I")
    private static int field298 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "Nb", descriptor = "La;")
    public static class1 field312 = class3.method36("Chainmail Shop", -111);

    @OriginalMember(owner = "mapview!mapview", name = "v", descriptor = "I")
    private int field242;

    @OriginalMember(owner = "mapview!mapview", name = "z", descriptor = "I")
    private int field246;

    @OriginalMember(owner = "mapview!mapview", name = "S", descriptor = "I")
    private int field265;

    @OriginalMember(owner = "mapview!mapview", name = "U", descriptor = "I")
    private int field267;

    @OriginalMember(owner = "mapview!mapview", name = "X", descriptor = "I")
    private int field270;

    @OriginalMember(owner = "mapview!mapview", name = "ob", descriptor = "I")
    private int field287;

    @OriginalMember(owner = "mapview!mapview", name = "tb", descriptor = "I")
    private int field292;

    @OriginalMember(owner = "mapview!mapview", name = "Bb", descriptor = "I")
    private int field300;

    @OriginalMember(owner = "mapview!mapview", name = "Xb", descriptor = "I")
    public static int field322;

    @OriginalMember(owner = "mapview!mapview", name = "V", descriptor = "La;")
    private class1 field268;

    @OriginalMember(owner = "mapview!mapview", name = "t", descriptor = "Lka;")
    private class20 field240;

    @OriginalMember(owner = "mapview!mapview", name = "o", descriptor = "Lla;")
    private class22 field235;

    @OriginalMember(owner = "mapview!mapview", name = "D", descriptor = "Lla;")
    private class22 field250;

    @OriginalMember(owner = "mapview!mapview", name = "I", descriptor = "Lla;")
    private class22 field255;

    @OriginalMember(owner = "mapview!mapview", name = "K", descriptor = "Lla;")
    private class22 field257;

    @OriginalMember(owner = "mapview!mapview", name = "M", descriptor = "Lla;")
    private class22 field259;

    @OriginalMember(owner = "mapview!mapview", name = "wb", descriptor = "Lla;")
    private class22 field295;

    @OriginalMember(owner = "mapview!mapview", name = "Eb", descriptor = "Lla;")
    private class22 field303;

    @OriginalMember(owner = "mapview!mapview", name = "Mb", descriptor = "Lla;")
    private class22 field311;

    @OriginalMember(owner = "mapview!mapview", name = "p", descriptor = "Lu;")
    private class38 field236;

    @OriginalMember(owner = "mapview!mapview", name = "kb", descriptor = "[B")
    private static byte[] field283;

    @OriginalMember(owner = "mapview!mapview", name = "x", descriptor = "[La;")
    private class1[] field244;

    @OriginalMember(owner = "mapview!mapview", name = "xb", descriptor = "[La;")
    private class1[] field296;

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(IZ)I", line = 18)
    private final int method146(int arg0, boolean arg1) {
        if (arg1) {
            return 85;
        }
        arg0++;
        if (arg0 >= class14.field124.length) {
            arg0 = 0;
        }
        return arg0;
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(IIIIIIIII)V", line = 33)
    private final void method147(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg4 >= -48) {
            return;
        }
        class31.field434.method125(arg1, arg0, arg5, -2, arg2, arg3, arg6, arg8, arg7);
        if (arg5 - arg8 > -arg3 + arg1) {
            return;
        }
        class31.field434.method135(arg8, arg0, this.field293, arg7, arg3, 16776960, arg6, arg1, arg5, arg2);
        class31.field434.method134((byte) 49, arg0, arg6, arg5, arg7, arg1, arg8, arg2, arg3);
        class31.field434.method133(this.field274, arg1, arg3, arg5, this.field260, arg8, arg0, arg6, 15, arg2, arg7);
        if (this.field307 == this.field293 && class3.field39) {
            for (int var10 = 0; var10 < this.field299; var10++) {
                int var11 = this.field302[var10];
                int var12 = var11 - class2.field23;
                int var13 = this.field297[var10];
                int var14 = class9.field88 + class5.field48 - var13;
                int var15 = (arg1 - arg3) * (-arg8 + var12) / (arg5 - arg8) + arg3;
                int var16 = 16777215;
                int var17 = this.field243[var10];
                class22 var18 = null;
                if (var17 == 0) {
                    if (this.field293 == 3.0D) {
                        var18 = this.field250;
                    }
                    if (this.field293 == 4.0D) {
                        var18 = this.field259;
                    }
                    if (this.field293 == 6.0D) {
                        var18 = this.field295;
                    }
                    if (this.field293 == 8.0D) {
                        var18 = this.field303;
                    }
                }
                if (var17 == 1) {
                    if (this.field293 == 3.0D) {
                        var18 = this.field295;
                    }
                    if (this.field293 == 4.0D) {
                        var18 = this.field303;
                    }
                    if (this.field293 == 6.0D) {
                        var18 = this.field311;
                    }
                    if (this.field293 == 8.0D) {
                        var18 = this.field235;
                    }
                }
                int var19 = arg6 + (var14 - arg0) * (-arg6 + arg2) / (arg7 - arg0);
                if (var17 == 2) {
                    var16 = 16755200;
                    if (this.field293 == 3.0D) {
                        var18 = this.field311;
                    }
                    if (this.field293 == 4.0D) {
                        var18 = this.field235;
                    }
                    if (this.field293 == 6.0D) {
                        var18 = this.field255;
                    }
                    if (this.field293 == 8.0D) {
                        var18 = this.field257;
                    }
                }
                if (var18 != null) {
                    class1 var20 = this.field256[var10];
                    int var21 = 1;
                    for (int var22 = 0; var20.method9(255) > var22; var22++) {
                        if (var20.method1(-3, var22) == 47) {
                            var21++;
                        }
                    }
                    int var23 = var19 - (var21 - 1) * var18.method124() / 2;
                    int var24 = var23 + var18.method117() / 2;
                    while (true) {
                        int var25 = var20.method19(false, 47);
                        if (var25 == -1) {
                            var18.method122(var20, var15, var24, var16, true);
                            break;
                        }
                        class1 var26 = var20.method23(true, 0, var25);
                        var18.method122(var26, var15, var24, var16, true);
                        var24 += var18.method124();
                        var20 = var20.method12((byte) 93, var25 + 1);
                    }
                }
            }
        }
        if (!class8.field86) {
            return;
        }
        for (int var27 = class2.field23 / 64; var27 < (class29.field400 + class2.field23) / 64; var27++) {
            for (int var28 = class5.field48 / 64; var28 < (class9.field88 + class5.field48) / 64; var28++) {
                int var29 = var27 * 64;
                int var30 = var29 - class2.field23;
                int var31 = var28 * 64;
                int var32 = class5.field48 + class9.field88 - var31;
                int var33 = arg3 + (arg1 - arg3) * (var30 - arg8) / (arg5 - arg8);
                int var34 = (var32 - arg0 - 64) * (-arg6 + arg2) / (arg7 - arg0) + arg6;
                int var35 = arg3 + (arg1 - arg3) * (var30 - -64 + -arg8) / (arg5 - arg8);
                int var36 = arg6 + (var32 - arg0) * (-arg6 + arg2) / (arg7 - arg0);
                class32.method216(var33, var34, var35 - var33, var36 - var34, 16777215);
                this.field240.method97(class28.method188(new class1[] { class8.method56(10, var27), class23.field221, class8.method56(10, var28) }, (byte) 89), var35 - 5, var36 + -5, 16777215, -1);
                if (var27 == 33 && var28 >= 71 && var28 <= 73) {
                    this.field240.method94(class25.field355, (var35 + var33) / 2, (var34 + var36) / 2, 16711680, -1);
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "h", descriptor = "(I)V", line = 217)
    private final void method148(int arg0) {
        class41.field519 = false;
        try {
            Graphics var2 = class29.field402.getGraphics();
            class21.field199.method44(0, -1, 0, var2);
        } catch (Exception var4) {
            class29.field402.repaint();
        }
        if (arg0 <= 59) {
            this.field266 = null;
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(IB)V", line = 254)
    private final void method149(int arg0, byte arg1) {
        if (arg1 == -86) {
            this.method152(483, arg0, this.field237, (byte) -100, 18, this.field248, class28.method188(new class1[] { class10.field97, class24.field228[class3.field37], class31.field438 }, (byte) 87), 170, 230);
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(BI)I", line = 277)
    private final int method150(byte arg0, int arg1) {
        if (arg0 != 55) {
            this.field246 = -4;
        }
        if (arg1 == 196) {
            return 228;
        } else if (arg1 == 203) {
            return 235;
        } else if (arg1 == 207) {
            return 239;
        } else if (arg1 == 214) {
            return 246;
        } else if (arg1 == 220) {
            return 252;
        } else {
            return class21.method109(arg1, (byte) 78);
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(BLjava/lang/String;[B)Z", line = 348)
    private final boolean method151(byte arg0, String arg1, byte[] arg2) {
        if (arg2 == null) {
            return false;
        }
        if (arg0 < 88) {
            this.field282 = -103;
        }
        try {
            MessageDigest var4 = MessageDigest.getInstance("SHA");
            var4.reset();
            var4.update(arg2);
            byte[] var5 = var4.digest();
            if (arg1 == "main_file_cache.dat0") {
                if (var5[0] != 37 || var5[1] != 75 || var5[2] != 37 || var5[3] != -27 || var5[4] != -114 || var5[5] != -97 || var5[6] != -98 || var5[7] != -102 || var5[8] != 76 || var5[9] != 119 || var5[10] != -57 || var5[11] != -95 || var5[12] != -87 || var5[13] != 77 || var5[14] != 36 || var5[15] != 33 || var5[16] != -64 || var5[17] != 30 || var5[18] != -98 || var5[19] != 36) {
                    return false;
                }
            } else if (arg1 == "main_file_cache.idx1") {
                if (var5[0] != 52 || var5[1] != 126 || var5[2] != -117 || var5[3] != -96 || var5[4] != 55 || var5[5] != 19 || var5[6] != -40 || var5[7] != 125 || var5[8] != 49 || var5[9] != -77 || var5[10] != 77 || var5[11] != -79 || var5[12] != -93 || var5[13] != -47 || var5[14] != -110 || var5[15] != -122 || var5[16] != 84 || var5[17] != -103 || var5[18] != -78 || var5[19] != 126) {
                    return false;
                }
            } else if (var5[0] != 45 || var5[1] != 3 || var5[2] != -125 || var5[3] != -84 || var5[4] != 74 || var5[5] != -71 || var5[6] != 71 || var5[7] != 42 || var5[8] != 15 || var5[9] != -22 || var5[10] != -39 || var5[11] != -60 || var5[12] != -119 || var5[13] != 50 || var5[14] != -84 || var5[15] != 66 || var5[16] != -36 || var5[17] != -79 || var5[18] != 54 || var5[19] != -48) {
                return false;
            }
            return true;
        } catch (Exception var7) {
            this.method183(-1809, "sha");
            return false;
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(IIIBIILa;II)V", line = 408)
    private final void method152(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, class1 arg6, int arg7, int arg8) {
        class32.method216(arg7, arg0, arg8, arg4, 0);
        int var13 = arg8 - 2;
        int var10 = arg0 + 1;
        int var11 = arg4 - 2;
        int var12 = arg7 + 1;
        class32.method214(var12, var10, var13, var11, arg1);
        if (arg3 != -100) {
            return;
        }
        class32.method211(var12, var10, var13, arg2);
        class32.method210(var12, var10, var11, arg2);
        class32.method211(var12, var10 + var11 - 1, var13, arg5);
        class32.method210(var12 + var13 - 1, var10, var11, arg5);
        this.field240.method94(arg6, var13 / 2 + var12 + 1, var11 / 2 + 1 + var10 + 4, 0, -1);
        this.field240.method94(arg6, var13 / 2 + var12, var11 / 2 + (var10 - -4), 16777215, -1);
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "([BLjava/lang/String;B)V", line = 434)
    private final void method153(byte[] arg0, String arg1, byte arg2) throws IOException {
        if (arg2 != -91) {
            this.init();
        }
        FileOutputStream var4 = new FileOutputStream(arg1);
        var4.write(arg0, 0, arg0.length);
        var4.close();
    }

    @OriginalMember(owner = "mapview!mapview", name = "b", descriptor = "(I)V", line = 448)
    public final void method154(int arg0) {
        if (arg0 != 9) {
            this.method164(null, -30, null);
        }
        if (!class2.field16) {
            class2.field16 = this.method163(97);
            class31.method202(class30.field416, class33.field456, -99, null);
            return;
        }
        if (this.field320) {
            class41.field519 = true;
            this.field320 = false;
            class32.method219();
            int var2 = class25.field354 - (int) (635.0D / this.field293);
            int var3 = class3.field31 - (int) (503.0D / this.field293);
            int var4 = (int) (635.0D / this.field293) + class25.field354;
            int var5 = (int) (503.0D / this.field293) + class3.field31;
            this.method147(var3, 635, 503, 0, arg0 ^ 0xFFFFFFCA, var4, 0, var5, var2);
            if (this.field261) {
                this.field236.method243(this.field242, this.field292);
                class32.method209(this.field270 * var2 / class29.field400 + this.field242, this.field265 * var3 / class9.field88 + this.field292, (var4 - var2) * this.field270 / class29.field400, (var5 - var3) * this.field265 / class9.field88, 16711680, 128);
                class32.method216(this.field270 * var2 / class29.field400 + this.field242, this.field292 - -(this.field265 * var3 / class9.field88), (var4 - var2) * this.field270 / class29.field400, (var5 - var3) * this.field265 / class9.field88, 16711680);
                if (this.field274 > 0 && this.field274 % 10 < 5) {
                    for (int var6 = 0; var6 < class28.field387; var6++) {
                        if (class31.field434.field213[var6] == this.field260) {
                            int var7 = this.field292 + class31.field434.field218[var6] * this.field265 / class9.field88;
                            int var8 = class31.field434.field220[var6] * this.field270 / class29.field400 + this.field242;
                            class32.method215(var8, var7, 2, 16776960, 256);
                        }
                    }
                }
            }
            if (this.field310) {
                this.method152(this.field318, 7829367, 10066329, (byte) -100, 18, 5592405, this.field304, this.field313, this.field317);
                this.method152(this.field318 + 18, 7829367, 10066329, (byte) -100, this.field233 - 36, 5592405, class39.field501, this.field313, this.field317);
                this.method152(this.field318 + this.field233 - 18, 7829367, 10066329, (byte) -100, 18, 5592405, this.field288, this.field313, this.field317);
                int var9 = this.field278;
                int var10 = this.field318 + 21;
                for (int var11 = 0; var11 < 24; var11++) {
                    if (class31.field422.length > var9 && this.field296.length > var9) {
                        if (this.field296[var9].method15(class25.field357, (byte) -36)) {
                            var11--;
                            var9++;
                            continue;
                        }
                        int var12 = 16777215;
                        class31.field422[var9].method242(this.field313 + 3, var10);
                        this.field240.method92(this.field296[var9], this.field313 + 21, var10 + 14, 0, -1);
                        if (this.field291 == var9) {
                            var12 = 12298922;
                        }
                        if (this.field274 > 0 && this.field274 % 10 < 5 && this.field260 == var9) {
                            var12 = 16776960;
                        }
                        this.field240.method92(this.field296[var9], this.field313 + 20, var10 - -13, var12, -1);
                    }
                    var10 += 17;
                    var9++;
                }
            }
            if (class14.field124.length == 1) {
                this.method152(this.field292 + this.field265, this.field314, this.field237, (byte) -100, 18, this.field248, this.field316, this.field242, this.field270);
                this.method152(this.field318 + this.field233, this.field314, this.field237, (byte) -100, 18, this.field248, this.field286, this.field313, this.field317);
                if (this.field307 == 3.0D) {
                    this.method152(this.field284, this.field294, this.field264, (byte) -100, this.field306, this.field308, class30.field412, this.field280, this.field290);
                } else {
                    this.method152(this.field284, this.field314, this.field237, (byte) -100, this.field306, this.field248, class30.field412, this.field280, this.field290);
                }
                if (this.field307 == 4.0D) {
                    this.method152(this.field284, this.field294, this.field264, (byte) -100, this.field306, this.field308, class6.field63, this.field280 + this.field249, this.field290);
                } else {
                    this.method152(this.field284, this.field314, this.field237, (byte) -100, this.field306, this.field248, class6.field63, this.field280 + this.field249, this.field290);
                }
                if (this.field307 == 6.0D) {
                    this.method152(this.field284, this.field294, this.field264, (byte) -100, this.field306, this.field308, class1.field1, this.field249 * 2 + this.field280, this.field290);
                } else {
                    this.method152(this.field284, this.field314, this.field237, (byte) -100, this.field306, this.field248, class1.field1, this.field249 * 2 + this.field280, this.field290);
                }
                if (this.field307 == 8.0D) {
                    this.method152(this.field284, this.field294, this.field264, (byte) -100, this.field306, this.field308, class39.field491, this.field280 + this.field249 * 3, this.field290);
                } else {
                    this.method152(this.field284, this.field314, this.field237, (byte) -100, this.field306, this.field248, class39.field491, this.field249 * 3 + this.field280, this.field290);
                }
            } else {
                this.method152(this.field292 + this.field265, this.field314, this.field237, (byte) -100, 18, this.field248, this.field316, this.field242, this.field270);
                this.method152(this.field318 + this.field233, this.field314, this.field237, (byte) -100, 18, this.field248, this.field286, this.field313, this.field317);
                this.method149(this.field314, (byte) -86);
                int var13 = this.field284 + this.field262;
                if (this.field307 == 3.0D) {
                    this.method152(var13, this.field294, this.field264, (byte) -100, this.field306, this.field308, class30.field412, this.field280, this.field290);
                } else {
                    this.method152(var13, this.field314, this.field237, (byte) -100, this.field306, this.field248, class30.field412, this.field280, this.field290);
                }
                if (this.field307 == 4.0D) {
                    this.method152(var13, this.field294, this.field264, (byte) -100, this.field306, this.field308, class6.field63, this.field280 + this.field249, this.field290);
                } else {
                    this.method152(var13, this.field314, this.field237, (byte) -100, this.field306, this.field248, class6.field63, this.field280 + this.field249, this.field290);
                }
                if (this.field307 == 6.0D) {
                    this.method152(var13, this.field294, this.field264, (byte) -100, this.field306, this.field308, class1.field1, this.field249 * 2 + this.field280, this.field290);
                } else {
                    this.method152(var13, this.field314, this.field237, (byte) -100, this.field306, this.field248, class1.field1, this.field280 + this.field249 * 2, this.field290);
                }
                if (this.field307 == 8.0D) {
                    this.method152(var13, this.field294, this.field264, (byte) -100, this.field306, this.field308, class39.field491, this.field280 + this.field249 * 3, this.field290);
                } else {
                    this.method152(var13, this.field314, this.field237, (byte) -100, this.field306, this.field248, class39.field491, this.field249 * 3 + this.field280, this.field290);
                }
            }
            if (class28.field390) {
                this.method152(this.field277, this.field314, this.field237, (byte) -100, this.field271, this.field248, this.field309, this.field285, this.field276);
                if (class25.field325) {
                    class32.method209(this.field285 + this.field276 + 2, this.field277, this.field246 + 10, this.field271, 8925952, 192);
                    class32.method216(this.field285 + this.field276 + 2, this.field277, this.field246 + 10, this.field271, 16777215);
                    if (class2.field26 > -1 && this.field268.method9(255) > 0) {
                        class1 var14 = this.field256[class2.field26].method21((byte) -1, 47, 32);
                        int var15 = this.field268.method9(255);
                        if (var15 > var14.method9(255)) {
                            var15 = var14.method9(255);
                        }
                        this.field240.method92(var14, this.field285 + this.field276 + 6, 20, 10066176, 0);
                        this.field240.method92(var14.method23(true, 0, var15), this.field285 + this.field276 + 6, 20, 16777215, 0);
                    } else {
                        this.field240.method92(this.field252, this.field285 + this.field276 + 6, 20, 16776960, 0);
                    }
                }
            }
        }
        if (class41.field519) {
            this.method148(66);
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "d", descriptor = "(B)V", line = 655)
    private final void method155(byte arg0) {
        if (class14.field124.length == 1) {
            class13.field119 = 0;
        } else {
            if (class3.field37 < 0) {
                class13.field119 = this.method146(class13.field119, false);
            } else {
                class13.field119 = class3.field37;
            }
            class3.field37 = this.method146(class13.field119, false);
        }
        if (arg0 > -125) {
            this.field316 = null;
        }
        this.method166(true, class13.field119);
    }

    @OriginalMember(owner = "mapview!mapview", name = "e", descriptor = "(B)V", line = 687)
    public static void method156(byte arg0) {
        field232 = null;
        field254 = null;
        field272 = null;
        field312 = null;
        if (arg0 != 105) {
            field232 = null;
        }
        field283 = null;
    }

    @OriginalMember(owner = "mapview!mapview", name = "f", descriptor = "(I)V", line = 722)
    public final void method157(int arg0) {
        if (class40.field502) {
            class7.method52(class29.field402, (byte) 115);
            class1.method2(class29.field402, (byte) 92);
            this.method190(893);
            class11.method63(class29.field402, false);
            class31.method206(class29.field402, (byte) -34);
        }
        class2.method31(arg0 + 54359);
        class2.method33(36);
        if (!class2.field16) {
            return;
        }
        if (class21.field200[96]) {
            this.field320 = true;
            class4.field44 = -1;
            class25.field354 = (int) ((double) class25.field354 - 16.0D / this.field293);
        }
        if (class21.field200[97]) {
            this.field320 = true;
            class4.field44 = -1;
            class25.field354 = (int) (16.0D / this.field293 + (double) class25.field354);
        }
        if (class21.field200[98]) {
            class4.field44 = -1;
            class3.field31 = (int) ((double) class3.field31 - 16.0D / this.field293);
            this.field320 = true;
        }
        if (class21.field200[99]) {
            class3.field31 = (int) (16.0D / this.field293 + (double) class3.field31);
            class4.field44 = -1;
            this.field320 = true;
        }
        while (true) {
            while (true) {
                while (class23.method136(arg0 + 32024)) {
                    if (!class28.field390 || !class25.field325) {
                        if (class28.field392 == this.field241 || class28.field392 == this.field258) {
                            this.field320 = true;
                            class25.field325 = true;
                        }
                        if (class28.field392 == 49) {
                            this.field320 = true;
                            this.field307 = 3.0D;
                        }
                        if (class28.field392 == 50) {
                            this.field307 = 4.0D;
                            this.field320 = true;
                        }
                        if (class28.field392 == 51) {
                            this.field320 = true;
                            this.field307 = 6.0D;
                        }
                        if (class28.field392 == 52) {
                            this.field307 = 8.0D;
                            this.field320 = true;
                        }
                        if (class28.field392 == this.field253 || class28.field392 == this.field247) {
                            this.field320 = true;
                            this.field310 = !this.field310;
                        }
                        if (class28.field392 == this.field301 || class28.field392 == this.field315) {
                            this.field261 = !this.field261;
                            this.field320 = true;
                        }
                    } else if (class8.field78 == 0) {
                        class25.field325 = false;
                        this.field320 = true;
                        this.field268.method28(38, 0);
                        class2.field26 = -1;
                    } else if (class8.field78 == 84) {
                        this.field300 = class25.field354 << 16;
                        this.field287 = class3.field31 << 16;
                        class4.field44 = class2.field26;
                        class25.field325 = false;
                        this.field268.method28(38, 0);
                        this.field320 = true;
                        class2.field26 = -1;
                    } else {
                        boolean var2 = false;
                        if (class8.field78 == 85) {
                            if (this.field268.method9(arg0 + 32236) > 0) {
                                this.field268.method28(38, this.field268.method9(255) - 1);
                                this.field320 = true;
                                if (this.field268.method9(255) == 0) {
                                    class2.field26 = -1;
                                } else {
                                    var2 = true;
                                }
                            }
                        } else if (class28.field392 != -1 && this.field268.method9(arg0 ^ 0xFFFF83EC) <= class11.field115) {
                            this.field268.method3(class28.field392, arg0 ^ 0x7CC4);
                            this.field320 = true;
                        }
                        if (this.field268.method9(arg0 ^ 0xFFFF83EC) > 0) {
                            for (int var3 = 0; var3 < this.field299; var3++) {
                                if (this.field256[var3].method9(arg0 ^ 0xFFFF83EC) >= this.field268.method9(arg0 ^ 0xFFFF83EC)) {
                                    class1 var4 = this.field268.method14((byte) -60);
                                    class1 var5 = this.field256[var3].method21((byte) -100, 47, 32).method23(true, 0, this.field268.method9(255)).method14((byte) -60);
                                    if (var4.method27(true, var5) == 0) {
                                        class2.field26 = var3;
                                        this.field320 = true;
                                        var2 = true;
                                        break;
                                    }
                                }
                            }
                            if (!var2) {
                                this.field268.method28(arg0 + 32019, this.field268.method9(arg0 + 32236) + -1);
                            }
                        }
                    }
                }
                int var6 = class8.field84;
                int var7 = class35.field475;
                int var8 = class36.field480;
                int var9 = class30.field413;
                int var10 = class40.field512;
                int var11 = class7.field70;
                if (var7 == 1) {
                    this.field238 = var6;
                    this.field282 = class3.field31;
                    this.field279 = class25.field354;
                    this.field263 = var8;
                    if (class14.field124.length == 1) {
                        if (this.field280 < var6 && var6 < this.field290 + this.field280 && var8 > this.field284 && var8 < this.field306 + this.field284) {
                            this.field307 = 3.0D;
                            this.field238 = -1;
                        }
                        if (var6 > this.field280 + this.field249 && this.field280 + this.field249 + this.field290 > var6 && var8 > this.field284 && var8 < this.field306 + this.field284) {
                            this.field307 = 4.0D;
                            this.field238 = -1;
                        }
                        if (var6 > this.field280 + this.field249 * 2 && var6 < this.field249 * 2 + this.field290 + this.field280 && this.field284 < var8 && this.field284 + this.field306 > var8) {
                            this.field307 = 6.0D;
                            this.field238 = -1;
                        }
                        if (var6 > this.field280 + this.field249 * 3 && this.field249 * 3 + this.field280 + this.field290 > var6 && var8 > this.field284 && this.field284 + this.field306 > var8) {
                            this.field238 = -1;
                            this.field307 = 8.0D;
                        }
                    } else {
                        if (this.field280 < var6 && this.field290 + this.field280 > var6 && this.field284 < var8 && var8 < this.field306 + this.field284 + this.field262) {
                            this.field238 = -1;
                            this.field307 = 3.0D;
                        }
                        if (this.field280 + this.field249 < var6 && var6 < this.field280 + this.field249 + this.field290 && var8 > this.field284 && var8 < this.field284 + this.field262 + this.field306) {
                            this.field238 = -1;
                            this.field307 = 4.0D;
                        }
                        if (var6 > this.field249 * 2 + this.field280 && this.field280 + this.field249 * 2 + this.field290 > var6 && this.field284 < var8 && var8 < this.field306 + this.field262 + this.field284) {
                            this.field307 = 6.0D;
                            this.field238 = -1;
                        }
                        if (var6 > this.field249 * 3 + this.field280 && var6 < this.field280 + this.field249 * 3 + this.field290 && this.field284 < var8 && this.field284 + this.field306 + this.field262 > var8) {
                            this.field307 = 8.0D;
                            this.field238 = -1;
                        }
                        if (var6 > 170 && var6 < 400 && var8 > 483 && var8 < 503) {
                            this.method149(this.field294, (byte) -86);
                            this.method148(104);
                            this.method155((byte) -128);
                            this.field238 = -1;
                        }
                    }
                    if (var6 > this.field313 && var8 > this.field318 + this.field233 && var6 < this.field317 + this.field313 && var8 < 503) {
                        this.field310 = !this.field310;
                        this.field238 = -1;
                    }
                    this.field320 = true;
                    if (this.field242 < var6 && this.field292 + this.field265 < var8 && this.field242 + this.field270 > var6 && var8 < 503) {
                        this.field238 = -1;
                        this.field261 = !this.field261;
                    }
                    this.field234 = false;
                    if (this.field310) {
                        if (this.field313 < var6 && this.field318 < var8 && this.field317 + this.field313 > var6 && var8 < this.field318 + 18 && this.field289 > 0) {
                            this.field289 -= 24;
                        }
                        if (this.field313 < var6 && this.field318 + this.field233 - 18 < var8 && var6 < this.field317 + this.field313 && this.field318 + this.field233 > var8 && this.field289 < 48) {
                            this.field289 += 24;
                        }
                        if (var6 > this.field313 && var8 > this.field318 && var6 < this.field317 + this.field313 && this.field318 + this.field233 > var8) {
                            this.field238 = -1;
                        }
                    }
                    if (this.field261 && var6 > this.field242 && this.field292 < var8 && this.field270 + this.field242 > var6 && this.field292 + this.field265 > var8) {
                        class3.field31 = (var8 - this.field292) * class9.field88 / this.field265;
                        this.field234 = true;
                        this.field238 = -1;
                        class25.field354 = (var6 - this.field242) * class29.field400 / this.field270;
                    }
                    if (class28.field390 && !class25.field325 && !this.field234 && this.field285 < var6 && this.field277 < var8 && var6 < this.field285 + this.field276 && var8 < this.field277 + this.field271) {
                        class25.field325 = true;
                    }
                }
                if (this.field310) {
                    this.field291 = -1;
                    if (var10 > this.field313 && var10 < this.field317 + this.field313) {
                        int var12 = this.field318 + 5 + 21;
                        int var13 = this.field278;
                        for (int var14 = 0; var14 < 24; var14++) {
                            if (this.field296.length > var13 && this.field296[var13].method15(class25.field357, (byte) -36)) {
                                var14--;
                                var13++;
                            } else {
                                if (var12 <= var11 && var11 < var12 + 17) {
                                    if (var7 == 1) {
                                        this.field260 = var13;
                                        this.field274 = 50;
                                    }
                                    this.field291 = var13;
                                }
                                var13++;
                                var12 += 17;
                            }
                        }
                    }
                    if (this.field291 != this.field275) {
                        this.field320 = true;
                        this.field275 = this.field291;
                    }
                }
                if (var9 == 1 && this.field261 && this.field234) {
                    int var15 = var10;
                    this.field320 = true;
                    if (var10 < this.field242) {
                        var15 = this.field242;
                    } else if (this.field270 + this.field242 < var10) {
                        var15 = this.field270 + this.field242;
                    }
                    class25.field354 = (var15 - this.field242) * class29.field400 / this.field270;
                    int var16 = var11;
                    class4.field44 = -1;
                    if (var11 < this.field292) {
                        var16 = this.field292;
                    } else if (this.field292 + this.field265 < var11) {
                        var16 = this.field292 + this.field265;
                    }
                    class3.field31 = (var16 - this.field292) * class9.field88 / this.field265;
                } else {
                    this.field234 = false;
                }
                if (var9 == 1 && this.field238 != -1) {
                    class25.field354 = (int) ((double) (this.field238 - var10) * 2.0D / this.field307) + this.field279;
                    class4.field44 = -1;
                    class3.field31 = (int) ((double) (this.field263 - var11) * 2.0D / this.field307) + this.field282;
                    this.field320 = true;
                }
                if (this.field307 > this.field293) {
                    this.field320 = true;
                    this.field293 += this.field293 / 30.0D;
                    if (this.field293 > this.field307) {
                        this.field293 = this.field307;
                    }
                }
                if (this.field307 < this.field293) {
                    this.field320 = true;
                    this.field293 -= this.field293 / 30.0D;
                    if (this.field293 < this.field307) {
                        this.field293 = this.field307;
                    }
                }
                if (this.field278 < this.field289) {
                    this.field320 = true;
                    this.field278++;
                }
                if (this.field278 > this.field289) {
                    this.field278--;
                    this.field320 = true;
                }
                if (this.field274 > 0) {
                    this.field320 = true;
                    this.field274--;
                }
                if (class4.field44 >= 0) {
                    class40.field504 = this.field302[class4.field44] - class2.field23;
                    class3.field29 = class9.field88 + class5.field48 - this.field297[class4.field44];
                    this.field320 = true;
                    byte var17 = 4;
                    int var18 = class40.field504 - (int) (635.0D / this.field293);
                    int var19 = (int) (635.0D / this.field293) + class40.field504;
                    int var20 = class3.field29 - (int) (503.0D / this.field293);
                    if (var18 < 48) {
                        class40.field504 = (int) (635.0D / this.field293) + 48;
                    }
                    int var21 = (int) (503.0D / this.field293) + class3.field29;
                    if (var20 < 48) {
                        class3.field29 = (int) (503.0D / this.field293) + 48;
                    }
                    if (var19 > class29.field400 - 48) {
                        class40.field504 = class29.field400 - (int) (635.0D / this.field293) - 48;
                    }
                    class40.field504 <<= 0x10;
                    if (var21 > class9.field88 - 48) {
                        class3.field29 = class9.field88 - (int) (503.0D / this.field293) - 48;
                    }
                    class3.field29 <<= 0x10;
                    int var22 = class3.field29 - this.field287;
                    int var23 = class40.field504 - this.field300;
                    if (var23 >> var17 == 0 && var22 >> var17 == 0) {
                        class4.field44 = -1;
                    } else {
                        this.field300 += var23 >> var17;
                        class25.field354 = this.field300 >> 16;
                        this.field287 += var22 >> var17;
                        class3.field31 = this.field287 >> 16;
                    }
                }
                int var24 = class25.field354 - (int) (635.0D / this.field293);
                int var25 = (int) (503.0D / this.field293) + class3.field31;
                int var26 = class3.field31 - (int) (503.0D / this.field293);
                int var27 = (int) (635.0D / this.field293) + class25.field354;
                if (var24 < 48) {
                    class25.field354 = (int) (635.0D / this.field293) + 48;
                }
                if (var26 < 48) {
                    class3.field31 = (int) (503.0D / this.field293) + 48;
                }
                if (class9.field88 - 48 < var25) {
                    class3.field31 = class9.field88 - (int) (503.0D / this.field293) - 48;
                }
                if (var27 > class29.field400 - 48) {
                    class25.field354 = class29.field400 - (int) (635.0D / this.field293) - 48;
                }
                if (arg0 != -31981) {
                    this.method151((byte) -87, null, null);
                }
                return;
            }
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(Ljava/lang/String;ILa;)Z", line = 1265)
    private final boolean method158(String arg0, int arg1, class1 arg2) {
        byte[] var4 = null;
        if (!class40.field508) {
            if (class1.field7 != null) {
                try {
                    var4 = this.method161(-78, class1.field7 + "/" + arg0);
                    if (!this.method151((byte) 122, arg0, var4)) {
                        var4 = null;
                    }
                    if (var4 != null) {
                        class8.field76 = new class14(var4, false, true);
                        return true;
                    }
                } catch (IOException var11) {
                    var4 = null;
                }
            }
            class40.field508 = true;
        }
        if (var4 == null) {
            boolean var6 = this.method164(arg2, 154687, arg0);
            if (!var6) {
                return false;
            }
            var4 = field283;
            field283 = null;
        }
        if (var4 == null) {
            class40.field508 = false;
            return true;
        }
        if (class1.field7 != null && var4 != null) {
            try {
                this.method153(var4, class1.field7 + "/" + arg0, (byte) -91);
            } catch (IOException var10) {
            }
        }
        try {
            if (arg1 == 0) {
                class8.field76 = new class14(var4, false, true);
                class40.field508 = false;
                return true;
            } else {
                return false;
            }
        } catch (IOException var9) {
            throw class23.method142(var9, "monkey feet");
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "i", descriptor = "(I)V", line = 1394)
    private final void method159(int arg0) {
        String var3;
        try {
            String var2 = System.getProperty("user.home");
            if (arg0 != -23954) {
                this.method155((byte) 4);
            }
            if (var2 == null) {
                var3 = "~/";
            } else {
                var3 = var2 + "/";
            }
        } catch (Exception var13) {
            var3 = "~/";
        }
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "d:/windows/", "d:/winnt/", "e:/windows/", "e:/winnt/", "f:/windows/", "f:/winnt/", "c:/", var3, "/tmp/", "" };
        String var6 = ".jagex_cache_32";
        for (int var7 = 0; var7 < var5.length; var7++) {
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
                        class1.field7 = var8 + var6 + "/rsmap/";
                        return;
                    }
                }
            } catch (Exception var14) {
            }
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "c", descriptor = "(B)V", line = 1466)
    public final void method160(byte arg0) {
        class13.method68((byte) 120);
        class11.method65(false);
        try {
            this.field296 = null;
            this.field256 = null;
            class31.field434 = null;
            this.field243 = null;
            this.field302 = null;
            this.field236 = null;
            this.field297 = null;
            this.field240 = null;
            if (arg0 <= 88) {
                this.field266 = null;
            }
            System.gc();
        } catch (Throwable var3) {
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "b", descriptor = "(ILjava/lang/String;)[B", line = 1497)
    private final byte[] method161(int arg0, String arg1) throws IOException {
        File var3 = new File(arg1);
        int var4 = 105 % ((30 - arg0) / 46);
        if (!var3.exists()) {
            return null;
        }
        int var5 = (int) var3.length();
        DataInputStream var6 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg1)));
        byte[] var7 = new byte[var5];
        var6.readFully(var7, 0, var5);
        var6.close();
        return var7;
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(B)V", line = 1529)
    public final void method162(byte arg0) {
        boolean var2 = false;
        class4.method39(0);
        class11.method63(class29.field402, false);
        class31.method206(class29.field402, (byte) -34);
        if (arg0 != -79) {
            this.field239 = null;
        }
        class30.field416 = this.field321;
        this.field296 = class33.method225(10114);
        this.field244 = class6.method48((byte) 122);
        boolean var3 = true;
        if (var3) {
            byte var4 = 0;
            if (this.field244.length == 14) {
                byte var10002 = var4;
                int var5 = var4 + 1;
                this.field316 = this.field244[var10002];
                int var19 = var5;
                int var6 = var5 + 1;
                this.field309 = this.field244[var19];
                int var20 = var6;
                int var7 = var6 + 1;
                this.field286 = this.field244[var20];
                int var21 = var7;
                int var8 = var7 + 1;
                this.field304 = this.field244[var21];
                int var22 = var8;
                int var9 = var8 + 1;
                this.field288 = this.field244[var22];
                int var23 = var9;
                int var10 = var9 + 1;
                this.field321 = this.field244[var23];
                int var24 = var10;
                int var11 = var10 + 1;
                this.field266 = this.field244[var24];
                int var25 = var11;
                int var12 = var11 + 1;
                this.field252 = this.field244[var25];
                int var26 = var12;
                int var13 = var12 + 1;
                this.field281 = this.field244[var26];
                int var27 = var13;
                int var14 = var13 + 1;
                this.field319 = this.field244[var27];
                int var28 = var14;
                int var15 = var14 + 1;
                this.field239 = this.field244[var28];
                int var29 = var15;
                int var16 = var15 + 1;
                this.field251 = this.field244[var29];
                int var17 = var16 + 1;
                int var30 = var17;
                int var18 = var17 + 1;
                this.field245 = this.field244[var30];
                this.field315 = this.field316.method1(-3, 0);
                this.field258 = this.field309.method1(-3, 0);
                this.field247 = this.field286.method1(-3, 0);
                this.field301 = this.method150((byte) 55, this.field315);
                this.field241 = this.method150((byte) 55, this.field258);
                this.field253 = this.method150((byte) 55, this.field247);
            } else {
                class41.method262(new class1[] { class6.field65 }, (byte) -127);
            }
        }
        this.field268 = class33.method220(50, -26968);
    }

    @OriginalMember(owner = "mapview!mapview", name = "j", descriptor = "(I)Z", line = 1588)
    private final boolean method163(int arg0) {
        if (field298 == 0) {
            this.method159(-23954);
            field298 = 1;
        }
        if (field298 == 1) {
            class33.field456 = 15;
            boolean var2 = this.method158("main_file_cache.idx0", 0, this.field319);
            if (!var2) {
                return false;
            }
            class24.field224 = class8.field76;
            class8.field76 = null;
            if (class24.field224 == null) {
                throw new RuntimeException("T1");
            }
            field298 = 2;
        }
        if (field298 == 2) {
            class33.field456 = 30;
            boolean var3 = this.method158("main_file_cache.idx1", 0, this.field239);
            if (!var3) {
                return false;
            }
            class3.field36 = class8.field76;
            class8.field76 = null;
            if (class3.field36 == null) {
                throw new RuntimeException("T2");
            }
            field298 = 3;
        }
        if (field298 == 3) {
            field298 = 10;
            class14.field124 = new class14[1];
        }
        if (field298 == 10) {
            class33.field456 = 50;
            boolean var4 = this.method158("main_file_cache.dat0", 0, this.field251);
            if (!var4) {
                return false;
            }
            class14.field124[0] = class8.field76;
            class8.field76 = null;
            if (class14.field124[0] == null) {
                throw new RuntimeException("T3");
            }
            field298 = 20;
        }
        int var5 = -87 / ((39 - arg0) / 51);
        if (field298 != 20) {
            return false;
        }
        class5.field55 = class28.method189(class10.field96, class24.field224, class39.field501, 49);
        class31.field422 = class41.method264(-1684916888, class26.field367, class24.field224, class39.field501);
        this.field240 = class33.method223((byte) 46, class24.field224, class29.field399, class3.field36, class39.field501);
        this.field250 = new class22(11, true, this);
        this.field259 = new class22(12, true, this);
        this.field295 = new class22(14, true, this);
        this.field303 = new class22(17, true, this);
        this.field311 = new class22(19, true, this);
        this.field235 = new class22(22, true, this);
        this.field255 = new class22(26, true, this);
        this.field257 = new class22(30, true, this);
        class30.field416 = this.field266;
        class33.field456 = 100;
        class31.method202(class30.field416, class33.field456, -124, null);
        this.field276 = this.field240.method100(this.field309) + 20;
        this.method155((byte) -126);
        class1[] var6 = this.field296;
        for (int var7 = 0; var7 < var6.length; var7++) {
            class1 var8 = var6[var7];
            int var9 = this.field240.method100(var8);
            if (var9 > this.field267) {
                this.field267 = var9;
            }
        }
        this.field317 = this.field267 + 34;
        if (this.field317 > 140) {
            int var10 = this.field242 - this.field313 - this.field317;
            this.field269 = var10 / 25;
            this.field290 = this.field269 * 5;
            this.field249 = this.field290 + this.field269;
            int var11 = var10 - this.field269 * 25;
            this.field280 = var11 / 2 + this.field269 + this.field317 + this.field313;
        }
        return true;
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(La;ILjava/lang/String;)Z", line = 1772)
    private final boolean method164(class1 arg0, int arg1, String arg2) {
        try {
            if (arg1 != 154687) {
                this.method151((byte) 2, null, null);
            }
            if (class10.field103 == null) {
                class30.field416 = class28.method188(new class1[] { this.field281, class6.field66, arg0 }, (byte) 125);
                String var4;
                if (arg2 == "main_file_cache.dat0") {
                    var4 = "worldmap.main.js5?crc=626817725";
                } else if (arg2 == "main_file_cache.dat1") {
                    var4 = "worldmap.dungeon.js5?crc=-1555827682";
                } else if (arg2 == "main_file_cache.dat2") {
                    var4 = "worldmap.extra.js5?crc=-329733187";
                } else if (arg2 == "main_file_cache.idx1") {
                    var4 = "mapview.fontmetrics.js5?crc=-447025815";
                } else {
                    var4 = "mapview.sprites.js5?crc=-1292288506";
                }
                class10.field103 = new DataInputStream((new URL(this.getCodeBase(), var4)).openStream());
                int var5;
                if (arg2 == "main_file_cache.dat0") {
                    var5 = 418173;
                } else if (arg2 == "main_file_cache.dat1") {
                    var5 = 154687;
                } else if (arg2 == "main_file_cache.dat2") {
                    var5 = 141534;
                } else if (arg2 == "main_file_cache.idx1") {
                    var5 = 165;
                } else {
                    var5 = 8294;
                }
                class21.field201 = 0;
                class1.field3 = 0;
                field283 = new byte[var5];
            }
            int var6 = class1.field3;
            int var7 = field283.length;
            if (var7 <= var6) {
                class10.field103.close();
                class10.field103 = null;
                if (!this.method151((byte) 91, arg2, field283)) {
                    this.method183(-1809, "download");
                    field283 = null;
                }
                return true;
            }
            class21.field201++;
            if (class21.field201 >= 1500) {
                throw new IOException();
            }
            DataInputStream var8 = class10.field103;
            int var9 = var8.available();
            if (var9 < 0) {
                throw new EOFException();
            } else if (var9 == 0) {
                return false;
            } else {
                if (var7 - var6 < var9) {
                    var9 = var7 - var6;
                }
                int var10 = var8.read(field283, var6, var9);
                if (var10 < 0) {
                    throw new EOFException();
                } else if (var10 == 0) {
                    return false;
                } else {
                    int var11 = var6 + var10;
                    class21.field201 = 0;
                    int var12 = var11 * 100 / var7;
                    class30.field416 = class28.method188(new class1[] { this.field245, class6.field66, arg0, class28.field388, class8.method56(arg1 ^ 0x25C35, var12), class14.field127 }, (byte) 63);
                    class1.field3 = var11;
                    return false;
                }
            }
        } catch (IOException var16) {
            try {
                class10.field103.close();
            } catch (Exception var15) {
            }
            field283 = null;
            class10.field103 = null;
            this.method183(-1809, new String("download"));
            return true;
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(II)I", line = 1900)
    public static int method165(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(ZI)V", line = 1941)
    private final void method166(boolean arg0, int arg1) {
        if (!arg0) {
            this.field307 = 0.9580736738911088D;
        }
        if (arg1 >= class14.field124.length) {
            return;
        }
        class14 var3 = class14.field124[arg1];
        class39 var4 = new class39(var3.method207(class23.field212, 10172, class6.field68));
        var4.method249((byte) 8);
        class39 var5 = new class39(var3.method207(class1.field2, 10172, class6.field68));
        this.field299 = var5.method253(false);
        for (int var6 = 0; var6 < this.field299; var6++) {
            this.field256[var6] = var5.method249((byte) 8);
            this.field302[var6] = var5.method253(false);
            this.field297[var6] = var5.method253(false);
            this.field243[var6] = var5.method245(-112);
            class1 var7 = this.field256[var6].method21((byte) 21, 47, 32);
            int var8 = this.field240.method100(var7);
            if (this.field246 < var8) {
                this.field246 = var8;
            }
            int var9 = this.field240.method100(this.field252);
            if (this.field246 < var9) {
                this.field246 = var9;
            }
        }
        class31.field434 = new class23();
        class31.field434.method132(true, class14.field124[arg1]);
        class25.field354 = class4.field45;
        this.field265 = 180;
        this.field270 = class29.field400 * this.field265 / class9.field88;
        this.field292 = 483 - this.field265;
        class3.field31 = class23.field214;
        this.field242 = 635 - this.field270 - 5;
        this.field236 = new class38(this.field270, this.field265);
        this.field236.method241();
        this.method147(0, this.field270, this.field265, 0, -78, class29.field400, 0, class9.field88, 0);
        class32.method216(0, 0, this.field270, this.field265, 0);
        class32.method216(1, 1, this.field270 - 2, this.field265 - 2, this.field237);
        class21.field199.method176((byte) 126);
    }

    @OriginalMember(owner = "mapview!mapview", name = "init", descriptor = "()V", line = 2029)
    public final void init() {
        if (this.method185(-24849)) {
            this.method181(32, -105, Integer.parseInt(this.getParameter("codeversion")), 635, 503);
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "b", descriptor = "(B)V", line = 2050)
    public final void method167(byte arg0) {
        method156((byte) 105);
        class4.method41((byte) 96);
        class1.method18(18329);
        class13.method67(-120);
        class21.method111((byte) -27);
        class39.method256(-29066);
        class28.method186(-27613);
        class2.method32(-1);
        class27.method177(-1);
        class14.method70((byte) 102);
        class23.method129((byte) -45);
        class22.method115();
        class7.method53(6454);
        class9.method58((byte) 98);
        class31.method199((byte) -108);
        class8.method54((byte) -105);
        class33.method224(75);
        class32.method218();
        class40.method260(false);
        class36.method231(27);
        class11.method64(0);
        class26.method174(0);
        class19.method104();
        class6.method49((byte) 10);
        class24.method144(true);
        class35.method230((byte) 68);
        class41.method266((byte) -109);
        if (arg0 <= 103) {
            this.method166(false, 16);
        }
        class29.method191((byte) 38);
        class30.method193(false);
        class10.method61(112);
        class5.method45(0);
        class3.method38(-1);
        class16.method73();
        class25.method168(48);
        this.field240 = null;
        this.field288 = null;
        this.field303 = null;
        this.field251 = null;
        this.field286 = null;
        this.field243 = null;
        this.field250 = null;
        this.field297 = null;
        this.field244 = null;
        this.field256 = null;
        this.field319 = null;
        this.field296 = null;
        this.field316 = null;
        this.field257 = null;
        this.field295 = null;
        this.field311 = null;
        this.field239 = null;
        this.field281 = null;
        this.field304 = null;
        this.field302 = null;
        this.field235 = null;
        this.field236 = null;
        this.field252 = null;
        this.field268 = null;
        this.field321 = null;
        this.field245 = null;
        this.field255 = null;
        this.field309 = null;
        this.field259 = null;
        this.field266 = null;
    }
}
