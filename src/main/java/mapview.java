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
public class mapview extends class18 {

    @OriginalMember(owner = "mapview!mapview", name = "A", descriptor = "I")
    private int field300 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "t", descriptor = "I")
    private int field293 = -20;

    @OriginalMember(owner = "mapview!mapview", name = "p", descriptor = "I")
    private int field289 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "y", descriptor = "I")
    private int field298 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "V", descriptor = "I")
    private int field321 = 11141120;

    @OriginalMember(owner = "mapview!mapview", name = "T", descriptor = "D")
    private double field319 = 4.0D;

    @OriginalMember(owner = "mapview!mapview", name = "F", descriptor = "I")
    private int field305 = 23;

    @OriginalMember(owner = "mapview!mapview", name = "z", descriptor = "I")
    private int field299 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "W", descriptor = "I")
    private int field322 = 7824964;

    @OriginalMember(owner = "mapview!mapview", name = "P", descriptor = "I")
    private int field315 = 5;

    @OriginalMember(owner = "mapview!mapview", name = "H", descriptor = "Z")
    private boolean field307 = false;

    @OriginalMember(owner = "mapview!mapview", name = "r", descriptor = "I")
    private int field291 = 5;

    @OriginalMember(owner = "mapview!mapview", name = "pb", descriptor = "I")
    private int field341 = -1;

    @OriginalMember(owner = "mapview!mapview", name = "fb", descriptor = "I")
    private int field331 = -1;

    @OriginalMember(owner = "mapview!mapview", name = "G", descriptor = "I")
    private int field306 = 10027008;

    @OriginalMember(owner = "mapview!mapview", name = "xb", descriptor = "D")
    private double field349 = 4.0D;

    @OriginalMember(owner = "mapview!mapview", name = "lb", descriptor = "I")
    private int field337 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "J", descriptor = "I")
    private int field309 = 500;

    @OriginalMember(owner = "mapview!mapview", name = "vb", descriptor = "I")
    private int field347 = -1;

    @OriginalMember(owner = "mapview!mapview", name = "sb", descriptor = "I")
    private int field344 = 30;

    @OriginalMember(owner = "mapview!mapview", name = "Y", descriptor = "I")
    private int field324 = 140;

    @OriginalMember(owner = "mapview!mapview", name = "zb", descriptor = "I")
    private int field351 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "db", descriptor = "I")
    private int field329 = 8912896;

    @OriginalMember(owner = "mapview!mapview", name = "n", descriptor = "I")
    private int field287 = 33;

    @OriginalMember(owner = "mapview!mapview", name = "tb", descriptor = "[I")
    private int[] field345 = new int[this.field309];

    @OriginalMember(owner = "mapview!mapview", name = "gb", descriptor = "[I")
    private int[] field332 = new int[this.field309];

    @OriginalMember(owner = "mapview!mapview", name = "Mb", descriptor = "I")
    private int field364 = 5;

    @OriginalMember(owner = "mapview!mapview", name = "O", descriptor = "Z")
    private boolean field314 = false;

    @OriginalMember(owner = "mapview!mapview", name = "Ob", descriptor = "Z")
    private boolean field366 = true;

    @OriginalMember(owner = "mapview!mapview", name = "rb", descriptor = "I")
    private int field343 = 8943445;

    @OriginalMember(owner = "mapview!mapview", name = "Qb", descriptor = "[Lea;")
    private class10[] field368 = new class10[this.field309];

    @OriginalMember(owner = "mapview!mapview", name = "K", descriptor = "I")
    private int field310 = 170;

    @OriginalMember(owner = "mapview!mapview", name = "Fb", descriptor = "I")
    private int field357 = 6706483;

    @OriginalMember(owner = "mapview!mapview", name = "Rb", descriptor = "I")
    private int field369 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "Zb", descriptor = "I")
    private int field377 = 40;

    @OriginalMember(owner = "mapview!mapview", name = "ac", descriptor = "I")
    private int field378 = 10;

    @OriginalMember(owner = "mapview!mapview", name = "bc", descriptor = "Z")
    private boolean field379 = false;

    @OriginalMember(owner = "mapview!mapview", name = "Bb", descriptor = "Lea;")
    private class10 field353 = this.field379 ? class40.field507 : class40.field507;

    @OriginalMember(owner = "mapview!mapview", name = "Q", descriptor = "I")
    private int field316 = this.field379 ? 83 : 70;

    @OriginalMember(owner = "mapview!mapview", name = "ob", descriptor = "Lea;")
    private class10 field340 = this.field379 ? class40.field514 : class40.field510;

    @OriginalMember(owner = "mapview!mapview", name = "Hb", descriptor = "Lea;")
    private class10 field359 = this.field379 ? class3.field16 : class3.field16;

    @OriginalMember(owner = "mapview!mapview", name = "jb", descriptor = "I")
    private int field335 = this.field379 ? 115 : 102;

    @OriginalMember(owner = "mapview!mapview", name = "o", descriptor = "Lea;")
    private class10 field288 = this.field379 ? class7.field56 : class7.field56;

    @OriginalMember(owner = "mapview!mapview", name = "hb", descriptor = "I")
    private int field333 = 50;

    @OriginalMember(owner = "mapview!mapview", name = "N", descriptor = "Lea;")
    private class10 field313 = this.field379 ? class3.field17 : class3.field17;

    @OriginalMember(owner = "mapview!mapview", name = "Kb", descriptor = "Lea;")
    private class10 field362 = this.field379 ? class13.field122 : class13.field122;

    @OriginalMember(owner = "mapview!mapview", name = "Nb", descriptor = "I")
    private int field365 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "w", descriptor = "I")
    private int field296 = this.field379 ? 252 : 111;

    @OriginalMember(owner = "mapview!mapview", name = "cc", descriptor = "I")
    private int field380 = this.field378 + this.field333;

    @OriginalMember(owner = "mapview!mapview", name = "Db", descriptor = "Lea;")
    private class10 field355 = this.field379 ? class13.field145 : class39.field504;

    @OriginalMember(owner = "mapview!mapview", name = "eb", descriptor = "Lea;")
    private class10 field330 = this.field379 ? class8.field67 : class22.field236;

    @OriginalMember(owner = "mapview!mapview", name = "Z", descriptor = "I")
    private int field325 = this.field379 ? 220 : 79;

    @OriginalMember(owner = "mapview!mapview", name = "Cb", descriptor = "I")
    private int field354 = this.field379 ? 108 : 107;

    @OriginalMember(owner = "mapview!mapview", name = "nb", descriptor = "[I")
    private int[] field339 = new int[this.field309];

    @OriginalMember(owner = "mapview!mapview", name = "Sb", descriptor = "I")
    private int field370 = 450;

    @OriginalMember(owner = "mapview!mapview", name = "ub", descriptor = "I")
    private int field346 = 471;

    @OriginalMember(owner = "mapview!mapview", name = "dc", descriptor = "I")
    private int field381 = this.field379 ? 76 : 75;

    @OriginalMember(owner = "mapview!mapview", name = "bb", descriptor = "Lea;")
    private class10 field327 = this.field379 ? class8.field63 : class8.field63;

    @OriginalMember(owner = "mapview!mapview", name = "Pb", descriptor = "Lea;")
    private class10 field367 = this.field379 ? class3.field24 : class3.field24;

    @OriginalMember(owner = "mapview!mapview", name = "D", descriptor = "Lea;")
    private class10 field303 = this.field379 ? class31.field431 : class31.field431;

    @OriginalMember(owner = "mapview!mapview", name = "qb", descriptor = "Z")
    private boolean field342 = false;

    @OriginalMember(owner = "mapview!mapview", name = "ec", descriptor = "Lea;")
    private class10 field382 = this.field379 ? class28.field406 : class28.field406;

    @OriginalMember(owner = "mapview!mapview", name = "E", descriptor = "Lea;")
    private class10 field304 = this.field379 ? class16.field180 : class16.field180;

    @OriginalMember(owner = "mapview!mapview", name = "R", descriptor = "Lea;")
    public static class10 field317 = class3.method8("Dairy Churn", 102);

    @OriginalMember(owner = "mapview!mapview", name = "wb", descriptor = "J")
    public static long field348 = 0L;

    @OriginalMember(owner = "mapview!mapview", name = "yb", descriptor = "I")
    public static volatile int field350 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "C", descriptor = "[I")
    public static int[] field302 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 0, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "mapview!mapview", name = "Ib", descriptor = "I")
    public static int field360 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "U", descriptor = "Lea;")
    public static class10 field320 = class3.method8("Axe Shop", 99);

    @OriginalMember(owner = "mapview!mapview", name = "Yb", descriptor = "Lea;")
    public static class10 field376 = class3.method8("world", 109);

    @OriginalMember(owner = "mapview!mapview", name = "Ub", descriptor = "Z")
    public static volatile boolean field372 = false;

    @OriginalMember(owner = "mapview!mapview", name = "Tb", descriptor = "I")
    public static int field371 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "Vb", descriptor = "I")
    public static volatile int field373 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "fc", descriptor = "Lea;")
    public static class10 field383 = class3.method8("Amulet Shop", -87);

    @OriginalMember(owner = "mapview!mapview", name = "s", descriptor = "I")
    private int field292;

    @OriginalMember(owner = "mapview!mapview", name = "v", descriptor = "I")
    public static int field295;

    @OriginalMember(owner = "mapview!mapview", name = "x", descriptor = "I")
    private int field297;

    @OriginalMember(owner = "mapview!mapview", name = "B", descriptor = "I")
    private int field301;

    @OriginalMember(owner = "mapview!mapview", name = "I", descriptor = "I")
    private int field308;

    @OriginalMember(owner = "mapview!mapview", name = "ib", descriptor = "I")
    private int field334;

    @OriginalMember(owner = "mapview!mapview", name = "kb", descriptor = "I")
    private int field336;

    @OriginalMember(owner = "mapview!mapview", name = "Eb", descriptor = "I")
    private int field356;

    @OriginalMember(owner = "mapview!mapview", name = "Gb", descriptor = "I")
    private int field358;

    @OriginalMember(owner = "mapview!mapview", name = "gc", descriptor = "I")
    public static int field384;

    @OriginalMember(owner = "mapview!mapview", name = "S", descriptor = "Lea;")
    private class10 field318;

    @OriginalMember(owner = "mapview!mapview", name = "Xb", descriptor = "Lpa;")
    private class30 field375;

    @OriginalMember(owner = "mapview!mapview", name = "cb", descriptor = "Lt;")
    private class37 field328;

    @OriginalMember(owner = "mapview!mapview", name = "q", descriptor = "Lw;")
    private class41 field290;

    @OriginalMember(owner = "mapview!mapview", name = "L", descriptor = "Lw;")
    private class41 field311;

    @OriginalMember(owner = "mapview!mapview", name = "X", descriptor = "Lw;")
    private class41 field323;

    @OriginalMember(owner = "mapview!mapview", name = "ab", descriptor = "Lw;")
    private class41 field326;

    @OriginalMember(owner = "mapview!mapview", name = "Ab", descriptor = "Lw;")
    private class41 field352;

    @OriginalMember(owner = "mapview!mapview", name = "Jb", descriptor = "Lw;")
    private class41 field361;

    @OriginalMember(owner = "mapview!mapview", name = "Lb", descriptor = "Lw;")
    private class41 field363;

    @OriginalMember(owner = "mapview!mapview", name = "Wb", descriptor = "Lw;")
    private class41 field374;

    @OriginalMember(owner = "mapview!mapview", name = "u", descriptor = "Ljava/lang/String;")
    private static String field294;

    @OriginalMember(owner = "mapview!mapview", name = "m", descriptor = "[Lea;")
    private class10[] field286;

    @OriginalMember(owner = "mapview!mapview", name = "M", descriptor = "[Lea;")
    private class10[] field312;

    @OriginalMember(owner = "mapview!mapview", name = "mb", descriptor = "[[B")
    public static byte[][] field338;

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(IIIIIILea;II)V", line = 19)
    private final void method176(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class10 arg6, int arg7, int arg8) {
        class27.method200(arg3, arg4, arg0, arg1, 0);
        int var11 = arg1 - 2;
        int var12 = arg3 + 1;
        int var10 = arg0 - 2;
        int var13 = arg4 + 1;
        class27.method201(var12, var13, var10, var11, arg7);
        class27.method198(var12, var13, var10, arg5);
        class27.method208(var12, var13, var11, arg5);
        class27.method198(var12, var13 + var11 - 1, var10, arg2);
        class27.method208(var10 + var12 - 1, var13, var11, arg2);
        this.field328.method163(arg6, var10 / 2 + var12 + 1, var11 / arg8 + var13 + 1 - -4, 0, -1);
        this.field328.method163(arg6, var10 / 2 + var12, var13 - (-(var11 / 2) - 4), 16777215, -1);
    }

    @OriginalMember(owner = "mapview!mapview", name = "e", descriptor = "(B)V", line = 40)
    private final void method177(byte arg0) {
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
        String var5 = ".jagex_cache_32";
        String[] var6 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "d:/windows/", "d:/winnt/", "e:/windows/", "e:/winnt/", "f:/windows/", "f:/winnt/", "c:/", var3, "/tmp/", "" };
        for (int var7 = 0; var7 < var6.length; var7++) {
            try {
                String var8 = var6[var7];
                if (var8.length() > 0) {
                    File var9 = new File(var8);
                    if (!var9.exists()) {
                        continue;
                    }
                }
                File var10 = new File(var8 + var5);
                if (var10.exists() || var10.mkdir()) {
                    File var11 = new File(var10, "rsmap");
                    if (var11.exists() || var11.mkdir()) {
                        field294 = var8 + var5 + "/rsmap/";
                        return;
                    }
                }
            } catch (Exception var14) {
            }
        }
        if (arg0 >= -91) {
            this.field375 = null;
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "j", descriptor = "(I)V", line = 107)
    private final void method178(int arg0) {
        if (class21.field219.length == 1) {
            class6.field53 = 0;
        } else {
            if (class1.field5 >= 0) {
                class6.field53 = class1.field5;
            } else {
                class6.field53 = this.method190(22388, class6.field53);
            }
            class1.field5 = this.method190(22388, class6.field53);
        }
        this.method192(47, class6.field53);
        if (arg0 != 0) {
            this.field313 = null;
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(Z)V", line = 150)
    private final void method179(boolean arg0) {
        if (!arg0) {
            this.method183(-32, null, null);
        }
        class10.field82 = false;
        try {
            Graphics var2 = class35.field479.getGraphics();
            class33.field451.method103(var2, 0, 127, 0);
        } catch (Exception var4) {
            class35.field479.repaint();
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(ILjava/lang/String;Lea;)Z", line = 170)
    private final boolean method180(int arg0, String arg1, class10 arg2) {
        try {
            if (arg0 >= -84) {
                this.field289 = -106;
            }
            if (class35.field478 == null) {
                String var4;
                if (arg1 == "main_file_cache.dat0") {
                    var4 = "worldmap.main.js5?crc=-574880683";
                } else if (arg1 == "main_file_cache.dat1") {
                    var4 = "worldmap.dungeon.js5?crc=1328379301";
                } else if (arg1 == "main_file_cache.dat2") {
                    var4 = "worldmap.extra.js5?crc=-1141136769";
                } else if (arg1 == "main_file_cache.idx1") {
                    var4 = "mapview.fontmetrics.js5?crc=-447025815";
                } else {
                    var4 = "mapview.sprites.js5?crc=-1292288506";
                }
                class35.field484 = class3.method10(new class10[] { this.field327, class18.field188, arg2 }, true);
                int var5;
                if (arg1 == "main_file_cache.dat0") {
                    var5 = 418061;
                } else if (arg1 == "main_file_cache.dat1") {
                    var5 = 154694;
                } else if (arg1 == "main_file_cache.dat2") {
                    var5 = 140147;
                } else if (arg1 == "main_file_cache.idx1") {
                    var5 = 165;
                } else {
                    var5 = 8294;
                }
                class35.field478 = new DataInputStream((new URL(this.getCodeBase(), var4)).openStream());
                class14.field165 = new byte[var5];
                class11.field90 = 0;
                class8.field70 = 0;
            }
            int var6 = class11.field90;
            int var7 = class14.field165.length;
            if (var7 <= var6) {
                class35.field478.close();
                class35.field478 = null;
                if (!this.method184((byte) 38, class14.field165, arg1)) {
                    this.method118("download", (byte) -105);
                    class14.field165 = null;
                }
                return true;
            }
            class8.field70++;
            if (class8.field70 >= 1500) {
                throw new IOException();
            }
            DataInputStream var8 = class35.field478;
            int var9 = var8.available();
            if (var9 < 0) {
                throw new EOFException();
            } else if (var9 == 0) {
                return false;
            } else {
                if (var9 > var7 - var6) {
                    var9 = var7 - var6;
                }
                int var10 = var8.read(class14.field165, var6, var9);
                if (var10 < 0) {
                    throw new EOFException();
                } else if (var10 == 0) {
                    return false;
                } else {
                    class8.field70 = 0;
                    int var11 = var6 + var10;
                    int var12 = var11 * 100 / var7;
                    class35.field484 = class3.method10(new class10[] { this.field304, class18.field188, arg2, class20.field216, class11.method84(-3, var12), class19.field207 }, true);
                    class11.field90 = var11;
                    return false;
                }
            }
        } catch (IOException var16) {
            try {
                class35.field478.close();
            } catch (Exception var15) {
            }
            class14.field165 = null;
            class35.field478 = null;
            this.method118(new String("download"), (byte) -100);
            return true;
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(II)V", line = 304)
    private final void method181(int arg0, int arg1) {
        this.method176(230, 18, this.field357, 170, 483, this.field343, class3.method10(new class10[] { class25.field395, class39.field501[class1.field5], class10.field81 }, true), arg0, 2);
        if (arg1 < 78) {
            this.method179(true);
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(Ls;ILea;Ls;Lea;)Lt;", line = 327)
    private static final class37 method182(class35 arg0, int arg1, class10 arg2, class35 arg3, class10 arg4) {
        if (arg1 == 3) {
            int var5 = arg3.method242(arg2, 6);
            int var6 = arg3.method241((byte) 73, arg4, var5);
            return class1.method2(var5, arg0, var6, arg3, true);
        } else {
            return (class37) null;
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(ILea;Ljava/lang/String;)Z", line = 342)
    private final boolean method183(int arg0, class10 arg1, String arg2) {
        byte[] var4 = null;
        if (!class34.field458) {
            if (field294 != null) {
                try {
                    var4 = this.method191(-41, field294 + "/" + arg2);
                    if (!this.method184((byte) 106, var4, arg2)) {
                        var4 = null;
                    }
                    if (var4 != null) {
                        class1.field2 = new class4(var4, false, true);
                        return true;
                    }
                } catch (IOException var11) {
                    var4 = null;
                }
            }
            class34.field458 = true;
        }
        if (var4 == null) {
            boolean var6 = this.method180(arg0 - 126, arg2, arg1);
            if (!var6) {
                return false;
            }
            var4 = class14.field165;
            class14.field165 = null;
        }
        if (var4 == null) {
            class34.field458 = false;
            return true;
        }
        if (field294 != null && var4 != null) {
            try {
                this.method186(-1992556080, field294 + "/" + arg2, var4);
            } catch (IOException var10) {
            }
        }
        try {
            if (arg0 == -1) {
                class1.field2 = new class4(var4, false, true);
                class34.field458 = false;
                return true;
            } else {
                return true;
            }
        } catch (IOException var9) {
            throw class4.method15(var9, "monkey feet");
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(B)V", line = 435)
    public final void method114(byte arg0) {
        if (arg0 != 126) {
            this.field288 = null;
        }
        if (!class35.field469) {
            class35.field469 = this.method185((byte) 115);
            class40.method253(class35.field484, null, class21.field228, arg0 ^ 0x61);
            return;
        }
        if (this.field366) {
            this.field366 = false;
            class10.field82 = true;
            class27.method199();
            int var2 = class21.field227 - (int) (635.0D / this.field319);
            int var3 = class1.field1 - (int) (503.0D / this.field319);
            int var4 = (int) (635.0D / this.field319) + class21.field227;
            int var5 = (int) (503.0D / this.field319) + class1.field1;
            this.method187(0, 635, var5, var4, 0, 503, var3, var2, (byte) 46);
            if (this.field314) {
                this.field375.method218(this.field308, this.field336);
                class27.method205(this.field301 * var2 / class33.field453 + this.field308, this.field336 - -(this.field358 * var3 / class6.field48), (var4 - var2) * this.field301 / class33.field453, (var5 - var3) * this.field358 / class6.field48, 16711680, 128);
                class27.method200(this.field308 + this.field301 * var2 / class33.field453, this.field358 * var3 / class6.field48 + this.field336, (var4 - var2) * this.field301 / class33.field453, (var5 - var3) * this.field358 / class6.field48, 16711680);
                if (this.field337 > 0 && this.field337 % 10 < 5) {
                    for (int var6 = 0; var6 < class7.field55; var6++) {
                        if (class16.field176.field44[var6] == this.field347) {
                            int var7 = this.field336 + class16.field176.field41[var6] * this.field358 / class6.field48;
                            int var8 = class16.field176.field50[var6] * this.field301 / class33.field453 + this.field308;
                            class27.method209(var8, var7, 2, 16776960, 256);
                        }
                    }
                }
            }
            if (this.field307) {
                this.method176(this.field324, 18, 5592405, this.field315, this.field287, 10066329, this.field303, 7829367, 2);
                this.method176(this.field324, this.field370 - 36, 5592405, this.field315, this.field287 + 18, 10066329, class32.field437, 7829367, 2);
                this.method176(this.field324, 18, 5592405, this.field315, this.field287 + this.field370 - 18, 10066329, this.field353, 7829367, arg0 ^ 0x7C);
                int var9 = this.field287 + 3 + 18;
                int var10 = this.field298;
                for (int var11 = 0; var11 < 24; var11++) {
                    if (var10 < class32.field442.length && this.field312.length > var10) {
                        if (this.field312[var10].method68(class25.field385, -118)) {
                            var10++;
                            var11--;
                            continue;
                        }
                        class32.field442[var10].method215(this.field315 + 3, var9);
                        this.field328.method155(this.field312[var10], this.field315 + 21, var9 + 14, 0, -1);
                        int var12 = 16777215;
                        if (this.field331 == var10) {
                            var12 = 12298922;
                        }
                        if (this.field337 > 0 && this.field337 % 10 < 5 && this.field347 == var10) {
                            var12 = 16776960;
                        }
                        this.field328.method155(this.field312[var10], this.field315 + 20, var9 - -13, var12, -1);
                    }
                    var9 += 17;
                    var10++;
                }
            }
            if (class21.field219.length == 1) {
                this.method176(this.field301, 18, this.field357, this.field308, this.field336 + this.field358, this.field343, this.field355, this.field322, 2);
                this.method176(this.field324, 18, this.field357, this.field315, this.field370 + this.field287, this.field343, this.field340, this.field322, 2);
                if (this.field349 == 3.0D) {
                    this.method176(this.field333, this.field344, this.field329, this.field310, this.field346, this.field321, class11.field87, this.field306, arg0 ^ 0x7C);
                } else {
                    this.method176(this.field333, this.field344, this.field357, this.field310, this.field346, this.field343, class11.field87, this.field322, 2);
                }
                if (this.field349 == 4.0D) {
                    this.method176(this.field333, this.field344, this.field329, this.field310 + this.field380, this.field346, this.field321, class22.field242, this.field306, 2);
                } else {
                    this.method176(this.field333, this.field344, this.field357, this.field380 + this.field310, this.field346, this.field343, class22.field242, this.field322, 2);
                }
                if (this.field349 == 6.0D) {
                    this.method176(this.field333, this.field344, this.field329, this.field380 * 2 + this.field310, this.field346, this.field321, class35.field483, this.field306, 2);
                } else {
                    this.method176(this.field333, this.field344, this.field357, this.field380 * 2 + this.field310, this.field346, this.field343, class35.field483, this.field322, 2);
                }
                if (this.field349 == 8.0D) {
                    this.method176(this.field333, this.field344, this.field329, this.field380 * 3 + this.field310, this.field346, this.field321, class21.field221, this.field306, 2);
                } else {
                    this.method176(this.field333, this.field344, this.field357, this.field380 * 3 + this.field310, this.field346, this.field343, class21.field221, this.field322, 2);
                }
            } else {
                this.method176(this.field301, 18, this.field357, this.field308, this.field336 + this.field358, this.field343, this.field355, this.field322, 2);
                this.method176(this.field324, 18, this.field357, this.field315, this.field370 + this.field287, this.field343, this.field340, this.field322, 2);
                this.method181(this.field322, 102);
                int var13 = this.field346 + this.field293;
                if (this.field349 == 3.0D) {
                    this.method176(this.field333, this.field344, this.field329, this.field310, var13, this.field321, class11.field87, this.field306, arg0 - 124);
                } else {
                    this.method176(this.field333, this.field344, this.field357, this.field310, var13, this.field343, class11.field87, this.field322, 2);
                }
                if (this.field349 == 4.0D) {
                    this.method176(this.field333, this.field344, this.field329, this.field380 + this.field310, var13, this.field321, class22.field242, this.field306, arg0 - 124);
                } else {
                    this.method176(this.field333, this.field344, this.field357, this.field310 + this.field380, var13, this.field343, class22.field242, this.field322, 2);
                }
                if (this.field349 == 6.0D) {
                    this.method176(this.field333, this.field344, this.field329, this.field380 * 2 + this.field310, var13, this.field321, class35.field483, this.field306, arg0 - 124);
                } else {
                    this.method176(this.field333, this.field344, this.field357, this.field380 * 2 + this.field310, var13, this.field343, class35.field483, this.field322, arg0 - 124);
                }
                if (this.field349 == 8.0D) {
                    this.method176(this.field333, this.field344, this.field329, this.field380 * 3 + this.field310, var13, this.field321, class21.field221, this.field306, arg0 ^ 0x7C);
                } else {
                    this.method176(this.field333, this.field344, this.field357, this.field380 * 3 + this.field310, var13, this.field343, class21.field221, this.field322, arg0 - 124);
                }
            }
            if (class40.field519) {
                this.method176(this.field377, this.field305, this.field357, this.field364, this.field291, this.field343, this.field330, this.field322, 2);
                if (class18.field195) {
                    class27.method205(this.field364 + this.field377 + 2, this.field291, this.field356 + 10, this.field305, 8925952, 192);
                    class27.method200(this.field364 + this.field377 + 2, this.field291, this.field356 + 10, this.field305, 16777215);
                    if (class19.field200 > -1 && this.field318.method52((byte) -118) > 0) {
                        class10 var14 = this.field368[class19.field200].method56(32, -124, 47);
                        int var15 = this.field318.method52((byte) -117);
                        if (var14.method52((byte) -127) < var15) {
                            var15 = var14.method52((byte) -126);
                        }
                        this.field328.method155(var14, this.field377 + this.field364 + 6, 20, 10066176, 0);
                        this.field328.method155(var14.method69(var15, -123, 0), this.field364 + this.field377 + 6, 20, 16777215, 0);
                    } else {
                        this.field328.method155(this.field382, this.field364 + this.field377 + 6, 20, 16776960, 0);
                    }
                }
            }
        }
        if (class10.field82) {
            this.method179(true);
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "init", descriptor = "()V", line = 652)
    public final void init() {
        if (this.method119(48)) {
            this.method117(635, Integer.parseInt(this.getParameter("codeversion")), 0, 503, 32);
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "d", descriptor = "(B)V", line = 663)
    public final void method129(byte arg0) {
        class25.method195((byte) -117);
        class2.method5((byte) 37, class35.field479);
        class25.method193(class35.field479, -127);
        boolean var2 = false;
        class35.field484 = this.field288;
        boolean var3 = true;
        this.field312 = class3.method11(28583);
        this.field286 = class22.method149(-25287);
        if (arg0 != 107) {
            this.field335 = -118;
        }
        if (var3) {
            byte var4 = 0;
            if (this.field286.length == 14) {
                byte var10002 = var4;
                int var5 = var4 + 1;
                this.field355 = this.field286[var10002];
                int var19 = var5;
                int var6 = var5 + 1;
                this.field330 = this.field286[var19];
                int var20 = var6;
                int var7 = var6 + 1;
                this.field340 = this.field286[var20];
                int var21 = var7;
                int var8 = var7 + 1;
                this.field303 = this.field286[var21];
                int var22 = var8;
                int var9 = var8 + 1;
                this.field353 = this.field286[var22];
                int var23 = var9;
                int var10 = var9 + 1;
                this.field288 = this.field286[var23];
                int var24 = var10;
                int var11 = var10 + 1;
                this.field362 = this.field286[var24];
                int var25 = var11;
                int var12 = var11 + 1;
                this.field382 = this.field286[var25];
                int var26 = var12;
                int var13 = var12 + 1;
                this.field327 = this.field286[var26];
                int var27 = var13;
                int var14 = var13 + 1;
                this.field313 = this.field286[var27];
                int var28 = var14;
                int var15 = var14 + 1;
                this.field367 = this.field286[var28];
                int var29 = var15;
                int var16 = var15 + 1;
                this.field359 = this.field286[var29];
                int var17 = var16 + 1;
                int var30 = var17;
                int var18 = var17 + 1;
                this.field304 = this.field286[var30];
                this.field325 = this.field355.method64(-84, 0);
                this.field316 = this.field330.method64(-81, 0);
                this.field381 = this.field340.method64(-124, 0);
                this.field296 = this.method189(this.field325, arg0 + 121);
                this.field335 = this.method189(this.field316, 228);
                this.field354 = this.method189(this.field381, 228);
            } else {
                class21.method143(false, new class10[] { class19.field206 });
            }
        }
        this.field318 = class22.method154(5, 50);
    }

    @OriginalMember(owner = "mapview!mapview", name = "f", descriptor = "(I)V", line = 790)
    public final void method122(int arg0) {
        if (field372) {
            class20.method137(class35.field479, -1);
            class34.method231((byte) -79, class35.field479);
            this.method127((byte) -78);
            class2.method5((byte) 37, class35.field479);
            class25.method193(class35.field479, -105);
        }
        class8.method36(31);
        class18.method124(1);
        if (!class35.field469) {
            return;
        }
        if (class16.field171[96]) {
            class21.field227 = (int) ((double) class21.field227 - 16.0D / this.field319);
            this.field366 = true;
            class11.field88 = -1;
        }
        if (class16.field171[97]) {
            class21.field227 = (int) (16.0D / this.field319 + (double) class21.field227);
            this.field366 = true;
            class11.field88 = -1;
        }
        if (class16.field171[98]) {
            class11.field88 = -1;
            class1.field1 = (int) ((double) class1.field1 - 16.0D / this.field319);
            this.field366 = true;
        }
        if (class16.field171[99]) {
            this.field366 = true;
            class11.field88 = -1;
            class1.field1 = (int) (16.0D / this.field319 + (double) class1.field1);
        }
        while (true) {
            boolean var2;
            label487: do {
                while (true) {
                    while (true) {
                        while (class20.method139(108)) {
                            if (!class40.field519 || !class18.field195) {
                                if (class8.field64 == this.field335 || class8.field64 == this.field316) {
                                    class18.field195 = true;
                                    this.field366 = true;
                                }
                                if (class8.field64 == 49) {
                                    this.field349 = 3.0D;
                                    this.field366 = true;
                                }
                                if (class8.field64 == 50) {
                                    this.field349 = 4.0D;
                                    this.field366 = true;
                                }
                                if (class8.field64 == 51) {
                                    this.field366 = true;
                                    this.field349 = 6.0D;
                                }
                                if (class8.field64 == 52) {
                                    this.field349 = 8.0D;
                                    this.field366 = true;
                                }
                                if (class8.field64 == this.field354 || class8.field64 == this.field381) {
                                    this.field307 = !this.field307;
                                    this.field366 = true;
                                }
                                if (class8.field64 == this.field296 || class8.field64 == this.field325) {
                                    this.field366 = true;
                                    this.field314 = !this.field314;
                                }
                            } else if (class13.field143 == 0) {
                                class18.field195 = false;
                                this.field366 = true;
                                this.field318.method66(0, (byte) 32);
                                class19.field200 = -1;
                            } else {
                                if (class13.field143 != 84) {
                                    var2 = false;
                                    if (class13.field143 == 85) {
                                        if (this.field318.method52((byte) -104) > 0) {
                                            this.field318.method66(this.field318.method52((byte) -117) - 1, (byte) 32);
                                            this.field366 = true;
                                            if (this.field318.method52((byte) -117) == 0) {
                                                class19.field200 = -1;
                                            } else {
                                                var2 = true;
                                            }
                                        }
                                    } else if (class8.field64 != -1 && this.field318.method52((byte) -112) <= class20.field212) {
                                        this.field318.method72(class8.field64, (byte) -128);
                                        this.field366 = true;
                                    }
                                    continue label487;
                                }
                                this.field297 = class1.field1 << 16;
                                class11.field88 = class19.field200;
                                this.field334 = class21.field227 << 16;
                                class18.field195 = false;
                                this.field318.method66(0, (byte) 32);
                                this.field366 = true;
                                class19.field200 = -1;
                            }
                        }
                        int var6 = class7.field57;
                        int var7 = class40.field509;
                        int var8 = class2.field9;
                        int var9 = class4.field32;
                        int var10 = class22.field237;
                        int var11 = class25.field390;
                        if (var6 == 1) {
                            this.field369 = var8;
                            this.field365 = class1.field1;
                            this.field289 = class21.field227;
                            this.field299 = var7;
                            if (class21.field219.length == 1) {
                                if (var7 > this.field310 && var7 < this.field310 + this.field333 && var8 > this.field346 && this.field346 + this.field344 > var8) {
                                    this.field349 = 3.0D;
                                    this.field299 = -1;
                                }
                                if (var7 > this.field380 + this.field310 && this.field380 + this.field310 + this.field333 > var7 && this.field346 < var8 && this.field346 + this.field344 > var8) {
                                    this.field299 = -1;
                                    this.field349 = 4.0D;
                                }
                                if (this.field310 + this.field380 * 2 < var7 && var7 < this.field380 * 2 + this.field333 + this.field310 && this.field346 < var8 && this.field346 + this.field344 > var8) {
                                    this.field299 = -1;
                                    this.field349 = 6.0D;
                                }
                                if (var7 > this.field380 * 3 + this.field310 && var7 < this.field333 + this.field310 + this.field380 * 3 && var8 > this.field346 && this.field346 + this.field344 > var8) {
                                    this.field349 = 8.0D;
                                    this.field299 = -1;
                                }
                            } else {
                                if (var7 > this.field310 && var7 < this.field333 + this.field310 && var8 > this.field346 && this.field346 + this.field293 + this.field344 > var8) {
                                    this.field349 = 3.0D;
                                    this.field299 = -1;
                                }
                                if (this.field310 + this.field380 < var7 && this.field380 + this.field333 + this.field310 > var7 && this.field346 < var8 && var8 < this.field346 + this.field344 + this.field293) {
                                    this.field349 = 4.0D;
                                    this.field299 = -1;
                                }
                                if (var7 > this.field380 * 2 + this.field310 && var7 < this.field380 * 2 + this.field333 + this.field310 && this.field346 < var8 && this.field346 + this.field344 + this.field293 > var8) {
                                    this.field299 = -1;
                                    this.field349 = 6.0D;
                                }
                                if (this.field380 * 3 + this.field310 < var7 && this.field380 * 3 + this.field310 + this.field333 > var7 && var8 > this.field346 && this.field346 + this.field344 + this.field293 > var8) {
                                    this.field349 = 8.0D;
                                    this.field299 = -1;
                                }
                                if (var7 > 170 && var7 < 400 && var8 > 483 && var8 < 503) {
                                    this.method181(this.field306, 118);
                                    this.method179(true);
                                    this.method178(0);
                                    this.field299 = -1;
                                }
                            }
                            this.field342 = false;
                            this.field366 = true;
                            if (this.field315 < var7 && var8 > this.field370 + this.field287 && this.field324 + this.field315 > var7 && var8 < 503) {
                                this.field307 = !this.field307;
                                this.field299 = -1;
                            }
                            if (this.field308 < var7 && this.field358 + this.field336 < var8 && this.field308 + this.field301 > var7 && var8 < 503) {
                                this.field299 = -1;
                                this.field314 = !this.field314;
                            }
                            if (this.field307) {
                                if (this.field315 < var7 && var8 > this.field287 && this.field324 + this.field315 > var7 && this.field287 + 18 > var8 && this.field351 > 0) {
                                    this.field351 -= 24;
                                }
                                if (this.field315 < var7 && var8 > this.field287 && var7 < this.field324 + this.field315 && this.field370 + this.field287 > var8) {
                                    this.field299 = -1;
                                }
                                if (this.field315 < var7 && var8 > this.field287 + this.field370 - 18 && var7 < this.field324 + this.field315 && this.field370 + this.field287 > var8 && this.field351 < 48) {
                                    this.field351 += 24;
                                }
                            }
                            if (this.field314 && var7 > this.field308 && this.field336 < var8 && var7 < this.field308 + this.field301 && var8 < this.field358 + this.field336) {
                                this.field342 = true;
                                this.field299 = -1;
                                class21.field227 = (var7 - this.field308) * class33.field453 / this.field301;
                                class1.field1 = (var8 - this.field336) * class6.field48 / this.field358;
                            }
                            if (class40.field519 && !class18.field195 && !this.field342 && this.field364 < var7 && this.field291 < var8 && this.field364 + this.field377 > var7 && var8 < this.field305 + this.field291) {
                                class18.field195 = true;
                            }
                        }
                        if (this.field307) {
                            this.field331 = -1;
                            if (this.field315 < var10 && this.field324 + this.field315 > var10) {
                                int var12 = this.field287 + 5 + 21;
                                int var13 = this.field298;
                                for (int var14 = 0; var14 < 24; var14++) {
                                    if (var13 < this.field312.length && this.field312[var13].method68(class25.field385, -118)) {
                                        var13++;
                                        var14--;
                                    } else {
                                        if (var12 <= var11 && var11 < var12 + 17) {
                                            if (var6 == 1) {
                                                this.field337 = 50;
                                                this.field347 = var13;
                                            }
                                            this.field331 = var13;
                                        }
                                        var12 += 17;
                                        var13++;
                                    }
                                }
                            }
                            if (this.field341 != this.field331) {
                                this.field341 = this.field331;
                                this.field366 = true;
                            }
                        }
                        if (var9 == 1 && this.field314 && this.field342) {
                            class11.field88 = -1;
                            int var15 = var10;
                            this.field366 = true;
                            int var16 = var11;
                            if (this.field336 > var11) {
                                var16 = this.field336;
                            } else if (var11 > this.field358 + this.field336) {
                                var16 = this.field336 + this.field358;
                            }
                            class1.field1 = (var16 - this.field336) * class6.field48 / this.field358;
                            if (this.field308 > var10) {
                                var15 = this.field308;
                            } else if (var10 > this.field308 + this.field301) {
                                var15 = this.field308 + this.field301;
                            }
                            class21.field227 = (var15 - this.field308) * class33.field453 / this.field301;
                        } else {
                            this.field342 = false;
                        }
                        int var17 = -28 / ((arg0 - 49) / 61);
                        if (var9 == 1 && this.field299 != -1) {
                            this.field366 = true;
                            class21.field227 = (int) ((double) (this.field299 - var10) * 2.0D / this.field349) + this.field289;
                            class11.field88 = -1;
                            class1.field1 = (int) ((double) (this.field369 - var11) * 2.0D / this.field349) + this.field365;
                        }
                        if (this.field349 > this.field319) {
                            this.field366 = true;
                            this.field319 /= 30.0D;
                            if (this.field319 > this.field349) {
                                this.field319 = this.field349;
                            }
                        }
                        if (this.field319 > this.field349) {
                            this.field366 = true;
                            this.field319 /= 30.0D;
                            if (this.field349 > this.field319) {
                                this.field319 = this.field349;
                            }
                        }
                        if (this.field351 > this.field298) {
                            this.field366 = true;
                            this.field298++;
                        }
                        if (this.field298 > this.field351) {
                            this.field366 = true;
                            this.field298--;
                        }
                        if (this.field337 > 0) {
                            this.field337--;
                            this.field366 = true;
                        }
                        if (class11.field88 >= 0) {
                            class13.field144 = this.field339[class11.field88] - field295;
                            class40.field518 = class6.field48 + class19.field201 - this.field332[class11.field88];
                            this.field366 = true;
                            byte var18 = 4;
                            int var19 = class13.field144 - (int) (635.0D / this.field319);
                            int var20 = (int) (635.0D / this.field319) + class13.field144;
                            if (var19 < 48) {
                                class13.field144 = (int) (635.0D / this.field319) + 48;
                            }
                            int var21 = class40.field518 - (int) (503.0D / this.field319);
                            if (var20 > class33.field453 - 48) {
                                class13.field144 = class33.field453 - (int) (635.0D / this.field319) - 48;
                            }
                            class13.field144 <<= 0x10;
                            int var22 = class13.field144 - this.field334;
                            int var23 = (int) (503.0D / this.field319) + class40.field518;
                            if (var21 < 48) {
                                class40.field518 = (int) (503.0D / this.field319) + 48;
                            }
                            if (var23 > class6.field48 - 48) {
                                class40.field518 = class6.field48 - (int) (503.0D / this.field319) - 48;
                            }
                            class40.field518 <<= 0x10;
                            int var24 = class40.field518 - this.field297;
                            if (var22 >> var18 == 0 && var24 >> var18 == 0) {
                                class11.field88 = -1;
                            } else {
                                this.field334 += var22 >> var18;
                                this.field297 += var24 >> var18;
                                class1.field1 = this.field297 >> 16;
                                class21.field227 = this.field334 >> 16;
                            }
                        }
                        int var25 = class1.field1 - (int) (503.0D / this.field319);
                        int var26 = class21.field227 - (int) (635.0D / this.field319);
                        int var27 = class1.field1 + (int) (503.0D / this.field319);
                        int var28 = class21.field227 + (int) (635.0D / this.field319);
                        if (var25 < 48) {
                            class1.field1 = (int) (503.0D / this.field319) + 48;
                        }
                        if (var26 < 48) {
                            class21.field227 = (int) (635.0D / this.field319) + 48;
                        }
                        if (var27 > class6.field48 - 48) {
                            class1.field1 = class6.field48 - (int) (503.0D / this.field319) - 48;
                        }
                        if (class33.field453 - 48 < var28) {
                            class21.field227 = class33.field453 - (int) (635.0D / this.field319) - 48;
                        }
                        return;
                    }
                }
            } while (this.field318.method52((byte) -103) <= 0);
            for (int var3 = 0; var3 < this.field300; var3++) {
                if (this.field368[var3].method52((byte) -107) >= this.field318.method52((byte) -106)) {
                    class10 var4 = this.field318.method53((byte) 119);
                    class10 var5 = this.field368[var3].method56(32, -97, 47).method69(this.field318.method52((byte) -111), -123, 0).method53((byte) 87);
                    if (var4.method50(var5, 255) == 0) {
                        var2 = true;
                        this.field366 = true;
                        class19.field200 = var3;
                        break;
                    }
                }
            }
            if (!var2) {
                this.field318.method66(this.field318.method52((byte) -112) - 1, (byte) 32);
            }
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "b", descriptor = "(I)V", line = 1346)
    public final void method115(int arg0) {
        class28.method211(-38);
        class38.method248(-1);
        try {
            this.field345 = null;
            int var2 = 93 % ((-arg0 - 55) / 53);
            this.field312 = null;
            class16.field176 = null;
            this.field339 = null;
            this.field368 = null;
            this.field328 = null;
            this.field332 = null;
            this.field375 = null;
            System.gc();
        } catch (Throwable var4) {
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(B[BLjava/lang/String;)Z", line = 1368)
    private final boolean method184(byte arg0, byte[] arg1, String arg2) {
        if (arg1 == null) {
            return false;
        }
        try {
            MessageDigest var4 = MessageDigest.getInstance("SHA");
            var4.reset();
            var4.update(arg1);
            byte[] var5 = var4.digest();
            if (arg0 < 11) {
                this.method192(67, -78);
            }
            if (arg2 == "main_file_cache.dat0") {
                if (var5[0] != -63 || var5[1] != -116 || var5[2] != 97 || var5[3] != 118 || var5[4] != 26 || var5[5] != -95 || var5[6] != -38 || var5[7] != 104 || var5[8] != -99 || var5[9] != 111 || var5[10] != -99 || var5[11] != -39 || var5[12] != -46 || var5[13] != -128 || var5[14] != -54 || var5[15] != 3 || var5[16] != -46 || var5[17] != 34 || var5[18] != -27 || var5[19] != 124) {
                    return false;
                }
            } else if (arg2 == "main_file_cache.idx1") {
                if (var5[0] != 52 || var5[1] != 126 || var5[2] != -117 || var5[3] != -96 || var5[4] != 55 || var5[5] != 19 || var5[6] != -40 || var5[7] != 125 || var5[8] != 49 || var5[9] != -77 || var5[10] != 77 || var5[11] != -79 || var5[12] != -93 || var5[13] != -47 || var5[14] != -110 || var5[15] != -122 || var5[16] != 84 || var5[17] != -103 || var5[18] != -78 || var5[19] != 126) {
                    return false;
                }
            } else if (var5[0] != 45 || var5[1] != 3 || var5[2] != -125 || var5[3] != -84 || var5[4] != 74 || var5[5] != -71 || var5[6] != 71 || var5[7] != 42 || var5[8] != 15 || var5[9] != -22 || var5[10] != -39 || var5[11] != -60 || var5[12] != -119 || var5[13] != 50 || var5[14] != -84 || var5[15] != 66 || var5[16] != -36 || var5[17] != -79 || var5[18] != 54 || var5[19] != -48) {
                return false;
            }
            return true;
        } catch (Exception var7) {
            this.method118("sha", (byte) -106);
            return false;
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "g", descriptor = "(I)V", line = 1415)
    public final void method123(int arg0) {
        method188(arg0 ^ 0x0);
        class34.method230(true);
        class10.method58(-26852);
        class1.method1((byte) -77);
        class28.method214((byte) 78);
        class11.method75(arg0 - 14894);
        class18.method121(arg0 + 124);
        class36.method243(-47);
        class16.method112((byte) -123);
        class4.method14(arg0 ^ arg0);
        class6.method21(-20202);
        class41.method257();
        class39.method252(arg0 ^ 0xFFFFFF94);
        class19.method130(-25007);
        class35.method235(false);
        class38.method247(-47);
        class8.method39(112);
        class27.method206();
        class33.method228(-29126);
        class40.method254(arg0);
        class31.method223((byte) -68);
        class23.method167();
        class32.method225((byte) 101);
        class2.method7((byte) 120);
        class22.method151(-9009);
        class7.method33((byte) -127);
        class25.method194(-60);
        class3.method9(24799);
        class21.method145(arg0 ^ 0xFFFFFFFE);
        class14.method98((byte) 69);
        class20.method136(127);
        class9.method42();
        class13.method95(arg0 + 7);
        this.field355 = null;
        this.field318 = null;
        this.field363 = null;
        this.field330 = null;
        this.field362 = null;
        this.field303 = null;
        this.field326 = null;
        this.field327 = null;
        this.field375 = null;
        this.field323 = null;
        this.field313 = null;
        this.field345 = null;
        this.field339 = null;
        this.field312 = null;
        this.field288 = null;
        this.field340 = null;
        this.field286 = null;
        this.field367 = null;
        this.field359 = null;
        this.field368 = null;
        this.field304 = null;
        this.field382 = null;
        this.field352 = null;
        this.field332 = null;
        this.field328 = null;
        this.field374 = null;
        this.field311 = null;
        this.field290 = null;
        this.field361 = null;
        this.field353 = null;
    }

    @OriginalMember(owner = "mapview!mapview", name = "f", descriptor = "(B)Z", line = 1487)
    private final boolean method185(byte arg0) {
        if (class19.field204 == 0) {
            this.method177((byte) -119);
            class19.field204 = 1;
        }
        if (arg0 <= 104) {
            return true;
        }
        if (class19.field204 == 1) {
            class21.field228 = 15;
            boolean var2 = this.method183(-1, this.field313, "main_file_cache.idx0");
            if (!var2) {
                return false;
            }
            class8.field68 = class1.field2;
            class1.field2 = null;
            if (class8.field68 == null) {
                throw new RuntimeException("T1");
            }
            class19.field204 = 2;
        }
        if (class19.field204 == 2) {
            class21.field228 = 30;
            boolean var3 = this.method183(-1, this.field367, "main_file_cache.idx1");
            if (!var3) {
                return false;
            }
            class38.field498 = class1.field2;
            class1.field2 = null;
            if (class38.field498 == null) {
                throw new RuntimeException("T2");
            }
            class19.field204 = 3;
        }
        if (class19.field204 == 3) {
            class19.field204 = 10;
            class21.field219 = new class4[1];
        }
        if (class19.field204 == 10) {
            class21.field228 = 50;
            boolean var4 = this.method183(-1, this.field359, "main_file_cache.dat0");
            if (!var4) {
                return false;
            }
            class21.field219[0] = class1.field2;
            class1.field2 = null;
            if (class21.field219[0] == null) {
                throw new RuntimeException("T3");
            }
            class19.field204 = 20;
        }
        if (class19.field204 != 20) {
            return false;
        }
        class33.field450 = class36.method244(class8.field68, class32.field437, class10.field77, (byte) 69);
        class32.field442 = class33.method227(class32.field437, class8.field68, class35.field471, 115);
        this.field328 = method182(class38.field498, 3, class32.field437, class8.field68, class4.field28);
        this.field374 = new class41(11, true, this);
        this.field352 = new class41(12, true, this);
        this.field323 = new class41(14, true, this);
        this.field326 = new class41(17, true, this);
        this.field290 = new class41(19, true, this);
        this.field361 = new class41(22, true, this);
        this.field311 = new class41(26, true, this);
        this.field363 = new class41(30, true, this);
        class35.field484 = this.field362;
        class21.field228 = 100;
        class40.method253(class35.field484, null, class21.field228, 31);
        this.field377 = this.field328.method157(this.field330) + 20;
        this.method178(0);
        class10[] var5 = this.field312;
        for (int var6 = 0; var6 < var5.length; var6++) {
            class10 var7 = var5[var6];
            int var8 = this.field328.method157(var7);
            if (var8 > this.field292) {
                this.field292 = var8;
            }
        }
        this.field324 = this.field292 + 16 + 18;
        if (this.field324 > 140) {
            int var9 = this.field308 - this.field324 - this.field315;
            this.field378 = var9 / 25;
            this.field333 = this.field378 * 5;
            int var10 = var9 - this.field378 * 25;
            this.field310 = var10 / 2 + this.field378 + this.field315 + this.field324;
            this.field380 = this.field333 + this.field378;
        }
        return true;
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(ILjava/lang/String;[B)V", line = 1635)
    private final void method186(int arg0, String arg1, byte[] arg2) throws IOException {
        FileOutputStream var4 = new FileOutputStream(arg1);
        var4.write(arg2, 0, arg2.length);
        if (arg0 != -1992556080) {
            this.method192(18, 18);
        }
        var4.close();
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(IIIIIIIIB)V", line = 1668)
    private final void method187(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte arg8) {
        int var10 = 11 / ((arg8 + 44) / 62);
        class16.field176.method26(arg7, -1, arg4, arg0, arg1, arg5, arg2, arg6, arg3);
        if (arg3 - arg7 > -arg0 + arg1) {
            return;
        }
        class16.field176.method30(arg3, arg4, arg0, this.field319, arg1, arg7, arg5, arg2, arg6, (byte) -96);
        class16.field176.method24(arg2, arg3, (byte) -97, arg1, arg5, arg4, arg6, arg0, arg7);
        class16.field176.method28(arg5, arg7, this.field337, arg6, arg0, arg1, arg2, this.field347, arg4, (byte) -114, arg3);
        if (this.field349 == this.field319 && class17.field184) {
            for (int var11 = 0; var11 < this.field300; var11++) {
                int var12 = this.field339[var11];
                int var13 = var12 - field295;
                int var14 = (arg1 - arg0) * (-arg7 + var13) / (arg3 - arg7) + arg0;
                int var15 = this.field332[var11];
                int var16 = class6.field48 + class19.field201 - var15;
                int var17 = this.field345[var11];
                int var18 = 16777215;
                int var19 = (arg5 - arg4) * (-arg6 + var16) / (arg2 - arg6) + arg4;
                class41 var20 = null;
                if (var17 == 0) {
                    if (this.field319 == 3.0D) {
                        var20 = this.field374;
                    }
                    if (this.field319 == 4.0D) {
                        var20 = this.field352;
                    }
                    if (this.field319 == 6.0D) {
                        var20 = this.field323;
                    }
                    if (this.field319 == 8.0D) {
                        var20 = this.field326;
                    }
                }
                if (var17 == 1) {
                    if (this.field319 == 3.0D) {
                        var20 = this.field323;
                    }
                    if (this.field319 == 4.0D) {
                        var20 = this.field326;
                    }
                    if (this.field319 == 6.0D) {
                        var20 = this.field290;
                    }
                    if (this.field319 == 8.0D) {
                        var20 = this.field361;
                    }
                }
                if (var17 == 2) {
                    var18 = 16755200;
                    if (this.field319 == 3.0D) {
                        var20 = this.field290;
                    }
                    if (this.field319 == 4.0D) {
                        var20 = this.field361;
                    }
                    if (this.field319 == 6.0D) {
                        var20 = this.field311;
                    }
                    if (this.field319 == 8.0D) {
                        var20 = this.field363;
                    }
                }
                if (var20 != null) {
                    class10 var21 = this.field368[var11];
                    int var22 = 1;
                    for (int var23 = 0; var21.method52((byte) -108) > var23; var23++) {
                        if (var21.method64(-32, var23) == 47) {
                            var22++;
                        }
                    }
                    int var24 = var19 - var20.method264() * (var22 - 1) / 2;
                    int var25 = var24 + var20.method261() / 2;
                    while (true) {
                        int var26 = var21.method71(0, 47);
                        if (var26 == -1) {
                            var20.method256(var21, var14, var25, var18, true);
                            break;
                        }
                        class10 var27 = var21.method69(var26, -123, 0);
                        var20.method256(var27, var14, var25, var18, true);
                        var25 += var20.method264();
                        var21 = var21.method67((byte) -93, var26 + 1);
                    }
                }
            }
        }
        if (!class31.field424) {
            return;
        }
        for (int var28 = field295 / 64; var28 < (field295 + class33.field453) / 64; var28++) {
            for (int var29 = class19.field201 / 64; var29 < (class6.field48 + class19.field201) / 64; var29++) {
                int var30 = var28 * 64;
                int var31 = var30 - field295;
                int var32 = var29 * 64;
                int var33 = (arg1 - arg0) * (-arg7 + var31) / (arg3 - arg7) + arg0;
                int var34 = class6.field48 + class19.field201 - var32;
                int var35 = (var31 + 64 - arg7) * (-arg0 + arg1) / (arg3 - arg7) + arg0;
                int var36 = (var34 - arg6 - 64) * (-arg4 + arg5) / (arg2 - arg6) + arg4;
                int var37 = arg4 + (var34 - arg6) * (-arg4 + arg5) / (arg2 - arg6);
                class27.method200(var33, var36, var35 - var33, -var36 + var37, 16777215);
                this.field328.method171(class3.method10(new class10[] { class11.method84(-3, var28), class16.field175, class11.method84(-3, var29) }, true), var35 - 5, var37 + -5, 16777215, -1);
                if (var28 == 33 && var29 >= 71 && var29 <= 73) {
                    this.field328.method163(class13.field112, (var33 + var35) / 2, (var36 + var37) / 2, 16711680, -1);
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "k", descriptor = "(I)V", line = 1888)
    public static void method188(int arg0) {
        field383 = null;
        field376 = null;
        field317 = null;
        field294 = null;
        field302 = null;
        field320 = null;
        field338 = null;
        if (arg0 != -1) {
            field294 = null;
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "b", descriptor = "(II)I", line = 1906)
    private final int method189(int arg0, int arg1) {
        if (arg1 != 228) {
            this.method114((byte) -126);
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
            return class20.method140(109, arg0);
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "c", descriptor = "(II)I", line = 1997)
    private final int method190(int arg0, int arg1) {
        arg1++;
        if (arg0 != 22388) {
            this.method180(47, null, null);
        }
        if (arg1 >= class21.field219.length) {
            arg1 = 0;
        }
        return arg1;
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(ILjava/lang/String;)[B", line = 2062)
    private final byte[] method191(int arg0, String arg1) throws IOException {
        File var3 = new File(arg1);
        if (!var3.exists()) {
            return null;
        }
        if (arg0 >= -38) {
            this.field328 = null;
        }
        int var4 = (int) var3.length();
        DataInputStream var5 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg1)));
        byte[] var6 = new byte[var4];
        var5.readFully(var6, 0, var4);
        var5.close();
        return var6;
    }

    @OriginalMember(owner = "mapview!mapview", name = "d", descriptor = "(II)V", line = 2107)
    private final void method192(int arg0, int arg1) {
        if (class21.field219.length > arg1) {
            class4 var3 = class21.field219[arg1];
            class11 var4 = new class11(var3.method234(class11.field85, arg0 ^ 0x2D, class38.field496));
            var4.method76(-13232);
            class11 var5 = new class11(var3.method234(class39.field503, 2, class38.field496));
            this.field300 = var5.method74((byte) -112);
            for (int var6 = 0; var6 < this.field300; var6++) {
                this.field368[var6] = var5.method76(class32.method226(arg0, -13185));
                this.field339[var6] = var5.method74((byte) -118);
                this.field332[var6] = var5.method74((byte) -97);
                this.field345[var6] = var5.method78(-87);
                class10 var7 = this.field368[var6].method56(32, -30, 47);
                int var8 = this.field328.method157(var7);
                if (this.field356 < var8) {
                    this.field356 = var8;
                }
                int var9 = this.field328.method157(this.field382);
                if (this.field356 < var9) {
                    this.field356 = var9;
                }
            }
            class16.field176 = new class6();
            class16.field176.method25(3, class21.field219[arg1]);
            class21.field227 = class18.field190;
            this.field358 = 180;
            this.field301 = class33.field453 * this.field358 / class6.field48;
            this.field336 = 503 - this.field358 - 20;
            this.field308 = 635 - this.field301 - 5;
            class1.field1 = class28.field404;
            this.field375 = new class30(this.field301, this.field358);
            this.field375.method217();
            this.method187(0, this.field301, class6.field48, class33.field453, 0, this.field358, 0, 0, (byte) -112);
            class27.method200(0, 0, this.field301, this.field358, 0);
            class27.method200(1, 1, this.field301 - 2, this.field358 - 2, this.field343);
            class33.field451.method111(-128);
        }
        if (arg0 != 47) {
            this.method122(-19);
        }
    }
}
