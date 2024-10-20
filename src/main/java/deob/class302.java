package deob;

import java.util.Random;

@ObfuscatedName("kt")
public abstract class class302 extends class320 {

    @ObfuscatedName("kt.f")
    public byte[][] field3767 = new byte[256][];

    @ObfuscatedName("kt.h")
    public int[] field3751;

    @ObfuscatedName("kt.e")
    public int[] field3752;

    @ObfuscatedName("kt.b")
    public int[] field3750;

    @ObfuscatedName("kt.l")
    public int[] field3754;

    @ObfuscatedName("kt.w")
    public int[] field3755;

    @ObfuscatedName("kt.d")
    public int field3756 = 0;

    @ObfuscatedName("kt.n")
    public int field3753;

    @ObfuscatedName("kt.s")
    public int field3758;

    @ObfuscatedName("kt.a")
    public byte[] field3760;

    @ObfuscatedName("kt.r")
    public static int field3761 = -1;

    @ObfuscatedName("kt.k")
    public static int field3757 = -1;

    @ObfuscatedName("kt.m")
    public static int field3763 = -1;

    @ObfuscatedName("kt.q")
    public static int field3764 = -1;

    @ObfuscatedName("kt.x")
    public static int field3769 = 0;

    @ObfuscatedName("kt.u")
    public static int field3766 = 0;

    @ObfuscatedName("kt.o")
    public static int field3762 = 256;

    @ObfuscatedName("kt.t")
    public static int field3768 = 0;

    @ObfuscatedName("kt.v")
    public static int field3765 = 0;

    @ObfuscatedName("kt.p")
    public static Random field3770 = new Random();

    @ObfuscatedName("kt.z")
    public static String[] field3771 = new String[100];

    public class302(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, byte[][] arg6) {
        this.field3754 = arg1;
        this.field3755 = arg2;
        this.field3752 = arg3;
        this.field3750 = arg4;
        this.method5120(arg0);
        this.field3767 = arg6;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        for (int var10 = 0; var10 < 256; var10++) {
            if (this.field3755[var10] < var8 && this.field3750[var10] != 0) {
                var8 = this.field3755[var10];
            }
            if (this.field3755[var10] + this.field3750[var10] > var9) {
                var9 = this.field3755[var10] + this.field3750[var10];
            }
        }
        this.field3753 = this.field3756 - var8;
        this.field3758 = var9 - this.field3756;
    }

    public class302(byte[] arg0) {
        this.method5120(arg0);
    }

    @ObfuscatedName("kt.n([B)V")
    public void method5120(byte[] arg0) {
        this.field3751 = new int[256];
        if (arg0.length == 257) {
            for (int var2 = 0; var2 < this.field3751.length; var2++) {
                this.field3751[var2] = arg0[var2] & 0xFF;
            }
            this.field3756 = arg0[256] & 0xFF;
            return;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < 256; var4++) {
            this.field3751[var4] = arg0[var3++] & 0xFF;
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
        this.field3760 = new byte[65536];
        for (int var17 = 0; var17 < 256; var17++) {
            if (var17 != 32 && var17 != 160) {
                for (int var18 = 0; var18 < 256; var18++) {
                    if (var18 != 32 && var18 != 160) {
                        this.field3760[(var17 << 8) + var18] = (byte) method5170(var9, var13, var6, this.field3751, var5, var17, var18);
                    }
                }
            }
        }
        this.field3756 = var5[32] + var6[32];
    }

    @ObfuscatedName("kt.s([[B[[B[I[I[III)I")
    public static int method5170(byte[][] arg0, byte[][] arg1, int[] arg2, int[] arg3, int[] arg4, int arg5, int arg6) {
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

    @ObfuscatedName("kt.g(C)I")
    public int method5169(char arg0) {
        if (arg0 == 160) {
            arg0 = ' ';
        }
        return this.field3751[class304.method4575(arg0) & 0xFF];
    }

    @ObfuscatedName("kt.k(Ljava/lang/String;)I")
    public int method5122(String arg0) {
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
                                    String var8 = var7.substring(4);
                                    int var9 = class308.method2935(var8, 10, true);
                                    var4 += Statics.field3759[var9].field3868;
                                    var3 = -1;
                                } catch (Exception var12) {
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
                    var4 += this.field3751[(char) (class304.method4575(var6) & 0xFF)];
                    if (this.field3760 != null && var3 != -1) {
                        var4 += this.field3760[(var3 << 8) + var6];
                    }
                    var3 = var6;
                }
            }
        }
        return var4;
    }

    @ObfuscatedName("kt.m(Ljava/lang/String;[I[Ljava/lang/String;)I")
    public int method5199(String arg0, int[] arg1, String[] arg2) {
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
                        var4 += this.method5169('<');
                        if (this.field3760 != null && var11 != -1) {
                            var4 += this.field3760[(var11 << 8) + 60];
                        }
                        var11 = '<';
                    } else if (var16.equals("gt")) {
                        var4 += this.method5169('>');
                        if (this.field3760 != null && var11 != -1) {
                            var4 += this.field3760[(var11 << 8) + 62];
                        }
                        var11 = '>';
                    } else if (var16.startsWith("img=")) {
                        try {
                            String var17 = var16.substring(4);
                            int var18 = class308.method2935(var17, 10, true);
                            var4 += Statics.field3759[var18].field3868;
                            var11 = 0;
                        } catch (Exception var22) {
                        }
                    }
                    var15 = 0;
                }
                if (var10 == -1) {
                    if (var15 != 0) {
                        var6.append(var15);
                        var4 += this.method5169(var15);
                        if (this.field3760 != null && var11 != -1) {
                            var4 += this.field3760[(var11 << 8) + var15];
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
        String var21 = var6.toString();
        if (var21.length() > var5) {
            arg2[var12++] = var21.substring(var5, var21.length());
        }
        return var12;
    }

    @ObfuscatedName("kt.q(Ljava/lang/String;I)I")
    public int method5124(String arg0, int arg1) {
        int var3 = this.method5199(arg0, new int[] { arg1 }, field3771);
        int var4 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = this.method5122(field3771[var5]);
            if (var6 > var4) {
                var4 = var6;
            }
        }
        return var4;
    }

    @ObfuscatedName("kt.x(Ljava/lang/String;I)I")
    public int method5125(String arg0, int arg1) {
        return this.method5199(arg0, new int[] { arg1 }, field3771);
    }

    @ObfuscatedName("kt.u(Ljava/lang/String;)Ljava/lang/String;")
    public static String method5126(String arg0) {
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

    @ObfuscatedName("kt.o(Ljava/lang/String;IIII)V")
    public void method5134(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method5136(arg3, arg4);
            this.method5139(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("kt.t(Ljava/lang/String;IIIII)V")
    public void method5151(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 != null) {
            this.method5136(arg3, arg4);
            field3762 = arg5;
            this.method5139(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("kt.v(Ljava/lang/String;IIII)V")
    public void method5129(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method5136(arg3, arg4);
            this.method5139(arg0, arg1 - this.method5122(arg0), arg2);
        }
    }

    @ObfuscatedName("kt.p(Ljava/lang/String;IIII)V")
    public void method5130(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method5136(arg3, arg4);
            this.method5139(arg0, arg1 - this.method5122(arg0) / 2, arg2);
        }
    }

    @ObfuscatedName("kt.z(Ljava/lang/String;IIIIIIIII)I")
    public int method5127(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg0 == null) {
            return 0;
        }
        this.method5136(arg5, arg6);
        if (arg9 == 0) {
            arg9 = this.field3756;
        }
        int[] var11 = new int[] { arg3 };
        if (arg4 < this.field3758 + this.field3753 + arg9 && arg4 < arg9 + arg9) {
            var11 = null;
        }
        int var12 = this.method5199(arg0, var11, field3771);
        if (arg8 == 3 && var12 == 1) {
            arg8 = 1;
        }
        int var13;
        if (arg8 == 0) {
            var13 = this.field3753 + arg2;
        } else if (arg8 == 1) {
            var13 = (arg4 - this.field3753 - this.field3758 - (var12 - 1) * arg9) / 2 + this.field3753 + arg2;
        } else if (arg8 == 2) {
            var13 = arg2 + arg4 - this.field3758 - (var12 - 1) * arg9;
        } else {
            int var14 = (arg4 - this.field3753 - this.field3758 - (var12 - 1) * arg9) / (var12 + 1);
            if (var14 < 0) {
                var14 = 0;
            }
            var13 = this.field3753 + arg2 + var14;
            arg9 += var14;
        }
        for (int var15 = 0; var15 < var12; var15++) {
            if (arg7 == 0) {
                this.method5139(field3771[var15], arg1, var13);
            } else if (arg7 == 1) {
                this.method5139(field3771[var15], arg1 + (arg3 - this.method5122(field3771[var15])) / 2, var13);
            } else if (arg7 == 2) {
                this.method5139(field3771[var15], arg1 + arg3 - this.method5122(field3771[var15]), var13);
            } else if (var12 - 1 == var15) {
                this.method5139(field3771[var15], arg1, var13);
            } else {
                this.method5197(field3771[var15], arg3);
                this.method5139(field3771[var15], arg1, var13);
                field3768 = 0;
            }
            var13 += arg9;
        }
        return var12;
    }

    @ObfuscatedName("kt.j(Ljava/lang/String;IIIII)V")
    public void method5132(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method5136(arg3, arg4);
        int[] var7 = new int[arg0.length()];
        for (int var8 = 0; var8 < arg0.length(); var8++) {
            var7[var8] = (int) (Math.sin((double) arg5 / 5.0D + (double) var8 / 2.0D) * 5.0D);
        }
        this.method5141(arg0, arg1 - this.method5122(arg0) / 2, arg2, (int[]) null, var7);
    }

    @ObfuscatedName("kt.c(Ljava/lang/String;IIIII)V")
    public void method5133(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method5136(arg3, arg4);
        int[] var7 = new int[arg0.length()];
        int[] var8 = new int[arg0.length()];
        for (int var9 = 0; var9 < arg0.length(); var9++) {
            var7[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 5.0D) * 5.0D);
            var8[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 3.0D) * 5.0D);
        }
        this.method5141(arg0, arg1 - this.method5122(arg0) / 2, arg2, var7, var8);
    }

    @ObfuscatedName("kt.av(Ljava/lang/String;IIIIII)V")
    public void method5119(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 == null) {
            return;
        }
        this.method5136(arg3, arg4);
        double var8 = 7.0D - (double) arg6 / 8.0D;
        if (var8 < 0.0D) {
            var8 = 0.0D;
        }
        int[] var10 = new int[arg0.length()];
        for (int var11 = 0; var11 < arg0.length(); var11++) {
            var10[var11] = (int) (Math.sin((double) arg5 / 1.0D + (double) var11 / 1.5D) * var8);
        }
        this.method5141(arg0, arg1 - this.method5122(arg0) / 2, arg2, (int[]) null, var10);
    }

    @ObfuscatedName("kt.as(Ljava/lang/String;IIIII)V")
    public void method5135(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method5136(arg3, arg4);
        field3770.setSeed((long) arg5);
        field3762 = 192 + (field3770.nextInt() & 0x1F);
        int[] var7 = new int[arg0.length()];
        int var8 = 0;
        for (int var9 = 0; var9 < arg0.length(); var9++) {
            var7[var9] = var8;
            if ((field3770.nextInt() & 0x3) == 0) {
                var8++;
            }
        }
        this.method5141(arg0, arg1, arg2, var7, (int[]) null);
    }

    @ObfuscatedName("kt.al(II)V")
    public void method5136(int arg0, int arg1) {
        field3761 = -1;
        field3757 = -1;
        field3763 = arg1;
        field3764 = arg1;
        field3769 = arg0;
        field3766 = arg0;
        field3762 = 256;
        field3768 = 0;
        field3765 = 0;
    }

    @ObfuscatedName("kt.ax(Ljava/lang/String;)V")
    public void method5137(String arg0) {
        try {
            if (arg0.startsWith("col=")) {
                String var2 = arg0.substring(4);
                int var3 = class308.method2935(var2, 16, true);
                field3766 = var3;
            } else if (arg0.equals("/col")) {
                field3766 = field3769;
            } else if (arg0.startsWith("str=")) {
                String var4 = arg0.substring(4);
                int var5 = class308.method2935(var4, 16, true);
                field3761 = var5;
            } else if (arg0.equals("str")) {
                field3761 = 8388608;
            } else if (arg0.equals("/str")) {
                field3761 = -1;
            } else if (arg0.startsWith("u=")) {
                String var6 = arg0.substring(2);
                int var7 = class308.method2935(var6, 16, true);
                field3757 = var7;
            } else if (arg0.equals("u")) {
                field3757 = 0;
            } else if (arg0.equals("/u")) {
                field3757 = -1;
            } else if (arg0.startsWith("shad=")) {
                String var8 = arg0.substring(5);
                int var9 = class308.method2935(var8, 16, true);
                field3764 = var9;
            } else if (arg0.equals("shad")) {
                field3764 = 0;
            } else if (arg0.equals("/shad")) {
                field3764 = field3763;
            } else if (arg0.equals("br")) {
                this.method5136(field3769, field3763);
            }
        } catch (Exception var11) {
        }
    }

    @ObfuscatedName("kt.ay(Ljava/lang/String;I)V")
    public void method5197(String arg0, int arg1) {
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
            field3768 = (arg1 - this.method5122(arg0) << 8) / var3;
        }
    }

    @ObfuscatedName("kt.aa(Ljava/lang/String;II)V")
    public void method5139(String arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field3756;
        int var5 = -1;
        int var6 = -1;
        for (int var7 = 0; var7 < arg0.length(); var7++) {
            if (arg0.charAt(var7) != 0) {
                char var8 = (char) (class304.method4575(arg0.charAt(var7)) & 0xFF);
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
                                        String var10 = var9.substring(4);
                                        int var11 = class308.method2935(var10, 10, true);
                                        class323 var13 = Statics.field3759[var11];
                                        var13.method5435(arg1, this.field3756 + var4 - var13.field3867);
                                        arg1 += var13.field3868;
                                        var6 = -1;
                                    } catch (Exception var18) {
                                    }
                                } else {
                                    this.method5137(var9);
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
                        if (this.field3760 != null && var6 != -1) {
                            arg1 += this.field3760[(var6 << 8) + var8];
                        }
                        int var15 = this.field3752[var8];
                        int var16 = this.field3750[var8];
                        if (var8 == ' ') {
                            if (field3768 > 0) {
                                field3765 += field3768;
                                arg1 += field3765 >> 8;
                                field3765 &= 0xFF;
                            }
                        } else if (field3762 == 256) {
                            if (field3764 != -1) {
                                method5142(this.field3767[var8], this.field3754[var8] + arg1 + 1, this.field3755[var8] + var4 + 1, var15, var16, field3764);
                            }
                            this.method5113(this.field3767[var8], this.field3754[var8] + arg1, this.field3755[var8] + var4, var15, var16, field3766);
                        } else {
                            if (field3764 != -1) {
                                method5194(this.field3767[var8], this.field3754[var8] + arg1 + 1, this.field3755[var8] + var4 + 1, var15, var16, field3764, field3762);
                            }
                            this.method5114(this.field3767[var8], this.field3754[var8] + arg1, this.field3755[var8] + var4, var15, var16, field3766, field3762);
                        }
                        int var17 = this.field3751[var8];
                        if (field3761 != -1) {
                            method5364(arg1, (int) ((double) this.field3756 * 0.7D) + var4, var17, field3761);
                        }
                        if (field3757 != -1) {
                            method5364(arg1, this.field3756 + var4 + 1, var17, field3757);
                        }
                        arg1 += var17;
                        var6 = var8;
                    }
                }
            }
        }
    }

    @ObfuscatedName("kt.ag(Ljava/lang/String;II[I[I)V")
    public void method5141(String arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var6 = arg2 - this.field3756;
        int var7 = -1;
        int var8 = -1;
        int var9 = 0;
        for (int var10 = 0; var10 < arg0.length(); var10++) {
            if (arg0.charAt(var10) != 0) {
                char var11 = (char) (class304.method4575(arg0.charAt(var10)) & 0xFF);
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
                                        String var15 = var12.substring(4);
                                        int var16 = class308.method2935(var15, 10, true);
                                        class323 var18 = Statics.field3759[var16];
                                        var18.method5435(arg1 + var13, this.field3756 + var6 - var18.field3867 + var14);
                                        arg1 += var18.field3868;
                                        var8 = -1;
                                    } catch (Exception var25) {
                                    }
                                } else {
                                    this.method5137(var12);
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
                        if (this.field3760 != null && var8 != -1) {
                            arg1 += this.field3760[(var8 << 8) + var11];
                        }
                        int var20 = this.field3752[var11];
                        int var21 = this.field3750[var11];
                        int var22;
                        if (arg3 == null) {
                            var22 = 0;
                        } else {
                            var22 = arg3[var9];
                        }
                        int var23;
                        if (arg4 == null) {
                            var23 = 0;
                        } else {
                            var23 = arg4[var9];
                        }
                        var9++;
                        if (var11 == ' ') {
                            if (field3768 > 0) {
                                field3765 += field3768;
                                arg1 += field3765 >> 8;
                                field3765 &= 0xFF;
                            }
                        } else if (field3762 == 256) {
                            if (field3764 != -1) {
                                method5142(this.field3767[var11], this.field3754[var11] + arg1 + 1 + var22, this.field3755[var11] + var6 + 1 + var23, var20, var21, field3764);
                            }
                            this.method5113(this.field3767[var11], this.field3754[var11] + arg1 + var22, this.field3755[var11] + var6 + var23, var20, var21, field3766);
                        } else {
                            if (field3764 != -1) {
                                method5194(this.field3767[var11], this.field3754[var11] + arg1 + 1 + var22, this.field3755[var11] + var6 + 1 + var23, var20, var21, field3764, field3762);
                            }
                            this.method5114(this.field3767[var11], this.field3754[var11] + arg1 + var22, this.field3755[var11] + var6 + var23, var20, var21, field3766, field3762);
                        }
                        int var24 = this.field3751[var11];
                        if (field3761 != -1) {
                            method5364(arg1, (int) ((double) this.field3756 * 0.7D) + var6, var24, field3761);
                        }
                        if (field3757 != -1) {
                            method5364(arg1, this.field3756 + var6, var24, field3757);
                        }
                        arg1 += var24;
                        var8 = var11;
                    }
                }
            }
        }
    }

    @ObfuscatedName("kt.aj([BIIIII)V")
    public static void method5142(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = Statics.field3846 * arg2 + arg1;
        int var7 = Statics.field3846 - arg3;
        int var8 = 0;
        int var9 = 0;
        if (arg2 < field3845) {
            int var10 = field3845 - arg2;
            arg4 -= var10;
            arg2 = field3845;
            var9 += arg3 * var10;
            var6 += Statics.field3846 * var10;
        }
        if (arg2 + arg4 > field3851) {
            arg4 -= arg2 + arg4 - field3851;
        }
        if (arg1 < field3850) {
            int var11 = field3850 - arg1;
            arg3 -= var11;
            arg1 = field3850;
            var9 += var11;
            var6 += var11;
            var8 += var11;
            var7 += var11;
        }
        if (arg1 + arg3 > field3849) {
            int var12 = arg1 + arg3 - field3849;
            arg3 -= var12;
            var8 += var12;
            var7 += var12;
        }
        if (arg3 > 0 && arg4 > 0) {
            method5164(Statics.field3848, arg0, arg5, var9, var6, arg3, arg4, var7, var8);
        }
    }

    @ObfuscatedName("kt.an([I[BIIIIIII)V")
    public static void method5164(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @ObfuscatedName("kt.ap([BIIIIII)V")
    public static void method5194(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = Statics.field3846 * arg2 + arg1;
        int var8 = Statics.field3846 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < field3845) {
            int var11 = field3845 - arg2;
            arg4 -= var11;
            arg2 = field3845;
            var10 += arg3 * var11;
            var7 += Statics.field3846 * var11;
        }
        if (arg2 + arg4 > field3851) {
            arg4 -= arg2 + arg4 - field3851;
        }
        if (arg1 < field3850) {
            int var12 = field3850 - arg1;
            arg3 -= var12;
            arg1 = field3850;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > field3849) {
            int var13 = arg1 + arg3 - field3849;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            method5145(Statics.field3848, arg0, arg5, var10, var7, arg3, arg4, var8, var9, arg6);
        }
    }

    @ObfuscatedName("kt.am([I[BIIIIIIII)V")
    public static void method5145(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
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

    @ObfuscatedName("kt.h([BIIIIII)V")
    public abstract void method5114(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @ObfuscatedName("kt.f([BIIIII)V")
    public abstract void method5113(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5);
}
