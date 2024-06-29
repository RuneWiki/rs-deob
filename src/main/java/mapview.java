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
public class mapview extends class6 {

    @OriginalMember(owner = "mapview!mapview", name = "B", descriptor = "I")
    private int field16 = 6706483;

    @OriginalMember(owner = "mapview!mapview", name = "y", descriptor = "I")
    private int field13 = 8943445;

    @OriginalMember(owner = "mapview!mapview", name = "F", descriptor = "D")
    private double field20 = 4.0D;

    @OriginalMember(owner = "mapview!mapview", name = "I", descriptor = "I")
    private int field23 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "N", descriptor = "I")
    private int field28 = 33;

    @OriginalMember(owner = "mapview!mapview", name = "L", descriptor = "I")
    private int field26 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "m", descriptor = "D")
    private double field1 = 4.0D;

    @OriginalMember(owner = "mapview!mapview", name = "A", descriptor = "I")
    private int field15 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "q", descriptor = "I")
    private int field5 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "n", descriptor = "Z")
    private boolean field2 = true;

    @OriginalMember(owner = "mapview!mapview", name = "x", descriptor = "I")
    private int field12 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "K", descriptor = "I")
    private int field25 = -1;

    @OriginalMember(owner = "mapview!mapview", name = "s", descriptor = "Z")
    private boolean field7 = false;

    @OriginalMember(owner = "mapview!mapview", name = "bb", descriptor = "I")
    private int field42 = 40;

    @OriginalMember(owner = "mapview!mapview", name = "cb", descriptor = "Z")
    private boolean field43 = false;

    @OriginalMember(owner = "mapview!mapview", name = "hb", descriptor = "I")
    private int field48 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "v", descriptor = "I")
    private int field10 = 18;

    @OriginalMember(owner = "mapview!mapview", name = "t", descriptor = "I")
    private int field8 = 140;

    @OriginalMember(owner = "mapview!mapview", name = "W", descriptor = "I")
    private int field37 = 5;

    @OriginalMember(owner = "mapview!mapview", name = "ob", descriptor = "I")
    private int field55 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "eb", descriptor = "I")
    private int field45 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "pb", descriptor = "I")
    private int field56 = -1;

    @OriginalMember(owner = "mapview!mapview", name = "db", descriptor = "I")
    private int field44 = 8912896;

    @OriginalMember(owner = "mapview!mapview", name = "V", descriptor = "I")
    private int field36 = 11141120;

    @OriginalMember(owner = "mapview!mapview", name = "kb", descriptor = "Z")
    private boolean field51 = false;

    @OriginalMember(owner = "mapview!mapview", name = "H", descriptor = "I")
    private int field22 = 10027008;

    @OriginalMember(owner = "mapview!mapview", name = "p", descriptor = "I")
    private int field4 = 5;

    @OriginalMember(owner = "mapview!mapview", name = "ib", descriptor = "I")
    private int field49 = 450;

    @OriginalMember(owner = "mapview!mapview", name = "nb", descriptor = "I")
    private int field54 = -1;

    @OriginalMember(owner = "mapview!mapview", name = "tb", descriptor = "I")
    private int field60 = 500;

    @OriginalMember(owner = "mapview!mapview", name = "ub", descriptor = "I")
    private int field61 = 5;

    @OriginalMember(owner = "mapview!mapview", name = "R", descriptor = "[I")
    private int[] field32 = new int[this.field60];

    @OriginalMember(owner = "mapview!mapview", name = "u", descriptor = "[I")
    private int[] field9 = new int[this.field60];

    @OriginalMember(owner = "mapview!mapview", name = "z", descriptor = "[Ln;")
    private class26[] field14 = new class26[this.field60];

    @OriginalMember(owner = "mapview!mapview", name = "Q", descriptor = "I")
    private int field31 = 7824964;

    @OriginalMember(owner = "mapview!mapview", name = "Y", descriptor = "[I")
    private int[] field39 = new int[this.field60];

    @OriginalMember(owner = "mapview!mapview", name = "T", descriptor = "Ln;")
    public static class26 field34 = class9.method82(255, "Helmet Shop");

    @OriginalMember(owner = "mapview!mapview", name = "D", descriptor = "Ln;")
    public static class26 field18 = class9.method82(255, "Fur Trader");

    @OriginalMember(owner = "mapview!mapview", name = "P", descriptor = "Ln;")
    public static class26 field30 = class9.method82(255, "null");

    @OriginalMember(owner = "mapview!mapview", name = "gb", descriptor = "I")
    public static int field47 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "w", descriptor = "I")
    private int field11;

    @OriginalMember(owner = "mapview!mapview", name = "E", descriptor = "I")
    private int field19;

    @OriginalMember(owner = "mapview!mapview", name = "J", descriptor = "I")
    private int field24;

    @OriginalMember(owner = "mapview!mapview", name = "M", descriptor = "I")
    private int field27;

    @OriginalMember(owner = "mapview!mapview", name = "fb", descriptor = "I")
    private static int field46;

    @OriginalMember(owner = "mapview!mapview", name = "jb", descriptor = "I")
    private int field50;

    @OriginalMember(owner = "mapview!mapview", name = "sb", descriptor = "I")
    private int field59;

    @OriginalMember(owner = "mapview!mapview", name = "r", descriptor = "I")
    private int field6;

    @OriginalMember(owner = "mapview!mapview", name = "O", descriptor = "Lg;")
    private class13 field29;

    @OriginalMember(owner = "mapview!mapview", name = "G", descriptor = "Lk;")
    private class20 field21;

    @OriginalMember(owner = "mapview!mapview", name = "o", descriptor = "Ln;")
    private class26 field3;

    @OriginalMember(owner = "mapview!mapview", name = "mb", descriptor = "Ln;")
    private class26 field53;

    @OriginalMember(owner = "mapview!mapview", name = "C", descriptor = "Lia;")
    private class31 field17;

    @OriginalMember(owner = "mapview!mapview", name = "S", descriptor = "Lia;")
    private class31 field33;

    @OriginalMember(owner = "mapview!mapview", name = "U", descriptor = "Lia;")
    private class31 field35;

    @OriginalMember(owner = "mapview!mapview", name = "X", descriptor = "Lia;")
    private class31 field38;

    @OriginalMember(owner = "mapview!mapview", name = "Z", descriptor = "Lia;")
    private class31 field40;

    @OriginalMember(owner = "mapview!mapview", name = "ab", descriptor = "Lia;")
    private class31 field41;

    @OriginalMember(owner = "mapview!mapview", name = "lb", descriptor = "Lia;")
    private class31 field52;

    @OriginalMember(owner = "mapview!mapview", name = "rb", descriptor = "Lia;")
    private class31 field58;

    @OriginalMember(owner = "mapview!mapview", name = "vb", descriptor = "Z")
    public static boolean field62;

    @OriginalMember(owner = "mapview!mapview", name = "qb", descriptor = "[Ln;")
    private class26[] field57;

    @OriginalMember(owner = "mapview!mapview", name = "i", descriptor = "(I)V", line = 5)
    private final void method1(int arg0) {
        class6.field149 = false;
        try {
            Graphics var2 = class4.field119.getGraphics();
            if (arg0 != -6552) {
                return;
            }
            class11.field210.method57(0, 0, var2, -115);
        } catch (Exception var4) {
            class4.field119.repaint();
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "b", descriptor = "(I)V", line = 25)
    public final void method2(int arg0) {
        class15.method112(false);
        class29.method209((byte) -118);
        try {
            this.field39 = null;
            this.field57 = null;
            this.field14 = null;
            if (arg0 != -1) {
                this.field33 = null;
            }
            this.field9 = null;
            this.field29 = null;
            this.field32 = null;
            this.field21 = null;
            class14.field230 = null;
            System.gc();
        } catch (Throwable var3) {
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(Ljava/lang/String;ILn;)Z", line = 49)
    private final boolean method3(String arg0, int arg1, class26 arg2) {
        byte[] var4 = null;
        if (!class9.field185) {
            if (class5.field139 != null) {
                try {
                    var4 = this.method21(-32350, class5.field139 + "/" + arg0);
                    if (!this.method17(var4, arg0, (byte) 72)) {
                        var4 = null;
                    }
                    if (var4 != null) {
                        class16.field249 = new class7(var4, false, true);
                        return true;
                    }
                } catch (IOException var11) {
                    var4 = null;
                }
            }
            class9.field185 = true;
        }
        if (var4 == null) {
            boolean var6 = this.method5(arg2, arg0, (byte) -127);
            if (!var6) {
                return false;
            }
            var4 = class23.field313;
            class23.field313 = null;
        }
        if (var4 == null) {
            class9.field185 = false;
            return true;
        }
        if (class5.field139 != null && var4 != null) {
            try {
                this.method7(class5.field139 + "/" + arg0, var4, false);
            } catch (IOException var10) {
            }
        }
        try {
            class16.field249 = new class7(var4, false, true);
            if (arg1 == 230) {
                class9.field185 = false;
                return true;
            } else {
                return false;
            }
        } catch (IOException var9) {
            throw class1.method29(var9, "monkey feet");
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "g", descriptor = "(I)V", line = 118)
    public final void method4(int arg0) {
        method20(290);
        class35.method238(107);
        class26.method190(arg0 ^ 0xFFFFD8D7);
        if (arg0 != 26) {
            this.field10 = -128;
        }
        class28.method203(121);
        class34.method230(-24205);
        class17.method129(115);
        class6.method69(arg0 + 96);
        class15.method114((byte) -60);
        class4.method59((byte) 10);
        class7.method73(-1);
        class1.method34(64);
        class20.method148();
        class31.method223();
        class22.method157(true);
        class16.method116((byte) -110);
        class23.method162(arg0 - 24);
        class29.method208(arg0 - 25);
        class12.method102();
        class9.method81(-5300);
        class33.method229(-82);
        class19.method141(-1);
        class14.method109((byte) -127);
        class8.method77(46);
        class30.method213(0);
        class11.method91(true);
        class18.method138(false);
        class10.method88(arg0 - 27);
        class5.method61(25);
        class21.method151(0);
        class24.method171();
        class36.method242((byte) -80);
        this.field58 = null;
        this.field9 = null;
        this.field53 = null;
        this.field14 = null;
        this.field57 = null;
        this.field3 = null;
        this.field32 = null;
        this.field35 = null;
        this.field41 = null;
        this.field17 = null;
        this.field33 = null;
        this.field38 = null;
        this.field21 = null;
        this.field39 = null;
        this.field52 = null;
        this.field29 = null;
        this.field40 = null;
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(Ln;Ljava/lang/String;B)Z", line = 181)
    private final boolean method5(class26 arg0, String arg1, byte arg2) {
        try {
            if (class35.field424 == null) {
                class22.field310 = class34.method232(new class26[] { class26.field356, arg0 }, -10);
                String var4;
                if (arg1 == "main_file_cache.dat0") {
                    var4 = "worldmap.main.js5?crc=635406757";
                } else if (arg1 == "main_file_cache.dat1") {
                    var4 = "worldmap.dungeon.js5?crc=2113792277";
                } else if (arg1 == "main_file_cache.dat2") {
                    var4 = "worldmap.extra.js5?crc=-508876935";
                } else {
                    var4 = "mapview.sprites.js5?crc=-1837203931";
                }
                int var5;
                if (arg1 == "main_file_cache.dat0") {
                    var5 = 395705;
                } else if (arg1 == "main_file_cache.dat1") {
                    var5 = 143115;
                } else if (arg1 == "main_file_cache.dat2") {
                    var5 = 104463;
                } else {
                    var5 = 8200;
                }
                class35.field424 = new DataInputStream((new URL(this.getCodeBase(), var4)).openStream());
                class8.field166 = 0;
                class23.field313 = new byte[var5];
                field46 = 0;
            }
            int var6 = field46;
            int var7 = class23.field313.length;
            if (arg2 > -123) {
                this.field42 = 61;
            }
            if (var6 >= var7) {
                class35.field424.close();
                class35.field424 = null;
                if (!this.method17(class23.field313, arg1, (byte) 72)) {
                    this.method72("download", 32358);
                    class23.field313 = null;
                }
                return true;
            }
            class8.field166++;
            if (class8.field166 >= 1500) {
                throw new IOException();
            }
            DataInputStream var8 = class35.field424;
            int var9 = var8.available();
            if (var9 < 0) {
                throw new EOFException();
            } else if (var9 == 0) {
                return false;
            } else {
                if (var7 - var6 < var9) {
                    var9 = var7 - var6;
                }
                int var10 = var8.read(class23.field313, var6, var9);
                if (var10 < 0) {
                    throw new EOFException();
                } else if (var10 == 0) {
                    return false;
                } else {
                    class8.field166 = 0;
                    int var11 = var6 + var10;
                    int var12 = var11 * 100 / var7;
                    class22.field310 = class34.method232(new class26[] { class9.field181, arg0, class5.field123, class16.method117(var12, 56), class4.field109 }, -118);
                    field46 = var11;
                    return false;
                }
            }
        } catch (IOException var16) {
            try {
                class35.field424.close();
            } catch (Exception var15) {
            }
            class35.field424 = null;
            class23.field313 = null;
            this.method72("download", 32358);
            return true;
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(I)V", line = 301)
    public final void method6(int arg0) {
        class6.method70((byte) 96);
        class23.method163(class4.field119, (byte) -94);
        class21.method152(class4.field119, arg0 ^ 0x65E4);
        if (arg0 == 26002) {
            class22.field310 = class9.field180;
            this.field3 = class36.field448;
            this.field57 = class15.method113(arg0 - 25970);
            this.field53 = class22.method156(30, 0);
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(Ljava/lang/String;[BZ)V", line = 324)
    private final void method7(String arg0, byte[] arg1, boolean arg2) throws IOException {
        FileOutputStream var4 = new FileOutputStream(arg0);
        var4.write(arg1, 0, arg1.length);
        if (!arg2) {
            var4.close();
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "c", descriptor = "(B)V", line = 338)
    private final void method8(byte arg0) {
        if (class23.field321.length == 1) {
            class26.field345 = 0;
        } else {
            if (class6.field151 >= 0) {
                class26.field345 = class6.field151;
            } else {
                class26.field345 = this.method16(class26.field345, -42);
            }
            class6.field151 = this.method16(class26.field345, -68);
        }
        this.method23(class26.field345, true);
        if (arg0 > -7) {
            this.method23(90, true);
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(Z)V", line = 386)
    public final void method9(boolean arg0) {
        if (!class11.field209) {
            class11.field209 = this.method11(true);
            class9.method85(class15.field235, class22.field310, -19820, null);
            return;
        }
        if (this.field2) {
            this.field2 = false;
            class6.field149 = true;
            class12.method100();
            int var2 = class26.field352 - (int) (503.0D / this.field1);
            int var3 = class23.field320 - (int) (635.0D / this.field1);
            int var4 = (int) (635.0D / this.field1) + class23.field320;
            int var5 = (int) (503.0D / this.field1) + class26.field352;
            this.method13(var2, 0, 503, var3, var5, 64, var4, 0, 635);
            if (this.field43) {
                this.field29.method105(this.field19, this.field59);
                class12.method103(this.field27 * var3 / class16.field246 + this.field19, this.field6 * var2 / class34.field408 + this.field59, (var4 - var3) * this.field27 / class16.field246, (var5 - var2) * this.field6 / class34.field408, 16711680, 128);
                class12.method93(this.field27 * var3 / class16.field246 + this.field19, this.field6 * var2 / class34.field408 + this.field59, (var4 - var3) * this.field27 / class16.field246, (var5 - var2) * this.field6 / class34.field408, 16711680);
                if (this.field15 > 0 && this.field15 % 10 < 5) {
                    for (int var6 = 0; var6 < field47; var6++) {
                        if (class14.field230.field76[var6] == this.field25) {
                            int var7 = class14.field230.field74[var6] * this.field27 / class16.field246 + this.field19;
                            int var8 = this.field59 + class14.field230.field77[var6] * this.field6 / class34.field408;
                            class12.method96(var7, var8, 2, 16776960, 256);
                        }
                    }
                }
            }
            if (this.field51) {
                this.method12(5592405, 10066329, 18, class5.field134, 7829367, this.field4, this.field28, this.field8, 21619);
                this.method12(5592405, 10066329, this.field49 - 36, class17.field253, 7829367, this.field4, this.field28 + 18, this.field8, 21619);
                this.method12(5592405, 10066329, 18, class7.field158, 7829367, this.field4, this.field28 + this.field49 - 18, this.field8, 21619);
                int var9 = this.field5;
                int var10 = this.field28 + 3 + 18;
                for (int var11 = 0; var11 < 24; var11++) {
                    if (class17.field256.length > var9 && var9 < this.field57.length) {
                        if (this.field57[var9].method198(class9.field188, (byte) 125)) {
                            var9++;
                            var11--;
                            continue;
                        }
                        class17.field256[var9].method108(this.field4 + 3, var10);
                        this.field21.method150(this.field57[var9], this.field4 + 21, var10 + 14, 0);
                        int var12 = 16777215;
                        if (this.field54 == var9) {
                            var12 = 12298922;
                        }
                        if (this.field15 > 0 && this.field15 % 10 < 5 && this.field25 == var9) {
                            var12 = 16776960;
                        }
                        this.field21.method150(this.field57[var9], this.field4 + 20, var10 - -13, var12);
                    }
                    var9++;
                    var10 += 17;
                }
            }
            if (class23.field321.length == 1) {
                this.method12(this.field16, this.field13, 18, class9.field182, this.field31, this.field19, this.field6 + this.field59, this.field27, 21619);
                this.method12(this.field16, this.field13, 18, class15.field242, this.field31, this.field4, this.field49 + this.field28, this.field8, 21619);
                if (this.field20 == 3.0D) {
                    this.method12(this.field44, this.field36, 30, class34.field409, this.field22, 170, 471, 50, 21619);
                } else {
                    this.method12(this.field16, this.field13, 30, class34.field409, this.field31, 170, 471, 50, 21619);
                }
                if (this.field20 == 4.0D) {
                    this.method12(this.field44, this.field36, 30, class23.field326, this.field22, 230, 471, 50, 21619);
                } else {
                    this.method12(this.field16, this.field13, 30, class23.field326, this.field31, 230, 471, 50, 21619);
                }
                if (this.field20 == 6.0D) {
                    this.method12(this.field44, this.field36, 30, class14.field225, this.field22, 290, 471, 50, 21619);
                } else {
                    this.method12(this.field16, this.field13, 30, class14.field225, this.field31, 290, 471, 50, 21619);
                }
                if (this.field20 == 8.0D) {
                    this.method12(this.field44, this.field36, 30, class22.field309, this.field22, 350, 471, 50, 21619);
                } else {
                    this.method12(this.field16, this.field13, 30, class22.field309, this.field31, 350, 471, 50, 21619);
                }
            } else {
                this.method12(this.field16, this.field13, 18, class9.field182, this.field31, this.field19, this.field59 + this.field6, this.field27, 21619);
                this.method12(this.field16, this.field13, 18, class15.field242, this.field31, this.field4, this.field28 + this.field49, this.field8, 21619);
                this.method10((byte) 62, this.field31);
                if (this.field20 == 3.0D) {
                    this.method12(this.field44, this.field36, 30, class34.field409, this.field22, 170, 451, 50, 21619);
                } else {
                    this.method12(this.field16, this.field13, 30, class34.field409, this.field31, 170, 451, 50, 21619);
                }
                if (this.field20 == 4.0D) {
                    this.method12(this.field44, this.field36, 30, class23.field326, this.field22, 230, 451, 50, 21619);
                } else {
                    this.method12(this.field16, this.field13, 30, class23.field326, this.field31, 230, 451, 50, 21619);
                }
                if (this.field20 == 6.0D) {
                    this.method12(this.field44, this.field36, 30, class14.field225, this.field22, 290, 451, 50, 21619);
                } else {
                    this.method12(this.field16, this.field13, 30, class14.field225, this.field31, 290, 451, 50, 21619);
                }
                if (this.field20 == 8.0D) {
                    this.method12(this.field44, this.field36, 30, class22.field309, this.field22, 350, 451, 50, 21619);
                } else {
                    this.method12(this.field16, this.field13, 30, class22.field309, this.field31, 350, 451, 50, 21619);
                }
            }
            if (class33.field405) {
                this.method12(this.field16, this.field13, this.field61 + this.field10, this.field3, this.field31, this.field37, this.field61, this.field42 + this.field37, 21619);
                if (class1.field65) {
                    class12.method103(this.field42 + this.field37 + 7, this.field61, this.field11 + 10, this.field10 + 5, 8925952, 192);
                    class12.method93(this.field42 + this.field37 + 7, this.field61, this.field11 + 10, this.field10 + 5, 16777215);
                    if (class10.field196 > -1 && this.field53.method197(true) > 0) {
                        class26 var13 = this.field14[class10.field196].method201(21033, 47, 32);
                        int var14 = this.field53.method197(true);
                        if (var13.method197(!arg0) < var14) {
                            var14 = var13.method197(true);
                        }
                        this.field21.method143(var13, this.field42 + this.field37 + 11, 20, 10066176, true);
                        this.field21.method143(var13.method180(0, (byte) -38, var14), this.field42 + this.field37 + 11, 20, 16777215, true);
                    } else {
                        this.field21.method143(class35.field420, this.field37 + this.field42 + 11, 20, 16776960, true);
                    }
                }
            }
        }
        if (class6.field149) {
            this.method1(-6552);
        }
        if (arg0) {
            this.field35 = null;
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(BI)V", line = 587)
    private final void method10(byte arg0, int arg1) {
        this.method12(this.field16, this.field13, 18, class34.method232(new class26[] { class1.field69, class1.field64[class6.field151], class18.field263 }, -123), arg1, 170, 483, 230, 21619);
        int var3 = -38 % ((-arg0 - 11) / 48);
    }

    @OriginalMember(owner = "mapview!mapview", name = "c", descriptor = "(Z)Z", line = 599)
    private final boolean method11(boolean arg0) {
        if (class17.field255 == 0) {
            this.method18((byte) 61);
            class17.field255 = 1;
        }
        if (class17.field255 == 1) {
            class15.field235 = 25;
            boolean var2 = this.method3("main_file_cache.idx0", 230, class29.field372);
            if (!var2) {
                return false;
            }
            class28.field362 = class16.field249;
            class16.field249 = null;
            if (class28.field362 == null) {
                throw new RuntimeException("T1");
            }
            class17.field255 = 2;
        }
        if (class17.field255 == 2) {
            class17.field255 = 10;
            class23.field321 = new class7[1];
        }
        if (class17.field255 == 10) {
            class15.field235 = 50;
            boolean var3 = this.method3("main_file_cache.dat0", 230, class30.field382);
            if (!var3) {
                return false;
            }
            class23.field321[0] = class16.field249;
            class16.field249 = null;
            if (class23.field321[0] == null) {
                throw new RuntimeException("T2");
            }
            class17.field255 = 20;
        }
        if (!arg0) {
            method20(3);
        }
        if (class17.field255 != 20) {
            return false;
        }
        class6.field153 = class7.method75(class9.field190, class28.field362, -112, class17.field253);
        class17.field256 = class17.method124((byte) -126, class17.field253, class7.field162, class28.field362);
        this.field21 = class26.method189(class28.field362, class17.field253, (byte) 127, class23.field330);
        this.field17 = new class31(11, true, this);
        this.field33 = new class31(12, true, this);
        this.field41 = new class31(14, true, this);
        this.field58 = new class31(17, true, this);
        this.field35 = new class31(19, true, this);
        this.field52 = new class31(22, true, this);
        this.field40 = new class31(26, true, this);
        this.field38 = new class31(30, true, this);
        class15.field235 = 100;
        class22.field310 = class19.field271;
        class9.method85(class15.field235, class22.field310, -19820, null);
        this.method8((byte) -124);
        return true;
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(IIILn;IIIII)V", line = 686)
    private final void method12(int arg0, int arg1, int arg2, class26 arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class12.method93(arg5, arg6, arg7, arg2, 0);
        int var12 = arg6 + 1;
        int var13 = arg7 - 2;
        int var10 = arg2 - 2;
        int var11 = arg5 + 1;
        class12.method95(var11, var12, var13, var10, arg4);
        class12.method98(var11, var12, var13, arg1);
        class12.method92(var11, var12, var10, arg1);
        if (arg8 != 21619) {
            this.method12(-64, 52, 63, null, -85, 48, 121, 48, -13);
        }
        class12.method98(var11, var10 + var12 - 1, var13, arg0);
        class12.method92(var13 + var11 - 1, var12, var10, arg0);
        this.field21.method147(arg3, var11 + var13 / 2 + 1, var10 / 2 + var12 - -1 + 4, 0);
        this.field21.method147(arg3, var13 / 2 + var11, var12 - (-(var10 / 2) + -4), 16777215);
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(IIIIIIIII)V", line = 753)
    private final void method13(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class14.field230.method36(arg2, arg4, arg7, arg6, arg1, (byte) -59, arg3, arg8, arg0);
        if (arg6 - arg3 > -arg1 + arg8) {
            return;
        }
        class14.field230.method38(arg6, arg1, arg2, arg7, 50, arg0, arg8, arg4, this.field1, arg3);
        class14.field230.method35(arg7, arg2, (byte) 12, arg6, arg3, arg1, arg0, arg8, arg4);
        if (arg5 != 64) {
            this.method16(-40, 66);
        }
        class14.field230.method33(this.field15, arg7, arg3, this.field25, arg6, arg1, arg2, arg8, arg4, arg0, arg5 - 83);
        if (this.field20 == this.field1 && class6.field148) {
            for (int var10 = 0; var10 < this.field48; var10++) {
                int var11 = this.field9[var10];
                int var12 = var11 - class21.field302;
                int var13 = this.field32[var10];
                int var14 = (arg8 - arg1) * (-arg3 + var12) / (arg6 - arg3) + arg1;
                int var15 = class7.field164 + class34.field408 - var13;
                int var16 = this.field39[var10];
                int var17 = arg7 + (var15 - arg0) * (-arg7 + arg2) / (arg4 - arg0);
                int var18 = 16777215;
                class31 var19 = null;
                if (var16 == 0) {
                    if (this.field1 == 3.0D) {
                        var19 = this.field17;
                    }
                    if (this.field1 == 4.0D) {
                        var19 = this.field33;
                    }
                    if (this.field1 == 6.0D) {
                        var19 = this.field41;
                    }
                    if (this.field1 == 8.0D) {
                        var19 = this.field58;
                    }
                }
                if (var16 == 1) {
                    if (this.field1 == 3.0D) {
                        var19 = this.field41;
                    }
                    if (this.field1 == 4.0D) {
                        var19 = this.field58;
                    }
                    if (this.field1 == 6.0D) {
                        var19 = this.field35;
                    }
                    if (this.field1 == 8.0D) {
                        var19 = this.field52;
                    }
                }
                if (var16 == 2) {
                    if (this.field1 == 3.0D) {
                        var19 = this.field35;
                    }
                    if (this.field1 == 4.0D) {
                        var19 = this.field52;
                    }
                    if (this.field1 == 6.0D) {
                        var19 = this.field40;
                    }
                    var18 = 16755200;
                    if (this.field1 == 8.0D) {
                        var19 = this.field38;
                    }
                }
                if (var19 != null) {
                    class26 var20 = this.field14[var10];
                    int var21 = 1;
                    for (int var22 = 0; var22 < var20.method197(true); var22++) {
                        if (var20.method186(var22, (byte) 3) == 47) {
                            var21++;
                        }
                    }
                    int var23 = var17 - var19.method215() * (var21 - 1) / 2;
                    int var24 = var23 + var19.method214() / 2;
                    while (true) {
                        int var25 = var20.method194(-123, 47);
                        if (var25 == -1) {
                            var19.method216(var20, var14, var24, var18, true);
                            break;
                        }
                        class26 var26 = var20.method180(0, (byte) 113, var25);
                        var19.method216(var26, var14, var24, var18, true);
                        var24 += var19.method215();
                        var20 = var20.method184(var25 + 1, 124);
                    }
                }
            }
        }
        if (!class16.field247) {
            return;
        }
        for (int var27 = class21.field302 / 64; var27 < (class21.field302 + class16.field246) / 64; var27++) {
            for (int var28 = class7.field164 / 64; var28 < (class7.field164 + class34.field408) / 64; var28++) {
                int var29 = var27 * 64;
                int var30 = var29 - class21.field302;
                int var31 = arg1 + (var30 - arg3) * (-arg1 + arg8) / (arg6 - arg3);
                int var32 = var28 * 64;
                int var33 = (arg8 - arg1) * (var30 + 64 + -arg3) / (arg6 - arg3) + arg1;
                int var34 = class34.field408 + class7.field164 - var32;
                int var35 = (var34 - arg0 - 64) * (-arg7 + arg2) / (arg4 - arg0) + arg7;
                int var36 = (var34 - arg0) * (-arg7 + arg2) / (arg4 - arg0) + arg7;
                class12.method93(var31, var35, var33 - var31, -var35 + var36, 16777215);
                this.field21.method146(class34.method232(new class26[] { class16.method117(var27, arg5 + 49), class8.field178, class16.method117(var28, arg5 - 4) }, -121), var33 - 5, var36 + -5, 16777215);
                if (var27 == 33 && var28 >= 71 && var28 <= 73) {
                    this.field21.method147(class30.field388, (var33 + var31) / 2, (var35 + var36) / 2, 16711680);
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "d", descriptor = "(B)V", line = 939)
    public static final void method14(byte arg0) {
        class14.field223 = null;
        class28.field367 = null;
        if (arg0 > -15) {
            method22(true);
        }
        class7.field156 = null;
        class1.field73 = null;
        class4.field121 = null;
        class34.field418 = null;
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(II)I", line = 977)
    public static int method15(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "mapview!mapview", name = "b", descriptor = "(II)I", line = 993)
    private final int method16(int arg0, int arg1) {
        if (arg1 >= -18) {
            field47 = 4;
        }
        arg0++;
        if (arg0 >= class23.field321.length) {
            arg0 = 0;
        }
        return arg0;
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "([BLjava/lang/String;B)Z", line = 1009)
    private final boolean method17(byte[] arg0, String arg1, byte arg2) {
        if (arg0 == null) {
            return false;
        }
        try {
            MessageDigest var4 = MessageDigest.getInstance("SHA");
            var4.reset();
            var4.update(arg0);
            if (arg2 != 72) {
                return true;
            }
            byte[] var5 = var4.digest();
            if (arg1 == "main_file_cache.dat0") {
                if (var5[0] != -67 || var5[1] != 80 || var5[2] != -6 || var5[3] != -71 || var5[4] != 18 || var5[5] != -123 || var5[6] != 23 || var5[7] != -1 || var5[8] != 104 || var5[9] != -68 || var5[10] != -54 || var5[11] != -118 || var5[12] != 89 || var5[13] != -5 || var5[14] != 9 || var5[15] != 18 || var5[16] != -9 || var5[17] != -6 || var5[18] != -44 || var5[19] != -115) {
                    return false;
                }
            } else if (var5[0] != -41 || var5[1] != 31 || var5[2] != -75 || var5[3] != -74 || var5[4] != 71 || var5[5] != 73 || var5[6] != -3 || var5[7] != 121 || var5[8] != 51 || var5[9] != -3 || var5[10] != 1 || var5[11] != -10 || var5[12] != 56 || var5[13] != -82 || var5[14] != -4 || var5[15] != -69 || var5[16] != 77 || var5[17] != -66 || var5[18] != -44 || var5[19] != 124) {
                return false;
            }
            return true;
        } catch (Exception var7) {
            this.method72("sha", 32358);
            return false;
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "e", descriptor = "(B)V", line = 1057)
    private final void method18(byte arg0) {
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
        if (arg0 != 61) {
            this.method19(-3);
        }
        while (var7 < var5.length) {
            try {
                label61: {
                    String var8 = var5[var7];
                    if (var8.length() > 0) {
                        File var9 = new File(var8);
                        if (!var9.exists()) {
                            break label61;
                        }
                    }
                    File var10 = new File(var8 + var6);
                    if (var10.exists() || var10.mkdir()) {
                        File var11 = new File(var10, "rsmap");
                        if (var11.exists() || var11.mkdir()) {
                            class5.field139 = var8 + var6 + "/rsmap/";
                            return;
                        }
                    }
                }
            } catch (Exception var14) {
            }
            var7++;
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "d", descriptor = "(I)V", line = 1145)
    public final void method19(int arg0) {
        if (class30.field387) {
            class28.method204(class4.field119, -1);
            class9.method80(2, class4.field119);
            this.method67(0);
            class23.method163(class4.field119, (byte) -94);
            class21.method152(class4.field119, 43);
        }
        class18.method136(5000);
        class35.method237(125);
        if (!class11.field209) {
            return;
        }
        if (class5.field137[96]) {
            class23.field320 = (int) ((double) class23.field320 - 16.0D / this.field1);
            this.field2 = true;
            class19.field269 = -1;
        }
        if (class5.field137[97]) {
            class23.field320 = (int) (16.0D / this.field1 + (double) class23.field320);
            class19.field269 = -1;
            this.field2 = true;
        }
        if (class5.field137[98]) {
            class19.field269 = -1;
            class26.field352 = (int) ((double) class26.field352 - 16.0D / this.field1);
            this.field2 = true;
        }
        if (class5.field137[99]) {
            this.field2 = true;
            class19.field269 = -1;
            class26.field352 = (int) (16.0D / this.field1 + (double) class26.field352);
        }
        while (true) {
            while (true) {
                while (class33.method228(4730)) {
                    if (!class33.field405 || !class1.field65) {
                        if (class36.field434 == 102) {
                            this.field2 = true;
                            class1.field65 = true;
                        }
                        if (class36.field434 == 49) {
                            this.field2 = true;
                            this.field20 = 3.0D;
                        }
                        if (class36.field434 == 50) {
                            this.field20 = 4.0D;
                            this.field2 = true;
                        }
                        if (class36.field434 == 51) {
                            this.field20 = 6.0D;
                            this.field2 = true;
                        }
                        if (class36.field434 == 52) {
                            this.field20 = 8.0D;
                            this.field2 = true;
                        }
                        if (class36.field434 == 107 || class36.field434 == 75) {
                            this.field51 = !this.field51;
                            this.field2 = true;
                        }
                        if (class36.field434 == 111 || class36.field434 == 79) {
                            this.field43 = !this.field43;
                            this.field2 = true;
                        }
                    } else if (class5.field130 == 0) {
                        class1.field65 = false;
                        this.field2 = true;
                        this.field53.method179(119, 0);
                        class10.field196 = -1;
                    } else if (class5.field130 == 84) {
                        class1.field65 = false;
                        this.field50 = class23.field320 << 16;
                        this.field24 = class26.field352 << 16;
                        class19.field269 = class10.field196;
                        this.field53.method179(124, 0);
                        this.field2 = true;
                        class10.field196 = -1;
                    } else {
                        boolean var2 = false;
                        if (class5.field130 == 85) {
                            if (this.field53.method197(true) > 0) {
                                this.field53.method179(121, this.field53.method197(true) - 1);
                                this.field2 = true;
                                if (this.field53.method197(true) == 0) {
                                    class10.field196 = -1;
                                } else {
                                    var2 = true;
                                }
                            }
                        } else if (class36.field434 != -1 && this.field53.method197(true) <= class1.field63) {
                            this.field53.method191(class36.field434, -122);
                            this.field2 = true;
                        }
                        if (this.field53.method197(true) > 0) {
                            for (int var3 = 0; var3 < this.field48; var3++) {
                                if (this.field14[var3].method197(true) >= this.field53.method197(true)) {
                                    class26 var4 = this.field53.method192(-34);
                                    class26 var5 = this.field14[var3].method201(arg0 ^ 0x5229, 47, 32).method180(0, (byte) -98, this.field53.method197(true)).method192(-34);
                                    if (var4.method183(var5, (byte) 100) == 0) {
                                        this.field2 = true;
                                        class10.field196 = var3;
                                        var2 = true;
                                        break;
                                    }
                                }
                            }
                            if (!var2) {
                                this.field53.method179(-86, this.field53.method197(true) - 1);
                            }
                        }
                    }
                }
                int var6 = class18.field260;
                int var7 = class29.field377;
                int var8 = class19.field266;
                int var9 = class8.field175;
                int var10 = class5.field143;
                int var11 = class15.field240;
                if (var6 == 1) {
                    this.field55 = var10;
                    this.field45 = class23.field320;
                    this.field26 = class26.field352;
                    this.field23 = var9;
                    if (class23.field321.length == 1) {
                        if (var9 > 170 && var9 < 220 && var10 > 471 && var10 < 503) {
                            this.field23 = -1;
                            this.field20 = 3.0D;
                        }
                        if (var9 > 230 && var9 < 280 && var10 > 471 && var10 < 503) {
                            this.field23 = -1;
                            this.field20 = 4.0D;
                        }
                        if (var9 > 290 && var9 < 340 && var10 > 471 && var10 < 503) {
                            this.field20 = 6.0D;
                            this.field23 = -1;
                        }
                        if (var9 > 350 && var9 < 400 && var10 > 471 && var10 < 503) {
                            this.field20 = 8.0D;
                            this.field23 = -1;
                        }
                    } else {
                        if (var9 > 170 && var9 < 220 && var10 > 451 && var10 < 483) {
                            this.field23 = -1;
                            this.field20 = 3.0D;
                        }
                        if (var9 > 230 && var9 < 280 && var10 > 451 && var10 < 483) {
                            this.field20 = 4.0D;
                            this.field23 = -1;
                        }
                        if (var9 > 290 && var9 < 340 && var10 > 451 && var10 < 483) {
                            this.field20 = 6.0D;
                            this.field23 = -1;
                        }
                        if (var9 > 350 && var9 < 400 && var10 > 451 && var10 < 483) {
                            this.field20 = 8.0D;
                            this.field23 = -1;
                        }
                        if (var9 > 170 && var9 < 400 && var10 > 483 && var10 < 503) {
                            this.method10((byte) -114, this.field22);
                            this.method1(-6552);
                            this.method8((byte) -20);
                            this.field23 = -1;
                        }
                    }
                    if (this.field4 < var9 && var10 > this.field49 + this.field28 && this.field8 + this.field4 > var9 && var10 < 503) {
                        this.field23 = -1;
                        this.field51 = !this.field51;
                    }
                    this.field2 = true;
                    this.field7 = false;
                    if (this.field19 < var9 && this.field59 + this.field6 < var10 && this.field27 + this.field19 > var9 && var10 < 503) {
                        this.field43 = !this.field43;
                        this.field23 = -1;
                    }
                    if (this.field51) {
                        if (this.field4 < var9 && this.field28 < var10 && var9 < this.field8 + this.field4 && this.field49 + this.field28 > var10) {
                            this.field23 = -1;
                        }
                        if (this.field4 < var9 && this.field28 < var10 && this.field8 + this.field4 > var9 && this.field28 + 18 > var10 && this.field12 > 0) {
                            this.field12 -= 24;
                        }
                        if (this.field4 < var9 && this.field28 + this.field49 - 18 < var10 && this.field8 + this.field4 > var9 && this.field49 + this.field28 > var10 && this.field12 < 48) {
                            this.field12 += 24;
                        }
                    }
                    if (this.field43 && var9 > this.field19 && this.field59 < var10 && var9 < this.field27 + this.field19 && this.field6 + this.field59 > var10) {
                        class26.field352 = (var10 - this.field59) * class34.field408 / this.field6;
                        this.field7 = true;
                        class23.field320 = (var9 - this.field19) * class16.field246 / this.field27;
                        this.field23 = -1;
                    }
                    if (class33.field405 && !class1.field65 && !this.field7 && this.field37 < var9 && this.field61 < var10 && var9 < this.field42 + this.field37 && var10 < this.field61 + this.field10) {
                        class1.field65 = true;
                    }
                }
                if (this.field51) {
                    this.field54 = -1;
                    if (this.field4 < var8 && var8 < this.field8 + this.field4) {
                        int var12 = this.field28 + 21 + 5;
                        int var13 = this.field5;
                        for (int var14 = 0; var14 < 24; var14++) {
                            if (this.field57.length > var13 && this.field57[var13].method198(class9.field188, (byte) 125)) {
                                var14--;
                                var13++;
                            } else {
                                if (var12 <= var11 && var11 < var12 + 17) {
                                    if (var6 == 1) {
                                        this.field25 = var13;
                                        this.field15 = 50;
                                    }
                                    this.field54 = var13;
                                }
                                var12 += 17;
                                var13++;
                            }
                        }
                    }
                    if (this.field56 != this.field54) {
                        this.field2 = true;
                        this.field56 = this.field54;
                    }
                }
                if (var7 == 1 && this.field43 && this.field7) {
                    this.field2 = true;
                    int var15 = var8;
                    class19.field269 = -1;
                    if (var8 < this.field19) {
                        var15 = this.field19;
                    } else if (var8 > this.field27 + this.field19) {
                        var15 = this.field27 + this.field19;
                    }
                    int var16 = var11;
                    class23.field320 = (var15 - this.field19) * class16.field246 / this.field27;
                    if (var11 < this.field59) {
                        var16 = this.field59;
                    } else if (var11 > this.field6 + this.field59) {
                        var16 = this.field6 + this.field59;
                    }
                    class26.field352 = (var16 - this.field59) * class34.field408 / this.field6;
                } else {
                    this.field7 = false;
                }
                if (var7 == 1 && this.field23 != -1) {
                    this.field2 = true;
                    class23.field320 = (int) ((double) (this.field23 - var8) * 2.0D / this.field20) + this.field45;
                    class19.field269 = -1;
                    class26.field352 = (int) ((double) (this.field55 - var11) * 2.0D / this.field20) + this.field26;
                }
                if (this.field1 < this.field20) {
                    this.field1 += this.field1 / 30.0D;
                    if (this.field1 > this.field20) {
                        this.field1 = this.field20;
                    }
                    this.field2 = true;
                }
                if (this.field1 > this.field20) {
                    this.field1 -= this.field1 / 30.0D;
                    if (this.field20 > this.field1) {
                        this.field1 = this.field20;
                    }
                    this.field2 = true;
                }
                if (this.field5 < this.field12) {
                    this.field2 = true;
                    this.field5++;
                }
                if (this.field12 < this.field5) {
                    this.field5--;
                    this.field2 = true;
                }
                if (this.field15 > 0) {
                    this.field15--;
                    this.field2 = true;
                }
                if (arg0 <= class19.field269) {
                    class15.field234 = this.field9[class19.field269] - class21.field302;
                    byte var17 = 4;
                    class35.field422 = class34.field408 + class7.field164 - this.field32[class19.field269];
                    int var18 = class15.field234 - (int) (635.0D / this.field1);
                    int var19 = class35.field422 - (int) (503.0D / this.field1);
                    int var20 = (int) (635.0D / this.field1) + class15.field234;
                    if (var18 < 48) {
                        class15.field234 = (int) (635.0D / this.field1) + 48;
                    }
                    if (class16.field246 - 48 < var20) {
                        class15.field234 = class16.field246 - (int) (635.0D / this.field1) - 48;
                    }
                    this.field2 = true;
                    int var21 = class35.field422 + (int) (503.0D / this.field1);
                    if (var19 < 48) {
                        class35.field422 = (int) (503.0D / this.field1) + 48;
                    }
                    if (var21 > class34.field408 - 48) {
                        class35.field422 = class34.field408 - (int) (503.0D / this.field1) - 48;
                    }
                    class35.field422 <<= 0x10;
                    class15.field234 <<= 0x10;
                    int var22 = class35.field422 - this.field24;
                    int var23 = class15.field234 - this.field50;
                    if (var23 >> var17 == 0 && var22 >> var17 == 0) {
                        class19.field269 = -1;
                    } else {
                        this.field50 += var23 >> var17;
                        class23.field320 = this.field50 >> 16;
                        this.field24 += var22 >> var17;
                        class26.field352 = this.field24 >> 16;
                    }
                }
                int var24 = class26.field352 - (int) (503.0D / this.field1);
                int var25 = class23.field320 + (int) (635.0D / this.field1);
                int var26 = class23.field320 - (int) (635.0D / this.field1);
                if (var26 < 48) {
                    class23.field320 = (int) (635.0D / this.field1) + 48;
                }
                int var27 = class26.field352 + (int) (503.0D / this.field1);
                if (var24 < 48) {
                    class26.field352 = (int) (503.0D / this.field1) + 48;
                }
                if (class34.field408 - 48 < var27) {
                    class26.field352 = class34.field408 - (int) (503.0D / this.field1) - 48;
                }
                if (var25 > class16.field246 - 48) {
                    class23.field320 = class16.field246 - (int) (635.0D / this.field1) - 48;
                }
                return;
            }
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "j", descriptor = "(I)V", line = 1683)
    public static void method20(int arg0) {
        field34 = null;
        field30 = null;
        field18 = null;
        if (arg0 != 290) {
            field34 = null;
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(ILjava/lang/String;)[B", line = 1720)
    private final byte[] method21(int arg0, String arg1) throws IOException {
        File var3 = new File(arg1);
        if (!var3.exists()) {
            return null;
        }
        int var4 = (int) var3.length();
        if (arg0 != -32350) {
            this.field4 = 81;
        }
        byte[] var5 = new byte[var4];
        DataInputStream var6 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg1)));
        var6.readFully(var5, 0, var4);
        var6.close();
        return var5;
    }

    @OriginalMember(owner = "mapview!mapview", name = "init", descriptor = "()V", line = 1756)
    public final void init() {
        if (this.method64((byte) -102)) {
            this.method71(503, 78, 635, class30.field384.method196(-97, this).method188((byte) -68), 32);
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "d", descriptor = "(Z)B", line = 1780)
    public static final byte method22(boolean arg0) {
        if (arg0) {
            return -31;
        } else if (class4.field111 == null) {
            return 0;
        } else {
            return class4.field111[class18.field262];
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(IZ)V", line = 1802)
    private final void method23(int arg0, boolean arg1) {
        if (!arg1) {
            this.method8((byte) 116);
        }
        if (arg0 >= class23.field321.length) {
            return;
        }
        class7 var3 = class23.field321[arg0];
        class17 var4 = new class17(var3.method167(class10.field191, class34.field415, -124));
        var4.method133(false);
        class17 var5 = new class17(var3.method167(class8.field177, class34.field415, -124));
        this.field48 = var5.method134((byte) 86);
        for (int var6 = 0; var6 < this.field48; var6++) {
            this.field14[var6] = var5.method133(false);
            this.field9[var6] = var5.method134((byte) 48);
            this.field32[var6] = var5.method134((byte) 114);
            this.field39[var6] = var5.method130(false);
            class26 var7 = this.field14[var6].method201(21033, 47, 32);
            int var8 = this.field21.method142(var7);
            if (this.field11 < var8) {
                this.field11 = var8;
            }
        }
        class14.field230 = new class1();
        class14.field230.method26(class23.field321[arg0], -1);
        this.field6 = 180;
        class26.field352 = class34.field411;
        this.field59 = 503 - this.field6 - 20;
        this.field27 = class16.field246 * this.field6 / class34.field408;
        this.field19 = 635 - this.field27 - 5;
        class23.field320 = class11.field207;
        this.field29 = new class13(this.field27, this.field6);
        this.field29.method104();
        this.method13(0, 0, this.field6, 0, class34.field408, 64, class16.field246, 0, this.field27);
        class12.method93(0, 0, this.field27, this.field6, 0);
        class12.method93(1, 1, this.field27 - 2, this.field6 + -2, this.field13);
        class11.field210.method56(-74);
    }
}
