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
public class mapview extends class12 {

    @OriginalMember(owner = "mapview!mapview", name = "m", descriptor = "I")
    private int field251 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "p", descriptor = "I")
    private int field254 = 6706483;

    @OriginalMember(owner = "mapview!mapview", name = "B", descriptor = "I")
    private int field266 = 500;

    @OriginalMember(owner = "mapview!mapview", name = "A", descriptor = "I")
    private int field265 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "D", descriptor = "I")
    private int field268 = 5;

    @OriginalMember(owner = "mapview!mapview", name = "I", descriptor = "I")
    private int field273 = 23;

    @OriginalMember(owner = "mapview!mapview", name = "s", descriptor = "[I")
    private int[] field257 = new int[this.field266];

    @OriginalMember(owner = "mapview!mapview", name = "U", descriptor = "[I")
    private int[] field285 = new int[this.field266];

    @OriginalMember(owner = "mapview!mapview", name = "l", descriptor = "I")
    private int field250 = 7824964;

    @OriginalMember(owner = "mapview!mapview", name = "o", descriptor = "I")
    private int field253 = 40;

    @OriginalMember(owner = "mapview!mapview", name = "S", descriptor = "Z")
    private boolean field283 = false;

    @OriginalMember(owner = "mapview!mapview", name = "i", descriptor = "I")
    private int field247 = 5;

    @OriginalMember(owner = "mapview!mapview", name = "K", descriptor = "Z")
    private boolean field275 = false;

    @OriginalMember(owner = "mapview!mapview", name = "ab", descriptor = "I")
    private int field291 = 10;

    @OriginalMember(owner = "mapview!mapview", name = "fb", descriptor = "I")
    private int field296 = -1;

    @OriginalMember(owner = "mapview!mapview", name = "tb", descriptor = "I")
    private int field310 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "yb", descriptor = "I")
    private int field315 = 450;

    @OriginalMember(owner = "mapview!mapview", name = "j", descriptor = "I")
    private int field248 = -1;

    @OriginalMember(owner = "mapview!mapview", name = "zb", descriptor = "I")
    private int field316 = 11141120;

    @OriginalMember(owner = "mapview!mapview", name = "Cb", descriptor = "D")
    private double field319 = 4.0D;

    @OriginalMember(owner = "mapview!mapview", name = "hb", descriptor = "I")
    private int field298 = 10027008;

    @OriginalMember(owner = "mapview!mapview", name = "qb", descriptor = "I")
    private int field307 = -1;

    @OriginalMember(owner = "mapview!mapview", name = "Ab", descriptor = "I")
    private int field317 = 8943445;

    @OriginalMember(owner = "mapview!mapview", name = "R", descriptor = "I")
    private int field282 = 8912896;

    @OriginalMember(owner = "mapview!mapview", name = "eb", descriptor = "I")
    private int field295 = 33;

    @OriginalMember(owner = "mapview!mapview", name = "O", descriptor = "I")
    private int field279 = 5;

    @OriginalMember(owner = "mapview!mapview", name = "Jb", descriptor = "I")
    private int field326 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "Qb", descriptor = "Z")
    private boolean field333 = false;

    @OriginalMember(owner = "mapview!mapview", name = "Gb", descriptor = "I")
    private int field323 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "Lb", descriptor = "I")
    private int field328 = -20;

    @OriginalMember(owner = "mapview!mapview", name = "Nb", descriptor = "[I")
    private int[] field330 = new int[this.field266];

    @OriginalMember(owner = "mapview!mapview", name = "Mb", descriptor = "D")
    private double field329 = 4.0D;

    @OriginalMember(owner = "mapview!mapview", name = "Kb", descriptor = "I")
    private int field327 = 140;

    @OriginalMember(owner = "mapview!mapview", name = "Hb", descriptor = "I")
    private int field324 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "Pb", descriptor = "Z")
    private boolean field332 = false;

    @OriginalMember(owner = "mapview!mapview", name = "cb", descriptor = "I")
    private int field293 = 170;

    @OriginalMember(owner = "mapview!mapview", name = "Sb", descriptor = "Lia;")
    private class15 field335 = this.field332 ? class20.field229 : class20.field229;

    @OriginalMember(owner = "mapview!mapview", name = "P", descriptor = "I")
    private int field280 = this.field332 ? 115 : 102;

    @OriginalMember(owner = "mapview!mapview", name = "F", descriptor = "Lia;")
    private class15 field270 = this.field332 ? class29.field408 : class29.field408;

    @OriginalMember(owner = "mapview!mapview", name = "Ib", descriptor = "Lia;")
    private class15 field325 = this.field332 ? class27.field385 : class28.field405;

    @OriginalMember(owner = "mapview!mapview", name = "x", descriptor = "Lia;")
    private class15 field262 = this.field332 ? class29.field409 : class25.field364;

    @OriginalMember(owner = "mapview!mapview", name = "rb", descriptor = "I")
    private int field308 = this.field332 ? 76 : 75;

    @OriginalMember(owner = "mapview!mapview", name = "V", descriptor = "Lia;")
    private class15 field286 = this.field332 ? class36.field497 : class36.field497;

    @OriginalMember(owner = "mapview!mapview", name = "bb", descriptor = "Lia;")
    private class15 field292 = this.field332 ? class30.field426 : class30.field426;

    @OriginalMember(owner = "mapview!mapview", name = "Q", descriptor = "Lia;")
    private class15 field281 = this.field332 ? field287 : field287;

    @OriginalMember(owner = "mapview!mapview", name = "T", descriptor = "Lia;")
    private class15 field284 = this.field332 ? class15.field149 : class15.field149;

    @OriginalMember(owner = "mapview!mapview", name = "q", descriptor = "Lia;")
    private class15 field255 = this.field332 ? field344 : field344;

    @OriginalMember(owner = "mapview!mapview", name = "sb", descriptor = "[Lia;")
    private class15[] field309 = new class15[this.field266];

    @OriginalMember(owner = "mapview!mapview", name = "Ub", descriptor = "I")
    private int field337 = 30;

    @OriginalMember(owner = "mapview!mapview", name = "X", descriptor = "I")
    private int field288 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "jb", descriptor = "Lia;")
    private class15 field300 = this.field332 ? class33.field475 : class33.field475;

    @OriginalMember(owner = "mapview!mapview", name = "E", descriptor = "I")
    private int field269 = this.field332 ? 220 : 79;

    @OriginalMember(owner = "mapview!mapview", name = "Wb", descriptor = "I")
    private int field339 = this.field332 ? 83 : 70;

    @OriginalMember(owner = "mapview!mapview", name = "k", descriptor = "Lia;")
    private class15 field249 = this.field332 ? class39.field518 : class39.field518;

    @OriginalMember(owner = "mapview!mapview", name = "lb", descriptor = "I")
    private int field302 = 50;

    @OriginalMember(owner = "mapview!mapview", name = "Bb", descriptor = "I")
    private int field318 = this.field302 + this.field291;

    @OriginalMember(owner = "mapview!mapview", name = "Z", descriptor = "Z")
    private boolean field290 = true;

    @OriginalMember(owner = "mapview!mapview", name = "M", descriptor = "Lia;")
    private class15 field277 = this.field332 ? class18.field181 : class18.field181;

    @OriginalMember(owner = "mapview!mapview", name = "n", descriptor = "I")
    private int field252 = this.field332 ? 252 : 111;

    @OriginalMember(owner = "mapview!mapview", name = "wb", descriptor = "I")
    private int field313 = this.field332 ? 108 : 107;

    @OriginalMember(owner = "mapview!mapview", name = "ac", descriptor = "I")
    private int field343 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "Rb", descriptor = "Lia;")
    private class15 field334 = this.field332 ? field345 : class6.field53;

    @OriginalMember(owner = "mapview!mapview", name = "Yb", descriptor = "I")
    private int field341 = 471;

    @OriginalMember(owner = "mapview!mapview", name = "gb", descriptor = "Lia;")
    private static class15 field297 = class28.method196(" ", false);

    @OriginalMember(owner = "mapview!mapview", name = "L", descriptor = "Lia;")
    public static class15 field276 = class28.method196("Windmill", false);

    @OriginalMember(owner = "mapview!mapview", name = "kb", descriptor = "[Z")
    public static boolean[] field301 = new boolean[112];

    @OriginalMember(owner = "mapview!mapview", name = "H", descriptor = "Z")
    public static volatile boolean field272 = false;

    @OriginalMember(owner = "mapview!mapview", name = "N", descriptor = "I")
    public static int field278 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "ub", descriptor = "Z")
    public static boolean field311 = false;

    @OriginalMember(owner = "mapview!mapview", name = "W", descriptor = "Lia;")
    private static class15 field287 = class28.method196("Please wait)3)3)3 Rendering Map", false);

    @OriginalMember(owner = "mapview!mapview", name = "ib", descriptor = "Lja;")
    public static class17 field299 = new class17();

    @OriginalMember(owner = "mapview!mapview", name = "bc", descriptor = "Lia;")
    private static class15 field344 = class28.method196("sprites", false);

    @OriginalMember(owner = "mapview!mapview", name = "cc", descriptor = "Lia;")
    private static class15 field345 = class28.method196("Legende", false);

    @OriginalMember(owner = "mapview!mapview", name = "r", descriptor = "I")
    private int field256;

    @OriginalMember(owner = "mapview!mapview", name = "t", descriptor = "I")
    private int field258;

    @OriginalMember(owner = "mapview!mapview", name = "y", descriptor = "I")
    private int field263;

    @OriginalMember(owner = "mapview!mapview", name = "G", descriptor = "I")
    private int field271;

    @OriginalMember(owner = "mapview!mapview", name = "db", descriptor = "I")
    public static int field294;

    @OriginalMember(owner = "mapview!mapview", name = "mb", descriptor = "I")
    private int field303;

    @OriginalMember(owner = "mapview!mapview", name = "vb", descriptor = "I")
    public static int field312;

    @OriginalMember(owner = "mapview!mapview", name = "Eb", descriptor = "I")
    private int field321;

    @OriginalMember(owner = "mapview!mapview", name = "Ob", descriptor = "I")
    private int field331;

    @OriginalMember(owner = "mapview!mapview", name = "Tb", descriptor = "I")
    public static int field336;

    @OriginalMember(owner = "mapview!mapview", name = "Vb", descriptor = "I")
    private int field338;

    @OriginalMember(owner = "mapview!mapview", name = "dc", descriptor = "I")
    public static int field346;

    @OriginalMember(owner = "mapview!mapview", name = "Db", descriptor = "Lia;")
    private class15 field320;

    @OriginalMember(owner = "mapview!mapview", name = "v", descriptor = "Lj;")
    private class16 field260;

    @OriginalMember(owner = "mapview!mapview", name = "w", descriptor = "Lj;")
    private class16 field261;

    @OriginalMember(owner = "mapview!mapview", name = "z", descriptor = "Lj;")
    private class16 field264;

    @OriginalMember(owner = "mapview!mapview", name = "nb", descriptor = "Lj;")
    private class16 field304;

    @OriginalMember(owner = "mapview!mapview", name = "ob", descriptor = "Lj;")
    private class16 field305;

    @OriginalMember(owner = "mapview!mapview", name = "pb", descriptor = "Lj;")
    private class16 field306;

    @OriginalMember(owner = "mapview!mapview", name = "Fb", descriptor = "Lj;")
    private class16 field322;

    @OriginalMember(owner = "mapview!mapview", name = "Xb", descriptor = "Lj;")
    private class16 field340;

    @OriginalMember(owner = "mapview!mapview", name = "xb", descriptor = "Lm;")
    private class22 field314;

    @OriginalMember(owner = "mapview!mapview", name = "Y", descriptor = "Lda;")
    private class7 field289;

    @OriginalMember(owner = "mapview!mapview", name = "u", descriptor = "[B")
    public static byte[] field259;

    @OriginalMember(owner = "mapview!mapview", name = "Zb", descriptor = "[B")
    public static byte[] field342;

    @OriginalMember(owner = "mapview!mapview", name = "C", descriptor = "[Lia;")
    private class15[] field267;

    @OriginalMember(owner = "mapview!mapview", name = "J", descriptor = "[Lia;")
    private class15[] field274;

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(B[BLjava/lang/String;)V", line = 12)
    private final void method155(byte arg0, byte[] arg1, String arg2) throws IOException {
        FileOutputStream var4 = new FileOutputStream(arg2);
        var4.write(arg1, 0, arg1.length);
        var4.close();
        if (arg0 <= 90) {
            this.field270 = null;
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "e", descriptor = "(I)V", line = 37)
    public final void method66(int arg0) {
        class10.method51((byte) -105);
        boolean var2 = false;
        method166(-19019, class3.field32);
        class27.method192(class3.field32, 0);
        class21.field239 = this.field335;
        this.field274 = class34.method238(81);
        boolean var3 = true;
        int var4 = -91 % ((arg0 - 44) / 56);
        this.field267 = class25.method175(false);
        if (var3) {
            byte var5 = 0;
            if (this.field267.length == 14) {
                byte var10002 = var5;
                int var6 = var5 + 1;
                this.field325 = this.field267[var10002];
                int var20 = var6;
                int var7 = var6 + 1;
                this.field262 = this.field267[var20];
                int var21 = var7;
                int var8 = var7 + 1;
                this.field334 = this.field267[var21];
                int var22 = var8;
                int var9 = var8 + 1;
                this.field292 = this.field267[var22];
                int var23 = var9;
                int var10 = var9 + 1;
                this.field300 = this.field267[var23];
                int var24 = var10;
                int var11 = var10 + 1;
                this.field335 = this.field267[var24];
                int var25 = var11;
                int var12 = var11 + 1;
                this.field281 = this.field267[var25];
                int var26 = var12;
                int var13 = var12 + 1;
                this.field284 = this.field267[var26];
                int var27 = var13;
                int var14 = var13 + 1;
                this.field270 = this.field267[var27];
                int var28 = var14;
                int var15 = var14 + 1;
                this.field255 = this.field267[var28];
                int var29 = var15;
                int var16 = var15 + 1;
                this.field249 = this.field267[var29];
                int var30 = var16;
                int var17 = var16 + 1;
                this.field286 = this.field267[var30];
                int var18 = var17 + 1;
                int var31 = var18;
                int var19 = var18 + 1;
                this.field277 = this.field267[var31];
                this.field269 = this.field325.method109(0, (byte) 122);
                this.field339 = this.field262.method109(0, (byte) 122);
                this.field308 = this.field334.method109(0, (byte) 80);
                this.field252 = this.method157(-662, this.field269);
                this.field280 = this.method157(-662, this.field339);
                this.field313 = this.method157(-662, this.field308);
            } else {
                class3.method17(new class15[] { class19.field219 }, 101);
            }
        }
        this.field320 = class15.method111(-12893, 50);
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(Ljava/lang/String;Lia;I)Z", line = 98)
    private final boolean method156(String arg0, class15 arg1, int arg2) {
        int var4 = 75 % ((40 - arg2) / 59);
        byte[] var5 = null;
        if (!class31.field431) {
            if (class12.field104 != null) {
                try {
                    var5 = this.method159((byte) 120, class12.field104 + "/" + arg0);
                    if (!this.method164(var5, 15, arg0)) {
                        var5 = null;
                    }
                    if (var5 != null) {
                        class35.field494 = new class20(var5, false, true);
                        return true;
                    }
                } catch (IOException var12) {
                    var5 = null;
                }
            }
            class31.field431 = true;
        }
        if (var5 == null) {
            boolean var7 = this.method168(arg0, -16025, arg1);
            if (!var7) {
                return false;
            }
            var5 = class2.field20;
            class2.field20 = null;
        }
        if (var5 == null) {
            class31.field431 = false;
            return true;
        }
        if (class12.field104 != null && var5 != null) {
            try {
                this.method155((byte) 124, var5, class12.field104 + "/" + arg0);
            } catch (IOException var11) {
            }
        }
        try {
            class35.field494 = new class20(var5, false, true);
            class31.field431 = false;
            return true;
        } catch (IOException var10) {
            throw class21.method151(var10, "monkey feet");
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(II)I", line = 166)
    private final int method157(int arg0, int arg1) {
        if (arg0 != -662) {
            this.field252 = 7;
        }
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
            return class31.method210((byte) -123, arg1);
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(B[Lia;)Lia;", line = 227)
    private static final class15 method158(byte arg0, class15[] arg1) {
        if (arg0 != 104) {
            return (class15) null;
        } else if (arg1.length >= 2) {
            return class6.method28(0, arg1, 115, arg1.length);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(BLjava/lang/String;)[B", line = 249)
    private final byte[] method159(byte arg0, String arg1) throws IOException {
        if (arg0 <= 89) {
            this.field334 = null;
        }
        File var3 = new File(arg1);
        if (!var3.exists()) {
            return null;
        }
        int var4 = (int) var3.length();
        byte[] var5 = new byte[var4];
        DataInputStream var6 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg1)));
        var6.readFully(var5, 0, var4);
        var6.close();
        return var5;
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(I)V", line = 303)
    public final void method59(int arg0) {
        class33.method229(true);
        class12.method70(false);
        try {
            this.field257 = null;
            class31.field434 = null;
            this.field309 = null;
            int var2 = -17 / ((11 - arg0) / 32);
            this.field314 = null;
            this.field285 = null;
            this.field330 = null;
            this.field289 = null;
            this.field274 = null;
            System.gc();
        } catch (Throwable var4) {
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "init", descriptor = "()V", line = 337)
    public final void init() {
        if (this.method73(true)) {
            this.method63(Integer.parseInt(this.getParameter("codeversion")), 503, 635, 32, -107);
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(IB)I", line = 355)
    private final int method160(int arg0, byte arg1) {
        arg0++;
        if (class18.field182.length <= arg0) {
            arg0 = 0;
        }
        int var3 = -19 % ((-arg1 - 38) / 59);
        return arg0;
    }

    @OriginalMember(owner = "mapview!mapview", name = "b", descriptor = "(II)V", line = 381)
    private final void method161(int arg0, int arg1) {
        if (arg1 != 20) {
            field272 = false;
        }
        this.method163(arg0, method158((byte) 104, new class15[] { class25.field359, class21.field232[class20.field228], class15.field144 }), 18, 170, this.field317, 230, 483, this.field254, (byte) 25);
    }

    @OriginalMember(owner = "mapview!mapview", name = "c", descriptor = "(B)V", line = 393)
    private final void method162(byte arg0) {
        if (arg0 != 79) {
            this.method72((byte) -12);
        }
        if (class18.field182.length == 1) {
            class31.field430 = 0;
        } else {
            if (class20.field228 >= 0) {
                class31.field430 = class20.field228;
            } else {
                class31.field430 = this.method160(class31.field430, (byte) 89);
            }
            class20.field228 = this.method160(class31.field430, (byte) 36);
        }
        this.method171((byte) -84, class31.field430);
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(ILia;IIIIIIB)V", line = 417)
    private final void method163(int arg0, class15 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte arg8) {
        class8.method36(arg3, arg6, arg5, arg2, 0);
        int var11 = arg3 + 1;
        int var12 = arg5 - 2;
        int var10 = arg2 - 2;
        int var13 = arg6 + 1;
        if (arg8 != 25) {
            return;
        }
        class8.method41(var11, var13, var12, var10, arg0);
        class8.method43(var11, var13, var12, arg4);
        class8.method42(var11, var13, var10, arg4);
        class8.method43(var11, var10 + var13 - 1, var12, arg7);
        class8.method42(var11 + var12 - 1, var13, var10, arg7);
        this.field314.method217(arg1, var12 / 2 + var11 + 1, var10 / 2 - -4 + var13 + 1, 0, -1);
        this.field314.method217(arg1, var12 / 2 + var11, var13 - (-(var10 / 2) - 4), 16777215, -1);
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "([BILjava/lang/String;)Z", line = 439)
    private final boolean method164(byte[] arg0, int arg1, String arg2) {
        if (arg0 == null) {
            return false;
        }
        try {
            MessageDigest var4 = MessageDigest.getInstance("SHA");
            var4.reset();
            if (arg1 != 15) {
                this.method168(null, -63, null);
            }
            var4.update(arg0);
            byte[] var5 = var4.digest();
            if (arg2 == "main_file_cache.dat0") {
                if (var5[0] != 45 || var5[1] != 54 || var5[2] != 85 || var5[3] != -50 || var5[4] != -22 || var5[5] != 16 || var5[6] != 112 || var5[7] != -25 || var5[8] != -98 || var5[9] != 35 || var5[10] != -127 || var5[11] != 94 || var5[12] != 123 || var5[13] != 19 || var5[14] != 54 || var5[15] != -119 || var5[16] != 49 || var5[17] != 1 || var5[18] != -24 || var5[19] != 120) {
                    return false;
                }
            } else if (arg2 == "main_file_cache.idx1") {
                if (var5[0] != 52 || var5[1] != 126 || var5[2] != -117 || var5[3] != -96 || var5[4] != 55 || var5[5] != 19 || var5[6] != -40 || var5[7] != 125 || var5[8] != 49 || var5[9] != -77 || var5[10] != 77 || var5[11] != -79 || var5[12] != -93 || var5[13] != -47 || var5[14] != -110 || var5[15] != -122 || var5[16] != 84 || var5[17] != -103 || var5[18] != -78 || var5[19] != 126) {
                    return false;
                }
            } else if (var5[0] != 45 || var5[1] != 3 || var5[2] != -125 || var5[3] != -84 || var5[4] != 74 || var5[5] != -71 || var5[6] != 71 || var5[7] != 42 || var5[8] != 15 || var5[9] != -22 || var5[10] != -39 || var5[11] != -60 || var5[12] != -119 || var5[13] != 50 || var5[14] != -84 || var5[15] != 66 || var5[16] != -36 || var5[17] != -79 || var5[18] != 54 || var5[19] != -48) {
                return false;
            }
            return true;
        } catch (Exception var7) {
            this.method68("sha", 1);
            return false;
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "c", descriptor = "(I)V", line = 486)
    public final void method61(int arg0) {
        if (field272) {
            class29.method200(class3.field32, (byte) -97);
            class31.method207(false, class3.field32);
            this.method67(arg0 ^ 0x1F6);
            method166(arg0 ^ 0xFFFFB442, class3.field32);
            class27.method192(class3.field32, 0);
        }
        class39.method251(arg0 ^ 0x1F7);
        class36.method242(11363);
        if (!class11.field97) {
            return;
        }
        if (field301[96]) {
            class19.field203 = (int) ((double) class19.field203 - 16.0D / this.field319);
            class21.field245 = -1;
            this.field290 = true;
        }
        if (field301[97]) {
            this.field290 = true;
            class19.field203 = (int) (16.0D / this.field319 + (double) class19.field203);
            class21.field245 = -1;
        }
        if (field301[98]) {
            this.field290 = true;
            class5.field47 = (int) ((double) class5.field47 - 16.0D / this.field319);
            class21.field245 = -1;
        }
        if (field301[99]) {
            class21.field245 = -1;
            this.field290 = true;
            class5.field47 = (int) (16.0D / this.field319 + (double) class5.field47);
        }
        while (true) {
            boolean var2;
            label483: do {
                while (true) {
                    while (true) {
                        while (class26.method180(127)) {
                            if (!class33.field476 || !class28.field401) {
                                if (class20.field231 == this.field280 || class20.field231 == this.field339) {
                                    this.field290 = true;
                                    class28.field401 = true;
                                }
                                if (class20.field231 == 49) {
                                    this.field329 = 3.0D;
                                    this.field290 = true;
                                }
                                if (class20.field231 == 50) {
                                    this.field290 = true;
                                    this.field329 = 4.0D;
                                }
                                if (class20.field231 == 51) {
                                    this.field329 = 6.0D;
                                    this.field290 = true;
                                }
                                if (class20.field231 == 52) {
                                    this.field329 = 8.0D;
                                    this.field290 = true;
                                }
                                if (class20.field231 == this.field313 || class20.field231 == this.field308) {
                                    this.field290 = true;
                                    this.field275 = !this.field275;
                                }
                                if (class20.field231 == this.field252 || class20.field231 == this.field269) {
                                    this.field283 = !this.field283;
                                    this.field290 = true;
                                }
                            } else if (field312 == 0) {
                                this.field290 = true;
                                class28.field401 = false;
                                this.field320.method106(0, arg0 ^ 0x1F7);
                                class27.field386 = -1;
                            } else {
                                if (field312 != 84) {
                                    var2 = false;
                                    if (field312 == 85) {
                                        if (this.field320.method102(false) > 0) {
                                            this.field320.method106(this.field320.method102(false) - 1, 0);
                                            this.field290 = true;
                                            if (this.field320.method102(false) == 0) {
                                                class27.field386 = -1;
                                            } else {
                                                var2 = true;
                                            }
                                        }
                                    } else if (class20.field231 != -1 && this.field320.method102(false) <= class6.field54) {
                                        this.field320.method112(1, class20.field231);
                                        this.field290 = true;
                                    }
                                    continue label483;
                                }
                                this.field321 = class5.field47 << 16;
                                class21.field245 = class27.field386;
                                this.field256 = class19.field203 << 16;
                                class28.field401 = false;
                                this.field320.method106(0, 0);
                                class27.field386 = -1;
                                this.field290 = true;
                            }
                        }
                        int var6 = class17.field171;
                        int var7 = class27.field387;
                        int var8 = class1.field2;
                        int var9 = class10.field85;
                        int var10 = class4.field41;
                        int var11 = field278;
                        if (var6 == 1) {
                            this.field288 = var11;
                            this.field310 = var10;
                            this.field326 = class5.field47;
                            this.field251 = class19.field203;
                            if (class18.field182.length == 1) {
                                if (var10 > this.field293 && this.field302 + this.field293 > var10 && this.field341 < var11 && var11 < this.field341 + this.field337) {
                                    this.field310 = -1;
                                    this.field329 = 3.0D;
                                }
                                if (var10 > this.field318 + this.field293 && this.field293 + this.field302 + this.field318 > var10 && var11 > this.field341 && this.field341 + this.field337 > var11) {
                                    this.field310 = -1;
                                    this.field329 = 4.0D;
                                }
                                if (var10 > this.field318 * 2 + this.field293 && this.field318 * 2 + this.field293 + this.field302 > var10 && var11 > this.field341 && var11 < this.field341 + this.field337) {
                                    this.field329 = 6.0D;
                                    this.field310 = -1;
                                }
                                if (var10 > this.field293 + this.field318 * 3 && this.field293 + this.field318 * 3 + this.field302 > var10 && this.field341 < var11 && this.field341 + this.field337 > var11) {
                                    this.field310 = -1;
                                    this.field329 = 8.0D;
                                }
                            } else {
                                if (var10 > this.field293 && var10 < this.field302 + this.field293 && this.field341 < var11 && var11 < this.field341 + this.field337 + this.field328) {
                                    this.field310 = -1;
                                    this.field329 = 3.0D;
                                }
                                if (this.field318 + this.field293 < var10 && var10 < this.field318 + this.field293 + this.field302 && this.field341 < var11 && var11 < this.field341 + this.field337 + this.field328) {
                                    this.field310 = -1;
                                    this.field329 = 4.0D;
                                }
                                if (this.field318 * 2 + this.field293 < var10 && var10 < this.field318 * 2 + this.field293 + this.field302 && var11 > this.field341 && var11 < this.field341 + this.field328 + this.field337) {
                                    this.field310 = -1;
                                    this.field329 = 6.0D;
                                }
                                if (this.field318 * 3 + this.field293 < var10 && this.field318 * 3 + this.field293 + this.field302 > var10 && this.field341 < var11 && var11 < this.field341 + this.field328 + this.field337) {
                                    this.field310 = -1;
                                    this.field329 = 8.0D;
                                }
                                if (var10 > 170 && var10 < 400 && var11 > 483 && var11 < 503) {
                                    this.method161(this.field298, arg0 ^ 0x1E3);
                                    this.method167(arg0 ^ 0x66C5);
                                    this.method162((byte) 79);
                                    this.field310 = -1;
                                }
                            }
                            if (var10 > this.field268 && var11 > this.field315 + this.field295 && this.field268 + this.field327 > var10 && var11 < 503) {
                                this.field310 = -1;
                                this.field275 = !this.field275;
                            }
                            this.field333 = false;
                            if (var10 > this.field263 && var11 > this.field331 + this.field303 && this.field263 + this.field338 > var10 && var11 < 503) {
                                this.field310 = -1;
                                this.field283 = !this.field283;
                            }
                            this.field290 = true;
                            if (this.field275) {
                                if (this.field268 < var10 && var11 > this.field295 && var10 < this.field327 + this.field268 && this.field315 + this.field295 > var11) {
                                    this.field310 = -1;
                                }
                                if (var10 > this.field268 && var11 > this.field295 && this.field327 + this.field268 > var10 && this.field295 + 18 > var11 && this.field265 > 0) {
                                    this.field265 -= 24;
                                }
                                if (var10 > this.field268 && this.field295 + this.field315 - 18 < var11 && this.field327 + this.field268 > var10 && var11 < this.field315 + this.field295 && this.field265 < 48) {
                                    this.field265 += 24;
                                }
                            }
                            if (this.field283 && this.field263 < var10 && var11 > this.field331 && var10 < this.field338 + this.field263 && this.field331 + this.field303 > var11) {
                                this.field310 = -1;
                                class5.field47 = (var11 - this.field331) * class15.field150 / this.field303;
                                this.field333 = true;
                                class19.field203 = (var10 - this.field263) * class35.field495 / this.field338;
                            }
                            if (class33.field476 && !class28.field401 && !this.field333 && this.field279 < var10 && this.field247 < var11 && var10 < this.field279 + this.field253 && var11 < this.field273 + this.field247) {
                                class28.field401 = true;
                            }
                        }
                        if (this.field275) {
                            this.field307 = -1;
                            if (var8 > this.field268 && this.field327 + this.field268 > var8) {
                                int var12 = this.field295 + 26;
                                int var13 = this.field343;
                                for (int var14 = 0; var14 < 24; var14++) {
                                    if (this.field274.length > var13 && this.field274[var13].method105((byte) 55, class20.field226)) {
                                        var14--;
                                        var13++;
                                    } else {
                                        if (var12 <= var9 && var9 < var12 + 17) {
                                            if (var6 == 1) {
                                                this.field323 = 50;
                                                this.field296 = var13;
                                            }
                                            this.field307 = var13;
                                        }
                                        var13++;
                                        var12 += 17;
                                    }
                                }
                            }
                            if (this.field307 != this.field248) {
                                this.field290 = true;
                                this.field248 = this.field307;
                            }
                        }
                        if (var7 == 1 && this.field283 && this.field333) {
                            int var15 = var8;
                            class21.field245 = -1;
                            if (var8 < this.field263) {
                                var15 = this.field263;
                            } else if (this.field263 + this.field338 < var8) {
                                var15 = this.field338 + this.field263;
                            }
                            int var16 = var9;
                            this.field290 = true;
                            class19.field203 = (var15 - this.field263) * class35.field495 / this.field338;
                            if (this.field331 > var9) {
                                var16 = this.field331;
                            } else if (var9 > this.field331 + this.field303) {
                                var16 = this.field331 + this.field303;
                            }
                            class5.field47 = (var16 - this.field331) * class15.field150 / this.field303;
                        } else {
                            this.field333 = false;
                        }
                        if (var7 == 1 && this.field310 != -1) {
                            class5.field47 = (int) ((double) (this.field288 - var9) * 2.0D / this.field329) + this.field326;
                            class19.field203 = this.field251 + (int) ((double) (this.field310 - var8) * 2.0D / this.field329);
                            this.field290 = true;
                            class21.field245 = -1;
                        }
                        if (this.field319 < this.field329) {
                            this.field319 /= 30.0D;
                            this.field290 = true;
                            if (this.field329 < this.field319) {
                                this.field319 = this.field329;
                            }
                        }
                        if (this.field319 > this.field329) {
                            this.field290 = true;
                            this.field319 /= 30.0D;
                            if (this.field319 < this.field329) {
                                this.field319 = this.field329;
                            }
                        }
                        if (this.field343 < this.field265) {
                            this.field290 = true;
                            this.field343++;
                        }
                        if (this.field343 > this.field265) {
                            this.field343--;
                            this.field290 = true;
                        }
                        if (this.field323 > 0) {
                            this.field290 = true;
                            this.field323--;
                        }
                        if (class21.field245 >= 0) {
                            class12.field103 = this.field257[class21.field245] - class28.field403;
                            class11.field96 = class34.field483 + class15.field150 - this.field285[class21.field245];
                            byte var17 = 4;
                            int var18 = class11.field96 - (int) (503.0D / this.field319);
                            int var19 = class12.field103 - (int) (635.0D / this.field319);
                            this.field290 = true;
                            int var20 = (int) (503.0D / this.field319) + class11.field96;
                            int var21 = (int) (635.0D / this.field319) + class12.field103;
                            if (var19 < 48) {
                                class12.field103 = (int) (635.0D / this.field319) + 48;
                            }
                            if (var18 < 48) {
                                class11.field96 = (int) (503.0D / this.field319) + 48;
                            }
                            if (class15.field150 - 48 < var20) {
                                class11.field96 = class15.field150 - (int) (503.0D / this.field319) - 48;
                            }
                            class11.field96 <<= 0x10;
                            if (class35.field495 - 48 < var21) {
                                class12.field103 = class35.field495 - (int) (635.0D / this.field319) - 48;
                            }
                            class12.field103 <<= 0x10;
                            int var22 = class12.field103 - this.field256;
                            int var23 = class11.field96 - this.field321;
                            if (var22 >> var17 == 0 && var23 >> var17 == 0) {
                                class21.field245 = -1;
                            } else {
                                this.field256 += var22 >> var17;
                                this.field321 += var23 >> var17;
                                class5.field47 = this.field321 >> 16;
                                class19.field203 = this.field256 >> 16;
                            }
                        }
                        int var24 = class19.field203 - (int) (635.0D / this.field319);
                        int var25 = class5.field47 - (int) (503.0D / this.field319);
                        int var26 = class19.field203 + (int) (635.0D / this.field319);
                        if (var24 < 48) {
                            class19.field203 = (int) (635.0D / this.field319) + 48;
                        }
                        int var27 = (int) ((double) arg0 / this.field319) + class5.field47;
                        if (class35.field495 - 48 < var26) {
                            class19.field203 = class35.field495 - (int) (635.0D / this.field319) - 48;
                        }
                        if (var25 < 48) {
                            class5.field47 = (int) (503.0D / this.field319) + 48;
                        }
                        if (var27 > class15.field150 - 48) {
                            class5.field47 = class15.field150 - (int) (503.0D / this.field319) - 48;
                        }
                        return;
                    }
                }
            } while (this.field320.method102(false) <= 0);
            for (int var3 = 0; var3 < this.field324; var3++) {
                if (this.field309[var3].method102(false) >= this.field320.method102(false)) {
                    class15 var4 = this.field320.method100(95);
                    class15 var5 = this.field309[var3].method120(47, 32, arg0 - 479).method122(this.field320.method102(false), -21024, 0).method100(56);
                    if (var4.method103(var5, (byte) -75) == 0) {
                        var2 = true;
                        this.field290 = true;
                        class27.field386 = var3;
                        break;
                    }
                }
            }
            if (!var2) {
                this.field320.method106(this.field320.method102(false) - 1, 0);
            }
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "d", descriptor = "(B)V", line = 1035)
    public static void method165(byte arg0) {
        field259 = null;
        field276 = null;
        field287 = null;
        if (arg0 != -27) {
            field276 = null;
        }
        field344 = null;
        field342 = null;
        field297 = null;
        field299 = null;
        field345 = null;
        field301 = null;
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(ILjava/awt/Component;)V", line = 1063)
    private static final void method166(int arg0, Component arg1) {
        Method var2 = class14.field126;
        if (arg0 != -19019) {
            return;
        }
        if (var2 != null) {
            try {
                var2.invoke(arg1, Boolean.FALSE);
            } catch (Throwable var4) {
            }
        }
        arg1.addKeyListener(class12.field105);
        arg1.addFocusListener(class12.field105);
    }

    @OriginalMember(owner = "mapview!mapview", name = "b", descriptor = "(B)V", line = 1116)
    public final void method72(byte arg0) {
        method165((byte) -27);
        class18.method140(-112);
        class15.method99((byte) 55);
        class36.method243((byte) -85);
        class34.method233((byte) -47);
        class1.method8(69);
        class12.method60(arg0 ^ 0xFFFFFFC8);
        class9.method50((byte) 85);
        class30.method204(18186);
        class20.method146(arg0 ^ 0xFFFFFFF2);
        class13.method86(false);
        class16.method129();
        class39.method253(-64);
        class5.method25((byte) -31);
        class27.method188(-1);
        class26.method181(false);
        class17.method137(false);
        class8.method44();
        class6.method26((byte) 57);
        class35.method240(arg0 ^ 0xFFFFFFD7);
        class31.method209(arg0 ^ 0xFFFFFFA0);
        class10.method55(0);
        class32.method216();
        class2.method12(arg0 - 120);
        class25.method174(arg0);
        class3.method18((byte) 113);
        class29.method197(30000);
        class33.method230((byte) -95);
        class11.method58((byte) -9);
        class21.method150(32);
        class4.method20((byte) -78);
        class28.method193(11877);
        class41.method263();
        class19.method142((byte) -35);
        this.field286 = null;
        this.field306 = null;
        this.field267 = null;
        this.field335 = null;
        this.field270 = null;
        this.field264 = null;
        this.field304 = null;
        this.field320 = null;
        this.field285 = null;
        this.field325 = null;
        this.field281 = null;
        this.field309 = null;
        this.field330 = null;
        this.field292 = null;
        this.field322 = null;
        this.field334 = null;
        this.field305 = null;
        this.field277 = null;
        this.field262 = null;
        this.field274 = null;
        this.field261 = null;
        this.field314 = null;
        this.field340 = null;
        this.field249 = null;
        this.field260 = null;
        this.field257 = null;
        this.field300 = null;
        this.field289 = null;
        this.field255 = null;
        this.field284 = null;
    }

    @OriginalMember(owner = "mapview!mapview", name = "h", descriptor = "(I)V", line = 1298)
    private final void method167(int arg0) {
        class21.field238 = false;
        try {
            Graphics var2 = class3.field32.getGraphics();
            if (arg0 != 26418) {
                return;
            }
            class29.field411.method23(var2, 0, 0, 87);
        } catch (Exception var4) {
            class3.field32.repaint();
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(Ljava/lang/String;ILia;)Z", line = 1323)
    private final boolean method168(String arg0, int arg1, class15 arg2) {
        try {
            if (class33.field477 == null) {
                class21.field239 = method158((byte) 104, new class15[] { this.field270, field297, arg2 });
                String var4;
                if (arg0 == "main_file_cache.dat0") {
                    var4 = "worldmap.main.js5?crc=-735698847";
                } else if (arg0 == "main_file_cache.dat1") {
                    var4 = "worldmap.dungeon.js5?crc=-1440450896";
                } else if (arg0 == "main_file_cache.dat2") {
                    var4 = "worldmap.extra.js5?crc=-81160059";
                } else if (arg0 == "main_file_cache.idx1") {
                    var4 = "mapview.fontmetrics.js5?crc=-447025815";
                } else {
                    var4 = "mapview.sprites.js5?crc=-1292288506";
                }
                class33.field477 = new DataInputStream((new URL(this.getCodeBase(), var4)).openStream());
                int var5;
                if (arg0 == "main_file_cache.dat0") {
                    var5 = 417825;
                } else if (arg0 == "main_file_cache.dat1") {
                    var5 = 154673;
                } else if (arg0 == "main_file_cache.dat2") {
                    var5 = 145121;
                } else if (arg0 == "main_file_cache.idx1") {
                    var5 = 165;
                } else {
                    var5 = 8294;
                }
                class10.field84 = 0;
                class29.field410 = 0;
                class2.field20 = new byte[var5];
            }
            int var6 = class29.field410;
            if (arg1 != -16025) {
                this.method157(12, -119);
            }
            int var7 = class2.field20.length;
            if (var6 >= var7) {
                class33.field477.close();
                class33.field477 = null;
                if (!this.method164(class2.field20, 15, arg0)) {
                    this.method68("download", arg1 + 16026);
                    class2.field20 = null;
                }
                return true;
            }
            class10.field84++;
            if (class10.field84 >= 1500) {
                throw new IOException();
            }
            DataInputStream var8 = class33.field477;
            int var9 = var8.available();
            if (var9 < 0) {
                throw new EOFException();
            } else if (var9 == 0) {
                return false;
            } else {
                if (var9 > var7 - var6) {
                    var9 = var7 - var6;
                }
                int var10 = var8.read(class2.field20, var6, var9);
                if (var10 < 0) {
                    throw new EOFException();
                } else if (var10 == 0) {
                    return false;
                } else {
                    class10.field84 = 0;
                    int var11 = var6 + var10;
                    int var12 = var11 * 100 / var7;
                    class21.field239 = method158((byte) 104, new class15[] { this.field277, field297, arg2, class9.field74, class19.method145(-137, var12), class1.field5 });
                    class29.field410 = var11;
                    return false;
                }
            }
        } catch (IOException var16) {
            try {
                class33.field477.close();
            } catch (Exception var15) {
            }
            class2.field20 = null;
            class33.field477 = null;
            this.method68(new String("download"), 1);
            return true;
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "i", descriptor = "(I)V", line = 1483)
    private final void method169(int arg0) {
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
        String[] var6 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "d:/windows/", "d:/winnt/", "e:/windows/", "e:/winnt/", "f:/windows/", "f:/winnt/", "c:/", var4, "/tmp/", "" };
        for (int var7 = arg0; var7 < var6.length; var7++) {
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
                        class12.field104 = var8 + var2 + "/rsmap/";
                        return;
                    }
                }
            } catch (Exception var14) {
            }
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "j", descriptor = "(I)Z", line = 1544)
    private final boolean method170(int arg0) {
        if (class26.field369 == 0) {
            this.method169(0);
            class26.field369 = 1;
        }
        if (class26.field369 == 1) {
            class35.field493 = 15;
            boolean var2 = this.method156("main_file_cache.idx0", this.field255, 110);
            if (!var2) {
                return false;
            }
            class33.field472 = class35.field494;
            class35.field494 = null;
            if (class33.field472 == null) {
                throw new RuntimeException("T1");
            }
            class26.field369 = 2;
        }
        if (class26.field369 == 2) {
            class35.field493 = 30;
            boolean var3 = this.method156("main_file_cache.idx1", this.field249, -93);
            if (!var3) {
                return false;
            }
            class3.field28 = class35.field494;
            class35.field494 = null;
            if (class3.field28 == null) {
                throw new RuntimeException("T2");
            }
            class26.field369 = 3;
        }
        if (class26.field369 == 3) {
            class26.field369 = 10;
            class18.field182 = new class20[1];
        }
        if (class26.field369 == 10) {
            class35.field493 = 50;
            boolean var4 = this.method156("main_file_cache.dat0", this.field286, -93);
            if (!var4) {
                return false;
            }
            class18.field182[0] = class35.field494;
            class35.field494 = null;
            if (class18.field182[0] == null) {
                throw new RuntimeException("T3");
            }
            class26.field369 = 20;
        }
        if (arg0 >= -26) {
            this.method157(-5, 89);
        }
        if (class26.field369 != 20) {
            return false;
        }
        class29.field412 = class34.method231((byte) 78, class33.field472, class28.field404, class21.field234);
        class1.field6 = class34.method237(class21.field234, class33.field472, class31.field435, true);
        this.field314 = class36.method244(class21.field234, class19.field204, class33.field472, (byte) -16, class3.field28);
        this.field305 = new class16(11, true, this);
        this.field304 = new class16(12, true, this);
        this.field264 = new class16(14, true, this);
        this.field340 = new class16(17, true, this);
        this.field322 = new class16(19, true, this);
        this.field261 = new class16(22, true, this);
        this.field260 = new class16(26, true, this);
        this.field306 = new class16(30, true, this);
        class35.field493 = 100;
        class21.field239 = this.field281;
        class31.method208(class35.field493, -1, null, class21.field239);
        this.field253 = this.field314.method213(this.field262) + 20;
        this.method162((byte) 79);
        class15[] var5 = this.field274;
        for (int var6 = 0; var6 < var5.length; var6++) {
            class15 var7 = var5[var6];
            int var8 = this.field314.method213(var7);
            if (var8 > this.field271) {
                this.field271 = var8;
            }
        }
        this.field327 = this.field271 + 18 + 16;
        if (this.field327 > 140) {
            int var9 = this.field263 - this.field327 - this.field268;
            this.field291 = var9 / 25;
            this.field302 = this.field291 * 5;
            int var10 = var9 - this.field291 * 25;
            this.field318 = this.field302 + this.field291;
            this.field293 = var10 / 2 + this.field327 + this.field291 + this.field268;
        }
        return true;
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(BI)V", line = 1725)
    private final void method171(byte arg0, int arg1) {
        if (arg0 > -81) {
            this.method171((byte) -82, 33);
        }
        if (class18.field182.length <= arg1) {
            return;
        }
        class20 var3 = class18.field182[arg1];
        class1 var4 = new class1(var3.method186(94, class17.field173, class11.field94));
        var4.method2(false);
        class1 var5 = new class1(var3.method186(64, class17.field173, class27.field381));
        this.field324 = var5.method1(-1119584920);
        for (int var6 = 0; var6 < this.field324; var6++) {
            this.field309[var6] = var5.method2(false);
            this.field257[var6] = var5.method1(-1119584920);
            this.field285[var6] = var5.method1(-1119584920);
            this.field330[var6] = var5.method5(-2);
            class15 var7 = this.field309[var6].method120(47, 32, 45);
            int var8 = this.field314.method213(var7);
            if (this.field258 < var8) {
                this.field258 = var8;
            }
            int var9 = this.field314.method213(this.field284);
            if (var9 > this.field258) {
                this.field258 = var9;
            }
        }
        class31.field434 = new class13();
        class31.field434.method82((byte) -127, class18.field182[arg1]);
        class5.field47 = class11.field95;
        class19.field203 = class30.field427;
        this.field303 = 180;
        this.field331 = 503 - this.field303 - 20;
        this.field338 = class35.field495 * this.field303 / class15.field150;
        this.field263 = 630 - this.field338;
        this.field289 = new class7(this.field338, this.field303);
        this.field289.method31();
        this.method172(this.field338, 0, (byte) 108, class15.field150, 0, 0, class35.field495, 0, this.field303);
        class8.method36(0, 0, this.field338, this.field303, 0);
        class8.method36(1, 1, this.field338 - 2, this.field303 + -2, this.field317);
        class29.field411.method206(113);
    }

    @OriginalMember(owner = "mapview!mapview", name = "d", descriptor = "(I)V", line = 1804)
    public final void method65(int arg0) {
        if (!class11.field97) {
            class11.field97 = this.method170(-95);
            class31.method208(class35.field493, -1, null, class21.field239);
            return;
        }
        if (this.field290) {
            this.field290 = false;
            class21.field238 = true;
            class8.method45();
            int var2 = class19.field203 - (int) (635.0D / this.field319);
            int var3 = (int) (635.0D / this.field319) + class19.field203;
            int var4 = class5.field47 + (int) (503.0D / this.field319);
            int var5 = class5.field47 - (int) (503.0D / this.field319);
            this.method172(635, 0, (byte) 117, var4, 0, var2, var3, var5, 503);
            if (this.field283) {
                this.field289.method34(this.field263, this.field331);
                class8.method37(this.field338 * var2 / class35.field495 + this.field263, this.field303 * var5 / class15.field150 + this.field331, (var3 - var2) * this.field338 / class35.field495, (var4 - var5) * this.field303 / class15.field150, 16711680, 128);
                class8.method36(this.field338 * var2 / class35.field495 + this.field263, this.field303 * var5 / class15.field150 + this.field331, (var3 - var2) * this.field338 / class35.field495, (var4 - var5) * this.field303 / class15.field150, 16711680);
                if (this.field323 > 0 && this.field323 % 10 < 5) {
                    for (int var6 = 0; var6 < class10.field81; var6++) {
                        if (class31.field434.field109[var6] == this.field296) {
                            int var7 = class31.field434.field116[var6] * this.field338 / class35.field495 + this.field263;
                            int var8 = class31.field434.field115[var6] * this.field303 / class15.field150 + this.field331;
                            class8.method39(var7, var8, 2, 16776960, 256);
                        }
                    }
                }
            }
            if (this.field275) {
                this.method163(7829367, this.field292, 18, this.field268, 10066329, this.field327, this.field295, 5592405, (byte) 25);
                this.method163(7829367, class21.field234, this.field315 - 36, this.field268, 10066329, this.field327, this.field295 + 18, 5592405, (byte) 25);
                this.method163(7829367, this.field300, 18, this.field268, 10066329, this.field327, this.field295 + this.field315 - 18, 5592405, (byte) 25);
                int var9 = this.field295 + 3 + 18;
                int var10 = this.field343;
                for (int var11 = 0; var11 < 24; var11++) {
                    if (var10 < class1.field6.length && var10 < this.field274.length) {
                        if (this.field274[var10].method105((byte) 55, class20.field226)) {
                            var10++;
                            var11--;
                            continue;
                        }
                        class1.field6[var10].method33(this.field268 + 3, var9);
                        this.field314.method218(this.field274[var10], this.field268 + 21, var9 + 14, 0, -1);
                        int var12 = 16777215;
                        if (this.field307 == var10) {
                            var12 = 12298922;
                        }
                        if (this.field323 > 0 && this.field323 % 10 < 5 && this.field296 == var10) {
                            var12 = 16776960;
                        }
                        this.field314.method218(this.field274[var10], this.field268 + 20, var9 + 13, var12, -1);
                    }
                    var9 += 17;
                    var10++;
                }
            }
            if (class18.field182.length == 1) {
                this.method163(this.field250, this.field325, 18, this.field263, this.field317, this.field338, this.field331 + this.field303, this.field254, (byte) 25);
                this.method163(this.field250, this.field334, 18, this.field268, this.field317, this.field327, this.field315 + this.field295, this.field254, (byte) 25);
                if (this.field329 == 3.0D) {
                    this.method163(this.field298, class3.field27, this.field337, this.field293, this.field316, this.field302, this.field341, this.field282, (byte) 25);
                } else {
                    this.method163(this.field250, class3.field27, this.field337, this.field293, this.field317, this.field302, this.field341, this.field254, (byte) 25);
                }
                if (this.field329 == 4.0D) {
                    this.method163(this.field298, class39.field513, this.field337, this.field318 + this.field293, this.field316, this.field302, this.field341, this.field282, (byte) 25);
                } else {
                    this.method163(this.field250, class39.field513, this.field337, this.field318 + this.field293, this.field317, this.field302, this.field341, this.field254, (byte) 25);
                }
                if (this.field329 == 6.0D) {
                    this.method163(this.field298, class29.field415, this.field337, this.field318 * 2 + this.field293, this.field316, this.field302, this.field341, this.field282, (byte) 25);
                } else {
                    this.method163(this.field250, class29.field415, this.field337, this.field318 * 2 + this.field293, this.field317, this.field302, this.field341, this.field254, (byte) 25);
                }
                if (this.field329 == 8.0D) {
                    this.method163(this.field298, class15.field155, this.field337, this.field318 * 3 + this.field293, this.field316, this.field302, this.field341, this.field282, (byte) 25);
                } else {
                    this.method163(this.field250, class15.field155, this.field337, this.field318 * 3 + this.field293, this.field317, this.field302, this.field341, this.field254, (byte) 25);
                }
            } else {
                this.method163(this.field250, this.field325, 18, this.field263, this.field317, this.field338, this.field331 + this.field303, this.field254, (byte) 25);
                this.method163(this.field250, this.field334, 18, this.field268, this.field317, this.field327, this.field315 + this.field295, this.field254, (byte) 25);
                this.method161(this.field250, 20);
                int var13 = this.field341 + this.field328;
                if (this.field329 == 3.0D) {
                    this.method163(this.field298, class3.field27, this.field337, this.field293, this.field316, this.field302, var13, this.field282, (byte) 25);
                } else {
                    this.method163(this.field250, class3.field27, this.field337, this.field293, this.field317, this.field302, var13, this.field254, (byte) 25);
                }
                if (this.field329 == 4.0D) {
                    this.method163(this.field298, class39.field513, this.field337, this.field293 + this.field318, this.field316, this.field302, var13, this.field282, (byte) 25);
                } else {
                    this.method163(this.field250, class39.field513, this.field337, this.field293 + this.field318, this.field317, this.field302, var13, this.field254, (byte) 25);
                }
                if (this.field329 == 6.0D) {
                    this.method163(this.field298, class29.field415, this.field337, this.field318 * 2 + this.field293, this.field316, this.field302, var13, this.field282, (byte) 25);
                } else {
                    this.method163(this.field250, class29.field415, this.field337, this.field318 * 2 + this.field293, this.field317, this.field302, var13, this.field254, (byte) 25);
                }
                if (this.field329 == 8.0D) {
                    this.method163(this.field298, class15.field155, this.field337, this.field318 * 3 + this.field293, this.field316, this.field302, var13, this.field282, (byte) 25);
                } else {
                    this.method163(this.field250, class15.field155, this.field337, this.field318 * 3 + this.field293, this.field317, this.field302, var13, this.field254, (byte) 25);
                }
            }
            if (class33.field476) {
                this.method163(this.field250, this.field262, this.field273, this.field279, this.field317, this.field253, this.field247, this.field254, (byte) 25);
                if (class28.field401) {
                    class8.method37(this.field279 + this.field253 + 2, this.field247, this.field258 + 10, this.field273, 8925952, 192);
                    class8.method36(this.field253 + this.field279 + 2, this.field247, this.field258 + 10, this.field273, 16777215);
                    if (class27.field386 > -1 && this.field320.method102(false) > 0) {
                        class15 var14 = this.field309[class27.field386].method120(47, 32, arg0 - 612);
                        int var15 = this.field320.method102(false);
                        if (var14.method102(false) < var15) {
                            var15 = var14.method102(false);
                        }
                        this.field314.method218(var14, this.field279 + this.field253 + 6, 20, 10066176, 0);
                        this.field314.method218(var14.method122(var15, -21024, 0), this.field253 + this.field279 + 6, 20, 16777215, 0);
                    } else {
                        this.field314.method218(this.field284, this.field279 + this.field253 + 6, 20, 16776960, 0);
                    }
                }
            }
        }
        if (arg0 != 635) {
            this.method163(-98, null, -96, 103, 83, -95, -58, 38, (byte) 123);
        }
        if (class21.field238) {
            this.method167(26418);
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(IIBIIIIII)V", line = 2002)
    private final void method172(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var10 = 118 / ((37 - arg2) / 43);
        class31.field434.method75(arg1, arg5, arg0, arg7, arg3, arg6, arg8, 2, arg4);
        if (arg6 - arg5 > -arg4 + arg0) {
            return;
        }
        class31.field434.method79(arg5, arg0, arg1, arg3, this.field319, 1639797104, arg8, arg6, arg7, arg4);
        class31.field434.method89(arg6, arg8, arg3, arg0, 113, arg1, arg7, arg5, arg4);
        class31.field434.method81(this.field296, arg1, arg6, arg0, arg4, arg3, arg7, arg8, 12428, arg5, this.field323);
        if (this.field329 == this.field319 && class25.field353) {
            for (int var11 = 0; var11 < this.field324; var11++) {
                int var12 = this.field285[var11];
                int var13 = this.field257[var11];
                int var14 = var13 - class28.field403;
                int var15 = class34.field483 + class15.field150 - var12;
                int var16 = (var14 - arg5) * (-arg4 + arg0) / (arg6 - arg5) + arg4;
                int var17 = (arg8 - arg1) * (var15 - arg7) / (arg3 - arg7) + arg1;
                int var18 = this.field330[var11];
                int var19 = 16777215;
                class16 var20 = null;
                if (var18 == 0) {
                    if (this.field319 == 3.0D) {
                        var20 = this.field305;
                    }
                    if (this.field319 == 4.0D) {
                        var20 = this.field304;
                    }
                    if (this.field319 == 6.0D) {
                        var20 = this.field264;
                    }
                    if (this.field319 == 8.0D) {
                        var20 = this.field340;
                    }
                }
                if (var18 == 1) {
                    if (this.field319 == 3.0D) {
                        var20 = this.field264;
                    }
                    if (this.field319 == 4.0D) {
                        var20 = this.field340;
                    }
                    if (this.field319 == 6.0D) {
                        var20 = this.field322;
                    }
                    if (this.field319 == 8.0D) {
                        var20 = this.field261;
                    }
                }
                if (var18 == 2) {
                    if (this.field319 == 3.0D) {
                        var20 = this.field322;
                    }
                    if (this.field319 == 4.0D) {
                        var20 = this.field261;
                    }
                    var19 = 16755200;
                    if (this.field319 == 6.0D) {
                        var20 = this.field260;
                    }
                    if (this.field319 == 8.0D) {
                        var20 = this.field306;
                    }
                }
                if (var20 != null) {
                    class15 var21 = this.field309[var11];
                    int var22 = 1;
                    for (int var23 = 0; var21.method102(false) > var23; var23++) {
                        if (var21.method109(var23, (byte) 84) == 47) {
                            var22++;
                        }
                    }
                    int var24 = var17 - var20.method127() * (var22 - 1) / 2;
                    int var25 = var24 + var20.method126() / 2;
                    while (true) {
                        int var26 = var21.method108(47, 24704);
                        if (var26 == -1) {
                            var20.method124(var21, var16, var25, var19, true);
                            break;
                        }
                        class15 var27 = var21.method122(var26, -21024, 0);
                        var20.method124(var27, var16, var25, var19, true);
                        var25 += var20.method127();
                        var21 = var21.method117(var26 + 1, (byte) 37);
                    }
                }
            }
        }
        if (!class25.field365) {
            return;
        }
        for (int var28 = class28.field403 / 64; var28 < (class35.field495 + class28.field403) / 64; var28++) {
            for (int var29 = class34.field483 / 64; var29 < (class34.field483 + class15.field150) / 64; var29++) {
                int var30 = var29 * 64;
                int var31 = var28 * 64;
                int var32 = var31 - class28.field403;
                int var33 = class34.field483 + class15.field150 - var30;
                int var34 = (arg0 - arg4) * (-arg5 + var32) / (arg6 - arg5) + arg4;
                int var35 = arg1 + (var33 - arg7 - 64) * (-arg1 + arg8) / (arg3 - arg7);
                int var36 = (arg8 - arg1) * (-arg7 + var33) / (arg3 - arg7) + arg1;
                int var37 = arg4 + (var32 + 64 - arg5) * (-arg4 + arg0) / (arg6 - arg5);
                class8.method36(var34, var35, var37 - var34, var36 - var35, 16777215);
                this.field314.method223(method158((byte) 104, new class15[] { class19.method145(-137, var28), class30.field421, class19.method145(-137, var29) }), var37 - 5, var36 - 5, 16777215, -1);
                if (var28 == 33 && var29 >= 71 && var29 <= 73) {
                    this.field314.method217(class3.field25, (var34 + var37) / 2, (var35 + var36) / 2, 16711680, -1);
                }
            }
        }
    }
}
