package deob;

import java.util.Random;

@ObfuscatedName("kc")
public abstract class class302 extends class320 {

    @ObfuscatedName("kc.y")
    public byte[][] field3739 = new byte[256][];

    @ObfuscatedName("kc.c")
    public int[] field3744;

    @ObfuscatedName("kc.n")
    public int[] field3743;

    @ObfuscatedName("kc.u")
    public int[] field3752;

    @ObfuscatedName("kc.i")
    public int[] field3734;

    @ObfuscatedName("kc.r")
    public int[] field3736;

    @ObfuscatedName("kc.j")
    public int field3737 = 0;

    @ObfuscatedName("kc.p")
    public int field3735;

    @ObfuscatedName("kc.e")
    public int field3732;

    @ObfuscatedName("kc.v")
    public byte[] field3741;

    @ObfuscatedName("kc.k")
    public static int field3738 = -1;

    @ObfuscatedName("kc.o")
    public static int field3751 = -1;

    @ObfuscatedName("kc.q")
    public static int field3742 = -1;

    @ObfuscatedName("kc.l")
    public static int field3731 = -1;

    @ObfuscatedName("kc.f")
    public static int field3746 = 0;

    @ObfuscatedName("kc.z")
    public static int field3747 = 0;

    @ObfuscatedName("kc.a")
    public static int field3748 = 256;

    @ObfuscatedName("kc.x")
    public static int field3749 = 0;

    @ObfuscatedName("kc.b")
    public static int field3750 = 0;

    @ObfuscatedName("kc.w")
    public static Random field3745 = new Random();

    @ObfuscatedName("kc.g")
    public static String[] field3733 = new String[100];

    public class302(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, byte[][] arg6) {
        this.field3734 = arg1;
        this.field3736 = arg2;
        this.field3743 = arg3;
        this.field3752 = arg4;
        this.method5204(arg0);
        this.field3739 = arg6;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        for (int var10 = 0; var10 < 256; var10++) {
            if (this.field3736[var10] < var8 && this.field3752[var10] != 0) {
                var8 = this.field3736[var10];
            }
            if (this.field3752[var10] + this.field3736[var10] > var9) {
                var9 = this.field3752[var10] + this.field3736[var10];
            }
        }
        this.field3735 = this.field3737 - var8;
        this.field3732 = var9 - this.field3737;
    }

    public class302(byte[] arg0) {
        this.method5204(arg0);
    }

    @ObfuscatedName("kc.e([B)V")
    public void method5204(byte[] arg0) {
        this.field3744 = new int[256];
        if (arg0.length == 257) {
            for (int var2 = 0; var2 < this.field3744.length; var2++) {
                this.field3744[var2] = arg0[var2] & 0xFF;
            }
            this.field3737 = arg0[256] & 0xFF;
            return;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < 256; var4++) {
            this.field3744[var4] = arg0[var3++] & 0xFF;
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
        this.field3741 = new byte[65536];
        for (int var17 = 0; var17 < 256; var17++) {
            if (var17 != 32 && var17 != 160) {
                for (int var18 = 0; var18 < 256; var18++) {
                    if (var18 != 32 && var18 != 160) {
                        this.field3741[(var17 << 8) + var18] = (byte) method5137(var9, var13, var6, this.field3744, var5, var17, var18);
                    }
                }
            }
        }
        this.field3737 = var5[32] + var6[32];
    }

    @ObfuscatedName("kc.s([[B[[B[I[I[III)I")
    public static int method5137(byte[][] arg0, byte[][] arg1, int[] arg2, int[] arg3, int[] arg4, int arg5, int arg6) {
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

    @ObfuscatedName("kc.v(C)I")
    public int method5203(char arg0) {
        if (arg0 == 160) {
            arg0 = ' ';
        }
        return this.field3744[class304.method647(arg0) & 0xFF];
    }

    @ObfuscatedName("kc.k(Ljava/lang/String;)I")
    public int method5139(String arg0) {
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
                                    int var8 = class308.method508(var7.substring(4));
                                    var4 += Statics.field3740[var8].field3844;
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
                    var4 += this.field3744[(char) (class304.method647(var6) & 0xFF)];
                    if (this.field3741 != null && var3 != -1) {
                        var4 += this.field3741[(var3 << 8) + var6];
                    }
                    var3 = var6;
                }
            }
        }
        return var4;
    }

    @ObfuscatedName("kc.o(Ljava/lang/String;[I[Ljava/lang/String;)I")
    public int method5140(String arg0, int[] arg1, String[] arg2) {
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
                        var4 += this.method5203('<');
                        if (this.field3741 != null && var11 != -1) {
                            var4 += this.field3741[(var11 << 8) + 60];
                        }
                        var11 = '<';
                    } else if (var16.equals("gt")) {
                        var4 += this.method5203('>');
                        if (this.field3741 != null && var11 != -1) {
                            var4 += this.field3741[(var11 << 8) + 62];
                        }
                        var11 = '>';
                    } else if (var16.startsWith("img=")) {
                        try {
                            int var17 = class308.method508(var16.substring(4));
                            var4 += Statics.field3740[var17].field3844;
                            var11 = 0;
                        } catch (Exception var20) {
                        }
                    }
                    var15 = 0;
                }
                if (var10 == -1) {
                    if (var15 != 0) {
                        var6.append(var15);
                        var4 += this.method5203(var15);
                        if (this.field3741 != null && var11 != -1) {
                            var4 += this.field3741[(var11 << 8) + var15];
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

    @ObfuscatedName("kc.q(Ljava/lang/String;I)I")
    public int method5162(String arg0, int arg1) {
        int var3 = this.method5140(arg0, new int[] { arg1 }, field3733);
        int var4 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = this.method5139(field3733[var5]);
            if (var6 > var4) {
                var4 = var6;
            }
        }
        return var4;
    }

    @ObfuscatedName("kc.l(Ljava/lang/String;I)I")
    public int method5207(String arg0, int arg1) {
        return this.method5140(arg0, new int[] { arg1 }, field3733);
    }

    @ObfuscatedName("kc.f(Ljava/lang/String;)Ljava/lang/String;")
    public static String method5143(String arg0) {
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

    @ObfuscatedName("kc.z(Ljava/lang/String;IIII)V")
    public void method5144(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method5152(arg3, arg4);
            this.method5155(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("kc.a(Ljava/lang/String;IIIII)V")
    public void method5145(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 != null) {
            this.method5152(arg3, arg4);
            field3748 = arg5;
            this.method5155(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("kc.x(Ljava/lang/String;IIII)V")
    public void method5146(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method5152(arg3, arg4);
            this.method5155(arg0, arg1 - this.method5139(arg0), arg2);
        }
    }

    @ObfuscatedName("kc.b(Ljava/lang/String;IIII)V")
    public void method5147(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method5152(arg3, arg4);
            this.method5155(arg0, arg1 - this.method5139(arg0) / 2, arg2);
        }
    }

    @ObfuscatedName("kc.w(Ljava/lang/String;IIIIIIIII)I")
    public int method5196(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg0 == null) {
            return 0;
        }
        this.method5152(arg5, arg6);
        if (arg9 == 0) {
            arg9 = this.field3737;
        }
        int[] var11 = new int[] { arg3 };
        if (arg4 < this.field3735 + this.field3732 + arg9 && arg4 < arg9 + arg9) {
            var11 = null;
        }
        int var12 = this.method5140(arg0, var11, field3733);
        if (arg8 == 3 && var12 == 1) {
            arg8 = 1;
        }
        int var13;
        if (arg8 == 0) {
            var13 = this.field3735 + arg2;
        } else if (arg8 == 1) {
            var13 = (arg4 - this.field3735 - this.field3732 - (var12 - 1) * arg9) / 2 + this.field3735 + arg2;
        } else if (arg8 == 2) {
            var13 = arg2 + arg4 - this.field3732 - (var12 - 1) * arg9;
        } else {
            int var14 = (arg4 - this.field3735 - this.field3732 - (var12 - 1) * arg9) / (var12 + 1);
            if (var14 < 0) {
                var14 = 0;
            }
            var13 = this.field3735 + arg2 + var14;
            arg9 += var14;
        }
        for (int var15 = 0; var15 < var12; var15++) {
            if (arg7 == 0) {
                this.method5155(field3733[var15], arg1, var13);
            } else if (arg7 == 1) {
                this.method5155(field3733[var15], arg1 + (arg3 - this.method5139(field3733[var15])) / 2, var13);
            } else if (arg7 == 2) {
                this.method5155(field3733[var15], arg1 + arg3 - this.method5139(field3733[var15]), var13);
            } else if (var12 - 1 == var15) {
                this.method5155(field3733[var15], arg1, var13);
            } else {
                this.method5154(field3733[var15], arg3);
                this.method5155(field3733[var15], arg1, var13);
                field3749 = 0;
            }
            var13 += arg9;
        }
        return var12;
    }

    @ObfuscatedName("kc.g(Ljava/lang/String;IIIII)V")
    public void method5201(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method5152(arg3, arg4);
        int[] var7 = new int[arg0.length()];
        for (int var8 = 0; var8 < arg0.length(); var8++) {
            var7[var8] = (int) (Math.sin((double) arg5 / 5.0D + (double) var8 / 2.0D) * 5.0D);
        }
        this.method5156(arg0, arg1 - this.method5139(arg0) / 2, arg2, (int[]) null, var7);
    }

    @ObfuscatedName("kc.d(Ljava/lang/String;IIIII)V")
    public void method5141(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method5152(arg3, arg4);
        int[] var7 = new int[arg0.length()];
        int[] var8 = new int[arg0.length()];
        for (int var9 = 0; var9 < arg0.length(); var9++) {
            var7[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 5.0D) * 5.0D);
            var8[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 3.0D) * 5.0D);
        }
        this.method5156(arg0, arg1 - this.method5139(arg0) / 2, arg2, var7, var8);
    }

    @ObfuscatedName("kc.m(Ljava/lang/String;IIIIII)V")
    public void method5191(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 == null) {
            return;
        }
        this.method5152(arg3, arg4);
        double var8 = 7.0D - (double) arg6 / 8.0D;
        if (var8 < 0.0D) {
            var8 = 0.0D;
        }
        int[] var10 = new int[arg0.length()];
        for (int var11 = 0; var11 < arg0.length(); var11++) {
            var10[var11] = (int) (Math.sin((double) arg5 / 1.0D + (double) var11 / 1.5D) * var8);
        }
        this.method5156(arg0, arg1 - this.method5139(arg0) / 2, arg2, (int[]) null, var10);
    }

    @ObfuscatedName("kc.t(Ljava/lang/String;IIIII)V")
    public void method5160(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method5152(arg3, arg4);
        field3745.setSeed((long) arg5);
        field3748 = 192 + (field3745.nextInt() & 0x1F);
        int[] var7 = new int[arg0.length()];
        int var8 = 0;
        for (int var9 = 0; var9 < arg0.length(); var9++) {
            var7[var9] = var8;
            if ((field3745.nextInt() & 0x3) == 0) {
                var8++;
            }
        }
        this.method5156(arg0, arg1, arg2, var7, (int[]) null);
    }

    @ObfuscatedName("kc.h(II)V")
    public void method5152(int arg0, int arg1) {
        field3738 = -1;
        field3751 = -1;
        field3742 = arg1;
        field3731 = arg1;
        field3746 = arg0;
        field3747 = arg0;
        field3748 = 256;
        field3749 = 0;
        field3750 = 0;
    }

    @ObfuscatedName("kc.ah(Ljava/lang/String;)V")
    public void method5153(String arg0) {
        try {
            if (arg0.startsWith("col=")) {
                field3747 = class308.method1010(arg0.substring(4), 16);
            } else if (arg0.equals("/col")) {
                field3747 = field3746;
            } else if (arg0.startsWith("str=")) {
                field3738 = class308.method1010(arg0.substring(4), 16);
            } else if (arg0.equals("str")) {
                field3738 = 8388608;
            } else if (arg0.equals("/str")) {
                field3738 = -1;
            } else if (arg0.startsWith("u=")) {
                field3751 = class308.method1010(arg0.substring(2), 16);
            } else if (arg0.equals("u")) {
                field3751 = 0;
            } else if (arg0.equals("/u")) {
                field3751 = -1;
            } else if (arg0.startsWith("shad=")) {
                field3731 = class308.method1010(arg0.substring(5), 16);
            } else if (arg0.equals("shad")) {
                field3731 = 0;
            } else if (arg0.equals("/shad")) {
                field3731 = field3742;
            } else if (arg0.equals("br")) {
                this.method5152(field3746, field3742);
            }
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("kc.ad(Ljava/lang/String;I)V")
    public void method5154(String arg0, int arg1) {
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
            field3749 = (arg1 - this.method5139(arg0) << 8) / var3;
        }
    }

    @ObfuscatedName("kc.aa(Ljava/lang/String;II)V")
    public void method5155(String arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field3737;
        int var5 = -1;
        int var6 = -1;
        for (int var7 = 0; var7 < arg0.length(); var7++) {
            if (arg0.charAt(var7) != 0) {
                char var8 = (char) (class304.method647(arg0.charAt(var7)) & 0xFF);
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
                                        int var11 = Statics.method110(var10, 10, true);
                                        class323 var13 = Statics.field3740[var11];
                                        var13.method5452(arg1, this.field3737 + var4 - var13.field3837);
                                        arg1 += var13.field3844;
                                        var6 = -1;
                                    } catch (Exception var18) {
                                    }
                                } else {
                                    this.method5153(var9);
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
                        if (this.field3741 != null && var6 != -1) {
                            arg1 += this.field3741[(var6 << 8) + var8];
                        }
                        int var15 = this.field3743[var8];
                        int var16 = this.field3752[var8];
                        if (var8 == ' ') {
                            if (field3749 > 0) {
                                field3750 += field3749;
                                arg1 += field3750 >> 8;
                                field3750 &= 0xFF;
                            }
                        } else if (field3748 == 256) {
                            if (field3731 != -1) {
                                method5158(this.field3739[var8], this.field3734[var8] + arg1 + 1, this.field3736[var8] + var4 + 1, var15, var16, field3731);
                            }
                            this.method5130(this.field3739[var8], this.field3734[var8] + arg1, this.field3736[var8] + var4, var15, var16, field3747);
                        } else {
                            if (field3731 != -1) {
                                method5148(this.field3739[var8], this.field3734[var8] + arg1 + 1, this.field3736[var8] + var4 + 1, var15, var16, field3731, field3748);
                            }
                            this.method5131(this.field3739[var8], this.field3734[var8] + arg1, this.field3736[var8] + var4, var15, var16, field3747, field3748);
                        }
                        int var17 = this.field3744[var8];
                        if (field3738 != -1) {
                            method5378(arg1, (int) ((double) this.field3737 * 0.7D) + var4, var17, field3738);
                        }
                        if (field3751 != -1) {
                            method5378(arg1, this.field3737 + var4 + 1, var17, field3751);
                        }
                        arg1 += var17;
                        var6 = var8;
                    }
                }
            }
        }
    }

    @ObfuscatedName("kc.ag(Ljava/lang/String;II[I[I)V")
    public void method5156(String arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var6 = arg2 - this.field3737;
        int var7 = -1;
        int var8 = -1;
        int var9 = 0;
        for (int var10 = 0; var10 < arg0.length(); var10++) {
            if (arg0.charAt(var10) != 0) {
                char var11 = (char) (class304.method647(arg0.charAt(var10)) & 0xFF);
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
                                        int var16 = Statics.method110(var15, 10, true);
                                        class323 var18 = Statics.field3740[var16];
                                        var18.method5452(arg1 + var13, this.field3737 + var6 - var18.field3837 + var14);
                                        arg1 += var18.field3844;
                                        var8 = -1;
                                    } catch (Exception var25) {
                                    }
                                } else {
                                    this.method5153(var12);
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
                        if (this.field3741 != null && var8 != -1) {
                            arg1 += this.field3741[(var8 << 8) + var11];
                        }
                        int var20 = this.field3743[var11];
                        int var21 = this.field3752[var11];
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
                            if (field3749 > 0) {
                                field3750 += field3749;
                                arg1 += field3750 >> 8;
                                field3750 &= 0xFF;
                            }
                        } else if (field3748 == 256) {
                            if (field3731 != -1) {
                                method5158(this.field3739[var11], this.field3734[var11] + arg1 + 1 + var22, this.field3736[var11] + var6 + 1 + var23, var20, var21, field3731);
                            }
                            this.method5130(this.field3739[var11], this.field3734[var11] + arg1 + var22, this.field3736[var11] + var6 + var23, var20, var21, field3747);
                        } else {
                            if (field3731 != -1) {
                                method5148(this.field3739[var11], this.field3734[var11] + arg1 + 1 + var22, this.field3736[var11] + var6 + 1 + var23, var20, var21, field3731, field3748);
                            }
                            this.method5131(this.field3739[var11], this.field3734[var11] + arg1 + var22, this.field3736[var11] + var6 + var23, var20, var21, field3747, field3748);
                        }
                        int var24 = this.field3744[var11];
                        if (field3738 != -1) {
                            method5378(arg1, (int) ((double) this.field3737 * 0.7D) + var6, var24, field3738);
                        }
                        if (field3751 != -1) {
                            method5378(arg1, this.field3737 + var6, var24, field3751);
                        }
                        arg1 += var24;
                        var8 = var11;
                    }
                }
            }
        }
    }

    @ObfuscatedName("kc.av([BIIIII)V")
    public static void method5158(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = Statics.field3821 * arg2 + arg1;
        int var7 = Statics.field3821 - arg3;
        int var8 = 0;
        int var9 = 0;
        if (arg2 < field3823) {
            int var10 = field3823 - arg2;
            arg4 -= var10;
            arg2 = field3823;
            var9 += arg3 * var10;
            var6 += Statics.field3821 * var10;
        }
        if (arg2 + arg4 > field3822) {
            arg4 -= arg2 + arg4 - field3822;
        }
        if (arg1 < field3825) {
            int var11 = field3825 - arg1;
            arg3 -= var11;
            arg1 = field3825;
            var9 += var11;
            var6 += var11;
            var8 += var11;
            var7 += var11;
        }
        if (arg1 + arg3 > field3824) {
            int var12 = arg1 + arg3 - field3824;
            arg3 -= var12;
            var8 += var12;
            var7 += var12;
        }
        if (arg3 > 0 && arg4 > 0) {
            method5159(Statics.field3826, arg0, arg5, var9, var6, arg3, arg4, var7, var8);
        }
    }

    @ObfuscatedName("kc.am([I[BIIIIIII)V")
    public static void method5159(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @ObfuscatedName("kc.ap([BIIIIII)V")
    public static void method5148(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = Statics.field3821 * arg2 + arg1;
        int var8 = Statics.field3821 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < field3823) {
            int var11 = field3823 - arg2;
            arg4 -= var11;
            arg2 = field3823;
            var10 += arg3 * var11;
            var7 += Statics.field3821 * var11;
        }
        if (arg2 + arg4 > field3822) {
            arg4 -= arg2 + arg4 - field3822;
        }
        if (arg1 < field3825) {
            int var12 = field3825 - arg1;
            arg3 -= var12;
            arg1 = field3825;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > field3824) {
            int var13 = arg1 + arg3 - field3824;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            method5161(Statics.field3826, arg0, arg5, var10, var7, arg3, arg4, var8, var9, arg6);
        }
    }

    @ObfuscatedName("kc.au([I[BIIIIIIII)V")
    public static void method5161(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
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

    @ObfuscatedName("kc.y([BIIIII)V")
    public abstract void method5130(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @ObfuscatedName("kc.c([BIIIIII)V")
    public abstract void method5131(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);
}
