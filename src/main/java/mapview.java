import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.URL;
import java.security.MessageDigest;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!mapview")
public class mapview extends class24 {

    @OriginalMember(owner = "mapview!mapview", name = "z", descriptor = "I")
    private int field276 = 30;

    @OriginalMember(owner = "mapview!mapview", name = "v", descriptor = "I")
    private int field272 = 170;

    @OriginalMember(owner = "mapview!mapview", name = "w", descriptor = "I")
    private int field273 = 5;

    @OriginalMember(owner = "mapview!mapview", name = "Q", descriptor = "Z")
    private boolean field293 = false;

    @OriginalMember(owner = "mapview!mapview", name = "J", descriptor = "I")
    private int field286 = 7824964;

    @OriginalMember(owner = "mapview!mapview", name = "U", descriptor = "Z")
    private boolean field297 = false;

    @OriginalMember(owner = "mapview!mapview", name = "y", descriptor = "I")
    private int field275 = 471;

    @OriginalMember(owner = "mapview!mapview", name = "K", descriptor = "I")
    private int field287 = 10027008;

    @OriginalMember(owner = "mapview!mapview", name = "Y", descriptor = "I")
    private int field301 = 10;

    @OriginalMember(owner = "mapview!mapview", name = "x", descriptor = "I")
    private int field274 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "P", descriptor = "Z")
    private boolean field292 = true;

    @OriginalMember(owner = "mapview!mapview", name = "C", descriptor = "I")
    private int field279 = 40;

    @OriginalMember(owner = "mapview!mapview", name = "H", descriptor = "I")
    private int field284 = 11141120;

    @OriginalMember(owner = "mapview!mapview", name = "fb", descriptor = "I")
    private int field308 = 23;

    @OriginalMember(owner = "mapview!mapview", name = "E", descriptor = "I")
    private int field281 = 6706483;

    @OriginalMember(owner = "mapview!mapview", name = "bb", descriptor = "Z")
    private boolean field304 = false;

    @OriginalMember(owner = "mapview!mapview", name = "Z", descriptor = "I")
    private int field302 = -1;

    @OriginalMember(owner = "mapview!mapview", name = "F", descriptor = "Lna;")
    private class26 field282 = this.field304 ? class12.field124 : class12.field124;

    @OriginalMember(owner = "mapview!mapview", name = "S", descriptor = "I")
    private int field295 = 140;

    @OriginalMember(owner = "mapview!mapview", name = "nb", descriptor = "Lna;")
    private class26 field316 = this.field304 ? class22.field232 : class22.field232;

    @OriginalMember(owner = "mapview!mapview", name = "D", descriptor = "Lna;")
    private class26 field280 = this.field304 ? class6.field67 : class6.field67;

    @OriginalMember(owner = "mapview!mapview", name = "B", descriptor = "I")
    private int field278 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "lb", descriptor = "I")
    private int field314 = -1;

    @OriginalMember(owner = "mapview!mapview", name = "wb", descriptor = "I")
    private int field325 = 33;

    @OriginalMember(owner = "mapview!mapview", name = "vb", descriptor = "I")
    private int field324 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "l", descriptor = "I")
    private int field262 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "Bb", descriptor = "Lna;")
    private class26 field330 = this.field304 ? class30.field456 : class30.field456;

    @OriginalMember(owner = "mapview!mapview", name = "Eb", descriptor = "Z")
    private boolean field333 = false;

    @OriginalMember(owner = "mapview!mapview", name = "L", descriptor = "I")
    private int field288 = 5;

    @OriginalMember(owner = "mapview!mapview", name = "Cb", descriptor = "I")
    private int field331 = 8943445;

    @OriginalMember(owner = "mapview!mapview", name = "r", descriptor = "Lna;")
    private class26 field268 = this.field304 ? class32.field471 : class32.field471;

    @OriginalMember(owner = "mapview!mapview", name = "cb", descriptor = "Lna;")
    private class26 field305 = this.field304 ? class30.field454 : class6.field70;

    @OriginalMember(owner = "mapview!mapview", name = "mb", descriptor = "I")
    private int field315 = 5;

    @OriginalMember(owner = "mapview!mapview", name = "Lb", descriptor = "I")
    private int field340 = 50;

    @OriginalMember(owner = "mapview!mapview", name = "eb", descriptor = "I")
    private int field307 = 500;

    @OriginalMember(owner = "mapview!mapview", name = "n", descriptor = "I")
    private int field264 = 8912896;

    @OriginalMember(owner = "mapview!mapview", name = "zb", descriptor = "Lna;")
    private class26 field328 = this.field304 ? class29.field449 : class29.field449;

    @OriginalMember(owner = "mapview!mapview", name = "hb", descriptor = "D")
    private double field310 = 4.0D;

    @OriginalMember(owner = "mapview!mapview", name = "T", descriptor = "[Lna;")
    private class26[] field296 = new class26[this.field307];

    @OriginalMember(owner = "mapview!mapview", name = "Fb", descriptor = "[I")
    private int[] field334 = new int[this.field307];

    @OriginalMember(owner = "mapview!mapview", name = "u", descriptor = "I")
    private int field271 = this.field304 ? 76 : 75;

    @OriginalMember(owner = "mapview!mapview", name = "Ob", descriptor = "Lna;")
    private class26 field343 = this.field304 ? class38.field501 : class38.field501;

    @OriginalMember(owner = "mapview!mapview", name = "Nb", descriptor = "[I")
    private int[] field342 = new int[this.field307];

    @OriginalMember(owner = "mapview!mapview", name = "ib", descriptor = "I")
    private int field311 = this.field304 ? 220 : 79;

    @OriginalMember(owner = "mapview!mapview", name = "Ab", descriptor = "I")
    private int field329 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "W", descriptor = "I")
    private int field299 = -1;

    @OriginalMember(owner = "mapview!mapview", name = "O", descriptor = "[I")
    private int[] field291 = new int[this.field307];

    @OriginalMember(owner = "mapview!mapview", name = "db", descriptor = "Lna;")
    private class26 field306 = this.field304 ? field339 : field339;

    @OriginalMember(owner = "mapview!mapview", name = "Rb", descriptor = "I")
    private int field346 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "X", descriptor = "I")
    private int field300 = this.field304 ? 252 : 111;

    @OriginalMember(owner = "mapview!mapview", name = "R", descriptor = "Lna;")
    private class26 field294 = this.field304 ? class28.field426 : class28.field426;

    @OriginalMember(owner = "mapview!mapview", name = "gb", descriptor = "Lna;")
    private class26 field309 = this.field304 ? field261 : field261;

    @OriginalMember(owner = "mapview!mapview", name = "yb", descriptor = "I")
    private int field327 = this.field304 ? 108 : 107;

    @OriginalMember(owner = "mapview!mapview", name = "Pb", descriptor = "D")
    private double field344 = 4.0D;

    @OriginalMember(owner = "mapview!mapview", name = "Qb", descriptor = "I")
    private int field345 = 450;

    @OriginalMember(owner = "mapview!mapview", name = "Ib", descriptor = "I")
    private int field337 = this.field304 ? 115 : 102;

    @OriginalMember(owner = "mapview!mapview", name = "t", descriptor = "I")
    private int field270 = this.field340 + this.field301;

    @OriginalMember(owner = "mapview!mapview", name = "Tb", descriptor = "I")
    private int field348 = this.field304 ? 83 : 70;

    @OriginalMember(owner = "mapview!mapview", name = "Vb", descriptor = "I")
    private int field350 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "Db", descriptor = "I")
    private int field332 = -20;

    @OriginalMember(owner = "mapview!mapview", name = "Mb", descriptor = "Lna;")
    private class26 field341 = this.field304 ? class32.field472 : class32.field465;

    @OriginalMember(owner = "mapview!mapview", name = "Wb", descriptor = "Lna;")
    private class26 field351 = this.field304 ? class25.field357 : class24.field256;

    @OriginalMember(owner = "mapview!mapview", name = "Xb", descriptor = "I")
    private int field352 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "j", descriptor = "Lna;")
    public static class26 field260 = class33.method219("Spice Shop", 91);

    @OriginalMember(owner = "mapview!mapview", name = "k", descriptor = "Lna;")
    private static class26 field261 = class33.method219("sprites", 83);

    @OriginalMember(owner = "mapview!mapview", name = "s", descriptor = "Lna;")
    public static class26 field269 = class33.method219("Slayer Master", 79);

    @OriginalMember(owner = "mapview!mapview", name = "m", descriptor = "Lna;")
    public static class26 field263 = class33.method219("Hunter Training", 104);

    @OriginalMember(owner = "mapview!mapview", name = "Gb", descriptor = "Lna;")
    private static class26 field335 = class33.method219("mapscene", 98);

    @OriginalMember(owner = "mapview!mapview", name = "Kb", descriptor = "Lna;")
    private static class26 field339 = class33.method219("Loading", 100);

    @OriginalMember(owner = "mapview!mapview", name = "p", descriptor = "Lna;")
    public static class26 field266 = class33.method219("overlay2)3dat", 103);

    @OriginalMember(owner = "mapview!mapview", name = "o", descriptor = "I")
    private int field265;

    @OriginalMember(owner = "mapview!mapview", name = "A", descriptor = "I")
    private int field277;

    @OriginalMember(owner = "mapview!mapview", name = "I", descriptor = "I")
    private int field285;

    @OriginalMember(owner = "mapview!mapview", name = "V", descriptor = "I")
    private int field298;

    @OriginalMember(owner = "mapview!mapview", name = "jb", descriptor = "I")
    private int field312;

    @OriginalMember(owner = "mapview!mapview", name = "pb", descriptor = "I")
    private int field318;

    @OriginalMember(owner = "mapview!mapview", name = "qb", descriptor = "I")
    private int field319;

    @OriginalMember(owner = "mapview!mapview", name = "sb", descriptor = "I")
    private static int field321;

    @OriginalMember(owner = "mapview!mapview", name = "Sb", descriptor = "I")
    private int field347;

    @OriginalMember(owner = "mapview!mapview", name = "Yb", descriptor = "I")
    public static int field353;

    @OriginalMember(owner = "mapview!mapview", name = "rb", descriptor = "Lna;")
    private class26 field320;

    @OriginalMember(owner = "mapview!mapview", name = "xb", descriptor = "Lq;")
    private class31 field326;

    @OriginalMember(owner = "mapview!mapview", name = "q", descriptor = "Ls;")
    private class35 field267;

    @OriginalMember(owner = "mapview!mapview", name = "G", descriptor = "Ls;")
    private class35 field283;

    @OriginalMember(owner = "mapview!mapview", name = "M", descriptor = "Ls;")
    private class35 field289;

    @OriginalMember(owner = "mapview!mapview", name = "ab", descriptor = "Ls;")
    private class35 field303;

    @OriginalMember(owner = "mapview!mapview", name = "kb", descriptor = "Ls;")
    private class35 field313;

    @OriginalMember(owner = "mapview!mapview", name = "ob", descriptor = "Ls;")
    private class35 field317;

    @OriginalMember(owner = "mapview!mapview", name = "ub", descriptor = "Ls;")
    private class35 field323;

    @OriginalMember(owner = "mapview!mapview", name = "Jb", descriptor = "Ls;")
    private class35 field338;

    @OriginalMember(owner = "mapview!mapview", name = "Hb", descriptor = "Lt;")
    private class37 field336;

    @OriginalMember(owner = "mapview!mapview", name = "Ub", descriptor = "[I")
    public static int[] field349;

    @OriginalMember(owner = "mapview!mapview", name = "N", descriptor = "[Lna;")
    private class26[] field290;

    @OriginalMember(owner = "mapview!mapview", name = "tb", descriptor = "[Lna;")
    private class26[] field322;

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(I[BII)I", line = 8)
    public static final int method141(int arg0, byte[] arg1, int arg2, int arg3) {
        int var4 = -1;
        for (int var5 = arg3; var5 < arg0; var5++) {
            var4 = var4 >>> 8 ^ class3.field30[(var4 ^ arg1[var5]) & 0xFF];
        }
        if (arg2 > -114) {
            field349 = null;
        }
        return ~var4;
    }

    @OriginalMember(owner = "mapview!mapview", name = "c", descriptor = "(I)V", line = 46)
    public final void method132(int arg0) {
        if (!class38.field509) {
            class38.field509 = this.method151(false);
            class33.method217((byte) 85, class34.field487, null, class27.field415);
            return;
        }
        if (arg0 != 1) {
            this.method147(127, -123);
        }
        if (this.field292) {
            this.field292 = false;
            class27.field411 = true;
            class13.method69();
            int var2 = class25.field374 - (int) (635.0D / this.field310);
            int var3 = class29.field431 - (int) (503.0D / this.field310);
            int var4 = class25.field374 + (int) (635.0D / this.field310);
            int var5 = (int) (503.0D / this.field310) + class29.field431;
            this.method152(0, 503, 0, var2, var5, (byte) 119, 635, var4, var3);
            if (this.field293) {
                this.field326.method211(this.field347, this.field298);
                class13.method71(this.field318 * var2 / class26.field399 + this.field347, this.field265 * var3 / class39.field519 + this.field298, (var4 - var2) * this.field318 / class26.field399, (var5 - var3) * this.field265 / class39.field519, 16711680, 128);
                class13.method67(this.field318 * var2 / class26.field399 + this.field347, this.field298 - -(this.field265 * var3 / class39.field519), (var4 - var2) * this.field318 / class26.field399, (var5 - var3) * this.field265 / class39.field519, 16711680);
                if (this.field346 > 0 && this.field346 % 10 < 5) {
                    for (int var6 = 0; var6 < class2.field12; var6++) {
                        if (class12.field117.field10[var6] == this.field314) {
                            int var7 = class12.field117.field14[var6] * this.field318 / class26.field399 + this.field347;
                            int var8 = class12.field117.field25[var6] * this.field265 / class39.field519 + this.field298;
                            class13.method73(var7, var8, 2, 16776960, 256);
                        }
                    }
                }
            }
            if (this.field297) {
                this.method149(7829367, this.field325, 10066329, -106, this.field288, 5592405, this.field295, this.field280, 18);
                this.method149(7829367, this.field325 + 18, 10066329, arg0 - 110, this.field288, 5592405, this.field295, class4.field49, this.field345 - 36);
                this.method149(7829367, this.field345 + this.field325 - 18, 10066329, -107, this.field288, 5592405, this.field295, this.field343, 18);
                int var9 = this.field274;
                int var10 = this.field325 + 21;
                for (int var11 = 0; var11 < 24; var11++) {
                    if (var9 < class15.field152.length && this.field322.length > var9) {
                        if (this.field322[var9].method181(arg0 - 2, class5.field59)) {
                            var11--;
                            var9++;
                            continue;
                        }
                        class15.field152[var9].method213(this.field288 + 3, var10);
                        int var12 = 16777215;
                        this.field336.method100(this.field322[var9], this.field288 + 21, var10 + 14, 0, -1);
                        if (this.field299 == var9) {
                            var12 = 12298922;
                        }
                        if (this.field346 > 0 && this.field346 % 10 < 5 && this.field314 == var9) {
                            var12 = 16776960;
                        }
                        this.field336.method100(this.field322[var9], this.field288 + 20, var10 + 13, var12, -1);
                    }
                    var10 += 17;
                    var9++;
                }
            }
            if (class30.field453.length == 1) {
                this.method149(this.field286, this.field298 + this.field265, this.field331, -99, this.field347, this.field281, this.field318, this.field351, 18);
                this.method149(this.field286, this.field325 + this.field345, this.field331, arg0 ^ 0xFFFFFF82, this.field288, this.field281, this.field295, this.field341, 18);
                if (this.field344 == 3.0D) {
                    this.method149(this.field287, this.field275, this.field284, -101, this.field272, this.field264, this.field340, class27.field414, this.field276);
                } else {
                    this.method149(this.field286, this.field275, this.field331, arg0 - 95, this.field272, this.field281, this.field340, class27.field414, this.field276);
                }
                if (this.field344 == 4.0D) {
                    this.method149(this.field287, this.field275, this.field284, -104, this.field272 + this.field270, this.field264, this.field340, class15.field154, this.field276);
                } else {
                    this.method149(this.field286, this.field275, this.field331, -99, this.field272 + this.field270, this.field281, this.field340, class15.field154, this.field276);
                }
                if (this.field344 == 6.0D) {
                    this.method149(this.field287, this.field275, this.field284, -102, this.field270 * 2 + this.field272, this.field264, this.field340, class2.field8, this.field276);
                } else {
                    this.method149(this.field286, this.field275, this.field331, -117, this.field272 + this.field270 * 2, this.field281, this.field340, class2.field8, this.field276);
                }
                if (this.field344 == 8.0D) {
                    this.method149(this.field287, this.field275, this.field284, -92, this.field270 * 3 + this.field272, this.field264, this.field340, class3.field31, this.field276);
                } else {
                    this.method149(this.field286, this.field275, this.field331, -127, this.field270 * 3 + this.field272, this.field281, this.field340, class3.field31, this.field276);
                }
            } else {
                this.method149(this.field286, this.field298 + this.field265, this.field331, -105, this.field347, this.field281, this.field318, this.field351, 18);
                this.method149(this.field286, this.field345 + this.field325, this.field331, arg0 ^ 0xFFFFFF95, this.field288, this.field281, this.field295, this.field341, 18);
                this.method160(arg0 ^ 0xFFFFFFFE, this.field286);
                int var13 = this.field332 + this.field275;
                if (this.field344 == 3.0D) {
                    this.method149(this.field287, var13, this.field284, arg0 - 129, this.field272, this.field264, this.field340, class27.field414, this.field276);
                } else {
                    this.method149(this.field286, var13, this.field331, -120, this.field272, this.field281, this.field340, class27.field414, this.field276);
                }
                if (this.field344 == 4.0D) {
                    this.method149(this.field287, var13, this.field284, -127, this.field272 + this.field270, this.field264, this.field340, class15.field154, this.field276);
                } else {
                    this.method149(this.field286, var13, this.field331, -105, this.field272 + this.field270, this.field281, this.field340, class15.field154, this.field276);
                }
                if (this.field344 == 6.0D) {
                    this.method149(this.field287, var13, this.field284, -108, this.field270 * 2 + this.field272, this.field264, this.field340, class2.field8, this.field276);
                } else {
                    this.method149(this.field286, var13, this.field331, -113, this.field270 * 2 + this.field272, this.field281, this.field340, class2.field8, this.field276);
                }
                if (this.field344 == 8.0D) {
                    this.method149(this.field287, var13, this.field284, -119, this.field270 * 3 + this.field272, this.field264, this.field340, class3.field31, this.field276);
                } else {
                    this.method149(this.field286, var13, this.field331, -113, this.field272 + this.field270 * 3, this.field281, this.field340, class3.field31, this.field276);
                }
            }
            if (class24.field257) {
                this.method149(this.field286, this.field273, this.field331, arg0 ^ 0xFFFFFF89, this.field315, this.field281, this.field279, this.field305, this.field308);
                if (class10.field93) {
                    class13.method71(this.field315 + this.field279 + 2, this.field273, this.field277 + 10, this.field308, 8925952, 192);
                    class13.method67(this.field279 + this.field315 + 2, this.field273, this.field277 + 10, this.field308, 16777215);
                    if (class34.field486 > -1 && this.field320.method179(arg0 + 117) > 0) {
                        class26 var14 = this.field296[class34.field486].method184((byte) 65, 47, 32);
                        int var15 = this.field320.method179(122);
                        if (var15 > var14.method179(127)) {
                            var15 = var14.method179(arg0 ^ 0x5);
                        }
                        this.field336.method100(var14, this.field315 + this.field279 + 6, 20, 10066176, 0);
                        this.field336.method100(var14.method187(0, var15, arg0 ^ 0x7E), this.field315 + this.field279 + 6, 20, 16777215, 0);
                    } else {
                        this.field336.method100(this.field328, this.field315 + this.field279 + 6, 20, 16776960, 0);
                    }
                }
            }
        }
        if (class27.field411) {
            this.method144(2);
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(Ljava/lang/Object;IZ)[B", line = 250)
    public static final byte[] method142(Object arg0, int arg1, boolean arg2) {
        if (arg0 == null) {
            return null;
        }
        int var3 = 119 / ((arg1 - 35) / 53);
        if (arg0 instanceof byte[]) {
            byte[] var4 = (byte[]) arg0;
            return arg2 ? class27.method194(107, var4) : var4;
        } else if (arg0 instanceof class11) {
            class11 var5 = (class11) arg0;
            return var5.method58((byte) 23);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(IB)V", line = 284)
    private final void method143(int arg0, byte arg1) {
        if (arg0 < class30.field453.length) {
            class1 var3 = class30.field453[arg0];
            class40 var4 = new class40(var3.method204(class34.field483, class32.field468, true));
            var4.method255((byte) 127);
            class40 var5 = new class40(var3.method204(class26.field398, class32.field468, true));
            this.field324 = var5.method246(arg1 ^ 0xFFFF9D28);
            for (int var6 = 0; var6 < this.field324; var6++) {
                this.field296[var6] = var5.method255((byte) 127);
                this.field342[var6] = var5.method246(arg1 - 25384);
                this.field334[var6] = var5.method246(-25327);
                this.field291[var6] = var5.method252(class33.method218(arg1, 198));
                class26 var7 = this.field296[var6].method184((byte) 65, 47, 32);
                int var8 = this.field336.method104(var7);
                if (var8 > this.field277) {
                    this.field277 = var8;
                }
                int var9 = this.field336.method104(this.field328);
                if (var9 > this.field277) {
                    this.field277 = var9;
                }
            }
            class12.field117 = new class2();
            class12.field117.method7(class30.field453[arg0], -31);
            class25.field374 = class39.field522;
            this.field265 = 180;
            class29.field431 = class4.field45;
            this.field318 = class26.field399 * this.field265 / class39.field519;
            this.field298 = 503 - this.field265 - 20;
            this.field347 = 635 - this.field318 - 5;
            this.field326 = new class31(this.field318, this.field265);
            this.field326.method212();
            this.method152(0, this.field265, 0, 0, class39.field519, (byte) 124, this.field318, class26.field399, 0);
            class13.method67(0, 0, this.field318, this.field265, 0);
            class13.method67(1, 1, this.field318 - 2, this.field265 - 2, this.field331);
            class21.field223.method28((byte) 58);
        }
        if (arg1 != 57) {
            this.field314 = -106;
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "h", descriptor = "(I)V", line = 349)
    private final void method144(int arg0) {
        class27.field411 = false;
        try {
            if (arg0 != 2) {
                this.method140((byte) 85);
            }
            Graphics var2 = class32.field467.getGraphics();
            class21.field223.method31(0, 0, 111, var2);
        } catch (Exception var4) {
            class32.field467.repaint();
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(I)V", line = 366)
    public final void method128(int arg0) {
        if (class30.field457) {
            class34.method225(class32.field467, -1);
            class1.method4((byte) 99, class32.field467);
            this.method131((byte) -128);
            method158(5592405, class32.field467);
            class38.method242(class32.field467, true);
        }
        class40.method254(37);
        class4.method29(false);
        if (!class38.field509) {
            return;
        }
        if (class28.field423[96]) {
            this.field292 = true;
            class25.field374 = (int) ((double) class25.field374 - 16.0D / this.field310);
            class4.field43 = -1;
        }
        if (class28.field423[97]) {
            class4.field43 = -1;
            this.field292 = true;
            class25.field374 = (int) (16.0D / this.field310 + (double) class25.field374);
        }
        if (class28.field423[98]) {
            class4.field43 = -1;
            this.field292 = true;
            class29.field431 = (int) ((double) class29.field431 - 16.0D / this.field310);
        }
        if (class28.field423[99]) {
            class4.field43 = -1;
            this.field292 = true;
            class29.field431 = (int) (16.0D / this.field310 + (double) class29.field431);
        }
        while (true) {
            while (true) {
                while (true) {
                    while (class25.method161(-15107)) {
                        if (!class24.field257 || !class10.field93) {
                            if (class12.field122 == this.field337 || class12.field122 == this.field348) {
                                class10.field93 = true;
                                this.field292 = true;
                            }
                            if (class12.field122 == 49) {
                                this.field344 = 3.0D;
                                this.field292 = true;
                            }
                            if (class12.field122 == 50) {
                                this.field292 = true;
                                this.field344 = 4.0D;
                            }
                            if (class12.field122 == 51) {
                                this.field344 = 6.0D;
                                this.field292 = true;
                            }
                            if (class12.field122 == 52) {
                                this.field344 = 8.0D;
                                this.field292 = true;
                            }
                            if (class12.field122 == this.field327 || class12.field122 == this.field271) {
                                this.field292 = true;
                                this.field297 = !this.field297;
                            }
                            if (class12.field122 == this.field300 || class12.field122 == this.field311) {
                                this.field292 = true;
                                this.field293 = !this.field293;
                            }
                        } else if (class23.field249 == 0) {
                            this.field292 = true;
                            class10.field93 = false;
                            this.field320.method185(-1, 0);
                            class34.field486 = -1;
                        } else if (class23.field249 == 84) {
                            this.field312 = class25.field374 << 16;
                            class4.field43 = class34.field486;
                            class10.field93 = false;
                            this.field319 = class29.field431 << 16;
                            this.field320.method185(-1, 0);
                            class34.field486 = -1;
                            this.field292 = true;
                        } else {
                            boolean var2 = false;
                            if (class23.field249 == 85) {
                                if (this.field320.method179(-32) > 0) {
                                    this.field320.method185(-1, this.field320.method179(123) - 1);
                                    this.field292 = true;
                                    if (this.field320.method179(-44) == 0) {
                                        class34.field486 = -1;
                                    } else {
                                        var2 = true;
                                    }
                                }
                            } else if (class12.field122 != -1 && this.field320.method179(-59) <= class25.field354) {
                                this.field320.method173(-127, class12.field122);
                                this.field292 = true;
                            }
                            if (this.field320.method179(121) > 0) {
                                for (int var3 = 0; var3 < this.field324; var3++) {
                                    if (this.field296[var3].method179(-63) >= this.field320.method179(-49)) {
                                        class26 var4 = this.field320.method180((byte) -128);
                                        class26 var5 = this.field296[var3].method184((byte) 65, 47, 32).method187(0, this.field320.method179(119), 58).method180((byte) -128);
                                        if (var4.method190(var5, 0) == 0) {
                                            var2 = true;
                                            this.field292 = true;
                                            class34.field486 = var3;
                                            break;
                                        }
                                    }
                                }
                                if (!var2) {
                                    this.field320.method185(-1, this.field320.method179(123) - 1);
                                }
                            }
                        }
                    }
                    int var6 = class2.field24;
                    int var7 = class15.field157;
                    int var8 = class20.field215;
                    if (arg0 > -36) {
                        this.field277 = 12;
                    }
                    int var9 = class5.field57;
                    int var10 = class28.field424;
                    int var11 = class2.field11;
                    if (var6 == 1) {
                        this.field262 = class29.field431;
                        this.field352 = var7;
                        this.field278 = class25.field374;
                        this.field350 = var8;
                        if (class30.field453.length == 1) {
                            if (this.field272 < var7 && var7 < this.field340 + this.field272 && this.field275 < var8 && var8 < this.field276 + this.field275) {
                                this.field352 = -1;
                                this.field344 = 3.0D;
                            }
                            if (this.field272 + this.field270 < var7 && this.field272 + this.field340 + this.field270 > var7 && var8 > this.field275 && this.field276 + this.field275 > var8) {
                                this.field344 = 4.0D;
                                this.field352 = -1;
                            }
                            if (var7 > this.field270 * 2 + this.field272 && var7 < this.field270 * 2 + this.field272 + this.field340 && var8 > this.field275 && this.field276 + this.field275 > var8) {
                                this.field352 = -1;
                                this.field344 = 6.0D;
                            }
                            if (var7 > this.field270 * 3 + this.field272 && var7 < this.field270 * 3 + this.field272 + this.field340 && this.field275 < var8 && var8 < this.field276 + this.field275) {
                                this.field344 = 8.0D;
                                this.field352 = -1;
                            }
                        } else {
                            if (var7 > this.field272 && var7 < this.field340 + this.field272 && var8 > this.field275 && this.field276 + this.field275 + this.field332 > var8) {
                                this.field344 = 3.0D;
                                this.field352 = -1;
                            }
                            if (var7 > this.field272 + this.field270 && var7 < this.field272 + this.field270 + this.field340 && this.field275 < var8 && this.field332 + this.field276 + this.field275 > var8) {
                                this.field344 = 4.0D;
                                this.field352 = -1;
                            }
                            if (this.field270 * 2 + this.field272 < var7 && this.field270 * 2 + this.field272 + this.field340 > var7 && this.field275 < var8 && var8 < this.field275 + this.field276 + this.field332) {
                                this.field344 = 6.0D;
                                this.field352 = -1;
                            }
                            if (this.field270 * 3 + this.field272 < var7 && var7 < this.field272 + this.field270 * 3 + this.field340 && var8 > this.field275 && var8 < this.field332 + this.field275 + this.field276) {
                                this.field352 = -1;
                                this.field344 = 8.0D;
                            }
                            if (var7 > 170 && var7 < 400 && var8 > 483 && var8 < 503) {
                                this.method160(-1, this.field287);
                                this.method144(2);
                                this.method157(-1);
                                this.field352 = -1;
                            }
                        }
                        this.field333 = false;
                        if (var7 > this.field288 && this.field325 + this.field345 < var8 && var7 < this.field295 + this.field288 && var8 < 503) {
                            this.field352 = -1;
                            this.field297 = !this.field297;
                        }
                        this.field292 = true;
                        if (var7 > this.field347 && var8 > this.field298 + this.field265 && var7 < this.field347 + this.field318 && var8 < 503) {
                            this.field293 = !this.field293;
                            this.field352 = -1;
                        }
                        if (this.field297) {
                            if (this.field288 < var7 && var8 > this.field325 && this.field295 + this.field288 > var7 && this.field325 + 18 > var8 && this.field329 > 0) {
                                this.field329 -= 24;
                            }
                            if (this.field288 < var7 && var8 > this.field325 && var7 < this.field295 + this.field288 && this.field345 + this.field325 > var8) {
                                this.field352 = -1;
                            }
                            if (var7 > this.field288 && var8 > this.field325 + this.field345 - 18 && var7 < this.field295 + this.field288 && var8 < this.field345 + this.field325 && this.field329 < 48) {
                                this.field329 += 24;
                            }
                        }
                        if (this.field293 && this.field347 < var7 && var8 > this.field298 && var7 < this.field347 + this.field318 && this.field298 + this.field265 > var8) {
                            this.field352 = -1;
                            class25.field374 = (var7 - this.field347) * class26.field399 / this.field318;
                            this.field333 = true;
                            class29.field431 = (var8 - this.field298) * class39.field519 / this.field265;
                        }
                        if (class24.field257 && !class10.field93 && !this.field333 && this.field315 < var7 && this.field273 < var8 && var7 < this.field315 + this.field279 && this.field308 + this.field273 > var8) {
                            class10.field93 = true;
                        }
                    }
                    if (this.field297) {
                        this.field299 = -1;
                        if (this.field288 < var10 && this.field295 + this.field288 > var10) {
                            int var12 = this.field274;
                            int var13 = this.field325 + 21 + 5;
                            for (int var14 = 0; var14 < 24; var14++) {
                                if (this.field322.length > var12 && this.field322[var12].method181(-1, class5.field59)) {
                                    var12++;
                                    var14--;
                                } else {
                                    if (var13 <= var11 && var13 + 17 > var11) {
                                        if (var6 == 1) {
                                            this.field314 = var12;
                                            this.field346 = 50;
                                        }
                                        this.field299 = var12;
                                    }
                                    var13 += 17;
                                    var12++;
                                }
                            }
                        }
                        if (this.field302 != this.field299) {
                            this.field302 = this.field299;
                            this.field292 = true;
                        }
                    }
                    if (var9 == 1 && this.field293 && this.field333) {
                        class4.field43 = -1;
                        int var15 = var10;
                        if (var10 < this.field347) {
                            var15 = this.field347;
                        } else if (this.field347 + this.field318 < var10) {
                            var15 = this.field347 + this.field318;
                        }
                        class25.field374 = (var15 - this.field347) * class26.field399 / this.field318;
                        int var16 = var11;
                        if (var11 < this.field298) {
                            var16 = this.field298;
                        } else if (this.field298 + this.field265 < var11) {
                            var16 = this.field298 + this.field265;
                        }
                        class29.field431 = (var16 - this.field298) * class39.field519 / this.field265;
                        this.field292 = true;
                    } else {
                        this.field333 = false;
                    }
                    if (var9 == 1 && this.field352 != -1) {
                        class29.field431 = (int) ((double) (this.field350 - var11) * 2.0D / this.field344) + this.field262;
                        this.field292 = true;
                        class25.field374 = this.field278 + (int) ((double) (this.field352 - var10) * 2.0D / this.field344);
                        class4.field43 = -1;
                    }
                    if (this.field310 < this.field344) {
                        this.field310 += this.field310 / 30.0D;
                        if (this.field344 < this.field310) {
                            this.field310 = this.field344;
                        }
                        this.field292 = true;
                    }
                    if (this.field310 > this.field344) {
                        this.field310 -= this.field310 / 30.0D;
                        this.field292 = true;
                        if (this.field310 < this.field344) {
                            this.field310 = this.field344;
                        }
                    }
                    if (this.field329 > this.field274) {
                        this.field274++;
                        this.field292 = true;
                    }
                    if (this.field329 < this.field274) {
                        this.field274--;
                        this.field292 = true;
                    }
                    if (this.field346 > 0) {
                        this.field346--;
                        this.field292 = true;
                    }
                    if (class4.field43 >= 0) {
                        field321 = this.field342[class4.field43] - class11.field103;
                        byte var17 = 4;
                        int var18 = field321 - (int) (635.0D / this.field310);
                        int var19 = field321 + (int) (635.0D / this.field310);
                        class8.field81 = class39.field519 + class4.field47 - this.field334[class4.field43];
                        if (var18 < 48) {
                            field321 = (int) (635.0D / this.field310) + 48;
                        }
                        int var20 = (int) (503.0D / this.field310) + class8.field81;
                        this.field292 = true;
                        int var21 = class8.field81 - (int) (503.0D / this.field310);
                        if (class26.field399 - 48 < var19) {
                            field321 = class26.field399 - (int) (635.0D / this.field310) - 48;
                        }
                        field321 <<= 0x10;
                        int var22 = field321 - this.field312;
                        if (var21 < 48) {
                            class8.field81 = (int) (503.0D / this.field310) + 48;
                        }
                        if (var20 > class39.field519 - 48) {
                            class8.field81 = class39.field519 - (int) (503.0D / this.field310) - 48;
                        }
                        class8.field81 <<= 0x10;
                        int var23 = class8.field81 - this.field319;
                        if (var22 >> var17 == 0 && var23 >> var17 == 0) {
                            class4.field43 = -1;
                        } else {
                            this.field312 += var22 >> var17;
                            this.field319 += var23 >> var17;
                            class29.field431 = this.field319 >> 16;
                            class25.field374 = this.field312 >> 16;
                        }
                    }
                    int var24 = (int) (635.0D / this.field310) + class25.field374;
                    int var25 = class25.field374 - (int) (635.0D / this.field310);
                    int var26 = (int) (503.0D / this.field310) + class29.field431;
                    int var27 = class29.field431 - (int) (503.0D / this.field310);
                    if (var27 < 48) {
                        class29.field431 = (int) (503.0D / this.field310) + 48;
                    }
                    if (class39.field519 - 48 < var26) {
                        class29.field431 = class39.field519 - (int) (503.0D / this.field310) - 48;
                    }
                    if (var25 < 48) {
                        class25.field374 = (int) (635.0D / this.field310) + 48;
                    }
                    if (var24 > class26.field399 - 48) {
                        class25.field374 = class26.field399 - (int) (635.0D / this.field310) - 48;
                    }
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "i", descriptor = "(I)V", line = 914)
    private final void method145(int arg0) {
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
                        class10.field97 = var8 + var6 + "/rsmap/";
                        return;
                    }
                }
            } catch (Exception var14) {
            }
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(II)I", line = 989)
    private final int method146(int arg0, int arg1) {
        if (arg1 != 32) {
            this.field323 = null;
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
            return class2.method10(arg0, false);
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "b", descriptor = "(II)I", line = 1051)
    private final int method147(int arg0, int arg1) {
        arg1++;
        if (arg0 == -7803) {
            if (arg1 >= class30.field453.length) {
                arg1 = 0;
            }
            return arg1;
        } else {
            return 65;
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(ZI)Lna;", line = 1066)
    private static final class26 method148(boolean arg0, int arg1) {
        if (arg0) {
            field349 = null;
        }
        class26 var2 = new class26();
        var2.field405 = new byte[arg1];
        var2.field404 = 0;
        return var2;
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(IIIIIIILna;I)V", line = 1098)
    private final void method149(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class26 arg7, int arg8) {
        class13.method67(arg4, arg1, arg6, arg8, 0);
        int var10 = arg1 + 1;
        int var12 = arg6 - 2;
        int var11 = arg4 + 1;
        int var13 = arg8 - 2;
        class13.method76(var11, var10, var12, var13, arg0);
        class13.method75(var11, var10, var12, arg2);
        if (arg3 > -88) {
            this.field347 = -82;
        }
        class13.method65(var11, var10, var13, arg2);
        class13.method75(var11, var13 + var10 - 1, var12, arg5);
        class13.method65(var11 + var12 - 1, var10, var13, arg5);
        this.field336.method113(arg7, var11 + var12 / 2 + 1, var13 / 2 + var10 - -5, 0, -1);
        this.field336.method113(arg7, var11 + var12 / 2, var13 / 2 + var10 + 4, 16777215, -1);
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "([BLjava/lang/String;B)Z", line = 1127)
    private final boolean method150(byte[] arg0, String arg1, byte arg2) {
        if (arg0 == null) {
            return false;
        }
        try {
            MessageDigest var4 = MessageDigest.getInstance("SHA");
            var4.reset();
            var4.update(arg0);
            if (arg2 != 66) {
                field266 = null;
            }
            byte[] var5 = var4.digest();
            if (arg1 == "main_file_cache.dat0") {
                if (var5[0] != 43 || var5[1] != 30 || var5[2] != -86 || var5[3] != -126 || var5[4] != 51 || var5[5] != 41 || var5[6] != -17 || var5[7] != -55 || var5[8] != 42 || var5[9] != 12 || var5[10] != -56 || var5[11] != -86 || var5[12] != -120 || var5[13] != 27 || var5[14] != 23 || var5[15] != -39 || var5[16] != -122 || var5[17] != 39 || var5[18] != -106 || var5[19] != 64) {
                    return false;
                }
            } else if (arg1 == "main_file_cache.idx1") {
                if (var5[0] != 52 || var5[1] != 126 || var5[2] != -117 || var5[3] != -96 || var5[4] != 55 || var5[5] != 19 || var5[6] != -40 || var5[7] != 125 || var5[8] != 49 || var5[9] != -77 || var5[10] != 77 || var5[11] != -79 || var5[12] != -93 || var5[13] != -47 || var5[14] != -110 || var5[15] != -122 || var5[16] != 84 || var5[17] != -103 || var5[18] != -78 || var5[19] != 126) {
                    return false;
                }
            } else if (var5[0] != 60 || var5[1] != 21 || var5[2] != 87 || var5[3] != 88 || var5[4] != 46 || var5[5] != 46 || var5[6] != -111 || var5[7] != -12 || var5[8] != 120 || var5[9] != -77 || var5[10] != 2 || var5[11] != 11 || var5[12] != 113 || var5[13] != -107 || var5[14] != 120 || var5[15] != 13 || var5[16] != -123 || var5[17] != -42 || var5[18] != -53 || var5[19] != -73) {
                return false;
            }
            return true;
        } catch (Exception var7) {
            this.method136("sha", 0);
            return false;
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(Z)Z", line = 1174)
    private final boolean method151(boolean arg0) {
        if (class21.field221 == 0) {
            this.method145(0);
            class21.field221 = 1;
        }
        if (arg0) {
            return false;
        }
        if (class21.field221 == 1) {
            class27.field415 = 15;
            boolean var2 = this.method159(this.field309, "main_file_cache.idx0", 125);
            if (!var2) {
                return false;
            }
            class24.field255 = class22.field235;
            class22.field235 = null;
            if (class24.field255 == null) {
                throw new RuntimeException("T1");
            }
            class21.field221 = 2;
        }
        if (class21.field221 == 2) {
            class27.field415 = 30;
            boolean var3 = this.method159(this.field330, "main_file_cache.idx1", 125);
            if (!var3) {
                return false;
            }
            class4.field48 = class22.field235;
            class22.field235 = null;
            if (class4.field48 == null) {
                throw new RuntimeException("T2");
            }
            class21.field221 = 3;
        }
        if (class21.field221 == 3) {
            class21.field221 = 10;
            class30.field453 = new class1[1];
        }
        if (class21.field221 == 10) {
            class27.field415 = 50;
            boolean var4 = this.method159(this.field282, "main_file_cache.dat0", 125);
            if (!var4) {
                return false;
            }
            class30.field453[0] = class22.field235;
            class22.field235 = null;
            if (class30.field453[0] == null) {
                throw new RuntimeException("T3");
            }
            class21.field221 = 20;
        }
        if (class21.field221 != 20) {
            return false;
        }
        class26.field396 = class8.method42(class4.field49, 13715, field335, class24.field255);
        class15.field152 = class11.method57(class24.field255, class21.field222, class4.field49, (byte) -91);
        this.field336 = class3.method24(class24.field255, class4.field49, class11.field109, class4.field48, (byte) 69);
        this.field303 = new class35(11, true, this);
        this.field289 = new class35(12, true, this);
        this.field283 = new class35(14, true, this);
        this.field313 = new class35(17, true, this);
        this.field323 = new class35(19, true, this);
        this.field267 = new class35(22, true, this);
        this.field317 = new class35(26, true, this);
        this.field338 = new class35(30, true, this);
        class27.field415 = 100;
        class34.field487 = this.field316;
        class33.method217((byte) 85, class34.field487, null, class27.field415);
        this.field279 = this.field336.method104(this.field305) + 20;
        this.method157(-1);
        class26[] var5 = this.field322;
        for (int var6 = 0; var6 < var5.length; var6++) {
            class26 var7 = var5[var6];
            int var8 = this.field336.method104(var7);
            if (var8 > this.field285) {
                this.field285 = var8;
            }
        }
        this.field295 = this.field285 + 34;
        if (this.field295 > 140) {
            int var9 = this.field347 - this.field288 - this.field295;
            this.field301 = var9 / 25;
            this.field340 = this.field301 * 5;
            int var10 = var9 - this.field301 * 25;
            this.field272 = this.field295 + var10 / 2 + this.field301 + this.field288;
            this.field270 = this.field340 + this.field301;
        }
        return true;
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(IIIIIBIII)V", line = 1367)
    private final void method152(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, int arg8) {
        if (arg5 <= 61) {
            this.method143(-4, (byte) 126);
        }
        class12.field117.method20(-110, arg0, arg1, arg2, arg6, arg3, arg4, arg8, arg7);
        if (arg6 - arg2 < -arg3 + arg7) {
            return;
        }
        class12.field117.method13(arg1, arg2, this.field310, arg3, arg0, arg4, arg7, arg6, arg8, false);
        class12.field117.method14(arg4, arg7, arg3, arg1, arg8, -21, arg2, arg6, arg0);
        class12.field117.method15(arg2, this.field314, arg4, arg8, arg1, arg7, arg6, arg3, arg0, this.field346, -7);
        if (this.field344 == this.field310 && class2.field20) {
            for (int var10 = 0; var10 < this.field324; var10++) {
                int var11 = this.field334[var10];
                int var12 = class4.field47 + class39.field519 - var11;
                int var13 = (var12 - arg8) * (-arg0 + arg1) / (arg4 - arg8) + arg0;
                int var14 = this.field342[var10];
                int var15 = this.field291[var10];
                int var16 = var14 - class11.field103;
                int var17 = (arg6 - arg2) * (-arg3 + var16) / (arg7 - arg3) + arg2;
                int var18 = 16777215;
                class35 var19 = null;
                if (var15 == 0) {
                    if (this.field310 == 3.0D) {
                        var19 = this.field303;
                    }
                    if (this.field310 == 4.0D) {
                        var19 = this.field289;
                    }
                    if (this.field310 == 6.0D) {
                        var19 = this.field283;
                    }
                    if (this.field310 == 8.0D) {
                        var19 = this.field313;
                    }
                }
                if (var15 == 1) {
                    if (this.field310 == 3.0D) {
                        var19 = this.field283;
                    }
                    if (this.field310 == 4.0D) {
                        var19 = this.field313;
                    }
                    if (this.field310 == 6.0D) {
                        var19 = this.field323;
                    }
                    if (this.field310 == 8.0D) {
                        var19 = this.field267;
                    }
                }
                if (var15 == 2) {
                    var18 = 16755200;
                    if (this.field310 == 3.0D) {
                        var19 = this.field323;
                    }
                    if (this.field310 == 4.0D) {
                        var19 = this.field267;
                    }
                    if (this.field310 == 6.0D) {
                        var19 = this.field317;
                    }
                    if (this.field310 == 8.0D) {
                        var19 = this.field338;
                    }
                }
                if (var19 != null) {
                    int var20 = 1;
                    class26 var21 = this.field296[var10];
                    for (int var22 = 0; var21.method179(123) > var22; var22++) {
                        if (var21.method183(-13799, var22) == 47) {
                            var20++;
                        }
                    }
                    int var23 = var13 - (var20 - 1) * var19.method237() / 2;
                    int var24 = var23 + var19.method236() / 2;
                    while (true) {
                        int var25 = var21.method166(47, (byte) 96);
                        if (var25 == -1) {
                            var19.method231(var21, var17, var24, var18, true);
                            break;
                        }
                        class26 var26 = var21.method187(0, var25, 102);
                        var19.method231(var26, var17, var24, var18, true);
                        var24 += var19.method237();
                        var21 = var21.method178(var25 + 1, (byte) -127);
                    }
                }
            }
        }
        if (!class27.field413) {
            return;
        }
        for (int var27 = class11.field103 / 64; var27 < (class26.field399 + class11.field103) / 64; var27++) {
            for (int var28 = class4.field47 / 64; var28 < (class4.field47 + class39.field519) / 64; var28++) {
                int var29 = var27 * 64;
                int var30 = var29 - class11.field103;
                int var31 = var28 * 64;
                int var32 = arg2 + (arg6 - arg2) * (-arg3 + var30) / (arg7 - arg3);
                int var33 = class4.field47 + class39.field519 - var31;
                int var34 = (var30 + 64 - arg3) * (-arg2 + arg6) / (arg7 - arg3) + arg2;
                int var35 = arg0 + (arg1 - arg0) * (-arg8 + var33) / (arg4 - arg8);
                int var36 = (var33 - arg8 - 64) * (-arg0 + arg1) / (arg4 - arg8) + arg0;
                class13.method67(var32, var36, var34 - var32, -var36 + var35, 16777215);
                this.field336.method99(class8.method38(new class26[] { class26.method186(var27, 36), class3.field34, class26.method186(var28, 72) }, 0), var34 - 5, var35 + -5, 16777215, -1);
                if (var27 == 33 && var28 >= 71 && var28 <= 73) {
                    this.field336.method113(class4.field38, (var32 + var34) / 2, (var35 + var36) / 2, 16711680, -1);
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(ILna;Ljava/lang/String;)Z", line = 1556)
    private final boolean method153(int arg0, class26 arg1, String arg2) {
        try {
            if (class33.field478 == null) {
                class34.field487 = class8.method38(new class26[] { this.field268, class26.field397, arg1 }, 0);
                String var4;
                if (arg2 == "main_file_cache.dat0") {
                    var4 = "worldmap.main.js5?crc=11021218";
                } else if (arg2 == "main_file_cache.dat1") {
                    var4 = "worldmap.dungeon.js5?crc=-337828820";
                } else if (arg2 == "main_file_cache.dat2") {
                    var4 = "worldmap.extra.js5?crc=1607947461";
                } else if (arg2 == "main_file_cache.idx1") {
                    var4 = "mapview.fontmetrics.js5?crc=-447025815";
                } else {
                    var4 = "mapview.sprites.js5?crc=309377894";
                }
                class33.field478 = new DataInputStream((new URL(this.getCodeBase(), var4)).openStream());
                int var5;
                if (arg2 == "main_file_cache.dat0") {
                    var5 = 418347;
                } else if (arg2 == "main_file_cache.dat1") {
                    var5 = 154707;
                } else if (arg2 == "main_file_cache.dat2") {
                    var5 = 145026;
                } else if (arg2 == "main_file_cache.idx1") {
                    var5 = 165;
                } else {
                    var5 = 9522;
                }
                class2.field9 = 0;
                class32.field469 = 0;
                class40.field527 = new byte[var5];
            }
            int var6 = -57 / ((arg0 + 40) / 58);
            int var7 = class40.field527.length;
            int var8 = class2.field9;
            if (var8 >= var7) {
                class33.field478.close();
                class33.field478 = null;
                if (!this.method150(class40.field527, arg2, (byte) 66)) {
                    this.method136("download", 0);
                    class40.field527 = null;
                }
                return true;
            }
            class32.field469++;
            if (class32.field469 >= 1500) {
                throw new IOException();
            }
            DataInputStream var9 = class33.field478;
            int var10 = var9.available();
            if (var10 < 0) {
                throw new EOFException();
            } else if (var10 == 0) {
                return false;
            } else {
                if (var10 > var7 - var8) {
                    var10 = var7 - var8;
                }
                int var11 = var9.read(class40.field527, var8, var10);
                if (var11 < 0) {
                    throw new EOFException();
                } else if (var11 == 0) {
                    return false;
                } else {
                    int var12 = var8 + var11;
                    class32.field469 = 0;
                    int var13 = var12 * 100 / var7;
                    class34.field487 = class8.method38(new class26[] { this.field306, class26.field397, arg1, class4.field46, class26.method186(var13, 115), class30.field458 }, 0);
                    class2.field9 = var12;
                    return false;
                }
            }
        } catch (IOException var17) {
            try {
                class33.field478.close();
            } catch (Exception var16) {
            }
            class40.field527 = null;
            class33.field478 = null;
            this.method136(new String("download"), 0);
            return true;
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(B)V", line = 1686)
    public final void method127(byte arg0) {
        class26.method172((byte) 109);
        method158(arg0 ^ 0xFFAAAAD2, class32.field467);
        class38.method242(class32.field467, true);
        class34.field487 = this.field294;
        boolean var2 = false;
        boolean var3 = true;
        this.field322 = class21.method116(-18295);
        this.field290 = class18.method94(0);
        if (arg0 != -121) {
            this.field318 = 51;
        }
        if (var3) {
            byte var4 = 0;
            if (this.field290.length == 14) {
                byte var10002 = var4;
                int var5 = var4 + 1;
                this.field351 = this.field290[var10002];
                int var19 = var5;
                int var6 = var5 + 1;
                this.field305 = this.field290[var19];
                int var20 = var6;
                int var7 = var6 + 1;
                this.field341 = this.field290[var20];
                int var21 = var7;
                int var8 = var7 + 1;
                this.field280 = this.field290[var21];
                int var22 = var8;
                int var9 = var8 + 1;
                this.field343 = this.field290[var22];
                int var23 = var9;
                int var10 = var9 + 1;
                this.field294 = this.field290[var23];
                int var24 = var10;
                int var11 = var10 + 1;
                this.field316 = this.field290[var24];
                int var25 = var11;
                int var12 = var11 + 1;
                this.field328 = this.field290[var25];
                int var26 = var12;
                int var13 = var12 + 1;
                this.field268 = this.field290[var26];
                int var27 = var13;
                int var14 = var13 + 1;
                this.field309 = this.field290[var27];
                int var28 = var14;
                int var15 = var14 + 1;
                this.field330 = this.field290[var28];
                int var29 = var15;
                int var16 = var15 + 1;
                this.field282 = this.field290[var29];
                int var17 = var16 + 1;
                int var30 = var17;
                int var18 = var17 + 1;
                this.field306 = this.field290[var30];
                this.field311 = this.field351.method183(-13799, 0);
                this.field348 = this.field305.method183(-13799, 0);
                this.field271 = this.field341.method183(-13799, 0);
                this.field300 = this.method146(this.field311, 32);
                this.field337 = this.method146(this.field348, 32);
                this.field327 = this.method146(this.field271, 32);
            } else {
                class40.method253(new class26[] { class15.field156 }, arg0 + 121);
            }
        }
        this.field320 = method148(false, 50);
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(ILjava/lang/String;[B)V", line = 1759)
    private final void method154(int arg0, String arg1, byte[] arg2) throws IOException {
        FileOutputStream var4 = new FileOutputStream(arg1);
        if (arg0 == 4807) {
            var4.write(arg2, 0, arg2.length);
            var4.close();
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "init", descriptor = "()V", line = 1785)
    public final void init() {
        if (this.method129(4000)) {
            this.method133(Integer.parseInt(this.getParameter("codeversion")), true, 635, 32, 503);
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "d", descriptor = "(I)V", line = 1815)
    public final void method134(int arg0) {
        method156((byte) 17);
        class3.method23(30);
        class26.method171((byte) 98);
        class30.method209((byte) -117);
        class23.method125(0);
        class40.method256((byte) 44);
        class24.method138(arg0 - 6563);
        class27.method195((byte) 115);
        class4.method27((byte) 89);
        class1.method1(0);
        class2.method19(arg0 - 6560);
        class35.method235();
        class39.method245(-1);
        class10.method52(-125);
        class29.method203(5);
        class12.method63(1);
        class15.method86((byte) 102);
        class13.method68();
        class38.method241((byte) -63);
        class22.method121(115);
        class21.method118(arg0 ^ 0x19A3);
        class18.method95(0);
        class19.method101();
        class20.method114(64);
        class32.method215(arg0 ^ arg0);
        class5.method32(-103);
        class6.method35((byte) 119);
        class28.method196(0);
        class8.method40(true);
        class34.method224(1);
        class33.method216(arg0 - 6533);
        class11.method53(80);
        class41.method265();
        class25.method163(127);
        this.field320 = null;
        this.field289 = null;
        this.field283 = null;
        this.field342 = null;
        this.field309 = null;
        this.field296 = null;
        this.field268 = null;
        this.field328 = null;
        this.field291 = null;
        this.field290 = null;
        this.field305 = null;
        this.field343 = null;
        this.field280 = null;
        this.field330 = null;
        this.field303 = null;
        this.field294 = null;
        this.field338 = null;
        this.field317 = null;
        this.field316 = null;
        this.field306 = null;
        this.field323 = null;
        this.field341 = null;
        this.field282 = null;
        this.field351 = null;
        this.field326 = null;
        this.field267 = null;
        this.field334 = null;
        this.field322 = null;
        this.field313 = null;
        this.field336 = null;
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(Ljava/lang/String;B)[B", line = 1899)
    private final byte[] method155(String arg0, byte arg1) throws IOException {
        File var3 = new File(arg0);
        if (!var3.exists()) {
            return null;
        }
        int var4 = (int) var3.length();
        byte[] var5 = new byte[var4];
        DataInputStream var6 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg0)));
        var6.readFully(var5, 0, var4);
        int var7 = 126 / ((arg1 + 14) / 49);
        var6.close();
        return var5;
    }

    @OriginalMember(owner = "mapview!mapview", name = "f", descriptor = "(B)V", line = 1941)
    public static void method156(byte arg0) {
        field260 = null;
        field335 = null;
        if (arg0 != 17) {
            return;
        }
        field263 = null;
        field349 = null;
        field269 = null;
        field339 = null;
        field261 = null;
        field266 = null;
    }

    @OriginalMember(owner = "mapview!mapview", name = "j", descriptor = "(I)V", line = 1958)
    private final void method157(int arg0) {
        if (class30.field453.length == 1) {
            class25.field380 = 0;
        } else {
            if (class11.field110 < 0) {
                class25.field380 = this.method147(-7803, class25.field380);
            } else {
                class25.field380 = class11.field110;
            }
            class11.field110 = this.method147(-7803, class25.field380);
        }
        if (arg0 == -1) {
            this.method143(class25.field380, (byte) 57);
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(ILjava/awt/Component;)V", line = 2027)
    private static final void method158(int arg0, Component arg1) {
        Method var2 = class14.field139;
        if (var2 != null) {
            try {
                var2.invoke(arg1, Boolean.FALSE);
            } catch (Throwable var4) {
            }
        }
        if (arg0 == 5592405) {
            arg1.addKeyListener(class10.field95);
            arg1.addFocusListener(class10.field95);
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "e", descriptor = "(B)V", line = 2051)
    public final void method140(byte arg0) {
        class8.method41(26273);
        class12.method61((byte) 96);
        try {
            this.field334 = null;
            this.field342 = null;
            if (arg0 < 64) {
                this.field313 = null;
            }
            class12.field117 = null;
            this.field336 = null;
            this.field291 = null;
            this.field296 = null;
            this.field326 = null;
            this.field322 = null;
            System.gc();
        } catch (Throwable var3) {
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(Lna;Ljava/lang/String;I)Z", line = 2083)
    private final boolean method159(class26 arg0, String arg1, int arg2) {
        byte[] var4 = null;
        if (!class28.field422) {
            if (class10.field97 != null) {
                try {
                    var4 = this.method155(class10.field97 + "/" + arg1, (byte) 110);
                    if (!this.method150(var4, arg1, (byte) 66)) {
                        var4 = null;
                    }
                    if (var4 != null) {
                        class22.field235 = new class1(var4, false, true);
                        return true;
                    }
                } catch (IOException var11) {
                    var4 = null;
                }
            }
            class28.field422 = true;
        }
        if (var4 == null) {
            boolean var6 = this.method153(116, arg0, arg1);
            if (!var6) {
                return false;
            }
            var4 = class40.field527;
            class40.field527 = null;
        }
        if (var4 == null) {
            class28.field422 = false;
            return true;
        }
        if (class10.field97 != null && var4 != null) {
            try {
                this.method154(4807, class10.field97 + "/" + arg1, var4);
            } catch (IOException var10) {
            }
        }
        try {
            class22.field235 = new class1(var4, false, true);
            class28.field422 = false;
            if (arg2 < 123) {
                this.method157(-25);
            }
            return true;
        } catch (IOException var9) {
            throw class1.method2(var9, "monkey feet");
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "c", descriptor = "(II)V", line = 2173)
    private final void method160(int arg0, int arg1) {
        this.method149(arg1, 483, this.field331, arg0 - 101, 170, this.field281, 230, class8.method38(new class26[] { class18.field165, class11.field104[class11.field110], class38.field504 }, arg0 ^ arg0), 18);
    }
}
