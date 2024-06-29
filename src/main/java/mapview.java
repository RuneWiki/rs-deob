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

    @OriginalMember(owner = "mapview!mapview", name = "Q", descriptor = "I")
    private int field30 = 5;

    @OriginalMember(owner = "mapview!mapview", name = "v", descriptor = "I")
    private int field9 = 10;

    @OriginalMember(owner = "mapview!mapview", name = "T", descriptor = "I")
    private int field33 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "bb", descriptor = "I")
    private int field41 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "X", descriptor = "Z")
    private boolean field37 = false;

    @OriginalMember(owner = "mapview!mapview", name = "S", descriptor = "I")
    private int field32 = 7824964;

    @OriginalMember(owner = "mapview!mapview", name = "kb", descriptor = "I")
    private int field50 = 6706483;

    @OriginalMember(owner = "mapview!mapview", name = "R", descriptor = "I")
    private int field31 = 11141120;

    @OriginalMember(owner = "mapview!mapview", name = "C", descriptor = "Z")
    private boolean field16 = false;

    @OriginalMember(owner = "mapview!mapview", name = "ab", descriptor = "I")
    private int field40 = 5;

    @OriginalMember(owner = "mapview!mapview", name = "gb", descriptor = "I")
    private int field46 = 30;

    @OriginalMember(owner = "mapview!mapview", name = "pb", descriptor = "I")
    private int field55 = 140;

    @OriginalMember(owner = "mapview!mapview", name = "p", descriptor = "I")
    private int field3 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "P", descriptor = "D")
    private double field29 = 4.0D;

    @OriginalMember(owner = "mapview!mapview", name = "mb", descriptor = "Z")
    private boolean field52 = false;

    @OriginalMember(owner = "mapview!mapview", name = "D", descriptor = "Z")
    private boolean field17 = false;

    @OriginalMember(owner = "mapview!mapview", name = "sb", descriptor = "Lna;")
    private class26 field58 = this.field17 ? class4.field135 : class4.field135;

    @OriginalMember(owner = "mapview!mapview", name = "jb", descriptor = "I")
    private int field49 = 23;

    @OriginalMember(owner = "mapview!mapview", name = "F", descriptor = "I")
    private int field19 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "Fb", descriptor = "D")
    private double field71 = 4.0D;

    @OriginalMember(owner = "mapview!mapview", name = "Y", descriptor = "I")
    private int field38 = 500;

    @OriginalMember(owner = "mapview!mapview", name = "wb", descriptor = "I")
    private int field62 = this.field17 ? 76 : 75;

    @OriginalMember(owner = "mapview!mapview", name = "vb", descriptor = "Lna;")
    private class26 field61 = this.field17 ? class15.field213 : class15.field213;

    @OriginalMember(owner = "mapview!mapview", name = "qb", descriptor = "I")
    private int field56 = this.field17 ? 83 : 70;

    @OriginalMember(owner = "mapview!mapview", name = "Kb", descriptor = "I")
    private int field76 = -1;

    @OriginalMember(owner = "mapview!mapview", name = "N", descriptor = "[I")
    private int[] field27 = new int[this.field38];

    @OriginalMember(owner = "mapview!mapview", name = "B", descriptor = "I")
    private int field15 = this.field17 ? 108 : 107;

    @OriginalMember(owner = "mapview!mapview", name = "Eb", descriptor = "I")
    private int field70 = 8912896;

    @OriginalMember(owner = "mapview!mapview", name = "O", descriptor = "Lna;")
    private class26 field28 = this.field17 ? class3.field127 : class3.field127;

    @OriginalMember(owner = "mapview!mapview", name = "W", descriptor = "I")
    private int field36 = this.field17 ? 220 : 79;

    @OriginalMember(owner = "mapview!mapview", name = "K", descriptor = "I")
    private int field24 = 8943445;

    @OriginalMember(owner = "mapview!mapview", name = "u", descriptor = "Lna;")
    private class26 field8 = this.field17 ? class34.field446 : class18.field232;

    @OriginalMember(owner = "mapview!mapview", name = "G", descriptor = "I")
    private int field20 = this.field17 ? 252 : 111;

    @OriginalMember(owner = "mapview!mapview", name = "hb", descriptor = "I")
    private int field47 = 5;

    @OriginalMember(owner = "mapview!mapview", name = "x", descriptor = "I")
    private int field11 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "ub", descriptor = "I")
    private int field60 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "Ib", descriptor = "Lna;")
    private class26 field74 = this.field17 ? class6.field163 : class6.field163;

    @OriginalMember(owner = "mapview!mapview", name = "xb", descriptor = "I")
    private int field63 = this.field17 ? 115 : 102;

    @OriginalMember(owner = "mapview!mapview", name = "Nb", descriptor = "I")
    private int field79 = -20;

    @OriginalMember(owner = "mapview!mapview", name = "db", descriptor = "I")
    private int field43 = 50;

    @OriginalMember(owner = "mapview!mapview", name = "w", descriptor = "[Lna;")
    private class26[] field10 = new class26[this.field38];

    @OriginalMember(owner = "mapview!mapview", name = "Mb", descriptor = "I")
    private int field78 = -1;

    @OriginalMember(owner = "mapview!mapview", name = "Tb", descriptor = "I")
    private int field85 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "Yb", descriptor = "Lna;")
    private class26 field90 = this.field17 ? field21 : field21;

    @OriginalMember(owner = "mapview!mapview", name = "A", descriptor = "I")
    private int field14 = 170;

    @OriginalMember(owner = "mapview!mapview", name = "E", descriptor = "I")
    private int field18 = this.field43 + this.field9;

    @OriginalMember(owner = "mapview!mapview", name = "Gb", descriptor = "Lna;")
    private class26 field72 = this.field17 ? class20.field266 : class20.field266;

    @OriginalMember(owner = "mapview!mapview", name = "Qb", descriptor = "I")
    private int field82 = 471;

    @OriginalMember(owner = "mapview!mapview", name = "Cb", descriptor = "[I")
    private int[] field68 = new int[this.field38];

    @OriginalMember(owner = "mapview!mapview", name = "Xb", descriptor = "I")
    private int field89 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "fb", descriptor = "I")
    private int field45 = -1;

    @OriginalMember(owner = "mapview!mapview", name = "eb", descriptor = "I")
    private int field44 = 450;

    @OriginalMember(owner = "mapview!mapview", name = "Ab", descriptor = "Lna;")
    private class26 field66 = this.field17 ? class25.field356 : class25.field356;

    @OriginalMember(owner = "mapview!mapview", name = "yb", descriptor = "Lna;")
    private class26 field64 = this.field17 ? class16.field220 : class16.field220;

    @OriginalMember(owner = "mapview!mapview", name = "rb", descriptor = "Lna;")
    private class26 field57 = this.field17 ? class27.field374 : class25.field351;

    @OriginalMember(owner = "mapview!mapview", name = "Ub", descriptor = "Z")
    private boolean field86 = true;

    @OriginalMember(owner = "mapview!mapview", name = "ec", descriptor = "I")
    private int field96 = 40;

    @OriginalMember(owner = "mapview!mapview", name = "dc", descriptor = "I")
    private int field95 = 10027008;

    @OriginalMember(owner = "mapview!mapview", name = "Bb", descriptor = "Lna;")
    private class26 field67 = this.field17 ? class33.field441 : class16.field217;

    @OriginalMember(owner = "mapview!mapview", name = "bc", descriptor = "[I")
    private int[] field93 = new int[this.field38];

    @OriginalMember(owner = "mapview!mapview", name = "fc", descriptor = "I")
    private int field97 = 33;

    @OriginalMember(owner = "mapview!mapview", name = "gc", descriptor = "Lna;")
    private class26 field98 = this.field17 ? class26.field363 : class26.field363;

    @OriginalMember(owner = "mapview!mapview", name = "Db", descriptor = "Lna;")
    private class26 field69 = this.field17 ? class26.field366 : class26.field366;

    @OriginalMember(owner = "mapview!mapview", name = "o", descriptor = "Lna;")
    public static class26 field2 = class30.method205((byte) 121, "Kebab Seller");

    @OriginalMember(owner = "mapview!mapview", name = "L", descriptor = "[I")
    public static int[] field25 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 0, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "mapview!mapview", name = "ib", descriptor = "I")
    public static int field48 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "H", descriptor = "Lna;")
    private static class26 field21 = class30.method205((byte) 31, "Prev page");

    @OriginalMember(owner = "mapview!mapview", name = "s", descriptor = "Z")
    private static boolean field6 = false;

    @OriginalMember(owner = "mapview!mapview", name = "t", descriptor = "Z")
    public static volatile boolean field7 = true;

    @OriginalMember(owner = "mapview!mapview", name = "Hb", descriptor = "Lna;")
    public static class26 field73 = class30.method205((byte) 16, "Farming patch");

    @OriginalMember(owner = "mapview!mapview", name = "Sb", descriptor = "Lna;")
    public static class26 field84 = class30.method205((byte) 116, "Loading )3)3)3");

    @OriginalMember(owner = "mapview!mapview", name = "Vb", descriptor = "Lna;")
    private static class26 field87 = class30.method205((byte) 68, " map");

    @OriginalMember(owner = "mapview!mapview", name = "n", descriptor = "I")
    public static int field1;

    @OriginalMember(owner = "mapview!mapview", name = "J", descriptor = "I")
    private int field23;

    @OriginalMember(owner = "mapview!mapview", name = "M", descriptor = "I")
    private int field26;

    @OriginalMember(owner = "mapview!mapview", name = "nb", descriptor = "I")
    private int field53;

    @OriginalMember(owner = "mapview!mapview", name = "ob", descriptor = "I")
    public static int field54;

    @OriginalMember(owner = "mapview!mapview", name = "tb", descriptor = "I")
    private int field59;

    @OriginalMember(owner = "mapview!mapview", name = "Pb", descriptor = "I")
    private int field81;

    @OriginalMember(owner = "mapview!mapview", name = "Rb", descriptor = "I")
    private static int field83;

    @OriginalMember(owner = "mapview!mapview", name = "Wb", descriptor = "I")
    private int field88;

    @OriginalMember(owner = "mapview!mapview", name = "Zb", descriptor = "I")
    private int field91;

    @OriginalMember(owner = "mapview!mapview", name = "cc", descriptor = "I")
    private int field94;

    @OriginalMember(owner = "mapview!mapview", name = "hc", descriptor = "I")
    public static int field99;

    @OriginalMember(owner = "mapview!mapview", name = "ac", descriptor = "Lm;")
    private class23 field92;

    @OriginalMember(owner = "mapview!mapview", name = "zb", descriptor = "Lna;")
    private class26 field65;

    @OriginalMember(owner = "mapview!mapview", name = "Z", descriptor = "Laa;")
    private class2 field39;

    @OriginalMember(owner = "mapview!mapview", name = "y", descriptor = "Lu;")
    private class38 field12;

    @OriginalMember(owner = "mapview!mapview", name = "z", descriptor = "Lu;")
    private class38 field13;

    @OriginalMember(owner = "mapview!mapview", name = "I", descriptor = "Lu;")
    private class38 field22;

    @OriginalMember(owner = "mapview!mapview", name = "U", descriptor = "Lu;")
    private class38 field34;

    @OriginalMember(owner = "mapview!mapview", name = "V", descriptor = "Lu;")
    private class38 field35;

    @OriginalMember(owner = "mapview!mapview", name = "q", descriptor = "Lu;")
    private class38 field4;

    @OriginalMember(owner = "mapview!mapview", name = "lb", descriptor = "Lu;")
    private class38 field51;

    @OriginalMember(owner = "mapview!mapview", name = "Ob", descriptor = "Lu;")
    private class38 field80;

    @OriginalMember(owner = "mapview!mapview", name = "cb", descriptor = "Z")
    private static boolean field42;

    @OriginalMember(owner = "mapview!mapview", name = "Jb", descriptor = "[Lna;")
    private class26[] field75;

    @OriginalMember(owner = "mapview!mapview", name = "Lb", descriptor = "[Lna;")
    private class26[] field77;

    @OriginalMember(owner = "mapview!mapview", name = "r", descriptor = "[[Lta;")
    public static class37[][] field5;

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(BLjava/lang/String;Lna;)Z", line = 10)
    private final boolean method1(byte arg0, String arg1, class26 arg2) {
        byte[] var4 = null;
        if (!field42) {
            if (class29.field386 != null) {
                try {
                    var4 = this.method2(class29.field386 + "/" + arg1, 121);
                    if (!this.method3(var4, arg1, (byte) 54)) {
                        var4 = null;
                    }
                    if (var4 != null) {
                        class7.field166 = new class12(var4, false, true);
                        return true;
                    }
                } catch (IOException var11) {
                    var4 = null;
                }
            }
            field42 = true;
        }
        if (var4 == null) {
            boolean var6 = this.method13(arg2, -113, arg1);
            if (!var6) {
                return false;
            }
            var4 = class33.field438;
            class33.field438 = null;
        }
        if (var4 == null) {
            field42 = false;
            return true;
        }
        if (class29.field386 != null && var4 != null) {
            try {
                this.method19(-28, class29.field386 + "/" + arg1, var4);
            } catch (IOException var10) {
            }
        }
        try {
            class7.field166 = new class12(var4, false, true);
            if (arg0 != 19) {
                field1 = 59;
            }
            field42 = false;
            return true;
        } catch (IOException var9) {
            throw class3.method34(var9, "monkey feet");
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(Ljava/lang/String;I)[B", line = 86)
    private final byte[] method2(String arg0, int arg1) throws IOException {
        File var3 = new File(arg0);
        if (!var3.exists()) {
            return null;
        }
        int var4 = (int) var3.length();
        byte[] var5 = new byte[var4];
        DataInputStream var6 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg0)));
        var6.readFully(var5, 0, var4);
        var6.close();
        if (arg1 <= 102) {
            this.method10(79);
        }
        return var5;
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "([BLjava/lang/String;B)Z", line = 123)
    private final boolean method3(byte[] arg0, String arg1, byte arg2) {
        if (arg0 == null) {
            return false;
        }
        try {
            MessageDigest var4 = MessageDigest.getInstance("SHA");
            var4.reset();
            var4.update(arg0);
            byte[] var5 = var4.digest();
            if (arg1 == "main_file_cache.dat0") {
                if (var5[0] != 29 || var5[1] != 110 || var5[2] != 96 || var5[3] != -31 || var5[4] != -16 || var5[5] != -120 || var5[6] != 28 || var5[7] != 33 || var5[8] != 4 || var5[9] != 102 || var5[10] != -68 || var5[11] != -5 || var5[12] != -72 || var5[13] != 103 || var5[14] != 20 || var5[15] != 28 || var5[16] != 8 || var5[17] != 16 || var5[18] != 117 || var5[19] != 2) {
                    return false;
                }
            } else if (arg1 == "main_file_cache.idx1") {
                if (var5[0] != 52 || var5[1] != 126 || var5[2] != -117 || var5[3] != -96 || var5[4] != 55 || var5[5] != 19 || var5[6] != -40 || var5[7] != 125 || var5[8] != 49 || var5[9] != -77 || var5[10] != 77 || var5[11] != -79 || var5[12] != -93 || var5[13] != -47 || var5[14] != -110 || var5[15] != -122 || var5[16] != 84 || var5[17] != -103 || var5[18] != -78 || var5[19] != 126) {
                    return false;
                }
            } else if (var5[0] != 45 || var5[1] != 3 || var5[2] != -125 || var5[3] != -84 || var5[4] != 74 || var5[5] != -71 || var5[6] != 71 || var5[7] != 42 || var5[8] != 15 || var5[9] != -22 || var5[10] != -39 || var5[11] != -60 || var5[12] != -119 || var5[13] != 50 || var5[14] != -84 || var5[15] != 66 || var5[16] != -36 || var5[17] != -79 || var5[18] != 54 || var5[19] != -48) {
                return false;
            }
            int var6 = -89 / ((-arg2 - 7) / 59);
            return true;
        } catch (Exception var8) {
            this.method198("sha", (byte) 126);
            return false;
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "e", descriptor = "(B)I", line = 172)
    public static final int method4(byte arg0) {
        int var1 = 89 / ((arg0 + 37) / 61);
        return class19.field244 == null ? 0 : class19.field244[class19.field239];
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(II)V", line = 187)
    private final void method5(int arg0, int arg1) {
        this.method24(arg0, 230, this.field50, (byte) -107, 170, arg1, this.field24, 483, class1.method27(new class26[] { class18.field231, class19.field242[class35.field456], field87 }, (byte) -83));
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(ILb;Lna;Lna;Lb;)Laa;", line = 204)
    private static final class2 method6(int arg0, class3 arg1, class26 arg2, class26 arg3, class3 arg4) {
        if (arg0 != 2) {
            field7 = true;
        }
        int var5 = arg1.method32(-1, arg3);
        int var6 = arg1.method31(var5, arg2, (byte) -83);
        return class36.method232((byte) 107, var5, arg1, var6, arg4);
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(BI)I", line = 220)
    private final int method7(byte arg0, int arg1) {
        int var3 = 98 % ((arg0 - 59) / 35);
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
            return class16.method102(arg1, 0);
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "f", descriptor = "(B)V", line = 298)
    private final void method8(byte arg0) {
        String var2 = ".jagex_cache_32";
        String var4;
        try {
            String var3 = System.getProperty("user.home");
            if (var3 == null) {
                var4 = "~/";
            } else {
                var4 = var3 + "/";
            }
        } catch (Exception var13) {
            var4 = "~/";
        }
        if (arg0 <= 119) {
            this.field4 = null;
        }
        String[] var6 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "d:/windows/", "d:/winnt/", "e:/windows/", "e:/winnt/", "f:/windows/", "f:/winnt/", "c:/", var4, "/tmp/", "" };
        for (int var7 = 0; var7 < var6.length; var7++) {
            try {
                String var8 = var6[var7];
                if (var8.length() > 0) {
                    File var9 = new File(var8);
                    if (!var9.exists()) {
                        continue;
                    }
                }
                File var10 = new File(var8 + var2);
                if (var10.exists() || var10.mkdir()) {
                    File var11 = new File(var10, "rsmap");
                    if (var11.exists() || var11.mkdir()) {
                        class29.field386 = var8 + var2 + "/rsmap/";
                        return;
                    }
                }
            } catch (Exception var14) {
            }
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "b", descriptor = "(II)I", line = 368)
    private final int method9(int arg0, int arg1) {
        arg0++;
        if (arg1 != -5782) {
            this.init();
        }
        if (class31.field416.length <= arg0) {
            arg0 = 0;
        }
        return arg0;
    }

    @OriginalMember(owner = "mapview!mapview", name = "b", descriptor = "(I)V", line = 386)
    public final void method10(int arg0) {
        method25((byte) 50);
        class19.method120(false);
        class26.method172((byte) 125);
        class5.method52(false);
        class33.method219(1);
        class4.method46(114);
        if (arg0 != 6) {
            this.method7((byte) -112, 75);
        }
        class30.method199(115);
        class31.method211((byte) 103);
        class18.method113(47);
        class12.method81((byte) 117);
        class6.method61(arg0 ^ 0x4);
        class38.method240();
        class29.method195((byte) 122);
        class13.method86(-23039);
        class3.method36(116);
        class17.method109((byte) -85);
        class36.method229((byte) -65);
        class21.method135();
        class37.method236((byte) -94);
        class27.method192(false);
        class16.method104(1001);
        class15.method97((byte) -128);
        class22.method152();
        class39.method250((byte) 17);
        class9.method78(255);
        class1.method26(-3);
        class32.method214(true);
        class25.method166((byte) 108);
        class34.method222(false);
        class35.method225(-19487);
        class41.method260(true);
        class7.method69(-8741);
        class14.method89();
        class20.method125((byte) 69);
        this.field34 = null;
        this.field8 = null;
        this.field98 = null;
        this.field93 = null;
        this.field12 = null;
        this.field27 = null;
        this.field61 = null;
        this.field10 = null;
        this.field74 = null;
        this.field69 = null;
        this.field72 = null;
        this.field75 = null;
        this.field68 = null;
        this.field92 = null;
        this.field35 = null;
        this.field64 = null;
        this.field4 = null;
        this.field51 = null;
        this.field28 = null;
        this.field57 = null;
        this.field66 = null;
        this.field13 = null;
        this.field39 = null;
        this.field67 = null;
        this.field65 = null;
        this.field77 = null;
        this.field80 = null;
        this.field22 = null;
        this.field58 = null;
        this.field90 = null;
    }

    @OriginalMember(owner = "mapview!mapview", name = "init", descriptor = "()V", line = 459)
    public final void init() {
        if (this.method206((byte) 82)) {
            this.method208(635, Integer.parseInt(this.getParameter("codeversion")), 503, 32, (byte) 121);
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "b", descriptor = "(BI)V", line = 472)
    private final void method11(byte arg0, int arg1) {
        if (class31.field416.length > arg1) {
            class12 var3 = class31.field416[arg1];
            class4 var4 = new class4(var3.method38(-2109, class13.field194, class13.field196));
            var4.method50(435895534);
            class4 var5 = new class4(var3.method38(-2109, class13.field194, class3.field111));
            this.field33 = var5.method47((byte) 122);
            for (int var6 = 0; var6 < this.field33; var6++) {
                this.field10[var6] = var5.method50(435895534);
                this.field27[var6] = var5.method47((byte) 121);
                this.field68[var6] = var5.method47((byte) 64);
                this.field93[var6] = var5.method49((byte) 53);
                class26 var7 = this.field10[var6].method183(782, 32, 47);
                int var8 = this.field39.method149(var7);
                if (this.field53 < var8) {
                    this.field53 = var8;
                }
                int var9 = this.field39.method149(this.field61);
                if (this.field53 < var9) {
                    this.field53 = var9;
                }
            }
            class7.field165 = new class6();
            class7.field165.method58((byte) 88, class31.field416[arg1]);
            this.field94 = 180;
            this.field23 = class6.field148 * this.field94 / class26.field360;
            class41.field521 = class39.field497;
            this.field81 = 635 - this.field23 - 5;
            class6.field147 = field54;
            this.field88 = 483 - this.field94;
            this.field92 = new class23(this.field23, this.field94);
            this.field92.method158();
            this.method12(0, 0, this.field94, this.field23, 0, class6.field148, 0, class26.field360, (byte) 76);
            class21.method136(0, 0, this.field23, this.field94, 0);
            class21.method136(1, 1, this.field23 - 2, this.field94 + -2, this.field24);
            class12.field181.method114((byte) 110);
        }
        int var10 = 47 % ((19 - arg0) / 60);
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(IIIIIIIIB)V", line = 538)
    private final void method12(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte arg8) {
        class7.field165.method59(arg2, arg7, arg6, (byte) -39, arg3, arg0, arg1, arg4, arg5);
        if (arg3 - arg4 < -arg1 + arg5) {
            return;
        }
        class7.field165.method55(arg5, arg7, 78, this.field71, arg4, arg1, arg3, arg6, arg2, arg0);
        class7.field165.method64(arg4, 173357296, arg5, arg3, arg7, arg0, arg1, arg6, arg2);
        class7.field165.method62(this.field76, arg7, arg5, arg0, arg6, arg4, arg1, this.field85, arg2, arg3, (byte) 113);
        if (this.field71 == this.field29 && class20.field259) {
            for (int var10 = 0; var10 < this.field33; var10++) {
                int var11 = this.field27[var10];
                int var12 = this.field68[var10];
                int var13 = class25.field347 + class26.field360 - var12;
                int var14 = this.field93[var10];
                int var15 = (var13 - arg0) * (-arg6 + arg2) / (arg7 - arg0) + arg6;
                int var16 = var11 - class7.field170;
                int var17 = arg4 + (var16 - arg1) * (-arg4 + arg3) / (arg5 - arg1);
                int var18 = 16777215;
                class38 var19 = null;
                if (var14 == 0) {
                    if (this.field71 == 3.0D) {
                        var19 = this.field51;
                    }
                    if (this.field71 == 4.0D) {
                        var19 = this.field22;
                    }
                    if (this.field71 == 6.0D) {
                        var19 = this.field35;
                    }
                    if (this.field71 == 8.0D) {
                        var19 = this.field34;
                    }
                }
                if (var14 == 1) {
                    if (this.field71 == 3.0D) {
                        var19 = this.field35;
                    }
                    if (this.field71 == 4.0D) {
                        var19 = this.field34;
                    }
                    if (this.field71 == 6.0D) {
                        var19 = this.field13;
                    }
                    if (this.field71 == 8.0D) {
                        var19 = this.field4;
                    }
                }
                if (var14 == 2) {
                    if (this.field71 == 3.0D) {
                        var19 = this.field13;
                    }
                    var18 = 16755200;
                    if (this.field71 == 4.0D) {
                        var19 = this.field4;
                    }
                    if (this.field71 == 6.0D) {
                        var19 = this.field80;
                    }
                    if (this.field71 == 8.0D) {
                        var19 = this.field12;
                    }
                }
                if (var19 != null) {
                    class26 var20 = this.field10[var10];
                    int var21 = 1;
                    for (int var22 = 0; var20.method185(80) > var22; var22++) {
                        if (var20.method181(var22, (byte) -3) == 47) {
                            var21++;
                        }
                    }
                    int var23 = var15 - var19.method249() * (var21 - 1) / 2;
                    int var24 = var23 + var19.method241() / 2;
                    while (true) {
                        int var25 = var20.method169(47, 0);
                        if (var25 == -1) {
                            var19.method245(var20, var17, var24, var18, true);
                            break;
                        }
                        class26 var26 = var20.method180(var25, true, 0);
                        var19.method245(var26, var17, var24, var18, true);
                        var24 += var19.method249();
                        var20 = var20.method178(var25 + 1, true);
                    }
                }
            }
        }
        if (arg8 < 52) {
            this.method3(null, null, (byte) -4);
        }
        if (!field6) {
            return;
        }
        for (int var27 = class7.field170 / 64; var27 < (class7.field170 + class6.field148) / 64; var27++) {
            for (int var28 = class25.field347 / 64; var28 < (class26.field360 + class25.field347) / 64; var28++) {
                int var29 = var27 * 64;
                int var30 = var29 - class7.field170;
                int var31 = var28 * 64;
                int var32 = class26.field360 + class25.field347 - var31;
                int var33 = (var30 + 64 - arg1) * (-arg4 + arg3) / (arg5 - arg1) + arg4;
                int var34 = arg4 + (var30 - arg1) * (-arg4 + arg3) / (arg5 - arg1);
                int var35 = (arg2 - arg6) * (var32 + -64 + -arg0) / (arg7 - arg0) + arg6;
                int var36 = (var32 - arg0) * (-arg6 + arg2) / (arg7 - arg0) + arg6;
                class21.method136(var34, var35, var33 - var34, -var35 + var36, 16777215);
                this.field39.method154(class1.method27(new class26[] { class36.method233(var27, (byte) 74), class34.field451, class36.method233(var28, (byte) 86) }, (byte) -83), var33 - 5, var36 - 5, 16777215, -1);
                if (var27 == 33 && var28 >= 71 && var28 <= 73) {
                    this.field39.method140(class5.field141, (var33 + var34) / 2, (var35 + var36) / 2, 16711680, -1);
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(Lna;ILjava/lang/String;)Z", line = 737)
    private final boolean method13(class26 arg0, int arg1, String arg2) {
        try {
            if (class6.field153 == null) {
                String var4;
                if (arg2 == "main_file_cache.dat0") {
                    var4 = "worldmap.main.js5?crc=915996566";
                } else if (arg2 == "main_file_cache.dat1") {
                    var4 = "worldmap.dungeon.js5?crc=-1251529957";
                } else if (arg2 == "main_file_cache.dat2") {
                    var4 = "worldmap.extra.js5?crc=1179173171";
                } else if (arg2 == "main_file_cache.idx1") {
                    var4 = "mapview.fontmetrics.js5?crc=-447025815";
                } else {
                    var4 = "mapview.sprites.js5?crc=-1292288506";
                }
                class3.field119 = class1.method27(new class26[] { this.field72, class17.field221, arg0 }, (byte) -83);
                class6.field153 = new DataInputStream((new URL(this.getCodeBase(), var4)).openStream());
                int var5;
                if (arg2 == "main_file_cache.dat0") {
                    var5 = 417812;
                } else if (arg2 == "main_file_cache.dat1") {
                    var5 = 154672;
                } else if (arg2 == "main_file_cache.dat2") {
                    var5 = 138263;
                } else if (arg2 == "main_file_cache.idx1") {
                    var5 = 165;
                } else {
                    var5 = 8294;
                }
                class35.field462 = 0;
                class33.field438 = new byte[var5];
                field83 = 0;
            }
            int var6 = field83;
            int var7 = -99 % ((arg1 + 45) / 59);
            int var8 = class33.field438.length;
            if (var6 >= var8) {
                class6.field153.close();
                class6.field153 = null;
                if (!this.method3(class33.field438, arg2, (byte) -83)) {
                    this.method198("download", (byte) 127);
                    class33.field438 = null;
                }
                return true;
            }
            class35.field462++;
            if (class35.field462 >= 1500) {
                throw new IOException();
            }
            DataInputStream var9 = class6.field153;
            int var10 = var9.available();
            if (var10 < 0) {
                throw new EOFException();
            } else if (var10 == 0) {
                return false;
            } else {
                if (var8 - var6 < var10) {
                    var10 = var8 - var6;
                }
                int var11 = var9.read(class33.field438, var6, var10);
                if (var11 < 0) {
                    throw new EOFException();
                } else if (var11 == 0) {
                    return false;
                } else {
                    int var12 = var6 + var11;
                    class35.field462 = 0;
                    int var13 = var12 * 100 / var8;
                    class3.field119 = class1.method27(new class26[] { this.field69, class17.field221, arg0, class30.field394, class36.method233(var13, (byte) 87), class29.field392 }, (byte) -83);
                    field83 = var12;
                    return false;
                }
            }
        } catch (IOException var17) {
            try {
                class6.field153.close();
            } catch (Exception var16) {
            }
            class6.field153 = null;
            class33.field438 = null;
            this.method198(new String("download"), (byte) -3);
            return true;
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(Lb;III)[Lma;", line = 860)
    public static final class24[] method14(class3 arg0, int arg1, int arg2, int arg3) {
        if (arg2 != 1415) {
            method6(55, null, null, null, null);
        }
        return class36.method230((byte) 126, arg0, arg3, arg1) ? class33.method220((byte) 122) : null;
    }

    @OriginalMember(owner = "mapview!mapview", name = "f", descriptor = "(I)V", line = 931)
    public final void method15(int arg0) {
        if (class15.field206) {
            class13.method84(class33.field435, (byte) -30);
            class32.method212(false, class33.field435);
            this.method197(false);
            class17.method107(-96, class33.field435);
            class26.method186(class33.field435, 124);
        }
        class19.method118((byte) -17);
        class25.method164(14288);
        if (!class29.field390) {
            return;
        }
        if (class27.field375[96]) {
            class6.field147 = (int) ((double) class6.field147 - 16.0D / this.field71);
            this.field86 = true;
            class32.field419 = -1;
        }
        if (class27.field375[97]) {
            class32.field419 = -1;
            this.field86 = true;
            class6.field147 = (int) (16.0D / this.field71 + (double) class6.field147);
        }
        if (class27.field375[98]) {
            class32.field419 = -1;
            class41.field521 = (int) ((double) class41.field521 - 16.0D / this.field71);
            this.field86 = true;
        }
        if (class27.field375[99]) {
            class41.field521 = (int) (16.0D / this.field71 + (double) class41.field521);
            this.field86 = true;
            class32.field419 = -1;
        }
        while (true) {
            boolean var2;
            label493: do {
                while (true) {
                    while (true) {
                        while (class37.method239(95)) {
                            if (!class19.field243 || !class41.field526) {
                                if (class32.field422 == this.field63 || class32.field422 == this.field56) {
                                    this.field86 = true;
                                    class41.field526 = true;
                                }
                                if (class32.field422 == 49) {
                                    this.field86 = true;
                                    this.field29 = 3.0D;
                                }
                                if (class32.field422 == 50) {
                                    this.field86 = true;
                                    this.field29 = 4.0D;
                                }
                                if (class32.field422 == 51) {
                                    this.field86 = true;
                                    this.field29 = 6.0D;
                                }
                                if (class32.field422 == 52) {
                                    this.field86 = true;
                                    this.field29 = 8.0D;
                                }
                                if (class32.field422 == this.field15 || class32.field422 == this.field62) {
                                    this.field86 = true;
                                    this.field52 = !this.field52;
                                }
                                if (class32.field422 == this.field20 || class32.field422 == this.field36) {
                                    this.field16 = !this.field16;
                                    this.field86 = true;
                                }
                            } else if (class1.field100 == 0) {
                                this.field86 = true;
                                class41.field526 = false;
                                this.field65.method187(0, true);
                                class39.field494 = -1;
                            } else {
                                if (class1.field100 != 84) {
                                    var2 = false;
                                    if (class1.field100 == 85) {
                                        if (this.field65.method185(114) > 0) {
                                            this.field65.method187(this.field65.method185(120) - 1, true);
                                            this.field86 = true;
                                            if (this.field65.method185(46) == 0) {
                                                class39.field494 = -1;
                                            } else {
                                                var2 = true;
                                            }
                                        }
                                    } else if (class32.field422 != -1 && this.field65.method185(106) <= class4.field134) {
                                        this.field65.method189((byte) -26, class32.field422);
                                        this.field86 = true;
                                    }
                                    continue label493;
                                }
                                class41.field526 = false;
                                class32.field419 = class39.field494;
                                this.field26 = class41.field521 << 16;
                                this.field91 = class6.field147 << 16;
                                this.field65.method187(0, true);
                                class39.field494 = -1;
                                this.field86 = true;
                            }
                        }
                        int var6 = class37.field475;
                        int var7 = class31.field412;
                        int var8 = class6.field157;
                        int var9 = class20.field279;
                        int var10 = class27.field371;
                        int var11 = class6.field161;
                        if (var6 == 1) {
                            this.field89 = class6.field147;
                            this.field41 = var9;
                            this.field60 = var7;
                            this.field3 = class41.field521;
                            if (class31.field416.length == 1) {
                                if (var7 > this.field14 && this.field43 + this.field14 > var7 && var9 > this.field82 && this.field82 + this.field46 > var9) {
                                    this.field60 = -1;
                                    this.field29 = 3.0D;
                                }
                                if (this.field14 + this.field18 < var7 && this.field14 + this.field43 + this.field18 > var7 && this.field82 < var9 && this.field82 + this.field46 > var9) {
                                    this.field60 = -1;
                                    this.field29 = 4.0D;
                                }
                                if (var7 > this.field14 + this.field18 * 2 && var7 < this.field18 * 2 + this.field43 + this.field14 && this.field82 < var9 && var9 < this.field82 + this.field46) {
                                    this.field60 = -1;
                                    this.field29 = 6.0D;
                                }
                                if (this.field18 * 3 + this.field14 < var7 && this.field18 * 3 + this.field43 + this.field14 > var7 && var9 > this.field82 && this.field82 + this.field46 > var9) {
                                    this.field60 = -1;
                                    this.field29 = 8.0D;
                                }
                            } else {
                                if (this.field14 < var7 && var7 < this.field43 + this.field14 && var9 > this.field82 && var9 < this.field82 + this.field46 + this.field79) {
                                    this.field29 = 3.0D;
                                    this.field60 = -1;
                                }
                                if (var7 > this.field18 + this.field14 && var7 < this.field43 + this.field18 + this.field14 && this.field82 < var9 && this.field82 + this.field46 + this.field79 > var9) {
                                    this.field29 = 4.0D;
                                    this.field60 = -1;
                                }
                                if (var7 > this.field18 * 2 + this.field14 && var7 < this.field18 * 2 + this.field14 + this.field43 && var9 > this.field82 && var9 < this.field82 + this.field79 + this.field46) {
                                    this.field29 = 6.0D;
                                    this.field60 = -1;
                                }
                                if (this.field18 * 3 + this.field14 < var7 && this.field14 + this.field18 * 3 + this.field43 > var7 && this.field82 < var9 && this.field82 + this.field79 + this.field46 > var9) {
                                    this.field29 = 8.0D;
                                    this.field60 = -1;
                                }
                                if (var7 > 170 && var7 < 400 && var9 > 483 && var9 < 503) {
                                    this.method5(18, this.field95);
                                    this.method21(59);
                                    this.method22((byte) -127);
                                    this.field60 = -1;
                                }
                            }
                            this.field86 = true;
                            this.field37 = false;
                            if (this.field47 < var7 && this.field97 + this.field44 < var9 && var7 < this.field47 + this.field55 && var9 < 503) {
                                this.field60 = -1;
                                this.field52 = !this.field52;
                            }
                            if (this.field81 < var7 && this.field88 + this.field94 < var9 && var7 < this.field81 + this.field23 && var9 < 503) {
                                this.field60 = -1;
                                this.field16 = !this.field16;
                            }
                            if (this.field52) {
                                if (var7 > this.field47 && var9 > this.field97 && var7 < this.field47 + this.field55 && var9 < this.field97 + this.field44) {
                                    this.field60 = -1;
                                }
                                if (var7 > this.field47 && var9 > this.field97 && var7 < this.field55 + this.field47 && var9 < this.field97 + 18 && this.field19 > 0) {
                                    this.field19 -= 24;
                                }
                                if (this.field47 < var7 && this.field97 + this.field44 - 18 < var9 && var7 < this.field55 + this.field47 && this.field97 + this.field44 > var9 && this.field19 < 48) {
                                    this.field19 += 24;
                                }
                            }
                            if (this.field16 && this.field81 < var7 && var9 > this.field88 && var7 < this.field81 + this.field23 && var9 < this.field94 + this.field88) {
                                class6.field147 = (var7 - this.field81) * class6.field148 / this.field23;
                                class41.field521 = (var9 - this.field88) * class26.field360 / this.field94;
                                this.field60 = -1;
                                this.field37 = true;
                            }
                            if (class19.field243 && !class41.field526 && !this.field37 && this.field30 < var7 && this.field40 < var9 && var7 < this.field96 + this.field30 && this.field49 + this.field40 > var9) {
                                class41.field526 = true;
                            }
                        }
                        if (this.field52) {
                            this.field45 = -1;
                            if (this.field47 < var11 && var11 < this.field55 + this.field47) {
                                int var12 = this.field97 + 21 + 5;
                                int var13 = this.field11;
                                for (int var14 = 0; var14 < 24; var14++) {
                                    if (this.field77.length > var13 && this.field77[var13].method173(class33.field433, -2093)) {
                                        var13++;
                                        var14--;
                                    } else {
                                        if (var12 <= var10 && var12 + 17 > var10) {
                                            this.field45 = var13;
                                            if (var6 == 1) {
                                                this.field85 = 50;
                                                this.field76 = var13;
                                            }
                                        }
                                        var12 += 17;
                                        var13++;
                                    }
                                }
                            }
                            if (this.field78 != this.field45) {
                                this.field86 = true;
                                this.field78 = this.field45;
                            }
                        }
                        if (var8 == 1 && this.field16 && this.field37) {
                            int var15 = var10;
                            int var16 = var11;
                            if (this.field88 > var10) {
                                var15 = this.field88;
                            } else if (this.field94 + this.field88 < var10) {
                                var15 = this.field94 + this.field88;
                            }
                            this.field86 = true;
                            if (this.field81 > var11) {
                                var16 = this.field81;
                            } else if (var11 > this.field81 + this.field23) {
                                var16 = this.field81 + this.field23;
                            }
                            class32.field419 = -1;
                            class6.field147 = (var16 - this.field81) * class6.field148 / this.field23;
                            class41.field521 = (var15 - this.field88) * class26.field360 / this.field94;
                        } else {
                            this.field37 = false;
                        }
                        if (var8 == 1 && this.field60 != -1) {
                            class32.field419 = -1;
                            class41.field521 = (int) ((double) (this.field41 - var10) * 2.0D / this.field29) + this.field3;
                            this.field86 = true;
                            class6.field147 = (int) ((double) (this.field60 - var11) * 2.0D / this.field29) + this.field89;
                        }
                        if (this.field29 > this.field71) {
                            this.field86 = true;
                            this.field71 /= 30.0D;
                            if (this.field29 < this.field71) {
                                this.field71 = this.field29;
                            }
                        }
                        if (this.field71 > this.field29) {
                            this.field86 = true;
                            this.field71 /= 30.0D;
                            if (this.field71 < this.field29) {
                                this.field71 = this.field29;
                            }
                        }
                        if (this.field19 > this.field11) {
                            this.field11++;
                            this.field86 = true;
                        }
                        if (this.field11 > this.field19) {
                            this.field11--;
                            this.field86 = true;
                        }
                        if (this.field85 > 0) {
                            this.field86 = true;
                            this.field85--;
                        }
                        if (class32.field419 >= 0) {
                            byte var17 = 4;
                            class18.field236 = this.field27[class32.field419] - class7.field170;
                            int var18 = class18.field236 - (int) (635.0D / this.field71);
                            class3.field115 = class25.field347 + class26.field360 - this.field68[class32.field419];
                            this.field86 = true;
                            int var19 = class3.field115 - (int) (503.0D / this.field71);
                            int var20 = (int) (635.0D / this.field71) + class18.field236;
                            if (var18 < 48) {
                                class18.field236 = (int) (635.0D / this.field71) + 48;
                            }
                            if (class6.field148 - 48 < var20) {
                                class18.field236 = class6.field148 - (int) (635.0D / this.field71) - 48;
                            }
                            int var21 = (int) (503.0D / this.field71) + class3.field115;
                            class18.field236 <<= 0x10;
                            if (var19 < 48) {
                                class3.field115 = (int) (503.0D / this.field71) + 48;
                            }
                            int var22 = class18.field236 - this.field91;
                            if (class26.field360 - 48 < var21) {
                                class3.field115 = class26.field360 - (int) (503.0D / this.field71) - 48;
                            }
                            class3.field115 <<= 0x10;
                            int var23 = class3.field115 - this.field26;
                            if (var22 >> var17 == 0 && var23 >> var17 == 0) {
                                class32.field419 = -1;
                            } else {
                                this.field91 += var22 >> var17;
                                this.field26 += var23 >> var17;
                                class6.field147 = this.field91 >> 16;
                                class41.field521 = this.field26 >> 16;
                            }
                        }
                        int var24 = class6.field147 - (int) (635.0D / this.field71);
                        int var25 = class41.field521 - (int) (503.0D / this.field71);
                        if (arg0 >= -49) {
                            this.method1((byte) -18, null, null);
                        }
                        int var26 = class6.field147 + (int) (635.0D / this.field71);
                        int var27 = (int) (503.0D / this.field71) + class41.field521;
                        if (var24 < 48) {
                            class6.field147 = (int) (635.0D / this.field71) + 48;
                        }
                        if (var26 > class6.field148 - 48) {
                            class6.field147 = class6.field148 - (int) (635.0D / this.field71) - 48;
                        }
                        if (var25 < 48) {
                            class41.field521 = (int) (503.0D / this.field71) + 48;
                        }
                        if (var27 > class26.field360 - 48) {
                            class41.field521 = class26.field360 - (int) (503.0D / this.field71) - 48;
                        }
                        return;
                    }
                }
            } while (this.field65.method185(47) <= 0);
            for (int var3 = 0; var3 < this.field33; var3++) {
                if (this.field10[var3].method185(53) >= this.field65.method185(100)) {
                    class26 var4 = this.field65.method176(false);
                    class26 var5 = this.field10[var3].method183(782, 32, 47).method180(this.field65.method185(48), true, 0).method176(false);
                    if (var4.method182(var5, false) == 0) {
                        class39.field494 = var3;
                        this.field86 = true;
                        var2 = true;
                        break;
                    }
                }
            }
            if (!var2) {
                this.field65.method187(this.field65.method185(110) - 1, true);
            }
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "c", descriptor = "(B)V", line = 1491)
    public final void method16(byte arg0) {
        class36.method228((byte) -104);
        class25.method165(false);
        try {
            this.field68 = null;
            this.field93 = null;
            class7.field165 = null;
            this.field27 = null;
            this.field77 = null;
            this.field10 = null;
            this.field39 = null;
            this.field92 = null;
            System.gc();
            if (arg0 <= 59) {
                this.init();
            }
        } catch (Throwable var3) {
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "c", descriptor = "(II)Lna;", line = 1522)
    private static final class26 method17(int arg0, int arg1) {
        class26 var2 = new class26();
        var2.field367 = arg0;
        var2.field358 = new byte[arg1];
        return var2;
    }

    @OriginalMember(owner = "mapview!mapview", name = "b", descriptor = "(B)V", line = 1535)
    public final void method18(byte arg0) {
        boolean var2 = false;
        class20.method124(arg0 + 165);
        class17.method107(arg0 + 58, class33.field435);
        class26.method186(class33.field435, 120);
        class3.field119 = this.field64;
        boolean var3 = true;
        this.field77 = class41.method261((byte) 59);
        this.field75 = class29.method196(true);
        if (arg0 != 22) {
            this.field41 = -105;
        }
        if (var3) {
            byte var4 = 0;
            if (this.field75.length == 14) {
                byte var10002 = var4;
                int var5 = var4 + 1;
                this.field67 = this.field75[var10002];
                int var19 = var5;
                int var6 = var5 + 1;
                this.field8 = this.field75[var19];
                int var20 = var6;
                int var7 = var6 + 1;
                this.field57 = this.field75[var20];
                int var21 = var7;
                int var8 = var7 + 1;
                this.field90 = this.field75[var21];
                int var22 = var8;
                int var9 = var8 + 1;
                this.field74 = this.field75[var22];
                int var23 = var9;
                int var10 = var9 + 1;
                this.field64 = this.field75[var23];
                int var24 = var10;
                int var11 = var10 + 1;
                this.field28 = this.field75[var24];
                int var25 = var11;
                int var12 = var11 + 1;
                this.field61 = this.field75[var25];
                int var26 = var12;
                int var13 = var12 + 1;
                this.field72 = this.field75[var26];
                int var27 = var13;
                int var14 = var13 + 1;
                this.field58 = this.field75[var27];
                int var28 = var14;
                int var15 = var14 + 1;
                this.field66 = this.field75[var28];
                int var29 = var15;
                int var16 = var15 + 1;
                this.field98 = this.field75[var29];
                int var17 = var16 + 1;
                int var30 = var17;
                int var18 = var17 + 1;
                this.field69 = this.field75[var30];
                this.field36 = this.field67.method181(0, (byte) -3);
                this.field56 = this.field8.method181(0, (byte) -3);
                this.field62 = this.field57.method181(0, (byte) -3);
                this.field20 = this.method7((byte) -91, this.field36);
                this.field63 = this.method7((byte) -34, this.field56);
                this.field15 = this.method7((byte) 111, this.field62);
            } else {
                class30.method207(arg0 ^ 0x16, new class26[] { class15.field207 });
            }
        }
        this.field65 = method17(arg0 - 22, 50);
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(ILjava/lang/String;[B)V", line = 1621)
    private final void method19(int arg0, String arg1, byte[] arg2) throws IOException {
        FileOutputStream var4 = new FileOutputStream(arg1);
        var4.write(arg2, 0, arg2.length);
        int var5 = 44 % ((arg0 + 75) / 37);
        var4.close();
    }

    @OriginalMember(owner = "mapview!mapview", name = "c", descriptor = "(I)V", line = 1639)
    public final void method20(int arg0) {
        if (!class29.field390) {
            class29.field390 = this.method23(-1);
            class27.method193(31, class3.field119, class33.field437, null);
            return;
        }
        if (arg0 < 30) {
            this.method1((byte) 13, null, null);
        }
        if (this.field86) {
            field7 = true;
            this.field86 = false;
            class21.method132();
            int var2 = (int) (635.0D / this.field71) + class6.field147;
            int var3 = class41.field521 - (int) (503.0D / this.field71);
            int var4 = class6.field147 - (int) (635.0D / this.field71);
            int var5 = (int) (503.0D / this.field71) + class41.field521;
            this.method12(var3, var4, 503, 635, 0, var2, 0, var5, (byte) 59);
            if (this.field16) {
                this.field92.method156(this.field81, this.field88);
                class21.method139(this.field23 * var4 / class6.field148 + this.field81, this.field88 - -(this.field94 * var3 / class26.field360), (var2 - var4) * this.field23 / class6.field148, (var5 - var3) * this.field94 / class26.field360, 16711680, 128);
                class21.method136(this.field81 + this.field23 * var4 / class6.field148, this.field94 * var3 / class26.field360 + this.field88, (var2 - var4) * this.field23 / class6.field148, (var5 - var3) * this.field94 / class26.field360, 16711680);
                if (this.field85 > 0 && this.field85 % 10 < 5) {
                    for (int var6 = 0; var6 < class39.field498; var6++) {
                        if (class7.field165.field154[var6] == this.field76) {
                            int var7 = this.field88 + class7.field165.field162[var6] * this.field94 / class26.field360;
                            int var8 = this.field81 + class7.field165.field146[var6] * this.field23 / class6.field148;
                            class21.method137(var8, var7, 2, 16776960, 256);
                        }
                    }
                }
            }
            if (this.field52) {
                this.method24(18, this.field55, 5592405, (byte) -70, this.field47, 7829367, 10066329, this.field97, this.field90);
                this.method24(this.field44 - 36, this.field55, 5592405, (byte) -96, this.field47, 7829367, 10066329, this.field97 + 18, class37.field473);
                this.method24(18, this.field55, 5592405, (byte) -126, this.field47, 7829367, 10066329, this.field97 + this.field44 - 18, this.field74);
                int var9 = this.field97 + 3 + 18;
                int var10 = this.field11;
                for (int var11 = 0; var11 < 24; var11++) {
                    if (class34.field445.length > var10 && var10 < this.field77.length) {
                        if (this.field77[var10].method173(class33.field433, -2093)) {
                            var10++;
                            var11--;
                            continue;
                        }
                        class34.field445[var10].method159(this.field47 + 3, var9);
                        this.field39.method143(this.field77[var10], this.field47 + 21, var9 + 14, 0, -1);
                        int var12 = 16777215;
                        if (this.field45 == var10) {
                            var12 = 12298922;
                        }
                        if (this.field85 > 0 && this.field85 % 10 < 5 && this.field76 == var10) {
                            var12 = 16776960;
                        }
                        this.field39.method143(this.field77[var10], this.field47 + 20, var9 + 13, var12, -1);
                    }
                    var9 += 17;
                    var10++;
                }
            }
            if (class31.field416.length == 1) {
                this.method24(18, this.field23, this.field50, (byte) -60, this.field81, this.field32, this.field24, this.field94 + this.field88, this.field67);
                this.method24(18, this.field55, this.field50, (byte) -100, this.field47, this.field32, this.field24, this.field97 + this.field44, this.field57);
                if (this.field29 == 3.0D) {
                    this.method24(this.field46, this.field43, this.field70, (byte) -73, this.field14, this.field95, this.field31, this.field82, class26.field364);
                } else {
                    this.method24(this.field46, this.field43, this.field50, (byte) -110, this.field14, this.field32, this.field24, this.field82, class26.field364);
                }
                if (this.field29 == 4.0D) {
                    this.method24(this.field46, this.field43, this.field70, (byte) -51, this.field18 + this.field14, this.field95, this.field31, this.field82, class31.field407);
                } else {
                    this.method24(this.field46, this.field43, this.field50, (byte) -86, this.field14 + this.field18, this.field32, this.field24, this.field82, class31.field407);
                }
                if (this.field29 == 6.0D) {
                    this.method24(this.field46, this.field43, this.field70, (byte) -81, this.field18 * 2 + this.field14, this.field95, this.field31, this.field82, class35.field463);
                } else {
                    this.method24(this.field46, this.field43, this.field50, (byte) -85, this.field18 * 2 + this.field14, this.field32, this.field24, this.field82, class35.field463);
                }
                if (this.field29 == 8.0D) {
                    this.method24(this.field46, this.field43, this.field70, (byte) -101, this.field18 * 3 + this.field14, this.field95, this.field31, this.field82, class17.field225);
                } else {
                    this.method24(this.field46, this.field43, this.field50, (byte) -47, this.field18 * 3 + this.field14, this.field32, this.field24, this.field82, class17.field225);
                }
            } else {
                this.method24(18, this.field23, this.field50, (byte) -77, this.field81, this.field32, this.field24, this.field94 + this.field88, this.field67);
                this.method24(18, this.field55, this.field50, (byte) -85, this.field47, this.field32, this.field24, this.field97 + this.field44, this.field57);
                this.method5(18, this.field32);
                int var13 = this.field82 + this.field79;
                if (this.field29 == 3.0D) {
                    this.method24(this.field46, this.field43, this.field70, (byte) -59, this.field14, this.field95, this.field31, var13, class26.field364);
                } else {
                    this.method24(this.field46, this.field43, this.field50, (byte) -77, this.field14, this.field32, this.field24, var13, class26.field364);
                }
                if (this.field29 == 4.0D) {
                    this.method24(this.field46, this.field43, this.field70, (byte) -110, this.field14 + this.field18, this.field95, this.field31, var13, class31.field407);
                } else {
                    this.method24(this.field46, this.field43, this.field50, (byte) -124, this.field18 + this.field14, this.field32, this.field24, var13, class31.field407);
                }
                if (this.field29 == 6.0D) {
                    this.method24(this.field46, this.field43, this.field70, (byte) -80, this.field18 * 2 + this.field14, this.field95, this.field31, var13, class35.field463);
                } else {
                    this.method24(this.field46, this.field43, this.field50, (byte) -111, this.field18 * 2 + this.field14, this.field32, this.field24, var13, class35.field463);
                }
                if (this.field29 == 8.0D) {
                    this.method24(this.field46, this.field43, this.field70, (byte) -90, this.field18 * 3 + this.field14, this.field95, this.field31, var13, class17.field225);
                } else {
                    this.method24(this.field46, this.field43, this.field50, (byte) -46, this.field18 * 3 + this.field14, this.field32, this.field24, var13, class17.field225);
                }
            }
            if (class19.field243) {
                this.method24(this.field49, this.field96, this.field50, (byte) -110, this.field30, this.field32, this.field24, this.field40, this.field8);
                if (class41.field526) {
                    class21.method139(this.field30 + this.field96 + 2, this.field40, this.field53 + 10, this.field49, 8925952, 192);
                    class21.method136(this.field30 + this.field96 + 2, this.field40, this.field53 + 10, this.field49, 16777215);
                    if (class39.field494 > -1 && this.field65.method185(67) > 0) {
                        class26 var14 = this.field10[class39.field494].method183(782, 32, 47);
                        int var15 = this.field65.method185(80);
                        if (var15 > var14.method185(75)) {
                            var15 = var14.method185(104);
                        }
                        this.field39.method143(var14, this.field30 + this.field96 + 6, 20, 10066176, 0);
                        this.field39.method143(var14.method180(var15, true, 0), this.field30 + this.field96 + 6, 20, 16777215, 0);
                    } else {
                        this.field39.method143(this.field61, this.field96 + this.field30 + 6, 20, 16776960, 0);
                    }
                }
            }
        }
        if (field7) {
            this.method21(104);
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "g", descriptor = "(I)V", line = 1836)
    private final void method21(int arg0) {
        field7 = false;
        try {
            if (arg0 < 53) {
                this.method12(-119, 85, 21, -89, 46, -34, -87, 37, (byte) 57);
            }
            Graphics var2 = class33.field435.getGraphics();
            class12.field181.method116(var2, 0, 0, false);
        } catch (Exception var4) {
            class33.field435.repaint();
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "g", descriptor = "(B)V", line = 1867)
    private final void method22(byte arg0) {
        if (class31.field416.length == 1) {
            class13.field190 = 0;
        } else {
            if (class35.field456 >= 0) {
                class13.field190 = class35.field456;
            } else {
                class13.field190 = this.method9(class13.field190, -5782);
            }
            class35.field456 = this.method9(class13.field190, -5782);
        }
        this.method11((byte) 81, class13.field190);
        if (arg0 >= -126) {
            method25((byte) 36);
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "h", descriptor = "(I)Z", line = 1921)
    private final boolean method23(int arg0) {
        if (~class19.field245 == arg0) {
            this.method8((byte) 123);
            class19.field245 = 1;
        }
        if (class19.field245 == 1) {
            class33.field437 = 15;
            boolean var2 = this.method1((byte) 19, "main_file_cache.idx0", this.field58);
            if (!var2) {
                return false;
            }
            class32.field423 = class7.field166;
            class7.field166 = null;
            if (class32.field423 == null) {
                throw new RuntimeException("T1");
            }
            class19.field245 = 2;
        }
        if (class19.field245 == 2) {
            class33.field437 = 30;
            boolean var3 = this.method1((byte) 19, "main_file_cache.idx1", this.field66);
            if (!var3) {
                return false;
            }
            class4.field133 = class7.field166;
            class7.field166 = null;
            if (class4.field133 == null) {
                throw new RuntimeException("T2");
            }
            class19.field245 = 3;
        }
        if (class19.field245 == 3) {
            class31.field416 = new class12[1];
            class19.field245 = 10;
        }
        if (class19.field245 == 10) {
            class33.field437 = 50;
            boolean var4 = this.method1((byte) 19, "main_file_cache.dat0", this.field98);
            if (!var4) {
                return false;
            }
            class31.field416[0] = class7.field166;
            class7.field166 = null;
            if (class31.field416[0] == null) {
                throw new RuntimeException("T3");
            }
            class19.field245 = 20;
        }
        if (class19.field245 != 20) {
            return false;
        }
        class6.field159 = class37.method238(class37.field473, -32747, class31.field409, class32.field423);
        class34.field445 = class31.method210(class37.field473, (byte) 64, class32.field421, class32.field423);
        this.field39 = method6(arg0 + 3, class32.field423, class27.field376, class37.field473, class4.field133);
        this.field51 = new class38(11, true, this);
        this.field22 = new class38(12, true, this);
        this.field35 = new class38(14, true, this);
        this.field34 = new class38(17, true, this);
        this.field13 = new class38(19, true, this);
        this.field4 = new class38(22, true, this);
        this.field80 = new class38(26, true, this);
        this.field12 = new class38(30, true, this);
        class3.field119 = this.field28;
        class33.field437 = 100;
        class27.method193(31, class3.field119, class33.field437, null);
        this.field96 = this.field39.method149(this.field8) + 20;
        this.method22((byte) -127);
        class26[] var5 = this.field77;
        for (int var6 = 0; var6 < var5.length; var6++) {
            class26 var7 = var5[var6];
            int var8 = this.field39.method149(var7);
            if (var8 > this.field59) {
                this.field59 = var8;
            }
        }
        this.field55 = this.field59 + 18 + 16;
        if (this.field55 > 140) {
            int var9 = this.field81 - this.field47 - this.field55;
            this.field9 = var9 / 25;
            this.field43 = this.field9 * 5;
            this.field18 = this.field43 + this.field9;
            int var10 = var9 - this.field9 * 25;
            this.field14 = this.field47 + this.field55 + this.field9 + var10 / 2;
        }
        return true;
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(IIIBIIIILna;)V", line = 2104)
    private final void method24(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, class26 arg8) {
        class21.method136(arg4, arg7, arg1, arg0, 0);
        int var10 = arg0 - 2;
        int var11 = arg1 - 2;
        int var12 = arg4 + 1;
        if (arg3 >= -41) {
            return;
        }
        int var13 = arg7 + 1;
        class21.method134(var12, var13, var11, var10, arg5);
        class21.method133(var12, var13, var11, arg6);
        class21.method138(var12, var13, var10, arg6);
        class21.method133(var12, var10 + var13 - 1, var11, arg2);
        class21.method138(var12 + var11 - 1, var13, var10, arg2);
        this.field39.method140(arg8, var11 / 2 + var12 + 1, var10 / 2 + var13 + 1 + 4, 0, -1);
        this.field39.method140(arg8, var11 / 2 + var12, var10 / 2 + var13 + 4, 16777215, -1);
    }

    @OriginalMember(owner = "mapview!mapview", name = "h", descriptor = "(B)V", line = 2131)
    public static void method25(byte arg0) {
        field87 = null;
        field21 = null;
        field5 = null;
        field2 = null;
        int var1 = -104 / ((arg0 + 9) / 49);
        field73 = null;
        field84 = null;
        field25 = null;
    }
}
