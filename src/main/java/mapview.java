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
public class mapview extends class10 {

    @OriginalMember(owner = "mapview!mapview", name = "j", descriptor = "I")
    private int field3 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "k", descriptor = "I")
    private int field4 = -1;

    @OriginalMember(owner = "mapview!mapview", name = "D", descriptor = "I")
    private int field23 = 40;

    @OriginalMember(owner = "mapview!mapview", name = "C", descriptor = "I")
    private int field22 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "y", descriptor = "I")
    private int field18 = 33;

    @OriginalMember(owner = "mapview!mapview", name = "i", descriptor = "I")
    private int field2 = 5;

    @OriginalMember(owner = "mapview!mapview", name = "m", descriptor = "I")
    private int field6 = 5;

    @OriginalMember(owner = "mapview!mapview", name = "p", descriptor = "I")
    private int field9 = -1;

    @OriginalMember(owner = "mapview!mapview", name = "E", descriptor = "I")
    private int field24 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "Q", descriptor = "Z")
    private boolean field35 = true;

    @OriginalMember(owner = "mapview!mapview", name = "w", descriptor = "I")
    private int field16 = -1;

    @OriginalMember(owner = "mapview!mapview", name = "n", descriptor = "I")
    private int field7 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "M", descriptor = "Z")
    private boolean field31 = false;

    @OriginalMember(owner = "mapview!mapview", name = "Y", descriptor = "I")
    private int field43 = 10027008;

    @OriginalMember(owner = "mapview!mapview", name = "r", descriptor = "Z")
    private boolean field11 = false;

    @OriginalMember(owner = "mapview!mapview", name = "q", descriptor = "I")
    private int field10 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "O", descriptor = "I")
    private int field33 = 11141120;

    @OriginalMember(owner = "mapview!mapview", name = "S", descriptor = "I")
    private int field37 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "T", descriptor = "D")
    private double field38 = 4.0D;

    @OriginalMember(owner = "mapview!mapview", name = "K", descriptor = "I")
    private int field30 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "eb", descriptor = "I")
    private int field49 = 8943445;

    @OriginalMember(owner = "mapview!mapview", name = "N", descriptor = "I")
    private int field32 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "gb", descriptor = "I")
    private int field51 = 500;

    @OriginalMember(owner = "mapview!mapview", name = "Z", descriptor = "D")
    private double field44 = 4.0D;

    @OriginalMember(owner = "mapview!mapview", name = "R", descriptor = "[I")
    private int[] field36 = new int[this.field51];

    @OriginalMember(owner = "mapview!mapview", name = "J", descriptor = "[I")
    private int[] field29 = new int[this.field51];

    @OriginalMember(owner = "mapview!mapview", name = "B", descriptor = "I")
    private int field21 = 6706483;

    @OriginalMember(owner = "mapview!mapview", name = "P", descriptor = "[Lh;")
    private class15[] field34 = new class15[this.field51];

    @OriginalMember(owner = "mapview!mapview", name = "V", descriptor = "I")
    private int field40 = 8912896;

    @OriginalMember(owner = "mapview!mapview", name = "kb", descriptor = "I")
    private int field55 = 5;

    @OriginalMember(owner = "mapview!mapview", name = "fb", descriptor = "I")
    private int field50 = 140;

    @OriginalMember(owner = "mapview!mapview", name = "hb", descriptor = "[I")
    private int[] field52 = new int[this.field51];

    @OriginalMember(owner = "mapview!mapview", name = "A", descriptor = "I")
    private int field20 = 7824964;

    @OriginalMember(owner = "mapview!mapview", name = "ab", descriptor = "I")
    private int field45 = 450;

    @OriginalMember(owner = "mapview!mapview", name = "lb", descriptor = "I")
    private int field56 = 18;

    @OriginalMember(owner = "mapview!mapview", name = "pb", descriptor = "Z")
    private boolean field60 = false;

    @OriginalMember(owner = "mapview!mapview", name = "t", descriptor = "Lh;")
    public static class15 field13 = class18.method153("Makeover Mage", 1);

    @OriginalMember(owner = "mapview!mapview", name = "h", descriptor = "I")
    private int field1;

    @OriginalMember(owner = "mapview!mapview", name = "v", descriptor = "I")
    public static int field15;

    @OriginalMember(owner = "mapview!mapview", name = "F", descriptor = "I")
    private int field25;

    @OriginalMember(owner = "mapview!mapview", name = "U", descriptor = "I")
    private int field39;

    @OriginalMember(owner = "mapview!mapview", name = "W", descriptor = "I")
    private int field41;

    @OriginalMember(owner = "mapview!mapview", name = "X", descriptor = "I")
    private int field42;

    @OriginalMember(owner = "mapview!mapview", name = "l", descriptor = "I")
    private int field5;

    @OriginalMember(owner = "mapview!mapview", name = "ib", descriptor = "I")
    private int field53;

    @OriginalMember(owner = "mapview!mapview", name = "mb", descriptor = "I")
    public static int field57;

    @OriginalMember(owner = "mapview!mapview", name = "ob", descriptor = "I")
    public static int field59;

    @OriginalMember(owner = "mapview!mapview", name = "qb", descriptor = "I")
    public static int field61;

    @OriginalMember(owner = "mapview!mapview", name = "G", descriptor = "Lh;")
    private class15 field26;

    @OriginalMember(owner = "mapview!mapview", name = "H", descriptor = "Lh;")
    private class15 field27;

    @OriginalMember(owner = "mapview!mapview", name = "I", descriptor = "Li;")
    private class17 field28;

    @OriginalMember(owner = "mapview!mapview", name = "o", descriptor = "Lo;")
    private class29 field8;

    @OriginalMember(owner = "mapview!mapview", name = "s", descriptor = "Ld;")
    private class7 field12;

    @OriginalMember(owner = "mapview!mapview", name = "u", descriptor = "Ld;")
    private class7 field14;

    @OriginalMember(owner = "mapview!mapview", name = "x", descriptor = "Ld;")
    private class7 field17;

    @OriginalMember(owner = "mapview!mapview", name = "z", descriptor = "Ld;")
    private class7 field19;

    @OriginalMember(owner = "mapview!mapview", name = "bb", descriptor = "Ld;")
    private class7 field46;

    @OriginalMember(owner = "mapview!mapview", name = "db", descriptor = "Ld;")
    private class7 field48;

    @OriginalMember(owner = "mapview!mapview", name = "jb", descriptor = "Ld;")
    private class7 field54;

    @OriginalMember(owner = "mapview!mapview", name = "nb", descriptor = "Ld;")
    private class7 field58;

    @OriginalMember(owner = "mapview!mapview", name = "cb", descriptor = "[Lh;")
    private class15[] field47;

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(IIIIIIIII)V", line = 6)
    private final void method1(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class16.field243.method211(arg0, arg2, arg4, arg3, arg8, arg6, arg5, arg7, (byte) 52);
        if (arg6 - arg2 > arg4 - arg5) {
            return;
        }
        class16.field243.method216(arg4, arg8, arg0, this.field38, arg3, arg7, arg2, arg1 + 428849244, arg5, arg6);
        class16.field243.method224(arg7, arg6, arg2, arg0, (byte) -89, arg3, arg4, arg5, arg8);
        class16.field243.method214(arg5, (byte) -113, arg4, arg7, arg0, arg3, arg8, arg6, this.field4, this.field24, arg2);
        if (arg1 != 20) {
            return;
        }
        if (this.field44 == this.field38 && class32.field414) {
            for (int var10 = 0; var10 < this.field10; var10++) {
                int var11 = this.field52[var10];
                int var12 = class31.field395 + class28.field357 - var11;
                int var13 = this.field29[var10];
                int var14 = var13 - class22.field304;
                int var15 = (var12 - arg7) * (-arg3 + arg0) / (arg8 - arg7) + arg3;
                int var16 = 16777215;
                int var17 = arg5 + (var14 - arg2) * (-arg5 + arg4) / (arg6 - arg2);
                int var18 = this.field36[var10];
                class7 var19 = null;
                if (var18 == 0) {
                    if (this.field38 == 3.0D) {
                        var19 = this.field54;
                    }
                    if (this.field38 == 4.0D) {
                        var19 = this.field17;
                    }
                    if (this.field38 == 6.0D) {
                        var19 = this.field46;
                    }
                    if (this.field38 == 8.0D) {
                        var19 = this.field14;
                    }
                }
                if (var18 == 1) {
                    if (this.field38 == 3.0D) {
                        var19 = this.field46;
                    }
                    if (this.field38 == 4.0D) {
                        var19 = this.field14;
                    }
                    if (this.field38 == 6.0D) {
                        var19 = this.field58;
                    }
                    if (this.field38 == 8.0D) {
                        var19 = this.field48;
                    }
                }
                if (var18 == 2) {
                    if (this.field38 == 3.0D) {
                        var19 = this.field58;
                    }
                    var16 = 16755200;
                    if (this.field38 == 4.0D) {
                        var19 = this.field48;
                    }
                    if (this.field38 == 6.0D) {
                        var19 = this.field19;
                    }
                    if (this.field38 == 8.0D) {
                        var19 = this.field12;
                    }
                }
                if (var19 != null) {
                    class15 var20 = this.field34[var10];
                    int var21 = 1;
                    for (int var22 = 0; var22 < var20.method133((byte) -17); var22++) {
                        if (var20.method129(var22, 10) == 47) {
                            var21++;
                        }
                    }
                    int var23 = var15 - var19.method65() * (var21 - 1) / 2;
                    int var24 = var23 + var19.method60() / 2;
                    while (true) {
                        int var25 = var20.method138(true, 47);
                        if (var25 == -1) {
                            var19.method59(var20, var17, var24, var16, true);
                            break;
                        }
                        class15 var26 = var20.method126(var25, (byte) -120, 0);
                        var19.method59(var26, var17, var24, var16, true);
                        var24 += var19.method65();
                        var20 = var20.method120(arg1 ^ 0x32, var25 + 1);
                    }
                }
            }
        }
        if (!class9.field120) {
            return;
        }
        for (int var27 = class22.field304 / 64; var27 < (class22.field304 + class33.field423) / 64; var27++) {
            for (int var28 = class31.field395 / 64; var28 < (class31.field395 + class28.field357) / 64; var28++) {
                int var29 = var27 * 64;
                int var30 = var28 * 64;
                int var31 = var29 - class22.field304;
                int var32 = class31.field395 + class28.field357 - var30;
                int var33 = (var31 - arg2) * (arg4 - arg5) / (arg6 - arg2) + arg5;
                int var34 = (var32 - arg7 - 64) * (-arg3 + arg0) / (arg8 - arg7) + arg3;
                int var35 = (arg4 - arg5) * (var31 + 64 + -arg2) / (arg6 - arg2) + arg5;
                int var36 = (arg0 - arg3) * (-arg7 + var32) / (arg8 - arg7) + arg3;
                class8.method69(var33, var34, var35 - var33, -var34 + var36, 16777215);
                this.field8.method198(class21.method179(true, new class15[] { class33.method226(var27, (byte) 95), class32.field408, class33.method226(var28, (byte) 67) }), var35 - 5, var36 + -5, 16777215);
                if (var27 == 33 && var28 >= 71 && var28 <= 73) {
                    this.field8.method196(class19.field277, (var35 + var33) / 2, (var36 + var34) / 2, 16711680);
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(IBI)B", line = 194)
    public static final byte method2(int arg0, byte arg1, int arg2) {
        if (arg1 != -50) {
            method23(null, null);
        }
        int var3 = arg2 >> 6;
        int var4 = arg0 >> 6;
        if (class25.field335[var4][var3] == null) {
            return 0;
        } else if (class25.field335[var4][var3].field452 == null) {
            return class25.field335[var4][var3].field446;
        } else {
            return class25.field335[var4][var3].field452[(arg0 & 0xFC0) + arg2 & 0x3F];
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(IZ)V", line = 222)
    private final void method3(int arg0, boolean arg1) {
        this.method6(arg0, 170, 230, 18, 5541, this.field21, class21.method179(arg1, new class15[] { class25.field333, class6.field103[class12.field178], class18.field250 }), 483, this.field49);
    }

    @OriginalMember(owner = "mapview!mapview", name = "j", descriptor = "(I)V", line = 240)
    public final void method4(int arg0) {
        method20(191);
        class23.method183(arg0 + 6008);
        class15.method124(false);
        class25.method188(arg0 ^ 0x276E);
        class18.method150(64);
        class19.method169(16711680);
        class10.method87(arg0 + 10026);
        class14.method112((byte) 42);
        class24.method185(-26237);
        class9.method81(-21853);
        class22.method181(33554432);
        class32.method219((byte) -128);
        class29.method203();
        class7.method61();
        if (arg0 != -10021) {
            this.method3(-112, true);
        }
        class20.method175(arg0 - 20308);
        class13.method108((byte) -124);
        class35.method235((byte) 124);
        class8.method71();
        class36.method237(0);
        class12.method97(arg0 + 9919);
        class16.method142((byte) -113);
        class6.method55(arg0 ^ 0xFFFFD8DB);
        class30.method205(2647);
        class33.method225(arg0 + 30092);
        class31.method206((byte) 44);
        class21.method178(true);
        class5.method51((byte) -127);
        class28.method194((byte) -92);
        class3.method37();
        class11.method94(-85);
        this.field14 = null;
        this.field28 = null;
        this.field12 = null;
        this.field19 = null;
        this.field54 = null;
        this.field48 = null;
        this.field47 = null;
        this.field26 = null;
        this.field17 = null;
        this.field46 = null;
        this.field29 = null;
        this.field58 = null;
        this.field34 = null;
        this.field36 = null;
        this.field8 = null;
        this.field27 = null;
        this.field52 = null;
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(BLjava/lang/String;)[B", line = 297)
    private final byte[] method5(byte arg0, String arg1) throws IOException {
        File var3 = new File(arg1);
        if (!var3.exists()) {
            return null;
        }
        int var4 = (int) var3.length();
        byte[] var5 = new byte[var4];
        if (arg0 > -99) {
            this.method4(119);
        }
        DataInputStream var6 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg1)));
        var6.readFully(var5, 0, var4);
        var6.close();
        return var5;
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(IIIIIILh;II)V", line = 323)
    private final void method6(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class15 arg6, int arg7, int arg8) {
        class8.method69(arg1, arg7, arg2, arg3, 0);
        int var12 = arg3 - 2;
        int var11 = arg2 - 2;
        int var13 = arg7 + 1;
        int var10 = arg1 + 1;
        class8.method75(var10, var13, var11, var12, arg0);
        class8.method76(var10, var13, var11, arg8);
        class8.method72(var10, var13, var12, arg8);
        class8.method76(var10, var13 + var12 - 1, var11, arg5);
        class8.method72(var10 + var11 - 1, var13, var12, arg5);
        this.field8.method196(arg6, var11 / 2 + var10 + 1, var12 / 2 + var13 + 4 + 1, 0);
        if (arg4 != 5541) {
            this.field58 = null;
        }
        this.field8.method196(arg6, var10 + var11 / 2, var13 - (-(var12 / 2) - 4), 16777215);
    }

    @OriginalMember(owner = "mapview!mapview", name = "b", descriptor = "(I)V", line = 354)
    public final void method7(int arg0) {
        class23.method184(16);
        if (arg0 != 188) {
            this.field31 = true;
        }
        class15.method123(65);
        try {
            this.field36 = null;
            this.field8 = null;
            class16.field243 = null;
            this.field52 = null;
            this.field34 = null;
            this.field29 = null;
            this.field47 = null;
            this.field28 = null;
            System.gc();
        } catch (Throwable var3) {
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "k", descriptor = "(I)V", line = 379)
    private static final void method8(int arg0) {
        if (arg0 != 7) {
            field59 = -24;
        }
        if (class4.field67.toLowerCase().indexOf("microsoft") != -1) {
            class5.field89[186] = 57;
            class5.field89[187] = 27;
            class5.field89[188] = 71;
            class5.field89[189] = 26;
            class5.field89[190] = 72;
            class5.field89[191] = 73;
            class5.field89[192] = 58;
            class5.field89[219] = 42;
            class5.field89[220] = 74;
            class5.field89[221] = 43;
            class5.field89[222] = 59;
            class5.field89[223] = 28;
            return;
        }
        class5.field89[44] = 71;
        class5.field89[45] = 26;
        class5.field89[46] = 72;
        class5.field89[47] = 73;
        class5.field89[59] = 57;
        class5.field89[61] = 27;
        class5.field89[91] = 42;
        class5.field89[92] = 74;
        class5.field89[93] = 43;
        if (class4.field74 == null) {
            class5.field89[192] = 58;
            class5.field89[222] = 59;
        } else {
            class5.field89[192] = 28;
            class5.field89[222] = 58;
            class5.field89[520] = 59;
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "b", descriptor = "(B)V", line = 433)
    private final void method9(byte arg0) {
        int var2 = 107 % ((arg0 + 13) / 51);
        if (class19.field278.length == 1) {
            class12.field180 = 0;
        } else {
            if (class12.field178 < 0) {
                class12.field180 = this.method18(false, class12.field180);
            } else {
                class12.field180 = class12.field178;
            }
            class12.field178 = this.method18(false, class12.field180);
        }
        this.method19(class12.field180, (byte) 98);
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(Ljava/lang/String;I[B)Z", line = 473)
    private final boolean method10(String arg0, int arg1, byte[] arg2) {
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
            if (arg1 < 17) {
                return true;
            } else {
                return true;
            }
        } catch (Exception var7) {
            this.method86("sha", -12383);
            return false;
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "l", descriptor = "(I)V", line = 521)
    private final void method11(int arg0) {
        class30.field389 = false;
        try {
            Graphics var2 = class25.field340.getGraphics();
            if (arg0 != 30) {
                return;
            }
            class36.field455.method79(0, (byte) 4, var2, 0);
        } catch (Exception var4) {
            class25.field340.repaint();
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(Lh;Ljava/lang/String;B)Z", line = 539)
    private final boolean method12(class15 arg0, String arg1, byte arg2) {
        try {
            if (class36.field448 == null) {
                class11.field172 = class21.method179(true, new class15[] { class19.field264, arg0 });
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
                class36.field448 = new DataInputStream((new URL(this.getCodeBase(), var4)).openStream());
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
                class20.field287 = 0;
                class32.field413 = 0;
                class16.field240 = new byte[var5];
            }
            int var6 = class20.field287;
            int var7 = class16.field240.length;
            if (var7 <= var6) {
                class36.field448.close();
                class36.field448 = null;
                if (!this.method10(arg1, 99, class16.field240)) {
                    this.method86("download", -12383);
                    class16.field240 = null;
                }
                if (arg2 >= -119) {
                    this.field6 = -75;
                }
                return true;
            }
            class32.field413++;
            if (class32.field413 >= 1500) {
                throw new IOException();
            }
            DataInputStream var8 = class36.field448;
            int var9 = var8.available();
            if (var9 < 0) {
                throw new EOFException();
            } else if (var9 == 0) {
                return false;
            } else {
                if (var9 > var7 - var6) {
                    var9 = var7 - var6;
                }
                int var10 = var8.read(class16.field240, var6, var9);
                if (var10 < 0) {
                    throw new EOFException();
                } else if (var10 == 0) {
                    return false;
                } else {
                    class32.field413 = 0;
                    int var11 = var6 + var10;
                    int var12 = var11 * 100 / var7;
                    class11.field172 = class21.method179(true, new class15[] { class28.field355, arg0, class21.field298, class33.method226(var12, (byte) 127), class16.field241 });
                    class20.field287 = var11;
                    return false;
                }
            }
        } catch (IOException var16) {
            try {
                class36.field448.close();
            } catch (Exception var15) {
            }
            class36.field448 = null;
            class16.field240 = null;
            this.method86("download", -12383);
            return true;
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(ZILg;I)Z", line = 663)
    public static final boolean method13(boolean arg0, int arg1, class13 arg2, int arg3) {
        byte[] var4 = arg2.method100(arg1, arg3, -16591);
        if (var4 == null) {
            return false;
        }
        if (!arg0) {
            field59 = -123;
        }
        class15.method113(var4, true);
        return true;
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(II)I", line = 693)
    public static int method14(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(ILh;Ljava/lang/String;)Z", line = 706)
    private final boolean method15(int arg0, class15 arg1, String arg2) {
        byte[] var4 = null;
        if (!class16.field237) {
            class16.field237 = true;
            if (class33.field425 != null) {
                try {
                    var4 = this.method5((byte) -119, class33.field425 + "/" + arg2);
                    if (!this.method10(arg2, 65, var4)) {
                        var4 = null;
                    }
                    if (var4 != null) {
                        class19.field271 = new class22(var4, false, true);
                        return true;
                    }
                } catch (IOException var11) {
                    var4 = null;
                }
            }
        }
        if (var4 == null) {
            boolean var6 = this.method12(arg1, arg2, (byte) -127);
            if (!var6) {
                return false;
            }
            var4 = class16.field240;
            class16.field240 = null;
        }
        if (var4 == null) {
            class16.field237 = false;
            return true;
        }
        if (class33.field425 != null && var4 != null) {
            try {
                this.method17(var4, class33.field425 + "/" + arg2, -125);
            } catch (IOException var10) {
            }
        }
        try {
            class19.field271 = new class22(var4, false, true);
            class16.field237 = false;
            if (arg0 < 9) {
                method22(-96, -38, -108, null);
            }
            return true;
        } catch (IOException var9) {
            throw method23(var9, "monkey feet");
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "i", descriptor = "(I)V", line = 784)
    public final void method16(int arg0) {
        if (!class5.field87) {
            class5.field87 = this.method24(-19969);
            class13.method105(null, class31.field401, (byte) 86, class11.field172);
            return;
        }
        if (this.field35) {
            this.field35 = false;
            class30.field389 = true;
            class8.method68();
            int var2 = class12.field177 - (int) (503.0D / this.field38);
            int var3 = (int) (635.0D / this.field38) + class23.field318;
            int var4 = class23.field318 - (int) (635.0D / this.field38);
            int var5 = class12.field177 + (int) (503.0D / this.field38);
            this.method1(503, 20, var4, 0, 635, 0, var3, var2, var5);
            if (this.field31) {
                this.field28.method148(this.field25, this.field53);
                class8.method73(this.field41 * var4 / class33.field423 + this.field25, this.field5 * var2 / class28.field357 + this.field53, (var3 - var4) * this.field41 / class33.field423, (var5 - var2) * this.field5 / class28.field357, 16711680, 128);
                class8.method69(this.field41 * var4 / class33.field423 + this.field25, this.field5 * var2 / class28.field357 + this.field53, (var3 - var4) * this.field41 / class33.field423, (var5 - var2) * this.field5 / class28.field357, 16711680);
                if (this.field24 > 0 && this.field24 % 10 < 5) {
                    for (int var6 = 0; var6 < class33.field422; var6++) {
                        if (class16.field243.field417[var6] == this.field4) {
                            int var7 = this.field53 + class16.field243.field415[var6] * this.field5 / class28.field357;
                            int var8 = this.field25 + class16.field243.field410[var6] * this.field41 / class33.field423;
                            class8.method77(var8, var7, 2, 16776960, 256);
                        }
                    }
                }
            }
            if (this.field11) {
                this.method6(7829367, this.field6, this.field50, 18, 5541, 5592405, class24.field329, this.field18, 10066329);
                this.method6(7829367, this.field6, this.field50, this.field45 - 36, 5541, 5592405, class16.field239, this.field18 + 18, 10066329);
                this.method6(7829367, this.field6, this.field50, 18, arg0 ^ 0x1487, 5592405, class20.field281, this.field45 + this.field18 - 18, 10066329);
                int var9 = this.field3;
                int var10 = this.field18 + 21;
                for (int var11 = 0; var11 < 24; var11++) {
                    if (class14.field212.length > var9 && var9 < this.field47.length) {
                        if (this.field47[var9].method114((byte) -46, class20.field282)) {
                            var11--;
                            var9++;
                            continue;
                        }
                        class14.field212[var9].method147(this.field6 + 3, var10);
                        int var12 = 16777215;
                        this.field8.method195(this.field47[var9], this.field6 + 21, var10 + 14, 0);
                        if (this.field16 == var9) {
                            var12 = 12298922;
                        }
                        if (this.field24 > 0 && this.field24 % 10 < 5 && this.field4 == var9) {
                            var12 = 16776960;
                        }
                        this.field8.method195(this.field47[var9], this.field6 + 20, var10 + 13, var12);
                    }
                    var9++;
                    var10 += 17;
                }
            }
            if (class19.field278.length == 1) {
                this.method6(this.field20, this.field25, this.field41, 18, 5541, this.field21, class12.field181, this.field53 + this.field5, this.field49);
                this.method6(this.field20, this.field6, this.field50, 18, 5541, this.field21, class19.field275, this.field45 + this.field18, this.field49);
                if (this.field44 == 3.0D) {
                    this.method6(this.field43, 170, 50, 30, arg0 + 5251, this.field40, class16.field238, 471, this.field33);
                } else {
                    this.method6(this.field20, 170, 50, 30, 5541, this.field21, class16.field238, 471, this.field49);
                }
                if (this.field44 == 4.0D) {
                    this.method6(this.field43, 230, 50, 30, 5541, this.field40, class10.field134, 471, this.field33);
                } else {
                    this.method6(this.field20, 230, 50, 30, 5541, this.field21, class10.field134, 471, this.field49);
                }
                if (this.field44 == 6.0D) {
                    this.method6(this.field43, 290, 50, 30, 5541, this.field40, class30.field391, 471, this.field33);
                } else {
                    this.method6(this.field20, 290, 50, 30, 5541, this.field21, class30.field391, 471, this.field49);
                }
                if (this.field44 == 8.0D) {
                    this.method6(this.field43, 350, 50, 30, 5541, this.field40, class6.field99, 471, this.field33);
                } else {
                    this.method6(this.field20, 350, 50, 30, 5541, this.field21, class6.field99, 471, this.field49);
                }
            } else {
                this.method6(this.field20, this.field25, this.field41, 18, 5541, this.field21, class12.field181, this.field53 + this.field5, this.field49);
                this.method6(this.field20, this.field6, this.field50, 18, 5541, this.field21, class19.field275, this.field45 + this.field18, this.field49);
                this.method3(this.field20, true);
                if (this.field44 == 3.0D) {
                    this.method6(this.field43, 170, 50, 30, 5541, this.field40, class16.field238, 451, this.field33);
                } else {
                    this.method6(this.field20, 170, 50, 30, arg0 + 5251, this.field21, class16.field238, 451, this.field49);
                }
                if (this.field44 == 4.0D) {
                    this.method6(this.field43, 230, 50, 30, 5541, this.field40, class10.field134, 451, this.field33);
                } else {
                    this.method6(this.field20, 230, 50, 30, arg0 + 5251, this.field21, class10.field134, 451, this.field49);
                }
                if (this.field44 == 6.0D) {
                    this.method6(this.field43, 290, 50, 30, 5541, this.field40, class30.field391, 451, this.field33);
                } else {
                    this.method6(this.field20, 290, 50, 30, 5541, this.field21, class30.field391, 451, this.field49);
                }
                if (this.field44 == 8.0D) {
                    this.method6(this.field43, 350, 50, 30, arg0 ^ 0x1487, this.field40, class6.field99, 451, this.field33);
                } else {
                    this.method6(this.field20, 350, 50, 30, 5541, this.field21, class6.field99, 451, this.field49);
                }
            }
            if (class11.field153) {
                this.method6(this.field20, this.field2, this.field23 + this.field2, this.field56 + this.field55, arg0 ^ 0x1487, this.field21, this.field27, this.field55, this.field49);
                if (class21.field296) {
                    class8.method73(this.field23 + this.field2 + 7, this.field55, this.field39 + 10, this.field56 - -5, 8925952, 192);
                    class8.method69(this.field2 + this.field23 + 7, this.field55, this.field39 + 10, this.field56 + 5, 16777215);
                    if (class33.field430 > -1 && this.field26.method133((byte) -97) > 0) {
                        class15 var13 = this.field34[class33.field430].method137(-125, 47, 32);
                        int var14 = this.field26.method133((byte) -107);
                        if (var14 > var13.method133((byte) -38)) {
                            var14 = var13.method133((byte) -73);
                        }
                        this.field8.method201(var13, this.field23 + this.field2 + 11, 20, 16776960, true);
                        this.field8.method201(var13.method126(var14, (byte) -120, 0), this.field23 + this.field2 + 11, 20, 16777215, true);
                    } else {
                        this.field8.method201(class35.field443, this.field2 + this.field23 + 11, 20, 16776960, true);
                    }
                }
            }
        }
        if (class30.field389) {
            this.method11(30);
        }
        if (arg0 != 290) {
            this.method15(27, null, null);
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "([BLjava/lang/String;I)V", line = 1028)
    private final void method17(byte[] arg0, String arg1, int arg2) throws IOException {
        FileOutputStream var4 = new FileOutputStream(arg1);
        var4.write(arg0, 0, arg0.length);
        if (arg2 > -74) {
            this.method4(17);
        }
        var4.close();
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(ZI)I", line = 1040)
    private final int method18(boolean arg0, int arg1) {
        arg1++;
        if (arg0) {
            return -101;
        } else {
            if (class19.field278.length <= arg1) {
                arg1 = 0;
            }
            return arg1;
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(IB)V", line = 1061)
    private final void method19(int arg0, byte arg1) {
        if (arg1 <= 59) {
            this.field12 = null;
        }
        if (class19.field278.length <= arg0) {
            return;
        }
        class22 var3 = class19.field278[arg0];
        class19 var4 = new class19(var3.method101(class28.field361, class30.field392, false));
        var4.method160((byte) -119);
        class19 var5 = new class19(var3.method101(class31.field403, class30.field392, false));
        this.field10 = var5.method166(2);
        for (int var6 = 0; var6 < this.field10; var6++) {
            this.field34[var6] = var5.method160((byte) -119);
            this.field29[var6] = var5.method166(2);
            this.field52[var6] = var5.method166(2);
            this.field36[var6] = var5.method164((byte) 62);
            class15 var7 = this.field34[var6].method137(99, 47, 32);
            int var8 = this.field8.method199(var7);
            if (this.field39 < var8) {
                this.field39 = var8;
            }
        }
        class16.field243 = new class32();
        class16.field243.method220(-56, class19.field278[arg0]);
        class12.field177 = class14.field213;
        class23.field318 = class20.field285;
        this.field5 = 180;
        this.field53 = 503 - this.field5 - 20;
        this.field41 = class33.field423 * this.field5 / class28.field357;
        this.field25 = 630 - this.field41;
        this.field28 = new class17(this.field41, this.field5);
        this.field28.method145();
        this.method1(this.field5, 20, 0, 0, this.field41, 0, class33.field423, 0, class28.field357);
        class8.method69(0, 0, this.field41, this.field5, 0);
        class8.method69(1, 1, this.field41 - 2, this.field5 + -2, this.field49);
        class36.field455.method82(true);
    }

    @OriginalMember(owner = "mapview!mapview", name = "m", descriptor = "(I)V", line = 1131)
    public static void method20(int arg0) {
        field13 = null;
        if (arg0 != 191) {
            method2(-69, (byte) -96, -22);
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(B)V", line = 1143)
    public final void method21(byte arg0) {
        method8(7);
        class32.method210(class25.field340, (byte) 66);
        class36.method238(-14450, class25.field340);
        this.field27 = class19.field267;
        class11.field172 = class14.field218;
        this.field47 = class36.method240(-15536);
        int var2 = 123 / (-arg0 / 50);
        this.field26 = class18.method152(8163, 30);
    }

    @OriginalMember(owner = "mapview!mapview", name = "init", descriptor = "()V", line = 1176)
    public final void init() {
        if (this.method84(9)) {
            this.method83(32, (byte) 105, class5.field82.method131((byte) 35, this).method117(true), 503, 635);
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(IIILg;)[Li;", line = 1191)
    public static final class17[] method22(int arg0, int arg1, int arg2, class13 arg3) {
        if (arg1 > -99) {
            method22(76, 21, -6, null);
        }
        return method13(true, arg0, arg3, arg2) ? class28.method192((byte) 59) : null;
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Loa;", line = 1205)
    public static final class30 method23(Throwable arg0, String arg1) {
        class30 var2;
        if (arg0 instanceof class30) {
            var2 = (class30) arg0;
            var2.field390 = var2.field390 + ' ' + arg1;
        } else {
            var2 = new class30(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "mapview!mapview", name = "n", descriptor = "(I)Z", line = 1227)
    private final boolean method24(int arg0) {
        if (class30.field388 == 0) {
            this.method25((byte) 104);
            class30.field388 = 1;
        }
        if (arg0 != -19969) {
            this.field27 = null;
        }
        if (class30.field388 == 1) {
            class31.field401 = 25;
            boolean var2 = this.method15(126, class12.field182, "main_file_cache.idx0");
            if (!var2) {
                return false;
            }
            class22.field307 = class19.field271;
            class19.field271 = null;
            if (class22.field307 == null) {
                throw new RuntimeException("T1");
            }
            class30.field388 = 2;
        }
        if (class30.field388 == 2) {
            class19.field278 = new class22[1];
            class30.field388 = 10;
        }
        if (class30.field388 == 10) {
            class31.field401 = 50;
            boolean var3 = this.method15(96, class28.field359, "main_file_cache.dat0");
            if (!var3) {
                return false;
            }
            class19.field278[0] = class19.field271;
            class19.field271 = null;
            if (class19.field278[0] == null) {
                throw new RuntimeException("T2");
            }
            class30.field388 = 20;
        }
        if (class30.field388 != 20) {
            return false;
        }
        class32.field411 = class20.method176((byte) 21, class11.field155, class22.field307, class16.field239);
        class14.field212 = class20.method173(class22.field307, arg0 + 458271943, class16.field239, class23.field313);
        this.field8 = method26(class14.field209, (byte) -68, class16.field239, class22.field307);
        this.field54 = new class7(11, true, this);
        this.field17 = new class7(12, true, this);
        this.field46 = new class7(14, true, this);
        this.field14 = new class7(17, true, this);
        this.field58 = new class7(19, true, this);
        this.field48 = new class7(22, true, this);
        this.field19 = new class7(26, true, this);
        this.field12 = new class7(30, true, this);
        class11.field172 = class28.field362;
        class31.field401 = 100;
        class13.method105(null, class31.field401, (byte) 80, class11.field172);
        this.method9((byte) -64);
        return true;
    }

    @OriginalMember(owner = "mapview!mapview", name = "c", descriptor = "(B)V", line = 1324)
    private final void method25(byte arg0) {
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
        if (arg0 != 104) {
            this.field29 = null;
        }
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
                        class33.field425 = var8 + var6 + "/rsmap/";
                        return;
                    }
                }
            } catch (Exception var14) {
            }
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(Lh;BLh;Lg;)Lo;", line = 1399)
    private static final class29 method26(class15 arg0, byte arg1, class15 arg2, class13 arg3) {
        if (arg1 != -68) {
            method22(-57, -87, 42, null);
        }
        int var4 = arg3.method104(126, arg2);
        int var5 = arg3.method110(var4, arg0, 0);
        return class15.method121(true, arg3, var4, var5);
    }

    @OriginalMember(owner = "mapview!mapview", name = "c", descriptor = "(I)V", line = 1433)
    public final void method27(int arg0) {
        if (arg0 != 46) {
            this.field45 = -15;
        }
        if (class36.field453) {
            class13.method106(class25.field340, (byte) -114);
            class22.method180(5, class25.field340);
            this.method89(4000);
            class32.method210(class25.field340, (byte) 66);
            class36.method238(arg0 - 14496, class25.field340);
        }
        class11.method93((byte) 27);
        class9.method80(arg0 ^ 0x2235);
        if (!class5.field87) {
            return;
        }
        if (class21.field295[96]) {
            this.field35 = true;
            class25.field339 = -1;
            class23.field318 = (int) ((double) class23.field318 - 16.0D / this.field38);
        }
        if (class21.field295[97]) {
            this.field35 = true;
            class25.field339 = -1;
            class23.field318 = (int) (16.0D / this.field38 + (double) class23.field318);
        }
        if (class21.field295[98]) {
            class25.field339 = -1;
            this.field35 = true;
            class12.field177 = (int) ((double) class12.field177 - 16.0D / this.field38);
        }
        if (class21.field295[99]) {
            class12.field177 = (int) (16.0D / this.field38 + (double) class12.field177);
            this.field35 = true;
            class25.field339 = -1;
        }
        while (true) {
            while (true) {
                while (class16.method143((byte) 120)) {
                    if (!class11.field153 || !class21.field296) {
                        if (class15.field222 == 102) {
                            this.field35 = true;
                            class21.field296 = true;
                        }
                        if (class15.field222 == 49) {
                            this.field35 = true;
                            this.field44 = 3.0D;
                        }
                        if (class15.field222 == 50) {
                            this.field44 = 4.0D;
                            this.field35 = true;
                        }
                        if (class15.field222 == 51) {
                            this.field44 = 6.0D;
                            this.field35 = true;
                        }
                        if (class15.field222 == 52) {
                            this.field35 = true;
                            this.field44 = 8.0D;
                        }
                        if (class15.field222 == 107 || class15.field222 == 75) {
                            this.field11 = !this.field11;
                            this.field35 = true;
                        }
                        if (class15.field222 == 111 || class15.field222 == 79) {
                            this.field35 = true;
                            this.field31 = !this.field31;
                        }
                    } else if (class15.field227 == 0) {
                        class21.field296 = false;
                        this.field35 = true;
                        this.field26.method134(0, arg0 ^ 0xFFFFFF93);
                        class33.field430 = -1;
                    } else if (class15.field227 == 84) {
                        this.field42 = class23.field318 << 16;
                        class25.field339 = class33.field430;
                        this.field1 = class12.field177 << 16;
                        class21.field296 = false;
                        this.field26.method134(0, 127);
                        class33.field430 = -1;
                        this.field35 = true;
                    } else {
                        boolean var2 = false;
                        if (class15.field227 == 85) {
                            if (this.field26.method133((byte) -109) > 0) {
                                this.field26.method134(this.field26.method133((byte) -78) - 1, 126);
                                this.field35 = true;
                                if (this.field26.method133((byte) -48) == 0) {
                                    class33.field430 = -1;
                                } else {
                                    var2 = true;
                                }
                            }
                        } else if (class15.field222 != -1 && this.field26.method133((byte) -82) <= class14.field216) {
                            this.field26.method128((byte) -70, class15.field222);
                            this.field35 = true;
                        }
                        if (this.field26.method133((byte) -38) > 0) {
                            for (int var3 = 0; var3 < this.field10; var3++) {
                                if (this.field34[var3].method133((byte) -47) >= this.field26.method133((byte) -59)) {
                                    class15 var4 = this.field26.method119(-77);
                                    class15 var5 = this.field34[var3].method137(127, 47, 32).method126(this.field26.method133((byte) -52), (byte) -120, 0).method119(-123);
                                    if (var4.method135((byte) -88, var5) == 0) {
                                        class33.field430 = var3;
                                        this.field35 = true;
                                        var2 = true;
                                        break;
                                    }
                                }
                            }
                            if (!var2) {
                                this.field26.method134(this.field26.method133((byte) -69) - 1, -81);
                            }
                        }
                    }
                }
                int var6 = class36.field456;
                int var7 = class20.field279;
                int var8 = class21.field292;
                int var9 = class33.field429;
                int var10 = class33.field426;
                int var11 = class32.field407;
                if (var9 == 1) {
                    this.field22 = var7;
                    this.field30 = var6;
                    this.field32 = class23.field318;
                    this.field37 = class12.field177;
                    if (class19.field278.length == 1) {
                        if (var7 > 170 && var7 < 220 && var6 > 471 && var6 < 503) {
                            this.field22 = -1;
                            this.field44 = 3.0D;
                        }
                        if (var7 > 230 && var7 < 280 && var6 > 471 && var6 < 503) {
                            this.field44 = 4.0D;
                            this.field22 = -1;
                        }
                        if (var7 > 290 && var7 < 340 && var6 > 471 && var6 < 503) {
                            this.field44 = 6.0D;
                            this.field22 = -1;
                        }
                        if (var7 > 350 && var7 < 400 && var6 > 471 && var6 < 503) {
                            this.field44 = 8.0D;
                            this.field22 = -1;
                        }
                    } else {
                        if (var7 > 170 && var7 < 220 && var6 > 451 && var6 < 483) {
                            this.field44 = 3.0D;
                            this.field22 = -1;
                        }
                        if (var7 > 230 && var7 < 280 && var6 > 451 && var6 < 483) {
                            this.field22 = -1;
                            this.field44 = 4.0D;
                        }
                        if (var7 > 290 && var7 < 340 && var6 > 451 && var6 < 483) {
                            this.field22 = -1;
                            this.field44 = 6.0D;
                        }
                        if (var7 > 350 && var7 < 400 && var6 > 451 && var6 < 483) {
                            this.field22 = -1;
                            this.field44 = 8.0D;
                        }
                        if (var7 > 170 && var7 < 400 && var6 > 483 && var6 < 503) {
                            this.method3(this.field43, true);
                            this.method11(30);
                            this.method9((byte) 91);
                            this.field22 = -1;
                        }
                    }
                    this.field60 = false;
                    if (this.field6 < var7 && this.field45 + this.field18 < var6 && var7 < this.field6 + this.field50 && var6 < 503) {
                        this.field22 = -1;
                        this.field11 = !this.field11;
                    }
                    if (this.field25 < var7 && var6 > this.field53 + this.field5 && var7 < this.field41 + this.field25 && var6 < 503) {
                        this.field31 = !this.field31;
                        this.field22 = -1;
                    }
                    this.field35 = true;
                    if (this.field11) {
                        if (this.field6 < var7 && var6 > this.field18 && var7 < this.field6 + this.field50 && this.field18 + 18 > var6 && this.field7 > 0) {
                            this.field7 -= 25;
                        }
                        if (this.field6 < var7 && var6 > this.field45 + this.field18 - 18 && this.field6 + this.field50 > var7 && this.field18 + this.field45 > var6 && this.field7 < 50) {
                            this.field7 += 25;
                        }
                        if (this.field6 < var7 && var6 > this.field18 && var7 < this.field6 + this.field50 && this.field45 + this.field18 > var6) {
                            this.field22 = -1;
                        }
                    }
                    if (this.field31 && this.field25 < var7 && this.field53 < var6 && var7 < this.field41 + this.field25 && var6 < this.field53 + this.field5) {
                        class12.field177 = (var6 - this.field53) * class28.field357 / this.field5;
                        this.field22 = -1;
                        this.field60 = true;
                        class23.field318 = (var7 - this.field25) * class33.field423 / this.field41;
                    }
                    if (class11.field153 && !class21.field296 && !this.field60 && this.field2 < var7 && var6 > this.field55 && var7 < this.field2 + this.field23 && var6 < this.field56 + this.field55) {
                        class21.field296 = true;
                    }
                }
                if (this.field11) {
                    this.field16 = -1;
                    if (this.field6 < var10 && this.field6 + this.field50 > var10) {
                        int var12 = this.field3;
                        int var13 = this.field18 + 26;
                        for (int var14 = 0; var14 < 24; var14++) {
                            if (this.field47.length > var12 && this.field47[var12].method114((byte) -46, class20.field282)) {
                                var14--;
                                var12++;
                            } else {
                                if (var13 <= var11 && var13 + 17 > var11) {
                                    if (var9 == 1) {
                                        this.field24 = 50;
                                        this.field4 = var12;
                                    }
                                    this.field16 = var12;
                                }
                                var12++;
                                var13 += 17;
                            }
                        }
                    }
                    if (this.field9 != this.field16) {
                        this.field35 = true;
                        this.field9 = this.field16;
                    }
                }
                if (var8 == 1 && this.field31 && this.field60) {
                    this.field35 = true;
                    int var15 = var10;
                    if (var10 < this.field25) {
                        var15 = this.field25;
                    } else if (this.field41 + this.field25 < var10) {
                        var15 = this.field25 + this.field41;
                    }
                    class25.field339 = -1;
                    class23.field318 = (var15 - this.field25) * class33.field423 / this.field41;
                    int var16 = var11;
                    if (this.field53 > var11) {
                        var16 = this.field53;
                    } else if (var11 > this.field53 + this.field5) {
                        var16 = this.field53 + this.field5;
                    }
                    class12.field177 = (var16 - this.field53) * class28.field357 / this.field5;
                } else {
                    this.field60 = false;
                }
                if (var8 == 1 && this.field22 != -1) {
                    this.field35 = true;
                    class23.field318 = (int) ((double) (this.field22 - var10) * 2.0D / this.field44) + this.field32;
                    class12.field177 = (int) ((double) (this.field30 - var11) * 2.0D / this.field44) + this.field37;
                    class25.field339 = -1;
                }
                if (this.field38 < this.field44) {
                    this.field35 = true;
                    this.field38 += this.field38 / 30.0D;
                    if (this.field44 < this.field38) {
                        this.field38 = this.field44;
                    }
                }
                if (this.field44 < this.field38) {
                    this.field38 -= this.field38 / 30.0D;
                    this.field35 = true;
                    if (this.field38 < this.field44) {
                        this.field38 = this.field44;
                    }
                }
                if (this.field7 > this.field3) {
                    this.field35 = true;
                    this.field3++;
                }
                if (this.field7 < this.field3) {
                    this.field35 = true;
                    this.field3--;
                }
                if (this.field24 > 0) {
                    this.field35 = true;
                    this.field24--;
                }
                if (class25.field339 >= 0) {
                    byte var17 = 4;
                    class15.field225 = this.field29[class25.field339] - class22.field304;
                    int var18 = class15.field225 - (int) (635.0D / this.field38);
                    class13.field191 = class31.field395 + class28.field357 - this.field52[class25.field339];
                    int var19 = class13.field191 - (int) (503.0D / this.field38);
                    this.field35 = true;
                    int var20 = (int) (503.0D / this.field38) + class13.field191;
                    if (var19 < 48) {
                        class13.field191 = (int) (503.0D / this.field38) + 48;
                    }
                    if (class28.field357 - 48 < var20) {
                        class13.field191 = class28.field357 - (int) (503.0D / this.field38) - 48;
                    }
                    class13.field191 <<= 0x10;
                    int var21 = class13.field191 - this.field1;
                    int var22 = class15.field225 + (int) (635.0D / this.field38);
                    if (var18 < 48) {
                        class15.field225 = (int) (635.0D / this.field38) + 48;
                    }
                    if (class33.field423 - 48 < var22) {
                        class15.field225 = class33.field423 - (int) (635.0D / this.field38) - 48;
                    }
                    class15.field225 <<= 0x10;
                    int var23 = class15.field225 - this.field42;
                    if (var23 >> var17 == 0 && var21 >> var17 == 0) {
                        class25.field339 = -1;
                    } else {
                        this.field42 += var23 >> var17;
                        this.field1 += var21 >> var17;
                        class12.field177 = this.field1 >> 16;
                        class23.field318 = this.field42 >> 16;
                    }
                }
                int var24 = class23.field318 - (int) (635.0D / this.field38);
                int var25 = class12.field177 - (int) (503.0D / this.field38);
                int var26 = (int) (503.0D / this.field38) + class12.field177;
                if (var25 < 48) {
                    class12.field177 = (int) (503.0D / this.field38) + 48;
                }
                if (class28.field357 - 48 < var26) {
                    class12.field177 = class28.field357 - (int) (503.0D / this.field38) - 48;
                }
                int var27 = (int) (635.0D / this.field38) + class23.field318;
                if (var24 < 48) {
                    class23.field318 = (int) (635.0D / this.field38) + 48;
                }
                if (var27 > class33.field423 - 48) {
                    class23.field318 = class33.field423 - (int) (635.0D / this.field38) - 48;
                }
                return;
            }
        }
    }
}
