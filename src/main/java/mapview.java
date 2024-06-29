import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
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
public class mapview extends class14 {

    @OriginalMember(owner = "mapview!mapview", name = "B", descriptor = "I")
    private int field270 = 30;

    @OriginalMember(owner = "mapview!mapview", name = "L", descriptor = "I")
    private int field280 = -1;

    @OriginalMember(owner = "mapview!mapview", name = "z", descriptor = "I")
    private int field268 = -1;

    @OriginalMember(owner = "mapview!mapview", name = "F", descriptor = "I")
    private int field274 = 6706483;

    @OriginalMember(owner = "mapview!mapview", name = "M", descriptor = "Z")
    private boolean field281 = true;

    @OriginalMember(owner = "mapview!mapview", name = "s", descriptor = "I")
    private int field261 = 10;

    @OriginalMember(owner = "mapview!mapview", name = "p", descriptor = "I")
    private int field258 = 33;

    @OriginalMember(owner = "mapview!mapview", name = "Q", descriptor = "D")
    private double field285 = 4.0D;

    @OriginalMember(owner = "mapview!mapview", name = "J", descriptor = "I")
    private int field278 = 11141120;

    @OriginalMember(owner = "mapview!mapview", name = "O", descriptor = "I")
    private int field283 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "R", descriptor = "I")
    private int field286 = -20;

    @OriginalMember(owner = "mapview!mapview", name = "lb", descriptor = "I")
    private int field306 = 8912896;

    @OriginalMember(owner = "mapview!mapview", name = "fb", descriptor = "I")
    private int field300 = 40;

    @OriginalMember(owner = "mapview!mapview", name = "S", descriptor = "I")
    private int field287 = 5;

    @OriginalMember(owner = "mapview!mapview", name = "jb", descriptor = "I")
    private int field304 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "eb", descriptor = "I")
    private int field299 = 5;

    @OriginalMember(owner = "mapview!mapview", name = "W", descriptor = "I")
    private int field291 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "tb", descriptor = "I")
    private int field314 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "vb", descriptor = "I")
    private int field316 = 7824964;

    @OriginalMember(owner = "mapview!mapview", name = "yb", descriptor = "I")
    private int field319 = 50;

    @OriginalMember(owner = "mapview!mapview", name = "Ib", descriptor = "I")
    private int field329 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "r", descriptor = "I")
    private int field260 = 170;

    @OriginalMember(owner = "mapview!mapview", name = "hb", descriptor = "I")
    private int field302 = 140;

    @OriginalMember(owner = "mapview!mapview", name = "k", descriptor = "I")
    private int field253 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "xb", descriptor = "I")
    private int field318 = 8943445;

    @OriginalMember(owner = "mapview!mapview", name = "mb", descriptor = "Z")
    private boolean field307 = false;

    @OriginalMember(owner = "mapview!mapview", name = "cb", descriptor = "I")
    private int field297 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "X", descriptor = "I")
    private int field292 = 10027008;

    @OriginalMember(owner = "mapview!mapview", name = "Lb", descriptor = "I")
    private int field332 = this.field319 + this.field261;

    @OriginalMember(owner = "mapview!mapview", name = "kb", descriptor = "I")
    private int field305 = 5;

    @OriginalMember(owner = "mapview!mapview", name = "ib", descriptor = "D")
    private double field303 = 4.0D;

    @OriginalMember(owner = "mapview!mapview", name = "Nb", descriptor = "Z")
    private boolean field334 = false;

    @OriginalMember(owner = "mapview!mapview", name = "V", descriptor = "I")
    private int field290 = -1;

    @OriginalMember(owner = "mapview!mapview", name = "Ob", descriptor = "Z")
    private boolean field335 = false;

    @OriginalMember(owner = "mapview!mapview", name = "Qb", descriptor = "I")
    private int field337 = 500;

    @OriginalMember(owner = "mapview!mapview", name = "Hb", descriptor = "I")
    private int field328 = 471;

    @OriginalMember(owner = "mapview!mapview", name = "K", descriptor = "Z")
    private boolean field279 = false;

    @OriginalMember(owner = "mapview!mapview", name = "I", descriptor = "Ll;")
    private class22 field277 = this.field279 ? class8.field64 : class8.field64;

    @OriginalMember(owner = "mapview!mapview", name = "j", descriptor = "I")
    private int field252 = this.field279 ? 83 : 70;

    @OriginalMember(owner = "mapview!mapview", name = "Jb", descriptor = "[I")
    private int[] field330 = new int[this.field337];

    @OriginalMember(owner = "mapview!mapview", name = "l", descriptor = "Ll;")
    private class22 field254 = this.field279 ? class35.field474 : class35.field474;

    @OriginalMember(owner = "mapview!mapview", name = "Ab", descriptor = "Ll;")
    private class22 field321 = this.field279 ? class22.field217 : class22.field217;

    @OriginalMember(owner = "mapview!mapview", name = "ab", descriptor = "Ll;")
    private class22 field295 = this.field279 ? class3.field26 : class3.field26;

    @OriginalMember(owner = "mapview!mapview", name = "Db", descriptor = "[I")
    private int[] field324 = new int[this.field337];

    @OriginalMember(owner = "mapview!mapview", name = "Eb", descriptor = "Ll;")
    private class22 field325 = this.field279 ? class19.field182 : class19.field182;

    @OriginalMember(owner = "mapview!mapview", name = "U", descriptor = "I")
    private int field289 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "ob", descriptor = "Ll;")
    private class22 field309 = this.field279 ? class37.field489 : field327;

    @OriginalMember(owner = "mapview!mapview", name = "ub", descriptor = "Ll;")
    private class22 field315 = this.field279 ? field288 : field288;

    @OriginalMember(owner = "mapview!mapview", name = "Y", descriptor = "I")
    private int field293 = this.field279 ? 220 : 79;

    @OriginalMember(owner = "mapview!mapview", name = "N", descriptor = "[Ll;")
    private class22[] field282 = new class22[this.field337];

    @OriginalMember(owner = "mapview!mapview", name = "wb", descriptor = "I")
    private int field317 = 450;

    @OriginalMember(owner = "mapview!mapview", name = "m", descriptor = "I")
    private int field255 = this.field279 ? 115 : 102;

    @OriginalMember(owner = "mapview!mapview", name = "rb", descriptor = "I")
    private int field312 = this.field279 ? 108 : 107;

    @OriginalMember(owner = "mapview!mapview", name = "Tb", descriptor = "I")
    private int field340 = 23;

    @OriginalMember(owner = "mapview!mapview", name = "q", descriptor = "Ll;")
    private class22 field259 = this.field279 ? class19.field191 : class19.field191;

    @OriginalMember(owner = "mapview!mapview", name = "Z", descriptor = "[I")
    private int[] field294 = new int[this.field337];

    @OriginalMember(owner = "mapview!mapview", name = "Fb", descriptor = "I")
    private int field326 = this.field279 ? 76 : 75;

    @OriginalMember(owner = "mapview!mapview", name = "Mb", descriptor = "I")
    private int field333 = this.field279 ? 252 : 111;

    @OriginalMember(owner = "mapview!mapview", name = "Sb", descriptor = "Ll;")
    private class22 field339 = this.field279 ? class13.field133 : class13.field133;

    @OriginalMember(owner = "mapview!mapview", name = "pb", descriptor = "Ll;")
    private class22 field310 = this.field279 ? class3.field20 : class14.field149;

    @OriginalMember(owner = "mapview!mapview", name = "E", descriptor = "Ll;")
    private class22 field273 = this.field279 ? class32.field435 : class32.field435;

    @OriginalMember(owner = "mapview!mapview", name = "x", descriptor = "Ll;")
    private class22 field266 = this.field279 ? class32.field436 : class34.field454;

    @OriginalMember(owner = "mapview!mapview", name = "y", descriptor = "Ll;")
    public static class22 field267 = class33.method229("Rare Trees", -43);

    @OriginalMember(owner = "mapview!mapview", name = "A", descriptor = "Ll;")
    public static class22 field269 = class33.method229("Herbalist", -92);

    @OriginalMember(owner = "mapview!mapview", name = "D", descriptor = "Ll;")
    public static class22 field272 = class33.method229("Guide", -82);

    @OriginalMember(owner = "mapview!mapview", name = "Gb", descriptor = "Ll;")
    private static class22 field327 = class33.method229("Find", -49);

    @OriginalMember(owner = "mapview!mapview", name = "T", descriptor = "Ll;")
    private static class22 field288 = class33.method229("Loading )3)3)3", -102);

    @OriginalMember(owner = "mapview!mapview", name = "Ub", descriptor = "I")
    private static int field341 = -1;

    @OriginalMember(owner = "mapview!mapview", name = "t", descriptor = "I")
    private int field262;

    @OriginalMember(owner = "mapview!mapview", name = "v", descriptor = "I")
    public static int field264;

    @OriginalMember(owner = "mapview!mapview", name = "C", descriptor = "I")
    private int field271;

    @OriginalMember(owner = "mapview!mapview", name = "P", descriptor = "I")
    private int field284;

    @OriginalMember(owner = "mapview!mapview", name = "db", descriptor = "I")
    private int field298;

    @OriginalMember(owner = "mapview!mapview", name = "gb", descriptor = "I")
    private int field301;

    @OriginalMember(owner = "mapview!mapview", name = "Kb", descriptor = "I")
    private int field331;

    @OriginalMember(owner = "mapview!mapview", name = "Pb", descriptor = "I")
    private int field336;

    @OriginalMember(owner = "mapview!mapview", name = "Rb", descriptor = "I")
    private int field338;

    @OriginalMember(owner = "mapview!mapview", name = "sb", descriptor = "Lf;")
    private class11 field313;

    @OriginalMember(owner = "mapview!mapview", name = "n", descriptor = "Lia;")
    private class18 field256;

    @OriginalMember(owner = "mapview!mapview", name = "u", descriptor = "Lia;")
    private class18 field263;

    @OriginalMember(owner = "mapview!mapview", name = "w", descriptor = "Lia;")
    private class18 field265;

    @OriginalMember(owner = "mapview!mapview", name = "G", descriptor = "Lia;")
    private class18 field275;

    @OriginalMember(owner = "mapview!mapview", name = "H", descriptor = "Lia;")
    private class18 field276;

    @OriginalMember(owner = "mapview!mapview", name = "bb", descriptor = "Lia;")
    private class18 field296;

    @OriginalMember(owner = "mapview!mapview", name = "zb", descriptor = "Lia;")
    private class18 field320;

    @OriginalMember(owner = "mapview!mapview", name = "Bb", descriptor = "Lia;")
    private class18 field322;

    @OriginalMember(owner = "mapview!mapview", name = "Cb", descriptor = "Ll;")
    private class22 field323;

    @OriginalMember(owner = "mapview!mapview", name = "o", descriptor = "Lba;")
    private class4 field257;

    @OriginalMember(owner = "mapview!mapview", name = "Vb", descriptor = "Z")
    public static boolean field342;

    @OriginalMember(owner = "mapview!mapview", name = "nb", descriptor = "[Ll;")
    private class22[] field308;

    @OriginalMember(owner = "mapview!mapview", name = "qb", descriptor = "[Ll;")
    private class22[] field311;

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(Ll;Ljava/lang/String;B)Z", line = 8)
    private final boolean method171(class22 arg0, String arg1, byte arg2) {
        try {
            if (class19.field193 == null) {
                class21.field206 = method181((byte) -95, new class22[] { this.field339, class32.field437, arg0 });
                String var4;
                if (arg1 == "main_file_cache.dat0") {
                    var4 = "worldmap.main.js5?crc=2004700470";
                } else if (arg1 == "main_file_cache.dat1") {
                    var4 = "worldmap.dungeon.js5?crc=-395121713";
                } else if (arg1 == "main_file_cache.dat2") {
                    var4 = "worldmap.extra.js5?crc=120798761";
                } else {
                    var4 = "mapview.sprites.js5?crc=-1203441070";
                }
                int var5;
                if (arg1 == "main_file_cache.dat0") {
                    var5 = 412710;
                } else if (arg1 == "main_file_cache.dat1") {
                    var5 = 148769;
                } else if (arg1 == "main_file_cache.dat2") {
                    var5 = 117365;
                } else {
                    var5 = 8383;
                }
                class19.field193 = new DataInputStream((new URL(this.getCodeBase(), var4)).openStream());
                class35.field478 = 0;
                class5.field45 = new byte[var5];
                class12.field123 = 0;
            }
            int var6 = class12.field123;
            if (arg2 != 16) {
                this.field285 = -0.7322220205462359D;
            }
            int var7 = class5.field45.length;
            if (var6 >= var7) {
                class19.field193.close();
                class19.field193 = null;
                if (!this.method174(arg1, (byte) 90, class5.field45)) {
                    this.method79("download", 122);
                    class5.field45 = null;
                }
                return true;
            }
            class35.field478++;
            if (class35.field478 >= 1500) {
                throw new IOException();
            }
            DataInputStream var8 = class19.field193;
            int var9 = var8.available();
            if (var9 < 0) {
                throw new EOFException();
            } else if (var9 == 0) {
                return false;
            } else {
                if (var9 > var7 - var6) {
                    var9 = var7 - var6;
                }
                int var10 = var8.read(class5.field45, var6, var9);
                if (var10 < 0) {
                    throw new EOFException();
                } else if (var10 == 0) {
                    return false;
                } else {
                    class35.field478 = 0;
                    int var11 = var6 + var10;
                    int var12 = var11 * 100 / var7;
                    class21.field206 = method181((byte) 96, new class22[] { this.field277, class32.field437, arg0, class2.field14, class17.method99(0, var12), class29.field389 });
                    class12.field123 = var11;
                    return false;
                }
            }
        } catch (IOException var16) {
            try {
                class19.field193.close();
            } catch (Exception var15) {
            }
            class19.field193 = null;
            class5.field45 = null;
            this.method79(new String("download"), 125);
            return true;
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "b", descriptor = "(Ljava/lang/String;I)[B", line = 132)
    private final byte[] method172(String arg0, int arg1) throws IOException {
        File var3 = new File(arg0);
        if (!var3.exists()) {
            return null;
        }
        if (arg1 <= 14) {
            this.field294 = null;
        }
        int var4 = (int) var3.length();
        DataInputStream var5 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg0)));
        byte[] var6 = new byte[var4];
        var5.readFully(var6, 0, var4);
        var5.close();
        return var6;
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(B)V", line = 156)
    public final void method68(byte arg0) {
        method188((byte) 92);
        class2.method5(-122);
        class22.method143(false);
        class13.method67(-1);
        class25.method166((byte) -24);
        class38.method250(8);
        class14.method70(79);
        class17.method101((byte) -74);
        class19.method113(0);
        class3.method11(false);
        class5.method22((byte) 69);
        class11.method56();
        class18.method105();
        class16.method93(-71);
        class28.method203((byte) 70);
        class10.method42(-126);
        class12.method61((byte) -116);
        class31.method211();
        class24.method160(62);
        class23.method155((byte) -34);
        class32.method228(0);
        class8.method36(1416682150);
        class21.method128(35);
        class27.method200((byte) -27);
        class35.method235(0);
        class1.method4((byte) -124);
        class33.method230(40);
        class30.method210(10);
        class37.method239(0);
        class34.method234(true);
        class15.method85();
        class29.method206(258);
        this.field254 = null;
        this.field277 = null;
        this.field321 = null;
        this.field295 = null;
        this.field275 = null;
        this.field296 = null;
        this.field322 = null;
        this.field276 = null;
        this.field256 = null;
        this.field259 = null;
        this.field320 = null;
        this.field339 = null;
        this.field294 = null;
        this.field324 = null;
        this.field311 = null;
        this.field310 = null;
        this.field282 = null;
        this.field323 = null;
        this.field309 = null;
        this.field330 = null;
        this.field308 = null;
        this.field257 = null;
        this.field266 = null;
        if (arg0 < 106) {
            this.field312 = 86;
        }
        this.field263 = null;
        this.field315 = null;
        this.field313 = null;
        this.field325 = null;
        this.field273 = null;
        this.field265 = null;
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(II)I", line = 228)
    private final int method173(int arg0, int arg1) {
        if (arg1 != 30) {
            return 55;
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
            return class25.method167(arg0, (byte) -86);
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(Ljava/lang/String;B[B)Z", line = 294)
    private final boolean method174(String arg0, byte arg1, byte[] arg2) {
        if (arg2 == null) {
            return false;
        }
        try {
            MessageDigest var4 = MessageDigest.getInstance("SHA");
            var4.reset();
            var4.update(arg2);
            byte[] var5 = var4.digest();
            if (arg1 <= 6) {
                this.method173(99, 49);
            }
            if (arg0 == "main_file_cache.dat0") {
                if (var5[0] != 125 || var5[1] != 70 || var5[2] != 0 || var5[3] != -79 || var5[4] != -44 || var5[5] != 93 || var5[6] != 110 || var5[7] != -119 || var5[8] != 59 || var5[9] != -83 || var5[10] != -56 || var5[11] != 103 || var5[12] != 99 || var5[13] != -89 || var5[14] != -94 || var5[15] != -111 || var5[16] != -52 || var5[17] != 61 || var5[18] != -91 || var5[19] != 125) {
                    return false;
                }
            } else if (var5[0] != 65 || var5[1] != 89 || var5[2] != -58 || var5[3] != -50 || var5[4] != 116 || var5[5] != 117 || var5[6] != 59 || var5[7] != -103 || var5[8] != 18 || var5[9] != -89 || var5[10] != 45 || var5[11] != 126 || var5[12] != 80 || var5[13] != 10 || var5[14] != -103 || var5[15] != 75 || var5[16] != -21 || var5[17] != 109 || var5[18] != -27 || var5[19] != 126) {
                return false;
            }
            return true;
        } catch (Exception var7) {
            this.method79("sha", 124);
            return false;
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "f", descriptor = "(I)Z", line = 370)
    private final boolean method175(int arg0) {
        if (class21.field207 == 0) {
            this.method184(-30160);
            class21.field207 = 1;
        }
        if (class21.field207 == 1) {
            class10.field75 = 25;
            boolean var2 = this.method182((byte) 72, "main_file_cache.idx0", this.field295);
            if (!var2) {
                return false;
            }
            class28.field370 = class30.field421;
            class30.field421 = null;
            if (class28.field370 == null) {
                throw new RuntimeException("T1");
            }
            class21.field207 = 2;
        }
        if (class21.field207 == 2) {
            class19.field190 = new class3[1];
            class21.field207 = 10;
        }
        if (arg0 >= -9) {
            this.method186(-109, -18, 99, -86, -77, 109, -12, -7, 113);
        }
        if (class21.field207 == 10) {
            class10.field75 = 50;
            boolean var3 = this.method182((byte) -66, "main_file_cache.dat0", this.field273);
            if (!var3) {
                return false;
            }
            class19.field190[0] = class30.field421;
            class30.field421 = null;
            if (class19.field190[0] == null) {
                throw new RuntimeException("T2");
            }
            class21.field207 = 20;
        }
        if (class21.field207 != 20) {
            return false;
        }
        class23.field226 = method177(class19.field188, class28.field370, class2.field17, -9825);
        class13.field135 = class3.method9(-1, class8.field61, class28.field370, class2.field17);
        this.field313 = class19.method114(class33.field450, 0, class28.field370, class2.field17);
        this.field322 = new class18(11, true, this);
        this.field256 = new class18(12, true, this);
        this.field265 = new class18(14, true, this);
        this.field275 = new class18(17, true, this);
        this.field276 = new class18(19, true, this);
        this.field320 = new class18(22, true, this);
        this.field296 = new class18(26, true, this);
        this.field263 = new class18(30, true, this);
        class10.field75 = 100;
        class21.field206 = this.field254;
        method179(class21.field206, null, class10.field75, -21);
        this.field300 = this.field313.method59(this.field309) + 20;
        this.method190(0);
        class22[] var4 = this.field311;
        for (int var5 = 0; var5 < var4.length; var5++) {
            class22 var6 = var4[var5];
            int var7 = this.field313.method59(var6);
            if (var7 > this.field271) {
                this.field271 = var7;
            }
        }
        this.field302 = this.field271 + 16 + 18;
        if (this.field302 > 140) {
            int var8 = this.field331 - this.field302 - this.field287;
            this.field261 = var8 / 25;
            this.field319 = this.field261 * 5;
            this.field332 = this.field319 + this.field261;
            int var9 = var8 - this.field261 * 25;
            this.field260 = var9 / 2 + this.field287 + this.field302 + this.field261;
        }
        return true;
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(ZI)I", line = 503)
    private final int method176(boolean arg0, int arg1) {
        if (!arg0) {
            return 45;
        }
        arg1++;
        if (class19.field190.length <= arg1) {
            arg1 = 0;
        }
        return arg1;
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(Ll;Lea;Ll;I)[Lu;", line = 519)
    private static final class36[] method177(class22 arg0, class10 arg1, class22 arg2, int arg3) {
        int var4 = arg1.method41(true, arg2);
        int var5 = arg1.method50(var4, (byte) -39, arg0);
        return arg3 == -9825 ? class5.method28(var4, var5, (byte) 121, arg1) : (class36[]) null;
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(IIBILl;IIII)V", line = 552)
    private final void method178(int arg0, int arg1, byte arg2, int arg3, class22 arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg2 != -103) {
            this.field286 = 3;
        }
        class31.method214(arg5, arg7, arg3, arg1, 0);
        int var11 = arg3 - 2;
        int var10 = arg1 - 2;
        int var12 = arg5 + 1;
        int var13 = arg7 + 1;
        class31.method216(var12, var13, var11, var10, arg6);
        class31.method213(var12, var13, var11, arg8);
        class31.method218(var12, var13, var10, arg8);
        class31.method213(var12, var13 + var10 - 1, var11, arg0);
        class31.method218(var11 + var12 - 1, var13, var10, arg0);
        this.field313.method52(arg4, var12 + var11 / 2 + 1, var10 / 2 + var13 + 4 + 1, 0);
        this.field313.method52(arg4, var11 / 2 + var12, var13 - (-(var10 / 2) - 4), 16777215);
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(Ll;Ljava/awt/Color;II)V", line = 578)
    private static final void method179(class22 arg0, Color arg1, int arg2, int arg3) {
        try {
            if (arg3 != -21) {
                field269 = null;
            }
            Graphics var4 = class17.field168.getGraphics();
            if (class13.field136 == null) {
                class13.field136 = new Font("Helvetica", 1, 13);
                class25.field244 = class17.field168.getFontMetrics(class13.field136);
            }
            if (class37.field495) {
                class37.field495 = false;
                var4.setColor(Color.black);
                var4.fillRect(0, 0, class38.field507, field264);
            }
            if (arg1 == null) {
                arg1 = new Color(140, 17, 17);
            }
            try {
                if (class24.field231 == null) {
                    class24.field231 = class17.field168.createImage(304, 34);
                }
                Graphics var5 = class24.field231.getGraphics();
                var5.setColor(arg1);
                var5.drawRect(0, 0, 303, 33);
                var5.fillRect(2, 2, arg2 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(1, 1, 301, 31);
                var5.fillRect(arg2 * 3 + 2, 2, 300 - arg2 * 3, 30);
                var5.setFont(class13.field136);
                var5.setColor(Color.white);
                arg0.method144((304 - arg0.method138(arg3 + 145, class25.field244)) / 2, false, var5, 22);
                var4.drawImage(class24.field231, class38.field507 / 2 - 152, field264 / 2 - 18, null);
            } catch (Exception var10) {
                int var7 = class38.field507 / 2 - 152;
                int var8 = field264 / 2 - 18;
                var4.setColor(arg1);
                var4.drawRect(var7, var8, 303, 33);
                var4.fillRect(var7 + 2, var8 + 2, arg2 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var7 + 1, var8 - -1, 301, 31);
                var4.fillRect(var7 + arg2 * 3 + 2, var8 + 2, 300 - arg2 * 3, 30);
                var4.setFont(class13.field136);
                var4.setColor(Color.white);
                arg0.method144((304 - arg0.method138(arg3 ^ 0xFFFFFF92, class25.field244)) / 2 + var7, false, var4, var8 + 22);
            }
        } catch (Exception var11) {
            class17.field168.repaint();
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "init", descriptor = "()V", line = 640)
    public final void init() {
        if (this.method72(9619)) {
            this.method69(class23.field229.method149(this, (byte) -124).method148(10), 32, (byte) -117, 503, 635);
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(B[Ll;)V", line = 654)
    private static final void method180(byte arg0, class22[] arg1) {
        class37.method240(0, arg1.length, arg1, 0);
        if (arg0 != -39) {
            method179(null, null, 49, 30);
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "b", descriptor = "(B[Ll;)Ll;", line = 674)
    private static final class22 method181(byte arg0, class22[] arg1) {
        if (arg1.length < 2) {
            throw new IllegalArgumentException();
        }
        int var2 = 106 / ((arg0 - 12) / 43);
        return class12.method60(arg1.length, arg1, 0, -1799);
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(BLjava/lang/String;Ll;)Z", line = 699)
    private final boolean method182(byte arg0, String arg1, class22 arg2) {
        byte[] var4 = null;
        if (!class3.field23) {
            if (class38.field505 != null) {
                try {
                    var4 = this.method172(class38.field505 + "/" + arg1, 84);
                    if (!this.method174(arg1, (byte) 67, var4)) {
                        var4 = null;
                    }
                    if (var4 != null) {
                        class30.field421 = new class3(var4, false, true);
                        return true;
                    }
                } catch (IOException var12) {
                    var4 = null;
                }
            }
            class3.field23 = true;
        }
        if (var4 == null) {
            boolean var6 = this.method171(arg2, arg1, (byte) 16);
            if (!var6) {
                return false;
            }
            var4 = class5.field45;
            class5.field45 = null;
        }
        if (var4 == null) {
            class3.field23 = false;
            return true;
        }
        int var7 = -123 % ((arg0 + 4) / 53);
        if (class38.field505 != null && var4 != null) {
            try {
                this.method189(class38.field505 + "/" + arg1, var4, (byte) -37);
            } catch (IOException var11) {
            }
        }
        try {
            class30.field421 = new class3(var4, false, true);
            class3.field23 = false;
            return true;
        } catch (IOException var10) {
            throw class19.method115(var10, "monkey feet");
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "c", descriptor = "(B)V", line = 774)
    public final void method74(byte arg0) {
        if (!class17.field173) {
            class17.field173 = this.method175(-46);
            method179(class21.field206, null, class10.field75, -21);
            return;
        }
        if (this.field281) {
            class37.field495 = true;
            this.field281 = false;
            class31.method215();
            int var2 = class37.field493 - (int) (635.0D / this.field285);
            int var3 = (int) (503.0D / this.field285) + class22.field216;
            int var4 = class22.field216 - (int) (503.0D / this.field285);
            int var5 = (int) (635.0D / this.field285) + class37.field493;
            this.method186(var4, var3, 635, var2, var5, 0, 48, 503, 0);
            if (this.field334) {
                this.field257.method15(this.field331, this.field262);
                class31.method217(this.field284 * var2 / class19.field197 + this.field331, this.field336 * var4 / class33.field443 + this.field262, (var5 - var2) * this.field284 / class19.field197, (var3 - var4) * this.field336 / class33.field443, 16711680, 128);
                class31.method214(this.field284 * var2 / class19.field197 + this.field331, this.field336 * var4 / class33.field443 + this.field262, (var5 - var2) * this.field284 / class19.field197, (var3 - var4) * this.field336 / class33.field443, 16711680);
                if (this.field253 > 0 && this.field253 % 10 < 5) {
                    for (int var6 = 0; var6 < class5.field51; var6++) {
                        if (class34.field467.field40[var6] == this.field280) {
                            int var7 = this.field331 + class34.field467.field35[var6] * this.field284 / class19.field197;
                            int var8 = class34.field467.field39[var6] * this.field336 / class33.field443 + this.field262;
                            class31.method212(var7, var8, 2, 16776960, 256);
                        }
                    }
                }
            }
            if (this.field335) {
                this.method178(5592405, 18, (byte) -103, this.field302, this.field321, this.field287, 7829367, this.field258, 10066329);
                this.method178(5592405, this.field317 - 36, (byte) -103, this.field302, class2.field17, this.field287, 7829367, this.field258 + 18, 10066329);
                this.method178(5592405, 18, (byte) -103, this.field302, this.field325, this.field287, 7829367, this.field317 + this.field258 - 18, 10066329);
                int var9 = this.field258 + 18 + 3;
                int var10 = this.field314;
                for (int var11 = 0; var11 < 24; var11++) {
                    if (var10 < class13.field135.length && var10 < this.field311.length) {
                        if (this.field311[var10].method136(27321, class33.field441)) {
                            var11--;
                            var10++;
                            continue;
                        }
                        int var12 = 16777215;
                        class13.field135[var10].method13(this.field287 + 3, var9);
                        this.field313.method58(this.field311[var10], this.field287 + 21, var9 + 14, 0);
                        if (this.field268 == var10) {
                            var12 = 12298922;
                        }
                        if (this.field253 > 0 && this.field253 % 10 < 5 && this.field280 == var10) {
                            var12 = 16776960;
                        }
                        this.field313.method58(this.field311[var10], this.field287 + 20, var9 - -13, var12);
                    }
                    var10++;
                    var9 += 17;
                }
            }
            if (class19.field190.length == 1) {
                this.method178(this.field274, 18, (byte) -103, this.field284, this.field266, this.field331, this.field316, this.field336 + this.field262, this.field318);
                this.method178(this.field274, 18, (byte) -103, this.field302, this.field310, this.field287, this.field316, this.field317 + this.field258, this.field318);
                if (this.field303 == 3.0D) {
                    this.method178(this.field306, this.field270, (byte) -103, this.field319, class35.field468, this.field260, this.field292, this.field328, this.field278);
                } else {
                    this.method178(this.field274, this.field270, (byte) -103, this.field319, class35.field468, this.field260, this.field316, this.field328, this.field318);
                }
                if (this.field303 == 4.0D) {
                    this.method178(this.field306, this.field270, (byte) -103, this.field319, class32.field438, this.field332 + this.field260, this.field292, this.field328, this.field278);
                } else {
                    this.method178(this.field274, this.field270, (byte) -103, this.field319, class32.field438, this.field332 + this.field260, this.field316, this.field328, this.field318);
                }
                if (this.field303 == 6.0D) {
                    this.method178(this.field306, this.field270, (byte) -103, this.field319, class8.field56, this.field332 * 2 + this.field260, this.field292, this.field328, this.field278);
                } else {
                    this.method178(this.field274, this.field270, (byte) -103, this.field319, class8.field56, this.field332 * 2 + this.field260, this.field316, this.field328, this.field318);
                }
                if (this.field303 == 8.0D) {
                    this.method178(this.field306, this.field270, (byte) -103, this.field319, class5.field52, this.field332 * 3 + this.field260, this.field292, this.field328, this.field278);
                } else {
                    this.method178(this.field274, this.field270, (byte) -103, this.field319, class5.field52, this.field260 + this.field332 * 3, this.field316, this.field328, this.field318);
                }
            } else {
                this.method178(this.field274, 18, (byte) -103, this.field284, this.field266, this.field331, this.field316, this.field262 + this.field336, this.field318);
                this.method178(this.field274, 18, (byte) -103, this.field302, this.field310, this.field287, this.field316, this.field258 + this.field317, this.field318);
                this.method187(230, this.field316);
                int var13 = this.field328 + this.field286;
                if (this.field303 == 3.0D) {
                    this.method178(this.field306, this.field270, (byte) -103, this.field319, class35.field468, this.field260, this.field292, var13, this.field278);
                } else {
                    this.method178(this.field274, this.field270, (byte) -103, this.field319, class35.field468, this.field260, this.field316, var13, this.field318);
                }
                if (this.field303 == 4.0D) {
                    this.method178(this.field306, this.field270, (byte) -103, this.field319, class32.field438, this.field332 + this.field260, this.field292, var13, this.field278);
                } else {
                    this.method178(this.field274, this.field270, (byte) -103, this.field319, class32.field438, this.field332 + this.field260, this.field316, var13, this.field318);
                }
                if (this.field303 == 6.0D) {
                    this.method178(this.field306, this.field270, (byte) -103, this.field319, class8.field56, this.field332 * 2 + this.field260, this.field292, var13, this.field278);
                } else {
                    this.method178(this.field274, this.field270, (byte) -103, this.field319, class8.field56, this.field332 * 2 + this.field260, this.field316, var13, this.field318);
                }
                if (this.field303 == 8.0D) {
                    this.method178(this.field306, this.field270, (byte) -103, this.field319, class5.field52, this.field332 * 3 + this.field260, this.field292, var13, this.field278);
                } else {
                    this.method178(this.field274, this.field270, (byte) -103, this.field319, class5.field52, this.field332 * 3 + this.field260, this.field316, var13, this.field318);
                }
            }
            if (class24.field239) {
                this.method178(this.field274, this.field340, (byte) -103, this.field300, this.field309, this.field299, this.field316, this.field305, this.field318);
                if (class14.field152) {
                    class31.method217(this.field299 + this.field300 + 2, this.field305, this.field301 + 10, this.field340, 8925952, 192);
                    class31.method214(this.field299 + this.field300 + 2, this.field305, this.field301 + 10, this.field340, 16777215);
                    if (class28.field368 > -1 && this.field323.method129(true) > 0) {
                        class22 var14 = this.field282[class28.field368].method137(1, 47, 32);
                        int var15 = this.field323.method129(true);
                        if (var15 > var14.method129(true)) {
                            var15 = var14.method129(true);
                        }
                        this.field313.method51(var14, this.field300 + this.field299 + 6, 20, 10066176, true);
                        this.field313.method51(var14.method131(var15, (byte) -75, 0), this.field299 + this.field300 + 6, 20, 16777215, true);
                    } else {
                        this.field313.method51(this.field259, this.field300 + this.field299 + 6, 20, 16776960, true);
                    }
                }
            }
        }
        int var16 = 97 % ((-arg0 - 64) / 34);
        if (class37.field495) {
            this.method183(2);
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "g", descriptor = "(I)V", line = 993)
    private final void method183(int arg0) {
        class37.field495 = false;
        try {
            Graphics var2 = class17.field168.getGraphics();
            class16.field160.method112((byte) 102, 0, 0, var2);
        } catch (Exception var4) {
            class17.field168.repaint();
        }
        if (arg0 != 2) {
            this.method78(-60);
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "h", descriptor = "(I)V", line = 1033)
    private final void method184(int arg0) {
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
        String var5 = ".file_store_32";
        if (arg0 != -30160) {
            return;
        }
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
                        class38.field505 = var8 + var5 + "/rsmap/";
                        return;
                    }
                }
            } catch (Exception var14) {
            }
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "b", descriptor = "(II)V", line = 1103)
    private final void method185(int arg0, int arg1) {
        if (arg1 != 0 || class19.field190.length <= arg0) {
            return;
        }
        class3 var3 = class19.field190[arg0];
        class38 var4 = new class38(var3.method45((byte) -96, class27.field361, class24.field241));
        var4.method247(false);
        class38 var5 = new class38(var3.method45((byte) -26, class21.field211, class24.field241));
        this.field291 = var5.method254(arg1 - 1092048568);
        for (int var6 = 0; var6 < this.field291; var6++) {
            this.field282[var6] = var5.method247(false);
            this.field324[var6] = var5.method254(class12.method64(arg1, -1092048568));
            this.field330[var6] = var5.method254(-1092048568);
            this.field294[var6] = var5.method246(-1);
            class22 var7 = this.field282[var6].method137(1, 47, 32);
            int var8 = this.field313.method59(var7);
            if (this.field301 < var8) {
                this.field301 = var8;
            }
            int var9 = this.field313.method59(this.field259);
            if (this.field301 < var9) {
                this.field301 = var9;
            }
        }
        class34.field467 = new class5();
        class34.field467.method31(0, class19.field190[arg0]);
        class22.field216 = class24.field234;
        this.field336 = 180;
        this.field262 = 483 - this.field336;
        this.field284 = class19.field197 * this.field336 / class33.field443;
        class37.field493 = class3.field25;
        this.field331 = 635 - this.field284 - 5;
        this.field257 = new class4(this.field284, this.field336);
        this.field257.method16();
        this.method186(0, class33.field443, this.field284, 0, class19.field197, 0, -118, this.field336, 0);
        class31.method214(0, 0, this.field284, this.field336, 0);
        class31.method214(1, 1, this.field284 - 2, this.field336 - 2, this.field318);
        class16.field160.method118(0);
    }

    @OriginalMember(owner = "mapview!mapview", name = "d", descriptor = "(I)V", line = 1172)
    public final void method78(int arg0) {
        class25.method170((byte) 113);
        class8.method35(class17.field168, (byte) -74);
        class1.method3(-1, class17.field168);
        class21.field206 = this.field315;
        boolean var2 = false;
        this.field311 = class38.method249((byte) -80);
        this.field308 = class32.method225(true);
        boolean var3 = true;
        if (arg0 <= 90) {
            return;
        }
        if (var3) {
            byte var4 = 0;
            if (this.field308.length == 13) {
                byte var10002 = var4;
                int var5 = var4 + 1;
                this.field266 = this.field308[var10002];
                int var18 = var5;
                int var6 = var5 + 1;
                this.field309 = this.field308[var18];
                int var19 = var6;
                int var7 = var6 + 1;
                this.field310 = this.field308[var19];
                int var20 = var7;
                int var8 = var7 + 1;
                this.field321 = this.field308[var20];
                int var21 = var8;
                int var9 = var8 + 1;
                this.field325 = this.field308[var21];
                int var22 = var9;
                int var10 = var9 + 1;
                this.field315 = this.field308[var22];
                int var23 = var10;
                int var11 = var10 + 1;
                this.field254 = this.field308[var23];
                int var24 = var11;
                int var12 = var11 + 1;
                this.field259 = this.field308[var24];
                int var25 = var12;
                int var13 = var12 + 1;
                this.field339 = this.field308[var25];
                int var26 = var13;
                int var14 = var13 + 1;
                this.field295 = this.field308[var26];
                int var27 = var14;
                int var15 = var14 + 1;
                this.field273 = this.field308[var27];
                int var16 = var15 + 1;
                int var28 = var16;
                int var17 = var16 + 1;
                this.field277 = this.field308[var28];
                this.field293 = this.field266.method153(false, 0);
                this.field252 = this.field309.method153(false, 0);
                this.field326 = this.field310.method153(false, 0);
                this.field333 = this.method173(this.field293, 30);
                this.field255 = this.method173(this.field252, 30);
                this.field312 = this.method173(this.field326, 30);
            } else {
                method180((byte) -39, new class22[] { class37.field491 });
            }
        }
        this.field323 = class8.method38(0, 50);
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(IIIIIIIII)V", line = 1237)
    private final void method186(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class34.field467.method19(arg1, arg8, arg4, arg0, arg5, arg7, arg3, (byte) 99, arg2);
        if (arg4 - arg3 > -arg5 + arg2) {
            return;
        }
        class34.field467.method20(arg3, arg5, arg7, this.field285, arg4, arg2, (byte) 97, arg0, arg1, arg8);
        class34.field467.method21(arg0, (byte) -49, arg7, arg8, arg1, arg4, arg5, arg3, arg2);
        int var10 = -103 / ((arg6 + 33) / 52);
        class34.field467.method27(arg5, false, arg7, this.field253, arg3, this.field280, arg2, arg4, arg1, arg0, arg8);
        if (this.field303 == this.field285 && class1.field6) {
            for (int var11 = 0; var11 < this.field291; var11++) {
                int var12 = this.field324[var11];
                int var13 = var12 - class8.field58;
                int var14 = this.field330[var11];
                int var15 = class30.field423 + class33.field443 - var14;
                int var16 = (var15 - arg0) * (-arg8 + arg7) / (arg1 - arg0) + arg8;
                int var17 = this.field294[var11];
                int var18 = (var13 - arg3) * (-arg5 + arg2) / (arg4 - arg3) + arg5;
                int var19 = 16777215;
                class18 var20 = null;
                if (var17 == 0) {
                    if (this.field285 == 3.0D) {
                        var20 = this.field322;
                    }
                    if (this.field285 == 4.0D) {
                        var20 = this.field256;
                    }
                    if (this.field285 == 6.0D) {
                        var20 = this.field265;
                    }
                    if (this.field285 == 8.0D) {
                        var20 = this.field275;
                    }
                }
                if (var17 == 1) {
                    if (this.field285 == 3.0D) {
                        var20 = this.field265;
                    }
                    if (this.field285 == 4.0D) {
                        var20 = this.field275;
                    }
                    if (this.field285 == 6.0D) {
                        var20 = this.field276;
                    }
                    if (this.field285 == 8.0D) {
                        var20 = this.field320;
                    }
                }
                if (var17 == 2) {
                    if (this.field285 == 3.0D) {
                        var20 = this.field276;
                    }
                    if (this.field285 == 4.0D) {
                        var20 = this.field320;
                    }
                    if (this.field285 == 6.0D) {
                        var20 = this.field296;
                    }
                    var19 = 16755200;
                    if (this.field285 == 8.0D) {
                        var20 = this.field263;
                    }
                }
                if (var20 != null) {
                    class22 var21 = this.field282[var11];
                    int var22 = 1;
                    for (int var23 = 0; var23 < var21.method129(true); var23++) {
                        if (var21.method153(false, var23) == 47) {
                            var22++;
                        }
                    }
                    int var24 = var16 - var20.method102() * (var22 - 1) / 2;
                    int var25 = var24 + var20.method103() / 2;
                    while (true) {
                        int var26 = var21.method145(-117, 47);
                        if (var26 == -1) {
                            var20.method108(var21, var18, var25, var19, true);
                            break;
                        }
                        class22 var27 = var21.method131(var26, (byte) -60, 0);
                        var20.method108(var27, var18, var25, var19, true);
                        var25 += var20.method102();
                        var21 = var21.method133(var26 + 1, false);
                    }
                }
            }
        }
        if (!class28.field367) {
            return;
        }
        for (int var28 = class8.field58 / 64; var28 < (class8.field58 + class19.field197) / 64; var28++) {
            for (int var29 = class30.field423 / 64; var29 < (class33.field443 + class30.field423) / 64; var29++) {
                int var30 = var29 * 64;
                int var31 = class33.field443 + class30.field423 - var30;
                int var32 = var28 * 64;
                int var33 = (var31 - arg0 - 64) * (-arg8 + arg7) / (arg1 - arg0) + arg8;
                int var34 = arg8 + (var31 - arg0) * (-arg8 + arg7) / (arg1 - arg0);
                int var35 = var32 - class8.field58;
                int var36 = (arg2 - arg5) * (-arg3 + var35) / (arg4 - arg3) + arg5;
                int var37 = (var35 + 64 - arg3) * (-arg5 + arg2) / (arg4 - arg3) + arg5;
                class31.method214(var36, var33, var37 - var36, -var33 + var34, 16777215);
                this.field313.method57(method181((byte) 70, new class22[] { class17.method99(0, var28), class37.field487, class17.method99(0, var29) }), var37 - 5, var34 + -5, 16777215);
                if (var28 == 33 && var29 >= 71 && var29 <= 73) {
                    this.field313.method52(class3.field24, (var36 + var37) / 2, (var34 + var33) / 2, 16711680);
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "b", descriptor = "(B)V", line = 1423)
    public final void method71(byte arg0) {
        class27.method201(-85);
        class32.method226((byte) 93);
        try {
            this.field282 = null;
            int var2 = 37 % ((-arg0 - 51) / 38);
            this.field324 = null;
            this.field257 = null;
            this.field313 = null;
            class34.field467 = null;
            this.field294 = null;
            this.field311 = null;
            this.field330 = null;
            System.gc();
        } catch (Throwable var4) {
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "c", descriptor = "(II)V", line = 1458)
    private final void method187(int arg0, int arg1) {
        this.method178(this.field274, 18, (byte) -103, arg0, method181((byte) -73, new class22[] { class16.field158, class33.field447[field341], class30.field427 }), 170, arg1, 483, this.field318);
    }

    @OriginalMember(owner = "mapview!mapview", name = "g", descriptor = "(B)V", line = 1476)
    public static void method188(byte arg0) {
        field288 = null;
        field272 = null;
        field327 = null;
        if (arg0 == 92) {
            field269 = null;
            field267 = null;
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(Ljava/lang/String;[BB)V", line = 1492)
    private final void method189(String arg0, byte[] arg1, byte arg2) throws IOException {
        FileOutputStream var4 = new FileOutputStream(arg0);
        var4.write(arg1, 0, arg1.length);
        if (arg2 <= -27) {
            var4.close();
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "i", descriptor = "(I)V", line = 1513)
    private final void method190(int arg0) {
        if (class19.field190.length == 1) {
            class16.field159 = 0;
        } else {
            if (field341 >= 0) {
                class16.field159 = field341;
            } else {
                class16.field159 = this.method176(true, class16.field159);
            }
            field341 = this.method176(true, class16.field159);
        }
        if (arg0 != 0) {
            this.field261 = -60;
        }
        this.method185(class16.field159, arg0 ^ 0x0);
    }

    @OriginalMember(owner = "mapview!mapview", name = "c", descriptor = "(I)V", line = 1577)
    public final void method73(int arg0) {
        if (class23.field230) {
            class29.method204(class17.field168, 124);
            class21.method126(class17.field168, 63);
            this.method75((byte) -72);
            class8.method35(class17.field168, (byte) -74);
            class1.method3(-1, class17.field168);
        }
        class2.method6(arg0 ^ 0xFFFFFF09);
        class22.method150(arg0 ^ arg0);
        if (!class17.field173) {
            return;
        }
        if (class33.field452[96]) {
            this.field281 = true;
            class1.field2 = -1;
            class37.field493 = (int) ((double) class37.field493 - 16.0D / this.field285);
        }
        if (class33.field452[97]) {
            class37.field493 = (int) (16.0D / this.field285 + (double) class37.field493);
            class1.field2 = -1;
            this.field281 = true;
        }
        if (class33.field452[98]) {
            this.field281 = true;
            class22.field216 = (int) ((double) class22.field216 - 16.0D / this.field285);
            class1.field2 = -1;
        }
        if (class33.field452[99]) {
            class22.field216 = (int) (16.0D / this.field285 + (double) class22.field216);
            class1.field2 = -1;
            this.field281 = true;
        }
        while (true) {
            while (true) {
                while (true) {
                    while (class32.method227((byte) -65)) {
                        if (!class24.field239 || !class14.field152) {
                            if (class17.field169 == this.field255 || class17.field169 == this.field252) {
                                class14.field152 = true;
                                this.field281 = true;
                            }
                            if (class17.field169 == 49) {
                                this.field281 = true;
                                this.field303 = 3.0D;
                            }
                            if (class17.field169 == 50) {
                                this.field281 = true;
                                this.field303 = 4.0D;
                            }
                            if (class17.field169 == 51) {
                                this.field281 = true;
                                this.field303 = 6.0D;
                            }
                            if (class17.field169 == 52) {
                                this.field303 = 8.0D;
                                this.field281 = true;
                            }
                            if (class17.field169 == this.field312 || class17.field169 == this.field326) {
                                this.field281 = true;
                                this.field335 = !this.field335;
                            }
                            if (class17.field169 == this.field333 || class17.field169 == this.field293) {
                                this.field281 = true;
                                this.field334 = !this.field334;
                            }
                        } else if (class38.field509 == 0) {
                            this.field281 = true;
                            class14.field152 = false;
                            this.field323.method139(0, 104);
                            class28.field368 = -1;
                        } else if (class38.field509 == 84) {
                            class1.field2 = class28.field368;
                            class14.field152 = false;
                            this.field338 = class22.field216 << 16;
                            this.field298 = class37.field493 << 16;
                            this.field323.method139(0, 71);
                            class28.field368 = -1;
                            this.field281 = true;
                        } else {
                            boolean var2 = false;
                            if (class38.field509 == 85) {
                                if (this.field323.method129(true) > 0) {
                                    this.field323.method139(this.field323.method129(true) - 1, 121);
                                    this.field281 = true;
                                    if (this.field323.method129(true) == 0) {
                                        class28.field368 = -1;
                                    } else {
                                        var2 = true;
                                    }
                                }
                            } else if (class17.field169 != -1 && this.field323.method129(true) <= class30.field420) {
                                this.field323.method146(class17.field169, (byte) -117);
                                this.field281 = true;
                            }
                            if (this.field323.method129(true) > 0) {
                                for (int var3 = 0; var3 < this.field291; var3++) {
                                    if (this.field282[var3].method129(true) >= this.field323.method129(true)) {
                                        class22 var4 = this.field323.method152(0);
                                        class22 var5 = this.field282[var3].method137(1, 47, 32).method131(this.field323.method129(true), (byte) -113, 0).method152(arg0 - 246);
                                        if (var4.method141(var5, -621) == 0) {
                                            class28.field368 = var3;
                                            this.field281 = true;
                                            var2 = true;
                                            break;
                                        }
                                    }
                                }
                                if (!var2) {
                                    this.field323.method139(this.field323.method129(true) - 1, 85);
                                }
                            }
                        }
                    }
                    int var6 = class29.field409;
                    int var7 = class2.field9;
                    int var8 = class3.field21;
                    int var9 = class19.field181;
                    int var10 = class3.field28;
                    int var11 = class19.field186;
                    if (var7 == 1) {
                        this.field289 = class22.field216;
                        this.field297 = class37.field493;
                        this.field304 = var6;
                        this.field329 = var9;
                        if (class19.field190.length == 1) {
                            if (this.field260 < var6 && this.field260 + this.field319 > var6 && var9 > this.field328 && var9 < this.field328 + this.field270) {
                                this.field303 = 3.0D;
                                this.field304 = -1;
                            }
                            if (var6 > this.field332 + this.field260 && this.field332 + this.field319 + this.field260 > var6 && var9 > this.field328 && this.field328 + this.field270 > var9) {
                                this.field304 = -1;
                                this.field303 = 4.0D;
                            }
                            if (this.field332 * 2 + this.field260 < var6 && var6 < this.field332 * 2 + this.field319 + this.field260 && this.field328 < var9 && var9 < this.field328 + this.field270) {
                                this.field303 = 6.0D;
                                this.field304 = -1;
                            }
                            if (this.field332 * 3 + this.field260 < var6 && var6 < this.field332 * 3 + this.field260 + this.field319 && this.field328 < var9 && this.field328 + this.field270 > var9) {
                                this.field303 = 8.0D;
                                this.field304 = -1;
                            }
                        } else {
                            if (this.field260 < var6 && var6 < this.field319 + this.field260 && var9 > this.field328 && var9 < this.field328 + this.field270 + this.field286) {
                                this.field303 = 3.0D;
                                this.field304 = -1;
                            }
                            if (this.field260 + this.field332 < var6 && this.field332 + this.field260 + this.field319 > var6 && this.field328 < var9 && var9 < this.field328 + this.field270 + this.field286) {
                                this.field303 = 4.0D;
                                this.field304 = -1;
                            }
                            if (this.field332 * 2 + this.field260 < var6 && this.field332 * 2 + this.field260 + this.field319 > var6 && this.field328 < var9 && this.field328 + this.field270 + this.field286 > var9) {
                                this.field303 = 6.0D;
                                this.field304 = -1;
                            }
                            if (var6 > this.field332 * 3 + this.field260 && this.field332 * 3 + this.field319 + this.field260 > var6 && this.field328 < var9 && var9 < this.field328 + this.field270 + this.field286) {
                                this.field304 = -1;
                                this.field303 = 8.0D;
                            }
                            if (var6 > 170 && var6 < 400 && var9 > 483 && var9 < 503) {
                                this.method187(230, this.field292);
                                this.method183(2);
                                this.method190(0);
                                this.field304 = -1;
                            }
                        }
                        this.field281 = true;
                        if (var6 > this.field287 && this.field258 + this.field317 < var9 && var6 < this.field302 + this.field287 && var9 < 503) {
                            this.field335 = !this.field335;
                            this.field304 = -1;
                        }
                        if (var6 > this.field331 && this.field336 + this.field262 < var9 && this.field331 + this.field284 > var6 && var9 < 503) {
                            this.field334 = !this.field334;
                            this.field304 = -1;
                        }
                        this.field307 = false;
                        if (this.field335) {
                            if (this.field287 < var6 && this.field258 < var9 && var6 < this.field302 + this.field287 && this.field258 + 18 > var9 && this.field283 > 0) {
                                this.field283 -= 24;
                            }
                            if (var6 > this.field287 && var9 > this.field258 + this.field317 - 18 && var6 < this.field302 + this.field287 && var9 < this.field317 + this.field258 && this.field283 < 48) {
                                this.field283 += 24;
                            }
                            if (this.field287 < var6 && var9 > this.field258 && var6 < this.field302 + this.field287 && this.field317 + this.field258 > var9) {
                                this.field304 = -1;
                            }
                        }
                        if (this.field334 && this.field331 < var6 && this.field262 < var9 && var6 < this.field331 + this.field284 && this.field336 + this.field262 > var9) {
                            class22.field216 = (var9 - this.field262) * class33.field443 / this.field336;
                            this.field307 = true;
                            this.field304 = -1;
                            class37.field493 = (var6 - this.field331) * class19.field197 / this.field284;
                        }
                        if (class24.field239 && !class14.field152 && !this.field307 && this.field299 < var6 && this.field305 < var9 && this.field300 + this.field299 > var6 && var9 < this.field340 + this.field305) {
                            class14.field152 = true;
                        }
                    }
                    if (this.field335) {
                        this.field268 = -1;
                        if (var11 > this.field287 && var11 < this.field287 + this.field302) {
                            int var12 = this.field314;
                            int var13 = this.field258 + 21 + 5;
                            for (int var14 = 0; var14 < 24; var14++) {
                                if (var12 < this.field311.length && this.field311[var12].method136(27321, class33.field441)) {
                                    var14--;
                                    var12++;
                                } else {
                                    if (var13 <= var10 && var10 < var13 + 17) {
                                        if (var7 == 1) {
                                            this.field253 = 50;
                                            this.field280 = var12;
                                        }
                                        this.field268 = var12;
                                    }
                                    var12++;
                                    var13 += 17;
                                }
                            }
                        }
                        if (this.field290 != this.field268) {
                            this.field281 = true;
                            this.field290 = this.field268;
                        }
                    }
                    if (var8 == 1 && this.field334 && this.field307) {
                        this.field281 = true;
                        int var15 = var11;
                        class1.field2 = -1;
                        if (var11 < this.field331) {
                            var15 = this.field331;
                        } else if (this.field331 + this.field284 < var11) {
                            var15 = this.field331 + this.field284;
                        }
                        int var16 = var10;
                        class37.field493 = (var15 - this.field331) * class19.field197 / this.field284;
                        if (var10 < this.field262) {
                            var16 = this.field262;
                        } else if (this.field262 + this.field336 < var10) {
                            var16 = this.field262 + this.field336;
                        }
                        class22.field216 = (var16 - this.field262) * class33.field443 / this.field336;
                    } else {
                        this.field307 = false;
                    }
                    if (var8 == 1 && this.field304 != -1) {
                        class1.field2 = -1;
                        this.field281 = true;
                        class22.field216 = (int) ((double) (this.field329 - var10) * 2.0D / this.field303) + this.field289;
                        class37.field493 = this.field297 + (int) ((double) (this.field304 - var11) * 2.0D / this.field303);
                    }
                    if (this.field303 > this.field285) {
                        this.field285 += this.field285 / 30.0D;
                        if (this.field303 < this.field285) {
                            this.field285 = this.field303;
                        }
                        this.field281 = true;
                    }
                    if (this.field285 > this.field303) {
                        this.field281 = true;
                        this.field285 -= this.field285 / 30.0D;
                        if (this.field303 > this.field285) {
                            this.field285 = this.field303;
                        }
                    }
                    if (this.field283 > this.field314) {
                        this.field314++;
                        this.field281 = true;
                    }
                    if (this.field314 > this.field283) {
                        this.field314--;
                        this.field281 = true;
                    }
                    if (this.field253 > 0) {
                        this.field253--;
                        this.field281 = true;
                    }
                    if (class1.field2 >= 0) {
                        class29.field385 = this.field324[class1.field2] - class8.field58;
                        byte var17 = 4;
                        int var18 = class29.field385 - (int) (635.0D / this.field285);
                        class24.field236 = class30.field423 + class33.field443 - this.field330[class1.field2];
                        int var19 = (int) (635.0D / this.field285) + class29.field385;
                        this.field281 = true;
                        int var20 = class24.field236 + (int) (503.0D / this.field285);
                        if (var18 < 48) {
                            class29.field385 = (int) (635.0D / this.field285) + 48;
                        }
                        int var21 = class24.field236 - (int) (503.0D / this.field285);
                        if (var19 > class19.field197 - 48) {
                            class29.field385 = class19.field197 - (int) (635.0D / this.field285) - 48;
                        }
                        if (var21 < 48) {
                            class24.field236 = (int) (503.0D / this.field285) + 48;
                        }
                        class29.field385 <<= 0x10;
                        if (var20 > class33.field443 - 48) {
                            class24.field236 = class33.field443 - (int) (503.0D / this.field285) - 48;
                        }
                        class24.field236 <<= 0x10;
                        int var22 = class24.field236 - this.field338;
                        int var23 = class29.field385 - this.field298;
                        if (var23 >> var17 == 0 && var22 >> var17 == 0) {
                            class1.field2 = -1;
                        } else {
                            this.field338 += var22 >> var17;
                            this.field298 += var23 >> var17;
                            class37.field493 = this.field298 >> 16;
                            class22.field216 = this.field338 >> 16;
                        }
                    }
                    int var24 = class37.field493 - (int) (635.0D / this.field285);
                    int var25 = class22.field216 - (int) (503.0D / this.field285);
                    int var26 = class37.field493 + (int) (635.0D / this.field285);
                    if (var24 < 48) {
                        class37.field493 = (int) (635.0D / this.field285) + 48;
                    }
                    int var27 = (int) (503.0D / this.field285) + class22.field216;
                    if (var25 < 48) {
                        class22.field216 = (int) (503.0D / this.field285) + 48;
                    }
                    if (class19.field197 - 48 < var26) {
                        class37.field493 = class19.field197 - (int) (635.0D / this.field285) - 48;
                    }
                    if (class33.field443 - 48 < var27) {
                        class22.field216 = class33.field443 - (int) (503.0D / this.field285) - 48;
                    }
                    return;
                }
            }
        }
    }
}
