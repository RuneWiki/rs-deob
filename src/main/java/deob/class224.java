package deob;

import java.util.Random;

@ObfuscatedName("hy")
public abstract class class224 extends class80 {

    @ObfuscatedName("hy.a")
    public byte[][] field3195 = new byte[256][];

    @ObfuscatedName("hy.w")
    public int[] field3200;

    @ObfuscatedName("hy.d")
    public int[] field3187;

    @ObfuscatedName("hy.c")
    public int[] field3189;

    @ObfuscatedName("hy.y")
    public int[] field3186;

    @ObfuscatedName("hy.k")
    public int[] field3190;

    @ObfuscatedName("hy.r")
    public int field3191 = 0;

    @ObfuscatedName("hy.p")
    public int field3192;

    @ObfuscatedName("hy.q")
    public int field3193;

    @ObfuscatedName("hy.e")
    public byte[] field3204;

    @ObfuscatedName("hy.x")
    public static int field3196 = -1;

    @ObfuscatedName("hy.h")
    public static int field3197 = -1;

    @ObfuscatedName("hy.s")
    public static int field3205 = -1;

    @ObfuscatedName("hy.f")
    public static int field3199 = -1;

    @ObfuscatedName("hy.b")
    public static int field3185 = 0;

    @ObfuscatedName("hy.l")
    public static int field3201 = 0;

    @ObfuscatedName("hy.o")
    public static int field3202 = 256;

    @ObfuscatedName("hy.v")
    public static int field3203 = 0;

    @ObfuscatedName("hy.ad")
    public static int field3198 = 0;

    @ObfuscatedName("hy.ar")
    public static Random field3188 = new Random();

    @ObfuscatedName("hy.ah")
    public static String[] field3206 = new String[100];

    public class224(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, byte[][] arg6) {
        this.field3186 = arg1;
        this.field3190 = arg2;
        this.field3187 = arg3;
        this.field3189 = arg4;
        this.method3847(arg0);
        this.field3195 = arg6;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        for (int var10 = 0; var10 < 256; var10++) {
            if (this.field3190[var10] < var8 && this.field3189[var10] != 0) {
                var8 = this.field3190[var10];
            }
            if (this.field3190[var10] + this.field3189[var10] > var9) {
                var9 = this.field3190[var10] + this.field3189[var10];
            }
        }
        this.field3192 = this.field3191 - var8;
        this.field3193 = var9 - this.field3191;
    }

    public class224(byte[] arg0) {
        this.method3847(arg0);
    }

    @ObfuscatedName("hy.a([B)V")
    public void method3847(byte[] arg0) {
        this.field3200 = new int[256];
        if (arg0.length == 257) {
            for (int var2 = 0; var2 < this.field3200.length; var2++) {
                this.field3200[var2] = arg0[var2] & 0xFF;
            }
            this.field3191 = arg0[256] & 0xFF;
            return;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < 256; var4++) {
            this.field3200[var4] = arg0[var3++] & 0xFF;
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
        this.field3204 = new byte[65536];
        for (int var17 = 0; var17 < 256; var17++) {
            if (var17 != 32 && var17 != 160) {
                for (int var18 = 0; var18 < 256; var18++) {
                    if (var18 != 32 && var18 != 160) {
                        this.field3204[(var17 << 8) + var18] = (byte) method3848(var9, var13, var6, this.field3200, var5, var17, var18);
                    }
                }
            }
        }
        this.field3191 = var5[32] + var6[32];
    }

    @ObfuscatedName("hy.w([[B[[B[I[I[III)I")
    public static int method3848(byte[][] arg0, byte[][] arg1, int[] arg2, int[] arg3, int[] arg4, int arg5, int arg6) {
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

    @ObfuscatedName("hy.d(C)I")
    public int method3908(char arg0) {
        if (arg0 == 160) {
            arg0 = ' ';
        }
        return this.field3200[class166.method1114(arg0) & 0xFF];
    }

    @ObfuscatedName("hy.c(Ljava/lang/String;)I")
    public int method3850(String arg0) {
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
                                    int var8 = class164.method965(var7.substring(4));
                                    var4 += Statics.field3194[var8].field1426;
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
                    var4 += this.field3200[(char) (class166.method1114(var6) & 0xFF)];
                    if (this.field3204 != null && var3 != -1) {
                        var4 += this.field3204[(var3 << 8) + var6];
                    }
                    var3 = var6;
                }
            }
        }
        return var4;
    }

    @ObfuscatedName("hy.y(Ljava/lang/String;[I[Ljava/lang/String;)I")
    public int method3851(String arg0, int[] arg1, String[] arg2) {
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
                        var4 += this.method3908('<');
                        if (this.field3204 != null && var11 != -1) {
                            var4 += this.field3204[(var11 << 8) + 60];
                        }
                        var11 = '<';
                    } else if (var16.equals("gt")) {
                        var4 += this.method3908('>');
                        if (this.field3204 != null && var11 != -1) {
                            var4 += this.field3204[(var11 << 8) + 62];
                        }
                        var11 = '>';
                    } else if (var16.startsWith("img=")) {
                        try {
                            String var17 = var16.substring(4);
                            int var18 = class164.method3053(var17, 10, true);
                            var4 += Statics.field3194[var18].field1426;
                            var11 = 0;
                        } catch (Exception var22) {
                        }
                    }
                    var15 = 0;
                }
                if (var10 == -1) {
                    if (var15 != 0) {
                        var6.append(var15);
                        var4 += this.method3908(var15);
                        if (this.field3204 != null && var11 != -1) {
                            var4 += this.field3204[(var11 << 8) + var15];
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

    @ObfuscatedName("hy.k(Ljava/lang/String;I)I")
    public int method3852(String arg0, int arg1) {
        int var3 = this.method3851(arg0, new int[] { arg1 }, field3206);
        int var4 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = this.method3850(field3206[var5]);
            if (var6 > var4) {
                var4 = var6;
            }
        }
        return var4;
    }

    @ObfuscatedName("hy.r(Ljava/lang/String;I)I")
    public int method3853(String arg0, int arg1) {
        return this.method3851(arg0, new int[] { arg1 }, field3206);
    }

    @ObfuscatedName("hy.p(Ljava/lang/String;)Ljava/lang/String;")
    public static String method3854(String arg0) {
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

    @ObfuscatedName("hy.q(Ljava/lang/String;IIII)V")
    public void method3855(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method3897(arg3, arg4);
            this.method3866(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("hy.m(Ljava/lang/String;IIII)V")
    public void method3856(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method3897(arg3, arg4);
            this.method3866(arg0, arg1 - this.method3850(arg0), arg2);
        }
    }

    @ObfuscatedName("hy.e(Ljava/lang/String;IIII)V")
    public void method3857(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method3897(arg3, arg4);
            this.method3866(arg0, arg1 - this.method3850(arg0) / 2, arg2);
        }
    }

    @ObfuscatedName("hy.x(Ljava/lang/String;IIIIIIIII)I")
    public int method3858(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg0 == null) {
            return 0;
        }
        this.method3897(arg5, arg6);
        if (arg9 == 0) {
            arg9 = this.field3191;
        }
        int[] var11 = new int[] { arg3 };
        if (arg4 < this.field3193 + this.field3192 + arg9 && arg4 < arg9 + arg9) {
            var11 = null;
        }
        int var12 = this.method3851(arg0, var11, field3206);
        if (arg8 == 3 && var12 == 1) {
            arg8 = 1;
        }
        int var13;
        if (arg8 == 0) {
            var13 = this.field3192 + arg2;
        } else if (arg8 == 1) {
            var13 = (arg4 - this.field3192 - this.field3193 - (var12 - 1) * arg9) / 2 + this.field3192 + arg2;
        } else if (arg8 == 2) {
            var13 = arg2 + arg4 - this.field3193 - (var12 - 1) * arg9;
        } else {
            int var14 = (arg4 - this.field3192 - this.field3193 - (var12 - 1) * arg9) / (var12 + 1);
            if (var14 < 0) {
                var14 = 0;
            }
            var13 = this.field3192 + arg2 + var14;
            arg9 += var14;
        }
        for (int var15 = 0; var15 < var12; var15++) {
            if (arg7 == 0) {
                this.method3866(field3206[var15], arg1, var13);
            } else if (arg7 == 1) {
                this.method3866(field3206[var15], arg1 + (arg3 - this.method3850(field3206[var15])) / 2, var13);
            } else if (arg7 == 2) {
                this.method3866(field3206[var15], arg1 + arg3 - this.method3850(field3206[var15]), var13);
            } else if (var12 - 1 == var15) {
                this.method3866(field3206[var15], arg1, var13);
            } else {
                this.method3903(field3206[var15], arg3);
                this.method3866(field3206[var15], arg1, var13);
                field3203 = 0;
            }
            var13 += arg9;
        }
        return var12;
    }

    @ObfuscatedName("hy.z(Ljava/lang/String;IIIII)V")
    public void method3859(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method3897(arg3, arg4);
        int[] var7 = new int[arg0.length()];
        for (int var8 = 0; var8 < arg0.length(); var8++) {
            var7[var8] = (int) (Math.sin((double) arg5 / 5.0D + (double) var8 / 2.0D) * 5.0D);
        }
        this.method3905(arg0, arg1 - this.method3850(arg0) / 2, arg2, (int[]) null, var7);
    }

    @ObfuscatedName("hy.i(Ljava/lang/String;IIIII)V")
    public void method3860(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method3897(arg3, arg4);
        int[] var7 = new int[arg0.length()];
        int[] var8 = new int[arg0.length()];
        for (int var9 = 0; var9 < arg0.length(); var9++) {
            var7[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 5.0D) * 5.0D);
            var8[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 3.0D) * 5.0D);
        }
        this.method3905(arg0, arg1 - this.method3850(arg0) / 2, arg2, var7, var8);
    }

    @ObfuscatedName("hy.t(Ljava/lang/String;IIIIII)V")
    public void method3861(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 == null) {
            return;
        }
        this.method3897(arg3, arg4);
        double var8 = 7.0D - (double) arg6 / 8.0D;
        if (var8 < 0.0D) {
            var8 = 0.0D;
        }
        int[] var10 = new int[arg0.length()];
        for (int var11 = 0; var11 < arg0.length(); var11++) {
            var10[var11] = (int) (Math.sin((double) arg5 / 1.0D + (double) var11 / 1.5D) * var8);
        }
        this.method3905(arg0, arg1 - this.method3850(arg0) / 2, arg2, (int[]) null, var10);
    }

    @ObfuscatedName("hy.n(Ljava/lang/String;IIIII)V")
    public void method3889(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method3897(arg3, arg4);
        field3188.setSeed((long) arg5);
        field3202 = 192 + (field3188.nextInt() & 0x1F);
        int[] var7 = new int[arg0.length()];
        int var8 = 0;
        for (int var9 = 0; var9 < arg0.length(); var9++) {
            var7[var9] = var8;
            if ((field3188.nextInt() & 0x3) == 0) {
                var8++;
            }
        }
        this.method3905(arg0, arg1, arg2, var7, (int[]) null);
    }

    @ObfuscatedName("hy.u(II)V")
    public void method3897(int arg0, int arg1) {
        field3196 = -1;
        field3197 = -1;
        field3205 = arg1;
        field3199 = arg1;
        field3185 = arg0;
        field3201 = arg0;
        field3202 = 256;
        field3203 = 0;
        field3198 = 0;
    }

    @ObfuscatedName("hy.g(Ljava/lang/String;)V")
    public void method3925(String arg0) {
        try {
            if (arg0.startsWith("col=")) {
                field3201 = class164.method3047(arg0.substring(4), 16);
            } else if (arg0.equals("/col")) {
                field3201 = field3185;
            } else if (arg0.startsWith("str=")) {
                field3196 = class164.method3047(arg0.substring(4), 16);
            } else if (arg0.equals("str")) {
                field3196 = 8388608;
            } else if (arg0.equals("/str")) {
                field3196 = -1;
            } else if (arg0.startsWith("u=")) {
                field3197 = class164.method3047(arg0.substring(2), 16);
            } else if (arg0.equals("u")) {
                field3197 = 0;
            } else if (arg0.equals("/u")) {
                field3197 = -1;
            } else if (arg0.startsWith("shad=")) {
                field3199 = class164.method3047(arg0.substring(5), 16);
            } else if (arg0.equals("shad")) {
                field3199 = 0;
            } else if (arg0.equals("/shad")) {
                field3199 = field3205;
            } else if (arg0.equals("br")) {
                this.method3897(field3185, field3205);
            }
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("hy.j(Ljava/lang/String;I)V")
    public void method3903(String arg0, int arg1) {
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
            field3203 = (arg1 - this.method3850(arg0) << 8) / var3;
        }
    }

    @ObfuscatedName("hy.h(Ljava/lang/String;II)V")
    public void method3866(String arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field3191;
        int var5 = -1;
        int var6 = -1;
        for (int var7 = 0; var7 < arg0.length(); var7++) {
            if (arg0.charAt(var7) != 0) {
                char var8 = (char) (class166.method1114(arg0.charAt(var7)) & 0xFF);
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
                                        int var11 = class164.method3053(var10, 10, true);
                                        class81 var13 = Statics.field3194[var11];
                                        var13.method1850(arg1, this.field3191 + var4 - var13.field1427);
                                        arg1 += var13.field1426;
                                        var6 = -1;
                                    } catch (Exception var18) {
                                    }
                                } else {
                                    this.method3925(var9);
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
                        if (this.field3204 != null && var6 != -1) {
                            arg1 += this.field3204[(var6 << 8) + var8];
                        }
                        int var15 = this.field3187[var8];
                        int var16 = this.field3189[var8];
                        if (var8 == ' ') {
                            if (field3203 > 0) {
                                field3198 += field3203;
                                arg1 += field3198 >> 8;
                                field3198 &= 0xFF;
                            }
                        } else if (field3202 == 256) {
                            if (field3199 != -1) {
                                method3873(this.field3195[var8], this.field3186[var8] + arg1 + 1, this.field3190[var8] + var4 + 1, var15, var16, field3199);
                            }
                            this.method3849(this.field3195[var8], this.field3186[var8] + arg1, this.field3190[var8] + var4, var15, var16, field3201);
                        } else {
                            if (field3199 != -1) {
                                method3872(this.field3195[var8], this.field3186[var8] + arg1 + 1, this.field3190[var8] + var4 + 1, var15, var16, field3199, field3202);
                            }
                            this.method3869(this.field3195[var8], this.field3186[var8] + arg1, this.field3190[var8] + var4, var15, var16, field3201, field3202);
                        }
                        int var17 = this.field3200[var8];
                        if (field3196 != -1) {
                            method1791(arg1, (int) ((double) this.field3191 * 0.7D) + var4, var17, field3196);
                        }
                        if (field3197 != -1) {
                            method1791(arg1, this.field3191 + var4 + 1, var17, field3197);
                        }
                        arg1 += var17;
                        var6 = var8;
                    }
                }
            }
        }
    }

    @ObfuscatedName("hy.s(Ljava/lang/String;II[I[I)V")
    public void method3905(String arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var6 = arg2 - this.field3191;
        int var7 = -1;
        int var8 = -1;
        int var9 = 0;
        for (int var10 = 0; var10 < arg0.length(); var10++) {
            if (arg0.charAt(var10) != 0) {
                char var11 = (char) (class166.method1114(arg0.charAt(var10)) & 0xFF);
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
                                        int var16 = class164.method3053(var15, 10, true);
                                        class81 var18 = Statics.field3194[var16];
                                        var18.method1850(arg1 + var13, this.field3191 + var6 - var18.field1427 + var14);
                                        arg1 += var18.field1426;
                                        var8 = -1;
                                    } catch (Exception var25) {
                                    }
                                } else {
                                    this.method3925(var12);
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
                        if (this.field3204 != null && var8 != -1) {
                            arg1 += this.field3204[(var8 << 8) + var11];
                        }
                        int var20 = this.field3187[var11];
                        int var21 = this.field3189[var11];
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
                            if (field3203 > 0) {
                                field3198 += field3203;
                                arg1 += field3198 >> 8;
                                field3198 &= 0xFF;
                            }
                        } else if (field3202 == 256) {
                            if (field3199 != -1) {
                                method3873(this.field3195[var11], this.field3186[var11] + arg1 + 1 + var22, this.field3190[var11] + var6 + 1 + var23, var20, var21, field3199);
                            }
                            this.method3849(this.field3195[var11], this.field3186[var11] + arg1 + var22, this.field3190[var11] + var6 + var23, var20, var21, field3201);
                        } else {
                            if (field3199 != -1) {
                                method3872(this.field3195[var11], this.field3186[var11] + arg1 + 1 + var22, this.field3190[var11] + var6 + 1 + var23, var20, var21, field3199, field3202);
                            }
                            this.method3869(this.field3195[var11], this.field3186[var11] + arg1 + var22, this.field3190[var11] + var6 + var23, var20, var21, field3201, field3202);
                        }
                        int var24 = this.field3200[var11];
                        if (field3196 != -1) {
                            method1791(arg1, (int) ((double) this.field3191 * 0.7D) + var6, var24, field3196);
                        }
                        if (field3197 != -1) {
                            method1791(arg1, this.field3191 + var6, var24, field3197);
                        }
                        arg1 += var24;
                        var8 = var11;
                    }
                }
            }
        }
    }

    @ObfuscatedName("hy.l([BIIIII)V")
    public static void method3873(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = Statics.field1418 * arg2 + arg1;
        int var7 = Statics.field1418 - arg3;
        int var8 = 0;
        int var9 = 0;
        if (arg2 < field1416) {
            int var10 = field1416 - arg2;
            arg4 -= var10;
            arg2 = field1416;
            var9 += arg3 * var10;
            var6 += Statics.field1418 * var10;
        }
        if (arg2 + arg4 > field1417) {
            arg4 -= arg2 + arg4 - field1417;
        }
        if (arg1 < field1413) {
            int var11 = field1413 - arg1;
            arg3 -= var11;
            arg1 = field1413;
            var9 += var11;
            var6 += var11;
            var8 += var11;
            var7 += var11;
        }
        if (arg1 + arg3 > field1419) {
            int var12 = arg1 + arg3 - field1419;
            arg3 -= var12;
            var8 += var12;
            var7 += var12;
        }
        if (arg3 > 0 && arg4 > 0) {
            method3911(Statics.field1414, arg0, arg5, var9, var6, arg3, arg4, var7, var8);
        }
    }

    @ObfuscatedName("hy.o([I[BIIIIIII)V")
    public static void method3911(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @ObfuscatedName("hy.v([BIIIIII)V")
    public static void method3872(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = Statics.field1418 * arg2 + arg1;
        int var8 = Statics.field1418 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < field1416) {
            int var11 = field1416 - arg2;
            arg4 -= var11;
            arg2 = field1416;
            var10 += arg3 * var11;
            var7 += Statics.field1418 * var11;
        }
        if (arg2 + arg4 > field1417) {
            arg4 -= arg2 + arg4 - field1417;
        }
        if (arg1 < field1413) {
            int var12 = field1413 - arg1;
            arg3 -= var12;
            arg1 = field1413;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > field1419) {
            int var13 = arg1 + arg3 - field1419;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            method3871(Statics.field1414, arg0, arg5, var10, var7, arg3, arg4, var8, var9, arg6);
        }
    }

    @ObfuscatedName("hy.ad([I[BIIIIIIII)V")
    public static void method3871(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
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

    @ObfuscatedName("hy.f([BIIIII)V")
    public abstract void method3849(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @ObfuscatedName("hy.b([BIIIIII)V")
    public abstract void method3869(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);
}
