package deob;

import java.util.Random;

@ObfuscatedName("kn")
public abstract class class295 extends class321 {

    @ObfuscatedName("kn.f")
    public byte[][] field3675 = new byte[256][];

    @ObfuscatedName("kn.i")
    public int[] field3673;

    @ObfuscatedName("kn.y")
    public int[] field3667;

    @ObfuscatedName("kn.w")
    public int[] field3663;

    @ObfuscatedName("kn.p")
    public int[] field3664;

    @ObfuscatedName("kn.b")
    public int[] field3665;

    @ObfuscatedName("kn.e")
    public int field3666 = 0;

    @ObfuscatedName("kn.x")
    public int field3661;

    @ObfuscatedName("kn.a")
    public int field3668;

    @ObfuscatedName("kn.c")
    public byte[] field3660;

    @ObfuscatedName("kn.o")
    public static int field3671 = -1;

    @ObfuscatedName("kn.v")
    public static int field3670 = -1;

    @ObfuscatedName("kn.k")
    public static int field3672 = -1;

    @ObfuscatedName("kn.s")
    public static int field3662 = -1;

    @ObfuscatedName("kn.l")
    public static int field3674 = 0;

    @ObfuscatedName("kn.t")
    public static int field3676 = 0;

    @ObfuscatedName("kn.j")
    public static int field3677 = 256;

    @ObfuscatedName("kn.n")
    public static int field3678 = 0;

    @ObfuscatedName("kn.u")
    public static int field3679 = 0;

    @ObfuscatedName("kn.z")
    public static Random field3680 = new Random();

    @ObfuscatedName("kn.h")
    public static String[] field3681 = new String[100];

    public class295(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, byte[][] arg6) {
        this.field3664 = arg1;
        this.field3665 = arg2;
        this.field3667 = arg3;
        this.field3663 = arg4;
        this.method4959(arg0);
        this.field3675 = arg6;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        for (int var10 = 0; var10 < 256; var10++) {
            if (this.field3665[var10] < var8 && this.field3663[var10] != 0) {
                var8 = this.field3665[var10];
            }
            if (this.field3665[var10] + this.field3663[var10] > var9) {
                var9 = this.field3665[var10] + this.field3663[var10];
            }
        }
        this.field3661 = this.field3666 - var8;
        this.field3668 = var9 - this.field3666;
    }

    public class295(byte[] arg0) {
        this.method4959(arg0);
    }

    @ObfuscatedName("kn.b([B)V")
    public void method4959(byte[] arg0) {
        this.field3673 = new int[256];
        if (arg0.length == 257) {
            for (int var2 = 0; var2 < this.field3673.length; var2++) {
                this.field3673[var2] = arg0[var2] & 0xFF;
            }
            this.field3666 = arg0[256] & 0xFF;
            return;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < 256; var4++) {
            this.field3673[var4] = arg0[var3++] & 0xFF;
        }
        int[] var5 = new int[256];
        int[] var6 = new int[256];
        for (int var7 = 0; var7 < 256; var7++) {
            var5[var7] = arg0[var3++] & 0xFF;
        }
        for (int var8 = 0; var8 < 256; var8++) {
            var6[var8] = arg0[var3++] & 0xFF;
        }
        byte[][] var9 = new byte[256][];
        for (int var10 = 0; var10 < 256; var10++) {
            var9[var10] = new byte[var5[var10]];
            byte var11 = 0;
            for (int var12 = 0; var12 < var9[var10].length; var12++) {
                var11 += arg0[var3++];
                var9[var10][var12] = var11;
            }
        }
        byte[][] var13 = new byte[256][];
        for (int var14 = 0; var14 < 256; var14++) {
            var13[var14] = new byte[var5[var14]];
            byte var15 = 0;
            for (int var16 = 0; var16 < var13[var14].length; var16++) {
                var15 += arg0[var3++];
                var13[var14][var16] = var15;
            }
        }
        this.field3660 = new byte[65536];
        for (int var17 = 0; var17 < 256; var17++) {
            if (var17 != 32 && var17 != 160) {
                for (int var18 = 0; var18 < 256; var18++) {
                    if (var18 != 32 && var18 != 160) {
                        this.field3660[(var17 << 8) + var18] = (byte) method4960(var9, var13, var6, this.field3673, var5, var17, var18);
                    }
                }
            }
        }
        this.field3666 = var5[32] + var6[32];
    }

    @ObfuscatedName("kn.e([[B[[B[I[I[III)I")
    public static int method4960(byte[][] arg0, byte[][] arg1, int[] arg2, int[] arg3, int[] arg4, int arg5, int arg6) {
        int var7 = arg2[arg5];
        int var8 = arg4[arg5] + var7;
        int var9 = arg2[arg6];
        int var10 = arg4[arg6] + var9;
        int var11 = var7;
        if (var9 > var7) {
            var11 = var9;
        }
        int var12 = var8;
        if (var10 < var8) {
            var12 = var10;
        }
        int var13 = arg3[arg5];
        if (arg3[arg6] < var13) {
            var13 = arg3[arg6];
        }
        byte[] var14 = arg1[arg5];
        byte[] var15 = arg0[arg6];
        int var16 = var11 - var7;
        int var17 = var11 - var9;
        for (int var18 = var11; var18 < var12; var18++) {
            int var19 = var14[var16++] + var15[var17++];
            if (var19 < var13) {
                var13 = var19;
            }
        }
        return -var13;
    }

    @ObfuscatedName("kn.x(C)I")
    public int method4982(char arg0) {
        if (arg0 == 160) {
            arg0 = ' ';
        }
        return this.field3673[class288.method3220(arg0) & 0xFF];
    }

    @ObfuscatedName("kn.a(Ljava/lang/String;)I")
    public int method4962(String arg0) {
        if (arg0 == null) {
            return 0;
        }
        int var2 = -1;
        int var3 = -1;
        int var4 = 0;
        for (int var5 = 0; var5 < arg0.length(); var5++) {
            char var6 = arg0.charAt(var5);
            if (var6 == '<') {
                var2 = var5;
            } else {
                if (var6 == '>' && var2 != -1) {
                    String var7 = arg0.substring(var2 + 1, var5);
                    var2 = -1;
                    if (var7.equals("lt")) {
                        var6 = '<';
                    } else {
                        if (!var7.equals("gt")) {
                            if (var7.startsWith("img=")) {
                                try {
                                    int var8 = class291.method3871(var7.substring(4));
                                    var4 += Statics.field3669[var8].field3859;
                                    var3 = -1;
                                } catch (Exception var10) {
                                }
                            }
                            continue;
                        }
                        var6 = '>';
                    }
                }
                if (var6 == 160) {
                    var6 = ' ';
                }
                if (var2 == -1) {
                    var4 += this.field3673[(char) (class288.method3220(var6) & 0xFF)];
                    if (this.field3660 != null && var3 != -1) {
                        var4 += this.field3660[(var3 << 8) + var6];
                    }
                    var3 = var6;
                }
            }
        }
        return var4;
    }

    @ObfuscatedName("kn.d(Ljava/lang/String;[I[Ljava/lang/String;)I")
    public int method4963(String arg0, int[] arg1, String[] arg2) {
        if (arg0 == null) {
            return 0;
        }
        int var4 = 0;
        int var5 = 0;
        StringBuilder var6 = new StringBuilder(100);
        int var7 = -1;
        int var8 = 0;
        byte var9 = 0;
        int var10 = -1;
        char var11 = 0;
        int var12 = 0;
        int var13 = arg0.length();
        for (int var14 = 0; var14 < var13; var14++) {
            char var15 = arg0.charAt(var14);
            if (var15 == '<') {
                var10 = var14;
            } else {
                if (var15 == '>' && var10 != -1) {
                    String var16 = arg0.substring(var10 + 1, var14);
                    var10 = -1;
                    var6.append('<');
                    var6.append(var16);
                    var6.append('>');
                    if (var16.equals("br")) {
                        arg2[var12] = var6.toString().substring(var5, var6.length());
                        var12++;
                        var5 = var6.length();
                        var4 = 0;
                        var7 = -1;
                        var11 = 0;
                    } else if (var16.equals("lt")) {
                        var4 += this.method4982('<');
                        if (this.field3660 != null && var11 != -1) {
                            var4 += this.field3660[(var11 << 8) + 60];
                        }
                        var11 = '<';
                    } else if (var16.equals("gt")) {
                        var4 += this.method4982('>');
                        if (this.field3660 != null && var11 != -1) {
                            var4 += this.field3660[(var11 << 8) + 62];
                        }
                        var11 = '>';
                    } else if (var16.startsWith("img=")) {
                        try {
                            int var17 = class291.method3871(var16.substring(4));
                            var4 += Statics.field3669[var17].field3859;
                            var11 = 0;
                        } catch (Exception var20) {
                        }
                    }
                    var15 = 0;
                }
                if (var10 == -1) {
                    if (var15 != 0) {
                        var6.append(var15);
                        var4 += this.method4982(var15);
                        if (this.field3660 != null && var11 != -1) {
                            var4 += this.field3660[(var11 << 8) + var15];
                        }
                        var11 = var15;
                    }
                    if (var15 == ' ') {
                        var7 = var6.length();
                        var8 = var4;
                        var9 = 1;
                    }
                    if (arg1 != null && var4 > arg1[var12 < arg1.length ? var12 : arg1.length - 1] && var7 >= 0) {
                        arg2[var12] = var6.toString().substring(var5, var7 - var9);
                        var12++;
                        var5 = var7;
                        var7 = -1;
                        var4 -= var8;
                        var11 = 0;
                    }
                    if (var15 == '-') {
                        var7 = var6.length();
                        var8 = var4;
                        var9 = 0;
                    }
                }
            }
        }
        String var19 = var6.toString();
        if (var19.length() > var5) {
            arg2[var12++] = var19.substring(var5, var19.length());
        }
        return var12;
    }

    @ObfuscatedName("kn.c(Ljava/lang/String;I)I")
    public int method4964(String arg0, int arg1) {
        int var3 = this.method4963(arg0, new int[] { arg1 }, field3681);
        int var4 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = this.method4962(field3681[var5]);
            if (var6 > var4) {
                var4 = var6;
            }
        }
        return var4;
    }

    @ObfuscatedName("kn.o(Ljava/lang/String;I)I")
    public int method5043(String arg0, int arg1) {
        return this.method4963(arg0, new int[] { arg1 }, field3681);
    }

    @ObfuscatedName("kn.l(Ljava/lang/String;)Ljava/lang/String;")
    public static String method4965(String arg0) {
        int var1 = arg0.length();
        int var2 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            char var4 = arg0.charAt(var3);
            if (var4 == '<' || var4 == '>') {
                var2 += 3;
            }
        }
        StringBuilder var5 = new StringBuilder(var1 + var2);
        for (int var6 = 0; var6 < var1; var6++) {
            char var7 = arg0.charAt(var6);
            if (var7 == '<') {
                var5.append("<lt>");
            } else if (var7 == '>') {
                var5.append("<gt>");
            } else {
                var5.append(var7);
            }
        }
        return var5.toString();
    }

    @ObfuscatedName("kn.t(Ljava/lang/String;IIII)V")
    public void method4966(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method4975(arg3, arg4);
            this.method4978(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("kn.j(Ljava/lang/String;IIIII)V")
    public void method4989(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 != null) {
            this.method4975(arg3, arg4);
            field3677 = arg5;
            this.method4978(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("kn.n(Ljava/lang/String;IIII)V")
    public void method4968(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method4975(arg3, arg4);
            this.method4978(arg0, arg1 - this.method4962(arg0), arg2);
        }
    }

    @ObfuscatedName("kn.u(Ljava/lang/String;IIII)V")
    public void method4988(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method4975(arg3, arg4);
            this.method4978(arg0, arg1 - this.method4962(arg0) / 2, arg2);
        }
    }

    @ObfuscatedName("kn.z(Ljava/lang/String;IIIIIIIII)I")
    public int method4970(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg0 == null) {
            return 0;
        }
        this.method4975(arg5, arg6);
        if (arg9 == 0) {
            arg9 = this.field3666;
        }
        int[] var11 = new int[] { arg3 };
        if (arg4 < this.field3668 + this.field3661 + arg9 && arg4 < arg9 + arg9) {
            var11 = null;
        }
        int var12 = this.method4963(arg0, var11, field3681);
        if (arg8 == 3 && var12 == 1) {
            arg8 = 1;
        }
        int var13;
        if (arg8 == 0) {
            var13 = this.field3661 + arg2;
        } else if (arg8 == 1) {
            var13 = (arg4 - this.field3661 - this.field3668 - (var12 - 1) * arg9) / 2 + this.field3661 + arg2;
        } else if (arg8 == 2) {
            var13 = arg2 + arg4 - this.field3668 - (var12 - 1) * arg9;
        } else {
            int var14 = (arg4 - this.field3661 - this.field3668 - (var12 - 1) * arg9) / (var12 + 1);
            if (var14 < 0) {
                var14 = 0;
            }
            var13 = this.field3661 + arg2 + var14;
            arg9 += var14;
        }
        for (int var15 = 0; var15 < var12; var15++) {
            if (arg7 == 0) {
                this.method4978(field3681[var15], arg1, var13);
            } else if (arg7 == 1) {
                this.method4978(field3681[var15], arg1 + (arg3 - this.method4962(field3681[var15])) / 2, var13);
            } else if (arg7 == 2) {
                this.method4978(field3681[var15], arg1 + arg3 - this.method4962(field3681[var15]), var13);
            } else if (var12 - 1 == var15) {
                this.method4978(field3681[var15], arg1, var13);
            } else {
                this.method4977(field3681[var15], arg3);
                this.method4978(field3681[var15], arg1, var13);
                field3678 = 0;
            }
            var13 += arg9;
        }
        return var12;
    }

    @ObfuscatedName("kn.h(Ljava/lang/String;IIIII)V")
    public void method5006(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method4975(arg3, arg4);
        int[] var7 = new int[arg0.length()];
        for (int var8 = 0; var8 < arg0.length(); var8++) {
            var7[var8] = (int) (Math.sin((double) arg5 / 5.0D + (double) var8 / 2.0D) * 5.0D);
        }
        this.method4979(arg0, arg1 - this.method4962(arg0) / 2, arg2, (int[]) null, var7);
    }

    @ObfuscatedName("kn.m(Ljava/lang/String;IIIII)V")
    public void method4961(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method4975(arg3, arg4);
        int[] var7 = new int[arg0.length()];
        int[] var8 = new int[arg0.length()];
        for (int var9 = 0; var9 < arg0.length(); var9++) {
            var7[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 5.0D) * 5.0D);
            var8[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 3.0D) * 5.0D);
        }
        this.method4979(arg0, arg1 - this.method4962(arg0) / 2, arg2, var7, var8);
    }

    @ObfuscatedName("kn.aa(Ljava/lang/String;IIIIII)V")
    public void method4973(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 == null) {
            return;
        }
        this.method4975(arg3, arg4);
        double var8 = 7.0D - (double) arg6 / 8.0D;
        if (var8 < 0.0D) {
            var8 = 0.0D;
        }
        int[] var10 = new int[arg0.length()];
        for (int var11 = 0; var11 < arg0.length(); var11++) {
            var10[var11] = (int) (Math.sin((double) arg5 / 1.0D + (double) var11 / 1.5D) * var8);
        }
        this.method4979(arg0, arg1 - this.method4962(arg0) / 2, arg2, (int[]) null, var10);
    }

    @ObfuscatedName("kn.av(Ljava/lang/String;IIIII)V")
    public void method4984(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method4975(arg3, arg4);
        field3680.setSeed((long) arg5);
        field3677 = 192 + (field3680.nextInt() & 0x1F);
        int[] var7 = new int[arg0.length()];
        int var8 = 0;
        for (int var9 = 0; var9 < arg0.length(); var9++) {
            var7[var9] = var8;
            if ((field3680.nextInt() & 0x3) == 0) {
                var8++;
            }
        }
        this.method4979(arg0, arg1, arg2, var7, (int[]) null);
    }

    @ObfuscatedName("kn.aw(II)V")
    public void method4975(int arg0, int arg1) {
        field3671 = -1;
        field3670 = -1;
        field3672 = arg1;
        field3662 = arg1;
        field3674 = arg0;
        field3676 = arg0;
        field3677 = 256;
        field3678 = 0;
        field3679 = 0;
    }

    @ObfuscatedName("kn.as(Ljava/lang/String;)V")
    public void method4974(String arg0) {
        try {
            if (arg0.startsWith("col=")) {
                field3676 = class291.method3939(arg0.substring(4), 16);
            } else if (arg0.equals("/col")) {
                field3676 = field3674;
            } else if (arg0.startsWith("str=")) {
                field3671 = class291.method3939(arg0.substring(4), 16);
            } else if (arg0.equals("str")) {
                field3671 = 8388608;
            } else if (arg0.equals("/str")) {
                field3671 = -1;
            } else if (arg0.startsWith("u=")) {
                field3670 = class291.method3939(arg0.substring(2), 16);
            } else if (arg0.equals("u")) {
                field3670 = 0;
            } else if (arg0.equals("/u")) {
                field3670 = -1;
            } else if (arg0.startsWith("shad=")) {
                field3662 = class291.method3939(arg0.substring(5), 16);
            } else if (arg0.equals("shad")) {
                field3662 = 0;
            } else if (arg0.equals("/shad")) {
                field3662 = field3672;
            } else if (arg0.equals("br")) {
                this.method4975(field3674, field3672);
            }
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("kn.ak(Ljava/lang/String;I)V")
    public void method4977(String arg0, int arg1) {
        int var3 = 0;
        boolean var4 = false;
        for (int var5 = 0; var5 < arg0.length(); var5++) {
            char var6 = arg0.charAt(var5);
            if (var6 == '<') {
                var4 = true;
            } else if (var6 == '>') {
                var4 = false;
            } else if (!var4 && var6 == ' ') {
                var3++;
            }
        }
        if (var3 > 0) {
            field3678 = (arg1 - this.method4962(arg0) << 8) / var3;
        }
    }

    @ObfuscatedName("kn.au(Ljava/lang/String;II)V")
    public void method4978(String arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field3666;
        int var5 = -1;
        int var6 = -1;
        for (int var7 = 0; var7 < arg0.length(); var7++) {
            if (arg0.charAt(var7) != 0) {
                char var8 = (char) (class288.method3220(arg0.charAt(var7)) & 0xFF);
                if (var8 == '<') {
                    var5 = var7;
                } else {
                    if (var8 == '>' && var5 != -1) {
                        String var9 = arg0.substring(var5 + 1, var7);
                        var5 = -1;
                        if (var9.equals("lt")) {
                            var8 = '<';
                        } else {
                            if (!var9.equals("gt")) {
                                if (var9.startsWith("img=")) {
                                    try {
                                        int var10 = class291.method3871(var9.substring(4));
                                        class324 var11 = Statics.field3669[var10];
                                        var11.method5625(arg1, this.field3666 + var4 - var11.field3863);
                                        arg1 += var11.field3859;
                                        var6 = -1;
                                    } catch (Exception var16) {
                                    }
                                } else {
                                    this.method4974(var9);
                                }
                                continue;
                            }
                            var8 = '>';
                        }
                    }
                    if (var8 == 160) {
                        var8 = ' ';
                    }
                    if (var5 == -1) {
                        if (this.field3660 != null && var6 != -1) {
                            arg1 += this.field3660[(var6 << 8) + var8];
                        }
                        int var13 = this.field3667[var8];
                        int var14 = this.field3663[var8];
                        if (var8 == ' ') {
                            if (field3678 > 0) {
                                field3679 += field3678;
                                arg1 += field3679 >> 8;
                                field3679 &= 0xFF;
                            }
                        } else if (field3677 == 256) {
                            if (field3662 != -1) {
                                method5019(this.field3675[var8], this.field3664[var8] + arg1 + 1, this.field3665[var8] + var4 + 1, var13, var14, field3662);
                            }
                            this.method4957(this.field3675[var8], this.field3664[var8] + arg1, this.field3665[var8] + var4, var13, var14, field3676);
                        } else {
                            if (field3662 != -1) {
                                method5014(this.field3675[var8], this.field3664[var8] + arg1 + 1, this.field3665[var8] + var4 + 1, var13, var14, field3662, field3677);
                            }
                            this.method4954(this.field3675[var8], this.field3664[var8] + arg1, this.field3665[var8] + var4, var13, var14, field3676, field3677);
                        }
                        int var15 = this.field3673[var8];
                        if (field3671 != -1) {
                            method5554(arg1, (int) ((double) this.field3666 * 0.7D) + var4, var15, field3671);
                        }
                        if (field3670 != -1) {
                            method5554(arg1, this.field3666 + var4 + 1, var15, field3670);
                        }
                        arg1 += var15;
                        var6 = var8;
                    }
                }
            }
        }
    }

    @ObfuscatedName("kn.ah(Ljava/lang/String;II[I[I)V")
    public void method4979(String arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var6 = arg2 - this.field3666;
        int var7 = -1;
        int var8 = -1;
        int var9 = 0;
        for (int var10 = 0; var10 < arg0.length(); var10++) {
            if (arg0.charAt(var10) != 0) {
                char var11 = (char) (class288.method3220(arg0.charAt(var10)) & 0xFF);
                if (var11 == '<') {
                    var7 = var10;
                } else {
                    if (var11 == '>' && var7 != -1) {
                        String var12 = arg0.substring(var7 + 1, var10);
                        var7 = -1;
                        if (var12.equals("lt")) {
                            var11 = '<';
                        } else {
                            if (!var12.equals("gt")) {
                                if (var12.startsWith("img=")) {
                                    try {
                                        int var13;
                                        if (arg3 == null) {
                                            var13 = 0;
                                        } else {
                                            var13 = arg3[var9];
                                        }
                                        int var14;
                                        if (arg4 == null) {
                                            var14 = 0;
                                        } else {
                                            var14 = arg4[var9];
                                        }
                                        var9++;
                                        int var15 = class291.method3871(var12.substring(4));
                                        class324 var16 = Statics.field3669[var15];
                                        var16.method5625(arg1 + var13, this.field3666 + var6 - var16.field3863 + var14);
                                        arg1 += var16.field3859;
                                        var8 = -1;
                                    } catch (Exception var23) {
                                    }
                                } else {
                                    this.method4974(var12);
                                }
                                continue;
                            }
                            var11 = '>';
                        }
                    }
                    if (var11 == 160) {
                        var11 = ' ';
                    }
                    if (var7 == -1) {
                        if (this.field3660 != null && var8 != -1) {
                            arg1 += this.field3660[(var8 << 8) + var11];
                        }
                        int var18 = this.field3667[var11];
                        int var19 = this.field3663[var11];
                        int var20;
                        if (arg3 == null) {
                            var20 = 0;
                        } else {
                            var20 = arg3[var9];
                        }
                        int var21;
                        if (arg4 == null) {
                            var21 = 0;
                        } else {
                            var21 = arg4[var9];
                        }
                        var9++;
                        if (var11 == ' ') {
                            if (field3678 > 0) {
                                field3679 += field3678;
                                arg1 += field3679 >> 8;
                                field3679 &= 0xFF;
                            }
                        } else if (field3677 == 256) {
                            if (field3662 != -1) {
                                method5019(this.field3675[var11], this.field3664[var11] + arg1 + 1 + var20, this.field3665[var11] + var6 + 1 + var21, var18, var19, field3662);
                            }
                            this.method4957(this.field3675[var11], this.field3664[var11] + arg1 + var20, this.field3665[var11] + var6 + var21, var18, var19, field3676);
                        } else {
                            if (field3662 != -1) {
                                method5014(this.field3675[var11], this.field3664[var11] + arg1 + 1 + var20, this.field3665[var11] + var6 + 1 + var21, var18, var19, field3662, field3677);
                            }
                            this.method4954(this.field3675[var11], this.field3664[var11] + arg1 + var20, this.field3665[var11] + var6 + var21, var18, var19, field3676, field3677);
                        }
                        int var22 = this.field3673[var11];
                        if (field3671 != -1) {
                            method5554(arg1, (int) ((double) this.field3666 * 0.7D) + var6, var22, field3671);
                        }
                        if (field3670 != -1) {
                            method5554(arg1, this.field3666 + var6, var22, field3670);
                        }
                        arg1 += var22;
                        var8 = var11;
                    }
                }
            }
        }
    }

    @ObfuscatedName("kn.aq([BIIIII)V")
    public static void method5019(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = Statics.field3841 * arg2 + arg1;
        int var7 = Statics.field3841 - arg3;
        int var8 = 0;
        int var9 = 0;
        if (arg2 < field3845) {
            int var10 = field3845 - arg2;
            arg4 -= var10;
            arg2 = field3845;
            var9 += arg3 * var10;
            var6 += Statics.field3841 * var10;
        }
        if (arg2 + arg4 > field3844) {
            arg4 -= arg2 + arg4 - field3844;
        }
        if (arg1 < field3840) {
            int var11 = field3840 - arg1;
            arg3 -= var11;
            arg1 = field3840;
            var9 += var11;
            var6 += var11;
            var8 += var11;
            var7 += var11;
        }
        if (arg1 + arg3 > field3846) {
            int var12 = arg1 + arg3 - field3846;
            arg3 -= var12;
            var8 += var12;
            var7 += var12;
        }
        if (arg3 > 0 && arg4 > 0) {
            method4981(Statics.field3843, arg0, arg5, var9, var6, arg3, arg4, var7, var8);
        }
    }

    @ObfuscatedName("kn.ao([I[BIIIIIII)V")
    public static void method4981(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var9 = -(arg5 >> 2);
        int var10 = -(arg5 & 0x3);
        for (int var11 = -arg6; var11 < 0; var11++) {
            for (int var12 = var9; var12 < 0; var12++) {
                if (arg1[arg3++] == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2;
                }
                if (arg1[arg3++] == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2;
                }
                if (arg1[arg3++] == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2;
                }
                if (arg1[arg3++] == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2;
                }
            }
            for (int var13 = var10; var13 < 0; var13++) {
                if (arg1[arg3++] == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2;
                }
            }
            arg4 += arg7;
            arg3 += arg8;
        }
    }

    @ObfuscatedName("kn.an([BIIIIII)V")
    public static void method5014(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = Statics.field3841 * arg2 + arg1;
        int var8 = Statics.field3841 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < field3845) {
            int var11 = field3845 - arg2;
            arg4 -= var11;
            arg2 = field3845;
            var10 += arg3 * var11;
            var7 += Statics.field3841 * var11;
        }
        if (arg2 + arg4 > field3844) {
            arg4 -= arg2 + arg4 - field3844;
        }
        if (arg1 < field3840) {
            int var12 = field3840 - arg1;
            arg3 -= var12;
            arg1 = field3840;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > field3846) {
            int var13 = arg1 + arg3 - field3846;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            method5025(Statics.field3843, arg0, arg5, var10, var7, arg3, arg4, var8, var9, arg6);
        }
    }

    @ObfuscatedName("kn.ar([I[BIIIIIIII)V")
    public static void method5025(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        int var10 = ((arg2 & 0xFF00FF) * arg9 & 0xFF00FF00) + ((arg2 & 0xFF00) * arg9 & 0xFF0000) >> 8;
        int var11 = 256 - arg9;
        for (int var12 = -arg6; var12 < 0; var12++) {
            for (int var13 = -arg5; var13 < 0; var13++) {
                if (arg1[arg3++] == 0) {
                    arg4++;
                } else {
                    int var14 = arg0[arg4];
                    arg0[arg4++] = (((var14 & 0xFF00FF) * var11 & 0xFF00FF00) + ((var14 & 0xFF00) * var11 & 0xFF0000) >> 8) + var10;
                }
            }
            arg4 += arg7;
            arg3 += arg8;
        }
    }

    @ObfuscatedName("kn.f([BIIIII)V")
    public abstract void method4957(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @ObfuscatedName("kn.i([BIIIIII)V")
    public abstract void method4954(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);
}
