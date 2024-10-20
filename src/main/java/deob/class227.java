package deob;

import java.util.Random;

@ObfuscatedName("hu")
public abstract class class227 extends class83 {

    @ObfuscatedName("hu.k")
    public byte[][] field3239 = new byte[256][];

    @ObfuscatedName("hu.q")
    public int[] field3236;

    @ObfuscatedName("hu.f")
    public int[] field3237;

    @ObfuscatedName("hu.c")
    public int[] field3238;

    @ObfuscatedName("hu.v")
    public int[] field3243;

    @ObfuscatedName("hu.j")
    public int[] field3252;

    @ObfuscatedName("hu.m")
    public int field3241 = 0;

    @ObfuscatedName("hu.y")
    public int field3250;

    @ObfuscatedName("hu.u")
    public int field3251;

    @ObfuscatedName("hu.l")
    public byte[] field3245;

    @ObfuscatedName("hu.b")
    public static int field3235 = -1;

    @ObfuscatedName("hu.a")
    public static int field3247 = -1;

    @ObfuscatedName("hu.n")
    public static int field3246 = -1;

    @ObfuscatedName("hu.z")
    public static int field3249 = -1;

    @ObfuscatedName("hu.x")
    public static int field3253 = 0;

    @ObfuscatedName("hu.d")
    public static int field3255 = 0;

    @ObfuscatedName("hu.t")
    public static int field3242 = 256;

    @ObfuscatedName("hu.o")
    public static int field3248 = 0;

    @ObfuscatedName("hu.aq")
    public static int field3254 = 0;

    @ObfuscatedName("hu.al")
    public static Random field3240 = new Random();

    @ObfuscatedName("hu.av")
    public static String[] field3256 = new String[100];

    public class227(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, byte[][] arg6) {
        this.field3243 = arg1;
        this.field3252 = arg2;
        this.field3237 = arg3;
        this.field3238 = arg4;
        this.method3797(arg0);
        this.field3239 = arg6;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        for (int var10 = 0; var10 < 256; var10++) {
            if (this.field3252[var10] < var8 && this.field3238[var10] != 0) {
                var8 = this.field3252[var10];
            }
            if (this.field3252[var10] + this.field3238[var10] > var9) {
                var9 = this.field3252[var10] + this.field3238[var10];
            }
        }
        this.field3250 = this.field3241 - var8;
        this.field3251 = var9 - this.field3241;
    }

    public class227(byte[] arg0) {
        this.method3797(arg0);
    }

    @ObfuscatedName("hu.k([B)V")
    public void method3797(byte[] arg0) {
        this.field3236 = new int[256];
        if (arg0.length == 257) {
            for (int var2 = 0; var2 < this.field3236.length; var2++) {
                this.field3236[var2] = arg0[var2] & 0xFF;
            }
            this.field3241 = arg0[256] & 0xFF;
            return;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < 256; var4++) {
            this.field3236[var4] = arg0[var3++] & 0xFF;
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
        this.field3245 = new byte[65536];
        for (int var17 = 0; var17 < 256; var17++) {
            if (var17 != 32 && var17 != 160) {
                for (int var18 = 0; var18 < 256; var18++) {
                    if (var18 != 32 && var18 != 160) {
                        this.field3245[(var17 << 8) + var18] = (byte) method3798(var9, var13, var6, this.field3236, var5, var17, var18);
                    }
                }
            }
        }
        this.field3241 = var5[32] + var6[32];
    }

    @ObfuscatedName("hu.q([[B[[B[I[I[III)I")
    public static int method3798(byte[][] arg0, byte[][] arg1, int[] arg2, int[] arg3, int[] arg4, int arg5, int arg6) {
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

    @ObfuscatedName("hu.f(C)I")
    public int method3806(char arg0) {
        if (arg0 == 160) {
            arg0 = ' ';
        }
        return this.field3236[class169.method1629(arg0) & 0xFF];
    }

    @ObfuscatedName("hu.c(Ljava/lang/String;)I")
    public int method3799(String arg0) {
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
                                    int var8 = class167.method2851(var7.substring(4));
                                    var4 += Statics.field3244[var8].field1481;
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
                    var4 += this.field3236[(char) (class169.method1629(var6) & 0xFF)];
                    if (this.field3245 != null && var3 != -1) {
                        var4 += this.field3245[(var3 << 8) + var6];
                    }
                    var3 = var6;
                }
            }
        }
        return var4;
    }

    @ObfuscatedName("hu.v(Ljava/lang/String;[I[Ljava/lang/String;)I")
    public int method3813(String arg0, int[] arg1, String[] arg2) {
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
                        var4 += this.method3806('<');
                        if (this.field3245 != null && var11 != -1) {
                            var4 += this.field3245[(var11 << 8) + 60];
                        }
                        var11 = '<';
                    } else if (var16.equals("gt")) {
                        var4 += this.method3806('>');
                        if (this.field3245 != null && var11 != -1) {
                            var4 += this.field3245[(var11 << 8) + 62];
                        }
                        var11 = '>';
                    } else if (var16.startsWith("img=")) {
                        try {
                            int var17 = class167.method2851(var16.substring(4));
                            var4 += Statics.field3244[var17].field1481;
                            var11 = 0;
                        } catch (Exception var20) {
                        }
                    }
                    var15 = 0;
                }
                if (var10 == -1) {
                    if (var15 != 0) {
                        var6.append(var15);
                        var4 += this.method3806(var15);
                        if (this.field3245 != null && var11 != -1) {
                            var4 += this.field3245[(var11 << 8) + var15];
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

    @ObfuscatedName("hu.j(Ljava/lang/String;I)I")
    public int method3801(String arg0, int arg1) {
        int var3 = this.method3813(arg0, new int[] { arg1 }, field3256);
        int var4 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = this.method3799(field3256[var5]);
            if (var6 > var4) {
                var4 = var6;
            }
        }
        return var4;
    }

    @ObfuscatedName("hu.m(Ljava/lang/String;I)I")
    public int method3802(String arg0, int arg1) {
        return this.method3813(arg0, new int[] { arg1 }, field3256);
    }

    @ObfuscatedName("hu.y(Ljava/lang/String;)Ljava/lang/String;")
    public static String method3812(String arg0) {
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

    @ObfuscatedName("hu.u(Ljava/lang/String;IIII)V")
    public void method3870(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method3850(arg3, arg4);
            this.method3866(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("hu.h(Ljava/lang/String;IIIII)V")
    public void method3804(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 != null) {
            this.method3850(arg3, arg4);
            field3242 = arg5;
            this.method3866(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("hu.l(Ljava/lang/String;IIII)V")
    public void method3805(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method3850(arg3, arg4);
            this.method3866(arg0, arg1 - this.method3799(arg0), arg2);
        }
    }

    @ObfuscatedName("hu.b(Ljava/lang/String;IIII)V")
    public void method3811(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method3850(arg3, arg4);
            this.method3866(arg0, arg1 - this.method3799(arg0) / 2, arg2);
        }
    }

    @ObfuscatedName("hu.g(Ljava/lang/String;IIIIIIIII)I")
    public int method3807(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg0 == null) {
            return 0;
        }
        this.method3850(arg5, arg6);
        if (arg9 == 0) {
            arg9 = this.field3241;
        }
        int[] var11 = new int[] { arg3 };
        if (arg4 < this.field3251 + this.field3250 + arg9 && arg4 < arg9 + arg9) {
            var11 = null;
        }
        int var12 = this.method3813(arg0, var11, field3256);
        if (arg8 == 3 && var12 == 1) {
            arg8 = 1;
        }
        int var13;
        if (arg8 == 0) {
            var13 = this.field3250 + arg2;
        } else if (arg8 == 1) {
            var13 = (arg4 - this.field3250 - this.field3251 - (var12 - 1) * arg9) / 2 + this.field3250 + arg2;
        } else if (arg8 == 2) {
            var13 = arg2 + arg4 - this.field3251 - (var12 - 1) * arg9;
        } else {
            int var14 = (arg4 - this.field3250 - this.field3251 - (var12 - 1) * arg9) / (var12 + 1);
            if (var14 < 0) {
                var14 = 0;
            }
            var13 = this.field3250 + arg2 + var14;
            arg9 += var14;
        }
        for (int var15 = 0; var15 < var12; var15++) {
            if (arg7 == 0) {
                this.method3866(field3256[var15], arg1, var13);
            } else if (arg7 == 1) {
                this.method3866(field3256[var15], arg1 + (arg3 - this.method3799(field3256[var15])) / 2, var13);
            } else if (arg7 == 2) {
                this.method3866(field3256[var15], arg1 + arg3 - this.method3799(field3256[var15]), var13);
            } else if (var12 - 1 == var15) {
                this.method3866(field3256[var15], arg1, var13);
            } else {
                this.method3814(field3256[var15], arg3);
                this.method3866(field3256[var15], arg1, var13);
                field3248 = 0;
            }
            var13 += arg9;
        }
        return var12;
    }

    @ObfuscatedName("hu.e(Ljava/lang/String;IIIII)V")
    public void method3808(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method3850(arg3, arg4);
        int[] var7 = new int[arg0.length()];
        for (int var8 = 0; var8 < arg0.length(); var8++) {
            var7[var8] = (int) (Math.sin((double) arg5 / 5.0D + (double) var8 / 2.0D) * 5.0D);
        }
        this.method3853(arg0, arg1 - this.method3799(arg0) / 2, arg2, (int[]) null, var7);
    }

    @ObfuscatedName("hu.p(Ljava/lang/String;IIIII)V")
    public void method3809(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method3850(arg3, arg4);
        int[] var7 = new int[arg0.length()];
        int[] var8 = new int[arg0.length()];
        for (int var9 = 0; var9 < arg0.length(); var9++) {
            var7[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 5.0D) * 5.0D);
            var8[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 3.0D) * 5.0D);
        }
        this.method3853(arg0, arg1 - this.method3799(arg0) / 2, arg2, var7, var8);
    }

    @ObfuscatedName("hu.s(Ljava/lang/String;IIIIII)V")
    public void method3810(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 == null) {
            return;
        }
        this.method3850(arg3, arg4);
        double var8 = 7.0D - (double) arg6 / 8.0D;
        if (var8 < 0.0D) {
            var8 = 0.0D;
        }
        int[] var10 = new int[arg0.length()];
        for (int var11 = 0; var11 < arg0.length(); var11++) {
            var10[var11] = (int) (Math.sin((double) arg5 / 1.0D + (double) var11 / 1.5D) * var8);
        }
        this.method3853(arg0, arg1 - this.method3799(arg0) / 2, arg2, (int[]) null, var10);
    }

    @ObfuscatedName("hu.w(Ljava/lang/String;IIIII)V")
    public void method3831(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method3850(arg3, arg4);
        field3240.setSeed((long) arg5);
        field3242 = 192 + (field3240.nextInt() & 0x1F);
        int[] var7 = new int[arg0.length()];
        int var8 = 0;
        for (int var9 = 0; var9 < arg0.length(); var9++) {
            var7[var9] = var8;
            if ((field3240.nextInt() & 0x3) == 0) {
                var8++;
            }
        }
        this.method3853(arg0, arg1, arg2, var7, (int[]) null);
    }

    @ObfuscatedName("hu.i(II)V")
    public void method3850(int arg0, int arg1) {
        field3235 = -1;
        field3247 = -1;
        field3246 = arg1;
        field3249 = arg1;
        field3253 = arg0;
        field3255 = arg0;
        field3242 = 256;
        field3248 = 0;
        field3254 = 0;
    }

    @ObfuscatedName("hu.r(Ljava/lang/String;)V")
    public void method3815(String arg0) {
        try {
            if (arg0.startsWith("col=")) {
                String var2 = arg0.substring(4);
                int var3 = class167.method575(var2, 16, true);
                field3255 = var3;
            } else if (arg0.equals("/col")) {
                field3255 = field3253;
            } else if (arg0.startsWith("str=")) {
                String var4 = arg0.substring(4);
                int var5 = class167.method575(var4, 16, true);
                field3235 = var5;
            } else if (arg0.equals("str")) {
                field3235 = 8388608;
            } else if (arg0.equals("/str")) {
                field3235 = -1;
            } else if (arg0.startsWith("u=")) {
                String var6 = arg0.substring(2);
                int var7 = class167.method575(var6, 16, true);
                field3247 = var7;
            } else if (arg0.equals("u")) {
                field3247 = 0;
            } else if (arg0.equals("/u")) {
                field3247 = -1;
            } else if (arg0.startsWith("shad=")) {
                String var8 = arg0.substring(5);
                int var9 = class167.method575(var8, 16, true);
                field3249 = var9;
            } else if (arg0.equals("shad")) {
                field3249 = 0;
            } else if (arg0.equals("/shad")) {
                field3249 = field3246;
            } else if (arg0.equals("br")) {
                this.method3850(field3253, field3246);
            }
        } catch (Exception var11) {
        }
    }

    @ObfuscatedName("hu.a(Ljava/lang/String;I)V")
    public void method3814(String arg0, int arg1) {
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
            field3248 = (arg1 - this.method3799(arg0) << 8) / var3;
        }
    }

    @ObfuscatedName("hu.n(Ljava/lang/String;II)V")
    public void method3866(String arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field3241;
        int var5 = -1;
        int var6 = -1;
        for (int var7 = 0; var7 < arg0.length(); var7++) {
            if (arg0.charAt(var7) != 0) {
                char var8 = (char) (class169.method1629(arg0.charAt(var7)) & 0xFF);
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
                                        int var10 = class167.method2851(var9.substring(4));
                                        class84 var11 = Statics.field3244[var10];
                                        var11.method1808(arg1, this.field3241 + var4 - var11.field1482);
                                        arg1 += var11.field1481;
                                        var6 = -1;
                                    } catch (Exception var16) {
                                    }
                                } else {
                                    this.method3815(var9);
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
                        if (this.field3245 != null && var6 != -1) {
                            arg1 += this.field3245[(var6 << 8) + var8];
                        }
                        int var13 = this.field3237[var8];
                        int var14 = this.field3238[var8];
                        if (var8 == ' ') {
                            if (field3248 > 0) {
                                field3254 += field3248;
                                arg1 += field3254 >> 8;
                                field3254 &= 0xFF;
                            }
                        } else if (field3242 == 256) {
                            if (field3249 != -1) {
                                method3819(this.field3239[var8], this.field3243[var8] + arg1 + 1, this.field3252[var8] + var4 + 1, var13, var14, field3249);
                            }
                            this.method3817(this.field3239[var8], this.field3243[var8] + arg1, this.field3252[var8] + var4, var13, var14, field3255);
                        } else {
                            if (field3249 != -1) {
                                method3821(this.field3239[var8], this.field3243[var8] + arg1 + 1, this.field3252[var8] + var4 + 1, var13, var14, field3249, field3242);
                            }
                            this.method3818(this.field3239[var8], this.field3243[var8] + arg1, this.field3252[var8] + var4, var13, var14, field3255, field3242);
                        }
                        int var15 = this.field3236[var8];
                        if (field3235 != -1) {
                            method1792(arg1, (int) ((double) this.field3241 * 0.7D) + var4, var15, field3235);
                        }
                        if (field3247 != -1) {
                            method1792(arg1, this.field3241 + var4 + 1, var15, field3247);
                        }
                        arg1 += var15;
                        var6 = var8;
                    }
                }
            }
        }
    }

    @ObfuscatedName("hu.z(Ljava/lang/String;II[I[I)V")
    public void method3853(String arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var6 = arg2 - this.field3241;
        int var7 = -1;
        int var8 = -1;
        int var9 = 0;
        for (int var10 = 0; var10 < arg0.length(); var10++) {
            if (arg0.charAt(var10) != 0) {
                char var11 = (char) (class169.method1629(arg0.charAt(var10)) & 0xFF);
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
                                        int var15 = class167.method2851(var12.substring(4));
                                        class84 var16 = Statics.field3244[var15];
                                        var16.method1808(arg1 + var13, this.field3241 + var6 - var16.field1482 + var14);
                                        arg1 += var16.field1481;
                                        var8 = -1;
                                    } catch (Exception var23) {
                                    }
                                } else {
                                    this.method3815(var12);
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
                        if (this.field3245 != null && var8 != -1) {
                            arg1 += this.field3245[(var8 << 8) + var11];
                        }
                        int var18 = this.field3237[var11];
                        int var19 = this.field3238[var11];
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
                            if (field3248 > 0) {
                                field3254 += field3248;
                                arg1 += field3254 >> 8;
                                field3254 &= 0xFF;
                            }
                        } else if (field3242 == 256) {
                            if (field3249 != -1) {
                                method3819(this.field3239[var11], this.field3243[var11] + arg1 + 1 + var20, this.field3252[var11] + var6 + 1 + var21, var18, var19, field3249);
                            }
                            this.method3817(this.field3239[var11], this.field3243[var11] + arg1 + var20, this.field3252[var11] + var6 + var21, var18, var19, field3255);
                        } else {
                            if (field3249 != -1) {
                                method3821(this.field3239[var11], this.field3243[var11] + arg1 + 1 + var20, this.field3252[var11] + var6 + 1 + var21, var18, var19, field3249, field3242);
                            }
                            this.method3818(this.field3239[var11], this.field3243[var11] + arg1 + var20, this.field3252[var11] + var6 + var21, var18, var19, field3255, field3242);
                        }
                        int var22 = this.field3236[var11];
                        if (field3235 != -1) {
                            method1792(arg1, (int) ((double) this.field3241 * 0.7D) + var6, var22, field3235);
                        }
                        if (field3247 != -1) {
                            method1792(arg1, this.field3241 + var6, var22, field3247);
                        }
                        arg1 += var22;
                        var8 = var11;
                    }
                }
            }
        }
    }

    @ObfuscatedName("hu.t([BIIIII)V")
    public static void method3819(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = Statics.field1469 * arg2 + arg1;
        int var7 = Statics.field1469 - arg3;
        int var8 = 0;
        int var9 = 0;
        if (arg2 < field1471) {
            int var10 = field1471 - arg2;
            arg4 -= var10;
            arg2 = field1471;
            var9 += arg3 * var10;
            var6 += Statics.field1469 * var10;
        }
        if (arg2 + arg4 > field1472) {
            arg4 -= arg2 + arg4 - field1472;
        }
        if (arg1 < field1473) {
            int var11 = field1473 - arg1;
            arg3 -= var11;
            arg1 = field1473;
            var9 += var11;
            var6 += var11;
            var8 += var11;
            var7 += var11;
        }
        if (arg1 + arg3 > field1468) {
            int var12 = arg1 + arg3 - field1468;
            arg3 -= var12;
            var8 += var12;
            var7 += var12;
        }
        if (arg3 > 0 && arg4 > 0) {
            method3820(Statics.field1470, arg0, arg5, var9, var6, arg3, arg4, var7, var8);
        }
    }

    @ObfuscatedName("hu.o([I[BIIIIIII)V")
    public static void method3820(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @ObfuscatedName("hu.aq([BIIIIII)V")
    public static void method3821(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = Statics.field1469 * arg2 + arg1;
        int var8 = Statics.field1469 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < field1471) {
            int var11 = field1471 - arg2;
            arg4 -= var11;
            arg2 = field1471;
            var10 += arg3 * var11;
            var7 += Statics.field1469 * var11;
        }
        if (arg2 + arg4 > field1472) {
            arg4 -= arg2 + arg4 - field1472;
        }
        if (arg1 < field1473) {
            int var12 = field1473 - arg1;
            arg3 -= var12;
            arg1 = field1473;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > field1468) {
            int var13 = arg1 + arg3 - field1468;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            method3822(Statics.field1470, arg0, arg5, var10, var7, arg3, arg4, var8, var9, arg6);
        }
    }

    @ObfuscatedName("hu.al([I[BIIIIIIII)V")
    public static void method3822(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
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

    @ObfuscatedName("hu.x([BIIIII)V")
    public abstract void method3817(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @ObfuscatedName("hu.d([BIIIIII)V")
    public abstract void method3818(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);
}
