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
public class mapview extends class12 {

    @OriginalMember(owner = "mapview!mapview", name = "J", descriptor = "I")
    private int field297 = 8912896;

    @OriginalMember(owner = "mapview!mapview", name = "y", descriptor = "I")
    private int field286 = 33;

    @OriginalMember(owner = "mapview!mapview", name = "U", descriptor = "I")
    private int field308 = -1;

    @OriginalMember(owner = "mapview!mapview", name = "cb", descriptor = "Z")
    private boolean field316 = false;

    @OriginalMember(owner = "mapview!mapview", name = "db", descriptor = "I")
    private int field317 = 6706483;

    @OriginalMember(owner = "mapview!mapview", name = "N", descriptor = "Lr;")
    private class33 field301 = this.field316 ? class31.field439 : class31.field439;

    @OriginalMember(owner = "mapview!mapview", name = "o", descriptor = "I")
    private int field276 = 10;

    @OriginalMember(owner = "mapview!mapview", name = "ib", descriptor = "I")
    private int field322 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "bb", descriptor = "I")
    private int field315 = 23;

    @OriginalMember(owner = "mapview!mapview", name = "L", descriptor = "Lr;")
    private class33 field299 = this.field316 ? class26.field386 : class10.field136;

    @OriginalMember(owner = "mapview!mapview", name = "A", descriptor = "I")
    private int field288 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "M", descriptor = "I")
    private int field300 = 7824964;

    @OriginalMember(owner = "mapview!mapview", name = "R", descriptor = "I")
    private int field305 = this.field316 ? 252 : 111;

    @OriginalMember(owner = "mapview!mapview", name = "X", descriptor = "I")
    private int field311 = 5;

    @OriginalMember(owner = "mapview!mapview", name = "qb", descriptor = "I")
    private int field330 = 10027008;

    @OriginalMember(owner = "mapview!mapview", name = "rb", descriptor = "Z")
    private boolean field331 = false;

    @OriginalMember(owner = "mapview!mapview", name = "D", descriptor = "Lr;")
    private class33 field291 = this.field316 ? class23.field252 : class23.field252;

    @OriginalMember(owner = "mapview!mapview", name = "t", descriptor = "I")
    private int field281 = this.field316 ? 76 : 75;

    @OriginalMember(owner = "mapview!mapview", name = "x", descriptor = "I")
    private int field285 = -1;

    @OriginalMember(owner = "mapview!mapview", name = "F", descriptor = "I")
    private int field293 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "eb", descriptor = "I")
    private int field318 = this.field316 ? 220 : 79;

    @OriginalMember(owner = "mapview!mapview", name = "ub", descriptor = "Z")
    private boolean field334 = false;

    @OriginalMember(owner = "mapview!mapview", name = "z", descriptor = "Lr;")
    private class33 field287 = this.field316 ? class21.field222 : class21.field222;

    @OriginalMember(owner = "mapview!mapview", name = "hb", descriptor = "D")
    private double field321 = 4.0D;

    @OriginalMember(owner = "mapview!mapview", name = "Q", descriptor = "Lr;")
    private class33 field304 = this.field316 ? class21.field226 : class21.field226;

    @OriginalMember(owner = "mapview!mapview", name = "Ib", descriptor = "I")
    private int field348 = 450;

    @OriginalMember(owner = "mapview!mapview", name = "zb", descriptor = "I")
    private int field339 = 170;

    @OriginalMember(owner = "mapview!mapview", name = "Z", descriptor = "I")
    private int field313 = 5;

    @OriginalMember(owner = "mapview!mapview", name = "Fb", descriptor = "I")
    private int field345 = 11141120;

    @OriginalMember(owner = "mapview!mapview", name = "B", descriptor = "Lr;")
    private class33 field289 = this.field316 ? class21.field227 : class21.field227;

    @OriginalMember(owner = "mapview!mapview", name = "Eb", descriptor = "I")
    private int field344 = 471;

    @OriginalMember(owner = "mapview!mapview", name = "C", descriptor = "I")
    private int field290 = 50;

    @OriginalMember(owner = "mapview!mapview", name = "r", descriptor = "I")
    private int field279 = this.field316 ? 108 : 107;

    @OriginalMember(owner = "mapview!mapview", name = "Rb", descriptor = "Z")
    private boolean field357 = false;

    @OriginalMember(owner = "mapview!mapview", name = "fb", descriptor = "I")
    private int field319 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "I", descriptor = "I")
    private int field296 = 30;

    @OriginalMember(owner = "mapview!mapview", name = "Tb", descriptor = "I")
    private int field359 = 8943445;

    @OriginalMember(owner = "mapview!mapview", name = "V", descriptor = "I")
    private int field309 = this.field290 + this.field276;

    @OriginalMember(owner = "mapview!mapview", name = "s", descriptor = "Lr;")
    private class33 field280 = this.field316 ? class10.field126 : class10.field126;

    @OriginalMember(owner = "mapview!mapview", name = "Ob", descriptor = "I")
    private int field354 = this.field316 ? 83 : 70;

    @OriginalMember(owner = "mapview!mapview", name = "E", descriptor = "D")
    private double field292 = 4.0D;

    @OriginalMember(owner = "mapview!mapview", name = "v", descriptor = "Lr;")
    private class33 field283 = this.field316 ? class14.field174 : class14.field174;

    @OriginalMember(owner = "mapview!mapview", name = "tb", descriptor = "I")
    private int field333 = 140;

    @OriginalMember(owner = "mapview!mapview", name = "Qb", descriptor = "I")
    private int field356 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "Jb", descriptor = "I")
    private int field349 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "Mb", descriptor = "I")
    private int field352 = -20;

    @OriginalMember(owner = "mapview!mapview", name = "Sb", descriptor = "I")
    private int field358 = -1;

    @OriginalMember(owner = "mapview!mapview", name = "Gb", descriptor = "Lr;")
    private class33 field346 = this.field316 ? class33.field464 : class33.field464;

    @OriginalMember(owner = "mapview!mapview", name = "mb", descriptor = "Lr;")
    private class33 field326 = this.field316 ? class20.field214 : class25.field268;

    @OriginalMember(owner = "mapview!mapview", name = "Nb", descriptor = "Lr;")
    private class33 field353 = this.field316 ? class35.field478 : class20.field209;

    @OriginalMember(owner = "mapview!mapview", name = "ac", descriptor = "Z")
    private boolean field366 = true;

    @OriginalMember(owner = "mapview!mapview", name = "Cb", descriptor = "I")
    private int field342 = 40;

    @OriginalMember(owner = "mapview!mapview", name = "Zb", descriptor = "Lr;")
    private class33 field365 = this.field316 ? class12.field162 : class12.field162;

    @OriginalMember(owner = "mapview!mapview", name = "Yb", descriptor = "I")
    private int field364 = 500;

    @OriginalMember(owner = "mapview!mapview", name = "jb", descriptor = "[I")
    private int[] field323 = new int[this.field364];

    @OriginalMember(owner = "mapview!mapview", name = "cc", descriptor = "I")
    private int field368 = 5;

    @OriginalMember(owner = "mapview!mapview", name = "Wb", descriptor = "I")
    private int field362 = this.field316 ? 115 : 102;

    @OriginalMember(owner = "mapview!mapview", name = "ab", descriptor = "I")
    private int field314 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "H", descriptor = "[I")
    private int[] field295 = new int[this.field364];

    @OriginalMember(owner = "mapview!mapview", name = "Y", descriptor = "[Lr;")
    private class33[] field312 = new class33[this.field364];

    @OriginalMember(owner = "mapview!mapview", name = "w", descriptor = "[I")
    private int[] field284 = new int[this.field364];

    @OriginalMember(owner = "mapview!mapview", name = "bc", descriptor = "I")
    private int field367 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "G", descriptor = "[[B")
    public static byte[][] field294 = new byte[1000][];

    @OriginalMember(owner = "mapview!mapview", name = "W", descriptor = "Lr;")
    public static class33 field310 = class29.method192("???", (byte) 126);

    @OriginalMember(owner = "mapview!mapview", name = "Bb", descriptor = "Lr;")
    public static class33 field341 = class29.method192("Loom", (byte) 126);

    @OriginalMember(owner = "mapview!mapview", name = "gb", descriptor = "[[B")
    public static byte[][] field320 = new byte[250][];

    @OriginalMember(owner = "mapview!mapview", name = "Xb", descriptor = "Lr;")
    public static class33 field363 = class29.method192("Platelegs Shop", (byte) 126);

    @OriginalMember(owner = "mapview!mapview", name = "Db", descriptor = "Lr;")
    public static class33 field343 = class29.method192("Crafting Shop", (byte) 126);

    @OriginalMember(owner = "mapview!mapview", name = "pb", descriptor = "Lr;")
    public static class33 field329 = class29.method192("Kebab Seller", (byte) 126);

    @OriginalMember(owner = "mapview!mapview", name = "wb", descriptor = "Lr;")
    public static class33 field336 = class29.method192("Mining Shop", (byte) 126);

    @OriginalMember(owner = "mapview!mapview", name = "p", descriptor = "I")
    private int field277;

    @OriginalMember(owner = "mapview!mapview", name = "u", descriptor = "I")
    private int field282;

    @OriginalMember(owner = "mapview!mapview", name = "O", descriptor = "I")
    private int field302;

    @OriginalMember(owner = "mapview!mapview", name = "nb", descriptor = "I")
    private int field327;

    @OriginalMember(owner = "mapview!mapview", name = "xb", descriptor = "I")
    private int field337;

    @OriginalMember(owner = "mapview!mapview", name = "Hb", descriptor = "I")
    private int field347;

    @OriginalMember(owner = "mapview!mapview", name = "Lb", descriptor = "I")
    private int field351;

    @OriginalMember(owner = "mapview!mapview", name = "Pb", descriptor = "I")
    private int field355;

    @OriginalMember(owner = "mapview!mapview", name = "Vb", descriptor = "I")
    public static int field361;

    @OriginalMember(owner = "mapview!mapview", name = "P", descriptor = "Lia;")
    private class18 field303;

    @OriginalMember(owner = "mapview!mapview", name = "S", descriptor = "Lia;")
    private class18 field306;

    @OriginalMember(owner = "mapview!mapview", name = "kb", descriptor = "Lia;")
    private class18 field324;

    @OriginalMember(owner = "mapview!mapview", name = "ob", descriptor = "Lia;")
    private class18 field328;

    @OriginalMember(owner = "mapview!mapview", name = "sb", descriptor = "Lia;")
    private class18 field332;

    @OriginalMember(owner = "mapview!mapview", name = "vb", descriptor = "Lia;")
    private class18 field335;

    @OriginalMember(owner = "mapview!mapview", name = "yb", descriptor = "Lia;")
    private class18 field338;

    @OriginalMember(owner = "mapview!mapview", name = "Ub", descriptor = "Lia;")
    private class18 field360;

    @OriginalMember(owner = "mapview!mapview", name = "Ab", descriptor = "Lr;")
    private class33 field340;

    @OriginalMember(owner = "mapview!mapview", name = "Kb", descriptor = "Ld;")
    private class7 field350;

    @OriginalMember(owner = "mapview!mapview", name = "K", descriptor = "Lda;")
    private static class8 field298;

    @OriginalMember(owner = "mapview!mapview", name = "T", descriptor = "Le;")
    private class9 field307;

    @OriginalMember(owner = "mapview!mapview", name = "dc", descriptor = "Z")
    public static boolean field369;

    @OriginalMember(owner = "mapview!mapview", name = "q", descriptor = "[Lr;")
    private class33[] field278;

    @OriginalMember(owner = "mapview!mapview", name = "lb", descriptor = "[Lr;")
    private class33[] field325;

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(IIIILr;IIII)V", line = 16)
    private final void method165(int arg0, int arg1, int arg2, int arg3, class33 arg4, int arg5, int arg6, int arg7, int arg8) {
        class1.method5(arg3, arg1, arg7, arg2, 0);
        int var13 = arg7 - 2;
        int var11 = arg2 - 2;
        if (arg8 != -1) {
            return;
        }
        int var12 = arg3 + 1;
        int var10 = arg1 + 1;
        class1.method11(var12, var10, var13, var11, arg6);
        class1.method4(var12, var10, var13, arg0);
        class1.method7(var12, var10, var11, arg0);
        class1.method4(var12, var10 + var11 - 1, var13, arg5);
        class1.method7(var12 + var13 - 1, var10, var11, arg5);
        this.field350.method48(arg4, var13 / 2 + var12 + 1, var11 / 2 + var10 + 1 + 4, 0);
        this.field350.method48(arg4, var13 / 2 + var12, var11 / 2 + var10 + 4, 16777215);
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(Ljava/lang/String;B[B)V", line = 45)
    private final void method166(String arg0, byte arg1, byte[] arg2) throws IOException {
        FileOutputStream var4 = new FileOutputStream(arg0);
        if (arg1 < -9) {
            var4.write(arg2, 0, arg2.length);
            var4.close();
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "h", descriptor = "(I)V", line = 85)
    private final void method167(int arg0) {
        String var3;
        try {
            String var2 = System.getProperty("user.home");
            if (var2 == null) {
                var3 = "~/";
            } else {
                var3 = var2 + "/";
            }
        } catch (Exception var14) {
            var3 = "~/";
        }
        int var5 = 14 / ((arg0 + 18) / 34);
        String[] var6 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "d:/windows/", "d:/winnt/", "e:/windows/", "e:/winnt/", "f:/windows/", "f:/winnt/", "c:/", var3, "/tmp/", "" };
        String var7 = ".file_store_32";
        for (int var8 = 0; var8 < var6.length; var8++) {
            try {
                String var9 = var6[var8];
                if (var9.length() > 0) {
                    File var10 = new File(var9);
                    if (!var10.exists()) {
                        continue;
                    }
                }
                File var11 = new File(var9 + var7);
                if (var11.exists() || var11.mkdir()) {
                    File var12 = new File(var11, "rsmap");
                    if (var12.exists() || var12.mkdir()) {
                        class33.field462 = var9 + var7 + "/rsmap/";
                        return;
                    }
                }
            } catch (Exception var15) {
            }
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(BI)V", line = 148)
    private final void method168(byte arg0, int arg1) {
        this.method165(this.field359, 483, 18, 170, class11.method70(0, new class33[] { class5.field64, class11.field145[class24.field261], class25.field275 }), this.field317, arg1, 230, -1);
        if (arg0 <= 90) {
            this.method174(null, null, -126);
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(IIIIIIIII)V", line = 180)
    private final void method169(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class32.field451.method148(arg7, arg5, arg3, arg2, arg1, arg8, false, arg0, arg4);
        if (arg0 - arg3 < -arg5 + arg1) {
            return;
        }
        class32.field451.method156(arg2, arg3, arg4, arg1, arg8, true, this.field292, arg7, arg0, arg5);
        class32.field451.method153(arg0, arg2, arg3, arg8, arg7, arg1, arg4, (byte) -122, arg5);
        if (arg6 <= 58) {
            return;
        }
        class32.field451.method143(arg1, 16776960, this.field322, arg4, arg5, arg8, arg2, arg0, this.field285, arg7, arg3);
        if (this.field321 == this.field292 && class24.field260) {
            for (int var10 = 0; var10 < this.field367; var10++) {
                int var11 = this.field295[var10];
                int var12 = var11 - class14.field176;
                int var13 = this.field323[var10];
                int var14 = class21.field228 + class14.field175 - var13;
                int var15 = (var12 - arg5) * (-arg3 + arg0) / (arg1 - arg5) + arg3;
                int var16 = arg2 + (var14 - arg7) * (-arg2 + arg4) / (arg8 - arg7);
                int var17 = this.field284[var10];
                class18 var18 = null;
                if (var17 == 0) {
                    if (this.field292 == 3.0D) {
                        var18 = this.field306;
                    }
                    if (this.field292 == 4.0D) {
                        var18 = this.field338;
                    }
                    if (this.field292 == 6.0D) {
                        var18 = this.field328;
                    }
                    if (this.field292 == 8.0D) {
                        var18 = this.field332;
                    }
                }
                if (var17 == 1) {
                    if (this.field292 == 3.0D) {
                        var18 = this.field328;
                    }
                    if (this.field292 == 4.0D) {
                        var18 = this.field332;
                    }
                    if (this.field292 == 6.0D) {
                        var18 = this.field360;
                    }
                    if (this.field292 == 8.0D) {
                        var18 = this.field335;
                    }
                }
                int var19 = 16777215;
                if (var17 == 2) {
                    if (this.field292 == 3.0D) {
                        var18 = this.field360;
                    }
                    var19 = 16755200;
                    if (this.field292 == 4.0D) {
                        var18 = this.field335;
                    }
                    if (this.field292 == 6.0D) {
                        var18 = this.field324;
                    }
                    if (this.field292 == 8.0D) {
                        var18 = this.field303;
                    }
                }
                if (var18 != null) {
                    class33 var20 = this.field312[var10];
                    int var21 = 1;
                    for (int var22 = 0; var22 < var20.method224(false); var22++) {
                        if (var20.method209((byte) -60, var22) == 47) {
                            var21++;
                        }
                    }
                    int var23 = var16 - var18.method112() * (var21 - 1) / 2;
                    int var24 = var23 + var18.method116() / 2;
                    while (true) {
                        int var25 = var20.method214(-11509, 47);
                        if (var25 == -1) {
                            var18.method110(var20, var15, var24, var19, true);
                            break;
                        }
                        class33 var26 = var20.method225(0, var25, (byte) -74);
                        var18.method110(var26, var15, var24, var19, true);
                        var24 += var18.method112();
                        var20 = var20.method215(var25 + 1, (byte) -71);
                    }
                }
            }
        }
        if (!class23.field250) {
            return;
        }
        for (int var27 = class14.field176 / 64; var27 < (class21.field229 + class14.field176) / 64; var27++) {
            for (int var28 = class21.field228 / 64; var28 < (class21.field228 + class14.field175) / 64; var28++) {
                int var29 = var27 * 64;
                int var30 = var29 - class14.field176;
                int var31 = var28 * 64;
                int var32 = class14.field175 + class21.field228 - var31;
                int var33 = arg2 + (var32 - arg7 - 64) * (-arg2 + arg4) / (arg8 - arg7);
                int var34 = (arg0 - arg3) * (-arg5 + var30) / (arg1 - arg5) + arg3;
                int var35 = (var30 + 64 - arg5) * (-arg3 + arg0) / (arg1 - arg5) + arg3;
                int var36 = (arg4 - arg2) * (-arg7 + var32) / (arg8 - arg7) + arg2;
                class1.method5(var34, var33, var35 - var34, -var33 + var36, 16777215);
                this.field350.method44(class11.method70(0, new class33[] { class33.method213((byte) 66, var27), class12.field156, class33.method213((byte) 113, var28) }), var35 - 5, var36 + -5, 16777215);
                if (var27 == 33 && var28 >= 71 && var28 <= 73) {
                    this.field350.method48(class4.field35, (var34 + var35) / 2, (var36 + var33) / 2, 16711680);
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "i", descriptor = "(I)V", line = 383)
    private final void method170(int arg0) {
        if (~class37.field500.length == arg0) {
            class20.field215 = 0;
        } else {
            if (class24.field261 < 0) {
                class20.field215 = this.method177(class20.field215, 127);
            } else {
                class20.field215 = class24.field261;
            }
            class24.field261 = this.method177(class20.field215, 75);
        }
        this.method179(class20.field215, (byte) 117);
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(Z)V", line = 409)
    public final void method74(boolean arg0) {
        method175(107);
        class17.method105(arg0);
        class33.method229((byte) 81);
        class25.method162(-1);
        class10.method65(-45);
        class20.method135((byte) -74);
        class12.method87((byte) 120);
        class4.method24((byte) -34);
        class29.method191(26950);
        class8.method52((byte) 65);
        class22.method155((byte) 127);
        class7.method40();
        class18.method114();
        class14.method96((byte) 12);
        class13.method93((byte) -127);
        class5.method34((byte) -116);
        class32.method205((byte) 26);
        class1.method2();
        class35.method243(0);
        class31.method203(255);
        class2.method13(126);
        class36.method246(20);
        class37.method251(9053);
        class23.method157(11481);
        class38.method254((byte) -60);
        class24.method158((byte) 64);
        class21.method136((byte) 122);
        class6.method38(-88);
        class11.method71((byte) 94);
        class30.method200(-65);
        class28.method184();
        class26.method181((byte) 103);
        this.field304 = null;
        this.field303 = null;
        this.field323 = null;
        this.field325 = null;
        this.field328 = null;
        this.field326 = null;
        this.field299 = null;
        this.field284 = null;
        this.field335 = null;
        this.field360 = null;
        this.field312 = null;
        this.field346 = null;
        this.field340 = null;
        this.field332 = null;
        this.field324 = null;
        this.field289 = null;
        this.field280 = null;
        this.field350 = null;
        this.field307 = null;
        this.field301 = null;
        this.field278 = null;
        this.field295 = null;
        this.field306 = null;
        this.field287 = null;
        this.field291 = null;
        this.field338 = null;
        this.field283 = null;
        this.field353 = null;
        this.field365 = null;
    }

    @OriginalMember(owner = "mapview!mapview", name = "c", descriptor = "(B)V", line = 481)
    public final void method89(byte arg0) {
        if (class33.field463) {
            class10.method62((byte) -4, class31.field443);
            class21.method137(class31.field443, (byte) -1);
            this.method76(96);
            class31.method204(arg0 + 21428, class31.field443);
            class30.method199(class31.field443, 1254521510);
        }
        class12.method78(106);
        class21.method138((byte) 122);
        if (!class17.field185) {
            return;
        }
        if (class30.field436[96]) {
            class4.field34 = (int) ((double) class4.field34 - 16.0D / this.field292);
            class5.field48 = -1;
            this.field366 = true;
        }
        if (class30.field436[97]) {
            class5.field48 = -1;
            class4.field34 = (int) (16.0D / this.field292 + (double) class4.field34);
            this.field366 = true;
        }
        if (class30.field436[98]) {
            class25.field265 = (int) ((double) class25.field265 - 16.0D / this.field292);
            this.field366 = true;
            class5.field48 = -1;
        }
        if (class30.field436[99]) {
            class25.field265 = (int) (16.0D / this.field292 + (double) class25.field265);
            this.field366 = true;
            class5.field48 = -1;
        }
        while (true) {
            while (true) {
                while (true) {
                    while (class24.method161((byte) 95)) {
                        if (!class4.field41 || !class26.field390) {
                            if (class30.field434 == this.field362 || class30.field434 == this.field354) {
                                class26.field390 = true;
                                this.field366 = true;
                            }
                            if (class30.field434 == 49) {
                                this.field321 = 3.0D;
                                this.field366 = true;
                            }
                            if (class30.field434 == 50) {
                                this.field321 = 4.0D;
                                this.field366 = true;
                            }
                            if (class30.field434 == 51) {
                                this.field321 = 6.0D;
                                this.field366 = true;
                            }
                            if (class30.field434 == 52) {
                                this.field321 = 8.0D;
                                this.field366 = true;
                            }
                            if (class30.field434 == this.field279 || class30.field434 == this.field281) {
                                this.field366 = true;
                                this.field334 = !this.field334;
                            }
                            if (class30.field434 == this.field305 || class30.field434 == this.field318) {
                                this.field357 = !this.field357;
                                this.field366 = true;
                            }
                        } else if (class8.field118 == 0) {
                            this.field366 = true;
                            class26.field390 = false;
                            this.field340.method216(0, (byte) -119);
                            class35.field482 = -1;
                        } else if (class8.field118 == 84) {
                            class5.field48 = class35.field482;
                            this.field327 = class25.field265 << 16;
                            this.field355 = class4.field34 << 16;
                            class26.field390 = false;
                            this.field340.method216(0, (byte) 82);
                            this.field366 = true;
                            class35.field482 = -1;
                        } else {
                            boolean var2 = false;
                            if (class8.field118 == 85) {
                                if (this.field340.method224(false) > 0) {
                                    this.field340.method216(this.field340.method224(false) - 1, (byte) 105);
                                    this.field366 = true;
                                    if (this.field340.method224(false) == 0) {
                                        class35.field482 = -1;
                                    } else {
                                        var2 = true;
                                    }
                                }
                            } else if (class30.field434 != -1 && this.field340.method224(false) <= class12.field157) {
                                this.field340.method211(class30.field434, (byte) 125);
                                this.field366 = true;
                            }
                            if (this.field340.method224(false) > 0) {
                                for (int var3 = 0; var3 < this.field367; var3++) {
                                    if (this.field312[var3].method224(false) >= this.field340.method224(false)) {
                                        class33 var4 = this.field340.method228((byte) 36);
                                        class33 var5 = this.field312[var3].method230((byte) -63, 47, 32).method225(0, this.field340.method224(false), (byte) -74).method228((byte) 36);
                                        if (var4.method208(var5, 7018) == 0) {
                                            var2 = true;
                                            this.field366 = true;
                                            class35.field482 = var3;
                                            break;
                                        }
                                    }
                                }
                                if (!var2) {
                                    this.field340.method216(this.field340.method224(false) - 1, (byte) 76);
                                }
                            }
                        }
                    }
                    int var6 = class36.field490;
                    int var7 = class17.field190;
                    int var8 = class8.field107;
                    int var9 = class8.field117;
                    int var10 = class23.field247;
                    int var11 = class2.field8;
                    if (var6 == 1) {
                        this.field349 = var7;
                        this.field293 = var8;
                        this.field314 = class25.field265;
                        this.field288 = class4.field34;
                        if (class37.field500.length == 1) {
                            if (this.field339 < var7 && this.field339 + this.field290 > var7 && var8 > this.field344 && this.field344 + this.field296 > var8) {
                                this.field349 = -1;
                                this.field321 = 3.0D;
                            }
                            if (var7 > this.field339 + this.field309 && var7 < this.field339 + this.field309 + this.field290 && this.field344 < var8 && var8 < this.field344 + this.field296) {
                                this.field349 = -1;
                                this.field321 = 4.0D;
                            }
                            if (var7 > this.field309 * 2 + this.field339 && var7 < this.field309 * 2 + this.field339 + this.field290 && this.field344 < var8 && var8 < this.field344 + this.field296) {
                                this.field349 = -1;
                                this.field321 = 6.0D;
                            }
                            if (var7 > this.field309 * 3 + this.field339 && var7 < this.field309 * 3 + this.field339 + this.field290 && this.field344 < var8 && this.field344 + this.field296 > var8) {
                                this.field349 = -1;
                                this.field321 = 8.0D;
                            }
                        } else {
                            if (this.field339 < var7 && var7 < this.field339 + this.field290 && this.field344 < var8 && var8 < this.field344 + this.field296 + this.field352) {
                                this.field349 = -1;
                                this.field321 = 3.0D;
                            }
                            if (this.field339 + this.field309 < var7 && var7 < this.field339 + this.field290 + this.field309 && var8 > this.field344 && this.field344 + this.field296 + this.field352 > var8) {
                                this.field349 = -1;
                                this.field321 = 4.0D;
                            }
                            if (this.field309 * 2 + this.field339 < var7 && this.field309 * 2 + this.field290 + this.field339 > var7 && var8 > this.field344 && this.field344 + this.field296 + this.field352 > var8) {
                                this.field349 = -1;
                                this.field321 = 6.0D;
                            }
                            if (this.field309 * 3 + this.field339 < var7 && var7 < this.field309 * 3 + this.field339 + this.field290 && var8 > this.field344 && this.field344 + this.field296 + this.field352 > var8) {
                                this.field321 = 8.0D;
                                this.field349 = -1;
                            }
                            if (var7 > 170 && var7 < 400 && var8 > 483 && var8 < 503) {
                                this.method168((byte) 119, this.field330);
                                this.method171(13);
                                this.method170(-2);
                                this.field349 = -1;
                            }
                        }
                        this.field331 = false;
                        if (this.field313 < var7 && this.field286 + this.field348 < var8 && var7 < this.field333 + this.field313 && var8 < 503) {
                            this.field334 = !this.field334;
                            this.field349 = -1;
                        }
                        this.field366 = true;
                        if (this.field351 < var7 && this.field277 + this.field282 < var8 && var7 < this.field351 + this.field302 && var8 < 503) {
                            this.field357 = !this.field357;
                            this.field349 = -1;
                        }
                        if (this.field334) {
                            if (this.field313 < var7 && this.field286 < var8 && this.field313 + this.field333 > var7 && this.field286 + 18 > var8 && this.field319 > 0) {
                                this.field319 -= 24;
                            }
                            if (var7 > this.field313 && var8 > this.field348 + this.field286 - 18 && var7 < this.field333 + this.field313 && this.field348 + this.field286 > var8 && this.field319 < 48) {
                                this.field319 += 24;
                            }
                            if (this.field313 < var7 && this.field286 < var8 && var7 < this.field333 + this.field313 && this.field286 + this.field348 > var8) {
                                this.field349 = -1;
                            }
                        }
                        if (this.field357 && var7 > this.field351 && this.field277 < var8 && this.field351 + this.field302 > var7 && this.field277 + this.field282 > var8) {
                            class25.field265 = (var8 - this.field277) * class14.field175 / this.field282;
                            class4.field34 = (var7 - this.field351) * class21.field229 / this.field302;
                            this.field331 = true;
                            this.field349 = -1;
                        }
                        if (class4.field41 && !class26.field390 && !this.field331 && this.field311 < var7 && this.field368 < var8 && var7 < this.field342 + this.field311 && var8 < this.field368 + this.field315) {
                            class26.field390 = true;
                        }
                    }
                    if (this.field334) {
                        this.field358 = -1;
                        if (this.field313 < var10 && this.field313 + this.field333 > var10) {
                            int var12 = this.field286 + 21 + 5;
                            int var13 = this.field356;
                            for (int var14 = 0; var14 < 24; var14++) {
                                if (this.field278.length > var13 && this.field278[var13].method222(class21.field221, (byte) 86)) {
                                    var14--;
                                    var13++;
                                } else {
                                    if (var12 <= var11 && var12 + 17 > var11) {
                                        this.field358 = var13;
                                        if (var6 == 1) {
                                            this.field322 = 50;
                                            this.field285 = var13;
                                        }
                                    }
                                    var12 += 17;
                                    var13++;
                                }
                            }
                        }
                        if (this.field358 != this.field308) {
                            this.field308 = this.field358;
                            this.field366 = true;
                        }
                    }
                    if (var9 == 1 && this.field357 && this.field331) {
                        class5.field48 = -1;
                        int var15 = var11;
                        this.field366 = true;
                        int var16 = var10;
                        if (var10 < this.field351) {
                            var16 = this.field351;
                        } else if (this.field351 + this.field302 < var10) {
                            var16 = this.field351 + this.field302;
                        }
                        if (var11 < this.field277) {
                            var15 = this.field277;
                        } else if (this.field282 + this.field277 < var11) {
                            var15 = this.field282 + this.field277;
                        }
                        class4.field34 = (var16 - this.field351) * class21.field229 / this.field302;
                        class25.field265 = (var15 - this.field277) * class14.field175 / this.field282;
                    } else {
                        this.field331 = false;
                    }
                    if (var9 == 1 && this.field349 != -1) {
                        class5.field48 = -1;
                        class4.field34 = (int) ((double) (this.field349 - var10) * 2.0D / this.field321) + this.field288;
                        class25.field265 = this.field314 + (int) ((double) (this.field293 - var11) * 2.0D / this.field321);
                        this.field366 = true;
                    }
                    if (this.field292 < this.field321) {
                        this.field292 += this.field292 / 30.0D;
                        if (this.field292 > this.field321) {
                            this.field292 = this.field321;
                        }
                        this.field366 = true;
                    }
                    if (this.field292 > this.field321) {
                        this.field366 = true;
                        this.field292 -= this.field292 / 30.0D;
                        if (this.field292 < this.field321) {
                            this.field292 = this.field321;
                        }
                    }
                    if (this.field319 > this.field356) {
                        this.field356++;
                        this.field366 = true;
                    }
                    if (arg0 != 35) {
                        this.field333 = 81;
                    }
                    if (this.field319 < this.field356) {
                        this.field356--;
                        this.field366 = true;
                    }
                    if (this.field322 > 0) {
                        this.field366 = true;
                        this.field322--;
                    }
                    if (class5.field48 >= 0) {
                        class23.field249 = this.field295[class5.field48] - class14.field176;
                        int var17 = class23.field249 - (int) (635.0D / this.field292);
                        byte var18 = 4;
                        class12.field152 = class21.field228 + class14.field175 - this.field323[class5.field48];
                        int var19 = (int) (635.0D / this.field292) + class23.field249;
                        if (var17 < 48) {
                            class23.field249 = (int) (635.0D / this.field292) + 48;
                        }
                        if (var19 > class21.field229 - 48) {
                            class23.field249 = class21.field229 - (int) (635.0D / this.field292) - 48;
                        }
                        int var20 = (int) (503.0D / this.field292) + class12.field152;
                        this.field366 = true;
                        int var21 = class12.field152 - (int) (503.0D / this.field292);
                        class23.field249 <<= 0x10;
                        int var22 = class23.field249 - this.field355;
                        if (var21 < 48) {
                            class12.field152 = (int) (503.0D / this.field292) + 48;
                        }
                        if (class14.field175 - 48 < var20) {
                            class12.field152 = class14.field175 - (int) (503.0D / this.field292) - 48;
                        }
                        class12.field152 <<= 0x10;
                        int var23 = class12.field152 - this.field327;
                        if (var22 >> var18 == 0 && var23 >> var18 == 0) {
                            class5.field48 = -1;
                        } else {
                            this.field355 += var22 >> var18;
                            this.field327 += var23 >> var18;
                            class25.field265 = this.field327 >> 16;
                            class4.field34 = this.field355 >> 16;
                        }
                    }
                    int var24 = class4.field34 - (int) (635.0D / this.field292);
                    int var25 = class25.field265 - (int) (503.0D / this.field292);
                    int var26 = (int) (635.0D / this.field292) + class4.field34;
                    int var27 = class25.field265 + (int) (503.0D / this.field292);
                    if (var25 < 48) {
                        class25.field265 = (int) (503.0D / this.field292) + 48;
                    }
                    if (var24 < 48) {
                        class4.field34 = (int) (635.0D / this.field292) + 48;
                    }
                    if (class14.field175 - 48 < var27) {
                        class25.field265 = class14.field175 - (int) (503.0D / this.field292) - 48;
                    }
                    if (class21.field229 - 48 < var26) {
                        class4.field34 = class21.field229 - (int) (635.0D / this.field292) - 48;
                    }
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "j", descriptor = "(I)V", line = 1028)
    private final void method171(int arg0) {
        class11.field147 = false;
        try {
            Graphics var2 = class31.field443.getGraphics();
            class11.field143.method69(0, var2, -28289, 0);
            if (arg0 != 13) {
                this.field325 = null;
            }
        } catch (Exception var4) {
            class31.field443.repaint();
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "b", descriptor = "(Z)V", line = 1051)
    public final void method82(boolean arg0) {
        class35.method236((byte) -109);
        class31.method204(21463, class31.field443);
        class30.method199(class31.field443, 1254521510);
        class29.field421 = this.field346;
        this.field278 = class25.method163(116);
        this.field325 = class14.method97(-85);
        boolean var3 = true;
        if (var3) {
            byte var4 = 0;
            if (this.field325.length == 13) {
                byte var10002 = var4;
                int var5 = var4 + 1;
                this.field299 = this.field325[var10002];
                int var18 = var5;
                int var6 = var5 + 1;
                this.field353 = this.field325[var18];
                int var19 = var6;
                int var7 = var6 + 1;
                this.field326 = this.field325[var19];
                int var20 = var7;
                int var8 = var7 + 1;
                this.field301 = this.field325[var20];
                int var21 = var8;
                int var9 = var8 + 1;
                this.field304 = this.field325[var21];
                int var22 = var9;
                int var10 = var9 + 1;
                this.field346 = this.field325[var22];
                int var23 = var10;
                int var11 = var10 + 1;
                this.field289 = this.field325[var23];
                int var24 = var11;
                int var12 = var11 + 1;
                this.field287 = this.field325[var24];
                int var25 = var12;
                int var13 = var12 + 1;
                this.field283 = this.field325[var25];
                int var26 = var13;
                int var14 = var13 + 1;
                this.field280 = this.field325[var26];
                int var27 = var14;
                int var15 = var14 + 1;
                this.field291 = this.field325[var27];
                int var16 = var15 + 1;
                int var28 = var16;
                int var17 = var16 + 1;
                this.field365 = this.field325[var28];
                this.field318 = this.field299.method209((byte) 93, 0);
                this.field354 = this.field353.method209((byte) 125, 0);
                this.field281 = this.field326.method209((byte) -21, 0);
                this.field305 = this.method180(this.field318, (byte) 59);
                this.field362 = this.method180(this.field354, (byte) -126);
                this.field279 = this.method180(this.field281, (byte) -98);
            } else {
                class10.method63((byte) 120, new class33[] { class29.field427 });
            }
        }
        this.field340 = class17.method104(-112, 50);
    }

    @OriginalMember(owner = "mapview!mapview", name = "init", descriptor = "()V", line = 1104)
    public final void init() {
        if (this.method90(99)) {
            this.method80(class17.field191.method231(this, (byte) 121).method220(0), 635, false, 503, 32);
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "e", descriptor = "(I)V", line = 1115)
    public final void method79(int arg0) {
        class38.method253(-88);
        class36.method247(0);
        try {
            if (arg0 >= -42) {
                field336 = null;
            }
            this.field295 = null;
            class32.field451 = null;
            this.field278 = null;
            this.field312 = null;
            this.field307 = null;
            this.field284 = null;
            this.field350 = null;
            this.field323 = null;
            System.gc();
        } catch (Throwable var3) {
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "k", descriptor = "(I)Z", line = 1143)
    private final boolean method172(int arg0) {
        if (class5.field61 == 0) {
            this.method167(37);
            class5.field61 = 1;
        }
        if (class5.field61 == 1) {
            class33.field461 = 25;
            boolean var2 = this.method173(this.field280, "main_file_cache.idx0", true);
            if (!var2) {
                return false;
            }
            class26.field376 = field298;
            field298 = null;
            if (class26.field376 == null) {
                throw new RuntimeException("T1");
            }
            class5.field61 = 2;
        }
        if (class5.field61 == 2) {
            class37.field500 = new class8[1];
            class5.field61 = 10;
        }
        if (class5.field61 == 10) {
            class33.field461 = 50;
            boolean var3 = this.method173(this.field291, "main_file_cache.dat0", true);
            if (!var3) {
                return false;
            }
            class37.field500[0] = field298;
            field298 = null;
            if (class37.field500[0] == null) {
                throw new RuntimeException("T2");
            }
            class5.field61 = 20;
        }
        if (arg0 != -13321) {
            this.method79(55);
        }
        if (class5.field61 != 20) {
            return false;
        }
        class31.field445 = class12.method84((byte) 123, class26.field376, class10.field133, class10.field135);
        class8.field110 = class20.method125(11202, class32.field458, class26.field376, class10.field133);
        this.field350 = class35.method244(class10.field130, class10.field133, class26.field376, (byte) 11);
        this.field306 = new class18(11, true, this);
        this.field338 = new class18(12, true, this);
        this.field328 = new class18(14, true, this);
        this.field332 = new class18(17, true, this);
        this.field360 = new class18(19, true, this);
        this.field335 = new class18(22, true, this);
        this.field324 = new class18(26, true, this);
        this.field303 = new class18(30, true, this);
        class33.field461 = 100;
        class29.field421 = this.field289;
        class35.method235(null, class33.field461, (byte) 43, class29.field421);
        this.field342 = this.field350.method45(this.field353) + 20;
        this.method170(-2);
        class33[] var4 = this.field278;
        for (int var5 = 0; var5 < var4.length; var5++) {
            class33 var6 = var4[var5];
            int var7 = this.field350.method45(var6);
            if (this.field347 < var7) {
                this.field347 = var7;
            }
        }
        this.field333 = this.field347 + 16 + 18;
        if (this.field333 > 140) {
            int var8 = this.field351 - this.field313 - this.field333;
            this.field276 = var8 / 25;
            int var9 = var8 - this.field276 * 25;
            this.field339 = var9 / 2 + this.field313 + this.field333 + this.field276;
            this.field290 = this.field276 * 5;
            this.field309 = this.field290 + this.field276;
        }
        return true;
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(Lr;Ljava/lang/String;Z)Z", line = 1378)
    private final boolean method173(class33 arg0, String arg1, boolean arg2) {
        if (!arg2) {
            this.method170(28);
        }
        byte[] var4 = null;
        if (!class6.field68) {
            if (class33.field462 != null) {
                try {
                    var4 = this.method178(124, class33.field462 + "/" + arg1);
                    if (!this.method176(var4, arg1, 108)) {
                        var4 = null;
                    }
                    if (var4 != null) {
                        field298 = new class8(var4, false, true);
                        return true;
                    }
                } catch (IOException var11) {
                    var4 = null;
                }
            }
            class6.field68 = true;
        }
        if (var4 == null) {
            boolean var6 = this.method174(arg1, arg0, 503);
            if (!var6) {
                return false;
            }
            var4 = class4.field38;
            class4.field38 = null;
        }
        if (var4 == null) {
            class6.field68 = false;
            return true;
        }
        if (class33.field462 != null && var4 != null) {
            try {
                this.method166(class33.field462 + "/" + arg1, (byte) -12, var4);
            } catch (IOException var10) {
            }
        }
        try {
            field298 = new class8(var4, false, true);
            class6.field68 = false;
            return true;
        } catch (IOException var9) {
            throw class8.method51(var9, "monkey feet");
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(Ljava/lang/String;Lr;I)Z", line = 1450)
    private final boolean method174(String arg0, class33 arg1, int arg2) {
        try {
            if (class17.field188 == null) {
                class29.field421 = class11.method70(0, new class33[] { this.field283, class36.field496, arg1 });
                String var4;
                if (arg0 == "main_file_cache.dat0") {
                    var4 = "worldmap.main.js5?crc=1427202862";
                } else if (arg0 == "main_file_cache.dat1") {
                    var4 = "worldmap.dungeon.js5?crc=-260285331";
                } else if (arg0 == "main_file_cache.dat2") {
                    var4 = "worldmap.extra.js5?crc=2138094326";
                } else {
                    var4 = "mapview.sprites.js5?crc=-1203441070";
                }
                int var5;
                if (arg0 == "main_file_cache.dat0") {
                    var5 = 414231;
                } else if (arg0 == "main_file_cache.dat1") {
                    var5 = 149036;
                } else if (arg0 == "main_file_cache.dat2") {
                    var5 = 117380;
                } else {
                    var5 = 8383;
                }
                class17.field188 = new DataInputStream((new URL(this.getCodeBase(), var4)).openStream());
                class13.field167 = 0;
                class4.field38 = new byte[var5];
                class30.field431 = 0;
            }
            int var6 = class4.field38.length;
            int var7 = class13.field167;
            if (var7 < var6) {
                class30.field431++;
                if (class30.field431 >= 1500) {
                    throw new IOException();
                }
                DataInputStream var8 = class17.field188;
                int var9 = var8.available();
                if (var9 < 0) {
                    throw new EOFException();
                } else if (var9 == 0) {
                    return false;
                } else {
                    if (var9 > var6 - var7) {
                        var9 = var6 - var7;
                    }
                    int var10 = var8.read(class4.field38, var7, var9);
                    if (var10 < 0) {
                        throw new EOFException();
                    } else if (var10 == 0) {
                        return false;
                    } else {
                        class30.field431 = 0;
                        int var11 = var7 + var10;
                        int var12 = var11 * 100 / var6;
                        class29.field421 = class11.method70(0, new class33[] { this.field365, class36.field496, arg1, class24.field263, class33.method213((byte) 71, var12), class21.field225 });
                        class13.field167 = var11;
                        return false;
                    }
                }
            } else if (arg2 == 503) {
                class17.field188.close();
                class17.field188 = null;
                if (!this.method176(class4.field38, arg0, 108)) {
                    this.method83((byte) 96, "download");
                    class4.field38 = null;
                }
                return true;
            } else {
                return true;
            }
        } catch (IOException var16) {
            try {
                class17.field188.close();
            } catch (Exception var15) {
            }
            class4.field38 = null;
            class17.field188 = null;
            this.method83((byte) -123, new String("download"));
            return true;
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "l", descriptor = "(I)V", line = 1588)
    public static void method175(int arg0) {
        field310 = null;
        field329 = null;
        field343 = null;
        field363 = null;
        field298 = null;
        field320 = null;
        field336 = null;
        field294 = null;
        int var1 = 46 % ((-arg0 - 26) / 63);
        field341 = null;
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "([BLjava/lang/String;I)Z", line = 1637)
    private final boolean method176(byte[] arg0, String arg1, int arg2) {
        if (arg0 == null) {
            return false;
        }
        try {
            MessageDigest var4 = MessageDigest.getInstance("SHA");
            var4.reset();
            var4.update(arg0);
            byte[] var5 = var4.digest();
            if (arg1 == "main_file_cache.dat0") {
                if (var5[0] != -83 || var5[1] != 79 || var5[2] != 55 || var5[3] != -23 || var5[4] != -113 || var5[5] != 25 || var5[6] != 73 || var5[7] != 3 || var5[8] != -103 || var5[9] != -124 || var5[10] != -116 || var5[11] != -21 || var5[12] != -80 || var5[13] != -20 || var5[14] != 117 || var5[15] != 51 || var5[16] != 56 || var5[17] != 122 || var5[18] != -41 || var5[19] != 21) {
                    return false;
                }
            } else if (var5[0] != 65 || var5[1] != 89 || var5[2] != -58 || var5[3] != -50 || var5[4] != 116 || var5[5] != 117 || var5[6] != 59 || var5[7] != -103 || var5[8] != 18 || var5[9] != -89 || var5[10] != 45 || var5[11] != 126 || var5[12] != 80 || var5[13] != 10 || var5[14] != -103 || var5[15] != 75 || var5[16] != -21 || var5[17] != 109 || var5[18] != -27 || var5[19] != 126) {
                return false;
            }
            if (arg2 != 108) {
                this.method169(44, 66, -3, -34, -116, -103, 107, -95, 45);
            }
            return true;
        } catch (Exception var7) {
            this.method83((byte) -118, "sha");
            return false;
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(II)I", line = 1688)
    private final int method177(int arg0, int arg1) {
        arg0++;
        if (arg1 < 18) {
            this.field283 = null;
        }
        if (class37.field500.length <= arg0) {
            arg0 = 0;
        }
        return arg0;
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(ILjava/lang/String;)[B", line = 1703)
    private final byte[] method178(int arg0, String arg1) throws IOException {
        File var3 = new File(arg1);
        if (!var3.exists()) {
            return null;
        }
        int var4 = (int) var3.length();
        byte[] var5 = new byte[var4];
        DataInputStream var6 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg1)));
        int var7 = -118 / ((76 - arg0) / 43);
        var6.readFully(var5, 0, var4);
        var6.close();
        return var5;
    }

    @OriginalMember(owner = "mapview!mapview", name = "b", descriptor = "(B)V", line = 1756)
    public final void method88(byte arg0) {
        if (arg0 != 123) {
            this.method171(85);
        }
        if (!class17.field185) {
            class17.field185 = this.method172(-13321);
            class35.method235(null, class33.field461, (byte) 26, class29.field421);
            return;
        }
        if (this.field366) {
            this.field366 = false;
            class11.field147 = true;
            class1.method1();
            int var2 = class4.field34 - (int) (635.0D / this.field292);
            int var3 = class25.field265 + (int) (503.0D / this.field292);
            int var4 = (int) (635.0D / this.field292) + class4.field34;
            int var5 = class25.field265 - (int) (503.0D / this.field292);
            this.method169(635, var4, 0, 0, 503, var2, 95, var5, var3);
            if (this.field357) {
                this.field307.method55(this.field351, this.field277);
                class1.method10(this.field351 + this.field302 * var2 / class21.field229, this.field282 * var5 / class14.field175 + this.field277, (var4 - var2) * this.field302 / class21.field229, (var3 - var5) * this.field282 / class14.field175, 16711680, 128);
                class1.method5(this.field351 + this.field302 * var2 / class21.field229, this.field282 * var5 / class14.field175 + this.field277, (var4 - var2) * this.field302 / class21.field229, (var3 - var5) * this.field282 / class14.field175, 16711680);
                if (this.field322 > 0 && this.field322 % 10 < 5) {
                    for (int var6 = 0; var6 < class6.field72; var6++) {
                        if (class32.field451.field236[var6] == this.field285) {
                            int var7 = this.field277 + class32.field451.field232[var6] * this.field282 / class14.field175;
                            int var8 = class32.field451.field245[var6] * this.field302 / class21.field229 + this.field351;
                            class1.method6(var8, var7, 2, 16776960, 256);
                        }
                    }
                }
            }
            if (this.field334) {
                this.method165(10066329, this.field286, 18, this.field313, this.field301, 5592405, 7829367, this.field333, -1);
                this.method165(10066329, this.field286 + 18, this.field348 + -36, this.field313, class10.field133, 5592405, 7829367, this.field333, -1);
                this.method165(10066329, this.field348 + this.field286 - 18, 18, this.field313, this.field304, 5592405, 7829367, this.field333, -1);
                int var9 = this.field286 + 21;
                int var10 = this.field356;
                for (int var11 = 0; var11 < 24; var11++) {
                    if (class8.field110.length > var10 && var10 < this.field278.length) {
                        if (this.field278[var10].method222(class21.field221, (byte) 102)) {
                            var11--;
                            var10++;
                            continue;
                        }
                        class8.field110[var10].method56(this.field313 + 3, var9);
                        int var12 = 16777215;
                        this.field350.method46(this.field278[var10], this.field313 + 21, var9 + 14, 0);
                        if (this.field358 == var10) {
                            var12 = 12298922;
                        }
                        if (this.field322 > 0 && this.field322 % 10 < 5 && this.field285 == var10) {
                            var12 = 16776960;
                        }
                        this.field350.method46(this.field278[var10], this.field313 + 20, var9 + 13, var12);
                    }
                    var9 += 17;
                    var10++;
                }
            }
            if (class37.field500.length == 1) {
                this.method165(this.field359, this.field282 + this.field277, 18, this.field351, this.field299, this.field317, this.field300, this.field302, -1);
                this.method165(this.field359, this.field348 + this.field286, 18, this.field313, this.field326, this.field317, this.field300, this.field333, arg0 - 124);
                if (this.field321 == 3.0D) {
                    this.method165(this.field345, this.field344, this.field296, this.field339, class17.field192, this.field297, this.field330, this.field290, -1);
                } else {
                    this.method165(this.field359, this.field344, this.field296, this.field339, class17.field192, this.field317, this.field300, this.field290, -1);
                }
                if (this.field321 == 4.0D) {
                    this.method165(this.field345, this.field344, this.field296, this.field339 + this.field309, class24.field257, this.field297, this.field330, this.field290, -1);
                } else {
                    this.method165(this.field359, this.field344, this.field296, this.field339 + this.field309, class24.field257, this.field317, this.field300, this.field290, -1);
                }
                if (this.field321 == 6.0D) {
                    this.method165(this.field345, this.field344, this.field296, this.field309 * 2 + this.field339, class22.field243, this.field297, this.field330, this.field290, arg0 ^ 0xFFFFFF84);
                } else {
                    this.method165(this.field359, this.field344, this.field296, this.field339 + this.field309 * 2, class22.field243, this.field317, this.field300, this.field290, arg0 ^ 0xFFFFFF84);
                }
                if (this.field321 == 8.0D) {
                    this.method165(this.field345, this.field344, this.field296, this.field309 * 3 + this.field339, class32.field452, this.field297, this.field330, this.field290, -1);
                } else {
                    this.method165(this.field359, this.field344, this.field296, this.field309 * 3 + this.field339, class32.field452, this.field317, this.field300, this.field290, -1);
                }
            } else {
                this.method165(this.field359, this.field282 + this.field277, 18, this.field351, this.field299, this.field317, this.field300, this.field302, -1);
                this.method165(this.field359, this.field286 + this.field348, 18, this.field313, this.field326, this.field317, this.field300, this.field333, arg0 ^ 0xFFFFFF84);
                this.method168((byte) 110, this.field300);
                int var13 = this.field352 + this.field344;
                if (this.field321 == 3.0D) {
                    this.method165(this.field345, var13, this.field296, this.field339, class17.field192, this.field297, this.field330, this.field290, -1);
                } else {
                    this.method165(this.field359, var13, this.field296, this.field339, class17.field192, this.field317, this.field300, this.field290, arg0 ^ 0xFFFFFF84);
                }
                if (this.field321 == 4.0D) {
                    this.method165(this.field345, var13, this.field296, this.field339 + this.field309, class24.field257, this.field297, this.field330, this.field290, -1);
                } else {
                    this.method165(this.field359, var13, this.field296, this.field339 + this.field309, class24.field257, this.field317, this.field300, this.field290, -1);
                }
                if (this.field321 == 6.0D) {
                    this.method165(this.field345, var13, this.field296, this.field339 + this.field309 * 2, class22.field243, this.field297, this.field330, this.field290, arg0 ^ 0xFFFFFF84);
                } else {
                    this.method165(this.field359, var13, this.field296, this.field339 + this.field309 * 2, class22.field243, this.field317, this.field300, this.field290, -1);
                }
                if (this.field321 == 8.0D) {
                    this.method165(this.field345, var13, this.field296, this.field339 + this.field309 * 3, class32.field452, this.field297, this.field330, this.field290, arg0 - 124);
                } else {
                    this.method165(this.field359, var13, this.field296, this.field309 * 3 + this.field339, class32.field452, this.field317, this.field300, this.field290, -1);
                }
            }
            if (class4.field41) {
                this.method165(this.field359, this.field368, this.field315, this.field311, this.field353, this.field317, this.field300, this.field342, arg0 - 124);
                if (class26.field390) {
                    class1.method10(this.field342 + this.field311 + 2, this.field368, this.field337 + 10, this.field315, 8925952, 192);
                    class1.method5(this.field342 + this.field311 + 2, this.field368, this.field337 + 10, this.field315, 16777215);
                    if (class35.field482 > -1 && this.field340.method224(false) > 0) {
                        class33 var14 = this.field312[class35.field482].method230((byte) -63, 47, 32);
                        int var15 = this.field340.method224(false);
                        if (var14.method224(false) < var15) {
                            var15 = var14.method224(false);
                        }
                        this.field350.method47(var14, this.field342 + this.field311 + 6, 20, 10066176, true);
                        this.field350.method47(var14.method225(0, var15, (byte) -74), this.field342 + this.field311 + 6, 20, 16777215, true);
                    } else {
                        this.field350.method47(this.field287, this.field342 + this.field311 + 6, 20, 16776960, true);
                    }
                }
            }
        }
        if (class11.field147) {
            this.method171(arg0 - 110);
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(IB)V", line = 1958)
    private final void method179(int arg0, byte arg1) {
        if (arg1 < 22 || arg0 >= class37.field500.length) {
            return;
        }
        class8 var3 = class37.field500[arg0];
        class20 var4 = new class20(var3.method32(class25.field274, class33.field467, (byte) -105));
        var4.method126((byte) -114);
        class20 var5 = new class20(var3.method32(class5.field55, class33.field467, (byte) 88));
        this.field367 = var5.method129(2);
        for (int var6 = 0; var6 < this.field367; var6++) {
            this.field312[var6] = var5.method126((byte) -127);
            this.field295[var6] = var5.method129(2);
            this.field323[var6] = var5.method129(2);
            this.field284[var6] = var5.method133(23789);
            class33 var7 = this.field312[var6].method230((byte) -63, 47, 32);
            int var8 = this.field350.method45(var7);
            if (var8 > this.field337) {
                this.field337 = var8;
            }
            int var9 = this.field350.method45(this.field287);
            if (this.field337 < var9) {
                this.field337 = var9;
            }
        }
        class32.field451 = new class22();
        class32.field451.method146((byte) 106, class37.field500[arg0]);
        this.field282 = 180;
        this.field277 = 503 - this.field282 - 20;
        class4.field34 = class4.field36;
        this.field302 = class21.field229 * this.field282 / class14.field175;
        class25.field265 = field361;
        this.field351 = 635 - this.field302 - 5;
        this.field307 = new class9(this.field302, this.field282);
        this.field307.method54();
        this.method169(this.field302, class21.field229, 0, 0, this.field282, 0, 77, 0, class14.field175);
        class1.method5(0, 0, this.field302, this.field282, 0);
        class1.method5(1, 1, this.field302 - 2, this.field282 - 2, this.field359);
        class11.field143.method194((byte) 9);
    }

    @OriginalMember(owner = "mapview!mapview", name = "b", descriptor = "(IB)I", line = 2041)
    private final int method180(int arg0, byte arg1) {
        int var3 = 30 % ((arg1 - 1) / 57);
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
            return class25.method164(arg0, -15);
        }
    }
}
