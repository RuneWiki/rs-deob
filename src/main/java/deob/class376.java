package deob;

import java.util.Random;

@ObfuscatedName("nw")
public abstract class class376 extends class484 {

    @ObfuscatedName("nw.f")
    public byte[][] field4423 = new byte[256][];

    @ObfuscatedName("nw.w")
    public int[] field4415;

    @ObfuscatedName("nw.v")
    public int[] field4413;

    @ObfuscatedName("nw.s")
    public int[] field4416;

    @ObfuscatedName("nw.z")
    public int[] field4417;

    @ObfuscatedName("nw.j")
    public int[] field4418;

    @ObfuscatedName("nw.i")
    public int field4419 = 0;

    @ObfuscatedName("nw.n")
    public int field4420;

    @ObfuscatedName("nw.l")
    public int field4421;

    @ObfuscatedName("nw.c")
    public byte[] field4431;

    @ObfuscatedName("nw.r")
    public static int field4424 = -1;

    @ObfuscatedName("nw.b")
    public static int field4425 = -1;

    @ObfuscatedName("nw.m")
    public static int field4426 = -1;

    @ObfuscatedName("nw.t")
    public static int field4427 = -1;

    @ObfuscatedName("nw.h")
    public static int field4428 = 0;

    @ObfuscatedName("nw.p")
    public static int field4433 = 0;

    @ObfuscatedName("nw.o")
    public static int field4429 = 256;

    @ObfuscatedName("nw.u")
    public static int field4430 = 0;

    @ObfuscatedName("nw.x")
    public static int field4422 = 0;

    @ObfuscatedName("nw.a")
    public static Random field4432 = new Random();

    @ObfuscatedName("nw.q")
    public static String[] field4434 = new String[100];

    public class376(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, byte[][] arg6) {
        this.field4417 = arg1;
        this.field4418 = arg2;
        this.field4413 = arg3;
        this.field4416 = arg4;
        this.method6626(arg0);
        this.field4423 = arg6;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        for (int var10 = 0; var10 < 256; var10++) {
            if (this.field4418[var10] < var8 && this.field4416[var10] != 0) {
                var8 = this.field4418[var10];
            }
            if (this.field4418[var10] + this.field4416[var10] > var9) {
                var9 = this.field4418[var10] + this.field4416[var10];
            }
        }
        this.field4420 = this.field4419 - var8;
        this.field4421 = var9 - this.field4419;
    }

    public class376(byte[] arg0) {
        this.method6626(arg0);
    }

    @ObfuscatedName("nw.i([B)V")
    public void method6626(byte[] arg0) {
        this.field4415 = new int[256];
        if (arg0.length == 257) {
            for (int var2 = 0; var2 < this.field4415.length; var2++) {
                this.field4415[var2] = arg0[var2] & 0xFF;
            }
            this.field4419 = arg0[256] & 0xFF;
            return;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < 256; var4++) {
            this.field4415[var4] = arg0[var3++] & 0xFF;
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
        this.field4431 = new byte[65536];
        for (int var17 = 0; var17 < 256; var17++) {
            if (var17 != 32 && var17 != 160) {
                for (int var18 = 0; var18 < 256; var18++) {
                    if (var18 != 32 && var18 != 160) {
                        this.field4431[(var17 << 8) + var18] = (byte) method6705(var9, var13, var6, this.field4415, var5, var17, var18);
                    }
                }
            }
        }
        this.field4419 = var5[32] + var6[32];
    }

    @ObfuscatedName("nw.n([[B[[B[I[I[III)I")
    public static int method6705(byte[][] arg0, byte[][] arg1, int[] arg2, int[] arg3, int[] arg4, int arg5, int arg6) {
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

    @ObfuscatedName("nw.l(C)I")
    public int method6628(char arg0) {
        if (arg0 == 160) {
            arg0 = ' ';
        }
        return this.field4415[class363.method462(arg0) & 0xFF];
    }

    @ObfuscatedName("nw.k(Ljava/lang/String;)I")
    public int method6629(String arg0) {
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
                                    int var8 = class365.method4987(var7.substring(4));
                                    var4 += Statics.field4414[var8].field5022;
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
                    var4 += this.field4415[(char) (class363.method462(var6) & 0xFF)];
                    if (this.field4431 != null && var3 != -1) {
                        var4 += this.field4431[(var3 << 8) + var6];
                    }
                    var3 = var6;
                }
            }
        }
        return var4;
    }

    @ObfuscatedName("nw.c(Ljava/lang/String;[I[Ljava/lang/String;)I")
    public int method6630(String arg0, int[] arg1, String[] arg2) {
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
                        var4 += this.method6628('<');
                        if (this.field4431 != null && var11 != -1) {
                            var4 += this.field4431[(var11 << 8) + 60];
                        }
                        var11 = '<';
                    } else if (var16.equals("gt")) {
                        var4 += this.method6628('>');
                        if (this.field4431 != null && var11 != -1) {
                            var4 += this.field4431[(var11 << 8) + 62];
                        }
                        var11 = '>';
                    } else if (var16.startsWith("img=")) {
                        try {
                            int var17 = class365.method4987(var16.substring(4));
                            var4 += Statics.field4414[var17].field5022;
                            var11 = 0;
                        } catch (Exception var20) {
                        }
                    }
                    var15 = 0;
                }
                if (var10 == -1) {
                    if (var15 != 0) {
                        var6.append(var15);
                        var4 += this.method6628(var15);
                        if (this.field4431 != null && var11 != -1) {
                            var4 += this.field4431[(var11 << 8) + var15];
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

    @ObfuscatedName("nw.r(Ljava/lang/String;I)I")
    public int method6625(String arg0, int arg1) {
        int var3 = this.method6630(arg0, new int[] { arg1 }, field4434);
        int var4 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = this.method6629(field4434[var5]);
            if (var6 > var4) {
                var4 = var6;
            }
        }
        return var4;
    }

    @ObfuscatedName("nw.b(Ljava/lang/String;I)I")
    public int method6645(String arg0, int arg1) {
        return this.method6630(arg0, new int[] { arg1 }, field4434);
    }

    @ObfuscatedName("nw.m(Ljava/lang/String;)Ljava/lang/String;")
    public static String method6713(String arg0) {
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

    @ObfuscatedName("nw.t(IILjava/lang/String;II)Loj;")
    public class414 method6690(int arg0, int arg1, String arg2, int arg3, int arg4) {
        if (arg2 == null || arg2.length() < arg0 + arg1) {
            return new class414(arg3, arg4, 0, 0);
        }
        int var6 = arg3 - this.method6629(arg2) / 2;
        int var7 = var6 + this.method6629(arg2.substring(0, arg0));
        int var8 = arg4 - this.field4420;
        int var9 = this.method6629(arg2.substring(arg0, arg0 + arg1));
        int var10 = this.field4421 + this.field4420;
        return new class414(var7, var8, var9, var10);
    }

    @ObfuscatedName("nw.h(Ljava/lang/String;IIII)V")
    public void method6634(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method6721(arg3, arg4);
            this.method6661(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("nw.p(Ljava/lang/String;IIIII)V")
    public void method6635(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 != null) {
            this.method6721(arg3, arg4);
            field4429 = arg5;
            this.method6661(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("nw.o(Ljava/lang/String;IIII)V")
    public void method6701(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method6721(arg3, arg4);
            this.method6661(arg0, arg1 - this.method6629(arg0), arg2);
        }
    }

    @ObfuscatedName("nw.u(Ljava/lang/String;IIII)V")
    public void method6658(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method6721(arg3, arg4);
            this.method6661(arg0, arg1 - this.method6629(arg0) / 2, arg2);
        }
    }

    @ObfuscatedName("nw.x(Ljava/lang/String;IIIIIIIII)I")
    public int method6682(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg0 == null) {
            return 0;
        }
        this.method6721(arg5, arg6);
        if (arg9 == 0) {
            arg9 = this.field4419;
        }
        int[] var11 = new int[] { arg3 };
        if (arg4 < this.field4421 + this.field4420 + arg9 && arg4 < arg9 + arg9) {
            var11 = null;
        }
        int var12 = this.method6630(arg0, var11, field4434);
        if (arg8 == 3 && var12 == 1) {
            arg8 = 1;
        }
        int var13;
        if (arg8 == 0) {
            var13 = this.field4420 + arg2;
        } else if (arg8 == 1) {
            var13 = (arg4 - this.field4420 - this.field4421 - (var12 - 1) * arg9) / 2 + this.field4420 + arg2;
        } else if (arg8 == 2) {
            var13 = arg2 + arg4 - this.field4421 - (var12 - 1) * arg9;
        } else {
            int var14 = (arg4 - this.field4420 - this.field4421 - (var12 - 1) * arg9) / (var12 + 1);
            if (var14 < 0) {
                var14 = 0;
            }
            var13 = this.field4420 + arg2 + var14;
            arg9 += var14;
        }
        for (int var15 = 0; var15 < var12; var15++) {
            if (arg7 == 0) {
                this.method6661(field4434[var15], arg1, var13);
            } else if (arg7 == 1) {
                this.method6661(field4434[var15], arg1 + (arg3 - this.method6629(field4434[var15])) / 2, var13);
            } else if (arg7 == 2) {
                this.method6661(field4434[var15], arg1 + arg3 - this.method6629(field4434[var15]), var13);
            } else if (var12 - 1 == var15) {
                this.method6661(field4434[var15], arg1, var13);
            } else {
                this.method6646(field4434[var15], arg3);
                this.method6661(field4434[var15], arg1, var13);
                field4430 = 0;
            }
            var13 += arg9;
        }
        return var12;
    }

    @ObfuscatedName("nw.a(Lnm;IIIII)Lqd;")
    public class448 method6639(class377 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (!arg0.method6726()) {
            this.method6721(arg3, arg4);
            int var7 = arg2 - this.field4419;
            for (int var8 = 0; var8 < arg0.method6729(); var8++) {
                class375 var9 = arg0.method6733(var8);
                if (arg5 != -1 && var9.field4411 > arg5) {
                    return new class448(var9.field4409, var9.field4411);
                }
                char var10 = var9.field4412;
                if (var10 != '\n') {
                    if (arg0.method6734(var8)) {
                        var10 = '*';
                    }
                    if (var10 != '\t') {
                        if (var10 == 160) {
                            var10 = ' ';
                        }
                        int var11 = var9.field4409 + arg1;
                        int var12 = var9.field4411 + var7;
                        int var13 = this.field4413[var10];
                        int var14 = this.field4416[var10];
                        if (field4427 != -1) {
                            this.method6503(this.field4423[var10], this.field4417[var10] + var11 + 1, this.field4418[var10] + var12 + 1, var13, var14, field4427);
                        }
                        this.method6503(this.field4423[var10], this.field4417[var10] + var11, this.field4418[var10] + var12, var13, var14, field4433);
                    }
                }
            }
        }
        return arg0.method6732();
    }

    @ObfuscatedName("nw.q(Ljava/lang/String;IIIII)V")
    public void method6640(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method6721(arg3, arg4);
        int[] var7 = new int[arg0.length()];
        for (int var8 = 0; var8 < arg0.length(); var8++) {
            var7[var8] = (int) (Math.sin((double) arg5 / 5.0D + (double) var8 / 2.0D) * 5.0D);
        }
        this.method6648(arg0, arg1 - this.method6629(arg0) / 2, arg2, (int[]) null, var7);
    }

    @ObfuscatedName("nw.d(Ljava/lang/String;IIIII)V")
    public void method6636(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method6721(arg3, arg4);
        int[] var7 = new int[arg0.length()];
        int[] var8 = new int[arg0.length()];
        for (int var9 = 0; var9 < arg0.length(); var9++) {
            var7[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 5.0D) * 5.0D);
            var8[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 3.0D) * 5.0D);
        }
        this.method6648(arg0, arg1 - this.method6629(arg0) / 2, arg2, var7, var8);
    }

    @ObfuscatedName("nw.e(Ljava/lang/String;IIIIII)V")
    public void method6638(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 == null) {
            return;
        }
        this.method6721(arg3, arg4);
        double var8 = 7.0D - (double) arg6 / 8.0D;
        if (var8 < 0.0D) {
            var8 = 0.0D;
        }
        int[] var10 = new int[arg0.length()];
        for (int var11 = 0; var11 < arg0.length(); var11++) {
            var10[var11] = (int) (Math.sin((double) arg5 / 1.0D + (double) var11 / 1.5D) * var8);
        }
        this.method6648(arg0, arg1 - this.method6629(arg0) / 2, arg2, (int[]) null, var10);
    }

    @ObfuscatedName("nw.g(Ljava/lang/String;IIIII)V")
    public void method6643(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method6721(arg3, arg4);
        field4432.setSeed((long) arg5);
        field4429 = 192 + (field4432.nextInt() & 0x1F);
        int[] var7 = new int[arg0.length()];
        int var8 = 0;
        for (int var9 = 0; var9 < arg0.length(); var9++) {
            var7[var9] = var8;
            if ((field4432.nextInt() & 0x3) == 0) {
                var8++;
            }
        }
        this.method6648(arg0, arg1, arg2, var7, (int[]) null);
    }

    @ObfuscatedName("nw.y(II)V")
    public void method6721(int arg0, int arg1) {
        field4424 = -1;
        field4425 = -1;
        field4426 = arg1;
        field4427 = arg1;
        field4428 = arg0;
        field4433 = arg0;
        field4429 = 256;
        field4430 = 0;
        field4422 = 0;
    }

    @ObfuscatedName("nw.af(Ljava/lang/String;)V")
    public void method6641(String arg0) {
        try {
            if (arg0.startsWith("col=")) {
                field4433 = class365.method451(arg0.substring(4), 16);
            } else if (arg0.equals("/col")) {
                field4433 = field4428;
            } else if (arg0.startsWith("str=")) {
                field4424 = class365.method451(arg0.substring(4), 16);
            } else if (arg0.equals("str")) {
                field4424 = 8388608;
            } else if (arg0.equals("/str")) {
                field4424 = -1;
            } else if (arg0.startsWith("u=")) {
                field4425 = class365.method451(arg0.substring(2), 16);
            } else if (arg0.equals("u")) {
                field4425 = 0;
            } else if (arg0.equals("/u")) {
                field4425 = -1;
            } else if (arg0.startsWith("shad=")) {
                field4427 = class365.method451(arg0.substring(5), 16);
            } else if (arg0.equals("shad")) {
                field4427 = 0;
            } else if (arg0.equals("/shad")) {
                field4427 = field4426;
            } else if (arg0.equals("br")) {
                this.method6721(field4428, field4426);
            }
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("nw.aa(Ljava/lang/String;I)V")
    public void method6646(String arg0, int arg1) {
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
            field4430 = (arg1 - this.method6629(arg0) << 8) / var3;
        }
    }

    @ObfuscatedName("nw.ai(Ljava/lang/String;II)V")
    public void method6661(String arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field4419;
        int var5 = -1;
        int var6 = -1;
        for (int var7 = 0; var7 < arg0.length(); var7++) {
            if (arg0.charAt(var7) != 0) {
                char var8 = (char) (class363.method462(arg0.charAt(var7)) & 0xFF);
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
                                        int var10 = class365.method4987(var9.substring(4));
                                        class487 var11 = Statics.field4414[var10];
                                        var11.method8374(arg1, this.field4419 + var4 - var11.field5025);
                                        arg1 += var11.field5022;
                                        var6 = -1;
                                    } catch (Exception var16) {
                                    }
                                } else {
                                    this.method6641(var9);
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
                        if (this.field4431 != null && var6 != -1) {
                            arg1 += this.field4431[(var6 << 8) + var8];
                        }
                        int var13 = this.field4413[var8];
                        int var14 = this.field4416[var8];
                        if (var8 == ' ') {
                            if (field4430 > 0) {
                                field4422 += field4430;
                                arg1 += field4422 >> 8;
                                field4422 &= 0xFF;
                            }
                        } else if (field4429 == 256) {
                            if (field4427 != -1) {
                                method6649(this.field4423[var8], this.field4417[var8] + arg1 + 1, this.field4418[var8] + var4 + 1, var13, var14, field4427);
                            }
                            this.method6503(this.field4423[var8], this.field4417[var8] + arg1, this.field4418[var8] + var4, var13, var14, field4433);
                        } else {
                            if (field4427 != -1) {
                                method6651(this.field4423[var8], this.field4417[var8] + arg1 + 1, this.field4418[var8] + var4 + 1, var13, var14, field4427, field4429);
                            }
                            this.method6504(this.field4423[var8], this.field4417[var8] + arg1, this.field4418[var8] + var4, var13, var14, field4433, field4429);
                        }
                        int var15 = this.field4415[var8];
                        if (field4424 != -1) {
                            method8328(arg1, (int) ((double) this.field4419 * 0.7D) + var4, var15, field4424);
                        }
                        if (field4425 != -1) {
                            method8328(arg1, this.field4419 + var4 + 1, var15, field4425);
                        }
                        arg1 += var15;
                        var6 = var8;
                    }
                }
            }
        }
    }

    @ObfuscatedName("nw.ag(Ljava/lang/String;II[I[I)V")
    public void method6648(String arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var6 = arg2 - this.field4419;
        int var7 = -1;
        int var8 = -1;
        int var9 = 0;
        for (int var10 = 0; var10 < arg0.length(); var10++) {
            if (arg0.charAt(var10) != 0) {
                char var11 = (char) (class363.method462(arg0.charAt(var10)) & 0xFF);
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
                                        int var15 = class365.method4987(var12.substring(4));
                                        class487 var16 = Statics.field4414[var15];
                                        var16.method8374(arg1 + var13, this.field4419 + var6 - var16.field5025 + var14);
                                        arg1 += var16.field5022;
                                        var8 = -1;
                                    } catch (Exception var23) {
                                    }
                                } else {
                                    this.method6641(var12);
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
                        if (this.field4431 != null && var8 != -1) {
                            arg1 += this.field4431[(var8 << 8) + var11];
                        }
                        int var18 = this.field4413[var11];
                        int var19 = this.field4416[var11];
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
                            if (field4430 > 0) {
                                field4422 += field4430;
                                arg1 += field4422 >> 8;
                                field4422 &= 0xFF;
                            }
                        } else if (field4429 == 256) {
                            if (field4427 != -1) {
                                method6649(this.field4423[var11], this.field4417[var11] + arg1 + 1 + var20, this.field4418[var11] + var6 + 1 + var21, var18, var19, field4427);
                            }
                            this.method6503(this.field4423[var11], this.field4417[var11] + arg1 + var20, this.field4418[var11] + var6 + var21, var18, var19, field4433);
                        } else {
                            if (field4427 != -1) {
                                method6651(this.field4423[var11], this.field4417[var11] + arg1 + 1 + var20, this.field4418[var11] + var6 + 1 + var21, var18, var19, field4427, field4429);
                            }
                            this.method6504(this.field4423[var11], this.field4417[var11] + arg1 + var20, this.field4418[var11] + var6 + var21, var18, var19, field4433, field4429);
                        }
                        int var22 = this.field4415[var11];
                        if (field4424 != -1) {
                            method8328(arg1, (int) ((double) this.field4419 * 0.7D) + var6, var22, field4424);
                        }
                        if (field4425 != -1) {
                            method8328(arg1, this.field4419 + var6, var22, field4425);
                        }
                        arg1 += var22;
                        var8 = var11;
                    }
                }
            }
        }
    }

    @ObfuscatedName("nw.aw([BIIIII)V")
    public static void method6649(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = Statics.field5011 * arg2 + arg1;
        int var7 = Statics.field5011 - arg3;
        int var8 = 0;
        int var9 = 0;
        if (arg2 < field5009) {
            int var10 = field5009 - arg2;
            arg4 -= var10;
            arg2 = field5009;
            var9 += arg3 * var10;
            var6 += Statics.field5011 * var10;
        }
        if (arg2 + arg4 > field5010) {
            arg4 -= arg2 + arg4 - field5010;
        }
        if (arg1 < field5006) {
            int var11 = field5006 - arg1;
            arg3 -= var11;
            arg1 = field5006;
            var9 += var11;
            var6 += var11;
            var8 += var11;
            var7 += var11;
        }
        if (arg1 + arg3 > field5007) {
            int var12 = arg1 + arg3 - field5007;
            arg3 -= var12;
            var8 += var12;
            var7 += var12;
        }
        if (arg3 > 0 && arg4 > 0) {
            method6707(Statics.field5012, arg0, arg5, var9, var6, arg3, arg4, var7, var8);
        }
    }

    @ObfuscatedName("nw.ar([I[BIIIIIII)V")
    public static void method6707(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @ObfuscatedName("nw.al([BIIIIII)V")
    public static void method6651(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = Statics.field5011 * arg2 + arg1;
        int var8 = Statics.field5011 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < field5009) {
            int var11 = field5009 - arg2;
            arg4 -= var11;
            arg2 = field5009;
            var10 += arg3 * var11;
            var7 += Statics.field5011 * var11;
        }
        if (arg2 + arg4 > field5010) {
            arg4 -= arg2 + arg4 - field5010;
        }
        if (arg1 < field5006) {
            int var12 = field5006 - arg1;
            arg3 -= var12;
            arg1 = field5006;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > field5007) {
            int var13 = arg1 + arg3 - field5007;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            method6723(Statics.field5012, arg0, arg5, var10, var7, arg3, arg4, var8, var9, arg6);
        }
    }

    @ObfuscatedName("nw.at([I[BIIIIIIII)V")
    public static void method6723(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
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

    @ObfuscatedName("nw.f([BIIIII)V")
    public abstract void method6503(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @ObfuscatedName("nw.w([BIIIIII)V")
    public abstract void method6504(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);
}
