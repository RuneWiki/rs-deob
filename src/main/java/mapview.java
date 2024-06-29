import java.awt.Canvas;
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
public class mapview extends class30 {

    @OriginalMember(owner = "mapview!mapview", name = "q", descriptor = "D")
    private double field323 = 4.0D;

    @OriginalMember(owner = "mapview!mapview", name = "Z", descriptor = "I")
    private int field358 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "m", descriptor = "I")
    private int field319 = 23;

    @OriginalMember(owner = "mapview!mapview", name = "u", descriptor = "I")
    private int field327 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "db", descriptor = "I")
    private int field362 = 40;

    @OriginalMember(owner = "mapview!mapview", name = "O", descriptor = "I")
    private int field347 = 471;

    @OriginalMember(owner = "mapview!mapview", name = "F", descriptor = "Z")
    private boolean field338 = false;

    @OriginalMember(owner = "mapview!mapview", name = "ub", descriptor = "I")
    private int field379 = 170;

    @OriginalMember(owner = "mapview!mapview", name = "r", descriptor = "I")
    private int field324 = -1;

    @OriginalMember(owner = "mapview!mapview", name = "l", descriptor = "D")
    private double field318 = 4.0D;

    @OriginalMember(owner = "mapview!mapview", name = "nb", descriptor = "I")
    private int field372 = 11141120;

    @OriginalMember(owner = "mapview!mapview", name = "w", descriptor = "I")
    private int field329 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "ob", descriptor = "I")
    private int field373 = 500;

    @OriginalMember(owner = "mapview!mapview", name = "N", descriptor = "Lta;")
    private class37 field346 = this.field338 ? class15.field162 : class15.field162;

    @OriginalMember(owner = "mapview!mapview", name = "M", descriptor = "Lta;")
    private class37 field345 = this.field338 ? class30.field446 : class30.field446;

    @OriginalMember(owner = "mapview!mapview", name = "X", descriptor = "Lta;")
    private class37 field356 = this.field338 ? class25.field308 : class27.field433;

    @OriginalMember(owner = "mapview!mapview", name = "Db", descriptor = "Lta;")
    private class37 field388 = this.field338 ? class14.field153 : class41.field539;

    @OriginalMember(owner = "mapview!mapview", name = "Jb", descriptor = "Z")
    private boolean field394 = false;

    @OriginalMember(owner = "mapview!mapview", name = "Ab", descriptor = "I")
    private int field385 = 8943445;

    @OriginalMember(owner = "mapview!mapview", name = "o", descriptor = "[I")
    private int[] field321 = new int[this.field373];

    @OriginalMember(owner = "mapview!mapview", name = "lb", descriptor = "I")
    private int field370 = 8912896;

    @OriginalMember(owner = "mapview!mapview", name = "Y", descriptor = "I")
    private int field357 = this.field338 ? 83 : 70;

    @OriginalMember(owner = "mapview!mapview", name = "H", descriptor = "I")
    private int field340 = 5;

    @OriginalMember(owner = "mapview!mapview", name = "Cb", descriptor = "I")
    private int field387 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "bb", descriptor = "[I")
    private int[] field360 = new int[this.field373];

    @OriginalMember(owner = "mapview!mapview", name = "xb", descriptor = "I")
    private int field382 = 140;

    @OriginalMember(owner = "mapview!mapview", name = "qb", descriptor = "I")
    private int field375 = this.field338 ? 115 : 102;

    @OriginalMember(owner = "mapview!mapview", name = "gb", descriptor = "I")
    private int field365 = 10;

    @OriginalMember(owner = "mapview!mapview", name = "yb", descriptor = "I")
    private int field383 = this.field338 ? 108 : 107;

    @OriginalMember(owner = "mapview!mapview", name = "ib", descriptor = "I")
    private int field367 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "s", descriptor = "[Lta;")
    private class37[] field325 = new class37[this.field373];

    @OriginalMember(owner = "mapview!mapview", name = "Gb", descriptor = "I")
    private int field391 = this.field338 ? 252 : 111;

    @OriginalMember(owner = "mapview!mapview", name = "Sb", descriptor = "I")
    private int field403 = -1;

    @OriginalMember(owner = "mapview!mapview", name = "G", descriptor = "Lta;")
    private class37 field339 = this.field338 ? class2.field21 : class2.field21;

    @OriginalMember(owner = "mapview!mapview", name = "Ub", descriptor = "Z")
    private boolean field405 = false;

    @OriginalMember(owner = "mapview!mapview", name = "Eb", descriptor = "I")
    private int field389 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "sb", descriptor = "Lta;")
    private class37 field377 = this.field338 ? class20.field223 : class20.field223;

    @OriginalMember(owner = "mapview!mapview", name = "Lb", descriptor = "I")
    private int field396 = -1;

    @OriginalMember(owner = "mapview!mapview", name = "J", descriptor = "Lta;")
    private class37 field342 = this.field338 ? class6.field70 : class6.field70;

    @OriginalMember(owner = "mapview!mapview", name = "Rb", descriptor = "I")
    private int field402 = -20;

    @OriginalMember(owner = "mapview!mapview", name = "Ob", descriptor = "I")
    private int field399 = 5;

    @OriginalMember(owner = "mapview!mapview", name = "W", descriptor = "Lta;")
    private class37 field355 = this.field338 ? field401 : field401;

    @OriginalMember(owner = "mapview!mapview", name = "Bb", descriptor = "I")
    private int field386 = 33;

    @OriginalMember(owner = "mapview!mapview", name = "Nb", descriptor = "I")
    private int field398 = 450;

    @OriginalMember(owner = "mapview!mapview", name = "Vb", descriptor = "I")
    private int field406 = 7824964;

    @OriginalMember(owner = "mapview!mapview", name = "Fb", descriptor = "Lta;")
    private class37 field390 = this.field338 ? class25.field316 : class25.field316;

    @OriginalMember(owner = "mapview!mapview", name = "tb", descriptor = "I")
    private int field378 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "fb", descriptor = "Lta;")
    private class37 field364 = this.field338 ? class36.field493 : class36.field493;

    @OriginalMember(owner = "mapview!mapview", name = "Yb", descriptor = "Lta;")
    private class37 field409 = this.field338 ? class6.field73 : class6.field73;

    @OriginalMember(owner = "mapview!mapview", name = "Mb", descriptor = "I")
    private int field397 = 50;

    @OriginalMember(owner = "mapview!mapview", name = "ac", descriptor = "Z")
    private boolean field411 = false;

    @OriginalMember(owner = "mapview!mapview", name = "pb", descriptor = "Lta;")
    private class37 field374 = this.field338 ? class27.field437 : class27.field437;

    @OriginalMember(owner = "mapview!mapview", name = "Wb", descriptor = "I")
    private int field407 = 5;

    @OriginalMember(owner = "mapview!mapview", name = "mb", descriptor = "I")
    private int field371 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "fc", descriptor = "I")
    private int field416 = 30;

    @OriginalMember(owner = "mapview!mapview", name = "S", descriptor = "I")
    private int field351 = this.field338 ? 220 : 79;

    @OriginalMember(owner = "mapview!mapview", name = "dc", descriptor = "I")
    private int field414 = this.field397 + this.field365;

    @OriginalMember(owner = "mapview!mapview", name = "kb", descriptor = "[I")
    private int[] field369 = new int[this.field373];

    @OriginalMember(owner = "mapview!mapview", name = "Zb", descriptor = "I")
    private int field410 = 6706483;

    @OriginalMember(owner = "mapview!mapview", name = "L", descriptor = "I")
    private int field344 = 10027008;

    @OriginalMember(owner = "mapview!mapview", name = "ic", descriptor = "Z")
    private boolean field419 = true;

    @OriginalMember(owner = "mapview!mapview", name = "Kb", descriptor = "I")
    private int field395 = this.field338 ? 76 : 75;

    @OriginalMember(owner = "mapview!mapview", name = "hc", descriptor = "Lta;")
    private class37 field418 = this.field338 ? field332 : class2.field16;

    @OriginalMember(owner = "mapview!mapview", name = "t", descriptor = "Lta;")
    public static class37 field326 = class20.method87(-118, "POH Portal");

    @OriginalMember(owner = "mapview!mapview", name = "E", descriptor = "Lta;")
    private static class37 field337 = class20.method87(-85, " map");

    @OriginalMember(owner = "mapview!mapview", name = "V", descriptor = "Lta;")
    public static class37 field354 = class20.method87(-114, "Spice Shop");

    @OriginalMember(owner = "mapview!mapview", name = "ab", descriptor = "Lta;")
    public static class37 field359 = class20.method87(-97, "Sandpit");

    @OriginalMember(owner = "mapview!mapview", name = "jb", descriptor = "Lta;")
    private static class37 field368 = class20.method87(-104, "_");

    @OriginalMember(owner = "mapview!mapview", name = "v", descriptor = "Lta;")
    private static class37 field328 = class20.method87(-106, "details)3dat");

    @OriginalMember(owner = "mapview!mapview", name = "T", descriptor = "Lta;")
    public static class37 field352 = class20.method87(-84, "Loom");

    @OriginalMember(owner = "mapview!mapview", name = "bc", descriptor = "Z")
    public static volatile boolean field412 = false;

    @OriginalMember(owner = "mapview!mapview", name = "Xb", descriptor = "J")
    public static long field408 = 0L;

    @OriginalMember(owner = "mapview!mapview", name = "I", descriptor = "Lta;")
    public static class37 field341 = class20.method87(-87, "details)3dat");

    @OriginalMember(owner = "mapview!mapview", name = "Qb", descriptor = "Lta;")
    private static class37 field401 = class20.method87(-122, "Prev page");

    @OriginalMember(owner = "mapview!mapview", name = "z", descriptor = "Lta;")
    private static class37 field332 = class20.method87(-120, "-5bersicht");

    @OriginalMember(owner = "mapview!mapview", name = "rb", descriptor = "Lta;")
    public static class37 field376 = class20.method87(-83, "Potters Wheel");

    @OriginalMember(owner = "mapview!mapview", name = "B", descriptor = "Z")
    private static boolean field334 = true;

    @OriginalMember(owner = "mapview!mapview", name = "Ib", descriptor = "Lta;")
    public static class37 field393 = class20.method87(-122, "Platebody Shop");

    @OriginalMember(owner = "mapview!mapview", name = "gc", descriptor = "Lta;")
    public static class37 field417 = class20.method87(-105, "Rare Trees");

    @OriginalMember(owner = "mapview!mapview", name = "p", descriptor = "I")
    private int field322;

    @OriginalMember(owner = "mapview!mapview", name = "Q", descriptor = "I")
    private int field349;

    @OriginalMember(owner = "mapview!mapview", name = "vb", descriptor = "I")
    private int field380;

    @OriginalMember(owner = "mapview!mapview", name = "zb", descriptor = "I")
    private int field384;

    @OriginalMember(owner = "mapview!mapview", name = "Hb", descriptor = "I")
    private int field392;

    @OriginalMember(owner = "mapview!mapview", name = "Pb", descriptor = "I")
    private int field400;

    @OriginalMember(owner = "mapview!mapview", name = "Tb", descriptor = "I")
    private int field404;

    @OriginalMember(owner = "mapview!mapview", name = "cc", descriptor = "I")
    private int field413;

    @OriginalMember(owner = "mapview!mapview", name = "jc", descriptor = "I")
    public static int field420;

    @OriginalMember(owner = "mapview!mapview", name = "U", descriptor = "Lga;")
    private class13 field353;

    @OriginalMember(owner = "mapview!mapview", name = "x", descriptor = "Li;")
    private class16 field330;

    @OriginalMember(owner = "mapview!mapview", name = "C", descriptor = "Li;")
    private class16 field335;

    @OriginalMember(owner = "mapview!mapview", name = "D", descriptor = "Li;")
    private class16 field336;

    @OriginalMember(owner = "mapview!mapview", name = "P", descriptor = "Li;")
    private class16 field348;

    @OriginalMember(owner = "mapview!mapview", name = "R", descriptor = "Li;")
    private class16 field350;

    @OriginalMember(owner = "mapview!mapview", name = "cb", descriptor = "Li;")
    private class16 field361;

    @OriginalMember(owner = "mapview!mapview", name = "eb", descriptor = "Li;")
    private class16 field363;

    @OriginalMember(owner = "mapview!mapview", name = "ec", descriptor = "Li;")
    private class16 field415;

    @OriginalMember(owner = "mapview!mapview", name = "k", descriptor = "Loa;")
    private class29 field317;

    @OriginalMember(owner = "mapview!mapview", name = "wb", descriptor = "Lta;")
    private class37 field381;

    @OriginalMember(owner = "mapview!mapview", name = "n", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field320;

    @OriginalMember(owner = "mapview!mapview", name = "hb", descriptor = "Ljava/lang/String;")
    private static String field366;

    @OriginalMember(owner = "mapview!mapview", name = "y", descriptor = "[Lga;")
    public static class13[] field331;

    @OriginalMember(owner = "mapview!mapview", name = "A", descriptor = "[Lta;")
    private class37[] field333;

    @OriginalMember(owner = "mapview!mapview", name = "K", descriptor = "[Lta;")
    private class37[] field343;

    @OriginalMember(owner = "mapview!mapview", name = "j", descriptor = "(I)V", line = 4)
    private final void method142(int arg0) {
        class14.field155 = false;
        try {
            Graphics var2 = field320.getGraphics();
            class37.field508.method141(var2, 0, true, 0);
            if (arg0 != 17124) {
                this.method142(108);
            }
        } catch (Exception var4) {
            field320.repaint();
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "k", descriptor = "(I)Z", line = 29)
    private final boolean method143(int arg0) {
        if (class2.field20 == 0) {
            this.method152(22905);
            class2.field20 = 1;
        }
        if (arg0 <= 96) {
            return true;
        }
        if (class2.field20 == 1) {
            class12.field142 = 15;
            boolean var2 = this.method151(true, this.field390, "main_file_cache.idx0");
            if (!var2) {
                return false;
            }
            class37.field511 = class1.field6;
            class1.field6 = null;
            if (class37.field511 == null) {
                throw new RuntimeException("T1");
            }
            class2.field20 = 2;
        }
        if (class2.field20 == 2) {
            class12.field142 = 30;
            boolean var3 = this.method151(true, this.field364, "main_file_cache.idx1");
            if (!var3) {
                return false;
            }
            class4.field45 = class1.field6;
            class1.field6 = null;
            if (class4.field45 == null) {
                throw new RuntimeException("T2");
            }
            class2.field20 = 3;
        }
        if (class2.field20 == 3) {
            class2.field20 = 10;
            class25.field311 = new class10[1];
        }
        if (class2.field20 == 10) {
            class12.field142 = 50;
            boolean var4 = this.method151(true, this.field377, "main_file_cache.dat0");
            if (!var4) {
                return false;
            }
            class25.field311[0] = class1.field6;
            class1.field6 = null;
            if (class25.field311[0] == null) {
                throw new RuntimeException("T3");
            }
            class2.field20 = 20;
        }
        if (class2.field20 != 20) {
            return false;
        }
        class9.field101 = class35.method213(class11.field119, class41.field540, class37.field511, 31605);
        field331 = class20.method90(class37.field511, class41.field540, false, class6.field65);
        this.field317 = class26.method170(class4.field45, class10.field111, -1, class41.field540, class37.field511);
        this.field330 = new class16(11, true, this);
        this.field350 = new class16(12, true, this);
        this.field336 = new class16(14, true, this);
        this.field361 = new class16(17, true, this);
        this.field363 = new class16(19, true, this);
        this.field348 = new class16(22, true, this);
        this.field415 = new class16(26, true, this);
        this.field335 = new class16(30, true, this);
        class12.field142 = 100;
        class12.field139 = this.field374;
        class23.method115(class12.field142, null, false, class12.field139);
        this.field362 = this.field317.method125(this.field356) + 20;
        this.method148(-30023);
        class37[] var5 = this.field343;
        for (int var6 = 0; var6 < var5.length; var6++) {
            class37 var7 = var5[var6];
            int var8 = this.field317.method125(var7);
            if (var8 > this.field404) {
                this.field404 = var8;
            }
        }
        this.field382 = this.field404 + 18 + 16;
        if (this.field382 > 140) {
            int var9 = this.field400 - this.field382 - this.field407;
            this.field365 = var9 / 25;
            this.field397 = this.field365 * 5;
            this.field414 = this.field397 + this.field365;
            int var10 = var9 - this.field365 * 25;
            this.field379 = this.field407 + this.field382 + var10 / 2 + this.field365;
        }
        return true;
    }

    @OriginalMember(owner = "mapview!mapview", name = "<init>", descriptor = "()V", line = 2213)
    public mapview() {
        if (class30.field451) {
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(ILjava/lang/String;[B)Z", line = 172)
    private final boolean method144(int arg0, String arg1, byte[] arg2) {
        if (arg2 == null) {
            return false;
        }
        if (arg0 != 91) {
            this.method163(50);
        }
        try {
            MessageDigest var4 = MessageDigest.getInstance("SHA");
            var4.reset();
            var4.update(arg2);
            byte[] var5 = var4.digest();
            if (arg1 == "main_file_cache.dat0") {
                if (var5[0] != 108 || var5[1] != -85 || var5[2] != -39 || var5[3] != 86 || var5[4] != -125 || var5[5] != -112 || var5[6] != 77 || var5[7] != -119 || var5[8] != -92 || var5[9] != -123 || var5[10] != -67 || var5[11] != -115 || var5[12] != -92 || var5[13] != 27 || var5[14] != 90 || var5[15] != -125 || var5[16] != -113 || var5[17] != 59 || var5[18] != 89 || var5[19] != -40) {
                    return false;
                }
            } else if (arg1 == "main_file_cache.idx1") {
                if (var5[0] != 52 || var5[1] != 126 || var5[2] != -117 || var5[3] != -96 || var5[4] != 55 || var5[5] != 19 || var5[6] != -40 || var5[7] != 125 || var5[8] != 49 || var5[9] != -77 || var5[10] != 77 || var5[11] != -79 || var5[12] != -93 || var5[13] != -47 || var5[14] != -110 || var5[15] != -122 || var5[16] != 84 || var5[17] != -103 || var5[18] != -78 || var5[19] != 126) {
                    return false;
                }
            } else if (var5[0] != 77 || var5[1] != -47 || var5[2] != 82 || var5[3] != 99 || var5[4] != -75 || var5[5] != 29 || var5[6] != -93 || var5[7] != 32 || var5[8] != -27 || var5[9] != 85 || var5[10] != 72 || var5[11] != -124 || var5[12] != -10 || var5[13] != 92 || var5[14] != -119 || var5[15] != -63 || var5[16] != -62 || var5[17] != 71 || var5[18] != -92 || var5[19] != -75) {
                return false;
            }
            return true;
        } catch (Exception var7) {
            this.method177("sha", (byte) 29);
            return false;
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(Ljava/lang/String;ILta;)Z", line = 226)
    private final boolean method145(String arg0, int arg1, class37 arg2) {
        try {
            if (class25.field303 == null) {
                String var4;
                if (arg0 == "main_file_cache.dat0") {
                    var4 = "worldmap.main.js5?crc=-159725974";
                } else if (arg0 == "main_file_cache.dat1") {
                    var4 = "worldmap.dungeon.js5?crc=-997959221";
                } else if (arg0 == "main_file_cache.dat2") {
                    var4 = "worldmap.extra.js5?crc=-1562007147";
                } else if (arg0 == "main_file_cache.idx1") {
                    var4 = "mapview.fontmetrics.js5?crc=-447025815";
                } else {
                    var4 = "mapview.sprites.js5?crc=2068520296";
                }
                class12.field139 = class5.method20(-123, new class37[] { this.field339, class27.field435, arg2 });
                class25.field303 = new DataInputStream((new URL(this.getCodeBase(), var4)).openStream());
                int var5;
                if (arg0 == "main_file_cache.dat0") {
                    var5 = 429427;
                } else if (arg0 == "main_file_cache.dat1") {
                    var5 = 155033;
                } else if (arg0 == "main_file_cache.dat2") {
                    var5 = 166018;
                } else if (arg0 == "main_file_cache.idx1") {
                    var5 = 165;
                } else {
                    var5 = 9985;
                }
                class36.field491 = 0;
                class20.field221 = new byte[var5];
                class2.field18 = 0;
            }
            int var6 = class20.field221.length;
            int var7 = class2.field18;
            if (var7 >= var6) {
                class25.field303.close();
                if (arg1 != 0) {
                    this.method156(124);
                }
                class25.field303 = null;
                if (!this.method144(91, arg0, class20.field221)) {
                    this.method177("download", (byte) 29);
                    class20.field221 = null;
                }
                return true;
            }
            class36.field491++;
            if (class36.field491 >= 1500) {
                throw new IOException();
            }
            DataInputStream var8 = class25.field303;
            int var9 = var8.available();
            if (var9 < 0) {
                throw new EOFException();
            } else if (var9 == 0) {
                return false;
            } else {
                if (var6 - var7 < var9) {
                    var9 = var6 - var7;
                }
                int var10 = var8.read(class20.field221, var7, var9);
                if (var10 < 0) {
                    throw new EOFException();
                } else if (var10 == 0) {
                    return false;
                } else {
                    class36.field491 = 0;
                    int var11 = var7 + var10;
                    int var12 = var11 * 100 / var6;
                    class12.field139 = class5.method20(arg1 ^ 0xFFFFFF8E, new class37[] { this.field342, class27.field435, arg2, class25.field313, class14.method60(arg1 + 3038, var12), class8.field92 });
                    class2.field18 = var11;
                    return false;
                }
            }
        } catch (IOException var16) {
            try {
                class25.field303.close();
            } catch (Exception var15) {
            }
            class25.field303 = null;
            class20.field221 = null;
            this.method177(new String("download"), (byte) 29);
            return true;
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(B[BLjava/lang/String;)V", line = 361)
    private final void method146(byte arg0, byte[] arg1, String arg2) throws IOException {
        if (arg0 != 104) {
            field366 = null;
        }
        FileOutputStream var4 = new FileOutputStream(arg2);
        var4.write(arg1, 0, arg1.length);
        var4.close();
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(ZLjava/lang/String;)[B", line = 387)
    private final byte[] method147(boolean arg0, String arg1) throws IOException {
        if (!arg0) {
            return (byte[]) null;
        }
        File var3 = new File(arg1);
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

    @OriginalMember(owner = "mapview!mapview", name = "l", descriptor = "(I)V", line = 409)
    private final void method148(int arg0) {
        if (class25.field311.length == 1) {
            class9.field96 = 0;
        } else {
            if (class1.field5 < 0) {
                class9.field96 = this.method150(class9.field96, (byte) -56);
            } else {
                class9.field96 = class1.field5;
            }
            class1.field5 = this.method150(class9.field96, (byte) -56);
        }
        if (arg0 != -30023) {
            method154((byte) -10);
        }
        this.method161(class9.field96, (byte) -45);
    }

    @OriginalMember(owner = "mapview!mapview", name = "m", descriptor = "(I)I", line = 434)
    public static final int method149(int arg0) {
        if (arg0 != 28496) {
            field326 = null;
        }
        if (class2.field12 == null) {
            return 0;
        } else if (class2.field12.field441 == null) {
            return class1.field10[class2.field12.field439 & 0xFF];
        } else {
            return class1.field10[class2.field12.field441[class11.field127] & 0xFF];
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(IB)I", line = 455)
    private final int method150(int arg0, byte arg1) {
        arg0++;
        if (arg1 != -56) {
            this.field381 = null;
        }
        if (class25.field311.length <= arg0) {
            arg0 = 0;
        }
        return arg0;
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(ZLta;Ljava/lang/String;)Z", line = 502)
    private final boolean method151(boolean arg0, class37 arg1, String arg2) {
        byte[] var4 = null;
        if (!class7.field90) {
            if (field366 != null) {
                try {
                    var4 = this.method147(true, field366 + "/" + arg2);
                    if (!this.method144(91, arg2, var4)) {
                        var4 = null;
                    }
                    if (var4 != null) {
                        class1.field6 = new class10(var4, false, true);
                        return true;
                    }
                } catch (IOException var11) {
                    var4 = null;
                }
            }
            class7.field90 = true;
        }
        if (var4 == null) {
            boolean var6 = this.method145(arg2, 0, arg1);
            if (!var6) {
                return false;
            }
            var4 = class20.field221;
            class20.field221 = null;
        }
        if (var4 == null) {
            class7.field90 = false;
            return true;
        }
        if (field366 != null && var4 != null) {
            try {
                this.method146((byte) 104, var4, field366 + "/" + arg2);
            } catch (IOException var10) {
            }
        }
        try {
            class1.field6 = new class10(var4, false, arg0);
            class7.field90 = false;
            return true;
        } catch (IOException var9) {
            throw class8.method35(var9, "monkey feet");
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "n", descriptor = "(I)V", line = 573)
    private final void method152(int arg0) {
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
        if (arg0 != 22905) {
            return;
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
                        field366 = var8 + var5 + "/rsmap/";
                        return;
                    }
                }
            } catch (Exception var14) {
            }
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(II)I", line = 649)
    private final int method153(int arg0, int arg1) {
        if (arg0 != -22957) {
            this.field403 = -113;
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
            return class15.method64(65, arg1);
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "c", descriptor = "(B)V", line = 709)
    public static void method154(byte arg0) {
        field320 = null;
        field366 = null;
        field337 = null;
        field352 = null;
        field368 = null;
        field331 = null;
        field328 = null;
        if (arg0 != 42) {
            field328 = null;
        }
        field341 = null;
        field326 = null;
        field354 = null;
        field393 = null;
        field376 = null;
        field332 = null;
        field417 = null;
        field359 = null;
        field401 = null;
    }

    @OriginalMember(owner = "mapview!mapview", name = "h", descriptor = "(I)V", line = 795)
    public final void method155(int arg0) {
        if (!class37.field512) {
            class37.field512 = this.method143(118);
            class23.method115(class12.field142, null, false, class12.field139);
            return;
        }
        if (this.field419) {
            this.field419 = false;
            class14.field155 = true;
            class22.method105();
            int var2 = class7.field82 - (int) (635.0D / this.field323);
            int var3 = class1.field4 - (int) (503.0D / this.field323);
            int var4 = class7.field82 + (int) (635.0D / this.field323);
            int var5 = class1.field4 + (int) (503.0D / this.field323);
            this.method159(var2, var4, var3, 635, -70, 0, var5, 0, 503);
            if (this.field394) {
                this.field353.method58(this.field400, this.field413);
                class22.method106(this.field322 * var2 / class31.field458 + this.field400, this.field384 * var3 / class37.field500 + this.field413, (var4 - var2) * this.field322 / class31.field458, (var5 - var3) * this.field384 / class37.field500, 16711680, 128);
                class22.method114(this.field322 * var2 / class31.field458 + this.field400, this.field384 * var3 / class37.field500 + this.field413, (var4 - var2) * this.field322 / class31.field458, (var5 - var3) * this.field384 / class37.field500, 16711680);
                if (this.field327 > 0 && this.field327 % 10 < 5) {
                    for (int var6 = 0; var6 < class4.field53; var6++) {
                        if (class7.field85.field481[var6] == this.field324) {
                            int var7 = class7.field85.field483[var6] * this.field322 / class31.field458 + this.field400;
                            int var8 = this.field413 + class7.field85.field480[var6] * this.field384 / class37.field500;
                            class22.method104(var7, var8, 2, 16776960, 256);
                        }
                    }
                }
            }
            if (this.field405) {
                this.method160(10066329, 5592405, this.field386, this.field407, (byte) -104, 7829367, this.field355, this.field382, 18);
                this.method160(10066329, 5592405, this.field386 + 18, this.field407, (byte) -121, 7829367, class41.field540, this.field382, this.field398 - 36);
                this.method160(10066329, 5592405, this.field398 + this.field386 - 18, this.field407, (byte) 107, 7829367, this.field409, this.field382, 18);
                int var9 = this.field386 + 3 + 18;
                int var10 = this.field389;
                for (int var11 = 0; var11 < 24; var11++) {
                    if (var10 < field331.length && var10 < this.field343.length) {
                        if (this.field343[var10].method235(class1.field3, (byte) -76)) {
                            var11--;
                            var10++;
                            continue;
                        }
                        field331[var10].method57(this.field407 + 3, var9);
                        int var12 = 16777215;
                        this.field317.method128(this.field343[var10], this.field407 + 21, var9 - -14, 0, -1);
                        if (this.field403 == var10) {
                            var12 = 12298922;
                        }
                        if (this.field327 > 0 && this.field327 % 10 < 5 && this.field324 == var10) {
                            var12 = 16776960;
                        }
                        this.field317.method128(this.field343[var10], this.field407 + 20, var9 + 13, var12, -1);
                    }
                    var9 += 17;
                    var10++;
                }
            }
            if (class25.field311.length == 1) {
                this.method160(this.field385, this.field410, this.field413 + this.field384, this.field400, (byte) 95, this.field406, this.field418, this.field322, 18);
                this.method160(this.field385, this.field410, this.field386 + this.field398, this.field407, (byte) 116, this.field406, this.field388, this.field382, 18);
                if (this.field318 == 3.0D) {
                    this.method160(this.field372, this.field370, this.field347, this.field379, (byte) 48, this.field344, class20.field232, this.field397, this.field416);
                } else {
                    this.method160(this.field385, this.field410, this.field347, this.field379, (byte) 72, this.field406, class20.field232, this.field397, this.field416);
                }
                if (this.field318 == 4.0D) {
                    this.method160(this.field372, this.field370, this.field347, this.field414 + this.field379, (byte) -109, this.field344, class38.field515, this.field397, this.field416);
                } else {
                    this.method160(this.field385, this.field410, this.field347, this.field414 + this.field379, (byte) -124, this.field406, class38.field515, this.field397, this.field416);
                }
                if (this.field318 == 6.0D) {
                    this.method160(this.field372, this.field370, this.field347, this.field414 * 2 + this.field379, (byte) -95, this.field344, class6.field67, this.field397, this.field416);
                } else {
                    this.method160(this.field385, this.field410, this.field347, this.field414 * 2 + this.field379, (byte) -96, this.field406, class6.field67, this.field397, this.field416);
                }
                if (this.field318 == 8.0D) {
                    this.method160(this.field372, this.field370, this.field347, this.field414 * 3 + this.field379, (byte) -126, this.field344, class4.field47, this.field397, this.field416);
                } else {
                    this.method160(this.field385, this.field410, this.field347, this.field414 * 3 + this.field379, (byte) -114, this.field406, class4.field47, this.field397, this.field416);
                }
            } else {
                this.method160(this.field385, this.field410, this.field413 + this.field384, this.field400, (byte) 47, this.field406, this.field418, this.field322, 18);
                this.method160(this.field385, this.field410, this.field398 + this.field386, this.field407, (byte) -126, this.field406, this.field388, this.field382, 18);
                this.method157(this.field406, 31768);
                int var13 = this.field402 + this.field347;
                if (this.field318 == 3.0D) {
                    this.method160(this.field372, this.field370, var13, this.field379, (byte) 52, this.field344, class20.field232, this.field397, this.field416);
                } else {
                    this.method160(this.field385, this.field410, var13, this.field379, (byte) 111, this.field406, class20.field232, this.field397, this.field416);
                }
                if (this.field318 == 4.0D) {
                    this.method160(this.field372, this.field370, var13, this.field414 + this.field379, (byte) -84, this.field344, class38.field515, this.field397, this.field416);
                } else {
                    this.method160(this.field385, this.field410, var13, this.field414 + this.field379, (byte) -115, this.field406, class38.field515, this.field397, this.field416);
                }
                if (this.field318 == 6.0D) {
                    this.method160(this.field372, this.field370, var13, this.field414 * 2 + this.field379, (byte) 49, this.field344, class6.field67, this.field397, this.field416);
                } else {
                    this.method160(this.field385, this.field410, var13, this.field414 * 2 + this.field379, (byte) -128, this.field406, class6.field67, this.field397, this.field416);
                }
                if (this.field318 == 8.0D) {
                    this.method160(this.field372, this.field370, var13, this.field414 * 3 + this.field379, (byte) 92, this.field344, class4.field47, this.field397, this.field416);
                } else {
                    this.method160(this.field385, this.field410, var13, this.field414 * 3 + this.field379, (byte) -84, this.field406, class4.field47, this.field397, this.field416);
                }
            }
            if (class25.field310) {
                this.method160(this.field385, this.field410, this.field399, this.field340, (byte) -99, this.field406, this.field356, this.field362, this.field319);
                if (class37.field498) {
                    class22.method106(this.field362 + this.field340 + 2, this.field399, this.field392 + 10, this.field319, 8925952, 192);
                    class22.method114(this.field340 + this.field362 + 2, this.field399, this.field392 + 10, this.field319, 16777215);
                    if (class2.field13 > -1 && this.field381.method241((byte) 92) > 0) {
                        class37 var14 = this.field325[class2.field13].method242(32, 47, -66);
                        int var15 = this.field381.method241((byte) 92);
                        if (var14.method241((byte) 92) < var15) {
                            var15 = var14.method241((byte) 92);
                        }
                        this.field317.method128(var14, this.field340 + this.field362 + 6, 20, 10066176, 0);
                        this.field317.method128(var14.method236(0, var15, (byte) 43), this.field362 + this.field340 + 6, 20, 16777215, 0);
                    } else {
                        this.field317.method128(this.field346, this.field362 + this.field340 + 6, 20, 16776960, 0);
                    }
                }
            }
        }
        if (class14.field155) {
            this.method142(17124);
        }
        int var16 = 78 % ((19 - arg0) / 51);
    }

    @OriginalMember(owner = "mapview!mapview", name = "g", descriptor = "(I)V", line = 987)
    public final void method156(int arg0) {
        class41.method265((byte) -120);
        class9.method38(128);
        try {
            this.field369 = null;
            this.field353 = null;
            this.field317 = null;
            class7.field85 = null;
            this.field343 = null;
            this.field360 = null;
            this.field325 = null;
            this.field321 = null;
            int var2 = 73 % ((16 - arg0) / 61);
            System.gc();
        } catch (Throwable var4) {
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "init", descriptor = "()V", line = 1015)
    public final void init() {
        if (this.method178(-1)) {
            this.method176(503, 32, (byte) -126, Integer.parseInt(this.getParameter("codeversion")), 635);
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "b", descriptor = "(II)V", line = 1025)
    private final void method157(int arg0, int arg1) {
        if (arg1 == 31768) {
            this.method160(this.field385, this.field410, 483, 170, (byte) 98, arg0, class5.method20(-110, new class37[] { class7.field84, class30.field442[class1.field5], field337 }), 230, 18);
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "b", descriptor = "(B)V", line = 1046)
    public final void method158(byte arg0) {
        method154((byte) 42);
        class1.method2(arg0 - 3);
        if (arg0 != -99) {
            return;
        }
        class37.method243(0);
        class12.method54(arg0 ^ 0xFFFFFF9B);
        class26.method168(arg0 + 208);
        class21.method92(114);
        class30.method184(true);
        class4.method14(20);
        class25.method138(-3237);
        class10.method42(-31958);
        class35.method211(false);
        class16.method70();
        class36.method219(0);
        class2.method4(false);
        class11.method49(114);
        class38.method252(3);
        class5.method19(false);
        class22.method103();
        class27.method172(arg0 ^ 0xFFFFC741);
        class14.method61((byte) 59);
        class8.method34((byte) -92);
        class33.method192(0);
        class24.method136();
        class18.method86(46);
        class15.method65(false);
        class9.method37(false);
        class40.method261(100);
        class23.method116(false);
        class41.method267(arg0 + 99);
        class7.method33((byte) -89);
        class31.method188(-1);
        class6.method24(true);
        class17.method82();
        class20.method89((byte) 74);
        this.field363 = null;
        this.field330 = null;
        this.field353 = null;
        this.field342 = null;
        this.field356 = null;
        this.field348 = null;
        this.field355 = null;
        this.field346 = null;
        this.field381 = null;
        this.field360 = null;
        this.field335 = null;
        this.field369 = null;
        this.field343 = null;
        this.field388 = null;
        this.field345 = null;
        this.field325 = null;
        this.field374 = null;
        this.field350 = null;
        this.field339 = null;
        this.field317 = null;
        this.field418 = null;
        this.field336 = null;
        this.field415 = null;
        this.field333 = null;
        this.field321 = null;
        this.field364 = null;
        this.field409 = null;
        this.field390 = null;
        this.field361 = null;
        this.field377 = null;
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(IIIIIIIII)V", line = 1168)
    private final void method159(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class7.field85.method210(arg2, 0, arg5, arg7, arg3, arg6, arg1, arg8, arg0);
        if (arg4 > 0 || arg1 - arg0 > arg3 - arg5) {
            return;
        }
        class7.field85.method216(arg2, false, arg0, arg6, arg3, arg5, arg7, arg1, arg8, this.field323);
        class7.field85.method208(arg7, arg3, arg5, true, arg2, arg1, arg0, arg8, arg6);
        class7.field85.method214(arg1, this.field327, arg3, arg7, this.field324, 100, arg8, arg0, arg5, arg6, arg2);
        if (this.field323 == this.field318 && field334) {
            for (int var10 = 0; var10 < this.field387; var10++) {
                int var11 = this.field369[var10];
                int var12 = var11 - class26.field424;
                int var13 = this.field360[var10];
                int var14 = class14.field156 + class37.field500 - var13;
                int var15 = (arg8 - arg7) * (-arg2 + var14) / (arg6 - arg2) + arg7;
                int var16 = arg5 + (var12 - arg0) * (-arg5 + arg3) / (arg1 - arg0);
                int var17 = this.field321[var10];
                int var18 = 16777215;
                class16 var19 = null;
                if (var17 == 0) {
                    if (this.field323 == 3.0D) {
                        var19 = this.field330;
                    }
                    if (this.field323 == 4.0D) {
                        var19 = this.field350;
                    }
                    if (this.field323 == 6.0D) {
                        var19 = this.field336;
                    }
                    if (this.field323 == 8.0D) {
                        var19 = this.field361;
                    }
                }
                if (var17 == 1) {
                    if (this.field323 == 3.0D) {
                        var19 = this.field336;
                    }
                    if (this.field323 == 4.0D) {
                        var19 = this.field361;
                    }
                    if (this.field323 == 6.0D) {
                        var19 = this.field363;
                    }
                    if (this.field323 == 8.0D) {
                        var19 = this.field348;
                    }
                }
                if (var17 == 2) {
                    if (this.field323 == 3.0D) {
                        var19 = this.field363;
                    }
                    if (this.field323 == 4.0D) {
                        var19 = this.field348;
                    }
                    if (this.field323 == 6.0D) {
                        var19 = this.field415;
                    }
                    if (this.field323 == 8.0D) {
                        var19 = this.field335;
                    }
                    var18 = 16755200;
                }
                if (var19 != null) {
                    class37 var20 = this.field325[var10];
                    int var21 = 1;
                    for (int var22 = 0; var22 < var20.method241((byte) 92); var22++) {
                        if (var20.method229((byte) 104, var22) == 47) {
                            var21++;
                        }
                    }
                    int var23 = var15 - var19.method66() * (var21 - 1) / 2;
                    int var24 = var23 + var19.method73() / 2;
                    while (true) {
                        int var25 = var20.method224(47, 0);
                        if (var25 == -1) {
                            var19.method69(var20, var16, var24, var18, true);
                            break;
                        }
                        class37 var26 = var20.method236(0, var25, (byte) 43);
                        var19.method69(var26, var16, var24, var18, true);
                        var24 += var19.method66();
                        var20 = var20.method222(-30696, var25 + 1);
                    }
                }
            }
        }
        if (!class10.field112) {
            return;
        }
        for (int var27 = class26.field424 / 64; var27 < (class31.field458 + class26.field424) / 64; var27++) {
            for (int var28 = class14.field156 / 64; var28 < (class37.field500 + class14.field156) / 64; var28++) {
                int var29 = var28 * 64;
                int var30 = var27 * 64;
                int var31 = class37.field500 + class14.field156 - var29;
                int var32 = var30 - class26.field424;
                int var33 = (arg3 - arg5) * (-arg0 + var32) / (arg1 - arg0) + arg5;
                int var34 = (var31 - arg2) * (-arg7 + arg8) / (arg6 - arg2) + arg7;
                int var35 = (arg3 - arg5) * (var32 - -64 + -arg0) / (arg1 - arg0) + arg5;
                int var36 = arg7 + (var31 - arg2 - 64) * (arg8 - arg7) / (arg6 - arg2);
                class22.method114(var33, var36, var35 - var33, -var36 + var34, 16777215);
                this.field317.method131(class5.method20(-110, new class37[] { class14.method60(3038, var27), field368, class14.method60(3038, var28) }), var35 - 5, var34 + -5, 16777215, -1);
                if (var27 == 33 && var28 >= 71 && var28 <= 73) {
                    this.field317.method134(class20.field209, (var33 + var35) / 2, (var34 + var36) / 2, 16711680, -1);
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(IIIIBILta;II)V", line = 1429)
    private final void method160(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, class37 arg6, int arg7, int arg8) {
        int var10 = 114 / ((-arg4 - 17) / 63);
        class22.method114(arg3, arg2, arg7, arg8, 0);
        int var13 = arg7 - 2;
        int var14 = arg8 - 2;
        int var11 = arg2 + 1;
        int var12 = arg3 + 1;
        class22.method108(var12, var11, var13, var14, arg5);
        class22.method112(var12, var11, var13, arg0);
        class22.method110(var12, var11, var14, arg0);
        class22.method112(var12, var11 + var14 - 1, var13, arg1);
        class22.method110(var13 + var12 - 1, var11, var14, arg1);
        this.field317.method134(arg6, var12 + var13 / 2 + 1, var14 / 2 + 5 + var11, 0, -1);
        this.field317.method134(arg6, var13 / 2 + var12, var14 / 2 + (var11 - -4), 16777215, -1);
    }

    @OriginalMember(owner = "mapview!mapview", name = "b", descriptor = "(IB)V", line = 1467)
    private final void method161(int arg0, byte arg1) {
        if (arg1 != -45 || class25.field311.length <= arg0) {
            return;
        }
        class10 var3 = class25.field311[arg0];
        class21 var4 = new class21(var3.method44(field328, -28255, class5.field56));
        var4.method91(-126);
        class21 var5 = new class21(var3.method44(class23.field253, arg1 - 28210, class5.field56));
        this.field387 = var5.method98(-2);
        for (int var6 = 0; var6 < this.field387; var6++) {
            this.field325[var6] = var5.method91(-125);
            this.field369[var6] = var5.method98(-2);
            this.field360[var6] = var5.method98(-2);
            this.field321[var6] = var5.method96(255);
            class37 var7 = this.field325[var6].method242(32, 47, arg1 ^ 0x6D);
            int var8 = this.field317.method125(var7);
            if (this.field392 < var8) {
                this.field392 = var8;
            }
            int var9 = this.field317.method125(this.field346);
            if (var9 > this.field392) {
                this.field392 = var9;
            }
        }
        class7.field85 = new class35();
        class7.field85.method200(arg1 ^ 0x6D, class25.field311[arg0]);
        class1.field4 = class4.field41;
        this.field384 = 180;
        this.field413 = 483 - this.field384;
        this.field322 = class31.field458 * this.field384 / class37.field500;
        class7.field82 = class21.field240;
        this.field400 = 630 - this.field322;
        this.field353 = new class13(this.field322, this.field384);
        this.field353.method59();
        this.method159(0, class31.field458, 0, this.field322, -99, 0, class37.field500, 0, this.field384);
        class22.method114(0, 0, this.field322, this.field384, 0);
        class22.method114(1, 1, this.field322 - 2, this.field384 - 2, this.field385);
        class37.field508.method139(0);
    }

    @OriginalMember(owner = "mapview!mapview", name = "i", descriptor = "(I)V", line = 1558)
    public final void method162(int arg0) {
        if (field412) {
            class37.method245(field320, (byte) -116);
            class4.method16(0, field320);
            this.method180(arg0 ^ 0x10);
            class7.method32(arg0 + 12204, field320);
            class23.method118(field320, arg0 ^ 0xFFFFFFB5);
        }
        class36.method218(28448);
        class21.method95(-27731);
        if (!class37.field512) {
            return;
        }
        if (class21.field242[96]) {
            this.field419 = true;
            class7.field82 = (int) ((double) class7.field82 - 16.0D / this.field323);
            class38.field520 = -1;
        }
        if (class21.field242[97]) {
            class7.field82 = (int) (16.0D / this.field323 + (double) class7.field82);
            class38.field520 = -1;
            this.field419 = true;
        }
        if (class21.field242[98]) {
            class38.field520 = -1;
            this.field419 = true;
            class1.field4 = (int) ((double) class1.field4 - 16.0D / this.field323);
        }
        if (class21.field242[99]) {
            this.field419 = true;
            class1.field4 = (int) (16.0D / this.field323 + (double) class1.field4);
            class38.field520 = -1;
        }
        while (true) {
            while (true) {
                while (class38.method248(124)) {
                    if (!class25.field310 || !class37.field498) {
                        if (class40.field526 == this.field375 || class40.field526 == this.field357) {
                            class37.field498 = true;
                            this.field419 = true;
                        }
                        if (class40.field526 == 49) {
                            this.field419 = true;
                            this.field318 = 3.0D;
                        }
                        if (class40.field526 == 50) {
                            this.field419 = true;
                            this.field318 = 4.0D;
                        }
                        if (class40.field526 == 51) {
                            this.field419 = true;
                            this.field318 = 6.0D;
                        }
                        if (class40.field526 == 52) {
                            this.field318 = 8.0D;
                            this.field419 = true;
                        }
                        if (class40.field526 == this.field383 || class40.field526 == this.field395) {
                            this.field405 = !this.field405;
                            this.field419 = true;
                        }
                        if (class40.field526 == this.field391 || class40.field526 == this.field351) {
                            this.field419 = true;
                            this.field394 = !this.field394;
                        }
                    } else if (class4.field51 == 0) {
                        this.field419 = true;
                        class37.field498 = false;
                        this.field381.method234(73, 0);
                        class2.field13 = -1;
                    } else if (class4.field51 == 84) {
                        this.field380 = class7.field82 << 16;
                        class38.field520 = class2.field13;
                        this.field349 = class1.field4 << 16;
                        class37.field498 = false;
                        this.field381.method234(119, 0);
                        class2.field13 = -1;
                        this.field419 = true;
                    } else {
                        boolean var2 = false;
                        if (class4.field51 == 85) {
                            if (this.field381.method241((byte) 92) > 0) {
                                this.field381.method234(40, this.field381.method241((byte) 92) - 1);
                                this.field419 = true;
                                if (this.field381.method241((byte) 92) == 0) {
                                    class2.field13 = -1;
                                } else {
                                    var2 = true;
                                }
                            }
                        } else if (class40.field526 != -1 && this.field381.method241((byte) 92) <= class10.field110) {
                            this.field381.method237(true, class40.field526);
                            this.field419 = true;
                        }
                        if (this.field381.method241((byte) 92) > 0) {
                            for (int var3 = 0; var3 < this.field387; var3++) {
                                if (this.field325[var3].method241((byte) 92) >= this.field381.method241((byte) 92)) {
                                    class37 var4 = this.field381.method228(false);
                                    class37 var5 = this.field325[var3].method242(32, 47, -66).method236(0, this.field381.method241((byte) 92), (byte) 43).method228(false);
                                    if (var4.method240(arg0 - 18, var5) == 0) {
                                        var2 = true;
                                        class2.field13 = var3;
                                        this.field419 = true;
                                        break;
                                    }
                                }
                            }
                            if (!var2) {
                                this.field381.method234(80, this.field381.method241((byte) 92) - 1);
                            }
                        }
                    }
                }
                int var6 = class20.field229;
                int var7 = class33.field465;
                int var8 = class21.field243;
                if (arg0 != 16) {
                    return;
                }
                int var9 = class9.field100;
                int var10 = class2.field17;
                int var11 = class12.field141;
                if (var6 == 1) {
                    this.field329 = var7;
                    this.field367 = var8;
                    this.field371 = class7.field82;
                    this.field378 = class1.field4;
                    if (class25.field311.length == 1) {
                        if (this.field379 < var8 && var8 < this.field397 + this.field379 && var7 > this.field347 && this.field416 + this.field347 > var7) {
                            this.field367 = -1;
                            this.field318 = 3.0D;
                        }
                        if (var8 > this.field379 + this.field414 && this.field379 + this.field414 + this.field397 > var8 && this.field347 < var7 && this.field347 + this.field416 > var7) {
                            this.field367 = -1;
                            this.field318 = 4.0D;
                        }
                        if (var8 > this.field414 * 2 + this.field379 && this.field414 * 2 + this.field379 + this.field397 > var8 && var7 > this.field347 && var7 < this.field416 + this.field347) {
                            this.field367 = -1;
                            this.field318 = 6.0D;
                        }
                        if (this.field414 * 3 + this.field379 < var8 && this.field414 * 3 + this.field379 + this.field397 > var8 && this.field347 < var7 && var7 < this.field347 + this.field416) {
                            this.field367 = -1;
                            this.field318 = 8.0D;
                        }
                    } else {
                        if (this.field379 < var8 && var8 < this.field397 + this.field379 && var7 > this.field347 && var7 < this.field347 + this.field402 + this.field416) {
                            this.field318 = 3.0D;
                            this.field367 = -1;
                        }
                        if (this.field379 + this.field414 < var8 && this.field414 + this.field397 + this.field379 > var8 && var7 > this.field347 && var7 < this.field402 + this.field347 + this.field416) {
                            this.field367 = -1;
                            this.field318 = 4.0D;
                        }
                        if (var8 > this.field414 * 2 + this.field379 && this.field414 * 2 + this.field397 + this.field379 > var8 && this.field347 < var7 && this.field416 + this.field347 + this.field402 > var7) {
                            this.field318 = 6.0D;
                            this.field367 = -1;
                        }
                        if (this.field414 * 3 + this.field379 < var8 && var8 < this.field379 + this.field414 * 3 + this.field397 && var7 > this.field347 && this.field416 + this.field402 + this.field347 > var7) {
                            this.field318 = 8.0D;
                            this.field367 = -1;
                        }
                        if (var8 > 170 && var8 < 400 && var7 > 483 && var7 < 503) {
                            this.method157(this.field344, 31768);
                            this.method142(17124);
                            this.method148(-30023);
                            this.field367 = -1;
                        }
                    }
                    this.field419 = true;
                    if (this.field407 < var8 && this.field398 + this.field386 < var7 && var8 < this.field407 + this.field382 && var7 < 503) {
                        this.field367 = -1;
                        this.field405 = !this.field405;
                    }
                    if (this.field400 < var8 && this.field413 + this.field384 < var7 && var8 < this.field400 + this.field322 && var7 < 503) {
                        this.field394 = !this.field394;
                        this.field367 = -1;
                    }
                    this.field411 = false;
                    if (this.field405) {
                        if (this.field407 < var8 && var7 > this.field386 && var8 < this.field407 + this.field382 && var7 < this.field398 + this.field386) {
                            this.field367 = -1;
                        }
                        if (var8 > this.field407 && var7 > this.field386 && var8 < this.field407 + this.field382 && var7 < this.field386 + 18 && this.field358 > 0) {
                            this.field358 -= 24;
                        }
                        if (this.field407 < var8 && var7 > this.field386 + this.field398 - 18 && this.field407 + this.field382 > var8 && this.field398 + this.field386 > var7 && this.field358 < 72) {
                            this.field358 += 24;
                        }
                    }
                    if (this.field394 && var8 > this.field400 && this.field413 < var7 && var8 < this.field400 + this.field322 && var7 < this.field413 + this.field384) {
                        this.field411 = true;
                        this.field367 = -1;
                        class7.field82 = (var8 - this.field400) * class31.field458 / this.field322;
                        class1.field4 = (var7 - this.field413) * class37.field500 / this.field384;
                    }
                    if (class25.field310 && !class37.field498 && !this.field411 && var8 > this.field340 && this.field399 < var7 && this.field340 + this.field362 > var8 && this.field399 + this.field319 > var7) {
                        class37.field498 = true;
                    }
                }
                if (this.field405) {
                    this.field403 = -1;
                    if (this.field407 < var10 && this.field407 + this.field382 > var10) {
                        int var12 = this.field386 + 21 + 5;
                        int var13 = this.field389;
                        for (int var14 = 0; var14 < 24; var14++) {
                            if (var13 < this.field343.length && this.field343[var13].method235(class1.field3, (byte) -114)) {
                                var14--;
                                var13++;
                            } else {
                                if (var12 <= var11 && var11 < var12 + 17) {
                                    if (var6 == 1) {
                                        this.field327 = 50;
                                        this.field324 = var13;
                                    }
                                    this.field403 = var13;
                                }
                                var13++;
                                var12 += 17;
                            }
                        }
                    }
                    if (this.field403 != this.field396) {
                        this.field396 = this.field403;
                        this.field419 = true;
                    }
                }
                if (var9 == 1 && this.field394 && this.field411) {
                    class38.field520 = -1;
                    this.field419 = true;
                    int var15 = var10;
                    if (var10 < this.field400) {
                        var15 = this.field400;
                    } else if (var10 > this.field400 + this.field322) {
                        var15 = this.field400 + this.field322;
                    }
                    class7.field82 = (var15 - this.field400) * class31.field458 / this.field322;
                    int var16 = var11;
                    if (this.field413 > var11) {
                        var16 = this.field413;
                    } else if (var11 > this.field413 + this.field384) {
                        var16 = this.field413 + this.field384;
                    }
                    class1.field4 = (var16 - this.field413) * class37.field500 / this.field384;
                } else {
                    this.field411 = false;
                }
                if (var9 == 1 && this.field367 != -1) {
                    class38.field520 = -1;
                    this.field419 = true;
                    class1.field4 = (int) ((double) (this.field329 - var11) * 2.0D / this.field318) + this.field378;
                    class7.field82 = (int) ((double) (this.field367 - var10) * 2.0D / this.field318) + this.field371;
                }
                if (this.field323 < this.field318) {
                    this.field419 = true;
                    this.field323 += this.field323 / 30.0D;
                    if (this.field323 > this.field318) {
                        this.field323 = this.field318;
                    }
                }
                if (this.field323 > this.field318) {
                    this.field323 -= this.field323 / 30.0D;
                    if (this.field318 > this.field323) {
                        this.field323 = this.field318;
                    }
                    this.field419 = true;
                }
                if (this.field358 > this.field389) {
                    this.field419 = true;
                    this.field389++;
                }
                if (this.field389 > this.field358) {
                    this.field419 = true;
                    this.field389--;
                }
                if (this.field327 > 0) {
                    this.field419 = true;
                    this.field327--;
                }
                if (class38.field520 >= 0) {
                    class7.field76 = this.field369[class38.field520] - class26.field424;
                    int var17 = class7.field76 - (int) (635.0D / this.field323);
                    byte var18 = 4;
                    int var19 = (int) (635.0D / this.field323) + class7.field76;
                    class11.field131 = class37.field500 + class14.field156 - this.field360[class38.field520];
                    this.field419 = true;
                    int var20 = class11.field131 - (int) (503.0D / this.field323);
                    if (var17 < 48) {
                        class7.field76 = (int) (635.0D / this.field323) + 48;
                    }
                    int var21 = class11.field131 + (int) (503.0D / this.field323);
                    if (var19 > class31.field458 - 48) {
                        class7.field76 = class31.field458 - (int) (635.0D / this.field323) - 48;
                    }
                    if (var20 < 48) {
                        class11.field131 = (int) (503.0D / this.field323) + 48;
                    }
                    if (var21 > class37.field500 - 48) {
                        class11.field131 = class37.field500 - (int) (503.0D / this.field323) - 48;
                    }
                    class11.field131 <<= 0x10;
                    int var22 = class11.field131 - this.field349;
                    class7.field76 <<= 0x10;
                    int var23 = class7.field76 - this.field380;
                    if (var23 >> var18 == 0 && var22 >> var18 == 0) {
                        class38.field520 = -1;
                    } else {
                        this.field380 += var23 >> var18;
                        this.field349 += var22 >> var18;
                        class7.field82 = this.field380 >> 16;
                        class1.field4 = this.field349 >> 16;
                    }
                }
                int var24 = class7.field82 - (int) (635.0D / this.field323);
                int var25 = class1.field4 - (int) (503.0D / this.field323);
                int var26 = (int) (635.0D / this.field323) + class7.field82;
                if (var24 < 48) {
                    class7.field82 = (int) (635.0D / this.field323) + 48;
                }
                if (class31.field458 - 48 < var26) {
                    class7.field82 = class31.field458 - (int) (635.0D / this.field323) - 48;
                }
                int var27 = (int) (503.0D / this.field323) + class1.field4;
                if (var25 < 48) {
                    class1.field4 = (int) (503.0D / this.field323) + 48;
                }
                if (var27 > class37.field500 - 48) {
                    class1.field4 = class37.field500 - (int) (503.0D / this.field323) - 48;
                }
                return;
            }
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "f", descriptor = "(I)V", line = 2115)
    public final void method163(int arg0) {
        class18.method85(71);
        class7.method32(12220, field320);
        class23.method118(field320, -77);
        int var2 = -26 % ((-arg0 - 47) / 58);
        boolean var3 = false;
        class12.field139 = this.field345;
        this.field343 = class6.method27((byte) -40);
        boolean var4 = true;
        this.field333 = class31.method187((byte) 80);
        if (var4) {
            byte var5 = 0;
            if (this.field333.length == 14) {
                byte var10002 = var5;
                int var6 = var5 + 1;
                this.field418 = this.field333[var10002];
                int var20 = var6;
                int var7 = var6 + 1;
                this.field356 = this.field333[var20];
                int var21 = var7;
                int var8 = var7 + 1;
                this.field388 = this.field333[var21];
                int var22 = var8;
                int var9 = var8 + 1;
                this.field355 = this.field333[var22];
                int var23 = var9;
                int var10 = var9 + 1;
                this.field409 = this.field333[var23];
                int var24 = var10;
                int var11 = var10 + 1;
                this.field345 = this.field333[var24];
                int var25 = var11;
                int var12 = var11 + 1;
                this.field374 = this.field333[var25];
                int var26 = var12;
                int var13 = var12 + 1;
                this.field346 = this.field333[var26];
                int var27 = var13;
                int var14 = var13 + 1;
                this.field339 = this.field333[var27];
                int var28 = var14;
                int var15 = var14 + 1;
                this.field390 = this.field333[var28];
                int var29 = var15;
                int var16 = var15 + 1;
                this.field364 = this.field333[var29];
                int var30 = var16;
                int var17 = var16 + 1;
                this.field377 = this.field333[var30];
                int var18 = var17 + 1;
                int var31 = var18;
                int var19 = var18 + 1;
                this.field342 = this.field333[var31];
                this.field351 = this.field418.method229((byte) 109, 0);
                this.field357 = this.field356.method229((byte) 115, 0);
                this.field395 = this.field388.method229((byte) 98, 0);
                this.field391 = this.method153(-22957, this.field351);
                this.field375 = this.method153(-22957, this.field357);
                this.field383 = this.method153(-22957, this.field395);
            } else {
                class10.method41(new class37[] { class10.field105 }, 0);
            }
        }
        this.field381 = class40.method259(50, false);
    }
}
