import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
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
public class mapview extends class34 {

    @OriginalMember(owner = "mapview!mapview", name = "D", descriptor = "I")
    private int field284 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "y", descriptor = "I")
    private int field279 = 10;

    @OriginalMember(owner = "mapview!mapview", name = "L", descriptor = "Z")
    private boolean field292 = false;

    @OriginalMember(owner = "mapview!mapview", name = "B", descriptor = "I")
    private int field282 = this.field292 ? 83 : 70;

    @OriginalMember(owner = "mapview!mapview", name = "s", descriptor = "I")
    private int field273 = this.field292 ? 220 : 79;

    @OriginalMember(owner = "mapview!mapview", name = "K", descriptor = "Z")
    private boolean field291 = false;

    @OriginalMember(owner = "mapview!mapview", name = "t", descriptor = "I")
    private int field274 = 23;

    @OriginalMember(owner = "mapview!mapview", name = "T", descriptor = "Lna;")
    private class26 field299 = this.field292 ? class22.field233 : class22.field233;

    @OriginalMember(owner = "mapview!mapview", name = "hb", descriptor = "Z")
    private boolean field313 = false;

    @OriginalMember(owner = "mapview!mapview", name = "db", descriptor = "I")
    private int field309 = -20;

    @OriginalMember(owner = "mapview!mapview", name = "O", descriptor = "I")
    private int field294 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "q", descriptor = "I")
    private int field271 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "jb", descriptor = "I")
    private int field315 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "Y", descriptor = "Lna;")
    private class26 field304 = this.field292 ? class5.field65 : class5.field65;

    @OriginalMember(owner = "mapview!mapview", name = "cb", descriptor = "Lna;")
    private class26 field308 = this.field292 ? class18.field196 : class18.field196;

    @OriginalMember(owner = "mapview!mapview", name = "W", descriptor = "I")
    private int field302 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "U", descriptor = "I")
    private int field300 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "u", descriptor = "I")
    private int field275 = -1;

    @OriginalMember(owner = "mapview!mapview", name = "I", descriptor = "I")
    private int field289 = 5;

    @OriginalMember(owner = "mapview!mapview", name = "pb", descriptor = "I")
    private int field321 = 450;

    @OriginalMember(owner = "mapview!mapview", name = "sb", descriptor = "I")
    private int field324 = -1;

    @OriginalMember(owner = "mapview!mapview", name = "x", descriptor = "I")
    private int field278 = 8943445;

    @OriginalMember(owner = "mapview!mapview", name = "lb", descriptor = "I")
    private int field317 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "Q", descriptor = "I")
    private int field296 = 10027008;

    @OriginalMember(owner = "mapview!mapview", name = "ob", descriptor = "I")
    private int field320 = 40;

    @OriginalMember(owner = "mapview!mapview", name = "nb", descriptor = "I")
    private int field319 = 500;

    @OriginalMember(owner = "mapview!mapview", name = "Db", descriptor = "[I")
    private int[] field335 = new int[this.field319];

    @OriginalMember(owner = "mapview!mapview", name = "F", descriptor = "I")
    private int field286 = 33;

    @OriginalMember(owner = "mapview!mapview", name = "ib", descriptor = "[Lna;")
    private class26[] field314 = new class26[this.field319];

    @OriginalMember(owner = "mapview!mapview", name = "o", descriptor = "Lna;")
    private class26 field269 = this.field292 ? class33.field427 : class33.field427;

    @OriginalMember(owner = "mapview!mapview", name = "J", descriptor = "[I")
    private int[] field290 = new int[this.field319];

    @OriginalMember(owner = "mapview!mapview", name = "kb", descriptor = "D")
    private double field316 = 4.0D;

    @OriginalMember(owner = "mapview!mapview", name = "qb", descriptor = "Lna;")
    private class26 field322 = this.field292 ? class6.field72 : class35.field450;

    @OriginalMember(owner = "mapview!mapview", name = "eb", descriptor = "I")
    private int field310 = 30;

    @OriginalMember(owner = "mapview!mapview", name = "H", descriptor = "Lna;")
    private class26 field288 = this.field292 ? class2.field29 : class5.field66;

    @OriginalMember(owner = "mapview!mapview", name = "r", descriptor = "I")
    private int field272 = 471;

    @OriginalMember(owner = "mapview!mapview", name = "bb", descriptor = "I")
    private int field307 = 140;

    @OriginalMember(owner = "mapview!mapview", name = "Hb", descriptor = "I")
    private int field339 = this.field292 ? 76 : 75;

    @OriginalMember(owner = "mapview!mapview", name = "Ab", descriptor = "I")
    private int field332 = this.field292 ? 115 : 102;

    @OriginalMember(owner = "mapview!mapview", name = "p", descriptor = "Lna;")
    private class26 field270 = this.field292 ? class2.field28 : class2.field28;

    @OriginalMember(owner = "mapview!mapview", name = "Eb", descriptor = "Lna;")
    private class26 field336 = this.field292 ? class12.field149 : class12.field152;

    @OriginalMember(owner = "mapview!mapview", name = "xb", descriptor = "I")
    private int field329 = 11141120;

    @OriginalMember(owner = "mapview!mapview", name = "Rb", descriptor = "D")
    private double field349 = 4.0D;

    @OriginalMember(owner = "mapview!mapview", name = "A", descriptor = "I")
    private int field281 = 5;

    @OriginalMember(owner = "mapview!mapview", name = "S", descriptor = "I")
    private int field298 = 5;

    @OriginalMember(owner = "mapview!mapview", name = "Lb", descriptor = "I")
    private int field343 = this.field292 ? 108 : 107;

    @OriginalMember(owner = "mapview!mapview", name = "Ub", descriptor = "I")
    private int field352 = 8912896;

    @OriginalMember(owner = "mapview!mapview", name = "wb", descriptor = "I")
    private int field328 = 7824964;

    @OriginalMember(owner = "mapview!mapview", name = "M", descriptor = "I")
    private int field293 = 170;

    @OriginalMember(owner = "mapview!mapview", name = "Kb", descriptor = "Lna;")
    private class26 field342 = this.field292 ? class18.field201 : class18.field201;

    @OriginalMember(owner = "mapview!mapview", name = "Bb", descriptor = "I")
    private int field333 = 50;

    @OriginalMember(owner = "mapview!mapview", name = "Gb", descriptor = "Lna;")
    private class26 field338 = this.field292 ? class2.field34 : class2.field34;

    @OriginalMember(owner = "mapview!mapview", name = "Pb", descriptor = "Z")
    private boolean field347 = true;

    @OriginalMember(owner = "mapview!mapview", name = "E", descriptor = "[I")
    private int[] field285 = new int[this.field319];

    @OriginalMember(owner = "mapview!mapview", name = "Zb", descriptor = "I")
    private int field357 = -1;

    @OriginalMember(owner = "mapview!mapview", name = "Qb", descriptor = "I")
    private int field348 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "Mb", descriptor = "I")
    private int field344 = this.field333 + this.field279;

    @OriginalMember(owner = "mapview!mapview", name = "Vb", descriptor = "I")
    private int field353 = 6706483;

    @OriginalMember(owner = "mapview!mapview", name = "Xb", descriptor = "Lna;")
    private class26 field355 = this.field292 ? class39.field513 : class39.field513;

    @OriginalMember(owner = "mapview!mapview", name = "ac", descriptor = "Z")
    private boolean field358 = false;

    @OriginalMember(owner = "mapview!mapview", name = "Yb", descriptor = "I")
    private int field356 = this.field292 ? 252 : 111;

    @OriginalMember(owner = "mapview!mapview", name = "fb", descriptor = "Lna;")
    private class26 field311 = this.field292 ? class32.field420 : class32.field420;

    @OriginalMember(owner = "mapview!mapview", name = "C", descriptor = "Lna;")
    public static class26 field283 = class6.method40("download", 48);

    @OriginalMember(owner = "mapview!mapview", name = "Jb", descriptor = "Lna;")
    public static class26 field341 = class6.method40("Food Shop", 48);

    @OriginalMember(owner = "mapview!mapview", name = "Ib", descriptor = "Lna;")
    public static class26 field340 = class6.method40("Requesting", 48);

    @OriginalMember(owner = "mapview!mapview", name = "Nb", descriptor = "Lna;")
    public static class26 field345 = class6.method40("Spice Shop", 48);

    @OriginalMember(owner = "mapview!mapview", name = "w", descriptor = "I")
    private int field277;

    @OriginalMember(owner = "mapview!mapview", name = "V", descriptor = "I")
    private int field301;

    @OriginalMember(owner = "mapview!mapview", name = "Z", descriptor = "I")
    private int field305;

    @OriginalMember(owner = "mapview!mapview", name = "tb", descriptor = "I")
    private static int field325;

    @OriginalMember(owner = "mapview!mapview", name = "ub", descriptor = "I")
    private int field326;

    @OriginalMember(owner = "mapview!mapview", name = "vb", descriptor = "I")
    private int field327;

    @OriginalMember(owner = "mapview!mapview", name = "yb", descriptor = "I")
    private int field330;

    @OriginalMember(owner = "mapview!mapview", name = "Cb", descriptor = "I")
    private int field334;

    @OriginalMember(owner = "mapview!mapview", name = "Tb", descriptor = "I")
    private int field351;

    @OriginalMember(owner = "mapview!mapview", name = "Sb", descriptor = "J")
    public static long field350;

    @OriginalMember(owner = "mapview!mapview", name = "Ob", descriptor = "Lma;")
    private class24 field346;

    @OriginalMember(owner = "mapview!mapview", name = "mb", descriptor = "Lna;")
    private class26 field318;

    @OriginalMember(owner = "mapview!mapview", name = "n", descriptor = "Lp;")
    private class29 field268;

    @OriginalMember(owner = "mapview!mapview", name = "v", descriptor = "Lp;")
    private class29 field276;

    @OriginalMember(owner = "mapview!mapview", name = "G", descriptor = "Lp;")
    private class29 field287;

    @OriginalMember(owner = "mapview!mapview", name = "R", descriptor = "Lp;")
    private class29 field297;

    @OriginalMember(owner = "mapview!mapview", name = "X", descriptor = "Lp;")
    private class29 field303;

    @OriginalMember(owner = "mapview!mapview", name = "rb", descriptor = "Lp;")
    private class29 field323;

    @OriginalMember(owner = "mapview!mapview", name = "Fb", descriptor = "Lp;")
    private class29 field337;

    @OriginalMember(owner = "mapview!mapview", name = "Wb", descriptor = "Lp;")
    private class29 field354;

    @OriginalMember(owner = "mapview!mapview", name = "P", descriptor = "Lq;")
    private class30 field295;

    @OriginalMember(owner = "mapview!mapview", name = "z", descriptor = "Ljava/awt/Font;")
    public static Font field280;

    @OriginalMember(owner = "mapview!mapview", name = "bc", descriptor = "Z")
    public static boolean field359;

    @OriginalMember(owner = "mapview!mapview", name = "gb", descriptor = "[Lna;")
    private class26[] field312;

    @OriginalMember(owner = "mapview!mapview", name = "zb", descriptor = "[Lna;")
    private class26[] field331;

    @OriginalMember(owner = "mapview!mapview", name = "ab", descriptor = "[Lq;")
    public static class30[] field306;

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(BLna;Ljava/lang/String;)Z", line = 5)
    private final boolean method146(byte arg0, class26 arg1, String arg2) {
        byte[] var4 = null;
        if (!class23.field237) {
            if (class4.field51 != null) {
                try {
                    var4 = this.method147(class4.field51 + "/" + arg2, 125);
                    if (!this.method162(76, var4, arg2)) {
                        var4 = null;
                    }
                    if (var4 != null) {
                        class10.field112 = new class8(var4, false, true);
                        return true;
                    }
                } catch (IOException var11) {
                    var4 = null;
                }
            }
            class23.field237 = true;
        }
        if (var4 == null) {
            boolean var6 = this.method163(125, arg1, arg2);
            if (!var6) {
                return false;
            }
            var4 = class26.field376;
            class26.field376 = null;
        }
        if (var4 == null) {
            class23.field237 = false;
            return true;
        }
        if (class4.field51 != null && var4 != null) {
            try {
                this.method167(true, class4.field51 + "/" + arg2, var4);
            } catch (IOException var10) {
            }
        }
        if (arg0 >= -78) {
            this.method155(75, -2);
        }
        try {
            class10.field112 = new class8(var4, false, true);
            class23.field237 = false;
            return true;
        } catch (IOException var9) {
            throw class14.method87(var9, "monkey feet");
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "b", descriptor = "(Ljava/lang/String;I)[B", line = 76)
    private final byte[] method147(String arg0, int arg1) throws IOException {
        int var3 = -67 % ((arg1 + 33) / 62);
        File var4 = new File(arg0);
        if (!var4.exists()) {
            return null;
        }
        int var5 = (int) var4.length();
        byte[] var6 = new byte[var5];
        DataInputStream var7 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg0)));
        var7.readFully(var6, 0, var5);
        var7.close();
        return var6;
    }

    @OriginalMember(owner = "mapview!mapview", name = "i", descriptor = "(I)V", line = 100)
    private final void method148(int arg0) {
        if (class39.field514.length == 1) {
            class19.field205 = 0;
        } else {
            if (class9.field104 < 0) {
                class19.field205 = this.method152(class19.field205, 79);
            } else {
                class19.field205 = class9.field104;
            }
            class9.field104 = this.method152(class19.field205, arg0 ^ 0xFFFFFFAA);
        }
        this.method155(class19.field205, 121);
        if (arg0 != -48) {
            this.field314 = null;
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "c", descriptor = "(Z)Z", line = 125)
    private static final boolean method149(boolean arg0) {
        class7 var1 = class8.field93;
        synchronized (class8.field93) {
            if (class6.field69 == class19.field204) {
                return false;
            }
            class31.field411 = class22.field224[class6.field69];
            class38.field477 = class12.field151[class6.field69];
            if (arg0) {
                method149(false);
            }
            class6.field69 = class6.field69 + 1 & 0x7F;
            return true;
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "j", descriptor = "(I)Z", line = 158)
    private final boolean method150(int arg0) {
        if (arg0 != -6226) {
            return false;
        }
        if (class18.field197 == 0) {
            this.method156((byte) 79);
            class18.field197 = 1;
        }
        if (class18.field197 == 1) {
            class4.field48 = 25;
            boolean var2 = this.method146((byte) -104, this.field308, "main_file_cache.idx0");
            if (!var2) {
                return false;
            }
            class10.field114 = class10.field112;
            class10.field112 = null;
            if (class10.field114 == null) {
                throw new RuntimeException("T1");
            }
            class18.field197 = 2;
        }
        if (class18.field197 == 2) {
            class18.field197 = 10;
            class39.field514 = new class8[1];
        }
        if (class18.field197 == 10) {
            class4.field48 = 50;
            boolean var3 = this.method146((byte) -116, this.field355, "main_file_cache.dat0");
            if (!var3) {
                return false;
            }
            class39.field514[0] = class10.field112;
            class10.field112 = null;
            if (class39.field514[0] == null) {
                throw new RuntimeException("T2");
            }
            class18.field197 = 20;
        }
        if (class18.field197 != 20) {
            return false;
        }
        class1.field19 = class9.method60(25691, class22.field235, class10.field114, class6.field76);
        field306 = class19.method116(class10.field120, class22.field235, 119, class10.field114);
        this.field346 = class13.method81(class11.field135, (byte) 50, class22.field235, class10.field114);
        this.field276 = new class29(11, true, this);
        this.field268 = new class29(12, true, this);
        this.field323 = new class29(14, true, this);
        this.field303 = new class29(17, true, this);
        this.field297 = new class29(19, true, this);
        this.field337 = new class29(22, true, this);
        this.field287 = new class29(26, true, this);
        this.field354 = new class29(30, true, this);
        class18.field200 = this.field270;
        class4.field48 = 100;
        class22.method131(class4.field48, 3, null, class18.field200);
        this.field320 = this.field346.method138(this.field322) + 20;
        this.method148(-48);
        class26[] var4 = this.field331;
        for (int var5 = 0; var5 < var4.length; var5++) {
            class26 var6 = var4[var5];
            int var7 = this.field346.method138(var6);
            if (var7 > this.field277) {
                this.field277 = var7;
            }
        }
        this.field307 = this.field277 + 18 + 16;
        if (this.field307 > 140) {
            int var8 = this.field301 - this.field307 - this.field298;
            this.field279 = var8 / 25;
            this.field333 = this.field279 * 5;
            this.field344 = this.field333 + this.field279;
            int var9 = var8 - this.field279 * 25;
            this.field293 = this.field298 + this.field307 + var9 / 2 + this.field279;
        }
        return true;
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(IIIIIIIII)V", line = 279)
    private final void method151(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class12.field141.method32(arg0, arg2, arg6, arg5, (byte) -127, arg3, arg1, arg7, arg4);
        int var10 = -25 % ((32 - arg8) / 56);
        if (arg1 - arg3 > arg0 - arg2) {
            return;
        }
        class12.field141.method35(arg2, arg1, 1758997384, arg6, this.field349, arg7, arg0, arg5, arg3, arg4);
        class12.field141.method34(arg6, 2, arg2, arg7, arg0, arg1, arg5, arg4, arg3);
        class12.field141.method26(arg4, arg7, this.field357, arg1, arg5, arg2, arg3, this.field300, arg0, arg6, (byte) 90);
        if (this.field349 == this.field316 && class5.field55) {
            for (int var11 = 0; var11 < this.field302; var11++) {
                int var12 = this.field335[var11];
                int var13 = var12 - class32.field418;
                int var14 = this.field285[var11];
                int var15 = class35.field453 + class34.field446 - var14;
                int var16 = arg7 + (var15 - arg5) * (-arg7 + arg4) / (arg6 - arg5);
                int var17 = (arg0 - arg2) * (-arg3 + var13) / (arg1 - arg3) + arg2;
                int var18 = this.field290[var11];
                int var19 = 16777215;
                class29 var20 = null;
                if (var18 == 0) {
                    if (this.field349 == 3.0D) {
                        var20 = this.field276;
                    }
                    if (this.field349 == 4.0D) {
                        var20 = this.field268;
                    }
                    if (this.field349 == 6.0D) {
                        var20 = this.field323;
                    }
                    if (this.field349 == 8.0D) {
                        var20 = this.field303;
                    }
                }
                if (var18 == 1) {
                    if (this.field349 == 3.0D) {
                        var20 = this.field323;
                    }
                    if (this.field349 == 4.0D) {
                        var20 = this.field303;
                    }
                    if (this.field349 == 6.0D) {
                        var20 = this.field297;
                    }
                    if (this.field349 == 8.0D) {
                        var20 = this.field337;
                    }
                }
                if (var18 == 2) {
                    var19 = 16755200;
                    if (this.field349 == 3.0D) {
                        var20 = this.field297;
                    }
                    if (this.field349 == 4.0D) {
                        var20 = this.field337;
                    }
                    if (this.field349 == 6.0D) {
                        var20 = this.field287;
                    }
                    if (this.field349 == 8.0D) {
                        var20 = this.field354;
                    }
                }
                if (var20 != null) {
                    class26 var21 = this.field314[var11];
                    int var22 = 1;
                    for (int var23 = 0; var23 < var21.method197((byte) -112); var23++) {
                        if (var21.method188(var23, (byte) 98) == 47) {
                            var22++;
                        }
                    }
                    int var24 = var16 - var20.method216() * (var22 - 1) / 2;
                    int var25 = var24 + var20.method212() / 2;
                    while (true) {
                        int var26 = var21.method196((byte) 107, 47);
                        if (var26 == -1) {
                            var20.method211(var21, var17, var25, var19, true);
                            break;
                        }
                        class26 var27 = var21.method184((byte) 95, 0, var26);
                        var20.method211(var27, var17, var25, var19, true);
                        var25 += var20.method216();
                        var21 = var21.method186(var26 + 1, 112);
                    }
                }
            }
        }
        if (!class10.field115) {
            return;
        }
        for (int var28 = class32.field418 / 64; var28 < (class32.field418 + class13.field160) / 64; var28++) {
            for (int var29 = class35.field453 / 64; var29 < (class35.field453 + class34.field446) / 64; var29++) {
                int var30 = var28 * 64;
                int var31 = var30 - class32.field418;
                int var32 = var29 * 64;
                int var33 = class35.field453 + class34.field446 - var32;
                int var34 = (var31 - arg3) * (-arg2 + arg0) / (arg1 - arg3) + arg2;
                int var35 = (arg4 - arg7) * (-arg5 + -64 + var33) / (arg6 - arg5) + arg7;
                int var36 = (var31 + 64 - arg3) * (-arg2 + arg0) / (arg1 - arg3) + arg2;
                int var37 = (arg4 - arg7) * (-arg5 + var33) / (arg6 - arg5) + arg7;
                class15.method93(var34, var35, var36 - var34, -var35 + var37, 16777215);
                this.field346.method139(class20.method121(new class26[] { class7.method47(var28, (byte) -50), class6.field79, class7.method47(var29, (byte) -50) }, (byte) -111), var36 - 5, var37 + -5, 16777215);
                if (var28 == 33 && var29 >= 71 && var29 <= 73) {
                    this.field346.method137(class8.field89, (var34 + var36) / 2, (var35 + var37) / 2, 16711680);
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(II)I", line = 466)
    private final int method152(int arg0, int arg1) {
        if (arg1 < 78) {
            this.field349 = 1.3165128877445265D;
        }
        arg0++;
        if (arg0 >= class39.field514.length) {
            arg0 = 0;
        }
        return arg0;
    }

    @OriginalMember(owner = "mapview!mapview", name = "e", descriptor = "(I)V", line = 495)
    public final void method153(int arg0) {
        if (class19.field202) {
            class38.method251(arg0, class4.field44);
            class33.method236((byte) -104, class4.field44);
            this.method239(127);
            class22.method126(class4.field44, (byte) 93);
            class38.method252(class4.field44, 103);
        }
        class14.method86(32);
        class6.method44(2);
        if (!class22.field231) {
            return;
        }
        if (class8.field92[96]) {
            this.field347 = true;
            class11.field134 = -1;
            class1.field10 = (int) ((double) class1.field10 - 16.0D / this.field349);
        }
        if (class8.field92[97]) {
            class1.field10 = (int) (16.0D / this.field349 + (double) class1.field10);
            class11.field134 = -1;
            this.field347 = true;
        }
        if (class8.field92[98]) {
            class11.field134 = -1;
            class7.field84 = (int) ((double) class7.field84 - 16.0D / this.field349);
            this.field347 = true;
        }
        if (class8.field92[99]) {
            class11.field134 = -1;
            class7.field84 = (int) (16.0D / this.field349 + (double) class7.field84);
            this.field347 = true;
        }
        while (true) {
            while (true) {
                while (method149(false)) {
                    if (!class39.field508 || !class8.field91) {
                        if (class38.field477 == this.field332 || class38.field477 == this.field282) {
                            this.field347 = true;
                            class8.field91 = true;
                        }
                        if (class38.field477 == 49) {
                            this.field316 = 3.0D;
                            this.field347 = true;
                        }
                        if (class38.field477 == 50) {
                            this.field316 = 4.0D;
                            this.field347 = true;
                        }
                        if (class38.field477 == 51) {
                            this.field347 = true;
                            this.field316 = 6.0D;
                        }
                        if (class38.field477 == 52) {
                            this.field347 = true;
                            this.field316 = 8.0D;
                        }
                        if (class38.field477 == this.field343 || class38.field477 == this.field339) {
                            this.field291 = !this.field291;
                            this.field347 = true;
                        }
                        if (class38.field477 == this.field356 || class38.field477 == this.field273) {
                            this.field358 = !this.field358;
                            this.field347 = true;
                        }
                    } else if (class31.field411 == 0) {
                        this.field347 = true;
                        class8.field91 = false;
                        this.field318.method180(true, 0);
                        class26.field369 = -1;
                    } else if (class31.field411 == 84) {
                        this.field351 = class7.field84 << 16;
                        class11.field134 = class26.field369;
                        class8.field91 = false;
                        this.field326 = class1.field10 << 16;
                        this.field318.method180(true, 0);
                        class26.field369 = -1;
                        this.field347 = true;
                    } else {
                        boolean var2 = false;
                        if (class31.field411 == 85) {
                            if (this.field318.method197((byte) -112) > 0) {
                                this.field318.method180(true, this.field318.method197((byte) -112) - 1);
                                this.field347 = true;
                                if (this.field318.method197((byte) -112) == 0) {
                                    class26.field369 = -1;
                                } else {
                                    var2 = true;
                                }
                            }
                        } else if (class38.field477 != -1 && this.field318.method197((byte) -112) <= class26.field373) {
                            this.field318.method178(class38.field477, 116);
                            this.field347 = true;
                        }
                        if (this.field318.method197((byte) -112) > 0) {
                            for (int var3 = 0; var3 < this.field302; var3++) {
                                if (this.field314[var3].method197((byte) -112) >= this.field318.method197((byte) -112)) {
                                    class26 var4 = this.field318.method190(arg0 - 125);
                                    class26 var5 = this.field314[var3].method195(0, 47, 32).method184((byte) -119, 0, this.field318.method197((byte) -112)).method190(44);
                                    if (var4.method191((byte) 93, var5) == 0) {
                                        this.field347 = true;
                                        class26.field369 = var3;
                                        var2 = true;
                                        break;
                                    }
                                }
                            }
                            if (!var2) {
                                this.field318.method180(true, this.field318.method197((byte) -112) - 1);
                            }
                        }
                    }
                }
                int var6 = class1.field24;
                int var7 = class35.field455;
                int var8 = class6.field74;
                int var9 = class10.field121;
                int var10 = class22.field232;
                int var11 = class20.field215;
                if (var6 == 1) {
                    this.field315 = var7;
                    this.field284 = class7.field84;
                    this.field294 = class1.field10;
                    this.field348 = var10;
                    if (class39.field514.length == 1) {
                        if (var7 > this.field293 && var7 < this.field293 + this.field333 && var10 > this.field272 && var10 < this.field310 + this.field272) {
                            this.field316 = 3.0D;
                            this.field315 = -1;
                        }
                        if (var7 > this.field344 + this.field293 && this.field344 + this.field333 + this.field293 > var7 && this.field272 < var10 && var10 < this.field310 + this.field272) {
                            this.field316 = 4.0D;
                            this.field315 = -1;
                        }
                        if (this.field344 * 2 + this.field293 < var7 && var7 < this.field293 + this.field344 * 2 + this.field333 && var10 > this.field272 && var10 < this.field310 + this.field272) {
                            this.field316 = 6.0D;
                            this.field315 = -1;
                        }
                        if (this.field344 * 3 + this.field293 < var7 && this.field333 + this.field293 + this.field344 * 3 > var7 && this.field272 < var10 && var10 < this.field310 + this.field272) {
                            this.field315 = -1;
                            this.field316 = 8.0D;
                        }
                    } else {
                        if (this.field293 < var7 && var7 < this.field333 + this.field293 && this.field272 < var10 && this.field310 + this.field309 + this.field272 > var10) {
                            this.field316 = 3.0D;
                            this.field315 = -1;
                        }
                        if (this.field293 + this.field344 < var7 && this.field293 + this.field344 + this.field333 > var7 && this.field272 < var10 && this.field310 + this.field272 + this.field309 > var10) {
                            this.field315 = -1;
                            this.field316 = 4.0D;
                        }
                        if (this.field344 * 2 + this.field293 < var7 && this.field293 + this.field344 * 2 + this.field333 > var7 && this.field272 < var10 && var10 < this.field272 + this.field309 + this.field310) {
                            this.field316 = 6.0D;
                            this.field315 = -1;
                        }
                        if (this.field344 * 3 + this.field293 < var7 && this.field293 + this.field344 * 3 + this.field333 > var7 && var10 > this.field272 && var10 < this.field310 + this.field309 + this.field272) {
                            this.field315 = -1;
                            this.field316 = 8.0D;
                        }
                        if (var7 > 170 && var7 < 400 && var10 > 483 && var10 < 503) {
                            this.method169(-49, this.field296);
                            this.method154(-32436);
                            this.method148(-48);
                            this.field315 = -1;
                        }
                    }
                    this.field347 = true;
                    if (var7 > this.field298 && this.field286 + this.field321 < var10 && var7 < this.field307 + this.field298 && var10 < 503) {
                        this.field315 = -1;
                        this.field291 = !this.field291;
                    }
                    if (this.field301 < var7 && this.field334 + this.field305 < var10 && var7 < this.field330 + this.field301 && var10 < 503) {
                        this.field358 = !this.field358;
                        this.field315 = -1;
                    }
                    if (this.field291) {
                        if (this.field298 < var7 && var10 > this.field286 && var7 < this.field307 + this.field298 && var10 < this.field286 + this.field321) {
                            this.field315 = -1;
                        }
                        if (this.field298 < var7 && this.field286 < var10 && this.field298 + this.field307 > var7 && this.field286 + 18 > var10 && this.field317 > 0) {
                            this.field317 -= 24;
                        }
                        if (var7 > this.field298 && this.field321 + this.field286 - 18 < var10 && this.field298 + this.field307 > var7 && this.field321 + this.field286 > var10 && this.field317 < 48) {
                            this.field317 += 24;
                        }
                    }
                    this.field313 = false;
                    if (this.field358 && this.field301 < var7 && this.field305 < var10 && this.field330 + this.field301 > var7 && this.field305 + this.field334 > var10) {
                        this.field315 = -1;
                        class1.field10 = (var7 - this.field301) * class13.field160 / this.field330;
                        this.field313 = true;
                        class7.field84 = (var10 - this.field305) * class34.field446 / this.field334;
                    }
                    if (class39.field508 && !class8.field91 && !this.field313 && this.field289 < var7 && this.field281 < var10 && this.field320 + this.field289 > var7 && var10 < this.field281 + this.field274) {
                        class8.field91 = true;
                    }
                }
                if (this.field291) {
                    this.field324 = -1;
                    if (this.field298 < var8 && var8 < this.field307 + this.field298) {
                        int var12 = this.field286 + 5 + 21;
                        int var13 = this.field271;
                        for (int var14 = 0; var14 < 24; var14++) {
                            if (var13 < this.field331.length && this.field331[var13].method179((byte) -17, class8.field97)) {
                                var13++;
                                var14--;
                            } else {
                                if (var11 >= var12 && var12 + 17 > var11) {
                                    if (var6 == 1) {
                                        this.field357 = var13;
                                        this.field300 = 50;
                                    }
                                    this.field324 = var13;
                                }
                                var13++;
                                var12 += 17;
                            }
                        }
                    }
                    if (this.field324 != this.field275) {
                        this.field347 = true;
                        this.field275 = this.field324;
                    }
                }
                if (var9 == 1 && this.field358 && this.field313) {
                    class11.field134 = -1;
                    this.field347 = true;
                    int var15 = var8;
                    int var16 = var11;
                    if (var11 < this.field305) {
                        var16 = this.field305;
                    } else if (this.field334 + this.field305 < var11) {
                        var16 = this.field334 + this.field305;
                    }
                    class7.field84 = (var16 - this.field305) * class34.field446 / this.field334;
                    if (this.field301 > var8) {
                        var15 = this.field301;
                    } else if (var8 > this.field330 + this.field301) {
                        var15 = this.field330 + this.field301;
                    }
                    class1.field10 = (var15 - this.field301) * class13.field160 / this.field330;
                } else {
                    this.field313 = false;
                }
                if (var9 == 1 && this.field315 != -1) {
                    this.field347 = true;
                    class7.field84 = (int) ((double) (this.field348 - var11) * 2.0D / this.field316) + this.field284;
                    class11.field134 = -1;
                    class1.field10 = (int) ((double) (this.field315 - var8) * 2.0D / this.field316) + this.field294;
                }
                if (this.field316 > this.field349) {
                    this.field347 = true;
                    this.field349 += this.field349 / 30.0D;
                    if (this.field316 < this.field349) {
                        this.field349 = this.field316;
                    }
                }
                if (this.field349 > this.field316) {
                    this.field349 -= this.field349 / 30.0D;
                    if (this.field349 < this.field316) {
                        this.field349 = this.field316;
                    }
                    this.field347 = true;
                }
                if (this.field317 > this.field271) {
                    this.field271++;
                    this.field347 = true;
                }
                if (this.field317 < this.field271) {
                    this.field347 = true;
                    this.field271--;
                }
                if (this.field300 > 0) {
                    this.field347 = true;
                    this.field300--;
                }
                if (class11.field134 >= arg0) {
                    class32.field421 = this.field335[class11.field134] - class32.field418;
                    byte var17 = 4;
                    class20.field216 = class35.field453 + class34.field446 - this.field285[class11.field134];
                    int var18 = class32.field421 - (int) (635.0D / this.field349);
                    int var19 = class20.field216 + (int) (503.0D / this.field349);
                    int var20 = class20.field216 - (int) (503.0D / this.field349);
                    this.field347 = true;
                    if (var20 < 48) {
                        class20.field216 = (int) (503.0D / this.field349) + 48;
                    }
                    int var21 = (int) (635.0D / this.field349) + class32.field421;
                    if (class34.field446 - 48 < var19) {
                        class20.field216 = class34.field446 - (int) (503.0D / this.field349) - 48;
                    }
                    if (var18 < 48) {
                        class32.field421 = (int) (635.0D / this.field349) + 48;
                    }
                    class20.field216 <<= 0x10;
                    if (class13.field160 - 48 < var21) {
                        class32.field421 = class13.field160 - (int) (635.0D / this.field349) - 48;
                    }
                    int var22 = class20.field216 - this.field351;
                    class32.field421 <<= 0x10;
                    int var23 = class32.field421 - this.field326;
                    if (var23 >> var17 == 0 && var22 >> var17 == 0) {
                        class11.field134 = -1;
                    } else {
                        this.field326 += var23 >> var17;
                        class1.field10 = this.field326 >> 16;
                        this.field351 += var22 >> var17;
                        class7.field84 = this.field351 >> 16;
                    }
                }
                int var24 = class7.field84 - (int) (503.0D / this.field349);
                int var25 = class1.field10 - (int) (635.0D / this.field349);
                int var26 = (int) (635.0D / this.field349) + class1.field10;
                if (var25 < 48) {
                    class1.field10 = (int) (635.0D / this.field349) + 48;
                }
                int var27 = (int) (503.0D / this.field349) + class7.field84;
                if (var24 < 48) {
                    class7.field84 = (int) (503.0D / this.field349) + 48;
                }
                if (var27 > class34.field446 - 48) {
                    class7.field84 = class34.field446 - (int) (503.0D / this.field349) - 48;
                }
                if (class13.field160 - 48 < var26) {
                    class1.field10 = class13.field160 - (int) (635.0D / this.field349) - 48;
                }
                return;
            }
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "k", descriptor = "(I)V", line = 1051)
    private final void method154(int arg0) {
        class4.field54 = false;
        try {
            if (arg0 != -32436) {
                this.method161(98, 52, -74, 80, -97, -29, -38, -43, null);
            }
            Graphics var2 = class4.field44.getGraphics();
            class12.field153.method130(0, 0, var2, (byte) 28);
        } catch (Exception var4) {
            class4.field44.repaint();
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "b", descriptor = "(II)V", line = 1085)
    private final void method155(int arg0, int arg1) {
        if (arg1 < 115 || class39.field514.length <= arg0) {
            return;
        }
        class8 var3 = class39.field514[arg0];
        class10 var4 = new class10(var3.method3((byte) 3, class12.field139, class22.field227));
        var4.method63(15596);
        class10 var5 = new class10(var3.method3((byte) 3, class31.field413, class22.field227));
        this.field302 = var5.method68((byte) 117);
        for (int var6 = 0; var6 < this.field302; var6++) {
            this.field314[var6] = var5.method63(15596);
            this.field335[var6] = var5.method68((byte) -55);
            this.field285[var6] = var5.method68((byte) -111);
            this.field290[var6] = var5.method66(37);
            class26 var7 = this.field314[var6].method195(0, 47, 32);
            int var8 = this.field346.method138(var7);
            if (var8 > this.field327) {
                this.field327 = var8;
            }
            int var9 = this.field346.method138(this.field299);
            if (var9 > this.field327) {
                this.field327 = var9;
            }
        }
        class12.field141 = new class5();
        class12.field141.method30(125, class39.field514[arg0]);
        class1.field10 = class23.field236;
        this.field334 = 180;
        this.field330 = class13.field160 * this.field334 / class34.field446;
        class7.field84 = class31.field400;
        this.field301 = 630 - this.field330;
        this.field305 = 503 - this.field334 - 20;
        this.field295 = new class30(this.field330, this.field334);
        this.field295.method222();
        this.method151(this.field330, class13.field160, 0, 0, this.field334, 0, class34.field446, 0, 89);
        class15.method93(0, 0, this.field330, this.field334, 0);
        class15.method93(1, 1, this.field330 - 2, this.field334 + -2, this.field278);
        class12.field153.method247(-81);
    }

    @OriginalMember(owner = "mapview!mapview", name = "c", descriptor = "(B)V", line = 1161)
    private final void method156(byte arg0) {
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
                        class4.field51 = var8 + var6 + "/rsmap/";
                        return;
                    }
                }
            } catch (Exception var14) {
            }
        }
        if (arg0 != 79) {
            this.init();
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(Z[BII)I", line = 1260)
    public static final int method157(boolean arg0, byte[] arg1, int arg2, int arg3) {
        if (arg0) {
            method157(true, null, -41, 82);
        }
        int var4 = -1;
        for (int var5 = arg2; var5 < arg3; var5++) {
            var4 = class12.field144[(var4 ^ arg1[var5]) & 0xFF] ^ var4 >>> 8;
        }
        return ~var4;
    }

    @OriginalMember(owner = "mapview!mapview", name = "f", descriptor = "(I)V", line = 1300)
    public final void method158(int arg0) {
        boolean var2 = false;
        class19.method117(arg0 ^ 0xFFFFD7D4);
        class22.method126(class4.field44, (byte) -123);
        class38.method252(class4.field44, -48);
        class18.field200 = this.field311;
        boolean var3 = true;
        this.field331 = class9.method57(false);
        this.field312 = class18.method112((byte) -102);
        if (var3) {
            byte var4 = 0;
            if (this.field312.length == 13) {
                byte var10002 = var4;
                int var5 = var4 + 1;
                this.field288 = this.field312[var10002];
                int var18 = var5;
                int var6 = var5 + 1;
                this.field322 = this.field312[var18];
                int var19 = var6;
                int var7 = var6 + 1;
                this.field336 = this.field312[var19];
                int var20 = var7;
                int var8 = var7 + 1;
                this.field269 = this.field312[var20];
                int var21 = var8;
                int var9 = var8 + 1;
                this.field338 = this.field312[var21];
                int var22 = var9;
                int var10 = var9 + 1;
                this.field311 = this.field312[var22];
                int var23 = var10;
                int var11 = var10 + 1;
                this.field270 = this.field312[var23];
                int var24 = var11;
                int var12 = var11 + 1;
                this.field299 = this.field312[var24];
                int var25 = var12;
                int var13 = var12 + 1;
                this.field304 = this.field312[var25];
                int var26 = var13;
                int var14 = var13 + 1;
                this.field308 = this.field312[var26];
                int var27 = var14;
                int var15 = var14 + 1;
                this.field355 = this.field312[var27];
                int var16 = var15 + 1;
                int var28 = var16;
                int var17 = var16 + 1;
                this.field342 = this.field312[var28];
                this.field273 = this.field288.method188(0, (byte) 98);
                this.field282 = this.field322.method188(0, (byte) 98);
                this.field339 = this.field336.method188(0, (byte) 98);
                this.field356 = this.method159(this.field273, 109);
                this.field332 = this.method159(this.field282, 123);
                this.field343 = this.method159(this.field339, -22);
            } else {
                class19.method115(true, new class26[] { class31.field403 });
            }
        }
        this.field318 = class32.method228(arg0, (byte) 121);
    }

    @OriginalMember(owner = "mapview!mapview", name = "c", descriptor = "(II)I", line = 1355)
    private final int method159(int arg0, int arg1) {
        int var3 = 19 / ((40 - arg1) / 61);
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
            return class25.method172(arg0, false);
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "init", descriptor = "()V", line = 1412)
    public final void init() {
        if (this.method243((byte) -115)) {
            this.method240(0, 503, class2.field35.method182(this, 0).method175((byte) 112), 32, 635);
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(Ljava/awt/Component;IBI)Lsa;", line = 1462)
    public static final class35 method160(Component arg0, int arg1, byte arg2, int arg3) {
        try {
            Class var4 = Class.forName("pa");
            class35 var5 = (class35) var4.getDeclaredConstructor().newInstance();
            var5.method127(arg1, true, arg0, arg3);
            if (arg2 <= 51) {
                method149(true);
            }
            return var5;
        } catch (Throwable var8) {
            class22 var7 = new class22();
            var7.method127(arg1, true, arg0, arg3);
            return var7;
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(IIIIIIIILna;)V", line = 1498)
    private final void method161(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class26 arg8) {
        class15.method93(arg1, arg5, arg3, arg6, 0);
        int var10 = arg1 + 1;
        int var12 = arg5 + 1;
        int var13 = arg6 - 2;
        int var11 = arg3 - 2;
        class15.method94(var10, var12, var11, var13, arg7);
        if (arg2 != 8966) {
            return;
        }
        class15.method98(var10, var12, var11, arg4);
        class15.method88(var10, var12, var13, arg4);
        class15.method98(var10, var12 + var13 - 1, var11, arg0);
        class15.method88(var11 + var10 - 1, var12, var13, arg0);
        this.field346.method137(arg8, var10 + var11 / 2 + 1, var12 - -(var13 / 2) + 4 + 1, 0);
        this.field346.method137(arg8, var11 / 2 + var10, var12 - (-(var13 / 2) + -4), 16777215);
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(I[BLjava/lang/String;)Z", line = 1579)
    private final boolean method162(int arg0, byte[] arg1, String arg2) {
        if (arg1 == null) {
            return false;
        }
        try {
            MessageDigest var4 = MessageDigest.getInstance("SHA");
            var4.reset();
            if (arg0 != 76) {
                this.method154(64);
            }
            var4.update(arg1);
            byte[] var5 = var4.digest();
            if (arg2 == "main_file_cache.dat0") {
                if (var5[0] != -4 || var5[1] != 94 || var5[2] != -111 || var5[3] != -30 || var5[4] != 63 || var5[5] != 76 || var5[6] != 94 || var5[7] != -5 || var5[8] != 110 || var5[9] != -108 || var5[10] != -77 || var5[11] != -99 || var5[12] != 87 || var5[13] != -65 || var5[14] != 34 || var5[15] != -39 || var5[16] != 83 || var5[17] != -45 || var5[18] != 25 || var5[19] != 20) {
                    return false;
                }
            } else if (var5[0] != 65 || var5[1] != 89 || var5[2] != -58 || var5[3] != -50 || var5[4] != 116 || var5[5] != 117 || var5[6] != 59 || var5[7] != -103 || var5[8] != 18 || var5[9] != -89 || var5[10] != 45 || var5[11] != 126 || var5[12] != 80 || var5[13] != 10 || var5[14] != -103 || var5[15] != 75 || var5[16] != -21 || var5[17] != 109 || var5[18] != -27 || var5[19] != 126) {
                return false;
            }
            return true;
        } catch (Exception var7) {
            this.method241("sha", 4196);
            return false;
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(ILna;Ljava/lang/String;)Z", line = 1633)
    private final boolean method163(int arg0, class26 arg1, String arg2) {
        try {
            if (class9.field108 == null) {
                String var4;
                if (arg2 == "main_file_cache.dat0") {
                    var4 = "worldmap.main.js5?crc=-1643325478";
                } else if (arg2 == "main_file_cache.dat1") {
                    var4 = "worldmap.dungeon.js5?crc=-888249404";
                } else if (arg2 == "main_file_cache.dat2") {
                    var4 = "worldmap.extra.js5?crc=-1023008918";
                } else {
                    var4 = "mapview.sprites.js5?crc=-1203441070";
                }
                class18.field200 = class20.method121(new class26[] { this.field304, class13.field159, arg1 }, (byte) -95);
                class9.field108 = new DataInputStream((new URL(this.getCodeBase(), var4)).openStream());
                int var5;
                if (arg2 == "main_file_cache.dat0") {
                    var5 = 414246;
                } else if (arg2 == "main_file_cache.dat1") {
                    var5 = 149017;
                } else if (arg2 == "main_file_cache.dat2") {
                    var5 = 123106;
                } else {
                    var5 = 8383;
                }
                class26.field376 = new byte[var5];
                field325 = 0;
                class6.field70 = 0;
            }
            int var6 = class6.field70;
            int var7 = class26.field376.length;
            if (var6 >= var7) {
                class9.field108.close();
                class9.field108 = null;
                if (arg0 < 116) {
                    this.field290 = null;
                }
                if (!this.method162(76, class26.field376, arg2)) {
                    this.method241("download", 4196);
                    class26.field376 = null;
                }
                return true;
            }
            field325++;
            if (field325 >= 1500) {
                throw new IOException();
            }
            DataInputStream var8 = class9.field108;
            int var9 = var8.available();
            if (var9 < 0) {
                throw new EOFException();
            } else if (var9 == 0) {
                return false;
            } else {
                if (var7 - var6 < var9) {
                    var9 = var7 - var6;
                }
                int var10 = var8.read(class26.field376, var6, var9);
                if (var10 < 0) {
                    throw new EOFException();
                } else if (var10 == 0) {
                    return false;
                } else {
                    int var11 = var6 + var10;
                    field325 = 0;
                    int var12 = var11 * 100 / var7;
                    class18.field200 = class20.method121(new class26[] { this.field342, class13.field159, arg1, class4.field45, class7.method47(var12, (byte) -50), class7.field85 }, (byte) -66);
                    class6.field70 = var11;
                    return false;
                }
            }
        } catch (IOException var16) {
            try {
                class9.field108.close();
            } catch (Exception var15) {
            }
            class26.field376 = null;
            class9.field108 = null;
            this.method241(new String("download"), 4196);
            return true;
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "d", descriptor = "(B)V", line = 1753)
    public static void method164(byte arg0) {
        field306 = null;
        field340 = null;
        field341 = null;
        field345 = null;
        field280 = null;
        field283 = null;
        int var1 = -90 % ((34 - arg0) / 59);
    }

    @OriginalMember(owner = "mapview!mapview", name = "h", descriptor = "(I)V", line = 1804)
    public final void method165(int arg0) {
        method164((byte) 123);
        class21.method124(0);
        class26.method183((byte) 108);
        class7.method48((byte) -112);
        class33.method237(arg0 ^ arg0);
        class10.method67(true);
        class34.method238(false);
        class14.method84(arg0 ^ 0xFFFFAFCF);
        class35.method249((byte) 104);
        class8.method55(4);
        class5.method29(-5628);
        class24.method145();
        class29.method213();
        class6.method42(255);
        class32.method231((byte) -114);
        class1.method8((byte) -69);
        class25.method173(0);
        class23.method136((byte) -24);
        class15.method90();
        class4.method25(arg0 - 17);
        class31.method226((byte) -125);
        class2.method16(95);
        class12.method77(-13648);
        class13.method80(111);
        class20.method122(29823);
        class39.method256((byte) -119);
        class18.method111(-26701);
        class9.method59(48);
        class11.method74((byte) -32);
        class22.method128((byte) 95);
        class19.method119(-123);
        class28.method206();
        class38.method253((byte) -87);
        this.field355 = null;
        this.field336 = null;
        this.field331 = null;
        this.field303 = null;
        this.field311 = null;
        this.field346 = null;
        this.field276 = null;
        this.field337 = null;
        this.field299 = null;
        this.field338 = null;
        this.field288 = null;
        this.field335 = null;
        this.field270 = null;
        this.field354 = null;
        this.field312 = null;
        this.field304 = null;
        this.field297 = null;
        this.field322 = null;
        this.field269 = null;
        this.field268 = null;
        this.field295 = null;
        this.field323 = null;
        this.field287 = null;
        this.field285 = null;
        this.field290 = null;
        this.field342 = null;
        this.field314 = null;
        this.field308 = null;
        this.field318 = null;
    }

    @OriginalMember(owner = "mapview!mapview", name = "c", descriptor = "(I)V", line = 1890)
    public final void method166(int arg0) {
        if (!class22.field231) {
            class22.field231 = this.method150(-6226);
            class22.method131(class4.field48, 3, null, class18.field200);
            return;
        }
        int var2 = 57 % ((-arg0 - 43) / 39);
        if (this.field347) {
            this.field347 = false;
            class4.field54 = true;
            class15.method97();
            int var3 = class1.field10 - (int) (635.0D / this.field349);
            int var4 = class7.field84 + (int) (503.0D / this.field349);
            int var5 = class7.field84 - (int) (503.0D / this.field349);
            int var6 = (int) (635.0D / this.field349) + class1.field10;
            this.method151(635, var6, 0, var3, 503, var5, var4, 0, -80);
            if (this.field358) {
                this.field295.method223(this.field301, this.field305);
                class15.method91(this.field301 + this.field330 * var3 / class13.field160, this.field334 * var5 / class34.field446 + this.field305, (var6 - var3) * this.field330 / class13.field160, (var4 - var5) * this.field334 / class34.field446, 16711680, 128);
                class15.method93(this.field301 + this.field330 * var3 / class13.field160, this.field305 - -(this.field334 * var5 / class34.field446), (var6 - var3) * this.field330 / class13.field160, (var4 - var5) * this.field334 / class34.field446, 16711680);
                if (this.field300 > 0 && this.field300 % 10 < 5) {
                    for (int var7 = 0; var7 < class12.field154; var7++) {
                        if (class12.field141.field68[var7] == this.field357) {
                            int var8 = class12.field141.field58[var7] * this.field334 / class34.field446 + this.field305;
                            int var9 = class12.field141.field64[var7] * this.field330 / class13.field160 + this.field301;
                            class15.method95(var9, var8, 2, 16776960, 256);
                        }
                    }
                }
            }
            if (this.field291) {
                this.method161(5592405, this.field298, 8966, this.field307, 10066329, this.field286, 18, 7829367, this.field269);
                this.method161(5592405, this.field298, 8966, this.field307, 10066329, this.field286 + 18, this.field321 + -36, 7829367, class22.field235);
                this.method161(5592405, this.field298, 8966, this.field307, 10066329, this.field286 + this.field321 - 18, 18, 7829367, this.field338);
                int var10 = this.field271;
                int var11 = this.field286 + 3 + 18;
                for (int var12 = 0; var12 < 24; var12++) {
                    if (var10 < field306.length && var10 < this.field331.length) {
                        if (this.field331[var10].method179((byte) -17, class8.field97)) {
                            var12--;
                            var10++;
                            continue;
                        }
                        field306[var10].method221(this.field298 + 3, var11);
                        int var13 = 16777215;
                        this.field346.method144(this.field331[var10], this.field298 + 21, var11 - -14, 0);
                        if (this.field324 == var10) {
                            var13 = 12298922;
                        }
                        if (this.field300 > 0 && this.field300 % 10 < 5 && this.field357 == var10) {
                            var13 = 16776960;
                        }
                        this.field346.method144(this.field331[var10], this.field298 + 20, var11 + 13, var13);
                    }
                    var11 += 17;
                    var10++;
                }
            }
            if (class39.field514.length == 1) {
                this.method161(this.field353, this.field301, 8966, this.field330, this.field278, this.field334 + this.field305, 18, this.field328, this.field288);
                this.method161(this.field353, this.field298, 8966, this.field307, this.field278, this.field321 + this.field286, 18, this.field328, this.field336);
                if (this.field316 == 3.0D) {
                    this.method161(this.field352, this.field293, 8966, this.field333, this.field329, this.field272, this.field310, this.field296, class38.field490);
                } else {
                    this.method161(this.field353, this.field293, 8966, this.field333, this.field278, this.field272, this.field310, this.field328, class38.field490);
                }
                if (this.field316 == 4.0D) {
                    this.method161(this.field352, this.field344 + this.field293, 8966, this.field333, this.field329, this.field272, this.field310, this.field296, class8.field96);
                } else {
                    this.method161(this.field353, this.field344 + this.field293, 8966, this.field333, this.field278, this.field272, this.field310, this.field328, class8.field96);
                }
                if (this.field316 == 6.0D) {
                    this.method161(this.field352, this.field344 * 2 + this.field293, 8966, this.field333, this.field329, this.field272, this.field310, this.field296, class18.field199);
                } else {
                    this.method161(this.field353, this.field293 + this.field344 * 2, 8966, this.field333, this.field278, this.field272, this.field310, this.field328, class18.field199);
                }
                if (this.field316 == 8.0D) {
                    this.method161(this.field352, this.field344 * 3 + this.field293, 8966, this.field333, this.field329, this.field272, this.field310, this.field296, class10.field113);
                } else {
                    this.method161(this.field353, this.field344 * 3 + this.field293, 8966, this.field333, this.field278, this.field272, this.field310, this.field328, class10.field113);
                }
            } else {
                this.method161(this.field353, this.field301, 8966, this.field330, this.field278, this.field334 + this.field305, 18, this.field328, this.field288);
                this.method161(this.field353, this.field298, 8966, this.field307, this.field278, this.field321 + this.field286, 18, this.field328, this.field336);
                this.method169(-49, this.field328);
                int var14 = this.field309 + this.field272;
                if (this.field316 == 3.0D) {
                    this.method161(this.field352, this.field293, 8966, this.field333, this.field329, var14, this.field310, this.field296, class38.field490);
                } else {
                    this.method161(this.field353, this.field293, 8966, this.field333, this.field278, var14, this.field310, this.field328, class38.field490);
                }
                if (this.field316 == 4.0D) {
                    this.method161(this.field352, this.field344 + this.field293, 8966, this.field333, this.field329, var14, this.field310, this.field296, class8.field96);
                } else {
                    this.method161(this.field353, this.field344 + this.field293, 8966, this.field333, this.field278, var14, this.field310, this.field328, class8.field96);
                }
                if (this.field316 == 6.0D) {
                    this.method161(this.field352, this.field344 * 2 + this.field293, 8966, this.field333, this.field329, var14, this.field310, this.field296, class18.field199);
                } else {
                    this.method161(this.field353, this.field293 + this.field344 * 2, 8966, this.field333, this.field278, var14, this.field310, this.field328, class18.field199);
                }
                if (this.field316 == 8.0D) {
                    this.method161(this.field352, this.field344 * 3 + this.field293, 8966, this.field333, this.field329, var14, this.field310, this.field296, class10.field113);
                } else {
                    this.method161(this.field353, this.field293 + this.field344 * 3, 8966, this.field333, this.field278, var14, this.field310, this.field328, class10.field113);
                }
            }
            if (class39.field508) {
                this.method161(this.field353, this.field289, 8966, this.field320, this.field278, this.field281, this.field274, this.field328, this.field322);
                if (class8.field91) {
                    class15.method91(this.field289 + this.field320 + 2, this.field281, this.field327 + 10, this.field274, 8925952, 192);
                    class15.method93(this.field320 + this.field289 + 2, this.field281, this.field327 + 10, this.field274, 16777215);
                    if (class26.field369 > -1 && this.field318.method197((byte) -112) > 0) {
                        class26 var15 = this.field314[class26.field369].method195(0, 47, 32);
                        int var16 = this.field318.method197((byte) -112);
                        if (var16 > var15.method197((byte) -112)) {
                            var16 = var15.method197((byte) -112);
                        }
                        this.field346.method143(var15, this.field320 + this.field289 + 6, 20, 10066176, true);
                        this.field346.method143(var15.method184((byte) -123, 0, var16), this.field320 + this.field289 + 6, 20, 16777215, true);
                    } else {
                        this.field346.method143(this.field299, this.field289 + this.field320 + 6, 20, 16776960, true);
                    }
                }
            }
        }
        if (class4.field54) {
            this.method154(-32436);
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(ZLjava/lang/String;[B)V", line = 2083)
    private final void method167(boolean arg0, String arg1, byte[] arg2) throws IOException {
        if (arg0) {
            FileOutputStream var4 = new FileOutputStream(arg1);
            var4.write(arg2, 0, arg2.length);
            var4.close();
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "d", descriptor = "(I)V", line = 2103)
    public final void method168(int arg0) {
        class38.method254((byte) -99);
        if (arg0 != -1) {
            return;
        }
        class20.method123((byte) -64);
        try {
            this.field314 = null;
            this.field331 = null;
            this.field290 = null;
            this.field295 = null;
            this.field346 = null;
            class12.field141 = null;
            this.field335 = null;
            this.field285 = null;
            System.gc();
        } catch (Throwable var3) {
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "d", descriptor = "(II)V", line = 2137)
    private final void method169(int arg0, int arg1) {
        this.method161(this.field353, 170, 8966, 230, this.field278, 483, 18, arg1, class20.method121(new class26[] { class35.field451, class5.field63[class9.field104], class10.field123 }, (byte) -128));
        if (arg0 != -49) {
            this.field304 = null;
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "e", descriptor = "(B)V", line = 2153)
    public static final void method170(byte arg0) {
        if (++class19.field208 >= 64) {
            class19.field208 = 0;
            class1.field20++;
            if (class1.field20 < class34.field446 >> 6) {
                class34.method245(1);
            }
        }
        class20.field213 = (class19.field208 << 6) + class13.field156;
        int var1 = -48 / ((-arg0 - 20) / 48);
    }
}
