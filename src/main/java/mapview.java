import java.awt.Color;
import java.awt.Graphics;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.net.URL;
import java.security.MessageDigest;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!mapview")
public class mapview extends class25 {

    @OriginalMember(owner = "mapview!mapview", name = "x", descriptor = "I")
    private int field269 = 5;

    @OriginalMember(owner = "mapview!mapview", name = "s", descriptor = "I")
    private int field264 = 33;

    @OriginalMember(owner = "mapview!mapview", name = "L", descriptor = "Z")
    private boolean field283 = true;

    @OriginalMember(owner = "mapview!mapview", name = "B", descriptor = "I")
    private int field273 = 23;

    @OriginalMember(owner = "mapview!mapview", name = "U", descriptor = "I")
    private int field292 = 170;

    @OriginalMember(owner = "mapview!mapview", name = "R", descriptor = "I")
    private int field289 = 6706483;

    @OriginalMember(owner = "mapview!mapview", name = "P", descriptor = "I")
    private int field287 = 11141120;

    @OriginalMember(owner = "mapview!mapview", name = "Q", descriptor = "Z")
    private boolean field288 = false;

    @OriginalMember(owner = "mapview!mapview", name = "hb", descriptor = "I")
    private int field305 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "Y", descriptor = "I")
    private int field296 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "A", descriptor = "Z")
    private boolean field272 = false;

    @OriginalMember(owner = "mapview!mapview", name = "E", descriptor = "I")
    private int field276 = 8943445;

    @OriginalMember(owner = "mapview!mapview", name = "lb", descriptor = "I")
    private int field309 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "O", descriptor = "I")
    private int field286 = 7824964;

    @OriginalMember(owner = "mapview!mapview", name = "pb", descriptor = "I")
    private int field313 = 10027008;

    @OriginalMember(owner = "mapview!mapview", name = "j", descriptor = "D")
    private double field255 = 4.0D;

    @OriginalMember(owner = "mapview!mapview", name = "mb", descriptor = "I")
    private int field310 = 500;

    @OriginalMember(owner = "mapview!mapview", name = "V", descriptor = "I")
    private int field293 = 40;

    @OriginalMember(owner = "mapview!mapview", name = "o", descriptor = "I")
    private int field260 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "Db", descriptor = "I")
    private int field327 = 5;

    @OriginalMember(owner = "mapview!mapview", name = "fb", descriptor = "[I")
    private int[] field303 = new int[this.field310];

    @OriginalMember(owner = "mapview!mapview", name = "vb", descriptor = "I")
    private int field319 = 10;

    @OriginalMember(owner = "mapview!mapview", name = "Ab", descriptor = "I")
    private int field324 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "v", descriptor = "[Lu;")
    private class38[] field267 = new class38[this.field310];

    @OriginalMember(owner = "mapview!mapview", name = "z", descriptor = "I")
    private int field271 = 50;

    @OriginalMember(owner = "mapview!mapview", name = "n", descriptor = "I")
    private int field259 = this.field271 + this.field319;

    @OriginalMember(owner = "mapview!mapview", name = "Jb", descriptor = "I")
    private int field333 = 471;

    @OriginalMember(owner = "mapview!mapview", name = "Gb", descriptor = "I")
    private int field330 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "Fb", descriptor = "I")
    private int field329 = -1;

    @OriginalMember(owner = "mapview!mapview", name = "Bb", descriptor = "D")
    private double field325 = 4.0D;

    @OriginalMember(owner = "mapview!mapview", name = "y", descriptor = "I")
    private int field270 = -1;

    @OriginalMember(owner = "mapview!mapview", name = "Ib", descriptor = "I")
    private int field332 = 5;

    @OriginalMember(owner = "mapview!mapview", name = "G", descriptor = "Z")
    private boolean field278 = false;

    @OriginalMember(owner = "mapview!mapview", name = "yb", descriptor = "I")
    private int field322 = 450;

    @OriginalMember(owner = "mapview!mapview", name = "kb", descriptor = "I")
    private int field308 = 140;

    @OriginalMember(owner = "mapview!mapview", name = "m", descriptor = "[I")
    private int[] field258 = new int[this.field310];

    @OriginalMember(owner = "mapview!mapview", name = "Eb", descriptor = "I")
    private int field328 = -1;

    @OriginalMember(owner = "mapview!mapview", name = "M", descriptor = "I")
    private int field284 = 8912896;

    @OriginalMember(owner = "mapview!mapview", name = "Qb", descriptor = "I")
    private int field340 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "bb", descriptor = "I")
    private int field299 = -20;

    @OriginalMember(owner = "mapview!mapview", name = "H", descriptor = "[I")
    private int[] field279 = new int[this.field310];

    @OriginalMember(owner = "mapview!mapview", name = "Ob", descriptor = "I")
    private int field338 = 30;

    @OriginalMember(owner = "mapview!mapview", name = "Rb", descriptor = "Z")
    private boolean field341 = false;

    @OriginalMember(owner = "mapview!mapview", name = "u", descriptor = "Lu;")
    private class38 field266 = this.field341 ? class11.field106 : class11.field106;

    @OriginalMember(owner = "mapview!mapview", name = "F", descriptor = "I")
    private int field277 = this.field341 ? 83 : 70;

    @OriginalMember(owner = "mapview!mapview", name = "Sb", descriptor = "I")
    private int field342 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "Cb", descriptor = "I")
    private int field326 = this.field341 ? 108 : 107;

    @OriginalMember(owner = "mapview!mapview", name = "ob", descriptor = "I")
    private int field312 = this.field341 ? 76 : 75;

    @OriginalMember(owner = "mapview!mapview", name = "t", descriptor = "Lu;")
    private class38 field265 = this.field341 ? class8.field83 : class8.field83;

    @OriginalMember(owner = "mapview!mapview", name = "nb", descriptor = "Lu;")
    private class38 field311 = this.field341 ? class7.field59 : class7.field59;

    @OriginalMember(owner = "mapview!mapview", name = "tb", descriptor = "Lu;")
    private class38 field317 = this.field341 ? class26.field249 : class33.field411;

    @OriginalMember(owner = "mapview!mapview", name = "K", descriptor = "Lu;")
    private class38 field282 = this.field341 ? class30.field384 : class17.field173;

    @OriginalMember(owner = "mapview!mapview", name = "W", descriptor = "Lu;")
    private class38 field294 = this.field341 ? class32.field405 : class32.field405;

    @OriginalMember(owner = "mapview!mapview", name = "Nb", descriptor = "Lu;")
    private class38 field337 = this.field341 ? class38.field480 : class38.field480;

    @OriginalMember(owner = "mapview!mapview", name = "eb", descriptor = "Lu;")
    private class38 field302 = this.field341 ? class9.field90 : class9.field90;

    @OriginalMember(owner = "mapview!mapview", name = "I", descriptor = "Lu;")
    private class38 field280 = this.field341 ? class18.field185 : class24.field234;

    @OriginalMember(owner = "mapview!mapview", name = "wb", descriptor = "Lu;")
    private class38 field320 = this.field341 ? class24.field235 : class24.field235;

    @OriginalMember(owner = "mapview!mapview", name = "Kb", descriptor = "I")
    private int field334 = this.field341 ? 115 : 102;

    @OriginalMember(owner = "mapview!mapview", name = "ab", descriptor = "I")
    private int field298 = this.field341 ? 220 : 79;

    @OriginalMember(owner = "mapview!mapview", name = "qb", descriptor = "Lu;")
    private class38 field314 = this.field341 ? class22.field214 : class22.field214;

    @OriginalMember(owner = "mapview!mapview", name = "Mb", descriptor = "Lu;")
    private class38 field336 = this.field341 ? class31.field392 : class31.field392;

    @OriginalMember(owner = "mapview!mapview", name = "r", descriptor = "I")
    private int field263 = this.field341 ? 252 : 111;

    @OriginalMember(owner = "mapview!mapview", name = "db", descriptor = "Lu;")
    private class38 field301 = this.field341 ? class27.field347 : class27.field347;

    @OriginalMember(owner = "mapview!mapview", name = "w", descriptor = "Lu;")
    public static class38 field268 = class28.method177("Dairy Churn", (byte) -84);

    @OriginalMember(owner = "mapview!mapview", name = "X", descriptor = "Lu;")
    public static class38 field295 = class28.method177("Clothes Shop", (byte) -84);

    @OriginalMember(owner = "mapview!mapview", name = "ib", descriptor = "Lu;")
    public static class38 field306 = class28.method177("General Store", (byte) -84);

    @OriginalMember(owner = "mapview!mapview", name = "k", descriptor = "I")
    private int field256;

    @OriginalMember(owner = "mapview!mapview", name = "p", descriptor = "I")
    private int field261;

    @OriginalMember(owner = "mapview!mapview", name = "q", descriptor = "I")
    private int field262;

    @OriginalMember(owner = "mapview!mapview", name = "Z", descriptor = "I")
    private int field297;

    @OriginalMember(owner = "mapview!mapview", name = "cb", descriptor = "I")
    private int field300;

    @OriginalMember(owner = "mapview!mapview", name = "jb", descriptor = "I")
    private int field307;

    @OriginalMember(owner = "mapview!mapview", name = "rb", descriptor = "I")
    private int field315;

    @OriginalMember(owner = "mapview!mapview", name = "Hb", descriptor = "I")
    private int field331;

    @OriginalMember(owner = "mapview!mapview", name = "Tb", descriptor = "I")
    public static int field343;

    @OriginalMember(owner = "mapview!mapview", name = "Lb", descriptor = "Lk;")
    private class21 field335;

    @OriginalMember(owner = "mapview!mapview", name = "l", descriptor = "Laa;")
    private class2 field257;

    @OriginalMember(owner = "mapview!mapview", name = "C", descriptor = "Laa;")
    private class2 field274;

    @OriginalMember(owner = "mapview!mapview", name = "D", descriptor = "Laa;")
    private class2 field275;

    @OriginalMember(owner = "mapview!mapview", name = "N", descriptor = "Laa;")
    private class2 field285;

    @OriginalMember(owner = "mapview!mapview", name = "T", descriptor = "Laa;")
    private class2 field291;

    @OriginalMember(owner = "mapview!mapview", name = "gb", descriptor = "Laa;")
    private class2 field304;

    @OriginalMember(owner = "mapview!mapview", name = "ub", descriptor = "Laa;")
    private class2 field318;

    @OriginalMember(owner = "mapview!mapview", name = "zb", descriptor = "Laa;")
    private class2 field323;

    @OriginalMember(owner = "mapview!mapview", name = "sb", descriptor = "Lra;")
    private class35 field316;

    @OriginalMember(owner = "mapview!mapview", name = "J", descriptor = "Lu;")
    private class38 field281;

    @OriginalMember(owner = "mapview!mapview", name = "S", descriptor = "[B")
    public static byte[] field290;

    @OriginalMember(owner = "mapview!mapview", name = "Pb", descriptor = "[I")
    public static int[] field339;

    @OriginalMember(owner = "mapview!mapview", name = "i", descriptor = "[Lu;")
    private class38[] field254;

    @OriginalMember(owner = "mapview!mapview", name = "xb", descriptor = "[Lu;")
    private class38[] field321;

    @OriginalMember(owner = "mapview!mapview", name = "f", descriptor = "(I)V", line = 12)
    public final void method147(int arg0) {
        class26.method151(arg0 - 9163);
        class3.method16(118, class3.field36);
        class10.method50(class3.field36, -82);
        class34.field454 = this.field311;
        boolean var2 = false;
        this.field321 = class7.method35(0);
        boolean var3 = true;
        this.field254 = class34.method203(arg0 ^ 0x23CB);
        if (var3) {
            byte var4 = 0;
            if (this.field254.length == 14) {
                byte var10002 = var4;
                int var5 = var4 + 1;
                this.field317 = this.field254[var10002];
                int var19 = var5;
                int var6 = var5 + 1;
                this.field282 = this.field254[var19];
                int var20 = var6;
                int var7 = var6 + 1;
                this.field280 = this.field254[var20];
                int var21 = var7;
                int var8 = var7 + 1;
                this.field314 = this.field254[var21];
                int var22 = var8;
                int var9 = var8 + 1;
                this.field337 = this.field254[var22];
                int var23 = var9;
                int var10 = var9 + 1;
                this.field311 = this.field254[var23];
                int var24 = var10;
                int var11 = var10 + 1;
                this.field336 = this.field254[var24];
                int var25 = var11;
                int var12 = var11 + 1;
                this.field266 = this.field254[var25];
                int var26 = var12;
                int var13 = var12 + 1;
                this.field265 = this.field254[var26];
                int var27 = var13;
                int var14 = var13 + 1;
                this.field301 = this.field254[var27];
                int var28 = var14;
                int var15 = var14 + 1;
                this.field294 = this.field254[var28];
                int var29 = var15;
                int var16 = var15 + 1;
                this.field302 = this.field254[var29];
                int var17 = var16 + 1;
                int var30 = var17;
                int var18 = var17 + 1;
                this.field320 = this.field254[var30];
                this.field298 = this.field317.method242(0, 109);
                this.field277 = this.field282.method242(0, -105);
                this.field312 = this.field280.method242(0, -116);
                this.field263 = this.method158(-20925, this.field298);
                this.field334 = this.method158(arg0 - 30013, this.field277);
                this.field326 = this.method158(-20925, this.field312);
            } else {
                class17.method103(112, new class38[] { class37.field476 });
            }
        }
        if (arg0 != 9088) {
            this.method173(119, 124);
        }
        this.field281 = class4.method29(50, (byte) 39);
    }

    @OriginalMember(owner = "mapview!mapview", name = "h", descriptor = "(I)I", line = 73)
    public static final int method156(int arg0) {
        if (arg0 != 0) {
            return 25;
        } else if (class8.field72 == null) {
            return 0;
        } else if (class8.field72.field395 == null) {
            return class28.field349[class8.field72.field400 & 0xFF];
        } else {
            return class28.field349[class8.field72.field395[class22.field213] & 0xFF];
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(Ljava/lang/Throwable;B)Ljava/lang/String;", line = 108)
    public static final String method157(Throwable arg0, byte arg1) throws IOException {
        String var2;
        if (arg0 instanceof class8) {
            class8 var3 = (class8) arg0;
            var2 = var3.field78 + " | ";
            arg0 = var3.field80;
        } else {
            var2 = "";
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        arg0.printStackTrace(var5);
        if (arg1 <= 75) {
            return (String) null;
        }
        var5.close();
        String var6 = var4.toString();
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        String var8 = var7.readLine();
        while (true) {
            while (true) {
                String var9 = var7.readLine();
                if (var9 == null) {
                    return var2 + "| " + var8;
                }
                int var11 = var9.indexOf(40);
                int var12 = var9.indexOf(41, var11 + 1);
                if (var11 >= 0 && var12 >= 0) {
                    String var13 = var9.substring(var11 + 1, var12);
                    int var14 = var13.indexOf(".java:");
                    if (var14 >= 0) {
                        String var15 = var13.substring(0, var14) + var13.substring(var14 + 5);
                        var2 = var2 + var15 + ' ';
                        continue;
                    }
                    var9 = var9.substring(0, var11);
                }
                String var16 = var9.trim();
                String var17 = var16.substring(var16.lastIndexOf(32) + 1);
                String var18 = var17.substring(var17.lastIndexOf(9) + 1);
                var2 = var2 + var18 + ' ';
            }
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(II)I", line = 181)
    private final int method158(int arg0, int arg1) {
        if (arg0 != -20925) {
            this.field309 = -93;
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
            return class1.method1(arg0 + 20818, arg1);
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "e", descriptor = "(B)V", line = 246)
    private final void method159(byte arg0) {
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
        int var7 = 0;
        if (arg0 != 39) {
            return;
        }
        while (var7 < var6.length) {
            try {
                label62: {
                    String var8 = var6[var7];
                    if (var8.length() > 0) {
                        File var9 = new File(var8);
                        if (!var9.exists()) {
                            break label62;
                        }
                    }
                    File var10 = new File(var8 + var2);
                    if (var10.exists() || var10.mkdir()) {
                        File var11 = new File(var10, "rsmap");
                        if (var11.exists() || var11.mkdir()) {
                            class9.field86 = var8 + var2 + "/rsmap/";
                            return;
                        }
                    }
                }
            } catch (Exception var14) {
            }
            var7++;
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "([BLjava/lang/String;B)V", line = 312)
    private final void method160(byte[] arg0, String arg1, byte arg2) throws IOException {
        if (arg2 > -27) {
            this.method173(13, 59);
        }
        FileOutputStream var4 = new FileOutputStream(arg1);
        var4.write(arg0, 0, arg0.length);
        var4.close();
    }

    @OriginalMember(owner = "mapview!mapview", name = "f", descriptor = "(B)V", line = 327)
    public static void method161(byte arg0) {
        field306 = null;
        field339 = null;
        field268 = null;
        field290 = null;
        if (arg0 > 94) {
            field295 = null;
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(ILu;IIIIIIB)V", line = 360)
    private final void method162(int arg0, class38 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte arg8) {
        class40.method259(arg6, arg3, arg4, arg0, 0);
        int var13 = arg6 + 1;
        int var10 = arg0 - 2;
        int var12 = arg4 - 2;
        if (arg8 <= 58) {
            return;
        }
        int var11 = arg3 + 1;
        class40.method255(var13, var11, var12, var10, arg2);
        class40.method262(var13, var11, var12, arg5);
        class40.method257(var13, var11, var10, arg5);
        class40.method262(var13, var11 + var10 - 1, var12, arg7);
        class40.method257(var13 + var12 - 1, var11, var10, arg7);
        this.field335.method70(arg1, var12 / 2 + var13 + 1, var11 - -(var10 / 2) - -5, 0, -1);
        this.field335.method70(arg1, var12 / 2 + var13, var10 / 2 + var11 + 4, 16777215, -1);
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(IIIIIIIII)V", line = 382)
    private final void method163(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class34.field421.method89(arg1, arg8, arg7 ^ 0xFFFFFFFC, arg6, arg5, arg2, arg0, arg4, arg3);
        if (arg1 - arg0 > arg5 - arg2) {
            return;
        }
        class34.field421.method91(arg8, arg5, arg0, this.field255, arg1, arg3, arg6, arg2, arg7 - 28070, arg4);
        if (arg7 != 0) {
            method161((byte) -111);
        }
        class34.field421.method100(arg6, arg1, arg4, arg3, arg0, arg8, arg5, (byte) -112, arg2);
        class34.field421.method97(this.field296, arg2, arg6, (byte) 94, arg8, arg1, arg0, this.field329, arg5, arg3, arg4);
        if (this.field325 == this.field255 && class18.field184) {
            for (int var10 = 0; var10 < this.field305; var10++) {
                int var11 = this.field258[var10];
                int var12 = class24.field229 + class29.field362 - var11;
                int var13 = this.field279[var10];
                int var14 = this.field303[var10];
                int var15 = 16777215;
                class2 var16 = null;
                if (var13 == 0) {
                    if (this.field255 == 3.0D) {
                        var16 = this.field291;
                    }
                    if (this.field255 == 4.0D) {
                        var16 = this.field318;
                    }
                    if (this.field255 == 6.0D) {
                        var16 = this.field323;
                    }
                    if (this.field255 == 8.0D) {
                        var16 = this.field257;
                    }
                }
                int var17 = (arg4 - arg3) * (-arg6 + var12) / (arg8 - arg6) + arg3;
                if (var13 == 1) {
                    if (this.field255 == 3.0D) {
                        var16 = this.field323;
                    }
                    if (this.field255 == 4.0D) {
                        var16 = this.field257;
                    }
                    if (this.field255 == 6.0D) {
                        var16 = this.field304;
                    }
                    if (this.field255 == 8.0D) {
                        var16 = this.field275;
                    }
                }
                int var18 = var14 - class33.field412;
                int var19 = arg2 + (var18 - arg0) * (-arg2 + arg5) / (arg1 - arg0);
                if (var13 == 2) {
                    if (this.field255 == 3.0D) {
                        var16 = this.field304;
                    }
                    var15 = 16755200;
                    if (this.field255 == 4.0D) {
                        var16 = this.field275;
                    }
                    if (this.field255 == 6.0D) {
                        var16 = this.field274;
                    }
                    if (this.field255 == 8.0D) {
                        var16 = this.field285;
                    }
                }
                if (var16 != null) {
                    int var20 = 1;
                    class38 var21 = this.field267[var10];
                    for (int var22 = 0; var21.method231((byte) -113) > var22; var22++) {
                        if (var21.method242(var22, arg7 ^ 0x33) == 47) {
                            var20++;
                        }
                    }
                    int var23 = var17 - (var20 - 1) * var16.method8() / 2;
                    int var24 = var23 + var16.method6() / 2;
                    while (true) {
                        int var25 = var21.method224(47, (byte) -45);
                        if (var25 == -1) {
                            var16.method12(var21, var19, var24, var15, true);
                            break;
                        }
                        class38 var26 = var21.method226(var25, true, 0);
                        var16.method12(var26, var19, var24, var15, true);
                        var24 += var16.method8();
                        var21 = var21.method230(0, var25 + 1);
                    }
                }
            }
        }
        if (!class31.field394) {
            return;
        }
        for (int var27 = class33.field412 / 64; var27 < (class33.field412 + class10.field97) / 64; var27++) {
            for (int var28 = class24.field229 / 64; var28 < (class24.field229 + class29.field362) / 64; var28++) {
                int var29 = var28 * 64;
                int var30 = class29.field362 + class24.field229 - var29;
                int var31 = var27 * 64;
                int var32 = var31 - class33.field412;
                int var33 = arg2 + (var32 + 64 - arg0) * (-arg2 + arg5) / (arg1 - arg0);
                int var34 = (var32 - arg0) * (-arg2 + arg5) / (arg1 - arg0) + arg2;
                int var35 = (arg4 - arg3) * (-arg6 + var30) / (arg8 - arg6) + arg3;
                int var36 = (arg4 - arg3) * (var30 - arg6 + -64) / (arg8 - arg6) + arg3;
                class40.method259(var34, var36, var33 - var34, -var36 + var35, 16777215);
                this.field335.method69(class7.method41(new class38[] { class26.method152(false, var27), class17.field170, class26.method152(false, var28) }, (byte) 56), var33 - 5, var35 + -5, 16777215, -1);
                if (var27 == 33 && var28 >= 71 && var28 <= 73) {
                    this.field335.method70(class3.field43, (var33 + var34) / 2, (var35 + var36) / 2, 16711680, -1);
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(BLjava/lang/String;[B)Z", line = 572)
    private final boolean method164(byte arg0, String arg1, byte[] arg2) {
        if (arg2 == null) {
            return false;
        }
        try {
            if (arg0 >= -37) {
                return false;
            }
            MessageDigest var4 = MessageDigest.getInstance("SHA");
            var4.reset();
            var4.update(arg2);
            byte[] var5 = var4.digest();
            if (arg1 == "main_file_cache.dat0") {
                if (var5[0] != -16 || var5[1] != -77 || var5[2] != 4 || var5[3] != 122 || var5[4] != 98 || var5[5] != 0 || var5[6] != 58 || var5[7] != 8 || var5[8] != 74 || var5[9] != 78 || var5[10] != 93 || var5[11] != 33 || var5[12] != 126 || var5[13] != 86 || var5[14] != 88 || var5[15] != -116 || var5[16] != -14 || var5[17] != -80 || var5[18] != -127 || var5[19] != -81) {
                    return false;
                }
            } else if (arg1 == "main_file_cache.idx1") {
                if (var5[0] != 52 || var5[1] != 126 || var5[2] != -117 || var5[3] != -96 || var5[4] != 55 || var5[5] != 19 || var5[6] != -40 || var5[7] != 125 || var5[8] != 49 || var5[9] != -77 || var5[10] != 77 || var5[11] != -79 || var5[12] != -93 || var5[13] != -47 || var5[14] != -110 || var5[15] != -122 || var5[16] != 84 || var5[17] != -103 || var5[18] != -78 || var5[19] != 126) {
                    return false;
                }
            } else if (var5[0] != 45 || var5[1] != 3 || var5[2] != -125 || var5[3] != -84 || var5[4] != 74 || var5[5] != -71 || var5[6] != 71 || var5[7] != 42 || var5[8] != 15 || var5[9] != -22 || var5[10] != -39 || var5[11] != -60 || var5[12] != -119 || var5[13] != 50 || var5[14] != -84 || var5[15] != 66 || var5[16] != -36 || var5[17] != -79 || var5[18] != 54 || var5[19] != -48) {
                return false;
            }
            return true;
        } catch (Exception var7) {
            this.method144((byte) 29, "sha");
            return false;
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(I)V", line = 627)
    public final void method135(int arg0) {
        if (!class10.field94) {
            class10.field94 = this.method169(2);
            class9.method48(class34.field454, null, arg0 ^ 0x11, class38.field490);
        } else if (arg0 == 18) {
            if (this.field283) {
                class9.field89 = true;
                this.field283 = false;
                class40.method256();
                int var2 = class10.field96 - (int) (503.0D / this.field255);
                int var3 = (int) (635.0D / this.field255) + class16.field151;
                int var4 = class16.field151 - (int) (635.0D / this.field255);
                int var5 = (int) (503.0D / this.field255) + class10.field96;
                this.method163(var4, var3, 0, 0, 503, 635, var2, 0, var5);
                if (this.field288) {
                    this.field316.method207(this.field261, this.field297);
                    class40.method260(this.field307 * var4 / class10.field97 + this.field261, this.field297 - -(this.field315 * var2 / class29.field362), (var3 - var4) * this.field307 / class10.field97, (var5 - var2) * this.field315 / class29.field362, 16711680, 128);
                    class40.method259(this.field307 * var4 / class10.field97 + this.field261, this.field315 * var2 / class29.field362 + this.field297, (var3 - var4) * this.field307 / class10.field97, (var5 - var2) * this.field315 / class29.field362, 16711680);
                    if (this.field296 > 0 && this.field296 % 10 < 5) {
                        for (int var6 = 0; var6 < class17.field169; var6++) {
                            if (class34.field421.field150[var6] == this.field329) {
                                int var7 = class34.field421.field162[var6] * this.field307 / class10.field97 + this.field261;
                                int var8 = this.field297 + class34.field421.field147[var6] * this.field315 / class29.field362;
                                class40.method258(var7, var8, 2, 16776960, 256);
                            }
                        }
                    }
                }
                if (this.field278) {
                    this.method162(18, this.field314, 7829367, this.field264, this.field308, 10066329, this.field269, 5592405, (byte) 111);
                    this.method162(this.field322 - 36, class25.field243, 7829367, this.field264 + 18, this.field308, 10066329, this.field269, 5592405, (byte) 78);
                    this.method162(18, this.field337, 7829367, this.field322 + this.field264 - 18, this.field308, 10066329, this.field269, 5592405, (byte) 73);
                    int var9 = this.field264 + 21;
                    int var10 = this.field309;
                    for (int var11 = 0; var11 < 24; var11++) {
                        if (class32.field402.length > var10 && this.field321.length > var10) {
                            if (this.field321[var10].method229(class36.field463, arg0 ^ 0x7D)) {
                                var10++;
                                var11--;
                                continue;
                            }
                            class32.field402[var10].method206(this.field269 + 3, var9);
                            this.field335.method66(this.field321[var10], this.field269 + 21, var9 - -14, 0, -1);
                            int var12 = 16777215;
                            if (this.field328 == var10) {
                                var12 = 12298922;
                            }
                            if (this.field296 > 0 && this.field296 % 10 < 5 && this.field329 == var10) {
                                var12 = 16776960;
                            }
                            this.field335.method66(this.field321[var10], this.field269 + 20, var9 + 13, var12, -1);
                        }
                        var9 += 17;
                        var10++;
                    }
                }
                if (class33.field409.length == 1) {
                    this.method162(18, this.field317, this.field286, this.field315 + this.field297, this.field307, this.field276, this.field261, this.field289, (byte) 63);
                    this.method162(18, this.field280, this.field286, this.field322 + this.field264, this.field308, this.field276, this.field269, this.field289, (byte) 113);
                    if (this.field325 == 3.0D) {
                        this.method162(this.field338, class1.field2, this.field313, this.field333, this.field271, this.field287, this.field292, this.field284, (byte) 111);
                    } else {
                        this.method162(this.field338, class1.field2, this.field286, this.field333, this.field271, this.field276, this.field292, this.field289, (byte) 70);
                    }
                    if (this.field325 == 4.0D) {
                        this.method162(this.field338, class29.field361, this.field313, this.field333, this.field271, this.field287, this.field292 + this.field259, this.field284, (byte) 102);
                    } else {
                        this.method162(this.field338, class29.field361, this.field286, this.field333, this.field271, this.field276, this.field292 + this.field259, this.field289, (byte) 127);
                    }
                    if (this.field325 == 6.0D) {
                        this.method162(this.field338, class32.field403, this.field313, this.field333, this.field271, this.field287, this.field259 * 2 + this.field292, this.field284, (byte) 115);
                    } else {
                        this.method162(this.field338, class32.field403, this.field286, this.field333, this.field271, this.field276, this.field259 * 2 + this.field292, this.field289, (byte) 79);
                    }
                    if (this.field325 == 8.0D) {
                        this.method162(this.field338, class28.field358, this.field313, this.field333, this.field271, this.field287, this.field292 + this.field259 * 3, this.field284, (byte) 68);
                    } else {
                        this.method162(this.field338, class28.field358, this.field286, this.field333, this.field271, this.field276, this.field259 * 3 + this.field292, this.field289, (byte) 72);
                    }
                } else {
                    this.method162(18, this.field317, this.field286, this.field315 + this.field297, this.field307, this.field276, this.field261, this.field289, (byte) 68);
                    this.method162(18, this.field280, this.field286, this.field322 + this.field264, this.field308, this.field276, this.field269, this.field289, (byte) 99);
                    this.method170(22671, this.field286);
                    int var13 = this.field333 + this.field299;
                    if (this.field325 == 3.0D) {
                        this.method162(this.field338, class1.field2, this.field313, var13, this.field271, this.field287, this.field292, this.field284, (byte) 107);
                    } else {
                        this.method162(this.field338, class1.field2, this.field286, var13, this.field271, this.field276, this.field292, this.field289, (byte) 60);
                    }
                    if (this.field325 == 4.0D) {
                        this.method162(this.field338, class29.field361, this.field313, var13, this.field271, this.field287, this.field292 + this.field259, this.field284, (byte) 91);
                    } else {
                        this.method162(this.field338, class29.field361, this.field286, var13, this.field271, this.field276, this.field292 + this.field259, this.field289, (byte) 76);
                    }
                    if (this.field325 == 6.0D) {
                        this.method162(this.field338, class32.field403, this.field313, var13, this.field271, this.field287, this.field259 * 2 + this.field292, this.field284, (byte) 115);
                    } else {
                        this.method162(this.field338, class32.field403, this.field286, var13, this.field271, this.field276, this.field259 * 2 + this.field292, this.field289, (byte) 73);
                    }
                    if (this.field325 == 8.0D) {
                        this.method162(this.field338, class28.field358, this.field313, var13, this.field271, this.field287, this.field259 * 3 + this.field292, this.field284, (byte) 66);
                    } else {
                        this.method162(this.field338, class28.field358, this.field286, var13, this.field271, this.field276, this.field259 * 3 + this.field292, this.field289, (byte) 67);
                    }
                }
                if (class33.field406) {
                    this.method162(this.field273, this.field282, this.field286, this.field332, this.field293, this.field276, this.field327, this.field289, (byte) 71);
                    if (class4.field50) {
                        class40.method260(this.field327 + this.field293 + 2, this.field332, this.field262 + 10, this.field273, 8925952, 192);
                        class40.method259(this.field327 + this.field293 + 2, this.field332, this.field262 + 10, this.field273, 16777215);
                        if (class18.field186 > -1 && this.field281.method231((byte) 14) > 0) {
                            class38 var14 = this.field267[class18.field186].method221(47, 32, false);
                            int var15 = this.field281.method231((byte) 77);
                            if (var15 > var14.method231((byte) -117)) {
                                var15 = var14.method231((byte) -118);
                            }
                            this.field335.method66(var14, this.field327 + this.field293 + 6, 20, 10066176, 0);
                            this.field335.method66(var14.method226(var15, true, 0), this.field327 + this.field293 + 6, 20, 16777215, 0);
                        } else {
                            this.field335.method66(this.field266, this.field327 + this.field293 + 6, 20, 16776960, 0);
                        }
                    }
                }
            }
            if (class9.field89) {
                this.method171(-24);
            }
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "init", descriptor = "()V", line = 835)
    public final void init() {
        if (this.method148(36)) {
            this.method137(Integer.parseInt(this.getParameter("codeversion")), 32, 635, -3469, 503);
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "i", descriptor = "(I)V", line = 845)
    private final void method165(int arg0) {
        if (class33.field409.length == 1) {
            class11.field98 = 0;
        } else {
            if (class34.field439 < 0) {
                class11.field98 = this.method173(class11.field98, 503);
            } else {
                class11.field98 = class34.field439;
            }
            class34.field439 = this.method173(class11.field98, arg0 + 31242);
        }
        this.method168(-107, class11.field98);
        if (arg0 != -30739) {
            this.method141((byte) -82);
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "b", descriptor = "(Z)V", line = 879)
    private static final void method166(boolean arg0) {
        if (arg0) {
            field306 = null;
        }
        if (class9.field87 != null) {
            class22 var1 = class9.field87;
            synchronized (class9.field87) {
                class9.field87 = null;
            }
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(Lu;Ljava/lang/String;B)Z", line = 935)
    private final boolean method167(class38 arg0, String arg1, byte arg2) {
        byte[] var4 = null;
        if (!class18.field179) {
            if (class9.field86 != null) {
                try {
                    var4 = this.method174(73, class9.field86 + "/" + arg1);
                    if (!this.method164((byte) -110, arg1, var4)) {
                        var4 = null;
                    }
                    if (var4 != null) {
                        class7.field69 = new class37(var4, false, true);
                        return true;
                    }
                } catch (IOException var11) {
                    var4 = null;
                }
            }
            class18.field179 = true;
        }
        if (var4 == null) {
            boolean var6 = this.method172(arg1, arg0, (byte) 98);
            if (!var6) {
                return false;
            }
            var4 = class30.field383;
            class30.field383 = null;
        }
        if (arg2 != -106) {
            this.field274 = null;
        }
        if (var4 == null) {
            class18.field179 = false;
            return true;
        }
        if (class9.field86 != null && var4 != null) {
            try {
                this.method160(var4, class9.field86 + "/" + arg1, (byte) -88);
            } catch (IOException var10) {
            }
        }
        try {
            class7.field69 = new class37(var4, false, true);
            class18.field179 = false;
            return true;
        } catch (IOException var9) {
            throw class37.method215(var9, "monkey feet");
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "b", descriptor = "(II)V", line = 1014)
    private final void method168(int arg0, int arg1) {
        if (arg0 > -70) {
            field290 = null;
        }
        if (class33.field409.length <= arg1) {
            return;
        }
        class37 var3 = class33.field409[arg1];
        class19 var4 = new class19(var3.method19(false, class11.field99, class25.field239));
        var4.method108(true);
        class19 var5 = new class19(var3.method19(false, class11.field99, class8.field73));
        this.field305 = var5.method119((byte) 116);
        for (int var6 = 0; var6 < this.field305; var6++) {
            this.field267[var6] = var5.method108(true);
            this.field303[var6] = var5.method119((byte) 108);
            this.field258[var6] = var5.method119((byte) 110);
            this.field279[var6] = var5.method115(-2);
            class38 var7 = this.field267[var6].method221(47, 32, false);
            int var8 = this.field335.method68(var7);
            if (this.field262 < var8) {
                this.field262 = var8;
            }
            int var9 = this.field335.method68(this.field266);
            if (this.field262 < var9) {
                this.field262 = var9;
            }
        }
        class34.field421 = new class16();
        class34.field421.method96(64, class33.field409[arg1]);
        class16.field151 = class11.field100;
        class10.field96 = class7.field63;
        this.field315 = 180;
        this.field307 = class10.field97 * this.field315 / class29.field362;
        this.field297 = 503 - this.field315 - 20;
        this.field261 = 635 - this.field307 - 5;
        this.field316 = new class35(this.field307, this.field315);
        this.field316.method208();
        this.method163(0, class10.field97, 0, 0, this.field315, this.field307, 0, 0, class29.field362);
        class40.method259(0, 0, this.field307, this.field315, 0);
        class40.method259(1, 1, this.field307 - 2, this.field315 + -2, this.field276);
        class16.field152.method187(0);
    }

    @OriginalMember(owner = "mapview!mapview", name = "d", descriptor = "(B)V", line = 1106)
    public final void method149(byte arg0) {
        if (class18.field178) {
            class19.method114(128, class3.field36);
            class19.method107(class3.field36, (byte) 104);
            this.method138(0);
            class3.method16(-122, class3.field36);
            class10.method50(class3.field36, -87);
        }
        class11.method52(false);
        class20.method124((byte) 119);
        if (!class10.field94) {
            return;
        }
        if (class7.field65[96]) {
            class16.field151 = (int) ((double) class16.field151 - 16.0D / this.field255);
            class8.field82 = -1;
            this.field283 = true;
        }
        if (class7.field65[97]) {
            class8.field82 = -1;
            class16.field151 = (int) (16.0D / this.field255 + (double) class16.field151);
            this.field283 = true;
        }
        if (class7.field65[98]) {
            class10.field96 = (int) ((double) class10.field96 - 16.0D / this.field255);
            this.field283 = true;
            class8.field82 = -1;
        }
        if (class7.field65[99]) {
            class10.field96 = (int) (16.0D / this.field255 + (double) class10.field96);
            this.field283 = true;
            class8.field82 = -1;
        }
        while (true) {
            while (true) {
                while (class9.method46(-75)) {
                    if (!class33.field406 || !class4.field50) {
                        if (class3.field26 == this.field334 || class3.field26 == this.field277) {
                            this.field283 = true;
                            class4.field50 = true;
                        }
                        if (class3.field26 == 49) {
                            this.field283 = true;
                            this.field325 = 3.0D;
                        }
                        if (class3.field26 == 50) {
                            this.field283 = true;
                            this.field325 = 4.0D;
                        }
                        if (class3.field26 == 51) {
                            this.field325 = 6.0D;
                            this.field283 = true;
                        }
                        if (class3.field26 == 52) {
                            this.field325 = 8.0D;
                            this.field283 = true;
                        }
                        if (class3.field26 == this.field326 || class3.field26 == this.field312) {
                            this.field283 = true;
                            this.field278 = !this.field278;
                        }
                        if (class3.field26 == this.field263 || class3.field26 == this.field298) {
                            this.field283 = true;
                            this.field288 = !this.field288;
                        }
                    } else if (class38.field489 == 0) {
                        class4.field50 = false;
                        this.field283 = true;
                        this.field281.method222(0, -8334);
                        class18.field186 = -1;
                    } else if (class38.field489 == 84) {
                        this.field331 = class16.field151 << 16;
                        class4.field50 = false;
                        class8.field82 = class18.field186;
                        this.field256 = class10.field96 << 16;
                        this.field281.method222(0, -8334);
                        class18.field186 = -1;
                        this.field283 = true;
                    } else {
                        boolean var2 = false;
                        if (class38.field489 == 85) {
                            if (this.field281.method231((byte) -124) > 0) {
                                this.field281.method222(this.field281.method231((byte) -126) - 1, -8334);
                                this.field283 = true;
                                if (this.field281.method231((byte) -122) == 0) {
                                    class18.field186 = -1;
                                } else {
                                    var2 = true;
                                }
                            }
                        } else if (class3.field26 != -1 && this.field281.method231((byte) -115) <= class31.field393) {
                            this.field281.method223(-75, class3.field26);
                            this.field283 = true;
                        }
                        if (this.field281.method231((byte) 67) > 0) {
                            for (int var3 = 0; var3 < this.field305; var3++) {
                                if (this.field267[var3].method231((byte) -115) >= this.field281.method231((byte) 44)) {
                                    class38 var4 = this.field281.method241(0);
                                    class38 var5 = this.field267[var3].method221(47, 32, false).method226(this.field281.method231((byte) -122), true, 0).method241(0);
                                    if (var4.method233(var5, (byte) 33) == 0) {
                                        var2 = true;
                                        this.field283 = true;
                                        class18.field186 = var3;
                                        break;
                                    }
                                }
                            }
                            if (!var2) {
                                this.field281.method222(this.field281.method231((byte) -116) - 1, -8334);
                            }
                        }
                    }
                }
                int var6 = -73 % ((-arg0 - 74) / 35);
                int var7 = class9.field92;
                int var8 = class34.field424;
                int var9 = class23.field225;
                int var10 = class37.field475;
                int var11 = class22.field217;
                int var12 = class23.field227;
                if (var7 == 1) {
                    this.field330 = var9;
                    this.field324 = class10.field96;
                    this.field342 = class16.field151;
                    this.field340 = var8;
                    if (class33.field409.length == 1) {
                        if (var8 > this.field292 && this.field292 + this.field271 > var8 && this.field333 < var9 && this.field338 + this.field333 > var9) {
                            this.field340 = -1;
                            this.field325 = 3.0D;
                        }
                        if (this.field292 + this.field259 < var8 && var8 < this.field292 + this.field271 + this.field259 && var9 > this.field333 && this.field333 + this.field338 > var9) {
                            this.field325 = 4.0D;
                            this.field340 = -1;
                        }
                        if (var8 > this.field259 * 2 + this.field292 && var8 < this.field259 * 2 + this.field292 + this.field271 && this.field333 < var9 && this.field338 + this.field333 > var9) {
                            this.field340 = -1;
                            this.field325 = 6.0D;
                        }
                        if (this.field259 * 3 + this.field292 < var8 && var8 < this.field292 + this.field259 * 3 + this.field271 && this.field333 < var9 && var9 < this.field338 + this.field333) {
                            this.field325 = 8.0D;
                            this.field340 = -1;
                        }
                    } else {
                        if (var8 > this.field292 && this.field292 + this.field271 > var8 && this.field333 < var9 && var9 < this.field338 + this.field299 + this.field333) {
                            this.field325 = 3.0D;
                            this.field340 = -1;
                        }
                        if (this.field292 + this.field259 < var8 && var8 < this.field292 + this.field259 + this.field271 && this.field333 < var9 && this.field338 + this.field333 + this.field299 > var9) {
                            this.field325 = 4.0D;
                            this.field340 = -1;
                        }
                        if (var8 > this.field259 * 2 + this.field292 && var8 < this.field259 * 2 + this.field292 + this.field271 && this.field333 < var9 && var9 < this.field338 + this.field333 + this.field299) {
                            this.field340 = -1;
                            this.field325 = 6.0D;
                        }
                        if (this.field259 * 3 + this.field292 < var8 && var8 < this.field259 * 3 + this.field292 + this.field271 && this.field333 < var9 && this.field338 + this.field299 + this.field333 > var9) {
                            this.field340 = -1;
                            this.field325 = 8.0D;
                        }
                        if (var8 > 170 && var8 < 400 && var9 > 483 && var9 < 503) {
                            this.method170(22671, this.field313);
                            this.method171(-48);
                            this.method165(-30739);
                            this.field340 = -1;
                        }
                    }
                    this.field272 = false;
                    if (var8 > this.field269 && var9 > this.field322 + this.field264 && var8 < this.field269 + this.field308 && var9 < 503) {
                        this.field278 = !this.field278;
                        this.field340 = -1;
                    }
                    if (var8 > this.field261 && var9 > this.field315 + this.field297 && this.field307 + this.field261 > var8 && var9 < 503) {
                        this.field288 = !this.field288;
                        this.field340 = -1;
                    }
                    this.field283 = true;
                    if (this.field278) {
                        if (var8 > this.field269 && var9 > this.field264 && var8 < this.field308 + this.field269 && this.field322 + this.field264 > var9) {
                            this.field340 = -1;
                        }
                        if (var8 > this.field269 && var9 > this.field264 && var8 < this.field308 + this.field269 && var9 < this.field264 + 18 && this.field260 > 0) {
                            this.field260 -= 24;
                        }
                        if (this.field269 < var8 && this.field264 + this.field322 - 18 < var9 && var8 < this.field308 + this.field269 && this.field322 + this.field264 > var9 && this.field260 < 48) {
                            this.field260 += 24;
                        }
                    }
                    if (this.field288 && var8 > this.field261 && var9 > this.field297 && var8 < this.field307 + this.field261 && this.field315 + this.field297 > var9) {
                        class16.field151 = (var8 - this.field261) * class10.field97 / this.field307;
                        this.field340 = -1;
                        class10.field96 = (var9 - this.field297) * class29.field362 / this.field315;
                        this.field272 = true;
                    }
                    if (class33.field406 && !class4.field50 && !this.field272 && var8 > this.field327 && this.field332 < var9 && this.field327 + this.field293 > var8 && var9 < this.field332 + this.field273) {
                        class4.field50 = true;
                    }
                }
                if (this.field278) {
                    this.field328 = -1;
                    if (var10 > this.field269 && var10 < this.field308 + this.field269) {
                        int var13 = this.field264 + 21 + 5;
                        int var14 = this.field309;
                        for (int var15 = 0; var15 < 24; var15++) {
                            if (var14 < this.field321.length && this.field321[var14].method229(class36.field463, -109)) {
                                var15--;
                                var14++;
                            } else {
                                if (var11 >= var13 && var13 + 17 > var11) {
                                    if (var7 == 1) {
                                        this.field329 = var14;
                                        this.field296 = 50;
                                    }
                                    this.field328 = var14;
                                }
                                var14++;
                                var13 += 17;
                            }
                        }
                    }
                    if (this.field328 != this.field270) {
                        this.field270 = this.field328;
                        this.field283 = true;
                    }
                }
                if (var12 == 1 && this.field288 && this.field272) {
                    class8.field82 = -1;
                    int var16 = var10;
                    this.field283 = true;
                    int var17 = var11;
                    if (this.field261 > var10) {
                        var16 = this.field261;
                    } else if (var10 > this.field307 + this.field261) {
                        var16 = this.field307 + this.field261;
                    }
                    class16.field151 = (var16 - this.field261) * class10.field97 / this.field307;
                    if (this.field297 > var11) {
                        var17 = this.field297;
                    } else if (var11 > this.field297 + this.field315) {
                        var17 = this.field315 + this.field297;
                    }
                    class10.field96 = (var17 - this.field297) * class29.field362 / this.field315;
                } else {
                    this.field272 = false;
                }
                if (var12 == 1 && this.field340 != -1) {
                    class10.field96 = (int) ((double) (this.field330 - var11) * 2.0D / this.field325) + this.field324;
                    this.field283 = true;
                    class16.field151 = (int) ((double) (this.field340 - var10) * 2.0D / this.field325) + this.field342;
                    class8.field82 = -1;
                }
                if (this.field255 < this.field325) {
                    this.field255 += this.field255 / 30.0D;
                    if (this.field325 < this.field255) {
                        this.field255 = this.field325;
                    }
                    this.field283 = true;
                }
                if (this.field255 > this.field325) {
                    this.field255 -= this.field255 / 30.0D;
                    this.field283 = true;
                    if (this.field255 < this.field325) {
                        this.field255 = this.field325;
                    }
                }
                if (this.field260 > this.field309) {
                    this.field309++;
                    this.field283 = true;
                }
                if (this.field260 < this.field309) {
                    this.field283 = true;
                    this.field309--;
                }
                if (this.field296 > 0) {
                    this.field283 = true;
                    this.field296--;
                }
                if (class8.field82 >= 0) {
                    byte var18 = 4;
                    class8.field75 = this.field303[class8.field82] - class33.field412;
                    int var19 = class8.field75 - (int) (635.0D / this.field255);
                    int var20 = (int) (635.0D / this.field255) + class8.field75;
                    class18.field188 = class29.field362 + class24.field229 - this.field258[class8.field82];
                    int var21 = class18.field188 - (int) (503.0D / this.field255);
                    if (var19 < 48) {
                        class8.field75 = (int) (635.0D / this.field255) + 48;
                    }
                    this.field283 = true;
                    if (var20 > class10.field97 - 48) {
                        class8.field75 = class10.field97 - (int) (635.0D / this.field255) - 48;
                    }
                    class8.field75 <<= 0x10;
                    int var22 = class8.field75 - this.field331;
                    int var23 = (int) (503.0D / this.field255) + class18.field188;
                    if (var21 < 48) {
                        class18.field188 = (int) (503.0D / this.field255) + 48;
                    }
                    if (class29.field362 - 48 < var23) {
                        class18.field188 = class29.field362 - (int) (503.0D / this.field255) - 48;
                    }
                    class18.field188 <<= 0x10;
                    int var24 = class18.field188 - this.field256;
                    if (var22 >> var18 == 0 && var24 >> var18 == 0) {
                        class8.field82 = -1;
                    } else {
                        this.field331 += var22 >> var18;
                        this.field256 += var24 >> var18;
                        class16.field151 = this.field331 >> 16;
                        class10.field96 = this.field256 >> 16;
                    }
                }
                int var25 = class16.field151 - (int) (635.0D / this.field255);
                int var26 = (int) (635.0D / this.field255) + class16.field151;
                if (var25 < 48) {
                    class16.field151 = (int) (635.0D / this.field255) + 48;
                }
                if (var26 > class10.field97 - 48) {
                    class16.field151 = class10.field97 - (int) (635.0D / this.field255) - 48;
                }
                int var27 = class10.field96 - (int) (503.0D / this.field255);
                int var28 = (int) (503.0D / this.field255) + class10.field96;
                if (var27 < 48) {
                    class10.field96 = (int) (503.0D / this.field255) + 48;
                }
                if (class29.field362 - 48 < var28) {
                    class10.field96 = class29.field362 - (int) (503.0D / this.field255) - 48;
                }
                return;
            }
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "j", descriptor = "(I)Z", line = 1645)
    private final boolean method169(int arg0) {
        if (class32.field404 == 0) {
            this.method159((byte) 39);
            class32.field404 = 1;
        }
        if (class32.field404 == 1) {
            class38.field490 = 15;
            boolean var2 = this.method167(this.field301, "main_file_cache.idx0", (byte) -106);
            if (!var2) {
                return false;
            }
            class30.field377 = class7.field69;
            class7.field69 = null;
            if (class30.field377 == null) {
                throw new RuntimeException("T1");
            }
            class32.field404 = 2;
        }
        if (class32.field404 == arg0) {
            class38.field490 = 30;
            boolean var3 = this.method167(this.field294, "main_file_cache.idx1", (byte) -106);
            if (!var3) {
                return false;
            }
            class38.field484 = class7.field69;
            class7.field69 = null;
            if (class38.field484 == null) {
                throw new RuntimeException("T2");
            }
            class32.field404 = 3;
        }
        if (class32.field404 == 3) {
            class32.field404 = 10;
            class33.field409 = new class37[1];
        }
        if (class32.field404 == 10) {
            class38.field490 = 50;
            boolean var4 = this.method167(this.field302, "main_file_cache.dat0", (byte) -106);
            if (!var4) {
                return false;
            }
            class33.field409[0] = class7.field69;
            class7.field69 = null;
            if (class33.field409[0] == null) {
                throw new RuntimeException("T3");
            }
            class32.field404 = 20;
        }
        if (class32.field404 != 20) {
            return false;
        }
        class1.field4 = class30.method184((byte) 61, class3.field38, class30.field377, class25.field243);
        class32.field402 = class37.method212(class25.field243, class25.field242, class30.field377, 49);
        this.field335 = class29.method180(class25.field243, -113, class38.field484, class28.field355, class30.field377);
        this.field291 = new class2(11, true, this);
        this.field318 = new class2(12, true, this);
        this.field323 = new class2(14, true, this);
        this.field257 = new class2(17, true, this);
        this.field304 = new class2(19, true, this);
        this.field275 = new class2(22, true, this);
        this.field274 = new class2(26, true, this);
        this.field285 = new class2(30, true, this);
        class38.field490 = 100;
        class34.field454 = this.field336;
        class9.method48(class34.field454, null, 3, class38.field490);
        this.field293 = this.field335.method68(this.field282) + 20;
        this.method165(-30739);
        class38[] var5 = this.field321;
        for (int var6 = 0; var6 < var5.length; var6++) {
            class38 var7 = var5[var6];
            int var8 = this.field335.method68(var7);
            if (this.field300 < var8) {
                this.field300 = var8;
            }
        }
        this.field308 = this.field300 + 16 + 18;
        if (this.field308 > 140) {
            int var9 = this.field261 - this.field308 - this.field269;
            this.field319 = var9 / 25;
            this.field271 = this.field319 * 5;
            int var10 = var9 - this.field319 * 25;
            this.field259 = this.field271 + this.field319;
            this.field292 = var10 / 2 + this.field319 + this.field308 + this.field269;
        }
        return true;
    }

    @OriginalMember(owner = "mapview!mapview", name = "c", descriptor = "(II)V", line = 1777)
    private final void method170(int arg0, int arg1) {
        if (arg0 == 22671) {
            this.method162(18, class7.method41(new class38[] { class37.field474, class28.field352[class34.field439], class32.field401 }, (byte) 56), arg1, 483, 230, this.field276, 170, this.field289, (byte) 77);
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "k", descriptor = "(I)V", line = 1788)
    private final void method171(int arg0) {
        int var2 = -128 % ((70 - arg0) / 32);
        class9.field89 = false;
        try {
            Graphics var3 = class3.field36.getGraphics();
            class16.field152.method128(-12218, 0, var3, 0);
        } catch (Exception var5) {
            class3.field36.repaint();
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "c", descriptor = "(I)V", line = 1828)
    public final void method142(int arg0) {
        class22.method127(0);
        method166(false);
        try {
            class34.field421 = null;
            this.field258 = null;
            this.field335 = null;
            this.field267 = null;
            this.field321 = null;
            this.field303 = null;
            this.field316 = null;
            this.field279 = null;
            System.gc();
        } catch (Throwable var3) {
        }
        if (arg0 < 72) {
            this.field296 = -93;
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(Ljava/lang/String;Lu;B)Z", line = 1878)
    private final boolean method172(String arg0, class38 arg1, byte arg2) {
        try {
            if (arg2 <= 87) {
                this.field309 = 125;
            }
            if (class29.field366 == null) {
                String var4;
                if (arg0 == "main_file_cache.dat0") {
                    var4 = "worldmap.main.js5?crc=219946598";
                } else if (arg0 == "main_file_cache.dat1") {
                    var4 = "worldmap.dungeon.js5?crc=-120359675";
                } else if (arg0 == "main_file_cache.dat2") {
                    var4 = "worldmap.extra.js5?crc=-1553122548";
                } else if (arg0 == "main_file_cache.idx1") {
                    var4 = "mapview.fontmetrics.js5?crc=-447025815";
                } else {
                    var4 = "mapview.sprites.js5?crc=-1292288506";
                }
                class34.field454 = class7.method41(new class38[] { this.field265, class16.field158, arg1 }, (byte) 56);
                class29.field366 = new DataInputStream((new URL(this.getCodeBase(), var4)).openStream());
                int var5;
                if (arg0 == "main_file_cache.dat0") {
                    var5 = 417410;
                } else if (arg0 == "main_file_cache.dat1") {
                    var5 = 154527;
                } else if (arg0 == "main_file_cache.dat2") {
                    var5 = 135772;
                } else if (arg0 == "main_file_cache.idx1") {
                    var5 = 165;
                } else {
                    var5 = 8294;
                }
                class30.field383 = new byte[var5];
                class36.field464 = 0;
                class33.field408 = 0;
            }
            int var6 = class30.field383.length;
            int var7 = class36.field464;
            if (var6 <= var7) {
                class29.field366.close();
                class29.field366 = null;
                if (!this.method164((byte) -87, arg0, class30.field383)) {
                    this.method144((byte) 29, "download");
                    class30.field383 = null;
                }
                return true;
            }
            class33.field408++;
            if (class33.field408 >= 1500) {
                throw new IOException();
            }
            DataInputStream var8 = class29.field366;
            int var9 = var8.available();
            if (var9 < 0) {
                throw new EOFException();
            } else if (var9 == 0) {
                return false;
            } else {
                if (var6 - var7 < var9) {
                    var9 = var6 - var7;
                }
                int var10 = var8.read(class30.field383, var7, var9);
                if (var10 < 0) {
                    throw new EOFException();
                } else if (var10 == 0) {
                    return false;
                } else {
                    class33.field408 = 0;
                    int var11 = var7 + var10;
                    int var12 = var11 * 100 / var6;
                    class34.field454 = class7.method41(new class38[] { this.field320, class16.field158, arg1, class29.field372, class26.method152(false, var12), class9.field84 }, (byte) 56);
                    class36.field464 = var11;
                    return false;
                }
            }
        } catch (IOException var16) {
            try {
                class29.field366.close();
            } catch (Exception var15) {
            }
            class29.field366 = null;
            class30.field383 = null;
            this.method144((byte) 29, new String("download"));
            return true;
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "b", descriptor = "(B)V", line = 2011)
    public final void method141(byte arg0) {
        method161((byte) 116);
        class4.method27(false);
        class38.method234((byte) 56);
        class11.method51(0);
        class7.method38((byte) -74);
        class19.method116(-121);
        class25.method136(true);
        class10.method49((byte) -125);
        class31.method188((byte) -90);
        class37.method216(126);
        class16.method98((byte) -97);
        class2.method5();
        class22.method126((byte) -111);
        class18.method105(250);
        class3.method23(0);
        class17.method102((byte) 120);
        class36.method211(-1);
        class40.method265();
        class32.method194(false);
        class27.method175((byte) 84);
        class9.method47(true);
        class30.method183((byte) -78);
        class14.method65();
        class8.method42(15845);
        class24.method134(81);
        class28.method176((byte) 35);
        class20.method125(false);
        class26.method153(-102);
        class29.method181((byte) 104);
        class1.method3((byte) 46);
        class23.method130(0);
        class33.method200(21);
        class12.method58();
        class34.method201(-1);
        this.field266 = null;
        this.field291 = null;
        this.field336 = null;
        this.field280 = null;
        this.field265 = null;
        this.field317 = null;
        this.field321 = null;
        this.field281 = null;
        this.field311 = null;
        this.field314 = null;
        if (arg0 >= -12) {
            this.field321 = null;
        }
        this.field323 = null;
        this.field335 = null;
        this.field257 = null;
        this.field301 = null;
        this.field275 = null;
        this.field294 = null;
        this.field258 = null;
        this.field337 = null;
        this.field318 = null;
        this.field303 = null;
        this.field267 = null;
        this.field282 = null;
        this.field274 = null;
        this.field304 = null;
        this.field285 = null;
        this.field320 = null;
        this.field316 = null;
        this.field279 = null;
        this.field254 = null;
        this.field302 = null;
        if (class25.field245) {
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "d", descriptor = "(II)I", line = 2084)
    private final int method173(int arg0, int arg1) {
        if (arg1 != 503) {
            this.field304 = null;
        }
        arg0++;
        if (class33.field409.length <= arg0) {
            arg0 = 0;
        }
        return arg0;
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(ILjava/lang/String;)[B", line = 2100)
    private final byte[] method174(int arg0, String arg1) throws IOException {
        File var3 = new File(arg1);
        if (!var3.exists()) {
            return null;
        }
        int var4 = (int) var3.length();
        if (arg0 < 13) {
            this.field284 = -76;
        }
        byte[] var5 = new byte[var4];
        DataInputStream var6 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg1)));
        var6.readFully(var5, 0, var4);
        var6.close();
        return var5;
    }
}
