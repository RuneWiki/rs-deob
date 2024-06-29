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
public class mapview extends class30 {

    @OriginalMember(owner = "mapview!mapview", name = "q", descriptor = "I")
    private int field231 = -20;

    @OriginalMember(owner = "mapview!mapview", name = "N", descriptor = "Z")
    private boolean field254 = false;

    @OriginalMember(owner = "mapview!mapview", name = "P", descriptor = "I")
    private int field256 = -1;

    @OriginalMember(owner = "mapview!mapview", name = "s", descriptor = "Lu;")
    private class38 field233 = this.field254 ? class32.field392 : class18.field171;

    @OriginalMember(owner = "mapview!mapview", name = "E", descriptor = "I")
    private int field245 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "T", descriptor = "I")
    private int field260 = -1;

    @OriginalMember(owner = "mapview!mapview", name = "L", descriptor = "I")
    private int field252 = 10;

    @OriginalMember(owner = "mapview!mapview", name = "jb", descriptor = "I")
    private int field276 = 7824964;

    @OriginalMember(owner = "mapview!mapview", name = "w", descriptor = "I")
    private int field237 = this.field254 ? 108 : 107;

    @OriginalMember(owner = "mapview!mapview", name = "ob", descriptor = "I")
    private int field281 = 33;

    @OriginalMember(owner = "mapview!mapview", name = "F", descriptor = "I")
    private int field246 = 30;

    @OriginalMember(owner = "mapview!mapview", name = "rb", descriptor = "D")
    private double field284 = 4.0D;

    @OriginalMember(owner = "mapview!mapview", name = "cb", descriptor = "I")
    private int field269 = this.field254 ? 115 : 102;

    @OriginalMember(owner = "mapview!mapview", name = "Z", descriptor = "I")
    private int field266 = -1;

    @OriginalMember(owner = "mapview!mapview", name = "B", descriptor = "I")
    private int field242 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "Y", descriptor = "Z")
    private boolean field265 = false;

    @OriginalMember(owner = "mapview!mapview", name = "zb", descriptor = "Lu;")
    private class38 field292 = this.field254 ? class31.field383 : class31.field383;

    @OriginalMember(owner = "mapview!mapview", name = "W", descriptor = "I")
    private int field263 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "ub", descriptor = "Lu;")
    private class38 field287 = this.field254 ? class9.field75 : class9.field75;

    @OriginalMember(owner = "mapview!mapview", name = "S", descriptor = "D")
    private double field259 = 4.0D;

    @OriginalMember(owner = "mapview!mapview", name = "Ab", descriptor = "I")
    private int field293 = 500;

    @OriginalMember(owner = "mapview!mapview", name = "kb", descriptor = "Z")
    private boolean field277 = false;

    @OriginalMember(owner = "mapview!mapview", name = "fb", descriptor = "Lu;")
    private class38 field272 = this.field254 ? class34.field439 : class34.field439;

    @OriginalMember(owner = "mapview!mapview", name = "tb", descriptor = "[I")
    private int[] field286 = new int[this.field293];

    @OriginalMember(owner = "mapview!mapview", name = "M", descriptor = "I")
    private int field253 = 5;

    @OriginalMember(owner = "mapview!mapview", name = "yb", descriptor = "I")
    private int field291 = 5;

    @OriginalMember(owner = "mapview!mapview", name = "Fb", descriptor = "I")
    private int field298 = this.field254 ? 83 : 70;

    @OriginalMember(owner = "mapview!mapview", name = "nb", descriptor = "Lu;")
    private class38 field280 = this.field254 ? class20.field199 : class20.field199;

    @OriginalMember(owner = "mapview!mapview", name = "Ib", descriptor = "I")
    private int field301 = 40;

    @OriginalMember(owner = "mapview!mapview", name = "Nb", descriptor = "Lu;")
    private class38 field306 = this.field254 ? class28.field348 : class28.field348;

    @OriginalMember(owner = "mapview!mapview", name = "Q", descriptor = "Lu;")
    private class38 field257 = this.field254 ? class23.field217 : class23.field217;

    @OriginalMember(owner = "mapview!mapview", name = "Jb", descriptor = "Lu;")
    private class38 field302 = this.field254 ? field317 : field317;

    @OriginalMember(owner = "mapview!mapview", name = "Eb", descriptor = "I")
    private int field297 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "H", descriptor = "I")
    private int field248 = 8943445;

    @OriginalMember(owner = "mapview!mapview", name = "vb", descriptor = "[I")
    private int[] field288 = new int[this.field293];

    @OriginalMember(owner = "mapview!mapview", name = "hb", descriptor = "I")
    private int field274 = 10027008;

    @OriginalMember(owner = "mapview!mapview", name = "Lb", descriptor = "I")
    private int field304 = 8912896;

    @OriginalMember(owner = "mapview!mapview", name = "V", descriptor = "I")
    private int field262 = 6706483;

    @OriginalMember(owner = "mapview!mapview", name = "z", descriptor = "I")
    private int field240 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "Qb", descriptor = "I")
    private int field309 = 140;

    @OriginalMember(owner = "mapview!mapview", name = "xb", descriptor = "Z")
    private boolean field290 = false;

    @OriginalMember(owner = "mapview!mapview", name = "t", descriptor = "I")
    private int field234 = this.field254 ? 252 : 111;

    @OriginalMember(owner = "mapview!mapview", name = "Rb", descriptor = "I")
    private int field310 = 50;

    @OriginalMember(owner = "mapview!mapview", name = "sb", descriptor = "I")
    private int field285 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "Pb", descriptor = "Lu;")
    private class38 field308 = this.field254 ? class9.field81 : class9.field81;

    @OriginalMember(owner = "mapview!mapview", name = "Hb", descriptor = "I")
    private int field300 = this.field310 + this.field252;

    @OriginalMember(owner = "mapview!mapview", name = "Xb", descriptor = "I")
    private int field316 = this.field254 ? 220 : 79;

    @OriginalMember(owner = "mapview!mapview", name = "Vb", descriptor = "Z")
    private boolean field314 = true;

    @OriginalMember(owner = "mapview!mapview", name = "x", descriptor = "I")
    private int field238 = 23;

    @OriginalMember(owner = "mapview!mapview", name = "J", descriptor = "Lu;")
    private class38 field250 = this.field254 ? class9.field79 : class9.field79;

    @OriginalMember(owner = "mapview!mapview", name = "db", descriptor = "I")
    private int field270 = 170;

    @OriginalMember(owner = "mapview!mapview", name = "O", descriptor = "Lu;")
    private class38 field255 = this.field254 ? class26.field323 : class22.field201;

    @OriginalMember(owner = "mapview!mapview", name = "Wb", descriptor = "I")
    private int field315 = 5;

    @OriginalMember(owner = "mapview!mapview", name = "U", descriptor = "[Lu;")
    private class38[] field261 = new class38[this.field293];

    @OriginalMember(owner = "mapview!mapview", name = "Mb", descriptor = "I")
    private int field305 = this.field254 ? 76 : 75;

    @OriginalMember(owner = "mapview!mapview", name = "Zb", descriptor = "I")
    private int field318 = 471;

    @OriginalMember(owner = "mapview!mapview", name = "ac", descriptor = "I")
    private int field319 = 11141120;

    @OriginalMember(owner = "mapview!mapview", name = "K", descriptor = "I")
    private int field251 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "wb", descriptor = "I")
    private int field289 = 0;

    @OriginalMember(owner = "mapview!mapview", name = "gb", descriptor = "[I")
    private int[] field273 = new int[this.field293];

    @OriginalMember(owner = "mapview!mapview", name = "cc", descriptor = "Lu;")
    private class38 field321 = this.field254 ? class8.field66 : class10.field98;

    @OriginalMember(owner = "mapview!mapview", name = "X", descriptor = "I")
    private int field264 = 450;

    @OriginalMember(owner = "mapview!mapview", name = "bc", descriptor = "Lu;")
    private class38 field320 = this.field254 ? class19.field183 : class19.field183;

    @OriginalMember(owner = "mapview!mapview", name = "y", descriptor = "Lu;")
    public static class38 field239 = class9.method45(-41, "Agility Training");

    @OriginalMember(owner = "mapview!mapview", name = "mb", descriptor = "Lu;")
    private static class38 field279 = class9.method45(-41, "75(U");

    @OriginalMember(owner = "mapview!mapview", name = "qb", descriptor = "Lu;")
    public static class38 field283 = class9.method45(-41, "Slayer Master");

    @OriginalMember(owner = "mapview!mapview", name = "Kb", descriptor = "Lu;")
    public static class38 field303 = class9.method45(-41, "null");

    @OriginalMember(owner = "mapview!mapview", name = "Tb", descriptor = "Z")
    private static boolean field312 = true;

    @OriginalMember(owner = "mapview!mapview", name = "Yb", descriptor = "Lu;")
    private static class38 field317 = class9.method45(-41, "Prev page");

    @OriginalMember(owner = "mapview!mapview", name = "r", descriptor = "I")
    private int field232;

    @OriginalMember(owner = "mapview!mapview", name = "C", descriptor = "I")
    private int field243;

    @OriginalMember(owner = "mapview!mapview", name = "G", descriptor = "I")
    private int field247;

    @OriginalMember(owner = "mapview!mapview", name = "R", descriptor = "I")
    private int field258;

    @OriginalMember(owner = "mapview!mapview", name = "eb", descriptor = "I")
    private int field271;

    @OriginalMember(owner = "mapview!mapview", name = "ib", descriptor = "I")
    private int field275;

    @OriginalMember(owner = "mapview!mapview", name = "Ob", descriptor = "I")
    private int field307;

    @OriginalMember(owner = "mapview!mapview", name = "Ub", descriptor = "I")
    private int field313;

    @OriginalMember(owner = "mapview!mapview", name = "dc", descriptor = "I")
    public static int field322;

    @OriginalMember(owner = "mapview!mapview", name = "u", descriptor = "Lh;")
    private class15 field235;

    @OriginalMember(owner = "mapview!mapview", name = "A", descriptor = "Lh;")
    private class15 field241;

    @OriginalMember(owner = "mapview!mapview", name = "D", descriptor = "Lh;")
    private class15 field244;

    @OriginalMember(owner = "mapview!mapview", name = "lb", descriptor = "Lh;")
    private class15 field278;

    @OriginalMember(owner = "mapview!mapview", name = "Bb", descriptor = "Lh;")
    private class15 field294;

    @OriginalMember(owner = "mapview!mapview", name = "Cb", descriptor = "Lh;")
    private class15 field295;

    @OriginalMember(owner = "mapview!mapview", name = "Gb", descriptor = "Lh;")
    private class15 field299;

    @OriginalMember(owner = "mapview!mapview", name = "Sb", descriptor = "Lh;")
    private class15 field311;

    @OriginalMember(owner = "mapview!mapview", name = "v", descriptor = "Loa;")
    private class29 field236;

    @OriginalMember(owner = "mapview!mapview", name = "Db", descriptor = "Lt;")
    private class37 field296;

    @OriginalMember(owner = "mapview!mapview", name = "ab", descriptor = "Lu;")
    private class38 field267;

    @OriginalMember(owner = "mapview!mapview", name = "pb", descriptor = "[Loa;")
    public static class29[] field282;

    @OriginalMember(owner = "mapview!mapview", name = "p", descriptor = "[Lu;")
    private class38[] field230;

    @OriginalMember(owner = "mapview!mapview", name = "bb", descriptor = "[Lu;")
    private class38[] field268;

    @OriginalMember(owner = "mapview!mapview", name = "I", descriptor = "[[B")
    public static byte[][] field249;

    @OriginalMember(owner = "mapview!mapview", name = "c", descriptor = "(Z)V", line = 10)
    private final void method123(boolean arg0) {
        class8.field64 = arg0;
        try {
            Graphics var2 = class31.field381.getGraphics();
            class23.field218.method66((byte) 16, var2, 0, 0);
        } catch (Exception var4) {
            class31.field381.repaint();
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "e", descriptor = "(I)V", line = 27)
    public final void method124(int arg0) {
        if (arg0 != 5592405) {
            this.field230 = null;
        }
        class38.method240(true);
        class40.method252((byte) -115);
        try {
            this.field236 = null;
            this.field268 = null;
            class19.field178 = null;
            this.field288 = null;
            this.field286 = null;
            this.field273 = null;
            this.field296 = null;
            this.field261 = null;
            System.gc();
        } catch (Throwable var3) {
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "f", descriptor = "(I)V", line = 58)
    private final void method125(int arg0) {
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
        if (arg0 >= -29) {
            this.field233 = null;
        }
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "d:/windows/", "d:/winnt/", "e:/windows/", "e:/winnt/", "f:/windows/", "f:/winnt/", "c:/", var3, "/tmp/", "" };
        String var6 = ".jagex_cache_32";
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
                        class10.field92 = var8 + var6 + "/rsmap/";
                        return;
                    }
                }
            } catch (Exception var14) {
            }
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "d", descriptor = "(I)V", line = 132)
    public final void method126(int arg0) {
        class30.method175((byte) 14);
        class22.method101(0, class31.field381);
        class18.method88(class31.field381, 1);
        class33.field436 = this.field308;
        boolean var2 = false;
        if (arg0 != 11) {
            this.field259 = 0.8724001992359389D;
        }
        boolean var3 = true;
        this.field268 = class38.method224(arg0 - 11);
        this.field230 = class1.method4((byte) -88);
        if (var3) {
            byte var4 = 0;
            if (this.field230.length == 14) {
                byte var10002 = var4;
                int var5 = var4 + 1;
                this.field321 = this.field230[var10002];
                int var19 = var5;
                int var6 = var5 + 1;
                this.field233 = this.field230[var19];
                int var20 = var6;
                int var7 = var6 + 1;
                this.field255 = this.field230[var20];
                int var21 = var7;
                int var8 = var7 + 1;
                this.field302 = this.field230[var21];
                int var22 = var8;
                int var9 = var8 + 1;
                this.field287 = this.field230[var22];
                int var23 = var9;
                int var10 = var9 + 1;
                this.field308 = this.field230[var23];
                int var24 = var10;
                int var11 = var10 + 1;
                this.field292 = this.field230[var24];
                int var25 = var11;
                int var12 = var11 + 1;
                this.field280 = this.field230[var25];
                int var26 = var12;
                int var13 = var12 + 1;
                this.field306 = this.field230[var26];
                int var27 = var13;
                int var14 = var13 + 1;
                this.field320 = this.field230[var27];
                int var28 = var14;
                int var15 = var14 + 1;
                this.field257 = this.field230[var28];
                int var29 = var15;
                int var16 = var15 + 1;
                this.field250 = this.field230[var29];
                int var17 = var16 + 1;
                int var30 = var17;
                int var18 = var17 + 1;
                this.field272 = this.field230[var30];
                this.field316 = this.field321.method238(0, arg0 - 109);
                this.field298 = this.field233.method238(0, -115);
                this.field305 = this.field255.method238(0, -118);
                this.field234 = this.method136(true, this.field316);
                this.field269 = this.method136(true, this.field298);
                this.field237 = this.method136(true, this.field305);
            } else {
                class18.method87(new class38[] { class8.field63 }, arg0 ^ 0xB);
            }
        }
        this.field267 = class28.method164(-25600, 50);
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(BLjava/lang/String;)[B", line = 193)
    private final byte[] method127(byte arg0, String arg1) throws IOException {
        File var3 = new File(arg1);
        if (!var3.exists()) {
            return null;
        }
        if (arg0 <= 70) {
            this.method137(123);
        }
        int var4 = (int) var3.length();
        DataInputStream var5 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg1)));
        byte[] var6 = new byte[var4];
        var5.readFully(var6, 0, var4);
        var5.close();
        return var6;
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(I[B)Lt;", line = 218)
    public static final class37 method128(int arg0, byte[] arg1) {
        if (arg1 == null) {
            return null;
        } else if (arg0 == -27742) {
            class37 var2 = new class37(arg1, class9.field78, class26.field326, class11.field112, class26.field333, class11.field109, field249);
            class22.method102(false);
            return var2;
        } else {
            return (class37) null;
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(IIIIIIIZI)V", line = 236)
    private final void method129(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8) {
        if (!arg7) {
            return;
        }
        class19.field178.method41(arg2, arg0, -17556, arg6, arg8, arg4, arg1, arg5, arg3);
        if (arg6 - arg0 > -arg1 + arg2) {
            return;
        }
        class19.field178.method49(arg1, arg5, this.field259, arg2, arg3, arg8, arg6, 0, arg4, arg0);
        class19.field178.method42(arg3, 255, arg2, arg1, arg4, arg5, arg6, arg0, arg8);
        class19.field178.method43(arg0, arg1, this.field289, arg2, arg5, (byte) 118, arg8, arg4, arg6, this.field260, arg3);
        if (this.field284 == this.field259 && field312) {
            for (int var10 = 0; var10 < this.field297; var10++) {
                int var11 = this.field288[var10];
                int var12 = var11 - class11.field111;
                int var13 = this.field286[var10];
                int var14 = this.field273[var10];
                int var15 = class30.field363 + class11.field114 - var13;
                int var16 = arg4 + (arg3 - arg4) * (-arg8 + var15) / (arg5 - arg8);
                int var17 = 16777215;
                int var18 = arg1 + (var12 - arg0) * (arg2 - arg1) / (arg6 - arg0);
                class15 var19 = null;
                if (var14 == 0) {
                    if (this.field259 == 3.0D) {
                        var19 = this.field235;
                    }
                    if (this.field259 == 4.0D) {
                        var19 = this.field295;
                    }
                    if (this.field259 == 6.0D) {
                        var19 = this.field299;
                    }
                    if (this.field259 == 8.0D) {
                        var19 = this.field241;
                    }
                }
                if (var14 == 1) {
                    if (this.field259 == 3.0D) {
                        var19 = this.field299;
                    }
                    if (this.field259 == 4.0D) {
                        var19 = this.field241;
                    }
                    if (this.field259 == 6.0D) {
                        var19 = this.field244;
                    }
                    if (this.field259 == 8.0D) {
                        var19 = this.field294;
                    }
                }
                if (var14 == 2) {
                    var17 = 16755200;
                    if (this.field259 == 3.0D) {
                        var19 = this.field244;
                    }
                    if (this.field259 == 4.0D) {
                        var19 = this.field294;
                    }
                    if (this.field259 == 6.0D) {
                        var19 = this.field278;
                    }
                    if (this.field259 == 8.0D) {
                        var19 = this.field311;
                    }
                }
                if (var19 != null) {
                    class38 var20 = this.field261[var10];
                    int var21 = 1;
                    for (int var22 = 0; var20.method239(-6588) > var22; var22++) {
                        if (var20.method238(var22, -112) == 47) {
                            var21++;
                        }
                    }
                    int var23 = var16 - var19.method78() * (var21 - 1) / 2;
                    int var24 = var23 + var19.method76() / 2;
                    while (true) {
                        int var25 = var20.method226(47, (byte) -31);
                        if (var25 == -1) {
                            var19.method85(var20, var18, var24, var17, true);
                            break;
                        }
                        class38 var26 = var20.method217(0, var25, (byte) -43);
                        var19.method85(var26, var18, var24, var17, true);
                        var24 += var19.method78();
                        var20 = var20.method241(0, var25 + 1);
                    }
                }
            }
        }
        if (!class20.field188) {
            return;
        }
        for (int var27 = class11.field111 / 64; var27 < (class16.field154 + class11.field111) / 64; var27++) {
            for (int var28 = class30.field363 / 64; var28 < (class30.field363 + class11.field114) / 64; var28++) {
                int var29 = var27 * 64;
                int var30 = var29 - class11.field111;
                int var31 = var28 * 64;
                int var32 = (var30 - arg0) * (-arg1 + arg2) / (arg6 - arg0) + arg1;
                int var33 = class30.field363 + class11.field114 - var31;
                int var34 = (var33 - arg8 - 64) * (-arg4 + arg3) / (arg5 - arg8) + arg4;
                int var35 = (var30 + 64 - arg0) * (-arg1 + arg2) / (arg6 - arg0) + arg1;
                int var36 = (var33 - arg8) * (-arg4 + arg3) / (arg5 - arg8) + arg4;
                class27.method155(var32, var34, var35 - var32, -var34 + var36, 16777215);
                this.field296.method215(class9.method47(new class38[] { class13.method68(10, var27), class30.field368, class13.method68(10, var28) }, -109), var35 - 5, var36 - 5, 16777215, -1);
                if (var27 == 33 && var28 >= 71 && var28 <= 73) {
                    this.field296.method207(class12.field115, (var32 + var35) / 2, (var34 + var36) / 2, 16711680, -1);
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "g", descriptor = "(I)Z", line = 427)
    private final boolean method130(int arg0) {
        if (class2.field10 == 0) {
            this.method125(-30);
            class2.field10 = 1;
        }
        if (class2.field10 == 1) {
            class30.field374 = 15;
            boolean var2 = this.method133(this.field320, 31, "main_file_cache.idx0");
            if (!var2) {
                return false;
            }
            class33.field432 = class14.field136;
            class14.field136 = null;
            if (class33.field432 == null) {
                throw new RuntimeException("T1");
            }
            class2.field10 = 2;
        }
        if (class2.field10 == 2) {
            class30.field374 = 30;
            boolean var3 = this.method133(this.field257, 31, "main_file_cache.idx1");
            if (!var3) {
                return false;
            }
            class30.field361 = class14.field136;
            class14.field136 = null;
            if (class30.field361 == null) {
                throw new RuntimeException("T2");
            }
            class2.field10 = 3;
        }
        if (class2.field10 == 3) {
            class32.field385 = new class13[1];
            class2.field10 = 10;
        }
        if (arg0 >= -4) {
            this.field319 = 76;
        }
        if (class2.field10 == 10) {
            class30.field374 = 50;
            boolean var4 = this.method133(this.field250, 31, "main_file_cache.dat0");
            if (!var4) {
                return false;
            }
            class32.field385[0] = class14.field136;
            class14.field136 = null;
            if (class32.field385[0] == null) {
                throw new RuntimeException("T3");
            }
            class2.field10 = 20;
        }
        if (class2.field10 != 20) {
            return false;
        }
        class41.field526 = class33.method183(class13.field129, 87, class33.field432, class18.field167);
        field282 = class8.method35(class33.field432, 1, class10.field97, class13.field129);
        this.field296 = class23.method110(class10.field95, class33.field432, class30.field361, class13.field129, (byte) 33);
        this.field235 = new class15(11, true, this);
        this.field295 = new class15(12, true, this);
        this.field299 = new class15(14, true, this);
        this.field241 = new class15(17, true, this);
        this.field244 = new class15(19, true, this);
        this.field294 = new class15(22, true, this);
        this.field278 = new class15(26, true, this);
        this.field311 = new class15(30, true, this);
        class30.field374 = 100;
        class33.field436 = this.field292;
        class8.method34(null, true, class33.field436, class30.field374);
        this.field301 = this.field296.method206(this.field233) + 20;
        this.method135((byte) -102);
        class38[] var5 = this.field268;
        for (int var6 = 0; var6 < var5.length; var6++) {
            class38 var7 = var5[var6];
            int var8 = this.field296.method206(var7);
            if (this.field258 < var8) {
                this.field258 = var8;
            }
        }
        this.field309 = this.field258 + 18 + 16;
        if (this.field309 > 140) {
            int var9 = this.field271 - this.field309 - this.field253;
            this.field252 = var9 / 25;
            this.field310 = this.field252 * 5;
            this.field300 = this.field310 + this.field252;
            int var10 = var9 - this.field252 * 25;
            this.field270 = var10 / 2 + this.field253 + this.field309 + this.field252;
        }
        return true;
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(Ljava/lang/String;Z[B)Z", line = 567)
    private final boolean method131(String arg0, boolean arg1, byte[] arg2) {
        if (arg2 == null) {
            return false;
        }
        try {
            MessageDigest var4 = MessageDigest.getInstance("SHA");
            var4.reset();
            var4.update(arg2);
            if (arg1) {
                this.field262 = 94;
            }
            byte[] var5 = var4.digest();
            if (arg0 == "main_file_cache.dat0") {
                if (var5[0] != -116 || var5[1] != 0 || var5[2] != -46 || var5[3] != 96 || var5[4] != 91 || var5[5] != -103 || var5[6] != -28 || var5[7] != -92 || var5[8] != 46 || var5[9] != 24 || var5[10] != 35 || var5[11] != -32 || var5[12] != 93 || var5[13] != 73 || var5[14] != -102 || var5[15] != 63 || var5[16] != 126 || var5[17] != 121 || var5[18] != 41 || var5[19] != 58) {
                    return false;
                }
            } else if (arg0 == "main_file_cache.idx1") {
                if (var5[0] != 52 || var5[1] != 126 || var5[2] != -117 || var5[3] != -96 || var5[4] != 55 || var5[5] != 19 || var5[6] != -40 || var5[7] != 125 || var5[8] != 49 || var5[9] != -77 || var5[10] != 77 || var5[11] != -79 || var5[12] != -93 || var5[13] != -47 || var5[14] != -110 || var5[15] != -122 || var5[16] != 84 || var5[17] != -103 || var5[18] != -78 || var5[19] != 126) {
                    return false;
                }
            } else if (var5[0] != -8 || var5[1] != 56 || var5[2] != -76 || var5[3] != 74 || var5[4] != -75 || var5[5] != -72 || var5[6] != 10 || var5[7] != -25 || var5[8] != -122 || var5[9] != -23 || var5[10] != 95 || var5[11] != -2 || var5[12] != -86 || var5[13] != -69 || var5[14] != -102 || var5[15] != 66 || var5[16] != 4 || var5[17] != 107 || var5[18] != -59 || var5[19] != -123) {
                return false;
            }
            return true;
        } catch (Exception var7) {
            this.method173("sha", (byte) 26);
            return false;
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "init", descriptor = "()V", line = 632)
    public final void init() {
        if (this.method176((byte) -54)) {
            this.method170(-28, 503, 32, Integer.parseInt(this.getParameter("codeversion")), 635);
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "f", descriptor = "(B)V", line = 645)
    public static void method132(byte arg0) {
        field249 = null;
        field283 = null;
        field239 = null;
        if (arg0 > -107) {
            method132((byte) 97);
        }
        field279 = null;
        field282 = null;
        field317 = null;
        field303 = null;
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(Lu;ILjava/lang/String;)Z", line = 666)
    private final boolean method133(class38 arg0, int arg1, String arg2) {
        byte[] var4 = null;
        if (!class10.field91) {
            if (class10.field92 != null) {
                try {
                    var4 = this.method127((byte) 111, class10.field92 + "/" + arg2);
                    if (!this.method131(arg2, false, var4)) {
                        var4 = null;
                    }
                    if (var4 != null) {
                        class14.field136 = new class13(var4, false, true);
                        return true;
                    }
                } catch (IOException var11) {
                    var4 = null;
                }
            }
            class10.field91 = true;
        }
        if (var4 == null) {
            boolean var6 = this.method141(arg0, arg2, 5655);
            if (!var6) {
                return false;
            }
            var4 = class30.field370;
            class30.field370 = null;
        }
        if (var4 == null) {
            class10.field91 = false;
            return true;
        }
        if (class10.field92 != null && var4 != null) {
            try {
                this.method138(var4, 0, class10.field92 + "/" + arg2);
            } catch (IOException var10) {
            }
        }
        try {
            if (arg1 == 31) {
                class14.field136 = new class13(var4, false, true);
                class10.field91 = false;
                return true;
            } else {
                return true;
            }
        } catch (IOException var9) {
            throw class40.method251(var9, "monkey feet");
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(II)I", line = 748)
    private final int method134(int arg0, int arg1) {
        if (arg1 >= -120) {
            this.method142((byte) -25);
        }
        arg0++;
        if (class32.field385.length <= arg0) {
            arg0 = 0;
        }
        return arg0;
    }

    @OriginalMember(owner = "mapview!mapview", name = "g", descriptor = "(B)V", line = 766)
    private final void method135(byte arg0) {
        if (class32.field385.length == 1) {
            class40.field502 = 0;
        } else {
            if (class26.field331 >= 0) {
                class40.field502 = class26.field331;
            } else {
                class40.field502 = this.method134(class40.field502, -128);
            }
            class26.field331 = this.method134(class40.field502, -122);
        }
        this.method140(-18, class40.field502);
        if (arg0 != -102) {
            this.method123(false);
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(ZI)I", line = 793)
    private final int method136(boolean arg0, int arg1) {
        if (!arg0) {
            this.method131(null, true, null);
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
            return class26.method146(arg1, (byte) 66);
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(I)V", line = 853)
    public final void method137(int arg0) {
        method132((byte) -122);
        class40.method255(-11861);
        class38.method234((byte) 61);
        class16.method86(-121);
        class18.method89(-81);
        class33.method195(-123);
        class30.method174((byte) 89);
        class34.method196(0);
        class12.method62((byte) 34);
        class13.method69(0);
        class9.method50(106);
        class15.method77();
        class19.method95((byte) 117);
        class39.method249(-1);
        class41.method259(-12130);
        class22.method103((byte) -127);
        class25.method120((byte) 67);
        class27.method151();
        class35.method199((byte) -86);
        class31.method179(arg0 ^ arg0);
        class2.method5(126);
        class5.method14((byte) -46);
        class36.method203();
        class23.method107(0);
        class14.method75((byte) 101);
        class8.method31(arg0 - 12785);
        class1.method1((byte) -128);
        class20.method96(-27546);
        class11.method61(22630);
        class26.method147(0);
        class28.method162((byte) 106);
        class10.method58((byte) 44);
        class24.method115();
        class32.method180((byte) -119);
        this.field255 = null;
        this.field286 = null;
        this.field292 = null;
        this.field288 = null;
        this.field299 = null;
        this.field278 = null;
        this.field321 = null;
        this.field257 = null;
        this.field272 = null;
        this.field261 = null;
        this.field230 = null;
        this.field233 = null;
        this.field294 = null;
        this.field311 = null;
        this.field280 = null;
        this.field268 = null;
        this.field296 = null;
        this.field308 = null;
        this.field236 = null;
        this.field295 = null;
        this.field244 = null;
        this.field250 = null;
        this.field287 = null;
        this.field320 = null;
        this.field302 = null;
        this.field241 = null;
        this.field235 = null;
        this.field273 = null;
        this.field306 = null;
        this.field267 = null;
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "([BILjava/lang/String;)V", line = 938)
    private final void method138(byte[] arg0, int arg1, String arg2) throws IOException {
        FileOutputStream var4 = new FileOutputStream(arg2);
        var4.write(arg0, arg1, arg0.length);
        var4.close();
    }

    @OriginalMember(owner = "mapview!mapview", name = "b", descriptor = "(I[B)[B", line = 948)
    public static final byte[] method139(int arg0, byte[] arg1) {
        int var2 = arg1.length;
        byte[] var3 = new byte[var2];
        class21.method99(arg1, 0, var3, arg0, var2);
        return var3;
    }

    @OriginalMember(owner = "mapview!mapview", name = "b", descriptor = "(II)V", line = 1037)
    private final void method140(int arg0, int arg1) {
        if (arg0 != -18) {
            this.method143((byte) -41, -13);
        }
        if (class32.field385.length <= arg1) {
            return;
        }
        class13 var3 = class32.field385[arg1];
        class33 var4 = new class33(var3.method265((byte) 83, class40.field505, class19.field175));
        var4.method192(-87);
        class33 var5 = new class33(var3.method265((byte) 83, class40.field505, class20.field192));
        this.field297 = var5.method186(-253);
        for (int var6 = 0; var6 < this.field297; var6++) {
            this.field261[var6] = var5.method192(47);
            this.field288[var6] = var5.method186(class20.method98(arg0, 237));
            this.field286[var6] = var5.method186(-253);
            this.field273[var6] = var5.method188((byte) -121);
            class38 var7 = this.field261[var6].method231(32, 118, 47);
            int var8 = this.field296.method206(var7);
            if (this.field247 < var8) {
                this.field247 = var8;
            }
            int var9 = this.field296.method206(this.field280);
            if (this.field247 < var9) {
                this.field247 = var9;
            }
        }
        class19.field178 = new class9();
        class19.field178.method48((byte) 74, class32.field385[arg1]);
        this.field275 = 180;
        class38.field486 = class18.field172;
        this.field232 = class16.field154 * this.field275 / class11.field114;
        class33.field430 = class5.field34;
        this.field271 = 635 - this.field232 - 5;
        this.field243 = 503 - this.field275 - 20;
        this.field236 = new class29(this.field232, this.field275);
        this.field236.method165();
        this.method129(0, 0, this.field232, this.field275, 0, class11.field114, class16.field154, true, 0);
        class27.method155(0, 0, this.field232, this.field275, 0);
        class27.method155(1, 1, this.field232 - 2, this.field275 + -2, this.field248);
        class23.field218.method65(true);
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(Lu;Ljava/lang/String;I)Z", line = 1165)
    private final boolean method141(class38 arg0, String arg1, int arg2) {
        try {
            if (class5.field28 == null) {
                class33.field436 = class9.method47(new class38[] { this.field306, class9.field76, arg0 }, -111);
                String var4;
                if (arg1 == "main_file_cache.dat0") {
                    var4 = "worldmap.main.js5?crc=408548542";
                } else if (arg1 == "main_file_cache.dat1") {
                    var4 = "worldmap.dungeon.js5?crc=-421550017";
                } else if (arg1 == "main_file_cache.dat2") {
                    var4 = "worldmap.extra.js5?crc=-1975674379";
                } else if (arg1 == "main_file_cache.idx1") {
                    var4 = "mapview.fontmetrics.js5?crc=-447025815";
                } else {
                    var4 = "mapview.sprites.js5?crc=-1090194619";
                }
                class5.field28 = new DataInputStream((new URL(this.getCodeBase(), var4)).openStream());
                int var5;
                if (arg1 == "main_file_cache.dat0") {
                    var5 = 417104;
                } else if (arg1 == "main_file_cache.dat1") {
                    var5 = 154431;
                } else if (arg1 == "main_file_cache.dat2") {
                    var5 = 134889;
                } else if (arg1 == "main_file_cache.idx1") {
                    var5 = 165;
                } else {
                    var5 = 8223;
                }
                class33.field425 = 0;
                class38.field485 = 0;
                class30.field370 = new byte[var5];
            }
            if (arg2 != 5655) {
                this.field233 = null;
            }
            int var6 = class38.field485;
            int var7 = class30.field370.length;
            if (var7 <= var6) {
                class5.field28.close();
                class5.field28 = null;
                if (!this.method131(arg1, false, class30.field370)) {
                    this.method173("download", (byte) 26);
                    class30.field370 = null;
                }
                return true;
            }
            class33.field425++;
            if (class33.field425 >= 1500) {
                throw new IOException();
            }
            DataInputStream var8 = class5.field28;
            int var9 = var8.available();
            if (var9 < 0) {
                throw new EOFException();
            } else if (var9 == 0) {
                return false;
            } else {
                if (var9 > var7 - var6) {
                    var9 = var7 - var6;
                }
                int var10 = var8.read(class30.field370, var6, var9);
                if (var10 < 0) {
                    throw new EOFException();
                } else if (var10 == 0) {
                    return false;
                } else {
                    class33.field425 = 0;
                    int var11 = var6 + var10;
                    int var12 = var11 * 100 / var7;
                    class33.field436 = class9.method47(new class38[] { this.field272, class9.field76, arg0, class40.field500, class13.method68(arg2 - 5645, var12), class16.field155 }, -106);
                    class38.field485 = var11;
                    return false;
                }
            }
        } catch (IOException var16) {
            try {
                class5.field28.close();
            } catch (Exception var15) {
            }
            class5.field28 = null;
            class30.field370 = null;
            this.method173(new String("download"), (byte) 26);
            return true;
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "d", descriptor = "(B)V", line = 1291)
    public final void method142(byte arg0) {
        if (!class2.field12) {
            class2.field12 = this.method130(-112);
            class8.method34(null, true, class33.field436, class30.field374);
            return;
        }
        if (arg0 != 97) {
            this.method145(0);
        }
        if (this.field314) {
            class8.field64 = true;
            this.field314 = false;
            class27.method158();
            int var2 = class38.field486 - (int) (635.0D / this.field259);
            int var3 = (int) (635.0D / this.field259) + class38.field486;
            int var4 = class33.field430 + (int) (503.0D / this.field259);
            int var5 = class33.field430 - (int) (503.0D / this.field259);
            this.method129(var2, 0, 635, 503, 0, var4, var3, true, var5);
            if (this.field290) {
                this.field236.method169(this.field271, this.field243);
                class27.method160(this.field232 * var2 / class16.field154 + this.field271, this.field275 * var5 / class11.field114 + this.field243, (var3 - var2) * this.field232 / class16.field154, (var4 - var5) * this.field275 / class11.field114, 16711680, 128);
                class27.method155(this.field232 * var2 / class16.field154 + this.field271, this.field275 * var5 / class11.field114 + this.field243, (var3 - var2) * this.field232 / class16.field154, (var4 - var5) * this.field275 / class11.field114, 16711680);
                if (this.field289 > 0 && this.field289 % 10 < 5) {
                    for (int var6 = 0; var6 < class31.field380; var6++) {
                        if (class19.field178.field86[var6] == this.field260) {
                            int var7 = class19.field178.field77[var6] * this.field232 / class16.field154 + this.field271;
                            int var8 = class19.field178.field73[var6] * this.field275 / class11.field114 + this.field243;
                            class27.method159(var7, var8, 2, 16776960, 256);
                        }
                    }
                }
            }
            if (this.field277) {
                this.method144(5592405, 18, 7829367, this.field281, this.field309, 10066329, this.field302, (byte) -58, this.field253);
                this.method144(5592405, this.field264 - 36, 7829367, this.field281 + 18, this.field309, 10066329, class13.field129, (byte) -63, this.field253);
                this.method144(5592405, 18, 7829367, this.field281 + this.field264 - 18, this.field309, 10066329, this.field287, (byte) -70, this.field253);
                int var9 = this.field281 + 3 + 18;
                int var10 = this.field240;
                for (int var11 = 0; var11 < 24; var11++) {
                    if (field282.length > var10 && this.field268.length > var10) {
                        if (this.field268[var10].method227(121, class20.field191)) {
                            var10++;
                            var11--;
                            continue;
                        }
                        field282[var10].method167(this.field253 + 3, var9);
                        this.field296.method211(this.field268[var10], this.field253 + 21, var9 + 14, 0, -1);
                        int var12 = 16777215;
                        if (this.field266 == var10) {
                            var12 = 12298922;
                        }
                        if (this.field289 > 0 && this.field289 % 10 < 5 && this.field260 == var10) {
                            var12 = 16776960;
                        }
                        this.field296.method211(this.field268[var10], this.field253 + 20, var9 - -13, var12, -1);
                    }
                    var9 += 17;
                    var10++;
                }
            }
            if (class32.field385.length == 1) {
                this.method144(this.field262, 18, this.field276, this.field275 + this.field243, this.field232, this.field248, this.field321, (byte) -64, this.field271);
                this.method144(this.field262, 18, this.field276, this.field281 + this.field264, this.field309, this.field248, this.field255, (byte) -50, this.field253);
                if (this.field284 == 3.0D) {
                    this.method144(this.field304, this.field246, this.field274, this.field318, this.field310, this.field319, class35.field446, (byte) -86, this.field270);
                } else {
                    this.method144(this.field262, this.field246, this.field276, this.field318, this.field310, this.field248, class35.field446, (byte) -89, this.field270);
                }
                if (this.field284 == 4.0D) {
                    this.method144(this.field304, this.field246, this.field274, this.field318, this.field310, this.field319, class16.field151, (byte) -85, this.field300 + this.field270);
                } else {
                    this.method144(this.field262, this.field246, this.field276, this.field318, this.field310, this.field248, class16.field151, (byte) -110, this.field300 + this.field270);
                }
                if (this.field284 == 6.0D) {
                    this.method144(this.field304, this.field246, this.field274, this.field318, this.field310, this.field319, field279, (byte) -79, this.field300 * 2 + this.field270);
                } else {
                    this.method144(this.field262, this.field246, this.field276, this.field318, this.field310, this.field248, field279, (byte) -113, this.field300 * 2 + this.field270);
                }
                if (this.field284 == 8.0D) {
                    this.method144(this.field304, this.field246, this.field274, this.field318, this.field310, this.field319, class5.field32, (byte) -54, this.field270 + this.field300 * 3);
                } else {
                    this.method144(this.field262, this.field246, this.field276, this.field318, this.field310, this.field248, class5.field32, (byte) -115, this.field270 + this.field300 * 3);
                }
            } else {
                this.method144(this.field262, 18, this.field276, this.field243 + this.field275, this.field232, this.field248, this.field321, (byte) -82, this.field271);
                this.method144(this.field262, 18, this.field276, this.field281 + this.field264, this.field309, this.field248, this.field255, (byte) -115, this.field253);
                this.method143((byte) -110, this.field276);
                int var13 = this.field318 + this.field231;
                if (this.field284 == 3.0D) {
                    this.method144(this.field304, this.field246, this.field274, var13, this.field310, this.field319, class35.field446, (byte) -82, this.field270);
                } else {
                    this.method144(this.field262, this.field246, this.field276, var13, this.field310, this.field248, class35.field446, (byte) -76, this.field270);
                }
                if (this.field284 == 4.0D) {
                    this.method144(this.field304, this.field246, this.field274, var13, this.field310, this.field319, class16.field151, (byte) -124, this.field300 + this.field270);
                } else {
                    this.method144(this.field262, this.field246, this.field276, var13, this.field310, this.field248, class16.field151, (byte) -127, this.field300 + this.field270);
                }
                if (this.field284 == 6.0D) {
                    this.method144(this.field304, this.field246, this.field274, var13, this.field310, this.field319, field279, (byte) -72, this.field270 + this.field300 * 2);
                } else {
                    this.method144(this.field262, this.field246, this.field276, var13, this.field310, this.field248, field279, (byte) -126, this.field300 * 2 + this.field270);
                }
                if (this.field284 == 8.0D) {
                    this.method144(this.field304, this.field246, this.field274, var13, this.field310, this.field319, class5.field32, (byte) -115, this.field300 * 3 + this.field270);
                } else {
                    this.method144(this.field262, this.field246, this.field276, var13, this.field310, this.field248, class5.field32, (byte) -73, this.field300 * 3 + this.field270);
                }
            }
            if (class35.field447) {
                this.method144(this.field262, this.field238, this.field276, this.field315, this.field301, this.field248, this.field233, (byte) -63, this.field291);
                if (class40.field504) {
                    class27.method160(this.field301 + this.field291 + 2, this.field315, this.field247 + 10, this.field238, 8925952, 192);
                    class27.method155(this.field301 + this.field291 + 2, this.field315, this.field247 + 10, this.field238, 16777215);
                    if (class20.field195 > -1 && this.field267.method239(-6588) > 0) {
                        class38 var14 = this.field261[class20.field195].method231(32, 54, 47);
                        int var15 = this.field267.method239(-6588);
                        if (var15 > var14.method239(-6588)) {
                            var15 = var14.method239(arg0 - 6685);
                        }
                        this.field296.method211(var14, this.field291 + this.field301 + 6, 20, 10066176, 0);
                        this.field296.method211(var14.method217(0, var15, (byte) -122), this.field291 + this.field301 + 6, 20, 16777215, 0);
                    } else {
                        this.field296.method211(this.field280, this.field291 + this.field301 + 6, 20, 16776960, 0);
                    }
                }
            }
        }
        if (class8.field64) {
            this.method123(false);
        }
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(BI)V", line = 1525)
    private final void method143(byte arg0, int arg1) {
        if (arg0 > -12) {
            this.method136(true, 20);
        }
        this.method144(this.field262, 18, arg1, 483, 230, this.field248, class9.method47(new class38[] { class20.field196, class32.field423[class26.field331], class5.field30 }, -103), (byte) -114, 170);
    }

    @OriginalMember(owner = "mapview!mapview", name = "a", descriptor = "(IIIIIILu;BI)V", line = 1580)
    private final void method144(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class38 arg6, byte arg7, int arg8) {
        class27.method155(arg8, arg3, arg4, arg1, 0);
        int var11 = arg3 + 1;
        int var10 = arg1 - 2;
        int var13 = arg8 + 1;
        int var12 = arg4 - 2;
        class27.method153(var13, var11, var12, var10, arg2);
        class27.method157(var13, var11, var12, arg5);
        class27.method152(var13, var11, var10, arg5);
        if (arg7 > -42) {
            field317 = null;
        }
        class27.method157(var13, var10 + var11 - 1, var12, arg0);
        class27.method152(var12 + var13 - 1, var11, var10, arg0);
        this.field296.method207(arg6, var12 / 2 + var13 + 1, var11 + 1 - (-(var10 / 2) + -4), 0, -1);
        this.field296.method207(arg6, var12 / 2 + var13, var11 - -(var10 / 2) + 4, 16777215, -1);
    }

    @OriginalMember(owner = "mapview!mapview", name = "b", descriptor = "(I)V", line = 1625)
    public final void method145(int arg0) {
        if (class30.field366) {
            class23.method109(1000, class31.field381);
            class5.method15((byte) -92, class31.field381);
            this.method178(-89);
            class22.method101(0, class31.field381);
            class18.method88(class31.field381, 1);
        }
        class12.method67(-93);
        class23.method104((byte) 5);
        if (!class2.field12) {
            return;
        }
        if (class33.field433[96]) {
            class20.field190 = -1;
            class38.field486 = (int) ((double) class38.field486 - 16.0D / this.field259);
            this.field314 = true;
        }
        if (class33.field433[97]) {
            this.field314 = true;
            class38.field486 = (int) (16.0D / this.field259 + (double) class38.field486);
            class20.field190 = -1;
        }
        if (class33.field433[98]) {
            class20.field190 = -1;
            this.field314 = true;
            class33.field430 = (int) ((double) class33.field430 - 16.0D / this.field259);
        }
        if (class33.field433[99]) {
            this.field314 = true;
            class33.field430 = (int) (16.0D / this.field259 + (double) class33.field430);
            class20.field190 = -1;
        }
        while (true) {
            while (true) {
                while (class34.method198((byte) -119)) {
                    if (!class35.field447 || !class40.field504) {
                        if (class18.field163 == this.field269 || class18.field163 == this.field298) {
                            this.field314 = true;
                            class40.field504 = true;
                        }
                        if (class18.field163 == 49) {
                            this.field314 = true;
                            this.field284 = 3.0D;
                        }
                        if (class18.field163 == 50) {
                            this.field314 = true;
                            this.field284 = 4.0D;
                        }
                        if (class18.field163 == 51) {
                            this.field314 = true;
                            this.field284 = 6.0D;
                        }
                        if (class18.field163 == 52) {
                            this.field314 = true;
                            this.field284 = 8.0D;
                        }
                        if (class18.field163 == this.field237 || class18.field163 == this.field305) {
                            this.field277 = !this.field277;
                            this.field314 = true;
                        }
                        if (class18.field163 == this.field234 || class18.field163 == this.field316) {
                            this.field290 = !this.field290;
                            this.field314 = true;
                        }
                    } else if (class20.field197 == 0) {
                        class40.field504 = false;
                        this.field314 = true;
                        this.field267.method236(0, 46);
                        class20.field195 = -1;
                    } else if (class20.field197 == 84) {
                        this.field307 = class33.field430 << 16;
                        class40.field504 = false;
                        class20.field190 = class20.field195;
                        this.field313 = class38.field486 << 16;
                        this.field267.method236(0, 109);
                        this.field314 = true;
                        class20.field195 = -1;
                    } else {
                        boolean var2 = false;
                        if (class20.field197 == 85) {
                            if (this.field267.method239(-6588) > 0) {
                                this.field267.method236(this.field267.method239(-6588) - 1, 80);
                                this.field314 = true;
                                if (this.field267.method239(-6588) == 0) {
                                    class20.field195 = -1;
                                } else {
                                    var2 = true;
                                }
                            }
                        } else if (class18.field163 != -1 && this.field267.method239(-6588) <= class18.field162) {
                            this.field267.method230((byte) -93, class18.field163);
                            this.field314 = true;
                        }
                        if (this.field267.method239(-6588) > 0) {
                            for (int var3 = 0; var3 < this.field297; var3++) {
                                if (this.field261[var3].method239(-6588) >= this.field267.method239(-6588)) {
                                    class38 var4 = this.field267.method233((byte) 44);
                                    class38 var5 = this.field261[var3].method231(32, 43, 47).method217(0, this.field267.method239(-6588), (byte) -98).method233((byte) 44);
                                    if (var4.method223(var5, -77) == 0) {
                                        class20.field195 = var3;
                                        var2 = true;
                                        this.field314 = true;
                                        break;
                                    }
                                }
                            }
                            if (!var2) {
                                this.field267.method236(this.field267.method239(-6588) - 1, 74);
                            }
                        }
                    }
                }
                int var6 = class5.field31;
                int var7 = class41.field525;
                if (arg0 > -25) {
                    this.method131(null, true, null);
                }
                int var8 = class16.field148;
                int var9 = class8.field65;
                int var10 = class12.field119;
                int var11 = class18.field158;
                if (var6 == 1) {
                    this.field251 = class38.field486;
                    this.field242 = class33.field430;
                    this.field263 = var7;
                    this.field245 = var9;
                    if (class32.field385.length == 1) {
                        if (this.field270 < var7 && var7 < this.field310 + this.field270 && var9 > this.field318 && var9 < this.field318 + this.field246) {
                            this.field263 = -1;
                            this.field284 = 3.0D;
                        }
                        if (this.field270 + this.field300 < var7 && var7 < this.field300 + this.field270 + this.field310 && var9 > this.field318 && this.field318 + this.field246 > var9) {
                            this.field284 = 4.0D;
                            this.field263 = -1;
                        }
                        if (var7 > this.field270 + this.field300 * 2 && this.field300 * 2 + this.field270 + this.field310 > var7 && this.field318 < var9 && var9 < this.field318 + this.field246) {
                            this.field284 = 6.0D;
                            this.field263 = -1;
                        }
                        if (var7 > this.field300 * 3 + this.field270 && this.field270 + this.field300 * 3 + this.field310 > var7 && var9 > this.field318 && this.field318 + this.field246 > var9) {
                            this.field284 = 8.0D;
                            this.field263 = -1;
                        }
                    } else {
                        if (this.field270 < var7 && var7 < this.field310 + this.field270 && var9 > this.field318 && this.field318 + this.field246 + this.field231 > var9) {
                            this.field284 = 3.0D;
                            this.field263 = -1;
                        }
                        if (var7 > this.field300 + this.field270 && this.field300 + this.field310 + this.field270 > var7 && var9 > this.field318 && var9 < this.field246 + this.field231 + this.field318) {
                            this.field263 = -1;
                            this.field284 = 4.0D;
                        }
                        if (var7 > this.field300 * 2 + this.field270 && this.field270 + this.field300 * 2 + this.field310 > var7 && this.field318 < var9 && var9 < this.field318 + this.field246 + this.field231) {
                            this.field284 = 6.0D;
                            this.field263 = -1;
                        }
                        if (this.field300 * 3 + this.field270 < var7 && this.field300 * 3 + this.field270 + this.field310 > var7 && var9 > this.field318 && var9 < this.field318 + this.field246 + this.field231) {
                            this.field284 = 8.0D;
                            this.field263 = -1;
                        }
                        if (var7 > 170 && var7 < 400 && var9 > 483 && var9 < 503) {
                            this.method143((byte) -25, this.field274);
                            this.method123(false);
                            this.method135((byte) -102);
                            this.field263 = -1;
                        }
                    }
                    if (this.field253 < var7 && this.field281 + this.field264 < var9 && var7 < this.field309 + this.field253 && var9 < 503) {
                        this.field277 = !this.field277;
                        this.field263 = -1;
                    }
                    if (this.field271 < var7 && var9 > this.field275 + this.field243 && var7 < this.field271 + this.field232 && var9 < 503) {
                        this.field290 = !this.field290;
                        this.field263 = -1;
                    }
                    this.field265 = false;
                    this.field314 = true;
                    if (this.field277) {
                        if (this.field253 < var7 && this.field281 < var9 && this.field309 + this.field253 > var7 && var9 < this.field281 + this.field264) {
                            this.field263 = -1;
                        }
                        if (this.field253 < var7 && this.field281 < var9 && var7 < this.field309 + this.field253 && this.field281 + 18 > var9 && this.field285 > 0) {
                            this.field285 -= 24;
                        }
                        if (var7 > this.field253 && var9 > this.field281 + this.field264 - 18 && var7 < this.field309 + this.field253 && var9 < this.field281 + this.field264 && this.field285 < 48) {
                            this.field285 += 24;
                        }
                    }
                    if (this.field290 && this.field271 < var7 && this.field243 < var9 && this.field271 + this.field232 > var7 && this.field275 + this.field243 > var9) {
                        this.field265 = true;
                        class33.field430 = (var9 - this.field243) * class11.field114 / this.field275;
                        class38.field486 = (var7 - this.field271) * class16.field154 / this.field232;
                        this.field263 = -1;
                    }
                    if (class35.field447 && !class40.field504 && !this.field265 && var7 > this.field291 && this.field315 < var9 && var7 < this.field301 + this.field291 && this.field315 + this.field238 > var9) {
                        class40.field504 = true;
                    }
                }
                if (this.field277) {
                    this.field266 = -1;
                    if (var8 > this.field253 && var8 < this.field309 + this.field253) {
                        int var12 = this.field281 + 21 + 5;
                        int var13 = this.field240;
                        for (int var14 = 0; var14 < 24; var14++) {
                            if (var13 < this.field268.length && this.field268[var13].method227(122, class20.field191)) {
                                var13++;
                                var14--;
                            } else {
                                if (var12 <= var10 && var10 < var12 + 17) {
                                    this.field266 = var13;
                                    if (var6 == 1) {
                                        this.field289 = 50;
                                        this.field260 = var13;
                                    }
                                }
                                var12 += 17;
                                var13++;
                            }
                        }
                    }
                    if (this.field266 != this.field256) {
                        this.field256 = this.field266;
                        this.field314 = true;
                    }
                }
                if (var11 == 1 && this.field290 && this.field265) {
                    class20.field190 = -1;
                    this.field314 = true;
                    int var15 = var8;
                    int var16 = var10;
                    if (var8 < this.field271) {
                        var15 = this.field271;
                    } else if (var8 > this.field271 + this.field232) {
                        var15 = this.field271 + this.field232;
                    }
                    class38.field486 = (var15 - this.field271) * class16.field154 / this.field232;
                    if (this.field243 > var10) {
                        var16 = this.field243;
                    } else if (this.field275 + this.field243 < var10) {
                        var16 = this.field275 + this.field243;
                    }
                    class33.field430 = (var16 - this.field243) * class11.field114 / this.field275;
                } else {
                    this.field265 = false;
                }
                if (var11 == 1 && this.field263 != -1) {
                    class38.field486 = this.field251 + (int) ((double) (this.field263 - var8) * 2.0D / this.field284);
                    class33.field430 = (int) ((double) (this.field245 - var10) * 2.0D / this.field284) + this.field242;
                    class20.field190 = -1;
                    this.field314 = true;
                }
                if (this.field259 < this.field284) {
                    this.field314 = true;
                    this.field259 += this.field259 / 30.0D;
                    if (this.field284 < this.field259) {
                        this.field259 = this.field284;
                    }
                }
                if (this.field284 < this.field259) {
                    this.field314 = true;
                    this.field259 -= this.field259 / 30.0D;
                    if (this.field284 > this.field259) {
                        this.field259 = this.field284;
                    }
                }
                if (this.field240 < this.field285) {
                    this.field240++;
                    this.field314 = true;
                }
                if (this.field240 > this.field285) {
                    this.field314 = true;
                    this.field240--;
                }
                if (this.field289 > 0) {
                    this.field314 = true;
                    this.field289--;
                }
                if (class20.field190 >= 0) {
                    byte var17 = 4;
                    class20.field198 = this.field288[class20.field190] - class11.field111;
                    class30.field371 = class30.field363 + class11.field114 - this.field286[class20.field190];
                    int var18 = class20.field198 - (int) (635.0D / this.field259);
                    this.field314 = true;
                    int var19 = class30.field371 - (int) (503.0D / this.field259);
                    int var20 = (int) (635.0D / this.field259) + class20.field198;
                    if (var18 < 48) {
                        class20.field198 = (int) (635.0D / this.field259) + 48;
                    }
                    if (class16.field154 - 48 < var20) {
                        class20.field198 = class16.field154 - (int) (635.0D / this.field259) - 48;
                    }
                    class20.field198 <<= 0x10;
                    int var21 = class20.field198 - this.field313;
                    int var22 = class30.field371 + (int) (503.0D / this.field259);
                    if (var19 < 48) {
                        class30.field371 = (int) (503.0D / this.field259) + 48;
                    }
                    if (class11.field114 - 48 < var22) {
                        class30.field371 = class11.field114 - (int) (503.0D / this.field259) - 48;
                    }
                    class30.field371 <<= 0x10;
                    int var23 = class30.field371 - this.field307;
                    if (var21 >> var17 == 0 && var23 >> var17 == 0) {
                        class20.field190 = -1;
                    } else {
                        this.field313 += var21 >> var17;
                        this.field307 += var23 >> var17;
                        class38.field486 = this.field313 >> 16;
                        class33.field430 = this.field307 >> 16;
                    }
                }
                int var24 = class38.field486 - (int) (635.0D / this.field259);
                int var25 = class33.field430 - (int) (503.0D / this.field259);
                int var26 = (int) (635.0D / this.field259) + class38.field486;
                if (var24 < 48) {
                    class38.field486 = (int) (635.0D / this.field259) + 48;
                }
                if (var26 > class16.field154 - 48) {
                    class38.field486 = class16.field154 - (int) (635.0D / this.field259) - 48;
                }
                int var27 = (int) (503.0D / this.field259) + class33.field430;
                if (var25 < 48) {
                    class33.field430 = (int) (503.0D / this.field259) + 48;
                }
                if (class11.field114 - 48 < var27) {
                    class33.field430 = class11.field114 - (int) (503.0D / this.field259) - 48;
                }
                return;
            }
        }
    }
}
