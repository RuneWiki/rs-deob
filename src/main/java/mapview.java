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
public class mapview extends class11 {

    @OriginalMember(owner = "mapview!mapview", name = "t", descriptor = "I")
    private int field220 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "r", descriptor = "[I")
    private int[] field218 = new int[1000];

    @OriginalMember(owner = "mapview!mapview", name = "u", descriptor = "I")
    private int field221 = -1;

    @OriginalMember(owner = "mapview!mapview", name = "s", descriptor = "I")
    private int field219 = 470;

    @OriginalMember(owner = "mapview!mapview", name = "A", descriptor = "I")
    private int field227 = 11141120;

    @OriginalMember(owner = "mapview!mapview", name = "B", descriptor = "I")
    private int field228 = 7824964;

    @OriginalMember(owner = "mapview!mapview", name = "I", descriptor = "I")
    private int field235 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "n", descriptor = "I")
    private int field214 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "o", descriptor = "Z")
    private boolean field215 = true;

    @OriginalMember(owner = "mapview!mapview", name = "F", descriptor = "I")
    private int field232 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "R", descriptor = "[I")
    private int[] field244 = new int[1000];

    @OriginalMember(owner = "mapview!mapview", name = "K", descriptor = "[I")
    private int[] field237 = new int[1000];

    @OriginalMember(owner = "mapview!mapview", name = "Q", descriptor = "Z")
    private boolean field243 = false;

    @OriginalMember(owner = "mapview!mapview", name = "O", descriptor = "I")
    private int field241 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "G", descriptor = "I")
    private int field233 = 10027008;

    @OriginalMember(owner = "mapview!mapview", name = "w", descriptor = "I")
    private int field223 = -1;

    @OriginalMember(owner = "mapview!mapview", name = "W", descriptor = "I")
    private int field249 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "v", descriptor = "[I")
    private int[] field222 = new int[1000];

    @OriginalMember(owner = "mapview!mapview", name = "Z", descriptor = "D")
    private double field252 = 4.0D;

    @OriginalMember(owner = "mapview!mapview", name = "nb", descriptor = "Z")
    private boolean field266 = false;

    @OriginalMember(owner = "mapview!mapview", name = "kb", descriptor = "I")
    private int field263 = -1;

    @OriginalMember(owner = "mapview!mapview", name = "E", descriptor = "I")
    private int field231 = 500;

    @OriginalMember(owner = "mapview!mapview", name = "P", descriptor = "I")
    private int field242 = 140;

    @OriginalMember(owner = "mapview!mapview", name = "x", descriptor = "I")
    private int field224 = 13;

    @OriginalMember(owner = "mapview!mapview", name = "ob", descriptor = "I")
    private int field267 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "ib", descriptor = "I")
    private int field261 = 8943445;

    @OriginalMember(owner = "mapview!mapview", name = "ab", descriptor = "[Lt;")
    private class31[] field253 = new class31[this.field231];

    @OriginalMember(owner = "mapview!mapview", name = "m", descriptor = "[I")
    private int[] field213 = new int[this.field231];

    @OriginalMember(owner = "mapview!mapview", name = "rb", descriptor = "I")
    private int field270 = 6706483;

    @OriginalMember(owner = "mapview!mapview", name = "sb", descriptor = "[I")
    private int[] field271 = new int[1000];

    @OriginalMember(owner = "mapview!mapview", name = "mb", descriptor = "I")
    private int field265 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "Y", descriptor = "[I")
    private int[] field251 = new int[1000];

    @OriginalMember(owner = "mapview!mapview", name = "wb", descriptor = "I")
    private int field275 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "H", descriptor = "[I")
    private int[] field234 = new int[this.field231];

    @OriginalMember(owner = "mapview!mapview", name = "gb", descriptor = "I")
    private int field259 = 5;

    @OriginalMember(owner = "mapview!mapview", name = "C", descriptor = "I")
    private int field229 = 8912896;

    @OriginalMember(owner = "mapview!mapview", name = "T", descriptor = "[I")
    private int[] field246 = new int[this.field231];

    @OriginalMember(owner = "mapview!mapview", name = "zb", descriptor = "D")
    private double field278 = 4.0D;

    @OriginalMember(owner = "mapview!mapview", name = "qb", descriptor = "Z")
    private boolean field269 = false;

    @OriginalMember(owner = "mapview!mapview", name = "bb", descriptor = "Lt;")
    public static class31 field254 = class14.method84(117, "Quest Start");

    @OriginalMember(owner = "mapview!mapview", name = "tb", descriptor = "Lt;")
    public static class31 field272 = class14.method84(118, "Potters Wheel");

    @OriginalMember(owner = "mapview!mapview", name = "V", descriptor = "I")
    private int field248;

    @OriginalMember(owner = "mapview!mapview", name = "eb", descriptor = "I")
    private int field257;

    @OriginalMember(owner = "mapview!mapview", name = "fb", descriptor = "I")
    private int field258;

    @OriginalMember(owner = "mapview!mapview", name = "pb", descriptor = "I")
    private int field268;

    @OriginalMember(owner = "mapview!mapview", name = "U", descriptor = "Lf;")
    private class10 field247;

    @OriginalMember(owner = "mapview!mapview", name = "p", descriptor = "Lu;")
    private class32 field216;

    @OriginalMember(owner = "mapview!mapview", name = "y", descriptor = "Lb;")
    private class3 field225;

    @OriginalMember(owner = "mapview!mapview", name = "J", descriptor = "Lb;")
    private class3 field236;

    @OriginalMember(owner = "mapview!mapview", name = "L", descriptor = "Lb;")
    private class3 field238;

    @OriginalMember(owner = "mapview!mapview", name = "db", descriptor = "Lb;")
    private class3 field256;

    @OriginalMember(owner = "mapview!mapview", name = "hb", descriptor = "Lb;")
    private class3 field260;

    @OriginalMember(owner = "mapview!mapview", name = "ub", descriptor = "Lb;")
    private class3 field273;

    @OriginalMember(owner = "mapview!mapview", name = "vb", descriptor = "Lb;")
    private class3 field274;

    @OriginalMember(owner = "mapview!mapview", name = "xb", descriptor = "Lb;")
    private class3 field276;

    @OriginalMember(owner = "mapview!mapview", name = "Ab", descriptor = "Z")
    public static boolean field279;

    @OriginalMember(owner = "mapview!mapview", name = "q", descriptor = "[I")
    private int[] field217;

    @OriginalMember(owner = "mapview!mapview", name = "S", descriptor = "[I")
    private int[] field245;

    @OriginalMember(owner = "mapview!mapview", name = "D", descriptor = "[Lha;")
    private class15[] field230;

    @OriginalMember(owner = "mapview!mapview", name = "cb", descriptor = "[Lt;")
    private class31[] field255;

    @OriginalMember(owner = "mapview!mapview", name = "z", descriptor = "[Lu;")
    private class32[] field226;

    @OriginalMember(owner = "mapview!mapview", name = "X", descriptor = "[[B")
    private byte[][] field250;

    @OriginalMember(owner = "mapview!mapview", name = "jb", descriptor = "[[B")
    private byte[][] field262;

    @OriginalMember(owner = "mapview!mapview", name = "lb", descriptor = "[[B")
    private byte[][] field264;

    @OriginalMember(owner = "mapview!mapview", name = "yb", descriptor = "[[B")
    private byte[][] field277;

    @OriginalMember(owner = "mapview!mapview", name = "M", descriptor = "[[I")
    private int[][] field239;

    @OriginalMember(owner = "mapview!mapview", name = "N", descriptor = "[[I")
    private int[][] field240;

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(Lt;ILjava/lang/String;)[B", line = 6)
    private final byte[] method138(class31 arg0, int arg1, String arg2) {
        class22.method131((byte) -62, null, 0, class4.field25);
        try {
            int var4 = 0;
            int var5 = 0;
            String var6;
            if (arg2 == "main_file_cache.dat0") {
                var6 = "worldmap.main.js5?crc=757565822";
            } else if (arg2 == "main_file_cache.dat1") {
                var6 = "worldmap.dungeon.js5?crc=1300550446";
            } else if (arg2 == "main_file_cache.dat2") {
                var6 = "worldmap.extra.js5?crc=-784803614";
            } else {
                var6 = "mapview.sprites.js5?crc=-400838696";
            }
            DataInputStream var7 = new DataInputStream((new URL(this.getCodeBase(), var6)).openStream());
            int var8;
            if (arg2 == "main_file_cache.dat0") {
                var8 = 369435;
            } else if (arg2 == "main_file_cache.dat1") {
                var8 = 140326;
            } else if (arg2 == "main_file_cache.dat2") {
                var8 = 97245;
            } else {
                var8 = 8193;
            }
            byte[] var9 = new byte[var8];
            while (var8 > var5) {
                int var10 = var8 - var5;
                if (var10 > 1000) {
                    var10 = 1000;
                }
                int var11 = var7.read(var9, var5, var10);
                if (var11 < 0) {
                    throw new EOFException();
                }
                var5 += var11;
                int var12 = var5 * 100 / var8;
                if (var4 != var12) {
                    class22.method131((byte) -62, null, var12, class18.method102(new class31[] { class25.field282, arg0, class14.field110, class6.method29((byte) 25, var12), class22.field195 }, (byte) 84));
                }
                var4 = var12;
            }
            if (arg1 != 11220) {
                return (byte[]) null;
            }
            var7.close();
            if (this.method150((byte) 25, arg2, var9)) {
                return var9;
            } else {
                this.method69((byte) -111, "download");
                return null;
            }
        } catch (IOException var14) {
            this.method69((byte) -96, "download");
            return null;
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "c", descriptor = "(B)V", line = 99)
    public static void method139(byte arg0) {
        if (arg0 >= -49) {
            field272 = null;
        }
        field254 = null;
        field272 = null;
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(Ljava/lang/String;Lt;B)Lo;", line = 111)
    private final class26 method140(String arg0, class31 arg1, byte arg2) {
        Object var4 = null;
        if (class25.field290 != null) {
            try {
                byte[] var5 = this.method147(-114, class25.field290 + "/" + arg0);
                if (!this.method150((byte) 48, arg0, var5)) {
                    var5 = null;
                }
                if (var5 != null) {
                    return new class26(var5, false, true);
                }
            } catch (IOException var14) {
                Object var7 = null;
            }
        }
        byte[] var8 = this.method138(arg1, 11220, arg0);
        if (var8 == null) {
            return null;
        }
        if (class25.field290 != null && var8 != null) {
            try {
                this.method160(class25.field290 + "/" + arg0, var8, 0);
            } catch (IOException var13) {
            }
        }
        try {
            int var10 = -118 % ((-arg2 - 2) / 32);
            return new class26(var8, false, true);
        } catch (IOException var12) {
            throw class31.method195(var12, "monkey feet");
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "b", descriptor = "(II)V", line = 154)
    private final void method141(int arg0, int arg1) {
        int var3 = 55 / ((-arg0 - 64) / 55);
        if (arg1 >= class18.field152.length) {
            return;
        }
        this.method143(-25, arg1);
        this.field216 = new class32(this.field257, this.field268);
        this.field216.method205();
        this.method159(this.field268, 0, 0, class27.field312, 0, 1, class4.field30, this.field257, 0);
        class8.method48(0, 0, this.field257, this.field268, 0);
        class8.method48(1, 1, this.field257 - 2, this.field268 + -2, this.field261);
        class34.field384.method136(5654);
    }

    @OriginalMember(owner = "mapview!mapview", name = "d", descriptor = "(B)V", line = 173)
    private final void method142(byte arg0) {
        if (class18.field152.length == 1) {
            class4.field29 = 0;
        } else {
            if (class14.field107 >= 0) {
                class4.field29 = class14.field107;
            } else {
                class4.field29 = this.method149(0, class4.field29);
            }
            class14.field107 = this.method149(0, class4.field29);
        }
        int var2 = 58 / ((54 - arg0) / 57);
        this.method141(-128, class4.field29);
    }

    @OriginalMember(owner = "mapview!mapview", name = "c", descriptor = "(II)V", line = 216)
    private final void method143(int arg0, int arg1) {
        class26 var3 = class18.field152[arg1];
        class19 var4 = new class19(var3.method33(class13.field101, class17.field147, true));
        int var5 = var4.method105(-74);
        int var6 = var4.method105(126);
        int var7 = var4.method105(124);
        int var8 = var4.method105(-41);
        int var9 = var4.method105(-78);
        int var10 = var4.method105(-62);
        var4.method112((byte) 24);
        class4.field30 = (var8 - var6) * 64 + 64;
        class26.field300 = var6 * 64;
        class27.field312 = (var7 + 1 - var5) * 64;
        class34.field393 = var5 * 64;
        class20.field181 = class26.field300 + class4.field30 - var10 * 64;
        this.field268 = 180;
        this.field248 = 503 - this.field268 - 20;
        this.field257 = class27.field312 * this.field268 / class4.field30;
        class14.field115 = var9 * 64 - class34.field393;
        this.field258 = 630 - this.field257;
        class19 var11 = new class19(var3.method33(class13.field101, class14.field113, true));
        this.field267 = var11.method105(-15);
        for (int var12 = 0; var12 < this.field267; var12++) {
            this.field253[var12] = var11.method112((byte) 24);
            this.field234[var12] = var11.method105(123);
            this.field246[var12] = var11.method105(-47);
            this.field213[var12] = var11.method110((byte) -73);
        }
        class19 var13 = new class19(var3.method33(class13.field101, class24.field211, true));
        int var14 = var13.method105(-97);
        int var15 = 62 / ((58 - arg0) / 42);
        this.field245 = new int[var14 + 1];
        for (int var16 = 0; var16 < var14; var16++) {
            this.field245[var16 + 1] = var13.method109((byte) -45);
        }
        int var17 = var13.method105(127);
        this.field217 = new int[var17 + 1];
        for (int var18 = 0; var18 < var17; var18++) {
            this.field217[var18 + 1] = var13.method109((byte) -45);
        }
        byte[] var19 = var3.method33(class13.field101, class30.field331, true);
        byte[][] var20 = new byte[class27.field312][class4.field30];
        this.method153(var20, var19, 64);
        byte[] var21 = var3.method33(class13.field101, class25.field286, true);
        this.field250 = new byte[class27.field312][class4.field30];
        this.field239 = new int[class27.field312][class4.field30];
        this.method155(this.field239, this.field250, (byte) -26, var21);
        byte[] var22 = var3.method33(class13.field101, class34.field382, true);
        this.field265 = 0;
        this.field277 = new byte[class27.field312][class4.field30];
        this.field264 = new byte[class27.field312][class4.field30];
        this.field262 = new byte[class27.field312][class4.field30];
        this.method151(this.field262, this.field264, this.field277, var22, -20902);
        this.field240 = new int[class27.field312][class4.field30];
        this.method156(-19712, this.field240, var20);
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "([IIBIIIIII)V", line = 312)
    private final void method144(int[] arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var10 = 119 % ((arg2 - 31) / 61);
        int var11 = class8.field66 - arg6;
        if (arg4 == 9) {
            arg4 = 1;
            arg1 = arg1 + 1 & 0x3;
        }
        if (arg4 == 10) {
            arg4 = 1;
            arg1 = arg1 + 3 & 0x3;
        }
        if (arg4 == 11) {
            arg4 = 8;
            arg1 = arg1 + 3 & 0x3;
        }
        if (arg4 == 1) {
            if (arg1 == 0) {
                for (int var74 = 0; var74 < arg7; var74++) {
                    for (int var75 = 0; var75 < arg6; var75++) {
                        if (var75 <= var74) {
                            arg0[arg5++] = arg3;
                        } else {
                            arg0[arg5++] = arg8;
                        }
                    }
                    arg5 += var11;
                }
            } else if (arg1 == 1) {
                for (int var72 = arg7 - 1; var72 >= 0; var72--) {
                    for (int var73 = 0; var73 < arg6; var73++) {
                        if (var73 <= var72) {
                            arg0[arg5++] = arg3;
                        } else {
                            arg0[arg5++] = arg8;
                        }
                    }
                    arg5 += var11;
                }
            } else if (arg1 == 2) {
                for (int var68 = 0; var68 < arg7; var68++) {
                    for (int var69 = 0; var69 < arg6; var69++) {
                        if (var69 < var68) {
                            arg0[arg5++] = arg8;
                        } else {
                            arg0[arg5++] = arg3;
                        }
                    }
                    arg5 += var11;
                }
            } else if (arg1 == 3) {
                for (int var70 = arg7 - 1; var70 >= 0; var70--) {
                    for (int var71 = 0; var71 < arg6; var71++) {
                        if (var71 < var70) {
                            arg0[arg5++] = arg8;
                        } else {
                            arg0[arg5++] = arg3;
                        }
                    }
                    arg5 += var11;
                }
            }
        } else if (arg4 == 2) {
            if (arg1 == 0) {
                for (int var18 = arg7 - 1; var18 >= 0; var18--) {
                    for (int var19 = 0; var19 < arg6; var19++) {
                        if (var19 <= var18 >> 1) {
                            arg0[arg5++] = arg3;
                        } else {
                            arg0[arg5++] = arg8;
                        }
                    }
                    arg5 += var11;
                }
            } else if (arg1 == 1) {
                for (int var16 = 0; var16 < arg7; var16++) {
                    for (int var17 = 0; var17 < arg6; var17++) {
                        if (var16 << 1 > var17) {
                            arg0[arg5++] = arg8;
                        } else {
                            arg0[arg5++] = arg3;
                        }
                    }
                    arg5 += var11;
                }
            } else if (arg1 == 2) {
                for (int var12 = 0; var12 < arg7; var12++) {
                    for (int var13 = arg6 - 1; var13 >= 0; var13--) {
                        if (var13 <= var12 >> 1) {
                            arg0[arg5++] = arg3;
                        } else {
                            arg0[arg5++] = arg8;
                        }
                    }
                    arg5 += var11;
                }
            } else if (arg1 == 3) {
                for (int var14 = arg7 - 1; var14 >= 0; var14--) {
                    for (int var15 = arg6 - 1; var15 >= 0; var15--) {
                        if (var15 < var14 << 1) {
                            arg0[arg5++] = arg8;
                        } else {
                            arg0[arg5++] = arg3;
                        }
                    }
                    arg5 += var11;
                }
            }
        } else if (arg4 == 3) {
            if (arg1 == 0) {
                for (int var20 = arg7 - 1; var20 >= 0; var20--) {
                    for (int var21 = arg6 - 1; var21 >= 0; var21--) {
                        if (var20 >> 1 < var21) {
                            arg0[arg5++] = arg8;
                        } else {
                            arg0[arg5++] = arg3;
                        }
                    }
                    arg5 += var11;
                }
            } else if (arg1 == 1) {
                for (int var22 = arg7 - 1; var22 >= 0; var22--) {
                    for (int var23 = 0; var23 < arg6; var23++) {
                        if (var22 << 1 <= var23) {
                            arg0[arg5++] = arg3;
                        } else {
                            arg0[arg5++] = arg8;
                        }
                    }
                    arg5 += var11;
                }
            } else if (arg1 == 2) {
                for (int var24 = 0; var24 < arg7; var24++) {
                    for (int var25 = 0; var25 < arg6; var25++) {
                        if (var25 <= var24 >> 1) {
                            arg0[arg5++] = arg3;
                        } else {
                            arg0[arg5++] = arg8;
                        }
                    }
                    arg5 += var11;
                }
            } else if (arg1 == 3) {
                for (int var26 = 0; var26 < arg7; var26++) {
                    for (int var27 = arg6 - 1; var27 >= 0; var27--) {
                        if (var27 < var26 << 1) {
                            arg0[arg5++] = arg8;
                        } else {
                            arg0[arg5++] = arg3;
                        }
                    }
                    arg5 += var11;
                }
            }
        } else if (arg4 == 4) {
            if (arg1 == 0) {
                for (int var60 = arg7 - 1; var60 >= 0; var60--) {
                    for (int var61 = 0; var61 < arg6; var61++) {
                        if (var61 < var60 >> 1) {
                            arg0[arg5++] = arg8;
                        } else {
                            arg0[arg5++] = arg3;
                        }
                    }
                    arg5 += var11;
                }
            } else if (arg1 == 1) {
                for (int var62 = 0; var62 < arg7; var62++) {
                    for (int var63 = 0; var63 < arg6; var63++) {
                        if (var63 > var62 << 1) {
                            arg0[arg5++] = arg8;
                        } else {
                            arg0[arg5++] = arg3;
                        }
                    }
                    arg5 += var11;
                }
            } else if (arg1 == 2) {
                for (int var64 = 0; var64 < arg7; var64++) {
                    for (int var65 = arg6 - 1; var65 >= 0; var65--) {
                        if (var64 >> 1 <= var65) {
                            arg0[arg5++] = arg3;
                        } else {
                            arg0[arg5++] = arg8;
                        }
                    }
                    arg5 += var11;
                }
            } else if (arg1 == 3) {
                for (int var66 = arg7 - 1; var66 >= 0; var66--) {
                    for (int var67 = arg6 - 1; var67 >= 0; var67--) {
                        if (var67 <= var66 << 1) {
                            arg0[arg5++] = arg3;
                        } else {
                            arg0[arg5++] = arg8;
                        }
                    }
                    arg5 += var11;
                }
            }
        } else if (arg4 != 5) {
            if (arg4 == 6) {
                if (arg1 == 0) {
                    for (int var28 = 0; var28 < arg7; var28++) {
                        for (int var29 = 0; var29 < arg6; var29++) {
                            if (arg6 / 2 >= var29) {
                                arg0[arg5++] = arg3;
                            } else {
                                arg0[arg5++] = arg8;
                            }
                        }
                        arg5 += var11;
                    }
                    return;
                }
                if (arg1 == 1) {
                    for (int var34 = 0; var34 < arg7; var34++) {
                        for (int var35 = 0; var35 < arg6; var35++) {
                            if (arg7 / 2 >= var34) {
                                arg0[arg5++] = arg3;
                            } else {
                                arg0[arg5++] = arg8;
                            }
                        }
                        arg5 += var11;
                    }
                    return;
                }
                if (arg1 == 2) {
                    for (int var30 = 0; var30 < arg7; var30++) {
                        for (int var31 = 0; var31 < arg6; var31++) {
                            if (arg6 / 2 <= var31) {
                                arg0[arg5++] = arg3;
                            } else {
                                arg0[arg5++] = arg8;
                            }
                        }
                        arg5 += var11;
                    }
                    return;
                }
                if (arg1 == 3) {
                    for (int var32 = 0; var32 < arg7; var32++) {
                        for (int var33 = 0; var33 < arg6; var33++) {
                            if (arg7 / 2 > var32) {
                                arg0[arg5++] = arg8;
                            } else {
                                arg0[arg5++] = arg3;
                            }
                        }
                        arg5 += var11;
                    }
                    return;
                }
            }
            if (arg4 == 7) {
                if (arg1 == 0) {
                    for (int var50 = 0; var50 < arg7; var50++) {
                        for (int var51 = 0; var51 < arg6; var51++) {
                            if (var51 <= var50 - arg7 / 2) {
                                arg0[arg5++] = arg3;
                            } else {
                                arg0[arg5++] = arg8;
                            }
                        }
                        arg5 += var11;
                    }
                    return;
                }
                if (arg1 == 1) {
                    for (int var36 = arg7 - 1; var36 >= 0; var36--) {
                        for (int var37 = 0; var37 < arg6; var37++) {
                            if (var36 - arg7 / 2 < var37) {
                                arg0[arg5++] = arg8;
                            } else {
                                arg0[arg5++] = arg3;
                            }
                        }
                        arg5 += var11;
                    }
                    return;
                }
                if (arg1 == 2) {
                    for (int var38 = arg7 - 1; var38 >= 0; var38--) {
                        for (int var39 = arg6 - 1; var39 >= 0; var39--) {
                            if (var38 - arg7 / 2 < var39) {
                                arg0[arg5++] = arg8;
                            } else {
                                arg0[arg5++] = arg3;
                            }
                        }
                        arg5 += var11;
                    }
                    return;
                }
                if (arg1 == 3) {
                    for (int var48 = 0; var48 < arg7; var48++) {
                        for (int var49 = arg6 - 1; var49 >= 0; var49--) {
                            if (var49 <= var48 - arg7 / 2) {
                                arg0[arg5++] = arg3;
                            } else {
                                arg0[arg5++] = arg8;
                            }
                        }
                        arg5 += var11;
                    }
                    return;
                }
            }
            if (arg4 == 8) {
                if (arg1 == 0) {
                    for (int var46 = 0; var46 < arg7; var46++) {
                        for (int var47 = 0; var47 < arg6; var47++) {
                            if (var47 < var46 - arg7 / 2) {
                                arg0[arg5++] = arg8;
                            } else {
                                arg0[arg5++] = arg3;
                            }
                        }
                        arg5 += var11;
                    }
                    return;
                }
                if (arg1 == 1) {
                    for (int var40 = arg7 - 1; var40 >= 0; var40--) {
                        for (int var41 = 0; var41 < arg6; var41++) {
                            if (var41 >= var40 - arg7 / 2) {
                                arg0[arg5++] = arg3;
                            } else {
                                arg0[arg5++] = arg8;
                            }
                        }
                        arg5 += var11;
                    }
                    return;
                }
                if (arg1 == 2) {
                    for (int var44 = arg7 - 1; var44 >= 0; var44--) {
                        for (int var45 = arg6 - 1; var45 >= 0; var45--) {
                            if (var44 - arg7 / 2 <= var45) {
                                arg0[arg5++] = arg3;
                            } else {
                                arg0[arg5++] = arg8;
                            }
                        }
                        arg5 += var11;
                    }
                    return;
                }
                if (arg1 == 3) {
                    for (int var42 = 0; var42 < arg7; var42++) {
                        for (int var43 = arg6 - 1; var43 >= 0; var43--) {
                            if (var42 - arg7 / 2 > var43) {
                                arg0[arg5++] = arg8;
                            } else {
                                arg0[arg5++] = arg3;
                            }
                        }
                        arg5 += var11;
                    }
                    return;
                }
            }
        } else if (arg1 == 0) {
            for (int var58 = arg7 - 1; var58 >= 0; var58--) {
                for (int var59 = arg6 - 1; var59 >= 0; var59--) {
                    if (var58 >> 1 <= var59) {
                        arg0[arg5++] = arg3;
                    } else {
                        arg0[arg5++] = arg8;
                    }
                }
                arg5 += var11;
            }
        } else if (arg1 == 1) {
            for (int var52 = arg7 - 1; var52 >= 0; var52--) {
                for (int var53 = 0; var53 < arg6; var53++) {
                    if (var53 <= var52 << 1) {
                        arg0[arg5++] = arg3;
                    } else {
                        arg0[arg5++] = arg8;
                    }
                }
                arg5 += var11;
            }
        } else if (arg1 == 2) {
            for (int var56 = 0; var56 < arg7; var56++) {
                for (int var57 = 0; var57 < arg6; var57++) {
                    if (var56 >> 1 > var57) {
                        arg0[arg5++] = arg8;
                    } else {
                        arg0[arg5++] = arg3;
                    }
                }
                arg5 += var11;
            }
        } else if (arg1 == 3) {
            for (int var54 = 0; var54 < arg7; var54++) {
                for (int var55 = arg6 - 1; var55 >= 0; var55--) {
                    if (var55 > var54 << 1) {
                        arg0[arg5++] = arg8;
                    } else {
                        arg0[arg5++] = arg3;
                    }
                }
                arg5 += var11;
            }
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(JI)V", line = 1273)
    public static final void method145(long arg0, int arg1) {
        if (arg0 <= 0L || arg1 >= -26) {
            return;
        }
        if (arg0 % 10L == 0L) {
            class14.method80(arg0 - 1L, (byte) -118);
            class14.method80(1L, (byte) -66);
        } else {
            class14.method80(arg0, (byte) -59);
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "k", descriptor = "(I)V", line = 1301)
    private static final void method146(int arg0) {
        if (class11.field78 != null) {
            class17 var1 = class11.field78;
            synchronized (class11.field78) {
                class11.field78 = null;
            }
        }
        if (arg0 != 160) {
            field254 = null;
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(ILjava/lang/String;)[B", line = 1319)
    private final byte[] method147(int arg0, String arg1) throws IOException {
        File var3 = new File(arg1);
        if (!var3.exists()) {
            return null;
        }
        int var4 = (int) var3.length();
        byte[] var5 = new byte[var4];
        if (arg0 > -79) {
            return (byte[]) null;
        } else {
            DataInputStream var6 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg1)));
            var6.readFully(var5, 0, var4);
            var6.close();
            return var5;
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "b", descriptor = "(B)V", line = 1342)
    public final void method70(byte arg0) {
        method146(160);
        class25.method166((byte) 63);
        try {
            this.field244 = null;
            this.field277 = null;
            this.field255 = null;
            this.field222 = null;
            this.field246 = null;
            this.field239 = null;
            this.field216 = null;
            this.field213 = null;
            this.field234 = null;
            this.field217 = null;
            this.field245 = null;
            this.field251 = null;
            this.field226 = null;
            this.field262 = null;
            this.field271 = null;
            this.field237 = null;
            this.field247 = null;
            this.field218 = null;
            int var2 = 11 / ((37 - arg0) / 39);
            this.field240 = null;
            this.field264 = null;
            this.field250 = null;
            this.field230 = null;
            this.field253 = null;
            System.gc();
        } catch (Throwable var4) {
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "l", descriptor = "(I)V", line = 1386)
    private final void method148(int arg0) {
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
        String[] var6 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "d:/windows/", "d:/winnt/", "e:/windows/", "e:/winnt/", "f:/windows/", "f:/winnt/", "c:/", var3, "/tmp/", "" };
        if (arg0 >= -18) {
            this.method138(null, 110, null);
        }
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
                        class25.field290 = var8 + var5 + "/rsmap/";
                        return;
                    }
                }
            } catch (Exception var14) {
            }
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "b", descriptor = "(I)V", line = 1455)
    public final void method60(int arg0) {
        if (arg0 != 30 || !class22.field190) {
            return;
        }
        if (this.field215) {
            this.field215 = false;
            class1.field16 = true;
            class8.method49();
            int var2 = (int) (503.0D / this.field252) + class20.field181;
            int var3 = class14.field115 + (int) (635.0D / this.field252);
            int var4 = class14.field115 - (int) (635.0D / this.field252);
            int var5 = class20.field181 - (int) (503.0D / this.field252);
            this.method159(503, 0, var4, var3, var5, 1, var2, 635, 0);
            if (this.field266) {
                this.field216.method203(this.field258, this.field248);
                class8.method44(this.field257 * var4 / class27.field312 + this.field258, this.field248 - -(this.field268 * var5 / class4.field30), (var3 - var4) * this.field257 / class27.field312, (var2 - var5) * this.field268 / class4.field30, 16711680, 128);
                class8.method48(this.field257 * var4 / class27.field312 + this.field258, this.field268 * var5 / class4.field30 + this.field248, (var3 - var4) * this.field257 / class27.field312, (var2 - var5) * this.field268 / class4.field30, 16711680);
                if (this.field275 > 0 && this.field275 % 10 < 5) {
                    for (int var6 = 0; var6 < this.field265; var6++) {
                        if (this.field222[var6] == this.field263) {
                            int var7 = this.field237[var6] * this.field268 / class4.field30 + this.field248;
                            int var8 = this.field218[var6] * this.field257 / class27.field312 + this.field258;
                            class8.method41(var8, var7, 2, 16776960, 256);
                        }
                    }
                }
            }
            if (this.field269) {
                this.method154(18, class11.field85, 5592405, this.field242, (byte) -27, 10066329, 7829367, this.field224, this.field259);
                this.method154(this.field219 - 36, class11.field82, 5592405, this.field242, (byte) -27, 10066329, 7829367, this.field224 + 18, this.field259);
                this.method154(18, class25.field280, 5592405, this.field242, (byte) -27, 10066329, 7829367, this.field224 + this.field219 - 18, this.field259);
                int var9 = this.field224 + 3 + 18;
                for (int var10 = 0; var10 < 25; var10++) {
                    if (this.field226.length > this.field214 + var10 && this.field214 + var10 < this.field255.length) {
                        if (this.field255[this.field214 + var10].method199(class30.field325, -123)) {
                            continue;
                        }
                        this.field226[var10 + this.field214].method204(this.field259 + 3, var9);
                        this.field247.method54(this.field255[this.field214 + var10], this.field259 + 21, var9 + 14, 0);
                        int var11 = 16777215;
                        if (var10 + this.field214 == this.field223) {
                            var11 = 12298922;
                        }
                        if (this.field275 > 0 && this.field275 % 10 < 5 && this.field214 + var10 == this.field263) {
                            var11 = 16776960;
                        }
                        this.field247.method54(this.field255[this.field214 + var10], this.field259 + 20, var9 - -13, var11);
                    }
                    var9 += 17;
                }
            }
            if (class18.field152.length == 1) {
                this.method154(18, class6.field56, this.field270, this.field257, (byte) -27, this.field261, this.field228, this.field248 + this.field268, this.field258);
                this.method154(18, class30.field326, this.field270, this.field242, (byte) -27, this.field261, this.field228, this.field224 + this.field219, this.field259);
                if (this.field278 == 3.0D) {
                    this.method154(30, class27.field307, this.field229, 50, (byte) -27, this.field227, this.field233, 471, 170);
                } else {
                    this.method154(30, class27.field307, this.field270, 50, (byte) -27, this.field261, this.field228, 471, 170);
                }
                if (this.field278 == 4.0D) {
                    this.method154(30, class17.field149, this.field229, 50, (byte) -27, this.field227, this.field233, 471, 230);
                } else {
                    this.method154(30, class17.field149, this.field270, 50, (byte) -27, this.field261, this.field228, 471, 230);
                }
                if (this.field278 == 6.0D) {
                    this.method154(30, class12.field95, this.field229, 50, (byte) -27, this.field227, this.field233, 471, 290);
                } else {
                    this.method154(30, class12.field95, this.field270, 50, (byte) -27, this.field261, this.field228, 471, 290);
                }
                if (this.field278 == 8.0D) {
                    this.method154(30, class12.field94, this.field229, 50, (byte) -27, this.field227, this.field233, 471, 350);
                } else {
                    this.method154(30, class12.field94, this.field270, 50, (byte) -27, this.field261, this.field228, 471, 350);
                }
            } else {
                this.method154(18, class6.field56, this.field270, this.field257, (byte) -27, this.field261, this.field228, this.field268 + this.field248, this.field258);
                this.method154(18, class30.field326, this.field270, this.field242, (byte) -27, this.field261, this.field228, this.field224 + this.field219, this.field259);
                this.method152(this.field228, arg0 ^ 0xFFFFFF9A);
                if (this.field278 == 3.0D) {
                    this.method154(30, class27.field307, this.field229, 50, (byte) -27, this.field227, this.field233, 451, 170);
                } else {
                    this.method154(30, class27.field307, this.field270, 50, (byte) -27, this.field261, this.field228, 451, 170);
                }
                if (this.field278 == 4.0D) {
                    this.method154(30, class17.field149, this.field229, 50, (byte) -27, this.field227, this.field233, 451, 230);
                } else {
                    this.method154(30, class17.field149, this.field270, 50, (byte) -27, this.field261, this.field228, 451, 230);
                }
                if (this.field278 == 6.0D) {
                    this.method154(30, class12.field95, this.field229, 50, (byte) -27, this.field227, this.field233, 451, 290);
                } else {
                    this.method154(30, class12.field95, this.field270, 50, (byte) -27, this.field261, this.field228, 451, 290);
                }
                if (this.field278 == 8.0D) {
                    this.method154(30, class12.field94, this.field229, 50, (byte) -27, this.field227, this.field233, 451, 350);
                } else {
                    this.method154(30, class12.field94, this.field270, 50, (byte) -27, this.field261, this.field228, 451, 350);
                }
            }
        }
        if (class1.field16) {
            this.method158(arg0 - 108);
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(I)V", line = 1608)
    public final void method58(int arg0) {
        method139((byte) -51);
        class14.method81((byte) -103);
        int var2 = -73 % ((arg0 - 57) / 61);
        class31.method182((byte) 101);
        class17.method98(-64);
        class30.method179(-1);
        class19.method114((byte) 30);
        class11.method64(7202);
        class27.method172(false);
        class22.method128(24867);
        class24.method137(-123);
        class26.method168(4);
        class3.method9();
        class18.method100((byte) 120);
        class6.method31(false);
        class4.method18((byte) -123);
        class28.method174(0);
        class8.method45();
        class25.method164((byte) -64);
        class23.method133(12670);
        class20.method118((byte) -94);
        class33.method208(71);
        class12.method74(68);
        class7.method40(0);
        class1.method2(true);
        class13.method77((byte) 120);
        class21.method125();
        class34.method210(false);
        this.field262 = null;
        this.field264 = null;
        this.field222 = null;
        this.field239 = null;
        this.field238 = null;
        this.field255 = null;
        this.field226 = null;
        this.field244 = null;
        this.field218 = null;
        this.field276 = null;
        this.field240 = null;
        this.field246 = null;
        this.field250 = null;
        this.field256 = null;
        this.field260 = null;
        this.field237 = null;
        this.field230 = null;
        this.field236 = null;
        this.field245 = null;
        this.field234 = null;
        this.field217 = null;
        this.field247 = null;
        this.field271 = null;
        this.field277 = null;
        this.field213 = null;
        this.field253 = null;
        this.field274 = null;
        this.field225 = null;
        this.field216 = null;
        this.field251 = null;
        this.field273 = null;
        if (class11.field89) {
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "d", descriptor = "(II)I", line = 1674)
    private final int method149(int arg0, int arg1) {
        arg1++;
        if (arg0 != 0) {
            this.method153(null, null, -17);
        }
        if (arg1 >= class18.field152.length) {
            arg1 = 0;
        }
        return arg1;
    }

    @OriginalMember(owner = "mapview!mapview", name = "h", descriptor = "(I)V", line = 1695)
    public final void method68(int arg0) {
        if (!class22.field190) {
            return;
        }
        if (class14.field114) {
            class26.method169(class12.field90, -23466);
            class7.method37((byte) -91, class12.field90);
            this.method65(-79);
            class19.method108(class12.field90, false);
            class1.method3(class12.field90, 300);
        }
        class33.method207(-12415);
        class4.method19(0);
        if (class14.field111[96]) {
            class14.field115 = (int) ((double) class14.field115 - 16.0D / this.field252);
            this.field215 = true;
        }
        if (class14.field111[97]) {
            class14.field115 = (int) (16.0D / this.field252 + (double) class14.field115);
            this.field215 = true;
        }
        if (class14.field111[98]) {
            class20.field181 = (int) ((double) class20.field181 - 16.0D / this.field252);
            this.field215 = true;
        }
        if (class14.field111[99]) {
            class20.field181 = (int) (16.0D / this.field252 + (double) class20.field181);
            this.field215 = true;
        }
        while (true) {
            do {
                if (!class4.method16(1)) {
                    int var2 = class34.field364;
                    int var3 = class25.field289;
                    int var4 = class20.field178;
                    int var5 = class24.field204;
                    int var6 = class24.field201;
                    int var7 = class11.field81;
                    if (arg0 > -70) {
                        return;
                    }
                    if (var2 == 1) {
                        this.field249 = var7;
                        this.field220 = var6;
                        this.field235 = class14.field115;
                        this.field232 = class20.field181;
                        if (class18.field152.length == 1) {
                            if (var6 > 170 && var6 < 220 && var7 > 471 && var7 < 503) {
                                this.field220 = -1;
                                this.field278 = 3.0D;
                            }
                            if (var6 > 230 && var6 < 280 && var7 > 471 && var7 < 503) {
                                this.field220 = -1;
                                this.field278 = 4.0D;
                            }
                            if (var6 > 290 && var6 < 340 && var7 > 471 && var7 < 503) {
                                this.field278 = 6.0D;
                                this.field220 = -1;
                            }
                            if (var6 > 350 && var6 < 400 && var7 > 471 && var7 < 503) {
                                this.field278 = 8.0D;
                                this.field220 = -1;
                            }
                        } else {
                            if (var6 > 170 && var6 < 220 && var7 > 451 && var7 < 483) {
                                this.field220 = -1;
                                this.field278 = 3.0D;
                            }
                            if (var6 > 230 && var6 < 280 && var7 > 451 && var7 < 483) {
                                this.field220 = -1;
                                this.field278 = 4.0D;
                            }
                            if (var6 > 290 && var6 < 340 && var7 > 451 && var7 < 483) {
                                this.field278 = 6.0D;
                                this.field220 = -1;
                            }
                            if (var6 > 350 && var6 < 400 && var7 > 451 && var7 < 483) {
                                this.field278 = 8.0D;
                                this.field220 = -1;
                            }
                            if (var6 > 170 && var6 < 400 && var7 > 483 && var7 < 503) {
                                this.method152(this.field233, 117);
                                this.method158(-94);
                                this.method142((byte) 122);
                                this.field220 = -1;
                            }
                        }
                        this.field215 = true;
                        this.field243 = false;
                        if (var6 > this.field259 && this.field224 + this.field219 < var7 && this.field259 + this.field242 > var6 && var7 < 503) {
                            this.field269 = !this.field269;
                            this.field220 = -1;
                        }
                        if (this.field258 < var6 && this.field268 + this.field248 < var7 && var6 < this.field258 + this.field257 && var7 < 503) {
                            this.field220 = -1;
                            this.field266 = !this.field266;
                        }
                        if (this.field269) {
                            if (this.field259 < var6 && this.field224 < var7 && var6 < this.field259 + this.field242 && this.field224 + 18 > var7 && this.field241 > 0) {
                                this.field241 -= 25;
                            }
                            if (var6 > this.field259 && this.field224 < var7 && var6 < this.field259 + this.field242 && var7 < this.field224 + this.field219) {
                                this.field220 = -1;
                            }
                            if (var6 > this.field259 && this.field224 + this.field219 - 18 < var7 && var6 < this.field259 + this.field242 && var7 < this.field224 + this.field219 && this.field241 < 50) {
                                this.field241 += 25;
                            }
                        }
                        if (this.field266 && this.field258 < var6 && var7 > this.field248 && var6 < this.field258 + this.field257 && var7 < this.field268 + this.field248) {
                            this.field243 = true;
                            class20.field181 = (var7 - this.field248) * class4.field30 / this.field268;
                            class14.field115 = (var6 - this.field258) * class27.field312 / this.field257;
                            this.field220 = -1;
                        }
                    }
                    if (this.field269) {
                        this.field223 = -1;
                        if (this.field259 < var5 && var5 < this.field259 + this.field242) {
                            int var8 = this.field224 + 5 + 21;
                            for (int var9 = 0; var9 < 25; var9++) {
                                if (this.field214 + var9 >= this.field255.length || !this.field255[this.field214 + var9].method199(class30.field325, -123)) {
                                    if (var8 <= var4 && var4 < var8 + 17) {
                                        this.field223 = this.field214 + var9;
                                        if (var2 == 1) {
                                            this.field263 = this.field214 + var9;
                                            this.field275 = 50;
                                        }
                                    }
                                    var8 += 17;
                                }
                            }
                        }
                        if (this.field223 != this.field221) {
                            this.field215 = true;
                            this.field221 = this.field223;
                        }
                    }
                    if (var3 == 1 && this.field266 && this.field243) {
                        this.field215 = true;
                        int var10 = var4;
                        int var11 = var5;
                        if (this.field258 > var5) {
                            var11 = this.field258;
                        } else if (var5 > this.field258 + this.field257) {
                            var11 = this.field258 + this.field257;
                        }
                        if (var4 < this.field248) {
                            var10 = this.field248;
                        } else if (var4 > this.field268 + this.field248) {
                            var10 = this.field268 + this.field248;
                        }
                        class14.field115 = (var11 - this.field258) * class27.field312 / this.field257;
                        class20.field181 = (var10 - this.field248) * class4.field30 / this.field268;
                    } else {
                        this.field243 = false;
                    }
                    if (var3 == 1 && this.field220 != -1) {
                        class20.field181 = (int) ((double) (this.field249 - var4) * 2.0D / this.field278) + this.field232;
                        class14.field115 = (int) ((double) (this.field220 - var5) * 2.0D / this.field278) + this.field235;
                        this.field215 = true;
                    }
                    if (this.field252 < this.field278) {
                        this.field252 /= 30.0D;
                        if (this.field252 > this.field278) {
                            this.field252 = this.field278;
                        }
                        this.field215 = true;
                    }
                    if (this.field252 > this.field278) {
                        this.field252 /= 30.0D;
                        this.field215 = true;
                        if (this.field252 < this.field278) {
                            this.field252 = this.field278;
                        }
                    }
                    if (this.field241 > this.field214) {
                        this.field215 = true;
                        this.field214++;
                    }
                    int var12 = (int) (635.0D / this.field252) + class14.field115;
                    if (this.field214 > this.field241) {
                        this.field215 = true;
                        this.field214--;
                    }
                    int var13 = class14.field115 - (int) (635.0D / this.field252);
                    if (this.field275 > 0) {
                        this.field275--;
                        this.field215 = true;
                    }
                    int var14 = (int) (503.0D / this.field252) + class20.field181;
                    if (var13 < 48) {
                        class14.field115 = (int) (635.0D / this.field252) + 48;
                    }
                    int var15 = class20.field181 - (int) (503.0D / this.field252);
                    if (class27.field312 - 48 < var12) {
                        class14.field115 = class27.field312 - (int) (635.0D / this.field252) - 48;
                    }
                    if (var15 < 48) {
                        class20.field181 = (int) (503.0D / this.field252) + 48;
                    }
                    if (var14 > class4.field30 - 48) {
                        class20.field181 = class4.field30 - (int) (503.0D / this.field252) - 48;
                    }
                    return;
                }
                if (class34.field363 == 49) {
                    this.field215 = true;
                    this.field278 = 3.0D;
                }
                if (class34.field363 == 50) {
                    this.field215 = true;
                    this.field278 = 4.0D;
                }
                if (class34.field363 == 51) {
                    this.field215 = true;
                    this.field278 = 6.0D;
                }
                if (class34.field363 == 52) {
                    this.field215 = true;
                    this.field278 = 8.0D;
                }
                if (class34.field363 == 107 || class34.field363 == 75) {
                    this.field215 = true;
                    this.field269 = !this.field269;
                }
            } while (class34.field363 != 111 && class34.field363 != 79);
            this.field215 = true;
            this.field266 = !this.field266;
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(BLjava/lang/String;[B)Z", line = 2079)
    private final boolean method150(byte arg0, String arg1, byte[] arg2) {
        if (arg2 == null) {
            return false;
        }
        try {
            MessageDigest var4 = MessageDigest.getInstance("SHA");
            var4.reset();
            var4.update(arg2);
            byte[] var5 = var4.digest();
            if (arg1 == "main_file_cache.dat0") {
                if (var5[0] != -20 || var5[1] != -12 || var5[2] != 30 || var5[3] != -117 || var5[4] != 116 || var5[5] != -60 || var5[6] != -4 || var5[7] != 75 || var5[8] != -119 || var5[9] != -24 || var5[10] != -66 || var5[11] != 127 || var5[12] != -56 || var5[13] != 100 || var5[14] != -127 || var5[15] != -98 || var5[16] != 106 || var5[17] != -32 || var5[18] != 127 || var5[19] != -8) {
                    return false;
                }
            } else if (var5[0] != -92 || var5[1] != 39 || var5[2] != 64 || var5[3] != -65 || var5[4] != 55 || var5[5] != 63 || var5[6] != -117 || var5[7] != 11 || var5[8] != -119 || var5[9] != 48 || var5[10] != 21 || var5[11] != -1 || var5[12] != -64 || var5[13] != 114 || var5[14] != 118 || var5[15] != 40 || var5[16] != 75 || var5[17] != 108 || var5[18] != -94 || var5[19] != 27) {
                return false;
            }
            if (arg0 <= 4) {
                this.method153(null, null, 86);
            }
            return true;
        } catch (Exception var7) {
            this.method69((byte) -53, "sha");
            return false;
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "([[B[[B[[B[BI)V", line = 2120)
    private final void method151(byte[][] arg0, byte[][] arg1, byte[][] arg2, byte[] arg3, int arg4) {
        int var6 = 0;
        while (true) {
            while (var6 < arg3.length) {
                int var7 = (arg3[var6++] & 0xFF) * 64 - class34.field393;
                int var8 = (arg3[var6++] & 0xFF) * 64 - class26.field300;
                if (var7 > 0 && var8 > 0 && class27.field312 > var7 + 64 && class4.field30 > var8 + 64) {
                    for (int var9 = 0; var9 < 64; var9++) {
                        byte[] var10 = arg0[var7 + var9];
                        byte[] var11 = arg2[var7 + var9];
                        byte[] var12 = arg1[var7 + var9];
                        int var13 = class4.field30 - var8 - 1;
                        for (int var14 = -64; var14 < 0; var14++) {
                            while (true) {
                                int var15 = arg3[var6++] & 0xFF;
                                if (var15 == 0) {
                                    var13--;
                                    break;
                                }
                                if (var15 < 29) {
                                    var10[var13] = (byte) var15;
                                } else if (var15 < 160) {
                                    var12[var13] = (byte) (var15 - 28);
                                } else {
                                    var11[var13] = (byte) (var15 - 159);
                                    if (this.field265 < 1000) {
                                        this.field218[this.field265] = var7 + var9;
                                        this.field237[this.field265] = var13;
                                        this.field222[this.field265] = var15 - 160;
                                        this.field265++;
                                    } else {
                                        class25.method162(new class31[] { class20.field183 }, (byte) 105);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    for (int var16 = 0; var16 < 64; var16++) {
                        byte var18;
                        for (int var17 = -64; var17 < 0; var17++) {
                            do {
                                var18 = arg3[var6++];
                            } while (var18 != 0);
                        }
                    }
                }
            }
            if (arg4 != -20902) {
                this.method149(-58, 86);
            }
            return;
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "init", descriptor = "()V", line = 2243)
    public final void init() {
        if (this.method66(-65)) {
            this.method67(635, -18, class25.field283.method192(97, this).method190(true), 32, 503);
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "e", descriptor = "(II)V", line = 2279)
    private final void method152(int arg0, int arg1) {
        this.method154(18, class18.method102(new class31[] { class6.field53, class6.field55[class14.field107], class19.field167 }, (byte) -36), this.field270, 230, (byte) -27, this.field261, arg0, 483, 170);
        int var3 = 95 / ((78 - arg1) / 37);
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "([[B[BI)V", line = 2304)
    private final void method153(byte[][] arg0, byte[] arg1, int arg2) {
        if (arg2 != 64) {
            this.method142((byte) 68);
        }
        int var4 = 0;
        while (true) {
            while (arg1.length > var4) {
                int var5 = (arg1[var4++] & 0xFF) * 64 - class34.field393;
                int var6 = (arg1[var4++] & 0xFF) * 64 - class26.field300;
                if (var5 > 0 && var6 > 0 && class27.field312 > var5 + 64 && class4.field30 > var6 + 64) {
                    for (int var7 = 0; var7 < 64; var7++) {
                        byte[] var8 = arg0[var5 + var7];
                        int var9 = class4.field30 - var6 - 1;
                        for (int var10 = -64; var10 < 0; var10++) {
                            var8[var9--] = arg1[var4++];
                        }
                    }
                } else {
                    var4 += 4096;
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(B)V", line = 2359)
    public final void method59(byte arg0) {
        class11.method61(19624);
        class19.method108(class12.field90, false);
        class1.method3(class12.field90, 300);
        this.field255 = class17.method99(0);
        class22.method131((byte) -62, null, ++class20.field174 * 10, class24.field205);
        if (arg0 <= 53) {
            return;
        }
        this.method148(-73);
        class18.field163 = this.method140("main_file_cache.idx0", class1.field2, (byte) 93);
        if (class18.field163 == null) {
            return;
        }
        class18.field152 = new class26[1];
        class18.field152[0] = this.method140("main_file_cache.dat0", class14.field112, (byte) 123);
        if (class18.field152[0] == null) {
            return;
        }
        class22.method131((byte) -62, null, ++class20.field174 * 10, class24.field205);
        this.field230 = class28.method173(class11.field82, -55, class26.field301, class18.field163);
        this.field226 = class25.method165(class33.field348, true, class18.field163, class11.field82);
        this.field247 = class24.method134(class11.field82, class4.field22, class18.field163, (byte) 109);
        this.field260 = new class3(11, true, this);
        this.field274 = new class3(12, true, this);
        this.field273 = new class3(14, true, this);
        this.field238 = new class3(17, true, this);
        this.field276 = new class3(19, true, this);
        this.field256 = new class3(22, true, this);
        this.field225 = new class3(26, true, this);
        this.field236 = new class3(30, true, this);
        class22.method131((byte) -62, null, 100, class25.field281);
        this.method142((byte) -107);
        class22.field190 = true;
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(ILt;IIBIIII)V", line = 2407)
    private final void method154(int arg0, class31 arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7, int arg8) {
        class8.method48(arg8, arg7, arg3, arg0, 0);
        int var12 = arg7 + 1;
        int var10 = arg0 - 2;
        int var13 = arg8 + 1;
        int var11 = arg3 - 2;
        class8.method47(var13, var12, var11, var10, arg6);
        class8.method43(var13, var12, var11, arg5);
        class8.method42(var13, var12, var10, arg5);
        if (arg4 != -27) {
            this.field227 = 52;
        }
        class8.method43(var13, var12 + var10 - 1, var11, arg2);
        class8.method42(var11 + var13 - 1, var12, var10, arg2);
        this.field247.method55(arg1, var13 + var11 / 2 + 1, var10 / 2 - -4 + var12 + 1, 0);
        this.field247.method55(arg1, var11 / 2 + var13, var10 / 2 + var12 + 4, 16777215);
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "([[I[[BB[B)V", line = 2433)
    private final void method155(int[][] arg0, byte[][] arg1, byte arg2, byte[] arg3) {
        int var5 = 0;
        if (arg2 != -26) {
            return;
        }
        while (true) {
            while (arg3.length > var5) {
                int var6 = (arg3[var5++] & 0xFF) * 64 - class34.field393;
                int var7 = (arg3[var5++] & 0xFF) * 64 - class26.field300;
                if (var6 > 0 && var7 > 0 && class27.field312 > var6 + 64 && class4.field30 > var7 + 64) {
                    for (int var8 = 0; var8 < 64; var8++) {
                        int[] var9 = arg0[var6 + var8];
                        byte[] var10 = arg1[var6 + var8];
                        int var11 = class4.field30 - var7 - 1;
                        for (int var12 = -64; var12 < 0; var12++) {
                            int var13 = arg3[var5++] & 0xFF;
                            if (var13 == 0) {
                                var9[var11--] = 0;
                            } else {
                                var10[var11] = arg3[var5++];
                                int var14 = this.field217[var13];
                                var9[var11--] = var14;
                            }
                        }
                    }
                } else {
                    for (int var15 = -4096; var15 < 0; var15++) {
                        byte var16 = arg3[var5++];
                        if (var16 != 0) {
                            var5++;
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(I[[I[[B)V", line = 2511)
    private final void method156(int arg0, int[][] arg1, byte[][] arg2) {
        if (arg0 != -19712) {
            this.field242 = -65;
        }
        int var4 = class27.field312;
        int var5 = class4.field30;
        int[] var6 = new int[var5];
        for (int var7 = 0; var7 < var5; var7++) {
            var6[var7] = 0;
        }
        for (int var8 = 5; var8 < var4 - 5; var8++) {
            byte[] var9 = arg2[var8 + 5];
            byte[] var10 = arg2[var8 - 5];
            for (int var11 = 0; var11 < var5; var11++) {
                var6[var11] += this.field245[class7.method38(255, var9[var11])] - this.field245[class7.method38(255, var10[var11])];
            }
            if (var8 > 10 && var8 < var4 - 10) {
                int var12 = 0;
                int var13 = 0;
                int var14 = 0;
                int[] var15 = arg1[var8];
                for (int var16 = 5; var16 < var5 - 5; var16++) {
                    int var17 = var6[var16 - 5];
                    int var18 = var6[var16 + 5];
                    var14 += (var18 & 0x3FF) - (var17 & 0x3FF);
                    var13 += (var18 >> 10 & 0x3FF) - (var17 >> 10 & 0x3FF);
                    var12 += (var18 >> 20) - (var17 >> 20);
                    if (var14 > 0) {
                        var15[var16] = this.method157((double) var13 / 8533.0D, (double) var14 / 8533.0D, (double) var12 / 8533.0D, -128);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(DDDI)I", line = 2585)
    private final int method157(double arg0, double arg1, double arg2, int arg3) {
        double var8 = arg1;
        int var10 = -97 / ((arg3 + 87) / 36);
        double var11 = arg1;
        double var13 = arg1;
        if (arg0 != 0.0D) {
            double var15;
            if (arg1 < 0.5D) {
                var15 = (arg0 + 1.0D) * arg1;
            } else {
                var15 = arg0 + arg1 - arg0 * arg1;
            }
            double var17 = arg1 * 2.0D - var15;
            if (arg2 * 6.0D < 1.0D) {
                var11 = (var15 - var17) * 6.0D * arg2 + var17;
            } else if (arg2 * 2.0D < 1.0D) {
                var11 = var15;
            } else if (arg2 * 3.0D < 2.0D) {
                var11 = (0.6666666666666666D - arg2) * (-var17 + var15) * 6.0D + var17;
            } else {
                var11 = var17;
            }
            double var21 = arg2 + 0.3333333333333333D;
            if (var21 > 1.0D) {
                var21--;
            }
            if (var21 * 6.0D < 1.0D) {
                var8 = (var15 - var17) * 6.0D * var21 + var17;
            } else if (var21 * 2.0D < 1.0D) {
                var8 = var15;
            } else if (var21 * 3.0D < 2.0D) {
                var8 = (var15 - var17) * (-var21 + 0.6666666666666666D) * 6.0D + var17;
            } else {
                var8 = var17;
            }
            double var23 = arg2 - 0.3333333333333333D;
            if (var23 < 0.0D) {
                var23++;
            }
            if (var23 * 6.0D < 1.0D) {
                var13 = (var15 - var17) * 6.0D * var23 + var17;
            } else if (var23 * 2.0D < 1.0D) {
                var13 = var15;
            } else if (var23 * 3.0D < 2.0D) {
                var13 = (var15 - var17) * (0.6666666666666666D - var23) * 6.0D + var17;
            } else {
                var13 = var17;
            }
        }
        int var25 = (int) (var11 * 256.0D);
        int var26 = (int) (var8 * 256.0D);
        int var27 = (int) (var13 * 256.0D);
        return (var25 << 8) + (var26 << 16) + var27;
    }

    @OriginalMember(owner = "mapview!mapview", name = "m", descriptor = "(I)V", line = 2693)
    private final void method158(int arg0) {
        class1.field16 = false;
        try {
            if (arg0 >= -65) {
                return;
            }
            Graphics var2 = class12.field90.getGraphics();
            class34.field384.method78(0, var2, -89, 0);
        } catch (Exception var4) {
            class12.field90.repaint();
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(IIIIIIIII)V", line = 2721)
    private final void method159(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var10 = arg3 - arg2;
        int var11 = arg6 - arg4;
        int var12 = (arg7 - arg1 << 16) / var10;
        int var13 = (arg0 - arg8 << 16) / var11;
        for (int var14 = 0; var14 < var10; var14++) {
            int var15 = var12 * var14 >> 16;
            int var16 = (var14 + 1) * var12 >> 16;
            int var17 = var16 - var15;
            if (var17 > 0) {
                int var18 = arg1 + var16;
                int var19 = arg1 + var15;
                int[] var20 = this.field239[arg2 + var14];
                int[] var21 = this.field240[var14 + arg2];
                byte[] var22 = this.field250[arg2 + var14];
                for (int var23 = 0; var23 < var11; var23++) {
                    int var24 = var13 * var23 >> 16;
                    int var25 = (var23 + 1) * var13 >> 16;
                    int var26 = var25 - var24;
                    if (var26 > 0) {
                        int var27 = arg8 + var24;
                        int var28 = arg8 + var25;
                        int var29 = var20[var23 + arg4];
                        if (var29 == 0) {
                            class8.method47(var19, var27, var18 - var19, -var27 + var28, var21[arg4 + var23]);
                        } else {
                            byte var30 = var22[arg4 + var23];
                            int var31 = var30 & 0xFC;
                            if (var31 == 0 || var17 <= 1 || var26 <= 1) {
                                class8.method47(var19, var27, var17, var26, var29);
                            } else {
                                this.method144(class8.field71, var30 & 0x3, (byte) 119, var29, var31 >> 2, class8.field66 * var27 + var19, var17, var26, var21[arg4 + var23]);
                            }
                        }
                    }
                }
            }
        }
        if (arg7 - arg1 < -arg2 + arg3) {
            return;
        }
        int var32 = 0;
        for (int var33 = 0; var33 < var10; var33++) {
            int var34 = var12 * var33 >> 16;
            int var35 = (var33 + 1) * var12 >> 16;
            int var36 = var35 - var34;
            if (var36 > 0) {
                byte[] var37 = this.field262[arg2 + var33];
                byte[] var38 = this.field277[arg2 + var33];
                byte[] var39 = this.field264[arg2 + var33];
                for (int var40 = 0; var40 < var11; var40++) {
                    int var41 = var13 * var40 >> 16;
                    int var42 = (var40 + 1) * var13 >> 16;
                    int var43 = var42 - var41;
                    if (var43 > 0) {
                        int var44 = var37[arg4 + var40] & 0xFF;
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
                                var44 -= 4;
                                var47 = 13369344;
                            }
                            if (var44 == 1) {
                                class8.method42(var34, var41, var43, var47);
                            } else if (var44 == 2) {
                                class8.method43(var34, var41, var36, var47);
                            } else if (var44 == 3) {
                                class8.method42(var45, var41, var43, var47);
                            } else if (var44 == 4) {
                                class8.method43(var34, var46, var36, var47);
                            } else if (var44 == 9) {
                                class8.method42(var34, var41, var43, 16777215);
                                class8.method43(var34, var41, var36, var47);
                            } else if (var44 == 10) {
                                class8.method42(var45, var41, var43, 16777215);
                                class8.method43(var34, var41, var36, var47);
                            } else if (var44 == 11) {
                                class8.method42(var45, var41, var43, 16777215);
                                class8.method43(var34, var46, var36, var47);
                            } else if (var44 == 12) {
                                class8.method42(var34, var41, var43, 16777215);
                                class8.method43(var34, var46, var36, var47);
                            } else if (var44 == 17) {
                                class8.method43(var34, var41, 1, var47);
                            } else if (var44 == 18) {
                                class8.method43(var45, var41, 1, var47);
                            } else if (var44 == 19) {
                                class8.method43(var45, var46, 1, var47);
                            } else if (var44 == 20) {
                                class8.method43(var34, var46, 1, var47);
                            } else if (var44 == 25) {
                                for (int var48 = 0; var48 < var43; var48++) {
                                    class8.method43(var34 + var48, -var48 + var46, 1, var47);
                                }
                            } else if (var44 == 26) {
                                for (int var49 = 0; var49 < var43; var49++) {
                                    class8.method43(var34 + var49, var41 + var49, 1, var47);
                                }
                            }
                        }
                        int var50 = var39[var40 + arg4] & 0xFF;
                        if (var50 != 0) {
                            this.field230[var50 - 1].method86(var34 - var36 / 2, -(var43 / 2) + var41, var36 * 2, var43 * 2);
                        }
                        int var51 = var38[arg4 + var40] & 0xFF;
                        if (var51 != 0) {
                            this.field251[var32] = var51 - 1;
                            this.field271[var32] = var36 / 2 + var34;
                            this.field244[var32] = var43 / 2 + var41;
                            var32++;
                        }
                    }
                }
            }
        }
        for (int var52 = 0; var52 < var32; var52++) {
            if (this.field226[this.field251[var52]] != null) {
                this.field226[this.field251[var52]].method204(this.field271[var52] - 7, this.field244[var52] - 7);
            }
        }
        if (arg5 != 1) {
            this.field266 = false;
        }
        if (this.field275 > 0) {
            for (int var53 = 0; var53 < var32; var53++) {
                if (this.field251[var53] == this.field263) {
                    this.field226[this.field251[var53]].method204(this.field271[var53] - 7, this.field244[var53] - 7);
                    if (this.field275 % 10 < 5) {
                        class8.method41(this.field271[var53], this.field244[var53], 15, 16776960, 128);
                        class8.method41(this.field271[var53], this.field244[var53], 7, 16777215, 256);
                    }
                }
            }
        }
        if (this.field278 == this.field252 && class17.field151) {
            for (int var54 = 0; var54 < this.field267; var54++) {
                int var55 = this.field246[var54];
                int var56 = this.field234[var54];
                int var57 = var56 - class34.field393;
                int var58 = (arg7 - arg1) * (-arg2 + var57) / (arg3 - arg2) + arg1;
                int var59 = 16777215;
                class3 var60 = null;
                int var61 = this.field213[var54];
                int var62 = class4.field30 + class26.field300 - var55;
                if (var61 == 0) {
                    if (this.field252 == 3.0D) {
                        var60 = this.field260;
                    }
                    if (this.field252 == 4.0D) {
                        var60 = this.field274;
                    }
                    if (this.field252 == 6.0D) {
                        var60 = this.field273;
                    }
                    if (this.field252 == 8.0D) {
                        var60 = this.field238;
                    }
                }
                int var63 = (var62 - arg4) * (-arg8 + arg0) / (arg6 - arg4) + arg8;
                if (var61 == 1) {
                    if (this.field252 == 3.0D) {
                        var60 = this.field273;
                    }
                    if (this.field252 == 4.0D) {
                        var60 = this.field238;
                    }
                    if (this.field252 == 6.0D) {
                        var60 = this.field276;
                    }
                    if (this.field252 == 8.0D) {
                        var60 = this.field256;
                    }
                }
                if (var61 == 2) {
                    if (this.field252 == 3.0D) {
                        var60 = this.field276;
                    }
                    var59 = 16755200;
                    if (this.field252 == 4.0D) {
                        var60 = this.field256;
                    }
                    if (this.field252 == 6.0D) {
                        var60 = this.field225;
                    }
                    if (this.field252 == 8.0D) {
                        var60 = this.field236;
                    }
                }
                if (var60 != null) {
                    class31 var64 = this.field253[var54];
                    int var65 = 1;
                    for (int var66 = 0; var66 < var64.method180((byte) -92); var66++) {
                        if (var64.method198(var66, true) == 47) {
                            var65++;
                        }
                    }
                    int var67 = var63 - var60.method13() * (var65 - 1) / 2;
                    int var68 = var67 + var60.method14() / 2;
                    while (true) {
                        int var69 = var64.method187(47, false);
                        if (var69 == -1) {
                            var60.method10(var64, var58, var68, var59, true);
                            break;
                        }
                        class31 var70 = var64.method200(var69, -99, 0);
                        var60.method10(var70, var58, var68, var59, true);
                        var68 += var60.method13();
                        var64 = var64.method196(arg5 ^ 0xFFFFFFA6, var69 + 1);
                    }
                }
            }
        }
        if (!class26.field295) {
            return;
        }
        for (int var71 = class34.field393 / 64; var71 < (class34.field393 + class27.field312) / 64; var71++) {
            for (int var72 = class26.field300 / 64; var72 < (class4.field30 + class26.field300) / 64; var72++) {
                int var73 = var71 * 64;
                int var74 = var73 - class34.field393;
                int var75 = var72 * 64;
                int var76 = class26.field300 + class4.field30 - var75;
                int var77 = (var76 - arg4 - 64) * (-arg8 + arg0) / (arg6 - arg4) + arg8;
                int var78 = (arg7 - arg1) * (-arg2 + var74) / (arg3 - arg2) + arg1;
                int var79 = (var74 + 64 - arg2) * (-arg1 + arg7) / (arg3 - arg2) + arg1;
                int var80 = (var76 - arg4) * (-arg8 + arg0) / (arg6 - arg4) + arg8;
                class8.method48(var78, var77, var79 - var78, -var77 + var80, 16777215);
                this.field247.method56(class18.method102(new class31[] { class6.method29((byte) 97, var71), class11.field88, class6.method29((byte) -128, var72) }, (byte) 102), var79 - 5, var80 + -5, 16777215);
                if (var71 == 33 && var72 >= 71 && var72 <= 73) {
                    this.field247.method55(class25.field288, (var78 + var79) / 2, (var77 + var80) / 2, 16711680);
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(Ljava/lang/String;[BI)V", line = 3193)
    private final void method160(String arg0, byte[] arg1, int arg2) throws IOException {
        FileOutputStream var4 = new FileOutputStream(arg0);
        var4.write(arg1, arg2, arg1.length);
        var4.close();
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(IILca;I)Lf;", line = 3214)
    public static final class10 method161(int arg0, int arg1, class6 arg2, int arg3) {
        if (arg1 == 7) {
            return class19.method115(arg0, arg2, -61, arg3) ? class14.method83(0) : null;
        } else {
            return (class10) null;
        }
    }
}
