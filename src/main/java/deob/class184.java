package deob;

import java.util.Random;

@ObfuscatedName("gc")
public abstract class class184 extends class88 {

    @ObfuscatedName("gc.u")
    public byte[][] field2830 = new byte[256][];

    @ObfuscatedName("gc.k")
    public int[] field2829;

    @ObfuscatedName("gc.x")
    public int[] field2838;

    @ObfuscatedName("gc.m")
    public int[] field2831;

    @ObfuscatedName("gc.n")
    public int[] field2836;

    @ObfuscatedName("gc.q")
    public int[] field2833;

    @ObfuscatedName("gc.a")
    public int field2847 = 0;

    @ObfuscatedName("gc.g")
    public int field2835;

    @ObfuscatedName("gc.j")
    public int field2845;

    @ObfuscatedName("gc.w")
    public byte[] field2828;

    @ObfuscatedName("gc.z")
    public static int field2832 = -1;

    @ObfuscatedName("gc.s")
    public static int field2840 = -1;

    @ObfuscatedName("gc.f")
    public static int field2841 = -1;

    @ObfuscatedName("gc.y")
    public static int field2842 = -1;

    @ObfuscatedName("gc.t")
    public static int field2844 = 0;

    @ObfuscatedName("gc.r")
    public static int field2834 = 0;

    @ObfuscatedName("gc.p")
    public static int field2839 = 256;

    @ObfuscatedName("gc.o")
    public static int field2846 = 0;

    @ObfuscatedName("gc.ax")
    public static int field2843 = 0;

    @ObfuscatedName("gc.aa")
    public static Random field2848 = new Random();

    @ObfuscatedName("gc.af")
    public static String[] field2849 = new String[100];

    public class184(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, byte[][] arg6) {
        this.field2836 = arg1;
        this.field2833 = arg2;
        this.field2838 = arg3;
        this.field2831 = arg4;
        this.method3454(arg0);
        this.field2830 = arg6;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        for (int var10 = 0; var10 < 256; var10++) {
            if (this.field2833[var10] < var8 && this.field2831[var10] != 0) {
                var8 = this.field2833[var10];
            }
            if (this.field2833[var10] + this.field2831[var10] > var9) {
                var9 = this.field2833[var10] + this.field2831[var10];
            }
        }
        this.field2835 = this.field2847 - var8;
        this.field2845 = var9 - this.field2847;
    }

    public class184(byte[] arg0) {
        this.method3454(arg0);
    }

    @ObfuscatedName("gc.q([B)V")
    public void method3454(byte[] arg0) {
        this.field2829 = new int[256];
        if (arg0.length == 257) {
            for (int var2 = 0; var2 < this.field2829.length; var2++) {
                this.field2829[var2] = arg0[var2] & 0xFF;
            }
            this.field2847 = arg0[256] & 0xFF;
            return;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < 256; var4++) {
            this.field2829[var4] = arg0[var3++] & 0xFF;
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
        this.field2828 = new byte[65536];
        for (int var17 = 0; var17 < 256; var17++) {
            if (var17 != 32 && var17 != 160) {
                for (int var18 = 0; var18 < 256; var18++) {
                    if (var18 != 32 && var18 != 160) {
                        this.field2828[(var17 << 8) + var18] = (byte) method3394(var9, var13, var6, this.field2829, var5, var17, var18);
                    }
                }
            }
        }
        this.field2847 = var5[32] + var6[32];
    }

    @ObfuscatedName("gc.a([[B[[B[I[I[III)I")
    public static int method3394(byte[][] arg0, byte[][] arg1, int[] arg2, int[] arg3, int[] arg4, int arg5, int arg6) {
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

    @ObfuscatedName("gc.g(C)I")
    public int method3388(char arg0) {
        if (arg0 == 160) {
            arg0 = ' ';
        }
        return this.field2829[class148.method1268(arg0) & 0xFF];
    }

    @ObfuscatedName("gc.j(Ljava/lang/String;)I")
    public int method3389(String arg0) {
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
                                    int var9 = class146.method808(var8, 10, true);
                                    var4 += Statics.field2837[var9].field1460;
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
                    var4 += this.field2829[(char) (class148.method1268(var6) & 0xFF)];
                    if (this.field2828 != null && var3 != -1) {
                        var4 += this.field2828[(var3 << 8) + var6];
                    }
                    var3 = var6;
                }
            }
        }
        return var4;
    }

    @ObfuscatedName("gc.l(Ljava/lang/String;[I[Ljava/lang/String;)I")
    public int method3451(String arg0, int[] arg1, String[] arg2) {
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
                        var4 += this.method3388('<');
                        if (this.field2828 != null && var11 != -1) {
                            var4 += this.field2828[(var11 << 8) + 60];
                        }
                        var11 = '<';
                    } else if (var16.equals("gt")) {
                        var4 += this.method3388('>');
                        if (this.field2828 != null && var11 != -1) {
                            var4 += this.field2828[(var11 << 8) + 62];
                        }
                        var11 = '>';
                    } else if (var16.startsWith("img=")) {
                        try {
                            String var17 = var16.substring(4);
                            int var18 = class146.method808(var17, 10, true);
                            var4 += Statics.field2837[var18].field1460;
                            var11 = 0;
                        } catch (Exception var22) {
                        }
                    }
                    var15 = 0;
                }
                if (var10 == -1) {
                    if (var15 != -1) {
                        var6.append(var15);
                        var4 += this.method3388(var15);
                        if (this.field2828 != null && var11 != -1) {
                            var4 += this.field2828[(var11 << 8) + var15];
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

    @ObfuscatedName("gc.w(Ljava/lang/String;I)I")
    public int method3391(String arg0, int arg1) {
        int var3 = this.method3451(arg0, new int[] { arg1 }, field2849);
        int var4 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = this.method3389(field2849[var5]);
            if (var6 > var4) {
                var4 = var6;
            }
        }
        return var4;
    }

    @ObfuscatedName("gc.z(Ljava/lang/String;I)I")
    public int method3392(String arg0, int arg1) {
        return this.method3451(arg0, new int[] { arg1 }, field2849);
    }

    @ObfuscatedName("gc.e(Ljava/lang/String;)Ljava/lang/String;")
    public static String method3404(String arg0) {
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

    @ObfuscatedName("gc.b(Ljava/lang/String;IIII)V")
    public void method3438(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method3462(arg3, arg4);
            this.method3420(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("gc.c(Ljava/lang/String;IIII)V")
    public void method3395(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method3462(arg3, arg4);
            this.method3420(arg0, arg1 - this.method3389(arg0), arg2);
        }
    }

    @ObfuscatedName("gc.d(Ljava/lang/String;IIII)V")
    public void method3433(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method3462(arg3, arg4);
            this.method3420(arg0, arg1 - this.method3389(arg0) / 2, arg2);
        }
    }

    @ObfuscatedName("gc.h(Ljava/lang/String;IIIIIIIII)I")
    public int method3397(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg0 == null) {
            return 0;
        }
        this.method3462(arg5, arg6);
        if (arg9 == 0) {
            arg9 = this.field2847;
        }
        int[] var11 = new int[] { arg3 };
        if (arg4 < this.field2845 + this.field2835 + arg9 && arg4 < arg9 + arg9) {
            var11 = null;
        }
        int var12 = this.method3451(arg0, var11, field2849);
        if (arg8 == 3 && var12 == 1) {
            arg8 = 1;
        }
        int var13;
        if (arg8 == 0) {
            var13 = this.field2835 + arg2;
        } else if (arg8 == 1) {
            var13 = (arg4 - this.field2835 - this.field2845 - (var12 - 1) * arg9) / 2 + this.field2835 + arg2;
        } else if (arg8 == 2) {
            var13 = arg2 + arg4 - this.field2845 - (var12 - 1) * arg9;
        } else {
            int var14 = (arg4 - this.field2835 - this.field2845 - (var12 - 1) * arg9) / (var12 + 1);
            if (var14 < 0) {
                var14 = 0;
            }
            var13 = this.field2835 + arg2 + var14;
            arg9 += var14;
        }
        for (int var15 = 0; var15 < var12; var15++) {
            if (arg7 == 0) {
                this.method3420(field2849[var15], arg1, var13);
            } else if (arg7 == 1) {
                this.method3420(field2849[var15], arg1 + (arg3 - this.method3389(field2849[var15])) / 2, var13);
            } else if (arg7 == 2) {
                this.method3420(field2849[var15], arg1 + arg3 - this.method3389(field2849[var15]), var13);
            } else if (var12 - 1 == var15) {
                this.method3420(field2849[var15], arg1, var13);
            } else {
                this.method3460(field2849[var15], arg3);
                this.method3420(field2849[var15], arg1, var13);
                field2846 = 0;
            }
            var13 += arg9;
        }
        return var12;
    }

    @ObfuscatedName("gc.i(Ljava/lang/String;IIIII)V")
    public void method3398(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method3462(arg3, arg4);
        int[] var7 = new int[arg0.length()];
        for (int var8 = 0; var8 < arg0.length(); var8++) {
            var7[var8] = (int) (Math.sin((double) arg5 / 5.0D + (double) var8 / 2.0D) * 5.0D);
        }
        this.method3405(arg0, arg1 - this.method3389(arg0) / 2, arg2, (int[]) null, var7);
    }

    @ObfuscatedName("gc.v(Ljava/lang/String;IIIII)V")
    public void method3399(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method3462(arg3, arg4);
        int[] var7 = new int[arg0.length()];
        int[] var8 = new int[arg0.length()];
        for (int var9 = 0; var9 < arg0.length(); var9++) {
            var7[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 5.0D) * 5.0D);
            var8[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 3.0D) * 5.0D);
        }
        this.method3405(arg0, arg1 - this.method3389(arg0) / 2, arg2, var7, var8);
    }

    @ObfuscatedName("gc.s(Ljava/lang/String;IIIIII)V")
    public void method3400(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 == null) {
            return;
        }
        this.method3462(arg3, arg4);
        double var8 = 7.0D - (double) arg6 / 8.0D;
        if (var8 < 0.0D) {
            var8 = 0.0D;
        }
        int[] var10 = new int[arg0.length()];
        for (int var11 = 0; var11 < arg0.length(); var11++) {
            var10[var11] = (int) (Math.sin((double) arg5 / 1.0D + (double) var11 / 1.5D) * var8);
        }
        this.method3405(arg0, arg1 - this.method3389(arg0) / 2, arg2, (int[]) null, var10);
    }

    @ObfuscatedName("gc.f(Ljava/lang/String;IIIII)V")
    public void method3428(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method3462(arg3, arg4);
        field2848.setSeed((long) arg5);
        field2839 = 192 + (field2848.nextInt() & 0x1F);
        int[] var7 = new int[arg0.length()];
        int var8 = 0;
        for (int var9 = 0; var9 < arg0.length(); var9++) {
            var7[var9] = var8;
            if ((field2848.nextInt() & 0x3) == 0) {
                var8++;
            }
        }
        this.method3405(arg0, arg1, arg2, var7, (int[]) null);
    }

    @ObfuscatedName("gc.y(II)V")
    public void method3462(int arg0, int arg1) {
        field2832 = -1;
        field2840 = -1;
        field2841 = arg1;
        field2842 = arg1;
        field2844 = arg0;
        field2834 = arg0;
        field2839 = 256;
        field2846 = 0;
        field2843 = 0;
    }

    @ObfuscatedName("gc.t(Ljava/lang/String;)V")
    public void method3385(String arg0) {
        try {
            if (arg0.startsWith("col=")) {
                field2834 = class146.method894(arg0.substring(4), 16);
            } else if (arg0.equals("/col")) {
                field2834 = field2844;
            } else if (arg0.startsWith("str=")) {
                field2832 = class146.method894(arg0.substring(4), 16);
            } else if (arg0.equals("str")) {
                field2832 = 8388608;
            } else if (arg0.equals("/str")) {
                field2832 = -1;
            } else if (arg0.startsWith("u=")) {
                field2840 = class146.method894(arg0.substring(2), 16);
            } else if (arg0.equals("u")) {
                field2840 = 0;
            } else if (arg0.equals("/u")) {
                field2840 = -1;
            } else if (arg0.startsWith("shad=")) {
                field2842 = class146.method894(arg0.substring(5), 16);
            } else if (arg0.equals("shad")) {
                field2842 = 0;
            } else if (arg0.equals("/shad")) {
                field2842 = field2841;
            } else if (arg0.equals("br")) {
                this.method3462(field2844, field2841);
            }
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("gc.r(Ljava/lang/String;I)V")
    public void method3460(String arg0, int arg1) {
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
            field2846 = (arg1 - this.method3389(arg0) << 8) / var3;
        }
    }

    @ObfuscatedName("gc.p(Ljava/lang/String;II)V")
    public void method3420(String arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field2847;
        int var5 = -1;
        int var6 = -1;
        for (int var7 = 0; var7 < arg0.length(); var7++) {
            if (arg0.charAt(var7) != 0) {
                char var8 = (char) (class148.method1268(arg0.charAt(var7)) & 0xFF);
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
                                        int var11 = class146.method808(var10, 10, true);
                                        class86 var13 = Statics.field2837[var11];
                                        var13.method1777(arg1, this.field2847 + var4 - var13.field1458);
                                        arg1 += var13.field1460;
                                        var6 = -1;
                                    } catch (Exception var18) {
                                    }
                                } else {
                                    this.method3385(var9);
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
                        if (this.field2828 != null && var6 != -1) {
                            arg1 += this.field2828[(var6 << 8) + var8];
                        }
                        int var15 = this.field2838[var8];
                        int var16 = this.field2831[var8];
                        if (var8 == ' ') {
                            if (field2846 > 0) {
                                field2843 += field2846;
                                arg1 += field2843 >> 8;
                                field2843 &= 0xFF;
                            }
                        } else if (field2839 == 256) {
                            if (field2842 != -1) {
                                method3463(this.field2830[var8], this.field2836[var8] + arg1 + 1, this.field2833[var8] + var4 + 1, var15, var16, field2842);
                            }
                            this.method3376(this.field2830[var8], this.field2836[var8] + arg1, this.field2833[var8] + var4, var15, var16, field2834);
                        } else {
                            if (field2842 != -1) {
                                method3409(this.field2830[var8], this.field2836[var8] + arg1 + 1, this.field2833[var8] + var4 + 1, var15, var16, field2842, field2839);
                            }
                            this.method3380(this.field2830[var8], this.field2836[var8] + arg1, this.field2833[var8] + var4, var15, var16, field2834, field2839);
                        }
                        int var17 = this.field2829[var8];
                        if (field2832 != -1) {
                            method1834(arg1, (int) ((double) this.field2847 * 0.7D) + var4, var17, field2832);
                        }
                        if (field2840 != -1) {
                            method1834(arg1, this.field2847 + var4 + 1, var17, field2840);
                        }
                        arg1 += var17;
                        var6 = var8;
                    }
                }
            }
        }
    }

    @ObfuscatedName("gc.o(Ljava/lang/String;II[I[I)V")
    public void method3405(String arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var6 = arg2 - this.field2847;
        int var7 = -1;
        int var8 = -1;
        int var9 = 0;
        for (int var10 = 0; var10 < arg0.length(); var10++) {
            if (arg0.charAt(var10) != 0) {
                char var11 = (char) (class148.method1268(arg0.charAt(var10)) & 0xFF);
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
                                        int var16 = class146.method808(var15, 10, true);
                                        class86 var18 = Statics.field2837[var16];
                                        var18.method1777(arg1 + var13, this.field2847 + var6 - var18.field1458 + var14);
                                        arg1 += var18.field1460;
                                        var8 = -1;
                                    } catch (Exception var25) {
                                    }
                                } else {
                                    this.method3385(var12);
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
                        if (this.field2828 != null && var8 != -1) {
                            arg1 += this.field2828[(var8 << 8) + var11];
                        }
                        int var20 = this.field2838[var11];
                        int var21 = this.field2831[var11];
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
                            if (field2846 > 0) {
                                field2843 += field2846;
                                arg1 += field2843 >> 8;
                                field2843 &= 0xFF;
                            }
                        } else if (field2839 == 256) {
                            if (field2842 != -1) {
                                method3463(this.field2830[var11], this.field2836[var11] + arg1 + 1 + var22, this.field2833[var11] + var6 + 1 + var23, var20, var21, field2842);
                            }
                            this.method3376(this.field2830[var11], this.field2836[var11] + arg1 + var22, this.field2833[var11] + var6 + var23, var20, var21, field2834);
                        } else {
                            if (field2842 != -1) {
                                method3409(this.field2830[var11], this.field2836[var11] + arg1 + 1 + var22, this.field2833[var11] + var6 + 1 + var23, var20, var21, field2842, field2839);
                            }
                            this.method3380(this.field2830[var11], this.field2836[var11] + arg1 + var22, this.field2833[var11] + var6 + var23, var20, var21, field2834, field2839);
                        }
                        int var24 = this.field2829[var11];
                        if (field2832 != -1) {
                            method1834(arg1, (int) ((double) this.field2847 * 0.7D) + var6, var24, field2832);
                        }
                        if (field2840 != -1) {
                            method1834(arg1, this.field2847 + var6, var24, field2840);
                        }
                        arg1 += var24;
                        var8 = var11;
                    }
                }
            }
        }
    }

    @ObfuscatedName("gc.ax([BIIIII)V")
    public static void method3463(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = Statics.field1464 * arg2 + arg1;
        int var7 = Statics.field1464 - arg3;
        int var8 = 0;
        int var9 = 0;
        if (arg2 < field1463) {
            int var10 = field1463 - arg2;
            arg4 -= var10;
            arg2 = field1463;
            var9 += arg3 * var10;
            var6 += Statics.field1464 * var10;
        }
        if (arg2 + arg4 > field1465) {
            arg4 -= arg2 + arg4 - field1465;
        }
        if (arg1 < field1468) {
            int var11 = field1468 - arg1;
            arg3 -= var11;
            arg1 = field1468;
            var9 += var11;
            var6 += var11;
            var8 += var11;
            var7 += var11;
        }
        if (arg1 + arg3 > field1469) {
            int var12 = arg1 + arg3 - field1469;
            arg3 -= var12;
            var8 += var12;
            var7 += var12;
        }
        if (arg3 > 0 && arg4 > 0) {
            method3445(Statics.field1466, arg0, arg5, var9, var6, arg3, arg4, var7, var8);
        }
    }

    @ObfuscatedName("gc.aa([I[BIIIIIII)V")
    public static void method3445(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @ObfuscatedName("gc.af([BIIIIII)V")
    public static void method3409(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = Statics.field1464 * arg2 + arg1;
        int var8 = Statics.field1464 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < field1463) {
            int var11 = field1463 - arg2;
            arg4 -= var11;
            arg2 = field1463;
            var10 += arg3 * var11;
            var7 += Statics.field1464 * var11;
        }
        if (arg2 + arg4 > field1465) {
            arg4 -= arg2 + arg4 - field1465;
        }
        if (arg1 < field1468) {
            int var12 = field1468 - arg1;
            arg3 -= var12;
            arg1 = field1468;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > field1469) {
            int var13 = arg1 + arg3 - field1469;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            method3410(Statics.field1466, arg0, arg5, var10, var7, arg3, arg4, var8, var9, arg6);
        }
    }

    @ObfuscatedName("gc.al([I[BIIIIIIII)V")
    public static void method3410(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
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

    @ObfuscatedName("gc.u([BIIIII)V")
    public abstract void method3376(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @ObfuscatedName("gc.k([BIIIIII)V")
    public abstract void method3380(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);
}
