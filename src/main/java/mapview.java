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
public class mapview extends class20 {

    @OriginalMember(owner = "mapview!mapview", name = "y", descriptor = "I")
    private int field303 = 10027008;

    @OriginalMember(owner = "mapview!mapview", name = "O", descriptor = "Z")
    private boolean field319 = false;

    @OriginalMember(owner = "mapview!mapview", name = "ab", descriptor = "I")
    private int field331 = 8943445;

    @OriginalMember(owner = "mapview!mapview", name = "x", descriptor = "I")
    private int field302 = 8912896;

    @OriginalMember(owner = "mapview!mapview", name = "ib", descriptor = "I")
    private int field339 = 450;

    @OriginalMember(owner = "mapview!mapview", name = "E", descriptor = "I")
    private int field309 = 6706483;

    @OriginalMember(owner = "mapview!mapview", name = "t", descriptor = "I")
    private int field298 = -1;

    @OriginalMember(owner = "mapview!mapview", name = "tb", descriptor = "I")
    private int field350 = 40;

    @OriginalMember(owner = "mapview!mapview", name = "wb", descriptor = "I")
    private int field353 = 5;

    @OriginalMember(owner = "mapview!mapview", name = "mb", descriptor = "I")
    private int field343 = -1;

    @OriginalMember(owner = "mapview!mapview", name = "ub", descriptor = "I")
    private int field351 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "vb", descriptor = "I")
    private int field352 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "P", descriptor = "I")
    private int field320 = 7824964;

    @OriginalMember(owner = "mapview!mapview", name = "Kb", descriptor = "I")
    private int field367 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "Hb", descriptor = "I")
    private int field364 = 500;

    @OriginalMember(owner = "mapview!mapview", name = "p", descriptor = "[I")
    private int[] field294 = new int[this.field364];

    @OriginalMember(owner = "mapview!mapview", name = "Z", descriptor = "I")
    private int field330 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "db", descriptor = "[I")
    private int[] field334 = new int[this.field364];

    @OriginalMember(owner = "mapview!mapview", name = "Db", descriptor = "Z")
    private boolean field360 = false;

    @OriginalMember(owner = "mapview!mapview", name = "Gb", descriptor = "Z")
    private boolean field363 = true;

    @OriginalMember(owner = "mapview!mapview", name = "Q", descriptor = "I")
    private int field321 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "n", descriptor = "I")
    private int field292 = 33;

    @OriginalMember(owner = "mapview!mapview", name = "B", descriptor = "I")
    private int field306 = 11141120;

    @OriginalMember(owner = "mapview!mapview", name = "zb", descriptor = "D")
    private double field356 = 4.0D;

    @OriginalMember(owner = "mapview!mapview", name = "T", descriptor = "I")
    private int field324 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "bb", descriptor = "[Lt;")
    private class36[] field332 = new class36[this.field364];

    @OriginalMember(owner = "mapview!mapview", name = "Mb", descriptor = "I")
    private int field369 = 170;

    @OriginalMember(owner = "mapview!mapview", name = "Eb", descriptor = "I")
    private int field361 = 5;

    @OriginalMember(owner = "mapview!mapview", name = "hb", descriptor = "I")
    private int field338 = -20;

    @OriginalMember(owner = "mapview!mapview", name = "Ib", descriptor = "I")
    private int field365 = 471;

    @OriginalMember(owner = "mapview!mapview", name = "Y", descriptor = "[I")
    private int[] field329 = new int[this.field364];

    @OriginalMember(owner = "mapview!mapview", name = "fb", descriptor = "I")
    private int field336 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "V", descriptor = "I")
    private int field326 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "Ub", descriptor = "Z")
    private boolean field377 = false;

    @OriginalMember(owner = "mapview!mapview", name = "Zb", descriptor = "I")
    private int field382 = 5;

    @OriginalMember(owner = "mapview!mapview", name = "Yb", descriptor = "I")
    private int field381 = -1;

    @OriginalMember(owner = "mapview!mapview", name = "Xb", descriptor = "Z")
    private boolean field380 = false;

    @OriginalMember(owner = "mapview!mapview", name = "U", descriptor = "Lt;")
    private class36 field325 = this.field380 ? class29.field422 : class29.field422;

    @OriginalMember(owner = "mapview!mapview", name = "pb", descriptor = "Lt;")
    private class36 field346 = this.field380 ? class36.field490 : class36.field490;

    @OriginalMember(owner = "mapview!mapview", name = "z", descriptor = "Lt;")
    private class36 field304 = this.field380 ? class39.field517 : class39.field517;

    @OriginalMember(owner = "mapview!mapview", name = "W", descriptor = "I")
    private int field327 = this.field380 ? 115 : 102;

    @OriginalMember(owner = "mapview!mapview", name = "X", descriptor = "I")
    private int field328 = this.field380 ? 108 : 107;

    @OriginalMember(owner = "mapview!mapview", name = "F", descriptor = "Lt;")
    private class36 field310 = this.field380 ? class4.field35 : class4.field35;

    @OriginalMember(owner = "mapview!mapview", name = "Pb", descriptor = "Lt;")
    private class36 field372 = this.field380 ? class9.field99 : class32.field457;

    @OriginalMember(owner = "mapview!mapview", name = "jb", descriptor = "I")
    private int field340 = this.field380 ? 220 : 79;

    @OriginalMember(owner = "mapview!mapview", name = "Tb", descriptor = "Lt;")
    private class36 field376 = this.field380 ? class20.field256 : class20.field256;

    @OriginalMember(owner = "mapview!mapview", name = "v", descriptor = "I")
    private int field300 = 30;

    @OriginalMember(owner = "mapview!mapview", name = "w", descriptor = "Lt;")
    private class36 field301 = this.field380 ? class5.field46 : class5.field46;

    @OriginalMember(owner = "mapview!mapview", name = "Fb", descriptor = "I")
    private int field362 = this.field380 ? 83 : 70;

    @OriginalMember(owner = "mapview!mapview", name = "kb", descriptor = "I")
    private int field341 = this.field380 ? 252 : 111;

    @OriginalMember(owner = "mapview!mapview", name = "C", descriptor = "I")
    private int field307 = 23;

    @OriginalMember(owner = "mapview!mapview", name = "K", descriptor = "Lt;")
    private class36 field315 = this.field380 ? class3.field25 : class3.field25;

    @OriginalMember(owner = "mapview!mapview", name = "gb", descriptor = "Lt;")
    private class36 field337 = this.field380 ? class5.field54 : class6.field68;

    @OriginalMember(owner = "mapview!mapview", name = "s", descriptor = "I")
    private int field297 = this.field380 ? 76 : 75;

    @OriginalMember(owner = "mapview!mapview", name = "Rb", descriptor = "D")
    private double field374 = 4.0D;

    @OriginalMember(owner = "mapview!mapview", name = "Wb", descriptor = "I")
    private int field379 = 50;

    @OriginalMember(owner = "mapview!mapview", name = "ac", descriptor = "I")
    private int field383 = 10;

    @OriginalMember(owner = "mapview!mapview", name = "r", descriptor = "I")
    private int field296 = this.field383 + this.field379;

    @OriginalMember(owner = "mapview!mapview", name = "rb", descriptor = "Lt;")
    private class36 field348 = this.field380 ? class29.field421 : class29.field421;

    @OriginalMember(owner = "mapview!mapview", name = "L", descriptor = "Lt;")
    private class36 field316 = this.field380 ? class15.field182 : class24.field290;

    @OriginalMember(owner = "mapview!mapview", name = "D", descriptor = "I")
    private int field308 = 140;

    @OriginalMember(owner = "mapview!mapview", name = "eb", descriptor = "Lt;")
    private class36 field335 = this.field380 ? class5.field58 : class5.field58;

    @OriginalMember(owner = "mapview!mapview", name = "sb", descriptor = "Lt;")
    private class36 field349 = this.field380 ? class29.field420 : class29.field420;

    @OriginalMember(owner = "mapview!mapview", name = "R", descriptor = "[J")
    public static long[] field322 = new long[32];

    @OriginalMember(owner = "mapview!mapview", name = "ob", descriptor = "Lt;")
    private static class36 field345 = class3.method8(13631, "mapfunction");

    @OriginalMember(owner = "mapview!mapview", name = "xb", descriptor = "[[B")
    public static byte[][] field354 = new byte[50][];

    @OriginalMember(owner = "mapview!mapview", name = "N", descriptor = "Lt;")
    public static class36 field318 = class3.method8(13631, "Bank");

    @OriginalMember(owner = "mapview!mapview", name = "G", descriptor = "I")
    public static int field311 = 500;

    @OriginalMember(owner = "mapview!mapview", name = "Qb", descriptor = "Lt;")
    public static class36 field373 = class3.method8(13631, "Mini)2Game");

    @OriginalMember(owner = "mapview!mapview", name = "Ab", descriptor = "Lt;")
    public static class36 field357 = class3.method8(13631, "null");

    @OriginalMember(owner = "mapview!mapview", name = "Ob", descriptor = "Lt;")
    public static class36 field371 = class3.method8(13631, "Prev page");

    @OriginalMember(owner = "mapview!mapview", name = "m", descriptor = "I")
    private int field291;

    @OriginalMember(owner = "mapview!mapview", name = "o", descriptor = "I")
    private static int field293;

    @OriginalMember(owner = "mapview!mapview", name = "H", descriptor = "I")
    private int field312;

    @OriginalMember(owner = "mapview!mapview", name = "J", descriptor = "I")
    private int field314;

    @OriginalMember(owner = "mapview!mapview", name = "Bb", descriptor = "I")
    private int field358;

    @OriginalMember(owner = "mapview!mapview", name = "Jb", descriptor = "I")
    private int field366;

    @OriginalMember(owner = "mapview!mapview", name = "Nb", descriptor = "I")
    private int field370;

    @OriginalMember(owner = "mapview!mapview", name = "Sb", descriptor = "I")
    private int field375;

    @OriginalMember(owner = "mapview!mapview", name = "Vb", descriptor = "I")
    private int field378;

    @OriginalMember(owner = "mapview!mapview", name = "bc", descriptor = "I")
    public static int field384;

    @OriginalMember(owner = "mapview!mapview", name = "qb", descriptor = "Lm;")
    private class23 field347;

    @OriginalMember(owner = "mapview!mapview", name = "Lb", descriptor = "Lqa;")
    private class31 field368;

    @OriginalMember(owner = "mapview!mapview", name = "u", descriptor = "Lt;")
    private class36 field299;

    @OriginalMember(owner = "mapview!mapview", name = "q", descriptor = "Lu;")
    private class38 field295;

    @OriginalMember(owner = "mapview!mapview", name = "A", descriptor = "Lu;")
    private class38 field305;

    @OriginalMember(owner = "mapview!mapview", name = "I", descriptor = "Lu;")
    private class38 field313;

    @OriginalMember(owner = "mapview!mapview", name = "S", descriptor = "Lu;")
    private class38 field323;

    @OriginalMember(owner = "mapview!mapview", name = "cb", descriptor = "Lu;")
    private class38 field333;

    @OriginalMember(owner = "mapview!mapview", name = "nb", descriptor = "Lu;")
    private class38 field344;

    @OriginalMember(owner = "mapview!mapview", name = "yb", descriptor = "Lu;")
    private class38 field355;

    @OriginalMember(owner = "mapview!mapview", name = "Cb", descriptor = "Lu;")
    private class38 field359;

    @OriginalMember(owner = "mapview!mapview", name = "M", descriptor = "[Lt;")
    private class36[] field317;

    @OriginalMember(owner = "mapview!mapview", name = "lb", descriptor = "[Lt;")
    private class36[] field342;

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(ILt;IIIIIII)V", line = 4)
    private final void method134(int arg0, class36 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class37.method225(arg4, arg6, arg0, arg8, 0);
        int var12 = arg6 + 1;
        int var10 = arg0 - 2;
        int var13 = arg8 - 2;
        int var11 = arg4 + 1;
        class37.method226(var11, var12, var10, var13, arg2);
        if (arg7 != 14309) {
            this.method145(100, null, null);
        }
        class37.method231(var11, var12, var10, arg5);
        class37.method228(var11, var12, var13, arg5);
        class37.method231(var11, var12 + var13 - 1, var10, arg3);
        class37.method228(var10 + var11 - 1, var12, var13, arg3);
        this.field347.method49(arg1, var11 + var10 / 2 + 1, var13 / 2 + 1 + var12 + 4, 0, -1);
        this.field347.method49(arg1, var11 + var10 / 2, var13 / 2 + 4 + var12, 16777215, -1);
    }

    @OriginalMember(owner = "mapview!mapview", name = "c", descriptor = "(I)V", line = 30)
    public final void method116(int arg0) {
        if (!class1.field4) {
            class1.field4 = this.method142((byte) 123);
            class21.method123(null, class29.field426, (byte) -122, class40.field531);
            return;
        }
        if (this.field363) {
            this.field363 = false;
            class4.field33 = true;
            class37.method227();
            int var2 = class5.field56 - (int) (635.0D / this.field374);
            int var3 = (int) (635.0D / this.field374) + class5.field56;
            int var4 = class33.field458 - (int) (503.0D / this.field374);
            int var5 = (int) (503.0D / this.field374) + class33.field458;
            this.method135(503, var4, var5, 635, var2, 0, 16711680, 0, var3);
            if (this.field377) {
                this.field368.method177(this.field312, this.field378);
                class37.method224(this.field366 * var2 / class6.field71 + this.field312, this.field370 * var4 / class6.field66 + this.field378, (var3 - var2) * this.field366 / class6.field71, (var5 - var4) * this.field370 / class6.field66, 16711680, 128);
                class37.method225(this.field312 + this.field366 * var2 / class6.field71, this.field370 * var4 / class6.field66 + this.field378, (var3 - var2) * this.field366 / class6.field71, (var5 - var4) * this.field370 / class6.field66, 16711680);
                if (this.field330 > 0 && this.field330 % 10 < 5) {
                    for (int var6 = 0; var6 < class2.field12; var6++) {
                        if (class17.field216.field47[var6] == this.field298) {
                            int var7 = class17.field216.field50[var6] * this.field370 / class6.field66 + this.field378;
                            int var8 = this.field312 + class17.field216.field55[var6] * this.field366 / class6.field71;
                            class37.method221(var8, var7, 2, 16776960, 256);
                        }
                    }
                }
            }
            if (this.field360) {
                this.method134(this.field308, this.field301, 7829367, 5592405, this.field382, 10066329, this.field292, arg0 ^ 0x3627, 18);
                this.method134(this.field308, class4.field40, 7829367, 5592405, this.field382, 10066329, this.field292 + 18, 14309, this.field339 - 36);
                this.method134(this.field308, this.field315, 7829367, 5592405, this.field382, 10066329, this.field292 + this.field339 - 18, 14309, 18);
                int var9 = this.field292 + 3 + 18;
                int var10 = this.field324;
                for (int var11 = 0; var11 < 24; var11++) {
                    if (class5.field43.length > var10 && this.field317.length > var10) {
                        if (this.field317[var10].method213(class8.field85, (byte) -52)) {
                            var10++;
                            var11--;
                            continue;
                        }
                        class5.field43[var10].method180(this.field382 + 3, var9);
                        this.field347.method46(this.field317[var10], this.field382 + 21, var9 + 14, 0, -1);
                        int var12 = 16777215;
                        if (this.field381 == var10) {
                            var12 = 12298922;
                        }
                        if (this.field330 > 0 && this.field330 % 10 < 5 && this.field298 == var10) {
                            var12 = 16776960;
                        }
                        this.field347.method46(this.field317[var10], this.field382 + 20, var9 + 13, var12, -1);
                    }
                    var10++;
                    var9 += 17;
                }
            }
            if (class35.field479.length == 1) {
                this.method134(this.field366, this.field337, this.field320, this.field309, this.field312, this.field331, this.field378 + this.field370, 14309, 18);
                this.method134(this.field308, this.field372, this.field320, this.field309, this.field382, this.field331, this.field339 + this.field292, arg0 ^ 0x3627, 18);
                if (this.field356 == 3.0D) {
                    this.method134(this.field379, class1.field6, this.field303, this.field302, this.field369, this.field306, this.field365, 14309, this.field300);
                } else {
                    this.method134(this.field379, class1.field6, this.field320, this.field309, this.field369, this.field331, this.field365, arg0 + 13859, this.field300);
                }
                if (this.field356 == 4.0D) {
                    this.method134(this.field379, class41.field541, this.field303, this.field302, this.field369 + this.field296, this.field306, this.field365, arg0 + 13859, this.field300);
                } else {
                    this.method134(this.field379, class41.field541, this.field320, this.field309, this.field369 + this.field296, this.field331, this.field365, arg0 + 13859, this.field300);
                }
                if (this.field356 == 6.0D) {
                    this.method134(this.field379, class22.field275, this.field303, this.field302, this.field296 * 2 + this.field369, this.field306, this.field365, arg0 + 13859, this.field300);
                } else {
                    this.method134(this.field379, class22.field275, this.field320, this.field309, this.field296 * 2 + this.field369, this.field331, this.field365, 14309, this.field300);
                }
                if (this.field356 == 8.0D) {
                    this.method134(this.field379, class4.field30, this.field303, this.field302, this.field296 * 3 + this.field369, this.field306, this.field365, 14309, this.field300);
                } else {
                    this.method134(this.field379, class4.field30, this.field320, this.field309, this.field296 * 3 + this.field369, this.field331, this.field365, 14309, this.field300);
                }
            } else {
                this.method134(this.field366, this.field337, this.field320, this.field309, this.field312, this.field331, this.field378 + this.field370, arg0 + 13859, 18);
                this.method134(this.field308, this.field372, this.field320, this.field309, this.field382, this.field331, this.field292 + this.field339, 14309, 18);
                this.method144(-1, this.field320);
                int var13 = this.field365 + this.field338;
                if (this.field356 == 3.0D) {
                    this.method134(this.field379, class1.field6, this.field303, this.field302, this.field369, this.field306, var13, 14309, this.field300);
                } else {
                    this.method134(this.field379, class1.field6, this.field320, this.field309, this.field369, this.field331, var13, 14309, this.field300);
                }
                if (this.field356 == 4.0D) {
                    this.method134(this.field379, class41.field541, this.field303, this.field302, this.field369 + this.field296, this.field306, var13, 14309, this.field300);
                } else {
                    this.method134(this.field379, class41.field541, this.field320, this.field309, this.field369 + this.field296, this.field331, var13, 14309, this.field300);
                }
                if (this.field356 == 6.0D) {
                    this.method134(this.field379, class22.field275, this.field303, this.field302, this.field296 * 2 + this.field369, this.field306, var13, 14309, this.field300);
                } else {
                    this.method134(this.field379, class22.field275, this.field320, this.field309, this.field296 * 2 + this.field369, this.field331, var13, 14309, this.field300);
                }
                if (this.field356 == 8.0D) {
                    this.method134(this.field379, class4.field30, this.field303, this.field302, this.field296 * 3 + this.field369, this.field306, var13, 14309, this.field300);
                } else {
                    this.method134(this.field379, class4.field30, this.field320, this.field309, this.field296 * 3 + this.field369, this.field331, var13, arg0 ^ 0x3627, this.field300);
                }
            }
            if (class2.field11) {
                this.method134(this.field350, this.field316, this.field320, this.field309, this.field361, this.field331, this.field353, 14309, this.field307);
                if (class19.field232) {
                    class37.method224(this.field350 + this.field361 + 2, this.field353, this.field375 + 10, this.field307, 8925952, 192);
                    class37.method225(this.field361 + this.field350 + 2, this.field353, this.field375 + 10, this.field307, 16777215);
                    if (class2.field19 > -1 && this.field299.method197((byte) -85) > 0) {
                        class36 var14 = this.field332[class2.field19].method218(true, 32, 47);
                        int var15 = this.field299.method197((byte) -85);
                        if (var14.method197((byte) -85) < var15) {
                            var15 = var14.method197((byte) -85);
                        }
                        this.field347.method46(var14, this.field361 + this.field350 + 6, 20, 10066176, 0);
                        this.field347.method46(var14.method200(arg0 ^ 0x1C2, 0, var15), this.field361 + this.field350 + 6, 20, 16777215, 0);
                    } else {
                        this.field347.method46(this.field310, this.field361 + this.field350 + 6, 20, 16776960, 0);
                    }
                }
            }
        }
        if (arg0 != 450) {
            this.field349 = null;
        }
        if (class4.field33) {
            this.method139(true);
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "c", descriptor = "(B)V", line = 242)
    public final void method120(byte arg0) {
        method147(87);
        class22.method127(-119);
        class36.method205(1);
        class33.method188(114);
        class24.method129(true);
        class39.method253((byte) -126);
        class20.method121(-32306);
        class34.method190(false);
        class40.method263(-257);
        class7.method32(685);
        class5.method16((byte) 122);
        class38.method233();
        class29.method169((byte) 120);
        class9.method41(-125);
        class19.method96(-56);
        class35.method195(1);
        class2.method3((byte) 42);
        class37.method230();
        class41.method269((byte) 113);
        class8.method34(-128);
        class6.method26(122);
        class21.method125(-25);
        class10.method45();
        class4.method9((byte) 101);
        class1.method1(90);
        class27.method160((byte) 94);
        class15.method86((byte) -126);
        if (arg0 > -107) {
            return;
        }
        class26.method157(-588);
        class3.method6((byte) -127);
        class32.method184(127);
        class28.method165((byte) -88);
        class14.method79(-1);
        class12.method69();
        class17.method93(-14652);
        this.field295 = null;
        this.field346 = null;
        this.field359 = null;
        this.field313 = null;
        this.field368 = null;
        this.field325 = null;
        this.field335 = null;
        this.field305 = null;
        this.field316 = null;
        this.field299 = null;
        this.field323 = null;
        this.field347 = null;
        this.field332 = null;
        this.field337 = null;
        this.field301 = null;
        this.field315 = null;
        this.field333 = null;
        this.field349 = null;
        this.field344 = null;
        this.field334 = null;
        this.field329 = null;
        this.field294 = null;
        this.field317 = null;
        this.field310 = null;
        this.field342 = null;
        this.field304 = null;
        this.field355 = null;
        this.field372 = null;
        this.field376 = null;
        this.field348 = null;
    }

    @OriginalMember(owner = "mapview!mapview", name = "b", descriptor = "(B)V", line = 315)
    public final void method115(byte arg0) {
        if (class27.field408) {
            class5.method18(class41.field544, true);
            class35.method194((byte) 105, class41.field544);
            this.method110(false);
            class40.method262(0, class41.field544);
            class21.method124(class41.field544, -82);
        }
        class32.method185(arg0 - 95);
        class33.method187(true);
        if (!class1.field4) {
            return;
        }
        if (class4.field32[96]) {
            class29.field428 = -1;
            class5.field56 = (int) ((double) class5.field56 - 16.0D / this.field374);
            this.field363 = true;
        }
        if (class4.field32[97]) {
            this.field363 = true;
            class29.field428 = -1;
            class5.field56 = (int) (16.0D / this.field374 + (double) class5.field56);
        }
        if (class4.field32[98]) {
            this.field363 = true;
            class29.field428 = -1;
            class33.field458 = (int) ((double) class33.field458 - 16.0D / this.field374);
        }
        if (class4.field32[99]) {
            this.field363 = true;
            class29.field428 = -1;
            class33.field458 = (int) (16.0D / this.field374 + (double) class33.field458);
        }
        while (true) {
            while (true) {
                while (true) {
                    while (class32.method186((byte) -112)) {
                        if (!class2.field11 || !class19.field232) {
                            if (class41.field543 == this.field327 || class41.field543 == this.field362) {
                                this.field363 = true;
                                class19.field232 = true;
                            }
                            if (class41.field543 == 49) {
                                this.field356 = 3.0D;
                                this.field363 = true;
                            }
                            if (class41.field543 == 50) {
                                this.field363 = true;
                                this.field356 = 4.0D;
                            }
                            if (class41.field543 == 51) {
                                this.field356 = 6.0D;
                                this.field363 = true;
                            }
                            if (class41.field543 == 52) {
                                this.field356 = 8.0D;
                                this.field363 = true;
                            }
                            if (class41.field543 == this.field328 || class41.field543 == this.field297) {
                                this.field363 = true;
                                this.field360 = !this.field360;
                            }
                            if (class41.field543 == this.field341 || class41.field543 == this.field340) {
                                this.field377 = !this.field377;
                                this.field363 = true;
                            }
                        } else if (class39.field521 == 0) {
                            this.field363 = true;
                            class19.field232 = false;
                            this.field299.method196((byte) -68, 0);
                            class2.field19 = -1;
                        } else if (class39.field521 == 84) {
                            this.field314 = class33.field458 << 16;
                            class29.field428 = class2.field19;
                            this.field358 = class5.field56 << 16;
                            class19.field232 = false;
                            this.field299.method196((byte) 92, 0);
                            this.field363 = true;
                            class2.field19 = -1;
                        } else {
                            boolean var2 = false;
                            if (class39.field521 == 85) {
                                if (this.field299.method197((byte) -85) > 0) {
                                    this.field299.method196((byte) 99, this.field299.method197((byte) -85) - 1);
                                    this.field363 = true;
                                    if (this.field299.method197((byte) -85) == 0) {
                                        class2.field19 = -1;
                                    } else {
                                        var2 = true;
                                    }
                                }
                            } else if (class41.field543 != -1 && this.field299.method197((byte) -85) <= class32.field448) {
                                this.field299.method212(class41.field543, (byte) 74);
                                this.field363 = true;
                            }
                            if (this.field299.method197((byte) -85) > 0) {
                                for (int var3 = 0; var3 < this.field352; var3++) {
                                    if (this.field332[var3].method197((byte) -85) >= this.field299.method197((byte) -85)) {
                                        class36 var4 = this.field299.method201(29876);
                                        class36 var5 = this.field332[var3].method218(true, 32, 47).method200(arg0 ^ 0x3E, 0, this.field299.method197((byte) -85)).method201(arg0 + 29814);
                                        if (var4.method217(1, var5) == 0) {
                                            var2 = true;
                                            class2.field19 = var3;
                                            this.field363 = true;
                                            break;
                                        }
                                    }
                                }
                                if (!var2) {
                                    this.field299.method196((byte) -119, this.field299.method197((byte) -85) - 1);
                                }
                            }
                        }
                    }
                    int var6 = class32.field447;
                    if (arg0 != 62) {
                        this.method136(null, null, -64);
                    }
                    int var7 = class3.field23;
                    int var8 = class41.field542;
                    int var9 = class35.field482;
                    int var10 = class15.field179;
                    int var11 = class36.field498;
                    if (var6 == 1) {
                        this.field367 = class33.field458;
                        this.field336 = var8;
                        this.field351 = var7;
                        this.field321 = class5.field56;
                        if (class35.field479.length == 1) {
                            if (this.field369 < var7 && this.field379 + this.field369 > var7 && this.field365 < var8 && this.field365 + this.field300 > var8) {
                                this.field351 = -1;
                                this.field356 = 3.0D;
                            }
                            if (var7 > this.field369 + this.field296 && var7 < this.field369 + this.field296 + this.field379 && this.field365 < var8 && this.field365 + this.field300 > var8) {
                                this.field356 = 4.0D;
                                this.field351 = -1;
                            }
                            if (var7 > this.field296 * 2 + this.field369 && this.field296 * 2 + this.field379 + this.field369 > var7 && var8 > this.field365 && this.field365 + this.field300 > var8) {
                                this.field351 = -1;
                                this.field356 = 6.0D;
                            }
                            if (var7 > this.field296 * 3 + this.field369 && var7 < this.field296 * 3 + this.field369 + this.field379 && this.field365 < var8 && this.field365 + this.field300 > var8) {
                                this.field351 = -1;
                                this.field356 = 8.0D;
                            }
                        } else {
                            if (var7 > this.field369 && var7 < this.field379 + this.field369 && var8 > this.field365 && this.field365 + this.field300 + this.field338 > var8) {
                                this.field351 = -1;
                                this.field356 = 3.0D;
                            }
                            if (this.field369 + this.field296 < var7 && var7 < this.field379 + this.field296 + this.field369 && this.field365 < var8 && var8 < this.field338 + this.field300 + this.field365) {
                                this.field351 = -1;
                                this.field356 = 4.0D;
                            }
                            if (var7 > this.field369 + this.field296 * 2 && this.field369 + this.field296 * 2 + this.field379 > var7 && this.field365 < var8 && this.field365 + this.field300 + this.field338 > var8) {
                                this.field356 = 6.0D;
                                this.field351 = -1;
                            }
                            if (var7 > this.field296 * 3 + this.field369 && this.field296 * 3 + this.field369 + this.field379 > var7 && var8 > this.field365 && this.field338 + this.field300 + this.field365 > var8) {
                                this.field356 = 8.0D;
                                this.field351 = -1;
                            }
                            if (var7 > 170 && var7 < 400 && var8 > 483 && var8 < 503) {
                                this.method144(arg0 - 63, this.field303);
                                this.method139(true);
                                this.method137(-77);
                                this.field351 = -1;
                            }
                        }
                        this.field363 = true;
                        if (this.field382 < var7 && var8 > this.field292 + this.field339 && var7 < this.field382 + this.field308 && var8 < 503) {
                            this.field360 = !this.field360;
                            this.field351 = -1;
                        }
                        if (this.field312 < var7 && this.field378 + this.field370 < var8 && var7 < this.field366 + this.field312 && var8 < 503) {
                            this.field351 = -1;
                            this.field377 = !this.field377;
                        }
                        if (this.field360) {
                            if (var7 > this.field382 && var8 > this.field292 && this.field382 + this.field308 > var7 && this.field292 + 18 > var8 && this.field326 > 0) {
                                this.field326 -= 24;
                            }
                            if (var7 > this.field382 && this.field339 + this.field292 - 18 < var8 && var7 < this.field382 + this.field308 && var8 < this.field339 + this.field292 && this.field326 < 72) {
                                this.field326 += 24;
                            }
                            if (this.field382 < var7 && this.field292 < var8 && this.field382 + this.field308 > var7 && var8 < this.field339 + this.field292) {
                                this.field351 = -1;
                            }
                        }
                        this.field319 = false;
                        if (this.field377 && var7 > this.field312 && var8 > this.field378 && this.field312 + this.field366 > var7 && this.field378 + this.field370 > var8) {
                            class33.field458 = (var8 - this.field378) * class6.field66 / this.field370;
                            this.field351 = -1;
                            class5.field56 = (var7 - this.field312) * class6.field71 / this.field366;
                            this.field319 = true;
                        }
                        if (class2.field11 && !class19.field232 && !this.field319 && var7 > this.field361 && this.field353 < var8 && this.field361 + this.field350 > var7 && this.field353 + this.field307 > var8) {
                            class19.field232 = true;
                        }
                    }
                    if (this.field360) {
                        this.field381 = -1;
                        if (this.field382 < var11 && var11 < this.field382 + this.field308) {
                            int var12 = this.field292 + 26;
                            int var13 = this.field324;
                            for (int var14 = 0; var14 < 24; var14++) {
                                if (var13 < this.field317.length && this.field317[var13].method213(class8.field85, (byte) -83)) {
                                    var14--;
                                    var13++;
                                } else {
                                    if (var9 >= var12 && var12 + 17 > var9) {
                                        this.field381 = var13;
                                        if (var6 == 1) {
                                            this.field298 = var13;
                                            this.field330 = 50;
                                        }
                                    }
                                    var12 += 17;
                                    var13++;
                                }
                            }
                        }
                        if (this.field381 != this.field343) {
                            this.field363 = true;
                            this.field343 = this.field381;
                        }
                    }
                    if (var10 == 1 && this.field377 && this.field319) {
                        class29.field428 = -1;
                        this.field363 = true;
                        int var15 = var9;
                        if (this.field378 > var9) {
                            var15 = this.field378;
                        } else if (this.field378 + this.field370 < var9) {
                            var15 = this.field378 + this.field370;
                        }
                        class33.field458 = (var15 - this.field378) * class6.field66 / this.field370;
                        int var16 = var11;
                        if (var11 < this.field312) {
                            var16 = this.field312;
                        } else if (var11 > this.field366 + this.field312) {
                            var16 = this.field366 + this.field312;
                        }
                        class5.field56 = (var16 - this.field312) * class6.field71 / this.field366;
                    } else {
                        this.field319 = false;
                    }
                    if (var10 == 1 && this.field351 != -1) {
                        class29.field428 = -1;
                        class33.field458 = (int) ((double) (this.field336 - var9) * 2.0D / this.field356) + this.field367;
                        class5.field56 = (int) ((double) (this.field351 - var11) * 2.0D / this.field356) + this.field321;
                        this.field363 = true;
                    }
                    if (this.field356 > this.field374) {
                        this.field363 = true;
                        this.field374 += this.field374 / 30.0D;
                        if (this.field374 > this.field356) {
                            this.field374 = this.field356;
                        }
                    }
                    if (this.field356 < this.field374) {
                        this.field374 -= this.field374 / 30.0D;
                        if (this.field374 < this.field356) {
                            this.field374 = this.field356;
                        }
                        this.field363 = true;
                    }
                    if (this.field326 > this.field324) {
                        this.field363 = true;
                        this.field324++;
                    }
                    if (this.field326 < this.field324) {
                        this.field324--;
                        this.field363 = true;
                    }
                    if (this.field330 > 0) {
                        this.field330--;
                        this.field363 = true;
                    }
                    if (class29.field428 >= 0) {
                        byte var17 = 4;
                        class7.field76 = this.field329[class29.field428] - class19.field231;
                        int var18 = class7.field76 - (int) (635.0D / this.field374);
                        field293 = class6.field66 + class27.field404 - this.field334[class29.field428];
                        this.field363 = true;
                        int var19 = (int) (635.0D / this.field374) + class7.field76;
                        int var20 = field293 - (int) (503.0D / this.field374);
                        int var21 = (int) (503.0D / this.field374) + field293;
                        if (var18 < 48) {
                            class7.field76 = (int) (635.0D / this.field374) + 48;
                        }
                        if (class6.field71 - 48 < var19) {
                            class7.field76 = class6.field71 - (int) (635.0D / this.field374) - 48;
                        }
                        class7.field76 <<= 0x10;
                        int var22 = class7.field76 - this.field358;
                        if (var20 < 48) {
                            field293 = (int) (503.0D / this.field374) + 48;
                        }
                        if (class6.field66 - 48 < var21) {
                            field293 = class6.field66 - (int) (503.0D / this.field374) - 48;
                        }
                        field293 <<= 0x10;
                        int var23 = field293 - this.field314;
                        if (var22 >> var17 == 0 && var23 >> var17 == 0) {
                            class29.field428 = -1;
                        } else {
                            this.field358 += var22 >> var17;
                            class5.field56 = this.field358 >> 16;
                            this.field314 += var23 >> var17;
                            class33.field458 = this.field314 >> 16;
                        }
                    }
                    int var24 = class33.field458 - (int) (503.0D / this.field374);
                    int var25 = class5.field56 - (int) (635.0D / this.field374);
                    int var26 = class5.field56 + (int) (635.0D / this.field374);
                    int var27 = (int) (503.0D / this.field374) + class33.field458;
                    if (var24 < 48) {
                        class33.field458 = (int) (503.0D / this.field374) + 48;
                    }
                    if (var25 < 48) {
                        class5.field56 = (int) (635.0D / this.field374) + 48;
                    }
                    if (class6.field66 - 48 < var27) {
                        class33.field458 = class6.field66 - (int) (503.0D / this.field374) - 48;
                    }
                    if (var26 > class6.field71 - 48) {
                        class5.field56 = class6.field71 - (int) (635.0D / this.field374) - 48;
                    }
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(IIIIIIIII)V", line = 867)
    private final void method135(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class17.field216.method13(arg5, arg7, arg3, arg1, arg4, arg2, arg8, arg0, true);
        if (arg3 - arg7 < -arg4 + arg8) {
            return;
        }
        class17.field216.method25(arg5, arg7, arg0, arg1, arg4, arg2, arg8, (byte) -108, this.field374, arg3);
        class17.field216.method17(19, arg7, arg8, arg4, arg0, arg2, arg5, arg3, arg1);
        class17.field216.method12(arg2, arg3, arg5, arg1, arg8, arg0, arg4, arg7, true, this.field330, this.field298);
        if (this.field374 == this.field356 && class8.field78) {
            for (int var10 = 0; var10 < this.field352; var10++) {
                int var11 = this.field329[var10];
                int var12 = this.field334[var10];
                int var13 = var11 - class19.field231;
                int var14 = class6.field66 + class27.field404 - var12;
                int var15 = arg7 + (var13 - arg4) * (-arg7 + arg3) / (arg8 - arg4);
                int var16 = (var14 - arg1) * (-arg5 + arg0) / (arg2 - arg1) + arg5;
                int var17 = 16777215;
                class38 var18 = null;
                int var19 = this.field294[var10];
                if (var19 == 0) {
                    if (this.field374 == 3.0D) {
                        var18 = this.field355;
                    }
                    if (this.field374 == 4.0D) {
                        var18 = this.field323;
                    }
                    if (this.field374 == 6.0D) {
                        var18 = this.field344;
                    }
                    if (this.field374 == 8.0D) {
                        var18 = this.field333;
                    }
                }
                if (var19 == 1) {
                    if (this.field374 == 3.0D) {
                        var18 = this.field344;
                    }
                    if (this.field374 == 4.0D) {
                        var18 = this.field333;
                    }
                    if (this.field374 == 6.0D) {
                        var18 = this.field313;
                    }
                    if (this.field374 == 8.0D) {
                        var18 = this.field295;
                    }
                }
                if (var19 == 2) {
                    var17 = 16755200;
                    if (this.field374 == 3.0D) {
                        var18 = this.field313;
                    }
                    if (this.field374 == 4.0D) {
                        var18 = this.field295;
                    }
                    if (this.field374 == 6.0D) {
                        var18 = this.field359;
                    }
                    if (this.field374 == 8.0D) {
                        var18 = this.field305;
                    }
                }
                if (var18 != null) {
                    int var20 = 1;
                    class36 var21 = this.field332[var10];
                    for (int var22 = 0; var21.method197((byte) -85) > var22; var22++) {
                        if (var21.method216(var22, (byte) 2) == 47) {
                            var20++;
                        }
                    }
                    int var23 = var16 - var18.method234() * (var20 - 1) / 2;
                    int var24 = var23 + var18.method235() / 2;
                    while (true) {
                        int var25 = var21.method207(47, false);
                        if (var25 == -1) {
                            var18.method241(var21, var15, var24, var17, true);
                            break;
                        }
                        class36 var26 = var21.method200(0, 0, var25);
                        var18.method241(var26, var15, var24, var17, true);
                        var24 += var18.method234();
                        var21 = var21.method198(var25 + 1, -20461);
                    }
                }
            }
        }
        if (arg6 != 16711680) {
            this.field326 = 85;
        }
        if (!class26.field401) {
            return;
        }
        for (int var27 = class19.field231 / 64; var27 < (class6.field71 + class19.field231) / 64; var27++) {
            for (int var28 = class27.field404 / 64; var28 < (class6.field66 + class27.field404) / 64; var28++) {
                int var29 = var27 * 64;
                int var30 = var29 - class19.field231;
                int var31 = arg7 + (var30 - arg4) * (-arg7 + arg3) / (arg8 - arg4);
                int var32 = var28 * 64;
                int var33 = arg7 + (var30 + 64 - arg4) * (-arg7 + arg3) / (arg8 - arg4);
                int var34 = class6.field66 + class27.field404 - var32;
                int var35 = (var34 - arg1 - 64) * (arg0 - arg5) / (arg2 - arg1) + arg5;
                int var36 = arg5 + (var34 - arg1) * (-arg5 + arg0) / (arg2 - arg1);
                class37.method225(var31, var35, var33 - var31, -var35 + var36, 16777215);
                this.field347.method48(class19.method94((byte) -52, new class36[] { class7.method31(4, var27), class21.field265, class7.method31(4, var28) }), var33 - 5, var36 + -5, 16777215, -1);
                if (var27 == 33 && var28 >= 71 && var28 <= 73) {
                    this.field347.method49(class26.field399, (var31 + var33) / 2, (var35 + var36) / 2, 16711680, -1);
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(Ljava/lang/String;Lt;I)Z", line = 1050)
    private final boolean method136(String arg0, class36 arg1, int arg2) {
        if (arg2 != -2703) {
            return false;
        }
        try {
            if (class8.field77 == null) {
                class29.field426 = class19.method94((byte) -52, new class36[] { this.field376, class5.field53, arg1 });
                String var4;
                if (arg0 == "main_file_cache.dat0") {
                    var4 = "worldmap.main.js5?crc=-320952581";
                } else if (arg0 == "main_file_cache.dat1") {
                    var4 = "worldmap.dungeon.js5?crc=203715684";
                } else if (arg0 == "main_file_cache.dat2") {
                    var4 = "worldmap.extra.js5?crc=-1526141017";
                } else if (arg0 == "main_file_cache.idx1") {
                    var4 = "mapview.fontmetrics.js5?crc=-447025815";
                } else {
                    var4 = "mapview.sprites.js5?crc=2068520296";
                }
                int var5;
                if (arg0 == "main_file_cache.dat0") {
                    var5 = 430279;
                } else if (arg0 == "main_file_cache.dat1") {
                    var5 = 154533;
                } else if (arg0 == "main_file_cache.dat2") {
                    var5 = 165945;
                } else if (arg0 == "main_file_cache.idx1") {
                    var5 = 165;
                } else {
                    var5 = 9985;
                }
                class8.field77 = new DataInputStream((new URL(this.getCodeBase(), var4)).openStream());
                class34.field476 = 0;
                class21.field262 = new byte[var5];
                class6.field69 = 0;
            }
            int var6 = class21.field262.length;
            int var7 = class34.field476;
            if (var7 >= var6) {
                class8.field77.close();
                class8.field77 = null;
                if (!this.method146(4, arg0, class21.field262)) {
                    this.method109("download", true);
                    class21.field262 = null;
                }
                return true;
            }
            class6.field69++;
            if (class6.field69 >= 1500) {
                throw new IOException();
            }
            DataInputStream var8 = class8.field77;
            int var9 = var8.available();
            if (var9 < 0) {
                throw new EOFException();
            } else if (var9 == 0) {
                return false;
            } else {
                if (var6 - var7 < var9) {
                    var9 = var6 - var7;
                }
                int var10 = var8.read(class21.field262, var7, var9);
                if (var10 < 0) {
                    throw new EOFException();
                } else if (var10 == 0) {
                    return false;
                } else {
                    int var11 = var7 + var10;
                    class6.field69 = 0;
                    int var12 = var11 * 100 / var6;
                    class29.field426 = class19.method94((byte) -52, new class36[] { this.field348, class5.field53, arg1, class27.field405, class7.method31(4, var12), class21.field272 });
                    class34.field476 = var11;
                    return false;
                }
            }
        } catch (IOException var16) {
            try {
                class8.field77.close();
            } catch (Exception var15) {
            }
            class8.field77 = null;
            class21.field262 = null;
            this.method109(new String("download"), true);
            return true;
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "g", descriptor = "(I)V", line = 1183)
    private final void method137(int arg0) {
        if (arg0 != -77) {
            return;
        }
        if (class35.field479.length == 1) {
            class17.field202 = 0;
        } else {
            if (class40.field534 >= 0) {
                class17.field202 = class40.field534;
            } else {
                class17.field202 = this.method149(false, class17.field202);
            }
            class40.field534 = this.method149(false, class17.field202);
        }
        this.method141(-103, class17.field202);
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(II)I", line = 1214)
    private final int method138(int arg0, int arg1) {
        if (arg1 <= 96) {
            this.field343 = 102;
        }
        if (arg0 == 196) {
            return 228;
        } else if (arg0 == 203) {
            return 235;
        } else if (arg0 == 207) {
            return 239;
        } else if (arg0 == 214) {
            return 246;
        } else if (arg0 == 220) {
            return 252;
        } else {
            return class40.method259(arg0, 107);
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "d", descriptor = "(Z)V", line = 1274)
    private final void method139(boolean arg0) {
        if (!arg0) {
            return;
        }
        class4.field33 = false;
        try {
            Graphics var2 = class41.field544.getGraphics();
            class2.field9.method166(var2, 0, 0, -42);
        } catch (Exception var4) {
            class41.field544.repaint();
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(JI)V", line = 1293)
    public static final void method140(long arg0, int arg1) {
        if (arg1 <= 107) {
            field311 = 49;
        }
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % 10L == 0L) {
            class9.method40(arg0 - 1L, (byte) 100);
            class9.method40(1L, (byte) 125);
        } else {
            class9.method40(arg0, (byte) 90);
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "init", descriptor = "()V", line = 1343)
    public final void init() {
        if (this.method119(-125)) {
            this.method122(503, 635, (byte) 5, 32, Integer.parseInt(this.getParameter("codeversion")));
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "b", descriptor = "(II)V", line = 1358)
    private final void method141(int arg0, int arg1) {
        if (arg0 >= -99) {
            field371 = null;
        }
        if (class35.field479.length <= arg1) {
            return;
        }
        class7 var3 = class35.field479[arg1];
        class39 var4 = new class39(var3.method101(0, class3.field26, class26.field395));
        var4.method249((byte) 122);
        class39 var5 = new class39(var3.method101(0, class3.field26, class19.field241));
        this.field352 = var5.method254(65280);
        for (int var6 = 0; var6 < this.field352; var6++) {
            this.field332[var6] = var5.method249((byte) 86);
            this.field329[var6] = var5.method254(65280);
            this.field334[var6] = var5.method254(65280);
            this.field294[var6] = var5.method256(1795441960);
            class36 var7 = this.field332[var6].method218(true, 32, 47);
            int var8 = this.field347.method56(var7);
            if (var8 > this.field375) {
                this.field375 = var8;
            }
            int var9 = this.field347.method56(this.field310);
            if (this.field375 < var9) {
                this.field375 = var9;
            }
        }
        class17.field216 = new class5();
        class17.field216.method15(class35.field479[arg1], (byte) -70);
        class5.field56 = class17.field221;
        this.field370 = 180;
        class33.field458 = class15.field175;
        this.field378 = 503 - this.field370 - 20;
        this.field366 = class6.field71 * this.field370 / class6.field66;
        this.field312 = 635 - this.field366 - 5;
        this.field368 = new class31(this.field366, this.field370);
        this.field368.method181();
        this.method135(this.field370, 0, class6.field66, this.field366, 0, 0, 16711680, 0, class6.field71);
        class37.method225(0, 0, this.field366, this.field370, 0);
        class37.method225(1, 1, this.field366 - 2, this.field370 + -2, this.field331);
        class2.field9.method261(0);
    }

    @OriginalMember(owner = "mapview!mapview", name = "b", descriptor = "(I)V", line = 1426)
    public final void method113(int arg0) {
        class3.method7((byte) -112);
        class40.method262(arg0 + 15, class41.field544);
        boolean var2 = false;
        class21.method124(class41.field544, -23);
        class29.field426 = this.field304;
        if (arg0 != -15) {
            return;
        }
        boolean var3 = true;
        this.field317 = class41.method266(25451);
        this.field342 = class26.method159(111);
        if (var3) {
            byte var4 = 0;
            if (this.field342.length == 14) {
                byte var10002 = var4;
                int var5 = var4 + 1;
                this.field337 = this.field342[var10002];
                int var19 = var5;
                int var6 = var5 + 1;
                this.field316 = this.field342[var19];
                int var20 = var6;
                int var7 = var6 + 1;
                this.field372 = this.field342[var20];
                int var21 = var7;
                int var8 = var7 + 1;
                this.field301 = this.field342[var21];
                int var22 = var8;
                int var9 = var8 + 1;
                this.field315 = this.field342[var22];
                int var23 = var9;
                int var10 = var9 + 1;
                this.field304 = this.field342[var23];
                int var24 = var10;
                int var11 = var10 + 1;
                this.field335 = this.field342[var24];
                int var25 = var11;
                int var12 = var11 + 1;
                this.field310 = this.field342[var25];
                int var26 = var12;
                int var13 = var12 + 1;
                this.field376 = this.field342[var26];
                int var27 = var13;
                int var14 = var13 + 1;
                this.field325 = this.field342[var27];
                int var28 = var14;
                int var15 = var14 + 1;
                this.field346 = this.field342[var28];
                int var29 = var15;
                int var16 = var15 + 1;
                this.field349 = this.field342[var29];
                int var17 = var16 + 1;
                int var30 = var17;
                int var18 = var17 + 1;
                this.field348 = this.field342[var30];
                this.field340 = this.field337.method216(0, (byte) 2);
                this.field362 = this.field316.method216(0, (byte) 2);
                this.field297 = this.field372.method216(0, (byte) 2);
                this.field341 = this.method138(this.field340, 102);
                this.field327 = this.method138(this.field362, 102);
                this.field328 = this.method138(this.field297, 101);
            } else {
                class9.method38((byte) 111, new class36[] { class19.field225 });
            }
        }
        this.field299 = class2.method2(50, (byte) -67);
    }

    @OriginalMember(owner = "mapview!mapview", name = "d", descriptor = "(B)Z", line = 1489)
    private final boolean method142(byte arg0) {
        if (class29.field427 == 0) {
            this.method143((byte) -108);
            class29.field427 = 1;
        }
        if (class29.field427 == 1) {
            class40.field531 = 15;
            boolean var2 = this.method145(-52, this.field325, "main_file_cache.idx0");
            if (!var2) {
                return false;
            }
            class14.field174 = class20.field258;
            class20.field258 = null;
            if (class14.field174 == null) {
                throw new RuntimeException("T1");
            }
            class29.field427 = 2;
        }
        if (class29.field427 == 2) {
            class40.field531 = 30;
            boolean var3 = this.method145(-52, this.field346, "main_file_cache.idx1");
            if (!var3) {
                return false;
            }
            class33.field468 = class20.field258;
            class20.field258 = null;
            if (class33.field468 == null) {
                throw new RuntimeException("T2");
            }
            class29.field427 = 3;
        }
        if (class29.field427 == 3) {
            class35.field479 = new class7[1];
            class29.field427 = 10;
        }
        if (class29.field427 == 10) {
            class40.field531 = 50;
            boolean var4 = this.method145(-52, this.field349, "main_file_cache.dat0");
            if (!var4) {
                return false;
            }
            class35.field479[0] = class20.field258;
            class20.field258 = null;
            if (class35.field479[0] == null) {
                throw new RuntimeException("T3");
            }
            class29.field427 = 20;
        }
        if (arg0 <= 102) {
            this.field325 = null;
        }
        if (class29.field427 != 20) {
            return false;
        }
        class35.field486 = class15.method88(30000, class4.field40, class34.field471, class14.field174);
        class5.field43 = class40.method258(0, class14.field174, field345, class4.field40);
        this.field347 = class27.method161(class33.field468, class26.field398, class4.field40, class14.field174, -32);
        this.field355 = new class38(11, true, this);
        this.field323 = new class38(12, true, this);
        this.field344 = new class38(14, true, this);
        this.field333 = new class38(17, true, this);
        this.field313 = new class38(19, true, this);
        this.field295 = new class38(22, true, this);
        this.field359 = new class38(26, true, this);
        this.field305 = new class38(30, true, this);
        class29.field426 = this.field335;
        class40.field531 = 100;
        class21.method123(null, class29.field426, (byte) -102, class40.field531);
        this.field350 = this.field347.method56(this.field316) + 20;
        this.method137(-77);
        class36[] var5 = this.field317;
        for (int var6 = 0; var6 < var5.length; var6++) {
            class36 var7 = var5[var6];
            int var8 = this.field347.method56(var7);
            if (var8 > this.field291) {
                this.field291 = var8;
            }
        }
        this.field308 = this.field291 + 16 + 18;
        if (this.field308 > 140) {
            int var9 = this.field312 - this.field382 - this.field308;
            this.field383 = var9 / 25;
            this.field379 = this.field383 * 5;
            this.field296 = this.field383 + this.field379;
            int var10 = var9 - this.field383 * 25;
            this.field369 = var10 / 2 + this.field383 + this.field382 + this.field308;
        }
        return true;
    }

    @OriginalMember(owner = "mapview!mapview", name = "e", descriptor = "(B)V", line = 1660)
    private final void method143(byte arg0) {
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
        String var6 = ".jagex_cache_32";
        int var7 = 0;
        if (arg0 > -95) {
            this.field350 = 57;
        }
        while (var7 < var5.length) {
            try {
                label61: {
                    String var8 = var5[var7];
                    if (var8.length() > 0) {
                        File var9 = new File(var8);
                        if (!var9.exists()) {
                            break label61;
                        }
                    }
                    File var10 = new File(var8 + var6);
                    if (var10.exists() || var10.mkdir()) {
                        File var11 = new File(var10, "rsmap");
                        if (var11.exists() || var11.mkdir()) {
                            class6.field62 = var8 + var6 + "/rsmap/";
                            return;
                        }
                    }
                }
            } catch (Exception var14) {
            }
            var7++;
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "c", descriptor = "(II)V", line = 1732)
    private final void method144(int arg0, int arg1) {
        this.method134(230, class19.method94((byte) -52, new class36[] { class1.field3, class40.field535[class40.field534], class34.field470 }), arg1, this.field309, 170, this.field331, 483, 14309, 18);
        if (arg0 != -1) {
            method147(122);
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(ILt;Ljava/lang/String;)Z", line = 1796)
    private final boolean method145(int arg0, class36 arg1, String arg2) {
        byte[] var4 = null;
        if (!class9.field93) {
            if (class6.field62 != null) {
                try {
                    var4 = this.method148(0, class6.field62 + "/" + arg2);
                    if (!this.method146(4, arg2, var4)) {
                        var4 = null;
                    }
                    if (var4 != null) {
                        class20.field258 = new class7(var4, false, true);
                        return true;
                    }
                } catch (IOException var11) {
                    var4 = null;
                }
            }
            class9.field93 = true;
        }
        if (var4 == null) {
            boolean var6 = this.method136(arg2, arg1, -2703);
            if (!var6) {
                return false;
            }
            var4 = class21.field262;
            class21.field262 = null;
        }
        if (arg0 != -52) {
            this.method136(null, null, -128);
        }
        if (var4 == null) {
            class9.field93 = false;
            return true;
        }
        if (class6.field62 != null && var4 != null) {
            try {
                this.method150(var4, (byte) -128, class6.field62 + "/" + arg2);
            } catch (IOException var10) {
            }
        }
        try {
            class20.field258 = new class7(var4, false, true);
            class9.field93 = false;
            return true;
        } catch (IOException var9) {
            throw class14.method83(var9, "monkey feet");
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(ILjava/lang/String;[B)Z", line = 1900)
    private final boolean method146(int arg0, String arg1, byte[] arg2) {
        if (arg2 == null) {
            return false;
        }
        try {
            MessageDigest var4 = MessageDigest.getInstance("SHA");
            var4.reset();
            var4.update(arg2);
            byte[] var5 = var4.digest();
            if (arg1 == "main_file_cache.dat0") {
                if (var5[0] != 127 || var5[1] != 31 || var5[2] != 9 || var5[3] != 58 || var5[4] != 100 || var5[5] != 9 || var5[6] != 45 || var5[7] != -3 || var5[8] != 75 || var5[9] != 2 || var5[10] != 108 || var5[11] != 69 || var5[12] != 10 || var5[13] != -18 || var5[14] != -69 || var5[15] != 45 || var5[16] != 76 || var5[17] != 31 || var5[18] != 112 || var5[19] != 46) {
                    return false;
                }
            } else if (arg1 == "main_file_cache.idx1") {
                if (var5[0] != 52 || var5[1] != 126 || var5[2] != -117 || var5[3] != -96 || var5[4] != 55 || var5[5] != 19 || var5[6] != -40 || var5[7] != 125 || var5[8] != 49 || var5[9] != -77 || var5[10] != 77 || var5[11] != -79 || var5[12] != -93 || var5[13] != -47 || var5[14] != -110 || var5[15] != -122 || var5[16] != 84 || var5[17] != -103 || var5[18] != -78 || var5[19] != 126) {
                    return false;
                }
            } else if (var5[0] != 77 || var5[1] != -47 || var5[2] != 82 || var5[3] != 99 || var5[4] != -75 || var5[5] != 29 || var5[6] != -93 || var5[7] != 32 || var5[8] != -27 || var5[9] != 85 || var5[10] != 72 || var5[11] != -124 || var5[12] != -10 || var5[13] != 92 || var5[14] != -119 || var5[15] != -63 || var5[16] != -62 || var5[17] != 71 || var5[18] != -92 || var5[19] != -75) {
                return false;
            }
            if (arg0 != 4) {
                field322 = null;
            }
            return true;
        } catch (Exception var7) {
            this.method109("sha", true);
            return false;
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "h", descriptor = "(I)V", line = 1974)
    public static void method147(int arg0) {
        field357 = null;
        field322 = null;
        field373 = null;
        if (arg0 <= 33) {
            method147(-69);
        }
        field345 = null;
        field354 = null;
        field318 = null;
        field371 = null;
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(ILjava/lang/String;)[B", line = 2010)
    private final byte[] method148(int arg0, String arg1) throws IOException {
        File var3 = new File(arg1);
        if (!var3.exists()) {
            return null;
        }
        int var4 = (int) var3.length();
        byte[] var5 = new byte[var4];
        DataInputStream var6 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg1)));
        var6.readFully(var5, arg0, var4);
        var6.close();
        return var5;
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(ZI)I", line = 2049)
    private final int method149(boolean arg0, int arg1) {
        if (arg0) {
            this.method137(-33);
        }
        arg1++;
        if (class35.field479.length <= arg1) {
            arg1 = 0;
        }
        return arg1;
    }

    @OriginalMember(owner = "mapview!mapview", name = "b", descriptor = "(Z)V", line = 2090)
    public final void method111(boolean arg0) {
        class7.method29((byte) 117);
        class14.method81((byte) -65);
        try {
            this.field329 = null;
            this.field334 = null;
            this.field332 = null;
            this.field347 = null;
            if (arg0) {
                this.method146(-6, null, null);
            }
            this.field294 = null;
            this.field368 = null;
            class17.field216 = null;
            this.field317 = null;
            System.gc();
        } catch (Throwable var3) {
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "([BBLjava/lang/String;)V", line = 2163)
    private final void method150(byte[] arg0, byte arg1, String arg2) throws IOException {
        FileOutputStream var4 = new FileOutputStream(arg2);
        var4.write(arg0, 0, arg0.length);
        if (arg1 >= -125) {
            this.method115((byte) -126);
        }
        var4.close();
    }
}
