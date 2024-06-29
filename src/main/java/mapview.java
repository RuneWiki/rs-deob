import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.URL;
import java.security.MessageDigest;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!mapview")
public class mapview extends class33 {

    @OriginalMember(owner = "mapview!mapview", name = "y", descriptor = "I")
    private int field10 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "x", descriptor = "I")
    private int field9 = 500;

    @OriginalMember(owner = "mapview!mapview", name = "H", descriptor = "[I")
    private int[] field19 = new int[this.field9];

    @OriginalMember(owner = "mapview!mapview", name = "G", descriptor = "I")
    private int field18 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "D", descriptor = "I")
    private int field15 = -1;

    @OriginalMember(owner = "mapview!mapview", name = "C", descriptor = "I")
    private int field14 = 40;

    @OriginalMember(owner = "mapview!mapview", name = "A", descriptor = "Z")
    private boolean field12 = false;

    @OriginalMember(owner = "mapview!mapview", name = "w", descriptor = "I")
    private int field8 = 5;

    @OriginalMember(owner = "mapview!mapview", name = "F", descriptor = "I")
    private int field17 = 8943445;

    @OriginalMember(owner = "mapview!mapview", name = "I", descriptor = "I")
    private int field20 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "r", descriptor = "I")
    private int field3 = 450;

    @OriginalMember(owner = "mapview!mapview", name = "O", descriptor = "D")
    private double field26 = 4.0D;

    @OriginalMember(owner = "mapview!mapview", name = "Y", descriptor = "[Lt;")
    private class35[] field36 = new class35[this.field9];

    @OriginalMember(owner = "mapview!mapview", name = "B", descriptor = "[I")
    private int[] field13 = new int[this.field9];

    @OriginalMember(owner = "mapview!mapview", name = "S", descriptor = "I")
    private int field30 = 8912896;

    @OriginalMember(owner = "mapview!mapview", name = "s", descriptor = "I")
    private int field4 = 5;

    @OriginalMember(owner = "mapview!mapview", name = "eb", descriptor = "Z")
    private boolean field42 = false;

    @OriginalMember(owner = "mapview!mapview", name = "V", descriptor = "I")
    private int field33 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "hb", descriptor = "Z")
    private boolean field45 = false;

    @OriginalMember(owner = "mapview!mapview", name = "Q", descriptor = "I")
    private int field28 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "N", descriptor = "I")
    private int field25 = -1;

    @OriginalMember(owner = "mapview!mapview", name = "gb", descriptor = "Z")
    private boolean field44 = true;

    @OriginalMember(owner = "mapview!mapview", name = "fb", descriptor = "I")
    private int field43 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "kb", descriptor = "I")
    private int field48 = 18;

    @OriginalMember(owner = "mapview!mapview", name = "R", descriptor = "I")
    private int field29 = 33;

    @OriginalMember(owner = "mapview!mapview", name = "E", descriptor = "I")
    private int field16 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "jb", descriptor = "I")
    private int field47 = -1;

    @OriginalMember(owner = "mapview!mapview", name = "pb", descriptor = "I")
    private int field53 = 11141120;

    @OriginalMember(owner = "mapview!mapview", name = "db", descriptor = "[I")
    private int[] field41 = new int[this.field9];

    @OriginalMember(owner = "mapview!mapview", name = "lb", descriptor = "I")
    private int field49 = 6706483;

    @OriginalMember(owner = "mapview!mapview", name = "ab", descriptor = "I")
    private int field38 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "T", descriptor = "I")
    private int field31 = 7824964;

    @OriginalMember(owner = "mapview!mapview", name = "rb", descriptor = "I")
    private int field55 = 140;

    @OriginalMember(owner = "mapview!mapview", name = "xb", descriptor = "I")
    private int field61 = 5;

    @OriginalMember(owner = "mapview!mapview", name = "tb", descriptor = "D")
    private double field57 = 4.0D;

    @OriginalMember(owner = "mapview!mapview", name = "wb", descriptor = "I")
    private int field60 = 10027008;

    @OriginalMember(owner = "mapview!mapview", name = "Z", descriptor = "Lt;")
    public static class35 field37 = class3.method28(false, "Archery Shop");

    @OriginalMember(owner = "mapview!mapview", name = "t", descriptor = "I")
    public static int field5 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "ub", descriptor = "I")
    private static int field58 = -1;

    @OriginalMember(owner = "mapview!mapview", name = "p", descriptor = "I")
    private int field1;

    @OriginalMember(owner = "mapview!mapview", name = "z", descriptor = "I")
    private int field11;

    @OriginalMember(owner = "mapview!mapview", name = "L", descriptor = "I")
    private int field23;

    @OriginalMember(owner = "mapview!mapview", name = "X", descriptor = "I")
    private int field35;

    @OriginalMember(owner = "mapview!mapview", name = "bb", descriptor = "I")
    private int field39;

    @OriginalMember(owner = "mapview!mapview", name = "vb", descriptor = "I")
    private int field59;

    @OriginalMember(owner = "mapview!mapview", name = "v", descriptor = "I")
    private int field7;

    @OriginalMember(owner = "mapview!mapview", name = "W", descriptor = "Ll;")
    private class22 field34;

    @OriginalMember(owner = "mapview!mapview", name = "nb", descriptor = "Lma;")
    private class25 field51;

    @OriginalMember(owner = "mapview!mapview", name = "J", descriptor = "Lo;")
    private class28 field21;

    @OriginalMember(owner = "mapview!mapview", name = "M", descriptor = "Lo;")
    private class28 field24;

    @OriginalMember(owner = "mapview!mapview", name = "P", descriptor = "Lo;")
    private class28 field27;

    @OriginalMember(owner = "mapview!mapview", name = "U", descriptor = "Lo;")
    private class28 field32;

    @OriginalMember(owner = "mapview!mapview", name = "mb", descriptor = "Lo;")
    private class28 field50;

    @OriginalMember(owner = "mapview!mapview", name = "qb", descriptor = "Lo;")
    private class28 field54;

    @OriginalMember(owner = "mapview!mapview", name = "sb", descriptor = "Lo;")
    private class28 field56;

    @OriginalMember(owner = "mapview!mapview", name = "u", descriptor = "Lo;")
    private class28 field6;

    @OriginalMember(owner = "mapview!mapview", name = "q", descriptor = "Lt;")
    private class35 field2;

    @OriginalMember(owner = "mapview!mapview", name = "K", descriptor = "Lt;")
    private class35 field22;

    @OriginalMember(owner = "mapview!mapview", name = "ib", descriptor = "Ljava/io/DataInputStream;")
    private static DataInputStream field46;

    @OriginalMember(owner = "mapview!mapview", name = "yb", descriptor = "Z")
    public static boolean field62;

    @OriginalMember(owner = "mapview!mapview", name = "cb", descriptor = "[Lt;")
    private class35[] field40;

    @OriginalMember(owner = "mapview!mapview", name = "ob", descriptor = "[[[I")
    public static int[][][] field52;

    @OriginalMember(owner = "mapview!mapview", name = "g", descriptor = "(I)V", line = 9)
    private final void method1(int arg0) {
        class3.field76 = false;
        try {
            if (arg0 != -52) {
                this.method17(-40, -83);
            }
            Graphics var2 = class27.field306.getGraphics();
            class6.field107.method31(arg0 + 53, 0, var2, 0);
        } catch (Exception var4) {
            class27.field306.repaint();
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(Lt;Ljava/lang/String;B)Z", line = 27)
    private final boolean method2(class35 arg0, String arg1, byte arg2) {
        byte[] var4 = null;
        if (!class21.field248) {
            if (class2.field63 != null) {
                try {
                    var4 = this.method6(class2.field63 + "/" + arg1, 0);
                    if (!this.method5(false, var4, arg1)) {
                        var4 = null;
                    }
                    if (var4 != null) {
                        class21.field244 = new class26(var4, false, true);
                        return true;
                    }
                } catch (IOException var11) {
                    var4 = null;
                }
            }
            class21.field248 = true;
        }
        if (var4 == null) {
            boolean var6 = this.method10(arg0, -216, arg1);
            if (!var6) {
                return false;
            }
            var4 = class3.field79;
            class3.field79 = null;
        }
        if (var4 == null) {
            class21.field248 = false;
            return true;
        }
        if (class2.field63 != null && var4 != null) {
            try {
                this.method19(false, class2.field63 + "/" + arg1, var4);
            } catch (IOException var10) {
            }
        }
        try {
            if (arg2 <= 56) {
                this.field54 = null;
            }
            class21.field244 = new class26(var4, false, true);
            class21.field248 = false;
            return true;
        } catch (IOException var9) {
            throw class7.method52(var9, "monkey feet");
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(Z)V", line = 100)
    public final void method3(boolean arg0) {
        if (class7.field124) {
            class17.method103(105, class27.field306);
            class24.method137(class27.field306, false);
            this.method199((byte) -16);
            method23(81, class27.field306);
            class26.method149(class27.field306, -5);
        }
        class19.method120((byte) 25);
        class15.method96(7591);
        if (!class2.field71) {
            return;
        }
        if (class24.field271[96]) {
            class15.field181 = (int) ((double) class15.field181 - 16.0D / this.field57);
            field58 = -1;
            this.field44 = true;
        }
        if (class24.field271[97]) {
            this.field44 = true;
            field58 = -1;
            class15.field181 = (int) (16.0D / this.field57 + (double) class15.field181);
        }
        if (class24.field271[98]) {
            this.field44 = true;
            class35.field435 = (int) ((double) class35.field435 - 16.0D / this.field57);
            field58 = -1;
        }
        if (class24.field271[99]) {
            field58 = -1;
            class35.field435 = (int) (16.0D / this.field57 + (double) class35.field435);
            this.field44 = true;
        }
        while (true) {
            while (true) {
                while (true) {
                    while (class15.method93(18035)) {
                        if (!class33.field412 || !class35.field439) {
                            if (class13.field169 == 102) {
                                this.field44 = true;
                                class35.field439 = true;
                            }
                            if (class13.field169 == 49) {
                                this.field26 = 3.0D;
                                this.field44 = true;
                            }
                            if (class13.field169 == 50) {
                                this.field44 = true;
                                this.field26 = 4.0D;
                            }
                            if (class13.field169 == 51) {
                                this.field26 = 6.0D;
                                this.field44 = true;
                            }
                            if (class13.field169 == 52) {
                                this.field44 = true;
                                this.field26 = 8.0D;
                            }
                            if (class13.field169 == 107 || class13.field169 == 75) {
                                this.field12 = !this.field12;
                                this.field44 = true;
                            }
                            if (class13.field169 == 111 || class13.field169 == 79) {
                                this.field42 = !this.field42;
                                this.field44 = true;
                            }
                        } else if (class31.field387 == 0) {
                            class35.field439 = false;
                            this.field44 = true;
                            this.field2.method208((byte) 83, 0);
                            class11.field160 = -1;
                        } else if (class31.field387 == 84) {
                            class35.field439 = false;
                            field58 = class11.field160;
                            this.field59 = class15.field181 << 16;
                            this.field1 = class35.field435 << 16;
                            this.field2.method208((byte) 83, 0);
                            this.field44 = true;
                            class11.field160 = -1;
                        } else {
                            boolean var2 = false;
                            if (class31.field387 == 85) {
                                if (this.field2.method220((byte) -100) > 0) {
                                    this.field2.method208((byte) 83, this.field2.method220((byte) -97) - 1);
                                    this.field44 = true;
                                    if (this.field2.method220((byte) -72) == 0) {
                                        class11.field160 = -1;
                                    } else {
                                        var2 = true;
                                    }
                                }
                            } else if (class13.field169 != -1 && this.field2.method220((byte) -87) <= class18.field205) {
                                this.field2.method211(class13.field169, 98);
                                this.field44 = true;
                            }
                            if (this.field2.method220((byte) -65) > 0) {
                                for (int var3 = 0; var3 < this.field10; var3++) {
                                    if (this.field36[var3].method220((byte) -96) >= this.field2.method220((byte) -100)) {
                                        class35 var4 = this.field2.method204((byte) 11);
                                        class35 var5 = this.field36[var3].method205((byte) 120, 47, 32).method216(this.field2.method220((byte) -90), true, 0).method204((byte) 11);
                                        if (var4.method217((byte) -110, var5) == 0) {
                                            var2 = true;
                                            this.field44 = true;
                                            class11.field160 = var3;
                                            break;
                                        }
                                    }
                                }
                                if (!var2) {
                                    this.field2.method208((byte) 83, this.field2.method220((byte) -110) - 1);
                                }
                            }
                        }
                    }
                    int var6 = class33.field417;
                    int var7 = class19.field221;
                    int var8 = class16.field192;
                    int var9 = class7.field125;
                    int var10 = class36.field453;
                    int var11 = class21.field247;
                    if (var8 == 1) {
                        this.field16 = class35.field435;
                        this.field33 = var6;
                        this.field43 = class15.field181;
                        this.field18 = var11;
                        if (class24.field276.length == 1) {
                            if (var11 > 170 && var11 < 220 && var6 > 471 && var6 < 503) {
                                this.field26 = 3.0D;
                                this.field18 = -1;
                            }
                            if (var11 > 230 && var11 < 280 && var6 > 471 && var6 < 503) {
                                this.field18 = -1;
                                this.field26 = 4.0D;
                            }
                            if (var11 > 290 && var11 < 340 && var6 > 471 && var6 < 503) {
                                this.field26 = 6.0D;
                                this.field18 = -1;
                            }
                            if (var11 > 350 && var11 < 400 && var6 > 471 && var6 < 503) {
                                this.field26 = 8.0D;
                                this.field18 = -1;
                            }
                        } else {
                            if (var11 > 170 && var11 < 220 && var6 > 451 && var6 < 483) {
                                this.field18 = -1;
                                this.field26 = 3.0D;
                            }
                            if (var11 > 230 && var11 < 280 && var6 > 451 && var6 < 483) {
                                this.field26 = 4.0D;
                                this.field18 = -1;
                            }
                            if (var11 > 290 && var11 < 340 && var6 > 451 && var6 < 483) {
                                this.field18 = -1;
                                this.field26 = 6.0D;
                            }
                            if (var11 > 350 && var11 < 400 && var6 > 451 && var6 < 483) {
                                this.field18 = -1;
                                this.field26 = 8.0D;
                            }
                            if (var11 > 170 && var11 < 400 && var6 > 483 && var6 < 503) {
                                this.method11(this.field60, (byte) -97);
                                this.method1(-52);
                                this.method14((byte) 127);
                                this.field18 = -1;
                            }
                        }
                        if (var11 > this.field8 && this.field3 + this.field29 < var6 && this.field8 + this.field55 > var11 && var6 < 503) {
                            this.field18 = -1;
                            this.field12 = !this.field12;
                        }
                        this.field45 = false;
                        if (var11 > this.field23 && this.field35 + this.field11 < var6 && this.field7 + this.field23 > var11 && var6 < 503) {
                            this.field42 = !this.field42;
                            this.field18 = -1;
                        }
                        if (this.field12) {
                            if (this.field8 < var11 && this.field29 < var6 && this.field8 + this.field55 > var11 && this.field3 + this.field29 > var6) {
                                this.field18 = -1;
                            }
                            if (this.field8 < var11 && this.field29 < var6 && this.field8 + this.field55 > var11 && var6 < this.field29 + 18 && this.field38 > 0) {
                                this.field38 -= 24;
                            }
                            if (var11 > this.field8 && this.field3 + this.field29 - 18 < var6 && var11 < this.field8 + this.field55 && this.field3 + this.field29 > var6 && this.field38 < 48) {
                                this.field38 += 24;
                            }
                        }
                        this.field44 = true;
                        if (this.field42 && var11 > this.field23 && this.field35 < var6 && this.field7 + this.field23 > var11 && var6 < this.field35 + this.field11) {
                            this.field18 = -1;
                            class35.field435 = (var6 - this.field35) * class33.field408 / this.field11;
                            class15.field181 = (var11 - this.field23) * class31.field374 / this.field7;
                            this.field45 = true;
                        }
                        if (class33.field412 && !class35.field439 && !this.field45 && this.field4 < var11 && var6 > this.field61 && var11 < this.field4 + this.field14 && this.field61 + this.field48 > var6) {
                            class35.field439 = true;
                        }
                    }
                    if (this.field12) {
                        this.field15 = -1;
                        if (var9 > this.field8 && var9 < this.field8 + this.field55) {
                            int var12 = this.field29 + 26;
                            int var13 = this.field28;
                            for (int var14 = 0; var14 < 24; var14++) {
                                if (this.field40.length > var13 && this.field40[var13].method207(class31.field368, 78)) {
                                    var14--;
                                    var13++;
                                } else {
                                    if (var12 <= var10 && var12 + 17 > var10) {
                                        if (var8 == 1) {
                                            this.field20 = 50;
                                            this.field25 = var13;
                                        }
                                        this.field15 = var13;
                                    }
                                    var13++;
                                    var12 += 17;
                                }
                            }
                        }
                        if (this.field47 != this.field15) {
                            this.field44 = true;
                            this.field47 = this.field15;
                        }
                    }
                    if (var7 == 1 && this.field42 && this.field45) {
                        field58 = -1;
                        this.field44 = true;
                        int var15 = var9;
                        if (var9 < this.field23) {
                            var15 = this.field23;
                        } else if (var9 > this.field23 + this.field7) {
                            var15 = this.field7 + this.field23;
                        }
                        class15.field181 = (var15 - this.field23) * class31.field374 / this.field7;
                        int var16 = var10;
                        if (this.field35 > var10) {
                            var16 = this.field35;
                        } else if (this.field35 + this.field11 < var10) {
                            var16 = this.field35 + this.field11;
                        }
                        class35.field435 = (var16 - this.field35) * class33.field408 / this.field11;
                    } else {
                        this.field45 = false;
                    }
                    if (var7 == 1 && this.field18 != -1) {
                        class35.field435 = (int) ((double) (this.field33 - var10) * 2.0D / this.field26) + this.field16;
                        field58 = -1;
                        class15.field181 = (int) ((double) (this.field18 - var9) * 2.0D / this.field26) + this.field43;
                        this.field44 = true;
                    }
                    if (this.field26 > this.field57) {
                        this.field57 += this.field57 / 30.0D;
                        if (this.field57 > this.field26) {
                            this.field57 = this.field26;
                        }
                        this.field44 = true;
                    }
                    if (this.field26 < this.field57) {
                        this.field44 = true;
                        this.field57 -= this.field57 / 30.0D;
                        if (this.field26 > this.field57) {
                            this.field57 = this.field26;
                        }
                    }
                    if (this.field28 < this.field38) {
                        this.field28++;
                        this.field44 = true;
                    }
                    if (this.field28 > this.field38) {
                        this.field28--;
                        this.field44 = true;
                    }
                    if (this.field20 > 0) {
                        this.field44 = true;
                        this.field20--;
                    }
                    if (field58 >= 0) {
                        class7.field113 = this.field13[field58] - class23.field255;
                        class2.field65 = class30.field358 + class33.field408 - this.field41[field58];
                        this.field44 = true;
                        byte var17 = 4;
                        int var18 = class7.field113 - (int) (635.0D / this.field57);
                        int var19 = class7.field113 + (int) (635.0D / this.field57);
                        int var20 = class2.field65 - (int) (503.0D / this.field57);
                        int var21 = (int) (503.0D / this.field57) + class2.field65;
                        if (var18 < 48) {
                            class7.field113 = (int) (635.0D / this.field57) + 48;
                        }
                        if (var20 < 48) {
                            class2.field65 = (int) (503.0D / this.field57) + 48;
                        }
                        if (var21 > class33.field408 - 48) {
                            class2.field65 = class33.field408 - (int) (503.0D / this.field57) - 48;
                        }
                        class2.field65 <<= 0x10;
                        int var22 = class2.field65 - this.field1;
                        if (var19 > class31.field374 - 48) {
                            class7.field113 = class31.field374 - (int) (635.0D / this.field57) - 48;
                        }
                        class7.field113 <<= 0x10;
                        int var23 = class7.field113 - this.field59;
                        if (var23 >> var17 == 0 && var22 >> var17 == 0) {
                            field58 = -1;
                        } else {
                            this.field59 += var23 >> var17;
                            class15.field181 = this.field59 >> 16;
                            this.field1 += var22 >> var17;
                            class35.field435 = this.field1 >> 16;
                        }
                    }
                    if (arg0) {
                        this.method7(73);
                    }
                    int var24 = class15.field181 - (int) (635.0D / this.field57);
                    int var25 = (int) (635.0D / this.field57) + class15.field181;
                    int var26 = class35.field435 - (int) (503.0D / this.field57);
                    if (var24 < 48) {
                        class15.field181 = (int) (635.0D / this.field57) + 48;
                    }
                    if (class31.field374 - 48 < var25) {
                        class15.field181 = class31.field374 - (int) (635.0D / this.field57) - 48;
                    }
                    int var27 = (int) (503.0D / this.field57) + class35.field435;
                    if (var26 < 48) {
                        class35.field435 = (int) (503.0D / this.field57) + 48;
                    }
                    if (var27 > class33.field408 - 48) {
                        class35.field435 = class33.field408 - (int) (503.0D / this.field57) - 48;
                    }
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(IZ)I", line = 656)
    private final int method4(int arg0, boolean arg1) {
        arg0++;
        if (arg0 >= class24.field276.length) {
            arg0 = 0;
        }
        if (!arg1) {
            this.method1(-8);
        }
        return arg0;
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(Z[BLjava/lang/String;)Z", line = 678)
    private final boolean method5(boolean arg0, byte[] arg1, String arg2) {
        if (arg1 == null) {
            return false;
        }
        try {
            MessageDigest var4 = MessageDigest.getInstance("SHA");
            var4.reset();
            var4.update(arg1);
            byte[] var5 = var4.digest();
            if (arg0) {
                return true;
            }
            if (arg2 == "main_file_cache.dat0") {
                if (var5[0] != 11 || var5[1] != 79 || var5[2] != -40 || var5[3] != -33 || var5[4] != -1 || var5[5] != 39 || var5[6] != -102 || var5[7] != 10 || var5[8] != -79 || var5[9] != 36 || var5[10] != 94 || var5[11] != -103 || var5[12] != 61 || var5[13] != -117 || var5[14] != -86 || var5[15] != 121 || var5[16] != -7 || var5[17] != -61 || var5[18] != -30 || var5[19] != -79) {
                    return false;
                }
            } else if (var5[0] != -41 || var5[1] != 31 || var5[2] != -75 || var5[3] != -74 || var5[4] != 71 || var5[5] != 73 || var5[6] != -3 || var5[7] != 121 || var5[8] != 51 || var5[9] != -3 || var5[10] != 1 || var5[11] != -10 || var5[12] != 56 || var5[13] != -82 || var5[14] != -4 || var5[15] != -69 || var5[16] != 77 || var5[17] != -66 || var5[18] != -44 || var5[19] != 124) {
                return false;
            }
            return true;
        } catch (Exception var7) {
            this.method191(true, "sha");
            return false;
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(Ljava/lang/String;I)[B", line = 720)
    private final byte[] method6(String arg0, int arg1) throws IOException {
        File var3 = new File(arg0);
        if (!var3.exists()) {
            return null;
        } else if (arg1 == 0) {
            int var4 = (int) var3.length();
            DataInputStream var5 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg0)));
            byte[] var6 = new byte[var4];
            var5.readFully(var6, 0, var4);
            var5.close();
            return var6;
        } else {
            return (byte[]) null;
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "h", descriptor = "(I)V", line = 750)
    private final void method7(int arg0) {
        int var2 = 50 / ((arg0 - 27) / 54);
        String var3 = ".file_store_32";
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
                        class2.field63 = var9 + var3 + "/rsmap/";
                        return;
                    }
                }
            } catch (Exception var15) {
            }
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "b", descriptor = "(Z)V", line = 815)
    public final void method8(boolean arg0) {
        if (!class2.field71) {
            class2.field71 = this.method21(-2664);
            class32.method182(class23.field266, class3.field74, null, -18);
            return;
        }
        if (!arg0) {
            this.field57 = 0.6800745369670579D;
        }
        if (this.field44) {
            this.field44 = false;
            class3.field76 = true;
            class37.method234();
            int var2 = class15.field181 - (int) (635.0D / this.field57);
            int var3 = (int) (635.0D / this.field57) + class15.field181;
            int var4 = class35.field435 - (int) (503.0D / this.field57);
            int var5 = (int) (503.0D / this.field57) + class35.field435;
            this.method9(var3, var5, 0, 0, 125, 635, var4, 503, var2);
            if (this.field42) {
                this.field34.method129(this.field23, this.field35);
                class37.method241(this.field7 * var2 / class31.field374 + this.field23, this.field11 * var4 / class33.field408 + this.field35, (var3 - var2) * this.field7 / class31.field374, (var5 - var4) * this.field11 / class33.field408, 16711680, 128);
                class37.method239(this.field7 * var2 / class31.field374 + this.field23, this.field11 * var4 / class33.field408 + this.field35, (var3 - var2) * this.field7 / class31.field374, (var5 - var4) * this.field11 / class33.field408, 16711680);
                if (this.field20 > 0 && this.field20 % 10 < 5) {
                    for (int var6 = 0; var6 < class17.field198; var6++) {
                        if (class34.field423.field99[var6] == this.field25) {
                            int var7 = this.field35 + class34.field423.field94[var6] * this.field11 / class33.field408;
                            int var8 = class34.field423.field95[var6] * this.field7 / class31.field374 + this.field23;
                            class37.method232(var8, var7, 2, 16776960, 256);
                        }
                    }
                }
            }
            if (this.field12) {
                this.method22(class7.field119, this.field55, 10066329, 5592405, 18, this.field8, 7829367, this.field29, -111);
                this.method22(class8.field132, this.field55, 10066329, 5592405, this.field3 - 36, this.field8, 7829367, this.field29 + 18, -100);
                this.method22(class34.field428, this.field55, 10066329, 5592405, 18, this.field8, 7829367, this.field29 + this.field3 - 18, -124);
                int var9 = this.field29 + 3 + 18;
                int var10 = this.field28;
                for (int var11 = 0; var11 < 24; var11++) {
                    if (class29.field328.length > var10 && this.field40.length > var10) {
                        if (this.field40[var10].method207(class31.field368, 63)) {
                            var10++;
                            var11--;
                            continue;
                        }
                        class29.field328[var10].method127(this.field8 + 3, var9);
                        this.field51.method138(this.field40[var10], this.field8 + 21, var9 - -14, 0);
                        int var12 = 16777215;
                        if (this.field15 == var10) {
                            var12 = 12298922;
                        }
                        if (this.field20 > 0 && this.field20 % 10 < 5 && this.field25 == var10) {
                            var12 = 16776960;
                        }
                        this.field51.method138(this.field40[var10], this.field8 + 20, var9 + 13, var12);
                    }
                    var10++;
                    var9 += 17;
                }
            }
            if (class24.field276.length == 1) {
                this.method22(class32.field396, this.field7, this.field17, this.field49, 18, this.field23, this.field31, this.field35 + this.field11, -111);
                this.method22(class32.field400, this.field55, this.field17, this.field49, 18, this.field8, this.field31, this.field3 + this.field29, -97);
                if (this.field26 == 3.0D) {
                    this.method22(class15.field176, 50, this.field53, this.field30, 30, 170, this.field60, 471, -96);
                } else {
                    this.method22(class15.field176, 50, this.field17, this.field49, 30, 170, this.field31, 471, -97);
                }
                if (this.field26 == 4.0D) {
                    this.method22(class36.field450, 50, this.field53, this.field30, 30, 230, this.field60, 471, -103);
                } else {
                    this.method22(class36.field450, 50, this.field17, this.field49, 30, 230, this.field31, 471, -115);
                }
                if (this.field26 == 6.0D) {
                    this.method22(class13.field172, 50, this.field53, this.field30, 30, 290, this.field60, 471, -99);
                } else {
                    this.method22(class13.field172, 50, this.field17, this.field49, 30, 290, this.field31, 471, -95);
                }
                if (this.field26 == 8.0D) {
                    this.method22(class29.field320, 50, this.field53, this.field30, 30, 350, this.field60, 471, -123);
                } else {
                    this.method22(class29.field320, 50, this.field17, this.field49, 30, 350, this.field31, 471, -118);
                }
            } else {
                this.method22(class32.field396, this.field7, this.field17, this.field49, 18, this.field23, this.field31, this.field35 + this.field11, -111);
                this.method22(class32.field400, this.field55, this.field17, this.field49, 18, this.field8, this.field31, this.field3 + this.field29, -109);
                this.method11(this.field31, (byte) -97);
                if (this.field26 == 3.0D) {
                    this.method22(class15.field176, 50, this.field53, this.field30, 30, 170, this.field60, 451, -100);
                } else {
                    this.method22(class15.field176, 50, this.field17, this.field49, 30, 170, this.field31, 451, -104);
                }
                if (this.field26 == 4.0D) {
                    this.method22(class36.field450, 50, this.field53, this.field30, 30, 230, this.field60, 451, -108);
                } else {
                    this.method22(class36.field450, 50, this.field17, this.field49, 30, 230, this.field31, 451, -107);
                }
                if (this.field26 == 6.0D) {
                    this.method22(class13.field172, 50, this.field53, this.field30, 30, 290, this.field60, 451, -124);
                } else {
                    this.method22(class13.field172, 50, this.field17, this.field49, 30, 290, this.field31, 451, -117);
                }
                if (this.field26 == 8.0D) {
                    this.method22(class29.field320, 50, this.field53, this.field30, 30, 350, this.field60, 451, -122);
                } else {
                    this.method22(class29.field320, 50, this.field17, this.field49, 30, 350, this.field31, 451, -97);
                }
            }
            if (class33.field412) {
                this.method22(this.field22, this.field4 + this.field14, this.field17, this.field49, this.field61 + this.field48, this.field4, this.field31, this.field61, -102);
                if (class35.field439) {
                    class37.method241(this.field4 + this.field14 + 7, this.field61, this.field39 + 10, this.field48 + 5, 8925952, 192);
                    class37.method239(this.field4 + this.field14 + 7, this.field61, this.field39 + 10, this.field48 - -5, 16777215);
                    if (class11.field160 > -1 && this.field2.method220((byte) -104) > 0) {
                        class35 var13 = this.field36[class11.field160].method205((byte) 120, 47, 32);
                        int var14 = this.field2.method220((byte) -75);
                        if (var13.method220((byte) -92) < var14) {
                            var14 = var13.method220((byte) -118);
                        }
                        this.field51.method145(var13, this.field4 + this.field14 + 11, 20, 10066176, true);
                        this.field51.method145(var13.method216(var14, true, 0), this.field14 + this.field4 + 11, 20, 16777215, true);
                    } else {
                        this.field51.method145(class32.field405, this.field4 + this.field14 + 11, 20, 16776960, true);
                    }
                }
            }
        }
        if (class3.field76) {
            this.method1(-52);
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(IIIIIIIII)V", line = 1009)
    private final void method9(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class34.field423.method35(arg0, arg2, arg3, false, arg6, arg7, arg1, arg5, arg8);
        if (arg0 - arg8 > -arg2 + arg5) {
            return;
        }
        class34.field423.method42(arg3, 54, arg8, arg5, arg2, this.field57, arg0, arg6, arg1, arg7);
        class34.field423.method34(arg0, arg6, arg2, arg8, arg5, arg3, arg1, (byte) 116, arg7);
        class34.field423.method44(arg5, this.field25, arg2, -1, arg7, arg0, arg1, arg3, arg6, this.field20, arg8);
        if (this.field57 == this.field26 && class7.field123) {
            for (int var10 = 0; var10 < this.field10; var10++) {
                int var11 = this.field13[var10];
                int var12 = this.field41[var10];
                int var13 = class33.field408 + class30.field358 - var12;
                int var14 = (arg7 - arg3) * (-arg6 + var13) / (arg1 - arg6) + arg3;
                int var15 = this.field19[var10];
                int var16 = 16777215;
                int var17 = var11 - class23.field255;
                int var18 = arg2 + (arg5 - arg2) * (-arg8 + var17) / (arg0 - arg8);
                class28 var19 = null;
                if (var15 == 0) {
                    if (this.field57 == 3.0D) {
                        var19 = this.field24;
                    }
                    if (this.field57 == 4.0D) {
                        var19 = this.field32;
                    }
                    if (this.field57 == 6.0D) {
                        var19 = this.field56;
                    }
                    if (this.field57 == 8.0D) {
                        var19 = this.field27;
                    }
                }
                if (var15 == 1) {
                    if (this.field57 == 3.0D) {
                        var19 = this.field56;
                    }
                    if (this.field57 == 4.0D) {
                        var19 = this.field27;
                    }
                    if (this.field57 == 6.0D) {
                        var19 = this.field21;
                    }
                    if (this.field57 == 8.0D) {
                        var19 = this.field6;
                    }
                }
                if (var15 == 2) {
                    if (this.field57 == 3.0D) {
                        var19 = this.field21;
                    }
                    if (this.field57 == 4.0D) {
                        var19 = this.field6;
                    }
                    if (this.field57 == 6.0D) {
                        var19 = this.field50;
                    }
                    var16 = 16755200;
                    if (this.field57 == 8.0D) {
                        var19 = this.field54;
                    }
                }
                if (var19 != null) {
                    int var20 = 1;
                    class35 var21 = this.field36[var10];
                    for (int var22 = 0; var22 < var21.method220((byte) -99); var22++) {
                        if (var21.method209(true, var22) == 47) {
                            var20++;
                        }
                    }
                    int var23 = var14 - (var20 - 1) * var19.method157() / 2;
                    int var24 = var23 + var19.method162() / 2;
                    while (true) {
                        int var25 = var21.method224(47, (byte) 59);
                        if (var25 == -1) {
                            var19.method158(var21, var18, var24, var16, true);
                            break;
                        }
                        class35 var26 = var21.method216(var25, true, 0);
                        var19.method158(var26, var18, var24, var16, true);
                        var24 += var19.method157();
                        var21 = var21.method222(var25 + 1, 12);
                    }
                }
            }
        }
        if (class26.field303) {
            for (int var27 = class23.field255 / 64; var27 < (class31.field374 + class23.field255) / 64; var27++) {
                for (int var28 = class30.field358 / 64; var28 < (class33.field408 + class30.field358) / 64; var28++) {
                    int var29 = var27 * 64;
                    int var30 = var28 * 64;
                    int var31 = var29 - class23.field255;
                    int var32 = class33.field408 + class30.field358 - var30;
                    int var33 = arg2 + (arg5 - arg2) * (var31 - arg8) / (arg0 - arg8);
                    int var34 = (var32 - arg6 - 64) * (-arg3 + arg7) / (arg1 - arg6) + arg3;
                    int var35 = (arg7 - arg3) * (-arg6 + var32) / (arg1 - arg6) + arg3;
                    int var36 = (var31 + 64 - arg8) * (-arg2 + arg5) / (arg0 - arg8) + arg2;
                    class37.method239(var33, var34, var36 - var33, -var34 + var35, 16777215);
                    this.field51.method139(class32.method184((byte) 122, new class35[] { method18(10, var27), class35.field438, method18(10, var28) }), var36 - 5, var35 + -5, 16777215);
                    if (var27 == 33 && var28 >= 71 && var28 <= 73) {
                        this.field51.method143(class18.field214, (var33 + var36) / 2, (var34 + var35) / 2, 16711680);
                    }
                }
            }
        }
        if (arg4 <= 110) {
            this.field9 = -96;
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(Lt;ILjava/lang/String;)Z", line = 1202)
    private final boolean method10(class35 arg0, int arg1, String arg2) {
        try {
            if (field46 == null) {
                class23.field266 = class32.method184((byte) 122, new class35[] { class7.field118, arg0 });
                String var4;
                if (arg2 == "main_file_cache.dat0") {
                    var4 = "worldmap.main.js5?crc=-1159371643";
                } else if (arg2 == "main_file_cache.dat1") {
                    var4 = "worldmap.dungeon.js5?crc=-1724943346";
                } else if (arg2 == "main_file_cache.dat2") {
                    var4 = "worldmap.extra.js5?crc=509883031";
                } else {
                    var4 = "mapview.sprites.js5?crc=-1837203931";
                }
                int var5;
                if (arg2 == "main_file_cache.dat0") {
                    var5 = 397414;
                } else if (arg2 == "main_file_cache.dat1") {
                    var5 = 143997;
                } else if (arg2 == "main_file_cache.dat2") {
                    var5 = 109473;
                } else {
                    var5 = 8200;
                }
                field46 = new DataInputStream((new URL(this.getCodeBase(), var4)).openStream());
                class16.field184 = 0;
                class3.field79 = new byte[var5];
                class23.field259 = 0;
            }
            int var6 = class16.field184;
            int var7 = class3.field79.length;
            if (var6 >= var7) {
                field46.close();
                field46 = null;
                if (!this.method5(false, class3.field79, arg2)) {
                    this.method191(true, "download");
                    class3.field79 = null;
                }
                if (arg1 != -216) {
                    this.method21(-25);
                }
                return true;
            }
            class23.field259++;
            if (class23.field259 >= 1500) {
                throw new IOException();
            }
            DataInputStream var8 = field46;
            int var9 = var8.available();
            if (var9 < 0) {
                throw new EOFException();
            } else if (var9 == 0) {
                return false;
            } else {
                if (var7 - var6 < var9) {
                    var9 = var7 - var6;
                }
                int var10 = var8.read(class3.field79, var6, var9);
                if (var10 < 0) {
                    throw new EOFException();
                } else if (var10 == 0) {
                    return false;
                } else {
                    class23.field259 = 0;
                    int var11 = var6 + var10;
                    int var12 = var11 * 100 / var7;
                    class23.field266 = class32.method184((byte) 122, new class35[] { class11.field159, arg0, class35.field432, method18(10, var12), class24.field269 });
                    class16.field184 = var11;
                    return false;
                }
            }
        } catch (IOException var16) {
            try {
                field46.close();
            } catch (Exception var15) {
            }
            field46 = null;
            class3.field79 = null;
            this.method191(true, "download");
            return true;
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(IB)V", line = 1329)
    private final void method11(int arg0, byte arg1) {
        this.method22(class32.method184((byte) 122, new class35[] { class27.field308, class33.field407[class16.field191], class33.field410 }), 230, this.field17, this.field49, 18, 170, arg0, 483, -99);
        if (arg1 != -97) {
            this.field22 = null;
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "e", descriptor = "(I)V", line = 1351)
    public final void method12(int arg0) {
        class5.method37(false);
        method23(76, class27.field306);
        class26.method149(class27.field306, -5);
        class23.field266 = class36.field442;
        this.field22 = class32.field398;
        if (arg0 < 59) {
            this.field30 = -101;
        }
        this.field40 = class8.method55((byte) -126);
        this.field2 = class36.method228(0, 30);
    }

    @OriginalMember(owner = "mapview!mapview", name = "i", descriptor = "(I)V", line = 1397)
    public static void method13(int arg0) {
        field37 = null;
        if (arg0 >= -97) {
            field5 = -55;
        }
        field52 = null;
        field46 = null;
    }

    @OriginalMember(owner = "mapview!mapview", name = "d", descriptor = "(B)V", line = 1429)
    private final void method14(byte arg0) {
        if (arg0 < 65) {
            this.method21(119);
        }
        if (class24.field276.length == 1) {
            class3.field75 = 0;
        } else {
            if (class16.field191 >= 0) {
                class3.field75 = class16.field191;
            } else {
                class3.field75 = this.method4(class3.field75, true);
            }
            class16.field191 = this.method4(class3.field75, true);
        }
        this.method17(class3.field75, -125);
    }

    @OriginalMember(owner = "mapview!mapview", name = "init", descriptor = "()V", line = 1462)
    public final void init() {
        if (this.method194(596)) {
            this.method198(635, 503, 0, 32, class6.field105.method212(this, (byte) 28).method219((byte) -33));
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(II)I", line = 1472)
    public static int method15(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "mapview!mapview", name = "d", descriptor = "(I)V", line = 1485)
    public final void method16(int arg0) {
        if (arg0 != 16098) {
            this.field43 = -123;
        }
        class32.method190((byte) -56);
        class15.method94((byte) -19);
        try {
            this.field51 = null;
            this.field19 = null;
            this.field34 = null;
            class34.field423 = null;
            this.field41 = null;
            this.field36 = null;
            this.field40 = null;
            this.field13 = null;
            System.gc();
        } catch (Throwable var3) {
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "b", descriptor = "(II)V", line = 1529)
    private final void method17(int arg0, int arg1) {
        if (class24.field276.length > arg0) {
            class26 var3 = class24.field276[arg0];
            class18 var4 = new class18(var3.method180(class18.field208, (byte) -100, class18.field209));
            var4.method114(-1);
            class18 var5 = new class18(var3.method180(class30.field334, (byte) -122, class18.field209));
            this.field10 = var5.method113((byte) -82);
            for (int var6 = 0; var6 < this.field10; var6++) {
                this.field36[var6] = var5.method114(-1);
                this.field13[var6] = var5.method113((byte) -10);
                this.field41[var6] = var5.method113((byte) 124);
                this.field19[var6] = var5.method110(117);
                class35 var7 = this.field36[var6].method205((byte) 120, 47, 32);
                int var8 = this.field51.method144(var7);
                if (var8 > this.field39) {
                    this.field39 = var8;
                }
            }
            class34.field423 = new class5();
            class34.field423.method48(class24.field276[arg0], true);
            this.field11 = 180;
            this.field7 = class31.field374 * this.field11 / class33.field408;
            this.field23 = 635 - this.field7 - 5;
            class35.field435 = class5.field91;
            this.field35 = 503 - this.field11 - 20;
            class15.field181 = class19.field225;
            this.field34 = new class22(this.field7, this.field11);
            this.field34.method130();
            this.method9(class31.field374, class33.field408, 0, 0, 117, this.field7, 0, this.field11, 0);
            class37.method239(0, 0, this.field7, this.field11, 0);
            class37.method239(1, 1, this.field7 - 2, this.field11 + -2, this.field17);
            class6.field107.method231((byte) -96);
        }
        if (arg1 > -102) {
            this.method4(12, false);
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "c", descriptor = "(II)Lt;", line = 1604)
    private static final class35 method18(int arg0, int arg1) {
        return arg0 == 10 ? class31.method179((byte) 113, arg1, false, 10) : (class35) null;
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(ZLjava/lang/String;[B)V", line = 1617)
    private final void method19(boolean arg0, String arg1, byte[] arg2) throws IOException {
        FileOutputStream var4 = new FileOutputStream(arg1);
        if (arg0) {
            this.method7(71);
        }
        var4.write(arg2, 0, arg2.length);
        var4.close();
    }

    @OriginalMember(owner = "mapview!mapview", name = "f", descriptor = "(I)V", line = 1637)
    public final void method20(int arg0) {
        method13(arg0 ^ 0xFFFFFDEA);
        class2.method25((byte) 127);
        class35.method206((byte) -33);
        class8.method56(17);
        class32.method185((byte) -84);
        class18.method106((byte) -92);
        class33.method196((byte) -115);
        class27.method154(6162);
        class36.method230(true);
        class26.method150(-33554433);
        class5.method32(-887730448);
        class25.method142();
        class28.method159();
        class17.method101((byte) -124);
        class19.method118(0);
        class31.method181(false);
        class16.method97(1);
        class37.method243();
        class6.method49(0);
        class13.method88((byte) -30);
        class29.method166((byte) 72);
        class7.method54((byte) -89);
        class24.method136(true);
        class15.method91(false);
        class34.method200((byte) -47);
        class23.method132(-104);
        class11.method78(83);
        class21.method126((byte) 30);
        class3.method26(arg0 - 380);
        class9.method64();
        class30.method169((byte) 97);
        this.field50 = null;
        this.field13 = null;
        this.field36 = null;
        this.field40 = null;
        this.field6 = null;
        this.field56 = null;
        this.field21 = null;
        this.field2 = null;
        this.field27 = null;
        if (arg0 != 635) {
            this.field27 = null;
        }
        this.field54 = null;
        this.field22 = null;
        this.field41 = null;
        this.field34 = null;
        this.field19 = null;
        this.field51 = null;
        this.field24 = null;
        this.field32 = null;
    }

    @OriginalMember(owner = "mapview!mapview", name = "j", descriptor = "(I)Z", line = 1697)
    private final boolean method21(int arg0) {
        if (class27.field314 == 0) {
            this.method7(-116);
            class27.field314 = 1;
        }
        if (class27.field314 == 1) {
            class3.field74 = 25;
            boolean var2 = this.method2(class18.field212, "main_file_cache.idx0", (byte) 72);
            if (!var2) {
                return false;
            }
            class6.field103 = class21.field244;
            class21.field244 = null;
            if (class6.field103 == null) {
                throw new RuntimeException("T1");
            }
            class27.field314 = 2;
        }
        if (class27.field314 == 2) {
            class27.field314 = 10;
            class24.field276 = new class26[1];
        }
        if (class27.field314 == 10) {
            class3.field74 = 50;
            boolean var3 = this.method2(class19.field222, "main_file_cache.dat0", (byte) 116);
            if (!var3) {
                return false;
            }
            class24.field276[0] = class21.field244;
            class21.field244 = null;
            if (class24.field276[0] == null) {
                throw new RuntimeException("T2");
            }
            class27.field314 = 20;
        }
        if (arg0 != -2664) {
            this.field7 = 110;
        }
        if (class27.field314 != 20) {
            return false;
        }
        class18.field213 = class6.method50(class6.field103, class15.field178, (byte) 18, class8.field132);
        class29.field328 = class5.method46(class33.field420, class8.field132, 405, class6.field103);
        this.field51 = class31.method174(true, class6.field103, class7.field121, class8.field132);
        this.field24 = new class28(11, true, this);
        this.field32 = new class28(12, true, this);
        this.field56 = new class28(14, true, this);
        this.field27 = new class28(17, true, this);
        this.field21 = new class28(19, true, this);
        this.field6 = new class28(22, true, this);
        this.field50 = new class28(26, true, this);
        this.field54 = new class28(30, true, this);
        class23.field266 = class29.field329;
        class3.field74 = 100;
        class32.method182(class23.field266, class3.field74, null, -18);
        this.method14((byte) 127);
        return true;
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(Lt;IIIIIIII)V", line = 1817)
    private final void method22(class35 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class37.method239(arg5, arg7, arg1, arg4, 0);
        int var12 = arg5 + 1;
        int var11 = arg4 - 2;
        int var13 = arg7 + 1;
        int var10 = arg1 - 2;
        if (arg8 >= -94) {
            return;
        }
        class37.method242(var12, var13, var10, var11, arg6);
        class37.method237(var12, var13, var10, arg2);
        class37.method235(var12, var13, var11, arg2);
        class37.method237(var12, var11 + var13 - 1, var10, arg3);
        class37.method235(var10 + var12 - 1, var13, var11, arg3);
        this.field51.method143(arg0, var10 / 2 + var12 + 1, var13 - -(var11 / 2) + 1 + 4, 0);
        this.field51.method143(arg0, var10 / 2 + var12, var11 / 2 + var13 + 4, 16777215);
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(ILjava/awt/Component;)V", line = 1873)
    private static final void method23(int arg0, Component arg1) {
        Method var2 = class10.field149;
        if (var2 != null) {
            try {
                var2.invoke(arg1, Boolean.FALSE);
            } catch (Throwable var4) {
            }
        }
        arg1.addKeyListener(class26.field302);
        if (arg0 < 73) {
            method13(111);
        }
        arg1.addFocusListener(class26.field302);
    }
}
