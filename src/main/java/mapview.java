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
public class mapview extends class37 {

    @OriginalMember(owner = "mapview!mapview", name = "m", descriptor = "I")
    private int field272 = 10027008;

    @OriginalMember(owner = "mapview!mapview", name = "p", descriptor = "I")
    private int field275 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "F", descriptor = "I")
    private int field291 = 5;

    @OriginalMember(owner = "mapview!mapview", name = "E", descriptor = "I")
    private int field290 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "w", descriptor = "I")
    private int field282 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "U", descriptor = "I")
    private int field306 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "O", descriptor = "I")
    private int field300 = -1;

    @OriginalMember(owner = "mapview!mapview", name = "u", descriptor = "I")
    private int field280 = -1;

    @OriginalMember(owner = "mapview!mapview", name = "bb", descriptor = "I")
    private int field313 = 8912896;

    @OriginalMember(owner = "mapview!mapview", name = "P", descriptor = "I")
    private int field301 = 8943445;

    @OriginalMember(owner = "mapview!mapview", name = "R", descriptor = "I")
    private int field303 = 5;

    @OriginalMember(owner = "mapview!mapview", name = "A", descriptor = "I")
    private int field286 = 30;

    @OriginalMember(owner = "mapview!mapview", name = "eb", descriptor = "I")
    private int field316 = 50;

    @OriginalMember(owner = "mapview!mapview", name = "o", descriptor = "Z")
    private boolean field274 = true;

    @OriginalMember(owner = "mapview!mapview", name = "S", descriptor = "I")
    private int field304 = 170;

    @OriginalMember(owner = "mapview!mapview", name = "fb", descriptor = "I")
    private int field317 = 471;

    @OriginalMember(owner = "mapview!mapview", name = "L", descriptor = "I")
    private int field297 = 40;

    @OriginalMember(owner = "mapview!mapview", name = "i", descriptor = "I")
    private int field268 = 11141120;

    @OriginalMember(owner = "mapview!mapview", name = "M", descriptor = "I")
    private int field298 = 500;

    @OriginalMember(owner = "mapview!mapview", name = "tb", descriptor = "I")
    private int field331 = 5;

    @OriginalMember(owner = "mapview!mapview", name = "pb", descriptor = "Z")
    private boolean field327 = false;

    @OriginalMember(owner = "mapview!mapview", name = "vb", descriptor = "I")
    private int field333 = -20;

    @OriginalMember(owner = "mapview!mapview", name = "Bb", descriptor = "I")
    private int field339 = 10;

    @OriginalMember(owner = "mapview!mapview", name = "Y", descriptor = "I")
    private int field310 = -1;

    @OriginalMember(owner = "mapview!mapview", name = "zb", descriptor = "I")
    private int field337 = 6706483;

    @OriginalMember(owner = "mapview!mapview", name = "Hb", descriptor = "I")
    private int field345 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "yb", descriptor = "I")
    private int field336 = 140;

    @OriginalMember(owner = "mapview!mapview", name = "gb", descriptor = "Z")
    private boolean field318 = false;

    @OriginalMember(owner = "mapview!mapview", name = "Gb", descriptor = "I")
    private int field344 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "V", descriptor = "I")
    private int field307 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "ub", descriptor = "[Ls;")
    private class34[] field332 = new class34[this.field298];

    @OriginalMember(owner = "mapview!mapview", name = "T", descriptor = "Z")
    private boolean field305 = false;

    @OriginalMember(owner = "mapview!mapview", name = "Eb", descriptor = "I")
    private int field342 = this.field339 + this.field316;

    @OriginalMember(owner = "mapview!mapview", name = "Fb", descriptor = "[I")
    private int[] field343 = new int[this.field298];

    @OriginalMember(owner = "mapview!mapview", name = "Nb", descriptor = "I")
    private int field351 = 450;

    @OriginalMember(owner = "mapview!mapview", name = "Pb", descriptor = "D")
    private double field353 = 4.0D;

    @OriginalMember(owner = "mapview!mapview", name = "hb", descriptor = "I")
    private int field319 = 7824964;

    @OriginalMember(owner = "mapview!mapview", name = "W", descriptor = "I")
    private int field308 = 33;

    @OriginalMember(owner = "mapview!mapview", name = "Sb", descriptor = "I")
    private int field356 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "s", descriptor = "[I")
    private int[] field278 = new int[this.field298];

    @OriginalMember(owner = "mapview!mapview", name = "Ob", descriptor = "Z")
    private boolean field352 = false;

    @OriginalMember(owner = "mapview!mapview", name = "Z", descriptor = "Ls;")
    private class34 field311 = this.field352 ? class9.field90 : class9.field90;

    @OriginalMember(owner = "mapview!mapview", name = "lb", descriptor = "Ls;")
    private class34 field323 = this.field352 ? class28.field380 : class28.field380;

    @OriginalMember(owner = "mapview!mapview", name = "Q", descriptor = "Ls;")
    private class34 field302 = this.field352 ? class16.field144 : class16.field144;

    @OriginalMember(owner = "mapview!mapview", name = "G", descriptor = "Ls;")
    private class34 field292 = this.field352 ? class7.field50 : class28.field384;

    @OriginalMember(owner = "mapview!mapview", name = "jb", descriptor = "I")
    private int field321 = this.field352 ? 83 : 70;

    @OriginalMember(owner = "mapview!mapview", name = "J", descriptor = "Ls;")
    private class34 field295 = this.field352 ? class34.field476 : class34.field476;

    @OriginalMember(owner = "mapview!mapview", name = "cb", descriptor = "Ls;")
    private class34 field314 = this.field352 ? class24.field245 : class24.field245;

    @OriginalMember(owner = "mapview!mapview", name = "db", descriptor = "Ls;")
    private class34 field315 = this.field352 ? class31.field412 : class31.field412;

    @OriginalMember(owner = "mapview!mapview", name = "D", descriptor = "Ls;")
    private class34 field289 = this.field352 ? class1.field7 : class1.field7;

    @OriginalMember(owner = "mapview!mapview", name = "j", descriptor = "Ls;")
    private class34 field269 = this.field352 ? class6.field37 : class6.field37;

    @OriginalMember(owner = "mapview!mapview", name = "k", descriptor = "I")
    private int field270 = this.field352 ? 108 : 107;

    @OriginalMember(owner = "mapview!mapview", name = "kb", descriptor = "I")
    private int field322 = this.field352 ? 115 : 102;

    @OriginalMember(owner = "mapview!mapview", name = "Kb", descriptor = "Ls;")
    private class34 field348 = this.field352 ? class30.field403 : class30.field403;

    @OriginalMember(owner = "mapview!mapview", name = "Qb", descriptor = "[I")
    private int[] field354 = new int[this.field298];

    @OriginalMember(owner = "mapview!mapview", name = "nb", descriptor = "Ls;")
    private class34 field325 = this.field352 ? class25.field259 : class35.field483;

    @OriginalMember(owner = "mapview!mapview", name = "v", descriptor = "I")
    private int field281 = this.field352 ? 220 : 79;

    @OriginalMember(owner = "mapview!mapview", name = "l", descriptor = "I")
    private int field271 = this.field352 ? 252 : 111;

    @OriginalMember(owner = "mapview!mapview", name = "mb", descriptor = "I")
    private int field324 = 23;

    @OriginalMember(owner = "mapview!mapview", name = "q", descriptor = "Ls;")
    private class34 field276 = this.field352 ? class26.field371 : class26.field371;

    @OriginalMember(owner = "mapview!mapview", name = "Db", descriptor = "D")
    private double field341 = 4.0D;

    @OriginalMember(owner = "mapview!mapview", name = "Tb", descriptor = "Ls;")
    private class34 field357 = this.field352 ? class19.field162 : class24.field236;

    @OriginalMember(owner = "mapview!mapview", name = "t", descriptor = "I")
    private int field279 = this.field352 ? 76 : 75;

    @OriginalMember(owner = "mapview!mapview", name = "C", descriptor = "I")
    public static int field288 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "n", descriptor = "[J")
    public static long[] field273 = new long[32];

    @OriginalMember(owner = "mapview!mapview", name = "xb", descriptor = "Ls;")
    public static class34 field335 = class9.method35("underlay)3dat", 220);

    @OriginalMember(owner = "mapview!mapview", name = "Rb", descriptor = "Ls;")
    public static class34 field355 = class9.method35("Find", 220);

    @OriginalMember(owner = "mapview!mapview", name = "h", descriptor = "I")
    private int field267;

    @OriginalMember(owner = "mapview!mapview", name = "B", descriptor = "I")
    private int field287;

    @OriginalMember(owner = "mapview!mapview", name = "I", descriptor = "I")
    private int field294;

    @OriginalMember(owner = "mapview!mapview", name = "ab", descriptor = "I")
    private int field312;

    @OriginalMember(owner = "mapview!mapview", name = "ib", descriptor = "I")
    private int field320;

    @OriginalMember(owner = "mapview!mapview", name = "ob", descriptor = "I")
    private int field326;

    @OriginalMember(owner = "mapview!mapview", name = "rb", descriptor = "I")
    private int field329;

    @OriginalMember(owner = "mapview!mapview", name = "sb", descriptor = "I")
    private int field330;

    @OriginalMember(owner = "mapview!mapview", name = "Jb", descriptor = "I")
    private static int field347;

    @OriginalMember(owner = "mapview!mapview", name = "Ub", descriptor = "I")
    public static int field358;

    @OriginalMember(owner = "mapview!mapview", name = "Ab", descriptor = "Lf;")
    private class11 field338;

    @OriginalMember(owner = "mapview!mapview", name = "x", descriptor = "Li;")
    private class17 field283;

    @OriginalMember(owner = "mapview!mapview", name = "y", descriptor = "Li;")
    private class17 field284;

    @OriginalMember(owner = "mapview!mapview", name = "z", descriptor = "Li;")
    private class17 field285;

    @OriginalMember(owner = "mapview!mapview", name = "N", descriptor = "Li;")
    private class17 field299;

    @OriginalMember(owner = "mapview!mapview", name = "wb", descriptor = "Li;")
    private class17 field334;

    @OriginalMember(owner = "mapview!mapview", name = "Cb", descriptor = "Li;")
    private class17 field340;

    @OriginalMember(owner = "mapview!mapview", name = "Ib", descriptor = "Li;")
    private class17 field346;

    @OriginalMember(owner = "mapview!mapview", name = "Mb", descriptor = "Li;")
    private class17 field350;

    @OriginalMember(owner = "mapview!mapview", name = "Lb", descriptor = "Lr;")
    private class33 field349;

    @OriginalMember(owner = "mapview!mapview", name = "r", descriptor = "Ls;")
    private class34 field277;

    @OriginalMember(owner = "mapview!mapview", name = "X", descriptor = "Ls;")
    private static class34 field309;

    @OriginalMember(owner = "mapview!mapview", name = "H", descriptor = "[I")
    public static int[] field293;

    @OriginalMember(owner = "mapview!mapview", name = "K", descriptor = "[Ls;")
    private class34[] field296;

    @OriginalMember(owner = "mapview!mapview", name = "qb", descriptor = "[Ls;")
    private class34[] field328;

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(II)V", line = 9)
    private final void method139(int arg0, int arg1) {
        this.method147(483, arg0, 18, this.field337, 230, (byte) -68, class16.method72(-14, new class34[] { class12.field111, class38.field519[class1.field3], class38.field521 }), this.field301, 170);
        if (arg1 != 32) {
            this.field338 = null;
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(BI)Ls;", line = 35)
    private static final class34 method140(byte arg0, int arg1) {
        class34 var2 = new class34();
        var2.field475 = new byte[arg1];
        if (arg0 != 115) {
            field288 = -49;
        }
        var2.field478 = 0;
        return var2;
    }

    @OriginalMember(owner = "mapview!mapview", name = "b", descriptor = "(I)V", line = 49)
    public final void method141(int arg0) {
        method150(-20130);
        class40.method268(125);
        class34.method226((byte) 51);
        class35.method246(-1);
        class10.method42(32);
        class29.method190(arg0 ^ 0x1EBF2B43);
        class37.method252(0);
        class6.method17(-1);
        class24.method131(-48);
        class18.method83(-120);
        class26.method178(true);
        class17.method78();
        class16.method71((byte) -109);
        class22.method116(arg0 ^ 0xD);
        class8.method31(false);
        class9.method33((byte) -39);
        class14.method63(arg0 + 14);
        class23.method124();
        class1.method2((byte) 104);
        class3.method8((byte) -72);
        class28.method189((byte) -22);
        class25.method135(true);
        class21.method105();
        class13.method57(false);
        class39.method267((byte) -47);
        class19.method87(-9839);
        class27.method184(10667);
        class7.method19(8438);
        class38.method264(-13631);
        class36.method248(52);
        class12.method50((byte) -72);
        class30.method205((byte) -51);
        class20.method88();
        class31.method208(92);
        this.field289 = null;
        this.field311 = null;
        this.field284 = null;
        this.field328 = null;
        this.field323 = null;
        this.field350 = null;
        this.field295 = null;
        this.field325 = null;
        this.field343 = null;
        this.field340 = null;
        this.field354 = null;
        if (arg0 != -13) {
            this.field345 = -128;
        }
        this.field277 = null;
        this.field314 = null;
        this.field269 = null;
        this.field299 = null;
        this.field276 = null;
        this.field346 = null;
        this.field278 = null;
        this.field338 = null;
        this.field296 = null;
        this.field315 = null;
        this.field283 = null;
        this.field292 = null;
        this.field302 = null;
        this.field349 = null;
        this.field348 = null;
        this.field357 = null;
        this.field332 = null;
        this.field334 = null;
        this.field285 = null;
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(ZI)V", line = 172)
    private final void method142(boolean arg0, int arg1) {
        if (arg0) {
            this.field271 = -58;
        }
        if (class3.field27.length <= arg1) {
            return;
        }
        class18 var3 = class3.field27[arg1];
        class29 var4 = new class29(var3.method29(class25.field263, class16.field143, 111));
        var4.method191(-88);
        class29 var5 = new class29(var3.method29(class36.field493, class16.field143, 118));
        this.field345 = var5.method192((byte) -126);
        for (int var6 = 0; var6 < this.field345; var6++) {
            this.field332[var6] = var5.method191(-72);
            this.field343[var6] = var5.method192((byte) -121);
            this.field278[var6] = var5.method192((byte) 84);
            this.field354[var6] = var5.method197(3);
            class34 var7 = this.field332[var6].method243(47, 61, 32);
            int var8 = this.field349.method106(var7);
            if (this.field320 < var8) {
                this.field320 = var8;
            }
            int var9 = this.field349.method106(this.field289);
            if (this.field320 < var9) {
                this.field320 = var9;
            }
        }
        class9.field84 = new class26();
        class9.field84.method172(-124, class3.field27[arg1]);
        this.field267 = 180;
        this.field294 = class1.field4 * this.field267 / class19.field170;
        this.field287 = 635 - this.field294 - 5;
        class34.field470 = class34.field477;
        class31.field445 = class1.field9;
        this.field330 = 503 - this.field267 - 20;
        this.field338 = new class11(this.field294, this.field267);
        this.field338.method45();
        this.method152(0, 0, 0, (byte) 39, class1.field4, this.field294, class19.field170, this.field267, 0);
        class23.method119(0, 0, this.field294, this.field267, 0);
        class23.method119(1, 1, this.field294 - 2, this.field267 + -2, this.field301);
        class19.field168.method129(-65);
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(Ljava/lang/String;B[B)V", line = 239)
    private final void method143(String arg0, byte arg1, byte[] arg2) throws IOException {
        FileOutputStream var4 = new FileOutputStream(arg0);
        var4.write(arg2, 0, arg2.length);
        if (arg1 >= -54) {
            this.field328 = null;
        }
        var4.close();
    }

    @OriginalMember(owner = "mapview!mapview", name = "d", descriptor = "(B)V", line = 256)
    private static final void method144(byte arg0) {
        if (class31.field414 != null) {
            class16 var1 = class31.field414;
            synchronized (class31.field414) {
                class31.field414 = null;
            }
        }
        if (arg0 != -90) {
            field335 = null;
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(BLjava/lang/String;Ls;)Z", line = 275)
    private final boolean method145(byte arg0, String arg1, class34 arg2) {
        try {
            if (class35.field490 == null) {
                String var4;
                if (arg1 == "main_file_cache.dat0") {
                    var4 = "worldmap.main.js5?crc=-1095935066";
                } else if (arg1 == "main_file_cache.dat1") {
                    var4 = "worldmap.dungeon.js5?crc=-1334038712";
                } else if (arg1 == "main_file_cache.dat2") {
                    var4 = "worldmap.extra.js5?crc=-1174410536";
                } else if (arg1 == "main_file_cache.idx1") {
                    var4 = "mapview.fontmetrics.js5?crc=-447025815";
                } else {
                    var4 = "mapview.sprites.js5?crc=-621243366";
                }
                field309 = class16.method72(-45, new class34[] { this.field276, class29.field390, arg2 });
                class35.field490 = new DataInputStream((new URL(this.getCodeBase(), var4)).openStream());
                int var5;
                if (arg1 == "main_file_cache.dat0") {
                    var5 = 423590;
                } else if (arg1 == "main_file_cache.dat1") {
                    var5 = 154781;
                } else if (arg1 == "main_file_cache.dat2") {
                    var5 = 154381;
                } else if (arg1 == "main_file_cache.idx1") {
                    var5 = 165;
                } else {
                    var5 = 9890;
                }
                class38.field514 = new byte[var5];
                class16.field142 = 0;
                class24.field233 = 0;
            }
            int var6 = class38.field514.length;
            int var7 = class16.field142;
            if (var7 >= var6) {
                class35.field490.close();
                class35.field490 = null;
                if (arg0 < 69) {
                    this.field289 = null;
                }
                if (!this.method157(-18, arg1, class38.field514)) {
                    this.method256(113, "download");
                    class38.field514 = null;
                }
                return true;
            }
            class24.field233++;
            if (class24.field233 >= 1500) {
                throw new IOException();
            }
            DataInputStream var8 = class35.field490;
            int var9 = var8.available();
            if (var9 < 0) {
                throw new EOFException();
            } else if (var9 == 0) {
                return false;
            } else {
                if (var9 > var6 - var7) {
                    var9 = var6 - var7;
                }
                int var10 = var8.read(class38.field514, var7, var9);
                if (var10 < 0) {
                    throw new EOFException();
                } else if (var10 == 0) {
                    return false;
                } else {
                    class24.field233 = 0;
                    int var11 = var7 + var10;
                    int var12 = var11 * 100 / var6;
                    field309 = class16.method72(-64, new class34[] { this.field302, class29.field390, arg2, class6.field45, class1.method4(0, var12), class10.field101 });
                    class16.field142 = var11;
                    return false;
                }
            }
        } catch (IOException var16) {
            try {
                class35.field490.close();
            } catch (Exception var15) {
            }
            class38.field514 = null;
            class35.field490 = null;
            this.method256(78, new String("download"));
            return true;
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(Lda;III)[Lf;", line = 399)
    public static final class11[] method146(class8 arg0, int arg1, int arg2, int arg3) {
        if (class25.method138(arg0, -44, arg3, arg1)) {
            int var4 = 89 % ((arg2 - 29) / 54);
            return class13.method58(-101);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(IIIIIBLs;II)V", line = 411)
    private final void method147(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, class34 arg6, int arg7, int arg8) {
        class23.method119(arg8, arg0, arg4, arg2, 0);
        int var10 = arg0 + 1;
        int var12 = arg4 - 2;
        int var11 = arg2 - 2;
        int var13 = arg8 + 1;
        class23.method122(var13, var10, var12, var11, arg1);
        class23.method117(var13, var10, var12, arg7);
        class23.method128(var13, var10, var11, arg7);
        class23.method117(var13, var11 + var10 - 1, var12, arg3);
        if (arg5 == -68) {
            class23.method128(var13 + var12 - 1, var10, var11, arg3);
            this.field349.method103(arg6, var12 / 2 + var13 + 1, var11 / 2 + var10 + 4 - -1, 0, -1);
            this.field349.method103(arg6, var13 + var12 / 2, var11 / 2 + var10 + 4, 16777215, -1);
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(I)V", line = 433)
    public final void method148(int arg0) {
        class9.method37((byte) 112);
        class35.method247(0, class9.field80);
        if (arg0 != 106) {
            return;
        }
        class8.method23(18302, class9.field80);
        field309 = this.field323;
        boolean var2 = false;
        this.field296 = class8.method27((byte) 104);
        boolean var3 = true;
        this.field328 = class16.method70(0);
        if (var3) {
            byte var4 = 0;
            if (this.field328.length == 14) {
                byte var10002 = var4;
                int var5 = var4 + 1;
                this.field325 = this.field328[var10002];
                int var19 = var5;
                int var6 = var5 + 1;
                this.field357 = this.field328[var19];
                int var20 = var6;
                int var7 = var6 + 1;
                this.field292 = this.field328[var20];
                int var21 = var7;
                int var8 = var7 + 1;
                this.field269 = this.field328[var21];
                int var22 = var8;
                int var9 = var8 + 1;
                this.field295 = this.field328[var22];
                int var23 = var9;
                int var10 = var9 + 1;
                this.field323 = this.field328[var23];
                int var24 = var10;
                int var11 = var10 + 1;
                this.field348 = this.field328[var24];
                int var25 = var11;
                int var12 = var11 + 1;
                this.field289 = this.field328[var25];
                int var26 = var12;
                int var13 = var12 + 1;
                this.field276 = this.field328[var26];
                int var27 = var13;
                int var14 = var13 + 1;
                this.field315 = this.field328[var27];
                int var28 = var14;
                int var15 = var14 + 1;
                this.field311 = this.field328[var28];
                int var29 = var15;
                int var16 = var15 + 1;
                this.field314 = this.field328[var29];
                int var17 = var16 + 1;
                int var30 = var17;
                int var18 = var17 + 1;
                this.field302 = this.field328[var30];
                this.field281 = this.field325.method222(0, 16186);
                this.field321 = this.field357.method222(0, 16186);
                this.field279 = this.field292.method222(0, 16186);
                this.field271 = this.method154(1, this.field281);
                this.field322 = this.method154(1, this.field321);
                this.field270 = this.method154(arg0 - 105, this.field279);
            } else {
                class12.method51(-22, new class34[] { class24.field251 });
            }
        }
        this.field277 = method140((byte) 115, 50);
    }

    @OriginalMember(owner = "mapview!mapview", name = "h", descriptor = "(I)V", line = 497)
    private final void method149(int arg0) {
        int var2 = -52 / ((-arg0 - 5) / 47);
        String var3 = ".jagex_cache_32";
        String var5;
        try {
            String var4 = System.getProperty("user.home");
            if (var4 == null) {
                var5 = "~/";
            } else {
                var5 = var4 + "/";
            }
        } catch (Exception var14) {
            var5 = "~/";
        }
        String[] var7 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "d:/windows/", "d:/winnt/", "e:/windows/", "e:/winnt/", "f:/windows/", "f:/winnt/", "c:/", var5, "/tmp/", "" };
        for (int var8 = 0; var8 < var7.length; var8++) {
            try {
                String var9 = var7[var8];
                if (var9.length() > 0) {
                    File var10 = new File(var9);
                    if (!var10.exists()) {
                        continue;
                    }
                }
                File var11 = new File(var9 + var3);
                if (var11.exists() || var11.mkdir()) {
                    File var12 = new File(var11, "rsmap");
                    if (var12.exists() || var12.mkdir()) {
                        class29.field389 = var9 + var3 + "/rsmap/";
                        return;
                    }
                }
            } catch (Exception var15) {
            }
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "i", descriptor = "(I)V", line = 568)
    public static void method150(int arg0) {
        field293 = null;
        field273 = null;
        if (arg0 != -20130) {
            method140((byte) 39, 122);
        }
        field309 = null;
        field355 = null;
        field335 = null;
    }

    @OriginalMember(owner = "mapview!mapview", name = "g", descriptor = "(I)V", line = 593)
    public final void method151(int arg0) {
        class27.method185((byte) -66);
        if (arg0 != 47) {
            this.method160(null, null, (byte) -34);
        }
        method144((byte) -90);
        try {
            class9.field84 = null;
            this.field349 = null;
            this.field338 = null;
            this.field332 = null;
            this.field278 = null;
            this.field354 = null;
            this.field343 = null;
            this.field296 = null;
            System.gc();
        } catch (Throwable var3) {
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "init", descriptor = "()V", line = 629)
    public final void init() {
        if (this.method259(0)) {
            this.method258(Integer.parseInt(this.getParameter("codeversion")), (byte) -3, 32, 635, 503);
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(IIIBIIIII)V", line = 640)
    private final void method152(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class9.field84.method175(arg6, arg8, arg4, arg5, arg0, false, arg2, arg1, arg7);
        if (arg3 < 14) {
            this.field276 = null;
        }
        if (arg4 - arg0 > arg5 - arg1) {
            return;
        }
        class9.field84.method180(arg8, arg5, arg1, -128, arg6, arg0, arg7, arg4, arg2, this.field341);
        class9.field84.method174((byte) -64, arg7, arg4, arg8, arg2, arg0, arg6, arg1, arg5);
        class9.field84.method181(arg0, arg7, arg4, arg5, this.field282, arg8, arg2, arg1, arg6, -59, this.field280);
        if (this.field353 == this.field341 && class24.field249) {
            for (int var10 = 0; var10 < this.field345; var10++) {
                int var11 = this.field343[var10];
                int var12 = this.field278[var10];
                int var13 = class28.field387 + class19.field170 - var12;
                int var14 = var11 - class26.field364;
                int var15 = 16777215;
                class17 var16 = null;
                int var17 = this.field354[var10];
                if (var17 == 0) {
                    if (this.field341 == 3.0D) {
                        var16 = this.field299;
                    }
                    if (this.field341 == 4.0D) {
                        var16 = this.field284;
                    }
                    if (this.field341 == 6.0D) {
                        var16 = this.field285;
                    }
                    if (this.field341 == 8.0D) {
                        var16 = this.field346;
                    }
                }
                if (var17 == 1) {
                    if (this.field341 == 3.0D) {
                        var16 = this.field285;
                    }
                    if (this.field341 == 4.0D) {
                        var16 = this.field346;
                    }
                    if (this.field341 == 6.0D) {
                        var16 = this.field334;
                    }
                    if (this.field341 == 8.0D) {
                        var16 = this.field340;
                    }
                }
                int var18 = (arg5 - arg1) * (-arg0 + var14) / (arg4 - arg0) + arg1;
                if (var17 == 2) {
                    var15 = 16755200;
                    if (this.field341 == 3.0D) {
                        var16 = this.field334;
                    }
                    if (this.field341 == 4.0D) {
                        var16 = this.field340;
                    }
                    if (this.field341 == 6.0D) {
                        var16 = this.field283;
                    }
                    if (this.field341 == 8.0D) {
                        var16 = this.field350;
                    }
                }
                int var19 = (var13 - arg2) * (-arg8 + arg7) / (arg6 - arg2) + arg8;
                if (var16 != null) {
                    class34 var20 = this.field332[var10];
                    int var21 = 1;
                    for (int var22 = 0; var22 < var20.method224((byte) 115); var22++) {
                        if (var20.method222(var22, 16186) == 47) {
                            var21++;
                        }
                    }
                    int var23 = var19 - (var21 - 1) * var16.method79() / 2;
                    int var24 = var23 + var16.method77() / 2;
                    while (true) {
                        int var25 = var20.method238(47, (byte) -122);
                        if (var25 == -1) {
                            var16.method75(var20, var18, var24, var15, true);
                            break;
                        }
                        class34 var26 = var20.method229(0, -97, var25);
                        var16.method75(var26, var18, var24, var15, true);
                        var24 += var16.method79();
                        var20 = var20.method240((byte) -118, var25 + 1);
                    }
                }
            }
        }
        if (!class24.field237) {
            return;
        }
        for (int var27 = class26.field364 / 64; var27 < (class26.field364 + class1.field4) / 64; var27++) {
            for (int var28 = class28.field387 / 64; var28 < (class28.field387 + class19.field170) / 64; var28++) {
                int var29 = var28 * 64;
                int var30 = class28.field387 + class19.field170 - var29;
                int var31 = var27 * 64;
                int var32 = var31 - class26.field364;
                int var33 = (var32 - arg0) * (-arg1 + arg5) / (arg4 - arg0) + arg1;
                int var34 = (var30 - arg2 - 64) * (-arg8 + arg7) / (arg6 - arg2) + arg8;
                int var35 = (arg5 - arg1) * (-arg0 + 64 + var32) / (arg4 - arg0) + arg1;
                int var36 = arg8 + (var30 - arg2) * (-arg8 + arg7) / (arg6 - arg2);
                class23.method119(var33, var34, var35 - var33, -var34 + var36, 16777215);
                this.field349.method108(class16.method72(121, new class34[] { class1.method4(0, var27), class39.field524, class1.method4(0, var28) }), var35 - 5, var36 + -5, 16777215, -1);
                if (var27 == 33 && var28 >= 71 && var28 <= 73) {
                    this.field349.method103(class18.field156, (var33 + var35) / 2, (var34 + var36) / 2, 16711680, -1);
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "d", descriptor = "(I)V", line = 836)
    public final void method153(int arg0) {
        if (class9.field87) {
            class36.method249(class9.field80, -120);
            class3.method5(class9.field80, 0);
            this.method253((byte) -86);
            class35.method247(0, class9.field80);
            class8.method23(18302, class9.field80);
        }
        class29.method196((byte) 15);
        class27.method183((byte) 7);
        if (!class22.field222) {
            return;
        }
        if (class37.field505[96]) {
            class31.field445 = (int) ((double) class31.field445 - 16.0D / this.field341);
            this.field274 = true;
            class28.field385 = -1;
        }
        if (class37.field505[97]) {
            class31.field445 = (int) (16.0D / this.field341 + (double) class31.field445);
            this.field274 = true;
            class28.field385 = -1;
        }
        if (class37.field505[98]) {
            class34.field470 = (int) ((double) class34.field470 - 16.0D / this.field341);
            class28.field385 = -1;
            this.field274 = true;
        }
        if (class37.field505[99]) {
            class28.field385 = -1;
            this.field274 = true;
            class34.field470 = (int) (16.0D / this.field341 + (double) class34.field470);
        }
        while (true) {
            boolean var2;
            label489: do {
                while (true) {
                    while (true) {
                        while (class24.method133((byte) 82)) {
                            if (!class8.field76 || !class19.field163) {
                                if (class29.field393 == this.field322 || class29.field393 == this.field321) {
                                    class19.field163 = true;
                                    this.field274 = true;
                                }
                                if (class29.field393 == 49) {
                                    this.field274 = true;
                                    this.field353 = 3.0D;
                                }
                                if (class29.field393 == 50) {
                                    this.field353 = 4.0D;
                                    this.field274 = true;
                                }
                                if (class29.field393 == 51) {
                                    this.field353 = 6.0D;
                                    this.field274 = true;
                                }
                                if (class29.field393 == 52) {
                                    this.field353 = 8.0D;
                                    this.field274 = true;
                                }
                                if (class29.field393 == this.field270 || class29.field393 == this.field279) {
                                    this.field305 = !this.field305;
                                    this.field274 = true;
                                }
                                if (class29.field393 == this.field271 || class29.field393 == this.field281) {
                                    this.field274 = true;
                                    this.field318 = !this.field318;
                                }
                            } else if (class22.field220 == 0) {
                                class19.field163 = false;
                                this.field274 = true;
                                this.field277.method220(0, (byte) -81);
                                class36.field502 = -1;
                            } else {
                                if (class22.field220 != 84) {
                                    var2 = false;
                                    if (class22.field220 == 85) {
                                        if (this.field277.method224((byte) 126) > 0) {
                                            this.field277.method220(this.field277.method224((byte) 116) - 1, (byte) -81);
                                            this.field274 = true;
                                            if (this.field277.method224((byte) 115) == 0) {
                                                class36.field502 = -1;
                                            } else {
                                                var2 = true;
                                            }
                                        }
                                    } else if (class29.field393 != -1 && this.field277.method224((byte) 120) <= class29.field398) {
                                        this.field277.method239(false, class29.field393);
                                        this.field274 = true;
                                    }
                                    continue label489;
                                }
                                class28.field385 = class36.field502;
                                this.field312 = class34.field470 << 16;
                                this.field329 = class31.field445 << 16;
                                class19.field163 = false;
                                this.field277.method220(0, (byte) -81);
                                this.field274 = true;
                                class36.field502 = -1;
                            }
                        }
                        int var6 = class31.field422;
                        if (arg0 <= 27) {
                            field355 = null;
                        }
                        int var7 = class19.field169;
                        int var8 = class27.field376;
                        int var9 = class30.field404;
                        int var10 = class22.field219;
                        int var11 = class12.field120;
                        if (var6 == 1) {
                            this.field290 = class31.field445;
                            this.field356 = var7;
                            this.field306 = var9;
                            this.field307 = class34.field470;
                            if (class3.field27.length == 1) {
                                if (var7 > this.field304 && var7 < this.field316 + this.field304 && var9 > this.field317 && var9 < this.field317 + this.field286) {
                                    this.field353 = 3.0D;
                                    this.field356 = -1;
                                }
                                if (var7 > this.field342 + this.field304 && var7 < this.field304 + this.field342 + this.field316 && var9 > this.field317 && this.field317 + this.field286 > var9) {
                                    this.field356 = -1;
                                    this.field353 = 4.0D;
                                }
                                if (var7 > this.field342 * 2 + this.field304 && this.field342 * 2 + this.field316 + this.field304 > var7 && var9 > this.field317 && var9 < this.field317 + this.field286) {
                                    this.field356 = -1;
                                    this.field353 = 6.0D;
                                }
                                if (this.field304 + this.field342 * 3 < var7 && var7 < this.field316 + this.field304 + this.field342 * 3 && var9 > this.field317 && var9 < this.field317 + this.field286) {
                                    this.field356 = -1;
                                    this.field353 = 8.0D;
                                }
                            } else {
                                if (this.field304 < var7 && var7 < this.field304 + this.field316 && var9 > this.field317 && var9 < this.field333 + this.field317 + this.field286) {
                                    this.field356 = -1;
                                    this.field353 = 3.0D;
                                }
                                if (var7 > this.field304 + this.field342 && var7 < this.field342 + this.field304 + this.field316 && var9 > this.field317 && this.field333 + this.field286 + this.field317 > var9) {
                                    this.field353 = 4.0D;
                                    this.field356 = -1;
                                }
                                if (this.field342 * 2 + this.field304 < var7 && this.field342 * 2 + this.field304 + this.field316 > var7 && var9 > this.field317 && this.field317 + this.field286 + this.field333 > var9) {
                                    this.field353 = 6.0D;
                                    this.field356 = -1;
                                }
                                if (this.field342 * 3 + this.field304 < var7 && var7 < this.field316 + this.field304 + this.field342 * 3 && var9 > this.field317 && this.field317 + this.field286 + this.field333 > var9) {
                                    this.field356 = -1;
                                    this.field353 = 8.0D;
                                }
                                if (var7 > 170 && var7 < 400 && var9 > 483 && var9 < 503) {
                                    this.method139(this.field272, 32);
                                    this.method155(-1);
                                    this.method158((byte) 127);
                                    this.field356 = -1;
                                }
                            }
                            if (this.field331 < var7 && this.field351 + this.field308 < var9 && var7 < this.field336 + this.field331 && var9 < 503) {
                                this.field305 = !this.field305;
                                this.field356 = -1;
                            }
                            if (this.field287 < var7 && this.field330 + this.field267 < var9 && var7 < this.field287 + this.field294 && var9 < 503) {
                                this.field318 = !this.field318;
                                this.field356 = -1;
                            }
                            if (this.field305) {
                                if (var7 > this.field331 && this.field308 < var9 && this.field336 + this.field331 > var7 && this.field308 + 18 > var9 && this.field344 > 0) {
                                    this.field344 -= 24;
                                }
                                if (this.field331 < var7 && var9 > this.field308 && var7 < this.field331 + this.field336 && this.field351 + this.field308 > var9) {
                                    this.field356 = -1;
                                }
                                if (var7 > this.field331 && var9 > this.field308 + this.field351 - 18 && this.field336 + this.field331 > var7 && var9 < this.field308 + this.field351 && this.field344 < 48) {
                                    this.field344 += 24;
                                }
                            }
                            this.field274 = true;
                            this.field327 = false;
                            if (this.field318 && var7 > this.field287 && var9 > this.field330 && var7 < this.field287 + this.field294 && this.field330 + this.field267 > var9) {
                                class31.field445 = (var7 - this.field287) * class1.field4 / this.field294;
                                this.field327 = true;
                                class34.field470 = (var9 - this.field330) * class19.field170 / this.field267;
                                this.field356 = -1;
                            }
                            if (class8.field76 && !class19.field163 && !this.field327 && var7 > this.field303 && this.field291 < var9 && var7 < this.field303 + this.field297 && var9 < this.field324 + this.field291) {
                                class19.field163 = true;
                            }
                        }
                        if (this.field305) {
                            this.field310 = -1;
                            if (var10 > this.field331 && var10 < this.field336 + this.field331) {
                                int var12 = this.field275;
                                int var13 = this.field308 + 21 + 5;
                                for (int var14 = 0; var14 < 24; var14++) {
                                    if (this.field296.length > var12 && this.field296[var12].method219(class6.field42, 1)) {
                                        var12++;
                                        var14--;
                                    } else {
                                        if (var13 <= var11 && var11 < var13 + 17) {
                                            if (var6 == 1) {
                                                this.field280 = var12;
                                                this.field282 = 50;
                                            }
                                            this.field310 = var12;
                                        }
                                        var12++;
                                        var13 += 17;
                                    }
                                }
                            }
                            if (this.field310 != this.field300) {
                                this.field300 = this.field310;
                                this.field274 = true;
                            }
                        }
                        if (var8 == 1 && this.field318 && this.field327) {
                            class28.field385 = -1;
                            this.field274 = true;
                            int var15 = var11;
                            int var16 = var10;
                            if (var10 < this.field287) {
                                var16 = this.field287;
                            } else if (var10 > this.field294 + this.field287) {
                                var16 = this.field287 + this.field294;
                            }
                            class31.field445 = (var16 - this.field287) * class1.field4 / this.field294;
                            if (var11 < this.field330) {
                                var15 = this.field330;
                            } else if (var11 > this.field330 + this.field267) {
                                var15 = this.field330 + this.field267;
                            }
                            class34.field470 = (var15 - this.field330) * class19.field170 / this.field267;
                        } else {
                            this.field327 = false;
                        }
                        if (var8 == 1 && this.field356 != -1) {
                            this.field274 = true;
                            class34.field470 = this.field307 + (int) ((double) (this.field306 - var11) * 2.0D / this.field353);
                            class28.field385 = -1;
                            class31.field445 = (int) ((double) (this.field356 - var10) * 2.0D / this.field353) + this.field290;
                        }
                        if (this.field341 < this.field353) {
                            this.field341 /= 30.0D;
                            if (this.field341 > this.field353) {
                                this.field341 = this.field353;
                            }
                            this.field274 = true;
                        }
                        if (this.field341 > this.field353) {
                            this.field341 /= 30.0D;
                            if (this.field353 > this.field341) {
                                this.field341 = this.field353;
                            }
                            this.field274 = true;
                        }
                        if (this.field344 > this.field275) {
                            this.field274 = true;
                            this.field275++;
                        }
                        if (this.field344 < this.field275) {
                            this.field275--;
                            this.field274 = true;
                        }
                        if (this.field282 > 0) {
                            this.field282--;
                            this.field274 = true;
                        }
                        if (class28.field385 >= 0) {
                            class1.field12 = this.field343[class28.field385] - class26.field364;
                            field347 = class19.field170 + class28.field387 - this.field278[class28.field385];
                            this.field274 = true;
                            byte var17 = 4;
                            int var18 = class1.field12 - (int) (635.0D / this.field341);
                            int var19 = class1.field12 + (int) (635.0D / this.field341);
                            if (var18 < 48) {
                                class1.field12 = (int) (635.0D / this.field341) + 48;
                            }
                            int var20 = (int) (503.0D / this.field341) + field347;
                            int var21 = field347 - (int) (503.0D / this.field341);
                            if (class1.field4 - 48 < var19) {
                                class1.field12 = class1.field4 - (int) (635.0D / this.field341) - 48;
                            }
                            if (var21 < 48) {
                                field347 = (int) (503.0D / this.field341) + 48;
                            }
                            if (class19.field170 - 48 < var20) {
                                field347 = class19.field170 - (int) (503.0D / this.field341) - 48;
                            }
                            field347 <<= 0x10;
                            class1.field12 <<= 0x10;
                            int var22 = field347 - this.field312;
                            int var23 = class1.field12 - this.field329;
                            if (var23 >> var17 == 0 && var22 >> var17 == 0) {
                                class28.field385 = -1;
                            } else {
                                this.field329 += var23 >> var17;
                                class31.field445 = this.field329 >> 16;
                                this.field312 += var22 >> var17;
                                class34.field470 = this.field312 >> 16;
                            }
                        }
                        int var24 = class31.field445 - (int) (635.0D / this.field341);
                        int var25 = class34.field470 - (int) (503.0D / this.field341);
                        int var26 = class34.field470 + (int) (503.0D / this.field341);
                        if (var25 < 48) {
                            class34.field470 = (int) (503.0D / this.field341) + 48;
                        }
                        int var27 = (int) (635.0D / this.field341) + class31.field445;
                        if (var24 < 48) {
                            class31.field445 = (int) (635.0D / this.field341) + 48;
                        }
                        if (var27 > class1.field4 - 48) {
                            class31.field445 = class1.field4 - (int) (635.0D / this.field341) - 48;
                        }
                        if (var26 > class19.field170 - 48) {
                            class34.field470 = class19.field170 - (int) (503.0D / this.field341) - 48;
                        }
                        return;
                    }
                }
            } while (this.field277.method224((byte) 121) <= 0);
            for (int var3 = 0; var3 < this.field345; var3++) {
                if (this.field332[var3].method224((byte) 118) >= this.field277.method224((byte) 126)) {
                    class34 var4 = this.field277.method221((byte) -109);
                    class34 var5 = this.field332[var3].method243(47, 61, 32).method229(0, -97, this.field277.method224((byte) 127)).method221((byte) -109);
                    if (var4.method227(8753, var5) == 0) {
                        this.field274 = true;
                        var2 = true;
                        class36.field502 = var3;
                        break;
                    }
                }
            }
            if (!var2) {
                this.field277.method220(this.field277.method224((byte) 118) - 1, (byte) -81);
            }
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "b", descriptor = "(II)I", line = 1392)
    private final int method154(int arg0, int arg1) {
        if (arg0 != 1) {
            this.field333 = 67;
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
            return class7.method20(true, arg1);
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "j", descriptor = "(I)V", line = 1461)
    private final void method155(int arg0) {
        class24.field239 = false;
        try {
            Graphics var2 = class9.field80.getGraphics();
            class19.field168.method53(false, 0, 0, var2);
            if (arg0 != -1) {
                this.method153(-48);
            }
        } catch (Exception var4) {
            class9.field80.repaint();
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(IZI)B", line = 1479)
    public static final byte method156(int arg0, boolean arg1, int arg2) {
        if (!arg1) {
            return -91;
        }
        int var3 = arg0 >> 6;
        int var4 = arg2 >> 6;
        if (class1.field13[var4][var3] == null) {
            return 0;
        } else if (class1.field13[var4][var3].field18 == null) {
            return class1.field13[var4][var3].field11;
        } else {
            return class1.field13[var4][var3].field18[(arg2 & 0xFC0) + arg0 & 0x3F];
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(ILjava/lang/String;[B)Z", line = 1501)
    private final boolean method157(int arg0, String arg1, byte[] arg2) {
        if (arg2 == null) {
            return false;
        }
        try {
            MessageDigest var4 = MessageDigest.getInstance("SHA");
            var4.reset();
            var4.update(arg2);
            int var5 = 77 / ((arg0 - 66) / 60);
            byte[] var6 = var4.digest();
            if (arg1 == "main_file_cache.dat0") {
                if (var6[0] != -7 || var6[1] != -13 || var6[2] != 101 || var6[3] != 59 || var6[4] != -99 || var6[5] != -107 || var6[6] != -7 || var6[7] != -124 || var6[8] != -71 || var6[9] != -21 || var6[10] != 23 || var6[11] != -103 || var6[12] != 9 || var6[13] != 67 || var6[14] != 2 || var6[15] != -123 || var6[16] != -77 || var6[17] != 83 || var6[18] != 20 || var6[19] != -89) {
                    return false;
                }
            } else if (arg1 == "main_file_cache.idx1") {
                if (var6[0] != 52 || var6[1] != 126 || var6[2] != -117 || var6[3] != -96 || var6[4] != 55 || var6[5] != 19 || var6[6] != -40 || var6[7] != 125 || var6[8] != 49 || var6[9] != -77 || var6[10] != 77 || var6[11] != -79 || var6[12] != -93 || var6[13] != -47 || var6[14] != -110 || var6[15] != -122 || var6[16] != 84 || var6[17] != -103 || var6[18] != -78 || var6[19] != 126) {
                    return false;
                }
            } else if (var6[0] != -69 || var6[1] != 103 || var6[2] != -23 || var6[3] != -73 || var6[4] != -43 || var6[5] != 118 || var6[6] != -28 || var6[7] != -103 || var6[8] != -56 || var6[9] != -73 || var6[10] != -13 || var6[11] != 122 || var6[12] != -21 || var6[13] != -119 || var6[14] != 82 || var6[15] != 37 || var6[16] != -104 || var6[17] != 7 || var6[18] != -11 || var6[19] != -22) {
                return false;
            }
            return true;
        } catch (Exception var8) {
            this.method256(67, "sha");
            return false;
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "e", descriptor = "(B)V", line = 1569)
    private final void method158(byte arg0) {
        if (arg0 < 103) {
            this.field296 = null;
        }
        if (class3.field27.length == 1) {
            class36.field501 = 0;
        } else {
            if (class1.field3 >= 0) {
                class36.field501 = class1.field3;
            } else {
                class36.field501 = this.method159(false, class36.field501);
            }
            class1.field3 = this.method159(false, class36.field501);
        }
        this.method142(false, class36.field501);
    }

    @OriginalMember(owner = "mapview!mapview", name = "b", descriptor = "(ZI)I", line = 1603)
    private final int method159(boolean arg0, int arg1) {
        arg1++;
        if (arg0) {
            this.field324 = 44;
        }
        if (class3.field27.length <= arg1) {
            arg1 = 0;
        }
        return arg1;
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(Ls;Ljava/lang/String;B)Z", line = 1630)
    private final boolean method160(class34 arg0, String arg1, byte arg2) {
        byte[] var4 = null;
        if (!class16.field140) {
            if (class29.field389 != null) {
                try {
                    var4 = this.method163(class29.field389 + "/" + arg1, 72);
                    if (!this.method157(-44, arg1, var4)) {
                        var4 = null;
                    }
                    if (var4 != null) {
                        class16.field139 = new class18(var4, false, true);
                        return true;
                    }
                } catch (IOException var11) {
                    var4 = null;
                }
            }
            class16.field140 = true;
        }
        if (var4 == null) {
            boolean var6 = this.method145((byte) 104, arg1, arg0);
            if (!var6) {
                return false;
            }
            var4 = class38.field514;
            class38.field514 = null;
        }
        if (var4 == null) {
            class16.field140 = false;
            return true;
        }
        if (class29.field389 != null && var4 != null) {
            try {
                this.method143(class29.field389 + "/" + arg1, (byte) -102, var4);
            } catch (IOException var10) {
            }
        }
        try {
            class16.field139 = new class18(var4, false, true);
            if (arg2 != 85) {
                this.field275 = -48;
            }
            class16.field140 = false;
            return true;
        } catch (IOException var9) {
            throw class10.method39(var9, "monkey feet");
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(B)V", line = 1709)
    public final void method161(byte arg0) {
        int var2 = -81 / ((-arg0 - 65) / 59);
        if (!class22.field222) {
            class22.field222 = this.method162(26);
            class36.method251(null, field309, 29918, class12.field121);
            return;
        }
        if (this.field274) {
            class24.field239 = true;
            this.field274 = false;
            class23.method127();
            int var3 = class34.field470 + (int) (503.0D / this.field341);
            int var4 = class34.field470 - (int) (503.0D / this.field341);
            int var5 = (int) (635.0D / this.field341) + class31.field445;
            int var6 = class31.field445 - (int) (635.0D / this.field341);
            this.method152(var6, 0, var4, (byte) 98, var5, 635, var3, 503, 0);
            if (this.field318) {
                this.field338.method48(this.field287, this.field330);
                class23.method118(this.field287 + this.field294 * var6 / class1.field4, this.field267 * var4 / class19.field170 + this.field330, (var5 - var6) * this.field294 / class1.field4, (var3 - var4) * this.field267 / class19.field170, 16711680, 128);
                class23.method119(this.field294 * var6 / class1.field4 + this.field287, this.field267 * var4 / class19.field170 + this.field330, (var5 - var6) * this.field294 / class1.field4, (var3 - var4) * this.field267 / class19.field170, 16711680);
                if (this.field282 > 0 && this.field282 % 10 < 5) {
                    for (int var7 = 0; var7 < class35.field485; var7++) {
                        if (class9.field84.field369[var7] == this.field280) {
                            int var8 = class9.field84.field370[var7] * this.field294 / class1.field4 + this.field287;
                            int var9 = this.field330 + class9.field84.field359[var7] * this.field267 / class19.field170;
                            class23.method120(var8, var9, 2, 16776960, 256);
                        }
                    }
                }
            }
            if (this.field305) {
                this.method147(this.field308, 7829367, 18, 5592405, this.field336, (byte) -68, this.field269, 10066329, this.field331);
                this.method147(this.field308 + 18, 7829367, this.field351 - 36, 5592405, this.field336, (byte) -68, class39.field527, 10066329, this.field331);
                this.method147(this.field351 + this.field308 - 18, 7829367, 18, 5592405, this.field336, (byte) -68, this.field295, 10066329, this.field331);
                int var10 = this.field308 + 3 + 18;
                int var11 = this.field275;
                for (int var12 = 0; var12 < 24; var12++) {
                    if (var11 < class35.field487.length && this.field296.length > var11) {
                        if (this.field296[var11].method219(class6.field42, 1)) {
                            var12--;
                            var11++;
                            continue;
                        }
                        int var13 = 16777215;
                        class35.field487[var11].method47(this.field331 + 3, var10);
                        this.field349.method111(this.field296[var11], this.field331 + 21, var10 + 14, 0, -1);
                        if (this.field310 == var11) {
                            var13 = 12298922;
                        }
                        if (this.field282 > 0 && this.field282 % 10 < 5 && this.field280 == var11) {
                            var13 = 16776960;
                        }
                        this.field349.method111(this.field296[var11], this.field331 + 20, var10 - -13, var13, -1);
                    }
                    var10 += 17;
                    var11++;
                }
            }
            if (class3.field27.length == 1) {
                this.method147(this.field330 + this.field267, this.field319, 18, this.field337, this.field294, (byte) -68, this.field325, this.field301, this.field287);
                this.method147(this.field351 + this.field308, this.field319, 18, this.field337, this.field336, (byte) -68, this.field292, this.field301, this.field331);
                if (this.field353 == 3.0D) {
                    this.method147(this.field317, this.field272, this.field286, this.field313, this.field316, (byte) -68, class18.field152, this.field268, this.field304);
                } else {
                    this.method147(this.field317, this.field319, this.field286, this.field337, this.field316, (byte) -68, class18.field152, this.field301, this.field304);
                }
                if (this.field353 == 4.0D) {
                    this.method147(this.field317, this.field272, this.field286, this.field313, this.field316, (byte) -68, class34.field466, this.field268, this.field342 + this.field304);
                } else {
                    this.method147(this.field317, this.field319, this.field286, this.field337, this.field316, (byte) -68, class34.field466, this.field301, this.field342 + this.field304);
                }
                if (this.field353 == 6.0D) {
                    this.method147(this.field317, this.field272, this.field286, this.field313, this.field316, (byte) -68, class24.field242, this.field268, this.field342 * 2 + this.field304);
                } else {
                    this.method147(this.field317, this.field319, this.field286, this.field337, this.field316, (byte) -68, class24.field242, this.field301, this.field342 * 2 + this.field304);
                }
                if (this.field353 == 8.0D) {
                    this.method147(this.field317, this.field272, this.field286, this.field313, this.field316, (byte) -68, class19.field171, this.field268, this.field304 + this.field342 * 3);
                } else {
                    this.method147(this.field317, this.field319, this.field286, this.field337, this.field316, (byte) -68, class19.field171, this.field301, this.field304 + this.field342 * 3);
                }
            } else {
                this.method147(this.field330 + this.field267, this.field319, 18, this.field337, this.field294, (byte) -68, this.field325, this.field301, this.field287);
                this.method147(this.field351 + this.field308, this.field319, 18, this.field337, this.field336, (byte) -68, this.field292, this.field301, this.field331);
                this.method139(this.field319, 32);
                int var14 = this.field317 + this.field333;
                if (this.field353 == 3.0D) {
                    this.method147(var14, this.field272, this.field286, this.field313, this.field316, (byte) -68, class18.field152, this.field268, this.field304);
                } else {
                    this.method147(var14, this.field319, this.field286, this.field337, this.field316, (byte) -68, class18.field152, this.field301, this.field304);
                }
                if (this.field353 == 4.0D) {
                    this.method147(var14, this.field272, this.field286, this.field313, this.field316, (byte) -68, class34.field466, this.field268, this.field342 + this.field304);
                } else {
                    this.method147(var14, this.field319, this.field286, this.field337, this.field316, (byte) -68, class34.field466, this.field301, this.field342 + this.field304);
                }
                if (this.field353 == 6.0D) {
                    this.method147(var14, this.field272, this.field286, this.field313, this.field316, (byte) -68, class24.field242, this.field268, this.field342 * 2 + this.field304);
                } else {
                    this.method147(var14, this.field319, this.field286, this.field337, this.field316, (byte) -68, class24.field242, this.field301, this.field342 * 2 + this.field304);
                }
                if (this.field353 == 8.0D) {
                    this.method147(var14, this.field272, this.field286, this.field313, this.field316, (byte) -68, class19.field171, this.field268, this.field342 * 3 + this.field304);
                } else {
                    this.method147(var14, this.field319, this.field286, this.field337, this.field316, (byte) -68, class19.field171, this.field301, this.field304 + this.field342 * 3);
                }
            }
            if (class8.field76) {
                this.method147(this.field291, this.field319, this.field324, this.field337, this.field297, (byte) -68, this.field357, this.field301, this.field303);
                if (class19.field163) {
                    class23.method118(this.field303 + this.field297 + 2, this.field291, this.field320 + 10, this.field324, 8925952, 192);
                    class23.method119(this.field303 + this.field297 + 2, this.field291, this.field320 + 10, this.field324, 16777215);
                    if (class36.field502 > -1 && this.field277.method224((byte) 124) > 0) {
                        class34 var15 = this.field332[class36.field502].method243(47, 61, 32);
                        int var16 = this.field277.method224((byte) 121);
                        if (var16 > var15.method224((byte) 116)) {
                            var16 = var15.method224((byte) 123);
                        }
                        this.field349.method111(var15, this.field303 + this.field297 + 6, 20, 10066176, 0);
                        this.field349.method111(var15.method229(0, -97, var16), this.field303 + this.field297 + 6, 20, 16777215, 0);
                    } else {
                        this.field349.method111(this.field289, this.field297 + this.field303 + 6, 20, 16776960, 0);
                    }
                }
            }
        }
        if (class24.field239) {
            this.method155(-1);
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "k", descriptor = "(I)Z", line = 1907)
    private final boolean method162(int arg0) {
        if (class19.field160 == 0) {
            this.method149(-106);
            class19.field160 = 1;
        }
        if (class19.field160 == 1) {
            class12.field121 = 15;
            boolean var2 = this.method160(this.field315, "main_file_cache.idx0", (byte) 85);
            if (!var2) {
                return false;
            }
            class18.field157 = class16.field139;
            class16.field139 = null;
            if (class18.field157 == null) {
                throw new RuntimeException("T1");
            }
            class19.field160 = 2;
        }
        if (class19.field160 == 2) {
            class12.field121 = 30;
            boolean var3 = this.method160(this.field311, "main_file_cache.idx1", (byte) 85);
            if (!var3) {
                return false;
            }
            class28.field382 = class16.field139;
            class16.field139 = null;
            if (class28.field382 == null) {
                throw new RuntimeException("T2");
            }
            class19.field160 = 3;
        }
        if (class19.field160 == 3) {
            class19.field160 = 10;
            class3.field27 = new class18[1];
        }
        if (class19.field160 == 10) {
            class12.field121 = 50;
            boolean var4 = this.method160(this.field314, "main_file_cache.dat0", (byte) 85);
            if (!var4) {
                return false;
            }
            class3.field27[0] = class16.field139;
            class16.field139 = null;
            if (class3.field27[0] == null) {
                throw new RuntimeException("T3");
            }
            class19.field160 = 20;
        }
        if (arg0 != 26) {
            this.init();
        }
        if (class19.field160 != 20) {
            return false;
        }
        class8.field68 = class28.method188(class39.field527, class31.field427, class18.field157, arg0 ^ 0xFFFFFF98);
        class35.field487 = class34.method235(class18.field157, -88, class39.field527, class39.field522);
        this.field349 = class24.method132(class18.field157, class28.field382, true, class39.field527, class22.field224);
        this.field299 = new class17(11, true, this);
        this.field284 = new class17(12, true, this);
        this.field285 = new class17(14, true, this);
        this.field346 = new class17(17, true, this);
        this.field334 = new class17(19, true, this);
        this.field340 = new class17(22, true, this);
        this.field283 = new class17(26, true, this);
        this.field350 = new class17(30, true, this);
        class12.field121 = 100;
        field309 = this.field348;
        class36.method251(null, field309, arg0 ^ 0x74C4, class12.field121);
        this.field297 = this.field349.method106(this.field357) + 20;
        this.method158((byte) 126);
        class34[] var5 = this.field296;
        for (int var6 = 0; var6 < var5.length; var6++) {
            class34 var7 = var5[var6];
            int var8 = this.field349.method106(var7);
            if (var8 > this.field326) {
                this.field326 = var8;
            }
        }
        this.field336 = this.field326 + 16 + 18;
        if (this.field336 > 140) {
            int var9 = this.field287 - this.field336 - this.field331;
            this.field339 = var9 / 25;
            int var10 = var9 - this.field339 * 25;
            this.field304 = var10 / 2 + this.field339 + this.field336 + this.field331;
            this.field316 = this.field339 * 5;
            this.field342 = this.field339 + this.field316;
        }
        return true;
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(Ljava/lang/String;I)[B", line = 2110)
    private final byte[] method163(String arg0, int arg1) throws IOException {
        File var3 = new File(arg0);
        if (!var3.exists()) {
            return null;
        }
        int var4 = 86 % ((arg1 + 64) / 60);
        int var5 = (int) var3.length();
        DataInputStream var6 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg0)));
        byte[] var7 = new byte[var5];
        var6.readFully(var7, 0, var5);
        var6.close();
        return var7;
    }
}
