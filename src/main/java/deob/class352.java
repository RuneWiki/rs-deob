package deob;

import java.util.Random;

@ObfuscatedName("mf")
public abstract class class352 extends class454 {

    @ObfuscatedName("mf.c")
    public byte[][] field4218 = new byte[256][];

    @ObfuscatedName("mf.p")
    public int[] field4219;

    @ObfuscatedName("mf.f")
    public int[] field4223;

    @ObfuscatedName("mf.n")
    public int[] field4221;

    @ObfuscatedName("mf.k")
    public int[] field4222;

    @ObfuscatedName("mf.w")
    public int[] field4232;

    @ObfuscatedName("mf.s")
    public int field4224 = 0;

    @ObfuscatedName("mf.q")
    public int field4225;

    @ObfuscatedName("mf.m")
    public int field4226;

    @ObfuscatedName("mf.j")
    public byte[] field4228;

    @ObfuscatedName("mf.v")
    public static int field4220 = -1;

    @ObfuscatedName("mf.h")
    public static int field4230 = -1;

    @ObfuscatedName("mf.t")
    public static int field4237 = -1;

    @ObfuscatedName("mf.u")
    public static int field4229 = -1;

    @ObfuscatedName("mf.d")
    public static int field4233 = 0;

    @ObfuscatedName("mf.b")
    public static int field4234 = 0;

    @ObfuscatedName("mf.a")
    public static int field4235 = 256;

    @ObfuscatedName("mf.l")
    public static int field4239 = 0;

    @ObfuscatedName("mf.e")
    public static int field4236 = 0;

    @ObfuscatedName("mf.g")
    public static Random field4238 = new Random();

    @ObfuscatedName("mf.y")
    public static String[] field4231 = new String[100];

    public class352(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, byte[][] arg6) {
        this.field4222 = arg1;
        this.field4232 = arg2;
        this.field4223 = arg3;
        this.field4221 = arg4;
        this.method5996(arg0);
        this.field4218 = arg6;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        for (int var10 = 0; var10 < 256; var10++) {
            if (this.field4232[var10] < var8 && this.field4221[var10] != 0) {
                var8 = this.field4232[var10];
            }
            if (this.field4232[var10] + this.field4221[var10] > var9) {
                var9 = this.field4232[var10] + this.field4221[var10];
            }
        }
        this.field4225 = this.field4224 - var8;
        this.field4226 = var9 - this.field4224;
    }

    public class352(byte[] arg0) {
        this.method5996(arg0);
    }

    @ObfuscatedName("mf.s([B)V")
    public void method5996(byte[] arg0) {
        this.field4219 = new int[256];
        if (arg0.length == 257) {
            for (int var2 = 0; var2 < this.field4219.length; var2++) {
                this.field4219[var2] = arg0[var2] & 0xFF;
            }
            this.field4224 = arg0[256] & 0xFF;
            return;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < 256; var4++) {
            this.field4219[var4] = arg0[var3++] & 0xFF;
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
        this.field4228 = new byte[65536];
        for (int var17 = 0; var17 < 256; var17++) {
            if (var17 != 32 && var17 != 160) {
                for (int var18 = 0; var18 < 256; var18++) {
                    if (var18 != 32 && var18 != 160) {
                        this.field4228[(var17 << 8) + var18] = (byte) method5945(var9, var13, var6, this.field4219, var5, var17, var18);
                    }
                }
            }
        }
        this.field4224 = var5[32] + var6[32];
    }

    @ObfuscatedName("mf.q([[B[[B[I[I[III)I")
    public static int method5945(byte[][] arg0, byte[][] arg1, int[] arg2, int[] arg3, int[] arg4, int arg5, int arg6) {
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

    @ObfuscatedName("mf.m(C)I")
    public int method5943(char arg0) {
        if (arg0 == 160) {
            arg0 = ' ';
        }
        return this.field4219[class343.method5185(arg0) & 0xFF];
    }

    @ObfuscatedName("mf.x(Ljava/lang/String;)I")
    public int method5952(String arg0) {
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
                                    int var8 = class345.method4977(var7.substring(4));
                                    var4 += Statics.field4227[var8].field4817;
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
                    var4 += this.field4219[(char) (class343.method5185(var6) & 0xFF)];
                    if (this.field4228 != null && var3 != -1) {
                        var4 += this.field4228[(var3 << 8) + var6];
                    }
                    var3 = var6;
                }
            }
        }
        return var4;
    }

    @ObfuscatedName("mf.j(Ljava/lang/String;[I[Ljava/lang/String;)I")
    public int method5948(String arg0, int[] arg1, String[] arg2) {
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
                        var4 += this.method5943('<');
                        if (this.field4228 != null && var11 != -1) {
                            var4 += this.field4228[(var11 << 8) + 60];
                        }
                        var11 = '<';
                    } else if (var16.equals("gt")) {
                        var4 += this.method5943('>');
                        if (this.field4228 != null && var11 != -1) {
                            var4 += this.field4228[(var11 << 8) + 62];
                        }
                        var11 = '>';
                    } else if (var16.startsWith("img=")) {
                        try {
                            int var17 = class345.method4977(var16.substring(4));
                            var4 += Statics.field4227[var17].field4817;
                            var11 = 0;
                        } catch (Exception var20) {
                        }
                    }
                    var15 = 0;
                }
                if (var10 == -1) {
                    if (var15 != 0) {
                        var6.append(var15);
                        var4 += this.method5943(var15);
                        if (this.field4228 != null && var11 != -1) {
                            var4 += this.field4228[(var11 << 8) + var15];
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

    @ObfuscatedName("mf.v(Ljava/lang/String;I)I")
    public int method5965(String arg0, int arg1) {
        int var3 = this.method5948(arg0, new int[] { arg1 }, field4231);
        int var4 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = this.method5952(field4231[var5]);
            if (var6 > var4) {
                var4 = var6;
            }
        }
        return var4;
    }

    @ObfuscatedName("mf.h(Ljava/lang/String;I)I")
    public int method5950(String arg0, int arg1) {
        return this.method5948(arg0, new int[] { arg1 }, field4231);
    }

    @ObfuscatedName("mf.t(Ljava/lang/String;)Ljava/lang/String;")
    public static String method5951(String arg0) {
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

    @ObfuscatedName("mf.u(IILjava/lang/String;II)Lnk;")
    public class386 method5946(int arg0, int arg1, String arg2, int arg3, int arg4) {
        if (arg2 == null || arg2.length() < arg0 + arg1) {
            return new class386(arg3, arg4, 0, 0);
        }
        int var6 = arg3 - this.method5952(arg2) / 2;
        int var7 = var6 + this.method5952(arg2.substring(0, arg0));
        int var8 = arg4 - this.field4225;
        int var9 = this.method5952(arg2.substring(arg0, arg0 + arg1));
        int var10 = this.field4226 + this.field4225;
        return new class386(var7, var8, var9, var10);
    }

    @ObfuscatedName("mf.d(Ljava/lang/String;IIII)V")
    public void method5953(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method5960(arg3, arg4);
            this.method5962(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("mf.b(Ljava/lang/String;IIIII)V")
    public void method6018(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 != null) {
            this.method5960(arg3, arg4);
            field4235 = arg5;
            this.method5962(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("mf.a(Ljava/lang/String;IIII)V")
    public void method5954(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method5960(arg3, arg4);
            this.method5962(arg0, arg1 - this.method5952(arg0), arg2);
        }
    }

    @ObfuscatedName("mf.l(Ljava/lang/String;IIII)V")
    public void method5955(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method5960(arg3, arg4);
            this.method5962(arg0, arg1 - this.method5952(arg0) / 2, arg2);
        }
    }

    @ObfuscatedName("mf.e(Ljava/lang/String;IIIIIIIII)I")
    public int method5974(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg0 == null) {
            return 0;
        }
        this.method5960(arg5, arg6);
        if (arg9 == 0) {
            arg9 = this.field4224;
        }
        int[] var11 = new int[] { arg3 };
        if (arg4 < this.field4226 + this.field4225 + arg9 && arg4 < arg9 + arg9) {
            var11 = null;
        }
        int var12 = this.method5948(arg0, var11, field4231);
        if (arg8 == 3 && var12 == 1) {
            arg8 = 1;
        }
        int var13;
        if (arg8 == 0) {
            var13 = this.field4225 + arg2;
        } else if (arg8 == 1) {
            var13 = (arg4 - this.field4225 - this.field4226 - (var12 - 1) * arg9) / 2 + this.field4225 + arg2;
        } else if (arg8 == 2) {
            var13 = arg2 + arg4 - this.field4226 - (var12 - 1) * arg9;
        } else {
            int var14 = (arg4 - this.field4225 - this.field4226 - (var12 - 1) * arg9) / (var12 + 1);
            if (var14 < 0) {
                var14 = 0;
            }
            var13 = this.field4225 + arg2 + var14;
            arg9 += var14;
        }
        for (int var15 = 0; var15 < var12; var15++) {
            if (arg7 == 0) {
                this.method5962(field4231[var15], arg1, var13);
            } else if (arg7 == 1) {
                this.method5962(field4231[var15], arg1 + (arg3 - this.method5952(field4231[var15])) / 2, var13);
            } else if (arg7 == 2) {
                this.method5962(field4231[var15], arg1 + arg3 - this.method5952(field4231[var15]), var13);
            } else if (var12 - 1 == var15) {
                this.method5962(field4231[var15], arg1, var13);
            } else {
                this.method6003(field4231[var15], arg3);
                this.method5962(field4231[var15], arg1, var13);
                field4239 = 0;
            }
            var13 += arg9;
        }
        return var12;
    }

    @ObfuscatedName("mf.g(Ljava/lang/String;IIIII)V")
    public void method5957(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method5960(arg3, arg4);
        int[] var7 = new int[arg0.length()];
        for (int var8 = 0; var8 < arg0.length(); var8++) {
            var7[var8] = (int) (Math.sin((double) arg5 / 5.0D + (double) var8 / 2.0D) * 5.0D);
        }
        this.method5963(arg0, arg1 - this.method5952(arg0) / 2, arg2, (int[]) null, var7);
    }

    @ObfuscatedName("mf.y(Ljava/lang/String;IIIII)V")
    public void method6011(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method5960(arg3, arg4);
        int[] var7 = new int[arg0.length()];
        int[] var8 = new int[arg0.length()];
        for (int var9 = 0; var9 < arg0.length(); var9++) {
            var7[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 5.0D) * 5.0D);
            var8[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 3.0D) * 5.0D);
        }
        this.method5963(arg0, arg1 - this.method5952(arg0) / 2, arg2, var7, var8);
    }

    @ObfuscatedName("mf.i(Ljava/lang/String;IIIIII)V")
    public void method5958(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 == null) {
            return;
        }
        this.method5960(arg3, arg4);
        double var8 = 7.0D - (double) arg6 / 8.0D;
        if (var8 < 0.0D) {
            var8 = 0.0D;
        }
        int[] var10 = new int[arg0.length()];
        for (int var11 = 0; var11 < arg0.length(); var11++) {
            var10[var11] = (int) (Math.sin((double) arg5 / 1.0D + (double) var11 / 1.5D) * var8);
        }
        this.method5963(arg0, arg1 - this.method5952(arg0) / 2, arg2, (int[]) null, var10);
    }

    @ObfuscatedName("mf.r(Ljava/lang/String;IIIII)V")
    public void method5959(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method5960(arg3, arg4);
        field4238.setSeed((long) arg5);
        field4235 = 192 + (field4238.nextInt() & 0x1F);
        int[] var7 = new int[arg0.length()];
        int var8 = 0;
        for (int var9 = 0; var9 < arg0.length(); var9++) {
            var7[var9] = var8;
            if ((field4238.nextInt() & 0x3) == 0) {
                var8++;
            }
        }
        this.method5963(arg0, arg1, arg2, var7, (int[]) null);
    }

    @ObfuscatedName("mf.z(II)V")
    public void method5960(int arg0, int arg1) {
        field4220 = -1;
        field4230 = -1;
        field4237 = arg1;
        field4229 = arg1;
        field4233 = arg0;
        field4234 = arg0;
        field4235 = 256;
        field4239 = 0;
        field4236 = 0;
    }

    @ObfuscatedName("mf.o(Ljava/lang/String;)V")
    public void method6030(String arg0) {
        try {
            if (arg0.startsWith("col=")) {
                field4234 = class345.method3253(arg0.substring(4), 16);
            } else if (arg0.equals("/col")) {
                field4234 = field4233;
            } else if (arg0.startsWith("str=")) {
                field4220 = class345.method3253(arg0.substring(4), 16);
            } else if (arg0.equals("str")) {
                field4220 = 8388608;
            } else if (arg0.equals("/str")) {
                field4220 = -1;
            } else if (arg0.startsWith("u=")) {
                field4230 = class345.method3253(arg0.substring(2), 16);
            } else if (arg0.equals("u")) {
                field4230 = 0;
            } else if (arg0.equals("/u")) {
                field4230 = -1;
            } else if (arg0.startsWith("shad=")) {
                field4229 = class345.method3253(arg0.substring(5), 16);
            } else if (arg0.equals("shad")) {
                field4229 = 0;
            } else if (arg0.equals("/shad")) {
                field4229 = field4237;
            } else if (arg0.equals("br")) {
                this.method5960(field4233, field4237);
            }
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("mf.as(Ljava/lang/String;I)V")
    public void method6003(String arg0, int arg1) {
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
            field4239 = (arg1 - this.method5952(arg0) << 8) / var3;
        }
    }

    @ObfuscatedName("mf.ac(Ljava/lang/String;II)V")
    public void method5962(String arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field4224;
        int var5 = -1;
        int var6 = -1;
        for (int var7 = 0; var7 < arg0.length(); var7++) {
            if (arg0.charAt(var7) != 0) {
                char var8 = (char) (class343.method5185(arg0.charAt(var7)) & 0xFF);
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
                                        int var10 = class345.method4977(var9.substring(4));
                                        class457 var11 = Statics.field4227[var10];
                                        var11.method7573(arg1, this.field4224 + var4 - var11.field4823);
                                        arg1 += var11.field4817;
                                        var6 = -1;
                                    } catch (Exception var16) {
                                    }
                                } else {
                                    this.method6030(var9);
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
                        if (this.field4228 != null && var6 != -1) {
                            arg1 += this.field4228[(var6 << 8) + var8];
                        }
                        int var13 = this.field4223[var8];
                        int var14 = this.field4221[var8];
                        if (var8 == ' ') {
                            if (field4239 > 0) {
                                field4236 += field4239;
                                arg1 += field4236 >> 8;
                                field4236 &= 0xFF;
                            }
                        } else if (field4235 == 256) {
                            if (field4229 != -1) {
                                method5966(this.field4218[var8], this.field4222[var8] + arg1 + 1, this.field4232[var8] + var4 + 1, var13, var14, field4229);
                            }
                            this.method5936(this.field4218[var8], this.field4222[var8] + arg1, this.field4232[var8] + var4, var13, var14, field4234);
                        } else {
                            if (field4229 != -1) {
                                method5967(this.field4218[var8], this.field4222[var8] + arg1 + 1, this.field4232[var8] + var4 + 1, var13, var14, field4229, field4235);
                            }
                            this.method5938(this.field4218[var8], this.field4222[var8] + arg1, this.field4232[var8] + var4, var13, var14, field4234, field4235);
                        }
                        int var15 = this.field4219[var8];
                        if (field4220 != -1) {
                            method7501(arg1, (int) ((double) this.field4224 * 0.7D) + var4, var15, field4220);
                        }
                        if (field4230 != -1) {
                            method7501(arg1, this.field4224 + var4 + 1, var15, field4230);
                        }
                        arg1 += var15;
                        var6 = var8;
                    }
                }
            }
        }
    }

    @ObfuscatedName("mf.ao(Ljava/lang/String;II[I[I)V")
    public void method5963(String arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var6 = arg2 - this.field4224;
        int var7 = -1;
        int var8 = -1;
        int var9 = 0;
        for (int var10 = 0; var10 < arg0.length(); var10++) {
            if (arg0.charAt(var10) != 0) {
                char var11 = (char) (class343.method5185(arg0.charAt(var10)) & 0xFF);
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
                                        int var15 = class345.method4977(var12.substring(4));
                                        class457 var16 = Statics.field4227[var15];
                                        var16.method7573(arg1 + var13, this.field4224 + var6 - var16.field4823 + var14);
                                        arg1 += var16.field4817;
                                        var8 = -1;
                                    } catch (Exception var23) {
                                    }
                                } else {
                                    this.method6030(var12);
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
                        if (this.field4228 != null && var8 != -1) {
                            arg1 += this.field4228[(var8 << 8) + var11];
                        }
                        int var18 = this.field4223[var11];
                        int var19 = this.field4221[var11];
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
                            if (field4239 > 0) {
                                field4236 += field4239;
                                arg1 += field4236 >> 8;
                                field4236 &= 0xFF;
                            }
                        } else if (field4235 == 256) {
                            if (field4229 != -1) {
                                method5966(this.field4218[var11], this.field4222[var11] + arg1 + 1 + var20, this.field4232[var11] + var6 + 1 + var21, var18, var19, field4229);
                            }
                            this.method5936(this.field4218[var11], this.field4222[var11] + arg1 + var20, this.field4232[var11] + var6 + var21, var18, var19, field4234);
                        } else {
                            if (field4229 != -1) {
                                method5967(this.field4218[var11], this.field4222[var11] + arg1 + 1 + var20, this.field4232[var11] + var6 + 1 + var21, var18, var19, field4229, field4235);
                            }
                            this.method5938(this.field4218[var11], this.field4222[var11] + arg1 + var20, this.field4232[var11] + var6 + var21, var18, var19, field4234, field4235);
                        }
                        int var22 = this.field4219[var11];
                        if (field4220 != -1) {
                            method7501(arg1, (int) ((double) this.field4224 * 0.7D) + var6, var22, field4220);
                        }
                        if (field4230 != -1) {
                            method7501(arg1, this.field4224 + var6, var22, field4230);
                        }
                        arg1 += var22;
                        var8 = var11;
                    }
                }
            }
        }
    }

    @ObfuscatedName("mf.ar([BIIIII)V")
    public static void method5966(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = Statics.field4800 * arg2 + arg1;
        int var7 = Statics.field4800 - arg3;
        int var8 = 0;
        int var9 = 0;
        if (arg2 < field4802) {
            int var10 = field4802 - arg2;
            arg4 -= var10;
            arg2 = field4802;
            var9 += arg3 * var10;
            var6 += Statics.field4800 * var10;
        }
        if (arg2 + arg4 > field4803) {
            arg4 -= arg2 + arg4 - field4803;
        }
        if (arg1 < field4799) {
            int var11 = field4799 - arg1;
            arg3 -= var11;
            arg1 = field4799;
            var9 += var11;
            var6 += var11;
            var8 += var11;
            var7 += var11;
        }
        if (arg1 + arg3 > field4805) {
            int var12 = arg1 + arg3 - field4805;
            arg3 -= var12;
            var8 += var12;
            var7 += var12;
        }
        if (arg3 > 0 && arg4 > 0) {
            method5986(Statics.field4804, arg0, arg5, var9, var6, arg3, arg4, var7, var8);
        }
    }

    @ObfuscatedName("mf.aq([I[BIIIIIII)V")
    public static void method5986(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @ObfuscatedName("mf.ai([BIIIIII)V")
    public static void method5967(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = Statics.field4800 * arg2 + arg1;
        int var8 = Statics.field4800 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < field4802) {
            int var11 = field4802 - arg2;
            arg4 -= var11;
            arg2 = field4802;
            var10 += arg3 * var11;
            var7 += Statics.field4800 * var11;
        }
        if (arg2 + arg4 > field4803) {
            arg4 -= arg2 + arg4 - field4803;
        }
        if (arg1 < field4799) {
            int var12 = field4799 - arg1;
            arg3 -= var12;
            arg1 = field4799;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > field4805) {
            int var13 = arg1 + arg3 - field4805;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            method5968(Statics.field4804, arg0, arg5, var10, var7, arg3, arg4, var8, var9, arg6);
        }
    }

    @ObfuscatedName("mf.an([I[BIIIIIIII)V")
    public static void method5968(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
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

    @ObfuscatedName("mf.c([BIIIII)V")
    public abstract void method5936(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @ObfuscatedName("mf.p([BIIIIII)V")
    public abstract void method5938(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);
}
