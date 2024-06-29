import java.awt.Color;
import java.awt.Graphics;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.net.URL;
import java.security.MessageDigest;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!mapview")
public class mapview extends class19 {

    @OriginalMember(owner = "mapview!mapview", name = "p", descriptor = "I")
    private int field287 = -20;

    @OriginalMember(owner = "mapview!mapview", name = "H", descriptor = "I")
    private int field305 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "y", descriptor = "I")
    private int field296 = 6706483;

    @OriginalMember(owner = "mapview!mapview", name = "J", descriptor = "I")
    private int field307 = 5;

    @OriginalMember(owner = "mapview!mapview", name = "x", descriptor = "I")
    private int field295 = 140;

    @OriginalMember(owner = "mapview!mapview", name = "Q", descriptor = "I")
    private int field313 = 500;

    @OriginalMember(owner = "mapview!mapview", name = "ab", descriptor = "I")
    private int field323 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "B", descriptor = "D")
    private double field299 = 4.0D;

    @OriginalMember(owner = "mapview!mapview", name = "C", descriptor = "I")
    private int field300 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "G", descriptor = "I")
    private int field304 = 5;

    @OriginalMember(owner = "mapview!mapview", name = "w", descriptor = "[I")
    private int[] field294 = new int[this.field313];

    @OriginalMember(owner = "mapview!mapview", name = "s", descriptor = "I")
    private int field290 = 23;

    @OriginalMember(owner = "mapview!mapview", name = "ib", descriptor = "I")
    private int field331 = 11141120;

    @OriginalMember(owner = "mapview!mapview", name = "K", descriptor = "I")
    private int field308 = 40;

    @OriginalMember(owner = "mapview!mapview", name = "F", descriptor = "D")
    private double field303 = 4.0D;

    @OriginalMember(owner = "mapview!mapview", name = "xb", descriptor = "I")
    private int field346 = 170;

    @OriginalMember(owner = "mapview!mapview", name = "Ab", descriptor = "Z")
    private boolean field349 = false;

    @OriginalMember(owner = "mapview!mapview", name = "nb", descriptor = "I")
    private int field336 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "T", descriptor = "I")
    private int field316 = -1;

    @OriginalMember(owner = "mapview!mapview", name = "W", descriptor = "Z")
    private boolean field319 = false;

    @OriginalMember(owner = "mapview!mapview", name = "r", descriptor = "I")
    private int field289 = 10;

    @OriginalMember(owner = "mapview!mapview", name = "eb", descriptor = "I")
    private int field327 = 8943445;

    @OriginalMember(owner = "mapview!mapview", name = "j", descriptor = "I")
    private int field281 = 8912896;

    @OriginalMember(owner = "mapview!mapview", name = "Bb", descriptor = "[Lf;")
    private class10[] field350 = new class10[this.field313];

    @OriginalMember(owner = "mapview!mapview", name = "rb", descriptor = "[I")
    private int[] field340 = new int[this.field313];

    @OriginalMember(owner = "mapview!mapview", name = "Ib", descriptor = "I")
    private int field357 = -1;

    @OriginalMember(owner = "mapview!mapview", name = "n", descriptor = "[I")
    private int[] field285 = new int[this.field313];

    @OriginalMember(owner = "mapview!mapview", name = "Lb", descriptor = "Z")
    private boolean field360 = false;

    @OriginalMember(owner = "mapview!mapview", name = "yb", descriptor = "I")
    private int field347 = 5;

    @OriginalMember(owner = "mapview!mapview", name = "Nb", descriptor = "I")
    private int field362 = 50;

    @OriginalMember(owner = "mapview!mapview", name = "cb", descriptor = "I")
    private int field325 = this.field360 ? 252 : 111;

    @OriginalMember(owner = "mapview!mapview", name = "Mb", descriptor = "Z")
    private boolean field361 = true;

    @OriginalMember(owner = "mapview!mapview", name = "l", descriptor = "Lf;")
    private class10 field283 = this.field360 ? class10.field108 : class10.field108;

    @OriginalMember(owner = "mapview!mapview", name = "Z", descriptor = "Lf;")
    private class10 field322 = this.field360 ? class18.field172 : class8.field76;

    @OriginalMember(owner = "mapview!mapview", name = "bb", descriptor = "Lf;")
    private class10 field324 = this.field360 ? class35.field491 : class35.field491;

    @OriginalMember(owner = "mapview!mapview", name = "Cb", descriptor = "I")
    private int field351 = this.field360 ? 115 : 102;

    @OriginalMember(owner = "mapview!mapview", name = "z", descriptor = "I")
    private int field297 = this.field360 ? 83 : 70;

    @OriginalMember(owner = "mapview!mapview", name = "A", descriptor = "Lf;")
    private class10 field298 = this.field360 ? class17.field149 : class17.field149;

    @OriginalMember(owner = "mapview!mapview", name = "gb", descriptor = "Lf;")
    private class10 field329 = this.field360 ? class11.field122 : class25.field267;

    @OriginalMember(owner = "mapview!mapview", name = "Ob", descriptor = "I")
    private int field363 = 30;

    @OriginalMember(owner = "mapview!mapview", name = "Fb", descriptor = "I")
    private int field354 = 450;

    @OriginalMember(owner = "mapview!mapview", name = "wb", descriptor = "Lf;")
    private class10 field345 = this.field360 ? class5.field43 : class5.field43;

    @OriginalMember(owner = "mapview!mapview", name = "Pb", descriptor = "I")
    private int field364 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "Jb", descriptor = "I")
    private int field358 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "db", descriptor = "I")
    private int field326 = this.field360 ? 108 : 107;

    @OriginalMember(owner = "mapview!mapview", name = "k", descriptor = "I")
    private int field282 = this.field360 ? 76 : 75;

    @OriginalMember(owner = "mapview!mapview", name = "t", descriptor = "I")
    private int field291 = this.field362 + this.field289;

    @OriginalMember(owner = "mapview!mapview", name = "Eb", descriptor = "I")
    private int field353 = 33;

    @OriginalMember(owner = "mapview!mapview", name = "Qb", descriptor = "Z")
    private boolean field365 = false;

    @OriginalMember(owner = "mapview!mapview", name = "kb", descriptor = "Lf;")
    private class10 field333 = this.field360 ? class22.field244 : class28.field396;

    @OriginalMember(owner = "mapview!mapview", name = "I", descriptor = "I")
    private int field306 = 471;

    @OriginalMember(owner = "mapview!mapview", name = "Tb", descriptor = "I")
    private int field368 = this.field360 ? 220 : 79;

    @OriginalMember(owner = "mapview!mapview", name = "jb", descriptor = "Lf;")
    private class10 field332 = this.field360 ? class31.field421 : class31.field421;

    @OriginalMember(owner = "mapview!mapview", name = "fb", descriptor = "I")
    private int field328 = 7824964;

    @OriginalMember(owner = "mapview!mapview", name = "vb", descriptor = "I")
    private int field344 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "lb", descriptor = "Lf;")
    private class10 field334 = this.field360 ? class37.field517 : class37.field517;

    @OriginalMember(owner = "mapview!mapview", name = "V", descriptor = "Lf;")
    private class10 field318 = this.field360 ? class20.field193 : class20.field193;

    @OriginalMember(owner = "mapview!mapview", name = "Vb", descriptor = "I")
    private int field370 = -1;

    @OriginalMember(owner = "mapview!mapview", name = "hb", descriptor = "Lf;")
    private class10 field330 = this.field360 ? class28.field398 : class28.field398;

    @OriginalMember(owner = "mapview!mapview", name = "Wb", descriptor = "I")
    private int field371 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "Ub", descriptor = "I")
    private int field369 = 10027008;

    @OriginalMember(owner = "mapview!mapview", name = "Kb", descriptor = "Lf;")
    private class10 field359 = this.field360 ? class36.field504 : class36.field504;

    @OriginalMember(owner = "mapview!mapview", name = "Y", descriptor = "Lf;")
    private class10 field321 = this.field360 ? class37.field510 : class37.field510;

    @OriginalMember(owner = "mapview!mapview", name = "N", descriptor = "Lf;")
    private static class10 field311 = class23.method139("mapfunction", (byte) -55);

    @OriginalMember(owner = "mapview!mapview", name = "ob", descriptor = "Lf;")
    public static class10 field337 = class23.method139("Sword Shop", (byte) -101);

    @OriginalMember(owner = "mapview!mapview", name = "zb", descriptor = "Lf;")
    public static class10 field348 = class23.method139("Silk Trader", (byte) -102);

    @OriginalMember(owner = "mapview!mapview", name = "Rb", descriptor = "Lf;")
    public static class10 field366 = class23.method139("Pet Shop", (byte) -110);

    @OriginalMember(owner = "mapview!mapview", name = "Gb", descriptor = "Lf;")
    public static class10 field355 = class23.method139("Holiday Event", (byte) -99);

    @OriginalMember(owner = "mapview!mapview", name = "U", descriptor = "Lf;")
    public static class10 field317 = class23.method139("floorcol)3dat", (byte) -81);

    @OriginalMember(owner = "mapview!mapview", name = "u", descriptor = "I")
    private int field292;

    @OriginalMember(owner = "mapview!mapview", name = "L", descriptor = "I")
    private int field309;

    @OriginalMember(owner = "mapview!mapview", name = "O", descriptor = "I")
    private int field312;

    @OriginalMember(owner = "mapview!mapview", name = "R", descriptor = "I")
    private int field314;

    @OriginalMember(owner = "mapview!mapview", name = "X", descriptor = "I")
    private int field320;

    @OriginalMember(owner = "mapview!mapview", name = "pb", descriptor = "I")
    private int field338;

    @OriginalMember(owner = "mapview!mapview", name = "Hb", descriptor = "I")
    private int field356;

    @OriginalMember(owner = "mapview!mapview", name = "Sb", descriptor = "I")
    private int field367;

    @OriginalMember(owner = "mapview!mapview", name = "Xb", descriptor = "I")
    public static int field372;

    @OriginalMember(owner = "mapview!mapview", name = "ub", descriptor = "Lf;")
    private class10 field343;

    @OriginalMember(owner = "mapview!mapview", name = "E", descriptor = "Lg;")
    private class12 field302;

    @OriginalMember(owner = "mapview!mapview", name = "m", descriptor = "Lr;")
    private class34 field284;

    @OriginalMember(owner = "mapview!mapview", name = "o", descriptor = "Lr;")
    private class34 field286;

    @OriginalMember(owner = "mapview!mapview", name = "q", descriptor = "Lr;")
    private class34 field288;

    @OriginalMember(owner = "mapview!mapview", name = "D", descriptor = "Lr;")
    private class34 field301;

    @OriginalMember(owner = "mapview!mapview", name = "mb", descriptor = "Lr;")
    private class34 field335;

    @OriginalMember(owner = "mapview!mapview", name = "qb", descriptor = "Lr;")
    private class34 field339;

    @OriginalMember(owner = "mapview!mapview", name = "tb", descriptor = "Lr;")
    private class34 field342;

    @OriginalMember(owner = "mapview!mapview", name = "Db", descriptor = "Lr;")
    private class34 field352;

    @OriginalMember(owner = "mapview!mapview", name = "sb", descriptor = "Lu;")
    private class39 field341;

    @OriginalMember(owner = "mapview!mapview", name = "v", descriptor = "[I")
    public static int[] field293;

    @OriginalMember(owner = "mapview!mapview", name = "M", descriptor = "[Lf;")
    private class10[] field310;

    @OriginalMember(owner = "mapview!mapview", name = "S", descriptor = "[Lf;")
    private class10[] field315;

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(IZZI)Lf;", line = 4)
    public static final class10 method149(int arg0, boolean arg1, boolean arg2, int arg3) {
        if (arg3 < 2 || arg3 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg3);
        }
        int var4 = 1;
        for (int var5 = arg0 / arg3; var5 != 0; var5 /= arg3) {
            var4++;
        }
        int var6 = var4;
        if (arg2) {
            return (class10) null;
        }
        if (arg0 < 0 || arg1) {
            var6 = var4 + 1;
        }
        byte[] var7 = new byte[var6];
        if (arg0 < 0) {
            var7[0] = 45;
        } else if (arg1) {
            var7[0] = 43;
        }
        for (int var8 = 0; var8 < var4; var8++) {
            int var9 = arg0 % arg3;
            arg0 /= arg3;
            if (var9 < 0) {
                var9 = -var9;
            }
            if (var9 > 9) {
                var9 += 39;
            }
            var7[var6 - var8 - 1] = (byte) (var9 + 48);
        }
        class10 var10 = new class10();
        var10.field112 = var7;
        var10.field106 = var6;
        return var10;
    }

    @OriginalMember(owner = "mapview!mapview", name = "e", descriptor = "(I)V", line = 67)
    private final void method150(int arg0) {
        class25.field279 = false;
        try {
            Graphics var2 = class10.field107.getGraphics();
            int var3 = 100 / ((45 - arg0) / 32);
            class36.field505.method195(var2, 87, 0, 0);
        } catch (Exception var5) {
            class10.field107.repaint();
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(Ljava/lang/String;I)[B", line = 93)
    private final byte[] method151(String arg0, int arg1) throws IOException {
        File var3 = new File(arg0);
        if (!var3.exists()) {
            return null;
        }
        int var4 = (int) var3.length();
        DataInputStream var5 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg0)));
        byte[] var6 = new byte[var4];
        var5.readFully(var6, arg1, var4);
        var5.close();
        return var6;
    }

    @OriginalMember(owner = "mapview!mapview", name = "g", descriptor = "(B)V", line = 112)
    public final void method124(byte arg0) {
        class4.method17(true);
        class19.method120((byte) 113);
        try {
            this.field294 = null;
            class5.field45 = null;
            this.field310 = null;
            this.field285 = null;
            int var2 = -68 / ((-arg0 - 43) / 57);
            this.field341 = null;
            this.field350 = null;
            this.field340 = null;
            this.field302 = null;
            System.gc();
        } catch (Throwable var4) {
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(BI)V", line = 143)
    private final void method152(byte arg0, int arg1) {
        if (arg0 < 71 || arg1 >= class7.field67.length) {
            return;
        }
        class1 var3 = class7.field67[arg1];
        class28 var4 = new class28(var3.method33(-53, class1.field9, class25.field266));
        var4.method183((byte) -29);
        class28 var5 = new class28(var3.method33(-65, class21.field238, class25.field266));
        this.field344 = var5.method184(-2);
        for (int var6 = 0; var6 < this.field344; var6++) {
            this.field350[var6] = var5.method183((byte) -29);
            this.field294[var6] = var5.method184(-2);
            this.field285[var6] = var5.method184(-2);
            this.field340[var6] = var5.method182(-116);
            class10 var7 = this.field350[var6].method74(32, true, 47);
            int var8 = this.field302.method209(var7);
            if (var8 > this.field320) {
                this.field320 = var8;
            }
            int var9 = this.field302.method209(this.field332);
            if (this.field320 < var9) {
                this.field320 = var9;
            }
        }
        class5.field45 = new class41();
        class5.field45.method267(-1, class7.field67[arg1]);
        class20.field184 = class10.field100;
        this.field309 = 180;
        this.field312 = 503 - this.field309 - 20;
        this.field314 = class18.field161 * this.field309 / class11.field124;
        this.field356 = 635 - this.field314 - 5;
        class33.field478 = class38.field525;
        this.field341 = new class39(this.field314, this.field309);
        this.field341.method251();
        this.method168((byte) -118, class18.field161, class11.field124, 0, 0, this.field314, 0, this.field309, 0);
        class13.method90(0, 0, this.field314, this.field309, 0);
        class13.method90(1, 1, this.field314 - 2, this.field309 + -2, this.field327);
        class36.field505.method192(0);
    }

    @OriginalMember(owner = "mapview!mapview", name = "<init>", descriptor = "()V", line = 2344)
    public mapview() {
        if (class19.field182) {
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(II)I", line = 214)
    private final int method153(int arg0, int arg1) {
        arg0++;
        if (arg1 >= -32) {
            method165(76, (byte) -63);
        }
        if (class7.field67.length <= arg0) {
            arg0 = 0;
        }
        return arg0;
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(B)V", line = 231)
    public final void method116(byte arg0) {
        method157(81);
        class20.method129((byte) 63);
        class10.method63((byte) 102);
        class27.method177((byte) 2);
        class11.method83(123);
        class28.method180((byte) 116);
        class19.method126(0);
        class38.method247(0);
        class30.method193(127);
        class1.method1(true);
        class41.method265(-1);
        class34.method220();
        class2.method6(-47);
        class22.method136(0);
        class5.method30(0);
        class33.method218(4032);
        class18.method112(-1);
        class13.method99();
        class24.method140(-10716);
        class25.method148((byte) -117);
        class17.method109((byte) -68);
        class4.method19(-126);
        class32.method206();
        class6.method37(-25453);
        class15.method107(-44);
        class31.method198(-20583);
        class23.method137(43);
        class7.method40(70);
        class36.method236((byte) 63);
        if (arg0 <= 121) {
            return;
        }
        class35.method234(58);
        class37.method239(0);
        class8.method44((byte) -104);
        class3.method14();
        class21.method133((byte) -2);
        this.field285 = null;
        this.field321 = null;
        this.field322 = null;
        this.field341 = null;
        this.field334 = null;
        this.field339 = null;
        this.field332 = null;
        this.field301 = null;
        this.field333 = null;
        this.field343 = null;
        this.field359 = null;
        this.field330 = null;
        this.field318 = null;
        this.field340 = null;
        this.field324 = null;
        this.field335 = null;
        this.field350 = null;
        this.field310 = null;
        this.field283 = null;
        this.field288 = null;
        this.field286 = null;
        this.field298 = null;
        this.field352 = null;
        this.field345 = null;
        this.field329 = null;
        this.field284 = null;
        this.field294 = null;
        this.field302 = null;
        this.field342 = null;
        this.field315 = null;
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(IIIIIBILf;I)V", line = 311)
    private final void method154(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, class10 arg7, int arg8) {
        class13.method90(arg3, arg0, arg1, arg8, 0);
        int var11 = arg0 + 1;
        int var12 = arg1 - 2;
        int var14 = arg8 - 2;
        int var13 = arg3 + 1;
        class13.method96(var13, var11, var12, var14, arg4);
        class13.method97(var13, var11, var12, arg6);
        class13.method94(var13, var11, var14, arg6);
        int var10 = 1 / ((arg5 - 80) / 41);
        class13.method97(var13, var11 + var14 - 1, var12, arg2);
        class13.method94(var12 + var13 - 1, var11, var14, arg2);
        this.field302.method203(arg7, var12 / 2 + var13 + 1, var14 / 2 + 4 + var11 + 1, 0, -1);
        this.field302.method203(arg7, var12 / 2 + var13, var11 - -(var14 / 2) + 4, 16777215, -1);
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(III[Lf;)V", line = 344)
    public static final void method155(int arg0, int arg1, int arg2, class10[] arg3) {
        if (arg2 != 20927) {
            field317 = null;
        }
        if (arg1 == 1) {
            arg3[0].method71(0);
        } else {
            class33.method216(106, arg0, arg3, arg1).method71(0);
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(Ljava/lang/String;Lf;B)Z", line = 359)
    private final boolean method156(String arg0, class10 arg1, byte arg2) {
        try {
            if (arg2 != 45) {
                this.field353 = -118;
            }
            if (class33.field479 == null) {
                String var4;
                if (arg0 == "main_file_cache.dat0") {
                    var4 = "worldmap.main.js5?crc=423656723";
                } else if (arg0 == "main_file_cache.dat1") {
                    var4 = "worldmap.dungeon.js5?crc=889944898";
                } else if (arg0 == "main_file_cache.dat2") {
                    var4 = "worldmap.extra.js5?crc=-553826462";
                } else if (arg0 == "main_file_cache.idx1") {
                    var4 = "mapview.fontmetrics.js5?crc=1281583541";
                } else {
                    var4 = "mapview.sprites.js5?crc=-1728128947";
                }
                class22.field245 = class41.method266(-122, new class10[] { this.field318, class19.field181, arg1 });
                int var5;
                if (arg0 == "main_file_cache.dat0") {
                    var5 = 441885;
                } else if (arg0 == "main_file_cache.dat1") {
                    var5 = 154623;
                } else if (arg0 == "main_file_cache.dat2") {
                    var5 = 181564;
                } else if (arg0 == "main_file_cache.idx1") {
                    var5 = 164;
                } else {
                    var5 = 10053;
                }
                class33.field479 = new DataInputStream((new URL(this.getCodeBase(), var4)).openStream());
                class28.field391 = new byte[var5];
                class21.field237 = 0;
                class5.field52 = 0;
            }
            int var6 = class5.field52;
            int var7 = class28.field391.length;
            if (var6 >= var7) {
                class33.field479.close();
                class33.field479 = null;
                if (!this.method163((byte) 115, class28.field391, arg0)) {
                    this.method118("download", (byte) -69);
                    class28.field391 = null;
                }
                return true;
            }
            class21.field237++;
            if (class21.field237 >= 1500) {
                throw new IOException();
            }
            DataInputStream var8 = class33.field479;
            int var9 = var8.available();
            if (var9 < 0) {
                throw new EOFException();
            } else if (var9 == 0) {
                return false;
            } else {
                if (var7 - var6 < var9) {
                    var9 = var7 - var6;
                }
                int var10 = var8.read(class28.field391, var6, var9);
                if (var10 < 0) {
                    throw new EOFException();
                } else if (var10 == 0) {
                    return false;
                } else {
                    class21.field237 = 0;
                    int var11 = var6 + var10;
                    int var12 = var11 * 100 / var7;
                    class22.field245 = class41.method266(arg2 ^ 0xFFFFFFA4, new class10[] { this.field345, class19.field181, arg1, class11.field117, class28.method179(var12, true), class4.field21 });
                    class5.field52 = var11;
                    return false;
                }
            }
        } catch (IOException var16) {
            try {
                class33.field479.close();
            } catch (Exception var15) {
            }
            class33.field479 = null;
            class28.field391 = null;
            this.method118(new String("download"), (byte) -115);
            return true;
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "b", descriptor = "(B)V", line = 488)
    public final void method117(byte arg0) {
        class25.method144(true);
        class30.method194(class10.field107, (byte) 53);
        boolean var2 = false;
        class21.method131(class10.field107, (byte) 124);
        class22.field245 = this.field283;
        boolean var3 = true;
        this.field310 = class25.method146((byte) -48);
        this.field315 = class37.method241(0);
        if (arg0 != 91) {
            this.field325 = -51;
        }
        if (var3) {
            byte var4 = 0;
            if (this.field315.length == 14) {
                byte var10002 = var4;
                int var5 = var4 + 1;
                this.field329 = this.field315[var10002];
                int var19 = var5;
                int var6 = var5 + 1;
                this.field322 = this.field315[var19];
                int var20 = var6;
                int var7 = var6 + 1;
                this.field333 = this.field315[var20];
                int var21 = var7;
                int var8 = var7 + 1;
                this.field359 = this.field315[var21];
                int var22 = var8;
                int var9 = var8 + 1;
                this.field321 = this.field315[var22];
                int var23 = var9;
                int var10 = var9 + 1;
                this.field283 = this.field315[var23];
                int var24 = var10;
                int var11 = var10 + 1;
                this.field330 = this.field315[var24];
                int var25 = var11;
                int var12 = var11 + 1;
                this.field332 = this.field315[var25];
                int var26 = var12;
                int var13 = var12 + 1;
                this.field318 = this.field315[var26];
                int var27 = var13;
                int var14 = var13 + 1;
                this.field324 = this.field315[var27];
                int var28 = var14;
                int var15 = var14 + 1;
                this.field298 = this.field315[var28];
                int var29 = var15;
                int var16 = var15 + 1;
                this.field334 = this.field315[var29];
                int var17 = var16 + 1;
                int var30 = var17;
                int var18 = var17 + 1;
                this.field345 = this.field315[var30];
                this.field368 = this.field329.method60(0, -66);
                this.field297 = this.field322.method60(0, -66);
                this.field282 = this.field333.method60(0, -66);
                this.field325 = this.method166(arg0 ^ 0xFFFFFFD6, this.field368);
                this.field351 = this.method166(-111, this.field297);
                this.field326 = this.method166(-77, this.field282);
            } else {
                class4.method21(new class10[] { class21.field225 }, arg0 + 36);
            }
        }
        this.field343 = method165(50, (byte) 117);
    }

    @OriginalMember(owner = "mapview!mapview", name = "f", descriptor = "(I)V", line = 556)
    public static void method157(int arg0) {
        field366 = null;
        field348 = null;
        if (arg0 != 81) {
            method165(1, (byte) 28);
        }
        field317 = null;
        field293 = null;
        field337 = null;
        field311 = null;
        field355 = null;
    }

    @OriginalMember(owner = "mapview!mapview", name = "g", descriptor = "(I)V", line = 582)
    private final void method158(int arg0) {
        if (class7.field67.length == 1) {
            class19.field174 = 0;
        } else {
            if (class20.field183 < 0) {
                class19.field174 = this.method153(class19.field174, arg0 - 110);
            } else {
                class19.field174 = class20.field183;
            }
            class20.field183 = this.method153(class19.field174, arg0 ^ 0xFFFFFF92);
        }
        this.method152((byte) 119, class19.field174);
        if (arg0 != 8) {
            this.method123((byte) 83);
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "e", descriptor = "(B)V", line = 613)
    public final void method121(byte arg0) {
        if (class18.field167) {
            class38.method245(class10.field107, (byte) -122);
            class31.method197(class10.field107, 0);
            this.method127(0);
            class30.method194(class10.field107, (byte) 77);
            class21.method131(class10.field107, (byte) 112);
        }
        method169(0);
        class5.method23(0);
        if (!class37.field515) {
            return;
        }
        if (class1.field6[96]) {
            class20.field184 = (int) ((double) class20.field184 - 16.0D / this.field299);
            class23.field253 = -1;
            this.field361 = true;
        }
        if (class1.field6[97]) {
            class23.field253 = -1;
            class20.field184 = (int) (16.0D / this.field299 + (double) class20.field184);
            this.field361 = true;
        }
        if (class1.field6[98]) {
            class33.field478 = (int) ((double) class33.field478 - 16.0D / this.field299);
            this.field361 = true;
            class23.field253 = -1;
        }
        if (class1.field6[99]) {
            this.field361 = true;
            class33.field478 = (int) (16.0D / this.field299 + (double) class33.field478);
            class23.field253 = -1;
        }
        while (true) {
            while (true) {
                while (class8.method43(true)) {
                    if (!class28.field390 || !class18.field165) {
                        if (class35.field493 == this.field351 || class35.field493 == this.field297) {
                            this.field361 = true;
                            class18.field165 = true;
                        }
                        if (class35.field493 == 49) {
                            this.field361 = true;
                            this.field303 = 3.0D;
                        }
                        if (class35.field493 == 50) {
                            this.field361 = true;
                            this.field303 = 4.0D;
                        }
                        if (class35.field493 == 51) {
                            this.field303 = 6.0D;
                            this.field361 = true;
                        }
                        if (class35.field493 == 52) {
                            this.field361 = true;
                            this.field303 = 8.0D;
                        }
                        if (class35.field493 == this.field326 || class35.field493 == this.field282) {
                            this.field349 = !this.field349;
                            this.field361 = true;
                        }
                        if (class35.field493 == this.field325 || class35.field493 == this.field368) {
                            this.field365 = !this.field365;
                            this.field361 = true;
                        }
                    } else if (class21.field236 == 0) {
                        this.field361 = true;
                        class18.field165 = false;
                        this.field343.method57(0, (byte) -118);
                        class27.field384 = -1;
                    } else if (class21.field236 == 84) {
                        class18.field165 = false;
                        this.field338 = class33.field478 << 16;
                        class23.field253 = class27.field384;
                        this.field367 = class20.field184 << 16;
                        this.field343.method57(0, (byte) -32);
                        this.field361 = true;
                        class27.field384 = -1;
                    } else {
                        boolean var2 = false;
                        if (class21.field236 == 85) {
                            if (this.field343.method67(-98) > 0) {
                                this.field343.method57(this.field343.method67(-98) - 1, (byte) -31);
                                this.field361 = true;
                                if (this.field343.method67(-98) == 0) {
                                    class27.field384 = -1;
                                } else {
                                    var2 = true;
                                }
                            }
                        } else if (class35.field493 != -1 && this.field343.method67(-98) <= class7.field68) {
                            this.field343.method56(class35.field493, (byte) -31);
                            this.field361 = true;
                        }
                        if (this.field343.method67(-98) > 0) {
                            for (int var3 = 0; var3 < this.field344; var3++) {
                                if (this.field350[var3].method67(-98) >= this.field343.method67(-98)) {
                                    class10 var4 = this.field343.method55(-12290);
                                    class10 var5 = this.field350[var3].method74(32, true, 47).method64(-96, this.field343.method67(-98), 0).method55(-12290);
                                    if (var4.method65(var5, (byte) -69) == 0) {
                                        this.field361 = true;
                                        class27.field384 = var3;
                                        var2 = true;
                                        break;
                                    }
                                }
                            }
                            if (!var2) {
                                this.field343.method57(this.field343.method67(-98) - 1, (byte) -21);
                            }
                        }
                    }
                }
                if (arg0 > -115) {
                    return;
                }
                int var6 = class25.field272;
                int var7 = class25.field280;
                int var8 = class18.field173;
                int var9 = class30.field418;
                int var10 = class15.field143;
                int var11 = class15.field144;
                if (var7 == 1) {
                    this.field336 = class20.field184;
                    this.field300 = class33.field478;
                    this.field364 = var8;
                    this.field358 = var6;
                    if (class7.field67.length == 1) {
                        if (this.field346 < var6 && var6 < this.field346 + this.field362 && var8 > this.field306 && this.field306 + this.field363 > var8) {
                            this.field303 = 3.0D;
                            this.field358 = -1;
                        }
                        if (this.field346 + this.field291 < var6 && var6 < this.field346 + this.field291 + this.field362 && var8 > this.field306 && this.field306 + this.field363 > var8) {
                            this.field303 = 4.0D;
                            this.field358 = -1;
                        }
                        if (var6 > this.field291 * 2 + this.field346 && var6 < this.field291 * 2 + this.field346 + this.field362 && var8 > this.field306 && var8 < this.field363 + this.field306) {
                            this.field358 = -1;
                            this.field303 = 6.0D;
                        }
                        if (var6 > this.field291 * 3 + this.field346 && var6 < this.field346 + this.field291 * 3 + this.field362 && this.field306 < var8 && var8 < this.field363 + this.field306) {
                            this.field358 = -1;
                            this.field303 = 8.0D;
                        }
                    } else {
                        if (var6 > this.field346 && this.field362 + this.field346 > var6 && this.field306 < var8 && this.field306 + this.field363 + this.field287 > var8) {
                            this.field303 = 3.0D;
                            this.field358 = -1;
                        }
                        if (this.field346 + this.field291 < var6 && this.field346 + this.field291 + this.field362 > var6 && this.field306 < var8 && this.field363 + this.field306 + this.field287 > var8) {
                            this.field358 = -1;
                            this.field303 = 4.0D;
                        }
                        if (var6 > this.field346 + this.field291 * 2 && this.field291 * 2 + this.field362 + this.field346 > var6 && var8 > this.field306 && var8 < this.field363 + this.field306 + this.field287) {
                            this.field303 = 6.0D;
                            this.field358 = -1;
                        }
                        if (var6 > this.field291 * 3 + this.field346 && this.field291 * 3 + this.field346 + this.field362 > var6 && this.field306 < var8 && var8 < this.field306 + this.field363 + this.field287) {
                            this.field303 = 8.0D;
                            this.field358 = -1;
                        }
                        if (var6 > 170 && var6 < 400 && var8 > 483 && var8 < 503) {
                            this.method160(-1, this.field369);
                            this.method150(120);
                            this.method158(8);
                            this.field358 = -1;
                        }
                    }
                    this.field361 = true;
                    if (var6 > this.field304 && this.field354 + this.field353 < var8 && this.field304 + this.field295 > var6 && var8 < 503) {
                        this.field358 = -1;
                        this.field349 = !this.field349;
                    }
                    if (var6 > this.field356 && this.field312 + this.field309 < var8 && var6 < this.field356 + this.field314 && var8 < 503) {
                        this.field358 = -1;
                        this.field365 = !this.field365;
                    }
                    if (this.field349) {
                        if (var6 > this.field304 && this.field353 < var8 && this.field304 + this.field295 > var6 && var8 < this.field353 + this.field354) {
                            this.field358 = -1;
                        }
                        if (var6 > this.field304 && this.field353 < var8 && this.field304 + this.field295 > var6 && var8 < this.field353 + 18 && this.field323 > 0) {
                            this.field323 -= 24;
                        }
                        if (this.field304 < var6 && this.field353 + this.field354 - 18 < var8 && this.field304 + this.field295 > var6 && var8 < this.field353 + this.field354 && this.field323 < 72) {
                            this.field323 += 24;
                        }
                    }
                    this.field319 = false;
                    if (this.field365 && var6 > this.field356 && var8 > this.field312 && this.field356 + this.field314 > var6 && var8 < this.field312 + this.field309) {
                        this.field319 = true;
                        class20.field184 = (var6 - this.field356) * class18.field161 / this.field314;
                        this.field358 = -1;
                        class33.field478 = (var8 - this.field312) * class11.field124 / this.field309;
                    }
                    if (class28.field390 && !class18.field165 && !this.field319 && this.field307 < var6 && var8 > this.field347 && var6 < this.field308 + this.field307 && var8 < this.field347 + this.field290) {
                        class18.field165 = true;
                    }
                }
                if (this.field349) {
                    this.field357 = -1;
                    if (var11 > this.field304 && var11 < this.field304 + this.field295) {
                        int var12 = this.field353 + 21 + 5;
                        int var13 = this.field305;
                        for (int var14 = 0; var14 < 24; var14++) {
                            if (this.field310.length > var13 && this.field310[var13].method78(class21.field201, -1)) {
                                var14--;
                                var13++;
                            } else {
                                if (var12 <= var10 && var12 + 17 > var10) {
                                    if (var7 == 1) {
                                        this.field371 = 50;
                                        this.field316 = var13;
                                    }
                                    this.field357 = var13;
                                }
                                var12 += 17;
                                var13++;
                            }
                        }
                    }
                    if (this.field370 != this.field357) {
                        this.field370 = this.field357;
                        this.field361 = true;
                    }
                }
                if (var9 == 1 && this.field365 && this.field319) {
                    int var15 = var11;
                    this.field361 = true;
                    if (var11 < this.field356) {
                        var15 = this.field356;
                    } else if (var11 > this.field356 + this.field314) {
                        var15 = this.field356 + this.field314;
                    }
                    class20.field184 = (var15 - this.field356) * class18.field161 / this.field314;
                    int var16 = var10;
                    if (this.field312 > var10) {
                        var16 = this.field312;
                    } else if (this.field312 + this.field309 < var10) {
                        var16 = this.field312 + this.field309;
                    }
                    class33.field478 = (var16 - this.field312) * class11.field124 / this.field309;
                    class23.field253 = -1;
                } else {
                    this.field319 = false;
                }
                if (var9 == 1 && this.field358 != -1) {
                    class20.field184 = this.field336 + (int) ((double) (this.field358 - var11) * 2.0D / this.field303);
                    this.field361 = true;
                    class23.field253 = -1;
                    class33.field478 = this.field300 + (int) ((double) (this.field364 - var10) * 2.0D / this.field303);
                }
                if (this.field303 > this.field299) {
                    this.field361 = true;
                    this.field299 += this.field299 / 30.0D;
                    if (this.field303 < this.field299) {
                        this.field299 = this.field303;
                    }
                }
                if (this.field299 > this.field303) {
                    this.field361 = true;
                    this.field299 -= this.field299 / 30.0D;
                    if (this.field299 < this.field303) {
                        this.field299 = this.field303;
                    }
                }
                if (this.field323 > this.field305) {
                    this.field361 = true;
                    this.field305++;
                }
                if (this.field305 > this.field323) {
                    this.field361 = true;
                    this.field305--;
                }
                if (this.field371 > 0) {
                    this.field371--;
                    this.field361 = true;
                }
                if (class23.field253 >= 0) {
                    class20.field194 = this.field294[class23.field253] - class37.field512;
                    byte var17 = 4;
                    int var18 = class20.field194 - (int) (635.0D / this.field299);
                    int var19 = (int) (635.0D / this.field299) + class20.field194;
                    class7.field73 = class23.field249 + class11.field124 - this.field285[class23.field253];
                    int var20 = class7.field73 - (int) (503.0D / this.field299);
                    this.field361 = true;
                    if (var18 < 48) {
                        class20.field194 = (int) (635.0D / this.field299) + 48;
                    }
                    if (var19 > class18.field161 - 48) {
                        class20.field194 = class18.field161 - (int) (635.0D / this.field299) - 48;
                    }
                    class20.field194 <<= 0x10;
                    int var21 = class7.field73 + (int) (503.0D / this.field299);
                    int var22 = class20.field194 - this.field367;
                    if (var20 < 48) {
                        class7.field73 = (int) (503.0D / this.field299) + 48;
                    }
                    if (var21 > class11.field124 - 48) {
                        class7.field73 = class11.field124 - (int) (503.0D / this.field299) - 48;
                    }
                    class7.field73 <<= 0x10;
                    int var23 = class7.field73 - this.field338;
                    if (var22 >> var17 == 0 && var23 >> var17 == 0) {
                        class23.field253 = -1;
                    } else {
                        this.field367 += var22 >> var17;
                        this.field338 += var23 >> var17;
                        class20.field184 = this.field367 >> 16;
                        class33.field478 = this.field338 >> 16;
                    }
                }
                int var24 = class20.field184 - (int) (635.0D / this.field299);
                int var25 = class33.field478 - (int) (503.0D / this.field299);
                int var26 = (int) (635.0D / this.field299) + class20.field184;
                if (var24 < 48) {
                    class20.field184 = (int) (635.0D / this.field299) + 48;
                }
                if (var26 > class18.field161 - 48) {
                    class20.field184 = class18.field161 - (int) (635.0D / this.field299) - 48;
                }
                int var27 = (int) (503.0D / this.field299) + class33.field478;
                if (var25 < 48) {
                    class33.field478 = (int) (503.0D / this.field299) + 48;
                }
                if (class11.field124 - 48 < var27) {
                    class33.field478 = class11.field124 - (int) (503.0D / this.field299) - 48;
                }
                return;
            }
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;", line = 1160)
    public static final String method159(Throwable arg0, int arg1) throws IOException {
        String var3;
        if (arg0 instanceof class6) {
            class6 var2 = (class6) arg0;
            arg0 = var2.field59;
            var3 = var2.field60 + " | ";
        } else {
            var3 = "";
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        arg0.printStackTrace(var5);
        var5.close();
        String var6 = var4.toString();
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        String var8 = var7.readLine();
        while (true) {
            while (true) {
                String var9 = var7.readLine();
                if (var9 == null) {
                    if (arg1 != 16) {
                        return (String) null;
                    }
                    return var3 + "| " + var8;
                }
                int var11 = var9.indexOf(40);
                int var12 = var9.indexOf(41, var11 + 1);
                if (var11 >= 0 && var12 >= 0) {
                    String var13 = var9.substring(var11 + 1, var12);
                    int var14 = var13.indexOf(".java:");
                    if (var14 >= 0) {
                        String var15 = var13.substring(0, var14) + var13.substring(var14 + 5);
                        var3 = var3 + var15 + ' ';
                        continue;
                    }
                    var9 = var9.substring(0, var11);
                }
                String var16 = var9.trim();
                String var17 = var16.substring(var16.lastIndexOf(32) + 1);
                String var18 = var17.substring(var17.lastIndexOf(9) + 1);
                var3 = var3 + var18 + ' ';
            }
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "init", descriptor = "()V", line = 1239)
    public final void init() {
        if (this.method128(-32241)) {
            this.method115(503, 635, 32, Integer.parseInt(this.getParameter("codeversion")), false);
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "b", descriptor = "(II)V", line = 1256)
    private final void method160(int arg0, int arg1) {
        this.method154(483, 230, this.field296, 170, arg1, (byte) 123, this.field327, class41.method266(arg0 - 120, new class10[] { class17.field154, class8.field81[class20.field183], class17.field155 }), 18);
        if (arg0 != -1) {
            this.field360 = false;
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "([BLjava/lang/String;I)V", line = 1274)
    private final void method161(byte[] arg0, String arg1, int arg2) throws IOException {
        FileOutputStream var4 = new FileOutputStream(arg1);
        int var5 = 2 / ((arg2 + 19) / 51);
        var4.write(arg0, 0, arg0.length);
        var4.close();
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(ILjava/lang/String;Lf;)Z", line = 1290)
    private final boolean method162(int arg0, String arg1, class10 arg2) {
        byte[] var4 = null;
        if (!class27.field385) {
            if (class2.field12 != null) {
                try {
                    var4 = this.method151(class2.field12 + "/" + arg1, arg0 ^ 0x30);
                    if (!this.method163((byte) 125, var4, arg1)) {
                        var4 = null;
                    }
                    if (var4 != null) {
                        class28.field393 = new class1(var4, false, true);
                        return true;
                    }
                } catch (IOException var11) {
                    var4 = null;
                }
            }
            class27.field385 = true;
        }
        if (var4 == null) {
            boolean var6 = this.method156(arg1, arg2, (byte) 45);
            if (!var6) {
                return false;
            }
            var4 = class28.field391;
            class28.field391 = null;
        }
        if (var4 == null) {
            class27.field385 = false;
            return true;
        }
        if (class2.field12 != null && var4 != null) {
            try {
                this.method161(var4, class2.field12 + "/" + arg1, -120);
            } catch (IOException var10) {
            }
        }
        if (arg0 != 48) {
            return false;
        }
        try {
            class28.field393 = new class1(var4, false, true);
            class27.field385 = false;
            return true;
        } catch (IOException var9) {
            throw class6.method35(var9, "monkey feet");
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(B[BLjava/lang/String;)Z", line = 1375)
    private final boolean method163(byte arg0, byte[] arg1, String arg2) {
        if (arg0 <= 81) {
            this.method153(-106, 85);
        }
        if (arg1 == null) {
            return false;
        }
        try {
            MessageDigest var4 = MessageDigest.getInstance("SHA");
            var4.reset();
            var4.update(arg1);
            byte[] var5 = var4.digest();
            if (arg2 == "main_file_cache.dat0") {
                if (var5[0] != 12 || var5[1] != 100 || var5[2] != 95 || var5[3] != 42 || var5[4] != 126 || var5[5] != -93 || var5[6] != 106 || var5[7] != -81 || var5[8] != -111 || var5[9] != -10 || var5[10] != 56 || var5[11] != 49 || var5[12] != 67 || var5[13] != 1 || var5[14] != -31 || var5[15] != 102 || var5[16] != 85 || var5[17] != -3 || var5[18] != -22 || var5[19] != -96) {
                    return false;
                }
            } else if (arg2 == "main_file_cache.idx1") {
                if (var5[0] != -49 || var5[1] != -3 || var5[2] != -26 || var5[3] != 113 || var5[4] != 5 || var5[5] != -26 || var5[6] != -83 || var5[7] != 94 || var5[8] != -52 || var5[9] != -101 || var5[10] != 48 || var5[11] != -28 || var5[12] != 31 || var5[13] != -15 || var5[14] != -43 || var5[15] != 23 || var5[16] != 50 || var5[17] != 25 || var5[18] != 94 || var5[19] != 60) {
                    return false;
                }
            } else if (var5[0] != 100 || var5[1] != -32 || var5[2] != 125 || var5[3] != 88 || var5[4] != -85 || var5[5] != -71 || var5[6] != 105 || var5[7] != 78 || var5[8] != -5 || var5[9] != -27 || var5[10] != -82 || var5[11] != 65 || var5[12] != 67 || var5[13] != 103 || var5[14] != 6 || var5[15] != 73 || var5[16] != 80 || var5[17] != -108 || var5[18] != -30 || var5[19] != -54) {
                return false;
            }
            return true;
        } catch (Exception var7) {
            this.method118("sha", (byte) -82);
            return false;
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "h", descriptor = "(I)V", line = 1426)
    private final void method164(int arg0) {
        String var3;
        try {
            String var2 = System.getProperty("user.home");
            if (var2 == null) {
                var3 = "~/";
            } else {
                var3 = var2 + "/";
            }
        } catch (Exception var14) {
            var3 = "~/";
        }
        String var5 = ".jagex_cache_32";
        String[] var6 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "d:/windows/", "d:/winnt/", "e:/windows/", "e:/winnt/", "f:/windows/", "f:/winnt/", "c:/", var3, "/tmp/", "" };
        int var7 = 113 / ((36 - arg0) / 60);
        for (int var8 = 0; var8 < var6.length; var8++) {
            try {
                String var9 = var6[var8];
                if (var9.length() > 0) {
                    File var10 = new File(var9);
                    if (!var10.exists()) {
                        continue;
                    }
                }
                File var11 = new File(var9 + var5);
                if (var11.exists() || var11.mkdir()) {
                    File var12 = new File(var11, "rsmap");
                    if (var12.exists() || var12.mkdir()) {
                        class2.field12 = var9 + var5 + "/rsmap/";
                        return;
                    }
                }
            } catch (Exception var15) {
            }
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(IB)Lf;", line = 1504)
    private static final class10 method165(int arg0, byte arg1) {
        class10 var2 = new class10();
        var2.field112 = new byte[arg0];
        if (arg1 <= 104) {
            field311 = null;
        }
        var2.field106 = 0;
        return var2;
    }

    @OriginalMember(owner = "mapview!mapview", name = "c", descriptor = "(II)I", line = 1538)
    private final int method166(int arg0, int arg1) {
        if (arg0 >= -47) {
            this.field284 = null;
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
            return class35.method231(false, arg1);
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "f", descriptor = "(B)V", line = 1597)
    public final void method123(byte arg0) {
        if (arg0 != 77) {
            this.method166(-1, 122);
        }
        if (!class37.field515) {
            class37.field515 = this.method167((byte) -76);
            class28.method189(class22.field245, true, class27.field388, 106, null);
            return;
        }
        if (this.field361) {
            class25.field279 = true;
            this.field361 = false;
            class13.method88();
            int var2 = (int) (635.0D / this.field299) + class20.field184;
            int var3 = class33.field478 - (int) (503.0D / this.field299);
            int var4 = class20.field184 - (int) (635.0D / this.field299);
            int var5 = (int) (503.0D / this.field299) + class33.field478;
            this.method168((byte) -118, var2, var5, 0, var3, 635, 0, 503, var4);
            if (this.field365) {
                this.field341.method250(this.field356, this.field312);
                class13.method89(this.field314 * var4 / class18.field161 + this.field356, this.field309 * var3 / class11.field124 + this.field312, (var2 - var4) * this.field314 / class18.field161, (var5 - var3) * this.field309 / class11.field124, 16711680, 128);
                class13.method90(this.field356 + this.field314 * var4 / class18.field161, this.field309 * var3 / class11.field124 + this.field312, (var2 - var4) * this.field314 / class18.field161, (var5 - var3) * this.field309 / class11.field124, 16711680);
                if (this.field371 > 0 && this.field371 % 10 < 5) {
                    for (int var6 = 0; var6 < class28.field397; var6++) {
                        if (class5.field45.field537[var6] == this.field316) {
                            int var7 = class5.field45.field544[var6] * this.field314 / class18.field161 + this.field356;
                            int var8 = class5.field45.field534[var6] * this.field309 / class11.field124 + this.field312;
                            class13.method93(var7, var8, 2, 16776960, 256);
                        }
                    }
                }
            }
            if (this.field349) {
                this.method154(this.field353, this.field295, 5592405, this.field304, 7829367, (byte) 16, 10066329, this.field359, 18);
                this.method154(this.field353 + 18, this.field295, 5592405, this.field304, 7829367, (byte) -77, 10066329, class10.field105, this.field354 - 36);
                this.method154(this.field354 + this.field353 - 18, this.field295, 5592405, this.field304, 7829367, (byte) -107, 10066329, this.field321, 18);
                int var9 = this.field353 + 3 + 18;
                int var10 = this.field305;
                for (int var11 = 0; var11 < 24; var11++) {
                    if (class25.field268.length > var10 && var10 < this.field310.length) {
                        if (this.field310[var10].method78(class21.field201, -1)) {
                            var10++;
                            var11--;
                            continue;
                        }
                        class25.field268[var10].method252(this.field304 + 3, var9);
                        int var12 = 16777215;
                        this.field302.method202(this.field310[var10], this.field304 + 21, var9 + 14, 0, -1);
                        if (this.field357 == var10) {
                            var12 = 12298922;
                        }
                        if (this.field371 > 0 && this.field371 % 10 < 5 && this.field316 == var10) {
                            var12 = 16776960;
                        }
                        this.field302.method202(this.field310[var10], this.field304 + 20, var9 - -13, var12, -1);
                    }
                    var10++;
                    var9 += 17;
                }
            }
            if (class7.field67.length == 1) {
                this.method154(this.field312 + this.field309, this.field314, this.field296, this.field356, this.field328, (byte) 126, this.field327, this.field329, 18);
                this.method154(this.field353 + this.field354, this.field295, this.field296, this.field304, this.field328, (byte) 127, this.field327, this.field333, 18);
                if (this.field303 == 3.0D) {
                    this.method154(this.field306, this.field362, this.field281, this.field346, this.field369, (byte) 124, this.field331, class10.field109, this.field363);
                } else {
                    this.method154(this.field306, this.field362, this.field296, this.field346, this.field328, (byte) 126, this.field327, class10.field109, this.field363);
                }
                if (this.field303 == 4.0D) {
                    this.method154(this.field306, this.field362, this.field281, this.field346 + this.field291, this.field369, (byte) 33, this.field331, class4.field25, this.field363);
                } else {
                    this.method154(this.field306, this.field362, this.field296, this.field346 + this.field291, this.field328, (byte) 126, this.field327, class4.field25, this.field363);
                }
                if (this.field303 == 6.0D) {
                    this.method154(this.field306, this.field362, this.field281, this.field291 * 2 + this.field346, this.field369, (byte) -99, this.field331, class28.field395, this.field363);
                } else {
                    this.method154(this.field306, this.field362, this.field296, this.field291 * 2 + this.field346, this.field328, (byte) 127, this.field327, class28.field395, this.field363);
                }
                if (this.field303 == 8.0D) {
                    this.method154(this.field306, this.field362, this.field281, this.field291 * 3 + this.field346, this.field369, (byte) 124, this.field331, class2.field17, this.field363);
                } else {
                    this.method154(this.field306, this.field362, this.field296, this.field291 * 3 + this.field346, this.field328, (byte) -88, this.field327, class2.field17, this.field363);
                }
            } else {
                this.method154(this.field312 + this.field309, this.field314, this.field296, this.field356, this.field328, (byte) 127, this.field327, this.field329, 18);
                this.method154(this.field354 + this.field353, this.field295, this.field296, this.field304, this.field328, (byte) 126, this.field327, this.field333, 18);
                this.method160(arg0 - 78, this.field328);
                int var13 = this.field306 + this.field287;
                if (this.field303 == 3.0D) {
                    this.method154(var13, this.field362, this.field281, this.field346, this.field369, (byte) 126, this.field331, class10.field109, this.field363);
                } else {
                    this.method154(var13, this.field362, this.field296, this.field346, this.field328, (byte) -26, this.field327, class10.field109, this.field363);
                }
                if (this.field303 == 4.0D) {
                    this.method154(var13, this.field362, this.field281, this.field346 + this.field291, this.field369, (byte) 124, this.field331, class4.field25, this.field363);
                } else {
                    this.method154(var13, this.field362, this.field296, this.field346 + this.field291, this.field328, (byte) 124, this.field327, class4.field25, this.field363);
                }
                if (this.field303 == 6.0D) {
                    this.method154(var13, this.field362, this.field281, this.field291 * 2 + this.field346, this.field369, (byte) -101, this.field331, class28.field395, this.field363);
                } else {
                    this.method154(var13, this.field362, this.field296, this.field346 + this.field291 * 2, this.field328, (byte) 127, this.field327, class28.field395, this.field363);
                }
                if (this.field303 == 8.0D) {
                    this.method154(var13, this.field362, this.field281, this.field291 * 3 + this.field346, this.field369, (byte) -62, this.field331, class2.field17, this.field363);
                } else {
                    this.method154(var13, this.field362, this.field296, this.field291 * 3 + this.field346, this.field328, (byte) 127, this.field327, class2.field17, this.field363);
                }
            }
            if (class28.field390) {
                this.method154(this.field347, this.field308, this.field296, this.field307, this.field328, (byte) 126, this.field327, this.field322, this.field290);
                if (class18.field165) {
                    class13.method89(this.field308 + this.field307 + 2, this.field347, this.field320 + 10, this.field290, 8925952, 192);
                    class13.method90(this.field308 + this.field307 + 2, this.field347, this.field320 + 10, this.field290, 16777215);
                    if (class27.field384 > -1 && this.field343.method67(arg0 ^ 0xFFFFFFD3) > 0) {
                        class10 var14 = this.field350[class27.field384].method74(32, true, 47);
                        int var15 = this.field343.method67(arg0 ^ 0xFFFFFFD3);
                        if (var14.method67(-98) < var15) {
                            var15 = var14.method67(arg0 ^ 0xFFFFFFD3);
                        }
                        this.field302.method202(var14, this.field307 + this.field308 + 6, 20, 10066176, 0);
                        this.field302.method202(var14.method64(-59, var15, 0), this.field308 + this.field307 + 6, 20, 16777215, 0);
                    } else {
                        this.field302.method202(this.field332, this.field308 + this.field307 + 6, 20, 16776960, 0);
                    }
                }
            }
        }
        if (class25.field279) {
            this.method150(108);
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "h", descriptor = "(B)Z", line = 1794)
    private final boolean method167(byte arg0) {
        if (class6.field62 == 0) {
            this.method164(-83);
            class6.field62 = 1;
        }
        if (arg0 != -76) {
            this.field286 = null;
        }
        if (class6.field62 == 1) {
            class27.field388 = 15;
            boolean var2 = this.method162(48, "main_file_cache.idx0", this.field324);
            if (!var2) {
                return false;
            }
            class15.field142 = class28.field393;
            class28.field393 = null;
            if (class15.field142 == null) {
                throw new RuntimeException("T1");
            }
            class6.field62 = 2;
        }
        if (class6.field62 == 2) {
            class27.field388 = 30;
            boolean var3 = this.method162(48, "main_file_cache.idx1", this.field298);
            if (!var3) {
                return false;
            }
            class30.field420 = class28.field393;
            class28.field393 = null;
            if (class30.field420 == null) {
                throw new RuntimeException("T2");
            }
            class6.field62 = 3;
        }
        if (class6.field62 == 3) {
            class7.field67 = new class1[1];
            class6.field62 = 10;
        }
        if (class6.field62 == 10) {
            class27.field388 = 50;
            boolean var4 = this.method162(48, "main_file_cache.dat0", this.field334);
            if (!var4) {
                return false;
            }
            class7.field67[0] = class28.field393;
            class28.field393 = null;
            if (class7.field67[0] == null) {
                throw new RuntimeException("T3");
            }
            class6.field62 = 20;
        }
        if (class6.field62 != 20) {
            return false;
        }
        class30.field410 = class36.method238(class10.field105, arg0 - 1, class15.field142, class2.field11);
        class25.field268 = class37.method242(class15.field142, field311, class10.field105, (byte) 15);
        this.field302 = class7.method41(true, class10.field105, class15.field142, class30.field408, class30.field420);
        this.field339 = new class34(11, true, this);
        this.field352 = new class34(12, true, this);
        this.field301 = new class34(14, true, this);
        this.field342 = new class34(17, true, this);
        this.field288 = new class34(19, true, this);
        this.field335 = new class34(22, true, this);
        this.field286 = new class34(26, true, this);
        this.field284 = new class34(30, true, this);
        class27.field388 = 100;
        class22.field245 = this.field330;
        class28.method189(class22.field245, true, class27.field388, 26, null);
        this.field308 = this.field302.method209(this.field322) + 20;
        this.method158(8);
        class10[] var5 = this.field310;
        for (int var6 = 0; var6 < var5.length; var6++) {
            class10 var7 = var5[var6];
            int var8 = this.field302.method209(var7);
            if (this.field292 < var8) {
                this.field292 = var8;
            }
        }
        this.field295 = this.field292 + 16 + 18;
        if (this.field295 > 140) {
            int var9 = this.field356 - this.field304 - this.field295;
            this.field289 = var9 / 25;
            this.field362 = this.field289 * 5;
            this.field291 = this.field362 + this.field289;
            int var10 = var9 - this.field289 * 25;
            this.field346 = var10 / 2 + this.field304 + this.field295 + this.field289;
        }
        return true;
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(BIIIIIIII)V", line = 1966)
    private final void method168(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class5.field45.method260(arg7, (byte) -56, arg6, arg5, arg4, arg2, arg8, arg1, arg3);
        if (arg5 - arg3 < -arg8 + arg1) {
            return;
        }
        if (arg0 != -118) {
            this.field327 = -46;
        }
        class5.field45.method255(arg8, this.field299, arg0 + 221, arg4, arg6, arg7, arg3, arg2, arg1, arg5);
        class5.field45.method268(arg1, arg7, -15, arg5, arg4, arg6, arg2, arg3, arg8);
        class5.field45.method257(arg8, arg4, arg2, 122, this.field371, arg1, arg5, arg3, arg7, arg6, this.field316);
        if (this.field303 == this.field299 && class38.field526) {
            for (int var10 = 0; var10 < this.field344; var10++) {
                int var11 = this.field294[var10];
                int var12 = var11 - class37.field512;
                int var13 = (arg5 - arg3) * (-arg8 + var12) / (arg1 - arg8) + arg3;
                int var14 = this.field285[var10];
                int var15 = this.field340[var10];
                class34 var16 = null;
                if (var15 == 0) {
                    if (this.field299 == 3.0D) {
                        var16 = this.field339;
                    }
                    if (this.field299 == 4.0D) {
                        var16 = this.field352;
                    }
                    if (this.field299 == 6.0D) {
                        var16 = this.field301;
                    }
                    if (this.field299 == 8.0D) {
                        var16 = this.field342;
                    }
                }
                int var17 = 16777215;
                if (var15 == 1) {
                    if (this.field299 == 3.0D) {
                        var16 = this.field301;
                    }
                    if (this.field299 == 4.0D) {
                        var16 = this.field342;
                    }
                    if (this.field299 == 6.0D) {
                        var16 = this.field288;
                    }
                    if (this.field299 == 8.0D) {
                        var16 = this.field335;
                    }
                }
                if (var15 == 2) {
                    if (this.field299 == 3.0D) {
                        var16 = this.field288;
                    }
                    if (this.field299 == 4.0D) {
                        var16 = this.field335;
                    }
                    if (this.field299 == 6.0D) {
                        var16 = this.field286;
                    }
                    if (this.field299 == 8.0D) {
                        var16 = this.field284;
                    }
                    var17 = 16755200;
                }
                int var18 = class11.field124 + class23.field249 - var14;
                int var19 = (var18 - arg4) * (-arg6 + arg7) / (arg2 - arg4) + arg6;
                if (var16 != null) {
                    class10 var20 = this.field350[var10];
                    int var21 = 1;
                    for (int var22 = 0; var20.method67(arg0 ^ 0x14) > var22; var22++) {
                        if (var20.method60(var22, -66) == 47) {
                            var21++;
                        }
                    }
                    int var23 = var19 - var16.method229() * (var21 - 1) / 2;
                    int var24 = var23 + var16.method223() / 2;
                    while (true) {
                        int var25 = var20.method73(arg0 + 118, 47);
                        if (var25 == -1) {
                            var16.method225(var20, var13, var24, var17, true);
                            break;
                        }
                        class10 var26 = var20.method64(-73, var25, 0);
                        var16.method225(var26, var13, var24, var17, true);
                        var24 += var16.method229();
                        var20 = var20.method79(false, var25 + 1);
                    }
                }
            }
        }
        if (!class23.field251) {
            return;
        }
        for (int var27 = class37.field512 / 64; var27 < (class37.field512 + class18.field161) / 64; var27++) {
            for (int var28 = class23.field249 / 64; var28 < (class23.field249 + class11.field124) / 64; var28++) {
                int var29 = var28 * 64;
                int var30 = class23.field249 + class11.field124 - var29;
                int var31 = var27 * 64;
                int var32 = var31 - class37.field512;
                int var33 = arg3 + (arg5 - arg3) * (-arg8 + var32) / (arg1 - arg8);
                int var34 = arg3 + (var32 + 64 - arg8) * (-arg3 + arg5) / (arg1 - arg8);
                int var35 = (arg7 - arg6) * (-arg4 + var30) / (arg2 - arg4) + arg6;
                int var36 = arg6 + (var30 - arg4 - 64) * (-arg6 + arg7) / (arg2 - arg4);
                class13.method90(var33, var36, var34 - var33, -var36 + var35, 16777215);
                this.field302.method211(class41.method266(-116, new class10[] { class28.method179(var27, true), class5.field46, class28.method179(var28, true) }), var34 - 5, var35 + -5, 16777215, -1);
                if (var27 == 33 && var28 >= 71 && var28 <= 73) {
                    this.field302.method203(class30.field416, (var34 + var33) / 2, (var35 + var36) / 2, 16711680, -1);
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "i", descriptor = "(I)V", line = 2231)
    private static final void method169(int arg0) {
        class27 var1 = class21.field235;
        synchronized (class21.field235) {
            class35.field488 = class21.field234;
            if (class17.field148 >= arg0) {
                while (class25.field273 != class17.field148) {
                    int var2 = class35.field492[class25.field273];
                    class25.field273 = class25.field273 + 1 & 0x7F;
                    if (var2 < 0) {
                        class1.field6[~var2] = false;
                    } else {
                        class1.field6[var2] = true;
                    }
                }
            } else {
                for (int var3 = 0; var3 < 112; var3++) {
                    class1.field6[var3] = false;
                }
                class17.field148 = class25.field273;
            }
            class21.field234 = class17.field151;
        }
    }
}
