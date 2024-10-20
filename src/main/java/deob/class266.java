package deob;

import java.util.Random;

@ObfuscatedName("jv")
public abstract class class266 extends class283 {

    @ObfuscatedName("jv.e")
    public byte[][] field3630 = new byte[256][];

    @ObfuscatedName("jv.n")
    public int[] field3635;

    @ObfuscatedName("jv.g")
    public int[] field3629;

    @ObfuscatedName("jv.y")
    public int[] field3641;

    @ObfuscatedName("jv.w")
    public int[] field3633;

    @ObfuscatedName("jv.k")
    public int[] field3634;

    @ObfuscatedName("jv.v")
    public int field3645 = 0;

    @ObfuscatedName("jv.z")
    public int field3631;

    @ObfuscatedName("jv.r")
    public int field3637;

    @ObfuscatedName("jv.d")
    public byte[] field3639;

    @ObfuscatedName("jv.o")
    public static int field3642 = -1;

    @ObfuscatedName("jv.l")
    public static int field3640 = -1;

    @ObfuscatedName("jv.h")
    public static int field3632 = -1;

    @ObfuscatedName("jv.s")
    public static int field3643 = -1;

    @ObfuscatedName("jv.c")
    public static int field3644 = 0;

    @ObfuscatedName("jv.m")
    public static int field3636 = 0;

    @ObfuscatedName("jv.a")
    public static int field3646 = 256;

    @ObfuscatedName("jv.t")
    public static int field3647 = 0;

    @ObfuscatedName("jv.p")
    public static int field3648 = 0;

    @ObfuscatedName("jv.f")
    public static Random field3649 = new Random();

    @ObfuscatedName("jv.b")
    public static String[] field3650 = new String[100];

    public class266(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, byte[][] arg6) {
        this.field3633 = arg1;
        this.field3634 = arg2;
        this.field3629 = arg3;
        this.field3641 = arg4;
        this.method4485(arg0);
        this.field3630 = arg6;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        for (int var10 = 0; var10 < 256; var10++) {
            if (this.field3634[var10] < var8 && this.field3641[var10] != 0) {
                var8 = this.field3634[var10];
            }
            if (this.field3641[var10] + this.field3634[var10] > var9) {
                var9 = this.field3641[var10] + this.field3634[var10];
            }
        }
        this.field3631 = this.field3645 - var8;
        this.field3637 = var9 - this.field3645;
    }

    public class266(byte[] arg0) {
        this.method4485(arg0);
    }

    @ObfuscatedName("jv.r([B)V")
    public void method4485(byte[] arg0) {
        this.field3635 = new int[256];
        if (arg0.length == 257) {
            for (int var2 = 0; var2 < this.field3635.length; var2++) {
                this.field3635[var2] = arg0[var2] & 0xFF;
            }
            this.field3645 = arg0[256] & 0xFF;
            return;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < 256; var4++) {
            this.field3635[var4] = arg0[var3++] & 0xFF;
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
        this.field3639 = new byte[65536];
        for (int var17 = 0; var17 < 256; var17++) {
            if (var17 != 32 && var17 != 160) {
                for (int var18 = 0; var18 < 256; var18++) {
                    if (var18 != 32 && var18 != 160) {
                        this.field3639[(var17 << 8) + var18] = (byte) method4511(var9, var13, var6, this.field3635, var5, var17, var18);
                    }
                }
            }
        }
        this.field3645 = var5[32] + var6[32];
    }

    @ObfuscatedName("jv.u([[B[[B[I[I[III)I")
    public static int method4511(byte[][] arg0, byte[][] arg1, int[] arg2, int[] arg3, int[] arg4, int arg5, int arg6) {
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

    @ObfuscatedName("jv.d(C)I")
    public int method4453(char arg0) {
        if (arg0 == 160) {
            arg0 = ' ';
        }
        return this.field3635[class268.method1607(arg0) & 0xFF];
    }

    @ObfuscatedName("jv.o(Ljava/lang/String;)I")
    public int method4454(String arg0) {
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
                                    int var9 = class272.method4007(var8, 10, true);
                                    var4 += Statics.field3638[var9].field3757;
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
                    var4 += this.field3635[(char) (class268.method1607(var6) & 0xFF)];
                    if (this.field3639 != null && var3 != -1) {
                        var4 += this.field3639[(var3 << 8) + var6];
                    }
                    var3 = var6;
                }
            }
        }
        return var4;
    }

    @ObfuscatedName("jv.s(Ljava/lang/String;[I[Ljava/lang/String;)I")
    public int method4460(String arg0, int[] arg1, String[] arg2) {
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
                        var4 += this.method4453('<');
                        if (this.field3639 != null && var11 != -1) {
                            var4 += this.field3639[(var11 << 8) + 60];
                        }
                        var11 = '<';
                    } else if (var16.equals("gt")) {
                        var4 += this.method4453('>');
                        if (this.field3639 != null && var11 != -1) {
                            var4 += this.field3639[(var11 << 8) + 62];
                        }
                        var11 = '>';
                    } else if (var16.startsWith("img=")) {
                        try {
                            String var17 = var16.substring(4);
                            int var18 = class272.method4007(var17, 10, true);
                            var4 += Statics.field3638[var18].field3757;
                            var11 = 0;
                        } catch (Exception var22) {
                        }
                    }
                    var15 = 0;
                }
                if (var10 == -1) {
                    if (var15 != 0) {
                        var6.append(var15);
                        var4 += this.method4453(var15);
                        if (this.field3639 != null && var11 != -1) {
                            var4 += this.field3639[(var11 << 8) + var15];
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

    @ObfuscatedName("jv.c(Ljava/lang/String;I)I")
    public int method4456(String arg0, int arg1) {
        int var3 = this.method4460(arg0, new int[] { arg1 }, field3650);
        int var4 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = this.method4454(field3650[var5]);
            if (var6 > var4) {
                var4 = var6;
            }
        }
        return var4;
    }

    @ObfuscatedName("jv.m(Ljava/lang/String;I)I")
    public int method4457(String arg0, int arg1) {
        return this.method4460(arg0, new int[] { arg1 }, field3650);
    }

    @ObfuscatedName("jv.a(Ljava/lang/String;)Ljava/lang/String;")
    public static String method4458(String arg0) {
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

    @ObfuscatedName("jv.t(Ljava/lang/String;IIII)V")
    public void method4459(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method4468(arg3, arg4);
            this.method4471(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("jv.p(Ljava/lang/String;IIIII)V")
    public void method4527(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 != null) {
            this.method4468(arg3, arg4);
            field3646 = arg5;
            this.method4471(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("jv.f(Ljava/lang/String;IIII)V")
    public void method4461(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method4468(arg3, arg4);
            this.method4471(arg0, arg1 - this.method4454(arg0), arg2);
        }
    }

    @ObfuscatedName("jv.x(Ljava/lang/String;IIII)V")
    public void method4462(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method4468(arg3, arg4);
            this.method4471(arg0, arg1 - this.method4454(arg0) / 2, arg2);
        }
    }

    @ObfuscatedName("jv.q(Ljava/lang/String;IIIIIIIII)I")
    public int method4463(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg0 == null) {
            return 0;
        }
        this.method4468(arg5, arg6);
        if (arg9 == 0) {
            arg9 = this.field3645;
        }
        int[] var11 = new int[] { arg3 };
        if (arg4 < this.field3637 + this.field3631 + arg9 && arg4 < arg9 + arg9) {
            var11 = null;
        }
        int var12 = this.method4460(arg0, var11, field3650);
        if (arg8 == 3 && var12 == 1) {
            arg8 = 1;
        }
        int var13;
        if (arg8 == 0) {
            var13 = this.field3631 + arg2;
        } else if (arg8 == 1) {
            var13 = (arg4 - this.field3631 - this.field3637 - (var12 - 1) * arg9) / 2 + this.field3631 + arg2;
        } else if (arg8 == 2) {
            var13 = arg2 + arg4 - this.field3637 - (var12 - 1) * arg9;
        } else {
            int var14 = (arg4 - this.field3631 - this.field3637 - (var12 - 1) * arg9) / (var12 + 1);
            if (var14 < 0) {
                var14 = 0;
            }
            var13 = this.field3631 + arg2 + var14;
            arg9 += var14;
        }
        for (int var15 = 0; var15 < var12; var15++) {
            if (arg7 == 0) {
                this.method4471(field3650[var15], arg1, var13);
            } else if (arg7 == 1) {
                this.method4471(field3650[var15], arg1 + (arg3 - this.method4454(field3650[var15])) / 2, var13);
            } else if (arg7 == 2) {
                this.method4471(field3650[var15], arg1 + arg3 - this.method4454(field3650[var15]), var13);
            } else if (var12 - 1 == var15) {
                this.method4471(field3650[var15], arg1, var13);
            } else {
                this.method4470(field3650[var15], arg3);
                this.method4471(field3650[var15], arg1, var13);
                field3647 = 0;
            }
            var13 += arg9;
        }
        return var12;
    }

    @ObfuscatedName("jv.ag(Ljava/lang/String;IIIII)V")
    public void method4464(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method4468(arg3, arg4);
        int[] var7 = new int[arg0.length()];
        for (int var8 = 0; var8 < arg0.length(); var8++) {
            var7[var8] = (int) (Math.sin((double) arg5 / 5.0D + (double) var8 / 2.0D) * 5.0D);
        }
        this.method4517(arg0, arg1 - this.method4454(arg0) / 2, arg2, (int[]) null, var7);
    }

    @ObfuscatedName("jv.ay(Ljava/lang/String;IIIII)V")
    public void method4465(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method4468(arg3, arg4);
        int[] var7 = new int[arg0.length()];
        int[] var8 = new int[arg0.length()];
        for (int var9 = 0; var9 < arg0.length(); var9++) {
            var7[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 5.0D) * 5.0D);
            var8[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 3.0D) * 5.0D);
        }
        this.method4517(arg0, arg1 - this.method4454(arg0) / 2, arg2, var7, var8);
    }

    @ObfuscatedName("jv.au(Ljava/lang/String;IIIIII)V")
    public void method4520(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 == null) {
            return;
        }
        this.method4468(arg3, arg4);
        double var8 = 7.0D - (double) arg6 / 8.0D;
        if (var8 < 0.0D) {
            var8 = 0.0D;
        }
        int[] var10 = new int[arg0.length()];
        for (int var11 = 0; var11 < arg0.length(); var11++) {
            var10[var11] = (int) (Math.sin((double) arg5 / 1.0D + (double) var11 / 1.5D) * var8);
        }
        this.method4517(arg0, arg1 - this.method4454(arg0) / 2, arg2, (int[]) null, var10);
    }

    @ObfuscatedName("jv.ah(Ljava/lang/String;IIIII)V")
    public void method4467(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method4468(arg3, arg4);
        field3649.setSeed((long) arg5);
        field3646 = 192 + (field3649.nextInt() & 0x1F);
        int[] var7 = new int[arg0.length()];
        int var8 = 0;
        for (int var9 = 0; var9 < arg0.length(); var9++) {
            var7[var9] = var8;
            if ((field3649.nextInt() & 0x3) == 0) {
                var8++;
            }
        }
        this.method4517(arg0, arg1, arg2, var7, (int[]) null);
    }

    @ObfuscatedName("jv.ao(II)V")
    public void method4468(int arg0, int arg1) {
        field3642 = -1;
        field3640 = -1;
        field3632 = arg1;
        field3643 = arg1;
        field3644 = arg0;
        field3636 = arg0;
        field3646 = 256;
        field3647 = 0;
        field3648 = 0;
    }

    @ObfuscatedName("jv.al(Ljava/lang/String;)V")
    public void method4508(String arg0) {
        try {
            if (arg0.startsWith("col=")) {
                field3636 = class272.method153(arg0.substring(4), 16);
            } else if (arg0.equals("/col")) {
                field3636 = field3644;
            } else if (arg0.startsWith("str=")) {
                field3642 = class272.method153(arg0.substring(4), 16);
            } else if (arg0.equals("str")) {
                field3642 = 8388608;
            } else if (arg0.equals("/str")) {
                field3642 = -1;
            } else if (arg0.startsWith("u=")) {
                field3640 = class272.method153(arg0.substring(2), 16);
            } else if (arg0.equals("u")) {
                field3640 = 0;
            } else if (arg0.equals("/u")) {
                field3640 = -1;
            } else if (arg0.startsWith("shad=")) {
                field3643 = class272.method153(arg0.substring(5), 16);
            } else if (arg0.equals("shad")) {
                field3643 = 0;
            } else if (arg0.equals("/shad")) {
                field3643 = field3632;
            } else if (arg0.equals("br")) {
                this.method4468(field3644, field3632);
            }
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("jv.ae(Ljava/lang/String;I)V")
    public void method4470(String arg0, int arg1) {
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
            field3647 = (arg1 - this.method4454(arg0) << 8) / var3;
        }
    }

    @ObfuscatedName("jv.ax(Ljava/lang/String;II)V")
    public void method4471(String arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field3645;
        int var5 = -1;
        int var6 = -1;
        for (int var7 = 0; var7 < arg0.length(); var7++) {
            if (arg0.charAt(var7) != 0) {
                char var8 = (char) (class268.method1607(arg0.charAt(var7)) & 0xFF);
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
                                        int var11 = class272.method4007(var10, 10, true);
                                        class286 var13 = Statics.field3638[var11];
                                        var13.method4734(arg1, this.field3645 + var4 - var13.field3763);
                                        arg1 += var13.field3757;
                                        var6 = -1;
                                    } catch (Exception var18) {
                                    }
                                } else {
                                    this.method4508(var9);
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
                        if (this.field3639 != null && var6 != -1) {
                            arg1 += this.field3639[(var6 << 8) + var8];
                        }
                        int var15 = this.field3629[var8];
                        int var16 = this.field3641[var8];
                        if (var8 == ' ') {
                            if (field3647 > 0) {
                                field3648 += field3647;
                                arg1 += field3648 >> 8;
                                field3648 &= 0xFF;
                            }
                        } else if (field3646 == 256) {
                            if (field3643 != -1) {
                                method4474(this.field3630[var8], this.field3633[var8] + arg1 + 1, this.field3634[var8] + var4 + 1, var15, var16, field3643);
                            }
                            this.method4445(this.field3630[var8], this.field3633[var8] + arg1, this.field3634[var8] + var4, var15, var16, field3636);
                        } else {
                            if (field3643 != -1) {
                                method4528(this.field3630[var8], this.field3633[var8] + arg1 + 1, this.field3634[var8] + var4 + 1, var15, var16, field3643, field3646);
                            }
                            this.method4443(this.field3630[var8], this.field3633[var8] + arg1, this.field3634[var8] + var4, var15, var16, field3636, field3646);
                        }
                        int var17 = this.field3635[var8];
                        if (field3642 != -1) {
                            method4658(arg1, (int) ((double) this.field3645 * 0.7D) + var4, var17, field3642);
                        }
                        if (field3640 != -1) {
                            method4658(arg1, this.field3645 + var4 + 1, var17, field3640);
                        }
                        arg1 += var17;
                        var6 = var8;
                    }
                }
            }
        }
    }

    @ObfuscatedName("jv.az(Ljava/lang/String;II[I[I)V")
    public void method4517(String arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var6 = arg2 - this.field3645;
        int var7 = -1;
        int var8 = -1;
        int var9 = 0;
        for (int var10 = 0; var10 < arg0.length(); var10++) {
            if (arg0.charAt(var10) != 0) {
                char var11 = (char) (class268.method1607(arg0.charAt(var10)) & 0xFF);
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
                                        int var16 = class272.method4007(var15, 10, true);
                                        class286 var18 = Statics.field3638[var16];
                                        var18.method4734(arg1 + var13, this.field3645 + var6 - var18.field3763 + var14);
                                        arg1 += var18.field3757;
                                        var8 = -1;
                                    } catch (Exception var25) {
                                    }
                                } else {
                                    this.method4508(var12);
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
                        if (this.field3639 != null && var8 != -1) {
                            arg1 += this.field3639[(var8 << 8) + var11];
                        }
                        int var20 = this.field3629[var11];
                        int var21 = this.field3641[var11];
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
                            if (field3647 > 0) {
                                field3648 += field3647;
                                arg1 += field3648 >> 8;
                                field3648 &= 0xFF;
                            }
                        } else if (field3646 == 256) {
                            if (field3643 != -1) {
                                method4474(this.field3630[var11], this.field3633[var11] + arg1 + 1 + var22, this.field3634[var11] + var6 + 1 + var23, var20, var21, field3643);
                            }
                            this.method4445(this.field3630[var11], this.field3633[var11] + arg1 + var22, this.field3634[var11] + var6 + var23, var20, var21, field3636);
                        } else {
                            if (field3643 != -1) {
                                method4528(this.field3630[var11], this.field3633[var11] + arg1 + 1 + var22, this.field3634[var11] + var6 + 1 + var23, var20, var21, field3643, field3646);
                            }
                            this.method4443(this.field3630[var11], this.field3633[var11] + arg1 + var22, this.field3634[var11] + var6 + var23, var20, var21, field3636, field3646);
                        }
                        int var24 = this.field3635[var11];
                        if (field3642 != -1) {
                            method4658(arg1, (int) ((double) this.field3645 * 0.7D) + var6, var24, field3642);
                        }
                        if (field3640 != -1) {
                            method4658(arg1, this.field3645 + var6, var24, field3640);
                        }
                        arg1 += var24;
                        var8 = var11;
                    }
                }
            }
        }
    }

    @ObfuscatedName("jv.aw([BIIIII)V")
    public static void method4474(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = Statics.field3739 * arg2 + arg1;
        int var7 = Statics.field3739 - arg3;
        int var8 = 0;
        int var9 = 0;
        if (arg2 < field3742) {
            int var10 = field3742 - arg2;
            arg4 -= var10;
            arg2 = field3742;
            var9 += arg3 * var10;
            var6 += Statics.field3739 * var10;
        }
        if (arg2 + arg4 > field3745) {
            arg4 -= arg2 + arg4 - field3745;
        }
        if (arg1 < field3744) {
            int var11 = field3744 - arg1;
            arg3 -= var11;
            arg1 = field3744;
            var9 += var11;
            var6 += var11;
            var8 += var11;
            var7 += var11;
        }
        if (arg1 + arg3 > field3740) {
            int var12 = arg1 + arg3 - field3740;
            arg3 -= var12;
            var8 += var12;
            var7 += var12;
        }
        if (arg3 > 0 && arg4 > 0) {
            method4479(Statics.field3743, arg0, arg5, var9, var6, arg3, arg4, var7, var8);
        }
    }

    @ObfuscatedName("jv.av([I[BIIIIIII)V")
    public static void method4479(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @ObfuscatedName("jv.ac([BIIIIII)V")
    public static void method4528(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = Statics.field3739 * arg2 + arg1;
        int var8 = Statics.field3739 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < field3742) {
            int var11 = field3742 - arg2;
            arg4 -= var11;
            arg2 = field3742;
            var10 += arg3 * var11;
            var7 += Statics.field3739 * var11;
        }
        if (arg2 + arg4 > field3745) {
            arg4 -= arg2 + arg4 - field3745;
        }
        if (arg1 < field3744) {
            int var12 = field3744 - arg1;
            arg3 -= var12;
            arg1 = field3744;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > field3740) {
            int var13 = arg1 + arg3 - field3740;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            method4477(Statics.field3743, arg0, arg5, var10, var7, arg3, arg4, var8, var9, arg6);
        }
    }

    @ObfuscatedName("jv.ak([I[BIIIIIIII)V")
    public static void method4477(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
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

    @ObfuscatedName("jv.n([BIIIIII)V")
    public abstract void method4443(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @ObfuscatedName("jv.e([BIIIII)V")
    public abstract void method4445(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5);
}
