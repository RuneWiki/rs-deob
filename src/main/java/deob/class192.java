package deob;

import java.util.Random;

@ObfuscatedName("gn")
public abstract class class192 extends class73 {

    @ObfuscatedName("gn.k")
    public byte[][] field2914 = new byte[256][];

    @ObfuscatedName("gn.b")
    public int[] field2903;

    @ObfuscatedName("gn.e")
    public int[] field2898;

    @ObfuscatedName("gn.i")
    public int[] field2899;

    @ObfuscatedName("gn.t")
    public int[] field2900;

    @ObfuscatedName("gn.z")
    public int[] field2901;

    @ObfuscatedName("gn.g")
    public int field2907 = 0;

    @ObfuscatedName("gn.c")
    public int field2896;

    @ObfuscatedName("gn.o")
    public int field2904;

    @ObfuscatedName("gn.w")
    public byte[] field2906;

    @ObfuscatedName("gn.y")
    public static int field2917 = -1;

    @ObfuscatedName("gn.v")
    public static int field2908 = -1;

    @ObfuscatedName("gn.s")
    public static int field2909 = -1;

    @ObfuscatedName("gn.r")
    public static int field2910 = -1;

    @ObfuscatedName("gn.j")
    public static int field2911 = 0;

    @ObfuscatedName("gn.h")
    public static int field2912 = 0;

    @ObfuscatedName("gn.d")
    public static int field2913 = 256;

    @ObfuscatedName("gn.l")
    public static int field2905 = 0;

    @ObfuscatedName("gn.ag")
    public static int field2897 = 0;

    @ObfuscatedName("gn.au")
    public static Random field2916 = new Random();

    @ObfuscatedName("gn.ak")
    public static String[] field2915 = new String[100];

    public class192(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, byte[][] arg6) {
        this.field2900 = arg1;
        this.field2901 = arg2;
        this.field2898 = arg3;
        this.field2899 = arg4;
        this.method3363(arg0);
        this.field2914 = arg6;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        for (int var10 = 0; var10 < 256; var10++) {
            if (this.field2901[var10] < var8 && this.field2899[var10] != 0) {
                var8 = this.field2901[var10];
            }
            if (this.field2901[var10] + this.field2899[var10] > var9) {
                var9 = this.field2901[var10] + this.field2899[var10];
            }
        }
        this.field2896 = this.field2907 - var8;
        this.field2904 = var9 - this.field2907;
    }

    public class192(byte[] arg0) {
        this.method3363(arg0);
    }

    @ObfuscatedName("gn.k([B)V")
    public void method3363(byte[] arg0) {
        this.field2903 = new int[256];
        if (arg0.length == 257) {
            for (int var2 = 0; var2 < this.field2903.length; var2++) {
                this.field2903[var2] = arg0[var2] & 0xFF;
            }
            this.field2907 = arg0[256] & 0xFF;
            return;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < 256; var4++) {
            this.field2903[var4] = arg0[var3++] & 0xFF;
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
        this.field2906 = new byte[65536];
        for (int var17 = 0; var17 < 256; var17++) {
            if (var17 != 32 && var17 != 160) {
                for (int var18 = 0; var18 < 256; var18++) {
                    if (var18 != 32 && var18 != 160) {
                        this.field2906[(var17 << 8) + var18] = (byte) method3414(var9, var13, var6, this.field2903, var5, var17, var18);
                    }
                }
            }
        }
        this.field2907 = var5[32] + var6[32];
    }

    @ObfuscatedName("gn.b([[B[[B[I[I[III)I")
    public static int method3414(byte[][] arg0, byte[][] arg1, int[] arg2, int[] arg3, int[] arg4, int arg5, int arg6) {
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

    @ObfuscatedName("gn.e(C)I")
    public int method3399(char arg0) {
        if (arg0 == 160) {
            arg0 = ' ';
        }
        return this.field2903[class201.method1969(arg0) & 0xFF];
    }

    @ObfuscatedName("gn.i(Ljava/lang/String;)I")
    public int method3421(String arg0) {
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
                                    int var9 = class199.method1369(var8, 10, true);
                                    var4 += Statics.field2902[var9].field1328;
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
                    var4 += this.field2903[(char) (class201.method1969(var6) & 0xFF)];
                    if (this.field2906 != null && var3 != -1) {
                        var4 += this.field2906[(var3 << 8) + var6];
                    }
                    var3 = var6;
                }
            }
        }
        return var4;
    }

    @ObfuscatedName("gn.t(Ljava/lang/String;[I[Ljava/lang/String;)I")
    public int method3365(String arg0, int[] arg1, String[] arg2) {
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
                        var4 += this.method3399('<');
                        if (this.field2906 != null && var11 != -1) {
                            var4 += this.field2906[(var11 << 8) + 60];
                        }
                        var11 = '<';
                    } else if (var16.equals("gt")) {
                        var4 += this.method3399('>');
                        if (this.field2906 != null && var11 != -1) {
                            var4 += this.field2906[(var11 << 8) + 62];
                        }
                        var11 = '>';
                    } else if (var16.startsWith("img=")) {
                        try {
                            String var17 = var16.substring(4);
                            int var18 = class199.method1369(var17, 10, true);
                            var4 += Statics.field2902[var18].field1328;
                            var11 = 0;
                        } catch (Exception var22) {
                        }
                    }
                    var15 = 0;
                }
                if (var10 == -1) {
                    if (var15 != 0) {
                        var6.append(var15);
                        var4 += this.method3399(var15);
                        if (this.field2906 != null && var11 != -1) {
                            var4 += this.field2906[(var11 << 8) + var15];
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

    @ObfuscatedName("gn.z(Ljava/lang/String;I)I")
    public int method3360(String arg0, int arg1) {
        int var3 = this.method3365(arg0, new int[] { arg1 }, field2915);
        int var4 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = this.method3421(field2915[var5]);
            if (var6 > var4) {
                var4 = var6;
            }
        }
        return var4;
    }

    @ObfuscatedName("gn.g(Ljava/lang/String;I)I")
    public int method3367(String arg0, int arg1) {
        return this.method3365(arg0, new int[] { arg1 }, field2915);
    }

    @ObfuscatedName("gn.c(Ljava/lang/String;)Ljava/lang/String;")
    public static String method3368(String arg0) {
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

    @ObfuscatedName("gn.o(Ljava/lang/String;IIII)V")
    public void method3380(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method3406(arg3, arg4);
            this.method3429(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("gn.q(Ljava/lang/String;IIII)V")
    public void method3370(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method3406(arg3, arg4);
            this.method3429(arg0, arg1 - this.method3421(arg0), arg2);
        }
    }

    @ObfuscatedName("gn.w(Ljava/lang/String;IIII)V")
    public void method3371(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method3406(arg3, arg4);
            this.method3429(arg0, arg1 - this.method3421(arg0) / 2, arg2);
        }
    }

    @ObfuscatedName("gn.y(Ljava/lang/String;IIIIIIIII)I")
    public int method3377(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg0 == null) {
            return 0;
        }
        this.method3406(arg5, arg6);
        if (arg9 == 0) {
            arg9 = this.field2907;
        }
        int[] var11 = new int[] { arg3 };
        if (arg4 < this.field2904 + this.field2896 + arg9 && arg4 < arg9 + arg9) {
            var11 = null;
        }
        int var12 = this.method3365(arg0, var11, field2915);
        if (arg8 == 3 && var12 == 1) {
            arg8 = 1;
        }
        int var13;
        if (arg8 == 0) {
            var13 = this.field2896 + arg2;
        } else if (arg8 == 1) {
            var13 = (arg4 - this.field2896 - this.field2904 - (var12 - 1) * arg9) / 2 + this.field2896 + arg2;
        } else if (arg8 == 2) {
            var13 = arg2 + arg4 - this.field2904 - (var12 - 1) * arg9;
        } else {
            int var14 = (arg4 - this.field2896 - this.field2904 - (var12 - 1) * arg9) / (var12 + 1);
            if (var14 < 0) {
                var14 = 0;
            }
            var13 = this.field2896 + arg2 + var14;
            arg9 += var14;
        }
        for (int var15 = 0; var15 < var12; var15++) {
            if (arg7 == 0) {
                this.method3429(field2915[var15], arg1, var13);
            } else if (arg7 == 1) {
                this.method3429(field2915[var15], arg1 + (arg3 - this.method3421(field2915[var15])) / 2, var13);
            } else if (arg7 == 2) {
                this.method3429(field2915[var15], arg1 + arg3 - this.method3421(field2915[var15]), var13);
            } else if (var12 - 1 == var15) {
                this.method3429(field2915[var15], arg1, var13);
            } else {
                this.method3379(field2915[var15], arg3);
                this.method3429(field2915[var15], arg1, var13);
                field2905 = 0;
            }
            var13 += arg9;
        }
        return var12;
    }

    @ObfuscatedName("gn.p(Ljava/lang/String;IIIII)V")
    public void method3373(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method3406(arg3, arg4);
        int[] var7 = new int[arg0.length()];
        for (int var8 = 0; var8 < arg0.length(); var8++) {
            var7[var8] = (int) (Math.sin((double) arg5 / 5.0D + (double) var8 / 2.0D) * 5.0D);
        }
        this.method3362(arg0, arg1 - this.method3421(arg0) / 2, arg2, (int[]) null, var7);
    }

    @ObfuscatedName("gn.m(Ljava/lang/String;IIIII)V")
    public void method3374(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method3406(arg3, arg4);
        int[] var7 = new int[arg0.length()];
        int[] var8 = new int[arg0.length()];
        for (int var9 = 0; var9 < arg0.length(); var9++) {
            var7[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 5.0D) * 5.0D);
            var8[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 3.0D) * 5.0D);
        }
        this.method3362(arg0, arg1 - this.method3421(arg0) / 2, arg2, var7, var8);
    }

    @ObfuscatedName("gn.a(Ljava/lang/String;IIIIII)V")
    public void method3375(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 == null) {
            return;
        }
        this.method3406(arg3, arg4);
        double var8 = 7.0D - (double) arg6 / 8.0D;
        if (var8 < 0.0D) {
            var8 = 0.0D;
        }
        int[] var10 = new int[arg0.length()];
        for (int var11 = 0; var11 < arg0.length(); var11++) {
            var10[var11] = (int) (Math.sin((double) arg5 / 1.0D + (double) var11 / 1.5D) * var8);
        }
        this.method3362(arg0, arg1 - this.method3421(arg0) / 2, arg2, (int[]) null, var10);
    }

    @ObfuscatedName("gn.u(Ljava/lang/String;IIIII)V")
    public void method3376(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method3406(arg3, arg4);
        field2916.setSeed((long) arg5);
        field2913 = 192 + (field2916.nextInt() & 0x1F);
        int[] var7 = new int[arg0.length()];
        int var8 = 0;
        for (int var9 = 0; var9 < arg0.length(); var9++) {
            var7[var9] = var8;
            if ((field2916.nextInt() & 0x3) == 0) {
                var8++;
            }
        }
        this.method3362(arg0, arg1, arg2, var7, (int[]) null);
    }

    @ObfuscatedName("gn.n(II)V")
    public void method3406(int arg0, int arg1) {
        field2917 = -1;
        field2908 = -1;
        field2909 = arg1;
        field2910 = arg1;
        field2911 = arg0;
        field2912 = arg0;
        field2913 = 256;
        field2905 = 0;
        field2897 = 0;
    }

    @ObfuscatedName("gn.x(Ljava/lang/String;)V")
    public void method3378(String arg0) {
        try {
            if (arg0.startsWith("col=")) {
                field2912 = class199.method3148(arg0.substring(4), 16);
            } else if (arg0.equals("/col")) {
                field2912 = field2911;
            } else if (arg0.startsWith("str=")) {
                field2917 = class199.method3148(arg0.substring(4), 16);
            } else if (arg0.equals("str")) {
                field2917 = 8388608;
            } else if (arg0.equals("/str")) {
                field2917 = -1;
            } else if (arg0.startsWith("u=")) {
                field2908 = class199.method3148(arg0.substring(2), 16);
            } else if (arg0.equals("u")) {
                field2908 = 0;
            } else if (arg0.equals("/u")) {
                field2908 = -1;
            } else if (arg0.startsWith("shad=")) {
                field2910 = class199.method3148(arg0.substring(5), 16);
            } else if (arg0.equals("shad")) {
                field2910 = 0;
            } else if (arg0.equals("/shad")) {
                field2910 = field2909;
            } else if (arg0.equals("br")) {
                this.method3406(field2911, field2909);
            }
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("gn.f(Ljava/lang/String;I)V")
    public void method3379(String arg0, int arg1) {
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
            field2905 = (arg1 - this.method3421(arg0) << 8) / var3;
        }
    }

    @ObfuscatedName("gn.v(Ljava/lang/String;II)V")
    public void method3429(String arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field2907;
        int var5 = -1;
        int var6 = -1;
        for (int var7 = 0; var7 < arg0.length(); var7++) {
            if (arg0.charAt(var7) != 0) {
                char var8 = (char) (class201.method1969(arg0.charAt(var7)) & 0xFF);
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
                                        int var11 = class199.method1369(var10, 10, true);
                                        class74 var13 = Statics.field2902[var11];
                                        var13.method1565(arg1, this.field2907 + var4 - var13.field1332);
                                        arg1 += var13.field1328;
                                        var6 = -1;
                                    } catch (Exception var18) {
                                    }
                                } else {
                                    this.method3378(var9);
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
                        if (this.field2906 != null && var6 != -1) {
                            arg1 += this.field2906[(var6 << 8) + var8];
                        }
                        int var15 = this.field2898[var8];
                        int var16 = this.field2899[var8];
                        if (var8 == ' ') {
                            if (field2905 > 0) {
                                field2897 += field2905;
                                arg1 += field2897 >> 8;
                                field2897 &= 0xFF;
                            }
                        } else if (field2913 == 256) {
                            if (field2910 != -1) {
                                method3384(this.field2914[var8], this.field2900[var8] + arg1 + 1, this.field2901[var8] + var4 + 1, var15, var16, field2910);
                            }
                            this.method3382(this.field2914[var8], this.field2900[var8] + arg1, this.field2901[var8] + var4, var15, var16, field2912);
                        } else {
                            if (field2910 != -1) {
                                method3386(this.field2914[var8], this.field2900[var8] + arg1 + 1, this.field2901[var8] + var4 + 1, var15, var16, field2910, field2913);
                            }
                            this.method3383(this.field2914[var8], this.field2900[var8] + arg1, this.field2901[var8] + var4, var15, var16, field2912, field2913);
                        }
                        int var17 = this.field2903[var8];
                        if (field2917 != -1) {
                            method1521(arg1, (int) ((double) this.field2907 * 0.7D) + var4, var17, field2917);
                        }
                        if (field2908 != -1) {
                            method1521(arg1, this.field2907 + var4 + 1, var17, field2908);
                        }
                        arg1 += var17;
                        var6 = var8;
                    }
                }
            }
        }
    }

    @ObfuscatedName("gn.s(Ljava/lang/String;II[I[I)V")
    public void method3362(String arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var6 = arg2 - this.field2907;
        int var7 = -1;
        int var8 = -1;
        int var9 = 0;
        for (int var10 = 0; var10 < arg0.length(); var10++) {
            if (arg0.charAt(var10) != 0) {
                char var11 = (char) (class201.method1969(arg0.charAt(var10)) & 0xFF);
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
                                        int var16 = class199.method1369(var15, 10, true);
                                        class74 var18 = Statics.field2902[var16];
                                        var18.method1565(arg1 + var13, this.field2907 + var6 - var18.field1332 + var14);
                                        arg1 += var18.field1328;
                                        var8 = -1;
                                    } catch (Exception var25) {
                                    }
                                } else {
                                    this.method3378(var12);
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
                        if (this.field2906 != null && var8 != -1) {
                            arg1 += this.field2906[(var8 << 8) + var11];
                        }
                        int var20 = this.field2898[var11];
                        int var21 = this.field2899[var11];
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
                            if (field2905 > 0) {
                                field2897 += field2905;
                                arg1 += field2897 >> 8;
                                field2897 &= 0xFF;
                            }
                        } else if (field2913 == 256) {
                            if (field2910 != -1) {
                                method3384(this.field2914[var11], this.field2900[var11] + arg1 + 1 + var22, this.field2901[var11] + var6 + 1 + var23, var20, var21, field2910);
                            }
                            this.method3382(this.field2914[var11], this.field2900[var11] + arg1 + var22, this.field2901[var11] + var6 + var23, var20, var21, field2912);
                        } else {
                            if (field2910 != -1) {
                                method3386(this.field2914[var11], this.field2900[var11] + arg1 + 1 + var22, this.field2901[var11] + var6 + 1 + var23, var20, var21, field2910, field2913);
                            }
                            this.method3383(this.field2914[var11], this.field2900[var11] + arg1 + var22, this.field2901[var11] + var6 + var23, var20, var21, field2912, field2913);
                        }
                        int var24 = this.field2903[var11];
                        if (field2917 != -1) {
                            method1521(arg1, (int) ((double) this.field2907 * 0.7D) + var6, var24, field2917);
                        }
                        if (field2908 != -1) {
                            method1521(arg1, this.field2907 + var6, var24, field2908);
                        }
                        arg1 += var24;
                        var8 = var11;
                    }
                }
            }
        }
    }

    @ObfuscatedName("gn.h([BIIIII)V")
    public static void method3384(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = Statics.field1319 * arg2 + arg1;
        int var7 = Statics.field1319 - arg3;
        int var8 = 0;
        int var9 = 0;
        if (arg2 < field1318) {
            int var10 = field1318 - arg2;
            arg4 -= var10;
            arg2 = field1318;
            var9 += arg3 * var10;
            var6 += Statics.field1319 * var10;
        }
        if (arg2 + arg4 > field1320) {
            arg4 -= arg2 + arg4 - field1320;
        }
        if (arg1 < field1322) {
            int var11 = field1322 - arg1;
            arg3 -= var11;
            arg1 = field1322;
            var9 += var11;
            var6 += var11;
            var8 += var11;
            var7 += var11;
        }
        if (arg1 + arg3 > field1324) {
            int var12 = arg1 + arg3 - field1324;
            arg3 -= var12;
            var8 += var12;
            var7 += var12;
        }
        if (arg3 > 0 && arg4 > 0) {
            method3366(Statics.field1323, arg0, arg5, var9, var6, arg3, arg4, var7, var8);
        }
    }

    @ObfuscatedName("gn.d([I[BIIIIIII)V")
    public static void method3366(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @ObfuscatedName("gn.l([BIIIIII)V")
    public static void method3386(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = Statics.field1319 * arg2 + arg1;
        int var8 = Statics.field1319 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < field1318) {
            int var11 = field1318 - arg2;
            arg4 -= var11;
            arg2 = field1318;
            var10 += arg3 * var11;
            var7 += Statics.field1319 * var11;
        }
        if (arg2 + arg4 > field1320) {
            arg4 -= arg2 + arg4 - field1320;
        }
        if (arg1 < field1322) {
            int var12 = field1322 - arg1;
            arg3 -= var12;
            arg1 = field1322;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > field1324) {
            int var13 = arg1 + arg3 - field1324;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            method3387(Statics.field1323, arg0, arg5, var10, var7, arg3, arg4, var8, var9, arg6);
        }
    }

    @ObfuscatedName("gn.ag([I[BIIIIIIII)V")
    public static void method3387(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
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

    @ObfuscatedName("gn.r([BIIIII)V")
    public abstract void method3382(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @ObfuscatedName("gn.j([BIIIIII)V")
    public abstract void method3383(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);
}
