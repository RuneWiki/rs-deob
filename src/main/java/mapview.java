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
public class mapview extends class27 {

    @OriginalMember(owner = "mapview!mapview", name = "l", descriptor = "Z")
    private boolean field245 = false;

    @OriginalMember(owner = "mapview!mapview", name = "u", descriptor = "I")
    private int field254 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "z", descriptor = "I")
    private int field259 = 450;

    @OriginalMember(owner = "mapview!mapview", name = "s", descriptor = "D")
    private double field252 = 4.0D;

    @OriginalMember(owner = "mapview!mapview", name = "R", descriptor = "I")
    private int field277 = 5;

    @OriginalMember(owner = "mapview!mapview", name = "I", descriptor = "I")
    private int field268 = 500;

    @OriginalMember(owner = "mapview!mapview", name = "eb", descriptor = "I")
    private int field290 = 10027008;

    @OriginalMember(owner = "mapview!mapview", name = "G", descriptor = "[I")
    private int[] field266 = new int[this.field268];

    @OriginalMember(owner = "mapview!mapview", name = "B", descriptor = "D")
    private double field261 = 4.0D;

    @OriginalMember(owner = "mapview!mapview", name = "fb", descriptor = "I")
    private int field291 = -20;

    @OriginalMember(owner = "mapview!mapview", name = "bb", descriptor = "I")
    private int field287 = 50;

    @OriginalMember(owner = "mapview!mapview", name = "w", descriptor = "I")
    private int field256 = 8912896;

    @OriginalMember(owner = "mapview!mapview", name = "V", descriptor = "I")
    private int field281 = 8943445;

    @OriginalMember(owner = "mapview!mapview", name = "Q", descriptor = "I")
    private int field276 = 471;

    @OriginalMember(owner = "mapview!mapview", name = "W", descriptor = "I")
    private int field282 = 5;

    @OriginalMember(owner = "mapview!mapview", name = "K", descriptor = "I")
    private int field270 = -1;

    @OriginalMember(owner = "mapview!mapview", name = "kb", descriptor = "I")
    private int field296 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "ub", descriptor = "I")
    private int field306 = 11141120;

    @OriginalMember(owner = "mapview!mapview", name = "S", descriptor = "I")
    private int field278 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "X", descriptor = "I")
    private int field283 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "sb", descriptor = "I")
    private int field304 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "v", descriptor = "Z")
    private boolean field255 = true;

    @OriginalMember(owner = "mapview!mapview", name = "o", descriptor = "I")
    private int field248 = 140;

    @OriginalMember(owner = "mapview!mapview", name = "U", descriptor = "I")
    private int field280 = 7824964;

    @OriginalMember(owner = "mapview!mapview", name = "Ab", descriptor = "I")
    private int field312 = 33;

    @OriginalMember(owner = "mapview!mapview", name = "A", descriptor = "I")
    private int field260 = 170;

    @OriginalMember(owner = "mapview!mapview", name = "xb", descriptor = "[I")
    private int[] field309 = new int[this.field268];

    @OriginalMember(owner = "mapview!mapview", name = "Bb", descriptor = "I")
    private int field313 = 6706483;

    @OriginalMember(owner = "mapview!mapview", name = "zb", descriptor = "I")
    private int field311 = -1;

    @OriginalMember(owner = "mapview!mapview", name = "Ob", descriptor = "I")
    private int field326 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "Jb", descriptor = "[I")
    private int[] field321 = new int[this.field268];

    @OriginalMember(owner = "mapview!mapview", name = "Fb", descriptor = "I")
    private int field317 = 30;

    @OriginalMember(owner = "mapview!mapview", name = "rb", descriptor = "I")
    private int field303 = 23;

    @OriginalMember(owner = "mapview!mapview", name = "Ib", descriptor = "I")
    private int field320 = 5;

    @OriginalMember(owner = "mapview!mapview", name = "mb", descriptor = "Z")
    private boolean field298 = false;

    @OriginalMember(owner = "mapview!mapview", name = "Z", descriptor = "I")
    private int field285 = 10;

    @OriginalMember(owner = "mapview!mapview", name = "yb", descriptor = "Z")
    private boolean field310 = false;

    @OriginalMember(owner = "mapview!mapview", name = "Kb", descriptor = "I")
    private int field322 = 40;

    @OriginalMember(owner = "mapview!mapview", name = "tb", descriptor = "I")
    private int field305 = this.field287 + this.field285;

    @OriginalMember(owner = "mapview!mapview", name = "lb", descriptor = "Z")
    private boolean field297 = false;

    @OriginalMember(owner = "mapview!mapview", name = "N", descriptor = "Lw;")
    private class38 field273 = this.field297 ? class26.field361 : class26.field361;

    @OriginalMember(owner = "mapview!mapview", name = "Cb", descriptor = "I")
    private int field314 = this.field297 ? 115 : 102;

    @OriginalMember(owner = "mapview!mapview", name = "t", descriptor = "Lw;")
    private class38 field253 = this.field297 ? class12.field102 : class3.field13;

    @OriginalMember(owner = "mapview!mapview", name = "Pb", descriptor = "Lw;")
    private class38 field327 = this.field297 ? class27.field379 : class27.field379;

    @OriginalMember(owner = "mapview!mapview", name = "ab", descriptor = "Lw;")
    private class38 field286 = this.field297 ? class6.field47 : class6.field47;

    @OriginalMember(owner = "mapview!mapview", name = "q", descriptor = "Lw;")
    private class38 field250 = this.field297 ? class10.field79 : class18.field179;

    @OriginalMember(owner = "mapview!mapview", name = "Mb", descriptor = "I")
    private int field324 = -1;

    @OriginalMember(owner = "mapview!mapview", name = "Qb", descriptor = "I")
    private int field328 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "cb", descriptor = "Lw;")
    private class38 field288 = this.field297 ? class34.field426 : class34.field426;

    @OriginalMember(owner = "mapview!mapview", name = "Gb", descriptor = "I")
    private int field318 = this.field297 ? 83 : 70;

    @OriginalMember(owner = "mapview!mapview", name = "D", descriptor = "I")
    private int field263 = this.field297 ? 76 : 75;

    @OriginalMember(owner = "mapview!mapview", name = "Lb", descriptor = "I")
    private int field323 = this.field297 ? 220 : 79;

    @OriginalMember(owner = "mapview!mapview", name = "qb", descriptor = "I")
    private int field302 = this.field297 ? 252 : 111;

    @OriginalMember(owner = "mapview!mapview", name = "O", descriptor = "I")
    private int field274 = this.field297 ? 108 : 107;

    @OriginalMember(owner = "mapview!mapview", name = "Hb", descriptor = "Lw;")
    private class38 field319 = this.field297 ? class10.field90 : class10.field90;

    @OriginalMember(owner = "mapview!mapview", name = "Ub", descriptor = "I")
    private int field332 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "Db", descriptor = "Lw;")
    private class38 field315 = this.field297 ? class27.field383 : class27.field383;

    @OriginalMember(owner = "mapview!mapview", name = "Tb", descriptor = "[Lw;")
    private class38[] field331 = new class38[this.field268];

    @OriginalMember(owner = "mapview!mapview", name = "C", descriptor = "Lw;")
    private class38 field262 = this.field297 ? class34.field430 : class9.field68;

    @OriginalMember(owner = "mapview!mapview", name = "M", descriptor = "Lw;")
    private class38 field272 = this.field297 ? class16.field152 : class16.field152;

    @OriginalMember(owner = "mapview!mapview", name = "Y", descriptor = "Lw;")
    private class38 field284 = this.field297 ? class27.field382 : class27.field382;

    @OriginalMember(owner = "mapview!mapview", name = "hb", descriptor = "Lw;")
    private class38 field293 = this.field297 ? class12.field103 : class12.field103;

    @OriginalMember(owner = "mapview!mapview", name = "T", descriptor = "Lw;")
    public static class38 field279 = class35.method219("Transportation", true);

    @OriginalMember(owner = "mapview!mapview", name = "n", descriptor = "Z")
    private static boolean field247 = true;

    @OriginalMember(owner = "mapview!mapview", name = "db", descriptor = "Z")
    public static boolean field289 = false;

    @OriginalMember(owner = "mapview!mapview", name = "x", descriptor = "I")
    public static int field257;

    @OriginalMember(owner = "mapview!mapview", name = "E", descriptor = "I")
    public static int field264;

    @OriginalMember(owner = "mapview!mapview", name = "F", descriptor = "I")
    private int field265;

    @OriginalMember(owner = "mapview!mapview", name = "J", descriptor = "I")
    private int field269;

    @OriginalMember(owner = "mapview!mapview", name = "L", descriptor = "I")
    private int field271;

    @OriginalMember(owner = "mapview!mapview", name = "P", descriptor = "I")
    private int field275;

    @OriginalMember(owner = "mapview!mapview", name = "nb", descriptor = "I")
    private int field299;

    @OriginalMember(owner = "mapview!mapview", name = "pb", descriptor = "I")
    private int field301;

    @OriginalMember(owner = "mapview!mapview", name = "Nb", descriptor = "I")
    private int field325;

    @OriginalMember(owner = "mapview!mapview", name = "Sb", descriptor = "I")
    private int field330;

    @OriginalMember(owner = "mapview!mapview", name = "H", descriptor = "Lja;")
    private class17 field267;

    @OriginalMember(owner = "mapview!mapview", name = "m", descriptor = "Lpa;")
    private class29 field246;

    @OriginalMember(owner = "mapview!mapview", name = "y", descriptor = "Lpa;")
    private class29 field258;

    @OriginalMember(owner = "mapview!mapview", name = "ib", descriptor = "Lpa;")
    private class29 field294;

    @OriginalMember(owner = "mapview!mapview", name = "jb", descriptor = "Lpa;")
    private class29 field295;

    @OriginalMember(owner = "mapview!mapview", name = "ob", descriptor = "Lpa;")
    private class29 field300;

    @OriginalMember(owner = "mapview!mapview", name = "wb", descriptor = "Lpa;")
    private class29 field308;

    @OriginalMember(owner = "mapview!mapview", name = "Eb", descriptor = "Lpa;")
    private class29 field316;

    @OriginalMember(owner = "mapview!mapview", name = "Rb", descriptor = "Lpa;")
    private class29 field329;

    @OriginalMember(owner = "mapview!mapview", name = "r", descriptor = "Lw;")
    private class38 field251;

    @OriginalMember(owner = "mapview!mapview", name = "gb", descriptor = "Ld;")
    private class7 field292;

    @OriginalMember(owner = "mapview!mapview", name = "Vb", descriptor = "Z")
    public static boolean field333;

    @OriginalMember(owner = "mapview!mapview", name = "p", descriptor = "[Lw;")
    private class38[] field249;

    @OriginalMember(owner = "mapview!mapview", name = "vb", descriptor = "[Lw;")
    private class38[] field307;

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(IB)I", line = 9)
    private final int method134(int arg0, byte arg1) {
        int var3 = -58 / ((-arg1 - 62) / 61);
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
            return class36.method225(true, arg0);
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(BLjava/lang/String;)[B", line = 68)
    private final byte[] method135(byte arg0, String arg1) throws IOException {
        File var3 = new File(arg1);
        if (!var3.exists()) {
            return null;
        } else if (arg0 == -116) {
            int var4 = (int) var3.length();
            byte[] var5 = new byte[var4];
            DataInputStream var6 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg1)));
            var6.readFully(var5, 0, var4);
            var6.close();
            return var5;
        } else {
            return (byte[]) null;
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "c", descriptor = "(B)V", line = 107)
    public final void method136(byte arg0) {
        boolean var2 = false;
        class19.method117((byte) -55);
        class35.method218(class31.field397, 500743334);
        class4.method14(class31.field397, (byte) -105);
        class38.field509 = this.field319;
        boolean var3 = true;
        this.field307 = class5.method21(0);
        this.field249 = class34.method205(9);
        int var4 = -85 % ((17 - arg0) / 58);
        if (var3) {
            byte var5 = 0;
            if (this.field249.length == 13) {
                byte var10002 = var5;
                int var6 = var5 + 1;
                this.field253 = this.field249[var10002];
                int var19 = var6;
                int var7 = var6 + 1;
                this.field250 = this.field249[var19];
                int var20 = var7;
                int var8 = var7 + 1;
                this.field262 = this.field249[var20];
                int var21 = var8;
                int var9 = var8 + 1;
                this.field284 = this.field249[var21];
                int var22 = var9;
                int var10 = var9 + 1;
                this.field293 = this.field249[var22];
                int var23 = var10;
                int var11 = var10 + 1;
                this.field319 = this.field249[var23];
                int var24 = var11;
                int var12 = var11 + 1;
                this.field327 = this.field249[var24];
                int var25 = var12;
                int var13 = var12 + 1;
                this.field288 = this.field249[var25];
                int var26 = var13;
                int var14 = var13 + 1;
                this.field272 = this.field249[var26];
                int var27 = var14;
                int var15 = var14 + 1;
                this.field273 = this.field249[var27];
                int var28 = var15;
                int var16 = var15 + 1;
                this.field315 = this.field249[var28];
                int var17 = var16 + 1;
                int var29 = var17;
                int var18 = var17 + 1;
                this.field286 = this.field249[var29];
                this.field323 = this.field253.method237(0, (byte) -99);
                this.field318 = this.field250.method237(0, (byte) -99);
                this.field263 = this.field262.method237(0, (byte) -99);
                this.field302 = this.method134(this.field323, (byte) 90);
                this.field314 = this.method134(this.field318, (byte) -128);
                this.field274 = this.method134(this.field263, (byte) 124);
            } else {
                class5.method19(100, new class38[] { class1.field2 });
            }
        }
        this.field251 = class33.method199(50, (byte) -59);
    }

    @OriginalMember(owner = "mapview!mapview", name = "h", descriptor = "(I)V", line = 179)
    public static final void method137(int arg0) {
        if (arg0 != -6519) {
            method154(-9);
        }
        if (class18.field180[0][class9.field70][class34.field436] == null) {
            class27.field378 = null;
        } else {
            class27.field378 = class18.field180[0][class9.field70][class34.field436];
        }
        if (class18.field180[1][class9.field70][class34.field436] == null) {
            class1.field11 = null;
        } else {
            class1.field11 = class18.field180[1][class9.field70][class34.field436];
        }
        if (class18.field180[2][class9.field70][class34.field436] == null) {
            class12.field107 = null;
        } else {
            class12.field107 = class18.field180[2][class9.field70][class34.field436];
        }
        if (class18.field180[3][class9.field70][class34.field436] == null) {
            class23.field241 = null;
        } else {
            class23.field241 = class18.field180[3][class9.field70][class34.field436];
        }
        if (class18.field180[4][class9.field70][class34.field436] == null) {
            class35.field475 = null;
        } else {
            class35.field475 = class18.field180[4][class9.field70][class34.field436];
        }
        if (class3.field16[class9.field70][class34.field436] == null) {
            class10.field78 = null;
        } else {
            class10.field78 = class3.field16[class9.field70][class34.field436];
        }
        if (class33.field420[class9.field70][class34.field436] == null) {
            class5.field34 = null;
        } else {
            class5.field34 = class33.field420[class9.field70][class34.field436];
        }
        if (class6.field40[class9.field70][class34.field436] == null) {
            class31.field396 = null;
        } else {
            class31.field396 = class6.field40[class9.field70][class34.field436];
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(Lw;IIIIIIBI)V", line = 236)
    private final void method138(class38 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7, int arg8) {
        class15.method84(arg4, arg1, arg8, arg5, 0);
        int var11 = arg4 + 1;
        int var10 = arg1 + 1;
        int var12 = arg5 - 2;
        int var13 = arg8 - 2;
        class15.method80(var11, var10, var13, var12, arg2);
        class15.method81(var11, var10, var13, arg3);
        class15.method82(var11, var10, var12, arg3);
        class15.method81(var11, var10 + var12 - 1, var13, arg6);
        class15.method82(var11 + var13 - 1, var10, var12, arg6);
        if (arg7 != -16) {
            this.method149(-116, 113, -57, 50, 83, 84, -107, 30, -58);
        }
        this.field267.method95(arg0, var13 / 2 + var11 + 1, var12 / 2 + var10 + 4 + 1, 0);
        this.field267.method95(arg0, var13 / 2 + var11, var12 / 2 + var10 + 4, 16777215);
    }

    @OriginalMember(owner = "mapview!mapview", name = "b", descriptor = "(Z)V", line = 264)
    private final void method139(boolean arg0) {
        if (arg0) {
            this.field266 = null;
        }
        if (class18.field184.length == 1) {
            class19.field200 = 0;
        } else {
            if (class18.field182 >= 0) {
                class19.field200 = class18.field182;
            } else {
                class19.field200 = this.method156((byte) -117, class19.field200);
            }
            class18.field182 = this.method156((byte) -117, class19.field200);
        }
        this.method155(class19.field200, false);
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(ILw;Ljava/lang/String;)Z", line = 294)
    private final boolean method140(int arg0, class38 arg1, String arg2) {
        try {
            if (class25.field357 == null) {
                class38.field509 = class9.method43(new class38[] { this.field272, class16.field150, arg1 }, 18589);
                String var4;
                if (arg2 == "main_file_cache.dat0") {
                    var4 = "worldmap.main.js5?crc=-439524705";
                } else if (arg2 == "main_file_cache.dat1") {
                    var4 = "worldmap.dungeon.js5?crc=-1549589001";
                } else if (arg2 == "main_file_cache.dat2") {
                    var4 = "worldmap.extra.js5?crc=-1106367788";
                } else {
                    var4 = "mapview.sprites.js5?crc=-1203441070";
                }
                int var5;
                if (arg2 == "main_file_cache.dat0") {
                    var5 = 414224;
                } else if (arg2 == "main_file_cache.dat1") {
                    var5 = 149016;
                } else if (arg2 == "main_file_cache.dat2") {
                    var5 = 121769;
                } else {
                    var5 = 8383;
                }
                class25.field357 = new DataInputStream((new URL(this.getCodeBase(), var4)).openStream());
                class12.field105 = new byte[var5];
                class10.field83 = 0;
                class3.field17 = 0;
            }
            int var6 = class12.field105.length;
            int var7 = class10.field83;
            if (var7 >= var6) {
                if (arg0 != 503) {
                    this.field299 = -95;
                }
                class25.field357.close();
                class25.field357 = null;
                if (!this.method144(20, arg2, class12.field105)) {
                    this.method166(false, "download");
                    class12.field105 = null;
                }
                return true;
            }
            class3.field17++;
            if (class3.field17 >= 1500) {
                throw new IOException();
            }
            DataInputStream var8 = class25.field357;
            int var9 = var8.available();
            if (var9 < 0) {
                throw new EOFException();
            } else if (var9 == 0) {
                return false;
            } else {
                if (var9 > var6 - var7) {
                    var9 = var6 - var7;
                }
                int var10 = var8.read(class12.field105, var7, var9);
                if (var10 < 0) {
                    throw new EOFException();
                } else if (var10 == 0) {
                    return false;
                } else {
                    int var11 = var7 + var10;
                    int var12 = var11 * 100 / var6;
                    class3.field17 = 0;
                    class38.field509 = class9.method43(new class38[] { this.field286, class16.field150, arg1, class8.field63, class18.method99(var12, arg0 ^ 0xFFFFFE6F), class4.field25 }, 18589);
                    class10.field83 = var11;
                    return false;
                }
            }
        } catch (IOException var16) {
            try {
                class25.field357.close();
            } catch (Exception var15) {
            }
            class12.field105 = null;
            class25.field357 = null;
            this.method166(false, new String("download"));
            return true;
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "b", descriptor = "(ILw;Ljava/lang/String;)Z", line = 419)
    private final boolean method141(int arg0, class38 arg1, String arg2) {
        byte[] var4 = null;
        if (!class5.field35) {
            if (class23.field243 != null) {
                try {
                    var4 = this.method135((byte) -116, class23.field243 + "/" + arg2);
                    if (!this.method144(arg0 ^ 0x3E, arg2, var4)) {
                        var4 = null;
                    }
                    if (var4 != null) {
                        class36.field492 = new class3(var4, false, true);
                        return true;
                    }
                } catch (IOException var11) {
                    var4 = null;
                }
            }
            class5.field35 = true;
        }
        if (arg0 != 42) {
            return false;
        }
        if (var4 == null) {
            boolean var6 = this.method140(503, arg1, arg2);
            if (!var6) {
                return false;
            }
            var4 = class12.field105;
            class12.field105 = null;
        }
        if (var4 == null) {
            class5.field35 = false;
            return true;
        }
        if (class23.field243 != null && var4 != null) {
            try {
                this.method153(var4, class23.field243 + "/" + arg2, -33);
            } catch (IOException var10) {
            }
        }
        try {
            class36.field492 = new class3(var4, false, true);
            class5.field35 = false;
            return true;
        } catch (IOException var9) {
            throw class3.method12(var9, "monkey feet");
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "e", descriptor = "(I)V", line = 487)
    public final void method142(int arg0) {
        method154(2);
        class25.method161((byte) -71);
        class38.method233(15339);
        class33.method198((byte) 98);
        class19.method115(-5207);
        class18.method108(82);
        class27.method173(true);
        class23.method131(0);
        class24.method158(255);
        class3.method7(0);
        class35.method223(-1);
        class17.method98();
        class29.method182();
        class37.method227(-12414);
        class6.method26((byte) -23);
        class13.method55(100);
        class16.method86(arg0 ^ 0x69);
        class15.method74();
        class36.method224(-4803);
        class12.method51(false);
        class1.method2((byte) 124);
        class10.method47((byte) 122);
        class26.method163((byte) -92);
        class8.method35((byte) 15);
        class11.method50((byte) 125);
        class5.method20(-5001);
        class4.method17(-65);
        class31.method192(34);
        class9.method38((byte) 109);
        class32.method195(-124);
        class14.method71();
        class34.method202(7514);
        this.field309 = null;
        this.field295 = null;
        if (arg0 != 20) {
            this.field259 = 64;
        }
        this.field249 = null;
        this.field284 = null;
        this.field273 = null;
        this.field316 = null;
        this.field266 = null;
        this.field253 = null;
        this.field327 = null;
        this.field321 = null;
        this.field262 = null;
        this.field300 = null;
        this.field331 = null;
        this.field258 = null;
        this.field286 = null;
        this.field308 = null;
        this.field288 = null;
        this.field246 = null;
        this.field251 = null;
        this.field307 = null;
        this.field315 = null;
        this.field250 = null;
        this.field293 = null;
        this.field294 = null;
        this.field319 = null;
        this.field267 = null;
        this.field292 = null;
        this.field272 = null;
        this.field329 = null;
    }

    @OriginalMember(owner = "mapview!mapview", name = "e", descriptor = "(B)V", line = 558)
    public final void method143(byte arg0) {
        if (class35.field470) {
            class1.method4((byte) 116, class31.field397);
            class37.method231(class31.field397, 8255);
            this.method174(1);
            class35.method218(class31.field397, 500743334);
            class4.method14(class31.field397, (byte) -105);
        }
        class1.method3(-115);
        class10.method49((byte) -95);
        if (!class35.field479) {
            return;
        }
        if (class26.field372[96]) {
            class35.field477 = (int) ((double) class35.field477 - 16.0D / this.field261);
            this.field255 = true;
            class32.field411 = -1;
        }
        if (class26.field372[97]) {
            class32.field411 = -1;
            this.field255 = true;
            class35.field477 = (int) (16.0D / this.field261 + (double) class35.field477);
        }
        if (class26.field372[98]) {
            this.field255 = true;
            class32.field411 = -1;
            class27.field377 = (int) ((double) class27.field377 - 16.0D / this.field261);
        }
        if (class26.field372[99]) {
            class32.field411 = -1;
            this.field255 = true;
            class27.field377 = (int) (16.0D / this.field261 + (double) class27.field377);
        }
        while (true) {
            while (true) {
                while (true) {
                    while (class6.method23((byte) 77)) {
                        if (!field247 || !class24.field343) {
                            if (class32.field416 == this.field314 || class32.field416 == this.field318) {
                                class24.field343 = true;
                                this.field255 = true;
                            }
                            if (class32.field416 == 49) {
                                this.field252 = 3.0D;
                                this.field255 = true;
                            }
                            if (class32.field416 == 50) {
                                this.field255 = true;
                                this.field252 = 4.0D;
                            }
                            if (class32.field416 == 51) {
                                this.field255 = true;
                                this.field252 = 6.0D;
                            }
                            if (class32.field416 == 52) {
                                this.field252 = 8.0D;
                                this.field255 = true;
                            }
                            if (class32.field416 == this.field274 || class32.field416 == this.field263) {
                                this.field255 = true;
                                this.field298 = !this.field298;
                            }
                            if (class32.field416 == this.field302 || class32.field416 == this.field323) {
                                this.field310 = !this.field310;
                                this.field255 = true;
                            }
                        } else if (class9.field77 == 0) {
                            class24.field343 = false;
                            this.field255 = true;
                            this.field251.method250(-118, 0);
                            class24.field337 = -1;
                        } else if (class9.field77 == 84) {
                            this.field271 = class27.field377 << 16;
                            this.field330 = class35.field477 << 16;
                            class32.field411 = class24.field337;
                            class24.field343 = false;
                            this.field251.method250(-111, 0);
                            class24.field337 = -1;
                            this.field255 = true;
                        } else {
                            boolean var2 = false;
                            if (class9.field77 == 85) {
                                if (this.field251.method251(true) > 0) {
                                    this.field251.method250(-100, this.field251.method251(true) - 1);
                                    this.field255 = true;
                                    if (this.field251.method251(true) == 0) {
                                        class24.field337 = -1;
                                    } else {
                                        var2 = true;
                                    }
                                }
                            } else if (class32.field416 != -1 && this.field251.method251(true) <= class11.field91) {
                                this.field251.method235(class32.field416, 124);
                                this.field255 = true;
                            }
                            if (this.field251.method251(true) > 0) {
                                for (int var3 = 0; var3 < this.field283; var3++) {
                                    if (this.field331[var3].method251(true) >= this.field251.method251(true)) {
                                        class38 var4 = this.field251.method240((byte) -37);
                                        class38 var5 = this.field331[var3].method234(32, 47, true).method244(this.field251.method251(true), 0, 0).method240((byte) -37);
                                        if (var4.method254(var5, (byte) 119) == 0) {
                                            class24.field337 = var3;
                                            var2 = true;
                                            this.field255 = true;
                                            break;
                                        }
                                    }
                                }
                                if (!var2) {
                                    this.field251.method250(-127, this.field251.method251(true) - 1);
                                }
                            }
                        }
                    }
                    int var6 = class34.field444;
                    int var7 = class10.field84;
                    int var8 = class23.field238;
                    int var9 = class5.field33;
                    int var10 = class32.field412;
                    int var11 = class26.field362;
                    if (var6 == 1) {
                        this.field296 = var7;
                        this.field328 = var8;
                        this.field332 = class35.field477;
                        this.field304 = class27.field377;
                        if (class18.field184.length == 1) {
                            if (this.field260 < var7 && var7 < this.field260 + this.field287 && var8 > this.field276 && var8 < this.field317 + this.field276) {
                                this.field252 = 3.0D;
                                this.field296 = -1;
                            }
                            if (var7 > this.field305 + this.field260 && this.field305 + this.field260 + this.field287 > var7 && this.field276 < var8 && this.field317 + this.field276 > var8) {
                                this.field252 = 4.0D;
                                this.field296 = -1;
                            }
                            if (this.field305 * 2 + this.field260 < var7 && var7 < this.field305 * 2 + this.field260 + this.field287 && this.field276 < var8 && var8 < this.field276 + this.field317) {
                                this.field252 = 6.0D;
                                this.field296 = -1;
                            }
                            if (this.field260 + this.field305 * 3 < var7 && this.field305 * 3 + this.field260 + this.field287 > var7 && this.field276 < var8 && var8 < this.field317 + this.field276) {
                                this.field252 = 8.0D;
                                this.field296 = -1;
                            }
                        } else {
                            if (var7 > this.field260 && this.field287 + this.field260 > var7 && var8 > this.field276 && this.field317 + this.field276 + this.field291 > var8) {
                                this.field296 = -1;
                                this.field252 = 3.0D;
                            }
                            if (var7 > this.field305 + this.field260 && var7 < this.field260 + this.field287 + this.field305 && this.field276 < var8 && this.field276 + this.field317 + this.field291 > var8) {
                                this.field296 = -1;
                                this.field252 = 4.0D;
                            }
                            if (this.field305 * 2 + this.field260 < var7 && this.field260 + this.field305 * 2 + this.field287 > var7 && this.field276 < var8 && var8 < this.field317 + this.field276 + this.field291) {
                                this.field296 = -1;
                                this.field252 = 6.0D;
                            }
                            if (var7 > this.field260 + this.field305 * 3 && this.field305 * 3 + this.field287 + this.field260 > var7 && this.field276 < var8 && this.field276 + this.field317 + this.field291 > var8) {
                                this.field296 = -1;
                                this.field252 = 8.0D;
                            }
                            if (var7 > 170 && var7 < 400 && var8 > 483 && var8 < 503) {
                                this.method146(true, this.field290);
                                this.method150((byte) -78);
                                this.method139(false);
                                this.field296 = -1;
                            }
                        }
                        if (this.field277 < var7 && this.field312 + this.field259 < var8 && var7 < this.field277 + this.field248 && var8 < 503) {
                            this.field298 = !this.field298;
                            this.field296 = -1;
                        }
                        this.field245 = false;
                        this.field255 = true;
                        if (var7 > this.field301 && var8 > this.field325 + this.field269 && var7 < this.field301 + this.field275 && var8 < 503) {
                            this.field296 = -1;
                            this.field310 = !this.field310;
                        }
                        if (this.field298) {
                            if (this.field277 < var7 && var8 > this.field312 && var7 < this.field277 + this.field248 && this.field312 + this.field259 > var8) {
                                this.field296 = -1;
                            }
                            if (this.field277 < var7 && var8 > this.field312 && var7 < this.field277 + this.field248 && var8 < this.field312 + 18 && this.field326 > 0) {
                                this.field326 -= 24;
                            }
                            if (this.field277 < var7 && var8 > this.field259 + this.field312 - 18 && this.field277 + this.field248 > var7 && var8 < this.field312 + this.field259 && this.field326 < 48) {
                                this.field326 += 24;
                            }
                        }
                        if (this.field310 && var7 > this.field301 && this.field269 < var8 && var7 < this.field301 + this.field275 && var8 < this.field325 + this.field269) {
                            class27.field377 = (var8 - this.field269) * class13.field122 / this.field325;
                            class35.field477 = (var7 - this.field301) * class1.field3 / this.field275;
                            this.field296 = -1;
                            this.field245 = true;
                        }
                        if (field247 && !class24.field343 && !this.field245 && var7 > this.field320 && this.field282 < var8 && this.field322 + this.field320 > var7 && this.field303 + this.field282 > var8) {
                            class24.field343 = true;
                        }
                    }
                    if (this.field298) {
                        this.field311 = -1;
                        if (this.field277 < var11 && var11 < this.field277 + this.field248) {
                            int var12 = this.field312 + 5 + 21;
                            int var13 = this.field278;
                            for (int var14 = 0; var14 < 24; var14++) {
                                if (var13 < this.field307.length && this.field307[var13].method236(class34.field438, -95)) {
                                    var13++;
                                    var14--;
                                } else {
                                    if (var10 >= var12 && var12 + 17 > var10) {
                                        if (var6 == 1) {
                                            this.field270 = var13;
                                            this.field254 = 50;
                                        }
                                        this.field311 = var13;
                                    }
                                    var13++;
                                    var12 += 17;
                                }
                            }
                        }
                        if (this.field324 != this.field311) {
                            this.field324 = this.field311;
                            this.field255 = true;
                        }
                    }
                    if (var9 == 1 && this.field310 && this.field245) {
                        class32.field411 = -1;
                        this.field255 = true;
                        int var15 = var11;
                        int var16 = var10;
                        if (this.field269 > var10) {
                            var16 = this.field269;
                        } else if (var10 > this.field269 + this.field325) {
                            var16 = this.field325 + this.field269;
                        }
                        class27.field377 = (var16 - this.field269) * class13.field122 / this.field325;
                        if (this.field301 > var11) {
                            var15 = this.field301;
                        } else if (this.field301 + this.field275 < var11) {
                            var15 = this.field301 + this.field275;
                        }
                        class35.field477 = (var15 - this.field301) * class1.field3 / this.field275;
                    } else {
                        this.field245 = false;
                    }
                    if (var9 == 1 && this.field296 != -1) {
                        class32.field411 = -1;
                        this.field255 = true;
                        class35.field477 = (int) ((double) (this.field296 - var11) * 2.0D / this.field252) + this.field332;
                        class27.field377 = (int) ((double) (this.field328 - var10) * 2.0D / this.field252) + this.field304;
                    }
                    if (this.field261 < this.field252) {
                        this.field255 = true;
                        this.field261 += this.field261 / 30.0D;
                        if (this.field252 < this.field261) {
                            this.field261 = this.field252;
                        }
                    }
                    if (this.field252 < this.field261) {
                        this.field261 -= this.field261 / 30.0D;
                        this.field255 = true;
                        if (this.field252 > this.field261) {
                            this.field261 = this.field252;
                        }
                    }
                    int var17 = 0 / ((30 - arg0) / 60);
                    if (this.field278 < this.field326) {
                        this.field255 = true;
                        this.field278++;
                    }
                    if (this.field326 < this.field278) {
                        this.field255 = true;
                        this.field278--;
                    }
                    if (this.field254 > 0) {
                        this.field255 = true;
                        this.field254--;
                    }
                    if (class32.field411 >= 0) {
                        class19.field190 = this.field266[class32.field411] - class6.field37;
                        class10.field86 = class13.field122 + class35.field472 - this.field309[class32.field411];
                        byte var18 = 4;
                        this.field255 = true;
                        int var19 = class10.field86 - (int) (503.0D / this.field261);
                        int var20 = class19.field190 - (int) (635.0D / this.field261);
                        int var21 = (int) (635.0D / this.field261) + class19.field190;
                        int var22 = (int) (503.0D / this.field261) + class10.field86;
                        if (var20 < 48) {
                            class19.field190 = (int) (635.0D / this.field261) + 48;
                        }
                        if (class1.field3 - 48 < var21) {
                            class19.field190 = class1.field3 - (int) (635.0D / this.field261) - 48;
                        }
                        class19.field190 <<= 0x10;
                        if (var19 < 48) {
                            class10.field86 = (int) (503.0D / this.field261) + 48;
                        }
                        if (class13.field122 - 48 < var22) {
                            class10.field86 = class13.field122 - (int) (503.0D / this.field261) - 48;
                        }
                        int var23 = class19.field190 - this.field330;
                        class10.field86 <<= 0x10;
                        int var24 = class10.field86 - this.field271;
                        if (var23 >> var18 == 0 && var24 >> var18 == 0) {
                            class32.field411 = -1;
                        } else {
                            this.field271 += var24 >> var18;
                            class27.field377 = this.field271 >> 16;
                            this.field330 += var23 >> var18;
                            class35.field477 = this.field330 >> 16;
                        }
                    }
                    int var25 = class35.field477 - (int) (635.0D / this.field261);
                    int var26 = class27.field377 - (int) (503.0D / this.field261);
                    int var27 = (int) (635.0D / this.field261) + class35.field477;
                    if (var25 < 48) {
                        class35.field477 = (int) (635.0D / this.field261) + 48;
                    }
                    if (var27 > class1.field3 - 48) {
                        class35.field477 = class1.field3 - (int) (635.0D / this.field261) - 48;
                    }
                    int var28 = (int) (503.0D / this.field261) + class27.field377;
                    if (var26 < 48) {
                        class27.field377 = (int) (503.0D / this.field261) + 48;
                    }
                    if (class13.field122 - 48 < var28) {
                        class27.field377 = class13.field122 - (int) (503.0D / this.field261) - 48;
                    }
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(ILjava/lang/String;[B)Z", line = 1100)
    private final boolean method144(int arg0, String arg1, byte[] arg2) {
        if (arg2 == null) {
            return false;
        }
        try {
            MessageDigest var4 = MessageDigest.getInstance("SHA");
            var4.reset();
            var4.update(arg2);
            if (arg0 != 20) {
                this.field307 = null;
            }
            byte[] var5 = var4.digest();
            if (arg1 == "main_file_cache.dat0") {
                if (var5[0] != 89 || var5[1] != 44 || var5[2] != -32 || var5[3] != 107 || var5[4] != -114 || var5[5] != 37 || var5[6] != 25 || var5[7] != -25 || var5[8] != 111 || var5[9] != -37 || var5[10] != 57 || var5[11] != -96 || var5[12] != 86 || var5[13] != -34 || var5[14] != -55 || var5[15] != -43 || var5[16] != -100 || var5[17] != 101 || var5[18] != 80 || var5[19] != -76) {
                    return false;
                }
            } else if (var5[0] != 65 || var5[1] != 89 || var5[2] != -58 || var5[3] != -50 || var5[4] != 116 || var5[5] != 117 || var5[6] != 59 || var5[7] != -103 || var5[8] != 18 || var5[9] != -89 || var5[10] != 45 || var5[11] != 126 || var5[12] != 80 || var5[13] != 10 || var5[14] != -103 || var5[15] != 75 || var5[16] != -21 || var5[17] != 109 || var5[18] != -27 || var5[19] != 126) {
                return false;
            }
            return true;
        } catch (Exception var7) {
            this.method166(false, "sha");
            return false;
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(I)V", line = 1140)
    public final void method145(int arg0) {
        class8.method37(false);
        class35.method212(arg0 ^ 0xFFFFEA3A);
        try {
            if (arg0 != 5565) {
                this.method145(46);
            }
            this.field309 = null;
            this.field307 = null;
            this.field321 = null;
            class19.field199 = null;
            this.field267 = null;
            this.field331 = null;
            this.field266 = null;
            this.field292 = null;
            System.gc();
        } catch (Throwable var3) {
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(ZI)V", line = 1164)
    private final void method146(boolean arg0, int arg1) {
        if (arg0) {
            this.method138(class9.method43(new class38[] { class26.field360, class4.field26[class18.field182], class31.field403 }, 18589), 483, arg1, this.field281, 170, 18, this.field313, (byte) -16, 230);
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "i", descriptor = "(I)Z", line = 1179)
    private final boolean method147(int arg0) {
        if (class37.field500 == 0) {
            this.method148((byte) -83);
            class37.field500 = 1;
        }
        if (class37.field500 == 1) {
            class26.field359 = 25;
            boolean var2 = this.method141(42, this.field273, "main_file_cache.idx0");
            if (!var2) {
                return false;
            }
            class13.field125 = class36.field492;
            class36.field492 = null;
            if (class13.field125 == null) {
                throw new RuntimeException("T1");
            }
            class37.field500 = 2;
        }
        if (class37.field500 == 2) {
            class18.field184 = new class3[1];
            class37.field500 = 10;
        }
        if (class37.field500 == 10) {
            class26.field359 = 50;
            boolean var3 = this.method141(42, this.field315, "main_file_cache.dat0");
            if (!var3) {
                return false;
            }
            class18.field184[0] = class36.field492;
            class36.field492 = null;
            if (class18.field184[0] == null) {
                throw new RuntimeException("T2");
            }
            class37.field500 = 20;
        }
        if (~class37.field500 != arg0) {
            return false;
        }
        class24.field339 = class6.method27((byte) 39, class13.field125, class19.field195, class31.field407);
        class31.field400 = class4.method15(class19.field195, class13.field125, 60, class1.field4);
        this.field267 = class32.method193(class19.field195, class33.field421, class13.field125, (byte) -126);
        this.field329 = new class29(11, true, this);
        this.field246 = new class29(12, true, this);
        this.field308 = new class29(14, true, this);
        this.field300 = new class29(17, true, this);
        this.field295 = new class29(19, true, this);
        this.field258 = new class29(22, true, this);
        this.field294 = new class29(26, true, this);
        this.field316 = new class29(30, true, this);
        class26.field359 = 100;
        class38.field509 = this.field327;
        class12.method52(-120, class38.field509, null, class26.field359);
        this.field322 = this.field267.method96(this.field250) + 20;
        this.method139(false);
        class38[] var4 = this.field307;
        for (int var5 = 0; var5 < var4.length; var5++) {
            class38 var6 = var4[var5];
            int var7 = this.field267.method96(var6);
            if (this.field299 < var7) {
                this.field299 = var7;
            }
        }
        this.field248 = this.field299 + 16 + 18;
        if (this.field248 > 140) {
            int var8 = this.field301 - this.field277 - this.field248;
            this.field285 = var8 / 25;
            this.field287 = this.field285 * 5;
            this.field305 = this.field287 + this.field285;
            int var9 = var8 - this.field285 * 25;
            this.field260 = var9 / 2 + this.field285 + this.field248 + this.field277;
        }
        return true;
    }

    @OriginalMember(owner = "mapview!mapview", name = "f", descriptor = "(B)V", line = 1324)
    private final void method148(byte arg0) {
        String var3;
        try {
            String var2 = System.getProperty("user.home");
            if (arg0 >= -79) {
                return;
            }
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
                        class23.field243 = var8 + var6 + "/rsmap/";
                        return;
                    }
                }
            } catch (Exception var14) {
            }
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(IIIIIIIII)V", line = 1395)
    private final void method149(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class19.field199.method211((byte) -84, arg4, arg7, arg1, arg0, arg2, arg3, arg8, arg6);
        if (arg1 - arg3 < -arg7 + arg4) {
            return;
        }
        class19.field199.method208(arg0, arg6, arg2, this.field261, arg4, arg8, arg7, false, arg3, arg1);
        class19.field199.method215(arg1, arg2, arg3, arg0, arg8, arg4, (byte) -67, arg6, arg7);
        class19.field199.method209(arg6, arg2, arg3, this.field254, arg4, arg7, arg8, arg1, arg0, 108, this.field270);
        if (arg5 < 21) {
            this.field319 = null;
        }
        if (this.field261 == this.field252 && class8.field62) {
            for (int var10 = 0; var10 < this.field283; var10++) {
                int var11 = this.field266[var10];
                int var12 = var11 - class6.field37;
                int var13 = this.field309[var10];
                int var14 = this.field321[var10];
                int var15 = class13.field122 + class35.field472 - var13;
                int var16 = (var12 - arg7) * (-arg3 + arg1) / (arg4 - arg7) + arg3;
                int var17 = (arg6 - arg0) * (var15 - arg8) / (arg2 - arg8) + arg0;
                int var18 = 16777215;
                class29 var19 = null;
                if (var14 == 0) {
                    if (this.field261 == 3.0D) {
                        var19 = this.field329;
                    }
                    if (this.field261 == 4.0D) {
                        var19 = this.field246;
                    }
                    if (this.field261 == 6.0D) {
                        var19 = this.field308;
                    }
                    if (this.field261 == 8.0D) {
                        var19 = this.field300;
                    }
                }
                if (var14 == 1) {
                    if (this.field261 == 3.0D) {
                        var19 = this.field308;
                    }
                    if (this.field261 == 4.0D) {
                        var19 = this.field300;
                    }
                    if (this.field261 == 6.0D) {
                        var19 = this.field295;
                    }
                    if (this.field261 == 8.0D) {
                        var19 = this.field258;
                    }
                }
                if (var14 == 2) {
                    if (this.field261 == 3.0D) {
                        var19 = this.field295;
                    }
                    if (this.field261 == 4.0D) {
                        var19 = this.field258;
                    }
                    if (this.field261 == 6.0D) {
                        var19 = this.field294;
                    }
                    if (this.field261 == 8.0D) {
                        var19 = this.field316;
                    }
                    var18 = 16755200;
                }
                if (var19 != null) {
                    class38 var20 = this.field331[var10];
                    int var21 = 1;
                    for (int var22 = 0; var20.method251(true) > var22; var22++) {
                        if (var20.method237(var22, (byte) -99) == 47) {
                            var21++;
                        }
                    }
                    int var23 = var17 - var19.method185() * (var21 - 1) / 2;
                    int var24 = var23 + var19.method177() / 2;
                    while (true) {
                        int var25 = var20.method247(true, 47);
                        if (var25 == -1) {
                            var19.method178(var20, var16, var24, var18, true);
                            break;
                        }
                        class38 var26 = var20.method244(var25, 0, 0);
                        var19.method178(var26, var16, var24, var18, true);
                        var24 += var19.method185();
                        var20 = var20.method242(0, var25 + 1);
                    }
                }
            }
        }
        if (!class12.field100) {
            return;
        }
        for (int var27 = class6.field37 / 64; var27 < (class6.field37 + class1.field3) / 64; var27++) {
            for (int var28 = class35.field472 / 64; var28 < (class35.field472 + class13.field122) / 64; var28++) {
                int var29 = var27 * 64;
                int var30 = var29 - class6.field37;
                int var31 = var28 * 64;
                int var32 = arg3 + (arg1 - arg3) * (-arg7 + var30) / (arg4 - arg7);
                int var33 = class35.field472 + class13.field122 - var31;
                int var34 = (arg1 - arg3) * (var30 + 64 + -arg7) / (arg4 - arg7) + arg3;
                int var35 = (arg6 - arg0) * (-arg8 + var33) / (arg2 - arg8) + arg0;
                int var36 = (arg6 - arg0) * (-arg8 + var33 + -64) / (arg2 - arg8) + arg0;
                class15.method84(var32, var36, var34 - var32, var35 - var36, 16777215);
                this.field267.method94(class9.method43(new class38[] { class18.method99(var27, -59), class16.field149, class18.method99(var28, -58) }, 18589), var34 - 5, var35 - 5, 16777215);
                if (var27 == 33 && var28 >= 71 && var28 <= 73) {
                    this.field267.method95(class19.field203, (var32 + var34) / 2, (var35 + var36) / 2, 16711680);
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "g", descriptor = "(B)V", line = 1587)
    private final void method150(byte arg0) {
        int var2 = -1 % ((50 - arg0) / 53);
        class32.field417 = false;
        try {
            Graphics var3 = class31.field397.getGraphics();
            class16.field154.method41(var3, 0, 0, false);
        } catch (Exception var5) {
            class31.field397.repaint();
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "d", descriptor = "(I)V", line = 1603)
    public final void method151(int arg0) {
        if (!class35.field479) {
            class35.field479 = this.method147(-21);
            class12.method52(arg0 - 105, class38.field509, null, class26.field359);
            return;
        }
        if (this.field255) {
            this.field255 = false;
            class32.field417 = true;
            class15.method73();
            int var2 = class27.field377 - (int) (503.0D / this.field261);
            int var3 = (int) (635.0D / this.field261) + class35.field477;
            int var4 = (int) (503.0D / this.field261) + class27.field377;
            int var5 = class35.field477 - (int) (635.0D / this.field261);
            this.method149(0, 635, var4, 0, var3, 88, 503, var5, var2);
            if (this.field310) {
                this.field292.method30(this.field301, this.field269);
                class15.method76(this.field275 * var5 / class1.field3 + this.field301, this.field269 - -(this.field325 * var2 / class13.field122), (var3 - var5) * this.field275 / class1.field3, (var4 - var2) * this.field325 / class13.field122, 16711680, 128);
                class15.method84(this.field275 * var5 / class1.field3 + this.field301, this.field325 * var2 / class13.field122 + this.field269, (var3 - var5) * this.field275 / class1.field3, (var4 - var2) * this.field325 / class13.field122, 16711680);
                if (this.field254 > 0 && this.field254 % 10 < 5) {
                    for (int var6 = 0; var6 < class19.field188; var6++) {
                        if (class19.field199.field478[var6] == this.field270) {
                            int var7 = class19.field199.field476[var6] * this.field275 / class1.field3 + this.field301;
                            int var8 = class19.field199.field474[var6] * this.field325 / class13.field122 + this.field269;
                            class15.method75(var7, var8, 2, 16776960, 256);
                        }
                    }
                }
            }
            if (this.field298) {
                this.method138(this.field284, this.field312, 7829367, 10066329, this.field277, 18, 5592405, (byte) -16, this.field248);
                this.method138(class19.field195, this.field312 + 18, 7829367, 10066329, this.field277, this.field259 - 36, 5592405, (byte) -16, this.field248);
                this.method138(this.field293, this.field259 + this.field312 - 18, 7829367, 10066329, this.field277, 18, 5592405, (byte) -16, this.field248);
                int var9 = this.field312 + 18 + 3;
                int var10 = this.field278;
                for (int var11 = 0; var11 < 24; var11++) {
                    if (class31.field400.length > var10 && var10 < this.field307.length) {
                        if (this.field307[var10].method236(class34.field438, arg0 - 89)) {
                            var10++;
                            var11--;
                            continue;
                        }
                        class31.field400[var10].method33(this.field277 + 3, var9);
                        this.field267.method91(this.field307[var10], this.field277 + 21, var9 - -14, 0);
                        int var12 = 16777215;
                        if (this.field311 == var10) {
                            var12 = 12298922;
                        }
                        if (this.field254 > 0 && this.field254 % 10 < 5 && this.field270 == var10) {
                            var12 = 16776960;
                        }
                        this.field267.method91(this.field307[var10], this.field277 + 20, var9 + 13, var12);
                    }
                    var10++;
                    var9 += 17;
                }
            }
            if (class18.field184.length == 1) {
                this.method138(this.field253, this.field325 + this.field269, this.field280, this.field281, this.field301, 18, this.field313, (byte) -16, this.field275);
                this.method138(this.field262, this.field312 + this.field259, this.field280, this.field281, this.field277, 18, this.field313, (byte) -16, this.field248);
                if (this.field252 == 3.0D) {
                    this.method138(class6.field41, this.field276, this.field290, this.field306, this.field260, this.field317, this.field256, (byte) -16, this.field287);
                } else {
                    this.method138(class6.field41, this.field276, this.field280, this.field281, this.field260, this.field317, this.field313, (byte) -16, this.field287);
                }
                if (this.field252 == 4.0D) {
                    this.method138(class33.field425, this.field276, this.field290, this.field306, this.field305 + this.field260, this.field317, this.field256, (byte) -16, this.field287);
                } else {
                    this.method138(class33.field425, this.field276, this.field280, this.field281, this.field305 + this.field260, this.field317, this.field313, (byte) -16, this.field287);
                }
                if (this.field252 == 6.0D) {
                    this.method138(class36.field494, this.field276, this.field290, this.field306, this.field305 * 2 + this.field260, this.field317, this.field256, (byte) -16, this.field287);
                } else {
                    this.method138(class36.field494, this.field276, this.field280, this.field281, this.field305 * 2 + this.field260, this.field317, this.field313, (byte) -16, this.field287);
                }
                if (this.field252 == 8.0D) {
                    this.method138(class16.field148, this.field276, this.field290, this.field306, this.field305 * 3 + this.field260, this.field317, this.field256, (byte) -16, this.field287);
                } else {
                    this.method138(class16.field148, this.field276, this.field280, this.field281, this.field305 * 3 + this.field260, this.field317, this.field313, (byte) -16, this.field287);
                }
            } else {
                this.method138(this.field253, this.field325 + this.field269, this.field280, this.field281, this.field301, 18, this.field313, (byte) -16, this.field275);
                this.method138(this.field262, this.field312 + this.field259, this.field280, this.field281, this.field277, 18, this.field313, (byte) -16, this.field248);
                this.method146(true, this.field280);
                int var13 = this.field291 + this.field276;
                if (this.field252 == 3.0D) {
                    this.method138(class6.field41, var13, this.field290, this.field306, this.field260, this.field317, this.field256, (byte) -16, this.field287);
                } else {
                    this.method138(class6.field41, var13, this.field280, this.field281, this.field260, this.field317, this.field313, (byte) -16, this.field287);
                }
                if (this.field252 == 4.0D) {
                    this.method138(class33.field425, var13, this.field290, this.field306, this.field305 + this.field260, this.field317, this.field256, (byte) -16, this.field287);
                } else {
                    this.method138(class33.field425, var13, this.field280, this.field281, this.field260 + this.field305, this.field317, this.field313, (byte) -16, this.field287);
                }
                if (this.field252 == 6.0D) {
                    this.method138(class36.field494, var13, this.field290, this.field306, this.field305 * 2 + this.field260, this.field317, this.field256, (byte) -16, this.field287);
                } else {
                    this.method138(class36.field494, var13, this.field280, this.field281, this.field305 * 2 + this.field260, this.field317, this.field313, (byte) -16, this.field287);
                }
                if (this.field252 == 8.0D) {
                    this.method138(class16.field148, var13, this.field290, this.field306, this.field260 + this.field305 * 3, this.field317, this.field256, (byte) -16, this.field287);
                } else {
                    this.method138(class16.field148, var13, this.field280, this.field281, this.field305 * 3 + this.field260, this.field317, this.field313, (byte) -16, this.field287);
                }
            }
            if (field247) {
                this.method138(this.field250, this.field282, this.field280, this.field281, this.field320, this.field303, this.field313, (byte) -16, this.field322);
                if (class24.field343) {
                    class15.method76(this.field322 + this.field320 + 2, this.field282, this.field265 + 10, this.field303, 8925952, 192);
                    class15.method84(this.field320 + this.field322 + 2, this.field282, this.field265 + 10, this.field303, 16777215);
                    if (class24.field337 > -1 && this.field251.method251(true) > 0) {
                        class38 var14 = this.field331[class24.field337].method234(32, 47, true);
                        int var15 = this.field251.method251(true);
                        if (var15 > var14.method251(true)) {
                            var15 = var14.method251(true);
                        }
                        this.field267.method90(var14, this.field322 + this.field320 + 6, 20, 10066176, true);
                        this.field267.method90(var14.method244(var15, 0, 0), this.field320 + this.field322 + 6, 20, 16777215, true);
                    } else {
                        this.field267.method90(this.field288, this.field320 + this.field322 + 6, 20, 16776960, true);
                    }
                }
            }
        }
        if (arg0 != -1) {
            this.method144(74, null, null);
        }
        if (class32.field417) {
            this.method150((byte) -73);
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(II[B)I", line = 1819)
    public static final int method152(int arg0, int arg1, byte[] arg2) {
        if (arg1 != 0) {
            field279 = null;
        }
        return class9.method45(126, arg2, 0, arg0);
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "([BLjava/lang/String;I)V", line = 1842)
    private final void method153(byte[] arg0, String arg1, int arg2) throws IOException {
        FileOutputStream var4 = new FileOutputStream(arg1);
        var4.write(arg0, 0, arg0.length);
        var4.close();
        int var5 = -49 % ((arg2 - 59) / 56);
    }

    @OriginalMember(owner = "mapview!mapview", name = "init", descriptor = "()V", line = 1880)
    public final void init() {
        if (this.method169((byte) -80)) {
            this.method167(110, 32, 503, 635, class8.field64.method239(this, (byte) -106).method232(false));
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "j", descriptor = "(I)V", line = 1914)
    public static void method154(int arg0) {
        if (arg0 == 2) {
            field279 = null;
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(IZ)V", line = 1936)
    private final void method155(int arg0, boolean arg1) {
        if (arg0 < class18.field184.length) {
            class3 var3 = class18.field184[arg0];
            class18 var4 = new class18(var3.method62(class19.field201, (byte) 87, class6.field38));
            var4.method110((byte) 68);
            class18 var5 = new class18(var3.method62(class25.field350, (byte) 87, class6.field38));
            this.field283 = var5.method107(-5286);
            for (int var6 = 0; var6 < this.field283; var6++) {
                this.field331[var6] = var5.method110((byte) -54);
                this.field266[var6] = var5.method107(-5286);
                this.field309[var6] = var5.method107(-5286);
                this.field321[var6] = var5.method103(255);
                class38 var7 = this.field331[var6].method234(32, 47, !arg1);
                int var8 = this.field267.method96(var7);
                if (var8 > this.field265) {
                    this.field265 = var8;
                }
                int var9 = this.field267.method96(this.field288);
                if (var9 > this.field265) {
                    this.field265 = var9;
                }
            }
            class19.field199 = new class35();
            class19.field199.method214(class18.field184[arg0], (byte) -74);
            this.field325 = 180;
            class35.field477 = class37.field495;
            this.field269 = 503 - this.field325 - 20;
            this.field275 = class1.field3 * this.field325 / class13.field122;
            class27.field377 = field264;
            this.field301 = 635 - this.field275 - 5;
            this.field292 = new class7(this.field275, this.field325);
            this.field292.method31();
            this.method149(0, this.field275, class13.field122, 0, class1.field3, 104, this.field325, 0, 0);
            class15.method84(0, 0, this.field275, this.field325, 0);
            class15.method84(1, 1, this.field275 - 2, this.field325 + -2, this.field281);
            class16.field154.method159(-72);
        }
        if (arg1) {
            this.field328 = -23;
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(BI)I", line = 2021)
    private final int method156(byte arg0, int arg1) {
        arg1++;
        if (arg0 != -117) {
            this.field245 = false;
        }
        if (arg1 >= class18.field184.length) {
            arg1 = 0;
        }
        return arg1;
    }
}
