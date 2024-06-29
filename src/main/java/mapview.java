import java.awt.Color;
import java.awt.FontMetrics;
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

    @OriginalMember(owner = "mapview!mapview", name = "o", descriptor = "I")
    private int field4 = 40;

    @OriginalMember(owner = "mapview!mapview", name = "l", descriptor = "D")
    private double field1 = 4.0D;

    @OriginalMember(owner = "mapview!mapview", name = "r", descriptor = "Z")
    private boolean field7 = false;

    @OriginalMember(owner = "mapview!mapview", name = "u", descriptor = "I")
    private int field10 = 500;

    @OriginalMember(owner = "mapview!mapview", name = "y", descriptor = "I")
    private int field14 = 8943445;

    @OriginalMember(owner = "mapview!mapview", name = "O", descriptor = "I")
    private int field30 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "L", descriptor = "[I")
    private int[] field27 = new int[this.field10];

    @OriginalMember(owner = "mapview!mapview", name = "B", descriptor = "I")
    private int field17 = 140;

    @OriginalMember(owner = "mapview!mapview", name = "v", descriptor = "I")
    private int field11 = 5;

    @OriginalMember(owner = "mapview!mapview", name = "Y", descriptor = "I")
    private int field40 = 6706483;

    @OriginalMember(owner = "mapview!mapview", name = "F", descriptor = "I")
    private int field21 = 33;

    @OriginalMember(owner = "mapview!mapview", name = "z", descriptor = "I")
    private int field15 = 5;

    @OriginalMember(owner = "mapview!mapview", name = "gb", descriptor = "I")
    private int field48 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "W", descriptor = "I")
    private int field38 = 10027008;

    @OriginalMember(owner = "mapview!mapview", name = "I", descriptor = "I")
    private int field24 = 8912896;

    @OriginalMember(owner = "mapview!mapview", name = "m", descriptor = "I")
    private int field2 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "kb", descriptor = "I")
    private int field52 = -1;

    @OriginalMember(owner = "mapview!mapview", name = "t", descriptor = "I")
    private int field9 = 18;

    @OriginalMember(owner = "mapview!mapview", name = "cb", descriptor = "I")
    private int field44 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "U", descriptor = "I")
    private int field36 = -1;

    @OriginalMember(owner = "mapview!mapview", name = "hb", descriptor = "I")
    private int field49 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "fb", descriptor = "I")
    private int field47 = 450;

    @OriginalMember(owner = "mapview!mapview", name = "S", descriptor = "Z")
    private boolean field34 = false;

    @OriginalMember(owner = "mapview!mapview", name = "N", descriptor = "I")
    private int field29 = 7824964;

    @OriginalMember(owner = "mapview!mapview", name = "nb", descriptor = "Z")
    private boolean field55 = false;

    @OriginalMember(owner = "mapview!mapview", name = "ab", descriptor = "I")
    private int field42 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "lb", descriptor = "I")
    private int field53 = 11141120;

    @OriginalMember(owner = "mapview!mapview", name = "p", descriptor = "D")
    private double field5 = 4.0D;

    @OriginalMember(owner = "mapview!mapview", name = "T", descriptor = "I")
    private int field35 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "mb", descriptor = "I")
    private int field54 = -1;

    @OriginalMember(owner = "mapview!mapview", name = "tb", descriptor = "[Lba;")
    private class4[] field61 = new class4[this.field10];

    @OriginalMember(owner = "mapview!mapview", name = "pb", descriptor = "I")
    private int field57 = 5;

    @OriginalMember(owner = "mapview!mapview", name = "ub", descriptor = "[I")
    private int[] field62 = new int[this.field10];

    @OriginalMember(owner = "mapview!mapview", name = "jb", descriptor = "I")
    private int field51 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "rb", descriptor = "[I")
    private int[] field59 = new int[this.field10];

    @OriginalMember(owner = "mapview!mapview", name = "vb", descriptor = "Z")
    private boolean field63 = true;

    @OriginalMember(owner = "mapview!mapview", name = "n", descriptor = "Z")
    public static volatile boolean field3 = false;

    @OriginalMember(owner = "mapview!mapview", name = "Q", descriptor = "Lba;")
    public static class4 field32 = class14.method105((byte) -107, "Makeover Mage");

    @OriginalMember(owner = "mapview!mapview", name = "A", descriptor = "Lba;")
    public static class4 field16 = class14.method105((byte) -117, "Apothecary");

    @OriginalMember(owner = "mapview!mapview", name = "X", descriptor = "Lba;")
    private static class4 field39 = class14.method105((byte) -72, "Switch to ");

    @OriginalMember(owner = "mapview!mapview", name = "w", descriptor = "I")
    private int field12;

    @OriginalMember(owner = "mapview!mapview", name = "G", descriptor = "I")
    private int field22;

    @OriginalMember(owner = "mapview!mapview", name = "J", descriptor = "I")
    public static int field25;

    @OriginalMember(owner = "mapview!mapview", name = "K", descriptor = "I")
    public static int field26;

    @OriginalMember(owner = "mapview!mapview", name = "P", descriptor = "I")
    private int field31;

    @OriginalMember(owner = "mapview!mapview", name = "V", descriptor = "I")
    private int field37;

    @OriginalMember(owner = "mapview!mapview", name = "bb", descriptor = "I")
    private int field43;

    @OriginalMember(owner = "mapview!mapview", name = "eb", descriptor = "I")
    private int field46;

    @OriginalMember(owner = "mapview!mapview", name = "q", descriptor = "I")
    private int field6;

    @OriginalMember(owner = "mapview!mapview", name = "R", descriptor = "Lf;")
    private class11 field33;

    @OriginalMember(owner = "mapview!mapview", name = "s", descriptor = "Lka;")
    private class21 field8;

    @OriginalMember(owner = "mapview!mapview", name = "x", descriptor = "Lr;")
    private class33 field13;

    @OriginalMember(owner = "mapview!mapview", name = "C", descriptor = "Lr;")
    private class33 field18;

    @OriginalMember(owner = "mapview!mapview", name = "H", descriptor = "Lr;")
    private class33 field23;

    @OriginalMember(owner = "mapview!mapview", name = "Z", descriptor = "Lr;")
    private class33 field41;

    @OriginalMember(owner = "mapview!mapview", name = "db", descriptor = "Lr;")
    private class33 field45;

    @OriginalMember(owner = "mapview!mapview", name = "ib", descriptor = "Lr;")
    private class33 field50;

    @OriginalMember(owner = "mapview!mapview", name = "qb", descriptor = "Lr;")
    private class33 field58;

    @OriginalMember(owner = "mapview!mapview", name = "sb", descriptor = "Lr;")
    private class33 field60;

    @OriginalMember(owner = "mapview!mapview", name = "D", descriptor = "Lba;")
    private class4 field19;

    @OriginalMember(owner = "mapview!mapview", name = "M", descriptor = "Lba;")
    private class4 field28;

    @OriginalMember(owner = "mapview!mapview", name = "E", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field20;

    @OriginalMember(owner = "mapview!mapview", name = "wb", descriptor = "Z")
    public static boolean field64;

    @OriginalMember(owner = "mapview!mapview", name = "ob", descriptor = "[Lba;")
    private class4[] field56;

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(BI)I", line = 7)
    private final int method1(byte arg0, int arg1) {
        if (arg0 != 81) {
            method18((byte) 26);
        }
        arg1++;
        if (class31.field394.length <= arg1) {
            arg1 = 0;
        }
        return arg1;
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(II)V", line = 23)
    private final void method2(int arg0, int arg1) {
        if (arg1 != 48) {
            this.field2 = -53;
        }
        if (class31.field394.length <= arg0) {
            return;
        }
        class36 var3 = class31.field394[arg0];
        class20 var4 = new class20(var3.method60(class3.field74, class5.field112, 0));
        var4.method135((byte) 9);
        class20 var5 = new class20(var3.method60(class5.field109, class5.field112, arg1 - 48));
        this.field2 = var5.method140(-105);
        for (int var6 = 0; var6 < this.field2; var6++) {
            this.field61[var6] = var5.method135((byte) 9);
            this.field27[var6] = var5.method140(-60);
            this.field59[var6] = var5.method140(-58);
            this.field62[var6] = var5.method143(-3695);
            class4 var7 = this.field61[var6].method30(32, 47, true);
            int var8 = this.field8.method147(var7);
            if (var8 > this.field46) {
                this.field46 = var8;
            }
        }
        class15.field197 = new class32();
        class15.field197.method204(class31.field394[arg0], -29416);
        this.field37 = 180;
        class32.field413 = field25;
        this.field6 = class32.field411 * this.field37 / class13.field183;
        class9.field150 = class32.field415;
        this.field43 = 635 - this.field6 - 5;
        this.field22 = 503 - this.field37 - 20;
        this.field33 = new class11(this.field6, this.field37);
        this.field33.method93();
        this.method6(0, 0, this.field6, this.field37, class13.field183, 0, class32.field411, 0, (byte) -70);
        class37.method237(0, 0, this.field6, this.field37, 0);
        class37.method237(1, 1, this.field6 - 2, this.field37 + -2, this.field14);
        class22.field267.method104(0);
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(ZLjava/lang/String;)[B", line = 90)
    private final byte[] method3(boolean arg0, String arg1) throws IOException {
        File var3 = new File(arg1);
        if (!var3.exists()) {
            return null;
        }
        int var4 = (int) var3.length();
        DataInputStream var5 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg1)));
        byte[] var6 = new byte[var4];
        var5.readFully(var6, 0, var4);
        if (!arg0) {
            this.field24 = -79;
        }
        var5.close();
        return var6;
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(BLjava/lang/String;Lba;)Z", line = 117)
    private final boolean method4(byte arg0, String arg1, class4 arg2) {
        try {
            if (class31.field403 == null) {
                String var4;
                if (arg1 == "main_file_cache.dat0") {
                    var4 = "worldmap.main.js5?crc=-420409089";
                } else if (arg1 == "main_file_cache.dat1") {
                    var4 = "worldmap.dungeon.js5?crc=-260749162";
                } else if (arg1 == "main_file_cache.dat2") {
                    var4 = "worldmap.extra.js5?crc=-1748657034";
                } else {
                    var4 = "mapview.sprites.js5?crc=-1837203931";
                }
                class22.field268 = class10.method90(-126, new class4[] { class30.field388, arg2 });
                class31.field403 = new DataInputStream((new URL(this.getCodeBase(), var4)).openStream());
                int var5;
                if (arg1 == "main_file_cache.dat0") {
                    var5 = 396610;
                } else if (arg1 == "main_file_cache.dat1") {
                    var5 = 143082;
                } else if (arg1 == "main_file_cache.dat2") {
                    var5 = 106263;
                } else {
                    var5 = 8200;
                }
                class27.field313 = 0;
                class15.field198 = new byte[var5];
                class17.field219 = 0;
            }
            int var6 = class17.field219;
            if (arg0 < 66) {
                return false;
            }
            int var7 = class15.field198.length;
            if (var6 >= var7) {
                class31.field403.close();
                class31.field403 = null;
                if (!this.method17((byte) 102, arg1, class15.field198)) {
                    this.method114("download", (byte) -42);
                    class15.field198 = null;
                }
                return true;
            }
            class27.field313++;
            if (class27.field313 >= 1500) {
                throw new IOException();
            }
            DataInputStream var8 = class31.field403;
            int var9 = var8.available();
            if (var9 < 0) {
                throw new EOFException();
            } else if (var9 == 0) {
                return false;
            } else {
                if (var7 - var6 < var9) {
                    var9 = var7 - var6;
                }
                int var10 = var8.read(class15.field198, var6, var9);
                if (var10 < 0) {
                    throw new EOFException();
                } else if (var10 == 0) {
                    return false;
                } else {
                    int var11 = var6 + var10;
                    class27.field313 = 0;
                    int var12 = var11 * 100 / var7;
                    class22.field268 = class10.method90(-123, new class4[] { class31.field389, arg2, class3.field78, class1.method22(false, var12), class36.field449 });
                    class17.field219 = var11;
                    return false;
                }
            }
        } catch (IOException var16) {
            try {
                class31.field403.close();
            } catch (Exception var15) {
            }
            class31.field403 = null;
            class15.field198 = null;
            this.method114("download", (byte) -42);
            return true;
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "e", descriptor = "(I)Z", line = 236)
    private final boolean method5(int arg0) {
        if (class20.field229 == 0) {
            this.method16(arg0 - 128);
            class20.field229 = 1;
        }
        if (class20.field229 == 1) {
            class24.field289 = 25;
            boolean var2 = this.method9(class12.field168, "main_file_cache.idx0", arg0 ^ 0xFFFFFF34);
            if (!var2) {
                return false;
            }
            class29.field371 = class9.field152;
            class9.field152 = null;
            if (class29.field371 == null) {
                throw new RuntimeException("T1");
            }
            class20.field229 = 2;
        }
        if (class20.field229 == 2) {
            class20.field229 = 10;
            class31.field394 = new class36[1];
        }
        if (class20.field229 == 10) {
            class24.field289 = 50;
            boolean var3 = this.method9(class28.field340, "main_file_cache.dat0", arg0 - 209);
            if (!var3) {
                return false;
            }
            class31.field394[0] = class9.field152;
            class9.field152 = null;
            if (class31.field394[0] == null) {
                throw new RuntimeException("T2");
            }
            class20.field229 = 20;
        }
        if (arg0 != 128) {
            this.method16(-58);
        }
        if (class20.field229 != 20) {
            return false;
        }
        class23.field288 = class17.method122(class29.field371, class3.field79, 3840, class17.field211);
        class20.field233 = class35.method227(class29.field371, class35.field445, false, class17.field211);
        this.field8 = class17.method126((byte) -71, class15.field192, class17.field211, class29.field371);
        this.field41 = new class33(11, true, this);
        this.field50 = new class33(12, true, this);
        this.field18 = new class33(14, true, this);
        this.field58 = new class33(17, true, this);
        this.field45 = new class33(19, true, this);
        this.field13 = new class33(22, true, this);
        this.field60 = new class33(26, true, this);
        this.field23 = new class33(30, true, this);
        class22.field268 = class29.field366;
        class24.field289 = 100;
        class28.method177(null, class24.field289, class22.field268, false);
        this.method10(0);
        return true;
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(IIIIIIIIB)V", line = 322)
    private final void method6(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte arg8) {
        class15.field197.method208(arg4, arg3, arg5, arg2, arg1, 4096, arg0, arg7, arg6);
        int var10 = -23 % ((arg8 - 2) / 37);
        if (arg6 - arg0 > -arg5 + arg2) {
            return;
        }
        class15.field197.method202(arg6, arg1, (byte) -122, arg3, arg0, arg4, this.field5, arg5, arg7, arg2);
        class15.field197.method196(arg7, arg3, arg0, arg2, arg1, true, arg6, arg4, arg5);
        class15.field197.method205(arg2, arg1, arg7, arg3, -26808, arg6, arg4, this.field42, arg0, this.field54, arg5);
        if (this.field5 == this.field1 && class29.field369) {
            for (int var11 = 0; var11 < this.field2; var11++) {
                int var12 = this.field27[var11];
                int var13 = var12 - class27.field318;
                int var14 = (var13 - arg0) * (-arg5 + arg2) / (arg6 - arg0) + arg5;
                int var15 = this.field59[var11];
                int var16 = class1.field67 + class13.field183 - var15;
                int var17 = this.field62[var11];
                int var18 = 16777215;
                class33 var19 = null;
                int var20 = arg7 + (arg3 - arg7) * (-arg1 + var16) / (arg4 - arg1);
                if (var17 == 0) {
                    if (this.field5 == 3.0D) {
                        var19 = this.field41;
                    }
                    if (this.field5 == 4.0D) {
                        var19 = this.field50;
                    }
                    if (this.field5 == 6.0D) {
                        var19 = this.field18;
                    }
                    if (this.field5 == 8.0D) {
                        var19 = this.field58;
                    }
                }
                if (var17 == 1) {
                    if (this.field5 == 3.0D) {
                        var19 = this.field18;
                    }
                    if (this.field5 == 4.0D) {
                        var19 = this.field58;
                    }
                    if (this.field5 == 6.0D) {
                        var19 = this.field45;
                    }
                    if (this.field5 == 8.0D) {
                        var19 = this.field13;
                    }
                }
                if (var17 == 2) {
                    var18 = 16755200;
                    if (this.field5 == 3.0D) {
                        var19 = this.field45;
                    }
                    if (this.field5 == 4.0D) {
                        var19 = this.field13;
                    }
                    if (this.field5 == 6.0D) {
                        var19 = this.field60;
                    }
                    if (this.field5 == 8.0D) {
                        var19 = this.field23;
                    }
                }
                if (var19 != null) {
                    class4 var21 = this.field61[var11];
                    int var22 = 1;
                    for (int var23 = 0; var21.method31((byte) -87) > var23; var23++) {
                        if (var21.method48(var23, 48) == 47) {
                            var22++;
                        }
                    }
                    int var24 = var20 - (var22 - 1) * var19.method218() / 2;
                    int var25 = var24 + var19.method219() / 2;
                    while (true) {
                        int var26 = var21.method33(47, -1);
                        if (var26 == -1) {
                            var19.method215(var21, var14, var25, var18, true);
                            break;
                        }
                        class4 var27 = var21.method29(var26, 102, 0);
                        var19.method215(var27, var14, var25, var18, true);
                        var25 += var19.method218();
                        var21 = var21.method45(var26 + 1, (byte) 116);
                    }
                }
            }
        }
        if (!class24.field297) {
            return;
        }
        for (int var28 = class27.field318 / 64; var28 < (class32.field411 + class27.field318) / 64; var28++) {
            for (int var29 = class1.field67 / 64; var29 < (class13.field183 + class1.field67) / 64; var29++) {
                int var30 = var28 * 64;
                int var31 = var30 - class27.field318;
                int var32 = var29 * 64;
                int var33 = class1.field67 + class13.field183 - var32;
                int var34 = arg5 + (var31 + 64 - arg0) * (-arg5 + arg2) / (arg6 - arg0);
                int var35 = (var31 - arg0) * (-arg5 + arg2) / (arg6 - arg0) + arg5;
                int var36 = (arg3 - arg7) * (-arg1 + var33) / (arg4 - arg1) + arg7;
                int var37 = arg7 + (var33 - arg1 - 64) * (-arg7 + arg3) / (arg4 - arg1);
                class37.method237(var35, var37, var34 - var35, -var37 + var36, 16777215);
                this.field8.method151(class10.method90(-126, new class4[] { class1.method22(false, var28), class36.field453, class1.method22(false, var29) }), var34 - 5, var36 + -5, 16777215);
                if (var28 == 33 && var29 >= 71 && var29 <= 73) {
                    this.field8.method152(class12.field170, (var34 + var35) / 2, (var36 + var37) / 2, 16711680);
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(ILjava/lang/String;[B)V", line = 511)
    private final void method7(int arg0, String arg1, byte[] arg2) throws IOException {
        FileOutputStream var4 = new FileOutputStream(arg1);
        if (arg0 == 50) {
            var4.write(arg2, 0, arg2.length);
            var4.close();
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "f", descriptor = "(I)V", line = 531)
    private final void method8(int arg0) {
        class29.field365 = false;
        try {
            int var2 = 9 / ((-arg0 - 70) / 37);
            Graphics var3 = class27.field317.getGraphics();
            class22.field267.method107(0, -80, var3, 0);
        } catch (Exception var5) {
            class27.field317.repaint();
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(Lba;Ljava/lang/String;I)Z", line = 551)
    private final boolean method9(class4 arg0, String arg1, int arg2) {
        byte[] var4 = null;
        if (!class15.field193) {
            if (class13.field182 != null) {
                try {
                    var4 = this.method3(true, class13.field182 + "/" + arg1);
                    if (!this.method17((byte) 81, arg1, var4)) {
                        var4 = null;
                    }
                    if (var4 != null) {
                        class9.field152 = new class36(var4, false, true);
                        return true;
                    }
                } catch (IOException var11) {
                    var4 = null;
                }
            }
            class15.field193 = true;
        }
        if (var4 == null) {
            boolean var6 = this.method4((byte) 75, arg1, arg0);
            if (!var6) {
                return false;
            }
            var4 = class15.field198;
            class15.field198 = null;
        }
        if (arg2 >= -41) {
            this.field47 = 52;
        }
        if (var4 == null) {
            class15.field193 = false;
            return true;
        }
        if (class13.field182 != null && var4 != null) {
            try {
                this.method7(50, class13.field182 + "/" + arg1, var4);
            } catch (IOException var10) {
            }
        }
        try {
            class9.field152 = new class36(var4, false, true);
            class15.field193 = false;
            return true;
        } catch (IOException var9) {
            throw class3.method26(var9, "monkey feet");
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "g", descriptor = "(I)V", line = 645)
    private final void method10(int arg0) {
        if (arg0 != 0) {
            this.method16(111);
        }
        if (class31.field394.length == 1) {
            class36.field451 = 0;
        } else {
            if (class3.field76 < 0) {
                class36.field451 = this.method1((byte) 81, class36.field451);
            } else {
                class36.field451 = class3.field76;
            }
            class3.field76 = this.method1((byte) 81, class36.field451);
        }
        this.method2(class36.field451, 48);
    }

    @OriginalMember(owner = "mapview!mapview", name = "c", descriptor = "(I)V", line = 676)
    public final void method11(int arg0) {
        if (!class35.field444) {
            class35.field444 = this.method5(128);
            class28.method177(null, class24.field289, class22.field268, false);
            return;
        }
        int var2 = 38 % ((-arg0 - 35) / 62);
        if (this.field63) {
            class29.field365 = true;
            this.field63 = false;
            class37.method240();
            int var3 = (int) (503.0D / this.field5) + class32.field413;
            int var4 = class32.field413 - (int) (503.0D / this.field5);
            int var5 = (int) (635.0D / this.field5) + class9.field150;
            int var6 = class9.field150 - (int) (635.0D / this.field5);
            this.method6(var6, var4, 635, 503, var3, 0, var5, 0, (byte) 55);
            if (this.field7) {
                this.field33.method95(this.field43, this.field22);
                class37.method231(this.field6 * var6 / class32.field411 + this.field43, this.field37 * var4 / class13.field183 + this.field22, (var5 - var6) * this.field6 / class32.field411, (var3 - var4) * this.field37 / class13.field183, 16711680, 128);
                class37.method237(this.field6 * var6 / class32.field411 + this.field43, this.field37 * var4 / class13.field183 + this.field22, (var5 - var6) * this.field6 / class32.field411, (var3 - var4) * this.field37 / class13.field183, 16711680);
                if (this.field42 > 0 && this.field42 % 10 < 5) {
                    for (int var7 = 0; var7 < class35.field436; var7++) {
                        if (class15.field197.field412[var7] == this.field54) {
                            int var8 = this.field43 + class15.field197.field404[var7] * this.field6 / class32.field411;
                            int var9 = class15.field197.field417[var7] * this.field37 / class13.field183 + this.field22;
                            class37.method233(var8, var9, 2, 16776960, 256);
                        }
                    }
                }
            }
            if (this.field55) {
                this.method19(18, 7829367, (byte) -99, 5592405, class9.field153, this.field15, 10066329, this.field21, this.field17);
                this.method19(this.field47 - 36, 7829367, (byte) -99, 5592405, class17.field211, this.field15, 10066329, this.field21 + 18, this.field17);
                this.method19(18, 7829367, (byte) -99, 5592405, class22.field275, this.field15, 10066329, this.field21 + this.field47 - 18, this.field17);
                int var10 = this.field21 + 3 + 18;
                int var11 = this.field35;
                for (int var12 = 0; var12 < 24; var12++) {
                    if (class20.field233.length > var11 && var11 < this.field56.length) {
                        if (this.field56[var11].method49(115, class10.field159)) {
                            var11++;
                            var12--;
                            continue;
                        }
                        class20.field233[var11].method92(this.field15 + 3, var10);
                        this.field8.method153(this.field56[var11], this.field15 + 21, var10 + 14, 0);
                        int var13 = 16777215;
                        if (this.field52 == var11) {
                            var13 = 12298922;
                        }
                        if (this.field42 > 0 && this.field42 % 10 < 5 && this.field54 == var11) {
                            var13 = 16776960;
                        }
                        this.field8.method153(this.field56[var11], this.field15 + 20, var10 - -13, var13);
                    }
                    var10 += 17;
                    var11++;
                }
            }
            if (class31.field394.length == 1) {
                this.method19(18, this.field29, (byte) -99, this.field40, class35.field441, this.field43, this.field14, this.field37 + this.field22, this.field6);
                this.method19(18, this.field29, (byte) -99, this.field40, class26.field307, this.field15, this.field14, this.field47 + this.field21, this.field17);
                if (this.field1 == 3.0D) {
                    this.method19(30, this.field38, (byte) -99, this.field24, class9.field151, 170, this.field53, 471, 50);
                } else {
                    this.method19(30, this.field29, (byte) -99, this.field40, class9.field151, 170, this.field14, 471, 50);
                }
                if (this.field1 == 4.0D) {
                    this.method19(30, this.field38, (byte) -99, this.field24, class35.field442, 230, this.field53, 471, 50);
                } else {
                    this.method19(30, this.field29, (byte) -99, this.field40, class35.field442, 230, this.field14, 471, 50);
                }
                if (this.field1 == 6.0D) {
                    this.method19(30, this.field38, (byte) -99, this.field24, class1.field70, 290, this.field53, 471, 50);
                } else {
                    this.method19(30, this.field29, (byte) -99, this.field40, class1.field70, 290, this.field14, 471, 50);
                }
                if (this.field1 == 8.0D) {
                    this.method19(30, this.field38, (byte) -99, this.field24, class34.field424, 350, this.field53, 471, 50);
                } else {
                    this.method19(30, this.field29, (byte) -99, this.field40, class34.field424, 350, this.field14, 471, 50);
                }
            } else {
                this.method19(18, this.field29, (byte) -99, this.field40, class35.field441, this.field43, this.field14, this.field37 + this.field22, this.field6);
                this.method19(18, this.field29, (byte) -99, this.field40, class26.field307, this.field15, this.field14, this.field47 + this.field21, this.field17);
                this.method12(95, this.field29);
                if (this.field1 == 3.0D) {
                    this.method19(30, this.field38, (byte) -99, this.field24, class9.field151, 170, this.field53, 451, 50);
                } else {
                    this.method19(30, this.field29, (byte) -99, this.field40, class9.field151, 170, this.field14, 451, 50);
                }
                if (this.field1 == 4.0D) {
                    this.method19(30, this.field38, (byte) -99, this.field24, class35.field442, 230, this.field53, 451, 50);
                } else {
                    this.method19(30, this.field29, (byte) -99, this.field40, class35.field442, 230, this.field14, 451, 50);
                }
                if (this.field1 == 6.0D) {
                    this.method19(30, this.field38, (byte) -99, this.field24, class1.field70, 290, this.field53, 451, 50);
                } else {
                    this.method19(30, this.field29, (byte) -99, this.field40, class1.field70, 290, this.field14, 451, 50);
                }
                if (this.field1 == 8.0D) {
                    this.method19(30, this.field38, (byte) -99, this.field24, class34.field424, 350, this.field53, 451, 50);
                } else {
                    this.method19(30, this.field29, (byte) -99, this.field40, class34.field424, 350, this.field14, 451, 50);
                }
            }
            if (class1.field66) {
                this.method19(this.field9 + this.field57, this.field29, (byte) -99, this.field40, this.field19, this.field11, this.field14, this.field57, this.field11 + this.field4);
                if (class15.field196) {
                    class37.method231(this.field4 + this.field11 + 7, this.field57, this.field46 + 10, this.field9 - -5, 8925952, 192);
                    class37.method237(this.field11 + this.field4 + 7, this.field57, this.field46 + 10, this.field9 + 5, 16777215);
                    if (class29.field363 > -1 && this.field28.method31((byte) -87) > 0) {
                        class4 var14 = this.field61[class29.field363].method30(32, 47, true);
                        int var15 = this.field28.method31((byte) -87);
                        if (var15 > var14.method31((byte) -87)) {
                            var15 = var14.method31((byte) -87);
                        }
                        this.field8.method148(var14, this.field11 + this.field4 + 11, 20, 10066176, true);
                        this.field8.method148(var14.method29(var15, 98, 0), this.field4 + this.field11 + 11, 20, 16777215, true);
                    } else {
                        this.field8.method148(class34.field426, this.field11 + this.field4 + 11, 20, 16776960, true);
                    }
                }
            }
        }
        if (class29.field365) {
            this.method8(126);
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "b", descriptor = "(II)V", line = 865)
    private final void method12(int arg0, int arg1) {
        this.method19(18, arg1, (byte) -99, this.field40, class10.method90(-108, new class4[] { field39, class36.field452[class3.field76], class29.field358 }), 170, this.field14, 483, 230);
        if (arg0 <= 13) {
            this.field63 = true;
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "init", descriptor = "()V", line = 877)
    public final void init() {
        if (this.method108((byte) 125)) {
            this.method115(503, 32, 635, (byte) 121, class34.field423.method35((byte) -124, this).method36(20928));
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "g", descriptor = "(B)V", line = 895)
    public final void method13(byte arg0) {
        class5.method52(111);
        class22.method159(57);
        try {
            this.field8 = null;
            this.field33 = null;
            this.field27 = null;
            this.field61 = null;
            class15.field197 = null;
            this.field62 = null;
            this.field56 = null;
            if (arg0 < 6) {
                field32 = null;
            }
            this.field59 = null;
            System.gc();
        } catch (Throwable var3) {
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "b", descriptor = "(B)V", line = 924)
    public final void method14(byte arg0) {
        class31.method192((byte) 41);
        class29.method184(class27.field317, 0);
        class34.method220(class27.field317, -19202);
        this.field19 = class22.field270;
        class22.field268 = class32.field410;
        this.field56 = class31.method190(-30661);
        this.field28 = class5.method54(30, (byte) 119);
        if (arg0 > -82) {
            this.method9(null, null, 118);
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "c", descriptor = "(B)V", line = 997)
    public final void method15(byte arg0) {
        method18((byte) 46);
        class9.method86(-59);
        class4.method39(true);
        class1.method21((byte) 86);
        class22.method156(11781);
        class20.method136(true);
        class15.method117((byte) -107);
        class24.method165(true);
        class14.method103(false);
        class36.method229((byte) -23);
        class32.method209(12035);
        class21.method146();
        class33.method211();
        class27.method174(false);
        class35.method223((byte) -37);
        class5.method59(1);
        class13.method100(-1);
        class37.method236();
        class29.method181(0);
        class31.method188(true);
        class10.method89(120);
        class16.method120((byte) 127);
        class34.method221(64);
        class3.method24((byte) 82);
        class12.method98(32658);
        class17.method124((byte) -1);
        class26.method170(12963);
        class30.method185(-19666);
        class23.method161(true);
        class7.method69();
        class28.method176(300);
        this.field56 = null;
        this.field23 = null;
        this.field13 = null;
        this.field19 = null;
        this.field59 = null;
        this.field8 = null;
        this.field61 = null;
        this.field33 = null;
        this.field27 = null;
        this.field18 = null;
        this.field60 = null;
        this.field62 = null;
        this.field28 = null;
        if (arg0 >= -45) {
            this.field19 = null;
        }
        this.field58 = null;
        this.field45 = null;
        this.field41 = null;
        this.field50 = null;
    }

    @OriginalMember(owner = "mapview!mapview", name = "h", descriptor = "(I)V", line = 1058)
    private final void method16(int arg0) {
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
                        class13.field182 = var8 + var6 + "/rsmap/";
                        return;
                    }
                }
            } catch (Exception var14) {
            }
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(BLjava/lang/String;[B)Z", line = 1160)
    private final boolean method17(byte arg0, String arg1, byte[] arg2) {
        if (arg0 <= 76) {
            this.method13((byte) -61);
        }
        if (arg2 == null) {
            return false;
        }
        try {
            MessageDigest var4 = MessageDigest.getInstance("SHA");
            var4.reset();
            var4.update(arg2);
            byte[] var5 = var4.digest();
            if (arg1 == "main_file_cache.dat0") {
                if (var5[0] != -104 || var5[1] != 104 || var5[2] != -68 || var5[3] != 112 || var5[4] != -43 || var5[5] != -36 || var5[6] != -96 || var5[7] != 110 || var5[8] != -46 || var5[9] != -56 || var5[10] != 70 || var5[11] != 67 || var5[12] != -74 || var5[13] != 59 || var5[14] != -42 || var5[15] != 68 || var5[16] != 18 || var5[17] != -108 || var5[18] != -81 || var5[19] != -125) {
                    return false;
                }
            } else if (var5[0] != -41 || var5[1] != 31 || var5[2] != -75 || var5[3] != -74 || var5[4] != 71 || var5[5] != 73 || var5[6] != -3 || var5[7] != 121 || var5[8] != 51 || var5[9] != -3 || var5[10] != 1 || var5[11] != -10 || var5[12] != 56 || var5[13] != -82 || var5[14] != -4 || var5[15] != -69 || var5[16] != 77 || var5[17] != -66 || var5[18] != -44 || var5[19] != 124) {
                return false;
            }
            return true;
        } catch (Exception var7) {
            this.method114("sha", (byte) -42);
            return false;
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "h", descriptor = "(B)V", line = 1199)
    public static void method18(byte arg0) {
        if (arg0 == 46) {
            field39 = null;
            field32 = null;
            field20 = null;
            field16 = null;
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(IIBILba;IIII)V", line = 1212)
    private final void method19(int arg0, int arg1, byte arg2, int arg3, class4 arg4, int arg5, int arg6, int arg7, int arg8) {
        class37.method237(arg5, arg7, arg8, arg0, 0);
        int var10 = arg0 - 2;
        int var11 = arg5 + 1;
        int var12 = arg7 + 1;
        int var13 = arg8 - 2;
        class37.method235(var11, var12, var13, var10, arg1);
        class37.method234(var11, var12, var13, arg6);
        class37.method239(var11, var12, var10, arg6);
        if (arg2 != -99) {
            this.method9(null, null, 59);
        }
        class37.method234(var11, var10 + var12 - 1, var13, arg3);
        class37.method239(var11 + var13 - 1, var12, var10, arg3);
        this.field8.method152(arg4, var11 + var13 / 2 + 1, var10 / 2 + 4 + var12 + 1, 0);
        this.field8.method152(arg4, var13 / 2 + var11, var10 / 2 + var12 + 4, 16777215);
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(I)V", line = 1278)
    public final void method20(int arg0) {
        if (field3) {
            class30.method186(class27.field317, -99);
            class17.method125(class27.field317, true);
            this.method111(122);
            class29.method184(class27.field317, 0);
            class34.method220(class27.field317, -19202);
        }
        class23.method163(-1);
        class26.method171(-98);
        if (!class35.field444) {
            return;
        }
        int var2 = -14 / ((arg0 + 13) / 43);
        if (class10.field156[96]) {
            class36.field450 = -1;
            this.field63 = true;
            class9.field150 = (int) ((double) class9.field150 - 16.0D / this.field5);
        }
        if (class10.field156[97]) {
            class9.field150 = (int) (16.0D / this.field5 + (double) class9.field150);
            class36.field450 = -1;
            this.field63 = true;
        }
        if (class10.field156[98]) {
            class32.field413 = (int) ((double) class32.field413 - 16.0D / this.field5);
            this.field63 = true;
            class36.field450 = -1;
        }
        if (class10.field156[99]) {
            class36.field450 = -1;
            class32.field413 = (int) (16.0D / this.field5 + (double) class32.field413);
            this.field63 = true;
        }
        while (true) {
            while (true) {
                while (class4.method38(1)) {
                    if (!class1.field66 || !class15.field196) {
                        if (class5.field106 == 102) {
                            this.field63 = true;
                            class15.field196 = true;
                        }
                        if (class5.field106 == 49) {
                            this.field63 = true;
                            this.field1 = 3.0D;
                        }
                        if (class5.field106 == 50) {
                            this.field63 = true;
                            this.field1 = 4.0D;
                        }
                        if (class5.field106 == 51) {
                            this.field63 = true;
                            this.field1 = 6.0D;
                        }
                        if (class5.field106 == 52) {
                            this.field63 = true;
                            this.field1 = 8.0D;
                        }
                        if (class5.field106 == 107 || class5.field106 == 75) {
                            this.field55 = !this.field55;
                            this.field63 = true;
                        }
                        if (class5.field106 == 111 || class5.field106 == 79) {
                            this.field7 = !this.field7;
                            this.field63 = true;
                        }
                    } else if (class22.field272 == 0) {
                        this.field63 = true;
                        class15.field196 = false;
                        this.field28.method41((byte) 43, 0);
                        class29.field363 = -1;
                    } else if (class22.field272 == 84) {
                        class15.field196 = false;
                        this.field12 = class9.field150 << 16;
                        this.field31 = class32.field413 << 16;
                        class36.field450 = class29.field363;
                        this.field28.method41((byte) 121, 0);
                        this.field63 = true;
                        class29.field363 = -1;
                    } else {
                        boolean var3 = false;
                        if (class22.field272 == 85) {
                            if (this.field28.method31((byte) -87) > 0) {
                                this.field28.method41((byte) 102, this.field28.method31((byte) -87) - 1);
                                this.field63 = true;
                                if (this.field28.method31((byte) -87) == 0) {
                                    class29.field363 = -1;
                                } else {
                                    var3 = true;
                                }
                            }
                        } else if (class5.field106 != -1 && this.field28.method31((byte) -87) <= class17.field218) {
                            this.field28.method44(0, class5.field106);
                            this.field63 = true;
                        }
                        if (this.field28.method31((byte) -87) > 0) {
                            for (int var4 = 0; var4 < this.field2; var4++) {
                                if (this.field61[var4].method31((byte) -87) >= this.field28.method31((byte) -87)) {
                                    class4 var5 = this.field28.method47((byte) 109);
                                    class4 var6 = this.field61[var4].method30(32, 47, true).method29(this.field28.method31((byte) -87), 16, 0).method47((byte) 109);
                                    if (var5.method40(var6, -28014) == 0) {
                                        var3 = true;
                                        class29.field363 = var4;
                                        this.field63 = true;
                                        break;
                                    }
                                }
                            }
                            if (!var3) {
                                this.field28.method41((byte) 72, this.field28.method31((byte) -87) - 1);
                            }
                        }
                    }
                }
                int var7 = class13.field179;
                int var8 = class14.field190;
                int var9 = class3.field73;
                int var10 = class24.field294;
                int var11 = class20.field237;
                int var12 = class1.field68;
                if (var7 == 1) {
                    this.field48 = var8;
                    this.field49 = class9.field150;
                    this.field51 = var9;
                    this.field44 = class32.field413;
                    if (class31.field394.length == 1) {
                        if (var8 > 170 && var8 < 220 && var9 > 471 && var9 < 503) {
                            this.field1 = 3.0D;
                            this.field48 = -1;
                        }
                        if (var8 > 230 && var8 < 280 && var9 > 471 && var9 < 503) {
                            this.field1 = 4.0D;
                            this.field48 = -1;
                        }
                        if (var8 > 290 && var8 < 340 && var9 > 471 && var9 < 503) {
                            this.field48 = -1;
                            this.field1 = 6.0D;
                        }
                        if (var8 > 350 && var8 < 400 && var9 > 471 && var9 < 503) {
                            this.field1 = 8.0D;
                            this.field48 = -1;
                        }
                    } else {
                        if (var8 > 170 && var8 < 220 && var9 > 451 && var9 < 483) {
                            this.field48 = -1;
                            this.field1 = 3.0D;
                        }
                        if (var8 > 230 && var8 < 280 && var9 > 451 && var9 < 483) {
                            this.field1 = 4.0D;
                            this.field48 = -1;
                        }
                        if (var8 > 290 && var8 < 340 && var9 > 451 && var9 < 483) {
                            this.field48 = -1;
                            this.field1 = 6.0D;
                        }
                        if (var8 > 350 && var8 < 400 && var9 > 451 && var9 < 483) {
                            this.field48 = -1;
                            this.field1 = 8.0D;
                        }
                        if (var8 > 170 && var8 < 400 && var9 > 483 && var9 < 503) {
                            this.method12(81, this.field38);
                            this.method8(-122);
                            this.method10(0);
                            this.field48 = -1;
                        }
                    }
                    this.field63 = true;
                    if (this.field15 < var8 && this.field47 + this.field21 < var9 && var8 < this.field17 + this.field15 && var9 < 503) {
                        this.field55 = !this.field55;
                        this.field48 = -1;
                    }
                    if (var8 > this.field43 && var9 > this.field37 + this.field22 && var8 < this.field6 + this.field43 && var9 < 503) {
                        this.field7 = !this.field7;
                        this.field48 = -1;
                    }
                    if (this.field55) {
                        if (this.field15 < var8 && this.field21 < var9 && this.field17 + this.field15 > var8 && var9 < this.field47 + this.field21) {
                            this.field48 = -1;
                        }
                        if (var8 > this.field15 && var9 > this.field21 && var8 < this.field17 + this.field15 && var9 < this.field21 + 18 && this.field30 > 0) {
                            this.field30 -= 24;
                        }
                        if (var8 > this.field15 && var9 > this.field21 + this.field47 - 18 && var8 < this.field15 + this.field17 && var9 < this.field47 + this.field21 && this.field30 < 48) {
                            this.field30 += 24;
                        }
                    }
                    this.field34 = false;
                    if (this.field7 && this.field43 < var8 && this.field22 < var9 && this.field43 + this.field6 > var8 && this.field37 + this.field22 > var9) {
                        class32.field413 = (var9 - this.field22) * class13.field183 / this.field37;
                        this.field34 = true;
                        class9.field150 = (var8 - this.field43) * class32.field411 / this.field6;
                        this.field48 = -1;
                    }
                    if (class1.field66 && !class15.field196 && !this.field34 && var8 > this.field11 && var9 > this.field57 && var8 < this.field11 + this.field4 && this.field9 + this.field57 > var9) {
                        class15.field196 = true;
                    }
                }
                if (this.field55) {
                    this.field52 = -1;
                    if (var10 > this.field15 && var10 < this.field15 + this.field17) {
                        int var13 = this.field35;
                        int var14 = this.field21 + 5 + 21;
                        for (int var15 = 0; var15 < 24; var15++) {
                            if (this.field56.length > var13 && this.field56[var13].method49(74, class10.field159)) {
                                var13++;
                                var15--;
                            } else {
                                if (var12 >= var14 && var14 + 17 > var12) {
                                    if (var7 == 1) {
                                        this.field42 = 50;
                                        this.field54 = var13;
                                    }
                                    this.field52 = var13;
                                }
                                var14 += 17;
                                var13++;
                            }
                        }
                    }
                    if (this.field52 != this.field36) {
                        this.field36 = this.field52;
                        this.field63 = true;
                    }
                }
                if (var11 == 1 && this.field7 && this.field34) {
                    class36.field450 = -1;
                    int var16 = var10;
                    if (this.field43 > var10) {
                        var16 = this.field43;
                    } else if (var10 > this.field6 + this.field43) {
                        var16 = this.field6 + this.field43;
                    }
                    this.field63 = true;
                    int var17 = var12;
                    if (this.field22 > var12) {
                        var17 = this.field22;
                    } else if (this.field37 + this.field22 < var12) {
                        var17 = this.field37 + this.field22;
                    }
                    class9.field150 = (var16 - this.field43) * class32.field411 / this.field6;
                    class32.field413 = (var17 - this.field22) * class13.field183 / this.field37;
                } else {
                    this.field34 = false;
                }
                if (var11 == 1 && this.field48 != -1) {
                    class32.field413 = (int) ((double) (this.field51 - var12) * 2.0D / this.field1) + this.field44;
                    this.field63 = true;
                    class9.field150 = (int) ((double) (this.field48 - var10) * 2.0D / this.field1) + this.field49;
                    class36.field450 = -1;
                }
                if (this.field5 < this.field1) {
                    this.field63 = true;
                    this.field5 += this.field5 / 30.0D;
                    if (this.field5 > this.field1) {
                        this.field5 = this.field1;
                    }
                }
                if (this.field5 > this.field1) {
                    this.field63 = true;
                    this.field5 -= this.field5 / 30.0D;
                    if (this.field1 > this.field5) {
                        this.field5 = this.field1;
                    }
                }
                if (this.field30 > this.field35) {
                    this.field63 = true;
                    this.field35++;
                }
                if (this.field35 > this.field30) {
                    this.field35--;
                    this.field63 = true;
                }
                if (this.field42 > 0) {
                    this.field63 = true;
                    this.field42--;
                }
                if (class36.field450 >= 0) {
                    class30.field383 = this.field27[class36.field450] - class27.field318;
                    class23.field284 = class1.field67 + class13.field183 - this.field59[class36.field450];
                    this.field63 = true;
                    byte var18 = 4;
                    int var19 = class30.field383 - (int) (635.0D / this.field5);
                    int var20 = class23.field284 - (int) (503.0D / this.field5);
                    int var21 = (int) (503.0D / this.field5) + class23.field284;
                    if (var20 < 48) {
                        class23.field284 = (int) (503.0D / this.field5) + 48;
                    }
                    int var22 = class30.field383 + (int) (635.0D / this.field5);
                    if (var19 < 48) {
                        class30.field383 = (int) (635.0D / this.field5) + 48;
                    }
                    if (var21 > class13.field183 - 48) {
                        class23.field284 = class13.field183 - (int) (503.0D / this.field5) - 48;
                    }
                    class23.field284 <<= 0x10;
                    int var23 = class23.field284 - this.field31;
                    if (var22 > class32.field411 - 48) {
                        class30.field383 = class32.field411 - (int) (635.0D / this.field5) - 48;
                    }
                    class30.field383 <<= 0x10;
                    int var24 = class30.field383 - this.field12;
                    if (var24 >> var18 == 0 && var23 >> var18 == 0) {
                        class36.field450 = -1;
                    } else {
                        this.field31 += var23 >> var18;
                        class32.field413 = this.field31 >> 16;
                        this.field12 += var24 >> var18;
                        class9.field150 = this.field12 >> 16;
                    }
                }
                int var25 = class9.field150 - (int) (635.0D / this.field5);
                int var26 = (int) (503.0D / this.field5) + class32.field413;
                int var27 = class32.field413 - (int) (503.0D / this.field5);
                int var28 = (int) (635.0D / this.field5) + class9.field150;
                if (var25 < 48) {
                    class9.field150 = (int) (635.0D / this.field5) + 48;
                }
                if (class32.field411 - 48 < var28) {
                    class9.field150 = class32.field411 - (int) (635.0D / this.field5) - 48;
                }
                if (var27 < 48) {
                    class32.field413 = (int) (503.0D / this.field5) + 48;
                }
                if (var26 > class13.field183 - 48) {
                    class32.field413 = class13.field183 - (int) (503.0D / this.field5) - 48;
                }
                return;
            }
        }
    }
}
