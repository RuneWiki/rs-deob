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
public class mapview extends class33 {

    @OriginalMember(owner = "mapview!mapview", name = "o", descriptor = "I")
    private int field5 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "z", descriptor = "Z")
    private boolean field16 = false;

    @OriginalMember(owner = "mapview!mapview", name = "n", descriptor = "I")
    private int field4 = 11141120;

    @OriginalMember(owner = "mapview!mapview", name = "E", descriptor = "[I")
    private int[] field21 = new int[1500];

    @OriginalMember(owner = "mapview!mapview", name = "m", descriptor = "I")
    private int field3 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "q", descriptor = "[I")
    private int[] field7 = new int[1500];

    @OriginalMember(owner = "mapview!mapview", name = "l", descriptor = "I")
    private int field2 = 7824964;

    @OriginalMember(owner = "mapview!mapview", name = "N", descriptor = "I")
    private int field30 = -1;

    @OriginalMember(owner = "mapview!mapview", name = "V", descriptor = "I")
    private int field38 = 13;

    @OriginalMember(owner = "mapview!mapview", name = "O", descriptor = "[I")
    private int[] field31 = new int[1500];

    @OriginalMember(owner = "mapview!mapview", name = "db", descriptor = "Z")
    private boolean field46 = true;

    @OriginalMember(owner = "mapview!mapview", name = "p", descriptor = "I")
    private int field6 = 6706483;

    @OriginalMember(owner = "mapview!mapview", name = "C", descriptor = "I")
    private int field19 = 470;

    @OriginalMember(owner = "mapview!mapview", name = "U", descriptor = "I")
    private int field37 = -1;

    @OriginalMember(owner = "mapview!mapview", name = "k", descriptor = "I")
    private int field1 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "y", descriptor = "I")
    private int field15 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "R", descriptor = "Z")
    private boolean field34 = false;

    @OriginalMember(owner = "mapview!mapview", name = "A", descriptor = "I")
    private int field17 = 5;

    @OriginalMember(owner = "mapview!mapview", name = "ab", descriptor = "I")
    private int field43 = 140;

    @OriginalMember(owner = "mapview!mapview", name = "kb", descriptor = "I")
    private int field53 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "lb", descriptor = "I")
    private int field54 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "jb", descriptor = "I")
    private int field52 = 8912896;

    @OriginalMember(owner = "mapview!mapview", name = "tb", descriptor = "I")
    private int field62 = 500;

    @OriginalMember(owner = "mapview!mapview", name = "Q", descriptor = "I")
    private int field33 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "W", descriptor = "[I")
    private int[] field39 = new int[1500];

    @OriginalMember(owner = "mapview!mapview", name = "hb", descriptor = "Z")
    private boolean field50 = false;

    @OriginalMember(owner = "mapview!mapview", name = "vb", descriptor = "[I")
    private int[] field64 = new int[1500];

    @OriginalMember(owner = "mapview!mapview", name = "u", descriptor = "[I")
    private int[] field11 = new int[this.field62];

    @OriginalMember(owner = "mapview!mapview", name = "nb", descriptor = "D")
    private double field56 = 4.0D;

    @OriginalMember(owner = "mapview!mapview", name = "r", descriptor = "[Lk;")
    private class21[] field8 = new class21[this.field62];

    @OriginalMember(owner = "mapview!mapview", name = "ub", descriptor = "I")
    private int field63 = -1;

    @OriginalMember(owner = "mapview!mapview", name = "T", descriptor = "[I")
    private int[] field36 = new int[this.field62];

    @OriginalMember(owner = "mapview!mapview", name = "sb", descriptor = "D")
    private double field61 = 4.0D;

    @OriginalMember(owner = "mapview!mapview", name = "D", descriptor = "[I")
    private int[] field20 = new int[this.field62];

    @OriginalMember(owner = "mapview!mapview", name = "xb", descriptor = "I")
    private int field66 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "wb", descriptor = "I")
    private int field65 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "yb", descriptor = "I")
    private int field67 = 8943445;

    @OriginalMember(owner = "mapview!mapview", name = "qb", descriptor = "I")
    private int field59 = 10027008;

    @OriginalMember(owner = "mapview!mapview", name = "mb", descriptor = "[I")
    private int[] field55 = new int[1500];

    @OriginalMember(owner = "mapview!mapview", name = "w", descriptor = "Lk;")
    public static class21 field13 = class14.method92((byte) 57, "Food Shop");

    @OriginalMember(owner = "mapview!mapview", name = "X", descriptor = "I")
    public static volatile int field40 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "x", descriptor = "I")
    public static int field14;

    @OriginalMember(owner = "mapview!mapview", name = "K", descriptor = "I")
    private int field27;

    @OriginalMember(owner = "mapview!mapview", name = "L", descriptor = "I")
    private int field28;

    @OriginalMember(owner = "mapview!mapview", name = "P", descriptor = "I")
    private int field32;

    @OriginalMember(owner = "mapview!mapview", name = "fb", descriptor = "I")
    private int field48;

    @OriginalMember(owner = "mapview!mapview", name = "t", descriptor = "La;")
    private class1 field10;

    @OriginalMember(owner = "mapview!mapview", name = "v", descriptor = "La;")
    private class1 field12;

    @OriginalMember(owner = "mapview!mapview", name = "G", descriptor = "La;")
    private class1 field23;

    @OriginalMember(owner = "mapview!mapview", name = "M", descriptor = "La;")
    private class1 field29;

    @OriginalMember(owner = "mapview!mapview", name = "Y", descriptor = "La;")
    private class1 field41;

    @OriginalMember(owner = "mapview!mapview", name = "Z", descriptor = "La;")
    private class1 field42;

    @OriginalMember(owner = "mapview!mapview", name = "ib", descriptor = "La;")
    private class1 field51;

    @OriginalMember(owner = "mapview!mapview", name = "ob", descriptor = "La;")
    private class1 field57;

    @OriginalMember(owner = "mapview!mapview", name = "cb", descriptor = "Lba;")
    private class4 field45;

    @OriginalMember(owner = "mapview!mapview", name = "gb", descriptor = "Le;")
    private class9 field49;

    @OriginalMember(owner = "mapview!mapview", name = "zb", descriptor = "Z")
    public static boolean field68;

    @OriginalMember(owner = "mapview!mapview", name = "B", descriptor = "[I")
    private int[] field18;

    @OriginalMember(owner = "mapview!mapview", name = "s", descriptor = "[I")
    private int[] field9;

    @OriginalMember(owner = "mapview!mapview", name = "rb", descriptor = "[Lk;")
    private class21[] field60;

    @OriginalMember(owner = "mapview!mapview", name = "eb", descriptor = "[Lc;")
    private class5[] field47;

    @OriginalMember(owner = "mapview!mapview", name = "bb", descriptor = "[Le;")
    private class9[] field44;

    @OriginalMember(owner = "mapview!mapview", name = "H", descriptor = "[[B")
    private byte[][] field24;

    @OriginalMember(owner = "mapview!mapview", name = "J", descriptor = "[[B")
    private byte[][] field26;

    @OriginalMember(owner = "mapview!mapview", name = "S", descriptor = "[[B")
    private byte[][] field35;

    @OriginalMember(owner = "mapview!mapview", name = "pb", descriptor = "[[B")
    private byte[][] field58;

    @OriginalMember(owner = "mapview!mapview", name = "F", descriptor = "[[I")
    private int[][] field22;

    @OriginalMember(owner = "mapview!mapview", name = "I", descriptor = "[[I")
    private int[][] field25;

    @OriginalMember(owner = "mapview!mapview", name = "b", descriptor = "(B)V", line = 4)
    public final void method1(byte arg0) {
        if (!class26.field333) {
            class26.field333 = this.method24((byte) 13);
            class30.method184(class23.field282, null, class21.field263, (byte) -85);
            return;
        }
        if (this.field46) {
            this.field46 = false;
            class10.field156 = true;
            class20.method124();
            int var2 = class6.field141 - (int) (503.0D / this.field56);
            int var3 = (int) (635.0D / this.field56) + class28.field345;
            int var4 = class6.field141 + (int) (503.0D / this.field56);
            int var5 = class28.field345 - (int) (635.0D / this.field56);
            this.method11(0, var5, 0, 503, 635, var3, var4, var2, (byte) 25);
            if (this.field34) {
                this.field49.method62(this.field48, this.field28);
                class20.method120(this.field48 + this.field27 * var5 / class21.field253, this.field28 - -(this.field32 * var2 / class14.field188), (var3 - var5) * this.field27 / class21.field253, (var4 - var2) * this.field32 / class14.field188, 16711680, 128);
                class20.method119(this.field27 * var5 / class21.field253 + this.field48, this.field32 * var2 / class14.field188 + this.field28, (var3 - var5) * this.field27 / class21.field253, (var4 - var2) * this.field32 / class14.field188, 16711680);
                if (this.field54 > 0 && this.field54 % 10 < 5) {
                    for (int var6 = 0; var6 < this.field53; var6++) {
                        if (this.field39[var6] == this.field37) {
                            int var7 = this.field48 + this.field7[var6] * this.field27 / class21.field253;
                            int var8 = this.field31[var6] * this.field32 / class14.field188 + this.field28;
                            class20.method122(var7, var8, 2, 16776960, 256);
                        }
                    }
                }
            }
            if (this.field50) {
                this.method21(5592405, class26.field327, this.field38, 7829367, this.field43, this.field17, 6943, 10066329, 18);
                this.method21(5592405, class23.field280, this.field38 + 18, 7829367, this.field43, this.field17, 6943, 10066329, this.field19 - 36);
                this.method21(5592405, class3.field79, this.field38 + this.field19 - 18, 7829367, this.field43, this.field17, 6943, 10066329, 18);
                int var9 = this.field38 + 3 + 18;
                int var10 = this.field65;
                for (int var11 = 0; var11 < 25; var11++) {
                    if (var10 < this.field44.length && this.field60.length > var10) {
                        if (this.field60[var10].method132(class32.field380, 24325)) {
                            var10++;
                            var11--;
                            continue;
                        }
                        this.field44[var10].method61(this.field17 + 3, var9);
                        this.field45.method48(this.field60[var10], this.field17 + 21, var9 - -14, 0);
                        int var12 = 16777215;
                        if (this.field30 == var10) {
                            var12 = 12298922;
                        }
                        if (this.field54 > 0 && this.field54 % 10 < 5 && this.field37 == var10) {
                            var12 = 16776960;
                        }
                        this.field45.method48(this.field60[var10], this.field17 + 20, var9 + 13, var12);
                    }
                    var9 += 17;
                    var10++;
                }
            }
            if (class32.field379.length == 1) {
                this.method21(this.field6, class33.field389, this.field32 + this.field28, this.field2, this.field27, this.field48, 6943, this.field67, 18);
                this.method21(this.field6, class29.field358, this.field38 + this.field19, this.field2, this.field43, this.field17, arg0 ^ 0xFFFFE4A4, this.field67, 18);
                if (this.field61 == 3.0D) {
                    this.method21(this.field52, class22.field270, 471, this.field59, 50, 170, 6943, this.field4, 30);
                } else {
                    this.method21(this.field6, class22.field270, 471, this.field2, 50, 170, 6943, this.field67, 30);
                }
                if (this.field61 == 4.0D) {
                    this.method21(this.field52, class23.field284, 471, this.field59, 50, 230, 6943, this.field4, 30);
                } else {
                    this.method21(this.field6, class23.field284, 471, this.field2, 50, 230, 6943, this.field67, 30);
                }
                if (this.field61 == 6.0D) {
                    this.method21(this.field52, class8.field144, 471, this.field59, 50, 290, 6943, this.field4, 30);
                } else {
                    this.method21(this.field6, class8.field144, 471, this.field2, 50, 290, 6943, this.field67, 30);
                }
                if (this.field61 == 8.0D) {
                    this.method21(this.field52, class17.field205, 471, this.field59, 50, 350, 6943, this.field4, 30);
                } else {
                    this.method21(this.field6, class17.field205, 471, this.field2, 50, 350, 6943, this.field67, 30);
                }
            } else {
                this.method21(this.field6, class33.field389, this.field28 + this.field32, this.field2, this.field27, this.field48, 6943, this.field67, 18);
                this.method21(this.field6, class29.field358, this.field38 + this.field19, this.field2, this.field43, this.field17, 6943, this.field67, 18);
                this.method19(this.field2, arg0 ^ 0xFFFFFFB9);
                if (this.field61 == 3.0D) {
                    this.method21(this.field52, class22.field270, 451, this.field59, 50, 170, 6943, this.field4, 30);
                } else {
                    this.method21(this.field6, class22.field270, 451, this.field2, 50, 170, 6943, this.field67, 30);
                }
                if (this.field61 == 4.0D) {
                    this.method21(this.field52, class23.field284, 451, this.field59, 50, 230, 6943, this.field4, 30);
                } else {
                    this.method21(this.field6, class23.field284, 451, this.field2, 50, 230, 6943, this.field67, 30);
                }
                if (this.field61 == 6.0D) {
                    this.method21(this.field52, class8.field144, 451, this.field59, 50, 290, arg0 ^ 0xFFFFE4A4, this.field4, 30);
                } else {
                    this.method21(this.field6, class8.field144, 451, this.field2, 50, 290, arg0 + 7012, this.field67, 30);
                }
                if (this.field61 == 8.0D) {
                    this.method21(this.field52, class17.field205, 451, this.field59, 50, 350, arg0 ^ 0xFFFFE4A4, this.field4, 30);
                } else {
                    this.method21(this.field6, class17.field205, 451, this.field2, 50, 350, 6943, this.field67, 30);
                }
            }
        }
        if (class10.field156) {
            this.method15((byte) -79);
        }
        if (arg0 != -69) {
            this.field66 = -10;
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "([B[[BI[[B[[B)V", line = 170)
    private final void method2(byte[] arg0, byte[][] arg1, int arg2, byte[][] arg3, byte[][] arg4) {
        int var6 = 0;
        while (true) {
            while (arg0.length > var6) {
                int var7 = (arg0[var6++] & 0xFF) * 64 - class33.field393;
                int var8 = (arg0[var6++] & 0xFF) * 64 - class11.field165;
                if (var7 > 0 && var8 > 0 && class21.field253 > var7 + 64 && var8 + 64 < class14.field188) {
                    for (int var9 = 0; var9 < 64; var9++) {
                        byte[] var10 = arg3[var9 + var7];
                        byte[] var11 = arg1[var9 + var7];
                        byte[] var12 = arg4[var7 + var9];
                        int var13 = class14.field188 - var8 - 1;
                        for (int var14 = -64; var14 < 0; var14++) {
                            while (true) {
                                int var15 = arg0[var6++] & 0xFF;
                                if (var15 == 0) {
                                    var13--;
                                    break;
                                }
                                if (var15 < 29) {
                                    var12[var13] = (byte) var15;
                                } else if (var15 >= 160) {
                                    var11[var13] = (byte) (var15 - 159);
                                    this.field7[this.field53] = var7 + var9;
                                    this.field31[this.field53] = var13;
                                    this.field39[this.field53] = var15 - 160;
                                    this.field53++;
                                } else {
                                    var10[var13] = (byte) (var15 - 28);
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
            if (arg2 != -64) {
                this.method19(114, 101);
            }
            return;
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "([[BZ[[I)V", line = 285)
    private final void method3(byte[][] arg0, boolean arg1, int[][] arg2) {
        int var4 = class14.field188;
        int var5 = class21.field253;
        int[] var6 = new int[var4];
        if (!arg1) {
            return;
        }
        for (int var7 = 0; var7 < var4; var7++) {
            var6[var7] = 0;
        }
        for (int var8 = 5; var8 < var5 - 5; var8++) {
            byte[] var9 = arg0[var8 + 5];
            byte[] var10 = arg0[var8 - 5];
            for (int var11 = 0; var11 < var4; var11++) {
                var6[var11] += this.field18[class30.method181(var9[var11], 255)] - this.field18[class30.method181(255, var10[var11])];
            }
            if (var8 > 10 && var5 - 10 > var8) {
                int var12 = 0;
                int var13 = 0;
                int var14 = 0;
                int[] var15 = arg2[var8];
                for (int var16 = 5; var16 < var4 - 5; var16++) {
                    int var17 = var6[var16 - 5];
                    int var18 = var6[var16 + 5];
                    var13 += (var18 >> 20) - (var17 >> 20);
                    var14 += (var18 & 0x3FF) - (var17 & 0x3FF);
                    var12 += (var18 >> 10 & 0x3FF) - (var17 >> 10 & 0x3FF);
                    if (var14 > 0) {
                        var15[var16] = this.method26((double) var13 / 8533.0D, (double) var12 / 8533.0D, (double) var14 / 8533.0D, (byte) -95);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(II)V", line = 359)
    private final void method4(int arg0, int arg1) {
        class26 var3 = class32.field379[arg1];
        class11 var4 = new class11(var3.method167(class12.field181, (byte) 119, class30.field374));
        int var5 = var4.method70(27779);
        int var6 = var4.method70(27779);
        int var7 = var4.method70(27779);
        int var8 = var4.method70(27779);
        int var9 = var4.method70(27779);
        int var10 = var4.method70(27779);
        var4.method79(-9709);
        this.field32 = 180;
        class33.field393 = var5 * 64;
        class14.field188 = (var8 - var6) * 64 + 64;
        class28.field345 = var9 * 64 - class33.field393;
        this.field28 = 503 - this.field32 - 20;
        class11.field165 = var6 * 64;
        class21.field253 = (var7 + 1 - var5) * 64;
        class6.field141 = class11.field165 + class14.field188 - var10 * 64;
        this.field27 = class21.field253 * this.field32 / class14.field188;
        this.field48 = 635 - this.field27 - 5;
        class11 var11 = new class11(var3.method167(class29.field356, (byte) 54, class30.field374));
        this.field3 = var11.method70(27779);
        for (int var12 = 0; var12 < this.field3; var12++) {
            this.field8[var12] = var11.method79(-9709);
            this.field36[var12] = var11.method70(27779);
            this.field11[var12] = var11.method70(27779);
            this.field20[var12] = var11.method73((byte) -97);
        }
        class11 var13 = new class11(var3.method167(class28.field339, (byte) 66, class30.field374));
        int var14 = var13.method70(27779);
        this.field18 = new int[var14 + 1];
        for (int var15 = 0; var15 < var14; var15++) {
            this.field18[var15 + 1] = var13.method81(-106);
        }
        int var16 = var13.method70(27779);
        this.field9 = new int[var16 + 1];
        for (int var17 = 0; var17 < var16; var17++) {
            this.field9[var17 + 1] = var13.method81(-128);
        }
        byte[] var18 = var3.method167(class3.field86, (byte) 52, class30.field374);
        byte[][] var19 = new byte[class21.field253][class14.field188];
        this.method7(var19, false, var18);
        byte[] var20 = var3.method167(class3.field85, (byte) 62, class30.field374);
        this.field22 = new int[class21.field253][class14.field188];
        this.field26 = new byte[class21.field253][class14.field188];
        this.method28(var20, this.field22, this.field26, -64);
        byte[] var21 = var3.method167(class6.field131, (byte) 57, class30.field374);
        this.field35 = new byte[class21.field253][class14.field188];
        this.field58 = new byte[class21.field253][class14.field188];
        this.field24 = new byte[class21.field253][class14.field188];
        this.field53 = 0;
        int var22 = 107 % ((arg0 + 39) / 58);
        this.method2(var21, this.field35, -64, this.field24, this.field58);
        this.field25 = new int[class21.field253][class14.field188];
        this.method3(var19, true, this.field25);
    }

    @OriginalMember(owner = "mapview!mapview", name = "h", descriptor = "(I)[Le;", line = 459)
    public static final class9[] method5(int arg0) {
        class9[] var1 = new class9[class19.field242];
        for (int var2 = arg0; var2 < class19.field242; var2++) {
            class9 var3 = var1[var2] = new class9();
            var3.field150 = class26.field331[var2];
            var3.field151 = class32.field385[var2];
            var3.field153 = class19.field239[var2];
            var3.field152 = class8.field145[var2];
            byte[] var4 = class28.field338[var2];
            int var5 = var3.field153 * var3.field152;
            var3.field154 = new int[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                var3.field154[var6] = class11.field172[class30.method181(var4[var6], 255)];
            }
        }
        class19.method114(32);
        return var1;
    }

    @OriginalMember(owner = "mapview!mapview", name = "<init>", descriptor = "()V", line = 3411)
    public mapview() {
        if (class33.field398) {
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "i", descriptor = "(I)V", line = 511)
    private final void method6(int arg0) {
        if (class32.field379.length == arg0) {
            class11.field166 = 0;
        } else {
            if (class32.field383 >= 0) {
                class11.field166 = class32.field383;
            } else {
                class11.field166 = this.method30(arg0 - 1, class11.field166);
            }
            class32.field383 = this.method30(0, class11.field166);
        }
        this.method23((byte) -30, class11.field166);
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "([[BZ[B)V", line = 533)
    private final void method7(byte[][] arg0, boolean arg1, byte[] arg2) {
        if (arg1) {
            this.field24 = null;
        }
        int var4 = 0;
        while (true) {
            while (var4 < arg2.length) {
                int var5 = (arg2[var4++] & 0xFF) * 64 - class33.field393;
                int var6 = (arg2[var4++] & 0xFF) * 64 - class11.field165;
                if (var5 > 0 && var6 > 0 && class21.field253 > var5 + 64 && class14.field188 > var6 + 64) {
                    for (int var7 = 0; var7 < 64; var7++) {
                        byte[] var8 = arg0[var7 + var5];
                        int var9 = class14.field188 - var6 - 1;
                        for (int var10 = -64; var10 < 0; var10++) {
                            var8[var9--] = arg2[var4++];
                        }
                    }
                } else {
                    var4 += 4096;
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(Ljava/lang/String;I[B)V", line = 579)
    private final void method8(String arg0, int arg1, byte[] arg2) throws IOException {
        FileOutputStream var4 = new FileOutputStream(arg0);
        var4.write(arg2, 0, arg2.length);
        if (arg1 != 15097) {
            this.method18(-121);
        }
        var4.close();
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(Lk;Ljava/lang/String;I)Z", line = 592)
    private final boolean method9(class21 arg0, String arg1, int arg2) {
        byte[] var4 = null;
        if (!class29.field361) {
            class29.field361 = true;
            if (class11.field170 != null) {
                try {
                    var4 = this.method27(-7712, class11.field170 + "/" + arg1);
                    if (!this.method22(var4, arg1, true)) {
                        var4 = null;
                    }
                    if (var4 != null) {
                        class17.field208 = new class26(var4, false, true);
                        return true;
                    }
                } catch (IOException var11) {
                    var4 = null;
                }
            }
        }
        if (var4 == null) {
            boolean var6 = this.method10(false, arg1, arg0);
            if (!var6) {
                return false;
            }
            var4 = class24.field298;
            class24.field298 = null;
        }
        if (arg2 > -31) {
            this.field64 = null;
        }
        if (var4 == null) {
            class29.field361 = false;
            return true;
        }
        if (class11.field170 != null && var4 != null) {
            try {
                this.method8(class11.field170 + "/" + arg1, 15097, var4);
            } catch (IOException var10) {
            }
        }
        try {
            class17.field208 = new class26(var4, false, true);
            class29.field361 = false;
            return true;
        } catch (IOException var9) {
            throw class28.method177(var9, "monkey feet");
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(ZLjava/lang/String;Lk;)Z", line = 661)
    private final boolean method10(boolean arg0, String arg1, class21 arg2) {
        if (arg0) {
            this.field64 = null;
        }
        try {
            if (class14.field193 == null) {
                class23.field282 = class26.method173(2, new class21[] { class8.field143, arg2 });
                int var4;
                if (arg1 == "main_file_cache.dat0") {
                    var4 = 377657;
                } else if (arg1 == "main_file_cache.dat1") {
                    var4 = 140947;
                } else if (arg1 == "main_file_cache.dat2") {
                    var4 = 102729;
                } else {
                    var4 = 8200;
                }
                String var5;
                if (arg1 == "main_file_cache.dat0") {
                    var5 = "worldmap.main.js5?crc=1099368423";
                } else if (arg1 == "main_file_cache.dat1") {
                    var5 = "worldmap.dungeon.js5?crc=1221619691";
                } else if (arg1 == "main_file_cache.dat2") {
                    var5 = "worldmap.extra.js5?crc=-611124231";
                } else {
                    var5 = "mapview.sprites.js5?crc=-1837203931";
                }
                class14.field193 = new DataInputStream((new URL(this.getCodeBase(), var5)).openStream());
                class17.field207 = 0;
                class24.field287 = 0;
                class24.field298 = new byte[var4];
            }
            int var6 = class24.field287;
            int var7 = class24.field298.length;
            if (var7 <= var6) {
                class14.field193.close();
                class14.field193 = null;
                if (!this.method22(class24.field298, arg1, true)) {
                    this.method198("download", (byte) 118);
                    class24.field298 = null;
                }
                return true;
            }
            class17.field207++;
            if (class17.field207 >= 1500) {
                throw new IOException();
            }
            DataInputStream var8 = class14.field193;
            int var9 = var8.available();
            if (var9 < 0) {
                throw new EOFException();
            } else if (var9 == 0) {
                return false;
            } else {
                if (var7 - var6 < var9) {
                    var9 = var7 - var6;
                }
                int var10 = var8.read(class24.field298, var6, var9);
                if (var10 < 0) {
                    throw new EOFException();
                } else if (var10 == 0) {
                    return false;
                } else {
                    int var11 = var6 + var10;
                    class17.field207 = 0;
                    int var12 = var11 * 100 / var7;
                    class23.field282 = class26.method173(2, new class21[] { class22.field271, arg2, class12.field178, class17.method97(10, var12), class8.field147 });
                    class24.field287 = var11;
                    return false;
                }
            }
        } catch (IOException var16) {
            try {
                class14.field193.close();
            } catch (Exception var15) {
            }
            class14.field193 = null;
            class24.field298 = null;
            this.method198("download", (byte) -77);
            return true;
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "init", descriptor = "()V", line = 775)
    public final void init() {
        if (this.method193(0)) {
            this.method200(32, 503, class30.field363.method129(-58, this).method126(93), 635, 32);
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(IIIIIIIIB)V", line = 787)
    private final void method11(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte arg8) {
        int var10 = arg6 - arg7;
        int var11 = arg5 - arg1;
        int var12 = (arg4 - arg2 << 16) / var11;
        int var13 = (arg3 - arg0 << 16) / var10;
        for (int var14 = 0; var14 < var11; var14++) {
            int var15 = var12 * var14 >> 16;
            int var16 = (var14 + 1) * var12 >> 16;
            int var17 = var16 - var15;
            if (var17 > 0) {
                int var18 = arg2 + var15;
                int var19 = arg2 + var16;
                byte[] var20 = this.field26[arg1 + var14];
                int[] var21 = this.field22[var14 + arg1];
                int[] var22 = this.field25[var14 + arg1];
                for (int var23 = 0; var23 < var10; var23++) {
                    int var24 = var13 * var23 >> 16;
                    int var25 = (var23 + 1) * var13 >> 16;
                    int var26 = var25 - var24;
                    if (var26 > 0) {
                        int var27 = arg0 + var24;
                        int var28 = arg0 + var25;
                        int var29 = var21[var23 + arg7];
                        if (var29 == 0) {
                            class20.method121(var18, var27, var19 - var18, var28 - var27, var22[arg7 + var23]);
                        } else {
                            byte var30 = var20[arg7 + var23];
                            int var31 = var30 & 0xFC;
                            if (var31 == 0 || var17 <= 1 || var26 <= 1) {
                                class20.method121(var18, var27, var17, var26, var29);
                            } else {
                                this.method20(var26, var22[arg7 + var23], var17, var29, var30 & 0x3, class20.field248 * var27 + var18, class20.field247, var31 >> 2, (byte) 89);
                            }
                        }
                    }
                }
            }
        }
        if (arg5 - arg1 > -arg2 + arg4) {
            return;
        }
        int var32 = 0;
        for (int var33 = 0; var33 < var11; var33++) {
            int var34 = var12 * var33 >> 16;
            int var35 = (var33 + 1) * var12 >> 16;
            int var36 = var35 - var34;
            if (var36 > 0) {
                byte[] var37 = this.field58[arg1 + var33];
                byte[] var38 = this.field24[arg1 + var33];
                byte[] var39 = this.field35[arg1 + var33];
                for (int var40 = 0; var40 < var10; var40++) {
                    int var41 = var13 * var40 >> 16;
                    int var42 = (var40 + 1) * var13 >> 16;
                    int var43 = var42 - var41;
                    if (var43 > 0) {
                        int var44 = var37[arg7 + var40] & 0xFF;
                        if (var44 != 0) {
                            int var45;
                            if (var36 == 1) {
                                var45 = var34;
                            } else {
                                var45 = var35 - 1;
                            }
                            int var46;
                            if (var43 == 1) {
                                var46 = var41;
                            } else {
                                var46 = var42 - 1;
                            }
                            int var47 = 13421772;
                            if (var44 >= 5 && var44 <= 8 || var44 >= 13 && var44 <= 16 || var44 >= 21 && var44 <= 24 || var44 == 27 || var44 == 28) {
                                var47 = 13369344;
                                var44 -= 4;
                            }
                            if (var44 == 1) {
                                class20.method116(var34, var41, var43, var47);
                            } else if (var44 == 2) {
                                class20.method118(var34, var41, var36, var47);
                            } else if (var44 == 3) {
                                class20.method116(var45, var41, var43, var47);
                            } else if (var44 == 4) {
                                class20.method118(var34, var46, var36, var47);
                            } else if (var44 == 9) {
                                class20.method116(var34, var41, var43, 16777215);
                                class20.method118(var34, var41, var36, var47);
                            } else if (var44 == 10) {
                                class20.method116(var45, var41, var43, 16777215);
                                class20.method118(var34, var41, var36, var47);
                            } else if (var44 == 11) {
                                class20.method116(var45, var41, var43, 16777215);
                                class20.method118(var34, var46, var36, var47);
                            } else if (var44 == 12) {
                                class20.method116(var34, var41, var43, 16777215);
                                class20.method118(var34, var46, var36, var47);
                            } else if (var44 == 17) {
                                class20.method118(var34, var41, 1, var47);
                            } else if (var44 == 18) {
                                class20.method118(var45, var41, 1, var47);
                            } else if (var44 == 19) {
                                class20.method118(var45, var46, 1, var47);
                            } else if (var44 == 20) {
                                class20.method118(var34, var46, 1, var47);
                            } else if (var44 == 25) {
                                for (int var49 = 0; var49 < var43; var49++) {
                                    class20.method118(var34 + var49, -var49 + var46, 1, var47);
                                }
                            } else if (var44 == 26) {
                                for (int var48 = 0; var48 < var43; var48++) {
                                    class20.method118(var34 + var48, var41 + var48, 1, var47);
                                }
                            }
                        }
                        int var50 = var38[var40 + arg7] & 0xFF;
                        if (var50 != 0) {
                            this.field47[var50 - 1].method52(var34 - var36 / 2, var41 - var43 / 2, var36 * 2, var43 * 2);
                        }
                        int var51 = var39[arg7 + var40] & 0xFF;
                        if (var51 != 0) {
                            this.field64[var32] = var51 - 1;
                            this.field55[var32] = var34 + var36 / 2;
                            this.field21[var32] = var43 / 2 + var41;
                            var32++;
                        }
                    }
                }
            }
        }
        for (int var52 = 0; var52 < var32; var52++) {
            if (this.field44[this.field64[var52]] != null) {
                this.field44[this.field64[var52]].method61(this.field55[var52] - 7, this.field21[var52] + -7);
            }
        }
        if (this.field54 > 0) {
            for (int var53 = 0; var53 < var32; var53++) {
                if (this.field64[var53] == this.field37) {
                    this.field44[this.field64[var53]].method61(this.field55[var53] - 7, this.field21[var53] + -7);
                    if (this.field54 % 10 < 5) {
                        class20.method122(this.field55[var53], this.field21[var53], 15, 16776960, 128);
                        class20.method122(this.field55[var53], this.field21[var53], 7, 16777215, 256);
                    }
                }
            }
        }
        if (this.field61 == this.field56 && class30.field369) {
            for (int var54 = 0; var54 < this.field3; var54++) {
                int var55 = this.field36[var54];
                int var56 = var55 - class33.field393;
                int var57 = this.field11[var54];
                int var58 = arg2 + (var56 - arg1) * (-arg2 + arg4) / (arg5 - arg1);
                int var59 = 16777215;
                int var60 = class14.field188 + class11.field165 - var57;
                int var61 = this.field20[var54];
                class1 var62 = null;
                int var63 = (arg3 - arg0) * (-arg7 + var60) / (arg6 - arg7) + arg0;
                if (var61 == 0) {
                    if (this.field56 == 3.0D) {
                        var62 = this.field23;
                    }
                    if (this.field56 == 4.0D) {
                        var62 = this.field41;
                    }
                    if (this.field56 == 6.0D) {
                        var62 = this.field10;
                    }
                    if (this.field56 == 8.0D) {
                        var62 = this.field29;
                    }
                }
                if (var61 == 1) {
                    if (this.field56 == 3.0D) {
                        var62 = this.field10;
                    }
                    if (this.field56 == 4.0D) {
                        var62 = this.field29;
                    }
                    if (this.field56 == 6.0D) {
                        var62 = this.field57;
                    }
                    if (this.field56 == 8.0D) {
                        var62 = this.field12;
                    }
                }
                if (var61 == 2) {
                    if (this.field56 == 3.0D) {
                        var62 = this.field57;
                    }
                    var59 = 16755200;
                    if (this.field56 == 4.0D) {
                        var62 = this.field12;
                    }
                    if (this.field56 == 6.0D) {
                        var62 = this.field51;
                    }
                    if (this.field56 == 8.0D) {
                        var62 = this.field42;
                    }
                }
                if (var62 != null) {
                    class21 var64 = this.field8[var54];
                    int var65 = 1;
                    for (int var66 = 0; var66 < var64.method137((byte) -124); var66++) {
                        if (var64.method143(-9, var66) == 47) {
                            var65++;
                        }
                    }
                    int var67 = var63 - var62.method36() * (var65 - 1) / 2;
                    int var68 = var67 + var62.method32() / 2;
                    while (true) {
                        int var69 = var64.method139(47, false);
                        if (var69 == -1) {
                            var62.method39(var64, var58, var68, var59, true);
                            break;
                        }
                        class21 var70 = var64.method134(var69, 0, -30761);
                        var62.method39(var70, var58, var68, var59, true);
                        var68 += var62.method36();
                        var64 = var64.method138(10, var69 + 1);
                    }
                }
            }
        }
        if (arg8 != 25) {
            this.method23((byte) 71, 73);
        }
        if (!class25.field311) {
            return;
        }
        for (int var71 = class33.field393 / 64; var71 < (class33.field393 + class21.field253) / 64; var71++) {
            for (int var72 = class11.field165 / 64; var72 < (class14.field188 + class11.field165) / 64; var72++) {
                int var73 = var72 * 64;
                int var74 = var71 * 64;
                int var75 = var74 - class33.field393;
                int var76 = (var75 - arg1) * (-arg2 + arg4) / (arg5 - arg1) + arg2;
                int var77 = class11.field165 + class14.field188 - var73;
                int var78 = (var77 - arg7 - 64) * (-arg0 + arg3) / (arg6 - arg7) + arg0;
                int var79 = arg2 + (arg4 - arg2) * (-arg1 + var75 + 64) / (arg5 - arg1);
                int var80 = arg0 + (arg3 - arg0) * (-arg7 + var77) / (arg6 - arg7);
                class20.method119(var76, var78, var79 - var76, -var78 + var80, 16777215);
                this.field45.method46(class26.method173(2, new class21[] { class17.method97(10, var71), class26.field324, class17.method97(10, var72) }), var79 - 5, var80 - 5, 16777215);
                if (var71 == 33 && var72 >= 71 && var72 <= 73) {
                    this.field45.method51(class26.field328, (var79 + var76) / 2, (var78 + var80) / 2, 16711680);
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "j", descriptor = "(I)V", line = 1252)
    public static void method12(int arg0) {
        field13 = null;
        if (arg0 != 2) {
            method17(110, null, 102, 102);
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "k", descriptor = "(I)V", line = 1266)
    private final void method13(int arg0) {
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
        if (arg0 != -9641) {
            this.method13(109);
        }
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "d:/windows/", "d:/winnt/", "e:/windows/", "e:/winnt/", "f:/windows/", "f:/winnt/", "c:/", var3, "/tmp/", "" };
        String var6 = ".file_store_32";
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
                        class11.field170 = var8 + var6 + "/rsmap/";
                        return;
                    }
                }
            } catch (Exception var14) {
            }
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(Z)V", line = 1343)
    public final void method14(boolean arg0) {
        class24.method159(32);
        class6.method56(-1);
        try {
            this.field60 = null;
            this.field21 = null;
            this.field26 = null;
            this.field20 = null;
            this.field25 = null;
            this.field18 = null;
            this.field35 = null;
            this.field22 = null;
            this.field39 = null;
            this.field11 = null;
            this.field7 = null;
            this.field64 = null;
            this.field44 = null;
            this.field55 = null;
            this.field49 = null;
            this.field47 = null;
            this.field58 = null;
            this.field8 = null;
            this.field24 = null;
            this.field45 = null;
            if (arg0) {
                return;
            }
            this.field36 = null;
            this.field9 = null;
            this.field31 = null;
            System.gc();
        } catch (Throwable var3) {
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "c", descriptor = "(B)V", line = 1400)
    private final void method15(byte arg0) {
        if (arg0 >= -28) {
            this.field20 = null;
        }
        class10.field156 = false;
        try {
            Graphics var2 = class28.field348.getGraphics();
            class33.field390.method95(83, var2, 0, 0);
        } catch (Exception var4) {
            class28.field348.repaint();
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "b", descriptor = "(II)I", line = 1437)
    public static int method16(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(I[BII)I", line = 1461)
    public static final int method17(int arg0, byte[] arg1, int arg2, int arg3) {
        int var4 = -1;
        for (int var5 = arg2; var5 < arg0; var5++) {
            var4 = class12.field174[(arg1[var5] ^ var4) & 0xFF] ^ var4 >>> 8;
        }
        if (arg3 >= -111) {
            field40 = -17;
        }
        return ~var4;
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(I)V", line = 1482)
    public final void method18(int arg0) {
        method12(2);
        class27.method175((byte) 123);
        class21.method131((byte) 42);
        class8.method58(127);
        class32.method191(true);
        class11.method72(-65);
        class33.method197(0);
        class12.method83(arg0 - 65);
        class30.method183((byte) -113);
        class17.method96((byte) -124);
        class26.method172((byte) -8);
        class1.method38();
        class14.method91((byte) 94);
        class25.method161(27270);
        class3.method45(arg0 ^ 0x0);
        class29.method180(-103);
        class20.method125();
        class2.method43(false);
        class19.method112((byte) -46);
        class15.method94(64);
        class28.method176(0);
        class23.method156(arg0 + 108);
        class22.method146(58);
        class10.method65((byte) 69);
        class24.method158(false);
        class34.method201();
        class6.method54(-62);
        this.field7 = null;
        this.field55 = null;
        if (arg0 != -1) {
            return;
        }
        this.field12 = null;
        this.field26 = null;
        this.field47 = null;
        this.field23 = null;
        this.field58 = null;
        this.field9 = null;
        this.field31 = null;
        this.field24 = null;
        this.field8 = null;
        this.field10 = null;
        this.field60 = null;
        this.field44 = null;
        this.field18 = null;
        this.field35 = null;
        this.field45 = null;
        this.field39 = null;
        this.field51 = null;
        this.field22 = null;
        this.field20 = null;
        this.field25 = null;
        this.field29 = null;
        this.field21 = null;
        this.field64 = null;
        this.field57 = null;
        this.field11 = null;
        this.field42 = null;
        this.field49 = null;
        this.field41 = null;
        this.field36 = null;
    }

    @OriginalMember(owner = "mapview!mapview", name = "c", descriptor = "(II)V", line = 1572)
    private final void method19(int arg0, int arg1) {
        if (arg1 == 2) {
            this.method21(this.field6, class26.method173(2, new class21[] { class33.field392, class23.field276[class32.field383], class28.field351 }), 483, arg0, 230, 170, 6943, this.field67, 18);
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(IIIIII[IIB)V", line = 1582)
    private final void method20(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int arg7, byte arg8) {
        if (arg7 == 9) {
            arg7 = 1;
            arg4 = arg4 + 1 & 0x3;
        }
        if (arg7 == 10) {
            arg7 = 1;
            arg4 = arg4 + 3 & 0x3;
        }
        int var10 = class20.field248 - arg2;
        if (arg7 == 11) {
            arg4 = arg4 + 3 & 0x3;
            arg7 = 8;
        }
        if (arg7 == 1) {
            if (arg4 == 0) {
                for (int var67 = 0; var67 < arg0; var67++) {
                    for (int var68 = 0; var68 < arg2; var68++) {
                        if (var68 > var67) {
                            arg6[arg5++] = arg1;
                        } else {
                            arg6[arg5++] = arg3;
                        }
                    }
                    arg5 += var10;
                }
            } else if (arg4 == 1) {
                for (int var69 = arg0 - 1; var69 >= 0; var69--) {
                    for (int var70 = 0; var70 < arg2; var70++) {
                        if (var69 >= var70) {
                            arg6[arg5++] = arg3;
                        } else {
                            arg6[arg5++] = arg1;
                        }
                    }
                    arg5 += var10;
                }
            } else if (arg4 == 2) {
                for (int var71 = 0; var71 < arg0; var71++) {
                    for (int var72 = 0; var72 < arg2; var72++) {
                        if (var72 >= var71) {
                            arg6[arg5++] = arg3;
                        } else {
                            arg6[arg5++] = arg1;
                        }
                    }
                    arg5 += var10;
                }
            } else if (arg4 == 3) {
                for (int var73 = arg0 - 1; var73 >= 0; var73--) {
                    for (int var74 = 0; var74 < arg2; var74++) {
                        if (var73 <= var74) {
                            arg6[arg5++] = arg3;
                        } else {
                            arg6[arg5++] = arg1;
                        }
                    }
                    arg5 += var10;
                }
            }
        } else if (arg7 == 2) {
            if (arg4 == 0) {
                for (int var65 = arg0 - 1; var65 >= 0; var65--) {
                    for (int var66 = 0; var66 < arg2; var66++) {
                        if (var66 <= var65 >> 1) {
                            arg6[arg5++] = arg3;
                        } else {
                            arg6[arg5++] = arg1;
                        }
                    }
                    arg5 += var10;
                }
            } else if (arg4 == 1) {
                for (int var63 = 0; var63 < arg0; var63++) {
                    for (int var64 = 0; var64 < arg2; var64++) {
                        if (var64 < var63 << 1) {
                            arg6[arg5++] = arg1;
                        } else {
                            arg6[arg5++] = arg3;
                        }
                    }
                    arg5 += var10;
                }
            } else if (arg4 == 2) {
                for (int var59 = 0; var59 < arg0; var59++) {
                    for (int var60 = arg2 - 1; var60 >= 0; var60--) {
                        if (var60 <= var59 >> 1) {
                            arg6[arg5++] = arg3;
                        } else {
                            arg6[arg5++] = arg1;
                        }
                    }
                    arg5 += var10;
                }
            } else if (arg4 == 3) {
                for (int var61 = arg0 - 1; var61 >= 0; var61--) {
                    for (int var62 = arg2 - 1; var62 >= 0; var62--) {
                        if (var62 >= var61 << 1) {
                            arg6[arg5++] = arg3;
                        } else {
                            arg6[arg5++] = arg1;
                        }
                    }
                    arg5 += var10;
                }
            }
        } else if (arg7 == 3) {
            if (arg4 == 0) {
                for (int var11 = arg0 - 1; var11 >= 0; var11--) {
                    for (int var12 = arg2 - 1; var12 >= 0; var12--) {
                        if (var11 >> 1 < var12) {
                            arg6[arg5++] = arg1;
                        } else {
                            arg6[arg5++] = arg3;
                        }
                    }
                    arg5 += var10;
                }
            } else if (arg4 == 1) {
                for (int var13 = arg0 - 1; var13 >= 0; var13--) {
                    for (int var14 = 0; var14 < arg2; var14++) {
                        if (var13 << 1 <= var14) {
                            arg6[arg5++] = arg3;
                        } else {
                            arg6[arg5++] = arg1;
                        }
                    }
                    arg5 += var10;
                }
            } else if (arg4 == 2) {
                for (int var17 = 0; var17 < arg0; var17++) {
                    for (int var18 = 0; var18 < arg2; var18++) {
                        if (var18 > var17 >> 1) {
                            arg6[arg5++] = arg1;
                        } else {
                            arg6[arg5++] = arg3;
                        }
                    }
                    arg5 += var10;
                }
            } else if (arg4 == 3) {
                for (int var15 = 0; var15 < arg0; var15++) {
                    for (int var16 = arg2 - 1; var16 >= 0; var16--) {
                        if (var16 >= var15 << 1) {
                            arg6[arg5++] = arg3;
                        } else {
                            arg6[arg5++] = arg1;
                        }
                    }
                    arg5 += var10;
                }
            }
        } else if (arg7 == 4) {
            if (arg4 == 0) {
                for (int var57 = arg0 - 1; var57 >= 0; var57--) {
                    for (int var58 = 0; var58 < arg2; var58++) {
                        if (var57 >> 1 > var58) {
                            arg6[arg5++] = arg1;
                        } else {
                            arg6[arg5++] = arg3;
                        }
                    }
                    arg5 += var10;
                }
            } else if (arg4 == 1) {
                for (int var51 = 0; var51 < arg0; var51++) {
                    for (int var52 = 0; var52 < arg2; var52++) {
                        if (var52 > var51 << 1) {
                            arg6[arg5++] = arg1;
                        } else {
                            arg6[arg5++] = arg3;
                        }
                    }
                    arg5 += var10;
                }
            } else if (arg4 == 2) {
                for (int var53 = 0; var53 < arg0; var53++) {
                    for (int var54 = arg2 - 1; var54 >= 0; var54--) {
                        if (var53 >> 1 > var54) {
                            arg6[arg5++] = arg1;
                        } else {
                            arg6[arg5++] = arg3;
                        }
                    }
                    arg5 += var10;
                }
            } else if (arg4 == 3) {
                for (int var55 = arg0 - 1; var55 >= 0; var55--) {
                    for (int var56 = arg2 - 1; var56 >= 0; var56--) {
                        if (var55 << 1 < var56) {
                            arg6[arg5++] = arg1;
                        } else {
                            arg6[arg5++] = arg3;
                        }
                    }
                    arg5 += var10;
                }
            }
        } else if (arg7 != 5) {
            if (arg7 == 6) {
                if (arg4 == 0) {
                    for (int var19 = 0; var19 < arg0; var19++) {
                        for (int var20 = 0; var20 < arg2; var20++) {
                            if (var20 > arg2 / 2) {
                                arg6[arg5++] = arg1;
                            } else {
                                arg6[arg5++] = arg3;
                            }
                        }
                        arg5 += var10;
                    }
                    return;
                }
                if (arg4 == 1) {
                    for (int var21 = 0; var21 < arg0; var21++) {
                        for (int var22 = 0; var22 < arg2; var22++) {
                            if (var21 > arg0 / 2) {
                                arg6[arg5++] = arg1;
                            } else {
                                arg6[arg5++] = arg3;
                            }
                        }
                        arg5 += var10;
                    }
                    return;
                }
                if (arg4 == 2) {
                    for (int var23 = 0; var23 < arg0; var23++) {
                        for (int var24 = 0; var24 < arg2; var24++) {
                            if (var24 < arg2 / 2) {
                                arg6[arg5++] = arg1;
                            } else {
                                arg6[arg5++] = arg3;
                            }
                        }
                        arg5 += var10;
                    }
                    return;
                }
                if (arg4 == 3) {
                    for (int var25 = 0; var25 < arg0; var25++) {
                        for (int var26 = 0; var26 < arg2; var26++) {
                            if (arg0 / 2 > var25) {
                                arg6[arg5++] = arg1;
                            } else {
                                arg6[arg5++] = arg3;
                            }
                        }
                        arg5 += var10;
                    }
                    return;
                }
            }
            if (arg7 == 7) {
                if (arg4 == 0) {
                    for (int var33 = 0; var33 < arg0; var33++) {
                        for (int var34 = 0; var34 < arg2; var34++) {
                            if (var34 > var33 - arg0 / 2) {
                                arg6[arg5++] = arg1;
                            } else {
                                arg6[arg5++] = arg3;
                            }
                        }
                        arg5 += var10;
                    }
                    return;
                }
                if (arg4 == 1) {
                    for (int var27 = arg0 - 1; var27 >= 0; var27--) {
                        for (int var28 = 0; var28 < arg2; var28++) {
                            if (var27 - arg0 / 2 < var28) {
                                arg6[arg5++] = arg1;
                            } else {
                                arg6[arg5++] = arg3;
                            }
                        }
                        arg5 += var10;
                    }
                    return;
                }
                if (arg4 == 2) {
                    for (int var29 = arg0 - 1; var29 >= 0; var29--) {
                        for (int var30 = arg2 - 1; var30 >= 0; var30--) {
                            if (var30 > var29 - arg0 / 2) {
                                arg6[arg5++] = arg1;
                            } else {
                                arg6[arg5++] = arg3;
                            }
                        }
                        arg5 += var10;
                    }
                    return;
                }
                if (arg4 == 3) {
                    for (int var31 = 0; var31 < arg0; var31++) {
                        for (int var32 = arg2 - 1; var32 >= 0; var32--) {
                            if (var32 <= var31 - arg0 / 2) {
                                arg6[arg5++] = arg3;
                            } else {
                                arg6[arg5++] = arg1;
                            }
                        }
                        arg5 += var10;
                    }
                    return;
                }
            }
            if (arg7 == 8) {
                if (arg4 == 0) {
                    for (int var41 = 0; var41 < arg0; var41++) {
                        for (int var42 = 0; var42 < arg2; var42++) {
                            if (var41 - arg0 / 2 > var42) {
                                arg6[arg5++] = arg1;
                            } else {
                                arg6[arg5++] = arg3;
                            }
                        }
                        arg5 += var10;
                    }
                    return;
                }
                if (arg4 == 1) {
                    for (int var39 = arg0 - 1; var39 >= 0; var39--) {
                        for (int var40 = 0; var40 < arg2; var40++) {
                            if (var40 >= var39 - arg0 / 2) {
                                arg6[arg5++] = arg3;
                            } else {
                                arg6[arg5++] = arg1;
                            }
                        }
                        arg5 += var10;
                    }
                    return;
                }
                if (arg4 == 2) {
                    for (int var37 = arg0 - 1; var37 >= 0; var37--) {
                        for (int var38 = arg2 - 1; var38 >= 0; var38--) {
                            if (var38 >= var37 - arg0 / 2) {
                                arg6[arg5++] = arg3;
                            } else {
                                arg6[arg5++] = arg1;
                            }
                        }
                        arg5 += var10;
                    }
                    return;
                }
                if (arg4 == 3) {
                    for (int var35 = 0; var35 < arg0; var35++) {
                        for (int var36 = arg2 - 1; var36 >= 0; var36--) {
                            if (var36 < var35 - arg0 / 2) {
                                arg6[arg5++] = arg1;
                            } else {
                                arg6[arg5++] = arg3;
                            }
                        }
                        arg5 += var10;
                    }
                    return;
                }
            }
            if (arg8 != 89) {
                this.field5 = -44;
            }
        } else if (arg4 == 0) {
            for (int var43 = arg0 - 1; var43 >= 0; var43--) {
                for (int var44 = arg2 - 1; var44 >= 0; var44--) {
                    if (var43 >> 1 > var44) {
                        arg6[arg5++] = arg1;
                    } else {
                        arg6[arg5++] = arg3;
                    }
                }
                arg5 += var10;
            }
        } else if (arg4 == 1) {
            for (int var49 = arg0 - 1; var49 >= 0; var49--) {
                for (int var50 = 0; var50 < arg2; var50++) {
                    if (var49 << 1 >= var50) {
                        arg6[arg5++] = arg3;
                    } else {
                        arg6[arg5++] = arg1;
                    }
                }
                arg5 += var10;
            }
        } else if (arg4 == 2) {
            for (int var47 = 0; var47 < arg0; var47++) {
                for (int var48 = 0; var48 < arg2; var48++) {
                    if (var48 < var47 >> 1) {
                        arg6[arg5++] = arg1;
                    } else {
                        arg6[arg5++] = arg3;
                    }
                }
                arg5 += var10;
            }
        } else if (arg4 == 3) {
            for (int var45 = 0; var45 < arg0; var45++) {
                for (int var46 = arg2 - 1; var46 >= 0; var46--) {
                    if (var45 << 1 < var46) {
                        arg6[arg5++] = arg1;
                    } else {
                        arg6[arg5++] = arg3;
                    }
                }
                arg5 += var10;
            }
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(ILk;IIIIIII)V", line = 2533)
    private final void method21(int arg0, class21 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class20.method119(arg5, arg2, arg4, arg8, 0);
        int var11 = arg4 - 2;
        int var12 = arg5 + 1;
        int var13 = arg8 - 2;
        if (arg6 != 6943) {
            return;
        }
        int var10 = arg2 + 1;
        class20.method121(var12, var10, var11, var13, arg3);
        class20.method118(var12, var10, var11, arg7);
        class20.method116(var12, var10, var13, arg7);
        class20.method118(var12, var13 + var10 - 1, var11, arg0);
        class20.method116(var12 + var11 - 1, var10, var13, arg0);
        this.field45.method51(arg1, var11 / 2 + var12 + 1, var13 / 2 + (var10 - -5), 0);
        this.field45.method51(arg1, var11 / 2 + var12, var13 / 2 + var10 + 4, 16777215);
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "([BLjava/lang/String;Z)Z", line = 2599)
    private final boolean method22(byte[] arg0, String arg1, boolean arg2) {
        if (arg0 == null) {
            return false;
        }
        try {
            MessageDigest var4 = MessageDigest.getInstance("SHA");
            var4.reset();
            var4.update(arg0);
            if (!arg2) {
                this.field30 = -101;
            }
            byte[] var5 = var4.digest();
            if (arg1 == "main_file_cache.dat0") {
                if (var5[0] != -75 || var5[1] != 9 || var5[2] != 75 || var5[3] != -10 || var5[4] != -38 || var5[5] != 64 || var5[6] != -107 || var5[7] != -34 || var5[8] != 93 || var5[9] != -74 || var5[10] != 102 || var5[11] != 33 || var5[12] != 109 || var5[13] != -118 || var5[14] != 84 || var5[15] != 79 || var5[16] != 33 || var5[17] != 61 || var5[18] != 70 || var5[19] != -33) {
                    return false;
                }
            } else if (var5[0] != -41 || var5[1] != 31 || var5[2] != -75 || var5[3] != -74 || var5[4] != 71 || var5[5] != 73 || var5[6] != -3 || var5[7] != 121 || var5[8] != 51 || var5[9] != -3 || var5[10] != 1 || var5[11] != -10 || var5[12] != 56 || var5[13] != -82 || var5[14] != -4 || var5[15] != -69 || var5[16] != 77 || var5[17] != -66 || var5[18] != -44 || var5[19] != 124) {
                return false;
            }
            return true;
        } catch (Exception var7) {
            this.method198("sha", (byte) 125);
            return false;
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(BI)V", line = 2648)
    private final void method23(byte arg0, int arg1) {
        if (arg1 < class32.field379.length) {
            this.method4(arg0 ^ 0xFFFFFFA2, arg1);
            this.field49 = new class9(this.field27, this.field32);
            this.field49.method60();
            this.method11(0, 0, 0, this.field32, this.field27, class21.field253, class14.field188, 0, (byte) 25);
            class20.method119(0, 0, this.field27, this.field32, 0);
            class20.method119(1, 1, this.field27 - 2, this.field32 - 2, this.field67);
            class33.field390.method101(arg0 ^ 0xFFFFFF62);
        }
        if (arg0 != -30) {
            method12(32);
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "d", descriptor = "(B)Z", line = 2668)
    private final boolean method24(byte arg0) {
        if (class24.field290 == 0) {
            this.method13(-9641);
            class24.field290 = 1;
        }
        if (class24.field290 == 1) {
            class21.field263 = 25;
            boolean var2 = this.method9(class3.field84, "main_file_cache.idx0", arg0 ^ 0xFFFFFFA0);
            if (!var2) {
                return false;
            }
            class29.field353 = class17.field208;
            class17.field208 = null;
            if (class29.field353 == null) {
                throw new RuntimeException("T1");
            }
            class24.field290 = 2;
        }
        if (class24.field290 == 2) {
            class24.field290 = 10;
            class32.field379 = new class26[1];
        }
        if (arg0 != 13) {
            this.method23((byte) 76, 61);
        }
        if (class24.field290 == 10) {
            class21.field263 = 50;
            boolean var3 = this.method9(class21.field257, "main_file_cache.dat0", -84);
            if (!var3) {
                return false;
            }
            class32.field379[0] = class17.field208;
            class17.field208 = null;
            if (class32.field379[0] == null) {
                throw new RuntimeException("T2");
            }
            class24.field290 = 20;
        }
        if (class24.field290 != 20) {
            return false;
        }
        this.field47 = class2.method41(class29.field353, 84, class30.field366, class23.field280);
        this.field44 = class2.method42(class29.field353, class12.field182, -76, class23.field280);
        this.field45 = class14.method90(class25.field316, (byte) -90, class29.field353, class23.field280);
        this.field23 = new class1(11, true, this);
        this.field41 = new class1(12, true, this);
        this.field10 = new class1(14, true, this);
        this.field29 = new class1(17, true, this);
        this.field57 = new class1(19, true, this);
        this.field12 = new class1(22, true, this);
        this.field51 = new class1(26, true, this);
        this.field42 = new class1(30, true, this);
        class23.field282 = class8.field149;
        class21.field263 = 100;
        class30.method184(class23.field282, null, class21.field263, (byte) -44);
        this.method6(arg0 ^ 0xC);
        return true;
    }

    @OriginalMember(owner = "mapview!mapview", name = "e", descriptor = "(I)V", line = 2764)
    public final void method25(int arg0) {
        if (class28.field343) {
            class30.method182((byte) 103, class28.field348);
            class23.method151((byte) -128, class28.field348);
            this.method192((byte) -20);
            class17.method100(class28.field348, false);
            class14.method93(class28.field348, (byte) -126);
        }
        class21.method142(127);
        class25.method168(-94);
        if (!class26.field333) {
            return;
        }
        if (class26.field326[96]) {
            class28.field345 = (int) ((double) class28.field345 - 16.0D / this.field56);
            this.field46 = true;
        }
        if (class26.field326[97]) {
            class28.field345 = (int) (16.0D / this.field56 + (double) class28.field345);
            this.field46 = true;
        }
        if (class26.field326[98]) {
            this.field46 = true;
            class6.field141 = (int) ((double) class6.field141 - 16.0D / this.field56);
        }
        if (class26.field326[99]) {
            this.field46 = true;
            class6.field141 = (int) (16.0D / this.field56 + (double) class6.field141);
        }
        while (true) {
            do {
                if (!class17.method99(arg0 - 2762)) {
                    int var2 = class17.field216;
                    int var3 = class23.field277;
                    int var4 = class22.field272;
                    int var5 = class26.field329;
                    int var6 = class17.field209;
                    int var7 = class6.field104;
                    if (var2 == 1) {
                        this.field15 = class6.field141;
                        this.field33 = class28.field345;
                        this.field5 = var3;
                        this.field1 = var4;
                        if (class32.field379.length == 1) {
                            if (var3 > 170 && var3 < 220 && var4 > 471 && var4 < 503) {
                                this.field61 = 3.0D;
                                this.field5 = -1;
                            }
                            if (var3 > 230 && var3 < 280 && var4 > 471 && var4 < 503) {
                                this.field5 = -1;
                                this.field61 = 4.0D;
                            }
                            if (var3 > 290 && var3 < 340 && var4 > 471 && var4 < 503) {
                                this.field5 = -1;
                                this.field61 = 6.0D;
                            }
                            if (var3 > 350 && var3 < 400 && var4 > 471 && var4 < 503) {
                                this.field61 = 8.0D;
                                this.field5 = -1;
                            }
                        } else {
                            if (var3 > 170 && var3 < 220 && var4 > 451 && var4 < 483) {
                                this.field5 = -1;
                                this.field61 = 3.0D;
                            }
                            if (var3 > 230 && var3 < 280 && var4 > 451 && var4 < 483) {
                                this.field61 = 4.0D;
                                this.field5 = -1;
                            }
                            if (var3 > 290 && var3 < 340 && var4 > 451 && var4 < 483) {
                                this.field5 = -1;
                                this.field61 = 6.0D;
                            }
                            if (var3 > 350 && var3 < 400 && var4 > 451 && var4 < 483) {
                                this.field61 = 8.0D;
                                this.field5 = -1;
                            }
                            if (var3 > 170 && var3 < 400 && var4 > 483 && var4 < 503) {
                                this.method19(this.field59, 2);
                                this.method15((byte) -96);
                                this.method6(arg0 - 24);
                                this.field5 = -1;
                            }
                        }
                        this.field16 = false;
                        if (this.field17 < var3 && this.field38 + this.field19 < var4 && var3 < this.field17 + this.field43 && var4 < 503) {
                            this.field50 = !this.field50;
                            this.field5 = -1;
                        }
                        this.field46 = true;
                        if (var3 > this.field48 && this.field32 + this.field28 < var4 && var3 < this.field48 + this.field27 && var4 < 503) {
                            this.field34 = !this.field34;
                            this.field5 = -1;
                        }
                        if (this.field50) {
                            if (var3 > this.field17 && this.field38 < var4 && this.field43 + this.field17 > var3 && var4 < this.field38 + this.field19) {
                                this.field5 = -1;
                            }
                            if (var3 > this.field17 && this.field38 < var4 && var3 < this.field17 + this.field43 && this.field38 + 18 > var4 && this.field66 > 0) {
                                this.field66 -= 25;
                            }
                            if (this.field17 < var3 && this.field38 + this.field19 - 18 < var4 && this.field43 + this.field17 > var3 && this.field38 + this.field19 > var4 && this.field66 < 50) {
                                this.field66 += 25;
                            }
                        }
                        if (this.field34 && this.field48 < var3 && var4 > this.field28 && this.field48 + this.field27 > var3 && this.field28 + this.field32 > var4) {
                            this.field16 = true;
                            this.field5 = -1;
                            class28.field345 = (var3 - this.field48) * class21.field253 / this.field27;
                            class6.field141 = (var4 - this.field28) * class14.field188 / this.field32;
                        }
                    }
                    if (this.field50) {
                        this.field30 = -1;
                        if (var7 > this.field17 && var7 < this.field43 + this.field17) {
                            int var8 = this.field38 + 21 + 5;
                            int var9 = this.field65;
                            for (int var10 = 0; var10 < 25; var10++) {
                                if (this.field60.length > var9 && this.field60[var9].method132(class32.field380, arg0 ^ 0x5F1C)) {
                                    var9++;
                                    var10--;
                                } else {
                                    if (var6 >= var8 && var6 < var8 + 17) {
                                        if (var2 == 1) {
                                            this.field37 = var9;
                                            this.field54 = 50;
                                        }
                                        this.field30 = var9;
                                    }
                                    var8 += 17;
                                    var9++;
                                }
                            }
                        }
                        if (this.field63 != this.field30) {
                            this.field46 = true;
                            this.field63 = this.field30;
                        }
                    }
                    if (var5 == 1 && this.field34 && this.field16) {
                        this.field46 = true;
                        int var11 = var7;
                        if (this.field48 > var7) {
                            var11 = this.field48;
                        } else if (this.field48 + this.field27 < var7) {
                            var11 = this.field48 + this.field27;
                        }
                        class28.field345 = (var11 - this.field48) * class21.field253 / this.field27;
                        int var12 = var6;
                        if (var6 < this.field28) {
                            var12 = this.field28;
                        } else if (this.field32 + this.field28 < var6) {
                            var12 = this.field32 + this.field28;
                        }
                        class6.field141 = (var12 - this.field28) * class14.field188 / this.field32;
                    } else {
                        this.field16 = false;
                    }
                    if (var5 == 1 && this.field5 != -1) {
                        class28.field345 = (int) ((double) (this.field5 - var7) * 2.0D / this.field61) + this.field33;
                        class6.field141 = (int) ((double) (this.field1 - var6) * 2.0D / this.field61) + this.field15;
                        this.field46 = true;
                    }
                    if (this.field56 < this.field61) {
                        this.field46 = true;
                        this.field56 /= 30.0D;
                        if (this.field61 < this.field56) {
                            this.field56 = this.field61;
                        }
                    }
                    if (this.field56 > this.field61) {
                        this.field56 /= 30.0D;
                        this.field46 = true;
                        if (this.field56 < this.field61) {
                            this.field56 = this.field61;
                        }
                    }
                    int var13 = class28.field345 - (int) (635.0D / this.field56);
                    if (this.field65 < this.field66) {
                        this.field65++;
                        this.field46 = true;
                    }
                    int var14 = (int) (503.0D / this.field56) + class6.field141;
                    int var15 = (int) (635.0D / this.field56) + class28.field345;
                    if (var13 < 48) {
                        class28.field345 = (int) (635.0D / this.field56) + 48;
                    }
                    int var16 = class6.field141 - (int) (503.0D / this.field56);
                    if (arg0 != 25) {
                        return;
                    }
                    if (this.field65 > this.field66) {
                        this.field46 = true;
                        this.field65--;
                    }
                    if (this.field54 > 0) {
                        this.field46 = true;
                        this.field54--;
                    }
                    if (class21.field253 - 48 < var15) {
                        class28.field345 = class21.field253 - (int) (635.0D / this.field56) - 48;
                    }
                    if (var16 < 48) {
                        class6.field141 = (int) (503.0D / this.field56) + 48;
                    }
                    if (var14 > class14.field188 - 48) {
                        class6.field141 = class14.field188 - (int) (503.0D / this.field56) - 48;
                    }
                    return;
                }
                if (class29.field354 == 49) {
                    this.field61 = 3.0D;
                    this.field46 = true;
                }
                if (class29.field354 == 50) {
                    this.field61 = 4.0D;
                    this.field46 = true;
                }
                if (class29.field354 == 51) {
                    this.field61 = 6.0D;
                    this.field46 = true;
                }
                if (class29.field354 == 52) {
                    this.field61 = 8.0D;
                    this.field46 = true;
                }
                if (class29.field354 == 107 || class29.field354 == 75) {
                    this.field50 = !this.field50;
                    this.field46 = true;
                }
            } while (class29.field354 != 111 && class29.field354 != 79);
            this.field34 = !this.field34;
            this.field46 = true;
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(DDDB)I", line = 3149)
    private final int method26(double arg0, double arg1, double arg2, byte arg3) {
        double var8 = arg2;
        double var10 = arg2;
        double var12 = arg2;
        if (arg1 != 0.0D) {
            double var14;
            if (arg2 < 0.5D) {
                var14 = (arg1 + 1.0D) * arg2;
            } else {
                var14 = arg1 + arg2 - arg1 * arg2;
            }
            double var18 = arg0 + 0.3333333333333333D;
            double var20 = arg2 * 2.0D - var14;
            if (var18 > 1.0D) {
                var18--;
            }
            if (var18 * 6.0D < 1.0D) {
                var10 = (var14 - var20) * 6.0D * var18 + var20;
            } else if (var18 * 2.0D < 1.0D) {
                var10 = var14;
            } else if (var18 * 3.0D < 2.0D) {
                var10 = (0.6666666666666666D - var18) * (-var20 + var14) * 6.0D + var20;
            } else {
                var10 = var20;
            }
            if (arg0 * 6.0D < 1.0D) {
                var8 = (var14 - var20) * 6.0D * arg0 + var20;
            } else if (arg0 * 2.0D < 1.0D) {
                var8 = var14;
            } else if (arg0 * 3.0D < 2.0D) {
                var8 = (var14 - var20) * (0.6666666666666666D - arg0) * 6.0D + var20;
            } else {
                var8 = var20;
            }
            double var22 = arg0 - 0.3333333333333333D;
            if (var22 < 0.0D) {
                var22++;
            }
            if (var22 * 6.0D < 1.0D) {
                var12 = (var14 - var20) * 6.0D * var22 + var20;
            } else if (var22 * 2.0D < 1.0D) {
                var12 = var14;
            } else if (var22 * 3.0D < 2.0D) {
                var12 = (var14 - var20) * (-var22 + 0.6666666666666666D) * 6.0D + var20;
            } else {
                var12 = var20;
            }
        }
        int var24 = (int) (var8 * 256.0D);
        int var25 = (int) (var12 * 256.0D);
        int var26 = (int) (var10 * 256.0D);
        int var27 = (var26 << 16) + (var24 << 8) + var25;
        int var28 = 109 % ((arg3 + 25) / 35);
        return var27;
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(ILjava/lang/String;)[B", line = 3239)
    private final byte[] method27(int arg0, String arg1) throws IOException {
        File var3 = new File(arg1);
        if (!var3.exists()) {
            return null;
        }
        int var4 = (int) var3.length();
        if (arg0 != -7712) {
            return (byte[]) null;
        }
        byte[] var5 = new byte[var4];
        DataInputStream var6 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg1)));
        var6.readFully(var5, 0, var4);
        var6.close();
        return var5;
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "([B[[I[[BI)V", line = 3269)
    private final void method28(byte[] arg0, int[][] arg1, byte[][] arg2, int arg3) {
        int var5 = 0;
        if (arg3 != -64) {
            this.method23((byte) -18, 99);
        }
        while (true) {
            while (arg0.length > var5) {
                int var6 = (arg0[var5++] & 0xFF) * 64 - class33.field393;
                int var7 = (arg0[var5++] & 0xFF) * 64 - class11.field165;
                if (var6 > 0 && var7 > 0 && var6 + 64 < class21.field253 && var7 + 64 < class14.field188) {
                    for (int var8 = 0; var8 < 64; var8++) {
                        byte[] var9 = arg2[var8 + var6];
                        int[] var10 = arg1[var6 + var8];
                        int var11 = class14.field188 - var7 - 1;
                        for (int var12 = -64; var12 < 0; var12++) {
                            int var13 = arg0[var5++] & 0xFF;
                            if (var13 == 0) {
                                var10[var11--] = 0;
                            } else {
                                var9[var11] = arg0[var5++];
                                int var14 = this.field9[var13];
                                var10[var11--] = var14;
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
            return;
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "c", descriptor = "(I)V", line = 3339)
    public final void method29(int arg0) {
        class22.method147(70);
        class17.method100(class28.field348, false);
        class14.method93(class28.field348, (byte) -127);
        if (arg0 == -3540) {
            this.field60 = class28.method178(0);
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "d", descriptor = "(II)I", line = 3361)
    private final int method30(int arg0, int arg1) {
        arg1++;
        if (arg1 >= class32.field379.length) {
            arg1 = 0;
        }
        if (arg0 != 0) {
            this.field47 = null;
        }
        return arg1;
    }
}
