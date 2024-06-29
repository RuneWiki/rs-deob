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
public class mapview extends class15 {

    @OriginalMember(owner = "mapview!mapview", name = "r", descriptor = "[I")
    private int[] field7 = new int[1500];

    @OriginalMember(owner = "mapview!mapview", name = "p", descriptor = "I")
    private int field5 = -1;

    @OriginalMember(owner = "mapview!mapview", name = "m", descriptor = "I")
    private int field2 = 7824964;

    @OriginalMember(owner = "mapview!mapview", name = "s", descriptor = "I")
    private int field8 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "t", descriptor = "I")
    private int field9 = 11141120;

    @OriginalMember(owner = "mapview!mapview", name = "P", descriptor = "I")
    private int field31 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "L", descriptor = "[I")
    private int[] field27 = new int[1500];

    @OriginalMember(owner = "mapview!mapview", name = "Y", descriptor = "I")
    private int field40 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "w", descriptor = "I")
    private int field12 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "u", descriptor = "I")
    private int field10 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "W", descriptor = "I")
    private int field38 = 10027008;

    @OriginalMember(owner = "mapview!mapview", name = "bb", descriptor = "[I")
    private int[] field43 = new int[1500];

    @OriginalMember(owner = "mapview!mapview", name = "I", descriptor = "I")
    private int field24 = 500;

    @OriginalMember(owner = "mapview!mapview", name = "K", descriptor = "I")
    private int field26 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "F", descriptor = "I")
    private int field21 = 470;

    @OriginalMember(owner = "mapview!mapview", name = "G", descriptor = "I")
    private int field22 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "nb", descriptor = "I")
    private int field55 = 13;

    @OriginalMember(owner = "mapview!mapview", name = "T", descriptor = "[I")
    private int[] field35 = new int[1500];

    @OriginalMember(owner = "mapview!mapview", name = "db", descriptor = "I")
    private int field45 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "mb", descriptor = "[I")
    private int[] field54 = new int[this.field24];

    @OriginalMember(owner = "mapview!mapview", name = "B", descriptor = "[I")
    private int[] field17 = new int[1500];

    @OriginalMember(owner = "mapview!mapview", name = "A", descriptor = "D")
    private double field16 = 4.0D;

    @OriginalMember(owner = "mapview!mapview", name = "J", descriptor = "[I")
    private int[] field25 = new int[this.field24];

    @OriginalMember(owner = "mapview!mapview", name = "cb", descriptor = "Z")
    private boolean field44 = false;

    @OriginalMember(owner = "mapview!mapview", name = "sb", descriptor = "I")
    private int field60 = -1;

    @OriginalMember(owner = "mapview!mapview", name = "q", descriptor = "[I")
    private int[] field6 = new int[this.field24];

    @OriginalMember(owner = "mapview!mapview", name = "kb", descriptor = "Z")
    private boolean field52 = false;

    @OriginalMember(owner = "mapview!mapview", name = "vb", descriptor = "I")
    private int field63 = -1;

    @OriginalMember(owner = "mapview!mapview", name = "S", descriptor = "I")
    private int field34 = 140;

    @OriginalMember(owner = "mapview!mapview", name = "lb", descriptor = "I")
    private int field53 = 6706483;

    @OriginalMember(owner = "mapview!mapview", name = "pb", descriptor = "I")
    private int field57 = 8912896;

    @OriginalMember(owner = "mapview!mapview", name = "qb", descriptor = "[I")
    private int[] field58 = new int[1500];

    @OriginalMember(owner = "mapview!mapview", name = "Ab", descriptor = "I")
    private int field68 = 8943445;

    @OriginalMember(owner = "mapview!mapview", name = "wb", descriptor = "I")
    private int field64 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "Bb", descriptor = "D")
    private double field69 = 4.0D;

    @OriginalMember(owner = "mapview!mapview", name = "U", descriptor = "Z")
    private boolean field36 = true;

    @OriginalMember(owner = "mapview!mapview", name = "Db", descriptor = "[Lt;")
    private class31[] field71 = new class31[this.field24];

    @OriginalMember(owner = "mapview!mapview", name = "X", descriptor = "I")
    private int field39 = 5;

    @OriginalMember(owner = "mapview!mapview", name = "xb", descriptor = "Z")
    private boolean field65 = false;

    @OriginalMember(owner = "mapview!mapview", name = "C", descriptor = "Lt;")
    public static class31 field18 = class11.method64(-73, "Cooking Range");

    @OriginalMember(owner = "mapview!mapview", name = "o", descriptor = "I")
    public static volatile int field4 = -1;

    @OriginalMember(owner = "mapview!mapview", name = "ab", descriptor = "I")
    private static int field42 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "R", descriptor = "[[B")
    public static byte[][] field33 = new byte[1000][];

    @OriginalMember(owner = "mapview!mapview", name = "x", descriptor = "I")
    private static int field13;

    @OriginalMember(owner = "mapview!mapview", name = "E", descriptor = "I")
    public static int field20;

    @OriginalMember(owner = "mapview!mapview", name = "M", descriptor = "I")
    private static int field28;

    @OriginalMember(owner = "mapview!mapview", name = "fb", descriptor = "I")
    private int field47;

    @OriginalMember(owner = "mapview!mapview", name = "gb", descriptor = "I")
    private int field48;

    @OriginalMember(owner = "mapview!mapview", name = "jb", descriptor = "I")
    private int field51;

    @OriginalMember(owner = "mapview!mapview", name = "zb", descriptor = "I")
    private static int field67;

    @OriginalMember(owner = "mapview!mapview", name = "Eb", descriptor = "I")
    private int field72;

    @OriginalMember(owner = "mapview!mapview", name = "D", descriptor = "Lja;")
    private class19 field19;

    @OriginalMember(owner = "mapview!mapview", name = "l", descriptor = "Lw;")
    private class34 field1;

    @OriginalMember(owner = "mapview!mapview", name = "y", descriptor = "Lw;")
    private class34 field14;

    @OriginalMember(owner = "mapview!mapview", name = "H", descriptor = "Lw;")
    private class34 field23;

    @OriginalMember(owner = "mapview!mapview", name = "O", descriptor = "Lw;")
    private class34 field30;

    @OriginalMember(owner = "mapview!mapview", name = "eb", descriptor = "Lw;")
    private class34 field46;

    @OriginalMember(owner = "mapview!mapview", name = "hb", descriptor = "Lw;")
    private class34 field49;

    @OriginalMember(owner = "mapview!mapview", name = "ib", descriptor = "Lw;")
    private class34 field50;

    @OriginalMember(owner = "mapview!mapview", name = "rb", descriptor = "Lw;")
    private class34 field59;

    @OriginalMember(owner = "mapview!mapview", name = "ub", descriptor = "Ld;")
    private class7 field62;

    @OriginalMember(owner = "mapview!mapview", name = "Fb", descriptor = "Z")
    public static boolean field73;

    @OriginalMember(owner = "mapview!mapview", name = "Q", descriptor = "[I")
    private int[] field32;

    @OriginalMember(owner = "mapview!mapview", name = "yb", descriptor = "[I")
    private int[] field66;

    @OriginalMember(owner = "mapview!mapview", name = "Z", descriptor = "[Lja;")
    private class19[] field41;

    @OriginalMember(owner = "mapview!mapview", name = "ob", descriptor = "[Lka;")
    private class21[] field56;

    @OriginalMember(owner = "mapview!mapview", name = "tb", descriptor = "[Lt;")
    private class31[] field61;

    @OriginalMember(owner = "mapview!mapview", name = "v", descriptor = "[[B")
    private byte[][] field11;

    @OriginalMember(owner = "mapview!mapview", name = "z", descriptor = "[[B")
    private byte[][] field15;

    @OriginalMember(owner = "mapview!mapview", name = "n", descriptor = "[[B")
    private byte[][] field3;

    @OriginalMember(owner = "mapview!mapview", name = "Cb", descriptor = "[[B")
    private byte[][] field70;

    @OriginalMember(owner = "mapview!mapview", name = "N", descriptor = "[[I")
    private int[][] field29;

    @OriginalMember(owner = "mapview!mapview", name = "V", descriptor = "[[I")
    private int[][] field37;

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(Ljava/lang/String;[BB)V", line = 5)
    private final void method1(String arg0, byte[] arg1, byte arg2) throws IOException {
        FileOutputStream var4 = new FileOutputStream(arg0);
        if (arg2 > -15) {
            this.method25((byte) 59);
        }
        var4.write(arg1, 0, arg1.length);
        var4.close();
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(IB)V", line = 19)
    private final void method2(int arg0, byte arg1) {
        if (arg1 < -83) {
            this.method16(18, 483, this.field68, 170, this.field53, method17(new class31[] { class25.field282, class10.field168[class2.field84], class32.field366 }, -119), false, 230, arg0);
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "<init>", descriptor = "()V", line = 3396)
    public mapview() {
        if (class15.field227) {
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(II)V", line = 60)
    private final void method3(int arg0, int arg1) {
        class26 var3 = class6.field120[arg1];
        class25 var4 = new class25(var3.method188(class9.field140, (byte) -122, class31.field353));
        int var5 = var4.method142(true);
        int var6 = var4.method142(true);
        int var7 = var4.method142(true);
        int var8 = var4.method142(true);
        int var9 = var4.method142(true);
        int var10 = var4.method142(true);
        var4.method139(221);
        this.field47 = 180;
        class32.field370 = var6 * 64;
        class6.field125 = (var7 + 1 - var5) * 64;
        this.field48 = 503 - this.field47 - 20;
        class30.field329 = var5 * 64;
        field13 = var9 * 64 - class30.field329;
        field28 = (var8 - var6) * 64 + 64;
        class8.field136 = field28 + class32.field370 - var10 * 64;
        this.field72 = class6.field125 * this.field47 / field28;
        this.field51 = 635 - this.field72 - 5;
        class25 var11 = new class25(var3.method188(class9.field141, (byte) -106, class31.field353));
        this.field22 = var11.method142(true);
        for (int var12 = 0; var12 < this.field22; var12++) {
            this.field71[var12] = var11.method139(221);
            this.field25[var12] = var11.method142(true);
            this.field54[var12] = var11.method142(true);
            this.field6[var12] = var11.method145(78);
        }
        class25 var13 = new class25(var3.method188(class1.field78, (byte) -66, class31.field353));
        int var14 = var13.method142(true);
        this.field66 = new int[var14 + 1];
        for (int var15 = 0; var15 < var14; var15++) {
            this.field66[var15 + 1] = var13.method144(81);
        }
        int var16 = var13.method142(true);
        this.field32 = new int[var16 + 1];
        if (arg0 >= -3) {
            this.method24(109);
        }
        for (int var17 = 0; var17 < var16; var17++) {
            this.field32[var17 + 1] = var13.method144(83);
        }
        byte[] var18 = var3.method188(class28.field312, (byte) -87, class31.field353);
        byte[][] var19 = new byte[class6.field125][field28];
        this.method26(var18, var19, (byte) 113);
        byte[] var20 = var3.method188(class26.field297, (byte) -67, class31.field353);
        this.field70 = new byte[class6.field125][field28];
        this.field29 = new int[class6.field125][field28];
        this.method4(this.field70, false, var20, this.field29);
        byte[] var21 = var3.method188(class1.field76, (byte) -100, class31.field353);
        this.field3 = new byte[class6.field125][field28];
        this.field10 = 0;
        this.field11 = new byte[class6.field125][field28];
        this.field15 = new byte[class6.field125][field28];
        this.method10(this.field3, this.field15, this.field11, -1, var21);
        this.field37 = new int[class6.field125][field28];
        this.method22(this.field37, (byte) 52, var19);
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "([[BZ[B[[I)V", line = 159)
    private final void method4(byte[][] arg0, boolean arg1, byte[] arg2, int[][] arg3) {
        int var5 = 0;
        while (true) {
            while (arg2.length > var5) {
                int var6 = (arg2[var5++] & 0xFF) * 64 - class30.field329;
                int var7 = (arg2[var5++] & 0xFF) * 64 - class32.field370;
                if (var6 > 0 && var7 > 0 && var6 + 64 < class6.field125 && field28 > var7 + 64) {
                    for (int var8 = 0; var8 < 64; var8++) {
                        byte[] var9 = arg0[var6 + var8];
                        int[] var10 = arg3[var6 + var8];
                        int var11 = field28 - var7 - 1;
                        for (int var12 = -64; var12 < 0; var12++) {
                            int var13 = arg2[var5++] & 0xFF;
                            if (var13 == 0) {
                                var10[var11--] = 0;
                            } else {
                                var9[var11] = arg2[var5++];
                                int var14 = this.field32[var13];
                                var10[var11--] = var14;
                            }
                        }
                    }
                } else {
                    for (int var15 = -4096; var15 < 0; var15++) {
                        byte var16 = arg2[var5++];
                        if (var16 != 0) {
                            var5++;
                        }
                    }
                }
            }
            if (arg1) {
                this.method2(-24, (byte) -73);
            }
            return;
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(IBII[IIIII)V", line = 230)
    private final void method5(int arg0, byte arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg3 == 9) {
            arg3 = 1;
            arg6 = arg6 + 1 & 0x3;
        }
        if (arg3 == 10) {
            arg3 = 1;
            arg6 = arg6 + 3 & 0x3;
        }
        int var10 = class23.field269 - arg8;
        if (arg3 == 11) {
            arg3 = 8;
            arg6 = arg6 + 3 & 0x3;
        }
        if (arg3 == 1) {
            if (arg6 == 0) {
                for (int var73 = 0; var73 < arg7; var73++) {
                    for (int var74 = 0; var74 < arg8; var74++) {
                        if (var74 <= var73) {
                            arg4[arg5++] = arg2;
                        } else {
                            arg4[arg5++] = arg0;
                        }
                    }
                    arg5 += var10;
                }
            } else if (arg6 == 1) {
                for (int var67 = arg7 - 1; var67 >= 0; var67--) {
                    for (int var68 = 0; var68 < arg8; var68++) {
                        if (var67 < var68) {
                            arg4[arg5++] = arg0;
                        } else {
                            arg4[arg5++] = arg2;
                        }
                    }
                    arg5 += var10;
                }
            } else if (arg6 == 2) {
                for (int var71 = 0; var71 < arg7; var71++) {
                    for (int var72 = 0; var72 < arg8; var72++) {
                        if (var71 <= var72) {
                            arg4[arg5++] = arg2;
                        } else {
                            arg4[arg5++] = arg0;
                        }
                    }
                    arg5 += var10;
                }
            } else if (arg6 == 3) {
                for (int var69 = arg7 - 1; var69 >= 0; var69--) {
                    for (int var70 = 0; var70 < arg8; var70++) {
                        if (var69 <= var70) {
                            arg4[arg5++] = arg2;
                        } else {
                            arg4[arg5++] = arg0;
                        }
                    }
                    arg5 += var10;
                }
            }
        } else if (arg3 == 2) {
            if (arg6 == 0) {
                for (int var17 = arg7 - 1; var17 >= 0; var17--) {
                    for (int var18 = 0; var18 < arg8; var18++) {
                        if (var18 <= var17 >> 1) {
                            arg4[arg5++] = arg2;
                        } else {
                            arg4[arg5++] = arg0;
                        }
                    }
                    arg5 += var10;
                }
            } else if (arg6 == 1) {
                for (int var15 = 0; var15 < arg7; var15++) {
                    for (int var16 = 0; var16 < arg8; var16++) {
                        if (var15 << 1 > var16) {
                            arg4[arg5++] = arg0;
                        } else {
                            arg4[arg5++] = arg2;
                        }
                    }
                    arg5 += var10;
                }
            } else if (arg6 == 2) {
                for (int var11 = 0; var11 < arg7; var11++) {
                    for (int var12 = arg8 - 1; var12 >= 0; var12--) {
                        if (var12 <= var11 >> 1) {
                            arg4[arg5++] = arg2;
                        } else {
                            arg4[arg5++] = arg0;
                        }
                    }
                    arg5 += var10;
                }
            } else if (arg6 == 3) {
                for (int var13 = arg7 - 1; var13 >= 0; var13--) {
                    for (int var14 = arg8 - 1; var14 >= 0; var14--) {
                        if (var13 << 1 > var14) {
                            arg4[arg5++] = arg0;
                        } else {
                            arg4[arg5++] = arg2;
                        }
                    }
                    arg5 += var10;
                }
            }
        } else if (arg3 == 3) {
            if (arg6 == 0) {
                for (int var19 = arg7 - 1; var19 >= 0; var19--) {
                    for (int var20 = arg8 - 1; var20 >= 0; var20--) {
                        if (var20 > var19 >> 1) {
                            arg4[arg5++] = arg0;
                        } else {
                            arg4[arg5++] = arg2;
                        }
                    }
                    arg5 += var10;
                }
            } else if (arg6 == 1) {
                for (int var25 = arg7 - 1; var25 >= 0; var25--) {
                    for (int var26 = 0; var26 < arg8; var26++) {
                        if (var25 << 1 > var26) {
                            arg4[arg5++] = arg0;
                        } else {
                            arg4[arg5++] = arg2;
                        }
                    }
                    arg5 += var10;
                }
            } else if (arg6 == 2) {
                for (int var23 = 0; var23 < arg7; var23++) {
                    for (int var24 = 0; var24 < arg8; var24++) {
                        if (var23 >> 1 >= var24) {
                            arg4[arg5++] = arg2;
                        } else {
                            arg4[arg5++] = arg0;
                        }
                    }
                    arg5 += var10;
                }
            } else if (arg6 == 3) {
                for (int var21 = 0; var21 < arg7; var21++) {
                    for (int var22 = arg8 - 1; var22 >= 0; var22--) {
                        if (var21 << 1 > var22) {
                            arg4[arg5++] = arg0;
                        } else {
                            arg4[arg5++] = arg2;
                        }
                    }
                    arg5 += var10;
                }
            }
        } else if (arg3 == 4) {
            if (arg6 == 0) {
                for (int var27 = arg7 - 1; var27 >= 0; var27--) {
                    for (int var28 = 0; var28 < arg8; var28++) {
                        if (var27 >> 1 <= var28) {
                            arg4[arg5++] = arg2;
                        } else {
                            arg4[arg5++] = arg0;
                        }
                    }
                    arg5 += var10;
                }
            } else if (arg6 == 1) {
                for (int var29 = 0; var29 < arg7; var29++) {
                    for (int var30 = 0; var30 < arg8; var30++) {
                        if (var29 << 1 >= var30) {
                            arg4[arg5++] = arg2;
                        } else {
                            arg4[arg5++] = arg0;
                        }
                    }
                    arg5 += var10;
                }
            } else if (arg6 == 2) {
                for (int var31 = 0; var31 < arg7; var31++) {
                    for (int var32 = arg8 - 1; var32 >= 0; var32--) {
                        if (var32 < var31 >> 1) {
                            arg4[arg5++] = arg0;
                        } else {
                            arg4[arg5++] = arg2;
                        }
                    }
                    arg5 += var10;
                }
            } else if (arg6 == 3) {
                for (int var33 = arg7 - 1; var33 >= 0; var33--) {
                    for (int var34 = arg8 - 1; var34 >= 0; var34--) {
                        if (var34 <= var33 << 1) {
                            arg4[arg5++] = arg2;
                        } else {
                            arg4[arg5++] = arg0;
                        }
                    }
                    arg5 += var10;
                }
            }
        } else if (arg3 != 5) {
            if (arg1 <= 91) {
                this.method15(null, null, (byte) -98);
            }
            if (arg3 == 6) {
                if (arg6 == 0) {
                    for (int var57 = 0; var57 < arg7; var57++) {
                        for (int var58 = 0; var58 < arg8; var58++) {
                            if (arg8 / 2 >= var58) {
                                arg4[arg5++] = arg2;
                            } else {
                                arg4[arg5++] = arg0;
                            }
                        }
                        arg5 += var10;
                    }
                    return;
                }
                if (arg6 == 1) {
                    for (int var35 = 0; var35 < arg7; var35++) {
                        for (int var36 = 0; var36 < arg8; var36++) {
                            if (var35 <= arg7 / 2) {
                                arg4[arg5++] = arg2;
                            } else {
                                arg4[arg5++] = arg0;
                            }
                        }
                        arg5 += var10;
                    }
                    return;
                }
                if (arg6 == 2) {
                    for (int var55 = 0; var55 < arg7; var55++) {
                        for (int var56 = 0; var56 < arg8; var56++) {
                            if (arg8 / 2 > var56) {
                                arg4[arg5++] = arg0;
                            } else {
                                arg4[arg5++] = arg2;
                            }
                        }
                        arg5 += var10;
                    }
                    return;
                }
                if (arg6 == 3) {
                    for (int var37 = 0; var37 < arg7; var37++) {
                        for (int var38 = 0; var38 < arg8; var38++) {
                            if (arg7 / 2 <= var37) {
                                arg4[arg5++] = arg2;
                            } else {
                                arg4[arg5++] = arg0;
                            }
                        }
                        arg5 += var10;
                    }
                    return;
                }
            }
            if (arg3 == 7) {
                if (arg6 == 0) {
                    for (int var45 = 0; var45 < arg7; var45++) {
                        for (int var46 = 0; var46 < arg8; var46++) {
                            if (var46 > var45 - arg7 / 2) {
                                arg4[arg5++] = arg0;
                            } else {
                                arg4[arg5++] = arg2;
                            }
                        }
                        arg5 += var10;
                    }
                    return;
                }
                if (arg6 == 1) {
                    for (int var43 = arg7 - 1; var43 >= 0; var43--) {
                        for (int var44 = 0; var44 < arg8; var44++) {
                            if (var43 - arg7 / 2 >= var44) {
                                arg4[arg5++] = arg2;
                            } else {
                                arg4[arg5++] = arg0;
                            }
                        }
                        arg5 += var10;
                    }
                    return;
                }
                if (arg6 == 2) {
                    for (int var39 = arg7 - 1; var39 >= 0; var39--) {
                        for (int var40 = arg8 - 1; var40 >= 0; var40--) {
                            if (var40 <= var39 - arg7 / 2) {
                                arg4[arg5++] = arg2;
                            } else {
                                arg4[arg5++] = arg0;
                            }
                        }
                        arg5 += var10;
                    }
                    return;
                }
                if (arg6 == 3) {
                    for (int var41 = 0; var41 < arg7; var41++) {
                        for (int var42 = arg8 - 1; var42 >= 0; var42--) {
                            if (var42 > var41 - arg7 / 2) {
                                arg4[arg5++] = arg0;
                            } else {
                                arg4[arg5++] = arg2;
                            }
                        }
                        arg5 += var10;
                    }
                    return;
                }
            }
            if (arg3 == 8) {
                if (arg6 == 0) {
                    for (int var53 = 0; var53 < arg7; var53++) {
                        for (int var54 = 0; var54 < arg8; var54++) {
                            if (var54 < var53 - arg7 / 2) {
                                arg4[arg5++] = arg0;
                            } else {
                                arg4[arg5++] = arg2;
                            }
                        }
                        arg5 += var10;
                    }
                    return;
                }
                if (arg6 == 1) {
                    for (int var51 = arg7 - 1; var51 >= 0; var51--) {
                        for (int var52 = 0; var52 < arg8; var52++) {
                            if (var52 < var51 - arg7 / 2) {
                                arg4[arg5++] = arg0;
                            } else {
                                arg4[arg5++] = arg2;
                            }
                        }
                        arg5 += var10;
                    }
                    return;
                }
                if (arg6 == 2) {
                    for (int var49 = arg7 - 1; var49 >= 0; var49--) {
                        for (int var50 = arg8 - 1; var50 >= 0; var50--) {
                            if (var49 - arg7 / 2 > var50) {
                                arg4[arg5++] = arg0;
                            } else {
                                arg4[arg5++] = arg2;
                            }
                        }
                        arg5 += var10;
                    }
                    return;
                }
                if (arg6 == 3) {
                    for (int var47 = 0; var47 < arg7; var47++) {
                        for (int var48 = arg8 - 1; var48 >= 0; var48--) {
                            if (var48 >= var47 - arg7 / 2) {
                                arg4[arg5++] = arg2;
                            } else {
                                arg4[arg5++] = arg0;
                            }
                        }
                        arg5 += var10;
                    }
                    return;
                }
            }
        } else if (arg6 == 0) {
            for (int var59 = arg7 - 1; var59 >= 0; var59--) {
                for (int var60 = arg8 - 1; var60 >= 0; var60--) {
                    if (var60 < var59 >> 1) {
                        arg4[arg5++] = arg0;
                    } else {
                        arg4[arg5++] = arg2;
                    }
                }
                arg5 += var10;
            }
        } else if (arg6 == 1) {
            for (int var65 = arg7 - 1; var65 >= 0; var65--) {
                for (int var66 = 0; var66 < arg8; var66++) {
                    if (var65 << 1 >= var66) {
                        arg4[arg5++] = arg2;
                    } else {
                        arg4[arg5++] = arg0;
                    }
                }
                arg5 += var10;
            }
        } else if (arg6 == 2) {
            for (int var61 = 0; var61 < arg7; var61++) {
                for (int var62 = 0; var62 < arg8; var62++) {
                    if (var62 < var61 >> 1) {
                        arg4[arg5++] = arg0;
                    } else {
                        arg4[arg5++] = arg2;
                    }
                }
                arg5 += var10;
            }
        } else if (arg6 == 3) {
            for (int var63 = 0; var63 < arg7; var63++) {
                for (int var64 = arg8 - 1; var64 >= 0; var64--) {
                    if (var63 << 1 < var64) {
                        arg4[arg5++] = arg0;
                    } else {
                        arg4[arg5++] = arg2;
                    }
                }
                arg5 += var10;
            }
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(Ljava/lang/String;I)[B", line = 1192)
    private final byte[] method6(String arg0, int arg1) throws IOException {
        File var3 = new File(arg0);
        if (!var3.exists()) {
            return null;
        }
        int var4 = (int) var3.length();
        DataInputStream var5 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg0)));
        byte[] var6 = new byte[var4];
        if (arg1 != -1) {
            this.method19(null, -53, null);
        }
        var5.readFully(var6, 0, var4);
        var5.close();
        return var6;
    }

    @OriginalMember(owner = "mapview!mapview", name = "j", descriptor = "(I)V", line = 1220)
    private final void method7(int arg0) {
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
        int var7 = 0;
        if (arg0 != -1) {
            this.method23(-28, 1.3407192460112392D, -1.2206383159394778D, -0.09393312791617724D);
        }
        while (var5.length > var7) {
            try {
                label58: {
                    String var8 = var5[var7];
                    if (var8.length() > 0) {
                        File var9 = new File(var8);
                        if (!var9.exists()) {
                            break label58;
                        }
                    }
                    File var10 = new File(var8 + var6);
                    if (var10.exists() || var10.mkdir()) {
                        File var11 = new File(var10, "rsmap");
                        if (var11.exists() || var11.mkdir()) {
                            class15.field217 = var8 + var6 + "/rsmap/";
                            return;
                        }
                    }
                }
            } catch (Exception var14) {
            }
            var7++;
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "b", descriptor = "(IB)V", line = 1285)
    private final void method8(int arg0, byte arg1) {
        if (class6.field120.length > arg0) {
            this.method3(-61, arg0);
            this.field19 = new class19(this.field72, this.field47);
            this.field19.method106();
            this.method9(field28, this.field47, this.field72, 0, 0, (byte) 31, 0, 0, class6.field125);
            class23.method122(0, 0, this.field72, this.field47, 0);
            class23.method122(1, 1, this.field72 - 2, this.field47 + -2, this.field68);
            class22.field268.method156((byte) -93);
        }
        int var3 = 62 / ((arg1 - 33) / 46);
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(IIIIIBIII)V", line = 1317)
    private final void method9(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, int arg8) {
        int var10 = arg0 - arg6;
        int var11 = arg8 - arg3;
        int var12 = (arg1 - arg4 << 16) / var10;
        int var13 = (arg2 - arg7 << 16) / var11;
        for (int var14 = 0; var14 < var11; var14++) {
            int var15 = (var14 + 1) * var13 >> 16;
            int var16 = var13 * var14 >> 16;
            int var17 = var15 - var16;
            if (var17 > 0) {
                int var18 = arg7 + var15;
                int var19 = arg7 + var16;
                int[] var20 = this.field37[arg3 + var14];
                int[] var21 = this.field29[arg3 + var14];
                byte[] var22 = this.field70[arg3 + var14];
                for (int var23 = 0; var23 < var10; var23++) {
                    int var24 = (var23 + 1) * var12 >> 16;
                    int var25 = var12 * var23 >> 16;
                    int var26 = var24 - var25;
                    if (var26 > 0) {
                        int var27 = arg4 + var25;
                        int var28 = arg4 + var24;
                        int var29 = var21[arg6 + var23];
                        if (var29 == 0) {
                            class23.method119(var19, var27, var18 - var19, -var27 + var28, var20[arg6 + var23]);
                        } else {
                            byte var30 = var22[arg6 + var23];
                            int var31 = var30 & 0xFC;
                            if (var31 == 0 || var17 <= 1 || var26 <= 1) {
                                class23.method119(var19, var27, var17, var26, var29);
                            } else {
                                this.method5(var20[arg6 + var23], (byte) 102, var29, var31 >> 2, class23.field270, class23.field269 * var27 + var19, var30 & 0x3, var26, var17);
                            }
                        }
                    }
                }
            }
        }
        if (arg8 - arg3 > -arg7 + arg2) {
            return;
        }
        int var32 = 0;
        for (int var33 = 0; var33 < var11; var33++) {
            int var34 = (var33 + 1) * var13 >> 16;
            int var35 = var13 * var33 >> 16;
            int var36 = var34 - var35;
            if (var36 > 0) {
                byte[] var37 = this.field3[arg3 + var33];
                byte[] var38 = this.field11[var33 + arg3];
                byte[] var39 = this.field15[arg3 + var33];
                for (int var40 = 0; var40 < var10; var40++) {
                    int var41 = var12 * var40 >> 16;
                    int var42 = (var40 + 1) * var12 >> 16;
                    int var43 = var42 - var41;
                    if (var43 > 0) {
                        int var44 = var37[var40 + arg6] & 0xFF;
                        if (var44 != 0) {
                            int var45;
                            if (var36 == 1) {
                                var45 = var35;
                            } else {
                                var45 = var34 - 1;
                            }
                            int var46;
                            if (var43 == 1) {
                                var46 = var41;
                            } else {
                                var46 = var42 - 1;
                            }
                            int var47 = 13421772;
                            if (var44 >= 5 && var44 <= 8 || var44 >= 13 && var44 <= 16 || var44 >= 21 && var44 <= 24 || var44 == 27 || var44 == 28) {
                                var47 = 13369344;
                                var44 -= 4;
                            }
                            if (var44 == 1) {
                                class23.method118(var35, var41, var43, var47);
                            } else if (var44 == 2) {
                                class23.method120(var35, var41, var36, var47);
                            } else if (var44 == 3) {
                                class23.method118(var45, var41, var43, var47);
                            } else if (var44 == 4) {
                                class23.method120(var35, var46, var36, var47);
                            } else if (var44 == 9) {
                                class23.method118(var35, var41, var43, 16777215);
                                class23.method120(var35, var41, var36, var47);
                            } else if (var44 == 10) {
                                class23.method118(var45, var41, var43, 16777215);
                                class23.method120(var35, var41, var36, var47);
                            } else if (var44 == 11) {
                                class23.method118(var45, var41, var43, 16777215);
                                class23.method120(var35, var46, var36, var47);
                            } else if (var44 == 12) {
                                class23.method118(var35, var41, var43, 16777215);
                                class23.method120(var35, var46, var36, var47);
                            } else if (var44 == 17) {
                                class23.method120(var35, var41, 1, var47);
                            } else if (var44 == 18) {
                                class23.method120(var45, var41, 1, var47);
                            } else if (var44 == 19) {
                                class23.method120(var45, var46, 1, var47);
                            } else if (var44 == 20) {
                                class23.method120(var35, var46, 1, var47);
                            } else if (var44 == 25) {
                                for (int var49 = 0; var49 < var43; var49++) {
                                    class23.method120(var35 + var49, var46 - var49, 1, var47);
                                }
                            } else if (var44 == 26) {
                                for (int var48 = 0; var48 < var43; var48++) {
                                    class23.method120(var35 + var48, var41 + var48, 1, var47);
                                }
                            }
                        }
                        int var50 = var38[arg6 + var40] & 0xFF;
                        if (var50 != 0) {
                            this.field56[var50 - 1].method109(var35 - var36 / 2, var41 - var43 / 2, var36 * 2, var43 * 2);
                        }
                        int var51 = var39[var40 + arg6] & 0xFF;
                        if (var51 != 0) {
                            this.field17[var32] = var51 - 1;
                            this.field7[var32] = var36 / 2 + var35;
                            this.field35[var32] = var43 / 2 + var41;
                            var32++;
                        }
                    }
                }
            }
        }
        if (arg5 != 31) {
            this.field72 = 23;
        }
        for (int var52 = 0; var52 < var32; var52++) {
            if (this.field41[this.field17[var52]] != null) {
                this.field41[this.field17[var52]].method104(this.field7[var52] - 7, this.field35[var52] + -7);
            }
        }
        if (this.field12 > 0) {
            for (int var53 = 0; var53 < var32; var53++) {
                if (this.field17[var53] == this.field60) {
                    this.field41[this.field17[var53]].method104(this.field7[var53] - 7, this.field35[var53] + -7);
                    if (this.field12 % 10 < 5) {
                        class23.method113(this.field7[var53], this.field35[var53], 15, 16776960, 128);
                        class23.method113(this.field7[var53], this.field35[var53], 7, 16777215, 256);
                    }
                }
            }
        }
        if (this.field69 == this.field16 && class28.field314) {
            for (int var54 = 0; var54 < this.field22; var54++) {
                int var55 = this.field54[var54];
                int var56 = this.field25[var54];
                int var57 = field28 + class32.field370 - var55;
                int var58 = var56 - class30.field329;
                int var59 = arg4 + (arg1 - arg4) * (-arg6 + var57) / (arg0 - arg6);
                int var60 = 16777215;
                int var61 = (var58 - arg3) * (-arg7 + arg2) / (arg8 - arg3) + arg7;
                class34 var62 = null;
                int var63 = this.field6[var54];
                if (var63 == 0) {
                    if (this.field69 == 3.0D) {
                        var62 = this.field23;
                    }
                    if (this.field69 == 4.0D) {
                        var62 = this.field59;
                    }
                    if (this.field69 == 6.0D) {
                        var62 = this.field1;
                    }
                    if (this.field69 == 8.0D) {
                        var62 = this.field46;
                    }
                }
                if (var63 == 1) {
                    if (this.field69 == 3.0D) {
                        var62 = this.field1;
                    }
                    if (this.field69 == 4.0D) {
                        var62 = this.field46;
                    }
                    if (this.field69 == 6.0D) {
                        var62 = this.field14;
                    }
                    if (this.field69 == 8.0D) {
                        var62 = this.field50;
                    }
                }
                if (var63 == 2) {
                    var60 = 16755200;
                    if (this.field69 == 3.0D) {
                        var62 = this.field14;
                    }
                    if (this.field69 == 4.0D) {
                        var62 = this.field50;
                    }
                    if (this.field69 == 6.0D) {
                        var62 = this.field30;
                    }
                    if (this.field69 == 8.0D) {
                        var62 = this.field49;
                    }
                }
                if (var62 != null) {
                    class31 var64 = this.field71[var54];
                    int var65 = 1;
                    for (int var66 = 0; var64.method173(false) > var66; var66++) {
                        if (var64.method168(var66, (byte) 97) == 47) {
                            var65++;
                        }
                    }
                    int var67 = var59 - var62.method206() * (var65 - 1) / 2;
                    int var68 = var67 + var62.method200() / 2;
                    while (true) {
                        int var69 = var64.method164((byte) 66, 47);
                        if (var69 == -1) {
                            var62.method202(var64, var61, var68, var60, true);
                            break;
                        }
                        class31 var70 = var64.method167(-125, var69, 0);
                        var62.method202(var70, var61, var68, var60, true);
                        var68 += var62.method206();
                        var64 = var64.method174(var69 + 1, (byte) -71);
                    }
                }
            }
        }
        if (!class4.field106) {
            return;
        }
        for (int var71 = class30.field329 / 64; var71 < (class30.field329 + class6.field125) / 64; var71++) {
            for (int var72 = class32.field370 / 64; var72 < (field28 + class32.field370) / 64; var72++) {
                int var73 = var72 * 64;
                int var74 = class32.field370 + field28 - var73;
                int var75 = var71 * 64;
                int var76 = var75 - class30.field329;
                int var77 = (var76 - arg3) * (-arg7 + arg2) / (arg8 - arg3) + arg7;
                int var78 = (var74 - arg6 - 64) * (-arg4 + arg1) / (arg0 - arg6) + arg4;
                int var79 = (arg1 - arg4) * (-arg6 + var74) / (arg0 - arg6) + arg4;
                int var80 = (var76 + 64 - arg3) * (-arg7 + arg2) / (arg8 - arg3) + arg7;
                class23.method122(var77, var78, var80 - var77, -var78 + var79, 16777215);
                this.field62.method53(method17(new class31[] { class25.method132(var71, -78), class26.field296, class25.method132(var72, -79) }, -128), var80 - 5, var79 + -5, 16777215);
                if (var71 == 33 && var72 >= 71 && var72 <= 73) {
                    this.field62.method52(class33.field383, (var77 + var80) / 2, (var78 + var79) / 2, 16711680);
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "([[B[[B[[BI[B)V", line = 1784)
    private final void method10(byte[][] arg0, byte[][] arg1, byte[][] arg2, int arg3, byte[] arg4) {
        if (arg3 != -1) {
            return;
        }
        int var6 = 0;
        while (true) {
            while (var6 < arg4.length) {
                int var7 = (arg4[var6++] & 0xFF) * 64 - class30.field329;
                int var8 = (arg4[var6++] & 0xFF) * 64 - class32.field370;
                if (var7 > 0 && var8 > 0 && var7 + 64 < class6.field125 && field28 > var8 + 64) {
                    for (int var9 = 0; var9 < 64; var9++) {
                        byte[] var10 = arg0[var7 + var9];
                        byte[] var11 = arg1[var7 + var9];
                        byte[] var12 = arg2[var7 + var9];
                        int var13 = field28 - var8 - 1;
                        for (int var14 = -64; var14 < 0; var14++) {
                            while (true) {
                                int var15 = arg4[var6++] & 0xFF;
                                if (var15 == 0) {
                                    var13--;
                                    break;
                                }
                                if (var15 < 29) {
                                    var10[var13] = (byte) var15;
                                } else if (var15 >= 160) {
                                    var11[var13] = (byte) (var15 - 159);
                                    this.field27[this.field10] = var7 + var9;
                                    this.field58[this.field10] = var13;
                                    this.field43[this.field10] = var15 - 160;
                                    this.field10++;
                                } else {
                                    var12[var13] = (byte) (var15 - 28);
                                }
                            }
                        }
                    }
                } else {
                    for (int var16 = 0; var16 < 64; var16++) {
                        byte var18;
                        for (int var17 = -64; var17 < 0; var17++) {
                            do {
                                var18 = arg4[var6++];
                            } while (var18 != 0);
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "c", descriptor = "(I)V", line = 1896)
    public final void method11(int arg0) {
        method27(arg0 ^ 0xE2B410EF);
        class30.method160((byte) 107);
        class31.method171(96);
        class28.method155(0);
        class27.method152(false);
        class25.method141((byte) 102);
        class15.method83(true);
        class6.method48(true);
        class8.method57(-37);
        class29.method158((byte) 108);
        class26.method148(0);
        class34.method208();
        if (arg0 != -1) {
            return;
        }
        class1.method29(2);
        class33.method195(true);
        class17.method98(-113);
        class11.method65((byte) 118);
        class23.method115();
        class22.method112(0);
        class16.method97(-13236);
        class4.method46((byte) -128);
        class18.method103((byte) 117);
        class2.method36(103);
        class9.method62((byte) -49);
        class32.method182(-1);
        class3.method39(23721);
        class24.method127();
        class10.method63(true);
        this.field37 = null;
        this.field30 = null;
        this.field61 = null;
        this.field41 = null;
        this.field58 = null;
        this.field19 = null;
        this.field71 = null;
        this.field49 = null;
        this.field66 = null;
        this.field43 = null;
        this.field54 = null;
        this.field23 = null;
        this.field11 = null;
        this.field59 = null;
        this.field32 = null;
        this.field50 = null;
        this.field17 = null;
        this.field14 = null;
        this.field25 = null;
        this.field35 = null;
        this.field62 = null;
        this.field70 = null;
        this.field46 = null;
        this.field56 = null;
        this.field27 = null;
        this.field6 = null;
        this.field15 = null;
        this.field1 = null;
        this.field29 = null;
        this.field3 = null;
        this.field7 = null;
    }

    @OriginalMember(owner = "mapview!mapview", name = "b", descriptor = "(I)V", line = 1966)
    public final void method12(int arg0) {
        class25.method138((byte) 126);
        class3.method41(class28.field311, 32);
        if (arg0 != 10) {
            this.method8(60, (byte) -15);
        }
        class15.method85(class28.field311, 0);
        this.field61 = class17.method100(1);
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(BLjava/lang/String;[B)Z", line = 1986)
    private final boolean method13(byte arg0, String arg1, byte[] arg2) {
        if (arg2 == null) {
            return false;
        }
        try {
            MessageDigest var4 = MessageDigest.getInstance("SHA");
            int var5 = 60 / ((-arg0 - 28) / 50);
            var4.reset();
            var4.update(arg2);
            byte[] var6 = var4.digest();
            if (arg1 == "main_file_cache.dat0") {
                if (var6[0] != -2 || var6[1] != -8 || var6[2] != -96 || var6[3] != -81 || var6[4] != 66 || var6[5] != 64 || var6[6] != 44 || var6[7] != 16 || var6[8] != 106 || var6[9] != 93 || var6[10] != -71 || var6[11] != 60 || var6[12] != 109 || var6[13] != 56 || var6[14] != -19 || var6[15] != -23 || var6[16] != -38 || var6[17] != -95 || var6[18] != 32 || var6[19] != 126) {
                    return false;
                }
            } else if (var6[0] != -41 || var6[1] != 31 || var6[2] != -75 || var6[3] != -74 || var6[4] != 71 || var6[5] != 73 || var6[6] != -3 || var6[7] != 121 || var6[8] != 51 || var6[9] != -3 || var6[10] != 1 || var6[11] != -10 || var6[12] != 56 || var6[13] != -82 || var6[14] != -4 || var6[15] != -69 || var6[16] != 77 || var6[17] != -66 || var6[18] != -44 || var6[19] != 124) {
                return false;
            }
            return true;
        } catch (Exception var8) {
            this.method94("sha", (byte) -47);
            return false;
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "b", descriptor = "(B)Z", line = 2082)
    private final boolean method14(byte arg0) {
        if (class26.field288 == 0) {
            this.method7(-1);
            class26.field288 = 1;
        }
        if (class26.field288 == 1) {
            field42 = 25;
            boolean var2 = this.method19("main_file_cache.idx0", 56, class25.field283);
            if (!var2) {
                return false;
            }
            class26.field293 = class3.field102;
            class3.field102 = null;
            if (class26.field293 == null) {
                throw new RuntimeException("T1");
            }
            class26.field288 = 2;
        }
        if (class26.field288 == 2) {
            class6.field120 = new class26[1];
            class26.field288 = 10;
        }
        if (class26.field288 == 10) {
            field42 = 50;
            boolean var3 = this.method19("main_file_cache.dat0", 56, class26.field290);
            if (!var3) {
                return false;
            }
            class6.field120[0] = class3.field102;
            class3.field102 = null;
            if (class6.field120[0] == null) {
                throw new RuntimeException("T2");
            }
            class26.field288 = 20;
        }
        int var4 = -109 % ((-arg0 - 70) / 43);
        if (class26.field288 != 20) {
            return false;
        }
        this.field56 = class29.method157(class26.field293, class27.field303, (byte) 87, class22.field264);
        this.field41 = class6.method49(class22.field264, class26.field293, class22.field263, 32);
        this.field62 = class27.method150(8499, class22.field264, class16.field234, class26.field293);
        this.field23 = new class34(11, true, this);
        this.field59 = new class34(12, true, this);
        this.field1 = new class34(14, true, this);
        this.field46 = new class34(17, true, this);
        this.field14 = new class34(19, true, this);
        this.field50 = new class34(22, true, this);
        this.field30 = new class34(26, true, this);
        this.field49 = new class34(30, true, this);
        field42 = 100;
        class30.field340 = class32.field367;
        class30.method159(field42, -121, null, class30.field340);
        this.method24(-122);
        return true;
    }

    @OriginalMember(owner = "mapview!mapview", name = "init", descriptor = "()V", line = 2166)
    public final void init() {
        if (this.method89(13003)) {
            this.method91(32, 635, 0, 503, class10.field173.method176(32007, this).method179(117));
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(Lt;Ljava/lang/String;B)Z", line = 2178)
    private final boolean method15(class31 arg0, String arg1, byte arg2) {
        try {
            if (class15.field226 == null) {
                class30.field340 = method17(new class31[] { class27.field307, arg0 }, -81);
                int var4;
                if (arg1 == "main_file_cache.dat0") {
                    var4 = 377810;
                } else if (arg1 == "main_file_cache.dat1") {
                    var4 = 140947;
                } else if (arg1 == "main_file_cache.dat2") {
                    var4 = 102729;
                } else {
                    var4 = 8200;
                }
                String var5;
                if (arg1 == "main_file_cache.dat0") {
                    var5 = "worldmap.main.js5?crc=1760230772";
                } else if (arg1 == "main_file_cache.dat1") {
                    var5 = "worldmap.dungeon.js5?crc=1221619691";
                } else if (arg1 == "main_file_cache.dat2") {
                    var5 = "worldmap.extra.js5?crc=-611124231";
                } else {
                    var5 = "mapview.sprites.js5?crc=-1837203931";
                }
                class15.field226 = new DataInputStream((new URL(this.getCodeBase(), var5)).openStream());
                class26.field291 = 0;
                class25.field286 = new byte[var4];
                field67 = 0;
            }
            int var6 = field67;
            if (arg2 > -90) {
                this.method3(-51, -50);
            }
            int var7 = class25.field286.length;
            if (var6 >= var7) {
                class15.field226.close();
                class15.field226 = null;
                if (!this.method13((byte) -125, arg1, class25.field286)) {
                    this.method94("download", (byte) -47);
                    class25.field286 = null;
                }
                return true;
            }
            class26.field291++;
            if (class26.field291 >= 1500) {
                throw new IOException();
            }
            DataInputStream var8 = class15.field226;
            int var9 = var8.available();
            if (var9 < 0) {
                throw new EOFException();
            } else if (var9 == 0) {
                return false;
            } else {
                if (var9 > var7 - var6) {
                    var9 = var7 - var6;
                }
                int var10 = var8.read(class25.field286, var6, var9);
                if (var10 < 0) {
                    throw new EOFException();
                } else if (var10 == 0) {
                    return false;
                } else {
                    int var11 = var6 + var10;
                    int var12 = var11 * 100 / var7;
                    class26.field291 = 0;
                    class30.field340 = method17(new class31[] { class2.field86, arg0, class6.field116, class25.method132(var12, -57), class29.field322 }, -86);
                    field67 = var11;
                    return false;
                }
            }
        } catch (IOException var16) {
            try {
                class15.field226.close();
            } catch (Exception var15) {
            }
            class25.field286 = null;
            class15.field226 = null;
            this.method94("download", (byte) -47);
            return true;
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(IIIIILt;ZII)V", line = 2297)
    private final void method16(int arg0, int arg1, int arg2, int arg3, int arg4, class31 arg5, boolean arg6, int arg7, int arg8) {
        class23.method122(arg3, arg1, arg7, arg0, 0);
        int var13 = arg7 - 2;
        int var12 = arg3 + 1;
        int var10 = arg0 - 2;
        int var11 = arg1 + 1;
        if (arg6) {
            return;
        }
        class23.method119(var12, var11, var13, var10, arg8);
        class23.method120(var12, var11, var13, arg2);
        class23.method118(var12, var11, var10, arg2);
        class23.method120(var12, var11 + var10 - 1, var13, arg4);
        class23.method118(var12 + var13 - 1, var11, var10, arg4);
        this.field62.method52(arg5, var12 + var13 / 2 + 1, var11 - -1 + var10 / 2 + 4, 0);
        this.field62.method52(arg5, var13 / 2 + var12, var10 / 2 - -4 + var11, 16777215);
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "([Lt;I)Lt;", line = 2325)
    private static final class31 method17(class31[] arg0, int arg1) {
        if (arg0.length < 2) {
            throw new IllegalArgumentException();
        }
        if (arg1 > -74) {
            method17(null, -124);
        }
        return class4.method45(97, arg0.length, 0, arg0);
    }

    @OriginalMember(owner = "mapview!mapview", name = "b", descriptor = "(II)I", line = 2390)
    private final int method18(int arg0, int arg1) {
        if (arg1 != 635) {
            this.field61 = null;
        }
        arg0++;
        if (class6.field120.length <= arg0) {
            arg0 = 0;
        }
        return arg0;
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(Ljava/lang/String;ILt;)Z", line = 2415)
    private final boolean method19(String arg0, int arg1, class31 arg2) {
        byte[] var4 = null;
        if (!class16.field235) {
            class16.field235 = true;
            if (class15.field217 != null) {
                try {
                    var4 = this.method6(class15.field217 + "/" + arg0, -1);
                    if (!this.method13((byte) -88, arg0, var4)) {
                        var4 = null;
                    }
                    if (var4 != null) {
                        class3.field102 = new class26(var4, false, true);
                        return true;
                    }
                } catch (IOException var11) {
                    var4 = null;
                }
            }
        }
        if (arg1 != 56) {
            this.method10(null, null, null, 66, null);
        }
        if (var4 == null) {
            boolean var6 = this.method15(arg2, arg0, (byte) -95);
            if (!var6) {
                return false;
            }
            var4 = class25.field286;
            class25.field286 = null;
        }
        if (var4 == null) {
            class16.field235 = false;
            return true;
        }
        if (class15.field217 != null && var4 != null) {
            try {
                this.method1(class15.field217 + "/" + arg0, var4, (byte) -17);
            } catch (IOException var10) {
            }
        }
        try {
            class3.field102 = new class26(var4, false, true);
            class16.field235 = false;
            return true;
        } catch (IOException var9) {
            throw class1.method31(var9, "monkey feet");
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "b", descriptor = "(Z)V", line = 2490)
    public final void method20(boolean arg0) {
        if (class2.field81) {
            class33.method191(0, class28.field311);
            class33.method187((byte) -128, class28.field311);
            this.method82(-48);
            class3.method41(class28.field311, 32);
            class15.method85(class28.field311, 0);
        }
        class32.method184(arg0);
        class15.method95(arg0);
        if (!class3.field98) {
            return;
        }
        if (class17.field242[96]) {
            field13 = (int) ((double) field13 - 16.0D / this.field69);
            this.field36 = true;
        }
        if (class17.field242[97]) {
            field13 = (int) (16.0D / this.field69 + (double) field13);
            this.field36 = true;
        }
        if (class17.field242[98]) {
            this.field36 = true;
            class8.field136 = (int) ((double) class8.field136 - 16.0D / this.field69);
        }
        if (class17.field242[99]) {
            class8.field136 = (int) (16.0D / this.field69 + (double) class8.field136);
            this.field36 = true;
        }
        while (true) {
            do {
                if (!class32.method185(false)) {
                    int var2 = class2.field85;
                    int var3 = class25.field277;
                    int var4 = class32.field373;
                    int var5 = class22.field266;
                    int var6 = class30.field332;
                    int var7 = class2.field88;
                    if (var2 == 1) {
                        this.field31 = field13;
                        this.field45 = class8.field136;
                        this.field64 = var4;
                        this.field8 = var3;
                        if (class6.field120.length == 1) {
                            if (var3 > 170 && var3 < 220 && var4 > 471 && var4 < 503) {
                                this.field16 = 3.0D;
                                this.field8 = -1;
                            }
                            if (var3 > 230 && var3 < 280 && var4 > 471 && var4 < 503) {
                                this.field8 = -1;
                                this.field16 = 4.0D;
                            }
                            if (var3 > 290 && var3 < 340 && var4 > 471 && var4 < 503) {
                                this.field8 = -1;
                                this.field16 = 6.0D;
                            }
                            if (var3 > 350 && var3 < 400 && var4 > 471 && var4 < 503) {
                                this.field8 = -1;
                                this.field16 = 8.0D;
                            }
                        } else {
                            if (var3 > 170 && var3 < 220 && var4 > 451 && var4 < 483) {
                                this.field16 = 3.0D;
                                this.field8 = -1;
                            }
                            if (var3 > 230 && var3 < 280 && var4 > 451 && var4 < 483) {
                                this.field8 = -1;
                                this.field16 = 4.0D;
                            }
                            if (var3 > 290 && var3 < 340 && var4 > 451 && var4 < 483) {
                                this.field16 = 6.0D;
                                this.field8 = -1;
                            }
                            if (var3 > 350 && var3 < 400 && var4 > 451 && var4 < 483) {
                                this.field8 = -1;
                                this.field16 = 8.0D;
                            }
                            if (var3 > 170 && var3 < 400 && var4 > 483 && var4 < 503) {
                                this.method2(this.field38, (byte) -86);
                                this.method25((byte) -94);
                                this.method24(-122);
                                this.field8 = -1;
                            }
                        }
                        this.field36 = true;
                        this.field52 = false;
                        if (this.field39 < var3 && this.field55 + this.field21 < var4 && this.field39 + this.field34 > var3 && var4 < 503) {
                            this.field65 = !this.field65;
                            this.field8 = -1;
                        }
                        if (this.field51 < var3 && var4 > this.field48 + this.field47 && this.field72 + this.field51 > var3 && var4 < 503) {
                            this.field8 = -1;
                            this.field44 = !this.field44;
                        }
                        if (this.field65) {
                            if (var3 > this.field39 && var4 > this.field55 && this.field39 + this.field34 > var3 && this.field55 + 18 > var4 && this.field26 > 0) {
                                this.field26 -= 25;
                            }
                            if (var3 > this.field39 && this.field55 < var4 && this.field39 + this.field34 > var3 && this.field55 + this.field21 > var4) {
                                this.field8 = -1;
                            }
                            if (this.field39 < var3 && var4 > this.field55 + this.field21 - 18 && var3 < this.field39 + this.field34 && var4 < this.field55 + this.field21 && this.field26 < 50) {
                                this.field26 += 25;
                            }
                        }
                        if (this.field44 && this.field51 < var3 && var4 > this.field48 && this.field51 + this.field72 > var3 && var4 < this.field48 + this.field47) {
                            this.field52 = true;
                            this.field8 = -1;
                            field13 = (var3 - this.field51) * class6.field125 / this.field72;
                            class8.field136 = (var4 - this.field48) * field28 / this.field47;
                        }
                    }
                    if (this.field65) {
                        this.field63 = -1;
                        if (this.field39 < var6 && var6 < this.field39 + this.field34) {
                            int var8 = this.field55 + 21 + 5;
                            int var9 = this.field40;
                            for (int var10 = 0; var10 < 25; var10++) {
                                if (this.field61.length > var9 && this.field61[var9].method165((byte) 90, class15.field218)) {
                                    var9++;
                                    var10--;
                                } else {
                                    if (var7 >= var8 && var7 < var8 + 17) {
                                        this.field63 = var9;
                                        if (var2 == 1) {
                                            this.field12 = 50;
                                            this.field60 = var9;
                                        }
                                    }
                                    var8 += 17;
                                    var9++;
                                }
                            }
                        }
                        if (this.field63 != this.field5) {
                            this.field5 = this.field63;
                            this.field36 = true;
                        }
                    }
                    if (var5 == 1 && this.field44 && this.field52) {
                        this.field36 = true;
                        int var11 = var6;
                        int var12 = var7;
                        if (var6 < this.field51) {
                            var11 = this.field51;
                        } else if (var6 > this.field72 + this.field51) {
                            var11 = this.field72 + this.field51;
                        }
                        if (var7 < this.field48) {
                            var12 = this.field48;
                        } else if (this.field48 + this.field47 < var7) {
                            var12 = this.field48 + this.field47;
                        }
                        field13 = (var11 - this.field51) * class6.field125 / this.field72;
                        class8.field136 = (var12 - this.field48) * field28 / this.field47;
                    } else {
                        this.field52 = false;
                    }
                    if (var5 == 1 && this.field8 != -1) {
                        field13 = (int) ((double) (this.field8 - var6) * 2.0D / this.field16) + this.field31;
                        class8.field136 = (int) ((double) (this.field64 - var7) * 2.0D / this.field16) + this.field45;
                        this.field36 = true;
                    }
                    if (this.field16 > this.field69) {
                        this.field69 /= 30.0D;
                        if (this.field69 > this.field16) {
                            this.field69 = this.field16;
                        }
                        this.field36 = true;
                    }
                    if (this.field69 > this.field16) {
                        this.field69 /= 30.0D;
                        if (this.field69 < this.field16) {
                            this.field69 = this.field16;
                        }
                        this.field36 = true;
                    }
                    if (this.field40 < this.field26) {
                        this.field36 = true;
                        this.field40++;
                    }
                    int var13 = field13 - (int) (635.0D / this.field69);
                    if (this.field40 > this.field26) {
                        this.field36 = true;
                        this.field40--;
                    }
                    int var14 = class8.field136 - (int) (503.0D / this.field69);
                    int var15 = field13 + (int) (635.0D / this.field69);
                    if (this.field12 > 0) {
                        this.field36 = true;
                        this.field12--;
                    }
                    if (var13 < 48) {
                        field13 = (int) (635.0D / this.field69) + 48;
                    }
                    int var16 = (int) (503.0D / this.field69) + class8.field136;
                    if (class6.field125 - 48 < var15) {
                        field13 = class6.field125 - (int) (635.0D / this.field69) - 48;
                    }
                    if (var14 < 48) {
                        class8.field136 = (int) (503.0D / this.field69) + 48;
                    }
                    if (field28 - 48 < var16) {
                        class8.field136 = field28 - (int) (503.0D / this.field69) - 48;
                    }
                    return;
                }
                if (class31.field347 == 49) {
                    this.field16 = 3.0D;
                    this.field36 = true;
                }
                if (class31.field347 == 50) {
                    this.field36 = true;
                    this.field16 = 4.0D;
                }
                if (class31.field347 == 51) {
                    this.field36 = true;
                    this.field16 = 6.0D;
                }
                if (class31.field347 == 52) {
                    this.field16 = 8.0D;
                    this.field36 = true;
                }
                if (class31.field347 == 107 || class31.field347 == 75) {
                    this.field36 = true;
                    this.field65 = !this.field65;
                }
            } while (class31.field347 != 111 && class31.field347 != 79);
            this.field36 = true;
            this.field44 = !this.field44;
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "e", descriptor = "(I)V", line = 2861)
    public final void method21(int arg0) {
        class18.method102(true);
        class32.method186(true);
        try {
            this.field19 = null;
            this.field58 = null;
            this.field6 = null;
            this.field32 = null;
            this.field70 = null;
            this.field37 = null;
            this.field66 = null;
            this.field17 = null;
            this.field41 = null;
            this.field7 = null;
            this.field56 = null;
            this.field15 = null;
            this.field43 = null;
            this.field61 = null;
            this.field71 = null;
            if (arg0 != -504) {
                this.field63 = -94;
            }
            this.field35 = null;
            this.field29 = null;
            this.field3 = null;
            this.field25 = null;
            this.field27 = null;
            this.field62 = null;
            this.field11 = null;
            this.field54 = null;
            System.gc();
        } catch (Throwable var3) {
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "([[IB[[B)V", line = 2901)
    private final void method22(int[][] arg0, byte arg1, byte[][] arg2) {
        int var4 = class6.field125;
        int var5 = field28;
        if (arg1 != 52) {
            field13 = 49;
        }
        int[] var6 = new int[var5];
        for (int var7 = 0; var7 < var5; var7++) {
            var6[var7] = 0;
        }
        for (int var8 = 5; var8 < var4 - 5; var8++) {
            byte[] var9 = arg2[var8 + 5];
            byte[] var10 = arg2[var8 - 5];
            for (int var11 = 0; var11 < var5; var11++) {
                var6[var11] += -this.field66[class3.method43(255, var10[var11])] + this.field66[class3.method43(255, var9[var11])];
            }
            if (var8 > 10 && var8 < var4 - 10) {
                int var12 = 0;
                int var13 = 0;
                int[] var14 = arg0[var8];
                int var15 = 0;
                for (int var16 = 5; var16 < var5 - 5; var16++) {
                    int var17 = var6[var16 - 5];
                    int var18 = var6[var16 + 5];
                    var13 += (var18 & 0x3FF) - (var17 & 0x3FF);
                    var12 += (var18 >> 20) - (var17 >> 20);
                    var15 += (var18 >> 10 & 0x3FF) - ((var17 & 0xFFEF6) >> 10);
                    if (var13 > 0) {
                        var14[var16] = this.method23(2, (double) var12 / 8533.0D, (double) var15 / 8533.0D, (double) var13 / 8533.0D);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(IDDD)I", line = 2975)
    private final int method23(int arg0, double arg1, double arg2, double arg3) {
        double var8 = arg3;
        double var10 = arg3;
        double var12 = arg3;
        if (arg2 != 0.0D) {
            double var14;
            if (arg3 < 0.5D) {
                var14 = (arg2 + 1.0D) * arg3;
            } else {
                var14 = arg2 + arg3 - arg2 * arg3;
            }
            double var18 = arg1 + 0.3333333333333333D;
            double var20 = arg1 - 0.3333333333333333D;
            if (var20 < 0.0D) {
                var20++;
            }
            double var22 = arg3 * 2.0D - var14;
            if (var20 * 6.0D < 1.0D) {
                var12 = (var14 - var22) * 6.0D * var20 + var22;
            } else if (var20 * 2.0D < 1.0D) {
                var12 = var14;
            } else if (var20 * 3.0D < 2.0D) {
                var12 = (var14 - var22) * (0.6666666666666666D - var20) * 6.0D + var22;
            } else {
                var12 = var22;
            }
            if (var18 > 1.0D) {
                var18--;
            }
            if (arg1 * 6.0D < 1.0D) {
                var10 = (var14 - var22) * 6.0D * arg1 + var22;
            } else if (arg1 * 2.0D < 1.0D) {
                var10 = var14;
            } else if (arg1 * 3.0D < 2.0D) {
                var10 = (0.6666666666666666D - arg1) * (-var22 + var14) * 6.0D + var22;
            } else {
                var10 = var22;
            }
            if (var18 * 6.0D < 1.0D) {
                var8 = (var14 - var22) * 6.0D * var18 + var22;
            } else if (var18 * 2.0D < 1.0D) {
                var8 = var14;
            } else if (var18 * 3.0D < 2.0D) {
                var8 = (var14 - var22) * (-var18 + 0.6666666666666666D) * 6.0D + var22;
            } else {
                var8 = var22;
            }
        }
        int var24 = (int) (var10 * 256.0D);
        if (arg0 != 2) {
            this.method11(119);
        }
        int var25 = (int) (var8 * 256.0D);
        int var26 = (int) (var12 * 256.0D);
        return (var24 << 8) + (var25 << 16) + var26;
    }

    @OriginalMember(owner = "mapview!mapview", name = "k", descriptor = "(I)V", line = 3070)
    private final void method24(int arg0) {
        if (arg0 != -122) {
            this.method7(-75);
        }
        if (class6.field120.length == 1) {
            class3.field92 = 0;
        } else {
            if (class2.field84 < 0) {
                class3.field92 = this.method18(class3.field92, 635);
            } else {
                class3.field92 = class2.field84;
            }
            class2.field84 = this.method18(class3.field92, arg0 + 757);
        }
        this.method8(class3.field92, (byte) 95);
    }

    @OriginalMember(owner = "mapview!mapview", name = "c", descriptor = "(B)V", line = 3108)
    private final void method25(byte arg0) {
        class10.field181 = false;
        try {
            int var2 = 120 / ((arg0 + 30) / 53);
            Graphics var3 = class28.field311.getGraphics();
            class22.field268.method38(var3, 0, 0, (byte) 9);
        } catch (Exception var5) {
            class28.field311.repaint();
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "([B[[BB)V", line = 3131)
    private final void method26(byte[] arg0, byte[][] arg1, byte arg2) {
        int var4 = 0;
        while (true) {
            while (var4 < arg0.length) {
                int var5 = (arg0[var4++] & 0xFF) * 64 - class30.field329;
                int var6 = (arg0[var4++] & 0xFF) * 64 - class32.field370;
                if (var5 > 0 && var6 > 0 && var5 + 64 < class6.field125 && field28 > var6 + 64) {
                    for (int var7 = 0; var7 < 64; var7++) {
                        byte[] var8 = arg1[var5 + var7];
                        int var9 = field28 - var6 - 1;
                        for (int var10 = -64; var10 < 0; var10++) {
                            var8[var9--] = arg0[var4++];
                        }
                    }
                } else {
                    var4 += 4096;
                }
            }
            if (arg2 < 96) {
                this.method11(-39);
            }
            return;
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "l", descriptor = "(I)V", line = 3180)
    public static void method27(int arg0) {
        if (arg0 == 491515664) {
            field18 = null;
            field33 = null;
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "d", descriptor = "(I)V", line = 3204)
    public final void method28(int arg0) {
        if (arg0 <= 46) {
            this.method16(-105, 89, 36, -118, 86, null, false, 99, -16);
        }
        if (!class3.field98) {
            class3.field98 = this.method14((byte) -116);
            class30.method159(field42, -123, null, class30.field340);
            return;
        }
        if (this.field36) {
            class10.field181 = true;
            this.field36 = false;
            class23.method116();
            int var2 = (int) (503.0D / this.field69) + class8.field136;
            int var3 = (int) (635.0D / this.field69) + field13;
            int var4 = field13 - (int) (635.0D / this.field69);
            int var5 = class8.field136 - (int) (503.0D / this.field69);
            this.method9(var2, 503, 635, var4, 0, (byte) 31, var5, 0, var3);
            if (this.field44) {
                this.field19.method108(this.field51, this.field48);
                class23.method117(this.field72 * var4 / class6.field125 + this.field51, this.field47 * var5 / field28 + this.field48, (var3 - var4) * this.field72 / class6.field125, (var2 - var5) * this.field47 / field28, 16711680, 128);
                class23.method122(this.field51 + this.field72 * var4 / class6.field125, this.field47 * var5 / field28 + this.field48, (var3 - var4) * this.field72 / class6.field125, (var2 - var5) * this.field47 / field28, 16711680);
                if (this.field12 > 0 && this.field12 % 10 < 5) {
                    for (int var6 = 0; var6 < this.field10; var6++) {
                        if (this.field43[var6] == this.field60) {
                            int var7 = this.field51 + this.field27[var6] * this.field72 / class6.field125;
                            int var8 = this.field58[var6] * this.field47 / field28 + this.field48;
                            class23.method113(var7, var8, 2, 16776960, 256);
                        }
                    }
                }
            }
            if (this.field65) {
                this.method16(18, this.field55, 10066329, this.field39, 5592405, class30.field336, false, this.field34, 7829367);
                this.method16(this.field21 - 36, this.field55 - -18, 10066329, this.field39, 5592405, class22.field264, false, this.field34, 7829367);
                this.method16(18, this.field55 + this.field21 - 18, 10066329, this.field39, 5592405, class1.field74, false, this.field34, 7829367);
                int var9 = this.field40;
                int var10 = this.field55 + 21;
                for (int var11 = 0; var11 < 25; var11++) {
                    if (var9 < this.field41.length && this.field61.length > var9) {
                        if (this.field61[var9].method165((byte) 90, class15.field218)) {
                            var11--;
                            var9++;
                            continue;
                        }
                        this.field41[var9].method104(this.field39 + 3, var10);
                        this.field62.method50(this.field61[var9], this.field39 + 21, var10 + 14, 0);
                        int var12 = 16777215;
                        if (this.field63 == var9) {
                            var12 = 12298922;
                        }
                        if (this.field12 > 0 && this.field12 % 10 < 5 && this.field60 == var9) {
                            var12 = 16776960;
                        }
                        this.field62.method50(this.field61[var9], this.field39 + 20, var10 + 13, var12);
                    }
                    var9++;
                    var10 += 17;
                }
            }
            if (class6.field120.length == 1) {
                this.method16(18, this.field48 + this.field47, this.field68, this.field51, this.field53, class27.field308, false, this.field72, this.field2);
                this.method16(18, this.field55 + this.field21, this.field68, this.field39, this.field53, class30.field338, false, this.field34, this.field2);
                if (this.field16 == 3.0D) {
                    this.method16(30, 471, this.field9, 170, this.field57, class28.field318, false, 50, this.field38);
                } else {
                    this.method16(30, 471, this.field68, 170, this.field53, class28.field318, false, 50, this.field2);
                }
                if (this.field16 == 4.0D) {
                    this.method16(30, 471, this.field9, 230, this.field57, class3.field100, false, 50, this.field38);
                } else {
                    this.method16(30, 471, this.field68, 230, this.field53, class3.field100, false, 50, this.field2);
                }
                if (this.field16 == 6.0D) {
                    this.method16(30, 471, this.field9, 290, this.field57, class17.field240, false, 50, this.field38);
                } else {
                    this.method16(30, 471, this.field68, 290, this.field53, class17.field240, false, 50, this.field2);
                }
                if (this.field16 == 8.0D) {
                    this.method16(30, 471, this.field9, 350, this.field57, class2.field83, false, 50, this.field38);
                } else {
                    this.method16(30, 471, this.field68, 350, this.field53, class2.field83, false, 50, this.field2);
                }
            } else {
                this.method16(18, this.field48 + this.field47, this.field68, this.field51, this.field53, class27.field308, false, this.field72, this.field2);
                this.method16(18, this.field55 + this.field21, this.field68, this.field39, this.field53, class30.field338, false, this.field34, this.field2);
                this.method2(this.field2, (byte) -86);
                if (this.field16 == 3.0D) {
                    this.method16(30, 451, this.field9, 170, this.field57, class28.field318, false, 50, this.field38);
                } else {
                    this.method16(30, 451, this.field68, 170, this.field53, class28.field318, false, 50, this.field2);
                }
                if (this.field16 == 4.0D) {
                    this.method16(30, 451, this.field9, 230, this.field57, class3.field100, false, 50, this.field38);
                } else {
                    this.method16(30, 451, this.field68, 230, this.field53, class3.field100, false, 50, this.field2);
                }
                if (this.field16 == 6.0D) {
                    this.method16(30, 451, this.field9, 290, this.field57, class17.field240, false, 50, this.field38);
                } else {
                    this.method16(30, 451, this.field68, 290, this.field53, class17.field240, false, 50, this.field2);
                }
                if (this.field16 == 8.0D) {
                    this.method16(30, 451, this.field9, 350, this.field57, class2.field83, false, 50, this.field38);
                } else {
                    this.method16(30, 451, this.field68, 350, this.field53, class2.field83, false, 50, this.field2);
                }
            }
        }
        if (class10.field181) {
            this.method25((byte) 48);
        }
    }
}
