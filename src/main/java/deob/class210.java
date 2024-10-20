package deob;

import java.util.Random;

@ObfuscatedName("hz")
public abstract class class210 extends class220 {

    @ObfuscatedName("hz.u")
    public byte[][] field3090 = new byte[256][];

    @ObfuscatedName("hz.x")
    public int[] field3085;

    @ObfuscatedName("hz.i")
    public int[] field3084;

    @ObfuscatedName("hz.a")
    public int[] field3082;

    @ObfuscatedName("hz.f")
    public int[] field3086;

    @ObfuscatedName("hz.c")
    public int[] field3100;

    @ObfuscatedName("hz.d")
    public int field3088 = 0;

    @ObfuscatedName("hz.l")
    public int field3089;

    @ObfuscatedName("hz.g")
    public int field3095;

    @ObfuscatedName("hz.t")
    public byte[] field3092;

    @ObfuscatedName("hz.m")
    public static int field3093 = -1;

    @ObfuscatedName("hz.q")
    public static int field3087 = -1;

    @ObfuscatedName("hz.e")
    public static int field3083 = -1;

    @ObfuscatedName("hz.v")
    public static int field3096 = -1;

    @ObfuscatedName("hz.j")
    public static int field3097 = 0;

    @ObfuscatedName("hz.p")
    public static int field3098 = 0;

    @ObfuscatedName("hz.k")
    public static int field3094 = 256;

    @ObfuscatedName("hz.r")
    public static int field3103 = 0;

    @ObfuscatedName("hz.y")
    public static int field3101 = 0;

    @ObfuscatedName("hz.h")
    public static Random field3102 = new Random();

    @ObfuscatedName("hz.s")
    public static String[] field3099 = new String[100];

    public class210(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, byte[][] arg6) {
        this.field3086 = arg1;
        this.field3100 = arg2;
        this.field3084 = arg3;
        this.field3082 = arg4;
        this.method3650(arg0);
        this.field3090 = arg6;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        for (int var10 = 0; var10 < 256; var10++) {
            if (this.field3100[var10] < var8 && this.field3082[var10] != 0) {
                var8 = this.field3100[var10];
            }
            if (this.field3100[var10] + this.field3082[var10] > var9) {
                var9 = this.field3100[var10] + this.field3082[var10];
            }
        }
        this.field3089 = this.field3088 - var8;
        this.field3095 = var9 - this.field3088;
    }

    public class210(byte[] arg0) {
        this.method3650(arg0);
    }

    @ObfuscatedName("hz.t([B)V")
    public void method3650(byte[] arg0) {
        this.field3085 = new int[256];
        if (arg0.length == 257) {
            for (int var2 = 0; var2 < this.field3085.length; var2++) {
                this.field3085[var2] = arg0[var2] & 0xFF;
            }
            this.field3088 = arg0[256] & 0xFF;
            return;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < 256; var4++) {
            this.field3085[var4] = arg0[var3++] & 0xFF;
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
        this.field3092 = new byte[65536];
        for (int var17 = 0; var17 < 256; var17++) {
            if (var17 != 32 && var17 != 160) {
                for (int var18 = 0; var18 < 256; var18++) {
                    if (var18 != 32 && var18 != 160) {
                        this.field3092[(var17 << 8) + var18] = (byte) method3651(var9, var13, var6, this.field3085, var5, var17, var18);
                    }
                }
            }
        }
        this.field3088 = var5[32] + var6[32];
    }

    @ObfuscatedName("hz.m([[B[[B[I[I[III)I")
    public static int method3651(byte[][] arg0, byte[][] arg1, int[] arg2, int[] arg3, int[] arg4, int arg5, int arg6) {
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

    @ObfuscatedName("hz.q(C)I")
    public int method3652(char arg0) {
        if (arg0 == 160) {
            arg0 = ' ';
        }
        return this.field3085[class204.method241(arg0) & 0xFF];
    }

    @ObfuscatedName("hz.e(Ljava/lang/String;)I")
    public int method3665(String arg0) {
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
                                    int var8 = class208.method184(var7.substring(4));
                                    var4 += Statics.field3091[var8].field3197;
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
                    var4 += this.field3085[(char) (class204.method241(var6) & 0xFF)];
                    if (this.field3092 != null && var3 != -1) {
                        var4 += this.field3092[(var3 << 8) + var6];
                    }
                    var3 = var6;
                }
            }
        }
        return var4;
    }

    @ObfuscatedName("hz.v(Ljava/lang/String;[I[Ljava/lang/String;)I")
    public int method3654(String arg0, int[] arg1, String[] arg2) {
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
                        var4 += this.method3652('<');
                        if (this.field3092 != null && var11 != -1) {
                            var4 += this.field3092[(var11 << 8) + 60];
                        }
                        var11 = '<';
                    } else if (var16.equals("gt")) {
                        var4 += this.method3652('>');
                        if (this.field3092 != null && var11 != -1) {
                            var4 += this.field3092[(var11 << 8) + 62];
                        }
                        var11 = '>';
                    } else if (var16.startsWith("img=")) {
                        try {
                            String var17 = var16.substring(4);
                            int var18 = class208.method3292(var17, 10, true);
                            var4 += Statics.field3091[var18].field3197;
                            var11 = 0;
                        } catch (Exception var22) {
                        }
                    }
                    var15 = 0;
                }
                if (var10 == -1) {
                    if (var15 != 0) {
                        var6.append(var15);
                        var4 += this.method3652(var15);
                        if (this.field3092 != null && var11 != -1) {
                            var4 += this.field3092[(var11 << 8) + var15];
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

    @ObfuscatedName("hz.j(Ljava/lang/String;I)I")
    public int method3655(String arg0, int arg1) {
        int var3 = this.method3654(arg0, new int[] { arg1 }, field3099);
        int var4 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = this.method3665(field3099[var5]);
            if (var6 > var4) {
                var4 = var6;
            }
        }
        return var4;
    }

    @ObfuscatedName("hz.p(Ljava/lang/String;I)I")
    public int method3656(String arg0, int arg1) {
        return this.method3654(arg0, new int[] { arg1 }, field3099);
    }

    @ObfuscatedName("hz.k(Ljava/lang/String;)Ljava/lang/String;")
    public static String method3657(String arg0) {
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

    @ObfuscatedName("hz.r(Ljava/lang/String;IIII)V")
    public void method3658(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method3667(arg3, arg4);
            this.method3670(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("hz.y(Ljava/lang/String;IIIII)V")
    public void method3659(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 != null) {
            this.method3667(arg3, arg4);
            field3094 = arg5;
            this.method3670(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("hz.h(Ljava/lang/String;IIII)V")
    public void method3660(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method3667(arg3, arg4);
            this.method3670(arg0, arg1 - this.method3665(arg0), arg2);
        }
    }

    @ObfuscatedName("hz.s(Ljava/lang/String;IIII)V")
    public void method3661(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method3667(arg3, arg4);
            this.method3670(arg0, arg1 - this.method3665(arg0) / 2, arg2);
        }
    }

    @ObfuscatedName("hz.w(Ljava/lang/String;IIIIIIIII)I")
    public int method3662(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg0 == null) {
            return 0;
        }
        this.method3667(arg5, arg6);
        if (arg9 == 0) {
            arg9 = this.field3088;
        }
        int[] var11 = new int[] { arg3 };
        if (arg4 < this.field3095 + this.field3089 + arg9 && arg4 < arg9 + arg9) {
            var11 = null;
        }
        int var12 = this.method3654(arg0, var11, field3099);
        if (arg8 == 3 && var12 == 1) {
            arg8 = 1;
        }
        int var13;
        if (arg8 == 0) {
            var13 = this.field3089 + arg2;
        } else if (arg8 == 1) {
            var13 = (arg4 - this.field3089 - this.field3095 - (var12 - 1) * arg9) / 2 + this.field3089 + arg2;
        } else if (arg8 == 2) {
            var13 = arg2 + arg4 - this.field3095 - (var12 - 1) * arg9;
        } else {
            int var14 = (arg4 - this.field3089 - this.field3095 - (var12 - 1) * arg9) / (var12 + 1);
            if (var14 < 0) {
                var14 = 0;
            }
            var13 = this.field3089 + arg2 + var14;
            arg9 += var14;
        }
        for (int var15 = 0; var15 < var12; var15++) {
            if (arg7 == 0) {
                this.method3670(field3099[var15], arg1, var13);
            } else if (arg7 == 1) {
                this.method3670(field3099[var15], arg1 + (arg3 - this.method3665(field3099[var15])) / 2, var13);
            } else if (arg7 == 2) {
                this.method3670(field3099[var15], arg1 + arg3 - this.method3665(field3099[var15]), var13);
            } else if (var12 - 1 == var15) {
                this.method3670(field3099[var15], arg1, var13);
            } else {
                this.method3669(field3099[var15], arg3);
                this.method3670(field3099[var15], arg1, var13);
                field3103 = 0;
            }
            var13 += arg9;
        }
        return var12;
    }

    @ObfuscatedName("hz.n(Ljava/lang/String;IIIII)V")
    public void method3701(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method3667(arg3, arg4);
        int[] var7 = new int[arg0.length()];
        for (int var8 = 0; var8 < arg0.length(); var8++) {
            var7[var8] = (int) (Math.sin((double) arg5 / 5.0D + (double) var8 / 2.0D) * 5.0D);
        }
        this.method3703(arg0, arg1 - this.method3665(arg0) / 2, arg2, (int[]) null, var7);
    }

    @ObfuscatedName("hz.o(Ljava/lang/String;IIIII)V")
    public void method3713(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method3667(arg3, arg4);
        int[] var7 = new int[arg0.length()];
        int[] var8 = new int[arg0.length()];
        for (int var9 = 0; var9 < arg0.length(); var9++) {
            var7[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 5.0D) * 5.0D);
            var8[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 3.0D) * 5.0D);
        }
        this.method3703(arg0, arg1 - this.method3665(arg0) / 2, arg2, var7, var8);
    }

    @ObfuscatedName("hz.b(Ljava/lang/String;IIIIII)V")
    public void method3686(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 == null) {
            return;
        }
        this.method3667(arg3, arg4);
        double var8 = 7.0D - (double) arg6 / 8.0D;
        if (var8 < 0.0D) {
            var8 = 0.0D;
        }
        int[] var10 = new int[arg0.length()];
        for (int var11 = 0; var11 < arg0.length(); var11++) {
            var10[var11] = (int) (Math.sin((double) arg5 / 1.0D + (double) var11 / 1.5D) * var8);
        }
        this.method3703(arg0, arg1 - this.method3665(arg0) / 2, arg2, (int[]) null, var10);
    }

    @ObfuscatedName("hz.aj(Ljava/lang/String;IIIII)V")
    public void method3666(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method3667(arg3, arg4);
        field3102.setSeed((long) arg5);
        field3094 = 192 + (field3102.nextInt() & 0x1F);
        int[] var7 = new int[arg0.length()];
        int var8 = 0;
        for (int var9 = 0; var9 < arg0.length(); var9++) {
            var7[var9] = var8;
            if ((field3102.nextInt() & 0x3) == 0) {
                var8++;
            }
        }
        this.method3703(arg0, arg1, arg2, var7, (int[]) null);
    }

    @ObfuscatedName("hz.ag(II)V")
    public void method3667(int arg0, int arg1) {
        field3093 = -1;
        field3087 = -1;
        field3083 = arg1;
        field3096 = arg1;
        field3097 = arg0;
        field3098 = arg0;
        field3094 = 256;
        field3103 = 0;
        field3101 = 0;
    }

    @ObfuscatedName("hz.al(Ljava/lang/String;)V")
    public void method3668(String arg0) {
        try {
            if (arg0.startsWith("col=")) {
                String var2 = arg0.substring(4);
                int var3 = class208.method3292(var2, 16, true);
                field3098 = var3;
            } else if (arg0.equals("/col")) {
                field3098 = field3097;
            } else if (arg0.startsWith("str=")) {
                String var4 = arg0.substring(4);
                int var5 = class208.method3292(var4, 16, true);
                field3093 = var5;
            } else if (arg0.equals("str")) {
                field3093 = 8388608;
            } else if (arg0.equals("/str")) {
                field3093 = -1;
            } else if (arg0.startsWith("u=")) {
                String var6 = arg0.substring(2);
                int var7 = class208.method3292(var6, 16, true);
                field3087 = var7;
            } else if (arg0.equals("u")) {
                field3087 = 0;
            } else if (arg0.equals("/u")) {
                field3087 = -1;
            } else if (arg0.startsWith("shad=")) {
                String var8 = arg0.substring(5);
                int var9 = class208.method3292(var8, 16, true);
                field3096 = var9;
            } else if (arg0.equals("shad")) {
                field3096 = 0;
            } else if (arg0.equals("/shad")) {
                field3096 = field3083;
            } else if (arg0.equals("br")) {
                this.method3667(field3097, field3083);
            }
        } catch (Exception var11) {
        }
    }

    @ObfuscatedName("hz.an(Ljava/lang/String;I)V")
    public void method3669(String arg0, int arg1) {
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
            field3103 = (arg1 - this.method3665(arg0) << 8) / var3;
        }
    }

    @ObfuscatedName("hz.af(Ljava/lang/String;II)V")
    public void method3670(String arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field3088;
        int var5 = -1;
        int var6 = -1;
        for (int var7 = 0; var7 < arg0.length(); var7++) {
            if (arg0.charAt(var7) != 0) {
                char var8 = (char) (class204.method241(arg0.charAt(var7)) & 0xFF);
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
                                        int var11 = class208.method3292(var10, 10, true);
                                        class223 var13 = Statics.field3091[var11];
                                        var13.method3839(arg1, this.field3088 + var4 - var13.field3198);
                                        arg1 += var13.field3197;
                                        var6 = -1;
                                    } catch (Exception var18) {
                                    }
                                } else {
                                    this.method3668(var9);
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
                        if (this.field3092 != null && var6 != -1) {
                            arg1 += this.field3092[(var6 << 8) + var8];
                        }
                        int var15 = this.field3084[var8];
                        int var16 = this.field3082[var8];
                        if (var8 == ' ') {
                            if (field3103 > 0) {
                                field3101 += field3103;
                                arg1 += field3101 >> 8;
                                field3101 &= 0xFF;
                            }
                        } else if (field3094 == 256) {
                            if (field3096 != -1) {
                                method3672(this.field3090[var8], this.field3086[var8] + arg1 + 1, this.field3100[var8] + var4 + 1, var15, var16, field3096);
                            }
                            this.method3643(this.field3090[var8], this.field3086[var8] + arg1, this.field3100[var8] + var4, var15, var16, field3098);
                        } else {
                            if (field3096 != -1) {
                                method3708(this.field3090[var8], this.field3086[var8] + arg1 + 1, this.field3100[var8] + var4 + 1, var15, var16, field3096, field3094);
                            }
                            this.method3645(this.field3090[var8], this.field3086[var8] + arg1, this.field3100[var8] + var4, var15, var16, field3098, field3094);
                        }
                        int var17 = this.field3085[var8];
                        if (field3093 != -1) {
                            method3765(arg1, (int) ((double) this.field3088 * 0.7D) + var4, var17, field3093);
                        }
                        if (field3087 != -1) {
                            method3765(arg1, this.field3088 + var4 + 1, var17, field3087);
                        }
                        arg1 += var17;
                        var6 = var8;
                    }
                }
            }
        }
    }

    @ObfuscatedName("hz.aa(Ljava/lang/String;II[I[I)V")
    public void method3703(String arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var6 = arg2 - this.field3088;
        int var7 = -1;
        int var8 = -1;
        int var9 = 0;
        for (int var10 = 0; var10 < arg0.length(); var10++) {
            if (arg0.charAt(var10) != 0) {
                char var11 = (char) (class204.method241(arg0.charAt(var10)) & 0xFF);
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
                                        int var16 = class208.method3292(var15, 10, true);
                                        class223 var18 = Statics.field3091[var16];
                                        var18.method3839(arg1 + var13, this.field3088 + var6 - var18.field3198 + var14);
                                        arg1 += var18.field3197;
                                        var8 = -1;
                                    } catch (Exception var25) {
                                    }
                                } else {
                                    this.method3668(var12);
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
                        if (this.field3092 != null && var8 != -1) {
                            arg1 += this.field3092[(var8 << 8) + var11];
                        }
                        int var20 = this.field3084[var11];
                        int var21 = this.field3082[var11];
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
                            if (field3103 > 0) {
                                field3101 += field3103;
                                arg1 += field3101 >> 8;
                                field3101 &= 0xFF;
                            }
                        } else if (field3094 == 256) {
                            if (field3096 != -1) {
                                method3672(this.field3090[var11], this.field3086[var11] + arg1 + 1 + var22, this.field3100[var11] + var6 + 1 + var23, var20, var21, field3096);
                            }
                            this.method3643(this.field3090[var11], this.field3086[var11] + arg1 + var22, this.field3100[var11] + var6 + var23, var20, var21, field3098);
                        } else {
                            if (field3096 != -1) {
                                method3708(this.field3090[var11], this.field3086[var11] + arg1 + 1 + var22, this.field3100[var11] + var6 + 1 + var23, var20, var21, field3096, field3094);
                            }
                            this.method3645(this.field3090[var11], this.field3086[var11] + arg1 + var22, this.field3100[var11] + var6 + var23, var20, var21, field3098, field3094);
                        }
                        int var24 = this.field3085[var11];
                        if (field3093 != -1) {
                            method3765(arg1, (int) ((double) this.field3088 * 0.7D) + var6, var24, field3093);
                        }
                        if (field3087 != -1) {
                            method3765(arg1, this.field3088 + var6, var24, field3087);
                        }
                        arg1 += var24;
                        var8 = var11;
                    }
                }
            }
        }
    }

    @ObfuscatedName("hz.ax([BIIIII)V")
    public static void method3672(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = Statics.field3175 * arg2 + arg1;
        int var7 = Statics.field3175 - arg3;
        int var8 = 0;
        int var9 = 0;
        if (arg2 < field3173) {
            int var10 = field3173 - arg2;
            arg4 -= var10;
            arg2 = field3173;
            var9 += arg3 * var10;
            var6 += Statics.field3175 * var10;
        }
        if (arg2 + arg4 > field3174) {
            arg4 -= arg2 + arg4 - field3174;
        }
        if (arg1 < field3172) {
            int var11 = field3172 - arg1;
            arg3 -= var11;
            arg1 = field3172;
            var9 += var11;
            var6 += var11;
            var8 += var11;
            var7 += var11;
        }
        if (arg1 + arg3 > field3176) {
            int var12 = arg1 + arg3 - field3176;
            arg3 -= var12;
            var8 += var12;
            var7 += var12;
        }
        if (arg3 > 0 && arg4 > 0) {
            method3673(Statics.field3171, arg0, arg5, var9, var6, arg3, arg4, var7, var8);
        }
    }

    @ObfuscatedName("hz.ai([I[BIIIIIII)V")
    public static void method3673(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @ObfuscatedName("hz.ah([BIIIIII)V")
    public static void method3708(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = Statics.field3175 * arg2 + arg1;
        int var8 = Statics.field3175 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < field3173) {
            int var11 = field3173 - arg2;
            arg4 -= var11;
            arg2 = field3173;
            var10 += arg3 * var11;
            var7 += Statics.field3175 * var11;
        }
        if (arg2 + arg4 > field3174) {
            arg4 -= arg2 + arg4 - field3174;
        }
        if (arg1 < field3172) {
            int var12 = field3172 - arg1;
            arg3 -= var12;
            arg1 = field3172;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > field3176) {
            int var13 = arg1 + arg3 - field3176;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            method3674(Statics.field3171, arg0, arg5, var10, var7, arg3, arg4, var8, var9, arg6);
        }
    }

    @ObfuscatedName("hz.av([I[BIIIIIIII)V")
    public static void method3674(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
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

    @ObfuscatedName("hz.u([BIIIII)V")
    public abstract void method3643(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @ObfuscatedName("hz.x([BIIIIII)V")
    public abstract void method3645(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);
}
