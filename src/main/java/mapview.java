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
public class mapview extends class31 {

    @OriginalMember(owner = "mapview!mapview", name = "h", descriptor = "I")
    private int field1 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "p", descriptor = "I")
    private int field9 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "m", descriptor = "I")
    private int field6 = 8943445;

    @OriginalMember(owner = "mapview!mapview", name = "l", descriptor = "I")
    private int field5 = 450;

    @OriginalMember(owner = "mapview!mapview", name = "z", descriptor = "D")
    private double field19 = 4.0D;

    @OriginalMember(owner = "mapview!mapview", name = "t", descriptor = "I")
    private int field13 = 7824964;

    @OriginalMember(owner = "mapview!mapview", name = "G", descriptor = "I")
    private int field26 = 18;

    @OriginalMember(owner = "mapview!mapview", name = "E", descriptor = "I")
    private int field24 = -1;

    @OriginalMember(owner = "mapview!mapview", name = "y", descriptor = "Z")
    private boolean field18 = false;

    @OriginalMember(owner = "mapview!mapview", name = "H", descriptor = "Z")
    private boolean field27 = false;

    @OriginalMember(owner = "mapview!mapview", name = "Z", descriptor = "I")
    private int field45 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "I", descriptor = "I")
    private int field28 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "V", descriptor = "I")
    private int field41 = 33;

    @OriginalMember(owner = "mapview!mapview", name = "hb", descriptor = "I")
    private int field53 = 5;

    @OriginalMember(owner = "mapview!mapview", name = "v", descriptor = "I")
    private int field15 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "B", descriptor = "I")
    private int field21 = -1;

    @OriginalMember(owner = "mapview!mapview", name = "W", descriptor = "D")
    private double field42 = 4.0D;

    @OriginalMember(owner = "mapview!mapview", name = "n", descriptor = "I")
    private int field7 = 10027008;

    @OriginalMember(owner = "mapview!mapview", name = "db", descriptor = "I")
    private int field49 = 11141120;

    @OriginalMember(owner = "mapview!mapview", name = "ab", descriptor = "Z")
    private boolean field46 = false;

    @OriginalMember(owner = "mapview!mapview", name = "ib", descriptor = "I")
    private int field54 = 5;

    @OriginalMember(owner = "mapview!mapview", name = "O", descriptor = "I")
    private int field34 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "pb", descriptor = "I")
    private int field61 = -1;

    @OriginalMember(owner = "mapview!mapview", name = "S", descriptor = "Z")
    private boolean field38 = true;

    @OriginalMember(owner = "mapview!mapview", name = "ob", descriptor = "I")
    private int field60 = 8912896;

    @OriginalMember(owner = "mapview!mapview", name = "fb", descriptor = "I")
    private int field51 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "mb", descriptor = "I")
    private int field58 = 40;

    @OriginalMember(owner = "mapview!mapview", name = "K", descriptor = "I")
    private int field30 = 5;

    @OriginalMember(owner = "mapview!mapview", name = "kb", descriptor = "I")
    private int field56 = 6706483;

    @OriginalMember(owner = "mapview!mapview", name = "x", descriptor = "I")
    private int field17 = 500;

    @OriginalMember(owner = "mapview!mapview", name = "nb", descriptor = "[I")
    private int[] field59 = new int[this.field17];

    @OriginalMember(owner = "mapview!mapview", name = "P", descriptor = "[I")
    private int[] field35 = new int[this.field17];

    @OriginalMember(owner = "mapview!mapview", name = "R", descriptor = "[I")
    private int[] field37 = new int[this.field17];

    @OriginalMember(owner = "mapview!mapview", name = "tb", descriptor = "I")
    private int field65 = 140;

    @OriginalMember(owner = "mapview!mapview", name = "cb", descriptor = "I")
    private int field48 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "j", descriptor = "[Lj;")
    private class17[] field3 = new class17[this.field17];

    @OriginalMember(owner = "mapview!mapview", name = "k", descriptor = "Lj;")
    public static class17 field4 = class30.method190(-127, "null");

    @OriginalMember(owner = "mapview!mapview", name = "A", descriptor = "Lj;")
    private static class17 field20 = class30.method190(-100, "???");

    @OriginalMember(owner = "mapview!mapview", name = "J", descriptor = "Lj;")
    public static class17 field29 = class30.method190(-120, "Gem Shop");

    @OriginalMember(owner = "mapview!mapview", name = "lb", descriptor = "Lj;")
    public static class17 field57 = class30.method190(-113, "Hunter Training");

    @OriginalMember(owner = "mapview!mapview", name = "gb", descriptor = "I")
    private static int field52 = -1;

    @OriginalMember(owner = "mapview!mapview", name = "r", descriptor = "I")
    private int field11;

    @OriginalMember(owner = "mapview!mapview", name = "w", descriptor = "I")
    private int field16;

    @OriginalMember(owner = "mapview!mapview", name = "D", descriptor = "I")
    public static int field23;

    @OriginalMember(owner = "mapview!mapview", name = "F", descriptor = "I")
    private static int field25;

    @OriginalMember(owner = "mapview!mapview", name = "T", descriptor = "I")
    private int field39;

    @OriginalMember(owner = "mapview!mapview", name = "Y", descriptor = "I")
    private int field44;

    @OriginalMember(owner = "mapview!mapview", name = "bb", descriptor = "I")
    private int field47;

    @OriginalMember(owner = "mapview!mapview", name = "eb", descriptor = "I")
    private int field50;

    @OriginalMember(owner = "mapview!mapview", name = "o", descriptor = "I")
    private int field8;

    @OriginalMember(owner = "mapview!mapview", name = "N", descriptor = "Lfa;")
    private class10 field33;

    @OriginalMember(owner = "mapview!mapview", name = "C", descriptor = "Lj;")
    private class17 field22;

    @OriginalMember(owner = "mapview!mapview", name = "rb", descriptor = "Lj;")
    private class17 field63;

    @OriginalMember(owner = "mapview!mapview", name = "jb", descriptor = "Lla;")
    private class22 field55;

    @OriginalMember(owner = "mapview!mapview", name = "q", descriptor = "Lc;")
    private class5 field10;

    @OriginalMember(owner = "mapview!mapview", name = "s", descriptor = "Lc;")
    private class5 field12;

    @OriginalMember(owner = "mapview!mapview", name = "u", descriptor = "Lc;")
    private class5 field14;

    @OriginalMember(owner = "mapview!mapview", name = "L", descriptor = "Lc;")
    private class5 field31;

    @OriginalMember(owner = "mapview!mapview", name = "M", descriptor = "Lc;")
    private class5 field32;

    @OriginalMember(owner = "mapview!mapview", name = "U", descriptor = "Lc;")
    private class5 field40;

    @OriginalMember(owner = "mapview!mapview", name = "qb", descriptor = "Lc;")
    private class5 field62;

    @OriginalMember(owner = "mapview!mapview", name = "sb", descriptor = "Lc;")
    private class5 field64;

    @OriginalMember(owner = "mapview!mapview", name = "ub", descriptor = "Z")
    public static boolean field66;

    @OriginalMember(owner = "mapview!mapview", name = "i", descriptor = "[I")
    public static int[] field2;

    @OriginalMember(owner = "mapview!mapview", name = "X", descriptor = "[Lj;")
    private class17[] field43;

    @OriginalMember(owner = "mapview!mapview", name = "Q", descriptor = "[[Loa;")
    public static class28[][] field36;

    @OriginalMember(owner = "mapview!mapview", name = "j", descriptor = "(I)V", line = 5)
    private final void method1(int arg0) {
        if (class8.field188.length == 1) {
            class33.field413 = 0;
        } else {
            if (class35.field444 < 0) {
                class33.field413 = this.method7(class33.field413, 20);
            } else {
                class33.field413 = class35.field444;
            }
            class35.field444 = this.method7(class33.field413, 20);
        }
        if (arg0 != -504) {
            this.method16(-93);
        }
        this.method4(class33.field413, (byte) -128);
    }

    @OriginalMember(owner = "mapview!mapview", name = "k", descriptor = "(I)V", line = 38)
    public static void method2(int arg0) {
        field29 = null;
        field2 = null;
        field4 = null;
        field36 = null;
        field57 = null;
        field20 = null;
        if (arg0 != -6639) {
            method2(78);
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "c", descriptor = "(I)V", line = 55)
    public final void method3(int arg0) {
        if (class24.field317) {
            class1.method21(class33.field411, -18);
            class17.method119(class33.field411, 126);
            this.method197(2641);
            class33.method209((byte) -35, class33.field411);
            class15.method104((byte) 58, class33.field411);
        }
        class34.method226(0);
        class4.method46((byte) 111);
        if (!class23.field308) {
            return;
        }
        if (class33.field420[96]) {
            field52 = -1;
            this.field38 = true;
            class1.field76 = (int) ((double) class1.field76 - 16.0D / this.field19);
        }
        if (class33.field420[97]) {
            field52 = -1;
            this.field38 = true;
            class1.field76 = (int) (16.0D / this.field19 + (double) class1.field76);
        }
        if (class33.field420[98]) {
            class4.field102 = (int) ((double) class4.field102 - 16.0D / this.field19);
            field52 = -1;
            this.field38 = true;
        }
        if (class33.field420[99]) {
            this.field38 = true;
            field52 = -1;
            class4.field102 = (int) (16.0D / this.field19 + (double) class4.field102);
        }
        while (true) {
            while (true) {
                while (true) {
                    while (class15.method105(-1)) {
                        if (!class4.field99 || !class28.field370) {
                            if (class24.field316 == 102) {
                                class28.field370 = true;
                                this.field38 = true;
                            }
                            if (class24.field316 == 49) {
                                this.field38 = true;
                                this.field42 = 3.0D;
                            }
                            if (class24.field316 == 50) {
                                this.field38 = true;
                                this.field42 = 4.0D;
                            }
                            if (class24.field316 == 51) {
                                this.field38 = true;
                                this.field42 = 6.0D;
                            }
                            if (class24.field316 == 52) {
                                this.field38 = true;
                                this.field42 = 8.0D;
                            }
                            if (class24.field316 == 107 || class24.field316 == 75) {
                                this.field38 = true;
                                this.field27 = !this.field27;
                            }
                            if (class24.field316 == 111 || class24.field316 == 79) {
                                this.field46 = !this.field46;
                                this.field38 = true;
                            }
                        } else if (class24.field323 == 0) {
                            class28.field370 = false;
                            this.field38 = true;
                            this.field63.method128(0, -1);
                            class24.field311 = -1;
                        } else if (class24.field323 == 84) {
                            class28.field370 = false;
                            this.field16 = class4.field102 << 16;
                            this.field50 = class1.field76 << 16;
                            field52 = class24.field311;
                            this.field63.method128(0, -1);
                            class24.field311 = -1;
                            this.field38 = true;
                        } else {
                            boolean var2 = false;
                            if (class24.field323 == 85) {
                                if (this.field63.method118((byte) -35) > 0) {
                                    this.field63.method128(this.field63.method118((byte) -35) - 1, -1);
                                    this.field38 = true;
                                    if (this.field63.method118((byte) -35) == 0) {
                                        class24.field311 = -1;
                                    } else {
                                        var2 = true;
                                    }
                                }
                            } else if (class24.field316 != -1 && this.field63.method118((byte) -35) <= class6.field123) {
                                this.field63.method135(0, class24.field316);
                                this.field38 = true;
                            }
                            if (this.field63.method118((byte) -35) > 0) {
                                for (int var3 = 0; var3 < this.field48; var3++) {
                                    if (this.field3[var3].method118((byte) -35) >= this.field63.method118((byte) -35)) {
                                        class17 var4 = this.field63.method133(32);
                                        class17 var5 = this.field3[var3].method130(0, 47, 32).method116(this.field63.method118((byte) -35), 0, -115).method133(32);
                                        if (var4.method127(-24506, var5) == 0) {
                                            var2 = true;
                                            class24.field311 = var3;
                                            this.field38 = true;
                                            break;
                                        }
                                    }
                                }
                                if (!var2) {
                                    this.field63.method128(this.field63.method118((byte) -35) - 1, -1);
                                }
                            }
                        }
                    }
                    int var6 = class2.field85;
                    int var7 = class35.field446;
                    int var8 = class20.field285;
                    int var9 = class4.field115;
                    int var10 = class32.field407;
                    int var11 = class23.field299;
                    if (var7 == 1) {
                        this.field45 = class4.field102;
                        this.field34 = var8;
                        this.field28 = class1.field76;
                        this.field15 = var6;
                        if (class8.field188.length == 1) {
                            if (var6 > 170 && var6 < 220 && var8 > 471 && var8 < 503) {
                                this.field42 = 3.0D;
                                this.field15 = -1;
                            }
                            if (var6 > 230 && var6 < 280 && var8 > 471 && var8 < 503) {
                                this.field42 = 4.0D;
                                this.field15 = -1;
                            }
                            if (var6 > 290 && var6 < 340 && var8 > 471 && var8 < 503) {
                                this.field42 = 6.0D;
                                this.field15 = -1;
                            }
                            if (var6 > 350 && var6 < 400 && var8 > 471 && var8 < 503) {
                                this.field15 = -1;
                                this.field42 = 8.0D;
                            }
                        } else {
                            if (var6 > 170 && var6 < 220 && var8 > 451 && var8 < 483) {
                                this.field15 = -1;
                                this.field42 = 3.0D;
                            }
                            if (var6 > 230 && var6 < 280 && var8 > 451 && var8 < 483) {
                                this.field15 = -1;
                                this.field42 = 4.0D;
                            }
                            if (var6 > 290 && var6 < 340 && var8 > 451 && var8 < 483) {
                                this.field42 = 6.0D;
                                this.field15 = -1;
                            }
                            if (var6 > 350 && var6 < 400 && var8 > 451 && var8 < 483) {
                                this.field15 = -1;
                                this.field42 = 8.0D;
                            }
                            if (var6 > 170 && var6 < 400 && var8 > 483 && var8 < 503) {
                                this.method5(this.field7, 483);
                                this.method9((byte) -115);
                                this.method1(-504);
                                this.field15 = -1;
                            }
                        }
                        this.field38 = true;
                        this.field18 = false;
                        if (var6 > this.field53 && var8 > this.field5 + this.field41 && this.field53 + this.field65 > var6 && var8 < 503) {
                            this.field15 = -1;
                            this.field27 = !this.field27;
                        }
                        if (var6 > this.field39 && this.field47 + this.field8 < var8 && this.field39 + this.field11 > var6 && var8 < 503) {
                            this.field15 = -1;
                            this.field46 = !this.field46;
                        }
                        if (this.field27) {
                            if (this.field53 < var6 && var8 > this.field41 && this.field65 + this.field53 > var6 && var8 < this.field5 + this.field41) {
                                this.field15 = -1;
                            }
                            if (var6 > this.field53 && this.field41 < var8 && this.field65 + this.field53 > var6 && var8 < this.field41 + 18 && this.field1 > 0) {
                                this.field1 -= 24;
                            }
                            if (var6 > this.field53 && var8 > this.field41 + this.field5 - 18 && var6 < this.field65 + this.field53 && var8 < this.field5 + this.field41 && this.field1 < 48) {
                                this.field1 += 24;
                            }
                        }
                        if (this.field46 && var6 > this.field39 && var8 > this.field47 && this.field39 + this.field11 > var6 && this.field8 + this.field47 > var8) {
                            this.field15 = -1;
                            class1.field76 = (var6 - this.field39) * class23.field300 / this.field11;
                            class4.field102 = (var8 - this.field47) * class3.field90 / this.field8;
                            this.field18 = true;
                        }
                        if (class4.field99 && !class28.field370 && !this.field18 && this.field30 < var6 && var8 > this.field54 && this.field30 + this.field58 > var6 && this.field54 + this.field26 > var8) {
                            class28.field370 = true;
                        }
                    }
                    if (this.field27) {
                        this.field21 = -1;
                        if (this.field53 < var10 && var10 < this.field65 + this.field53) {
                            int var12 = this.field41 + 21 + 5;
                            int var13 = this.field9;
                            for (int var14 = 0; var14 < 24; var14++) {
                                if (var13 < this.field43.length && this.field43[var13].method134(field20, true)) {
                                    var14--;
                                    var13++;
                                } else {
                                    if (var11 >= var12 && var11 < var12 + 17) {
                                        this.field21 = var13;
                                        if (var7 == 1) {
                                            this.field24 = var13;
                                            this.field51 = 50;
                                        }
                                    }
                                    var12 += 17;
                                    var13++;
                                }
                            }
                        }
                        if (this.field61 != this.field21) {
                            this.field38 = true;
                            this.field61 = this.field21;
                        }
                    }
                    if (var9 == 1 && this.field46 && this.field18) {
                        int var15 = var10;
                        this.field38 = true;
                        field52 = -1;
                        if (var10 < this.field39) {
                            var15 = this.field39;
                        } else if (var10 > this.field39 + this.field11) {
                            var15 = this.field39 + this.field11;
                        }
                        class1.field76 = (var15 - this.field39) * class23.field300 / this.field11;
                        int var16 = var11;
                        if (var11 < this.field47) {
                            var16 = this.field47;
                        } else if (var11 > this.field8 + this.field47) {
                            var16 = this.field47 + this.field8;
                        }
                        class4.field102 = (var16 - this.field47) * class3.field90 / this.field8;
                    } else {
                        this.field18 = false;
                    }
                    if (var9 == 1 && this.field15 != -1) {
                        this.field38 = true;
                        class4.field102 = (int) ((double) (this.field34 - var11) * 2.0D / this.field42) + this.field45;
                        field52 = -1;
                        class1.field76 = (int) ((double) (this.field15 - var10) * 2.0D / this.field42) + this.field28;
                    }
                    if (this.field42 > this.field19) {
                        this.field38 = true;
                        this.field19 += this.field19 / 30.0D;
                        if (this.field19 > this.field42) {
                            this.field19 = this.field42;
                        }
                    }
                    if (this.field19 > this.field42) {
                        this.field38 = true;
                        this.field19 -= this.field19 / 30.0D;
                        if (this.field42 > this.field19) {
                            this.field19 = this.field42;
                        }
                    }
                    if (this.field9 < this.field1) {
                        this.field38 = true;
                        this.field9++;
                    }
                    if (this.field1 < this.field9) {
                        this.field38 = true;
                        this.field9--;
                    }
                    if (arg0 < 110) {
                        this.field51 = -23;
                    }
                    if (this.field51 > 0) {
                        this.field51--;
                        this.field38 = true;
                    }
                    if (field52 >= 0) {
                        byte var17 = 4;
                        class3.field92 = this.field59[field52] - class26.field337;
                        class32.field401 = field23 + class3.field90 - this.field35[field52];
                        int var18 = class3.field92 - (int) (635.0D / this.field19);
                        int var19 = class32.field401 - (int) (503.0D / this.field19);
                        int var20 = class32.field401 + (int) (503.0D / this.field19);
                        this.field38 = true;
                        int var21 = class3.field92 + (int) (635.0D / this.field19);
                        if (var18 < 48) {
                            class3.field92 = (int) (635.0D / this.field19) + 48;
                        }
                        if (var21 > class23.field300 - 48) {
                            class3.field92 = class23.field300 - (int) (635.0D / this.field19) - 48;
                        }
                        if (var19 < 48) {
                            class32.field401 = (int) (503.0D / this.field19) + 48;
                        }
                        class3.field92 <<= 0x10;
                        int var22 = class3.field92 - this.field50;
                        if (var20 > class3.field90 - 48) {
                            class32.field401 = class3.field90 - (int) (503.0D / this.field19) - 48;
                        }
                        class32.field401 <<= 0x10;
                        int var23 = class32.field401 - this.field16;
                        if (var22 >> var17 == 0 && var23 >> var17 == 0) {
                            field52 = -1;
                        } else {
                            this.field50 += var22 >> var17;
                            class1.field76 = this.field50 >> 16;
                            this.field16 += var23 >> var17;
                            class4.field102 = this.field16 >> 16;
                        }
                    }
                    int var24 = class1.field76 - (int) (635.0D / this.field19);
                    int var25 = class4.field102 - (int) (503.0D / this.field19);
                    int var26 = (int) (635.0D / this.field19) + class1.field76;
                    if (var24 < 48) {
                        class1.field76 = (int) (635.0D / this.field19) + 48;
                    }
                    if (var26 > class23.field300 - 48) {
                        class1.field76 = class23.field300 - (int) (635.0D / this.field19) - 48;
                    }
                    int var27 = (int) (503.0D / this.field19) + class4.field102;
                    if (var25 < 48) {
                        class4.field102 = (int) (503.0D / this.field19) + 48;
                    }
                    if (var27 > class3.field90 - 48) {
                        class4.field102 = class3.field90 - (int) (503.0D / this.field19) - 48;
                    }
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(IB)V", line = 607)
    private final void method4(int arg0, byte arg1) {
        if (class8.field188.length > arg0) {
            class12 var3 = class8.field188[arg0];
            class33 var4 = new class33(var3.method230(10646, class20.field286, class16.field255));
            var4.method221(-598525000);
            class33 var5 = new class33(var3.method230(10646, class20.field290, class16.field255));
            this.field48 = var5.method218(810291624);
            for (int var6 = 0; var6 < this.field48; var6++) {
                this.field3[var6] = var5.method221(-598525000);
                this.field59[var6] = var5.method218(810291624);
                this.field35[var6] = var5.method218(810291624);
                this.field37[var6] = var5.method212(-25);
                class17 var7 = this.field3[var6].method130(0, 47, 32);
                int var8 = this.field33.method94(var7);
                if (var8 > this.field44) {
                    this.field44 = var8;
                }
            }
            class11.field222 = new class4();
            class11.field222.method43(class8.field188[arg0], true);
            this.field8 = 180;
            this.field11 = class23.field300 * this.field8 / class3.field90;
            this.field39 = 635 - this.field11 - 5;
            this.field47 = 503 - this.field8 - 20;
            class4.field102 = class20.field287;
            class1.field76 = class16.field253;
            this.field55 = new class22(this.field11, this.field8);
            this.field55.method152();
            this.method13(0, this.field8, class23.field300, 15448, class3.field90, 0, 0, this.field11, 0);
            class25.method167(0, 0, this.field11, this.field8, 0);
            class25.method167(1, 1, this.field11 - 2, this.field8 + -2, this.field6);
            class26.field333.method63(108);
        }
        int var9 = 112 % ((-arg1 - 56) / 51);
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(II)V", line = 668)
    private final void method5(int arg0, int arg1) {
        this.method17(230, 170, true, this.field6, arg1, this.field56, 18, class23.method156(-2969, new class17[] { class27.field360, class20.field292[class35.field444], class33.field409 }), arg0);
    }

    @OriginalMember(owner = "mapview!mapview", name = "b", descriptor = "(Ljava/lang/String;I)[B", line = 679)
    private final byte[] method6(String arg0, int arg1) throws IOException {
        File var3 = new File(arg0);
        if (!var3.exists()) {
            return null;
        }
        if (arg1 != 2) {
            this.field8 = 50;
        }
        int var4 = (int) var3.length();
        DataInputStream var5 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg0)));
        byte[] var6 = new byte[var4];
        var5.readFully(var6, 0, var4);
        var5.close();
        return var6;
    }

    @OriginalMember(owner = "mapview!mapview", name = "init", descriptor = "()V", line = 715)
    public final void init() {
        if (this.method199(false)) {
            this.method195((byte) -62, 32, class12.field233.method123(0, this).method114(-107), 635, 503);
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "b", descriptor = "(II)I", line = 738)
    private final int method7(int arg0, int arg1) {
        arg0++;
        if (arg0 >= class8.field188.length) {
            arg0 = 0;
        }
        return arg1 == 20 ? arg0 : -100;
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(Lj;Ljava/lang/String;I)Z", line = 771)
    private final boolean method8(class17 arg0, String arg1, int arg2) {
        if (arg2 > -123) {
            this.field27 = true;
        }
        byte[] var4 = null;
        if (!class34.field438) {
            if (class32.field398 != null) {
                try {
                    var4 = this.method6(class32.field398 + "/" + arg1, 2);
                    if (!this.method18(arg1, var4, (byte) -121)) {
                        var4 = null;
                    }
                    if (var4 != null) {
                        class32.field406 = new class12(var4, false, true);
                        return true;
                    }
                } catch (IOException var11) {
                    var4 = null;
                }
            }
            class34.field438 = true;
        }
        if (var4 == null) {
            boolean var6 = this.method12(arg0, arg1, (byte) -96);
            if (!var6) {
                return false;
            }
            var4 = class24.field320;
            class24.field320 = null;
        }
        if (var4 == null) {
            class34.field438 = false;
            return true;
        }
        if (class32.field398 != null && var4 != null) {
            try {
                this.method15(var4, true, class32.field398 + "/" + arg1);
            } catch (IOException var10) {
            }
        }
        try {
            class32.field406 = new class12(var4, false, true);
            class34.field438 = false;
            return true;
        } catch (IOException var9) {
            throw class24.method163(var9, "monkey feet");
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "c", descriptor = "(B)V", line = 842)
    private final void method9(byte arg0) {
        class28.field369 = false;
        try {
            Graphics var2 = class33.field411.getGraphics();
            class26.field333.method62(0, 0, 50, var2);
            if (arg0 >= -63) {
                this.method16(111);
            }
        } catch (Exception var4) {
            class33.field411.repaint();
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "d", descriptor = "(B)V", line = 877)
    private final void method10(byte arg0) {
        String var3;
        try {
            if (arg0 >= -127) {
                this.method14(-110);
            }
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
                        class32.field398 = var8 + var5 + "/rsmap/";
                        return;
                    }
                }
            } catch (Exception var14) {
            }
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "h", descriptor = "(I)V", line = 953)
    public final void method11(int arg0) {
        class29.method187(1);
        class29.method188(0);
        if (arg0 != -1) {
            field29 = null;
        }
        try {
            this.field55 = null;
            this.field43 = null;
            this.field59 = null;
            this.field33 = null;
            this.field35 = null;
            this.field37 = null;
            class11.field222 = null;
            this.field3 = null;
            System.gc();
        } catch (Throwable var3) {
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(Lj;Ljava/lang/String;B)Z", line = 982)
    private final boolean method12(class17 arg0, String arg1, byte arg2) {
        try {
            if (class8.field191 == null) {
                class29.field376 = class23.method156(-2969, new class17[] { class27.field357, arg0 });
                String var4;
                if (arg1 == "main_file_cache.dat0") {
                    var4 = "worldmap.main.js5?crc=1016339127";
                } else if (arg1 == "main_file_cache.dat1") {
                    var4 = "worldmap.dungeon.js5?crc=1454234598";
                } else if (arg1 == "main_file_cache.dat2") {
                    var4 = "worldmap.extra.js5?crc=-1631176625";
                } else {
                    var4 = "mapview.sprites.js5?crc=-1837203931";
                }
                class8.field191 = new DataInputStream((new URL(this.getCodeBase(), var4)).openStream());
                int var5;
                if (arg1 == "main_file_cache.dat0") {
                    var5 = 403856;
                } else if (arg1 == "main_file_cache.dat1") {
                    var5 = 143997;
                } else if (arg1 == "main_file_cache.dat2") {
                    var5 = 109447;
                } else {
                    var5 = 8200;
                }
                field25 = 0;
                class6.field127 = 0;
                class24.field320 = new byte[var5];
            }
            int var6 = class6.field127;
            int var7 = class24.field320.length;
            if (var7 <= var6) {
                class8.field191.close();
                if (arg2 != -96) {
                    return true;
                }
                class8.field191 = null;
                if (!this.method18(arg1, class24.field320, (byte) 33)) {
                    this.method200("download", 50);
                    class24.field320 = null;
                }
                return true;
            }
            field25++;
            if (field25 >= 1500) {
                throw new IOException();
            }
            DataInputStream var8 = class8.field191;
            int var9 = var8.available();
            if (var9 < 0) {
                throw new EOFException();
            } else if (var9 == 0) {
                return false;
            } else {
                if (var9 > var7 - var6) {
                    var9 = var7 - var6;
                }
                int var10 = var8.read(class24.field320, var6, var9);
                if (var10 < 0) {
                    throw new EOFException();
                } else if (var10 == 0) {
                    return false;
                } else {
                    field25 = 0;
                    int var11 = var6 + var10;
                    int var12 = var11 * 100 / var7;
                    class29.field376 = class23.method156(-2969, new class17[] { class1.field71, arg0, class26.field348, class34.method228(arg2 + 106, var12), class17.field269 });
                    class6.field127 = var11;
                    return false;
                }
            }
        } catch (IOException var16) {
            try {
                class8.field191.close();
            } catch (Exception var15) {
            }
            class24.field320 = null;
            class8.field191 = null;
            this.method200("download", 50);
            return true;
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(IIIIIIIII)V", line = 1102)
    private final void method13(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class11.field222.method44(arg2, arg7, arg1, 121, arg0, arg5, arg6, arg4, arg8);
        if (arg7 - arg5 < -arg8 + arg2) {
            return;
        }
        class11.field222.method47(this.field19, arg7, arg4, arg6, arg1, arg0, arg8, arg2, arg3 - 32652, arg5);
        class11.field222.method33(arg2, arg3 - 15571, arg4, arg7, arg1, arg0, arg8, arg6, arg5);
        if (arg3 != 15448) {
            this.field19 = 0.5196672109594787D;
        }
        class11.field222.method50(arg8, arg7, arg5, arg4, arg0, this.field24, this.field51, arg2, arg1, -1, arg6);
        if (this.field42 == this.field19 && class32.field400) {
            for (int var10 = 0; var10 < this.field48; var10++) {
                int var11 = this.field35[var10];
                int var12 = this.field59[var10];
                int var13 = field23 + class3.field90 - var11;
                int var14 = var12 - class26.field337;
                int var15 = (var13 - arg0) * (-arg6 + arg1) / (arg4 - arg0) + arg6;
                int var16 = this.field37[var10];
                int var17 = (arg7 - arg5) * (-arg8 + var14) / (arg2 - arg8) + arg5;
                int var18 = 16777215;
                class5 var19 = null;
                if (var16 == 0) {
                    if (this.field19 == 3.0D) {
                        var19 = this.field64;
                    }
                    if (this.field19 == 4.0D) {
                        var19 = this.field12;
                    }
                    if (this.field19 == 6.0D) {
                        var19 = this.field14;
                    }
                    if (this.field19 == 8.0D) {
                        var19 = this.field62;
                    }
                }
                if (var16 == 1) {
                    if (this.field19 == 3.0D) {
                        var19 = this.field14;
                    }
                    if (this.field19 == 4.0D) {
                        var19 = this.field62;
                    }
                    if (this.field19 == 6.0D) {
                        var19 = this.field31;
                    }
                    if (this.field19 == 8.0D) {
                        var19 = this.field32;
                    }
                }
                if (var16 == 2) {
                    if (this.field19 == 3.0D) {
                        var19 = this.field31;
                    }
                    var18 = 16755200;
                    if (this.field19 == 4.0D) {
                        var19 = this.field32;
                    }
                    if (this.field19 == 6.0D) {
                        var19 = this.field10;
                    }
                    if (this.field19 == 8.0D) {
                        var19 = this.field40;
                    }
                }
                if (var19 != null) {
                    class17 var20 = this.field3[var10];
                    int var21 = 1;
                    for (int var22 = 0; var20.method118((byte) -35) > var22; var22++) {
                        if (var20.method121(arg3 - 28803, var22) == 47) {
                            var21++;
                        }
                    }
                    int var23 = var15 - (var21 - 1) * var19.method53() / 2;
                    int var24 = var23 + var19.method56() / 2;
                    while (true) {
                        int var25 = var20.method131(76, 47);
                        if (var25 == -1) {
                            var19.method54(var20, var17, var24, var18, true);
                            break;
                        }
                        class17 var26 = var20.method116(var25, 0, arg3 - 15550);
                        var19.method54(var26, var17, var24, var18, true);
                        var24 += var19.method53();
                        var20 = var20.method117(var25 + 1, (byte) 111);
                    }
                }
            }
        }
        if (!class23.field303) {
            return;
        }
        for (int var27 = class26.field337 / 64; var27 < (class26.field337 + class23.field300) / 64; var27++) {
            for (int var28 = field23 / 64; var28 < (field23 + class3.field90) / 64; var28++) {
                int var29 = var27 * 64;
                int var30 = var29 - class26.field337;
                int var31 = var28 * 64;
                int var32 = field23 + class3.field90 - var31;
                int var33 = (arg7 - arg5) * (-arg8 + var30) / (arg2 - arg8) + arg5;
                int var34 = arg6 + (var32 - arg0 - 64) * (-arg6 + arg1) / (arg4 - arg0);
                int var35 = (var30 + 64 - arg8) * (-arg5 + arg7) / (arg2 - arg8) + arg5;
                int var36 = (var32 - arg0) * (arg1 - arg6) / (arg4 - arg0) + arg6;
                class25.method167(var33, var34, var35 - var33, -var34 + var36, 16777215);
                this.field33.method88(class23.method156(-2969, new class17[] { class34.method228(10, var27), class28.field373, class34.method228(arg3 ^ 0x3C52, var28) }), var35 - 5, var36 + -5, 16777215);
                if (var27 == 33 && var28 >= 71 && var28 <= 73) {
                    this.field33.method95(class35.field445, (var33 + var35) / 2, (var36 + var34) / 2, 16711680);
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "l", descriptor = "(I)Z", line = 1289)
    private final boolean method14(int arg0) {
        if (class6.field129 == 0) {
            this.method10((byte) -128);
            class6.field129 = 1;
        }
        int var2 = 71 % ((55 - arg0) / 43);
        if (class6.field129 == 1) {
            class4.field107 = 25;
            boolean var3 = this.method8(class18.field275, "main_file_cache.idx0", -127);
            if (!var3) {
                return false;
            }
            class18.field279 = class32.field406;
            class32.field406 = null;
            if (class18.field279 == null) {
                throw new RuntimeException("T1");
            }
            class6.field129 = 2;
        }
        if (class6.field129 == 2) {
            class6.field129 = 10;
            class8.field188 = new class12[1];
        }
        if (class6.field129 == 10) {
            class4.field107 = 50;
            boolean var4 = this.method8(class30.field390, "main_file_cache.dat0", -125);
            if (!var4) {
                return false;
            }
            class8.field188[0] = class32.field406;
            class32.field406 = null;
            if (class8.field188[0] == null) {
                throw new RuntimeException("T2");
            }
            class6.field129 = 20;
        }
        if (class6.field129 != 20) {
            return false;
        }
        class24.field321 = class30.method193(class18.field279, 111, class33.field416, class33.field422);
        class33.field417 = class4.method41(class18.field279, class34.field439, false, class33.field416);
        this.field33 = class13.method101((byte) 120, class33.field416, class17.field265, class18.field279);
        this.field64 = new class5(11, true, this);
        this.field12 = new class5(12, true, this);
        this.field14 = new class5(14, true, this);
        this.field62 = new class5(17, true, this);
        this.field31 = new class5(19, true, this);
        this.field32 = new class5(22, true, this);
        this.field10 = new class5(26, true, this);
        this.field40 = new class5(30, true, this);
        class29.field376 = class24.field310;
        class4.field107 = 100;
        class2.method27(class29.field376, null, -118, class4.field107);
        this.method1(-504);
        return true;
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "([BZLjava/lang/String;)V", line = 1383)
    private final void method15(byte[] arg0, boolean arg1, String arg2) throws IOException {
        FileOutputStream var4 = new FileOutputStream(arg2);
        var4.write(arg0, 0, arg0.length);
        var4.close();
        if (!arg1) {
            this.method10((byte) -90);
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "b", descriptor = "(I)V", line = 1395)
    public final void method16(int arg0) {
        if (!class23.field308) {
            class23.field308 = this.method14(-12);
            class2.method27(class29.field376, null, -51, class4.field107);
            return;
        }
        if (this.field38) {
            class28.field369 = true;
            this.field38 = false;
            class25.method165();
            int var2 = class4.field102 - (int) (503.0D / this.field19);
            int var3 = class1.field76 - (int) (635.0D / this.field19);
            int var4 = (int) (503.0D / this.field19) + class4.field102;
            int var5 = (int) (635.0D / this.field19) + class1.field76;
            this.method13(var2, 503, var5, arg0 ^ 0x3D8F, var4, 0, 0, 635, var3);
            if (this.field46) {
                this.field55.method154(this.field39, this.field47);
                class25.method169(this.field11 * var3 / class23.field300 + this.field39, this.field8 * var2 / class3.field90 + this.field47, (var5 - var3) * this.field11 / class23.field300, (var4 - var2) * this.field8 / class3.field90, 16711680, 128);
                class25.method167(this.field39 + this.field11 * var3 / class23.field300, this.field8 * var2 / class3.field90 + this.field47, (var5 - var3) * this.field11 / class23.field300, (var4 - var2) * this.field8 / class3.field90, 16711680);
                if (this.field51 > 0 && this.field51 % 10 < 5) {
                    for (int var6 = 0; var6 < class30.field387; var6++) {
                        if (class11.field222.field98[var6] == this.field24) {
                            int var7 = this.field39 + class11.field222.field105[var6] * this.field11 / class23.field300;
                            int var8 = class11.field222.field112[var6] * this.field8 / class3.field90 + this.field47;
                            class25.method166(var7, var8, 2, 16776960, 256);
                        }
                    }
                }
            }
            if (this.field27) {
                this.method17(this.field65, this.field53, true, 10066329, this.field41, 5592405, 18, class2.field81, 7829367);
                this.method17(this.field65, this.field53, true, 10066329, this.field41 + 18, 5592405, this.field5 - 36, class33.field416, 7829367);
                this.method17(this.field65, this.field53, true, 10066329, this.field5 + this.field41 - 18, 5592405, 18, class15.field249, 7829367);
                int var9 = this.field9;
                int var10 = this.field41 + 18 + 3;
                for (int var11 = 0; var11 < 24; var11++) {
                    if (class33.field417.length > var9 && var9 < this.field43.length) {
                        if (this.field43[var9].method134(field20, true)) {
                            var9++;
                            var11--;
                            continue;
                        }
                        class33.field417[var9].method153(this.field53 + 3, var10);
                        this.field33.method90(this.field43[var9], this.field53 + 21, var10 + 14, 0);
                        int var12 = 16777215;
                        if (this.field21 == var9) {
                            var12 = 12298922;
                        }
                        if (this.field51 > 0 && this.field51 % 10 < 5 && this.field24 == var9) {
                            var12 = 16776960;
                        }
                        this.field33.method90(this.field43[var9], this.field53 + 20, var10 + 13, var12);
                    }
                    var10 += 17;
                    var9++;
                }
            }
            if (class8.field188.length == 1) {
                this.method17(this.field11, this.field39, true, this.field6, this.field47 + this.field8, this.field56, 18, class27.field356, this.field13);
                this.method17(this.field65, this.field53, true, this.field6, this.field41 + this.field5, this.field56, 18, class1.field75, this.field13);
                if (this.field42 == 3.0D) {
                    this.method17(50, 170, true, this.field49, 471, this.field60, 30, class12.field232, this.field7);
                } else {
                    this.method17(50, 170, true, this.field6, 471, this.field56, 30, class12.field232, this.field13);
                }
                if (this.field42 == 4.0D) {
                    this.method17(50, 230, true, this.field49, 471, this.field60, 30, class17.field266, this.field7);
                } else {
                    this.method17(50, 230, true, this.field6, 471, this.field56, 30, class17.field266, this.field13);
                }
                if (this.field42 == 6.0D) {
                    this.method17(50, 290, true, this.field49, 471, this.field60, 30, class4.field103, this.field7);
                } else {
                    this.method17(50, 290, true, this.field6, 471, this.field56, 30, class4.field103, this.field13);
                }
                if (this.field42 == 8.0D) {
                    this.method17(50, 350, true, this.field49, 471, this.field60, 30, class28.field368, this.field7);
                } else {
                    this.method17(50, 350, true, this.field6, 471, this.field56, 30, class28.field368, this.field13);
                }
            } else {
                this.method17(this.field11, this.field39, true, this.field6, this.field8 + this.field47, this.field56, 18, class27.field356, this.field13);
                this.method17(this.field65, this.field53, true, this.field6, this.field5 + this.field41, this.field56, 18, class1.field75, this.field13);
                this.method5(this.field13, 483);
                if (this.field42 == 3.0D) {
                    this.method17(50, 170, true, this.field49, 451, this.field60, 30, class12.field232, this.field7);
                } else {
                    this.method17(50, 170, true, this.field6, 451, this.field56, 30, class12.field232, this.field13);
                }
                if (this.field42 == 4.0D) {
                    this.method17(50, 230, true, this.field49, 451, this.field60, 30, class17.field266, this.field7);
                } else {
                    this.method17(50, 230, true, this.field6, 451, this.field56, 30, class17.field266, this.field13);
                }
                if (this.field42 == 6.0D) {
                    this.method17(50, 290, true, this.field49, 451, this.field60, 30, class4.field103, this.field7);
                } else {
                    this.method17(50, 290, true, this.field6, 451, this.field56, 30, class4.field103, this.field13);
                }
                if (this.field42 == 8.0D) {
                    this.method17(50, 350, true, this.field49, 451, this.field60, 30, class28.field368, this.field7);
                } else {
                    this.method17(50, 350, true, this.field6, 451, this.field56, 30, class28.field368, this.field13);
                }
            }
            if (class4.field99) {
                this.method17(this.field30 + this.field58, this.field30, true, this.field6, this.field54, this.field56, this.field54 + this.field26, this.field22, this.field13);
                if (class28.field370) {
                    class25.method169(this.field58 + this.field30 + 7, this.field54, this.field44 + 10, this.field26 + 5, 8925952, 192);
                    class25.method167(this.field58 + this.field30 + 7, this.field54, this.field44 + 10, this.field26 + 5, 16777215);
                    if (class24.field311 > -1 && this.field63.method118((byte) -35) > 0) {
                        class17 var13 = this.field3[class24.field311].method130(arg0 - 471, 47, 32);
                        int var14 = this.field63.method118((byte) -35);
                        if (var13.method118((byte) -35) < var14) {
                            var14 = var13.method118((byte) -35);
                        }
                        this.field33.method96(var13, this.field58 + this.field30 + 11, 20, 10066176, true);
                        this.field33.method96(var13.method116(var14, 0, arg0 ^ 0xFFFFFE4F), this.field58 + this.field30 + 11, 20, 16777215, true);
                    } else {
                        this.field33.method96(class20.field289, this.field58 + this.field30 + 11, 20, 16776960, true);
                    }
                }
            }
        }
        if (arg0 != 471) {
            method2(19);
        }
        if (class28.field369) {
            this.method9((byte) -96);
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(IIZIIIILj;I)V", line = 1594)
    private final void method17(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, class17 arg7, int arg8) {
        class25.method167(arg1, arg4, arg0, arg6, 0);
        int var12 = arg4 + 1;
        int var13 = arg6 - 2;
        int var11 = arg1 + 1;
        int var10 = arg0 - 2;
        class25.method174(var11, var12, var10, var13, arg8);
        class25.method168(var11, var12, var10, arg3);
        class25.method170(var11, var12, var13, arg3);
        class25.method168(var11, var12 + var13 - 1, var10, arg5);
        class25.method170(var10 + var11 - 1, var12, var13, arg5);
        this.field33.method95(arg7, var10 / 2 + var11 + 1, var13 / 2 - -4 + var12 + 1, 0);
        if (arg2) {
            this.field33.method95(arg7, var10 / 2 + var11, var13 / 2 + var12 + 4, 16777215);
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(Ljava/lang/String;[BB)Z", line = 1622)
    private final boolean method18(String arg0, byte[] arg1, byte arg2) {
        if (arg1 == null) {
            return false;
        }
        try {
            int var4 = -45 / ((arg2 + 32) / 54);
            MessageDigest var5 = MessageDigest.getInstance("SHA");
            var5.reset();
            var5.update(arg1);
            byte[] var6 = var5.digest();
            if (arg0 == "main_file_cache.dat0") {
                if (var6[0] != 22 || var6[1] != 21 || var6[2] != -115 || var6[3] != -27 || var6[4] != -111 || var6[5] != -121 || var6[6] != 92 || var6[7] != -28 || var6[8] != -21 || var6[9] != 58 || var6[10] != 90 || var6[11] != 119 || var6[12] != -63 || var6[13] != -62 || var6[14] != 94 || var6[15] != 13 || var6[16] != 125 || var6[17] != -56 || var6[18] != 15 || var6[19] != -120) {
                    return false;
                }
            } else if (var6[0] != -41 || var6[1] != 31 || var6[2] != -75 || var6[3] != -74 || var6[4] != 71 || var6[5] != 73 || var6[6] != -3 || var6[7] != 121 || var6[8] != 51 || var6[9] != -3 || var6[10] != 1 || var6[11] != -10 || var6[12] != 56 || var6[13] != -82 || var6[14] != -4 || var6[15] != -69 || var6[16] != 77 || var6[17] != -66 || var6[18] != -44 || var6[19] != 124) {
                return false;
            }
            return true;
        } catch (Exception var8) {
            this.method200("sha", 50);
            return false;
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "i", descriptor = "(I)V", line = 1694)
    public final void method19(int arg0) {
        class33.method214((byte) 101);
        class33.method209((byte) -35, class33.field411);
        if (arg0 >= -7) {
            return;
        }
        class15.method104((byte) 49, class33.field411);
        this.field22 = class2.field82;
        class29.field376 = class15.field244;
        this.field43 = class6.method61(0);
        this.field63 = class16.method110((byte) -118, 30);
    }

    @OriginalMember(owner = "mapview!mapview", name = "d", descriptor = "(I)V", line = 1731)
    public final void method20(int arg0) {
        method2(-6639);
        class16.method112(-9775);
        class17.method120(1084);
        class23.method157(true);
        class27.method179((byte) 19);
        class33.method216(false);
        class31.method201(0);
        class3.method29(-114);
        class6.method64(-106);
        class12.method98(false);
        class4.method36(true);
        class10.method89();
        class5.method59();
        class2.method25((byte) 112);
        class20.method147((byte) 120);
        class34.method231(false);
        class1.method24(-98);
        class25.method172();
        class28.method182(0);
        class24.method160(-1);
        class13.method100(arg0 ^ 0x43F0);
        class29.method184(30870);
        class11.method97((byte) -21);
        class18.method139((byte) 126);
        class32.method206(0);
        class35.method237(arg0 + 17648);
        class15.method106(38);
        class26.method176(arg0 ^ 0xFFFFBC56);
        class30.method192(arg0 ^ 0xFFFFBC0D);
        if (arg0 != -17393) {
            this.method13(-89, 26, 48, -123, -51, 80, -62, -18, 14);
        }
        class9.method85();
        class8.method77((byte) 39);
        this.field32 = null;
        this.field40 = null;
        this.field64 = null;
        this.field22 = null;
        this.field31 = null;
        this.field10 = null;
        this.field59 = null;
        this.field33 = null;
        this.field12 = null;
        this.field43 = null;
        this.field35 = null;
        this.field37 = null;
        this.field62 = null;
        this.field3 = null;
        this.field14 = null;
        this.field55 = null;
        this.field63 = null;
    }
}
