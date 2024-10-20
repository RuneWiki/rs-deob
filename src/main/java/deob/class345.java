package deob;

import java.util.Random;

@ObfuscatedName("me")
public abstract class class345 extends class447 {

    @ObfuscatedName("me.v")
    public byte[][] field4121 = new byte[256][];

    @ObfuscatedName("me.c")
    public int[] field4125;

    @ObfuscatedName("me.i")
    public int[] field4113;

    @ObfuscatedName("me.f")
    public int[] field4124;

    @ObfuscatedName("me.b")
    public int[] field4120;

    @ObfuscatedName("me.n")
    public int[] field4116;

    @ObfuscatedName("me.s")
    public int field4117 = 0;

    @ObfuscatedName("me.l")
    public int field4118;

    @ObfuscatedName("me.q")
    public int field4126;

    @ObfuscatedName("me.r")
    public byte[] field4114;

    @ObfuscatedName("me.p")
    public static int field4122 = -1;

    @ObfuscatedName("me.w")
    public static int field4123 = -1;

    @ObfuscatedName("me.k")
    public static int field4129 = -1;

    @ObfuscatedName("me.d")
    public static int field4112 = -1;

    @ObfuscatedName("me.m")
    public static int field4115 = 0;

    @ObfuscatedName("me.u")
    public static int field4127 = 0;

    @ObfuscatedName("me.t")
    public static int field4128 = 256;

    @ObfuscatedName("me.g")
    public static int field4111 = 0;

    @ObfuscatedName("me.x")
    public static int field4130 = 0;

    @ObfuscatedName("me.a")
    public static Random field4131 = new Random();

    @ObfuscatedName("me.y")
    public static String[] field4132 = new String[100];

    public class345(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, byte[][] arg6) {
        this.field4120 = arg1;
        this.field4116 = arg2;
        this.field4113 = arg3;
        this.field4124 = arg4;
        this.method5738(arg0);
        this.field4121 = arg6;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        for (int var10 = 0; var10 < 256; var10++) {
            if (this.field4116[var10] < var8 && this.field4124[var10] != 0) {
                var8 = this.field4116[var10];
            }
            if (this.field4124[var10] + this.field4116[var10] > var9) {
                var9 = this.field4124[var10] + this.field4116[var10];
            }
        }
        this.field4118 = this.field4117 - var8;
        this.field4126 = var9 - this.field4117;
    }

    public class345(byte[] arg0) {
        this.method5738(arg0);
    }

    @ObfuscatedName("me.q([B)V")
    public void method5738(byte[] arg0) {
        this.field4125 = new int[256];
        if (arg0.length == 257) {
            for (int var2 = 0; var2 < this.field4125.length; var2++) {
                this.field4125[var2] = arg0[var2] & 0xFF;
            }
            this.field4117 = arg0[256] & 0xFF;
            return;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < 256; var4++) {
            this.field4125[var4] = arg0[var3++] & 0xFF;
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
        this.field4114 = new byte[65536];
        for (int var17 = 0; var17 < 256; var17++) {
            if (var17 != 32 && var17 != 160) {
                for (int var18 = 0; var18 < 256; var18++) {
                    if (var18 != 32 && var18 != 160) {
                        this.field4114[(var17 << 8) + var18] = (byte) method5739(var9, var13, var6, this.field4125, var5, var17, var18);
                    }
                }
            }
        }
        this.field4117 = var5[32] + var6[32];
    }

    @ObfuscatedName("me.o([[B[[B[I[I[III)I")
    public static int method5739(byte[][] arg0, byte[][] arg1, int[] arg2, int[] arg3, int[] arg4, int arg5, int arg6) {
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

    @ObfuscatedName("me.r(C)I")
    public int method5790(char arg0) {
        if (arg0 == 160) {
            arg0 = ' ';
        }
        return this.field4125[class346.method5490(arg0) & 0xFF];
    }

    @ObfuscatedName("me.p(Ljava/lang/String;)I")
    public int method5741(String arg0) {
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
                                    int var8 = class348.method283(var7.substring(4));
                                    var4 += Statics.field4119[var8].field4707;
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
                    var4 += this.field4125[(char) (class346.method5490(var6) & 0xFF)];
                    if (this.field4114 != null && var3 != -1) {
                        var4 += this.field4114[(var3 << 8) + var6];
                    }
                    var3 = var6;
                }
            }
        }
        return var4;
    }

    @ObfuscatedName("me.w(Ljava/lang/String;[I[Ljava/lang/String;)I")
    public int method5737(String arg0, int[] arg1, String[] arg2) {
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
                        var4 += this.method5790('<');
                        if (this.field4114 != null && var11 != -1) {
                            var4 += this.field4114[(var11 << 8) + 60];
                        }
                        var11 = '<';
                    } else if (var16.equals("gt")) {
                        var4 += this.method5790('>');
                        if (this.field4114 != null && var11 != -1) {
                            var4 += this.field4114[(var11 << 8) + 62];
                        }
                        var11 = '>';
                    } else if (var16.startsWith("img=")) {
                        try {
                            int var17 = class348.method283(var16.substring(4));
                            var4 += Statics.field4119[var17].field4707;
                            var11 = 0;
                        } catch (Exception var20) {
                        }
                    }
                    var15 = 0;
                }
                if (var10 == -1) {
                    if (var15 != 0) {
                        var6.append(var15);
                        var4 += this.method5790(var15);
                        if (this.field4114 != null && var11 != -1) {
                            var4 += this.field4114[(var11 << 8) + var15];
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

    @ObfuscatedName("me.k(Ljava/lang/String;I)I")
    public int method5743(String arg0, int arg1) {
        int var3 = this.method5737(arg0, new int[] { arg1 }, field4132);
        int var4 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = this.method5741(field4132[var5]);
            if (var6 > var4) {
                var4 = var6;
            }
        }
        return var4;
    }

    @ObfuscatedName("me.d(Ljava/lang/String;I)I")
    public int method5744(String arg0, int arg1) {
        return this.method5737(arg0, new int[] { arg1 }, field4132);
    }

    @ObfuscatedName("me.m(Ljava/lang/String;)Ljava/lang/String;")
    public static String method5745(String arg0) {
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

    @ObfuscatedName("me.u(IILjava/lang/String;II)Lnm;")
    public class384 method5746(int arg0, int arg1, String arg2, int arg3, int arg4) {
        if (arg2 == null || arg2.length() < arg0 + arg1) {
            return new class384(arg3, arg4, 0, 0);
        }
        int var6 = arg3 - this.method5741(arg2) / 2;
        int var7 = var6 + this.method5741(arg2.substring(0, arg0));
        int var8 = arg4 - this.field4118;
        int var9 = this.method5741(arg2.substring(arg0, arg0 + arg1));
        int var10 = this.field4126 + this.field4118;
        return new class384(var7, var8, var9, var10);
    }

    @ObfuscatedName("me.t(Ljava/lang/String;IIII)V")
    public void method5782(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method5756(arg3, arg4);
            this.method5747(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("me.g(Ljava/lang/String;IIIII)V")
    public void method5748(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 != null) {
            this.method5756(arg3, arg4);
            field4128 = arg5;
            this.method5747(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("me.x(Ljava/lang/String;IIII)V")
    public void method5749(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method5756(arg3, arg4);
            this.method5747(arg0, arg1 - this.method5741(arg0), arg2);
        }
    }

    @ObfuscatedName("me.a(Ljava/lang/String;IIII)V")
    public void method5750(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method5756(arg3, arg4);
            this.method5747(arg0, arg1 - this.method5741(arg0) / 2, arg2);
        }
    }

    @ObfuscatedName("me.y(Ljava/lang/String;IIIIIIIII)I")
    public int method5751(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg0 == null) {
            return 0;
        }
        this.method5756(arg5, arg6);
        if (arg9 == 0) {
            arg9 = this.field4117;
        }
        int[] var11 = new int[] { arg3 };
        if (arg4 < this.field4126 + this.field4118 + arg9 && arg4 < arg9 + arg9) {
            var11 = null;
        }
        int var12 = this.method5737(arg0, var11, field4132);
        if (arg8 == 3 && var12 == 1) {
            arg8 = 1;
        }
        int var13;
        if (arg8 == 0) {
            var13 = this.field4118 + arg2;
        } else if (arg8 == 1) {
            var13 = (arg4 - this.field4118 - this.field4126 - (var12 - 1) * arg9) / 2 + this.field4118 + arg2;
        } else if (arg8 == 2) {
            var13 = arg2 + arg4 - this.field4126 - (var12 - 1) * arg9;
        } else {
            int var14 = (arg4 - this.field4118 - this.field4126 - (var12 - 1) * arg9) / (var12 + 1);
            if (var14 < 0) {
                var14 = 0;
            }
            var13 = this.field4118 + arg2 + var14;
            arg9 += var14;
        }
        for (int var15 = 0; var15 < var12; var15++) {
            if (arg7 == 0) {
                this.method5747(field4132[var15], arg1, var13);
            } else if (arg7 == 1) {
                this.method5747(field4132[var15], arg1 + (arg3 - this.method5741(field4132[var15])) / 2, var13);
            } else if (arg7 == 2) {
                this.method5747(field4132[var15], arg1 + arg3 - this.method5741(field4132[var15]), var13);
            } else if (var12 - 1 == var15) {
                this.method5747(field4132[var15], arg1, var13);
            } else {
                this.method5770(field4132[var15], arg3);
                this.method5747(field4132[var15], arg1, var13);
                field4111 = 0;
            }
            var13 += arg9;
        }
        return var12;
    }

    @ObfuscatedName("me.j(Ljava/lang/String;IIIII)V")
    public void method5754(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method5756(arg3, arg4);
        int[] var7 = new int[arg0.length()];
        for (int var8 = 0; var8 < arg0.length(); var8++) {
            var7[var8] = (int) (Math.sin((double) arg5 / 5.0D + (double) var8 / 2.0D) * 5.0D);
        }
        this.method5779(arg0, arg1 - this.method5741(arg0) / 2, arg2, (int[]) null, var7);
    }

    @ObfuscatedName("me.e(Ljava/lang/String;IIIII)V")
    public void method5802(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method5756(arg3, arg4);
        int[] var7 = new int[arg0.length()];
        int[] var8 = new int[arg0.length()];
        for (int var9 = 0; var9 < arg0.length(); var9++) {
            var7[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 5.0D) * 5.0D);
            var8[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 3.0D) * 5.0D);
        }
        this.method5779(arg0, arg1 - this.method5741(arg0) / 2, arg2, var7, var8);
    }

    @ObfuscatedName("me.z(Ljava/lang/String;IIIIII)V")
    public void method5752(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 == null) {
            return;
        }
        this.method5756(arg3, arg4);
        double var8 = 7.0D - (double) arg6 / 8.0D;
        if (var8 < 0.0D) {
            var8 = 0.0D;
        }
        int[] var10 = new int[arg0.length()];
        for (int var11 = 0; var11 < arg0.length(); var11++) {
            var10[var11] = (int) (Math.sin((double) arg5 / 1.0D + (double) var11 / 1.5D) * var8);
        }
        this.method5779(arg0, arg1 - this.method5741(arg0) / 2, arg2, (int[]) null, var10);
    }

    @ObfuscatedName("me.h(Ljava/lang/String;IIIII)V")
    public void method5755(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method5756(arg3, arg4);
        field4131.setSeed((long) arg5);
        field4128 = 192 + (field4131.nextInt() & 0x1F);
        int[] var7 = new int[arg0.length()];
        int var8 = 0;
        for (int var9 = 0; var9 < arg0.length(); var9++) {
            var7[var9] = var8;
            if ((field4131.nextInt() & 0x3) == 0) {
                var8++;
            }
        }
        this.method5779(arg0, arg1, arg2, var7, (int[]) null);
    }

    @ObfuscatedName("me.ae(II)V")
    public void method5756(int arg0, int arg1) {
        field4122 = -1;
        field4123 = -1;
        field4129 = arg1;
        field4112 = arg1;
        field4115 = arg0;
        field4127 = arg0;
        field4128 = 256;
        field4111 = 0;
        field4130 = 0;
    }

    @ObfuscatedName("me.aq(Ljava/lang/String;)V")
    public void method5757(String arg0) {
        try {
            if (arg0.startsWith("col=")) {
                field4127 = class348.method720(arg0.substring(4), 16);
            } else if (arg0.equals("/col")) {
                field4127 = field4115;
            } else if (arg0.startsWith("str=")) {
                field4122 = class348.method720(arg0.substring(4), 16);
            } else if (arg0.equals("str")) {
                field4122 = 8388608;
            } else if (arg0.equals("/str")) {
                field4122 = -1;
            } else if (arg0.startsWith("u=")) {
                field4123 = class348.method720(arg0.substring(2), 16);
            } else if (arg0.equals("u")) {
                field4123 = 0;
            } else if (arg0.equals("/u")) {
                field4123 = -1;
            } else if (arg0.startsWith("shad=")) {
                field4112 = class348.method720(arg0.substring(5), 16);
            } else if (arg0.equals("shad")) {
                field4112 = 0;
            } else if (arg0.equals("/shad")) {
                field4112 = field4129;
            } else if (arg0.equals("br")) {
                this.method5756(field4115, field4129);
            }
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("me.aw(Ljava/lang/String;I)V")
    public void method5770(String arg0, int arg1) {
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
            field4111 = (arg1 - this.method5741(arg0) << 8) / var3;
        }
    }

    @ObfuscatedName("me.am(Ljava/lang/String;II)V")
    public void method5747(String arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field4117;
        int var5 = -1;
        int var6 = -1;
        for (int var7 = 0; var7 < arg0.length(); var7++) {
            if (arg0.charAt(var7) != 0) {
                char var8 = (char) (class346.method5490(arg0.charAt(var7)) & 0xFF);
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
                                        int var10 = class348.method283(var9.substring(4));
                                        class450 var11 = Statics.field4119[var10];
                                        var11.method7333(arg1, this.field4117 + var4 - var11.field4701);
                                        arg1 += var11.field4707;
                                        var6 = -1;
                                    } catch (Exception var16) {
                                    }
                                } else {
                                    this.method5757(var9);
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
                        if (this.field4114 != null && var6 != -1) {
                            arg1 += this.field4114[(var6 << 8) + var8];
                        }
                        int var13 = this.field4113[var8];
                        int var14 = this.field4124[var8];
                        if (var8 == ' ') {
                            if (field4111 > 0) {
                                field4130 += field4111;
                                arg1 += field4130 >> 8;
                                field4130 &= 0xFF;
                            }
                        } else if (field4128 == 256) {
                            if (field4112 != -1) {
                                method5764(this.field4121[var8], this.field4120[var8] + arg1 + 1, this.field4116[var8] + var4 + 1, var13, var14, field4112);
                            }
                            this.method5730(this.field4121[var8], this.field4120[var8] + arg1, this.field4116[var8] + var4, var13, var14, field4127);
                        } else {
                            if (field4112 != -1) {
                                method5762(this.field4121[var8], this.field4120[var8] + arg1 + 1, this.field4116[var8] + var4 + 1, var13, var14, field4112, field4128);
                            }
                            this.method5732(this.field4121[var8], this.field4120[var8] + arg1, this.field4116[var8] + var4, var13, var14, field4127, field4128);
                        }
                        int var15 = this.field4125[var8];
                        if (field4122 != -1) {
                            method7264(arg1, (int) ((double) this.field4117 * 0.7D) + var4, var15, field4122);
                        }
                        if (field4123 != -1) {
                            method7264(arg1, this.field4117 + var4 + 1, var15, field4123);
                        }
                        arg1 += var15;
                        var6 = var8;
                    }
                }
            }
        }
    }

    @ObfuscatedName("me.ak(Ljava/lang/String;II[I[I)V")
    public void method5779(String arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var6 = arg2 - this.field4117;
        int var7 = -1;
        int var8 = -1;
        int var9 = 0;
        for (int var10 = 0; var10 < arg0.length(); var10++) {
            if (arg0.charAt(var10) != 0) {
                char var11 = (char) (class346.method5490(arg0.charAt(var10)) & 0xFF);
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
                                        int var15 = class348.method283(var12.substring(4));
                                        class450 var16 = Statics.field4119[var15];
                                        var16.method7333(arg1 + var13, this.field4117 + var6 - var16.field4701 + var14);
                                        arg1 += var16.field4707;
                                        var8 = -1;
                                    } catch (Exception var23) {
                                    }
                                } else {
                                    this.method5757(var12);
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
                        if (this.field4114 != null && var8 != -1) {
                            arg1 += this.field4114[(var8 << 8) + var11];
                        }
                        int var18 = this.field4113[var11];
                        int var19 = this.field4124[var11];
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
                            if (field4111 > 0) {
                                field4130 += field4111;
                                arg1 += field4130 >> 8;
                                field4130 &= 0xFF;
                            }
                        } else if (field4128 == 256) {
                            if (field4112 != -1) {
                                method5764(this.field4121[var11], this.field4120[var11] + arg1 + 1 + var20, this.field4116[var11] + var6 + 1 + var21, var18, var19, field4112);
                            }
                            this.method5730(this.field4121[var11], this.field4120[var11] + arg1 + var20, this.field4116[var11] + var6 + var21, var18, var19, field4127);
                        } else {
                            if (field4112 != -1) {
                                method5762(this.field4121[var11], this.field4120[var11] + arg1 + 1 + var20, this.field4116[var11] + var6 + 1 + var21, var18, var19, field4112, field4128);
                            }
                            this.method5732(this.field4121[var11], this.field4120[var11] + arg1 + var20, this.field4116[var11] + var6 + var21, var18, var19, field4127, field4128);
                        }
                        int var22 = this.field4125[var11];
                        if (field4122 != -1) {
                            method7264(arg1, (int) ((double) this.field4117 * 0.7D) + var6, var22, field4122);
                        }
                        if (field4123 != -1) {
                            method7264(arg1, this.field4117 + var6, var22, field4123);
                        }
                        arg1 += var22;
                        var8 = var11;
                    }
                }
            }
        }
    }

    @ObfuscatedName("me.ao([BIIIII)V")
    public static void method5764(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = Statics.field4689 * arg2 + arg1;
        int var7 = Statics.field4689 - arg3;
        int var8 = 0;
        int var9 = 0;
        if (arg2 < field4688) {
            int var10 = field4688 - arg2;
            arg4 -= var10;
            arg2 = field4688;
            var9 += arg3 * var10;
            var6 += Statics.field4689 * var10;
        }
        if (arg2 + arg4 > field4685) {
            arg4 -= arg2 + arg4 - field4685;
        }
        if (arg1 < field4690) {
            int var11 = field4690 - arg1;
            arg3 -= var11;
            arg1 = field4690;
            var9 += var11;
            var6 += var11;
            var8 += var11;
            var7 += var11;
        }
        if (arg1 + arg3 > field4691) {
            int var12 = arg1 + arg3 - field4691;
            arg3 -= var12;
            var8 += var12;
            var7 += var12;
        }
        if (arg3 > 0 && arg4 > 0) {
            method5796(Statics.field4686, arg0, arg5, var9, var6, arg3, arg4, var7, var8);
        }
    }

    @ObfuscatedName("me.aj([I[BIIIIIII)V")
    public static void method5796(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @ObfuscatedName("me.al([BIIIIII)V")
    public static void method5762(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = Statics.field4689 * arg2 + arg1;
        int var8 = Statics.field4689 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < field4688) {
            int var11 = field4688 - arg2;
            arg4 -= var11;
            arg2 = field4688;
            var10 += arg3 * var11;
            var7 += Statics.field4689 * var11;
        }
        if (arg2 + arg4 > field4685) {
            arg4 -= arg2 + arg4 - field4685;
        }
        if (arg1 < field4690) {
            int var12 = field4690 - arg1;
            arg3 -= var12;
            arg1 = field4690;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > field4691) {
            int var13 = arg1 + arg3 - field4691;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            method5763(Statics.field4686, arg0, arg5, var10, var7, arg3, arg4, var8, var9, arg6);
        }
    }

    @ObfuscatedName("me.av([I[BIIIIIIII)V")
    public static void method5763(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
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

    @ObfuscatedName("me.v([BIIIII)V")
    public abstract void method5730(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @ObfuscatedName("me.c([BIIIIII)V")
    public abstract void method5732(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);
}
