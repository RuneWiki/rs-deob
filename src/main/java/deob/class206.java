package deob;

import java.util.Random;

@ObfuscatedName("gs")
public abstract class class206 extends class74 {

    @ObfuscatedName("gs.a")
    public byte[][] field2980 = new byte[256][];

    @ObfuscatedName("gs.v")
    public int[] field2978;

    @ObfuscatedName("gs.i")
    public int[] field2979;

    @ObfuscatedName("gs.b")
    public int[] field2985;

    @ObfuscatedName("gs.l")
    public int[] field2998;

    @ObfuscatedName("gs.m")
    public int[] field2982;

    @ObfuscatedName("gs.w")
    public int field2983 = 0;

    @ObfuscatedName("gs.e")
    public int field2991;

    @ObfuscatedName("gs.n")
    public int field2977;

    @ObfuscatedName("gs.k")
    public byte[] field2987;

    @ObfuscatedName("gs.f")
    public static int field2988 = -1;

    @ObfuscatedName("gs.j")
    public static int field2989 = -1;

    @ObfuscatedName("gs.g")
    public static int field2990 = -1;

    @ObfuscatedName("gs.y")
    public static int field2997 = -1;

    @ObfuscatedName("gs.p")
    public static int field2992 = 0;

    @ObfuscatedName("gs.r")
    public static int field2993 = 0;

    @ObfuscatedName("gs.z")
    public static int field2994 = 256;

    @ObfuscatedName("gs.c")
    public static int field2995 = 0;

    @ObfuscatedName("gs.an")
    public static int field2996 = 0;

    @ObfuscatedName("gs.as")
    public static Random field2981 = new Random();

    @ObfuscatedName("gs.ah")
    public static String[] field2984 = new String[100];

    public class206(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, byte[][] arg6) {
        this.field2998 = arg1;
        this.field2982 = arg2;
        this.field2979 = arg3;
        this.field2985 = arg4;
        this.method3440(arg0);
        this.field2980 = arg6;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        for (int var10 = 0; var10 < 256; var10++) {
            if (this.field2982[var10] < var8 && this.field2985[var10] != 0) {
                var8 = this.field2982[var10];
            }
            if (this.field2985[var10] + this.field2982[var10] > var9) {
                var9 = this.field2985[var10] + this.field2982[var10];
            }
        }
        this.field2991 = this.field2983 - var8;
        this.field2977 = var9 - this.field2983;
    }

    public class206(byte[] arg0) {
        this.method3440(arg0);
    }

    @ObfuscatedName("gs.a([B)V")
    public void method3440(byte[] arg0) {
        this.field2978 = new int[256];
        if (arg0.length == 257) {
            for (int var2 = 0; var2 < this.field2978.length; var2++) {
                this.field2978[var2] = arg0[var2] & 0xFF;
            }
            this.field2983 = arg0[256] & 0xFF;
            return;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < 256; var4++) {
            this.field2978[var4] = arg0[var3++] & 0xFF;
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
        this.field2987 = new byte[65536];
        for (int var17 = 0; var17 < 256; var17++) {
            if (var17 != 32 && var17 != 160) {
                for (int var18 = 0; var18 < 256; var18++) {
                    if (var18 != 32 && var18 != 160) {
                        this.field2987[(var17 << 8) + var18] = (byte) method3441(var9, var13, var6, this.field2978, var5, var17, var18);
                    }
                }
            }
        }
        this.field2983 = var5[32] + var6[32];
    }

    @ObfuscatedName("gs.v([[B[[B[I[I[III)I")
    public static int method3441(byte[][] arg0, byte[][] arg1, int[] arg2, int[] arg3, int[] arg4, int arg5, int arg6) {
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

    @ObfuscatedName("gs.i(C)I")
    public int method3481(char arg0) {
        if (arg0 == 160) {
            arg0 = ' ';
        }
        return this.field2978[class215.method1412(arg0) & 0xFF];
    }

    @ObfuscatedName("gs.b(Ljava/lang/String;)I")
    public int method3443(String arg0) {
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
                                    int var8 = class213.method2071(var7.substring(4));
                                    var4 += Statics.field2986[var8].field1331;
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
                    var4 += this.field2978[(char) (class215.method1412(var6) & 0xFF)];
                    if (this.field2987 != null && var3 != -1) {
                        var4 += this.field2987[(var3 << 8) + var6];
                    }
                    var3 = var6;
                }
            }
        }
        return var4;
    }

    @ObfuscatedName("gs.l(Ljava/lang/String;[I[Ljava/lang/String;)I")
    public int method3444(String arg0, int[] arg1, String[] arg2) {
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
                        var4 += this.method3481('<');
                        if (this.field2987 != null && var11 != -1) {
                            var4 += this.field2987[(var11 << 8) + 60];
                        }
                        var11 = '<';
                    } else if (var16.equals("gt")) {
                        var4 += this.method3481('>');
                        if (this.field2987 != null && var11 != -1) {
                            var4 += this.field2987[(var11 << 8) + 62];
                        }
                        var11 = '>';
                    } else if (var16.startsWith("img=")) {
                        try {
                            int var17 = class213.method2071(var16.substring(4));
                            var4 += Statics.field2986[var17].field1331;
                            var11 = 0;
                        } catch (Exception var20) {
                        }
                    }
                    var15 = 0;
                }
                if (var10 == -1) {
                    if (var15 != 0) {
                        var6.append(var15);
                        var4 += this.method3481(var15);
                        if (this.field2987 != null && var11 != -1) {
                            var4 += this.field2987[(var11 << 8) + var15];
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

    @ObfuscatedName("gs.m(Ljava/lang/String;I)I")
    public int method3479(String arg0, int arg1) {
        int var3 = this.method3444(arg0, new int[] { arg1 }, field2984);
        int var4 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = this.method3443(field2984[var5]);
            if (var6 > var4) {
                var4 = var6;
            }
        }
        return var4;
    }

    @ObfuscatedName("gs.w(Ljava/lang/String;I)I")
    public int method3446(String arg0, int arg1) {
        return this.method3444(arg0, new int[] { arg1 }, field2984);
    }

    @ObfuscatedName("gs.e(Ljava/lang/String;)Ljava/lang/String;")
    public static String method3447(String arg0) {
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

    @ObfuscatedName("gs.n(Ljava/lang/String;IIII)V")
    public void method3522(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method3456(arg3, arg4);
            this.method3485(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("gs.s(Ljava/lang/String;IIII)V")
    public void method3459(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method3456(arg3, arg4);
            this.method3485(arg0, arg1 - this.method3443(arg0), arg2);
        }
    }

    @ObfuscatedName("gs.k(Ljava/lang/String;IIII)V")
    public void method3450(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method3456(arg3, arg4);
            this.method3485(arg0, arg1 - this.method3443(arg0) / 2, arg2);
        }
    }

    @ObfuscatedName("gs.f(Ljava/lang/String;IIIIIIIII)I")
    public int method3451(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg0 == null) {
            return 0;
        }
        this.method3456(arg5, arg6);
        if (arg9 == 0) {
            arg9 = this.field2983;
        }
        int[] var11 = new int[] { arg3 };
        if (arg4 < this.field2991 + this.field2977 + arg9 && arg4 < arg9 + arg9) {
            var11 = null;
        }
        int var12 = this.method3444(arg0, var11, field2984);
        if (arg8 == 3 && var12 == 1) {
            arg8 = 1;
        }
        int var13;
        if (arg8 == 0) {
            var13 = this.field2991 + arg2;
        } else if (arg8 == 1) {
            var13 = (arg4 - this.field2991 - this.field2977 - (var12 - 1) * arg9) / 2 + this.field2991 + arg2;
        } else if (arg8 == 2) {
            var13 = arg2 + arg4 - this.field2977 - (var12 - 1) * arg9;
        } else {
            int var14 = (arg4 - this.field2991 - this.field2977 - (var12 - 1) * arg9) / (var12 + 1);
            if (var14 < 0) {
                var14 = 0;
            }
            var13 = this.field2991 + arg2 + var14;
            arg9 += var14;
        }
        for (int var15 = 0; var15 < var12; var15++) {
            if (arg7 == 0) {
                this.method3485(field2984[var15], arg1, var13);
            } else if (arg7 == 1) {
                this.method3485(field2984[var15], arg1 + (arg3 - this.method3443(field2984[var15])) / 2, var13);
            } else if (arg7 == 2) {
                this.method3485(field2984[var15], arg1 + arg3 - this.method3443(field2984[var15]), var13);
            } else if (var12 - 1 == var15) {
                this.method3485(field2984[var15], arg1, var13);
            } else {
                this.method3457(field2984[var15], arg3);
                this.method3485(field2984[var15], arg1, var13);
                field2995 = 0;
            }
            var13 += arg9;
        }
        return var12;
    }

    @ObfuscatedName("gs.d(Ljava/lang/String;IIIII)V")
    public void method3452(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method3456(arg3, arg4);
        int[] var7 = new int[arg0.length()];
        for (int var8 = 0; var8 < arg0.length(); var8++) {
            var7[var8] = (int) (Math.sin((double) arg5 / 5.0D + (double) var8 / 2.0D) * 5.0D);
        }
        this.method3461(arg0, arg1 - this.method3443(arg0) / 2, arg2, (int[]) null, var7);
    }

    @ObfuscatedName("gs.x(Ljava/lang/String;IIIII)V")
    public void method3453(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method3456(arg3, arg4);
        int[] var7 = new int[arg0.length()];
        int[] var8 = new int[arg0.length()];
        for (int var9 = 0; var9 < arg0.length(); var9++) {
            var7[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 5.0D) * 5.0D);
            var8[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 3.0D) * 5.0D);
        }
        this.method3461(arg0, arg1 - this.method3443(arg0) / 2, arg2, var7, var8);
    }

    @ObfuscatedName("gs.o(Ljava/lang/String;IIIIII)V")
    public void method3465(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 == null) {
            return;
        }
        this.method3456(arg3, arg4);
        double var8 = 7.0D - (double) arg6 / 8.0D;
        if (var8 < 0.0D) {
            var8 = 0.0D;
        }
        int[] var10 = new int[arg0.length()];
        for (int var11 = 0; var11 < arg0.length(); var11++) {
            var10[var11] = (int) (Math.sin((double) arg5 / 1.0D + (double) var11 / 1.5D) * var8);
        }
        this.method3461(arg0, arg1 - this.method3443(arg0) / 2, arg2, (int[]) null, var10);
    }

    @ObfuscatedName("gs.q(Ljava/lang/String;IIIII)V")
    public void method3475(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method3456(arg3, arg4);
        field2981.setSeed((long) arg5);
        field2994 = 192 + (field2981.nextInt() & 0x1F);
        int[] var7 = new int[arg0.length()];
        int var8 = 0;
        for (int var9 = 0; var9 < arg0.length(); var9++) {
            var7[var9] = var8;
            if ((field2981.nextInt() & 0x3) == 0) {
                var8++;
            }
        }
        this.method3461(arg0, arg1, arg2, var7, (int[]) null);
    }

    @ObfuscatedName("gs.t(II)V")
    public void method3456(int arg0, int arg1) {
        field2988 = -1;
        field2989 = -1;
        field2990 = arg1;
        field2997 = arg1;
        field2992 = arg0;
        field2993 = arg0;
        field2994 = 256;
        field2995 = 0;
        field2996 = 0;
    }

    @ObfuscatedName("gs.h(Ljava/lang/String;)V")
    public void method3527(String arg0) {
        try {
            if (arg0.startsWith("col=")) {
                field2993 = class213.method2385(arg0.substring(4), 16);
            } else if (arg0.equals("/col")) {
                field2993 = field2992;
            } else if (arg0.startsWith("str=")) {
                field2988 = class213.method2385(arg0.substring(4), 16);
            } else if (arg0.equals("str")) {
                field2988 = 8388608;
            } else if (arg0.equals("/str")) {
                field2988 = -1;
            } else if (arg0.startsWith("u=")) {
                field2989 = class213.method2385(arg0.substring(2), 16);
            } else if (arg0.equals("u")) {
                field2989 = 0;
            } else if (arg0.equals("/u")) {
                field2989 = -1;
            } else if (arg0.startsWith("shad=")) {
                field2997 = class213.method2385(arg0.substring(5), 16);
            } else if (arg0.equals("shad")) {
                field2997 = 0;
            } else if (arg0.equals("/shad")) {
                field2997 = field2990;
            } else if (arg0.equals("br")) {
                this.method3456(field2992, field2990);
            }
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("gs.u(Ljava/lang/String;I)V")
    public void method3457(String arg0, int arg1) {
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
            field2995 = (arg1 - this.method3443(arg0) << 8) / var3;
        }
    }

    @ObfuscatedName("gs.j(Ljava/lang/String;II)V")
    public void method3485(String arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field2983;
        int var5 = -1;
        int var6 = -1;
        for (int var7 = 0; var7 < arg0.length(); var7++) {
            if (arg0.charAt(var7) != 0) {
                char var8 = (char) (class215.method1412(arg0.charAt(var7)) & 0xFF);
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
                                        int var10 = class213.method2071(var9.substring(4));
                                        class75 var11 = Statics.field2986[var10];
                                        var11.method1573(arg1, this.field2983 + var4 - var11.field1330);
                                        arg1 += var11.field1331;
                                        var6 = -1;
                                    } catch (Exception var16) {
                                    }
                                } else {
                                    this.method3527(var9);
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
                        if (this.field2987 != null && var6 != -1) {
                            arg1 += this.field2987[(var6 << 8) + var8];
                        }
                        int var13 = this.field2979[var8];
                        int var14 = this.field2985[var8];
                        if (var8 == ' ') {
                            if (field2995 > 0) {
                                field2996 += field2995;
                                arg1 += field2996 >> 8;
                                field2996 &= 0xFF;
                            }
                        } else if (field2994 == 256) {
                            if (field2997 != -1) {
                                method3499(this.field2980[var8], this.field2998[var8] + arg1 + 1, this.field2982[var8] + var4 + 1, var13, var14, field2997);
                            }
                            this.method3486(this.field2980[var8], this.field2998[var8] + arg1, this.field2982[var8] + var4, var13, var14, field2993);
                        } else {
                            if (field2997 != -1) {
                                method3454(this.field2980[var8], this.field2998[var8] + arg1 + 1, this.field2982[var8] + var4 + 1, var13, var14, field2997, field2994);
                            }
                            this.method3462(this.field2980[var8], this.field2998[var8] + arg1, this.field2982[var8] + var4, var13, var14, field2993, field2994);
                        }
                        int var15 = this.field2978[var8];
                        if (field2988 != -1) {
                            method1524(arg1, (int) ((double) this.field2983 * 0.7D) + var4, var15, field2988);
                        }
                        if (field2989 != -1) {
                            method1524(arg1, this.field2983 + var4 + 1, var15, field2989);
                        }
                        arg1 += var15;
                        var6 = var8;
                    }
                }
            }
        }
    }

    @ObfuscatedName("gs.g(Ljava/lang/String;II[I[I)V")
    public void method3461(String arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var6 = arg2 - this.field2983;
        int var7 = -1;
        int var8 = -1;
        int var9 = 0;
        for (int var10 = 0; var10 < arg0.length(); var10++) {
            if (arg0.charAt(var10) != 0) {
                char var11 = (char) (class215.method1412(arg0.charAt(var10)) & 0xFF);
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
                                        int var15 = class213.method2071(var12.substring(4));
                                        class75 var16 = Statics.field2986[var15];
                                        var16.method1573(arg1 + var13, this.field2983 + var6 - var16.field1330 + var14);
                                        arg1 += var16.field1331;
                                        var8 = -1;
                                    } catch (Exception var23) {
                                    }
                                } else {
                                    this.method3527(var12);
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
                        if (this.field2987 != null && var8 != -1) {
                            arg1 += this.field2987[(var8 << 8) + var11];
                        }
                        int var18 = this.field2979[var11];
                        int var19 = this.field2985[var11];
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
                            if (field2995 > 0) {
                                field2996 += field2995;
                                arg1 += field2996 >> 8;
                                field2996 &= 0xFF;
                            }
                        } else if (field2994 == 256) {
                            if (field2997 != -1) {
                                method3499(this.field2980[var11], this.field2998[var11] + arg1 + 1 + var20, this.field2982[var11] + var6 + 1 + var21, var18, var19, field2997);
                            }
                            this.method3486(this.field2980[var11], this.field2998[var11] + arg1 + var20, this.field2982[var11] + var6 + var21, var18, var19, field2993);
                        } else {
                            if (field2997 != -1) {
                                method3454(this.field2980[var11], this.field2998[var11] + arg1 + 1 + var20, this.field2982[var11] + var6 + 1 + var21, var18, var19, field2997, field2994);
                            }
                            this.method3462(this.field2980[var11], this.field2998[var11] + arg1 + var20, this.field2982[var11] + var6 + var21, var18, var19, field2993, field2994);
                        }
                        int var22 = this.field2978[var11];
                        if (field2988 != -1) {
                            method1524(arg1, (int) ((double) this.field2983 * 0.7D) + var6, var22, field2988);
                        }
                        if (field2989 != -1) {
                            method1524(arg1, this.field2983 + var6, var22, field2989);
                        }
                        arg1 += var22;
                        var8 = var11;
                    }
                }
            }
        }
    }

    @ObfuscatedName("gs.r([BIIIII)V")
    public static void method3499(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = Statics.field1322 * arg2 + arg1;
        int var7 = Statics.field1322 - arg3;
        int var8 = 0;
        int var9 = 0;
        if (arg2 < field1321) {
            int var10 = field1321 - arg2;
            arg4 -= var10;
            arg2 = field1321;
            var9 += arg3 * var10;
            var6 += Statics.field1322 * var10;
        }
        if (arg2 + arg4 > field1319) {
            arg4 -= arg2 + arg4 - field1319;
        }
        if (arg1 < field1323) {
            int var11 = field1323 - arg1;
            arg3 -= var11;
            arg1 = field1323;
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
            method3460(Statics.field1318, arg0, arg5, var9, var6, arg3, arg4, var7, var8);
        }
    }

    @ObfuscatedName("gs.z([I[BIIIIIII)V")
    public static void method3460(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @ObfuscatedName("gs.c([BIIIIII)V")
    public static void method3454(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = Statics.field1322 * arg2 + arg1;
        int var8 = Statics.field1322 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < field1321) {
            int var11 = field1321 - arg2;
            arg4 -= var11;
            arg2 = field1321;
            var10 += arg3 * var11;
            var7 += Statics.field1322 * var11;
        }
        if (arg2 + arg4 > field1319) {
            arg4 -= arg2 + arg4 - field1319;
        }
        if (arg1 < field1323) {
            int var12 = field1323 - arg1;
            arg3 -= var12;
            arg1 = field1323;
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
            method3489(Statics.field1318, arg0, arg5, var10, var7, arg3, arg4, var8, var9, arg6);
        }
    }

    @ObfuscatedName("gs.an([I[BIIIIIIII)V")
    public static void method3489(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
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

    @ObfuscatedName("gs.p([BIIIIII)V")
    public abstract void method3462(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @ObfuscatedName("gs.y([BIIIII)V")
    public abstract void method3486(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5);
}
