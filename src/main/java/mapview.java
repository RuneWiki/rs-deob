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
public class mapview extends class38 {

    @OriginalMember(owner = "mapview!mapview", name = "o", descriptor = "I")
    private int field283 = 8912896;

    @OriginalMember(owner = "mapview!mapview", name = "F", descriptor = "I")
    private int field300 = 10027008;

    @OriginalMember(owner = "mapview!mapview", name = "N", descriptor = "Z")
    private boolean field308 = false;

    @OriginalMember(owner = "mapview!mapview", name = "T", descriptor = "I")
    private int field314 = 5;

    @OriginalMember(owner = "mapview!mapview", name = "E", descriptor = "I")
    private int field299 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "C", descriptor = "I")
    private int field297 = 5;

    @OriginalMember(owner = "mapview!mapview", name = "bb", descriptor = "I")
    private int field322 = 5;

    @OriginalMember(owner = "mapview!mapview", name = "H", descriptor = "I")
    private int field302 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "Y", descriptor = "D")
    private double field319 = 4.0D;

    @OriginalMember(owner = "mapview!mapview", name = "fb", descriptor = "I")
    private int field326 = 23;

    @OriginalMember(owner = "mapview!mapview", name = "n", descriptor = "I")
    private int field282 = 450;

    @OriginalMember(owner = "mapview!mapview", name = "z", descriptor = "I")
    private int field294 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "yb", descriptor = "Z")
    private boolean field345 = false;

    @OriginalMember(owner = "mapview!mapview", name = "R", descriptor = "I")
    private int field312 = -1;

    @OriginalMember(owner = "mapview!mapview", name = "db", descriptor = "I")
    private int field324 = 10;

    @OriginalMember(owner = "mapview!mapview", name = "m", descriptor = "Ld;")
    private class7 field281 = this.field345 ? class31.field445 : class31.field445;

    @OriginalMember(owner = "mapview!mapview", name = "P", descriptor = "I")
    private int field310 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "K", descriptor = "I")
    private int field305 = 40;

    @OriginalMember(owner = "mapview!mapview", name = "ab", descriptor = "Ld;")
    private class7 field321 = this.field345 ? class17.field187 : class28.field387;

    @OriginalMember(owner = "mapview!mapview", name = "y", descriptor = "I")
    private int field293 = -1;

    @OriginalMember(owner = "mapview!mapview", name = "xb", descriptor = "Ld;")
    private class7 field344 = this.field345 ? class20.field229 : class20.field229;

    @OriginalMember(owner = "mapview!mapview", name = "Bb", descriptor = "I")
    private int field348 = this.field345 ? 252 : 111;

    @OriginalMember(owner = "mapview!mapview", name = "lb", descriptor = "I")
    private int field332 = -1;

    @OriginalMember(owner = "mapview!mapview", name = "hb", descriptor = "Ld;")
    private class7 field328 = this.field345 ? class35.field462 : class35.field462;

    @OriginalMember(owner = "mapview!mapview", name = "ib", descriptor = "Ld;")
    private class7 field329 = this.field345 ? class4.field37 : class4.field37;

    @OriginalMember(owner = "mapview!mapview", name = "W", descriptor = "I")
    private int field317 = this.field345 ? 76 : 75;

    @OriginalMember(owner = "mapview!mapview", name = "S", descriptor = "I")
    private int field313 = 30;

    @OriginalMember(owner = "mapview!mapview", name = "A", descriptor = "I")
    private int field295 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "Q", descriptor = "I")
    private int field311 = this.field345 ? 83 : 70;

    @OriginalMember(owner = "mapview!mapview", name = "gb", descriptor = "Ld;")
    private class7 field327 = this.field345 ? class37.field500 : class37.field500;

    @OriginalMember(owner = "mapview!mapview", name = "mb", descriptor = "I")
    private int field333 = 50;

    @OriginalMember(owner = "mapview!mapview", name = "eb", descriptor = "I")
    private int field325 = 7824964;

    @OriginalMember(owner = "mapview!mapview", name = "X", descriptor = "Ld;")
    private class7 field318 = this.field345 ? class38.field502 : class8.field95;

    @OriginalMember(owner = "mapview!mapview", name = "t", descriptor = "I")
    private int field288 = 170;

    @OriginalMember(owner = "mapview!mapview", name = "Hb", descriptor = "Ld;")
    private class7 field354 = this.field345 ? class17.field186 : class20.field214;

    @OriginalMember(owner = "mapview!mapview", name = "q", descriptor = "I")
    private int field285 = 500;

    @OriginalMember(owner = "mapview!mapview", name = "Fb", descriptor = "I")
    private int field352 = 6706483;

    @OriginalMember(owner = "mapview!mapview", name = "nb", descriptor = "D")
    private double field334 = 4.0D;

    @OriginalMember(owner = "mapview!mapview", name = "I", descriptor = "I")
    private int field303 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "ub", descriptor = "Ld;")
    private class7 field341 = this.field345 ? class4.field39 : class4.field39;

    @OriginalMember(owner = "mapview!mapview", name = "V", descriptor = "[I")
    private int[] field316 = new int[this.field285];

    @OriginalMember(owner = "mapview!mapview", name = "Ib", descriptor = "I")
    private int field355 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "cb", descriptor = "[I")
    private int[] field323 = new int[this.field285];

    @OriginalMember(owner = "mapview!mapview", name = "Nb", descriptor = "[Ld;")
    private class7[] field360 = new class7[this.field285];

    @OriginalMember(owner = "mapview!mapview", name = "Gb", descriptor = "I")
    private int field353 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "Eb", descriptor = "Ld;")
    private class7 field351 = this.field345 ? class25.field268 : class25.field268;

    @OriginalMember(owner = "mapview!mapview", name = "vb", descriptor = "I")
    private int field342 = -20;

    @OriginalMember(owner = "mapview!mapview", name = "l", descriptor = "[I")
    private int[] field280 = new int[this.field285];

    @OriginalMember(owner = "mapview!mapview", name = "v", descriptor = "Ld;")
    private class7 field290 = this.field345 ? class24.field258 : class24.field258;

    @OriginalMember(owner = "mapview!mapview", name = "tb", descriptor = "I")
    private int field340 = 11141120;

    @OriginalMember(owner = "mapview!mapview", name = "M", descriptor = "I")
    private int field307 = this.field345 ? 108 : 107;

    @OriginalMember(owner = "mapview!mapview", name = "Ob", descriptor = "Z")
    private boolean field361 = true;

    @OriginalMember(owner = "mapview!mapview", name = "kb", descriptor = "I")
    private int field331 = 140;

    @OriginalMember(owner = "mapview!mapview", name = "Rb", descriptor = "I")
    private int field364 = 8943445;

    @OriginalMember(owner = "mapview!mapview", name = "k", descriptor = "I")
    private int field279 = this.field345 ? 220 : 79;

    @OriginalMember(owner = "mapview!mapview", name = "Mb", descriptor = "I")
    private int field359 = 471;

    @OriginalMember(owner = "mapview!mapview", name = "G", descriptor = "I")
    private int field301 = this.field333 + this.field324;

    @OriginalMember(owner = "mapview!mapview", name = "jb", descriptor = "I")
    private int field330 = this.field345 ? 115 : 102;

    @OriginalMember(owner = "mapview!mapview", name = "Qb", descriptor = "I")
    private int field363 = 33;

    @OriginalMember(owner = "mapview!mapview", name = "qb", descriptor = "Ld;")
    private class7 field337 = this.field345 ? class25.field265 : class25.field265;

    @OriginalMember(owner = "mapview!mapview", name = "Tb", descriptor = "Z")
    private boolean field366 = false;

    @OriginalMember(owner = "mapview!mapview", name = "Jb", descriptor = "Z")
    private boolean field356 = false;

    @OriginalMember(owner = "mapview!mapview", name = "j", descriptor = "I")
    private static int field278 = 50;

    @OriginalMember(owner = "mapview!mapview", name = "w", descriptor = "[[B")
    public static byte[][] field291 = new byte[50][];

    @OriginalMember(owner = "mapview!mapview", name = "B", descriptor = "Ld;")
    public static class7 field296 = class38.method251((byte) -116, "Vegetable Store");

    @OriginalMember(owner = "mapview!mapview", name = "J", descriptor = "Ld;")
    public static class7 field304 = class38.method251((byte) -63, "Fishing Spot");

    @OriginalMember(owner = "mapview!mapview", name = "O", descriptor = "I")
    private int field309;

    @OriginalMember(owner = "mapview!mapview", name = "U", descriptor = "I")
    private int field315;

    @OriginalMember(owner = "mapview!mapview", name = "Z", descriptor = "I")
    private int field320;

    @OriginalMember(owner = "mapview!mapview", name = "pb", descriptor = "I")
    private int field336;

    @OriginalMember(owner = "mapview!mapview", name = "rb", descriptor = "I")
    public static int field338;

    @OriginalMember(owner = "mapview!mapview", name = "wb", descriptor = "I")
    private int field343;

    @OriginalMember(owner = "mapview!mapview", name = "Ab", descriptor = "I")
    private int field347;

    @OriginalMember(owner = "mapview!mapview", name = "Db", descriptor = "I")
    private int field350;

    @OriginalMember(owner = "mapview!mapview", name = "Sb", descriptor = "I")
    private int field365;

    @OriginalMember(owner = "mapview!mapview", name = "zb", descriptor = "Lea;")
    private class10 field346;

    @OriginalMember(owner = "mapview!mapview", name = "i", descriptor = "La;")
    private class1 field277;

    @OriginalMember(owner = "mapview!mapview", name = "D", descriptor = "La;")
    private class1 field298;

    @OriginalMember(owner = "mapview!mapview", name = "L", descriptor = "La;")
    private class1 field306;

    @OriginalMember(owner = "mapview!mapview", name = "ob", descriptor = "La;")
    private class1 field335;

    @OriginalMember(owner = "mapview!mapview", name = "sb", descriptor = "La;")
    private class1 field339;

    @OriginalMember(owner = "mapview!mapview", name = "Kb", descriptor = "La;")
    private class1 field357;

    @OriginalMember(owner = "mapview!mapview", name = "Lb", descriptor = "La;")
    private class1 field358;

    @OriginalMember(owner = "mapview!mapview", name = "Pb", descriptor = "La;")
    private class1 field362;

    @OriginalMember(owner = "mapview!mapview", name = "r", descriptor = "Lla;")
    private static class23 field286;

    @OriginalMember(owner = "mapview!mapview", name = "Cb", descriptor = "Ld;")
    private class7 field349;

    @OriginalMember(owner = "mapview!mapview", name = "p", descriptor = "Le;")
    private class9 field284;

    @OriginalMember(owner = "mapview!mapview", name = "Ub", descriptor = "Z")
    public static boolean field367;

    @OriginalMember(owner = "mapview!mapview", name = "s", descriptor = "[Ld;")
    private class7[] field287;

    @OriginalMember(owner = "mapview!mapview", name = "x", descriptor = "[Ld;")
    private class7[] field292;

    @OriginalMember(owner = "mapview!mapview", name = "u", descriptor = "[[B")
    public static byte[][] field289;

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(Z[BLjava/lang/String;)V", line = 21)
    private final void method173(boolean arg0, byte[] arg1, String arg2) throws IOException {
        if (!arg0) {
            this.method183(-33, null, null);
        }
        FileOutputStream var4 = new FileOutputStream(arg2);
        var4.write(arg1, 0, arg1.length);
        var4.close();
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(ILjava/lang/String;Ld;)Z", line = 42)
    private final boolean method174(int arg0, String arg1, class7 arg2) {
        if (arg0 != -1) {
            method184(-42, 47, null, (byte) 12);
        }
        byte[] var4 = null;
        if (!class29.field434) {
            if (class15.field160 != null) {
                try {
                    var4 = this.method182(class15.field160 + "/" + arg1, -106);
                    if (!this.method187(arg1, arg0 + 126, var4)) {
                        var4 = null;
                    }
                    if (var4 != null) {
                        class17.field184 = new class23(var4, false, true);
                        return true;
                    }
                } catch (IOException var11) {
                    var4 = null;
                }
            }
            class29.field434 = true;
        }
        if (var4 == null) {
            boolean var6 = this.method183(-10008, arg1, arg2);
            if (!var6) {
                return false;
            }
            var4 = class37.field493;
            class37.field493 = null;
        }
        if (var4 == null) {
            class29.field434 = false;
            return true;
        }
        if (class15.field160 != null && var4 != null) {
            try {
                this.method173(true, var4, class15.field160 + "/" + arg1);
            } catch (IOException var10) {
            }
        }
        try {
            class17.field184 = new class23(var4, false, true);
            class29.field434 = false;
            return true;
        } catch (IOException var9) {
            throw class8.method82(var9, "monkey feet");
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "c", descriptor = "(Z)V", line = 116)
    public final void method175(boolean arg0) {
        method181(-21);
        if (arg0) {
            return;
        }
        class36.method237(true);
        class7.method69((byte) 120);
        class18.method127(42);
        class4.method26(1480);
        class35.method236(arg0);
        class38.method250(0);
        class21.method154((byte) 116);
        class14.method108(21208);
        class23.method162(149);
        class5.method32(-128);
        class10.method99();
        class1.method9();
        class30.method215(true);
        class11.method102(65);
        class20.method150((byte) -20);
        class24.method166(-1);
        class19.method134();
        class15.method116((byte) -125);
        class17.method126((byte) -57);
        class29.method212(!arg0);
        class26.method197((byte) 29);
        class12.method106(72);
        class22.method159(109);
        class31.method216(86);
        class2.method12(0);
        class37.method241((byte) 124);
        class16.method119((byte) 110);
        class25.method171(65280);
        class8.method83(0);
        class6.method47();
        class28.method203(19300);
        this.field335 = null;
        this.field284 = null;
        this.field344 = null;
        this.field290 = null;
        this.field357 = null;
        this.field354 = null;
        this.field328 = null;
        this.field346 = null;
        this.field339 = null;
        this.field351 = null;
        this.field306 = null;
        this.field358 = null;
        this.field287 = null;
        this.field318 = null;
        this.field281 = null;
        this.field349 = null;
        this.field362 = null;
        this.field327 = null;
        this.field360 = null;
        this.field280 = null;
        this.field329 = null;
        this.field341 = null;
        this.field337 = null;
        this.field323 = null;
        this.field316 = null;
        this.field298 = null;
        this.field292 = null;
        this.field321 = null;
        this.field277 = null;
    }

    @OriginalMember(owner = "mapview!mapview", name = "b", descriptor = "(II)I", line = 213)
    private final int method176(int arg0, int arg1) {
        if (arg0 != 16) {
            method196(-78, (byte) 94, -125, (byte) -4, -31);
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
            return class23.method163(arg0 ^ 0x4A, arg1);
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "e", descriptor = "(I)V", line = 284)
    public final void method177(int arg0) {
        if (arg0 < 100) {
            this.field331 = 60;
        }
        if (!class36.field480) {
            class36.field480 = this.method186((byte) 60);
            class24.method167(class31.field441, null, (byte) -2, class15.field161);
            return;
        }
        if (this.field361) {
            this.field361 = false;
            class18.field194 = true;
            class19.method128();
            int var2 = class29.field431 - (int) (503.0D / this.field334);
            int var3 = class12.field138 - (int) (635.0D / this.field334);
            int var4 = class12.field138 + (int) (635.0D / this.field334);
            int var5 = (int) (503.0D / this.field334) + class29.field431;
            this.method178(var5, var4, 503, 0, var3, var2, 0, 635, (byte) 92);
            if (this.field308) {
                this.field284.method86(this.field350, this.field315);
                class19.method133(this.field336 * var3 / class37.field489 + this.field350, this.field365 * var2 / class4.field50 + this.field315, (var4 - var3) * this.field336 / class37.field489, (var5 - var2) * this.field365 / class4.field50, 16711680, 128);
                class19.method132(this.field350 + this.field336 * var3 / class37.field489, this.field315 - -(this.field365 * var2 / class4.field50), (var4 - var3) * this.field336 / class37.field489, (var5 - var2) * this.field365 / class4.field50, 16711680);
                if (this.field303 > 0 && this.field303 % 10 < 5) {
                    for (int var6 = 0; var6 < class24.field262; var6++) {
                        if (class24.field257.field56[var6] == this.field332) {
                            int var7 = class24.field257.field62[var6] * this.field365 / class4.field50 + this.field315;
                            int var8 = class24.field257.field64[var6] * this.field336 / class37.field489 + this.field350;
                            class19.method138(var8, var7, 2, 16776960, 256);
                        }
                    }
                }
            }
            if (this.field356) {
                this.method190(this.field327, 7829367, 18, this.field363, this.field297, (byte) 58, 5592405, this.field331, 10066329);
                this.method190(class21.field235, 7829367, this.field282 - 36, this.field363 + 18, this.field297, (byte) 39, 5592405, this.field331, 10066329);
                this.method190(this.field328, 7829367, 18, this.field363 + this.field282 - 18, this.field297, (byte) 117, 5592405, this.field331, 10066329);
                int var9 = this.field310;
                int var10 = this.field363 + 3 + 18;
                for (int var11 = 0; var11 < 24; var11++) {
                    if (class23.field250.length > var9 && this.field292.length > var9) {
                        if (this.field292[var9].method66((byte) 105, class14.field156)) {
                            var11--;
                            var9++;
                            continue;
                        }
                        class23.field250[var9].method88(this.field297 + 3, var10);
                        this.field346.method94(this.field292[var9], this.field297 + 21, var10 - -14, 0);
                        int var12 = 16777215;
                        if (this.field293 == var9) {
                            var12 = 12298922;
                        }
                        if (this.field303 > 0 && this.field303 % 10 < 5 && this.field332 == var9) {
                            var12 = 16776960;
                        }
                        this.field346.method94(this.field292[var9], this.field297 + 20, var10 + 13, var12);
                    }
                    var10 += 17;
                    var9++;
                }
            }
            if (class22.field240.length == 1) {
                this.method190(this.field318, this.field325, 18, this.field365 + this.field315, this.field350, (byte) 69, this.field352, this.field336, this.field364);
                this.method190(this.field321, this.field325, 18, this.field363 + this.field282, this.field297, (byte) 56, this.field352, this.field331, this.field364);
                if (this.field319 == 3.0D) {
                    this.method190(class21.field238, this.field300, this.field313, this.field359, this.field288, (byte) 93, this.field283, this.field333, this.field340);
                } else {
                    this.method190(class21.field238, this.field325, this.field313, this.field359, this.field288, (byte) 88, this.field352, this.field333, this.field364);
                }
                if (this.field319 == 4.0D) {
                    this.method190(class21.field234, this.field300, this.field313, this.field359, this.field301 + this.field288, (byte) 39, this.field283, this.field333, this.field340);
                } else {
                    this.method190(class21.field234, this.field325, this.field313, this.field359, this.field301 + this.field288, (byte) 27, this.field352, this.field333, this.field364);
                }
                if (this.field319 == 6.0D) {
                    this.method190(class28.field400, this.field300, this.field313, this.field359, this.field288 + this.field301 * 2, (byte) 110, this.field283, this.field333, this.field340);
                } else {
                    this.method190(class28.field400, this.field325, this.field313, this.field359, this.field288 + this.field301 * 2, (byte) 109, this.field352, this.field333, this.field364);
                }
                if (this.field319 == 8.0D) {
                    this.method190(class37.field499, this.field300, this.field313, this.field359, this.field288 + this.field301 * 3, (byte) 102, this.field283, this.field333, this.field340);
                } else {
                    this.method190(class37.field499, this.field325, this.field313, this.field359, this.field301 * 3 + this.field288, (byte) 111, this.field352, this.field333, this.field364);
                }
            } else {
                this.method190(this.field318, this.field325, 18, this.field315 + this.field365, this.field350, (byte) 51, this.field352, this.field336, this.field364);
                this.method190(this.field321, this.field325, 18, this.field363 + this.field282, this.field297, (byte) 36, this.field352, this.field331, this.field364);
                this.method180(-50, this.field325);
                int var13 = this.field359 + this.field342;
                if (this.field319 == 3.0D) {
                    this.method190(class21.field238, this.field300, this.field313, var13, this.field288, (byte) 25, this.field283, this.field333, this.field340);
                } else {
                    this.method190(class21.field238, this.field325, this.field313, var13, this.field288, (byte) 118, this.field352, this.field333, this.field364);
                }
                if (this.field319 == 4.0D) {
                    this.method190(class21.field234, this.field300, this.field313, var13, this.field288 + this.field301, (byte) 61, this.field283, this.field333, this.field340);
                } else {
                    this.method190(class21.field234, this.field325, this.field313, var13, this.field301 + this.field288, (byte) 66, this.field352, this.field333, this.field364);
                }
                if (this.field319 == 6.0D) {
                    this.method190(class28.field400, this.field300, this.field313, var13, this.field288 + this.field301 * 2, (byte) 38, this.field283, this.field333, this.field340);
                } else {
                    this.method190(class28.field400, this.field325, this.field313, var13, this.field301 * 2 + this.field288, (byte) 60, this.field352, this.field333, this.field364);
                }
                if (this.field319 == 8.0D) {
                    this.method190(class37.field499, this.field300, this.field313, var13, this.field301 * 3 + this.field288, (byte) 127, this.field283, this.field333, this.field340);
                } else {
                    this.method190(class37.field499, this.field325, this.field313, var13, this.field301 * 3 + this.field288, (byte) 37, this.field352, this.field333, this.field364);
                }
            }
            if (class24.field255) {
                this.method190(this.field354, this.field325, this.field326, this.field314, this.field322, (byte) 100, this.field352, this.field305, this.field364);
                if (class2.field12) {
                    class19.method133(this.field322 + this.field305 + 2, this.field314, this.field309 + 10, this.field326, 8925952, 192);
                    class19.method132(this.field322 + this.field305 + 2, this.field314, this.field309 + 10, this.field326, 16777215);
                    if (class14.field150 > -1 && this.field349.method75(0) > 0) {
                        class7 var14 = this.field360[class14.field150].method71(32, (byte) -127, 47);
                        int var15 = this.field349.method75(0);
                        if (var14.method75(0) < var15) {
                            var15 = var14.method75(0);
                        }
                        this.field346.method95(var14, this.field322 + this.field305 + 6, 20, 10066176, true);
                        this.field346.method95(var14.method57(0, var15, 109), this.field322 + this.field305 + 6, 20, 16777215, true);
                    } else {
                        this.field346.method95(this.field351, this.field322 + this.field305 + 6, 20, 16776960, true);
                    }
                }
            }
        }
        if (class18.field194) {
            this.method194(-1);
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(IIIIIIIIB)V", line = 496)
    private final void method178(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte arg8) {
        class24.field257.method44(arg7, arg4, arg0, (byte) -81, arg1, arg3, arg2, arg6, arg5);
        if (arg1 - arg4 > -arg6 + arg7) {
            return;
        }
        int var10 = 97 % ((10 - arg8) / 58);
        class24.field257.method30(arg6, 5, arg7, arg2, arg5, arg4, arg0, arg3, this.field334, arg1);
        class24.field257.method35(arg2, arg6, arg1, arg0, arg3, arg5, arg7, arg4, 126);
        class24.field257.method33(arg4, arg3, (byte) -56, arg2, arg1, arg5, arg7, this.field303, arg6, this.field332, arg0);
        if (this.field334 == this.field319 && class24.field261) {
            for (int var11 = 0; var11 < this.field302; var11++) {
                int var12 = this.field280[var11];
                int var13 = var12 - class25.field273;
                int var14 = this.field316[var11];
                int var15 = class4.field50 + class37.field497 - var14;
                int var16 = arg6 + (var13 - arg4) * (-arg6 + arg7) / (arg1 - arg4);
                int var17 = (arg2 - arg3) * (-arg5 + var15) / (arg0 - arg5) + arg3;
                int var18 = this.field323[var11];
                int var19 = 16777215;
                class1 var20 = null;
                if (var18 == 0) {
                    if (this.field334 == 3.0D) {
                        var20 = this.field357;
                    }
                    if (this.field334 == 4.0D) {
                        var20 = this.field358;
                    }
                    if (this.field334 == 6.0D) {
                        var20 = this.field339;
                    }
                    if (this.field334 == 8.0D) {
                        var20 = this.field362;
                    }
                }
                if (var18 == 1) {
                    if (this.field334 == 3.0D) {
                        var20 = this.field339;
                    }
                    if (this.field334 == 4.0D) {
                        var20 = this.field362;
                    }
                    if (this.field334 == 6.0D) {
                        var20 = this.field335;
                    }
                    if (this.field334 == 8.0D) {
                        var20 = this.field277;
                    }
                }
                if (var18 == 2) {
                    if (this.field334 == 3.0D) {
                        var20 = this.field335;
                    }
                    if (this.field334 == 4.0D) {
                        var20 = this.field277;
                    }
                    var19 = 16755200;
                    if (this.field334 == 6.0D) {
                        var20 = this.field298;
                    }
                    if (this.field334 == 8.0D) {
                        var20 = this.field306;
                    }
                }
                if (var20 != null) {
                    class7 var21 = this.field360[var11];
                    int var22 = 1;
                    for (int var23 = 0; var23 < var21.method75(0); var23++) {
                        if (var21.method72(var23, 24090) == 47) {
                            var22++;
                        }
                    }
                    int var24 = var17 - var20.method5() * (var22 - 1) / 2;
                    int var25 = var24 + var20.method7() / 2;
                    while (true) {
                        int var26 = var21.method76(47, -66);
                        if (var26 == -1) {
                            var20.method2(var21, var16, var25, var19, true);
                            break;
                        }
                        class7 var27 = var21.method57(0, var26, 116);
                        var20.method2(var27, var16, var25, var19, true);
                        var25 += var20.method5();
                        var21 = var21.method55(var26 + 1, (byte) -14);
                    }
                }
            }
        }
        if (!class7.field68) {
            return;
        }
        for (int var28 = class25.field273 / 64; var28 < (class37.field489 + class25.field273) / 64; var28++) {
            for (int var29 = class37.field497 / 64; var29 < (class4.field50 + class37.field497) / 64; var29++) {
                int var30 = var28 * 64;
                int var31 = var30 - class25.field273;
                int var32 = var29 * 64;
                int var33 = class4.field50 + class37.field497 - var32;
                int var34 = arg6 + (arg7 - arg6) * (-arg4 + 64 + var31) / (arg1 - arg4);
                int var35 = (var33 - arg5 - 64) * (-arg3 + arg2) / (arg0 - arg5) + arg3;
                int var36 = (arg7 - arg6) * (-arg4 + var31) / (arg1 - arg4) + arg6;
                int var37 = arg3 + (arg2 - arg3) * (var33 - arg5) / (arg0 - arg5);
                class19.method132(var36, var35, var34 - var36, -var35 + var37, 16777215);
                this.field346.method98(class14.method113(new class7[] { class22.method157(var28, (byte) -112), class22.field242, class22.method157(var29, (byte) -112) }, 27362), var34 - 5, var37 + -5, 16777215);
                if (var28 == 33 && var29 >= 71 && var29 <= 73) {
                    this.field346.method91(class18.field196, (var34 + var36) / 2, (var35 + var37) / 2, 16711680);
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "c", descriptor = "(B)Lea;", line = 695)
    public static final class10 method179(byte arg0) {
        class10 var1 = new class10(class16.field177, class11.field126, class36.field479, class37.field487, field289);
        class21.method151((byte) 91);
        int var2 = 60 % ((42 - arg0) / 53);
        return var1;
    }

    @OriginalMember(owner = "mapview!mapview", name = "c", descriptor = "(II)V", line = 707)
    private final void method180(int arg0, int arg1) {
        this.method190(class14.method113(new class7[] { class35.field471, class14.field145[class37.field498], class7.field79 }, 27362), arg1, 18, 483, 170, (byte) 17, this.field352, 230, this.field364);
        int var3 = -39 % ((23 - arg0) / 51);
    }

    @OriginalMember(owner = "mapview!mapview", name = "h", descriptor = "(I)V", line = 720)
    public static void method181(int arg0) {
        field304 = null;
        field289 = null;
        field286 = null;
        field296 = null;
        field291 = null;
        if (arg0 > -1) {
            field286 = null;
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "b", descriptor = "(Ljava/lang/String;I)[B", line = 735)
    private final byte[] method182(String arg0, int arg1) throws IOException {
        File var3 = new File(arg0);
        if (!var3.exists()) {
            return null;
        }
        int var4 = (int) var3.length();
        if (arg1 >= -77) {
            this.field287 = null;
        }
        byte[] var5 = new byte[var4];
        DataInputStream var6 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg0)));
        var6.readFully(var5, 0, var4);
        var6.close();
        return var5;
    }

    @OriginalMember(owner = "mapview!mapview", name = "b", descriptor = "(ILjava/lang/String;Ld;)Z", line = 776)
    private final boolean method183(int arg0, String arg1, class7 arg2) {
        try {
            if (class18.field193 == null) {
                class31.field441 = class14.method113(new class7[] { this.field329, class15.field167, arg2 }, 27362);
                String var4;
                if (arg1 == "main_file_cache.dat0") {
                    var4 = "worldmap.main.js5?crc=-897393104";
                } else if (arg1 == "main_file_cache.dat1") {
                    var4 = "worldmap.dungeon.js5?crc=836925587";
                } else if (arg1 == "main_file_cache.dat2") {
                    var4 = "worldmap.extra.js5?crc=528110464";
                } else {
                    var4 = "mapview.sprites.js5?crc=-1203441070";
                }
                class18.field193 = new DataInputStream((new URL(this.getCodeBase(), var4)).openStream());
                int var5;
                if (arg1 == "main_file_cache.dat0") {
                    var5 = 406939;
                } else if (arg1 == "main_file_cache.dat1") {
                    var5 = 147494;
                } else if (arg1 == "main_file_cache.dat2") {
                    var5 = 115177;
                } else {
                    var5 = 8383;
                }
                class37.field493 = new byte[var5];
                class26.field371 = 0;
                class15.field163 = 0;
            }
            int var6 = class37.field493.length;
            int var7 = class15.field163;
            if (var7 >= var6) {
                if (arg0 != -10008) {
                    this.field303 = -50;
                }
                class18.field193.close();
                class18.field193 = null;
                if (!this.method187(arg1, 117, class37.field493)) {
                    this.method249(new String(this.field341.method65(0)), arg0 ^ 0xFFFFD895);
                    class37.field493 = null;
                }
                return true;
            }
            class26.field371++;
            if (class26.field371 >= 1500) {
                throw new IOException();
            }
            DataInputStream var8 = class18.field193;
            int var9 = var8.available();
            if (var9 < 0) {
                throw new EOFException();
            } else if (var9 == 0) {
                return false;
            } else {
                if (var6 - var7 < var9) {
                    var9 = var6 - var7;
                }
                int var10 = var8.read(class37.field493, var7, var9);
                if (var10 < 0) {
                    throw new EOFException();
                } else if (var10 == 0) {
                    return false;
                } else {
                    class26.field371 = 0;
                    int var11 = var7 + var10;
                    int var12 = var11 * 100 / var6;
                    class31.field441 = class14.method113(new class7[] { class4.field45, arg2, class20.field217, class22.method157(var12, (byte) -112), class4.field40 }, 27362);
                    class15.field163 = var11;
                    return false;
                }
            }
        } catch (IOException var16) {
            try {
                class18.field193.close();
            } catch (Exception var15) {
            }
            class18.field193 = null;
            class37.field493 = null;
            this.method249(new String(this.field341.method65(0)), arg0 ^ 0xFFFFD8A1);
            return true;
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(II[Ld;B)Ld;", line = 899)
    public static final class7 method184(int arg0, int arg1, class7[] arg2, byte arg3) {
        int var4 = 0;
        for (int var5 = 0; var5 < arg1; var5++) {
            if (arg2[arg0 + var5] == null) {
                arg2[arg0 + var5] = class28.field404;
            }
            var4 += arg2[arg0 + var5].field76;
        }
        int var6 = 0;
        byte[] var7 = new byte[var4];
        if (arg3 >= -39) {
            return (class7) null;
        }
        for (int var8 = 0; var8 < arg1; var8++) {
            class7 var9 = arg2[arg0 + var8];
            class13.method107(var9.field75, 0, var7, var6, var9.field76);
            var6 += var9.field76;
        }
        class7 var10 = new class7();
        var10.field75 = var7;
        var10.field76 = var4;
        return var10;
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(Z)V", line = 945)
    public final void method185(boolean arg0) {
        class37.method242((byte) 77);
        class20.method140(class21.field237, false);
        class28.method204(class21.field237, (byte) -72);
        boolean var2 = false;
        class31.field441 = this.field281;
        this.field292 = class11.method101(-102);
        this.field287 = class30.method214(false);
        if (arg0) {
            byte var4 = 0;
            if (this.field287.length == 12) {
                byte var10002 = var4;
                int var5 = var4 + 1;
                this.field318 = this.field287[var10002];
                int var17 = var5;
                int var6 = var5 + 1;
                this.field354 = this.field287[var17];
                int var18 = var6;
                int var7 = var6 + 1;
                this.field321 = this.field287[var18];
                int var19 = var7;
                int var8 = var7 + 1;
                this.field327 = this.field287[var19];
                int var20 = var8;
                int var9 = var8 + 1;
                this.field328 = this.field287[var20];
                int var21 = var9;
                int var10 = var9 + 1;
                this.field281 = this.field287[var21];
                int var22 = var10;
                int var11 = var10 + 1;
                this.field337 = this.field287[var22];
                int var23 = var11;
                int var12 = var11 + 1;
                this.field351 = this.field287[var23];
                int var24 = var12;
                int var13 = var12 + 1;
                this.field329 = this.field287[var24];
                int var25 = var13;
                int var14 = var13 + 1;
                this.field344 = this.field287[var25];
                int var26 = var14;
                int var15 = var14 + 1;
                this.field290 = this.field287[var26];
                int var27 = var15;
                int var16 = var15 + 1;
                this.field341 = this.field287[var27];
                this.field279 = this.field318.method72(0, 24090);
                this.field311 = this.field354.method72(0, 24090);
                this.field317 = this.field321.method72(0, 24090);
                this.field348 = this.method176(16, this.field279);
                this.field330 = this.method176(16, this.field311);
                this.field307 = this.method176(16, this.field317);
            } else {
                class15.method118(new class7[] { class14.field153 }, 0);
            }
        }
        this.field349 = class22.method158(50, 0);
    }

    @OriginalMember(owner = "mapview!mapview", name = "d", descriptor = "(B)Z", line = 1032)
    private final boolean method186(byte arg0) {
        if (class20.field224 == 0) {
            this.method191(-122);
            class20.field224 = 1;
        }
        if (arg0 != 60) {
            this.field307 = -89;
        }
        if (class20.field224 == 1) {
            class15.field161 = 25;
            boolean var2 = this.method174(-1, "main_file_cache.idx0", this.field344);
            if (!var2) {
                return false;
            }
            field286 = class17.field184;
            class17.field184 = null;
            if (field286 == null) {
                throw new RuntimeException("T1");
            }
            class20.field224 = 2;
        }
        if (class20.field224 == 2) {
            class22.field240 = new class23[1];
            class20.field224 = 10;
        }
        if (class20.field224 == 10) {
            class15.field161 = 50;
            boolean var3 = this.method174(-1, "main_file_cache.dat0", this.field290);
            if (!var3) {
                return false;
            }
            class22.field240[0] = class17.field184;
            class17.field184 = null;
            if (class22.field240[0] == null) {
                throw new RuntimeException("T2");
            }
            class20.field224 = 20;
        }
        if (class20.field224 != 20) {
            return false;
        }
        class20.field216 = class7.method79(class14.field154, class21.field235, field286, (byte) 103);
        class23.field250 = class4.method23(class21.field235, (byte) -92, field286, class16.field183);
        this.field346 = class17.method123(-1, field286, class15.field169, class21.field235);
        this.field357 = new class1(11, true, this);
        this.field358 = new class1(12, true, this);
        this.field339 = new class1(14, true, this);
        this.field362 = new class1(17, true, this);
        this.field335 = new class1(19, true, this);
        this.field277 = new class1(22, true, this);
        this.field298 = new class1(26, true, this);
        this.field306 = new class1(30, true, this);
        class31.field441 = this.field337;
        class15.field161 = 100;
        class24.method167(class31.field441, null, (byte) -2, class15.field161);
        this.field305 = this.field346.method92(this.field354) + 20;
        this.method195((byte) -124);
        class7[] var4 = this.field292;
        for (int var5 = 0; var5 < var4.length; var5++) {
            class7 var6 = var4[var5];
            int var7 = this.field346.method92(var6);
            if (this.field347 < var7) {
                this.field347 = var7;
            }
        }
        this.field331 = this.field347 + 34;
        if (this.field331 > 140) {
            int var8 = this.field350 - this.field331 - this.field297;
            this.field324 = var8 / 25;
            int var9 = var8 - this.field324 * 25;
            this.field333 = this.field324 * 5;
            this.field301 = this.field333 + this.field324;
            this.field288 = this.field331 + this.field297 + var9 / 2 + this.field324;
        }
        return true;
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(Ljava/lang/String;I[B)Z", line = 1151)
    private final boolean method187(String arg0, int arg1, byte[] arg2) {
        if (arg2 == null) {
            return false;
        }
        try {
            MessageDigest var4 = MessageDigest.getInstance("SHA");
            var4.reset();
            var4.update(arg2);
            byte[] var5 = var4.digest();
            if (arg0 == "main_file_cache.dat0") {
                if (var5[0] != 122 || var5[1] != -55 || var5[2] != -69 || var5[3] != -76 || var5[4] != 101 || var5[5] != 42 || var5[6] != 39 || var5[7] != -70 || var5[8] != -80 || var5[9] != -39 || var5[10] != 62 || var5[11] != 17 || var5[12] != 27 || var5[13] != 83 || var5[14] != 59 || var5[15] != 101 || var5[16] != -55 || var5[17] != 13 || var5[18] != 106 || var5[19] != 65) {
                    return false;
                }
            } else if (var5[0] != 65 || var5[1] != 89 || var5[2] != -58 || var5[3] != -50 || var5[4] != 116 || var5[5] != 117 || var5[6] != 59 || var5[7] != -103 || var5[8] != 18 || var5[9] != -89 || var5[10] != 45 || var5[11] != 126 || var5[12] != 80 || var5[13] != 10 || var5[14] != -103 || var5[15] != 75 || var5[16] != -21 || var5[17] != 109 || var5[18] != -27 || var5[19] != 126) {
                return false;
            }
            if (arg1 <= 115) {
                this.method178(-98, -77, -20, 14, 26, -31, 59, 27, (byte) 86);
            }
            return true;
        } catch (Exception var7) {
            this.method249("sha", 120);
            return false;
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "d", descriptor = "(II)V", line = 1203)
    private final void method188(int arg0, int arg1) {
        if (arg1 < class22.field240.length) {
            class23 var3 = class22.field240[arg1];
            class35 var4 = new class35(var3.method146(class16.field178, class7.field82, (byte) -128));
            var4.method227(true);
            class35 var5 = new class35(var3.method146(class16.field178, class25.field275, (byte) -128));
            this.field302 = var5.method231(-887);
            for (int var6 = 0; var6 < this.field302; var6++) {
                this.field360[var6] = var5.method227(true);
                this.field280[var6] = var5.method231(-887);
                this.field316[var6] = var5.method231(-887);
                this.field323[var6] = var5.method232(false);
                class7 var7 = this.field360[var6].method71(32, (byte) -96, 47);
                int var8 = this.field346.method92(var7);
                if (var8 > this.field309) {
                    this.field309 = var8;
                }
                int var9 = this.field346.method92(this.field351);
                if (var9 > this.field309) {
                    this.field309 = var9;
                }
            }
            class24.field257 = new class5();
            class24.field257.method38(class22.field240[arg1], 64);
            this.field365 = 180;
            class12.field138 = class30.field436;
            this.field336 = class37.field489 * this.field365 / class4.field50;
            this.field315 = 503 - this.field365 - 20;
            class29.field431 = class20.field225;
            this.field350 = 635 - this.field336 - 5;
            this.field284 = new class9(this.field336, this.field365);
            this.field284.method90();
            this.method178(class4.field50, class37.field489, this.field365, 0, 0, 0, 0, this.field336, (byte) -56);
            class19.method132(0, 0, this.field336, this.field365, 0);
            class19.method132(1, 1, this.field336 - 2, this.field365 + -2, this.field364);
            class4.field42.method112(true);
        }
        if (arg0 < 32) {
            this.method189((byte) 54);
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(B)V", line = 1272)
    public final void method189(byte arg0) {
        class20.method142(false);
        class31.method218(-116);
        try {
            this.field360 = null;
            this.field292 = null;
            this.field280 = null;
            this.field323 = null;
            this.field316 = null;
            this.field284 = null;
            this.field346 = null;
            if (arg0 <= 95) {
                return;
            }
            class24.field257 = null;
            System.gc();
        } catch (Throwable var3) {
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(Ld;IIIIBIII)V", line = 1323)
    private final void method190(class7 arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, int arg8) {
        class19.method132(arg4, arg3, arg7, arg2, 0);
        int var12 = arg4 + 1;
        int var11 = arg3 + 1;
        if (arg5 <= 15) {
            this.field277 = null;
        }
        int var10 = arg2 - 2;
        int var13 = arg7 - 2;
        class19.method131(var12, var11, var13, var10, arg1);
        class19.method139(var12, var11, var13, arg8);
        class19.method129(var12, var11, var10, arg8);
        class19.method139(var12, var11 + var10 - 1, var13, arg6);
        class19.method129(var13 + var12 - 1, var11, var10, arg6);
        this.field346.method91(arg0, var12 + var13 / 2 + 1, var10 / 2 + var11 + 4 + 1, 0);
        this.field346.method91(arg0, var12 + var13 / 2, var10 / 2 + 4 + var11, 16777215);
    }

    @OriginalMember(owner = "mapview!mapview", name = "i", descriptor = "(I)V", line = 1354)
    private final void method191(int arg0) {
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
        if (arg0 >= -111) {
            return;
        }
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
                        class15.field160 = var8 + var6 + "/rsmap/";
                        return;
                    }
                }
            } catch (Exception var14) {
            }
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "b", descriptor = "(B)V", line = 1437)
    public final void method192(byte arg0) {
        if (class38.field506) {
            class29.method210(class21.field237, true);
            class31.method217(class21.field237, (byte) -6);
            this.method252(false);
            class20.method140(class21.field237, false);
            class28.method204(class21.field237, (byte) -72);
        }
        class16.method121(16126);
        class21.method155(2);
        if (!class36.field480) {
            return;
        }
        if (class29.field432[96]) {
            this.field361 = true;
            class12.field138 = (int) ((double) class12.field138 - 16.0D / this.field334);
            class14.field144 = -1;
        }
        if (class29.field432[97]) {
            class12.field138 = (int) (16.0D / this.field334 + (double) class12.field138);
            class14.field144 = -1;
            this.field361 = true;
        }
        if (class29.field432[98]) {
            class29.field431 = (int) ((double) class29.field431 - 16.0D / this.field334);
            class14.field144 = -1;
            this.field361 = true;
        }
        if (class29.field432[99]) {
            class14.field144 = -1;
            class29.field431 = (int) (16.0D / this.field334 + (double) class29.field431);
            this.field361 = true;
        }
        if (arg0 >= -51) {
            return;
        }
        while (true) {
            while (true) {
                while (class15.method117((byte) 62)) {
                    if (!class24.field255 || !class2.field12) {
                        if (class12.field141 == this.field330 || class12.field141 == this.field311) {
                            class2.field12 = true;
                            this.field361 = true;
                        }
                        if (class12.field141 == 49) {
                            this.field319 = 3.0D;
                            this.field361 = true;
                        }
                        if (class12.field141 == 50) {
                            this.field361 = true;
                            this.field319 = 4.0D;
                        }
                        if (class12.field141 == 51) {
                            this.field361 = true;
                            this.field319 = 6.0D;
                        }
                        if (class12.field141 == 52) {
                            this.field361 = true;
                            this.field319 = 8.0D;
                        }
                        if (class12.field141 == this.field307 || class12.field141 == this.field317) {
                            this.field356 = !this.field356;
                            this.field361 = true;
                        }
                        if (class12.field141 == this.field348 || class12.field141 == this.field279) {
                            this.field308 = !this.field308;
                            this.field361 = true;
                        }
                    } else if (class17.field191 == 0) {
                        class2.field12 = false;
                        this.field361 = true;
                        this.field349.method77(0, 0);
                        class14.field150 = -1;
                    } else if (class17.field191 == 84) {
                        this.field320 = class12.field138 << 16;
                        class2.field12 = false;
                        this.field343 = class29.field431 << 16;
                        class14.field144 = class14.field150;
                        this.field349.method77(0, 0);
                        class14.field150 = -1;
                        this.field361 = true;
                    } else {
                        boolean var2 = false;
                        if (class17.field191 == 85) {
                            if (this.field349.method75(0) > 0) {
                                this.field349.method77(0, this.field349.method75(0) - 1);
                                this.field361 = true;
                                if (this.field349.method75(0) == 0) {
                                    class14.field150 = -1;
                                } else {
                                    var2 = true;
                                }
                            }
                        } else if (class12.field141 != -1 && this.field349.method75(0) <= field278) {
                            this.field349.method58((byte) 57, class12.field141);
                            this.field361 = true;
                        }
                        if (this.field349.method75(0) > 0) {
                            for (int var3 = 0; var3 < this.field302; var3++) {
                                if (this.field360[var3].method75(0) >= this.field349.method75(0)) {
                                    class7 var4 = this.field349.method61(32);
                                    class7 var5 = this.field360[var3].method71(32, (byte) -96, 47).method57(0, this.field349.method75(0), 120).method61(81);
                                    if (var4.method54(var5, 21184) == 0) {
                                        this.field361 = true;
                                        var2 = true;
                                        class14.field150 = var3;
                                        break;
                                    }
                                }
                            }
                            if (!var2) {
                                this.field349.method77(0, this.field349.method75(0) - 1);
                            }
                        }
                    }
                }
                int var6 = class29.field424;
                int var7 = class7.field77;
                int var8 = class11.field130;
                int var9 = class2.field13;
                int var10 = class31.field440;
                int var11 = class20.field221;
                if (var7 == 1) {
                    this.field294 = class12.field138;
                    this.field355 = var8;
                    this.field299 = var6;
                    this.field353 = class29.field431;
                    if (class22.field240.length == 1) {
                        if (this.field288 < var6 && var6 < this.field333 + this.field288 && var8 > this.field359 && this.field359 + this.field313 > var8) {
                            this.field319 = 3.0D;
                            this.field299 = -1;
                        }
                        if (this.field301 + this.field288 < var6 && var6 < this.field301 + this.field288 + this.field333 && this.field359 < var8 && this.field359 + this.field313 > var8) {
                            this.field319 = 4.0D;
                            this.field299 = -1;
                        }
                        if (this.field301 * 2 + this.field288 < var6 && var6 < this.field301 * 2 + this.field333 + this.field288 && this.field359 < var8 && var8 < this.field359 + this.field313) {
                            this.field319 = 6.0D;
                            this.field299 = -1;
                        }
                        if (this.field301 * 3 + this.field288 < var6 && this.field288 + this.field301 * 3 + this.field333 > var6 && this.field359 < var8 && var8 < this.field359 + this.field313) {
                            this.field299 = -1;
                            this.field319 = 8.0D;
                        }
                    } else {
                        if (this.field288 < var6 && this.field288 + this.field333 > var6 && var8 > this.field359 && var8 < this.field359 + this.field313 + this.field342) {
                            this.field299 = -1;
                            this.field319 = 3.0D;
                        }
                        if (this.field301 + this.field288 < var6 && var6 < this.field301 + this.field288 + this.field333 && var8 > this.field359 && this.field359 + this.field313 + this.field342 > var8) {
                            this.field299 = -1;
                            this.field319 = 4.0D;
                        }
                        if (var6 > this.field301 * 2 + this.field288 && var6 < this.field301 * 2 + this.field333 + this.field288 && this.field359 < var8 && var8 < this.field359 + this.field313 + this.field342) {
                            this.field319 = 6.0D;
                            this.field299 = -1;
                        }
                        if (var6 > this.field301 * 3 + this.field288 && this.field301 * 3 + this.field288 + this.field333 > var6 && this.field359 < var8 && this.field342 + this.field313 + this.field359 > var8) {
                            this.field299 = -1;
                            this.field319 = 8.0D;
                        }
                        if (var6 > 170 && var6 < 400 && var8 > 483 && var8 < 503) {
                            this.method180(-115, this.field300);
                            this.method194(-1);
                            this.method195((byte) -118);
                            this.field299 = -1;
                        }
                    }
                    this.field361 = true;
                    if (var6 > this.field297 && this.field363 + this.field282 < var8 && var6 < this.field331 + this.field297 && var8 < 503) {
                        this.field356 = !this.field356;
                        this.field299 = -1;
                    }
                    this.field366 = false;
                    if (this.field350 < var6 && var8 > this.field365 + this.field315 && this.field350 + this.field336 > var6 && var8 < 503) {
                        this.field299 = -1;
                        this.field308 = !this.field308;
                    }
                    if (this.field356) {
                        if (var6 > this.field297 && var8 > this.field363 && var6 < this.field331 + this.field297 && var8 < this.field363 + this.field282) {
                            this.field299 = -1;
                        }
                        if (this.field297 < var6 && var8 > this.field363 && var6 < this.field331 + this.field297 && this.field363 + 18 > var8 && this.field295 > 0) {
                            this.field295 -= 24;
                        }
                        if (this.field297 < var6 && var8 > this.field282 + this.field363 - 18 && this.field297 + this.field331 > var6 && this.field363 + this.field282 > var8 && this.field295 < 48) {
                            this.field295 += 24;
                        }
                    }
                    if (this.field308 && this.field350 < var6 && var8 > this.field315 && this.field350 + this.field336 > var6 && this.field365 + this.field315 > var8) {
                        class12.field138 = (var6 - this.field350) * class37.field489 / this.field336;
                        this.field366 = true;
                        this.field299 = -1;
                        class29.field431 = (var8 - this.field315) * class4.field50 / this.field365;
                    }
                    if (class24.field255 && !class2.field12 && !this.field366 && var6 > this.field322 && this.field314 < var8 && var6 < this.field322 + this.field305 && var8 < this.field326 + this.field314) {
                        class2.field12 = true;
                    }
                }
                if (this.field356) {
                    this.field293 = -1;
                    if (var11 > this.field297 && this.field331 + this.field297 > var11) {
                        int var12 = this.field363 + 5 + 21;
                        int var13 = this.field310;
                        for (int var14 = 0; var14 < 24; var14++) {
                            if (var13 < this.field292.length && this.field292[var13].method66((byte) 105, class14.field156)) {
                                var14--;
                                var13++;
                            } else {
                                if (var10 >= var12 && var12 + 17 > var10) {
                                    if (var7 == 1) {
                                        this.field303 = 50;
                                        this.field332 = var13;
                                    }
                                    this.field293 = var13;
                                }
                                var12 += 17;
                                var13++;
                            }
                        }
                    }
                    if (this.field312 != this.field293) {
                        this.field361 = true;
                        this.field312 = this.field293;
                    }
                }
                if (var9 == 1 && this.field308 && this.field366) {
                    class14.field144 = -1;
                    int var15 = var10;
                    if (this.field315 > var10) {
                        var15 = this.field315;
                    } else if (var10 > this.field365 + this.field315) {
                        var15 = this.field365 + this.field315;
                    }
                    class29.field431 = (var15 - this.field315) * class4.field50 / this.field365;
                    int var16 = var11;
                    this.field361 = true;
                    if (this.field350 > var11) {
                        var16 = this.field350;
                    } else if (this.field350 + this.field336 < var11) {
                        var16 = this.field350 + this.field336;
                    }
                    class12.field138 = (var16 - this.field350) * class37.field489 / this.field336;
                } else {
                    this.field366 = false;
                }
                if (var9 == 1 && this.field299 != -1) {
                    this.field361 = true;
                    class29.field431 = (int) ((double) (this.field355 - var10) * 2.0D / this.field319) + this.field353;
                    class12.field138 = (int) ((double) (this.field299 - var11) * 2.0D / this.field319) + this.field294;
                    class14.field144 = -1;
                }
                if (this.field319 > this.field334) {
                    this.field361 = true;
                    this.field334 += this.field334 / 30.0D;
                    if (this.field334 > this.field319) {
                        this.field334 = this.field319;
                    }
                }
                if (this.field319 < this.field334) {
                    this.field334 -= this.field334 / 30.0D;
                    this.field361 = true;
                    if (this.field319 > this.field334) {
                        this.field334 = this.field319;
                    }
                }
                if (this.field295 > this.field310) {
                    this.field310++;
                    this.field361 = true;
                }
                if (this.field295 < this.field310) {
                    this.field310--;
                    this.field361 = true;
                }
                if (this.field303 > 0) {
                    this.field361 = true;
                    this.field303--;
                }
                if (class14.field144 >= 0) {
                    class29.field430 = this.field280[class14.field144] - class25.field273;
                    class25.field264 = class37.field497 + class4.field50 - this.field316[class14.field144];
                    byte var17 = 4;
                    this.field361 = true;
                    int var18 = class29.field430 - (int) (635.0D / this.field334);
                    int var19 = class25.field264 - (int) (503.0D / this.field334);
                    int var20 = class29.field430 + (int) (635.0D / this.field334);
                    int var21 = (int) (503.0D / this.field334) + class25.field264;
                    if (var18 < 48) {
                        class29.field430 = (int) (635.0D / this.field334) + 48;
                    }
                    if (var20 > class37.field489 - 48) {
                        class29.field430 = class37.field489 - (int) (635.0D / this.field334) - 48;
                    }
                    if (var19 < 48) {
                        class25.field264 = (int) (503.0D / this.field334) + 48;
                    }
                    if (class4.field50 - 48 < var21) {
                        class25.field264 = class4.field50 - (int) (503.0D / this.field334) - 48;
                    }
                    class29.field430 <<= 0x10;
                    int var22 = class29.field430 - this.field320;
                    class25.field264 <<= 0x10;
                    int var23 = class25.field264 - this.field343;
                    if (var22 >> var17 == 0 && var23 >> var17 == 0) {
                        class14.field144 = -1;
                    } else {
                        this.field343 += var23 >> var17;
                        class29.field431 = this.field343 >> 16;
                        this.field320 += var22 >> var17;
                        class12.field138 = this.field320 >> 16;
                    }
                }
                int var24 = class12.field138 - (int) (635.0D / this.field334);
                int var25 = (int) (635.0D / this.field334) + class12.field138;
                int var26 = (int) (503.0D / this.field334) + class29.field431;
                if (var24 < 48) {
                    class12.field138 = (int) (635.0D / this.field334) + 48;
                }
                if (class37.field489 - 48 < var25) {
                    class12.field138 = class37.field489 - (int) (635.0D / this.field334) - 48;
                }
                int var27 = class29.field431 - (int) (503.0D / this.field334);
                if (var27 < 48) {
                    class29.field431 = (int) (503.0D / this.field334) + 48;
                }
                if (var26 > class4.field50 - 48) {
                    class29.field431 = class4.field50 - (int) (503.0D / this.field334) - 48;
                }
                return;
            }
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "init", descriptor = "()V", line = 2026)
    public final void init() {
        if (this.method245(-11267)) {
            this.method246(635, (byte) 10, 32, 503, class12.field142.method68(this, true).method56(true));
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(ZI)I", line = 2049)
    private final int method193(boolean arg0, int arg1) {
        if (!arg0) {
            return 92;
        }
        arg1++;
        if (class22.field240.length <= arg1) {
            arg1 = 0;
        }
        return arg1;
    }

    @OriginalMember(owner = "mapview!mapview", name = "j", descriptor = "(I)V", line = 2064)
    private final void method194(int arg0) {
        class18.field194 = false;
        try {
            Graphics var2 = class21.field237.getGraphics();
            class4.field42.method111(0, 0, 0, var2);
        } catch (Exception var4) {
            class21.field237.repaint();
        }
        if (arg0 != -1) {
            this.method180(63, 108);
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "e", descriptor = "(B)V", line = 2116)
    private final void method195(byte arg0) {
        if (class22.field240.length == 1) {
            class35.field464 = 0;
        } else {
            if (class37.field498 >= 0) {
                class35.field464 = class37.field498;
            } else {
                class35.field464 = this.method193(true, class35.field464);
            }
            class37.field498 = this.method193(true, class35.field464);
        }
        this.method188(111, class35.field464);
        if (arg0 >= -26) {
            field286 = null;
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(IBIBI)V", line = 2151)
    public static final void method196(int arg0, byte arg1, int arg2, byte arg3, int arg4) {
        int var5 = arg4 >> 6;
        if (arg1 != 46) {
            field286 = null;
        }
        int var6 = arg2 >> 6;
        if (class16.field171[arg0][var6][var5] == null) {
            class16.field171[arg0][var6][var5] = new byte[4096];
        }
        class16.field171[arg0][var6][var5][class38.method243(arg4, 63) + (class38.method243(arg2, 63) << 6)] = arg3;
    }
}
