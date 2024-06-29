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
public class mapview extends class3 {

    @OriginalMember(owner = "mapview!mapview", name = "p", descriptor = "I")
    private int field271 = 6706483;

    @OriginalMember(owner = "mapview!mapview", name = "l", descriptor = "I")
    private int field267 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "q", descriptor = "I")
    private int field272 = 23;

    @OriginalMember(owner = "mapview!mapview", name = "E", descriptor = "I")
    private int field286 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "j", descriptor = "I")
    private int field265 = 8943445;

    @OriginalMember(owner = "mapview!mapview", name = "G", descriptor = "I")
    private int field288 = -1;

    @OriginalMember(owner = "mapview!mapview", name = "K", descriptor = "Z")
    private boolean field292 = true;

    @OriginalMember(owner = "mapview!mapview", name = "M", descriptor = "I")
    private int field294 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "I", descriptor = "Z")
    private boolean field290 = false;

    @OriginalMember(owner = "mapview!mapview", name = "R", descriptor = "I")
    private int field299 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "gb", descriptor = "I")
    private int field314 = 471;

    @OriginalMember(owner = "mapview!mapview", name = "P", descriptor = "I")
    private int field297 = 11141120;

    @OriginalMember(owner = "mapview!mapview", name = "V", descriptor = "I")
    private int field303 = 5;

    @OriginalMember(owner = "mapview!mapview", name = "ob", descriptor = "I")
    private int field322 = 40;

    @OriginalMember(owner = "mapview!mapview", name = "Eb", descriptor = "I")
    private int field338 = 170;

    @OriginalMember(owner = "mapview!mapview", name = "Bb", descriptor = "I")
    private int field335 = 140;

    @OriginalMember(owner = "mapview!mapview", name = "O", descriptor = "I")
    private int field296 = 30;

    @OriginalMember(owner = "mapview!mapview", name = "Pb", descriptor = "I")
    private int field349 = 5;

    @OriginalMember(owner = "mapview!mapview", name = "n", descriptor = "I")
    private int field269 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "C", descriptor = "Z")
    private boolean field284 = false;

    @OriginalMember(owner = "mapview!mapview", name = "J", descriptor = "I")
    private int field291 = 10027008;

    @OriginalMember(owner = "mapview!mapview", name = "L", descriptor = "I")
    private int field293 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "T", descriptor = "I")
    private int field301 = -1;

    @OriginalMember(owner = "mapview!mapview", name = "X", descriptor = "I")
    private int field305 = -20;

    @OriginalMember(owner = "mapview!mapview", name = "s", descriptor = "D")
    private double field274 = 4.0D;

    @OriginalMember(owner = "mapview!mapview", name = "ab", descriptor = "D")
    private double field308 = 4.0D;

    @OriginalMember(owner = "mapview!mapview", name = "tb", descriptor = "I")
    private int field327 = 7824964;

    @OriginalMember(owner = "mapview!mapview", name = "A", descriptor = "I")
    private int field282 = 8912896;

    @OriginalMember(owner = "mapview!mapview", name = "nb", descriptor = "I")
    private int field321 = 450;

    @OriginalMember(owner = "mapview!mapview", name = "Qb", descriptor = "I")
    private int field350 = 50;

    @OriginalMember(owner = "mapview!mapview", name = "yb", descriptor = "I")
    private int field332 = 500;

    @OriginalMember(owner = "mapview!mapview", name = "Kb", descriptor = "Z")
    private boolean field344 = false;

    @OriginalMember(owner = "mapview!mapview", name = "wb", descriptor = "Lua;")
    private class41 field330 = this.field344 ? class32.field422 : class42.field517;

    @OriginalMember(owner = "mapview!mapview", name = "N", descriptor = "I")
    private int field295 = this.field344 ? 115 : 102;

    @OriginalMember(owner = "mapview!mapview", name = "Ab", descriptor = "I")
    private int field334 = 33;

    @OriginalMember(owner = "mapview!mapview", name = "Fb", descriptor = "Lua;")
    private class41 field339 = this.field344 ? class25.field261 : class25.field261;

    @OriginalMember(owner = "mapview!mapview", name = "z", descriptor = "Lua;")
    private class41 field281 = this.field344 ? class20.field183 : class20.field183;

    @OriginalMember(owner = "mapview!mapview", name = "u", descriptor = "Lua;")
    private class41 field276 = this.field344 ? class28.field380 : class28.field380;

    @OriginalMember(owner = "mapview!mapview", name = "pb", descriptor = "Lua;")
    private class41 field323 = this.field344 ? class32.field418 : class32.field418;

    @OriginalMember(owner = "mapview!mapview", name = "Mb", descriptor = "I")
    private int field346 = 5;

    @OriginalMember(owner = "mapview!mapview", name = "y", descriptor = "[I")
    private int[] field280 = new int[this.field332];

    @OriginalMember(owner = "mapview!mapview", name = "w", descriptor = "Lua;")
    private class41 field278 = this.field344 ? class4.field61 : class4.field61;

    @OriginalMember(owner = "mapview!mapview", name = "Sb", descriptor = "I")
    private int field352 = -1;

    @OriginalMember(owner = "mapview!mapview", name = "o", descriptor = "Lua;")
    private class41 field270 = this.field344 ? class28.field377 : class28.field377;

    @OriginalMember(owner = "mapview!mapview", name = "D", descriptor = "Lua;")
    private class41 field285 = this.field344 ? class4.field71 : class36.field451;

    @OriginalMember(owner = "mapview!mapview", name = "hb", descriptor = "I")
    private int field315 = this.field344 ? 108 : 107;

    @OriginalMember(owner = "mapview!mapview", name = "r", descriptor = "I")
    private int field273 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "kb", descriptor = "[I")
    private int[] field318 = new int[this.field332];

    @OriginalMember(owner = "mapview!mapview", name = "fb", descriptor = "[Lua;")
    private class41[] field313 = new class41[this.field332];

    @OriginalMember(owner = "mapview!mapview", name = "bb", descriptor = "Lua;")
    private class41 field309 = this.field344 ? class34.field432 : class34.field432;

    @OriginalMember(owner = "mapview!mapview", name = "eb", descriptor = "Z")
    private boolean field312 = false;

    @OriginalMember(owner = "mapview!mapview", name = "U", descriptor = "I")
    private int field302 = this.field344 ? 83 : 70;

    @OriginalMember(owner = "mapview!mapview", name = "B", descriptor = "Lua;")
    private class41 field283 = this.field344 ? class31.field414 : class31.field414;

    @OriginalMember(owner = "mapview!mapview", name = "mb", descriptor = "I")
    private int field320 = 10;

    @OriginalMember(owner = "mapview!mapview", name = "qb", descriptor = "I")
    private int field324 = this.field350 + this.field320;

    @OriginalMember(owner = "mapview!mapview", name = "Z", descriptor = "I")
    private int field307 = this.field344 ? 76 : 75;

    @OriginalMember(owner = "mapview!mapview", name = "m", descriptor = "I")
    private int field268 = this.field344 ? 252 : 111;

    @OriginalMember(owner = "mapview!mapview", name = "Hb", descriptor = "I")
    private int field341 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "Lb", descriptor = "I")
    private int field345 = this.field344 ? 220 : 79;

    @OriginalMember(owner = "mapview!mapview", name = "Ib", descriptor = "Lua;")
    private class41 field342 = this.field344 ? class39.field479 : class4.field64;

    @OriginalMember(owner = "mapview!mapview", name = "jb", descriptor = "[I")
    private int[] field317 = new int[this.field332];

    @OriginalMember(owner = "mapview!mapview", name = "lb", descriptor = "Lua;")
    private class41 field319 = this.field344 ? class16.field133 : class16.field133;

    @OriginalMember(owner = "mapview!mapview", name = "Rb", descriptor = "Lua;")
    private class41 field351 = this.field344 ? class23.field242 : class23.field242;

    @OriginalMember(owner = "mapview!mapview", name = "v", descriptor = "Lua;")
    public static class41 field277 = class16.method86("Fishing Spot", true);

    @OriginalMember(owner = "mapview!mapview", name = "sb", descriptor = "Lua;")
    private static class41 field326 = class16.method86("world", true);

    @OriginalMember(owner = "mapview!mapview", name = "t", descriptor = "Lua;")
    private static class41 field275 = class16.method86("b12_full", true);

    @OriginalMember(owner = "mapview!mapview", name = "Q", descriptor = "I")
    public static int field298 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "F", descriptor = "Lua;")
    public static class41 field287 = class16.method86("Agility Training", true);

    @OriginalMember(owner = "mapview!mapview", name = "k", descriptor = "Lua;")
    public static class41 field266 = class16.method86("Gem Shop", true);

    @OriginalMember(owner = "mapview!mapview", name = "W", descriptor = "Lua;")
    public static class41 field304 = class16.method86("Mace Shop", true);

    @OriginalMember(owner = "mapview!mapview", name = "rb", descriptor = "Lua;")
    public static class41 field325 = class16.method86("Slayer Master", true);

    @OriginalMember(owner = "mapview!mapview", name = "Nb", descriptor = "Lua;")
    public static class41 field347 = class16.method86("Transportation", true);

    @OriginalMember(owner = "mapview!mapview", name = "i", descriptor = "I")
    private int field264;

    @OriginalMember(owner = "mapview!mapview", name = "H", descriptor = "I")
    private int field289;

    @OriginalMember(owner = "mapview!mapview", name = "ub", descriptor = "I")
    private int field328;

    @OriginalMember(owner = "mapview!mapview", name = "vb", descriptor = "I")
    private int field329;

    @OriginalMember(owner = "mapview!mapview", name = "Ub", descriptor = "I")
    public static int field354;

    @OriginalMember(owner = "mapview!mapview", name = "Zb", descriptor = "I")
    public static int field359;

    @OriginalMember(owner = "mapview!mapview", name = "Tb", descriptor = "I")
    private int imageOverviewHeight;

    @OriginalMember(owner = "mapview!mapview", name = "cb", descriptor = "I")
    private int imageOverviewWidth;

    @OriginalMember(owner = "mapview!mapview", name = "Gb", descriptor = "I")
    private int overviewX;

    @OriginalMember(owner = "mapview!mapview", name = "xb", descriptor = "I")
    private int overviewY;

    @OriginalMember(owner = "mapview!mapview", name = "Y", descriptor = "Lj;")
    private class18 field306;

    @OriginalMember(owner = "mapview!mapview", name = "x", descriptor = "Ll;")
    private class22 field279;

    @OriginalMember(owner = "mapview!mapview", name = "S", descriptor = "Ll;")
    private class22 field300;

    @OriginalMember(owner = "mapview!mapview", name = "Cb", descriptor = "Ll;")
    private class22 field336;

    @OriginalMember(owner = "mapview!mapview", name = "Jb", descriptor = "Ll;")
    private class22 field343;

    @OriginalMember(owner = "mapview!mapview", name = "Ob", descriptor = "Ll;")
    private class22 field348;

    @OriginalMember(owner = "mapview!mapview", name = "Vb", descriptor = "Ll;")
    private class22 field355;

    @OriginalMember(owner = "mapview!mapview", name = "Wb", descriptor = "Ll;")
    private class22 field356;

    @OriginalMember(owner = "mapview!mapview", name = "Xb", descriptor = "Ll;")
    private class22 field357;

    @OriginalMember(owner = "mapview!mapview", name = "db", descriptor = "Lna;")
    private class27 field311;

    @OriginalMember(owner = "mapview!mapview", name = "ib", descriptor = "Lua;")
    private class41 field316;

    @OriginalMember(owner = "mapview!mapview", name = "Yb", descriptor = "[B")
    public static byte[] field358;

    @OriginalMember(owner = "mapview!mapview", name = "zb", descriptor = "[Lua;")
    private class41[] field333;

    @OriginalMember(owner = "mapview!mapview", name = "Db", descriptor = "[Lua;")
    private class41[] field337;

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(Z)V", line = 46)
    public final void method27(boolean arg0) {
        class34.method198(-25580);
        class8.method48(15666);
        try {
            this.field313 = null;
            class10.field106 = null;
            this.field318 = null;
            this.field311 = null;
            this.field337 = null;
            this.field317 = null;
            this.field306 = null;
            this.field280 = null;
            if (!arg0) {
                this.field345 = -102;
            }
            System.gc();
        } catch (Throwable var3) {
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "c", descriptor = "(Z)V", line = 95)
    public static void method153(boolean arg0) {
        field358 = null;
        field287 = null;
        field277 = null;
        field304 = null;
        field266 = null;
        field325 = null;
        field326 = null;
        field347 = null;
        field275 = null;
        if (arg0) {
            method166(false, null, false);
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "g", descriptor = "(I)Z", line = 129)
    private final boolean method154(int arg0) {
        if (class26.field360 == 0) {
            this.method155((byte) -62);
            class26.field360 = 1;
        }
        if (arg0 != -31088) {
            this.method156(78, true);
        }
        if (class26.field360 == 1) {
            class23.field237 = 15;
            boolean var2 = this.method162(-2, "main_file_cache.idx0", this.field309);
            if (!var2) {
                return false;
            }
            class38.field473 = class10.field105;
            class10.field105 = null;
            if (class38.field473 == null) {
                throw new RuntimeException("T1");
            }
            class26.field360 = 2;
        }
        if (class26.field360 == 2) {
            class23.field237 = 30;
            boolean var3 = this.method162(-2, "main_file_cache.idx1", this.field339);
            if (!var3) {
                return false;
            }
            class43.field533 = class10.field105;
            class10.field105 = null;
            if (class43.field533 == null) {
                throw new RuntimeException("T2");
            }
            class26.field360 = 3;
        }
        if (class26.field360 == 3) {
            class26.field360 = 10;
            class41.field504 = new class26[1];
        }
        if (class26.field360 == 10) {
            class23.field237 = 50;
            boolean var4 = this.method162(arg0 ^ 0x796E, "main_file_cache.dat0", this.field351);
            if (!var4) {
                return false;
            }
            class41.field504[0] = class10.field105;
            class10.field105 = null;
            if (class41.field504[0] == null) {
                throw new RuntimeException("T3");
            }
            class26.field360 = 20;
        }
        if (class26.field360 != 20) {
            return false;
        }
        class21.field211 = class13.method74(class16.field142, (byte) 126, class34.field434, class38.field473);
        class37.field458 = class20.method111(class16.field142, class23.field248, class38.field473, true);
        this.field311 = class25.method148(class38.field473, class43.field533, -1, class16.field142, field275);
        this.field279 = new class22(11, true, this);
        this.field355 = new class22(12, true, this);
        this.field356 = new class22(14, true, this);
        this.field357 = new class22(17, true, this);
        this.field336 = new class22(19, true, this);
        this.field343 = new class22(22, true, this);
        this.field300 = new class22(26, true, this);
        this.field348 = new class22(30, true, this);
        class23.field237 = 100;
        class23.field246 = this.field283;
        class35.method202(true, -10128, class23.field246, class23.field237, null);
        this.field322 = this.field311.method19(this.field330) + 20;
        this.method159(true);
        int var5 = 0;
        class41[] var6 = this.field337;
        while (var5 < var6.length) {
            class41 var7 = var6[var5];
            int var8 = this.field311.method19(var7);
            if (this.field329 < var8) {
                this.field329 = var8;
            }
            var5++;
        }
        this.field335 = this.field329 + 16 + 18;
        if (this.field335 > 140) {
            int var9 = this.overviewX - this.field303 - this.field335;
            this.field320 = var9 / 25;
            int var10 = var9 - this.field320 * 25;
            this.field338 = var10 / 2 + this.field335 + this.field320 + this.field303;
            this.field350 = this.field320 * 5;
            this.field324 = this.field350 + this.field320;
        }
        return true;
    }

    @OriginalMember(owner = "mapview!mapview", name = "d", descriptor = "(B)V", line = 267)
    private final void method155(byte arg0) {
        if (arg0 > -43) {
            return;
        }
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
                        class39.field484 = var8 + var6 + "/rsmap/";
                        return;
                    }
                }
            } catch (Exception var14) {
            }
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(IZ)I", line = 335)
    private final int method156(int arg0, boolean arg1) {
        arg0++;
        if (arg0 >= class41.field504.length) {
            arg0 = 0;
        }
        if (!arg1) {
            this.method157((byte) -110, null, null);
        }
        return arg0;
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(BLua;Ljava/lang/String;)Z", line = 360)
    private final boolean method157(byte arg0, class41 arg1, String arg2) {
        if (arg0 != 30) {
            this.method169(null, null, (byte) 90);
        }
        try {
            if (class32.field417 == null) {
                class23.field246 = class14.method81(-125, new class41[] { this.field276, class11.field111, arg1 });
                String var4;
                if (arg2 == "main_file_cache.dat0") {
                    var4 = "worldmap.main.js5?crc=-1830252623";
                } else if (arg2 == "main_file_cache.dat1") {
                    var4 = "worldmap.dungeon.js5?crc=-1075628674";
                } else if (arg2 == "main_file_cache.dat2") {
                    var4 = "worldmap.extra.js5?crc=1732695008";
                } else if (arg2 == "main_file_cache.idx1") {
                    var4 = "mapview.fontmetrics.js5?crc=1281583541";
                } else {
                    var4 = "mapview.sprites.js5?crc=-1435602895";
                }
                int var5;
                if (arg2 == "main_file_cache.dat0") {
                    var5 = 446118;
                } else if (arg2 == "main_file_cache.dat1") {
                    var5 = 159070;
                } else if (arg2 == "main_file_cache.dat2") {
                    var5 = 182108;
                } else if (arg2 == "main_file_cache.idx1") {
                    var5 = 164;
                } else {
                    var5 = 10163;
                }
                class32.field417 = new DataInputStream((new URL(this.getCodeBase(), var4)).openStream());
                class43.field522 = 0;
                class4.field65 = 0;
                class31.field408 = new byte[var5];
            }
            int var6 = class4.field65;
            int var7 = class31.field408.length;
            if (var6 >= var7) {
                class32.field417.close();
                class32.field417 = null;
                if (!this.method169(arg2, class31.field408, (byte) 70)) {
                    this.method28((byte) -44, "download");
                    class31.field408 = null;
                }
                return true;
            }
            class43.field522++;
            if (class43.field522 >= 1500) {
                throw new IOException();
            }
            DataInputStream var8 = class32.field417;
            int var9 = var8.available();
            if (var9 < 0) {
                throw new EOFException();
            } else if (var9 == 0) {
                return false;
            } else {
                if (var7 - var6 < var9) {
                    var9 = var7 - var6;
                }
                int var10 = var8.read(class31.field408, var6, var9);
                if (var10 < 0) {
                    throw new EOFException();
                } else if (var10 == 0) {
                    return false;
                } else {
                    int var11 = var6 + var10;
                    int var12 = var11 * 100 / var7;
                    class43.field522 = 0;
                    class23.field246 = class14.method81(-111, new class41[] { this.field323, class11.field111, arg1, class29.field381, class20.method110(var12, true), class38.field470 });
                    class4.field65 = var11;
                    return false;
                }
            }
        } catch (IOException var16) {
            try {
                class32.field417.close();
            } catch (Exception var15) {
            }
            class31.field408 = null;
            class32.field417 = null;
            this.method28((byte) -38, new String("download"));
            return true;
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(IIIIILua;BII)V", line = 487)
    private final void method158(int arg0, int arg1, int arg2, int arg3, int arg4, class41 arg5, byte arg6, int arg7, int arg8) {
        class12.method69(arg0, arg7, arg4, arg3, 0);
        int var12 = arg4 - 2;
        int var11 = arg3 - 2;
        int var10 = arg0 + 1;
        if (arg6 != -115) {
            method153(true);
        }
        int var13 = arg7 + 1;
        class12.method73(var10, var13, var12, var11, arg1);
        class12.method65(var10, var13, var12, arg8);
        class12.method64(var10, var13, var11, arg8);
        class12.method65(var10, var11 + var13 - 1, var12, arg2);
        class12.method64(var10 + var12 - 1, var13, var11, arg2);
        this.field311.method13(arg5, var10 + var12 / 2 + 1, var11 / 2 + var13 + 1 - -4, 0, -1);
        this.field311.method13(arg5, var12 / 2 + var10, var11 / 2 + 4 + var13, 16777215, -1);
    }

    @OriginalMember(owner = "mapview!mapview", name = "d", descriptor = "(Z)V", line = 509)
    private final void method159(boolean arg0) {
        if (!arg0) {
            field298 = 4;
        }
        if (class41.field504.length == 1) {
            class21.field202 = 0;
        } else {
            if (class41.field506 >= 0) {
                class21.field202 = class41.field506;
            } else {
                class21.field202 = this.method156(class21.field202, true);
            }
            class41.field506 = this.method156(class21.field202, true);
        }
        this.method161(class21.field202, 68);
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(II)V", line = 533)
    private final void method160(int arg0, int arg1) {
        this.method158(170, arg0, this.field271, 18, 230, class14.method81(-93, new class41[] { class13.field121, class37.field457[class41.field506], class40.field492 }), (byte) -115, 483, this.field265);
        if (arg1 < 89) {
            this.method161(66, -127);
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "b", descriptor = "(II)V", line = 552)
    private final void method161(int arg0, int arg1) {
        if (arg0 < class41.field504.length) {
            class26 var3 = class41.field504[arg0];
            class19 var4 = new class19(var3.method251((byte) -121, class32.field420, field326));
            var4.method104((byte) -43);
            class19 var5 = new class19(var3.method251((byte) -103, class37.field463, field326));
            this.field273 = var5.method99(255);
            for (int var6 = 0; var6 < this.field273; var6++) {
                this.field313[var6] = var5.method104((byte) -43);
                this.field317[var6] = var5.method99(255);
                this.field318[var6] = var5.method99(255);
                this.field280[var6] = var5.method100(-10);
                class41 var7 = this.field313[var6].method226(32, 47, (byte) -79);
                int var8 = this.field311.method19(var7);
                if (var8 > this.field264) {
                    this.field264 = var8;
                }
                int var9 = this.field311.method19(this.field278);
                if (this.field264 < var9) {
                    this.field264 = var9;
                }
            }
            class10.field106 = new class25();
            class10.field106.method138(class41.field504[arg0], 31464);
            this.imageOverviewHeight = 180;
            this.imageOverviewWidth = class8.sizeX * this.imageOverviewHeight / class19.sizeZ;
            class42.field518 = class14.field129;
            this.overviewX = 635 - this.imageOverviewWidth - 5;
            class26.field371 = class10.field103;
            this.overviewY = 503 - this.imageOverviewHeight - 20;
            this.field306 = new class18(this.imageOverviewWidth, this.imageOverviewHeight);
            this.field306.bind();
            this.method163(0, 0, 69, class8.sizeX, 0, 0, this.imageOverviewWidth, class19.sizeZ, this.imageOverviewHeight);
            class12.method69(0, 0, this.imageOverviewWidth, this.imageOverviewHeight, 0);
            class12.method69(1, 1, this.imageOverviewWidth - 2, this.imageOverviewHeight + -2, this.field265);
            class23.field243.method176(true);
        }
        int var10 = 40 % ((-arg1 - 1) / 59);
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(ILjava/lang/String;Lua;)Z", line = 623)
    private final boolean method162(int arg0, String arg1, class41 arg2) {
        byte[] var4 = null;
        if (!class10.field104) {
            if (class39.field484 != null) {
                try {
                    var4 = this.method170((byte) -104, class39.field484 + "/" + arg1);
                    if (!this.method169(arg1, var4, (byte) 127)) {
                        var4 = null;
                    }
                    if (var4 != null) {
                        class10.field105 = new class26(var4, false, true);
                        return true;
                    }
                } catch (IOException var11) {
                    var4 = null;
                }
            }
            class10.field104 = true;
        }
        if (var4 == null) {
            boolean var6 = this.method157((byte) 30, arg2, arg1);
            if (!var6) {
                return false;
            }
            var4 = class31.field408;
            class31.field408 = null;
        }
        if (var4 == null) {
            class10.field104 = false;
            return true;
        }
        if (class39.field484 != null && var4 != null) {
            try {
                this.method165(var4, (byte) -122, class39.field484 + "/" + arg1);
            } catch (IOException var10) {
            }
        }
        try {
            class10.field105 = new class26(var4, false, true);
            if (arg0 == -2) {
                class10.field104 = false;
                return true;
            } else {
                return true;
            }
        } catch (IOException var9) {
            throw class43.method255(var9, "monkey feet");
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(IIIIIIIII)V", line = 705)
    private final void method163(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class10.field106.method141(arg6, arg0, -85, arg4, arg5, arg7, arg3, arg1, arg8);
        if (arg6 - arg0 < -arg4 + arg3) {
            return;
        }
        class10.field106.method146(arg7, arg8, arg6, arg1, arg5, arg3, this.field274, arg0, (byte) -69, arg4);
        class10.field106.method150(arg6, arg4, arg1, (byte) -122, arg5, arg8, arg0, arg3, arg7);
        if (arg2 <= 31) {
            return;
        }
        class10.field106.method147(arg4, arg1, arg7, arg0, arg8, (byte) 108, arg5, this.field267, arg6, this.field301, arg3);
        if (this.field308 == this.field274 && class3.field58) {
            for (int var10 = 0; var10 < this.field273; var10++) {
                int var11 = this.field317[var10];
                int var12 = var11 - class13.originX;
                int var13 = this.field318[var10];
                int var14 = this.field280[var10];
                int var15 = 16777215;
                int var16 = class26.originZ + class19.sizeZ - var13;
                class22 var17 = null;
                if (var14 == 0) {
                    if (this.field274 == 3.0D) {
                        var17 = this.field279;
                    }
                    if (this.field274 == 4.0D) {
                        var17 = this.field355;
                    }
                    if (this.field274 == 6.0D) {
                        var17 = this.field356;
                    }
                    if (this.field274 == 8.0D) {
                        var17 = this.field357;
                    }
                }
                if (var14 == 1) {
                    if (this.field274 == 3.0D) {
                        var17 = this.field356;
                    }
                    if (this.field274 == 4.0D) {
                        var17 = this.field357;
                    }
                    if (this.field274 == 6.0D) {
                        var17 = this.field336;
                    }
                    if (this.field274 == 8.0D) {
                        var17 = this.field343;
                    }
                }
                int var18 = (arg6 - arg0) * (-arg4 + var12) / (arg3 - arg4) + arg0;
                if (var14 == 2) {
                    var15 = 16755200;
                    if (this.field274 == 3.0D) {
                        var17 = this.field336;
                    }
                    if (this.field274 == 4.0D) {
                        var17 = this.field343;
                    }
                    if (this.field274 == 6.0D) {
                        var17 = this.field300;
                    }
                    if (this.field274 == 8.0D) {
                        var17 = this.field348;
                    }
                }
                int var19 = arg1 + (arg8 - arg1) * (-arg5 + var16) / (arg7 - arg5);
                if (var17 != null) {
                    class41 var20 = this.field313[var10];
                    int var21 = 1;
                    for (int var22 = 0; var20.method234((byte) 116) > var22; var22++) {
                        if (var20.method233(-123, var22) == 47) {
                            var21++;
                        }
                    }
                    int var23 = var19 - (var21 - 1) * var17.method115() / 2;
                    int var24 = var23 + var17.method121() / 2;
                    while (true) {
                        int var25 = var20.method240((byte) -32, 47);
                        if (var25 == -1) {
                            var17.method118(var20, var18, var24, var15, true);
                            break;
                        }
                        class41 var26 = var20.method244(0, var25, true);
                        var17.method118(var26, var18, var24, var15, true);
                        var24 += var17.method115();
                        var20 = var20.method229(var25 + 1, true);
                    }
                }
            }
        }
        if (!class31.field409) {
            return;
        }
        for (int var27 = class13.originX / 64; var27 < (class13.originX + class8.sizeX) / 64; var27++) {
            for (int var28 = class26.originZ / 64; var28 < (class26.originZ + class19.sizeZ) / 64; var28++) {
                int var29 = var27 * 64;
                int var30 = var29 - class13.originX;
                int var31 = var28 * 64;
                int var32 = class26.originZ + class19.sizeZ - var31;
                int var33 = (var30 + 64 - arg4) * (-arg0 + arg6) / (arg3 - arg4) + arg0;
                int var34 = (var32 - arg5 - 64) * (-arg1 + arg8) / (arg7 - arg5) + arg1;
                int var35 = (var30 - arg4) * (-arg0 + arg6) / (arg3 - arg4) + arg0;
                int var36 = (arg8 - arg1) * (-arg5 + var32) / (arg7 - arg5) + arg1;
                class12.method69(var35, var34, var33 - var35, -var34 + var36, 16777215);
                this.field311.method12(class14.method81(-79, new class41[] { class20.method110(var27, true), class25.field253, class20.method110(var28, true) }), var33 - 5, var36 + -5, 16777215, -1);
                if (var27 == 33 && var28 >= 71 && var28 <= 73) {
                    this.field311.method13(class23.field244, (var33 + var35) / 2, (var34 + var36) / 2, 16711680, -1);
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "b", descriptor = "(B)V", line = 889)
    public final void method24(byte arg0) {
        if (!class26.field368) {
            class26.field368 = this.method154(-31088);
            class35.method202(true, -10128, class23.field246, class23.field237, null);
            return;
        }
        if (this.field292) {
            class36.field449 = true;
            this.field292 = false;
            class12.method62();
            int var2 = class42.field518 - (int) (503.0D / this.field274);
            int var3 = (int) (635.0D / this.field274) + class26.field371;
            int var4 = class26.field371 - (int) (635.0D / this.field274);
            int var5 = class42.field518 + (int) (503.0D / this.field274);
            this.method163(0, 0, 44, var3, var4, var2, 635, var5, 503);
            if (this.field312) {
                this.field306.method94(this.overviewX, this.overviewY);
                class12.method72(this.overviewX + this.imageOverviewWidth * var4 / class8.sizeX, this.overviewY - -(this.imageOverviewHeight * var2 / class19.sizeZ), (var3 - var4) * this.imageOverviewWidth / class8.sizeX, (var5 - var2) * this.imageOverviewHeight / class19.sizeZ, 16711680, 128);
                class12.method69(this.imageOverviewWidth * var4 / class8.sizeX + this.overviewX, this.overviewY - -(this.imageOverviewHeight * var2 / class19.sizeZ), (var3 - var4) * this.imageOverviewWidth / class8.sizeX, (var5 - var2) * this.imageOverviewHeight / class19.sizeZ, 16711680);
                if (this.field267 > 0 && this.field267 % 10 < 5) {
                    for (int var6 = 0; var6 < class19.field170; var6++) {
                        if (class10.field106.field254[var6] == this.field301) {
                            int var7 = class10.field106.field251[var6] * this.imageOverviewWidth / class8.sizeX + this.overviewX;
                            int var8 = this.overviewY + class10.field106.field262[var6] * this.imageOverviewHeight / class19.sizeZ;
                            class12.method70(var7, var8, 2, 16776960, 256);
                        }
                    }
                }
            }
            if (this.field290) {
                this.method158(this.field303, 7829367, 5592405, 18, this.field335, this.field319, (byte) -115, this.field334, 10066329);
                this.method158(this.field303, 7829367, 5592405, this.field321 - 36, this.field335, class16.field142, (byte) -115, this.field334 + 18, 10066329);
                this.method158(this.field303, 7829367, 5592405, 18, this.field335, this.field281, (byte) -115, this.field334 + this.field321 - 18, 10066329);
                int var9 = this.field334 + 18 + 3;
                int var10 = this.field293;
                for (int var11 = 0; var11 < 24; var11++) {
                    if (class37.field458.length > var10 && this.field337.length > var10) {
                        if (this.field337[var10].method225(class11.field112, 0)) {
                            var10++;
                            var11--;
                            continue;
                        }
                        class37.field458[var10].method91(this.field303 + 3, var9);
                        int var12 = 16777215;
                        this.field311.method15(this.field337[var10], this.field303 + 21, var9 + 14, 0, -1);
                        if (this.field288 == var10) {
                            var12 = 12298922;
                        }
                        if (this.field267 > 0 && this.field267 % 10 < 5 && this.field301 == var10) {
                            var12 = 16776960;
                        }
                        this.field311.method15(this.field337[var10], this.field303 + 20, var9 - -13, var12, -1);
                    }
                    var9 += 17;
                    var10++;
                }
            }
            if (class41.field504.length == 1) {
                this.method158(this.overviewX, this.field327, this.field271, 18, this.imageOverviewWidth, this.field285, (byte) -115, this.overviewY + this.imageOverviewHeight, this.field265);
                this.method158(this.field303, this.field327, this.field271, 18, this.field335, this.field342, (byte) -115, this.field334 + this.field321, this.field265);
                if (this.field308 == 3.0D) {
                    this.method158(this.field338, this.field291, this.field282, this.field296, this.field350, class34.field425, (byte) -115, this.field314, this.field297);
                } else {
                    this.method158(this.field338, this.field327, this.field271, this.field296, this.field350, class34.field425, (byte) -115, this.field314, this.field265);
                }
                if (this.field308 == 4.0D) {
                    this.method158(this.field338 + this.field324, this.field291, this.field282, this.field296, this.field350, class21.field199, (byte) -115, this.field314, this.field297);
                } else {
                    this.method158(this.field338 + this.field324, this.field327, this.field271, this.field296, this.field350, class21.field199, (byte) -115, this.field314, this.field265);
                }
                if (this.field308 == 6.0D) {
                    this.method158(this.field324 * 2 + this.field338, this.field291, this.field282, this.field296, this.field350, class37.field469, (byte) -115, this.field314, this.field297);
                } else {
                    this.method158(this.field324 * 2 + this.field338, this.field327, this.field271, this.field296, this.field350, class37.field469, (byte) -115, this.field314, this.field265);
                }
                if (this.field308 == 8.0D) {
                    this.method158(this.field324 * 3 + this.field338, this.field291, this.field282, this.field296, this.field350, class13.field125, (byte) -115, this.field314, this.field297);
                } else {
                    this.method158(this.field338 + this.field324 * 3, this.field327, this.field271, this.field296, this.field350, class13.field125, (byte) -115, this.field314, this.field265);
                }
            } else {
                this.method158(this.overviewX, this.field327, this.field271, 18, this.imageOverviewWidth, this.field285, (byte) -115, this.overviewY + this.imageOverviewHeight, this.field265);
                this.method158(this.field303, this.field327, this.field271, 18, this.field335, this.field342, (byte) -115, this.field334 + this.field321, this.field265);
                this.method160(this.field327, 102);
                int var13 = this.field314 + this.field305;
                if (this.field308 == 3.0D) {
                    this.method158(this.field338, this.field291, this.field282, this.field296, this.field350, class34.field425, (byte) -115, var13, this.field297);
                } else {
                    this.method158(this.field338, this.field327, this.field271, this.field296, this.field350, class34.field425, (byte) -115, var13, this.field265);
                }
                if (this.field308 == 4.0D) {
                    this.method158(this.field338 + this.field324, this.field291, this.field282, this.field296, this.field350, class21.field199, (byte) -115, var13, this.field297);
                } else {
                    this.method158(this.field338 + this.field324, this.field327, this.field271, this.field296, this.field350, class21.field199, (byte) -115, var13, this.field265);
                }
                if (this.field308 == 6.0D) {
                    this.method158(this.field324 * 2 + this.field338, this.field291, this.field282, this.field296, this.field350, class37.field469, (byte) -115, var13, this.field297);
                } else {
                    this.method158(this.field338 + this.field324 * 2, this.field327, this.field271, this.field296, this.field350, class37.field469, (byte) -115, var13, this.field265);
                }
                if (this.field308 == 8.0D) {
                    this.method158(this.field324 * 3 + this.field338, this.field291, this.field282, this.field296, this.field350, class13.field125, (byte) -115, var13, this.field297);
                } else {
                    this.method158(this.field324 * 3 + this.field338, this.field327, this.field271, this.field296, this.field350, class13.field125, (byte) -115, var13, this.field265);
                }
            }
            if (class37.field459) {
                this.method158(this.field349, this.field327, this.field271, this.field272, this.field322, this.field330, (byte) -115, this.field346, this.field265);
                if (class16.field138) {
                    class12.method72(this.field322 + this.field349 + 2, this.field346, this.field264 + 10, this.field272, 8925952, 192);
                    class12.method69(this.field349 + this.field322 + 2, this.field346, this.field264 + 10, this.field272, 16777215);
                    if (class31.field405 > -1 && this.field316.method234((byte) 123) > 0) {
                        class41 var14 = this.field313[class31.field405].method226(32, 47, (byte) -114);
                        int var15 = this.field316.method234((byte) 116);
                        if (var14.method234((byte) 119) < var15) {
                            var15 = var14.method234((byte) 102);
                        }
                        this.field311.method15(var14, this.field349 + this.field322 + 6, 20, 10066176, 0);
                        this.field311.method15(var14.method244(0, var15, true), this.field349 + this.field322 + 6, 20, 16777215, 0);
                    } else {
                        this.field311.method15(this.field278, this.field322 + this.field349 + 6, 20, 16776960, 0);
                    }
                }
            }
        }
        int var16 = -71 / ((-arg0 - 76) / 47);
        if (class36.field449) {
            this.method164((byte) -72);
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "e", descriptor = "(B)V", line = 1117)
    private final void method164(byte arg0) {
        class36.field449 = false;
        try {
            Graphics var2 = class40.field497.getGraphics();
            class23.field243.method175(0, 67, var2, 0);
        } catch (Exception var4) {
            class40.field497.repaint();
        }
        if (arg0 != -72) {
            this.method24((byte) 113);
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "c", descriptor = "(I)V", line = 1139)
    public final void method30(int arg0) {
        if (class43.field537) {
            class43.method263(class40.field497, (byte) 70);
            class17.method88(class40.field497, arg0 ^ 0xFFFFC744);
            this.method31(-108);
            class13.method78(class40.field497, 16495);
            class23.method124(31893, class40.field497);
        }
        class31.method191((byte) 40);
        class39.method215(0);
        if (!class26.field368) {
            return;
        }
        if (class17.field148[96]) {
            class26.field371 = (int) ((double) class26.field371 - 16.0D / this.field274);
            class16.field139 = -1;
            this.field292 = true;
        }
        if (class17.field148[97]) {
            this.field292 = true;
            class26.field371 = (int) (16.0D / this.field274 + (double) class26.field371);
            class16.field139 = -1;
        }
        if (class17.field148[98]) {
            class42.field518 = (int) ((double) class42.field518 - 16.0D / this.field274);
            class16.field139 = -1;
            this.field292 = true;
        }
        if (class17.field148[99]) {
            this.field292 = true;
            class42.field518 = (int) (16.0D / this.field274 + (double) class42.field518);
            class16.field139 = -1;
        }
        while (true) {
            boolean var2;
            label494: do {
                while (true) {
                    while (true) {
                        while (class9.method52((byte) -102)) {
                            if (!class37.field459 || !class16.field138) {
                                if (class31.field407 == this.field295 || class31.field407 == this.field302) {
                                    this.field292 = true;
                                    class16.field138 = true;
                                }
                                if (class31.field407 == 49) {
                                    this.field292 = true;
                                    this.field308 = 3.0D;
                                }
                                if (class31.field407 == 50) {
                                    this.field292 = true;
                                    this.field308 = 4.0D;
                                }
                                if (class31.field407 == 51) {
                                    this.field308 = 6.0D;
                                    this.field292 = true;
                                }
                                if (class31.field407 == 52) {
                                    this.field308 = 8.0D;
                                    this.field292 = true;
                                }
                                if (class31.field407 == this.field315 || class31.field407 == this.field307) {
                                    this.field290 = !this.field290;
                                    this.field292 = true;
                                }
                                if (class31.field407 == this.field268 || class31.field407 == this.field345) {
                                    this.field292 = true;
                                    this.field312 = !this.field312;
                                }
                            } else if (class16.field134 == 0) {
                                this.field292 = true;
                                class16.field138 = false;
                                this.field316.method241(0, (byte) 101);
                                class31.field405 = -1;
                            } else {
                                if (class16.field134 != 84) {
                                    var2 = false;
                                    if (class16.field134 == 85) {
                                        if (this.field316.method234((byte) 98) > 0) {
                                            this.field316.method241(this.field316.method234((byte) 106) - 1, (byte) -30);
                                            this.field292 = true;
                                            if (this.field316.method234((byte) 92) == 0) {
                                                class31.field405 = -1;
                                            } else {
                                                var2 = true;
                                            }
                                        }
                                    } else if (class31.field407 != -1 && this.field316.method234((byte) 117) <= class4.field60) {
                                        this.field316.method223(class31.field407, false);
                                        this.field292 = true;
                                    }
                                    continue label494;
                                }
                                this.field328 = class26.field371 << 16;
                                class16.field139 = class31.field405;
                                this.field289 = class42.field518 << 16;
                                class16.field138 = false;
                                this.field316.method241(0, (byte) 104);
                                this.field292 = true;
                                class31.field405 = -1;
                            }
                        }
                        int var6 = class32.field416;
                        int var7 = class39.field488;
                        int var8 = class17.field154;
                        if (arg0 != 14559) {
                            this.field323 = null;
                        }
                        int var9 = class4.field66;
                        int var10 = class36.field446;
                        int var11 = class37.field456;
                        if (var6 == 1) {
                            this.field341 = class26.field371;
                            this.field294 = var7;
                            this.field286 = var8;
                            this.field299 = class42.field518;
                            if (class41.field504.length == 1) {
                                if (var7 > this.field338 && this.field350 + this.field338 > var7 && this.field314 < var8 && var8 < this.field314 + this.field296) {
                                    this.field308 = 3.0D;
                                    this.field294 = -1;
                                }
                                if (var7 > this.field338 + this.field324 && var7 < this.field338 + this.field324 + this.field350 && var8 > this.field314 && this.field314 + this.field296 > var8) {
                                    this.field308 = 4.0D;
                                    this.field294 = -1;
                                }
                                if (this.field338 + this.field324 * 2 < var7 && this.field324 * 2 + this.field350 + this.field338 > var7 && var8 > this.field314 && var8 < this.field314 + this.field296) {
                                    this.field294 = -1;
                                    this.field308 = 6.0D;
                                }
                                if (var7 > this.field324 * 3 + this.field338 && this.field324 * 3 + this.field350 + this.field338 > var7 && this.field314 < var8 && this.field314 + this.field296 > var8) {
                                    this.field308 = 8.0D;
                                    this.field294 = -1;
                                }
                            } else {
                                if (var7 > this.field338 && this.field350 + this.field338 > var7 && this.field314 < var8 && var8 < this.field314 + this.field296 + this.field305) {
                                    this.field308 = 3.0D;
                                    this.field294 = -1;
                                }
                                if (this.field338 + this.field324 < var7 && var7 < this.field338 + this.field324 + this.field350 && this.field314 < var8 && var8 < this.field314 + this.field296 + this.field305) {
                                    this.field308 = 4.0D;
                                    this.field294 = -1;
                                }
                                if (this.field324 * 2 + this.field338 < var7 && var7 < this.field324 * 2 + this.field338 + this.field350 && this.field314 < var8 && var8 < this.field314 + this.field305 + this.field296) {
                                    this.field308 = 6.0D;
                                    this.field294 = -1;
                                }
                                if (this.field324 * 3 + this.field338 < var7 && var7 < this.field324 * 3 + this.field338 + this.field350 && var8 > this.field314 && var8 < this.field305 + this.field296 + this.field314) {
                                    this.field308 = 8.0D;
                                    this.field294 = -1;
                                }
                                if (var7 > 170 && var7 < 400 && var8 > 483 && var8 < 503) {
                                    this.method160(this.field291, 107);
                                    this.method164((byte) -72);
                                    this.method159(true);
                                    this.field294 = -1;
                                }
                            }
                            if (this.field303 < var7 && this.field334 + this.field321 < var8 && var7 < this.field303 + this.field335 && var8 < 503) {
                                this.field290 = !this.field290;
                                this.field294 = -1;
                            }
                            this.field284 = false;
                            if (var7 > this.overviewX && this.overviewY + this.imageOverviewHeight < var8 && var7 < this.overviewX + this.imageOverviewWidth && var8 < 503) {
                                this.field294 = -1;
                                this.field312 = !this.field312;
                            }
                            this.field292 = true;
                            if (this.field290) {
                                if (this.field303 < var7 && this.field334 < var8 && var7 < this.field335 + this.field303 && var8 < this.field334 + 18 && this.field269 > 0) {
                                    this.field269 -= 24;
                                }
                                if (this.field303 < var7 && this.field334 < var8 && var7 < this.field335 + this.field303 && this.field334 + this.field321 > var8) {
                                    this.field294 = -1;
                                }
                                if (var7 > this.field303 && var8 > this.field334 + this.field321 - 18 && var7 < this.field335 + this.field303 && this.field334 + this.field321 > var8 && this.field269 < 72) {
                                    this.field269 += 24;
                                }
                            }
                            if (this.field312 && var7 > this.overviewX && var8 > this.overviewY && var7 < this.overviewX + this.imageOverviewWidth && var8 < this.overviewY + this.imageOverviewHeight) {
                                class26.field371 = (var7 - this.overviewX) * class8.sizeX / this.imageOverviewWidth;
                                this.field284 = true;
                                this.field294 = -1;
                                class42.field518 = (var8 - this.overviewY) * class19.sizeZ / this.imageOverviewHeight;
                            }
                            if (class37.field459 && !class16.field138 && !this.field284 && var7 > this.field349 && var8 > this.field346 && this.field349 + this.field322 > var7 && this.field346 + this.field272 > var8) {
                                class16.field138 = true;
                            }
                        }
                        if (this.field290) {
                            this.field288 = -1;
                            if (this.field303 < var11 && this.field335 + this.field303 > var11) {
                                int var12 = this.field334 + 21 + 5;
                                int var13 = this.field293;
                                for (int var14 = 0; var14 < 24; var14++) {
                                    if (var13 < this.field337.length && this.field337[var13].method225(class11.field112, arg0 ^ 0x38DF)) {
                                        var13++;
                                        var14--;
                                    } else {
                                        if (var12 <= var9 && var12 + 17 > var9) {
                                            if (var6 == 1) {
                                                this.field301 = var13;
                                                this.field267 = 50;
                                            }
                                            this.field288 = var13;
                                        }
                                        var13++;
                                        var12 += 17;
                                    }
                                }
                            }
                            if (this.field352 != this.field288) {
                                this.field292 = true;
                                this.field352 = this.field288;
                            }
                        }
                        if (var10 == 1 && this.field312 && this.field284) {
                            int var15 = var9;
                            int var16 = var11;
                            if (var11 < this.overviewX) {
                                var16 = this.overviewX;
                            } else if (this.overviewX + this.imageOverviewWidth < var11) {
                                var16 = this.overviewX + this.imageOverviewWidth;
                            }
                            this.field292 = true;
                            if (var9 < this.overviewY) {
                                var15 = this.overviewY;
                            } else if (this.overviewY + this.imageOverviewHeight < var9) {
                                var15 = this.overviewY + this.imageOverviewHeight;
                            }
                            class26.field371 = (var16 - this.overviewX) * class8.sizeX / this.imageOverviewWidth;
                            class42.field518 = (var15 - this.overviewY) * class19.sizeZ / this.imageOverviewHeight;
                            class16.field139 = -1;
                        } else {
                            this.field284 = false;
                        }
                        if (var10 == 1 && this.field294 != -1) {
                            class42.field518 = (int) ((double) (this.field286 - var9) * 2.0D / this.field308) + this.field299;
                            class26.field371 = this.field341 + (int) ((double) (this.field294 - var11) * 2.0D / this.field308);
                            this.field292 = true;
                            class16.field139 = -1;
                        }
                        if (this.field308 > this.field274) {
                            this.field292 = true;
                            this.field274 /= 30.0D;
                            if (this.field274 > this.field308) {
                                this.field274 = this.field308;
                            }
                        }
                        if (this.field308 < this.field274) {
                            this.field274 /= 30.0D;
                            this.field292 = true;
                            if (this.field308 > this.field274) {
                                this.field274 = this.field308;
                            }
                        }
                        if (this.field293 < this.field269) {
                            this.field292 = true;
                            this.field293++;
                        }
                        if (this.field293 > this.field269) {
                            this.field293--;
                            this.field292 = true;
                        }
                        if (this.field267 > 0) {
                            this.field292 = true;
                            this.field267--;
                        }
                        if (class16.field139 >= 0) {
                            class20.field181 = this.field317[class16.field139] - class13.originX;
                            byte var17 = 4;
                            class17.field151 = class26.originZ + class19.sizeZ - this.field318[class16.field139];
                            this.field292 = true;
                            int var18 = class20.field181 - (int) (635.0D / this.field274);
                            int var19 = class17.field151 - (int) (503.0D / this.field274);
                            int var20 = (int) (503.0D / this.field274) + class17.field151;
                            if (var19 < 48) {
                                class17.field151 = (int) (503.0D / this.field274) + 48;
                            }
                            if (var20 > class19.sizeZ - 48) {
                                class17.field151 = class19.sizeZ - (int) (503.0D / this.field274) - 48;
                            }
                            int var21 = (int) (635.0D / this.field274) + class20.field181;
                            if (var18 < 48) {
                                class20.field181 = (int) (635.0D / this.field274) + 48;
                            }
                            class17.field151 <<= 0x10;
                            if (var21 > class8.sizeX - 48) {
                                class20.field181 = class8.sizeX - (int) (635.0D / this.field274) - 48;
                            }
                            int var22 = class17.field151 - this.field289;
                            class20.field181 <<= 0x10;
                            int var23 = class20.field181 - this.field328;
                            if (var23 >> var17 == 0 && var22 >> var17 == 0) {
                                class16.field139 = -1;
                            } else {
                                this.field328 += var23 >> var17;
                                this.field289 += var22 >> var17;
                                class26.field371 = this.field328 >> 16;
                                class42.field518 = this.field289 >> 16;
                            }
                        }
                        int var24 = class26.field371 - (int) (635.0D / this.field274);
                        int var25 = class42.field518 - (int) (503.0D / this.field274);
                        int var26 = (int) (503.0D / this.field274) + class42.field518;
                        int var27 = (int) (635.0D / this.field274) + class26.field371;
                        if (var24 < 48) {
                            class26.field371 = (int) (635.0D / this.field274) + 48;
                        }
                        if (class8.sizeX - 48 < var27) {
                            class26.field371 = class8.sizeX - (int) (635.0D / this.field274) - 48;
                        }
                        if (var25 < 48) {
                            class42.field518 = (int) (503.0D / this.field274) + 48;
                        }
                        if (class19.sizeZ - 48 < var26) {
                            class42.field518 = class19.sizeZ - (int) (503.0D / this.field274) - 48;
                        }
                        return;
                    }
                }
            } while (this.field316.method234((byte) 126) <= 0);
            for (int var3 = 0; var3 < this.field273; var3++) {
                if (this.field313[var3].method234((byte) 103) >= this.field316.method234((byte) 111)) {
                    class41 var4 = this.field316.method237(123);
                    class41 var5 = this.field313[var3].method226(32, 47, (byte) -119).method244(0, this.field316.method234((byte) 104), true).method237(121);
                    if (var4.method222(-110, var5) == 0) {
                        class31.field405 = var3;
                        this.field292 = true;
                        var2 = true;
                        break;
                    }
                }
            }
            if (!var2) {
                this.field316.method241(this.field316.method234((byte) 99) - 1, (byte) 98);
            }
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "b", descriptor = "(I)V", line = 1700)
    public final void method22(int arg0) {
        method153(false);
        class11.method61(false);
        class41.method239(arg0 - 28575);
        class13.method77((byte) -18);
        class10.method57(41);
        class19.method108((byte) 62);
        class3.method21((byte) -78);
        class17.method87((byte) -59);
        class28.method174((byte) 127);
        class26.method173(11884);
        class25.method137((byte) 104);
        class22.method114();
        class9.method53(-1);
        class7.method46((byte) 90);
        class43.method261(6);
        class29.method179(true);
        class14.method80(27673);
        class12.method71();
        class32.method193(0);
        if (arg0 != 28665) {
            this.field346 = -51;
        }
        class42.method250(-16518);
        class8.method50(-20055);
        class2.method16();
        class16.method83(74);
        class35.method203(113);
        class39.method216((byte) -34);
        class37.method208((byte) 28);
        class31.method190(75);
        class4.method34(true);
        class40.method220((byte) 56);
        class34.method196(false);
        class23.method127(arg0 - 28774);
        class36.method205(105);
        class20.method109(255);
        class38.method212(0);
        class1.method2((byte) -41);
        class24.method129();
        class21.method113(-120);
        this.field285 = null;
        this.field330 = null;
        this.field319 = null;
        this.field333 = null;
        this.field309 = null;
        this.field279 = null;
        this.field300 = null;
        this.field283 = null;
        this.field343 = null;
        this.field337 = null;
        this.field313 = null;
        this.field270 = null;
        this.field356 = null;
        this.field323 = null;
        this.field278 = null;
        this.field318 = null;
        this.field342 = null;
        this.field280 = null;
        this.field351 = null;
        this.field306 = null;
        this.field276 = null;
        this.field348 = null;
        this.field317 = null;
        this.field311 = null;
        this.field339 = null;
        this.field355 = null;
        this.field316 = null;
        this.field336 = null;
        this.field281 = null;
        this.field357 = null;
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "([BBLjava/lang/String;)V", line = 1811)
    private final void method165(byte[] arg0, byte arg1, String arg2) throws IOException {
        FileOutputStream var4 = new FileOutputStream(arg2);
        var4.write(arg0, 0, arg0.length);
        if (arg1 <= -107) {
            var4.close();
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "f", descriptor = "(I)V", line = 1866)
    public final void method33(int arg0) {
        class8.method49(100);
        class13.method78(class40.field497, 16495);
        class23.method124(31893, class40.field497);
        class23.field246 = this.field270;
        boolean var2 = false;
        this.field337 = class11.method60(107);
        this.field333 = class4.method36(0);
        boolean var3 = true;
        if (var3) {
            byte var4 = 0;
            if (this.field333.length == 14) {
                byte var10002 = var4;
                int var5 = var4 + 1;
                this.field285 = this.field333[var10002];
                int var19 = var5;
                int var6 = var5 + 1;
                this.field330 = this.field333[var19];
                int var20 = var6;
                int var7 = var6 + 1;
                this.field342 = this.field333[var20];
                int var21 = var7;
                int var8 = var7 + 1;
                this.field319 = this.field333[var21];
                int var22 = var8;
                int var9 = var8 + 1;
                this.field281 = this.field333[var22];
                int var23 = var9;
                int var10 = var9 + 1;
                this.field270 = this.field333[var23];
                int var24 = var10;
                int var11 = var10 + 1;
                this.field283 = this.field333[var24];
                int var25 = var11;
                int var12 = var11 + 1;
                this.field278 = this.field333[var25];
                int var26 = var12;
                int var13 = var12 + 1;
                this.field276 = this.field333[var26];
                int var27 = var13;
                int var14 = var13 + 1;
                this.field309 = this.field333[var27];
                int var28 = var14;
                int var15 = var14 + 1;
                this.field339 = this.field333[var28];
                int var29 = var15;
                int var16 = var15 + 1;
                this.field351 = this.field333[var29];
                int var17 = var16 + 1;
                int var30 = var17;
                int var18 = var17 + 1;
                this.field323 = this.field333[var30];
                this.field345 = this.field285.method233(-122, 0);
                this.field302 = this.field330.method233(39, 0);
                this.field307 = this.field342.method233(86, 0);
                this.field268 = this.method168(this.field345, (byte) 107);
                this.field295 = this.method168(this.field302, (byte) 107);
                this.field315 = this.method168(this.field307, (byte) 107);
            } else {
                class16.method84(arg0 ^ 0x6FC1, new class41[] { class19.field169 });
            }
        }
        this.field316 = class4.method37(arg0, (byte) 46);
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(ZLjava/lang/Object;Z)[B", line = 1922)
    public static final byte[] method166(boolean arg0, Object arg1, boolean arg2) {
        if (arg0) {
            field266 = null;
        }
        if (arg1 == null) {
            return null;
        } else if (arg1 instanceof byte[]) {
            byte[] var4 = (byte[]) arg1;
            return arg2 ? class4.method35(7360, var4) : var4;
        } else if (arg1 instanceof class1) {
            class1 var3 = (class1) arg1;
            return var3.method4(21529);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "f", descriptor = "(B)[Lba;", line = 1966)
    public static final class5[] method167(byte arg0) {
        class5[] var1 = new class5[class11.field110];
        int var2 = -112 / ((arg0 + 72) / 53);
        for (int var3 = 0; var3 < class11.field110; var3++) {
            var1[var3] = new class5(class9.field92, field354, class23.field245[var3], class43.field541[var3], class9.field95[var3], class1.field3[var3], class39.field478[var3], class17.field150);
        }
        class37.method209(854741736);
        return var1;
    }

    @OriginalMember(owner = "mapview!mapview", name = "init", descriptor = "()V", line = 1989)
    public final void init() {
        if (this.method26((byte) 119)) {
            this.method23(32, Integer.parseInt(this.getParameter("codeversion")), 635, 503, true);
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(IB)I", line = 2029)
    private final int method168(int arg0, byte arg1) {
        if (arg1 != 107) {
            return -109;
        } else if (arg0 == 196) {
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
            return class43.method265(arg0, -1);
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(Ljava/lang/String;[BB)Z", line = 2179)
    private final boolean method169(String arg0, byte[] arg1, byte arg2) {
        if (arg1 == null) {
            return false;
        }
        try {
            MessageDigest var4 = MessageDigest.getInstance("SHA");
            if (arg2 <= 29) {
                return false;
            }
            var4.reset();
            var4.update(arg1);
            byte[] var5 = var4.digest();
            if (arg0 == "main_file_cache.dat0") {
                if (var5[0] != 57 || var5[1] != 20 || var5[2] != 20 || var5[3] != -42 || var5[4] != 66 || var5[5] != 112 || var5[6] != -94 || var5[7] != -10 || var5[8] != 30 || var5[9] != -67 || var5[10] != 16 || var5[11] != 64 || var5[12] != 37 || var5[13] != -104 || var5[14] != -120 || var5[15] != -122 || var5[16] != 107 || var5[17] != -32 || var5[18] != -44 || var5[19] != -27) {
                    return false;
                }
            } else if (arg0 == "main_file_cache.idx1") {
                if (var5[0] != -49 || var5[1] != -3 || var5[2] != -26 || var5[3] != 113 || var5[4] != 5 || var5[5] != -26 || var5[6] != -83 || var5[7] != 94 || var5[8] != -52 || var5[9] != -101 || var5[10] != 48 || var5[11] != -28 || var5[12] != 31 || var5[13] != -15 || var5[14] != -43 || var5[15] != 23 || var5[16] != 50 || var5[17] != 25 || var5[18] != 94 || var5[19] != 60) {
                    return false;
                }
            } else if (var5[0] != 100 || var5[1] != 126 || var5[2] != 118 || var5[3] != 58 || var5[4] != -44 || var5[5] != 94 || var5[6] != 99 || var5[7] != -27 || var5[8] != -17 || var5[9] != -5 || var5[10] != -42 || var5[11] != 53 || var5[12] != -46 || var5[13] != 44 || var5[14] != -38 || var5[15] != 64 || var5[16] != 80 || var5[17] != 98 || var5[18] != 89 || var5[19] != 74) {
                return false;
            }
            return true;
        } catch (Exception var7) {
            this.method28((byte) -83, "sha");
            return false;
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "b", descriptor = "(BLjava/lang/String;)[B", line = 2227)
    private final byte[] method170(byte arg0, String arg1) throws IOException {
        File var3 = new File(arg1);
        if (!var3.exists()) {
            return null;
        }
        int var4 = (int) var3.length();
        byte[] var5 = new byte[var4];
        DataInputStream var6 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg1)));
        int var7 = -77 / ((arg0 + 1) / 52);
        var6.readFully(var5, 0, var4);
        var6.close();
        return var5;
    }
}
