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

    @OriginalMember(owner = "mapview!mapview", name = "s", descriptor = "Z")
    private boolean field275 = false;

    @OriginalMember(owner = "mapview!mapview", name = "v", descriptor = "I")
    private int field278 = 50;

    @OriginalMember(owner = "mapview!mapview", name = "H", descriptor = "I")
    private int field290 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "n", descriptor = "Z")
    private boolean field270 = true;

    @OriginalMember(owner = "mapview!mapview", name = "x", descriptor = "I")
    private int field280 = 5;

    @OriginalMember(owner = "mapview!mapview", name = "G", descriptor = "I")
    private int field289 = 10027008;

    @OriginalMember(owner = "mapview!mapview", name = "T", descriptor = "I")
    private int field302 = 140;

    @OriginalMember(owner = "mapview!mapview", name = "Z", descriptor = "I")
    private int field307 = 6706483;

    @OriginalMember(owner = "mapview!mapview", name = "R", descriptor = "I")
    private int field300 = 5;

    @OriginalMember(owner = "mapview!mapview", name = "p", descriptor = "D")
    private double field272 = 4.0D;

    @OriginalMember(owner = "mapview!mapview", name = "eb", descriptor = "I")
    private int field312 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "kb", descriptor = "I")
    private int field318 = 11141120;

    @OriginalMember(owner = "mapview!mapview", name = "A", descriptor = "I")
    private int field283 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "jb", descriptor = "I")
    private int field317 = 23;

    @OriginalMember(owner = "mapview!mapview", name = "db", descriptor = "I")
    private int field311 = -20;

    @OriginalMember(owner = "mapview!mapview", name = "hb", descriptor = "I")
    private int field315 = 5;

    @OriginalMember(owner = "mapview!mapview", name = "Db", descriptor = "I")
    private int field337 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "Ab", descriptor = "I")
    private int field334 = 500;

    @OriginalMember(owner = "mapview!mapview", name = "ob", descriptor = "I")
    private int field322 = 10;

    @OriginalMember(owner = "mapview!mapview", name = "lb", descriptor = "[Lv;")
    private class40[] field319 = new class40[this.field334];

    @OriginalMember(owner = "mapview!mapview", name = "Cb", descriptor = "Z")
    private boolean field336 = false;

    @OriginalMember(owner = "mapview!mapview", name = "Gb", descriptor = "[I")
    private int[] field340 = new int[this.field334];

    @OriginalMember(owner = "mapview!mapview", name = "W", descriptor = "[I")
    private int[] field304 = new int[this.field334];

    @OriginalMember(owner = "mapview!mapview", name = "B", descriptor = "I")
    private int field284 = 33;

    @OriginalMember(owner = "mapview!mapview", name = "ab", descriptor = "I")
    private int field308 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "ub", descriptor = "I")
    private int field328 = 170;

    @OriginalMember(owner = "mapview!mapview", name = "yb", descriptor = "I")
    private int field332 = this.field322 + this.field278;

    @OriginalMember(owner = "mapview!mapview", name = "E", descriptor = "I")
    private int field287 = -1;

    @OriginalMember(owner = "mapview!mapview", name = "qb", descriptor = "D")
    private double field324 = 4.0D;

    @OriginalMember(owner = "mapview!mapview", name = "Eb", descriptor = "I")
    private int field338 = -1;

    @OriginalMember(owner = "mapview!mapview", name = "Ub", descriptor = "I")
    private int field354 = 450;

    @OriginalMember(owner = "mapview!mapview", name = "y", descriptor = "Z")
    private boolean field281 = false;

    @OriginalMember(owner = "mapview!mapview", name = "F", descriptor = "I")
    private int field288 = 471;

    @OriginalMember(owner = "mapview!mapview", name = "Wb", descriptor = "I")
    private int field356 = 8943445;

    @OriginalMember(owner = "mapview!mapview", name = "vb", descriptor = "I")
    private int field329 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "Jb", descriptor = "I")
    private int field343 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "Bb", descriptor = "I")
    private int field335 = 40;

    @OriginalMember(owner = "mapview!mapview", name = "Qb", descriptor = "I")
    private int field350 = -1;

    @OriginalMember(owner = "mapview!mapview", name = "N", descriptor = "I")
    private int field296 = 8912896;

    @OriginalMember(owner = "mapview!mapview", name = "Hb", descriptor = "I")
    private int field341 = 30;

    @OriginalMember(owner = "mapview!mapview", name = "Pb", descriptor = "I")
    private int field349 = 7824964;

    @OriginalMember(owner = "mapview!mapview", name = "Nb", descriptor = "Z")
    private boolean field347 = false;

    @OriginalMember(owner = "mapview!mapview", name = "U", descriptor = "I")
    private int field303 = this.field347 ? 220 : 79;

    @OriginalMember(owner = "mapview!mapview", name = "P", descriptor = "I")
    private int field298 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "sb", descriptor = "Lv;")
    private class40 field326 = this.field347 ? class19.field209 : class19.field209;

    @OriginalMember(owner = "mapview!mapview", name = "r", descriptor = "Lv;")
    private class40 field274 = this.field347 ? class40.field517 : class39.field500;

    @OriginalMember(owner = "mapview!mapview", name = "Vb", descriptor = "I")
    private int field355 = this.field347 ? 252 : 111;

    @OriginalMember(owner = "mapview!mapview", name = "ib", descriptor = "Lv;")
    private class40 field316 = this.field347 ? class40.field523 : class40.field523;

    @OriginalMember(owner = "mapview!mapview", name = "I", descriptor = "[I")
    private int[] field291 = new int[this.field334];

    @OriginalMember(owner = "mapview!mapview", name = "Ib", descriptor = "Lv;")
    private class40 field342 = this.field347 ? class11.field118 : class11.field118;

    @OriginalMember(owner = "mapview!mapview", name = "z", descriptor = "Lv;")
    private class40 field282 = this.field347 ? class31.field433 : class31.field433;

    @OriginalMember(owner = "mapview!mapview", name = "o", descriptor = "Lv;")
    private class40 field271 = this.field347 ? class25.field374 : class25.field374;

    @OriginalMember(owner = "mapview!mapview", name = "t", descriptor = "Lv;")
    private class40 field276 = this.field347 ? class30.field430 : field292;

    @OriginalMember(owner = "mapview!mapview", name = "K", descriptor = "I")
    private int field293 = this.field347 ? 83 : 70;

    @OriginalMember(owner = "mapview!mapview", name = "Sb", descriptor = "I")
    private int field352 = this.field347 ? 108 : 107;

    @OriginalMember(owner = "mapview!mapview", name = "Rb", descriptor = "Lv;")
    private class40 field351 = this.field347 ? class15.field149 : class15.field149;

    @OriginalMember(owner = "mapview!mapview", name = "q", descriptor = "Lv;")
    private class40 field273 = this.field347 ? class25.field381 : class25.field381;

    @OriginalMember(owner = "mapview!mapview", name = "gb", descriptor = "Lv;")
    private class40 field314 = this.field347 ? class18.field191 : class18.field191;

    @OriginalMember(owner = "mapview!mapview", name = "zb", descriptor = "I")
    private int field333 = this.field347 ? 76 : 75;

    @OriginalMember(owner = "mapview!mapview", name = "S", descriptor = "I")
    private int field301 = this.field347 ? 115 : 102;

    @OriginalMember(owner = "mapview!mapview", name = "xb", descriptor = "Lv;")
    private class40 field331 = this.field347 ? class32.field441 : class32.field441;

    @OriginalMember(owner = "mapview!mapview", name = "tb", descriptor = "Lv;")
    private class40 field327 = this.field347 ? class26.field400 : class26.field400;

    @OriginalMember(owner = "mapview!mapview", name = "C", descriptor = "Lv;")
    private class40 field285 = this.field347 ? class24.field363 : class12.field129;

    @OriginalMember(owner = "mapview!mapview", name = "w", descriptor = "I")
    public static int field279 = 500;

    @OriginalMember(owner = "mapview!mapview", name = "J", descriptor = "Lv;")
    private static class40 field292 = class24.method170("Key", (byte) 101);

    @OriginalMember(owner = "mapview!mapview", name = "Lb", descriptor = "[J")
    private static long[] field345 = new long[256];

    @OriginalMember(owner = "mapview!mapview", name = "Fb", descriptor = "Lv;")
    public static class40 field339 = class24.method170("Hunter Store", (byte) -123);

    @OriginalMember(owner = "mapview!mapview", name = "Yb", descriptor = "Lv;")
    public static class40 field358 = class24.method170("Woodcutting stump", (byte) 49);

    @OriginalMember(owner = "mapview!mapview", name = "u", descriptor = "I")
    private int field277;

    @OriginalMember(owner = "mapview!mapview", name = "D", descriptor = "I")
    private int field286;

    @OriginalMember(owner = "mapview!mapview", name = "L", descriptor = "I")
    private int field294;

    @OriginalMember(owner = "mapview!mapview", name = "O", descriptor = "I")
    private int field297;

    @OriginalMember(owner = "mapview!mapview", name = "Q", descriptor = "I")
    public static int field299;

    @OriginalMember(owner = "mapview!mapview", name = "X", descriptor = "I")
    private int field305;

    @OriginalMember(owner = "mapview!mapview", name = "Y", descriptor = "I")
    private int field306;

    @OriginalMember(owner = "mapview!mapview", name = "Ob", descriptor = "I")
    private int field348;

    @OriginalMember(owner = "mapview!mapview", name = "Xb", descriptor = "I")
    private int field357;

    @OriginalMember(owner = "mapview!mapview", name = "bc", descriptor = "I")
    private static int field361;

    @OriginalMember(owner = "mapview!mapview", name = "cc", descriptor = "I")
    public static int field362;

    @OriginalMember(owner = "mapview!mapview", name = "mb", descriptor = "Lea;")
    private class10 field320;

    @OriginalMember(owner = "mapview!mapview", name = "M", descriptor = "Lb;")
    private class3 field295;

    @OriginalMember(owner = "mapview!mapview", name = "bb", descriptor = "Lb;")
    private class3 field309;

    @OriginalMember(owner = "mapview!mapview", name = "cb", descriptor = "Lb;")
    private class3 field310;

    @OriginalMember(owner = "mapview!mapview", name = "fb", descriptor = "Lb;")
    private class3 field313;

    @OriginalMember(owner = "mapview!mapview", name = "nb", descriptor = "Lb;")
    private class3 field321;

    @OriginalMember(owner = "mapview!mapview", name = "pb", descriptor = "Lb;")
    private class3 field323;

    @OriginalMember(owner = "mapview!mapview", name = "Mb", descriptor = "Lb;")
    private class3 field346;

    @OriginalMember(owner = "mapview!mapview", name = "Tb", descriptor = "Lb;")
    private class3 field353;

    @OriginalMember(owner = "mapview!mapview", name = "Kb", descriptor = "Lv;")
    private class40 field344;

    @OriginalMember(owner = "mapview!mapview", name = "Zb", descriptor = "Lca;")
    private static class6 field359;

    @OriginalMember(owner = "mapview!mapview", name = "wb", descriptor = "Le;")
    private class9 field330;

    @OriginalMember(owner = "mapview!mapview", name = "ac", descriptor = "Z")
    private static boolean field360;

    @OriginalMember(owner = "mapview!mapview", name = "m", descriptor = "[Lv;")
    private class40[] field269;

    @OriginalMember(owner = "mapview!mapview", name = "rb", descriptor = "[Lv;")
    private class40[] field325;

    @OriginalMember(owner = "mapview!mapview", name = "f", descriptor = "(I)V", line = 10)
    public static final void method150(int arg0) {
        if (arg0 != 13) {
            field359 = null;
        }
        if (class34.field454[0][class40.field514][class40.field520] == null) {
            class15.field146 = null;
        } else {
            class15.field146 = class34.field454[0][class40.field514][class40.field520];
        }
        if (class34.field454[1][class40.field514][class40.field520] == null) {
            class24.field369 = null;
        } else {
            class24.field369 = class34.field454[1][class40.field514][class40.field520];
        }
        if (class34.field454[2][class40.field514][class40.field520] == null) {
            class24.field368 = null;
        } else {
            class24.field368 = class34.field454[2][class40.field514][class40.field520];
        }
        if (class34.field454[3][class40.field514][class40.field520] == null) {
            class41.field531 = null;
        } else {
            class41.field531 = class34.field454[3][class40.field514][class40.field520];
        }
        if (class34.field454[4][class40.field514][class40.field520] == null) {
            class23.field267 = null;
        } else {
            class23.field267 = class34.field454[4][class40.field514][class40.field520];
        }
        if (class40.field519[class40.field514][class40.field520] == null) {
            class27.field412 = null;
        } else {
            class27.field412 = class40.field519[class40.field514][class40.field520];
        }
        if (class11.field115[class40.field514][class40.field520] == null) {
            class32.field442 = null;
        } else {
            class32.field442 = class11.field115[class40.field514][class40.field520];
        }
        if (class24.field370[class40.field514][class40.field520] == null) {
            class37.field486 = null;
        } else {
            class37.field486 = class24.field370[class40.field514][class40.field520];
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "g", descriptor = "(I)V", line = 71)
    private final void method151(int arg0) {
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
                        class7.field87 = var8 + var6 + "/rsmap/";
                        return;
                    }
                }
            } catch (Exception var14) {
            }
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "d", descriptor = "(I)V", line = 136)
    public final void method106(int arg0) {
        if (class31.field435) {
            class14.method77(class40.field509, (byte) 95);
            class8.method57(class40.field509, (byte) -122);
            this.method112(-1);
            class1.method3(class40.field509, 32);
            class30.method197(true, class40.field509);
        }
        if (arg0 != -5) {
            this.field288 = -28;
        }
        class20.method119(false);
        class14.method76((byte) -1);
        if (!class27.field413) {
            return;
        }
        if (class36.field474[96]) {
            class39.field504 = -1;
            this.field270 = true;
            class23.field265 = (int) ((double) class23.field265 - 16.0D / this.field272);
        }
        if (class36.field474[97]) {
            class23.field265 = (int) (16.0D / this.field272 + (double) class23.field265);
            class39.field504 = -1;
            this.field270 = true;
        }
        if (class36.field474[98]) {
            this.field270 = true;
            field361 = (int) ((double) field361 - 16.0D / this.field272);
            class39.field504 = -1;
        }
        if (class36.field474[99]) {
            this.field270 = true;
            field361 = (int) (16.0D / this.field272 + (double) field361);
            class39.field504 = -1;
        }
        while (true) {
            while (true) {
                while (class39.method236((byte) 106)) {
                    if (!class15.field157 || !class1.field39) {
                        if (class39.field502 == this.field301 || class39.field502 == this.field293) {
                            this.field270 = true;
                            class1.field39 = true;
                        }
                        if (class39.field502 == 49) {
                            this.field324 = 3.0D;
                            this.field270 = true;
                        }
                        if (class39.field502 == 50) {
                            this.field270 = true;
                            this.field324 = 4.0D;
                        }
                        if (class39.field502 == 51) {
                            this.field324 = 6.0D;
                            this.field270 = true;
                        }
                        if (class39.field502 == 52) {
                            this.field270 = true;
                            this.field324 = 8.0D;
                        }
                        if (class39.field502 == this.field352 || class39.field502 == this.field333) {
                            this.field270 = true;
                            this.field275 = !this.field275;
                        }
                        if (class39.field502 == this.field355 || class39.field502 == this.field303) {
                            this.field336 = !this.field336;
                            this.field270 = true;
                        }
                    } else if (class24.field364 == 0) {
                        class1.field39 = false;
                        this.field270 = true;
                        this.field344.method250(-14231, 0);
                        class6.field79 = -1;
                    } else if (class24.field364 == 84) {
                        this.field305 = class23.field265 << 16;
                        class39.field504 = class6.field79;
                        class1.field39 = false;
                        this.field306 = field361 << 16;
                        this.field344.method250(-14231, 0);
                        class6.field79 = -1;
                        this.field270 = true;
                    } else {
                        boolean var2 = false;
                        if (class24.field364 == 85) {
                            if (this.field344.method262(736276196) > 0) {
                                this.field344.method250(arg0 ^ 0x3792, this.field344.method262(736276196) - 1);
                                this.field270 = true;
                                if (this.field344.method262(736276196) == 0) {
                                    class6.field79 = -1;
                                } else {
                                    var2 = true;
                                }
                            }
                        } else if (class39.field502 != -1 && this.field344.method262(736276196) <= class14.field145) {
                            this.field344.method245(class39.field502, arg0 - 39);
                            this.field270 = true;
                        }
                        if (this.field344.method262(736276196) > 0) {
                            for (int var3 = 0; var3 < this.field290; var3++) {
                                if (this.field319[var3].method262(736276196) >= this.field344.method262(736276196)) {
                                    class40 var4 = this.field344.method256((byte) 116);
                                    class40 var5 = this.field319[var3].method264(47, 32, (byte) 96).method251(this.field344.method262(736276196), arg0 + 14, 0).method256((byte) 116);
                                    if (var4.method252(48, var5) == 0) {
                                        this.field270 = true;
                                        class6.field79 = var3;
                                        var2 = true;
                                        break;
                                    }
                                }
                            }
                            if (!var2) {
                                this.field344.method250(-14231, this.field344.method262(736276196) - 1);
                            }
                        }
                    }
                }
                int var6 = class20.field217;
                int var7 = class34.field452;
                int var8 = class20.field219;
                int var9 = class18.field197;
                int var10 = class24.field367;
                int var11 = class12.field120;
                if (var6 == 1) {
                    this.field329 = field361;
                    this.field298 = var8;
                    this.field308 = var7;
                    this.field343 = class23.field265;
                    if (class40.field513.length == 1) {
                        if (var7 > this.field328 && var7 < this.field328 + this.field278 && this.field288 < var8 && this.field341 + this.field288 > var8) {
                            this.field324 = 3.0D;
                            this.field308 = -1;
                        }
                        if (var7 > this.field332 + this.field328 && this.field328 + this.field278 + this.field332 > var7 && var8 > this.field288 && this.field288 + this.field341 > var8) {
                            this.field324 = 4.0D;
                            this.field308 = -1;
                        }
                        if (var7 > this.field332 * 2 + this.field328 && this.field332 * 2 + this.field328 + this.field278 > var7 && var8 > this.field288 && this.field341 + this.field288 > var8) {
                            this.field324 = 6.0D;
                            this.field308 = -1;
                        }
                        if (var7 > this.field328 + this.field332 * 3 && var7 < this.field332 * 3 + this.field328 + this.field278 && this.field288 < var8 && this.field341 + this.field288 > var8) {
                            this.field308 = -1;
                            this.field324 = 8.0D;
                        }
                    } else {
                        if (this.field328 < var7 && this.field328 + this.field278 > var7 && this.field288 < var8 && var8 < this.field341 + this.field288 + this.field311) {
                            this.field324 = 3.0D;
                            this.field308 = -1;
                        }
                        if (var7 > this.field332 + this.field328 && this.field332 + this.field328 + this.field278 > var7 && var8 > this.field288 && this.field288 + this.field341 + this.field311 > var8) {
                            this.field324 = 4.0D;
                            this.field308 = -1;
                        }
                        if (var7 > this.field332 * 2 + this.field328 && var7 < this.field328 + this.field332 * 2 + this.field278 && var8 > this.field288 && var8 < this.field288 + this.field341 + this.field311) {
                            this.field308 = -1;
                            this.field324 = 6.0D;
                        }
                        if (this.field328 + this.field332 * 3 < var7 && this.field328 + this.field332 * 3 + this.field278 > var7 && var8 > this.field288 && this.field341 + this.field288 + this.field311 > var8) {
                            this.field308 = -1;
                            this.field324 = 8.0D;
                        }
                        if (var7 > 170 && var7 < 400 && var8 > 483 && var8 < 503) {
                            this.method152(this.field289, 0);
                            this.method160((byte) 109);
                            this.method166(arg0 - 117);
                            this.field308 = -1;
                        }
                    }
                    this.field281 = false;
                    if (this.field280 < var7 && var8 > this.field284 + this.field354 && var7 < this.field302 + this.field280 && var8 < 503) {
                        this.field275 = !this.field275;
                        this.field308 = -1;
                    }
                    this.field270 = true;
                    if (this.field294 < var7 && var8 > this.field357 + this.field286 && this.field294 + this.field277 > var7 && var8 < 503) {
                        this.field336 = !this.field336;
                        this.field308 = -1;
                    }
                    if (this.field275) {
                        if (var7 > this.field280 && var8 > this.field284 && this.field280 + this.field302 > var7 && var8 < this.field354 + this.field284) {
                            this.field308 = -1;
                        }
                        if (this.field280 < var7 && var8 > this.field284 && var7 < this.field302 + this.field280 && this.field284 + 18 > var8 && this.field312 > 0) {
                            this.field312 -= 24;
                        }
                        if (var7 > this.field280 && var8 > this.field354 + this.field284 - 18 && this.field280 + this.field302 > var7 && var8 < this.field354 + this.field284 && this.field312 < 48) {
                            this.field312 += 24;
                        }
                    }
                    if (this.field336 && var7 > this.field294 && var8 > this.field286 && this.field294 + this.field277 > var7 && this.field357 + this.field286 > var8) {
                        this.field308 = -1;
                        field361 = (var8 - this.field286) * class25.field377 / this.field357;
                        class23.field265 = (var7 - this.field294) * class14.field138 / this.field277;
                        this.field281 = true;
                    }
                    if (class15.field157 && !class1.field39 && !this.field281 && var7 > this.field300 && this.field315 < var8 && var7 < this.field335 + this.field300 && var8 < this.field317 + this.field315) {
                        class1.field39 = true;
                    }
                }
                if (this.field275) {
                    this.field350 = -1;
                    if (this.field280 < var10 && this.field302 + this.field280 > var10) {
                        int var12 = this.field337;
                        int var13 = this.field284 + 21 + 5;
                        for (int var14 = 0; var14 < 24; var14++) {
                            if (var12 < this.field325.length && this.field325[var12].method242(class26.field405, -16673)) {
                                var14--;
                                var12++;
                            } else {
                                if (var11 >= var13 && var13 + 17 > var11) {
                                    if (var6 == 1) {
                                        this.field287 = var12;
                                        this.field283 = 50;
                                    }
                                    this.field350 = var12;
                                }
                                var12++;
                                var13 += 17;
                            }
                        }
                    }
                    if (this.field350 != this.field338) {
                        this.field270 = true;
                        this.field338 = this.field350;
                    }
                }
                if (var9 == 1 && this.field336 && this.field281) {
                    this.field270 = true;
                    int var15 = var10;
                    if (var10 < this.field294) {
                        var15 = this.field294;
                    } else if (var10 > this.field294 + this.field277) {
                        var15 = this.field294 + this.field277;
                    }
                    class39.field504 = -1;
                    int var16 = var11;
                    class23.field265 = (var15 - this.field294) * class14.field138 / this.field277;
                    if (this.field286 > var11) {
                        var16 = this.field286;
                    } else if (this.field357 + this.field286 < var11) {
                        var16 = this.field357 + this.field286;
                    }
                    field361 = (var16 - this.field286) * class25.field377 / this.field357;
                } else {
                    this.field281 = false;
                }
                if (var9 == 1 && this.field308 != -1) {
                    field361 = (int) ((double) (this.field298 - var11) * 2.0D / this.field324) + this.field329;
                    class39.field504 = -1;
                    this.field270 = true;
                    class23.field265 = (int) ((double) (this.field308 - var10) * 2.0D / this.field324) + this.field343;
                }
                if (this.field272 < this.field324) {
                    this.field270 = true;
                    this.field272 += this.field272 / 30.0D;
                    if (this.field272 > this.field324) {
                        this.field272 = this.field324;
                    }
                }
                if (this.field324 < this.field272) {
                    this.field270 = true;
                    this.field272 -= this.field272 / 30.0D;
                    if (this.field324 > this.field272) {
                        this.field272 = this.field324;
                    }
                }
                if (this.field312 > this.field337) {
                    this.field270 = true;
                    this.field337++;
                }
                if (this.field312 < this.field337) {
                    this.field270 = true;
                    this.field337--;
                }
                if (this.field283 > 0) {
                    this.field270 = true;
                    this.field283--;
                }
                if (class39.field504 >= 0) {
                    byte var17 = 4;
                    class7.field94 = this.field304[class39.field504] - class35.field466;
                    class26.field387 = class25.field379 + class25.field377 - this.field340[class39.field504];
                    this.field270 = true;
                    int var18 = class7.field94 - (int) (635.0D / this.field272);
                    int var19 = class26.field387 - (int) (503.0D / this.field272);
                    int var20 = (int) (503.0D / this.field272) + class26.field387;
                    int var21 = (int) (635.0D / this.field272) + class7.field94;
                    if (var19 < 48) {
                        class26.field387 = (int) (503.0D / this.field272) + 48;
                    }
                    if (class25.field377 - 48 < var20) {
                        class26.field387 = class25.field377 - (int) (503.0D / this.field272) - 48;
                    }
                    class26.field387 <<= 0x10;
                    int var22 = class26.field387 - this.field306;
                    if (var18 < 48) {
                        class7.field94 = (int) (635.0D / this.field272) + 48;
                    }
                    if (class14.field138 - 48 < var21) {
                        class7.field94 = class14.field138 - (int) (635.0D / this.field272) - 48;
                    }
                    class7.field94 <<= 0x10;
                    int var23 = class7.field94 - this.field305;
                    if (var23 >> var17 == 0 && var22 >> var17 == 0) {
                        class39.field504 = -1;
                    } else {
                        this.field305 += var23 >> var17;
                        class23.field265 = this.field305 >> 16;
                        this.field306 += var22 >> var17;
                        field361 = this.field306 >> 16;
                    }
                }
                int var24 = class23.field265 - (int) (635.0D / this.field272);
                int var25 = field361 - (int) (503.0D / this.field272);
                int var26 = (int) (635.0D / this.field272) + class23.field265;
                int var27 = (int) (503.0D / this.field272) + field361;
                if (var25 < 48) {
                    field361 = (int) (503.0D / this.field272) + 48;
                }
                if (var24 < 48) {
                    class23.field265 = (int) (635.0D / this.field272) + 48;
                }
                if (class14.field138 - 48 < var26) {
                    class23.field265 = class14.field138 - (int) (635.0D / this.field272) - 48;
                }
                if (var27 > class25.field377 - 48) {
                    field361 = class25.field377 - (int) (503.0D / this.field272) - 48;
                }
                return;
            }
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(B)V", line = 684)
    public final void method100(byte arg0) {
        method164(-77);
        class30.method198((byte) -85);
        class40.method259(-49);
        class7.method56((byte) 47);
        class37.method221((byte) 79);
        class5.method32((byte) 95);
        class18.method108((byte) 112);
        if (arg0 >= -30) {
            return;
        }
        class8.method58(-124);
        class12.method72((byte) -11);
        class15.method81(-119);
        class6.method46(-12);
        class3.method22();
        class31.method199(1);
        class14.method75((byte) 53);
        class26.method182(0);
        class25.method176(-1);
        class39.method237(113);
        class2.method13();
        class23.method146(false);
        class35.method214(false);
        class36.method218(false);
        class29.method194((byte) -81);
        class21.method125();
        class27.method190(344767430);
        class11.method67(-32471);
        class32.method203(-3038);
        class19.method113(0);
        class34.method211(5);
        class20.method120(-10888);
        class16.method85(1);
        class41.method268((byte) -36);
        class24.method173((byte) -126);
        class22.method138();
        class1.method4((byte) 58);
        this.field291 = null;
        this.field330 = null;
        this.field274 = null;
        this.field310 = null;
        this.field331 = null;
        this.field295 = null;
        this.field273 = null;
        this.field342 = null;
        this.field285 = null;
        this.field269 = null;
        this.field323 = null;
        this.field319 = null;
        this.field320 = null;
        this.field309 = null;
        this.field327 = null;
        this.field326 = null;
        this.field313 = null;
        this.field304 = null;
        this.field276 = null;
        this.field271 = null;
        this.field314 = null;
        this.field321 = null;
        this.field344 = null;
        this.field325 = null;
        this.field282 = null;
        this.field353 = null;
        this.field346 = null;
        this.field340 = null;
        this.field316 = null;
        this.field351 = null;
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(II)V", line = 769)
    private final void method152(int arg0, int arg1) {
        this.method156(170, this.field356, this.field307, -107, arg0, class35.method212(new class40[] { class37.field484, class19.field203[class5.field57], class18.field198 }, true), 230, 18, 483);
        if (arg1 != 0) {
            method165(21, null, (byte) -1);
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "b", descriptor = "(II)I", line = 779)
    private final int method153(int arg0, int arg1) {
        if (arg1 != 3) {
            method168(true, (byte) -92, null);
        }
        arg0++;
        if (class40.field513.length <= arg0) {
            arg0 = 0;
        }
        return arg0;
    }

    @OriginalMember(owner = "mapview!mapview", name = "init", descriptor = "()V", line = 803)
    public final void init() {
        if (this.method102(17027)) {
            this.method107(635, 503, 31, 32, Integer.parseInt(this.getParameter("codeversion")));
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "([BLjava/lang/String;I)V", line = 815)
    private final void method154(byte[] arg0, String arg1, int arg2) throws IOException {
        FileOutputStream var4 = new FileOutputStream(arg1);
        var4.write(arg0, 0, arg0.length);
        if (arg2 <= 52) {
            this.method156(98, -111, 42, -107, -50, null, 14, 67, -77);
        }
        var4.close();
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(IB)V", line = 830)
    private final void method155(int arg0, byte arg1) {
        if (arg1 <= 49) {
            method165(114, null, (byte) -21);
        }
        if (class40.field513.length <= arg0) {
            return;
        }
        class15 var3 = class40.field513[arg0];
        class5 var4 = new class5(var3.method183(class31.field434, class35.field469, -5541));
        var4.method29(408664184);
        class5 var5 = new class5(var3.method183(class15.field154, class35.field469, -5541));
        this.field290 = var5.method31(-14467);
        for (int var6 = 0; var6 < this.field290; var6++) {
            this.field319[var6] = var5.method29(408664184);
            this.field304[var6] = var5.method31(-14467);
            this.field340[var6] = var5.method31(-14467);
            this.field291[var6] = var5.method28(81);
            class40 var7 = this.field319[var6].method264(47, 32, (byte) -3);
            int var8 = this.field320.method133(var7);
            if (this.field297 < var8) {
                this.field297 = var8;
            }
            int var9 = this.field320.method133(this.field273);
            if (this.field297 < var9) {
                this.field297 = var9;
            }
        }
        field359 = new class6();
        field359.method53(-5, class40.field513[arg0]);
        class23.field265 = field299;
        this.field357 = 180;
        this.field277 = class14.field138 * this.field357 / class25.field377;
        field361 = class40.field515;
        this.field286 = 503 - this.field357 - 20;
        this.field294 = 630 - this.field277;
        this.field330 = new class9(this.field277, this.field357);
        this.field330.method62();
        this.method161(this.field357, 0, -103, 0, class14.field138, this.field277, class25.field377, 0, 0);
        class2.method16(0, 0, this.field277, this.field357, 0);
        class2.method16(1, 1, this.field277 - 2, this.field357 + -2, this.field356);
        class34.field457.method74(true);
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(IIIIILv;III)V", line = 899)
    private final void method156(int arg0, int arg1, int arg2, int arg3, int arg4, class40 arg5, int arg6, int arg7, int arg8) {
        class2.method16(arg0, arg8, arg6, arg7, 0);
        int var13 = arg8 + 1;
        int var10 = arg0 + 1;
        if (arg3 >= -93) {
            this.field319 = null;
        }
        int var11 = arg6 - 2;
        int var12 = arg7 - 2;
        class2.method6(var10, var13, var11, var12, arg4);
        class2.method9(var10, var13, var11, arg1);
        class2.method7(var10, var13, var12, arg1);
        class2.method9(var10, var13 + var12 - 1, var11, arg2);
        class2.method7(var10 + var11 - 1, var13, var12, arg2);
        this.field320.method123(arg5, var11 / 2 + var10 + 1, var12 / 2 + var13 + 1 - -4, 0, -1);
        this.field320.method123(arg5, var10 + var11 / 2, var13 + 4 - -(var12 / 2), 16777215, -1);
    }

    @OriginalMember(owner = "mapview!mapview", name = "b", descriptor = "(BI)I", line = 926)
    private final int method157(byte arg0, int arg1) {
        if (arg0 != -60) {
            this.method100((byte) 45);
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
            return class15.method82(arg1, true);
        }
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            long var1 = (long) var0;
            for (int var3 = 0; var3 < 8; var3++) {
                if ((var1 & 0x1L) == 1L) {
                    var1 = var1 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field345[var0] = var1;
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(B[BLjava/lang/String;)Z", line = 1026)
    private final boolean method158(byte arg0, byte[] arg1, String arg2) {
        if (arg1 == null) {
            return false;
        }
        try {
            MessageDigest var4 = MessageDigest.getInstance("SHA");
            var4.reset();
            var4.update(arg1);
            byte[] var5 = var4.digest();
            if (arg2 == "main_file_cache.dat0") {
                if (var5[0] != 91 || var5[1] != 85 || var5[2] != -107 || var5[3] != -108 || var5[4] != -26 || var5[5] != -109 || var5[6] != -37 || var5[7] != -41 || var5[8] != -54 || var5[9] != 69 || var5[10] != 59 || var5[11] != -31 || var5[12] != -70 || var5[13] != -35 || var5[14] != -1 || var5[15] != -104 || var5[16] != -19 || var5[17] != 80 || var5[18] != 70 || var5[19] != -48) {
                    return false;
                }
            } else if (arg2 == "main_file_cache.idx1") {
                if (var5[0] != 52 || var5[1] != 126 || var5[2] != -117 || var5[3] != -96 || var5[4] != 55 || var5[5] != 19 || var5[6] != -40 || var5[7] != 125 || var5[8] != 49 || var5[9] != -77 || var5[10] != 77 || var5[11] != -79 || var5[12] != -93 || var5[13] != -47 || var5[14] != -110 || var5[15] != -122 || var5[16] != 84 || var5[17] != -103 || var5[18] != -78 || var5[19] != 126) {
                    return false;
                }
            } else if (var5[0] != -69 || var5[1] != 103 || var5[2] != -23 || var5[3] != -73 || var5[4] != -43 || var5[5] != 118 || var5[6] != -28 || var5[7] != -103 || var5[8] != -56 || var5[9] != -73 || var5[10] != -13 || var5[11] != 122 || var5[12] != -21 || var5[13] != -119 || var5[14] != 82 || var5[15] != 37 || var5[16] != -104 || var5[17] != 7 || var5[18] != -11 || var5[19] != -22) {
                return false;
            }
            if (arg0 == 87) {
                return true;
            } else {
                return true;
            }
        } catch (Exception var7) {
            this.method111(arg0 - 10296, "sha");
            return false;
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(Ljava/lang/String;B)[B", line = 1077)
    private final byte[] method159(String arg0, byte arg1) throws IOException {
        File var3 = new File(arg0);
        if (!var3.exists()) {
            return null;
        }
        int var4 = (int) var3.length();
        byte[] var5 = new byte[var4];
        if (arg1 < 72) {
            this.method152(24, -52);
        }
        DataInputStream var6 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg0)));
        var6.readFully(var5, 0, var4);
        var6.close();
        return var5;
    }

    @OriginalMember(owner = "mapview!mapview", name = "b", descriptor = "(B)V", line = 1110)
    public final void method101(byte arg0) {
        if (arg0 != -48) {
            this.method101((byte) 29);
        }
        class32.method201((byte) 118);
        boolean var2 = false;
        class1.method3(class40.field509, 32);
        class30.method197(true, class40.field509);
        class6.field83 = this.field326;
        this.field325 = class35.method215(9994);
        this.field269 = class23.method148(true);
        boolean var3 = true;
        if (var3) {
            byte var4 = 0;
            if (this.field269.length == 14) {
                byte var10002 = var4;
                int var5 = var4 + 1;
                this.field285 = this.field269[var10002];
                int var19 = var5;
                int var6 = var5 + 1;
                this.field274 = this.field269[var19];
                int var20 = var6;
                int var7 = var6 + 1;
                this.field276 = this.field269[var20];
                int var21 = var7;
                int var8 = var7 + 1;
                this.field316 = this.field269[var21];
                int var22 = var8;
                int var9 = var8 + 1;
                this.field282 = this.field269[var22];
                int var23 = var9;
                int var10 = var9 + 1;
                this.field326 = this.field269[var23];
                int var24 = var10;
                int var11 = var10 + 1;
                this.field331 = this.field269[var24];
                int var25 = var11;
                int var12 = var11 + 1;
                this.field273 = this.field269[var25];
                int var26 = var12;
                int var13 = var12 + 1;
                this.field342 = this.field269[var26];
                int var27 = var13;
                int var14 = var13 + 1;
                this.field314 = this.field269[var27];
                int var28 = var14;
                int var15 = var14 + 1;
                this.field271 = this.field269[var28];
                int var29 = var15;
                int var16 = var15 + 1;
                this.field327 = this.field269[var29];
                int var17 = var16 + 1;
                int var30 = var17;
                int var18 = var17 + 1;
                this.field351 = this.field269[var30];
                this.field303 = this.field285.method254(126, 0);
                this.field293 = this.field274.method254(-94, 0);
                this.field333 = this.field276.method254(-58, 0);
                this.field355 = this.method157((byte) -60, this.field303);
                this.field301 = this.method157((byte) -60, this.field293);
                this.field352 = this.method157((byte) -60, this.field333);
            } else {
                class7.method55(new class40[] { class8.field98 }, (byte) -113);
            }
        }
        this.field344 = class18.method110((byte) -3, 50);
    }

    @OriginalMember(owner = "mapview!mapview", name = "f", descriptor = "(B)V", line = 1170)
    private final void method160(byte arg0) {
        class40.field525 = false;
        try {
            Graphics var2 = class40.field509.getGraphics();
            class34.field457.method71(0, 0, var2, 0);
            int var3 = -65 / ((arg0 + 88) / 33);
        } catch (Exception var5) {
            class40.field509.repaint();
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(Z)V", line = 1207)
    public final void method97(boolean arg0) {
        if (!class27.field413) {
            class27.field413 = this.method169(17);
            class37.method228(class18.field192, null, class6.field83, (byte) 38);
            return;
        }
        if (this.field270) {
            this.field270 = false;
            class40.field525 = true;
            class2.method11();
            int var2 = (int) (635.0D / this.field272) + class23.field265;
            int var3 = field361 - (int) (503.0D / this.field272);
            int var4 = class23.field265 - (int) (635.0D / this.field272);
            int var5 = (int) (503.0D / this.field272) + field361;
            this.method161(503, var4, -124, 0, var2, 635, var5, var3, 0);
            if (this.field336) {
                this.field330.method64(this.field294, this.field286);
                class2.method14(this.field277 * var4 / class14.field138 + this.field294, this.field357 * var3 / class25.field377 + this.field286, (var2 - var4) * this.field277 / class14.field138, (var5 - var3) * this.field357 / class25.field377, 16711680, 128);
                class2.method16(this.field294 + this.field277 * var4 / class14.field138, this.field357 * var3 / class25.field377 + this.field286, (var2 - var4) * this.field277 / class14.field138, (var5 - var3) * this.field357 / class25.field377, 16711680);
                if (this.field283 > 0 && this.field283 % 10 < 5) {
                    for (int var6 = 0; var6 < class14.field143; var6++) {
                        if (field359.field70[var6] == this.field287) {
                            int var7 = field359.field74[var6] * this.field277 / class14.field138 + this.field294;
                            int var8 = field359.field81[var6] * this.field357 / class25.field377 + this.field286;
                            class2.method12(var7, var8, 2, 16776960, 256);
                        }
                    }
                }
            }
            if (this.field275) {
                this.method156(this.field280, 10066329, 5592405, -102, 7829367, this.field316, this.field302, 18, this.field284);
                this.method156(this.field280, 10066329, 5592405, -103, 7829367, class25.field375, this.field302, this.field354 - 36, this.field284 - -18);
                this.method156(this.field280, 10066329, 5592405, -110, 7829367, this.field282, this.field302, 18, this.field284 + this.field354 - 18);
                int var9 = this.field284 + 18 + 3;
                int var10 = this.field337;
                for (int var11 = 0; var11 < 24; var11++) {
                    if (var10 < class41.field530.length && this.field325.length > var10) {
                        if (this.field325[var10].method242(class26.field405, -16673)) {
                            var11--;
                            var10++;
                            continue;
                        }
                        class41.field530[var10].method60(this.field280 + 3, var9);
                        int var12 = 16777215;
                        this.field320.method127(this.field325[var10], this.field280 + 21, var9 - -14, 0, -1);
                        if (this.field350 == var10) {
                            var12 = 12298922;
                        }
                        if (this.field283 > 0 && this.field283 % 10 < 5 && this.field287 == var10) {
                            var12 = 16776960;
                        }
                        this.field320.method127(this.field325[var10], this.field280 + 20, var9 + 13, var12, -1);
                    }
                    var10++;
                    var9 += 17;
                }
            }
            if (class40.field513.length == 1) {
                this.method156(this.field294, this.field356, this.field307, -111, this.field349, this.field285, this.field277, 18, this.field357 + this.field286);
                this.method156(this.field280, this.field356, this.field307, -103, this.field349, this.field276, this.field302, 18, this.field354 + this.field284);
                if (this.field324 == 3.0D) {
                    this.method156(this.field328, this.field318, this.field296, -116, this.field289, class19.field205, this.field278, this.field341, this.field288);
                } else {
                    this.method156(this.field328, this.field356, this.field307, -102, this.field349, class19.field205, this.field278, this.field341, this.field288);
                }
                if (this.field324 == 4.0D) {
                    this.method156(this.field332 + this.field328, this.field318, this.field296, -105, this.field289, class23.field266, this.field278, this.field341, this.field288);
                } else {
                    this.method156(this.field328 + this.field332, this.field356, this.field307, -99, this.field349, class23.field266, this.field278, this.field341, this.field288);
                }
                if (this.field324 == 6.0D) {
                    this.method156(this.field332 * 2 + this.field328, this.field318, this.field296, -108, this.field289, class16.field165, this.field278, this.field341, this.field288);
                } else {
                    this.method156(this.field328 + this.field332 * 2, this.field356, this.field307, -124, this.field349, class16.field165, this.field278, this.field341, this.field288);
                }
                if (this.field324 == 8.0D) {
                    this.method156(this.field328 + this.field332 * 3, this.field318, this.field296, -108, this.field289, class36.field472, this.field278, this.field341, this.field288);
                } else {
                    this.method156(this.field328 + this.field332 * 3, this.field356, this.field307, -110, this.field349, class36.field472, this.field278, this.field341, this.field288);
                }
            } else {
                this.method156(this.field294, this.field356, this.field307, -104, this.field349, this.field285, this.field277, 18, this.field286 + this.field357);
                this.method156(this.field280, this.field356, this.field307, -126, this.field349, this.field276, this.field302, 18, this.field284 + this.field354);
                this.method152(this.field349, 0);
                int var13 = this.field288 + this.field311;
                if (this.field324 == 3.0D) {
                    this.method156(this.field328, this.field318, this.field296, -128, this.field289, class19.field205, this.field278, this.field341, var13);
                } else {
                    this.method156(this.field328, this.field356, this.field307, -126, this.field349, class19.field205, this.field278, this.field341, var13);
                }
                if (this.field324 == 4.0D) {
                    this.method156(this.field328 + this.field332, this.field318, this.field296, -114, this.field289, class23.field266, this.field278, this.field341, var13);
                } else {
                    this.method156(this.field328 + this.field332, this.field356, this.field307, -123, this.field349, class23.field266, this.field278, this.field341, var13);
                }
                if (this.field324 == 6.0D) {
                    this.method156(this.field332 * 2 + this.field328, this.field318, this.field296, -111, this.field289, class16.field165, this.field278, this.field341, var13);
                } else {
                    this.method156(this.field332 * 2 + this.field328, this.field356, this.field307, -110, this.field349, class16.field165, this.field278, this.field341, var13);
                }
                if (this.field324 == 8.0D) {
                    this.method156(this.field332 * 3 + this.field328, this.field318, this.field296, -115, this.field289, class36.field472, this.field278, this.field341, var13);
                } else {
                    this.method156(this.field328 + this.field332 * 3, this.field356, this.field307, -106, this.field349, class36.field472, this.field278, this.field341, var13);
                }
            }
            if (class15.field157) {
                this.method156(this.field300, this.field356, this.field307, -121, this.field349, this.field274, this.field335, this.field317, this.field315);
                if (class1.field39) {
                    class2.method14(this.field335 + this.field300 + 2, this.field315, this.field297 + 10, this.field317, 8925952, 192);
                    class2.method16(this.field335 + this.field300 + 2, this.field315, this.field297 + 10, this.field317, 16777215);
                    if (class6.field79 > -1 && this.field344.method262(736276196) > 0) {
                        class40 var14 = this.field319[class6.field79].method264(47, 32, (byte) -111);
                        int var15 = this.field344.method262(736276196);
                        if (var15 > var14.method262(736276196)) {
                            var15 = var14.method262(736276196);
                        }
                        this.field320.method127(var14, this.field335 + this.field300 + 6, 20, 10066176, 0);
                        this.field320.method127(var14.method251(var15, 127, 0), this.field300 + this.field335 + 6, 20, 16777215, 0);
                    } else {
                        this.field320.method127(this.field273, this.field300 + this.field335 + 6, 20, 16776960, 0);
                    }
                }
            }
        }
        if (!arg0) {
            this.field311 = -102;
        }
        if (class40.field525) {
            this.method160((byte) -34);
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(IIIIIIIII)V", line = 1410)
    private final void method161(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var10 = -71 / ((-arg2 - 47) / 55);
        field359.method40(arg5, arg7, true, arg0, arg8, arg6, arg4, arg1, arg3);
        if (arg5 - arg8 < arg4 - arg1) {
            return;
        }
        field359.method39(arg5, arg3, arg4, arg8, arg0, this.field272, arg7, arg1, arg6, 1);
        field359.method54(arg7, arg1, arg0, arg3, arg8, (byte) 79, arg4, arg5, arg6);
        field359.method45(arg6, arg1, 24, arg4, arg8, this.field287, arg7, this.field283, arg3, arg5, arg0);
        if (this.field324 == this.field272 && class20.field212) {
            for (int var11 = 0; var11 < this.field290; var11++) {
                int var12 = this.field304[var11];
                int var13 = var12 - class35.field466;
                int var14 = this.field340[var11];
                int var15 = class25.field379 + class25.field377 - var14;
                int var16 = (arg5 - arg8) * (-arg1 + var13) / (arg4 - arg1) + arg8;
                int var17 = (arg0 - arg3) * (-arg7 + var15) / (arg6 - arg7) + arg3;
                int var18 = this.field291[var11];
                int var19 = 16777215;
                class3 var20 = null;
                if (var18 == 0) {
                    if (this.field272 == 3.0D) {
                        var20 = this.field321;
                    }
                    if (this.field272 == 4.0D) {
                        var20 = this.field295;
                    }
                    if (this.field272 == 6.0D) {
                        var20 = this.field323;
                    }
                    if (this.field272 == 8.0D) {
                        var20 = this.field313;
                    }
                }
                if (var18 == 1) {
                    if (this.field272 == 3.0D) {
                        var20 = this.field323;
                    }
                    if (this.field272 == 4.0D) {
                        var20 = this.field313;
                    }
                    if (this.field272 == 6.0D) {
                        var20 = this.field346;
                    }
                    if (this.field272 == 8.0D) {
                        var20 = this.field353;
                    }
                }
                if (var18 == 2) {
                    var19 = 16755200;
                    if (this.field272 == 3.0D) {
                        var20 = this.field346;
                    }
                    if (this.field272 == 4.0D) {
                        var20 = this.field353;
                    }
                    if (this.field272 == 6.0D) {
                        var20 = this.field309;
                    }
                    if (this.field272 == 8.0D) {
                        var20 = this.field310;
                    }
                }
                if (var20 != null) {
                    class40 var21 = this.field319[var11];
                    int var22 = 1;
                    for (int var23 = 0; var21.method262(736276196) > var23; var23++) {
                        if (var21.method254(-92, var23) == 47) {
                            var22++;
                        }
                    }
                    int var24 = var17 - var20.method23() * (var22 - 1) / 2;
                    int var25 = var24 + var20.method26() / 2;
                    while (true) {
                        int var26 = var21.method260(47, (byte) 76);
                        if (var26 == -1) {
                            var20.method24(var21, var16, var25, var19, true);
                            break;
                        }
                        class40 var27 = var21.method251(var26, 126, 0);
                        var20.method24(var27, var16, var25, var19, true);
                        var25 += var20.method23();
                        var21 = var21.method243(30253, var26 + 1);
                    }
                }
            }
        }
        if (!class15.field158) {
            return;
        }
        for (int var28 = class35.field466 / 64; var28 < (class35.field466 + class14.field138) / 64; var28++) {
            for (int var29 = class25.field379 / 64; var29 < (class25.field379 + class25.field377) / 64; var29++) {
                int var30 = var28 * 64;
                int var31 = var30 - class35.field466;
                int var32 = var29 * 64;
                int var33 = class25.field379 + class25.field377 - var32;
                int var34 = (var33 - arg7 - 64) * (-arg3 + arg0) / (arg6 - arg7) + arg3;
                int var35 = arg8 + (var31 + 64 - arg1) * (-arg8 + arg5) / (arg4 - arg1);
                int var36 = (var31 - arg1) * (-arg8 + arg5) / (arg4 - arg1) + arg8;
                int var37 = arg3 + (arg0 - arg3) * (-arg7 + var33) / (arg6 - arg7);
                class2.method16(var36, var34, var35 - var36, var37 - var34, 16777215);
                this.field320.method128(class35.method212(new class40[] { class6.method48(var28, (byte) -62), class7.field88, class6.method48(var29, (byte) -62) }, true), var35 - 5, var37 + -5, 16777215, -1);
                if (var28 == 33 && var29 >= 71 && var29 <= 73) {
                    this.field320.method123(class7.field93, (var35 + var36) / 2, (var34 + var37) / 2, 16711680, -1);
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "b", descriptor = "(Z)V", line = 1598)
    public final void method98(boolean arg0) {
        class20.method118((byte) -70);
        class36.method217(9522);
        try {
            this.field320 = null;
            this.field291 = null;
            this.field319 = null;
            if (!arg0) {
                return;
            }
            this.field330 = null;
            this.field325 = null;
            this.field340 = null;
            field359 = null;
            this.field304 = null;
            System.gc();
        } catch (Throwable var3) {
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(Ljava/lang/String;Lv;B)Z", line = 1642)
    private final boolean method162(String arg0, class40 arg1, byte arg2) {
        try {
            if (class41.field527 == null) {
                String var4;
                if (arg0 == "main_file_cache.dat0") {
                    var4 = "worldmap.main.js5?crc=723964524";
                } else if (arg0 == "main_file_cache.dat1") {
                    var4 = "worldmap.dungeon.js5?crc=1874371187";
                } else if (arg0 == "main_file_cache.dat2") {
                    var4 = "worldmap.extra.js5?crc=-845080337";
                } else if (arg0 == "main_file_cache.idx1") {
                    var4 = "mapview.fontmetrics.js5?crc=-447025815";
                } else {
                    var4 = "mapview.sprites.js5?crc=-621243366";
                }
                class6.field83 = class35.method212(new class40[] { this.field342, class5.field58, arg1 }, true);
                class41.field527 = new DataInputStream((new URL(this.getCodeBase(), var4)).openStream());
                int var5;
                if (arg0 == "main_file_cache.dat0") {
                    var5 = 419467;
                } else if (arg0 == "main_file_cache.dat1") {
                    var5 = 154709;
                } else if (arg0 == "main_file_cache.dat2") {
                    var5 = 154402;
                } else if (arg0 == "main_file_cache.idx1") {
                    var5 = 165;
                } else {
                    var5 = 9890;
                }
                class30.field426 = 0;
                class12.field131 = 0;
                class34.field458 = new byte[var5];
            }
            int var6 = class12.field131;
            if (arg2 >= -92) {
                return true;
            }
            int var7 = class34.field458.length;
            if (var7 <= var6) {
                class41.field527.close();
                class41.field527 = null;
                if (!this.method158((byte) 87, class34.field458, arg0)) {
                    this.method111(-10209, "download");
                    class34.field458 = null;
                }
                return true;
            }
            class30.field426++;
            if (class30.field426 >= 1500) {
                throw new IOException();
            }
            DataInputStream var8 = class41.field527;
            int var9 = var8.available();
            if (var9 < 0) {
                throw new EOFException();
            } else if (var9 == 0) {
                return false;
            } else {
                if (var9 > var7 - var6) {
                    var9 = var7 - var6;
                }
                int var10 = var8.read(class34.field458, var6, var9);
                if (var10 < 0) {
                    throw new EOFException();
                } else if (var10 == 0) {
                    return false;
                } else {
                    int var11 = var6 + var10;
                    class30.field426 = 0;
                    int var12 = var11 * 100 / var7;
                    class6.field83 = class35.method212(new class40[] { this.field351, class5.field58, arg1, class36.field478, class6.method48(var12, (byte) -62), class31.field436 }, true);
                    class12.field131 = var11;
                    return false;
                }
            }
        } catch (IOException var16) {
            try {
                class41.field527.close();
            } catch (Exception var15) {
            }
            class41.field527 = null;
            class34.field458 = null;
            this.method111(-10209, new String("download"));
            return true;
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(IILo;I)[Lu;", line = 1769)
    public static final class38[] method163(int arg0, int arg1, class26 arg2, int arg3) {
        if (class25.method178(49, arg1, arg3, arg2)) {
            if (arg0 != 27) {
                method150(29);
            }
            return class29.method196((byte) -63);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "h", descriptor = "(I)V", line = 1840)
    public static void method164(int arg0) {
        field345 = null;
        field339 = null;
        field359 = null;
        if (arg0 >= -76) {
            method168(true, (byte) -13, null);
        }
        field292 = null;
        field358 = null;
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(I[BB)I", line = 1863)
    public static final int method165(int arg0, byte[] arg1, byte arg2) {
        if (arg2 != -104) {
            method168(false, (byte) 14, null);
        }
        return class18.method103(true, 0, arg1, arg0);
    }

    @OriginalMember(owner = "mapview!mapview", name = "i", descriptor = "(I)V", line = 1894)
    private final void method166(int arg0) {
        if (class40.field513.length == 1) {
            class41.field536 = 0;
        } else {
            if (class5.field57 >= 0) {
                class41.field536 = class5.field57;
            } else {
                class41.field536 = this.method153(class41.field536, 3);
            }
            class5.field57 = this.method153(class41.field536, 3);
        }
        this.method155(class41.field536, (byte) 62);
        if (arg0 >= -93) {
            this.field309 = null;
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(Lv;Ljava/lang/String;B)Z", line = 1923)
    private final boolean method167(class40 arg0, String arg1, byte arg2) {
        byte[] var4 = null;
        if (!field360) {
            if (class7.field87 != null) {
                try {
                    var4 = this.method159(class7.field87 + "/" + arg1, (byte) 87);
                    if (!this.method158((byte) 87, var4, arg1)) {
                        var4 = null;
                    }
                    if (var4 != null) {
                        class35.field470 = new class15(var4, false, true);
                        return true;
                    }
                } catch (IOException var12) {
                    var4 = null;
                }
            }
            field360 = true;
        }
        if (var4 == null) {
            boolean var6 = this.method162(arg1, arg0, (byte) -93);
            if (!var6) {
                return false;
            }
            var4 = class34.field458;
            class34.field458 = null;
        }
        if (var4 == null) {
            field360 = false;
            return true;
        }
        if (class7.field87 != null && var4 != null) {
            try {
                this.method154(var4, class7.field87 + "/" + arg1, 105);
            } catch (IOException var11) {
            }
        }
        try {
            class35.field470 = new class15(var4, false, true);
            field360 = false;
            int var8 = 114 % ((arg2 - 39) / 47);
            return true;
        } catch (IOException var10) {
            throw class1.method2(var10, "monkey feet");
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(ZBLjava/lang/Object;)[B", line = 1991)
    public static final byte[] method168(boolean arg0, byte arg1, Object arg2) {
        if (arg2 == null) {
            return null;
        } else if (arg2 instanceof byte[]) {
            byte[] var4 = (byte[]) arg2;
            return arg0 ? class11.method68(true, var4) : var4;
        } else if (arg2 instanceof class24) {
            class24 var3 = (class24) arg2;
            return var3.method171(0);
        } else if (arg1 >= -45) {
            return (byte[]) null;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "j", descriptor = "(I)Z", line = 2101)
    private final boolean method169(int arg0) {
        if (class15.field155 == 0) {
            this.method151(0);
            class15.field155 = 1;
        }
        if (class15.field155 == 1) {
            class18.field192 = 15;
            boolean var2 = this.method167(this.field314, "main_file_cache.idx0", (byte) -107);
            if (!var2) {
                return false;
            }
            class18.field190 = class35.field470;
            class35.field470 = null;
            if (class18.field190 == null) {
                throw new RuntimeException("T1");
            }
            class15.field155 = 2;
        }
        if (class15.field155 == 2) {
            class18.field192 = 30;
            boolean var3 = this.method167(this.field271, "main_file_cache.idx1", (byte) -116);
            if (!var3) {
                return false;
            }
            class39.field506 = class35.field470;
            class35.field470 = null;
            if (class39.field506 == null) {
                throw new RuntimeException("T2");
            }
            class15.field155 = 3;
        }
        if (class15.field155 == 3) {
            class40.field513 = new class15[1];
            class15.field155 = 10;
        }
        if (class15.field155 == 10) {
            class18.field192 = 50;
            boolean var4 = this.method167(this.field327, "main_file_cache.dat0", (byte) 125);
            if (!var4) {
                return false;
            }
            class40.field513[0] = class35.field470;
            class35.field470 = null;
            if (class40.field513[0] == null) {
                throw new RuntimeException("T3");
            }
            class15.field155 = 20;
        }
        if (class15.field155 != 20) {
            if (arg0 != 17) {
                this.method157((byte) -30, -68);
            }
            return false;
        }
        class5.field56 = class31.method200(class20.field215, class25.field375, (byte) 11, class18.field190);
        class41.field530 = class23.method147((byte) -103, class18.field190, class25.field375, class11.field119);
        this.field320 = class11.method69(class39.field506, arg0 - 6015, class25.field375, class18.field190, class1.field20);
        this.field321 = new class3(11, true, this);
        this.field295 = new class3(12, true, this);
        this.field323 = new class3(14, true, this);
        this.field313 = new class3(17, true, this);
        this.field346 = new class3(19, true, this);
        this.field353 = new class3(22, true, this);
        this.field309 = new class3(26, true, this);
        this.field310 = new class3(30, true, this);
        class6.field83 = this.field331;
        class18.field192 = 100;
        class37.method228(class18.field192, null, class6.field83, (byte) 89);
        this.field335 = this.field320.method133(this.field274) + 20;
        this.method166(-104);
        class40[] var5 = this.field325;
        for (int var6 = 0; var6 < var5.length; var6++) {
            class40 var7 = var5[var6];
            int var8 = this.field320.method133(var7);
            if (var8 > this.field348) {
                this.field348 = var8;
            }
        }
        this.field302 = this.field348 + 34;
        if (this.field302 > 140) {
            int var9 = this.field294 - this.field302 - this.field280;
            this.field322 = var9 / 25;
            this.field278 = this.field322 * 5;
            this.field332 = this.field322 + this.field278;
            int var10 = var9 - this.field322 * 25;
            this.field328 = var10 / 2 + this.field322 + this.field302 + this.field280;
        }
        return true;
    }
}
