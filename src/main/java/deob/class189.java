package deob;

import java.util.Random;

@ObfuscatedName("gv")
public abstract class class189 extends class73 {

    @ObfuscatedName("gv.y")
    public byte[][] field2876 = new byte[256][];

    @ObfuscatedName("gv.u")
    public int[] field2860;

    @ObfuscatedName("gv.k")
    public int[] field2861;

    @ObfuscatedName("gv.v")
    public int[] field2862;

    @ObfuscatedName("gv.l")
    public int[] field2863;

    @ObfuscatedName("gv.g")
    public int[] field2867;

    @ObfuscatedName("gv.a")
    public int field2871 = 0;

    @ObfuscatedName("gv.x")
    public int field2866;

    @ObfuscatedName("gv.r")
    public int field2864;

    @ObfuscatedName("gv.c")
    public byte[] field2869;

    @ObfuscatedName("gv.f")
    public static int field2870 = -1;

    @ObfuscatedName("gv.b")
    public static int field2868 = -1;

    @ObfuscatedName("gv.i")
    public static int field2872 = -1;

    @ObfuscatedName("gv.h")
    public static int field2873 = -1;

    @ObfuscatedName("gv.q")
    public static int field2874 = 0;

    @ObfuscatedName("gv.d")
    public static int field2875 = 0;

    @ObfuscatedName("gv.z")
    public static int field2859 = 256;

    @ObfuscatedName("gv.e")
    public static int field2877 = 0;

    @ObfuscatedName("gv.av")
    public static int field2878 = 0;

    @ObfuscatedName("gv.al")
    public static Random field2879 = new Random();

    @ObfuscatedName("gv.aq")
    public static String[] field2880 = new String[100];

    public class189(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, byte[][] arg6) {
        this.field2863 = arg1;
        this.field2867 = arg2;
        this.field2861 = arg3;
        this.field2862 = arg4;
        this.method3295(arg0);
        this.field2876 = arg6;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        for (int var10 = 0; var10 < 256; var10++) {
            if (this.field2867[var10] < var8 && this.field2862[var10] != 0) {
                var8 = this.field2867[var10];
            }
            if (this.field2867[var10] + this.field2862[var10] > var9) {
                var9 = this.field2867[var10] + this.field2862[var10];
            }
        }
        this.field2866 = this.field2871 - var8;
        this.field2864 = var9 - this.field2871;
    }

    public class189(byte[] arg0) {
        this.method3295(arg0);
    }

    @ObfuscatedName("gv.y([B)V")
    public void method3295(byte[] arg0) {
        this.field2860 = new int[256];
        if (arg0.length == 257) {
            for (int var2 = 0; var2 < this.field2860.length; var2++) {
                this.field2860[var2] = arg0[var2] & 0xFF;
            }
            this.field2871 = arg0[256] & 0xFF;
            return;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < 256; var4++) {
            this.field2860[var4] = arg0[var3++] & 0xFF;
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
        this.field2869 = new byte[65536];
        for (int var17 = 0; var17 < 256; var17++) {
            if (var17 != 32 && var17 != 160) {
                for (int var18 = 0; var18 < 256; var18++) {
                    if (var18 != 32 && var18 != 160) {
                        this.field2869[(var17 << 8) + var18] = (byte) method3296(var9, var13, var6, this.field2860, var5, var17, var18);
                    }
                }
            }
        }
        this.field2871 = var5[32] + var6[32];
    }

    @ObfuscatedName("gv.u([[B[[B[I[I[III)I")
    public static int method3296(byte[][] arg0, byte[][] arg1, int[] arg2, int[] arg3, int[] arg4, int arg5, int arg6) {
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

    @ObfuscatedName("gv.k(C)I")
    public int method3294(char arg0) {
        if (arg0 == 160) {
            arg0 = ' ';
        }
        return this.field2860[class198.method3131(arg0) & 0xFF];
    }

    @ObfuscatedName("gv.v(Ljava/lang/String;)I")
    public int method3298(String arg0) {
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
                                    int var8 = class196.method1(var7.substring(4));
                                    var4 += Statics.field2865[var8].field1313;
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
                    var4 += this.field2860[(char) (class198.method3131(var6) & 0xFF)];
                    if (this.field2869 != null && var3 != -1) {
                        var4 += this.field2869[(var3 << 8) + var6];
                    }
                    var3 = var6;
                }
            }
        }
        return var4;
    }

    @ObfuscatedName("gv.l(Ljava/lang/String;[I[Ljava/lang/String;)I")
    public int method3299(String arg0, int[] arg1, String[] arg2) {
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
                        var4 += this.method3294('<');
                        if (this.field2869 != null && var11 != -1) {
                            var4 += this.field2869[(var11 << 8) + 60];
                        }
                        var11 = '<';
                    } else if (var16.equals("gt")) {
                        var4 += this.method3294('>');
                        if (this.field2869 != null && var11 != -1) {
                            var4 += this.field2869[(var11 << 8) + 62];
                        }
                        var11 = '>';
                    } else if (var16.startsWith("img=")) {
                        try {
                            int var17 = class196.method1(var16.substring(4));
                            var4 += Statics.field2865[var17].field1313;
                            var11 = 0;
                        } catch (Exception var20) {
                        }
                    }
                    var15 = 0;
                }
                if (var10 == -1) {
                    if (var15 != 0) {
                        var6.append(var15);
                        var4 += this.method3294(var15);
                        if (this.field2869 != null && var11 != -1) {
                            var4 += this.field2869[(var11 << 8) + var15];
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

    @ObfuscatedName("gv.g(Ljava/lang/String;I)I")
    public int method3300(String arg0, int arg1) {
        int var3 = this.method3299(arg0, new int[] { arg1 }, field2880);
        int var4 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = this.method3298(field2880[var5]);
            if (var6 > var4) {
                var4 = var6;
            }
        }
        return var4;
    }

    @ObfuscatedName("gv.a(Ljava/lang/String;I)I")
    public int method3301(String arg0, int arg1) {
        return this.method3299(arg0, new int[] { arg1 }, field2880);
    }

    @ObfuscatedName("gv.x(Ljava/lang/String;)Ljava/lang/String;")
    public static String method3302(String arg0) {
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

    @ObfuscatedName("gv.r(Ljava/lang/String;IIII)V")
    public void method3303(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method3311(arg3, arg4);
            this.method3309(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("gv.w(Ljava/lang/String;IIII)V")
    public void method3343(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method3311(arg3, arg4);
            this.method3309(arg0, arg1 - this.method3298(arg0), arg2);
        }
    }

    @ObfuscatedName("gv.c(Ljava/lang/String;IIII)V")
    public void method3305(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method3311(arg3, arg4);
            this.method3309(arg0, arg1 - this.method3298(arg0) / 2, arg2);
        }
    }

    @ObfuscatedName("gv.f(Ljava/lang/String;IIIIIIIII)I")
    public int method3306(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg0 == null) {
            return 0;
        }
        this.method3311(arg5, arg6);
        if (arg9 == 0) {
            arg9 = this.field2871;
        }
        int[] var11 = new int[] { arg3 };
        if (arg4 < this.field2866 + this.field2864 + arg9 && arg4 < arg9 + arg9) {
            var11 = null;
        }
        int var12 = this.method3299(arg0, var11, field2880);
        if (arg8 == 3 && var12 == 1) {
            arg8 = 1;
        }
        int var13;
        if (arg8 == 0) {
            var13 = this.field2866 + arg2;
        } else if (arg8 == 1) {
            var13 = (arg4 - this.field2866 - this.field2864 - (var12 - 1) * arg9) / 2 + this.field2866 + arg2;
        } else if (arg8 == 2) {
            var13 = arg2 + arg4 - this.field2864 - (var12 - 1) * arg9;
        } else {
            int var14 = (arg4 - this.field2866 - this.field2864 - (var12 - 1) * arg9) / (var12 + 1);
            if (var14 < 0) {
                var14 = 0;
            }
            var13 = this.field2866 + arg2 + var14;
            arg9 += var14;
        }
        for (int var15 = 0; var15 < var12; var15++) {
            if (arg7 == 0) {
                this.method3309(field2880[var15], arg1, var13);
            } else if (arg7 == 1) {
                this.method3309(field2880[var15], arg1 + (arg3 - this.method3298(field2880[var15])) / 2, var13);
            } else if (arg7 == 2) {
                this.method3309(field2880[var15], arg1 + arg3 - this.method3298(field2880[var15]), var13);
            } else if (var12 - 1 == var15) {
                this.method3309(field2880[var15], arg1, var13);
            } else {
                this.method3313(field2880[var15], arg3);
                this.method3309(field2880[var15], arg1, var13);
                field2877 = 0;
            }
            var13 += arg9;
        }
        return var12;
    }

    @ObfuscatedName("gv.o(Ljava/lang/String;IIIII)V")
    public void method3307(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method3311(arg3, arg4);
        int[] var7 = new int[arg0.length()];
        for (int var8 = 0; var8 < arg0.length(); var8++) {
            var7[var8] = (int) (Math.sin((double) arg5 / 5.0D + (double) var8 / 2.0D) * 5.0D);
        }
        this.method3315(arg0, arg1 - this.method3298(arg0) / 2, arg2, (int[]) null, var7);
    }

    @ObfuscatedName("gv.p(Ljava/lang/String;IIIII)V")
    public void method3308(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method3311(arg3, arg4);
        int[] var7 = new int[arg0.length()];
        int[] var8 = new int[arg0.length()];
        for (int var9 = 0; var9 < arg0.length(); var9++) {
            var7[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 5.0D) * 5.0D);
            var8[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 3.0D) * 5.0D);
        }
        this.method3315(arg0, arg1 - this.method3298(arg0) / 2, arg2, var7, var8);
    }

    @ObfuscatedName("gv.n(Ljava/lang/String;IIIIII)V")
    public void method3325(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 == null) {
            return;
        }
        this.method3311(arg3, arg4);
        double var8 = 7.0D - (double) arg6 / 8.0D;
        if (var8 < 0.0D) {
            var8 = 0.0D;
        }
        int[] var10 = new int[arg0.length()];
        for (int var11 = 0; var11 < arg0.length(); var11++) {
            var10[var11] = (int) (Math.sin((double) arg5 / 1.0D + (double) var11 / 1.5D) * var8);
        }
        this.method3315(arg0, arg1 - this.method3298(arg0) / 2, arg2, (int[]) null, var10);
    }

    @ObfuscatedName("gv.m(Ljava/lang/String;IIIII)V")
    public void method3304(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method3311(arg3, arg4);
        field2879.setSeed((long) arg5);
        field2859 = 192 + (field2879.nextInt() & 0x1F);
        int[] var7 = new int[arg0.length()];
        int var8 = 0;
        for (int var9 = 0; var9 < arg0.length(); var9++) {
            var7[var9] = var8;
            if ((field2879.nextInt() & 0x3) == 0) {
                var8++;
            }
        }
        this.method3315(arg0, arg1, arg2, var7, (int[]) null);
    }

    @ObfuscatedName("gv.s(II)V")
    public void method3311(int arg0, int arg1) {
        field2870 = -1;
        field2868 = -1;
        field2872 = arg1;
        field2873 = arg1;
        field2874 = arg0;
        field2875 = arg0;
        field2859 = 256;
        field2877 = 0;
        field2878 = 0;
    }

    @ObfuscatedName("gv.t(Ljava/lang/String;)V")
    public void method3312(String arg0) {
        try {
            if (arg0.startsWith("col=")) {
                field2875 = class196.method2884(arg0.substring(4), 16);
            } else if (arg0.equals("/col")) {
                field2875 = field2874;
            } else if (arg0.startsWith("str=")) {
                field2870 = class196.method2884(arg0.substring(4), 16);
            } else if (arg0.equals("str")) {
                field2870 = 8388608;
            } else if (arg0.equals("/str")) {
                field2870 = -1;
            } else if (arg0.startsWith("u=")) {
                field2868 = class196.method2884(arg0.substring(2), 16);
            } else if (arg0.equals("u")) {
                field2868 = 0;
            } else if (arg0.equals("/u")) {
                field2868 = -1;
            } else if (arg0.startsWith("shad=")) {
                field2873 = class196.method2884(arg0.substring(5), 16);
            } else if (arg0.equals("shad")) {
                field2873 = 0;
            } else if (arg0.equals("/shad")) {
                field2873 = field2872;
            } else if (arg0.equals("br")) {
                this.method3311(field2874, field2872);
            }
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("gv.j(Ljava/lang/String;I)V")
    public void method3313(String arg0, int arg1) {
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
            field2877 = (arg1 - this.method3298(arg0) << 8) / var3;
        }
    }

    @ObfuscatedName("gv.b(Ljava/lang/String;II)V")
    public void method3309(String arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field2871;
        int var5 = -1;
        int var6 = -1;
        for (int var7 = 0; var7 < arg0.length(); var7++) {
            if (arg0.charAt(var7) != 0) {
                char var8 = (char) (class198.method3131(arg0.charAt(var7)) & 0xFF);
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
                                        int var10 = class196.method1(var9.substring(4));
                                        class74 var11 = Statics.field2865[var10];
                                        var11.method1564(arg1, this.field2871 + var4 - var11.field1314);
                                        arg1 += var11.field1313;
                                        var6 = -1;
                                    } catch (Exception var16) {
                                    }
                                } else {
                                    this.method3312(var9);
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
                        if (this.field2869 != null && var6 != -1) {
                            arg1 += this.field2869[(var6 << 8) + var8];
                        }
                        int var13 = this.field2861[var8];
                        int var14 = this.field2862[var8];
                        if (var8 == ' ') {
                            if (field2877 > 0) {
                                field2878 += field2877;
                                arg1 += field2878 >> 8;
                                field2878 &= 0xFF;
                            }
                        } else if (field2859 == 256) {
                            if (field2873 != -1) {
                                method3350(this.field2876[var8], this.field2863[var8] + arg1 + 1, this.field2867[var8] + var4 + 1, var13, var14, field2873);
                            }
                            this.method3367(this.field2876[var8], this.field2863[var8] + arg1, this.field2867[var8] + var4, var13, var14, field2875);
                        } else {
                            if (field2873 != -1) {
                                method3320(this.field2876[var8], this.field2863[var8] + arg1 + 1, this.field2867[var8] + var4 + 1, var13, var14, field2873, field2859);
                            }
                            this.method3317(this.field2876[var8], this.field2863[var8] + arg1, this.field2867[var8] + var4, var13, var14, field2875, field2859);
                        }
                        int var15 = this.field2860[var8];
                        if (field2870 != -1) {
                            method1518(arg1, (int) ((double) this.field2871 * 0.7D) + var4, var15, field2870);
                        }
                        if (field2868 != -1) {
                            method1518(arg1, this.field2871 + var4 + 1, var15, field2868);
                        }
                        arg1 += var15;
                        var6 = var8;
                    }
                }
            }
        }
    }

    @ObfuscatedName("gv.i(Ljava/lang/String;II[I[I)V")
    public void method3315(String arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var6 = arg2 - this.field2871;
        int var7 = -1;
        int var8 = -1;
        int var9 = 0;
        for (int var10 = 0; var10 < arg0.length(); var10++) {
            if (arg0.charAt(var10) != 0) {
                char var11 = (char) (class198.method3131(arg0.charAt(var10)) & 0xFF);
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
                                        int var15 = class196.method1(var12.substring(4));
                                        class74 var16 = Statics.field2865[var15];
                                        var16.method1564(arg1 + var13, this.field2871 + var6 - var16.field1314 + var14);
                                        arg1 += var16.field1313;
                                        var8 = -1;
                                    } catch (Exception var23) {
                                    }
                                } else {
                                    this.method3312(var12);
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
                        if (this.field2869 != null && var8 != -1) {
                            arg1 += this.field2869[(var8 << 8) + var11];
                        }
                        int var18 = this.field2861[var11];
                        int var19 = this.field2862[var11];
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
                            if (field2877 > 0) {
                                field2878 += field2877;
                                arg1 += field2878 >> 8;
                                field2878 &= 0xFF;
                            }
                        } else if (field2859 == 256) {
                            if (field2873 != -1) {
                                method3350(this.field2876[var11], this.field2863[var11] + arg1 + 1 + var20, this.field2867[var11] + var6 + 1 + var21, var18, var19, field2873);
                            }
                            this.method3367(this.field2876[var11], this.field2863[var11] + arg1 + var20, this.field2867[var11] + var6 + var21, var18, var19, field2875);
                        } else {
                            if (field2873 != -1) {
                                method3320(this.field2876[var11], this.field2863[var11] + arg1 + 1 + var20, this.field2867[var11] + var6 + 1 + var21, var18, var19, field2873, field2859);
                            }
                            this.method3317(this.field2876[var11], this.field2863[var11] + arg1 + var20, this.field2867[var11] + var6 + var21, var18, var19, field2875, field2859);
                        }
                        int var22 = this.field2860[var11];
                        if (field2870 != -1) {
                            method1518(arg1, (int) ((double) this.field2871 * 0.7D) + var6, var22, field2870);
                        }
                        if (field2868 != -1) {
                            method1518(arg1, this.field2871 + var6, var22, field2868);
                        }
                        arg1 += var22;
                        var8 = var11;
                    }
                }
            }
        }
    }

    @ObfuscatedName("gv.d([BIIIII)V")
    public static void method3350(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = Statics.field1301 * arg2 + arg1;
        int var7 = Statics.field1301 - arg3;
        int var8 = 0;
        int var9 = 0;
        if (arg2 < field1305) {
            int var10 = field1305 - arg2;
            arg4 -= var10;
            arg2 = field1305;
            var9 += arg3 * var10;
            var6 += Statics.field1301 * var10;
        }
        if (arg2 + arg4 > field1304) {
            arg4 -= arg2 + arg4 - field1304;
        }
        if (arg1 < field1302) {
            int var11 = field1302 - arg1;
            arg3 -= var11;
            arg1 = field1302;
            var9 += var11;
            var6 += var11;
            var8 += var11;
            var7 += var11;
        }
        if (arg1 + arg3 > field1300) {
            int var12 = arg1 + arg3 - field1300;
            arg3 -= var12;
            var8 += var12;
            var7 += var12;
        }
        if (arg3 > 0 && arg4 > 0) {
            method3319(Statics.field1303, arg0, arg5, var9, var6, arg3, arg4, var7, var8);
        }
    }

    @ObfuscatedName("gv.z([I[BIIIIIII)V")
    public static void method3319(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @ObfuscatedName("gv.e([BIIIIII)V")
    public static void method3320(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = Statics.field1301 * arg2 + arg1;
        int var8 = Statics.field1301 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < field1305) {
            int var11 = field1305 - arg2;
            arg4 -= var11;
            arg2 = field1305;
            var10 += arg3 * var11;
            var7 += Statics.field1301 * var11;
        }
        if (arg2 + arg4 > field1304) {
            arg4 -= arg2 + arg4 - field1304;
        }
        if (arg1 < field1302) {
            int var12 = field1302 - arg1;
            arg3 -= var12;
            arg1 = field1302;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > field1300) {
            int var13 = arg1 + arg3 - field1300;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            method3333(Statics.field1303, arg0, arg5, var10, var7, arg3, arg4, var8, var9, arg6);
        }
    }

    @ObfuscatedName("gv.av([I[BIIIIIIII)V")
    public static void method3333(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
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

    @ObfuscatedName("gv.q([BIIIIII)V")
    public abstract void method3317(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @ObfuscatedName("gv.h([BIIIII)V")
    public abstract void method3367(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5);
}
