package deob;

import java.util.Random;

@ObfuscatedName("hg")
public abstract class class223 extends class80 {

    @ObfuscatedName("hg.m")
    public byte[][] field3176 = new byte[256][];

    @ObfuscatedName("hg.l")
    public int[] field3172;

    @ObfuscatedName("hg.y")
    public int[] field3160;

    @ObfuscatedName("hg.u")
    public int[] field3162;

    @ObfuscatedName("hg.k")
    public int[] field3163;

    @ObfuscatedName("hg.j")
    public int[] field3164;

    @ObfuscatedName("hg.i")
    public int field3165 = 0;

    @ObfuscatedName("hg.x")
    public int field3166;

    @ObfuscatedName("hg.g")
    public int field3167;

    @ObfuscatedName("hg.p")
    public byte[] field3174;

    @ObfuscatedName("hg.a")
    public static int field3175 = -1;

    @ObfuscatedName("hg.f")
    public static int field3171 = -1;

    @ObfuscatedName("hg.d")
    public static int field3169 = -1;

    @ObfuscatedName("hg.q")
    public static int field3173 = -1;

    @ObfuscatedName("hg.o")
    public static int field3168 = 0;

    @ObfuscatedName("hg.w")
    public static int field3170 = 0;

    @ObfuscatedName("hg.z")
    public static int field3177 = 256;

    @ObfuscatedName("hg.t")
    public static int field3161 = 0;

    @ObfuscatedName("hg.aq")
    public static int field3178 = 0;

    @ObfuscatedName("hg.an")
    public static Random field3179 = new Random();

    @ObfuscatedName("hg.av")
    public static String[] field3180 = new String[100];

    public class223(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, byte[][] arg6) {
        this.field3163 = arg1;
        this.field3164 = arg2;
        this.field3160 = arg3;
        this.field3162 = arg4;
        this.method3862(arg0);
        this.field3176 = arg6;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        for (int var10 = 0; var10 < 256; var10++) {
            if (this.field3164[var10] < var8 && this.field3162[var10] != 0) {
                var8 = this.field3164[var10];
            }
            if (this.field3164[var10] + this.field3162[var10] > var9) {
                var9 = this.field3164[var10] + this.field3162[var10];
            }
        }
        this.field3166 = this.field3165 - var8;
        this.field3167 = var9 - this.field3165;
    }

    public class223(byte[] arg0) {
        this.method3862(arg0);
    }

    @ObfuscatedName("hg.m([B)V")
    public void method3862(byte[] arg0) {
        this.field3172 = new int[256];
        if (arg0.length == 257) {
            for (int var2 = 0; var2 < this.field3172.length; var2++) {
                this.field3172[var2] = arg0[var2] & 0xFF;
            }
            this.field3165 = arg0[256] & 0xFF;
            return;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < 256; var4++) {
            this.field3172[var4] = arg0[var3++] & 0xFF;
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
        this.field3174 = new byte[65536];
        for (int var17 = 0; var17 < 256; var17++) {
            if (var17 != 32 && var17 != 160) {
                for (int var18 = 0; var18 < 256; var18++) {
                    if (var18 != 32 && var18 != 160) {
                        this.field3174[(var17 << 8) + var18] = (byte) method3819(var9, var13, var6, this.field3172, var5, var17, var18);
                    }
                }
            }
        }
        this.field3165 = var5[32] + var6[32];
    }

    @ObfuscatedName("hg.l([[B[[B[I[I[III)I")
    public static int method3819(byte[][] arg0, byte[][] arg1, int[] arg2, int[] arg3, int[] arg4, int arg5, int arg6) {
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

    @ObfuscatedName("hg.y(C)I")
    public int method3820(char arg0) {
        if (arg0 == 160) {
            arg0 = ' ';
        }
        return this.field3172[class165.method2078(arg0) & 0xFF];
    }

    @ObfuscatedName("hg.u(Ljava/lang/String;)I")
    public int method3821(String arg0) {
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
                                    int var8 = class163.method2984(var7.substring(4));
                                    var4 += Statics.field3159[var8].field1379;
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
                    var4 += this.field3172[(char) (class165.method2078(var6) & 0xFF)];
                    if (this.field3174 != null && var3 != -1) {
                        var4 += this.field3174[(var3 << 8) + var6];
                    }
                    var3 = var6;
                }
            }
        }
        return var4;
    }

    @ObfuscatedName("hg.k(Ljava/lang/String;[I[Ljava/lang/String;)I")
    public int method3822(String arg0, int[] arg1, String[] arg2) {
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
                        var4 += this.method3820('<');
                        if (this.field3174 != null && var11 != -1) {
                            var4 += this.field3174[(var11 << 8) + 60];
                        }
                        var11 = '<';
                    } else if (var16.equals("gt")) {
                        var4 += this.method3820('>');
                        if (this.field3174 != null && var11 != -1) {
                            var4 += this.field3174[(var11 << 8) + 62];
                        }
                        var11 = '>';
                    } else if (var16.startsWith("img=")) {
                        try {
                            int var17 = class163.method2984(var16.substring(4));
                            var4 += Statics.field3159[var17].field1379;
                            var11 = 0;
                        } catch (Exception var20) {
                        }
                    }
                    var15 = 0;
                }
                if (var10 == -1) {
                    if (var15 != 0) {
                        var6.append(var15);
                        var4 += this.method3820(var15);
                        if (this.field3174 != null && var11 != -1) {
                            var4 += this.field3174[(var11 << 8) + var15];
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

    @ObfuscatedName("hg.j(Ljava/lang/String;I)I")
    public int method3823(String arg0, int arg1) {
        int var3 = this.method3822(arg0, new int[] { arg1 }, field3180);
        int var4 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = this.method3821(field3180[var5]);
            if (var6 > var4) {
                var4 = var6;
            }
        }
        return var4;
    }

    @ObfuscatedName("hg.i(Ljava/lang/String;I)I")
    public int method3839(String arg0, int arg1) {
        return this.method3822(arg0, new int[] { arg1 }, field3180);
    }

    @ObfuscatedName("hg.x(Ljava/lang/String;)Ljava/lang/String;")
    public static String method3825(String arg0) {
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

    @ObfuscatedName("hg.g(Ljava/lang/String;IIII)V")
    public void method3826(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method3834(arg3, arg4);
            this.method3876(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("hg.e(Ljava/lang/String;IIII)V")
    public void method3888(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method3834(arg3, arg4);
            this.method3876(arg0, arg1 - this.method3821(arg0), arg2);
        }
    }

    @ObfuscatedName("hg.p(Ljava/lang/String;IIII)V")
    public void method3828(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method3834(arg3, arg4);
            this.method3876(arg0, arg1 - this.method3821(arg0) / 2, arg2);
        }
    }

    @ObfuscatedName("hg.a(Ljava/lang/String;IIIIIIIII)I")
    public int method3829(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg0 == null) {
            return 0;
        }
        this.method3834(arg5, arg6);
        if (arg9 == 0) {
            arg9 = this.field3165;
        }
        int[] var11 = new int[] { arg3 };
        if (arg4 < this.field3167 + this.field3166 + arg9 && arg4 < arg9 + arg9) {
            var11 = null;
        }
        int var12 = this.method3822(arg0, var11, field3180);
        if (arg8 == 3 && var12 == 1) {
            arg8 = 1;
        }
        int var13;
        if (arg8 == 0) {
            var13 = this.field3166 + arg2;
        } else if (arg8 == 1) {
            var13 = (arg4 - this.field3166 - this.field3167 - (var12 - 1) * arg9) / 2 + this.field3166 + arg2;
        } else if (arg8 == 2) {
            var13 = arg2 + arg4 - this.field3167 - (var12 - 1) * arg9;
        } else {
            int var14 = (arg4 - this.field3166 - this.field3167 - (var12 - 1) * arg9) / (var12 + 1);
            if (var14 < 0) {
                var14 = 0;
            }
            var13 = this.field3166 + arg2 + var14;
            arg9 += var14;
        }
        for (int var15 = 0; var15 < var12; var15++) {
            if (arg7 == 0) {
                this.method3876(field3180[var15], arg1, var13);
            } else if (arg7 == 1) {
                this.method3876(field3180[var15], arg1 + (arg3 - this.method3821(field3180[var15])) / 2, var13);
            } else if (arg7 == 2) {
                this.method3876(field3180[var15], arg1 + arg3 - this.method3821(field3180[var15]), var13);
            } else if (var12 - 1 == var15) {
                this.method3876(field3180[var15], arg1, var13);
            } else {
                this.method3836(field3180[var15], arg3);
                this.method3876(field3180[var15], arg1, var13);
                field3161 = 0;
            }
            var13 += arg9;
        }
        return var12;
    }

    @ObfuscatedName("hg.v(Ljava/lang/String;IIIII)V")
    public void method3845(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method3834(arg3, arg4);
        int[] var7 = new int[arg0.length()];
        for (int var8 = 0; var8 < arg0.length(); var8++) {
            var7[var8] = (int) (Math.sin((double) arg5 / 5.0D + (double) var8 / 2.0D) * 5.0D);
        }
        this.method3838(arg0, arg1 - this.method3821(arg0) / 2, arg2, (int[]) null, var7);
    }

    @ObfuscatedName("hg.c(Ljava/lang/String;IIIII)V")
    public void method3831(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method3834(arg3, arg4);
        int[] var7 = new int[arg0.length()];
        int[] var8 = new int[arg0.length()];
        for (int var9 = 0; var9 < arg0.length(); var9++) {
            var7[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 5.0D) * 5.0D);
            var8[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 3.0D) * 5.0D);
        }
        this.method3838(arg0, arg1 - this.method3821(arg0) / 2, arg2, var7, var8);
    }

    @ObfuscatedName("hg.s(Ljava/lang/String;IIIIII)V")
    public void method3848(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 == null) {
            return;
        }
        this.method3834(arg3, arg4);
        double var8 = 7.0D - (double) arg6 / 8.0D;
        if (var8 < 0.0D) {
            var8 = 0.0D;
        }
        int[] var10 = new int[arg0.length()];
        for (int var11 = 0; var11 < arg0.length(); var11++) {
            var10[var11] = (int) (Math.sin((double) arg5 / 1.0D + (double) var11 / 1.5D) * var8);
        }
        this.method3838(arg0, arg1 - this.method3821(arg0) / 2, arg2, (int[]) null, var10);
    }

    @ObfuscatedName("hg.r(Ljava/lang/String;IIIII)V")
    public void method3827(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method3834(arg3, arg4);
        field3179.setSeed((long) arg5);
        field3177 = 192 + (field3179.nextInt() & 0x1F);
        int[] var7 = new int[arg0.length()];
        int var8 = 0;
        for (int var9 = 0; var9 < arg0.length(); var9++) {
            var7[var9] = var8;
            if ((field3179.nextInt() & 0x3) == 0) {
                var8++;
            }
        }
        this.method3838(arg0, arg1, arg2, var7, (int[]) null);
    }

    @ObfuscatedName("hg.h(II)V")
    public void method3834(int arg0, int arg1) {
        field3175 = -1;
        field3171 = -1;
        field3169 = arg1;
        field3173 = arg1;
        field3168 = arg0;
        field3170 = arg0;
        field3177 = 256;
        field3161 = 0;
        field3178 = 0;
    }

    @ObfuscatedName("hg.n(Ljava/lang/String;)V")
    public void method3846(String arg0) {
        try {
            if (arg0.startsWith("col=")) {
                String var2 = arg0.substring(4);
                int var3 = class163.method48(var2, 16, true);
                field3170 = var3;
            } else if (arg0.equals("/col")) {
                field3170 = field3168;
            } else if (arg0.startsWith("str=")) {
                String var4 = arg0.substring(4);
                int var5 = class163.method48(var4, 16, true);
                field3175 = var5;
            } else if (arg0.equals("str")) {
                field3175 = 8388608;
            } else if (arg0.equals("/str")) {
                field3175 = -1;
            } else if (arg0.startsWith("u=")) {
                String var6 = arg0.substring(2);
                int var7 = class163.method48(var6, 16, true);
                field3171 = var7;
            } else if (arg0.equals("u")) {
                field3171 = 0;
            } else if (arg0.equals("/u")) {
                field3171 = -1;
            } else if (arg0.startsWith("shad=")) {
                String var8 = arg0.substring(5);
                int var9 = class163.method48(var8, 16, true);
                field3173 = var9;
            } else if (arg0.equals("shad")) {
                field3173 = 0;
            } else if (arg0.equals("/shad")) {
                field3173 = field3169;
            } else if (arg0.equals("br")) {
                this.method3834(field3168, field3169);
            }
        } catch (Exception var11) {
        }
    }

    @ObfuscatedName("hg.b(Ljava/lang/String;I)V")
    public void method3836(String arg0, int arg1) {
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
            field3161 = (arg1 - this.method3821(arg0) << 8) / var3;
        }
    }

    @ObfuscatedName("hg.f(Ljava/lang/String;II)V")
    public void method3876(String arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field3165;
        int var5 = -1;
        int var6 = -1;
        for (int var7 = 0; var7 < arg0.length(); var7++) {
            if (arg0.charAt(var7) != 0) {
                char var8 = (char) (class165.method2078(arg0.charAt(var7)) & 0xFF);
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
                                        int var10 = class163.method2984(var9.substring(4));
                                        class81 var11 = Statics.field3159[var10];
                                        var11.method1790(arg1, this.field3165 + var4 - var11.field1375);
                                        arg1 += var11.field1379;
                                        var6 = -1;
                                    } catch (Exception var16) {
                                    }
                                } else {
                                    this.method3846(var9);
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
                        if (this.field3174 != null && var6 != -1) {
                            arg1 += this.field3174[(var6 << 8) + var8];
                        }
                        int var13 = this.field3160[var8];
                        int var14 = this.field3162[var8];
                        if (var8 == ' ') {
                            if (field3161 > 0) {
                                field3178 += field3161;
                                arg1 += field3178 >> 8;
                                field3178 &= 0xFF;
                            }
                        } else if (field3177 == 256) {
                            if (field3173 != -1) {
                                method3867(this.field3176[var8], this.field3163[var8] + arg1 + 1, this.field3164[var8] + var4 + 1, var13, var14, field3173);
                            }
                            this.method3868(this.field3176[var8], this.field3163[var8] + arg1, this.field3164[var8] + var4, var13, var14, field3170);
                        } else {
                            if (field3173 != -1) {
                                method3843(this.field3176[var8], this.field3163[var8] + arg1 + 1, this.field3164[var8] + var4 + 1, var13, var14, field3173, field3177);
                            }
                            this.method3840(this.field3176[var8], this.field3163[var8] + arg1, this.field3164[var8] + var4, var13, var14, field3170, field3177);
                        }
                        int var15 = this.field3172[var8];
                        if (field3175 != -1) {
                            method1739(arg1, (int) ((double) this.field3165 * 0.7D) + var4, var15, field3175);
                        }
                        if (field3171 != -1) {
                            method1739(arg1, this.field3165 + var4 + 1, var15, field3171);
                        }
                        arg1 += var15;
                        var6 = var8;
                    }
                }
            }
        }
    }

    @ObfuscatedName("hg.d(Ljava/lang/String;II[I[I)V")
    public void method3838(String arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var6 = arg2 - this.field3165;
        int var7 = -1;
        int var8 = -1;
        int var9 = 0;
        for (int var10 = 0; var10 < arg0.length(); var10++) {
            if (arg0.charAt(var10) != 0) {
                char var11 = (char) (class165.method2078(arg0.charAt(var10)) & 0xFF);
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
                                        int var15 = class163.method2984(var12.substring(4));
                                        class81 var16 = Statics.field3159[var15];
                                        var16.method1790(arg1 + var13, this.field3165 + var6 - var16.field1375 + var14);
                                        arg1 += var16.field1379;
                                        var8 = -1;
                                    } catch (Exception var23) {
                                    }
                                } else {
                                    this.method3846(var12);
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
                        if (this.field3174 != null && var8 != -1) {
                            arg1 += this.field3174[(var8 << 8) + var11];
                        }
                        int var18 = this.field3160[var11];
                        int var19 = this.field3162[var11];
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
                            if (field3161 > 0) {
                                field3178 += field3161;
                                arg1 += field3178 >> 8;
                                field3178 &= 0xFF;
                            }
                        } else if (field3177 == 256) {
                            if (field3173 != -1) {
                                method3867(this.field3176[var11], this.field3163[var11] + arg1 + 1 + var20, this.field3164[var11] + var6 + 1 + var21, var18, var19, field3173);
                            }
                            this.method3868(this.field3176[var11], this.field3163[var11] + arg1 + var20, this.field3164[var11] + var6 + var21, var18, var19, field3170);
                        } else {
                            if (field3173 != -1) {
                                method3843(this.field3176[var11], this.field3163[var11] + arg1 + 1 + var20, this.field3164[var11] + var6 + 1 + var21, var18, var19, field3173, field3177);
                            }
                            this.method3840(this.field3176[var11], this.field3163[var11] + arg1 + var20, this.field3164[var11] + var6 + var21, var18, var19, field3170, field3177);
                        }
                        int var22 = this.field3172[var11];
                        if (field3175 != -1) {
                            method1739(arg1, (int) ((double) this.field3165 * 0.7D) + var6, var22, field3175);
                        }
                        if (field3171 != -1) {
                            method1739(arg1, this.field3165 + var6, var22, field3171);
                        }
                        arg1 += var22;
                        var8 = var11;
                    }
                }
            }
        }
    }

    @ObfuscatedName("hg.w([BIIIII)V")
    public static void method3867(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = Statics.field1368 * arg2 + arg1;
        int var7 = Statics.field1368 - arg3;
        int var8 = 0;
        int var9 = 0;
        if (arg2 < field1369) {
            int var10 = field1369 - arg2;
            arg4 -= var10;
            arg2 = field1369;
            var9 += arg3 * var10;
            var6 += Statics.field1368 * var10;
        }
        if (arg2 + arg4 > field1370) {
            arg4 -= arg2 + arg4 - field1370;
        }
        if (arg1 < field1367) {
            int var11 = field1367 - arg1;
            arg3 -= var11;
            arg1 = field1367;
            var9 += var11;
            var6 += var11;
            var8 += var11;
            var7 += var11;
        }
        if (arg1 + arg3 > field1372) {
            int var12 = arg1 + arg3 - field1372;
            arg3 -= var12;
            var8 += var12;
            var7 += var12;
        }
        if (arg3 > 0 && arg4 > 0) {
            method3842(Statics.field1371, arg0, arg5, var9, var6, arg3, arg4, var7, var8);
        }
    }

    @ObfuscatedName("hg.z([I[BIIIIIII)V")
    public static void method3842(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @ObfuscatedName("hg.t([BIIIIII)V")
    public static void method3843(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = Statics.field1368 * arg2 + arg1;
        int var8 = Statics.field1368 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < field1369) {
            int var11 = field1369 - arg2;
            arg4 -= var11;
            arg2 = field1369;
            var10 += arg3 * var11;
            var7 += Statics.field1368 * var11;
        }
        if (arg2 + arg4 > field1370) {
            arg4 -= arg2 + arg4 - field1370;
        }
        if (arg1 < field1367) {
            int var12 = field1367 - arg1;
            arg3 -= var12;
            arg1 = field1367;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > field1372) {
            int var13 = arg1 + arg3 - field1372;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            method3844(Statics.field1371, arg0, arg5, var10, var7, arg3, arg4, var8, var9, arg6);
        }
    }

    @ObfuscatedName("hg.aq([I[BIIIIIIII)V")
    public static void method3844(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
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

    @ObfuscatedName("hg.o([BIIIIII)V")
    public abstract void method3840(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @ObfuscatedName("hg.q([BIIIII)V")
    public abstract void method3868(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5);
}
