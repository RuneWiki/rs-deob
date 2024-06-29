import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
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

    @OriginalMember(owner = "mapview!mapview", name = "n", descriptor = "[I")
    private int[] field2 = new int[1500];

    @OriginalMember(owner = "mapview!mapview", name = "w", descriptor = "D")
    private double field11 = 4.0D;

    @OriginalMember(owner = "mapview!mapview", name = "R", descriptor = "I")
    private int field32 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "X", descriptor = "I")
    private int field38 = 5;

    @OriginalMember(owner = "mapview!mapview", name = "V", descriptor = "I")
    private int field36 = 6706483;

    @OriginalMember(owner = "mapview!mapview", name = "H", descriptor = "I")
    private int field22 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "B", descriptor = "I")
    private int field16 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "m", descriptor = "I")
    private int field1 = 450;

    @OriginalMember(owner = "mapview!mapview", name = "G", descriptor = "I")
    private int field21 = 11141120;

    @OriginalMember(owner = "mapview!mapview", name = "t", descriptor = "I")
    private int field8 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "eb", descriptor = "I")
    private int field45 = 7824964;

    @OriginalMember(owner = "mapview!mapview", name = "s", descriptor = "I")
    private int field7 = 8943445;

    @OriginalMember(owner = "mapview!mapview", name = "v", descriptor = "D")
    private double field10 = 4.0D;

    @OriginalMember(owner = "mapview!mapview", name = "hb", descriptor = "I")
    private int field48 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "T", descriptor = "I")
    private int field34 = -1;

    @OriginalMember(owner = "mapview!mapview", name = "o", descriptor = "I")
    private int field3 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "Z", descriptor = "I")
    private int field40 = 8912896;

    @OriginalMember(owner = "mapview!mapview", name = "J", descriptor = "[I")
    private int[] field24 = new int[1500];

    @OriginalMember(owner = "mapview!mapview", name = "ob", descriptor = "I")
    private int field55 = -1;

    @OriginalMember(owner = "mapview!mapview", name = "fb", descriptor = "[I")
    private int[] field46 = new int[1500];

    @OriginalMember(owner = "mapview!mapview", name = "y", descriptor = "I")
    private int field13 = 18;

    @OriginalMember(owner = "mapview!mapview", name = "L", descriptor = "I")
    private int field26 = 10027008;

    @OriginalMember(owner = "mapview!mapview", name = "u", descriptor = "I")
    private int field9 = 40;

    @OriginalMember(owner = "mapview!mapview", name = "qb", descriptor = "Z")
    private boolean field57 = false;

    @OriginalMember(owner = "mapview!mapview", name = "sb", descriptor = "I")
    private int field59 = 500;

    @OriginalMember(owner = "mapview!mapview", name = "N", descriptor = "Z")
    private boolean field28 = true;

    @OriginalMember(owner = "mapview!mapview", name = "xb", descriptor = "I")
    private int field64 = 140;

    @OriginalMember(owner = "mapview!mapview", name = "yb", descriptor = "I")
    private int field65 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "lb", descriptor = "I")
    private int field52 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "pb", descriptor = "I")
    private int field56 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "r", descriptor = "[I")
    private int[] field6 = new int[this.field59];

    @OriginalMember(owner = "mapview!mapview", name = "p", descriptor = "I")
    private int field4 = -1;

    @OriginalMember(owner = "mapview!mapview", name = "A", descriptor = "[I")
    private int[] field15 = new int[this.field59];

    @OriginalMember(owner = "mapview!mapview", name = "ib", descriptor = "I")
    private int field49 = 33;

    @OriginalMember(owner = "mapview!mapview", name = "ub", descriptor = "Z")
    private boolean field61 = false;

    @OriginalMember(owner = "mapview!mapview", name = "gb", descriptor = "[Lh;")
    private class15[] field47 = new class15[this.field59];

    @OriginalMember(owner = "mapview!mapview", name = "Ab", descriptor = "Z")
    private boolean field67 = false;

    @OriginalMember(owner = "mapview!mapview", name = "rb", descriptor = "I")
    private int field58 = 5;

    @OriginalMember(owner = "mapview!mapview", name = "D", descriptor = "[I")
    private int[] field18 = new int[this.field59];

    @OriginalMember(owner = "mapview!mapview", name = "Bb", descriptor = "I")
    private int field68 = 5;

    @OriginalMember(owner = "mapview!mapview", name = "O", descriptor = "I")
    public static volatile int field29 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "P", descriptor = "Lh;")
    private static class15 field30 = class26.method190(true, "37(U");

    @OriginalMember(owner = "mapview!mapview", name = "K", descriptor = "Lh;")
    public static class15 field25 = class26.method190(true, "Bank");

    @OriginalMember(owner = "mapview!mapview", name = "C", descriptor = "Z")
    private static boolean field17 = false;

    @OriginalMember(owner = "mapview!mapview", name = "I", descriptor = "Lh;")
    public static class15 field23 = class26.method190(true, "Mining Site");

    @OriginalMember(owner = "mapview!mapview", name = "F", descriptor = "Lh;")
    public static class15 field20 = class26.method190(true, "Apothecary");

    @OriginalMember(owner = "mapview!mapview", name = "jb", descriptor = "Lh;")
    private static class15 field50 = class26.method190(true, "Switch to ");

    @OriginalMember(owner = "mapview!mapview", name = "M", descriptor = "I")
    private int field27;

    @OriginalMember(owner = "mapview!mapview", name = "W", descriptor = "I")
    private int field37;

    @OriginalMember(owner = "mapview!mapview", name = "cb", descriptor = "I")
    private int field43;

    @OriginalMember(owner = "mapview!mapview", name = "db", descriptor = "I")
    private int field44;

    @OriginalMember(owner = "mapview!mapview", name = "q", descriptor = "I")
    private int field5;

    @OriginalMember(owner = "mapview!mapview", name = "kb", descriptor = "I")
    private int field51;

    @OriginalMember(owner = "mapview!mapview", name = "mb", descriptor = "I")
    private int field53;

    @OriginalMember(owner = "mapview!mapview", name = "Cb", descriptor = "I")
    public static int field69;

    @OriginalMember(owner = "mapview!mapview", name = "zb", descriptor = "Lea;")
    private class10 field66;

    @OriginalMember(owner = "mapview!mapview", name = "bb", descriptor = "Lh;")
    private class15 field42;

    @OriginalMember(owner = "mapview!mapview", name = "vb", descriptor = "Lh;")
    private class15 field62;

    @OriginalMember(owner = "mapview!mapview", name = "x", descriptor = "Ll;")
    private class23 field12;

    @OriginalMember(owner = "mapview!mapview", name = "z", descriptor = "Ll;")
    private class23 field14;

    @OriginalMember(owner = "mapview!mapview", name = "E", descriptor = "Ll;")
    private class23 field19;

    @OriginalMember(owner = "mapview!mapview", name = "Q", descriptor = "Ll;")
    private class23 field31;

    @OriginalMember(owner = "mapview!mapview", name = "S", descriptor = "Ll;")
    private class23 field33;

    @OriginalMember(owner = "mapview!mapview", name = "Y", descriptor = "Ll;")
    private class23 field39;

    @OriginalMember(owner = "mapview!mapview", name = "tb", descriptor = "Ll;")
    private class23 field60;

    @OriginalMember(owner = "mapview!mapview", name = "wb", descriptor = "Ll;")
    private class23 field63;

    @OriginalMember(owner = "mapview!mapview", name = "ab", descriptor = "Ls;")
    private class32 field41;

    @OriginalMember(owner = "mapview!mapview", name = "nb", descriptor = "[B")
    public static byte[] field54;

    @OriginalMember(owner = "mapview!mapview", name = "U", descriptor = "[Lh;")
    private class15[] field35;

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(IB)V", line = 4)
    private final void method1(int arg0, byte arg1) {
        if (arg1 < 36) {
            this.field18 = null;
        }
        if (class35.field447.length <= arg0) {
            return;
        }
        class35 var3 = class35.field447[arg0];
        class18 var4 = new class18(var3.method42((byte) 21, class35.field448, class30.field414));
        var4.method147(-1992);
        class18 var5 = new class18(var3.method42((byte) 21, class29.field397, class30.field414));
        this.field8 = var5.method157(-1);
        for (int var6 = 0; var6 < this.field8; var6++) {
            this.field47[var6] = var5.method147(-1992);
            this.field15[var6] = var5.method157(-1);
            this.field6[var6] = var5.method157(-1);
            this.field18[var6] = var5.method148((byte) 108);
            class15 var7 = this.field47[var6].method112((byte) 111, 32, 47);
            int var8 = this.field66.method84(var7);
            if (var8 > this.field43) {
                this.field43 = var8;
            }
        }
        class3.field115 = new class30();
        class3.field115.method210(class35.field447[arg0], (byte) 124);
        class14.field236 = class26.field355;
        class6.field123 = class21.field305;
        this.field5 = 180;
        this.field37 = class26.field350 * this.field5 / class18.field291;
        this.field51 = 503 - this.field5 - 20;
        this.field44 = 635 - this.field37 - 5;
        this.field41 = new class32(this.field37, this.field5);
        this.field41.method231();
        this.method17(0, this.field5, this.field37, 0, 0, class18.field291, class26.field350, 0, 118);
        class12.method93(0, 0, this.field37, this.field5, 0);
        class12.method93(1, 1, this.field37 - 2, this.field5 + -2, this.field7);
        class36.field457.method69((byte) 64);
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(Ljava/lang/String;[BI)V", line = 70)
    private final void method2(String arg0, byte[] arg1, int arg2) throws IOException {
        FileOutputStream var4 = new FileOutputStream(arg0);
        var4.write(arg1, 0, arg1.length);
        var4.close();
        if (arg2 <= 81) {
            this.method9(-38);
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(II)V", line = 97)
    private final void method3(int arg0, int arg1) {
        if (arg0 < 98) {
            this.method4(-53);
        }
        this.method14(arg1, 483, class16.method142(-105, new class15[] { field50, class14.field241[class9.field149], class31.field429 }), this.field36, this.field7, -119, 170, 18, 230);
    }

    @OriginalMember(owner = "mapview!mapview", name = "i", descriptor = "(I)V", line = 116)
    private final void method4(int arg0) {
        if (class35.field447.length == 1) {
            class25.field344 = 0;
        } else {
            if (class9.field149 < 0) {
                class25.field344 = this.method19(class25.field344, -127);
            } else {
                class25.field344 = class9.field149;
            }
            class9.field149 = this.method19(class25.field344, -128);
        }
        int var2 = -31 / ((88 - arg0) / 38);
        this.method1(class25.field344, (byte) 120);
    }

    @OriginalMember(owner = "mapview!mapview", name = "j", descriptor = "(I)V", line = 146)
    public static void method5(int arg0) {
        field23 = null;
        field25 = null;
        field50 = null;
        field54 = null;
        field30 = null;
        field20 = null;
        if (arg0 <= 106) {
            field30 = null;
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "k", descriptor = "(I)V", line = 163)
    private final void method6(int arg0) {
        class28.field385 = false;
        try {
            if (arg0 != 11242) {
                this.field28 = true;
            }
            Graphics var2 = class31.field430.getGraphics();
            class36.field457.method71(0, var2, (byte) -72, 0);
        } catch (Exception var4) {
            class31.field430.repaint();
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(ZLjava/lang/String;Lh;)Z", line = 180)
    private final boolean method7(boolean arg0, String arg1, class15 arg2) {
        if (!arg0) {
            this.method14(8, 115, null, -30, -20, -80, -109, 1, -46);
        }
        try {
            if (class29.field390 == null) {
                class6.field133 = class16.method142(-116, new class15[] { class16.field270, arg2 });
                String var4;
                if (arg1 == "main_file_cache.dat0") {
                    var4 = "worldmap.main.js5?crc=1285413568";
                } else if (arg1 == "main_file_cache.dat1") {
                    var4 = "worldmap.dungeon.js5?crc=-921022098";
                } else if (arg1 == "main_file_cache.dat2") {
                    var4 = "worldmap.extra.js5?crc=1496897387";
                } else {
                    var4 = "mapview.sprites.js5?crc=-1837203931";
                }
                class29.field390 = new DataInputStream((new URL(this.getCodeBase(), var4)).openStream());
                int var5;
                if (arg1 == "main_file_cache.dat0") {
                    var5 = 386239;
                } else if (arg1 == "main_file_cache.dat1") {
                    var5 = 142684;
                } else if (arg1 == "main_file_cache.dat2") {
                    var5 = 104398;
                } else {
                    var5 = 8200;
                }
                class29.field389 = new byte[var5];
                class25.field338 = 0;
                class11.field217 = 0;
            }
            int var6 = class11.field217;
            int var7 = class29.field389.length;
            if (var6 >= var7) {
                class29.field390.close();
                class29.field390 = null;
                if (!this.method22(arg1, 350, class29.field389)) {
                    this.method51((byte) 118, "download");
                    class29.field389 = null;
                }
                return true;
            }
            class25.field338++;
            if (class25.field338 >= 1500) {
                throw new IOException();
            }
            DataInputStream var8 = class29.field390;
            int var9 = var8.available();
            if (var9 < 0) {
                throw new EOFException();
            } else if (var9 == 0) {
                return false;
            } else {
                if (var9 > var7 - var6) {
                    var9 = var7 - var6;
                }
                int var10 = var8.read(class29.field389, var6, var9);
                if (var10 < 0) {
                    throw new EOFException();
                } else if (var10 == 0) {
                    return false;
                } else {
                    class25.field338 = 0;
                    int var11 = var6 + var10;
                    int var12 = var11 * 100 / var7;
                    class6.field133 = class16.method142(-126, new class15[] { class17.field280, arg2, class1.field71, class3.method47((byte) -109, var12), class17.field276 });
                    class11.field217 = var11;
                    return false;
                }
            }
        } catch (IOException var16) {
            try {
                class29.field390.close();
            } catch (Exception var15) {
            }
            class29.field389 = null;
            class29.field390 = null;
            this.method51((byte) 21, "download");
            return true;
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "l", descriptor = "(I)I", line = 303)
    public static final int method8(int arg0) {
        if (arg0 != 255) {
            field30 = null;
        }
        if (class7.field138 == null) {
            return 0;
        } else if (class7.field138.field380 == null) {
            return class25.field337[class7.field138.field384 & 0xFF];
        } else {
            return class25.field337[class7.field138.field380[class35.field442] & 0xFF];
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "b", descriptor = "(I)V", line = 329)
    public final void method9(int arg0) {
        class1.method27((byte) -38);
        class1.method29(false, class31.field430);
        class1.method26(class31.field430, -100);
        class6.field133 = class14.field238;
        this.field62 = class25.field345;
        this.field35 = class14.method108(arg0 - 8);
        if (arg0 != 64) {
            this.method18(9);
        }
        this.field42 = class15.method123(13073, 30);
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(ILjava/awt/event/KeyEvent;)I", line = 356)
    public static final int method10(int arg0, KeyEvent arg1) {
        if (arg0 >= -124) {
            field30 = null;
        }
        int var2 = arg1.getKeyChar();
        if (var2 <= 0 || var2 >= 256) {
            var2 = -1;
        }
        return var2;
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(Ljava/lang/String;Z)[B", line = 372)
    private final byte[] method11(String arg0, boolean arg1) throws IOException {
        File var3 = new File(arg0);
        if (!var3.exists()) {
            return null;
        }
        int var4 = (int) var3.length();
        if (arg1) {
            method20(15);
        }
        byte[] var5 = new byte[var4];
        DataInputStream var6 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg0)));
        var6.readFully(var5, 0, var4);
        var6.close();
        return var5;
    }

    @OriginalMember(owner = "mapview!mapview", name = "init", descriptor = "()V", line = 397)
    public final void init() {
        if (this.method50(true)) {
            this.method57(class17.field281.method126(this, true).method134(255), (byte) -12, 635, 32, 503);
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "m", descriptor = "(I)V", line = 441)
    private final void method12(int arg0) {
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
                        class29.field393 = var8 + var6 + "/rsmap/";
                        return;
                    }
                }
            } catch (Exception var14) {
            }
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "n", descriptor = "(I)Z", line = 513)
    private final boolean method13(int arg0) {
        if (class33.field437 == 0) {
            this.method12(0);
            class33.field437 = 1;
        }
        if (arg0 < 70) {
            this.method18(89);
        }
        if (class33.field437 == 1) {
            class29.field396 = 25;
            boolean var2 = this.method21(true, class26.field356, "main_file_cache.idx0");
            if (!var2) {
                return false;
            }
            class26.field348 = class9.field151;
            class9.field151 = null;
            if (class26.field348 == null) {
                throw new RuntimeException("T1");
            }
            class33.field437 = 2;
        }
        if (class33.field437 == 2) {
            class35.field447 = new class35[1];
            class33.field437 = 10;
        }
        if (class33.field437 == 10) {
            class29.field396 = 50;
            boolean var3 = this.method21(true, class30.field409, "main_file_cache.dat0");
            if (!var3) {
                return false;
            }
            class35.field447[0] = class9.field151;
            class9.field151 = null;
            if (class35.field447[0] == null) {
                throw new RuntimeException("T2");
            }
            class33.field437 = 20;
        }
        if (class33.field437 != 20) {
            return false;
        }
        class2.field103 = class25.method188((byte) 100, class26.field348, class21.field304, class14.field242);
        class16.field262 = class22.method166(class26.field348, -116, class14.field242, class3.field114);
        this.field66 = class19.method160(class14.field242, class7.field142, 0, class26.field348);
        this.field12 = new class23(11, true, this);
        this.field33 = new class23(12, true, this);
        this.field31 = new class23(14, true, this);
        this.field14 = new class23(17, true, this);
        this.field19 = new class23(19, true, this);
        this.field60 = new class23(22, true, this);
        this.field39 = new class23(26, true, this);
        this.field63 = new class23(30, true, this);
        class29.field396 = 100;
        class6.field133 = class9.field147;
        class25.method184(class6.field133, null, false, class29.field396);
        this.method4(-26);
        return true;
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(IILh;IIIIII)V", line = 606)
    private final void method14(int arg0, int arg1, class15 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class12.method93(arg6, arg1, arg8, arg7, 0);
        int var11 = arg6 + 1;
        int var12 = arg7 - 2;
        int var10 = arg1 + 1;
        int var13 = arg8 - 2;
        class12.method94(var11, var10, var13, var12, arg0);
        class12.method99(var11, var10, var13, arg4);
        class12.method97(var11, var10, var12, arg4);
        class12.method99(var11, var12 + var10 - 1, var13, arg3);
        class12.method97(var11 + var13 - 1, var10, var12, arg3);
        this.field66.method86(arg2, var13 / 2 + var11 + 1, var10 - -(var12 / 2) + 1 - -4, 0);
        this.field66.method86(arg2, var11 + var13 / 2, var10 - (-(var12 / 2) - 4), 16777215);
        if (arg5 > -105) {
            this.method21(false, null, null);
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "d", descriptor = "(I)V", line = 656)
    public final void method15(int arg0) {
        method5(113);
        class22.method167(79);
        class15.method128(arg0 + 31270);
        class21.method164(119);
        class25.method187(-119);
        class18.method151((byte) -88);
        class3.method55(9);
        class1.method28(arg0 + 5837);
        class6.method70(true);
        class35.method237(arg0 + 33585702);
        class30.method223(true);
        class10.method80();
        class23.method177();
        class9.method78(0);
        class2.method32((byte) -97);
        class17.method144(108);
        class12.method101();
        class28.method203((byte) -79);
        class19.method159(true);
        if (arg0 != -31270) {
            return;
        }
        class29.method207(77);
        class16.method138(0);
        class4.method59(95);
        class14.method109(-1);
        class26.method192((byte) -68);
        class36.method238(10);
        class31.method227(0);
        class7.method75(arg0 + 37171);
        class5.method68();
        class11.method90(true);
        this.field62 = null;
        this.field18 = null;
        this.field31 = null;
        this.field63 = null;
        this.field41 = null;
        this.field6 = null;
        this.field42 = null;
        this.field19 = null;
        this.field66 = null;
        this.field33 = null;
        this.field39 = null;
        this.field46 = null;
        this.field60 = null;
        this.field47 = null;
        this.field24 = null;
        this.field35 = null;
        this.field15 = null;
        this.field2 = null;
        this.field12 = null;
        this.field14 = null;
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(I)V", line = 714)
    public final void method16(int arg0) {
        if (!class7.field145) {
            class7.field145 = this.method13(arg0 - 21484);
            class25.method184(class6.field133, null, false, class29.field396);
            return;
        }
        if (this.field28) {
            this.field28 = false;
            class28.field385 = true;
            class12.method96();
            int var2 = (int) (635.0D / this.field11) + class6.field123;
            int var3 = class14.field236 - (int) (503.0D / this.field11);
            int var4 = (int) (503.0D / this.field11) + class14.field236;
            int var5 = class6.field123 - (int) (635.0D / this.field11);
            this.method17(0, 503, 635, var3, var5, var4, var2, 0, 118);
            if (this.field61) {
                this.field41.method230(this.field44, this.field51);
                class12.method100(this.field37 * var5 / class26.field350 + this.field44, this.field5 * var3 / class18.field291 + this.field51, (var2 - var5) * this.field37 / class26.field350, (var4 - var3) * this.field5 / class18.field291, 16711680, 128);
                class12.method93(this.field44 + this.field37 * var5 / class26.field350, this.field51 - -(this.field5 * var3 / class18.field291), (var2 - var5) * this.field37 / class26.field350, (var4 - var3) * this.field5 / class18.field291, 16711680);
                if (this.field3 > 0 && this.field3 % 10 < 5) {
                    for (int var6 = 0; var6 < this.field16; var6++) {
                        if (this.field46[var6] == this.field34) {
                            int var7 = this.field24[var6] * this.field37 / class26.field350 + this.field44;
                            int var8 = this.field2[var6] * this.field5 / class18.field291 + this.field51;
                            class12.method95(var7, var8, 2, 16776960, 256);
                        }
                    }
                }
            }
            if (this.field57) {
                this.method14(7829367, this.field49, class3.field108, 5592405, 10066329, -124, this.field58, 18, this.field64);
                this.method14(7829367, this.field49 + 18, class14.field242, 5592405, 10066329, -121, this.field58, this.field1 - 36, this.field64);
                this.method14(7829367, this.field49 + this.field1 - 18, class15.field258, 5592405, 10066329, -106, this.field58, 18, this.field64);
                int var9 = this.field48;
                int var10 = this.field49 + 18 + 3;
                for (int var11 = 0; var11 < 24; var11++) {
                    if (var9 < class16.field262.length && var9 < this.field35.length) {
                        if (this.field35[var9].method117(class29.field398, true)) {
                            var9++;
                            var11--;
                            continue;
                        }
                        int var12 = 16777215;
                        class16.field262[var9].method232(this.field58 + 3, var10);
                        this.field66.method82(this.field35[var9], this.field58 + 21, var10 + 14, 0);
                        if (this.field55 == var9) {
                            var12 = 12298922;
                        }
                        if (this.field3 > 0 && this.field3 % 10 < 5 && this.field34 == var9) {
                            var12 = 16776960;
                        }
                        this.field66.method82(this.field35[var9], this.field58 + 20, var10 + 13, var12);
                    }
                    var9++;
                    var10 += 17;
                }
            }
            if (class35.field447.length == 1) {
                this.method14(this.field45, this.field51 + this.field5, class3.field113, this.field36, this.field7, arg0 ^ 0xFFFFABC4, this.field44, 18, this.field37);
                this.method14(this.field45, this.field49 + this.field1, class11.field184, this.field36, this.field7, -119, this.field58, 18, this.field64);
                if (this.field10 == 3.0D) {
                    this.method14(this.field26, 471, field30, this.field40, this.field21, -114, 170, 30, 50);
                } else {
                    this.method14(this.field45, 471, field30, this.field36, this.field7, -118, 170, 30, 50);
                }
                if (this.field10 == 4.0D) {
                    this.method14(this.field26, 471, class28.field386, this.field40, this.field21, arg0 - 21704, 230, 30, 50);
                } else {
                    this.method14(this.field45, 471, class28.field386, this.field36, this.field7, -123, 230, 30, 50);
                }
                if (this.field10 == 6.0D) {
                    this.method14(this.field26, 471, class18.field284, this.field40, this.field21, -123, 290, 30, 50);
                } else {
                    this.method14(this.field45, 471, class18.field284, this.field36, this.field7, -124, 290, 30, 50);
                }
                if (this.field10 == 8.0D) {
                    this.method14(this.field26, 471, class15.field252, this.field40, this.field21, -114, 350, 30, 50);
                } else {
                    this.method14(this.field45, 471, class15.field252, this.field36, this.field7, -123, 350, 30, 50);
                }
            } else {
                this.method14(this.field45, this.field51 + this.field5, class3.field113, this.field36, this.field7, -121, this.field44, 18, this.field37);
                this.method14(this.field45, this.field49 + this.field1, class11.field184, this.field36, this.field7, arg0 ^ 0xFFFFABDB, this.field58, 18, this.field64);
                this.method3(103, this.field45);
                if (this.field10 == 3.0D) {
                    this.method14(this.field26, 451, field30, this.field40, this.field21, -128, 170, 30, 50);
                } else {
                    this.method14(this.field45, 451, field30, this.field36, this.field7, arg0 - 21709, 170, 30, 50);
                }
                if (this.field10 == 4.0D) {
                    this.method14(this.field26, 451, class28.field386, this.field40, this.field21, -106, 230, 30, 50);
                } else {
                    this.method14(this.field45, 451, class28.field386, this.field36, this.field7, -121, 230, 30, 50);
                }
                if (this.field10 == 6.0D) {
                    this.method14(this.field26, 451, class18.field284, this.field40, this.field21, -122, 290, 30, 50);
                } else {
                    this.method14(this.field45, 451, class18.field284, this.field36, this.field7, arg0 ^ 0xFFFFABCC, 290, 30, 50);
                }
                if (this.field10 == 8.0D) {
                    this.method14(this.field26, 451, class15.field252, this.field40, this.field21, -120, 350, 30, 50);
                } else {
                    this.method14(this.field45, 451, class15.field252, this.field36, this.field7, -108, 350, 30, 50);
                }
            }
            if (class16.field266) {
                this.method14(this.field45, this.field68, this.field62, this.field36, this.field7, arg0 ^ 0xFFFFABC7, this.field38, this.field68 + this.field13, this.field9 + this.field38);
                if (field17) {
                    class12.method100(this.field9 + this.field38 + 7, this.field68, this.field43 + 10, this.field13 + 5, 8925952, 192);
                    class12.method93(this.field38 + this.field9 + 7, this.field68, this.field43 + 10, this.field13 - -5, 16777215);
                    if (class9.field154 > -1 && this.field42.method129(true) > 0) {
                        class15 var13 = this.field47[class9.field154].method112((byte) 100, 32, 47);
                        int var14 = this.field42.method129(true);
                        if (var14 > var13.method129(true)) {
                            var14 = var13.method129(true);
                        }
                        this.field66.method88(var13, this.field38 + this.field9 + 11, 20, 16776960, true);
                        this.field66.method88(var13.method119(0, var14, arg0 - 21619), this.field9 + this.field38 + 11, 20, 16777215, true);
                    } else {
                        this.field66.method88(class22.field314, this.field38 + this.field9 + 11, 20, 16776960, true);
                    }
                }
            }
        }
        if (class28.field385) {
            this.method6(11242);
        }
        if (arg0 != 21583) {
            this.method6(19);
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(IIIIIIIII)V", line = 915)
    private final void method17(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class3.field115.method209(arg3, arg1, arg7, arg4, arg0, arg6, arg2, arg5, -103);
        if (arg6 - arg4 > -arg0 + arg2) {
            return;
        }
        if (arg8 < 117) {
            this.field45 = 73;
        }
        class3.field115.method215(this.field11, arg7, (byte) 123, arg1, arg3, arg5, arg4, arg6, arg2, arg0);
        class3.field115.method222(arg3, 26183, arg5, arg6, arg0, arg2, arg7, arg1, arg4);
        class3.field115.method220(arg0, arg7, arg2, arg6, arg3, arg5, arg1, this.field34, arg4, -64, this.field3);
        if (this.field11 == this.field10 && class29.field391) {
            for (int var10 = 0; var10 < this.field8; var10++) {
                int var11 = this.field15[var10];
                int var12 = var11 - class15.field254;
                int var13 = this.field6[var10];
                int var14 = class18.field291 + class33.field438 - var13;
                int var15 = (arg2 - arg0) * (-arg4 + var12) / (arg6 - arg4) + arg0;
                int var16 = (var14 - arg3) * (-arg7 + arg1) / (arg5 - arg3) + arg7;
                int var17 = this.field18[var10];
                int var18 = 16777215;
                class23 var19 = null;
                if (var17 == 0) {
                    if (this.field11 == 3.0D) {
                        var19 = this.field12;
                    }
                    if (this.field11 == 4.0D) {
                        var19 = this.field33;
                    }
                    if (this.field11 == 6.0D) {
                        var19 = this.field31;
                    }
                    if (this.field11 == 8.0D) {
                        var19 = this.field14;
                    }
                }
                if (var17 == 1) {
                    if (this.field11 == 3.0D) {
                        var19 = this.field31;
                    }
                    if (this.field11 == 4.0D) {
                        var19 = this.field14;
                    }
                    if (this.field11 == 6.0D) {
                        var19 = this.field19;
                    }
                    if (this.field11 == 8.0D) {
                        var19 = this.field60;
                    }
                }
                if (var17 == 2) {
                    if (this.field11 == 3.0D) {
                        var19 = this.field19;
                    }
                    if (this.field11 == 4.0D) {
                        var19 = this.field60;
                    }
                    if (this.field11 == 6.0D) {
                        var19 = this.field39;
                    }
                    if (this.field11 == 8.0D) {
                        var19 = this.field63;
                    }
                    var18 = 16755200;
                }
                if (var19 != null) {
                    class15 var20 = this.field47[var10];
                    int var21 = 1;
                    for (int var22 = 0; var22 < var20.method129(true); var22++) {
                        if (var20.method113(115, var22) == 47) {
                            var21++;
                        }
                    }
                    int var23 = var16 - var19.method171() * (var21 - 1) / 2;
                    int var24 = var23 + var19.method175() / 2;
                    while (true) {
                        int var25 = var20.method132(47, 0);
                        if (var25 == -1) {
                            var19.method172(var20, var15, var24, var18, true);
                            break;
                        }
                        class15 var26 = var20.method119(0, var25, 106);
                        var19.method172(var26, var15, var24, var18, true);
                        var24 += var19.method171();
                        var20 = var20.method133((byte) 78, var25 + 1);
                    }
                }
            }
        }
        if (!class28.field382) {
            return;
        }
        for (int var27 = class15.field254 / 64; var27 < (class15.field254 + class26.field350) / 64; var27++) {
            for (int var28 = class33.field438 / 64; var28 < (class33.field438 + class18.field291) / 64; var28++) {
                int var29 = var28 * 64;
                int var30 = var27 * 64;
                int var31 = class33.field438 + class18.field291 - var29;
                int var32 = (var31 - arg3 - 64) * (-arg7 + arg1) / (arg5 - arg3) + arg7;
                int var33 = var30 - class15.field254;
                int var34 = (arg2 - arg0) * (-arg4 + var33) / (arg6 - arg4) + arg0;
                int var35 = arg0 + (var33 + 64 - arg4) * (arg2 - arg0) / (arg6 - arg4);
                int var36 = (arg1 - arg7) * (-arg3 + var31) / (arg5 - arg3) + arg7;
                class12.method93(var34, var32, var35 - var34, -var32 + var36, 16777215);
                this.field66.method83(class16.method142(-102, new class15[] { class3.method47((byte) -109, var27), class14.field243, class3.method47((byte) -109, var28) }), var35 - 5, var36 + -5, 16777215);
                if (var27 == 33 && var28 >= 71 && var28 <= 73) {
                    this.field66.method86(class31.field427, (var34 + var35) / 2, (var32 + var36) / 2, 16711680);
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "e", descriptor = "(I)V", line = 1161)
    public final void method18(int arg0) {
        class35.method235(arg0 - 23);
        class17.method143((byte) -26);
        try {
            this.field35 = null;
            this.field66 = null;
            this.field18 = null;
            this.field46 = null;
            this.field15 = null;
            class3.field115 = null;
            this.field47 = null;
            this.field2 = null;
            this.field41 = null;
            this.field24 = null;
            if (arg0 != 87) {
                this.field34 = 59;
            }
            this.field6 = null;
            System.gc();
        } catch (Throwable var3) {
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "b", descriptor = "(II)I", line = 1195)
    private final int method19(int arg0, int arg1) {
        arg0++;
        if (class35.field447.length <= arg0) {
            arg0 = 0;
        }
        return arg1 >= -124 ? -84 : arg0;
    }

    @OriginalMember(owner = "mapview!mapview", name = "o", descriptor = "(I)B", line = 1220)
    public static final byte method20(int arg0) {
        if (arg0 >= -44) {
            method20(-79);
        }
        return class30.field405 == null ? 0 : class30.field405[class35.field442];
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(ZLh;Ljava/lang/String;)Z", line = 1235)
    private final boolean method21(boolean arg0, class15 arg1, String arg2) {
        byte[] var4 = null;
        if (!class18.field289) {
            class18.field289 = true;
            if (class29.field393 != null) {
                try {
                    var4 = this.method11(class29.field393 + "/" + arg2, false);
                    if (!this.method22(arg2, 350, var4)) {
                        var4 = null;
                    }
                    if (var4 != null) {
                        class9.field151 = new class35(var4, false, true);
                        return true;
                    }
                } catch (IOException var11) {
                    var4 = null;
                }
            }
        }
        if (var4 == null) {
            boolean var6 = this.method7(true, arg2, arg1);
            if (!var6) {
                return false;
            }
            var4 = class29.field389;
            class29.field389 = null;
        }
        if (var4 == null) {
            class18.field289 = false;
            return true;
        }
        if (class29.field393 != null && var4 != null) {
            try {
                this.method2(class29.field393 + "/" + arg2, var4, 95);
            } catch (IOException var10) {
            }
        }
        try {
            class9.field151 = new class35(var4, false, arg0);
            class18.field289 = false;
            return true;
        } catch (IOException var9) {
            throw class3.method49(var9, "monkey feet");
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(Ljava/lang/String;I[B)Z", line = 1307)
    private final boolean method22(String arg0, int arg1, byte[] arg2) {
        if (arg2 == null) {
            return false;
        }
        try {
            MessageDigest var4 = MessageDigest.getInstance("SHA");
            var4.reset();
            var4.update(arg2);
            byte[] var5 = var4.digest();
            if (arg0 == "main_file_cache.dat0") {
                if (var5[0] != 8 || var5[1] != 2 || var5[2] != 120 || var5[3] != 62 || var5[4] != 2 || var5[5] != -88 || var5[6] != -96 || var5[7] != 58 || var5[8] != -115 || var5[9] != 27 || var5[10] != -121 || var5[11] != 18 || var5[12] != -119 || var5[13] != -70 || var5[14] != -73 || var5[15] != -107 || var5[16] != -12 || var5[17] != -114 || var5[18] != 75 || var5[19] != -127) {
                    return false;
                }
            } else if (var5[0] != -41 || var5[1] != 31 || var5[2] != -75 || var5[3] != -74 || var5[4] != 71 || var5[5] != 73 || var5[6] != -3 || var5[7] != 121 || var5[8] != 51 || var5[9] != -3 || var5[10] != 1 || var5[11] != -10 || var5[12] != 56 || var5[13] != -82 || var5[14] != -4 || var5[15] != -69 || var5[16] != 77 || var5[17] != -66 || var5[18] != -44 || var5[19] != 124) {
                return false;
            }
            if (arg1 != 350) {
                this.field59 = 64;
            }
            return true;
        } catch (Exception var7) {
            this.method51((byte) -121, "sha");
            return false;
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "g", descriptor = "(I)V", line = 1376)
    public final void method23(int arg0) {
        if (class21.field310) {
            class18.method155(class31.field430, arg0 + 9832);
            class1.method24(false, class31.field430);
            this.method52(arg0 + 9577);
            class1.method29(false, class31.field430);
            class1.method26(class31.field430, -110);
        }
        class7.method73((byte) -112);
        class11.method91((byte) -70);
        if (!class7.field145) {
            return;
        }
        if (class18.field287[96]) {
            class29.field395 = -1;
            this.field28 = true;
            class6.field123 = (int) ((double) class6.field123 - 16.0D / this.field11);
        }
        if (class18.field287[97]) {
            class6.field123 = (int) (16.0D / this.field11 + (double) class6.field123);
            class29.field395 = -1;
            this.field28 = true;
        }
        if (class18.field287[98]) {
            class14.field236 = (int) ((double) class14.field236 - 16.0D / this.field11);
            class29.field395 = -1;
            this.field28 = true;
        }
        if (class18.field287[99]) {
            class14.field236 = (int) (16.0D / this.field11 + (double) class14.field236);
            this.field28 = true;
            class29.field395 = -1;
        }
        while (true) {
            boolean var2;
            label483: do {
                while (true) {
                    while (true) {
                        while (class19.method161(14453)) {
                            if (!class16.field266 || !field17) {
                                if (class36.field458 == 102) {
                                    field17 = true;
                                    this.field28 = true;
                                }
                                if (class36.field458 == 49) {
                                    this.field28 = true;
                                    this.field10 = 3.0D;
                                }
                                if (class36.field458 == 50) {
                                    this.field10 = 4.0D;
                                    this.field28 = true;
                                }
                                if (class36.field458 == 51) {
                                    this.field28 = true;
                                    this.field10 = 6.0D;
                                }
                                if (class36.field458 == 52) {
                                    this.field28 = true;
                                    this.field10 = 8.0D;
                                }
                                if (class36.field458 == 107 || class36.field458 == 75) {
                                    this.field57 = !this.field57;
                                    this.field28 = true;
                                }
                                if (class36.field458 == 111 || class36.field458 == 79) {
                                    this.field28 = true;
                                    this.field61 = !this.field61;
                                }
                            } else if (class2.field91 == 0) {
                                field17 = false;
                                this.field28 = true;
                                this.field42.method122(0, 27311);
                                class9.field154 = -1;
                            } else {
                                if (class2.field91 != 84) {
                                    var2 = false;
                                    if (class2.field91 == 85) {
                                        if (this.field42.method129(true) > 0) {
                                            this.field42.method122(this.field42.method129(true) - 1, 27311);
                                            this.field28 = true;
                                            if (this.field42.method129(true) == 0) {
                                                class9.field154 = -1;
                                            } else {
                                                var2 = true;
                                            }
                                        }
                                    } else if (class36.field458 != -1 && this.field42.method129(true) <= class19.field292) {
                                        this.field42.method118(class36.field458, (byte) 123);
                                        this.field28 = true;
                                    }
                                    continue label483;
                                }
                                this.field27 = class6.field123 << 16;
                                field17 = false;
                                class29.field395 = class9.field154;
                                this.field53 = class14.field236 << 16;
                                this.field42.method122(0, 27311);
                                class9.field154 = -1;
                                this.field28 = true;
                            }
                        }
                        if (arg0 != -9577) {
                            return;
                        }
                        int var6 = class6.field124;
                        int var7 = class31.field421;
                        int var8 = class7.field139;
                        int var9 = class33.field439;
                        int var10 = class22.field319;
                        int var11 = class11.field183;
                        if (var6 == 1) {
                            this.field32 = class6.field123;
                            this.field52 = var10;
                            this.field65 = class14.field236;
                            this.field56 = var7;
                            if (class35.field447.length == 1) {
                                if (var7 > 170 && var7 < 220 && var10 > 471 && var10 < 503) {
                                    this.field10 = 3.0D;
                                    this.field56 = -1;
                                }
                                if (var7 > 230 && var7 < 280 && var10 > 471 && var10 < 503) {
                                    this.field10 = 4.0D;
                                    this.field56 = -1;
                                }
                                if (var7 > 290 && var7 < 340 && var10 > 471 && var10 < 503) {
                                    this.field56 = -1;
                                    this.field10 = 6.0D;
                                }
                                if (var7 > 350 && var7 < 400 && var10 > 471 && var10 < 503) {
                                    this.field56 = -1;
                                    this.field10 = 8.0D;
                                }
                            } else {
                                if (var7 > 170 && var7 < 220 && var10 > 451 && var10 < 483) {
                                    this.field56 = -1;
                                    this.field10 = 3.0D;
                                }
                                if (var7 > 230 && var7 < 280 && var10 > 451 && var10 < 483) {
                                    this.field56 = -1;
                                    this.field10 = 4.0D;
                                }
                                if (var7 > 290 && var7 < 340 && var10 > 451 && var10 < 483) {
                                    this.field56 = -1;
                                    this.field10 = 6.0D;
                                }
                                if (var7 > 350 && var7 < 400 && var10 > 451 && var10 < 483) {
                                    this.field56 = -1;
                                    this.field10 = 8.0D;
                                }
                                if (var7 > 170 && var7 < 400 && var10 > 483 && var10 < 503) {
                                    this.method3(107, this.field26);
                                    this.method6(11242);
                                    this.method4(-36);
                                    this.field56 = -1;
                                }
                            }
                            this.field67 = false;
                            this.field28 = true;
                            if (this.field58 < var7 && var10 > this.field49 + this.field1 && var7 < this.field64 + this.field58 && var10 < 503) {
                                this.field57 = !this.field57;
                                this.field56 = -1;
                            }
                            if (this.field44 < var7 && this.field51 + this.field5 < var10 && var7 < this.field44 + this.field37 && var10 < 503) {
                                this.field56 = -1;
                                this.field61 = !this.field61;
                            }
                            if (this.field57) {
                                if (var7 > this.field58 && this.field49 < var10 && this.field64 + this.field58 > var7 && var10 < this.field49 + 18 && this.field22 > 0) {
                                    this.field22 -= 25;
                                }
                                if (this.field58 < var7 && var10 > this.field49 + this.field1 - 18 && this.field64 + this.field58 > var7 && this.field49 + this.field1 > var10 && this.field22 < 50) {
                                    this.field22 += 25;
                                }
                                if (this.field58 < var7 && var10 > this.field49 && var7 < this.field64 + this.field58 && this.field49 + this.field1 > var10) {
                                    this.field56 = -1;
                                }
                            }
                            if (this.field61 && var7 > this.field44 && this.field51 < var10 && var7 < this.field44 + this.field37 && var10 < this.field51 + this.field5) {
                                this.field56 = -1;
                                this.field67 = true;
                                class6.field123 = (var7 - this.field44) * class26.field350 / this.field37;
                                class14.field236 = (var10 - this.field51) * class18.field291 / this.field5;
                            }
                            if (class16.field266 && !field17 && !this.field67 && this.field38 < var7 && this.field68 < var10 && this.field9 + this.field38 > var7 && var10 < this.field68 + this.field13) {
                                field17 = true;
                            }
                        }
                        if (this.field57) {
                            this.field55 = -1;
                            if (var11 > this.field58 && this.field58 + this.field64 > var11) {
                                int var12 = this.field48;
                                int var13 = this.field49 + 5 + 21;
                                for (int var14 = 0; var14 < 24; var14++) {
                                    if (this.field35.length > var12 && this.field35[var12].method117(class29.field398, true)) {
                                        var14--;
                                        var12++;
                                    } else {
                                        if (var13 <= var9 && var9 < var13 + 17) {
                                            this.field55 = var12;
                                            if (var6 == 1) {
                                                this.field3 = 50;
                                                this.field34 = var12;
                                            }
                                        }
                                        var13 += 17;
                                        var12++;
                                    }
                                }
                            }
                            if (this.field55 != this.field4) {
                                this.field28 = true;
                                this.field4 = this.field55;
                            }
                        }
                        if (var8 == 1 && this.field61 && this.field67) {
                            class29.field395 = -1;
                            this.field28 = true;
                            int var15 = var11;
                            int var16 = var9;
                            if (this.field44 > var11) {
                                var15 = this.field44;
                            } else if (this.field44 + this.field37 < var11) {
                                var15 = this.field44 + this.field37;
                            }
                            class6.field123 = (var15 - this.field44) * class26.field350 / this.field37;
                            if (this.field51 > var9) {
                                var16 = this.field51;
                            } else if (var9 > this.field51 + this.field5) {
                                var16 = this.field51 + this.field5;
                            }
                            class14.field236 = (var16 - this.field51) * class18.field291 / this.field5;
                        } else {
                            this.field67 = false;
                        }
                        if (var8 == 1 && this.field56 != -1) {
                            class6.field123 = (int) ((double) (this.field56 - var11) * 2.0D / this.field10) + this.field32;
                            this.field28 = true;
                            class14.field236 = (int) ((double) (this.field52 - var9) * 2.0D / this.field10) + this.field65;
                            class29.field395 = -1;
                        }
                        if (this.field10 > this.field11) {
                            this.field11 /= 30.0D;
                            if (this.field10 < this.field11) {
                                this.field11 = this.field10;
                            }
                            this.field28 = true;
                        }
                        if (this.field10 < this.field11) {
                            this.field11 /= 30.0D;
                            if (this.field11 < this.field10) {
                                this.field11 = this.field10;
                            }
                            this.field28 = true;
                        }
                        if (this.field48 < this.field22) {
                            this.field28 = true;
                            this.field48++;
                        }
                        if (this.field22 < this.field48) {
                            this.field28 = true;
                            this.field48--;
                        }
                        if (this.field3 > 0) {
                            this.field28 = true;
                            this.field3--;
                        }
                        if (class29.field395 >= 0) {
                            class25.field341 = this.field15[class29.field395] - class15.field254;
                            class35.field445 = class18.field291 + class33.field438 - this.field6[class29.field395];
                            byte var17 = 4;
                            this.field28 = true;
                            int var18 = class25.field341 - (int) (635.0D / this.field11);
                            int var19 = (int) (635.0D / this.field11) + class25.field341;
                            int var20 = class35.field445 - (int) (503.0D / this.field11);
                            if (var18 < 48) {
                                class25.field341 = (int) (635.0D / this.field11) + 48;
                            }
                            int var21 = class35.field445 + (int) (503.0D / this.field11);
                            if (class26.field350 - 48 < var19) {
                                class25.field341 = class26.field350 - (int) (635.0D / this.field11) - 48;
                            }
                            class25.field341 <<= 0x10;
                            if (var20 < 48) {
                                class35.field445 = (int) (503.0D / this.field11) + 48;
                            }
                            int var22 = class25.field341 - this.field27;
                            if (var21 > class18.field291 - 48) {
                                class35.field445 = class18.field291 - (int) (503.0D / this.field11) - 48;
                            }
                            class35.field445 <<= 0x10;
                            int var23 = class35.field445 - this.field53;
                            if (var22 >> var17 == 0 && var23 >> var17 == 0) {
                                class29.field395 = -1;
                            } else {
                                this.field27 += var22 >> var17;
                                class6.field123 = this.field27 >> 16;
                                this.field53 += var23 >> var17;
                                class14.field236 = this.field53 >> 16;
                            }
                        }
                        int var24 = class6.field123 - (int) (635.0D / this.field11);
                        int var25 = class14.field236 - (int) (503.0D / this.field11);
                        int var26 = (int) (635.0D / this.field11) + class6.field123;
                        int var27 = class14.field236 + (int) (503.0D / this.field11);
                        if (var25 < 48) {
                            class14.field236 = (int) (503.0D / this.field11) + 48;
                        }
                        if (var24 < 48) {
                            class6.field123 = (int) (635.0D / this.field11) + 48;
                        }
                        if (var26 > class26.field350 - 48) {
                            class6.field123 = class26.field350 - (int) (635.0D / this.field11) - 48;
                        }
                        if (class18.field291 - 48 < var27) {
                            class14.field236 = class18.field291 - (int) (503.0D / this.field11) - 48;
                        }
                        return;
                    }
                }
            } while (this.field42.method129(true) <= 0);
            for (int var3 = 0; var3 < this.field8; var3++) {
                if (this.field47[var3].method129(true) >= this.field42.method129(true)) {
                    class15 var4 = this.field42.method115((byte) 73);
                    class15 var5 = this.field47[var3].method112((byte) 82, 32, 47).method119(0, this.field42.method129(true), 91).method115((byte) 73);
                    if (var4.method120(30729, var5) == 0) {
                        var2 = true;
                        this.field28 = true;
                        class9.field154 = var3;
                        break;
                    }
                }
            }
            if (!var2) {
                this.field42.method122(this.field42.method129(true) - 1, arg0 ^ 0xFFFFB038);
            }
        }
    }
}
