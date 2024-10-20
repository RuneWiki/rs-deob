package deob;

import java.util.Random;

@ObfuscatedName("jk")
public abstract class class266 extends class283 {

    @ObfuscatedName("jk.j")
    public byte[][] field3639 = new byte[256][];

    @ObfuscatedName("jk.h")
    public int[] field3627;

    @ObfuscatedName("jk.f")
    public int[] field3638;

    @ObfuscatedName("jk.p")
    public int[] field3629;

    @ObfuscatedName("jk.x")
    public int[] field3630;

    @ObfuscatedName("jk.g")
    public int[] field3631;

    @ObfuscatedName("jk.c")
    public int field3632 = 0;

    @ObfuscatedName("jk.l")
    public int field3633;

    @ObfuscatedName("jk.w")
    public int field3634;

    @ObfuscatedName("jk.o")
    public byte[] field3640;

    @ObfuscatedName("jk.m")
    public static int field3647 = -1;

    @ObfuscatedName("jk.i")
    public static int field3643 = -1;

    @ObfuscatedName("jk.s")
    public static int field3628 = -1;

    @ObfuscatedName("jk.r")
    public static int field3636 = -1;

    @ObfuscatedName("jk.e")
    public static int field3641 = 0;

    @ObfuscatedName("jk.a")
    public static int field3642 = 0;

    @ObfuscatedName("jk.v")
    public static int field3645 = 256;

    @ObfuscatedName("jk.t")
    public static int field3644 = 0;

    @ObfuscatedName("jk.y")
    public static int field3626 = 0;

    @ObfuscatedName("jk.z")
    public static Random field3646 = new Random();

    @ObfuscatedName("jk.u")
    public static String[] field3637 = new String[100];

    public class266(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, byte[][] arg6) {
        this.field3630 = arg1;
        this.field3631 = arg2;
        this.field3638 = arg3;
        this.field3629 = arg4;
        this.method4412(arg0);
        this.field3639 = arg6;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        for (int var10 = 0; var10 < 256; var10++) {
            if (this.field3631[var10] < var8 && this.field3629[var10] != 0) {
                var8 = this.field3631[var10];
            }
            if (this.field3631[var10] + this.field3629[var10] > var9) {
                var9 = this.field3631[var10] + this.field3629[var10];
            }
        }
        this.field3633 = this.field3632 - var8;
        this.field3634 = var9 - this.field3632;
    }

    public class266(byte[] arg0) {
        this.method4412(arg0);
    }

    @ObfuscatedName("jk.w([B)V")
    public void method4412(byte[] arg0) {
        this.field3627 = new int[256];
        if (arg0.length == 257) {
            for (int var2 = 0; var2 < this.field3627.length; var2++) {
                this.field3627[var2] = arg0[var2] & 0xFF;
            }
            this.field3632 = arg0[256] & 0xFF;
            return;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < 256; var4++) {
            this.field3627[var4] = arg0[var3++] & 0xFF;
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
        this.field3640 = new byte[65536];
        for (int var17 = 0; var17 < 256; var17++) {
            if (var17 != 32 && var17 != 160) {
                for (int var18 = 0; var18 < 256; var18++) {
                    if (var18 != 32 && var18 != 160) {
                        this.field3640[(var17 << 8) + var18] = (byte) method4436(var9, var13, var6, this.field3627, var5, var17, var18);
                    }
                }
            }
        }
        this.field3632 = var5[32] + var6[32];
    }

    @ObfuscatedName("jk.b([[B[[B[I[I[III)I")
    public static int method4436(byte[][] arg0, byte[][] arg1, int[] arg2, int[] arg3, int[] arg4, int arg5, int arg6) {
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

    @ObfuscatedName("jk.o(C)I")
    public int method4488(char arg0) {
        if (arg0 == 160) {
            arg0 = ' ';
        }
        return this.field3627[class268.method135(arg0) & 0xFF];
    }

    @ObfuscatedName("jk.m(Ljava/lang/String;)I")
    public int method4415(String arg0) {
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
                                    int var8 = class272.method4199(var7.substring(4));
                                    var4 += Statics.field3635[var8].field3766;
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
                    var4 += this.field3627[(char) (class268.method135(var6) & 0xFF)];
                    if (this.field3640 != null && var3 != -1) {
                        var4 += this.field3640[(var3 << 8) + var6];
                    }
                    var3 = var6;
                }
            }
        }
        return var4;
    }

    @ObfuscatedName("jk.e(Ljava/lang/String;[I[Ljava/lang/String;)I")
    public int method4416(String arg0, int[] arg1, String[] arg2) {
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
                        var4 += this.method4488('<');
                        if (this.field3640 != null && var11 != -1) {
                            var4 += this.field3640[(var11 << 8) + 60];
                        }
                        var11 = '<';
                    } else if (var16.equals("gt")) {
                        var4 += this.method4488('>');
                        if (this.field3640 != null && var11 != -1) {
                            var4 += this.field3640[(var11 << 8) + 62];
                        }
                        var11 = '>';
                    } else if (var16.startsWith("img=")) {
                        try {
                            String var17 = var16.substring(4);
                            int var18 = class272.method150(var17, 10, true);
                            var4 += Statics.field3635[var18].field3766;
                            var11 = 0;
                        } catch (Exception var22) {
                        }
                    }
                    var15 = 0;
                }
                if (var10 == -1) {
                    if (var15 != 0) {
                        var6.append(var15);
                        var4 += this.method4488(var15);
                        if (this.field3640 != null && var11 != -1) {
                            var4 += this.field3640[(var11 << 8) + var15];
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

    @ObfuscatedName("jk.a(Ljava/lang/String;I)I")
    public int method4417(String arg0, int arg1) {
        int var3 = this.method4416(arg0, new int[] { arg1 }, field3637);
        int var4 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = this.method4415(field3637[var5]);
            if (var6 > var4) {
                var4 = var6;
            }
        }
        return var4;
    }

    @ObfuscatedName("jk.v(Ljava/lang/String;I)I")
    public int method4418(String arg0, int arg1) {
        return this.method4416(arg0, new int[] { arg1 }, field3637);
    }

    @ObfuscatedName("jk.t(Ljava/lang/String;)Ljava/lang/String;")
    public static String method4419(String arg0) {
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

    @ObfuscatedName("jk.y(Ljava/lang/String;IIII)V")
    public void method4420(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method4429(arg3, arg4);
            this.method4435(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("jk.u(Ljava/lang/String;IIIII)V")
    public void method4421(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 != null) {
            this.method4429(arg3, arg4);
            field3645 = arg5;
            this.method4435(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("jk.n(Ljava/lang/String;IIII)V")
    public void method4422(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method4429(arg3, arg4);
            this.method4435(arg0, arg1 - this.method4415(arg0), arg2);
        }
    }

    @ObfuscatedName("jk.d(Ljava/lang/String;IIII)V")
    public void method4476(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method4429(arg3, arg4);
            this.method4435(arg0, arg1 - this.method4415(arg0) / 2, arg2);
        }
    }

    @ObfuscatedName("jk.ax(Ljava/lang/String;IIIIIIIII)I")
    public int method4424(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg0 == null) {
            return 0;
        }
        this.method4429(arg5, arg6);
        if (arg9 == 0) {
            arg9 = this.field3632;
        }
        int[] var11 = new int[] { arg3 };
        if (arg4 < this.field3634 + this.field3633 + arg9 && arg4 < arg9 + arg9) {
            var11 = null;
        }
        int var12 = this.method4416(arg0, var11, field3637);
        if (arg8 == 3 && var12 == 1) {
            arg8 = 1;
        }
        int var13;
        if (arg8 == 0) {
            var13 = this.field3633 + arg2;
        } else if (arg8 == 1) {
            var13 = (arg4 - this.field3633 - this.field3634 - (var12 - 1) * arg9) / 2 + this.field3633 + arg2;
        } else if (arg8 == 2) {
            var13 = arg2 + arg4 - this.field3634 - (var12 - 1) * arg9;
        } else {
            int var14 = (arg4 - this.field3633 - this.field3634 - (var12 - 1) * arg9) / (var12 + 1);
            if (var14 < 0) {
                var14 = 0;
            }
            var13 = this.field3633 + arg2 + var14;
            arg9 += var14;
        }
        for (int var15 = 0; var15 < var12; var15++) {
            if (arg7 == 0) {
                this.method4435(field3637[var15], arg1, var13);
            } else if (arg7 == 1) {
                this.method4435(field3637[var15], arg1 + (arg3 - this.method4415(field3637[var15])) / 2, var13);
            } else if (arg7 == 2) {
                this.method4435(field3637[var15], arg1 + arg3 - this.method4415(field3637[var15]), var13);
            } else if (var12 - 1 == var15) {
                this.method4435(field3637[var15], arg1, var13);
            } else {
                this.method4431(field3637[var15], arg3);
                this.method4435(field3637[var15], arg1, var13);
                field3644 = 0;
            }
            var13 += arg9;
        }
        return var12;
    }

    @ObfuscatedName("jk.ao(Ljava/lang/String;IIIII)V")
    public void method4425(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method4429(arg3, arg4);
        int[] var7 = new int[arg0.length()];
        for (int var8 = 0; var8 < arg0.length(); var8++) {
            var7[var8] = (int) (Math.sin((double) arg5 / 5.0D + (double) var8 / 2.0D) * 5.0D);
        }
        this.method4433(arg0, arg1 - this.method4415(arg0) / 2, arg2, (int[]) null, var7);
    }

    @ObfuscatedName("jk.an(Ljava/lang/String;IIIII)V")
    public void method4426(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method4429(arg3, arg4);
        int[] var7 = new int[arg0.length()];
        int[] var8 = new int[arg0.length()];
        for (int var9 = 0; var9 < arg0.length(); var9++) {
            var7[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 5.0D) * 5.0D);
            var8[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 3.0D) * 5.0D);
        }
        this.method4433(arg0, arg1 - this.method4415(arg0) / 2, arg2, var7, var8);
    }

    @ObfuscatedName("jk.ar(Ljava/lang/String;IIIIII)V")
    public void method4427(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 == null) {
            return;
        }
        this.method4429(arg3, arg4);
        double var8 = 7.0D - (double) arg6 / 8.0D;
        if (var8 < 0.0D) {
            var8 = 0.0D;
        }
        int[] var10 = new int[arg0.length()];
        for (int var11 = 0; var11 < arg0.length(); var11++) {
            var10[var11] = (int) (Math.sin((double) arg5 / 1.0D + (double) var11 / 1.5D) * var8);
        }
        this.method4433(arg0, arg1 - this.method4415(arg0) / 2, arg2, (int[]) null, var10);
    }

    @ObfuscatedName("jk.ag(Ljava/lang/String;IIIII)V")
    public void method4428(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method4429(arg3, arg4);
        field3646.setSeed((long) arg5);
        field3645 = 192 + (field3646.nextInt() & 0x1F);
        int[] var7 = new int[arg0.length()];
        int var8 = 0;
        for (int var9 = 0; var9 < arg0.length(); var9++) {
            var7[var9] = var8;
            if ((field3646.nextInt() & 0x3) == 0) {
                var8++;
            }
        }
        this.method4433(arg0, arg1, arg2, var7, (int[]) null);
    }

    @ObfuscatedName("jk.av(II)V")
    public void method4429(int arg0, int arg1) {
        field3647 = -1;
        field3643 = -1;
        field3628 = arg1;
        field3636 = arg1;
        field3641 = arg0;
        field3642 = arg0;
        field3645 = 256;
        field3644 = 0;
        field3626 = 0;
    }

    @ObfuscatedName("jk.ab(Ljava/lang/String;)V")
    public void method4430(String arg0) {
        try {
            if (arg0.startsWith("col=")) {
                String var2 = arg0.substring(4);
                int var3 = class272.method150(var2, 16, true);
                field3642 = var3;
            } else if (arg0.equals("/col")) {
                field3642 = field3641;
            } else if (arg0.startsWith("str=")) {
                String var4 = arg0.substring(4);
                int var5 = class272.method150(var4, 16, true);
                field3647 = var5;
            } else if (arg0.equals("str")) {
                field3647 = 8388608;
            } else if (arg0.equals("/str")) {
                field3647 = -1;
            } else if (arg0.startsWith("u=")) {
                String var6 = arg0.substring(2);
                int var7 = class272.method150(var6, 16, true);
                field3643 = var7;
            } else if (arg0.equals("u")) {
                field3643 = 0;
            } else if (arg0.equals("/u")) {
                field3643 = -1;
            } else if (arg0.startsWith("shad=")) {
                String var8 = arg0.substring(5);
                int var9 = class272.method150(var8, 16, true);
                field3636 = var9;
            } else if (arg0.equals("shad")) {
                field3636 = 0;
            } else if (arg0.equals("/shad")) {
                field3636 = field3628;
            } else if (arg0.equals("br")) {
                this.method4429(field3641, field3628);
            }
        } catch (Exception var11) {
        }
    }

    @ObfuscatedName("jk.aj(Ljava/lang/String;I)V")
    public void method4431(String arg0, int arg1) {
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
            field3644 = (arg1 - this.method4415(arg0) << 8) / var3;
        }
    }

    @ObfuscatedName("jk.ae(Ljava/lang/String;II)V")
    public void method4435(String arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field3632;
        int var5 = -1;
        int var6 = -1;
        for (int var7 = 0; var7 < arg0.length(); var7++) {
            if (arg0.charAt(var7) != 0) {
                char var8 = (char) (class268.method135(arg0.charAt(var7)) & 0xFF);
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
                                        int var10 = class272.method4199(var9.substring(4));
                                        class286 var11 = Statics.field3635[var10];
                                        var11.method4681(arg1, this.field3632 + var4 - var11.field3767);
                                        arg1 += var11.field3766;
                                        var6 = -1;
                                    } catch (Exception var16) {
                                    }
                                } else {
                                    this.method4430(var9);
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
                        if (this.field3640 != null && var6 != -1) {
                            arg1 += this.field3640[(var6 << 8) + var8];
                        }
                        int var13 = this.field3638[var8];
                        int var14 = this.field3629[var8];
                        if (var8 == ' ') {
                            if (field3644 > 0) {
                                field3626 += field3644;
                                arg1 += field3626 >> 8;
                                field3626 &= 0xFF;
                            }
                        } else if (field3645 == 256) {
                            if (field3636 != -1) {
                                method4477(this.field3639[var8], this.field3630[var8] + arg1 + 1, this.field3631[var8] + var4 + 1, var13, var14, field3636);
                            }
                            this.method4408(this.field3639[var8], this.field3630[var8] + arg1, this.field3631[var8] + var4, var13, var14, field3642);
                        } else {
                            if (field3636 != -1) {
                                method4464(this.field3639[var8], this.field3630[var8] + arg1 + 1, this.field3631[var8] + var4 + 1, var13, var14, field3636, field3645);
                            }
                            this.method4406(this.field3639[var8], this.field3630[var8] + arg1, this.field3631[var8] + var4, var13, var14, field3642, field3645);
                        }
                        int var15 = this.field3627[var8];
                        if (field3647 != -1) {
                            method4618(arg1, (int) ((double) this.field3632 * 0.7D) + var4, var15, field3647);
                        }
                        if (field3643 != -1) {
                            method4618(arg1, this.field3632 + var4 + 1, var15, field3643);
                        }
                        arg1 += var15;
                        var6 = var8;
                    }
                }
            }
        }
    }

    @ObfuscatedName("jk.at(Ljava/lang/String;II[I[I)V")
    public void method4433(String arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var6 = arg2 - this.field3632;
        int var7 = -1;
        int var8 = -1;
        int var9 = 0;
        for (int var10 = 0; var10 < arg0.length(); var10++) {
            if (arg0.charAt(var10) != 0) {
                char var11 = (char) (class268.method135(arg0.charAt(var10)) & 0xFF);
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
                                        int var16 = class272.method150(var15, 10, true);
                                        class286 var18 = Statics.field3635[var16];
                                        var18.method4681(arg1 + var13, this.field3632 + var6 - var18.field3767 + var14);
                                        arg1 += var18.field3766;
                                        var8 = -1;
                                    } catch (Exception var25) {
                                    }
                                } else {
                                    this.method4430(var12);
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
                        if (this.field3640 != null && var8 != -1) {
                            arg1 += this.field3640[(var8 << 8) + var11];
                        }
                        int var20 = this.field3638[var11];
                        int var21 = this.field3629[var11];
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
                            if (field3644 > 0) {
                                field3626 += field3644;
                                arg1 += field3626 >> 8;
                                field3626 &= 0xFF;
                            }
                        } else if (field3645 == 256) {
                            if (field3636 != -1) {
                                method4477(this.field3639[var11], this.field3630[var11] + arg1 + 1 + var22, this.field3631[var11] + var6 + 1 + var23, var20, var21, field3636);
                            }
                            this.method4408(this.field3639[var11], this.field3630[var11] + arg1 + var22, this.field3631[var11] + var6 + var23, var20, var21, field3642);
                        } else {
                            if (field3636 != -1) {
                                method4464(this.field3639[var11], this.field3630[var11] + arg1 + 1 + var22, this.field3631[var11] + var6 + 1 + var23, var20, var21, field3636, field3645);
                            }
                            this.method4406(this.field3639[var11], this.field3630[var11] + arg1 + var22, this.field3631[var11] + var6 + var23, var20, var21, field3642, field3645);
                        }
                        int var24 = this.field3627[var11];
                        if (field3647 != -1) {
                            method4618(arg1, (int) ((double) this.field3632 * 0.7D) + var6, var24, field3647);
                        }
                        if (field3643 != -1) {
                            method4618(arg1, this.field3632 + var6, var24, field3643);
                        }
                        arg1 += var24;
                        var8 = var11;
                    }
                }
            }
        }
    }

    @ObfuscatedName("jk.as([BIIIII)V")
    public static void method4477(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = Statics.field3744 * arg2 + arg1;
        int var7 = Statics.field3744 - arg3;
        int var8 = 0;
        int var9 = 0;
        if (arg2 < field3743) {
            int var10 = field3743 - arg2;
            arg4 -= var10;
            arg2 = field3743;
            var9 += arg3 * var10;
            var6 += Statics.field3744 * var10;
        }
        if (arg2 + arg4 > field3746) {
            arg4 -= arg2 + arg4 - field3746;
        }
        if (arg1 < field3748) {
            int var11 = field3748 - arg1;
            arg3 -= var11;
            arg1 = field3748;
            var9 += var11;
            var6 += var11;
            var8 += var11;
            var7 += var11;
        }
        if (arg1 + arg3 > field3747) {
            int var12 = arg1 + arg3 - field3747;
            arg3 -= var12;
            var8 += var12;
            var7 += var12;
        }
        if (arg3 > 0 && arg4 > 0) {
            method4438(Statics.field3749, arg0, arg5, var9, var6, arg3, arg4, var7, var8);
        }
    }

    @ObfuscatedName("jk.af([I[BIIIIIII)V")
    public static void method4438(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @ObfuscatedName("jk.au([BIIIIII)V")
    public static void method4464(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = Statics.field3744 * arg2 + arg1;
        int var8 = Statics.field3744 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < field3743) {
            int var11 = field3743 - arg2;
            arg4 -= var11;
            arg2 = field3743;
            var10 += arg3 * var11;
            var7 += Statics.field3744 * var11;
        }
        if (arg2 + arg4 > field3746) {
            arg4 -= arg2 + arg4 - field3746;
        }
        if (arg1 < field3748) {
            int var12 = field3748 - arg1;
            arg3 -= var12;
            arg1 = field3748;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > field3747) {
            int var13 = arg1 + arg3 - field3747;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            method4437(Statics.field3749, arg0, arg5, var10, var7, arg3, arg4, var8, var9, arg6);
        }
    }

    @ObfuscatedName("jk.az([I[BIIIIIIII)V")
    public static void method4437(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
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

    @ObfuscatedName("jk.h([BIIIIII)V")
    public abstract void method4406(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @ObfuscatedName("jk.j([BIIIII)V")
    public abstract void method4408(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5);
}
