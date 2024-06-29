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
public class mapview extends class1 {

    @OriginalMember(owner = "mapview!mapview", name = "m", descriptor = "I")
    private int field252 = 5;

    @OriginalMember(owner = "mapview!mapview", name = "s", descriptor = "I")
    private int field258 = 7824964;

    @OriginalMember(owner = "mapview!mapview", name = "C", descriptor = "I")
    private int field268 = 170;

    @OriginalMember(owner = "mapview!mapview", name = "o", descriptor = "I")
    private int field254 = 23;

    @OriginalMember(owner = "mapview!mapview", name = "G", descriptor = "Z")
    private boolean field272 = false;

    @OriginalMember(owner = "mapview!mapview", name = "r", descriptor = "I")
    private int field257 = 6706483;

    @OriginalMember(owner = "mapview!mapview", name = "E", descriptor = "I")
    private int field270 = 10;

    @OriginalMember(owner = "mapview!mapview", name = "L", descriptor = "I")
    private int field277 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "k", descriptor = "I")
    private int field250 = 40;

    @OriginalMember(owner = "mapview!mapview", name = "p", descriptor = "Z")
    private boolean field255 = false;

    @OriginalMember(owner = "mapview!mapview", name = "T", descriptor = "I")
    private int field284 = 5;

    @OriginalMember(owner = "mapview!mapview", name = "U", descriptor = "I")
    private int field285 = 50;

    @OriginalMember(owner = "mapview!mapview", name = "K", descriptor = "I")
    private int field276 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "rb", descriptor = "D")
    private double field308 = 4.0D;

    @OriginalMember(owner = "mapview!mapview", name = "z", descriptor = "I")
    private int field265 = 5;

    @OriginalMember(owner = "mapview!mapview", name = "mb", descriptor = "I")
    private int field303 = -20;

    @OriginalMember(owner = "mapview!mapview", name = "Z", descriptor = "I")
    private int field290 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "x", descriptor = "I")
    private int field263 = 500;

    @OriginalMember(owner = "mapview!mapview", name = "bb", descriptor = "I")
    private int field292 = this.field285 + this.field270;

    @OriginalMember(owner = "mapview!mapview", name = "tb", descriptor = "D")
    private double field310 = 4.0D;

    @OriginalMember(owner = "mapview!mapview", name = "n", descriptor = "I")
    private int field253 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "hb", descriptor = "[I")
    private int[] field298 = new int[this.field263];

    @OriginalMember(owner = "mapview!mapview", name = "lb", descriptor = "[I")
    private int[] field302 = new int[this.field263];

    @OriginalMember(owner = "mapview!mapview", name = "sb", descriptor = "I")
    private int field309 = 11141120;

    @OriginalMember(owner = "mapview!mapview", name = "ub", descriptor = "Z")
    private boolean field311 = false;

    @OriginalMember(owner = "mapview!mapview", name = "kb", descriptor = "I")
    private int field301 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "v", descriptor = "I")
    private int field261 = 8943445;

    @OriginalMember(owner = "mapview!mapview", name = "B", descriptor = "[Ld;")
    private class7[] field267 = new class7[this.field263];

    @OriginalMember(owner = "mapview!mapview", name = "R", descriptor = "I")
    private int field282 = this.field311 ? 220 : 79;

    @OriginalMember(owner = "mapview!mapview", name = "A", descriptor = "Ld;")
    private class7 field266 = this.field311 ? class15.field148 : class15.field148;

    @OriginalMember(owner = "mapview!mapview", name = "vb", descriptor = "I")
    private int field312 = 30;

    @OriginalMember(owner = "mapview!mapview", name = "X", descriptor = "I")
    private int field288 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "wb", descriptor = "Ld;")
    private class7 field313 = this.field311 ? class15.field152 : class15.field152;

    @OriginalMember(owner = "mapview!mapview", name = "fb", descriptor = "Ld;")
    private class7 field296 = this.field311 ? class22.field217 : class22.field217;

    @OriginalMember(owner = "mapview!mapview", name = "Nb", descriptor = "I")
    private int field330 = this.field311 ? 252 : 111;

    @OriginalMember(owner = "mapview!mapview", name = "Pb", descriptor = "I")
    private int field332 = this.field311 ? 83 : 70;

    @OriginalMember(owner = "mapview!mapview", name = "D", descriptor = "Ld;")
    private class7 field269 = this.field311 ? class2.field10 : class2.field10;

    @OriginalMember(owner = "mapview!mapview", name = "Fb", descriptor = "I")
    private int field322 = this.field311 ? 76 : 75;

    @OriginalMember(owner = "mapview!mapview", name = "Eb", descriptor = "I")
    private int field321 = 471;

    @OriginalMember(owner = "mapview!mapview", name = "ab", descriptor = "I")
    private int field291 = -1;

    @OriginalMember(owner = "mapview!mapview", name = "l", descriptor = "Ld;")
    private class7 field251 = this.field311 ? class8.field101 : class8.field97;

    @OriginalMember(owner = "mapview!mapview", name = "Hb", descriptor = "I")
    private int field324 = 33;

    @OriginalMember(owner = "mapview!mapview", name = "Kb", descriptor = "Z")
    private boolean field327 = true;

    @OriginalMember(owner = "mapview!mapview", name = "Tb", descriptor = "Ld;")
    private class7 field336 = this.field311 ? class37.field510 : class37.field510;

    @OriginalMember(owner = "mapview!mapview", name = "Bb", descriptor = "Ld;")
    private class7 field318 = this.field311 ? class37.field508 : class37.field508;

    @OriginalMember(owner = "mapview!mapview", name = "Mb", descriptor = "I")
    private int field329 = 140;

    @OriginalMember(owner = "mapview!mapview", name = "Sb", descriptor = "I")
    private int field335 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "u", descriptor = "Ld;")
    private class7 field260 = this.field311 ? class20.field192 : class20.field192;

    @OriginalMember(owner = "mapview!mapview", name = "Gb", descriptor = "I")
    private int field323 = this.field311 ? 115 : 102;

    @OriginalMember(owner = "mapview!mapview", name = "cb", descriptor = "Ld;")
    private class7 field293 = this.field311 ? class32.field463 : class32.field463;

    @OriginalMember(owner = "mapview!mapview", name = "Lb", descriptor = "Ld;")
    private class7 field328 = this.field311 ? class14.field138 : class14.field138;

    @OriginalMember(owner = "mapview!mapview", name = "Db", descriptor = "[I")
    private int[] field320 = new int[this.field263];

    @OriginalMember(owner = "mapview!mapview", name = "Ub", descriptor = "Z")
    private boolean field337 = false;

    @OriginalMember(owner = "mapview!mapview", name = "nb", descriptor = "Ld;")
    private class7 field304 = this.field311 ? class29.field437 : class4.field34;

    @OriginalMember(owner = "mapview!mapview", name = "y", descriptor = "I")
    private int field264 = -1;

    @OriginalMember(owner = "mapview!mapview", name = "Rb", descriptor = "Ld;")
    private class7 field334 = this.field311 ? class16.field175 : class14.field143;

    @OriginalMember(owner = "mapview!mapview", name = "Ob", descriptor = "I")
    private int field331 = -1;

    @OriginalMember(owner = "mapview!mapview", name = "Ib", descriptor = "I")
    private int field325 = 8912896;

    @OriginalMember(owner = "mapview!mapview", name = "Vb", descriptor = "I")
    private int field338 = 450;

    @OriginalMember(owner = "mapview!mapview", name = "jb", descriptor = "I")
    private int field300 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "zb", descriptor = "I")
    private int field316 = 10027008;

    @OriginalMember(owner = "mapview!mapview", name = "O", descriptor = "I")
    private int field280 = this.field311 ? 108 : 107;

    @OriginalMember(owner = "mapview!mapview", name = "w", descriptor = "Ld;")
    public static class7 field262 = class37.method242("Jewellery", 1333943984);

    @OriginalMember(owner = "mapview!mapview", name = "V", descriptor = "I")
    private static int field286 = -1;

    @OriginalMember(owner = "mapview!mapview", name = "Ab", descriptor = "Ld;")
    public static class7 field317 = class37.method242("Potters Wheel", 1333943984);

    @OriginalMember(owner = "mapview!mapview", name = "yb", descriptor = "Ld;")
    public static class7 field315 = class37.method242("Pub)4Bar", 1333943984);

    @OriginalMember(owner = "mapview!mapview", name = "gb", descriptor = "Ld;")
    public static class7 field297 = class37.method242("Hair Dressers", 1333943984);

    @OriginalMember(owner = "mapview!mapview", name = "Qb", descriptor = "Ld;")
    public static class7 field333 = class37.method242("Helmet Shop", 1333943984);

    @OriginalMember(owner = "mapview!mapview", name = "Wb", descriptor = "Ld;")
    public static class7 field339 = class37.method242("POH Portal", 1333943984);

    @OriginalMember(owner = "mapview!mapview", name = "i", descriptor = "I")
    private int field248;

    @OriginalMember(owner = "mapview!mapview", name = "F", descriptor = "I")
    private int field271;

    @OriginalMember(owner = "mapview!mapview", name = "P", descriptor = "I")
    private int field281;

    @OriginalMember(owner = "mapview!mapview", name = "eb", descriptor = "I")
    private int field295;

    @OriginalMember(owner = "mapview!mapview", name = "ib", descriptor = "I")
    private int field299;

    @OriginalMember(owner = "mapview!mapview", name = "pb", descriptor = "I")
    private int field306;

    @OriginalMember(owner = "mapview!mapview", name = "qb", descriptor = "I")
    private int field307;

    @OriginalMember(owner = "mapview!mapview", name = "Cb", descriptor = "I")
    private int field319;

    @OriginalMember(owner = "mapview!mapview", name = "Jb", descriptor = "I")
    public static int field326;

    @OriginalMember(owner = "mapview!mapview", name = "db", descriptor = "Lj;")
    private class18 field294;

    @OriginalMember(owner = "mapview!mapview", name = "Y", descriptor = "Ln;")
    private class26 field289;

    @OriginalMember(owner = "mapview!mapview", name = "J", descriptor = "Ld;")
    private class7 field275;

    @OriginalMember(owner = "mapview!mapview", name = "j", descriptor = "Le;")
    private class9 field249;

    @OriginalMember(owner = "mapview!mapview", name = "q", descriptor = "Le;")
    private class9 field256;

    @OriginalMember(owner = "mapview!mapview", name = "I", descriptor = "Le;")
    private class9 field274;

    @OriginalMember(owner = "mapview!mapview", name = "M", descriptor = "Le;")
    private class9 field278;

    @OriginalMember(owner = "mapview!mapview", name = "N", descriptor = "Le;")
    private class9 field279;

    @OriginalMember(owner = "mapview!mapview", name = "S", descriptor = "Le;")
    private class9 field283;

    @OriginalMember(owner = "mapview!mapview", name = "ob", descriptor = "Le;")
    private class9 field305;

    @OriginalMember(owner = "mapview!mapview", name = "xb", descriptor = "Le;")
    private class9 field314;

    @OriginalMember(owner = "mapview!mapview", name = "Xb", descriptor = "Z")
    public static boolean field340;

    @OriginalMember(owner = "mapview!mapview", name = "W", descriptor = "[B")
    public static byte[] field287;

    @OriginalMember(owner = "mapview!mapview", name = "t", descriptor = "[Ld;")
    private class7[] field259;

    @OriginalMember(owner = "mapview!mapview", name = "H", descriptor = "[Ld;")
    private class7[] field273;

    @OriginalMember(owner = "mapview!mapview", name = "k", descriptor = "(I)V", line = 4)
    public static void method164(int arg0) {
        field339 = null;
        field317 = null;
        field315 = null;
        field262 = null;
        int var1 = -49 / ((56 - arg0) / 34);
        field333 = null;
        field297 = null;
        field287 = null;
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(Ld;IIIIIIII)V", line = 25)
    private final void method165(class7 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class17.method130(arg2, arg1, arg5, arg7, 0);
        int var12 = arg5 - 2;
        int var11 = arg2 + 1;
        if (arg6 != 16777215) {
            this.field334 = null;
        }
        int var10 = arg1 + 1;
        int var13 = arg7 - 2;
        class17.method123(var11, var10, var12, var13, arg8);
        class17.method122(var11, var10, var12, arg4);
        class17.method129(var11, var10, var13, arg4);
        class17.method122(var11, var10 + var13 - 1, var12, arg3);
        class17.method129(var12 + var11 - 1, var10, var13, arg3);
        this.field289.method189(arg0, var12 / 2 + var11 + 1, var13 / 2 + var10 + 1 + 4, 0);
        this.field289.method189(arg0, var12 / 2 + var11, var10 - -(var13 / 2) + 4, 16777215);
    }

    @OriginalMember(owner = "mapview!mapview", name = "l", descriptor = "(I)V", line = 46)
    private final void method166(int arg0) {
        if (arg0 != 5) {
            return;
        }
        class28.field397 = false;
        try {
            Graphics var2 = class20.field190.getGraphics();
            class16.field163.method115((byte) 21, var2, 0, 0);
        } catch (Exception var4) {
            class20.field190.repaint();
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "j", descriptor = "(I)V", line = 70)
    public final void method16(int arg0) {
        class31.method218((byte) -84);
        class36.method235(class20.field190, 128);
        class24.method155(class20.field190, -27731);
        class11.field109 = this.field313;
        boolean var2 = false;
        this.field273 = class37.method241(25578);
        this.field259 = class22.method149((byte) -107);
        boolean var3 = true;
        if (arg0 <= 119) {
            this.method5(-7);
        }
        if (var3) {
            byte var4 = 0;
            if (this.field259.length == 12) {
                byte var10002 = var4;
                int var5 = var4 + 1;
                this.field334 = this.field259[var10002];
                int var17 = var5;
                int var6 = var5 + 1;
                this.field251 = this.field259[var17];
                int var18 = var6;
                int var7 = var6 + 1;
                this.field304 = this.field259[var18];
                int var19 = var7;
                int var8 = var7 + 1;
                this.field269 = this.field259[var19];
                int var20 = var8;
                int var9 = var8 + 1;
                this.field296 = this.field259[var20];
                int var21 = var9;
                int var10 = var9 + 1;
                this.field313 = this.field259[var21];
                int var22 = var10;
                int var11 = var10 + 1;
                this.field318 = this.field259[var22];
                int var23 = var11;
                int var12 = var11 + 1;
                this.field328 = this.field259[var23];
                int var24 = var12;
                int var13 = var12 + 1;
                this.field260 = this.field259[var24];
                int var25 = var13;
                int var14 = var13 + 1;
                this.field293 = this.field259[var25];
                int var26 = var14;
                int var15 = var14 + 1;
                this.field336 = this.field259[var26];
                int var27 = var15;
                int var16 = var15 + 1;
                this.field266 = this.field259[var27];
                this.field282 = this.field334.method64(66, 0);
                this.field332 = this.field251.method64(60, 0);
                this.field322 = this.field304.method64(36, 0);
                this.field330 = this.method180(this.field282, (byte) 96);
                this.field323 = this.method180(this.field332, (byte) 96);
                this.field280 = this.method180(this.field322, (byte) 96);
            } else {
                class32.method226(new class7[] { class32.field460 }, true);
            }
        }
        this.field275 = method178((byte) 117, 50);
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "([BLjava/lang/String;I)V", line = 126)
    private final void method167(byte[] arg0, String arg1, int arg2) throws IOException {
        FileOutputStream var4 = new FileOutputStream(arg1);
        if (arg2 != 0) {
            this.field290 = 41;
        }
        var4.write(arg0, 0, arg0.length);
        var4.close();
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(II)V", line = 145)
    private final void method168(int arg0, int arg1) {
        if (arg1 == -31735) {
            this.method165(class15.method112(new class7[] { class24.field234, class37.field503[field286], class16.field160 }, (byte) -64), 483, 170, this.field257, this.field261, 230, 16777215, 18, arg0);
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "m", descriptor = "(I)V", line = 186)
    private final void method169(int arg0) {
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
                        class11.field113 = var8 + var6 + "/rsmap/";
                        return;
                    }
                }
            } catch (Exception var14) {
            }
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "init", descriptor = "()V", line = 250)
    public final void init() {
        if (this.method15(-59)) {
            this.method9(503, 32, 635, 126, class16.field170.method62(true, this).method67((byte) 43));
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "b", descriptor = "(I)V", line = 264)
    public final void method3(int arg0) {
        if (!class11.field114) {
            class11.field114 = this.method174((byte) 48);
            class2.method17(class11.field109, true, null, class15.field154);
            return;
        }
        if (this.field327) {
            class28.field397 = true;
            this.field327 = false;
            class17.method121();
            int var2 = class22.field215 - (int) (503.0D / this.field310);
            int var3 = (int) (503.0D / this.field310) + class22.field215;
            int var4 = class11.field119 + (int) (635.0D / this.field310);
            int var5 = class11.field119 - (int) (635.0D / this.field310);
            this.method176(635, 0, 0, var5, var2, var3, 503, var4, -83);
            if (this.field255) {
                this.field294.method134(this.field295, this.field281);
                class17.method120(this.field306 * var5 / class8.field102 + this.field295, this.field281 - -(this.field319 * var2 / class1.field4), (var4 - var5) * this.field306 / class8.field102, (var3 - var2) * this.field319 / class1.field4, 16711680, 128);
                class17.method130(this.field295 + this.field306 * var5 / class8.field102, this.field319 * var2 / class1.field4 + this.field281, (var4 - var5) * this.field306 / class8.field102, (var3 - var2) * this.field319 / class1.field4, 16711680);
                if (this.field288 > 0 && this.field288 % 10 < 5) {
                    for (int var6 = 0; var6 < class25.field237; var6++) {
                        if (class2.field15.field372[var6] == this.field331) {
                            int var7 = class2.field15.field377[var6] * this.field319 / class1.field4 + this.field281;
                            int var8 = class2.field15.field367[var6] * this.field306 / class8.field102 + this.field295;
                            class17.method127(var8, var7, 2, 16776960, 256);
                        }
                    }
                }
            }
            if (this.field272) {
                this.method165(this.field269, this.field324, this.field284, 5592405, 10066329, this.field329, 16777215, 18, 7829367);
                this.method165(class4.field54, this.field324 + 18, this.field284, 5592405, 10066329, this.field329, 16777215, this.field338 - 36, 7829367);
                this.method165(this.field296, this.field338 + this.field324 - 18, this.field284, 5592405, 10066329, this.field329, 16777215, 18, 7829367);
                int var9 = this.field253;
                int var10 = this.field324 + 21;
                for (int var11 = 0; var11 < 24; var11++) {
                    if (var9 < class36.field496.length && var9 < this.field273.length) {
                        if (this.field273[var9].method70((byte) 123, class24.field227)) {
                            var9++;
                            var11--;
                            continue;
                        }
                        class36.field496[var9].method132(this.field284 + 3, var10);
                        this.field289.method185(this.field273[var9], this.field284 + 21, var10 - -14, 0);
                        int var12 = 16777215;
                        if (this.field264 == var9) {
                            var12 = 12298922;
                        }
                        if (this.field288 > 0 && this.field288 % 10 < 5 && this.field331 == var9) {
                            var12 = 16776960;
                        }
                        this.field289.method185(this.field273[var9], this.field284 + 20, var10 + 13, var12);
                    }
                    var10 += 17;
                    var9++;
                }
            }
            if (class24.field230.length == 1) {
                this.method165(this.field334, this.field281 + this.field319, this.field295, this.field257, this.field261, this.field306, 16777215, 18, this.field258);
                this.method165(this.field304, this.field338 + this.field324, this.field284, this.field257, this.field261, this.field329, 16777215, 18, this.field258);
                if (this.field308 == 3.0D) {
                    this.method165(class31.field456, this.field321, this.field268, this.field325, this.field309, this.field285, 16777215, this.field312, this.field316);
                } else {
                    this.method165(class31.field456, this.field321, this.field268, this.field257, this.field261, this.field285, 16777215, this.field312, this.field258);
                }
                if (this.field308 == 4.0D) {
                    this.method165(class28.field399, this.field321, this.field292 + this.field268, this.field325, this.field309, this.field285, 16777215, this.field312, this.field316);
                } else {
                    this.method165(class28.field399, this.field321, this.field268 + this.field292, this.field257, this.field261, this.field285, 16777215, this.field312, this.field258);
                }
                if (this.field308 == 6.0D) {
                    this.method165(class35.field493, this.field321, this.field292 * 2 + this.field268, this.field325, this.field309, this.field285, 16777215, this.field312, this.field316);
                } else {
                    this.method165(class35.field493, this.field321, this.field292 * 2 + this.field268, this.field257, this.field261, this.field285, 16777215, this.field312, this.field258);
                }
                if (this.field308 == 8.0D) {
                    this.method165(class14.field140, this.field321, this.field292 * 3 + this.field268, this.field325, this.field309, this.field285, 16777215, this.field312, this.field316);
                } else {
                    this.method165(class14.field140, this.field321, this.field292 * 3 + this.field268, this.field257, this.field261, this.field285, 16777215, this.field312, this.field258);
                }
            } else {
                this.method165(this.field334, this.field281 + this.field319, this.field295, this.field257, this.field261, this.field306, 16777215, 18, this.field258);
                this.method165(this.field304, this.field338 + this.field324, this.field284, this.field257, this.field261, this.field329, 16777215, 18, this.field258);
                this.method168(this.field258, -31735);
                int var13 = this.field321 + this.field303;
                if (this.field308 == 3.0D) {
                    this.method165(class31.field456, var13, this.field268, this.field325, this.field309, this.field285, 16777215, this.field312, this.field316);
                } else {
                    this.method165(class31.field456, var13, this.field268, this.field257, this.field261, this.field285, 16777215, this.field312, this.field258);
                }
                if (this.field308 == 4.0D) {
                    this.method165(class28.field399, var13, this.field292 + this.field268, this.field325, this.field309, this.field285, 16777215, this.field312, this.field316);
                } else {
                    this.method165(class28.field399, var13, this.field292 + this.field268, this.field257, this.field261, this.field285, 16777215, this.field312, this.field258);
                }
                if (this.field308 == 6.0D) {
                    this.method165(class35.field493, var13, this.field292 * 2 + this.field268, this.field325, this.field309, this.field285, 16777215, this.field312, this.field316);
                } else {
                    this.method165(class35.field493, var13, this.field292 * 2 + this.field268, this.field257, this.field261, this.field285, 16777215, this.field312, this.field258);
                }
                if (this.field308 == 8.0D) {
                    this.method165(class14.field140, var13, this.field292 * 3 + this.field268, this.field325, this.field309, this.field285, 16777215, this.field312, this.field316);
                } else {
                    this.method165(class14.field140, var13, this.field292 * 3 + this.field268, this.field257, this.field261, this.field285, 16777215, this.field312, this.field258);
                }
            }
            if (class16.field161) {
                this.method165(this.field251, this.field252, this.field265, this.field257, this.field261, this.field250, 16777215, this.field254, this.field258);
                if (class3.field28) {
                    class17.method120(this.field265 + this.field250 + 2, this.field252, this.field271 + 10, this.field254, 8925952, 192);
                    class17.method130(this.field265 + this.field250 + 2, this.field252, this.field271 + 10, this.field254, 16777215);
                    if (class34.field482 > -1 && this.field275.method78((byte) 106) > 0) {
                        class7 var14 = this.field267[class34.field482].method57(100, 32, 47);
                        int var15 = this.field275.method78((byte) 106);
                        if (var15 > var14.method78((byte) 106)) {
                            var15 = var14.method78((byte) 106);
                        }
                        this.field289.method182(var14, this.field265 + this.field250 + 6, 20, 10066176, true);
                        this.field289.method182(var14.method53(75, 0, var15), this.field265 + this.field250 + 6, 20, 16777215, true);
                    } else {
                        this.field289.method182(this.field328, this.field265 + this.field250 + 6, 20, 16776960, true);
                    }
                }
            }
        }
        if (class28.field397) {
            this.method166(5);
        }
        if (arg0 < 11) {
            this.field327 = true;
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(Ld;Ljava/lang/String;I)Z", line = 466)
    private final boolean method170(class7 arg0, String arg1, int arg2) {
        byte[] var4 = null;
        if (!class35.field492) {
            if (class11.field113 != null) {
                try {
                    var4 = this.method177(class11.field113 + "/" + arg1, (byte) 65);
                    if (!this.method179(124, var4, arg1)) {
                        var4 = null;
                    }
                    if (var4 != null) {
                        class7.field86 = new class3(var4, false, true);
                        return true;
                    }
                } catch (IOException var11) {
                    var4 = null;
                }
            }
            class35.field492 = true;
        }
        if (var4 == null) {
            boolean var6 = this.method175(arg1, 22684, arg0);
            if (!var6) {
                return false;
            }
            var4 = class30.field445;
            class30.field445 = null;
        }
        if (var4 == null) {
            class35.field492 = false;
            return true;
        }
        if (class11.field113 != null && var4 != null) {
            try {
                this.method167(var4, class11.field113 + "/" + arg1, 0);
            } catch (IOException var10) {
            }
        }
        try {
            class7.field86 = new class3(var4, false, true);
            class35.field492 = false;
            return arg2 == 0 ? true : true;
        } catch (IOException var9) {
            throw class24.method158(var9, "monkey feet");
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "n", descriptor = "(I)V", line = 541)
    private final void method171(int arg0) {
        if (arg0 != 0) {
            return;
        }
        if (class24.field230.length == 1) {
            class31.field459 = 0;
        } else {
            if (field286 < 0) {
                class31.field459 = this.method172(class31.field459, -105);
            } else {
                class31.field459 = field286;
            }
            field286 = this.method172(class31.field459, -112);
        }
        this.method173(class31.field459, 119);
    }

    @OriginalMember(owner = "mapview!mapview", name = "b", descriptor = "(II)I", line = 569)
    private final int method172(int arg0, int arg1) {
        if (arg1 >= -94) {
            return -25;
        }
        arg0++;
        if (class24.field230.length <= arg0) {
            arg0 = 0;
        }
        return arg0;
    }

    @OriginalMember(owner = "mapview!mapview", name = "c", descriptor = "(II)V", line = 584)
    private final void method173(int arg0, int arg1) {
        if (arg0 < class24.field230.length) {
            class3 var3 = class24.field230[arg0];
            class37 var4 = new class37(var3.method31(class31.field453, class16.field168, 0));
            var4.method248(true);
            class37 var5 = new class37(var3.method31(class31.field453, class13.field132, 0));
            this.field290 = var5.method243((byte) -125);
            for (int var6 = 0; var6 < this.field290; var6++) {
                this.field267[var6] = var5.method248(true);
                this.field302[var6] = var5.method243((byte) -119);
                this.field298[var6] = var5.method243((byte) -117);
                this.field320[var6] = var5.method237(25);
                class7 var7 = this.field267[var6].method57(122, 32, 47);
                int var8 = this.field289.method188(var7);
                if (this.field271 < var8) {
                    this.field271 = var8;
                }
                int var9 = this.field289.method188(this.field328);
                if (var9 > this.field271) {
                    this.field271 = var9;
                }
            }
            class2.field15 = new class27();
            class2.field15.method201(class24.field230[arg0], -73);
            class11.field119 = class36.field499;
            class22.field215 = class27.field380;
            this.field319 = 180;
            this.field306 = class8.field102 * this.field319 / class1.field4;
            this.field295 = 635 - this.field306 - 5;
            this.field281 = 503 - this.field319 - 20;
            this.field294 = new class18(this.field306, this.field319);
            this.field294.method135();
            this.method176(this.field306, 0, 0, 0, 0, class1.field4, this.field319, class8.field102, -103);
            class17.method130(0, 0, this.field306, this.field319, 0);
            class17.method130(1, 1, this.field306 - 2, this.field319 - 2, this.field261);
            class16.field163.method146(0);
        }
        int var10 = -48 / ((38 - arg1) / 49);
    }

    @OriginalMember(owner = "mapview!mapview", name = "b", descriptor = "(B)Z", line = 656)
    private final boolean method174(byte arg0) {
        if (class15.field150 == 0) {
            this.method169(0);
            class15.field150 = 1;
        }
        if (class15.field150 == 1) {
            class15.field154 = 25;
            boolean var2 = this.method170(this.field293, "main_file_cache.idx0", 0);
            if (!var2) {
                return false;
            }
            class4.field40 = class7.field86;
            class7.field86 = null;
            if (class4.field40 == null) {
                throw new RuntimeException("T1");
            }
            class15.field150 = 2;
        }
        if (class15.field150 == 2) {
            class15.field150 = 10;
            class24.field230 = new class3[1];
        }
        if (arg0 <= 24) {
            return true;
        }
        if (class15.field150 == 10) {
            class15.field154 = 50;
            boolean var3 = this.method170(this.field336, "main_file_cache.dat0", 0);
            if (!var3) {
                return false;
            }
            class24.field230[0] = class7.field86;
            class7.field86 = null;
            if (class24.field230[0] == null) {
                throw new RuntimeException("T2");
            }
            class15.field150 = 20;
        }
        if (class15.field150 != 20) {
            return false;
        }
        class32.field464 = class31.method219(class4.field40, class4.field54, class2.field11, false);
        class36.field496 = class7.method66(class4.field54, class32.field470, class4.field40, 12127);
        this.field289 = class2.method19((byte) -51, class4.field40, class4.field54, class16.field164);
        this.field256 = new class9(11, true, this);
        this.field249 = new class9(12, true, this);
        this.field278 = new class9(14, true, this);
        this.field274 = new class9(17, true, this);
        this.field305 = new class9(19, true, this);
        this.field279 = new class9(22, true, this);
        this.field283 = new class9(26, true, this);
        this.field314 = new class9(30, true, this);
        class11.field109 = this.field318;
        class15.field154 = 100;
        class2.method17(class11.field109, true, null, class15.field154);
        this.field250 = this.field289.method188(this.field251) + 20;
        this.method171(0);
        class7[] var4 = this.field273;
        for (int var5 = 0; var5 < var4.length; var5++) {
            class7 var6 = var4[var5];
            int var7 = this.field289.method188(var6);
            if (var7 > this.field307) {
                this.field307 = var7;
            }
        }
        this.field329 = this.field307 + 16 + 18;
        if (this.field329 > 140) {
            int var8 = this.field295 - this.field329 - this.field284;
            this.field270 = var8 / 25;
            int var9 = var8 - this.field270 * 25;
            this.field268 = var9 / 2 + this.field284 + this.field270 + this.field329;
            this.field285 = this.field270 * 5;
            this.field292 = this.field285 + this.field270;
        }
        return true;
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(Ljava/lang/String;ILd;)Z", line = 792)
    private final boolean method175(String arg0, int arg1, class7 arg2) {
        try {
            if (class27.field381 == null) {
                class11.field109 = class15.method112(new class7[] { this.field260, class14.field141, arg2 }, (byte) -64);
                String var4;
                if (arg0 == "main_file_cache.dat0") {
                    var4 = "worldmap.main.js5?crc=-1903504335";
                } else if (arg0 == "main_file_cache.dat1") {
                    var4 = "worldmap.dungeon.js5?crc=-1465149862";
                } else if (arg0 == "main_file_cache.dat2") {
                    var4 = "worldmap.extra.js5?crc=1961772261";
                } else {
                    var4 = "mapview.sprites.js5?crc=1721917436";
                }
                class27.field381 = new DataInputStream((new URL(this.getCodeBase(), var4)).openStream());
                int var5;
                if (arg0 == "main_file_cache.dat0") {
                    var5 = 403858;
                } else if (arg0 == "main_file_cache.dat1") {
                    var5 = 146723;
                } else if (arg0 == "main_file_cache.dat2") {
                    var5 = 112887;
                } else {
                    var5 = 8276;
                }
                class2.field14 = 0;
                class30.field445 = new byte[var5];
                class22.field218 = 0;
            }
            int var6 = class2.field14;
            int var7 = class30.field445.length;
            if (arg1 != 22684) {
                return false;
            } else if (var7 > var6) {
                class22.field218++;
                if (class22.field218 >= 1500) {
                    throw new IOException();
                }
                DataInputStream var8 = class27.field381;
                int var9 = var8.available();
                if (var9 < 0) {
                    throw new EOFException();
                } else if (var9 == 0) {
                    return false;
                } else {
                    if (var7 - var6 < var9) {
                        var9 = var7 - var6;
                    }
                    int var10 = var8.read(class30.field445, var6, var9);
                    if (var10 < 0) {
                        throw new EOFException();
                    } else if (var10 == 0) {
                        return false;
                    } else {
                        class22.field218 = 0;
                        int var11 = var6 + var10;
                        int var12 = var11 * 100 / var7;
                        class11.field109 = class15.method112(new class7[] { class21.field213, arg2, class2.field22, class27.method206(64, var12), class16.field165 }, (byte) -64);
                        class2.field14 = var11;
                        return false;
                    }
                }
            } else {
                class27.field381.close();
                class27.field381 = null;
                if (!this.method179(arg1 ^ 0x58BA, class30.field445, arg0)) {
                    this.method10((byte) -42, new String(this.field266.method74((byte) 75)));
                    class30.field445 = null;
                }
                return true;
            }
        } catch (IOException var16) {
            try {
                class27.field381.close();
            } catch (Exception var15) {
            }
            class30.field445 = null;
            class27.field381 = null;
            this.method10((byte) 120, new String(this.field266.method74((byte) 75)));
            return true;
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(IIIIIIIII)V", line = 908)
    private final void method176(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class2.field15.method191(arg5, -16493, arg1, arg3, arg6, arg4, arg7, arg2, arg0);
        if (arg8 > -3 || arg7 - arg3 > -arg2 + arg0) {
            return;
        }
        class2.field15.method190(arg2, arg6, this.field310, arg7, -117, arg5, arg3, arg1, arg4, arg0);
        class2.field15.method199(arg7, arg6, arg2, arg4, arg5, arg3, (byte) 83, arg1, arg0);
        class2.field15.method202(120, arg4, arg2, arg3, arg1, this.field331, arg0, arg5, arg7, this.field288, arg6);
        if (this.field310 == this.field308 && class8.field93) {
            for (int var10 = 0; var10 < this.field290; var10++) {
                int var11 = this.field302[var10];
                int var12 = this.field298[var10];
                int var13 = this.field320[var10];
                int var14 = class31.field451 + class1.field4 - var12;
                int var15 = var11 - class27.field379;
                int var16 = (arg0 - arg2) * (-arg3 + var15) / (arg7 - arg3) + arg2;
                class9 var17 = null;
                int var18 = 16777215;
                if (var13 == 0) {
                    if (this.field310 == 3.0D) {
                        var17 = this.field256;
                    }
                    if (this.field310 == 4.0D) {
                        var17 = this.field249;
                    }
                    if (this.field310 == 6.0D) {
                        var17 = this.field278;
                    }
                    if (this.field310 == 8.0D) {
                        var17 = this.field274;
                    }
                }
                if (var13 == 1) {
                    if (this.field310 == 3.0D) {
                        var17 = this.field278;
                    }
                    if (this.field310 == 4.0D) {
                        var17 = this.field274;
                    }
                    if (this.field310 == 6.0D) {
                        var17 = this.field305;
                    }
                    if (this.field310 == 8.0D) {
                        var17 = this.field279;
                    }
                }
                int var19 = (arg6 - arg1) * (-arg4 + var14) / (arg5 - arg4) + arg1;
                if (var13 == 2) {
                    if (this.field310 == 3.0D) {
                        var17 = this.field305;
                    }
                    if (this.field310 == 4.0D) {
                        var17 = this.field279;
                    }
                    if (this.field310 == 6.0D) {
                        var17 = this.field283;
                    }
                    var18 = 16755200;
                    if (this.field310 == 8.0D) {
                        var17 = this.field314;
                    }
                }
                if (var17 != null) {
                    class7 var20 = this.field267[var10];
                    int var21 = 1;
                    for (int var22 = 0; var20.method78((byte) 106) > var22; var22++) {
                        if (var20.method64(49, var22) == 47) {
                            var21++;
                        }
                    }
                    int var23 = var19 - var17.method84() * (var21 - 1) / 2;
                    int var24 = var23 + var17.method85() / 2;
                    while (true) {
                        int var25 = var20.method55((byte) 9, 47);
                        if (var25 == -1) {
                            var17.method86(var20, var16, var24, var18, true);
                            break;
                        }
                        class7 var26 = var20.method53(101, 0, var25);
                        var17.method86(var26, var16, var24, var18, true);
                        var24 += var17.method84();
                        var20 = var20.method61(-17333, var25 + 1);
                    }
                }
            }
        }
        if (!class35.field490) {
            return;
        }
        for (int var27 = class27.field379 / 64; var27 < (class8.field102 + class27.field379) / 64; var27++) {
            for (int var28 = class31.field451 / 64; var28 < (class31.field451 + class1.field4) / 64; var28++) {
                int var29 = var27 * 64;
                int var30 = var28 * 64;
                int var31 = var29 - class27.field379;
                int var32 = class31.field451 + class1.field4 - var30;
                int var33 = arg2 + (arg0 - arg2) * (-arg3 + var31) / (arg7 - arg3);
                int var34 = (var32 - arg4 - 64) * (-arg1 + arg6) / (arg5 - arg4) + arg1;
                int var35 = (arg0 - arg2) * (var31 + 64 + -arg3) / (arg7 - arg3) + arg2;
                int var36 = (arg6 - arg1) * (-arg4 + var32) / (arg5 - arg4) + arg1;
                class17.method130(var33, var34, var35 - var33, -var34 + var36, 16777215);
                this.field289.method184(class15.method112(new class7[] { class27.method206(64, var27), class31.field452, class27.method206(64, var28) }, (byte) -64), var35 - 5, var36 + -5, 16777215);
                if (var27 == 33 && var28 >= 71 && var28 <= 73) {
                    this.field289.method189(class24.field228, (var35 + var33) / 2, (var34 + var36) / 2, 16711680);
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(Ljava/lang/String;B)[B", line = 1099)
    private final byte[] method177(String arg0, byte arg1) throws IOException {
        if (arg1 <= 58) {
            this.field331 = -46;
        }
        File var3 = new File(arg0);
        if (!var3.exists()) {
            return null;
        }
        int var4 = (int) var3.length();
        byte[] var5 = new byte[var4];
        DataInputStream var6 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg0)));
        var6.readFully(var5, 0, var4);
        var6.close();
        return var5;
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(I)V", line = 1126)
    public final void method1(int arg0) {
        method164(107);
        class14.method108(94);
        class7.method54(arg0 ^ 0x4B89);
        class31.method220(55);
        class20.method139(-35);
        class37.method247(255);
        class1.method11((byte) 115);
        class29.method209(arg0 ^ arg0);
        class21.method144(2853);
        class3.method23(0);
        class27.method196(-29956);
        class26.method183();
        class9.method83();
        class22.method150((byte) -70);
        class24.method154((byte) 85);
        class4.method29(1);
        class34.method227(arg0 ^ 0x4BC1);
        class17.method119();
        class32.method221(-4097);
        class35.method234(-24582);
        class15.method111(500);
        class30.method212(false);
        class8.method81((byte) 74);
        class11.method93(true);
        class25.method161((byte) 34);
        class2.method20((byte) 121);
        class36.method236((byte) 57);
        class13.method102(115);
        class16.method117(115);
        class6.method52();
        class28.method207((byte) -35);
        this.field313 = null;
        this.field294 = null;
        this.field249 = null;
        this.field314 = null;
        this.field302 = null;
        this.field274 = null;
        this.field267 = null;
        this.field256 = null;
        this.field336 = null;
        this.field275 = null;
        this.field304 = null;
        this.field273 = null;
        this.field283 = null;
        this.field266 = null;
        this.field279 = null;
        this.field278 = null;
        this.field293 = null;
        this.field318 = null;
        this.field328 = null;
        this.field298 = null;
        this.field305 = null;
        this.field296 = null;
        this.field260 = null;
        this.field269 = null;
        this.field251 = null;
        this.field334 = null;
        this.field289 = null;
        this.field320 = null;
        this.field259 = null;
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(BI)Ld;", line = 1193)
    private static final class7 method178(byte arg0, int arg1) {
        class7 var2 = new class7();
        if (arg0 < 52) {
            field262 = null;
        }
        var2.field90 = 0;
        var2.field79 = new byte[arg1];
        return var2;
    }

    @OriginalMember(owner = "mapview!mapview", name = "c", descriptor = "(I)V", line = 1207)
    public final void method5(int arg0) {
        class34.method230(arg0 - 26786);
        class21.method147(94);
        try {
            this.field302 = null;
            this.field289 = null;
            this.field320 = null;
            this.field294 = null;
            this.field298 = null;
            this.field267 = null;
            class2.field15 = null;
            this.field273 = null;
            System.gc();
        } catch (Throwable var3) {
        }
        if (arg0 != -1) {
            this.method171(-10);
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "f", descriptor = "(I)V", line = 1256)
    public final void method12(int arg0) {
        if (class28.field417) {
            class21.method142((byte) 110, class20.field190);
            class24.method160(class20.field190, 0);
            this.method2(true);
            class36.method235(class20.field190, 128);
            class24.method155(class20.field190, -27731);
        }
        class8.method80((byte) -79);
        class30.method213(true);
        if (!class11.field114) {
            return;
        }
        if (class21.field205[96]) {
            class27.field365 = -1;
            this.field327 = true;
            class11.field119 = (int) ((double) class11.field119 - 16.0D / this.field310);
        }
        if (class21.field205[97]) {
            class27.field365 = -1;
            this.field327 = true;
            class11.field119 = (int) (16.0D / this.field310 + (double) class11.field119);
        }
        if (class21.field205[98]) {
            this.field327 = true;
            class27.field365 = -1;
            class22.field215 = (int) ((double) class22.field215 - 16.0D / this.field310);
        }
        if (class21.field205[99]) {
            class22.field215 = (int) (16.0D / this.field310 + (double) class22.field215);
            this.field327 = true;
            class27.field365 = -1;
        }
        while (true) {
            while (true) {
                while (class24.method153((byte) 121)) {
                    if (!class16.field161 || !class3.field28) {
                        if (field326 == this.field323 || field326 == this.field332) {
                            class3.field28 = true;
                            this.field327 = true;
                        }
                        if (field326 == 49) {
                            this.field327 = true;
                            this.field308 = 3.0D;
                        }
                        if (field326 == 50) {
                            this.field327 = true;
                            this.field308 = 4.0D;
                        }
                        if (field326 == 51) {
                            this.field327 = true;
                            this.field308 = 6.0D;
                        }
                        if (field326 == 52) {
                            this.field327 = true;
                            this.field308 = 8.0D;
                        }
                        if (field326 == this.field280 || field326 == this.field322) {
                            this.field327 = true;
                            this.field272 = !this.field272;
                        }
                        if (field326 == this.field330 || field326 == this.field282) {
                            this.field327 = true;
                            this.field255 = !this.field255;
                        }
                    } else if (class29.field429 == 0) {
                        class3.field28 = false;
                        this.field327 = true;
                        this.field275.method60(-1, 0);
                        class34.field482 = -1;
                    } else if (class29.field429 == 84) {
                        this.field299 = class22.field215 << 16;
                        this.field248 = class11.field119 << 16;
                        class27.field365 = class34.field482;
                        class3.field28 = false;
                        this.field275.method60(-1, 0);
                        class34.field482 = -1;
                        this.field327 = true;
                    } else {
                        boolean var2 = false;
                        if (class29.field429 == 85) {
                            if (this.field275.method78((byte) 106) > 0) {
                                this.field275.method60(-1, this.field275.method78((byte) 106) - 1);
                                this.field327 = true;
                                if (this.field275.method78((byte) 106) == 0) {
                                    class34.field482 = -1;
                                } else {
                                    var2 = true;
                                }
                            }
                        } else if (field326 != -1 && this.field275.method78((byte) 106) <= class30.field443) {
                            this.field275.method65(field326, (byte) 99);
                            this.field327 = true;
                        }
                        if (this.field275.method78((byte) 106) > 0) {
                            for (int var3 = 0; var3 < this.field290; var3++) {
                                if (this.field267[var3].method78((byte) 106) >= this.field275.method78((byte) 106)) {
                                    class7 var4 = this.field275.method73((byte) 12);
                                    class7 var5 = this.field267[var3].method57(107, 32, 47).method53(94, 0, this.field275.method78((byte) 106)).method73((byte) 12);
                                    if (var4.method72(false, var5) == 0) {
                                        this.field327 = true;
                                        class34.field482 = var3;
                                        var2 = true;
                                        break;
                                    }
                                }
                            }
                            if (!var2) {
                                this.field275.method60(-1, this.field275.method78((byte) 106) - 1);
                            }
                        }
                    }
                }
                int var6 = class13.field124;
                int var7 = class14.field144;
                int var8 = class24.field232;
                int var9 = class27.field376;
                int var10 = class34.field483;
                int var11 = 14 / ((arg0 - 22) / 55);
                int var12 = class28.field416;
                if (var8 == 1) {
                    this.field276 = var6;
                    this.field335 = class11.field119;
                    this.field300 = class22.field215;
                    this.field277 = var9;
                    if (class24.field230.length == 1) {
                        if (this.field268 < var6 && var6 < this.field285 + this.field268 && var9 > this.field321 && var9 < this.field321 + this.field312) {
                            this.field276 = -1;
                            this.field308 = 3.0D;
                        }
                        if (var6 > this.field292 + this.field268 && var6 < this.field292 + this.field285 + this.field268 && var9 > this.field321 && this.field321 + this.field312 > var9) {
                            this.field308 = 4.0D;
                            this.field276 = -1;
                        }
                        if (var6 > this.field292 * 2 + this.field268 && this.field292 * 2 + this.field268 + this.field285 > var6 && var9 > this.field321 && var9 < this.field321 + this.field312) {
                            this.field276 = -1;
                            this.field308 = 6.0D;
                        }
                        if (var6 > this.field292 * 3 + this.field268 && var6 < this.field292 * 3 + this.field285 + this.field268 && var9 > this.field321 && this.field321 + this.field312 > var9) {
                            this.field276 = -1;
                            this.field308 = 8.0D;
                        }
                    } else {
                        if (this.field268 < var6 && this.field285 + this.field268 > var6 && this.field321 < var9 && this.field321 + this.field312 + this.field303 > var9) {
                            this.field308 = 3.0D;
                            this.field276 = -1;
                        }
                        if (this.field292 + this.field268 < var6 && this.field292 + this.field285 + this.field268 > var6 && this.field321 < var9 && this.field321 + this.field303 + this.field312 > var9) {
                            this.field308 = 4.0D;
                            this.field276 = -1;
                        }
                        if (this.field292 * 2 + this.field268 < var6 && var6 < this.field292 * 2 + this.field268 + this.field285 && this.field321 < var9 && var9 < this.field321 + this.field312 + this.field303) {
                            this.field308 = 6.0D;
                            this.field276 = -1;
                        }
                        if (this.field292 * 3 + this.field268 < var6 && this.field292 * 3 + this.field268 + this.field285 > var6 && var9 > this.field321 && var9 < this.field321 + this.field312 + this.field303) {
                            this.field308 = 8.0D;
                            this.field276 = -1;
                        }
                        if (var6 > 170 && var6 < 400 && var9 > 483 && var9 < 503) {
                            this.method168(this.field316, -31735);
                            this.method166(5);
                            this.method171(0);
                            this.field276 = -1;
                        }
                    }
                    this.field337 = false;
                    if (this.field284 < var6 && var9 > this.field338 + this.field324 && this.field329 + this.field284 > var6 && var9 < 503) {
                        this.field276 = -1;
                        this.field272 = !this.field272;
                    }
                    this.field327 = true;
                    if (var6 > this.field295 && var9 > this.field319 + this.field281 && var6 < this.field306 + this.field295 && var9 < 503) {
                        this.field255 = !this.field255;
                        this.field276 = -1;
                    }
                    if (this.field272) {
                        if (var6 > this.field284 && this.field324 < var9 && var6 < this.field329 + this.field284 && var9 < this.field324 + 18 && this.field301 > 0) {
                            this.field301 -= 24;
                        }
                        if (this.field284 < var6 && this.field324 < var9 && var6 < this.field329 + this.field284 && this.field338 + this.field324 > var9) {
                            this.field276 = -1;
                        }
                        if (this.field284 < var6 && var9 > this.field338 + this.field324 - 18 && var6 < this.field284 + this.field329 && var9 < this.field324 + this.field338 && this.field301 < 48) {
                            this.field301 += 24;
                        }
                    }
                    if (this.field255 && var6 > this.field295 && this.field281 < var9 && var6 < this.field295 + this.field306 && this.field319 + this.field281 > var9) {
                        this.field337 = true;
                        class11.field119 = (var6 - this.field295) * class8.field102 / this.field306;
                        class22.field215 = (var9 - this.field281) * class1.field4 / this.field319;
                        this.field276 = -1;
                    }
                    if (class16.field161 && !class3.field28 && !this.field337 && var6 > this.field265 && var9 > this.field252 && var6 < this.field265 + this.field250 && var9 < this.field252 + this.field254) {
                        class3.field28 = true;
                    }
                }
                if (this.field272) {
                    this.field264 = -1;
                    if (this.field284 < var7 && this.field329 + this.field284 > var7) {
                        int var13 = this.field324 + 21 + 5;
                        int var14 = this.field253;
                        for (int var15 = 0; var15 < 24; var15++) {
                            if (this.field273.length > var14 && this.field273[var14].method70((byte) 107, class24.field227)) {
                                var15--;
                                var14++;
                            } else {
                                if (var13 <= var12 && var12 < var13 + 17) {
                                    this.field264 = var14;
                                    if (var8 == 1) {
                                        this.field331 = var14;
                                        this.field288 = 50;
                                    }
                                }
                                var14++;
                                var13 += 17;
                            }
                        }
                    }
                    if (this.field291 != this.field264) {
                        this.field291 = this.field264;
                        this.field327 = true;
                    }
                }
                if (var10 == 1 && this.field255 && this.field337) {
                    class27.field365 = -1;
                    int var16 = var7;
                    this.field327 = true;
                    if (var7 < this.field295) {
                        var16 = this.field295;
                    } else if (var7 > this.field306 + this.field295) {
                        var16 = this.field306 + this.field295;
                    }
                    int var17 = var12;
                    if (var12 < this.field281) {
                        var17 = this.field281;
                    } else if (this.field319 + this.field281 < var12) {
                        var17 = this.field281 + this.field319;
                    }
                    class11.field119 = (var16 - this.field295) * class8.field102 / this.field306;
                    class22.field215 = (var17 - this.field281) * class1.field4 / this.field319;
                } else {
                    this.field337 = false;
                }
                if (var10 == 1 && this.field276 != -1) {
                    class11.field119 = this.field335 + (int) ((double) (this.field276 - var7) * 2.0D / this.field308);
                    this.field327 = true;
                    class27.field365 = -1;
                    class22.field215 = (int) ((double) (this.field277 - var12) * 2.0D / this.field308) + this.field300;
                }
                if (this.field310 < this.field308) {
                    this.field310 += this.field310 / 30.0D;
                    this.field327 = true;
                    if (this.field308 < this.field310) {
                        this.field310 = this.field308;
                    }
                }
                if (this.field310 > this.field308) {
                    this.field327 = true;
                    this.field310 -= this.field310 / 30.0D;
                    if (this.field310 < this.field308) {
                        this.field310 = this.field308;
                    }
                }
                if (this.field301 > this.field253) {
                    this.field253++;
                    this.field327 = true;
                }
                if (this.field253 > this.field301) {
                    this.field253--;
                    this.field327 = true;
                }
                if (this.field288 > 0) {
                    this.field288--;
                    this.field327 = true;
                }
                if (class27.field365 >= 0) {
                    class22.field214 = this.field302[class27.field365] - class27.field379;
                    class20.field196 = class31.field451 + class1.field4 - this.field298[class27.field365];
                    this.field327 = true;
                    byte var18 = 4;
                    int var19 = class22.field214 - (int) (635.0D / this.field310);
                    int var20 = (int) (635.0D / this.field310) + class22.field214;
                    int var21 = class20.field196 - (int) (503.0D / this.field310);
                    if (var19 < 48) {
                        class22.field214 = (int) (635.0D / this.field310) + 48;
                    }
                    int var22 = (int) (503.0D / this.field310) + class20.field196;
                    if (var20 > class8.field102 - 48) {
                        class22.field214 = class8.field102 - (int) (635.0D / this.field310) - 48;
                    }
                    class22.field214 <<= 0x10;
                    int var23 = class22.field214 - this.field248;
                    if (var21 < 48) {
                        class20.field196 = (int) (503.0D / this.field310) + 48;
                    }
                    if (var22 > class1.field4 - 48) {
                        class20.field196 = class1.field4 - (int) (503.0D / this.field310) - 48;
                    }
                    class20.field196 <<= 0x10;
                    int var24 = class20.field196 - this.field299;
                    if (var23 >> var18 == 0 && var24 >> var18 == 0) {
                        class27.field365 = -1;
                    } else {
                        this.field299 += var24 >> var18;
                        class22.field215 = this.field299 >> 16;
                        this.field248 += var23 >> var18;
                        class11.field119 = this.field248 >> 16;
                    }
                }
                int var25 = class11.field119 - (int) (635.0D / this.field310);
                int var26 = class22.field215 - (int) (503.0D / this.field310);
                int var27 = (int) (635.0D / this.field310) + class11.field119;
                int var28 = (int) (503.0D / this.field310) + class22.field215;
                if (var26 < 48) {
                    class22.field215 = (int) (503.0D / this.field310) + 48;
                }
                if (var25 < 48) {
                    class11.field119 = (int) (635.0D / this.field310) + 48;
                }
                if (var28 > class1.field4 - 48) {
                    class22.field215 = class1.field4 - (int) (503.0D / this.field310) - 48;
                }
                if (class8.field102 - 48 < var27) {
                    class11.field119 = class8.field102 - (int) (635.0D / this.field310) - 48;
                }
                return;
            }
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(I[BLjava/lang/String;)Z", line = 1944)
    private final boolean method179(int arg0, byte[] arg1, String arg2) {
        if (arg1 == null) {
            return false;
        }
        try {
            if (arg0 < 28) {
                this.field298 = null;
            }
            MessageDigest var4 = MessageDigest.getInstance("SHA");
            var4.reset();
            var4.update(arg1);
            byte[] var5 = var4.digest();
            if (arg2 == "main_file_cache.dat0") {
                if (var5[0] != -26 || var5[1] != 32 || var5[2] != -72 || var5[3] != -91 || var5[4] != 118 || var5[5] != 91 || var5[6] != 127 || var5[7] != -58 || var5[8] != 31 || var5[9] != -63 || var5[10] != 72 || var5[11] != -104 || var5[12] != -74 || var5[13] != -37 || var5[14] != -81 || var5[15] != 77 || var5[16] != -76 || var5[17] != -119 || var5[18] != 63 || var5[19] != -31) {
                    return false;
                }
            } else if (var5[0] != -41 || var5[1] != -112 || var5[2] != 45 || var5[3] != 33 || var5[4] != -73 || var5[5] != 104 || var5[6] != -20 || var5[7] != 120 || var5[8] != -119 || var5[9] != 91 || var5[10] != -41 || var5[11] != 121 || var5[12] != 20 || var5[13] != -38 || var5[14] != -95 || var5[15] != -119 || var5[16] != 85 || var5[17] != -87 || var5[18] != -20 || var5[19] != -121) {
                return false;
            }
            return true;
        } catch (Exception var7) {
            this.method10((byte) -52, "sha");
            return false;
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(IB)I", line = 2024)
    private final int method180(int arg0, byte arg1) {
        if (arg1 != 96) {
            this.field332 = -73;
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
            return class32.method224(-51, arg0);
        }
    }
}
