package deob;

import java.util.Random;

@ObfuscatedName("ne")
public abstract class class372 extends class477 {

    @ObfuscatedName("ne.h")
    public byte[][] field4401 = new byte[256][];

    @ObfuscatedName("ne.e")
    public int[] field4416;

    @ObfuscatedName("ne.v")
    public int[] field4402;

    @ObfuscatedName("ne.x")
    public int[] field4403;

    @ObfuscatedName("ne.m")
    public int[] field4404;

    @ObfuscatedName("ne.q")
    public int[] field4405;

    @ObfuscatedName("ne.f")
    public int field4408 = 0;

    @ObfuscatedName("ne.r")
    public int field4407;

    @ObfuscatedName("ne.u")
    public int field4418;

    @ObfuscatedName("ne.j")
    public byte[] field4410;

    @ObfuscatedName("ne.g")
    public static int field4411 = -1;

    @ObfuscatedName("ne.i")
    public static int field4417 = -1;

    @ObfuscatedName("ne.o")
    public static int field4406 = -1;

    @ObfuscatedName("ne.n")
    public static int field4414 = -1;

    @ObfuscatedName("ne.k")
    public static int field4415 = 0;

    @ObfuscatedName("ne.a")
    public static int field4413 = 0;

    @ObfuscatedName("ne.s")
    public static int field4412 = 256;

    @ObfuscatedName("ne.l")
    public static int field4419 = 0;

    @ObfuscatedName("ne.t")
    public static int field4400 = 0;

    @ObfuscatedName("ne.c")
    public static Random field4420 = new Random();

    @ObfuscatedName("ne.p")
    public static String[] field4421 = new String[100];

    public class372(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, byte[][] arg6) {
        this.field4404 = arg1;
        this.field4405 = arg2;
        this.field4402 = arg3;
        this.field4403 = arg4;
        this.method6517(arg0);
        this.field4401 = arg6;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        for (int var10 = 0; var10 < 256; var10++) {
            if (this.field4405[var10] < var8 && this.field4403[var10] != 0) {
                var8 = this.field4405[var10];
            }
            if (this.field4405[var10] + this.field4403[var10] > var9) {
                var9 = this.field4405[var10] + this.field4403[var10];
            }
        }
        this.field4407 = this.field4408 - var8;
        this.field4418 = var9 - this.field4408;
    }

    public class372(byte[] arg0) {
        this.method6517(arg0);
    }

    @ObfuscatedName("ne.m([B)V")
    public void method6517(byte[] arg0) {
        this.field4416 = new int[256];
        if (arg0.length == 257) {
            for (int var2 = 0; var2 < this.field4416.length; var2++) {
                this.field4416[var2] = arg0[var2] & 0xFF;
            }
            this.field4408 = arg0[256] & 0xFF;
            return;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < 256; var4++) {
            this.field4416[var4] = arg0[var3++] & 0xFF;
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
        this.field4410 = new byte[65536];
        for (int var17 = 0; var17 < 256; var17++) {
            if (var17 != 32 && var17 != 160) {
                for (int var18 = 0; var18 < 256; var18++) {
                    if (var18 != 32 && var18 != 160) {
                        this.field4410[(var17 << 8) + var18] = (byte) method6546(var9, var13, var6, this.field4416, var5, var17, var18);
                    }
                }
            }
        }
        this.field4408 = var5[32] + var6[32];
    }

    @ObfuscatedName("ne.q([[B[[B[I[I[III)I")
    public static int method6546(byte[][] arg0, byte[][] arg1, int[] arg2, int[] arg3, int[] arg4, int arg5, int arg6) {
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

    @ObfuscatedName("ne.f(C)I")
    public int method6519(char arg0) {
        if (arg0 == 160) {
            arg0 = ' ';
        }
        return this.field4416[class359.method5252(arg0) & 0xFF];
    }

    @ObfuscatedName("ne.r(Ljava/lang/String;)I")
    public int method6568(String arg0) {
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
                                    int var8 = class361.method7156(var7.substring(4));
                                    var4 += Statics.field4409[var8].field5006;
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
                    var4 += this.field4416[(char) (class359.method5252(var6) & 0xFF)];
                    if (this.field4410 != null && var3 != -1) {
                        var4 += this.field4410[(var3 << 8) + var6];
                    }
                    var3 = var6;
                }
            }
        }
        return var4;
    }

    @ObfuscatedName("ne.u(Ljava/lang/String;[I[Ljava/lang/String;)I")
    public int method6521(String arg0, int[] arg1, String[] arg2) {
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
                        var4 += this.method6519('<');
                        if (this.field4410 != null && var11 != -1) {
                            var4 += this.field4410[(var11 << 8) + 60];
                        }
                        var11 = '<';
                    } else if (var16.equals("gt")) {
                        var4 += this.method6519('>');
                        if (this.field4410 != null && var11 != -1) {
                            var4 += this.field4410[(var11 << 8) + 62];
                        }
                        var11 = '>';
                    } else if (var16.startsWith("img=")) {
                        try {
                            int var17 = class361.method7156(var16.substring(4));
                            var4 += Statics.field4409[var17].field5006;
                            var11 = 0;
                        } catch (Exception var20) {
                        }
                    }
                    var15 = 0;
                }
                if (var10 == -1) {
                    if (var15 != 0) {
                        var6.append(var15);
                        var4 += this.method6519(var15);
                        if (this.field4410 != null && var11 != -1) {
                            var4 += this.field4410[(var11 << 8) + var15];
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

    @ObfuscatedName("ne.b(Ljava/lang/String;I)I")
    public int method6522(String arg0, int arg1) {
        int var3 = this.method6521(arg0, new int[] { arg1 }, field4421);
        int var4 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = this.method6568(field4421[var5]);
            if (var6 > var4) {
                var4 = var6;
            }
        }
        return var4;
    }

    @ObfuscatedName("ne.j(Ljava/lang/String;I)I")
    public int method6523(String arg0, int arg1) {
        return this.method6521(arg0, new int[] { arg1 }, field4421);
    }

    @ObfuscatedName("ne.g(Ljava/lang/String;)Ljava/lang/String;")
    public static String method6553(String arg0) {
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

    @ObfuscatedName("ne.i(IILjava/lang/String;II)Lok;")
    public class407 method6533(int arg0, int arg1, String arg2, int arg3, int arg4) {
        if (arg2 == null || arg2.length() < arg0 + arg1) {
            return new class407(arg3, arg4, 0, 0);
        }
        int var6 = arg3 - this.method6568(arg2) / 2;
        int var7 = var6 + this.method6568(arg2.substring(0, arg0));
        int var8 = arg4 - this.field4407;
        int var9 = this.method6568(arg2.substring(arg0, arg0 + arg1));
        int var10 = this.field4418 + this.field4407;
        return new class407(var7, var8, var9, var10);
    }

    @ObfuscatedName("ne.o(Ljava/lang/String;IIII)V")
    public void method6525(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method6535(arg3, arg4);
            this.method6540(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("ne.n(Ljava/lang/String;IIIII)V")
    public void method6571(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 != null) {
            this.method6535(arg3, arg4);
            field4412 = arg5;
            this.method6540(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("ne.k(Ljava/lang/String;IIII)V")
    public void method6527(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method6535(arg3, arg4);
            this.method6540(arg0, arg1 - this.method6568(arg0), arg2);
        }
    }

    @ObfuscatedName("ne.a(Ljava/lang/String;IIII)V")
    public void method6528(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method6535(arg3, arg4);
            this.method6540(arg0, arg1 - this.method6568(arg0) / 2, arg2);
        }
    }

    @ObfuscatedName("ne.s(Ljava/lang/String;IIIIIIIII)I")
    public int method6529(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg0 == null) {
            return 0;
        }
        this.method6535(arg5, arg6);
        if (arg9 == 0) {
            arg9 = this.field4408;
        }
        int[] var11 = new int[] { arg3 };
        if (arg4 < this.field4418 + this.field4407 + arg9 && arg4 < arg9 + arg9) {
            var11 = null;
        }
        int var12 = this.method6521(arg0, var11, field4421);
        if (arg8 == 3 && var12 == 1) {
            arg8 = 1;
        }
        int var13;
        if (arg8 == 0) {
            var13 = this.field4407 + arg2;
        } else if (arg8 == 1) {
            var13 = (arg4 - this.field4407 - this.field4418 - (var12 - 1) * arg9) / 2 + this.field4407 + arg2;
        } else if (arg8 == 2) {
            var13 = arg2 + arg4 - this.field4418 - (var12 - 1) * arg9;
        } else {
            int var14 = (arg4 - this.field4407 - this.field4418 - (var12 - 1) * arg9) / (var12 + 1);
            if (var14 < 0) {
                var14 = 0;
            }
            var13 = this.field4407 + arg2 + var14;
            arg9 += var14;
        }
        for (int var15 = 0; var15 < var12; var15++) {
            if (arg7 == 0) {
                this.method6540(field4421[var15], arg1, var13);
            } else if (arg7 == 1) {
                this.method6540(field4421[var15], arg1 + (arg3 - this.method6568(field4421[var15])) / 2, var13);
            } else if (arg7 == 2) {
                this.method6540(field4421[var15], arg1 + arg3 - this.method6568(field4421[var15]), var13);
            } else if (var12 - 1 == var15) {
                this.method6540(field4421[var15], arg1, var13);
            } else {
                this.method6598(field4421[var15], arg3);
                this.method6540(field4421[var15], arg1, var13);
                field4419 = 0;
            }
            var13 += arg9;
        }
        return var12;
    }

    @ObfuscatedName("ne.l(Lna;IIIII)Lpg;")
    public class441 method6530(class373 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (!arg0.method6611()) {
            this.method6535(arg3, arg4);
            int var7 = arg2 - this.field4408;
            for (int var8 = 0; var8 < arg0.method6629(); var8++) {
                class371 var9 = arg0.method6616(var8);
                if (arg5 != -1 && var9.field4398 > arg5) {
                    return new class441(var9.field4399, var9.field4398);
                }
                char var10 = var9.field4396;
                if (var10 != '\n') {
                    if (arg0.method6610(var8)) {
                        var10 = '*';
                    }
                    if (var10 != '\t') {
                        if (var10 == 160) {
                            var10 = ' ';
                        }
                        int var11 = var9.field4399 + arg1;
                        int var12 = var9.field4398 + var7;
                        int var13 = this.field4402[var10];
                        int var14 = this.field4403[var10];
                        if (field4414 != -1) {
                            this.method6398(this.field4401[var10], this.field4404[var10] + var11 + 1, this.field4405[var10] + var12 + 1, var13, var14, field4414);
                        }
                        this.method6398(this.field4401[var10], this.field4404[var10] + var11, this.field4405[var10] + var12, var13, var14, field4413);
                    }
                }
            }
        }
        return arg0.method6615();
    }

    @ObfuscatedName("ne.t(Ljava/lang/String;IIIII)V")
    public void method6520(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method6535(arg3, arg4);
        int[] var7 = new int[arg0.length()];
        for (int var8 = 0; var8 < arg0.length(); var8++) {
            var7[var8] = (int) (Math.sin((double) arg5 / 5.0D + (double) var8 / 2.0D) * 5.0D);
        }
        this.method6539(arg0, arg1 - this.method6568(arg0) / 2, arg2, (int[]) null, var7);
    }

    @ObfuscatedName("ne.c(Ljava/lang/String;IIIII)V")
    public void method6594(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method6535(arg3, arg4);
        int[] var7 = new int[arg0.length()];
        int[] var8 = new int[arg0.length()];
        for (int var9 = 0; var9 < arg0.length(); var9++) {
            var7[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 5.0D) * 5.0D);
            var8[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 3.0D) * 5.0D);
        }
        this.method6539(arg0, arg1 - this.method6568(arg0) / 2, arg2, var7, var8);
    }

    @ObfuscatedName("ne.p(Ljava/lang/String;IIIIII)V")
    public void method6567(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 == null) {
            return;
        }
        this.method6535(arg3, arg4);
        double var8 = 7.0D - (double) arg6 / 8.0D;
        if (var8 < 0.0D) {
            var8 = 0.0D;
        }
        int[] var10 = new int[arg0.length()];
        for (int var11 = 0; var11 < arg0.length(); var11++) {
            var10[var11] = (int) (Math.sin((double) arg5 / 1.0D + (double) var11 / 1.5D) * var8);
        }
        this.method6539(arg0, arg1 - this.method6568(arg0) / 2, arg2, (int[]) null, var10);
    }

    @ObfuscatedName("ne.d(Ljava/lang/String;IIIII)V")
    public void method6534(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method6535(arg3, arg4);
        field4420.setSeed((long) arg5);
        field4412 = 192 + (field4420.nextInt() & 0x1F);
        int[] var7 = new int[arg0.length()];
        int var8 = 0;
        for (int var9 = 0; var9 < arg0.length(); var9++) {
            var7[var9] = var8;
            if ((field4420.nextInt() & 0x3) == 0) {
                var8++;
            }
        }
        this.method6539(arg0, arg1, arg2, var7, (int[]) null);
    }

    @ObfuscatedName("ne.y(II)V")
    public void method6535(int arg0, int arg1) {
        field4411 = -1;
        field4417 = -1;
        field4406 = arg1;
        field4414 = arg1;
        field4415 = arg0;
        field4413 = arg0;
        field4412 = 256;
        field4419 = 0;
        field4400 = 0;
    }

    @ObfuscatedName("ne.z(Ljava/lang/String;)V")
    public void method6536(String arg0) {
        try {
            if (arg0.startsWith("col=")) {
                field4413 = class361.method3227(arg0.substring(4), 16);
            } else if (arg0.equals("/col")) {
                field4413 = field4415;
            } else if (arg0.startsWith("str=")) {
                field4411 = class361.method3227(arg0.substring(4), 16);
            } else if (arg0.equals("str")) {
                field4411 = 8388608;
            } else if (arg0.equals("/str")) {
                field4411 = -1;
            } else if (arg0.startsWith("u=")) {
                field4417 = class361.method3227(arg0.substring(2), 16);
            } else if (arg0.equals("u")) {
                field4417 = 0;
            } else if (arg0.equals("/u")) {
                field4417 = -1;
            } else if (arg0.startsWith("shad=")) {
                field4414 = class361.method3227(arg0.substring(5), 16);
            } else if (arg0.equals("shad")) {
                field4414 = 0;
            } else if (arg0.equals("/shad")) {
                field4414 = field4406;
            } else if (arg0.equals("br")) {
                this.method6535(field4415, field4406);
            }
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("ne.w(Ljava/lang/String;I)V")
    public void method6598(String arg0, int arg1) {
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
            field4419 = (arg1 - this.method6568(arg0) << 8) / var3;
        }
    }

    @ObfuscatedName("ne.as(Ljava/lang/String;II)V")
    public void method6540(String arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field4408;
        int var5 = -1;
        int var6 = -1;
        for (int var7 = 0; var7 < arg0.length(); var7++) {
            if (arg0.charAt(var7) != 0) {
                char var8 = (char) (class359.method5252(arg0.charAt(var7)) & 0xFF);
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
                                        int var10 = class361.method7156(var9.substring(4));
                                        class480 var11 = Statics.field4409[var10];
                                        var11.method8196(arg1, this.field4408 + var4 - var11.field5009);
                                        arg1 += var11.field5006;
                                        var6 = -1;
                                    } catch (Exception var16) {
                                    }
                                } else {
                                    this.method6536(var9);
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
                        if (this.field4410 != null && var6 != -1) {
                            arg1 += this.field4410[(var6 << 8) + var8];
                        }
                        int var13 = this.field4402[var8];
                        int var14 = this.field4403[var8];
                        if (var8 == ' ') {
                            if (field4419 > 0) {
                                field4400 += field4419;
                                arg1 += field4400 >> 8;
                                field4400 &= 0xFF;
                            }
                        } else if (field4412 == 256) {
                            if (field4414 != -1) {
                                method6550(this.field4401[var8], this.field4404[var8] + arg1 + 1, this.field4405[var8] + var4 + 1, var13, var14, field4414);
                            }
                            this.method6398(this.field4401[var8], this.field4404[var8] + arg1, this.field4405[var8] + var4, var13, var14, field4413);
                        } else {
                            if (field4414 != -1) {
                                method6542(this.field4401[var8], this.field4404[var8] + arg1 + 1, this.field4405[var8] + var4 + 1, var13, var14, field4414, field4412);
                            }
                            this.method6397(this.field4401[var8], this.field4404[var8] + arg1, this.field4405[var8] + var4, var13, var14, field4413, field4412);
                        }
                        int var15 = this.field4416[var8];
                        if (field4411 != -1) {
                            method8126(arg1, (int) ((double) this.field4408 * 0.7D) + var4, var15, field4411);
                        }
                        if (field4417 != -1) {
                            method8126(arg1, this.field4408 + var4 + 1, var15, field4417);
                        }
                        arg1 += var15;
                        var6 = var8;
                    }
                }
            }
        }
    }

    @ObfuscatedName("ne.ad(Ljava/lang/String;II[I[I)V")
    public void method6539(String arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var6 = arg2 - this.field4408;
        int var7 = -1;
        int var8 = -1;
        int var9 = 0;
        for (int var10 = 0; var10 < arg0.length(); var10++) {
            if (arg0.charAt(var10) != 0) {
                char var11 = (char) (class359.method5252(arg0.charAt(var10)) & 0xFF);
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
                                        int var15 = class361.method7156(var12.substring(4));
                                        class480 var16 = Statics.field4409[var15];
                                        var16.method8196(arg1 + var13, this.field4408 + var6 - var16.field5009 + var14);
                                        arg1 += var16.field5006;
                                        var8 = -1;
                                    } catch (Exception var23) {
                                    }
                                } else {
                                    this.method6536(var12);
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
                        if (this.field4410 != null && var8 != -1) {
                            arg1 += this.field4410[(var8 << 8) + var11];
                        }
                        int var18 = this.field4402[var11];
                        int var19 = this.field4403[var11];
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
                            if (field4419 > 0) {
                                field4400 += field4419;
                                arg1 += field4400 >> 8;
                                field4400 &= 0xFF;
                            }
                        } else if (field4412 == 256) {
                            if (field4414 != -1) {
                                method6550(this.field4401[var11], this.field4404[var11] + arg1 + 1 + var20, this.field4405[var11] + var6 + 1 + var21, var18, var19, field4414);
                            }
                            this.method6398(this.field4401[var11], this.field4404[var11] + arg1 + var20, this.field4405[var11] + var6 + var21, var18, var19, field4413);
                        } else {
                            if (field4414 != -1) {
                                method6542(this.field4401[var11], this.field4404[var11] + arg1 + 1 + var20, this.field4405[var11] + var6 + 1 + var21, var18, var19, field4414, field4412);
                            }
                            this.method6397(this.field4401[var11], this.field4404[var11] + arg1 + var20, this.field4405[var11] + var6 + var21, var18, var19, field4413, field4412);
                        }
                        int var22 = this.field4416[var11];
                        if (field4411 != -1) {
                            method8126(arg1, (int) ((double) this.field4408 * 0.7D) + var6, var22, field4411);
                        }
                        if (field4417 != -1) {
                            method8126(arg1, this.field4408 + var6, var22, field4417);
                        }
                        arg1 += var22;
                        var8 = var11;
                    }
                }
            }
        }
    }

    @ObfuscatedName("ne.ao([BIIIII)V")
    public static void method6550(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = Statics.field4985 * arg2 + arg1;
        int var7 = Statics.field4985 - arg3;
        int var8 = 0;
        int var9 = 0;
        if (arg2 < field4987) {
            int var10 = field4987 - arg2;
            arg4 -= var10;
            arg2 = field4987;
            var9 += arg3 * var10;
            var6 += Statics.field4985 * var10;
        }
        if (arg2 + arg4 > field4988) {
            arg4 -= arg2 + arg4 - field4988;
        }
        if (arg1 < field4989) {
            int var11 = field4989 - arg1;
            arg3 -= var11;
            arg1 = field4989;
            var9 += var11;
            var6 += var11;
            var8 += var11;
            var7 += var11;
        }
        if (arg1 + arg3 > field4990) {
            int var12 = arg1 + arg3 - field4990;
            arg3 -= var12;
            var8 += var12;
            var7 += var12;
        }
        if (arg3 > 0 && arg4 > 0) {
            method6541(Statics.field4986, arg0, arg5, var9, var6, arg3, arg4, var7, var8);
        }
    }

    @ObfuscatedName("ne.am([I[BIIIIIII)V")
    public static void method6541(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @ObfuscatedName("ne.av([BIIIIII)V")
    public static void method6542(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = Statics.field4985 * arg2 + arg1;
        int var8 = Statics.field4985 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < field4987) {
            int var11 = field4987 - arg2;
            arg4 -= var11;
            arg2 = field4987;
            var10 += arg3 * var11;
            var7 += Statics.field4985 * var11;
        }
        if (arg2 + arg4 > field4988) {
            arg4 -= arg2 + arg4 - field4988;
        }
        if (arg1 < field4989) {
            int var12 = field4989 - arg1;
            arg3 -= var12;
            arg1 = field4989;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > field4990) {
            int var13 = arg1 + arg3 - field4990;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            method6565(Statics.field4986, arg0, arg5, var10, var7, arg3, arg4, var8, var9, arg6);
        }
    }

    @ObfuscatedName("ne.au([I[BIIIIIIII)V")
    public static void method6565(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
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

    @ObfuscatedName("ne.h([BIIIII)V")
    public abstract void method6398(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @ObfuscatedName("ne.e([BIIIIII)V")
    public abstract void method6397(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);
}
